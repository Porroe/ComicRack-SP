package com.p004a.p005a.p011e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;
import com.p004a.p005a.ActivityC0274b;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.a */
/* loaded from: classes.dex */
public final class C0358a {

    /* renamed from: d */
    private static String f1024d;

    /* renamed from: f */
    private static AudioManager f1026f;

    /* renamed from: a */
    public static final int f1021a = m883b(Build.VERSION.SDK);

    /* renamed from: b */
    private static Boolean f1022b = null;

    /* renamed from: c */
    private static String f1023c = null;

    /* renamed from: e */
    private static String f1025e = null;

    /* renamed from: g */
    private static boolean f1027g = true;

    /* renamed from: h */
    private static boolean f1028h = false;

    /* renamed from: i */
    private static String f1029i = null;

    /* renamed from: a */
    public static boolean m879a(Intent intent, Context context) {
        return context.getPackageManager().resolveActivity(intent, 65536) != null;
    }

    /* renamed from: a */
    public static String m869a(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
        while (true) {
            int i = readable.read(charBufferAllocate);
            if (i != -1) {
                charBufferAllocate.flip();
                sb.append((CharSequence) charBufferAllocate, 0, i);
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    private static int m883b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C0372i.m920e("The Android SDK version couldn't be parsed to an int: " + Build.VERSION.SDK);
            C0372i.m920e("Defaulting to Android SDK version 3.");
            return 3;
        }
    }

    /* renamed from: a */
    public static String m868a(Context context) {
        String strM870a;
        if (f1023c == null) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null || m887c()) {
                strM870a = m870a("emulator");
            } else {
                strM870a = m870a(string);
            }
            if (strM870a == null) {
                return null;
            }
            f1023c = strM870a.toUpperCase(Locale.US);
        }
        return f1023c;
    }

    /* renamed from: a */
    public static int m864a() {
        return f1021a >= 9 ? 6 : 0;
    }

    /* renamed from: b */
    public static int m881b() {
        return f1021a >= 9 ? 7 : 1;
    }

    /* renamed from: a */
    public static int m866a(Context context, DisplayMetrics displayMetrics) {
        return f1021a >= 4 ? C0379p.m924a(context, displayMetrics.density, displayMetrics.heightPixels) : displayMetrics.heightPixels;
    }

    /* renamed from: b */
    public static int m882b(Context context, DisplayMetrics displayMetrics) {
        return f1021a >= 4 ? C0379p.m924a(context, displayMetrics.density, displayMetrics.widthPixels) : displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static boolean m886b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager.checkPermission("android.permission.INTERNET", packageName) == -1) {
            C0372i.m914b("INTERNET permissions must be enabled in AndroidManifest.xml.");
            return false;
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", packageName) == -1) {
            C0372i.m914b("ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.");
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m877a(int i, int i2, String str) {
        if ((i & i2) != 0) {
            return true;
        }
        C0372i.m914b("The android:configChanges value of the com.google.ads.AdActivity must include " + str + ".");
        return false;
    }

    /* renamed from: c */
    public static boolean m888c(Context context) {
        if (f1022b != null) {
            return f1022b.booleanValue();
        }
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent(context, (Class<?>) ActivityC0274b.class), 65536);
        f1022b = true;
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            C0372i.m914b("Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.");
            f1022b = false;
        } else {
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 16, "keyboard")) {
                f1022b = false;
            }
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 32, "keyboardHidden")) {
                f1022b = false;
            }
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 128, "orientation")) {
                f1022b = false;
            }
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 256, "screenLayout")) {
                f1022b = false;
            }
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 512, "uiMode")) {
                f1022b = false;
            }
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 1024, "screenSize")) {
                f1022b = false;
            }
            if (!m877a(resolveInfoResolveActivity.activityInfo.configChanges, 2048, "smallestScreenSize")) {
                f1022b = false;
            }
        }
        return f1022b.booleanValue();
    }

    /* renamed from: c */
    public static boolean m887c() {
        C0378o c0378o = C0378o.f1067d;
        return c0378o.equals(C0378o.f1068e) || c0378o.equals(C0378o.f1069f);
    }

    /* renamed from: a */
    public static boolean m880a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    /* renamed from: a */
    public static String m870a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(), 0, str.length());
            return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            return str.substring(0, 32);
        }
    }

    /* renamed from: d */
    public static String m889d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
                return "ed";
            case 1:
                return "wi";
            default:
                return "unknown";
        }
    }

    /* renamed from: e */
    public static String m891e(Context context) {
        if (f1024d == null) {
            StringBuilder sb = new StringBuilder();
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                sb.append("m");
            }
            List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:com.google")), 65536);
            if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append("a");
            }
            f1024d = sb.toString();
        }
        return f1024d;
    }

    /* renamed from: a */
    public static boolean m878a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: f */
    public static String m892f(Context context) {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        if (f1025e != null) {
            return f1025e;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads")), 65536);
            if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || (packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0)) == null) {
                return null;
            }
            String str = packageInfo.versionCode + "." + activityInfo.packageName;
            f1025e = str;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: g */
    public static EnumC0366c m893g(Context context) {
        if (f1026f == null) {
            f1026f = (AudioManager) context.getSystemService("audio");
        }
        EnumC0366c enumC0366c = EnumC0366c.OTHER;
        int mode = f1026f.getMode();
        if (m887c()) {
            return EnumC0366c.EMULATOR;
        }
        if (f1026f.isMusicActive() || f1026f.isSpeakerphoneOn() || mode == 2 || mode == 1) {
            return EnumC0366c.VIBRATE;
        }
        int ringerMode = f1026f.getRingerMode();
        if (ringerMode == 0 || ringerMode == 1) {
            return EnumC0366c.VIBRATE;
        }
        return EnumC0366c.SPEAKER;
    }

    /* renamed from: a */
    public static DisplayMetrics m867a(Activity activity) {
        if (activity.getWindowManager() == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static HashMap m872a(Location location) {
        if (location == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("time", Long.valueOf(location.getTime() * 1000));
        map.put("lat", Long.valueOf((long) (location.getLatitude() * 1.0E7d)));
        map.put("long", Long.valueOf((long) (location.getLongitude() * 1.0E7d)));
        map.put("radius", Long.valueOf((long) (location.getAccuracy() * 1000.0f)));
        return map;
    }

    /* renamed from: b */
    public static HashMap m884b(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            String[] strArrSplit = encodedQuery.split("&");
            for (String str : strArrSplit) {
                int iIndexOf = str.indexOf("=");
                if (iIndexOf < 0) {
                    map.put(Uri.decode(str), null);
                } else {
                    map.put(Uri.decode(str.substring(0, iIndexOf)), Uri.decode(str.substring(iIndexOf + 1, str.length())));
                }
            }
        }
        return map;
    }

    /* renamed from: d */
    public static boolean m890d() {
        return f1027g;
    }

    /* renamed from: a */
    public static void m876a(boolean z) {
        f1027g = z;
    }

    /* renamed from: h */
    public static void m894h(Context context) {
        if (!f1028h) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(new C0365b(), intentFilter);
            f1028h = true;
        }
    }

    /* renamed from: i */
    private static String m895i(Context context) {
        if (f1029i == null) {
            String userAgentString = new WebView(context).getSettings().getUserAgentString();
            if (userAgentString == null || userAgentString.length() == 0 || userAgentString.equals("Java0")) {
                String property = System.getProperty("os.name", "Linux");
                String str = "Android " + Build.VERSION.RELEASE;
                Locale locale = Locale.getDefault();
                String lowerCase = locale.getLanguage().toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    lowerCase = "en";
                }
                String lowerCase2 = locale.getCountry().toLowerCase(Locale.US);
                if (lowerCase2.length() > 0) {
                    lowerCase = lowerCase + "-" + lowerCase2;
                }
                userAgentString = "Mozilla/5.0 (" + property + "; U; " + str + "; " + lowerCase + "; " + (Build.MODEL + " Build/" + Build.ID) + ") AppleWebKit/0.0 (KHTML, like Gecko) Version/0.0 Mobile Safari/0.0";
            }
            f1029i = userAgentString + " (Mobile; afma-sdk-a-v6.4.1)";
        }
        return f1029i;
    }

    /* renamed from: a */
    public static void m874a(WebView webView) {
        webView.getSettings().setUserAgentString(m895i(webView.getContext().getApplicationContext()));
    }

    /* renamed from: a */
    public static void m875a(HttpURLConnection httpURLConnection, Context context) {
        httpURLConnection.setRequestProperty("User-Agent", m895i(context));
    }

    /* renamed from: a */
    public static String m871a(Map map) {
        try {
            return m885b(map).toString();
        } catch (JSONException e) {
            C0372i.m919d("JsonException in serialization: ", e);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m885b(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (Object entry : map.keySet()) {
            String str = (String) entry;
            Object obj = map.get(str);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float)) {
                jSONObject.put(str, obj);
            } else if (obj instanceof Map) {
                try {
                    jSONObject.put(str, m885b((Map) obj));
                } catch (ClassCastException e) {
                    C0372i.m919d("Unknown map type in json serialization: ", e);
                }
            } else if (obj instanceof Set) {
                try {
                    jSONObject.put(str, m873a((Set) obj));
                } catch (ClassCastException e2) {
                    C0372i.m919d("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0372i.m920e("Unknown value in json serialization: " + obj);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONArray m873a(Set set) throws org.json.JSONException {
        JSONArray jSONArray = new JSONArray();
        if (set == null || set.isEmpty()) {
            return jSONArray;
        }
        for (Object obj : set) {
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float)) {
                jSONArray.put(obj);
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(m885b((Map) obj));
                } catch (ClassCastException e) {
                    C0372i.m919d("Unknown map type in json serialization: ", e);
                }
            } else if (obj instanceof Set) {
                try {
                    jSONArray.put(m873a((Set) obj));
                } catch (ClassCastException e2) {
                    C0372i.m919d("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0372i.m920e("Unknown value in json serialization: " + obj);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static int m865a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
