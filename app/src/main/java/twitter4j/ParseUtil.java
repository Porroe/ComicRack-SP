package twitter4j;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class ParseUtil {
    private static final Map formatMapQueue = new HashMap();

    private ParseUtil() {
        throw new AssertionError();
    }

    static String getUnescapedString(String str, JSONObject jSONObject) {
        return HTMLEntity.unescape(getRawString(str, jSONObject));
    }

    public static String getRawString(String str, JSONObject jSONObject) {
        try {
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        } catch (JSONException e) {
            return null;
        }
    }

    static String getURLDecodedString(String str, JSONObject jSONObject) {
        String rawString = getRawString(str, jSONObject);
        if (rawString != null) {
            try {
                return URLDecoder.decode(rawString, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return rawString;
            }
        }
        return rawString;
    }

    public static Date parseTrendsDate(String str) {
        switch (str.length()) {
            case 10:
                return new Date(Long.parseLong(str) * 1000);
            case 20:
                return getDate(str, "yyyy-MM-dd'T'HH:mm:ss'Z'");
            default:
                return getDate(str, "EEE, d MMM yyyy HH:mm:ss z");
        }
    }

    public static Date getDate(String str, JSONObject jSONObject) {
        return getDate(str, jSONObject, "EEE MMM d HH:mm:ss z yyyy");
    }

    public static Date getDate(String str, JSONObject jSONObject, String str2) {
        String unescapedString = getUnescapedString(str, jSONObject);
        if ("null".equals(unescapedString) || unescapedString == null) {
            return null;
        }
        return getDate(unescapedString, str2);
    }

    public static Date getDate(String str, String str2) throws InterruptedException {
        LinkedBlockingQueue linkedBlockingQueue;
        SimpleDateFormat simpleDateFormat;
        LinkedBlockingQueue linkedBlockingQueue2 = (LinkedBlockingQueue) formatMapQueue.get(str2);
        if (linkedBlockingQueue2 == null) {
            LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
            formatMapQueue.put(str2, linkedBlockingQueue3);
            linkedBlockingQueue = linkedBlockingQueue3;
        } else {
            linkedBlockingQueue = linkedBlockingQueue2;
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) linkedBlockingQueue.poll();
        if (simpleDateFormat2 == null) {
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str2, Locale.US);
            simpleDateFormat3.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
            simpleDateFormat = simpleDateFormat3;
        } else {
            simpleDateFormat = simpleDateFormat2;
        }
        try {
            try {
                return simpleDateFormat.parse(str);
            } catch (ParseException e) {
                throw new TwitterException("Unexpected date format(" + str + ") returned from twitter.com", e);
            }
        } finally {
            try {
                linkedBlockingQueue.put(simpleDateFormat);
            } catch (InterruptedException e2) {
            }
        }
    }

    public static int getInt(String str, JSONObject jSONObject) {
        return getInt(getRawString(str, jSONObject));
    }

    public static int getInt(String str) {
        if (str == null || "".equals(str) || "null".equals(str)) {
            return -1;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static long getLong(String str, JSONObject jSONObject) {
        return getLong(getRawString(str, jSONObject));
    }

    public static long getLong(String str) {
        if (str == null || "".equals(str) || "null".equals(str)) {
            return -1L;
        }
        if (str.endsWith("+")) {
            return Long.valueOf(str.substring(0, str.length() - 1)).longValue() + 1;
        }
        return Long.valueOf(str).longValue();
    }

    public static double getDouble(String str, JSONObject jSONObject) {
        String rawString = getRawString(str, jSONObject);
        if (rawString == null || "".equals(rawString) || "null".equals(rawString)) {
            return -1.0d;
        }
        return Double.valueOf(rawString).doubleValue();
    }

    public static boolean getBoolean(String str, JSONObject jSONObject) {
        String rawString = getRawString(str, jSONObject);
        if (rawString == null || "null".equals(rawString)) {
            return false;
        }
        return Boolean.valueOf(rawString).booleanValue();
    }

    public static int toAccessLevel(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return -1;
        }
        String responseHeader = httpResponse.getResponseHeader("X-Access-Level");
        if (responseHeader != null) {
            switch (responseHeader.length()) {
                case 4:
                    return 1;
                case 10:
                    return 2;
                case 25:
                case 26:
                    return 3;
            }
        }
        return 0;
    }
}
