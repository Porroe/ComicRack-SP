package twitter4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class HttpResponseImpl extends HttpResponse {
    private HttpURLConnection con;

    HttpResponseImpl(HttpURLConnection httpURLConnection, HttpClientConfiguration httpClientConfiguration) throws IOException {
        super(httpClientConfiguration);
        this.con = httpURLConnection;
        try {
            this.statusCode = httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if ("Received authentication challenge is null".equals(e.getMessage())) {
                this.statusCode = httpURLConnection.getResponseCode();
            } else {
                throw e;
            }
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        this.f3733is = errorStream;
        if (errorStream == null) {
            this.f3733is = httpURLConnection.getInputStream();
        }
        if (this.f3733is != null && "gzip".equals(httpURLConnection.getContentEncoding())) {
            this.f3733is = new StreamingGZIPInputStream(this.f3733is);
        }
    }

    HttpResponseImpl(String str) {
        this.responseAsString = str;
    }

    @Override // twitter4j.HttpResponse
    public String getResponseHeader(String str) {
        return this.con.getHeaderField(str);
    }

    @Override // twitter4j.HttpResponse
    public Map getResponseHeaderFields() {
        return this.con.getHeaderFields();
    }

    @Override // twitter4j.HttpResponse
    public void disconnect() {
        this.con.disconnect();
    }
}
