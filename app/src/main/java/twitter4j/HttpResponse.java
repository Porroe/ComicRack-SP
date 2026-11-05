package twitter4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import twitter4j.conf.ConfigurationContext;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public abstract class HttpResponse {
    private static final Logger logger = Logger.getLogger(HttpResponseImpl.class);
    protected final HttpClientConfiguration CONF;

    /* renamed from: is */
    protected InputStream f3733is;
    private JSONObject json;
    private JSONArray jsonArray;
    protected String responseAsString;
    protected int statusCode;
    private boolean streamConsumed;

    public abstract void disconnect();

    public abstract String getResponseHeader(String str);

    public abstract Map getResponseHeaderFields();

    HttpResponse() {
        this.responseAsString = null;
        this.streamConsumed = false;
        this.json = null;
        this.jsonArray = null;
        this.CONF = ConfigurationContext.getInstance().getHttpClientConfiguration();
    }

    public HttpResponse(HttpClientConfiguration httpClientConfiguration) {
        this.responseAsString = null;
        this.streamConsumed = false;
        this.json = null;
        this.jsonArray = null;
        this.CONF = httpClientConfiguration;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public InputStream asStream() {
        if (this.streamConsumed) {
            throw new IllegalStateException("Stream has already been consumed.");
        }
        return this.f3733is;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String asString() throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r6.responseAsString
            if (r1 != 0) goto L73
            java.io.InputStream r2 = r6.asStream()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L8f
            if (r2 != 0) goto L14
            if (r2 == 0) goto L10
            r2.close()     // Catch: java.io.IOException -> L76
        L10:
            r6.disconnect()     // Catch: java.lang.Exception -> L78
        L13:
            return r0
        L14:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L95
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L95
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L95
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
        L25:
            java.lang.String r3 = r1.readLine()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            if (r3 == 0) goto L55
            java.lang.StringBuilder r3 = r0.append(r3)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            java.lang.String r4 = "\n"
            r3.append(r4)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            goto L25
        L35:
            r0 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L39:
            twitter4j.TwitterException r3 = new twitter4j.TwitterException     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L43
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L43
            throw r3     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = move-exception
            r5 = r1
            r1 = r2
            r2 = r5
        L47:
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L7e
        L4c:
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.io.IOException -> L80
        L51:
            r6.disconnectForcibly()
            throw r0
        L55:
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            r6.responseAsString = r0     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            twitter4j.Logger r0 = twitter4j.HttpResponse.logger     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            java.lang.String r3 = r6.responseAsString     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            r0.debug(r3)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            r2.close()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            r0 = 1
            r6.streamConsumed = r0     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L8d
            if (r2 == 0) goto L6d
            r2.close()     // Catch: java.io.IOException -> L7a
        L6d:
            r1.close()     // Catch: java.io.IOException -> L7c
        L70:
            r6.disconnectForcibly()
        L73:
            java.lang.String r0 = r6.responseAsString
            goto L13
        L76:
            r1 = move-exception
            goto L10
        L78:
            r1 = move-exception
            goto L13
        L7a:
            r0 = move-exception
            goto L6d
        L7c:
            r0 = move-exception
            goto L70
        L7e:
            r2 = move-exception
            goto L4c
        L80:
            r1 = move-exception
            goto L51
        L82:
            r1 = move-exception
            r2 = r0
            r5 = r1
            r1 = r0
            r0 = r5
            goto L47
        L88:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L47
        L8d:
            r0 = move-exception
            goto L47
        L8f:
            r1 = move-exception
            r2 = r0
            r5 = r0
            r0 = r1
            r1 = r5
            goto L39
        L95:
            r1 = move-exception
            r5 = r1
            r1 = r2
            r2 = r0
            r0 = r5
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: twitter4j.HttpResponse.asString():java.lang.String");
    }

    public JSONObject asJSONObject() throws IOException {
        if (this.json == null) {
            Reader readerAsReader = null;
            try {
                try {
                    if (this.responseAsString == null) {
                        readerAsReader = asReader();
                        this.json = new JSONObject(new JSONTokener(readerAsReader));
                    } else {
                        this.json = new JSONObject(this.responseAsString);
                    }
                    if (this.CONF.isPrettyDebugEnabled()) {
                        logger.debug(this.json.toString(1));
                    } else {
                        logger.debug(this.responseAsString != null ? this.responseAsString : this.json.toString());
                    }
                    if (readerAsReader != null) {
                        try {
                            readerAsReader.close();
                        } catch (IOException e) {
                        }
                    }
                    try {
                        disconnect();
                    } catch (Exception e2) {
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            readerAsReader.close();
                        } catch (IOException e3) {
                        }
                    }
                    disconnectForcibly();
                    throw th;
                }
            } catch (JSONException e4) {
                if (this.responseAsString == null) {
                    throw new TwitterException(e4.getMessage(), e4);
                }
                throw new TwitterException(e4.getMessage() + ":" + this.responseAsString, e4);
            }
        }
        return this.json;
    }

    public JSONArray asJSONArray() throws IOException {
        if (this.jsonArray == null) {
            Reader readerAsReader = null;
            try {
                try {
                    if (this.responseAsString == null) {
                        readerAsReader = asReader();
                        this.jsonArray = new JSONArray(new JSONTokener(readerAsReader));
                    } else {
                        this.jsonArray = new JSONArray(this.responseAsString);
                    }
                    if (this.CONF.isPrettyDebugEnabled()) {
                        logger.debug(this.jsonArray.toString(1));
                    } else {
                        logger.debug(this.responseAsString != null ? this.responseAsString : this.jsonArray.toString());
                    }
                    if (readerAsReader != null) {
                        try {
                            readerAsReader.close();
                        } catch (IOException e) {
                        }
                    }
                    try {
                        disconnect();
                    } catch (Exception e2) {
                    }
                } catch (JSONException e3) {
                    if (logger.isDebugEnabled()) {
                        throw new TwitterException(e3.getMessage() + ":" + this.responseAsString, e3);
                    }
                    throw new TwitterException(e3.getMessage(), e3);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        readerAsReader.close();
                    } catch (IOException e4) {
                    }
                }
                disconnectForcibly();
                throw th;
            }
        }
        return this.jsonArray;
    }

    public Reader asReader() {
        try {
            return new BufferedReader(new InputStreamReader(this.f3733is, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            return new InputStreamReader(this.f3733is);
        }
    }

    private void disconnectForcibly() {
        try {
            disconnect();
        } catch (Exception e) {
        }
    }

    public String toString() {
        return "HttpResponse{statusCode=" + this.statusCode + ", responseAsString='" + this.responseAsString + "', is=" + this.f3733is + ", streamConsumed=" + this.streamConsumed + '}';
    }
}
