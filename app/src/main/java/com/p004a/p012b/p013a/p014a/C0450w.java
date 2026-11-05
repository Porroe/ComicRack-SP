package com.p004a.p012b.p013a.p014a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.HashSet;

/* renamed from: com.a.b.a.a.w */
/* loaded from: classes.dex */
final class C0450w extends SQLiteOpenHelper {

    /* renamed from: a */
    private final int f1468a;

    /* renamed from: b */
    private final C0449v f1469b;

    C0450w(Context context, String str, C0449v c0449v) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        this.f1468a = 5;
        this.f1469b = c0449v;
    }

    /* renamed from: a */
    private static void m1048a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS custom_variables;");
        sQLiteDatabase.execSQL(C0449v.m1039f());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS custom_var_cache;");
        sQLiteDatabase.execSQL(C0449v.m1040g());
        for (int i = 1; i <= 5; i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_id", (Integer) 0);
            contentValues.put("cv_index", Integer.valueOf(i));
            contentValues.put("cv_name", "");
            contentValues.put("cv_scope", (Integer) 3);
            contentValues.put("cv_value", "");
            sQLiteDatabase.insert("custom_var_cache", "event_id", contentValues);
        }
    }

    /* renamed from: b */
    private static void m1049b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS transaction_events;");
        sQLiteDatabase.execSQL(C0449v.m1041h());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS item_events;");
        sQLiteDatabase.execSQL(C0449v.m1042i());
    }

    /* renamed from: c */
    private static void m1050c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS hits;");
        sQLiteDatabase.execSQL(C0449v.m1043j());
    }

    /* renamed from: d */
    private static void m1051d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS referrer;");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events;");
        sQLiteDatabase.execSQL(C0449v.m1035d());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS install_referrer;");
        sQLiteDatabase.execSQL("CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS session;");
        sQLiteDatabase.execSQL(C0449v.m1038e());
        if (this.f1468a > 1) {
            m1048a(sQLiteDatabase);
        }
        if (this.f1468a > 2) {
            m1049b(sQLiteDatabase);
        }
        if (this.f1468a > 3) {
            m1050c(sQLiteDatabase);
            m1051d(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        Log.w("GoogleAnalyticsTracker", "Downgrading database version from " + i + " to " + i2 + " not recommended.");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
        sQLiteDatabase.execSQL(C0449v.m1043j());
        sQLiteDatabase.execSQL(C0449v.m1040g());
        sQLiteDatabase.execSQL(C0449v.m1038e());
        HashSet hashSet = new HashSet();
        Cursor cursorQuery = sQLiteDatabase.query("custom_var_cache", null, null, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("cv_index"))));
            } catch (SQLiteException e) {
                Log.e("GoogleAnalyticsTracker", "Error on downgrade: " + e.toString());
            } finally {
                cursorQuery.close();
            }
        }
        int i3 = 1;
        while (true) {
            int i4 = i3;
            if (i4 > 5) {
                return;
            }
            try {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("event_id", (Integer) 0);
                    contentValues.put("cv_index", Integer.valueOf(i4));
                    contentValues.put("cv_name", "");
                    contentValues.put("cv_scope", (Integer) 3);
                    contentValues.put("cv_value", "");
                    sQLiteDatabase.insert("custom_var_cache", "event_id", contentValues);
                }
            } catch (SQLiteException e2) {
                Log.e("GoogleAnalyticsTracker", "Error inserting custom variable on downgrade: " + e2.toString());
            }
            i3 = i4 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0450w.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p012b.p013a.p014a.C0450w.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
