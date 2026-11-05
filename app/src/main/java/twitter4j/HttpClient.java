package twitter4j;

import java.util.Map;
import twitter4j.auth.Authorization;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface HttpClient {
    void addDefaultRequestHeader(String str, String str2);

    HttpResponse delete(String str);

    HttpResponse delete(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener);

    HttpResponse get(String str);

    HttpResponse get(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener);

    Map getRequestHeaders();

    HttpResponse head(String str);

    HttpResponse post(String str);

    HttpResponse post(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener);

    HttpResponse put(String str);

    HttpResponse put(String str, HttpParameter[] httpParameterArr, Authorization authorization, HttpResponseListener httpResponseListener);

    HttpResponse request(HttpRequest httpRequest);

    HttpResponse request(HttpRequest httpRequest, HttpResponseListener httpResponseListener);
}
