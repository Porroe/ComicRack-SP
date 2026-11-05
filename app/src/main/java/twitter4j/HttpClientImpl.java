package twitter4j;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import twitter4j.conf.ConfigurationContext;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class HttpClientImpl extends HttpClientBase implements Serializable, HttpResponseCode {
    private static final Map instanceMap;
    private static final Logger logger = Logger.getLogger(HttpClientImpl.class);
    private static final long serialVersionUID = -403500272719330534L;

    static {
        try {
            if (Integer.parseInt((String) Class.forName("android.os.Build$VERSION").getField("SDK").get(null)) < 8) {
                System.setProperty("http.keepAlive", "false");
            }
        } catch (Exception e) {
        }
        instanceMap = new HashMap(1);
    }

    public HttpClientImpl() {
        super(ConfigurationContext.getInstance().getHttpClientConfiguration());
    }

    public HttpClientImpl(HttpClientConfiguration httpClientConfiguration) {
        super(httpClientConfiguration);
    }

    public static HttpClient getInstance(HttpClientConfiguration httpClientConfiguration) {
        HttpClient httpClient = (HttpClient) instanceMap.get(httpClientConfiguration);
        if (httpClient == null) {
            HttpClientImpl httpClientImpl = new HttpClientImpl(httpClientConfiguration);
            instanceMap.put(httpClientConfiguration, httpClientImpl);
            return httpClientImpl;
        }
        return httpClient;
    }

    @Override // twitter4j.HttpClientBase, twitter4j.HttpClient
    public HttpResponse get(String str) {
        return request(new HttpRequest(RequestMethod.GET, str, null, null, null));
    }

    public HttpResponse post(String str, HttpParameter[] httpParameterArr) {
        return request(new HttpRequest(RequestMethod.POST, str, httpParameterArr, null, null));
    }

    @Override // twitter4j.HttpClientBase
    public HttpResponse handleRequest(HttpRequest httpRequest) throws Throwable {
        HttpResponseImpl httpResponseImpl;
        Throwable th;
        OutputStream outputStream;
        int i;
        HttpResponseImpl httpResponseImpl2;
        OutputStream outputStream2;
        OutputStream outputStream3;
        int httpRetryCount = this.CONF.getHttpRetryCount() + 1;
        HttpResponseImpl httpResponseImpl3 = null;
        for (int i2 = 0; i2 < httpRetryCount; i2++) {
            int responseCode = -1;
            try {
                HttpURLConnection connection = getConnection(httpRequest.getURL());
                connection.setDoInput(true);
                setHeaders(httpRequest, connection);
                connection.setRequestMethod(httpRequest.getMethod().name());
                if (httpRequest.getMethod() != RequestMethod.POST) {
                    outputStream2 = null;
                } else {
                    if (HttpParameter.containsFile(httpRequest.getParameters())) {
                        String str = "----Twitter4J-upload" + System.currentTimeMillis();
                        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str);
                        String str2 = "--" + str;
                        connection.setDoOutput(true);
                        outputStream3 = connection.getOutputStream();
                        try {
                            DataOutputStream dataOutputStream = new DataOutputStream(outputStream3);
                            for (HttpParameter httpParameter : httpRequest.getParameters()) {
                                if (httpParameter.isFile()) {
                                    write(dataOutputStream, str2 + "\r\n");
                                    write(dataOutputStream, "Content-Disposition: form-data; name=\"" + httpParameter.getName() + "\"; filename=\"" + httpParameter.getFile().getName() + "\"\r\n");
                                    write(dataOutputStream, "Content-Type: " + httpParameter.getContentType() + "\r\n\r\n");
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpParameter.hasFileBody() ? httpParameter.getFileBody() : new FileInputStream(httpParameter.getFile()));
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i3 = bufferedInputStream.read(bArr);
                                        if (i3 == -1) {
                                            break;
                                        }
                                        dataOutputStream.write(bArr, 0, i3);
                                    }
                                    write(dataOutputStream, "\r\n");
                                    bufferedInputStream.close();
                                } else {
                                    write(dataOutputStream, str2 + "\r\n");
                                    write(dataOutputStream, "Content-Disposition: form-data; name=\"" + httpParameter.getName() + "\"\r\n");
                                    write(dataOutputStream, "Content-Type: text/plain; charset=UTF-8\r\n\r\n");
                                    logger.debug(httpParameter.getValue());
                                    dataOutputStream.write(httpParameter.getValue().getBytes("UTF-8"));
                                    write(dataOutputStream, "\r\n");
                                }
                            }
                            write(dataOutputStream, str2 + "--\r\n");
                            write(dataOutputStream, "\r\n");
                        } catch (Throwable th2) {
                            httpResponseImpl = httpResponseImpl3;
                            th = th2;
                            outputStream = outputStream3;
                            i = -1;
                            try {
                                try {
                                    outputStream.close();
                                } catch (IOException e) {
                                    e = e;
                                    responseCode = i;
                                    httpResponseImpl2 = httpResponseImpl;
                                }
                            } catch (Exception e2) {
                            }
                            throw th;
                        }
                    } else {
                        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        String strEncodeParameters = HttpParameter.encodeParameters(httpRequest.getParameters());
                        logger.debug("Post Params: ", strEncodeParameters);
                        byte[] bytes = strEncodeParameters.getBytes("UTF-8");
                        connection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
                        connection.setDoOutput(true);
                        outputStream3 = connection.getOutputStream();
                        outputStream3.write(bytes);
                    }
                    outputStream3.flush();
                    outputStream3.close();
                    outputStream2 = outputStream3;
                }
                try {
                    httpResponseImpl2 = new HttpResponseImpl(connection, this.CONF);
                } catch (Throwable th3) {
                    i = -1;
                    OutputStream outputStream4 = outputStream2;
                    httpResponseImpl = httpResponseImpl3;
                    th = th3;
                    outputStream = outputStream4;
                }
                try {
                    responseCode = connection.getResponseCode();
                    if (logger.isDebugEnabled()) {
                        logger.debug("Response: ");
                        Map<String, List<String>> headerFields = connection.getHeaderFields();
                        for (String str3 : headerFields.keySet()) {
                            for (String str4 : headerFields.get(str3)) {
                                if (str3 != null) {
                                    logger.debug(str3 + ": " + str4);
                                } else {
                                    logger.debug(str4);
                                }
                            }
                        }
                    }
                    if (responseCode < 200 || (responseCode != 302 && 300 <= responseCode)) {
                        if (responseCode == 420 || responseCode == 400 || responseCode < 500 || i2 == this.CONF.getHttpRetryCount()) {
                            throw new TwitterException(httpResponseImpl2.asString(), httpResponseImpl2);
                        }
                        try {
                            try {
                                outputStream2.close();
                                httpResponseImpl3 = httpResponseImpl2;
                            } catch (Exception e3) {
                                httpResponseImpl3 = httpResponseImpl2;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        }
                        try {
                            if (logger.isDebugEnabled() && httpResponseImpl3 != null) {
                                httpResponseImpl3.asString();
                            }
                            logger.debug("Sleeping " + this.CONF.getHttpRetryIntervalSeconds() + " seconds until the next retry.");
                            Thread.sleep(this.CONF.getHttpRetryIntervalSeconds() * 1000);
                        } catch (InterruptedException e5) {
                        }
                    } else {
                        try {
                            outputStream2.close();
                            return httpResponseImpl2;
                        } catch (Exception e6) {
                            return httpResponseImpl2;
                        }
                    }
                    e = e4;
                    if (i2 == this.CONF.getHttpRetryCount()) {
                        throw new TwitterException(e.getMessage(), e, responseCode);
                    }
                    httpResponseImpl3 = httpResponseImpl2;
                    if (logger.isDebugEnabled()) {
                        httpResponseImpl3.asString();
                    }
                    logger.debug("Sleeping " + this.CONF.getHttpRetryIntervalSeconds() + " seconds until the next retry.");
                    Thread.sleep(this.CONF.getHttpRetryIntervalSeconds() * 1000);
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = outputStream2;
                    httpResponseImpl = httpResponseImpl2;
                    i = responseCode;
                    outputStream.close();
                    throw th;
                }
            } catch (Throwable th5) {
                httpResponseImpl = httpResponseImpl3;
                th = th5;
                outputStream = null;
                i = -1;
            }
        }
        return httpResponseImpl3;
    }

    private void setHeaders(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        String authorizationHeader;
        if (logger.isDebugEnabled()) {
            logger.debug("Request: ");
            logger.debug(httpRequest.getMethod().name() + " ", httpRequest.getURL());
        }
        if (httpRequest.getAuthorization() != null && (authorizationHeader = httpRequest.getAuthorization().getAuthorizationHeader(httpRequest)) != null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Authorization: ", authorizationHeader.replaceAll(".", "*"));
            }
            httpURLConnection.addRequestProperty("Authorization", authorizationHeader);
        }
        if (httpRequest.getRequestHeaders() != null) {
            for (String str : httpRequest.getRequestHeaders().keySet()) {
                httpURLConnection.addRequestProperty(str, (String) httpRequest.getRequestHeaders().get(str));
                logger.debug(str + ": " + ((String) httpRequest.getRequestHeaders().get(str)));
            }
        }
    }

    HttpURLConnection getConnection(String str) {
        HttpURLConnection httpURLConnection;
        if (isProxyConfigured()) {
            if (this.CONF.getHttpProxyUser() != null && !this.CONF.getHttpProxyUser().equals("")) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Proxy AuthUser: " + this.CONF.getHttpProxyUser());
                    logger.debug("Proxy AuthPassword: " + this.CONF.getHttpProxyPassword().replaceAll(".", "*"));
                }
                Authenticator.setDefault(new C11781());
            }
            Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(this.CONF.getHttpProxyHost(), this.CONF.getHttpProxyPort()));
            if (logger.isDebugEnabled()) {
                logger.debug("Opening proxied connection(" + this.CONF.getHttpProxyHost() + ":" + this.CONF.getHttpProxyPort() + ")");
            }
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        }
        if (this.CONF.getHttpConnectionTimeout() > 0) {
            httpURLConnection.setConnectTimeout(this.CONF.getHttpConnectionTimeout());
        }
        if (this.CONF.getHttpReadTimeout() > 0) {
            httpURLConnection.setReadTimeout(this.CONF.getHttpReadTimeout());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* compiled from: DontLook */
    /* renamed from: twitter4j.HttpClientImpl$1 */
    class C11781 extends Authenticator {
        C11781() {
        }

        @Override // java.net.Authenticator
        protected PasswordAuthentication getPasswordAuthentication() {
            if (getRequestorType().equals(Authenticator.RequestorType.PROXY)) {
                return new PasswordAuthentication(HttpClientImpl.this.CONF.getHttpProxyUser(), HttpClientImpl.this.CONF.getHttpProxyPassword().toCharArray());
            }
            return null;
        }
    }
}
