package com.p004a.p012b.p013a.p014a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.a.b.a.a.v */
/* loaded from: classes.dex */
final class C0449v implements InterfaceC0442o {

    /* renamed from: n */
    private static final String f1448n = "CREATE TABLE events (" + String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", "event_id") + String.format(" '%s' INTEGER NOT NULL,", "user_id") + String.format(" '%s' CHAR(256) NOT NULL,", "account_id") + String.format(" '%s' INTEGER NOT NULL,", "random_val") + String.format(" '%s' INTEGER NOT NULL,", "timestamp_first") + String.format(" '%s' INTEGER NOT NULL,", "timestamp_previous") + String.format(" '%s' INTEGER NOT NULL,", "timestamp_current") + String.format(" '%s' INTEGER NOT NULL,", "visits") + String.format(" '%s' CHAR(256) NOT NULL,", "category") + String.format(" '%s' CHAR(256) NOT NULL,", "action") + String.format(" '%s' CHAR(256), ", "label") + String.format(" '%s' INTEGER,", "value") + String.format(" '%s' INTEGER,", "screen_width") + String.format(" '%s' INTEGER);", "screen_height");

    /* renamed from: o */
    private static final String f1449o = "CREATE TABLE IF NOT EXISTS session (" + String.format(" '%s' INTEGER PRIMARY KEY,", "timestamp_first") + String.format(" '%s' INTEGER NOT NULL,", "timestamp_previous") + String.format(" '%s' INTEGER NOT NULL,", "timestamp_current") + String.format(" '%s' INTEGER NOT NULL,", "visits") + String.format(" '%s' INTEGER NOT NULL);", "store_id");

    /* renamed from: p */
    private static final String f1450p = "CREATE TABLE custom_variables (" + String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", "cv_id") + String.format(" '%s' INTEGER NOT NULL,", "event_id") + String.format(" '%s' INTEGER NOT NULL,", "cv_index") + String.format(" '%s' CHAR(64) NOT NULL,", "cv_name") + String.format(" '%s' CHAR(64) NOT NULL,", "cv_value") + String.format(" '%s' INTEGER NOT NULL);", "cv_scope");

    /* renamed from: q */
    private static final String f1451q = "CREATE TABLE IF NOT EXISTS custom_var_cache (" + String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", "cv_id") + String.format(" '%s' INTEGER NOT NULL,", "event_id") + String.format(" '%s' INTEGER NOT NULL,", "cv_index") + String.format(" '%s' CHAR(64) NOT NULL,", "cv_name") + String.format(" '%s' CHAR(64) NOT NULL,", "cv_value") + String.format(" '%s' INTEGER NOT NULL);", "cv_scope");

    /* renamed from: r */
    private static final String f1452r = "CREATE TABLE transaction_events (" + String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", "tran_id") + String.format(" '%s' INTEGER NOT NULL,", "event_id") + String.format(" '%s' TEXT NOT NULL,", "order_id") + String.format(" '%s' TEXT,", "tran_storename") + String.format(" '%s' TEXT NOT NULL,", "tran_totalcost") + String.format(" '%s' TEXT,", "tran_totaltax") + String.format(" '%s' TEXT);", "tran_shippingcost");

    /* renamed from: s */
    private static final String f1453s = "CREATE TABLE item_events (" + String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", "item_id") + String.format(" '%s' INTEGER NOT NULL,", "event_id") + String.format(" '%s' TEXT NOT NULL,", "order_id") + String.format(" '%s' TEXT NOT NULL,", "item_sku") + String.format(" '%s' TEXT,", "item_name") + String.format(" '%s' TEXT,", "item_category") + String.format(" '%s' TEXT NOT NULL,", "item_price") + String.format(" '%s' TEXT NOT NULL);", "item_count");

    /* renamed from: t */
    private static final String f1454t = "CREATE TABLE IF NOT EXISTS hits (" + String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", "hit_id") + String.format(" '%s' TEXT NOT NULL,", "hit_string") + String.format(" '%s' INTEGER NOT NULL);", "hit_time");

    /* renamed from: a */
    private C0450w f1455a;

    /* renamed from: b */
    private int f1456b;

    /* renamed from: c */
    private long f1457c;

    /* renamed from: d */
    private long f1458d;

    /* renamed from: e */
    private long f1459e;

    /* renamed from: f */
    private int f1460f;

    /* renamed from: g */
    private volatile int f1461g;

    /* renamed from: h */
    private boolean f1462h;

    /* renamed from: i */
    private boolean f1463i;

    /* renamed from: j */
    private boolean f1464j;

    /* renamed from: k */
    private int f1465k;

    /* renamed from: l */
    private Random f1466l;

    /* renamed from: m */
    private C0432e f1467m;

    C0449v(Context context) {
        this(context, "google_analytics.db");
    }

    private C0449v(Context context, String str) {
        this.f1465k = 100;
        this.f1466l = new Random();
        this.f1455a = new C0450w(context, str, this);
        try {
            m1047b(this.f1455a.getWritableDatabase());
        } catch (SQLiteException e) {
            Log.e("GoogleAnalyticsTracker", e.toString());
        }
        this.f1467m = m1045l();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.p004a.p012b.p013a.p014a.C0426aa m1024a(long r10, android.database.sqlite.SQLiteDatabase r12) {
        /*
            r8 = 0
            java.lang.String r1 = "transaction_events"
            r2 = 0
            java.lang.String r3 = "event_id= ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L7f
            r0 = 0
            java.lang.String r5 = java.lang.Long.toString(r10)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L7f
            r4[r0] = r5     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L7f
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r12
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L7f
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            if (r0 == 0) goto L67
            com.a.b.a.a.ab r2 = new com.a.b.a.a.ab     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = "order_id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r3 = "tran_totalcost"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            double r4 = r1.getDouble(r3)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = "tran_storename"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            r2.f1360b = r0     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = "tran_totaltax"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            double r4 = r1.getDouble(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            r2.f1362d = r4     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = "tran_shippingcost"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            double r4 = r1.getDouble(r0)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            r2.f1363e = r4     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            com.a.b.a.a.aa r0 = new com.a.b.a.a.aa     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            r3 = 0
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            if (r1 == 0) goto L66
            r1.close()
        L66:
            return r0
        L67:
            if (r1 == 0) goto L6c
            r1.close()
        L6c:
            r0 = r8
            goto L66
        L6e:
            r0 = move-exception
            r1 = r8
        L70:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L87
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L6c
            r1.close()
            goto L6c
        L7f:
            r0 = move-exception
            r1 = r8
        L81:
            if (r1 == 0) goto L86
            r1.close()
        L86:
            throw r0
        L87:
            r0 = move-exception
            goto L81
        L89:
            r0 = move-exception
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1024a(long, android.database.sqlite.SQLiteDatabase):com.a.b.a.a.aa");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.p004a.p012b.p013a.p014a.C0432e m1025a(android.database.sqlite.SQLiteDatabase r10) {
        /*
            r8 = 0
            com.a.b.a.a.e r9 = new com.a.b.a.a.e
            r9.<init>()
            java.lang.String r1 = "custom_var_cache"
            r2 = 0
            java.lang.String r3 = "cv_scope= ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L75
            r0 = 0
            r5 = 1
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L75
            r4[r0] = r5     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L75
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L75
        L1e:
            boolean r0 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            if (r0 == 0) goto L65
            com.a.b.a.a.d r0 = new com.a.b.a.a.d     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            java.lang.String r2 = "cv_index"
            int r2 = r1.getColumnIndex(r2)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            int r2 = r1.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            java.lang.String r3 = "cv_name"
            int r3 = r1.getColumnIndex(r3)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            java.lang.String r3 = r1.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            java.lang.String r4 = "cv_value"
            int r4 = r1.getColumnIndex(r4)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            java.lang.String r5 = "cv_scope"
            int r5 = r1.getColumnIndex(r5)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            int r5 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            r0.<init>(r2, r3, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            r9.m968a(r0)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.Throwable -> L73
            goto L1e
        L55:
            r0 = move-exception
        L56:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L73
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r9
        L65:
            if (r1 == 0) goto L64
            r1.close()
            goto L64
        L6b:
            r0 = move-exception
            r1 = r8
        L6d:
            if (r1 == 0) goto L72
            r1.close()
        L72:
            throw r0
        L73:
            r0 = move-exception
            goto L6d
        L75:
            r0 = move-exception
            r1 = r8
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1025a(android.database.sqlite.SQLiteDatabase):com.a.b.a.a.e");
    }

    /* renamed from: a */
    static /* synthetic */ C0432e m1026a(C0449v c0449v, C0432e c0432e) {
        c0449v.f1467m = c0432e;
        return c0432e;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1027a(com.p004a.p012b.p013a.p014a.C0435h r10, android.database.sqlite.SQLiteDatabase r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1027a(com.a.b.a.a.h, android.database.sqlite.SQLiteDatabase, boolean):void");
    }

    /* renamed from: a */
    private void m1028a(C0435h c0435h, C0453z c0453z, SQLiteDatabase sQLiteDatabase, boolean z) {
        ContentValues contentValues = new ContentValues();
        StringBuilder sb = new StringBuilder();
        if ("__##GOOGLEPAGEVIEW##__".equals(c0435h.f1383l)) {
            String str = c0435h.f1384m != null ? c0435h.f1384m : "";
            if (!str.startsWith("/")) {
                str = "/" + str;
            }
            String strM965a = C0430c.m965a(str, "UTF-8");
            String strM992a = C0441n.m992a(c0435h);
            Locale locale = Locale.getDefault();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("/__utm.gif");
            sb2.append("?utmwv=4.8.1ma");
            sb2.append("&utmn=").append(c0435h.f1374c);
            if (strM992a.length() > 0) {
                sb2.append("&utme=").append(strM992a);
            }
            sb2.append("&utmcs=UTF-8");
            sb2.append(String.format("&utmsr=%dx%d", Integer.valueOf(c0435h.f1387p), Integer.valueOf(c0435h.f1388q)));
            sb2.append(String.format("&utmul=%s-%s", locale.getLanguage(), locale.getCountry()));
            sb2.append("&utmp=").append(strM965a);
            sb2.append("&utmac=").append(c0435h.f1373b);
            sb2.append("&utmcc=").append(C0441n.m993a(c0435h, c0453z));
            if (c0435h.f1375d != 0) {
                sb2.append("&utmhid=").append(c0435h.f1375d);
            }
            sb.append(sb2.toString());
        } else if ("__##GOOGLEITEM##__".equals(c0435h.f1383l)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("/__utm.gif");
            sb3.append("?utmwv=4.8.1ma");
            sb3.append("&utmn=").append(c0435h.f1374c);
            sb3.append("&utmt=item");
            C0443p c0443p = c0435h.f1391t;
            if (c0443p != null) {
                C0441n.m996a(sb3, "&utmtid", c0443p.f1419a);
                C0441n.m996a(sb3, "&utmipc", c0443p.f1420b);
                C0441n.m996a(sb3, "&utmipn", c0443p.f1421c);
                C0441n.m996a(sb3, "&utmiva", c0443p.f1422d);
                C0441n.m995a(sb3, "&utmipr", c0443p.f1423e);
                sb3.append("&utmiqt=");
                if (c0443p.f1424f != 0) {
                    sb3.append(c0443p.f1424f);
                }
            }
            sb3.append("&utmac=").append(c0435h.f1373b);
            sb3.append("&utmcc=").append(C0441n.m993a(c0435h, c0453z));
            sb.append(sb3.toString());
        } else if ("__##GOOGLETRANSACTION##__".equals(c0435h.f1383l)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("/__utm.gif");
            sb4.append("?utmwv=4.8.1ma");
            sb4.append("&utmn=").append(c0435h.f1374c);
            sb4.append("&utmt=tran");
            C0426aa c0426aa = c0435h.f1390s;
            if (c0426aa != null) {
                C0441n.m996a(sb4, "&utmtid", c0426aa.f1354a);
                C0441n.m996a(sb4, "&utmtst", c0426aa.f1355b);
                C0441n.m995a(sb4, "&utmtto", c0426aa.f1356c);
                C0441n.m995a(sb4, "&utmttx", c0426aa.f1357d);
                C0441n.m995a(sb4, "&utmtsp", c0426aa.f1358e);
                C0441n.m996a(sb4, "&utmtci", "");
                C0441n.m996a(sb4, "&utmtrg", "");
                C0441n.m996a(sb4, "&utmtco", "");
            }
            sb4.append("&utmac=").append(c0435h.f1373b);
            sb4.append("&utmcc=").append(C0441n.m993a(c0435h, c0453z));
            sb.append(sb4.toString());
        } else {
            Locale locale2 = Locale.getDefault();
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(String.format("5(%s*%s", C0430c.m965a(c0435h.f1383l, "UTF-8"), C0430c.m965a(c0435h.f1384m, "UTF-8")));
            if (c0435h.f1385n != null) {
                sb6.append("*").append(C0430c.m965a(c0435h.f1385n, "UTF-8"));
            }
            sb6.append(")");
            if (c0435h.f1386o >= 0) {
                sb6.append(String.format("(%d)", Integer.valueOf(c0435h.f1386o)));
            }
            sb6.append(C0441n.m992a(c0435h));
            sb5.append("/__utm.gif");
            sb5.append("?utmwv=4.8.1ma");
            sb5.append("&utmn=").append(c0435h.f1374c);
            sb5.append("&utmt=event");
            sb5.append("&utme=").append(sb6.toString());
            sb5.append("&utmcs=UTF-8");
            sb5.append(String.format("&utmsr=%dx%d", Integer.valueOf(c0435h.f1387p), Integer.valueOf(c0435h.f1388q)));
            sb5.append(String.format("&utmul=%s-%s", locale2.getLanguage(), locale2.getCountry()));
            sb5.append("&utmac=").append(c0435h.f1373b);
            sb5.append("&utmcc=").append(C0441n.m993a(c0435h, c0453z));
            if (c0435h.f1375d != 0) {
                sb5.append("&utmhid=").append(c0435h.f1375d);
            }
            sb.append(sb5.toString());
        }
        if (c0435h.f1381j) {
            sb.append("&aip=1");
        }
        if (!c0435h.f1382k) {
            sb.append("&utmht=" + System.currentTimeMillis());
        }
        contentValues.put("hit_string", sb.toString());
        contentValues.put("hit_time", Long.valueOf(z ? System.currentTimeMillis() : 0L));
        sQLiteDatabase.insert("hits", null, contentValues);
        this.f1461g++;
    }

    /* renamed from: a */
    static /* synthetic */ void m1029a(C0449v c0449v, C0435h c0435h, SQLiteDatabase sQLiteDatabase) throws Throwable {
        c0449v.m1027a(c0435h, sQLiteDatabase, false);
    }

    /* renamed from: a */
    private static boolean m1030a(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        boolean z = false;
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("referrer", null, null);
                sQLiteDatabase.insert("referrer", null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                if (!sQLiteDatabase.inTransaction() || m1036d(sQLiteDatabase)) {
                    z = true;
                }
            } catch (SQLiteException e) {
                Log.e("GoogleAnalyticsTracker", e.toString());
                if (!sQLiteDatabase.inTransaction() || !m1036d(sQLiteDatabase)) {
                }
            }
        } finally {
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p004a.p012b.p013a.p014a.C0435h[] m1031a(android.database.sqlite.SQLiteDatabase r20, int r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1031a(android.database.sqlite.SQLiteDatabase, int):com.a.b.a.a.h[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.p004a.p012b.p013a.p014a.C0443p m1032b(long r10, android.database.sqlite.SQLiteDatabase r12) {
        /*
            r8 = 0
            java.lang.String r1 = "item_events"
            r2 = 0
            java.lang.String r3 = "event_id= ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L87
            r0 = 0
            java.lang.String r5 = java.lang.Long.toString(r10)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L87
            r4[r0] = r5     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L87
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r12
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L87
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            if (r0 == 0) goto L6f
            com.a.b.a.a.q r1 = new com.a.b.a.a.q     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = "order_id"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r2 = r9.getString(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = "item_sku"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = r9.getString(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = "item_price"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            double r4 = r9.getDouble(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = "item_count"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            long r6 = r9.getLong(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            r1.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = "item_name"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            r1.f1429e = r0     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = "item_category"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            r1.f1430f = r0     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            com.a.b.a.a.p r0 = new com.a.b.a.a.p     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L94
            if (r9 == 0) goto L6e
            r9.close()
        L6e:
            return r0
        L6f:
            if (r9 == 0) goto L74
            r9.close()
        L74:
            r0 = r8
            goto L6e
        L76:
            r0 = move-exception
            r1 = r8
        L78:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L91
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L74
            r1.close()
            goto L74
        L87:
            r0 = move-exception
            r9 = r8
        L89:
            if (r9 == 0) goto L8e
            r9.close()
        L8e:
            throw r0
        L8f:
            r0 = move-exception
            goto L89
        L91:
            r0 = move-exception
            r9 = r1
            goto L89
        L94:
            r0 = move-exception
            r1 = r9
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1032b(long, android.database.sqlite.SQLiteDatabase):com.a.b.a.a.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.p004a.p012b.p013a.p014a.C0432e m1033c(long r10, android.database.sqlite.SQLiteDatabase r12) {
        /*
            r8 = 0
            com.a.b.a.a.e r9 = new com.a.b.a.a.e
            r9.<init>()
            java.lang.String r1 = "custom_variables"
            r2 = 0
            java.lang.String r3 = "event_id= ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L74
            r0 = 0
            java.lang.String r5 = java.lang.Long.toString(r10)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L74
            r4[r0] = r5     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L74
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r12
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L74
        L1d:
            boolean r0 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            if (r0 == 0) goto L64
            com.a.b.a.a.d r0 = new com.a.b.a.a.d     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            java.lang.String r2 = "cv_index"
            int r2 = r1.getColumnIndex(r2)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            int r2 = r1.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            java.lang.String r3 = "cv_name"
            int r3 = r1.getColumnIndex(r3)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            java.lang.String r3 = r1.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            java.lang.String r4 = "cv_value"
            int r4 = r1.getColumnIndex(r4)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            java.lang.String r5 = "cv_scope"
            int r5 = r1.getColumnIndex(r5)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            int r5 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            r0.<init>(r2, r3, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            r9.m968a(r0)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L72
            goto L1d
        L54:
            r0 = move-exception
        L55:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L72
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L63
            r1.close()
        L63:
            return r9
        L64:
            if (r1 == 0) goto L63
            r1.close()
            goto L63
        L6a:
            r0 = move-exception
            r1 = r8
        L6c:
            if (r1 == 0) goto L71
            r1.close()
        L71:
            throw r0
        L72:
            r0 = move-exception
            goto L6c
        L74:
            r0 = move-exception
            r1 = r8
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1033c(long, android.database.sqlite.SQLiteDatabase):com.a.b.a.a.e");
    }

    /* renamed from: c */
    static /* synthetic */ boolean m1034c(SQLiteDatabase sQLiteDatabase) {
        return m1036d(sQLiteDatabase);
    }

    /* renamed from: d */
    static /* synthetic */ String m1035d() {
        return f1448n;
    }

    /* renamed from: d */
    private static boolean m1036d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.endTransaction();
            return true;
        } catch (SQLiteException e) {
            Log.e("GoogleAnalyticsTracker", "exception ending transaction:" + e.toString());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.p004a.p012b.p013a.p014a.C0453z m1037e(android.database.sqlite.SQLiteDatabase r9) {
        /*
            r8 = 0
            java.lang.String r1 = "referrer"
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L5d java.lang.Throwable -> L6f
            r0 = 0
            java.lang.String r3 = "referrer"
            r2[r0] = r3     // Catch: android.database.sqlite.SQLiteException -> L5d java.lang.Throwable -> L6f
            r0 = 1
            java.lang.String r3 = "timestamp_referrer"
            r2[r0] = r3     // Catch: android.database.sqlite.SQLiteException -> L5d java.lang.Throwable -> L6f
            r0 = 2
            java.lang.String r3 = "referrer_visit"
            r2[r0] = r3     // Catch: android.database.sqlite.SQLiteException -> L5d java.lang.Throwable -> L6f
            r0 = 3
            java.lang.String r3 = "referrer_index"
            r2[r0] = r3     // Catch: android.database.sqlite.SQLiteException -> L5d java.lang.Throwable -> L6f
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r9
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L5d java.lang.Throwable -> L6f
            boolean r0 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            if (r0 == 0) goto L7f
            java.lang.String r0 = "timestamp_referrer"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            long r2 = r6.getLong(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "referrer_visit"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            int r4 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "referrer_index"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            int r5 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            java.lang.String r0 = "referrer"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            java.lang.String r1 = r6.getString(r0)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            com.a.b.a.a.z r0 = new com.a.b.a.a.z     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7c
        L57:
            if (r6 == 0) goto L5c
            r6.close()
        L5c:
            return r0
        L5d:
            r0 = move-exception
            r1 = r8
        L5f:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L79
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            r0 = r8
            goto L5c
        L6f:
            r0 = move-exception
            r6 = r8
        L71:
            if (r6 == 0) goto L76
            r6.close()
        L76:
            throw r0
        L77:
            r0 = move-exception
            goto L71
        L79:
            r0 = move-exception
            r6 = r1
            goto L71
        L7c:
            r0 = move-exception
            r1 = r6
            goto L5f
        L7f:
            r0 = r8
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1037e(android.database.sqlite.SQLiteDatabase):com.a.b.a.a.z");
    }

    /* renamed from: e */
    static /* synthetic */ String m1038e() {
        return f1449o;
    }

    /* renamed from: f */
    static /* synthetic */ String m1039f() {
        return f1450p;
    }

    /* renamed from: g */
    static /* synthetic */ String m1040g() {
        return f1451q;
    }

    /* renamed from: h */
    static /* synthetic */ String m1041h() {
        return f1452r;
    }

    /* renamed from: i */
    static /* synthetic */ String m1042i() {
        return f1453s;
    }

    /* renamed from: j */
    static /* synthetic */ String m1043j() {
        return f1454t;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.p004a.p012b.p013a.p014a.C0440m[] m1044k() {
        /*
            r11 = this;
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.a.b.a.a.w r0 = r11.f1455a     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L67
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L67
            java.lang.String r1 = "hits"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "hit_id"
            r8 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L67
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L67
        L1f:
            boolean r0 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L65
            if (r0 == 0) goto L4b
            com.a.b.a.a.m r0 = new com.a.b.a.a.m     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L65
            r2 = 1
            java.lang.String r2 = r1.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L65
            r3 = 0
            long r4 = r1.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L65
            r0.<init>(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L65
            r10.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L65
            goto L1f
        L38:
            r0 = move-exception
        L39:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L65
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L65
            r0 = 0
            com.a.b.a.a.m[] r0 = new com.p004a.p012b.p013a.p014a.C0440m[r0]     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L4a
            r1.close()
        L4a:
            return r0
        L4b:
            if (r1 == 0) goto L50
            r1.close()
        L50:
            int r0 = r10.size()
            com.a.b.a.a.m[] r0 = new com.p004a.p012b.p013a.p014a.C0440m[r0]
            java.lang.Object[] r0 = r10.toArray(r0)
            com.a.b.a.a.m[] r0 = (com.p004a.p012b.p013a.p014a.C0440m[]) r0
            goto L4a
        L5d:
            r0 = move-exception
            r1 = r9
        L5f:
            if (r1 == 0) goto L64
            r1.close()
        L64:
            throw r0
        L65:
            r0 = move-exception
            goto L5f
        L67:
            r0 = move-exception
            r1 = r9
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1044k():com.a.b.a.a.m[]");
    }

    /* renamed from: l */
    private C0432e m1045l() {
        try {
            return m1025a(this.f1455a.getReadableDatabase());
        } catch (SQLiteException e) {
            Log.e("GoogleAnalyticsTracker", e.toString());
            return new C0432e();
        }
    }

    /* renamed from: m */
    private int m1046m() {
        int i = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.f1455a.getReadableDatabase().rawQuery("SELECT COUNT(*) from hits", null);
                i = cursorRawQuery.moveToFirst() ? (int) cursorRawQuery.getLong(0) : 0;
            } catch (SQLiteException e) {
                Log.e("GoogleAnalyticsTracker", e.toString());
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
            return i;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: a */
    public final void mo998a(int i) {
        this.f1465k = i;
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: a */
    public final synchronized void mo999a(long j) {
        try {
            this.f1461g -= this.f1455a.getWritableDatabase().delete("hits", "hit_id = ?", new String[]{Long.toString(j)});
        } catch (SQLiteException e) {
            Log.e("GoogleAnalyticsTracker", e.toString());
        }
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: a */
    public final void mo1000a(C0435h c0435h) {
        if (this.f1461g >= 1000) {
            Log.w("GoogleAnalyticsTracker", "Store full. Not storing last event.");
            return;
        }
        if (this.f1465k != 100) {
            if ((c0435h.f1380i == -1 ? this.f1456b : c0435h.f1380i) % 10000 >= this.f1465k * 100) {
                if (C0436i.m977a().m991d()) {
                    Log.v("GoogleAnalyticsTracker", "User has been sampled out. Aborting hit.");
                    return;
                }
                return;
            }
        }
        synchronized (this) {
            try {
                SQLiteDatabase writableDatabase = this.f1455a.getWritableDatabase();
                try {
                    try {
                        writableDatabase.beginTransaction();
                        if (!this.f1462h) {
                            SQLiteDatabase writableDatabase2 = this.f1455a.getWritableDatabase();
                            writableDatabase2.delete("session", null, null);
                            if (this.f1457c == 0) {
                                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                this.f1457c = jCurrentTimeMillis;
                                this.f1458d = jCurrentTimeMillis;
                                this.f1459e = jCurrentTimeMillis;
                                this.f1460f = 1;
                            } else {
                                this.f1458d = this.f1459e;
                                this.f1459e = System.currentTimeMillis() / 1000;
                                if (this.f1459e == this.f1458d) {
                                    this.f1459e++;
                                }
                                this.f1460f++;
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("timestamp_first", Long.valueOf(this.f1457c));
                            contentValues.put("timestamp_previous", Long.valueOf(this.f1458d));
                            contentValues.put("timestamp_current", Long.valueOf(this.f1459e));
                            contentValues.put("visits", Integer.valueOf(this.f1460f));
                            contentValues.put("store_id", Integer.valueOf(this.f1456b));
                            writableDatabase2.insert("session", null, contentValues);
                            this.f1462h = true;
                        }
                        m1027a(c0435h, writableDatabase, true);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLiteException e) {
                        Log.e("GoogleAnalyticsTracker", "putEventOuter:" + e.toString());
                        if (writableDatabase.inTransaction()) {
                            m1036d(writableDatabase);
                        }
                    }
                } finally {
                    if (writableDatabase.inTransaction()) {
                        m1036d(writableDatabase);
                    }
                }
            } catch (SQLiteException e2) {
                Log.e("GoogleAnalyticsTracker", "Can't get db: " + e2.toString());
            }
        }
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: a */
    public final void mo1001a(boolean z) {
        this.f1464j = z;
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: a */
    public final C0440m[] mo1002a() {
        return m1044k();
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: b */
    public final int mo1003b() {
        return this.f1461g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1047b(android.database.sqlite.SQLiteDatabase r15) {
        /*
            r14 = this;
            r9 = 1
            r10 = 0
            r12 = 0
            r8 = 0
            java.lang.String r1 = "session"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r15
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            if (r0 == 0) goto L58
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.f1457c = r2     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r0 = 1
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.f1458d = r2     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r0 = 2
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.f1459e = r2     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r0 = 3
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.f1460f = r0     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r0 = 4
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.f1456b = r0     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            com.a.b.a.a.z r0 = m1037e(r15)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            long r2 = r14.f1457c     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L56
            if (r0 == 0) goto L4d
            long r2 = r0.f1477b     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L56
        L4d:
            r0 = r9
        L4e:
            r14.f1462h = r0     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
        L50:
            if (r1 == 0) goto L55
            r1.close()
        L55:
            return
        L56:
            r0 = r10
            goto L4e
        L58:
            r0 = 0
            r14.f1462h = r0     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r0 = 1
            r14.f1463i = r0     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r0.<init>()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            int r0 = r0.nextInt()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            r14.f1456b = r0     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r1.close()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r0.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.String r1 = "timestamp_first"
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r0.put(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.String r1 = "timestamp_previous"
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r0.put(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.String r1 = "timestamp_current"
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r0.put(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.String r1 = "visits"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r0.put(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.String r1 = "store_id"
            int r2 = r14.f1456b     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r0.put(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            java.lang.String r1 = "session"
            r2 = 0
            r15.insert(r1, r2, r0)     // Catch: android.database.sqlite.SQLiteException -> Lb3 java.lang.Throwable -> Lc4
            r1 = r8
            goto L50
        Lb3:
            r0 = move-exception
            r1 = r8
        Lb5:
            java.lang.String r2 = "GoogleAnalyticsTracker"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lcc
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> Lcc
            if (r1 == 0) goto L55
            r1.close()
            goto L55
        Lc4:
            r0 = move-exception
            r1 = r8
        Lc6:
            if (r1 == 0) goto Lcb
            r1.close()
        Lcb:
            throw r0
        Lcc:
            r0 = move-exception
            goto Lc6
        Lce:
            r0 = move-exception
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0449v.m1047b(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // com.p004a.p012b.p013a.p014a.InterfaceC0442o
    /* renamed from: c */
    public final synchronized void mo1004c() {
        this.f1462h = false;
        this.f1463i = true;
        this.f1461g = m1046m();
    }
}
