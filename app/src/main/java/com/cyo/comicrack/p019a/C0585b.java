package com.cyo.comicrack.p019a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.cyo.comicrack.viewer.C0805fu;
import com.cyo.common.C0998bi;
import com.cyo.common.C1095l;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b */
/* loaded from: classes.dex */
final class C0585b extends SQLiteOpenHelper {

    /* renamed from: a */
    private String f1765a;

    /* renamed from: b */
    private String f1766b;

    /* renamed from: c */
    private String f1767c;

    /* renamed from: d */
    private String f1768d;

    C0585b(Context context) {
        super(context, "ComicRack", (SQLiteDatabase.CursorFactory) null, 4);
        this.f1765a = C1095l.m2366a(context.getResources(), C0805fu.create_database);
        this.f1766b = C1095l.m2366a(context.getResources(), C0805fu.upgrade_database_v1_v2);
        this.f1767c = C1095l.m2366a(context.getResources(), C0805fu.upgrade_database_v2_v3);
        this.f1768d = C1095l.m2366a(context.getResources(), C0805fu.upgrade_database_v3_v4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m1258a(sQLiteDatabase, this.f1765a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        switch (i) {
            case 1:
                m1258a(sQLiteDatabase, this.f1766b);
            case 2:
                m1258a(sQLiteDatabase, this.f1767c);
            case 3:
                m1258a(sQLiteDatabase, this.f1768d);
                break;
        }
    }

    /* renamed from: a */
    private static void m1258a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        for (String str2 : str.split(";")) {
            String strTrim = str2.replace("\r\n", " ").trim();
            if (!C0998bi.m2081a(strTrim)) {
                sQLiteDatabase.execSQL(String.valueOf(strTrim) + ";");
            }
        }
    }
}
