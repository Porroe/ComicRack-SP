package com.cyo.comicrack.p019a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0535cc;
import com.cyo.comicrack.p019a.p020a.EnumC0540ch;
import com.cyo.comicrack.p019a.p020a.EnumC0541ci;
import com.cyo.comicrack.viewer.C0802fr;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.common.C0998bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a */
/* loaded from: classes.dex */
public final class C0477a {

    /* renamed from: b */
    Context f1532b;

    /* renamed from: c */
    public SQLiteOpenHelper f1533c;

    /* renamed from: a */
    public boolean f1531a = false;

    /* renamed from: d */
    public Object f1534d = new Object();

    private C0477a() {
    }

    public C0477a(Context context) {
        this.f1532b = context;
        this.f1533c = new C0585b(context);
    }

    /* renamed from: a */
    public final void m1103a() {
        synchronized (this.f1534d) {
            this.f1533c.close();
        }
    }

    /* renamed from: a */
    public final void m1105a(Iterable iterable) {
        synchronized (this.f1534d) {
            SQLiteDatabase writableDatabase = this.f1533c.getWritableDatabase();
            HashSet hashSet = new HashSet();
            Cursor cursorQuery = writableDatabase.query("books", new String[]{"Source"}, null, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    hashSet.add(cursorQuery.getString(0));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                hashSet.remove(((C0505b) it.next()).f1655v);
            }
            String[] strArr = new String[1];
            writableDatabase.beginTransaction();
            try {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    strArr[0] = (String) it2.next();
                    writableDatabase.delete("books", "Source=?", strArr);
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    /* renamed from: a */
    public final C0505b m1102a(String str, long j) {
        if (C0998bi.m2081a(str)) {
            return null;
        }
        synchronized (this.f1534d) {
            Cursor cursorQuery = this.f1533c.getReadableDatabase().query("books", null, "Source=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    return null;
                }
                if (j != 0 && cursorQuery.getLong(cursorQuery.getColumnIndex("SourceModified")) != j) {
                    return null;
                }
                return m1093a(cursorQuery);
            } finally {
                cursorQuery.close();
            }
        }
    }

    /* renamed from: a */
    public final C0505b m1101a(String str) {
        C0505b c0505bM1093a;
        if (C0998bi.m2081a(str)) {
            return null;
        }
        synchronized (this.f1534d) {
            Cursor cursorQuery = this.f1533c.getReadableDatabase().query("books", null, "Id=?", new String[]{str}, null, null, null);
            try {
                c0505bM1093a = cursorQuery.moveToFirst() ? m1093a(cursorQuery) : null;
            } finally {
                cursorQuery.close();
            }
        }
        return c0505bM1093a;
    }

    /* renamed from: a */
    private static C0505b m1093a(Cursor cursor) {
        try {
            C0505b c0505b = new C0505b();
            c0505b.f1570b = m1094a(cursor, "Id");
            c0505b.f1655v = m1094a(cursor, "Source");
            c0505b.f1657x = m1094a(cursor, "Series");
            c0505b.f1656w = m1094a(cursor, "Title");
            c0505b.f1658y = m1094a(cursor, "Number");
            c0505b.f1659z = m1097b(cursor, "Count");
            c0505b.f1616A = m1097b(cursor, "Volume");
            c0505b.f1617B = m1094a(cursor, "AlternateSeries");
            c0505b.f1618C = m1094a(cursor, "AlternateNumber");
            c0505b.f1621F = m1097b(cursor, "AlternateCount");
            c0505b.f1620E = m1094a(cursor, "StoryArc");
            c0505b.f1619D = m1094a(cursor, "SeriesGroup");
            c0505b.f1622G = m1094a(cursor, "Summary");
            c0505b.f1623H = m1094a(cursor, "Notes");
            c0505b.f1624I = m1094a(cursor, "Review");
            c0505b.f1625J = m1097b(cursor, "Year");
            c0505b.f1626K = m1097b(cursor, "Month");
            c0505b.f1627L = m1097b(cursor, "Day");
            c0505b.f1628M = m1094a(cursor, "Writer");
            c0505b.f1629N = m1094a(cursor, "Penciller");
            c0505b.f1630O = m1094a(cursor, "Inker");
            c0505b.f1631P = m1094a(cursor, "Colorist");
            c0505b.f1632Q = m1094a(cursor, "Letterer");
            c0505b.f1633R = m1094a(cursor, "CoverArtist");
            c0505b.f1634S = m1094a(cursor, "Editor");
            c0505b.f1635T = m1094a(cursor, "Publisher");
            c0505b.f1636U = m1094a(cursor, "Imprint");
            c0505b.f1637V = m1094a(cursor, "Genre");
            c0505b.f1638W = m1094a(cursor, "Web");
            c0505b.f1639X = m1097b(cursor, "PageCount");
            c0505b.f1640Y = m1094a(cursor, "LanguageISO");
            c0505b.f1641Z = m1094a(cursor, "Format");
            c0505b.f1643aa = m1094a(cursor, "AgeRating");
            c0505b.f1644ab = EnumC0541ci.m1201a(m1094a(cursor, "BlackAndWhite"), EnumC0541ci.Unknown);
            c0505b.f1645ac = EnumC0540ch.m1200a(m1094a(cursor, "Manga"), EnumC0540ch.Unknown);
            c0505b.f1646ad = m1097b(cursor, "PreferredFrontCover");
            c0505b.f1647ae = m1094a(cursor, "Characters");
            c0505b.f1649ag = m1094a(cursor, "MainCharacterOrTeam");
            c0505b.f1648af = m1094a(cursor, "Teams");
            c0505b.f1650ah = m1094a(cursor, "Locations");
            c0505b.f1651ai = cursor.getFloat(cursor.getColumnIndex("CommunityRating"));
            c0505b.f1652aj = m1094a(cursor, "ScanInformation");
            c0505b.f1571c = m1094a(cursor, "Added");
            c0505b.f1572d = m1094a(cursor, "Opened");
            c0505b.f1573e = m1097b(cursor, "OpenedCount");
            c0505b.f1574f = m1097b(cursor, "CurrentPage");
            c0505b.f1575g = m1097b(cursor, "LastPageRead");
            c0505b.f1576h = cursor.getFloat(cursor.getColumnIndex("Rating"));
            c0505b.f1585q = cursor.getLong(cursor.getColumnIndex("SourceModified"));
            c0505b.f1587s = m1097b(cursor, "FileFormat");
            c0505b.m1170a(cursor.getBlob(cursor.getColumnIndex("Pages")));
            return c0505b;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: b */
    public final List m1106b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f1534d) {
            Cursor cursorQuery = this.f1533c.getReadableDatabase().query("books", new String[]{"Source"}, null, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(cursorQuery.getString(0));
                } finally {
                    cursorQuery.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int m1099a(InterfaceC0625c interfaceC0625c) {
        Cursor cursorQuery;
        ArrayList arrayList;
        synchronized (this.f1534d) {
            cursorQuery = this.f1533c.getReadableDatabase().query("books", null, null, null, null, null, null);
        }
        try {
            int count = cursorQuery.getCount();
            ArrayList arrayList2 = null;
            while (cursorQuery.moveToNext()) {
                try {
                    C0505b c0505bM1093a = m1093a(cursorQuery);
                    if (c0505bM1093a != null) {
                        interfaceC0625c.mo1295a(c0505bM1093a);
                    } else {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(m1094a(cursorQuery, "Id"));
                    }
                } catch (Throwable th2) {
                    arrayList = arrayList2;
                    cursorQuery.close();
                    if (arrayList == null) {
                        throw th2;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m1098c((String) it.next());
                    }
                    throw th2;
                }
            }
            cursorQuery.close();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    m1098c((String) it2.next());
                }
            }
            return count;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* renamed from: a */
    public final void m1104a(C0505b c0505b) {
        String str = c0505b.f1655v;
        if (C0998bi.m2081a(str)) {
            return;
        }
        synchronized (this.f1534d) {
            SQLiteDatabase writableDatabase = this.f1533c.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("SourceModified", Long.valueOf(c0505b.f1585q));
            contentValues.put("Added", c0505b.f1571c);
            contentValues.put("Opened", c0505b.f1572d);
            contentValues.put("OpenedCount", Integer.valueOf(c0505b.f1573e));
            contentValues.put("CurrentPage", Integer.valueOf(c0505b.f1574f));
            contentValues.put("LastPageRead", Integer.valueOf(c0505b.f1575g));
            contentValues.put("Rating", Float.valueOf(c0505b.f1576h));
            contentValues.put("Pages", c0505b.m1164C());
            contentValues.put("Id", c0505b.f1570b);
            contentValues.put("Source", str);
            contentValues.put("Series", c0505b.f1657x);
            contentValues.put("Title", c0505b.f1656w);
            contentValues.put("Number", c0505b.f1658y);
            contentValues.put("Count", Integer.valueOf(c0505b.f1659z));
            contentValues.put("Volume", Integer.valueOf(c0505b.f1616A));
            contentValues.put("AlternateSeries", c0505b.f1617B);
            contentValues.put("AlternateNumber", c0505b.f1618C);
            contentValues.put("AlternateCount", Integer.valueOf(c0505b.f1621F));
            contentValues.put("StoryArc", c0505b.f1620E);
            contentValues.put("SeriesGroup", c0505b.f1619D);
            contentValues.put("Summary", c0505b.f1622G);
            contentValues.put("Notes", c0505b.f1623H);
            contentValues.put("Review", c0505b.f1624I);
            contentValues.put("Year", Integer.valueOf(c0505b.f1625J));
            contentValues.put("Month", Integer.valueOf(c0505b.f1626K));
            contentValues.put("Day", Integer.valueOf(c0505b.f1627L));
            contentValues.put("Writer", c0505b.f1628M);
            contentValues.put("Artists", c0505b.m1177v());
            contentValues.put("Penciller", c0505b.f1629N);
            contentValues.put("Inker", c0505b.f1630O);
            contentValues.put("Colorist", c0505b.f1631P);
            contentValues.put("Letterer", c0505b.f1632Q);
            contentValues.put("CoverArtist", c0505b.f1633R);
            contentValues.put("Editor", c0505b.f1634S);
            contentValues.put("Publisher", c0505b.f1635T);
            contentValues.put("Imprint", c0505b.f1636U);
            contentValues.put("Genre", c0505b.f1637V);
            contentValues.put("Web", c0505b.f1638W);
            contentValues.put("PageCount", Integer.valueOf(c0505b.f1639X));
            contentValues.put("LanguageISO", c0505b.f1640Y);
            contentValues.put("Format", c0505b.f1641Z);
            contentValues.put("AgeRating", c0505b.f1643aa);
            contentValues.put("BlackAndWhite", c0505b.f1644ab.toString());
            contentValues.put("Manga", c0505b.f1645ac.toString());
            contentValues.put("PreferredFrontCover", Integer.valueOf(c0505b.f1646ad));
            contentValues.put("Characters", c0505b.f1647ae);
            contentValues.put("MainCharacterOrTeam", c0505b.f1649ag);
            contentValues.put("Teams", c0505b.f1648af);
            contentValues.put("Locations", c0505b.f1650ah);
            contentValues.put("CommunityRating", Float.valueOf(c0505b.f1651ai));
            contentValues.put("ScanInformation", c0505b.f1652aj);
            contentValues.put("Caption", c0505b.m1171c(false));
            contentValues.put("FullSeries", c0505b.m1178w());
            contentValues.put("FileFormat", Integer.valueOf(c0505b.f1587s));
            try {
                writableDatabase.beginTransaction();
                try {
                    if (writableDatabase.update("books", contentValues, "Source=?", new String[]{str}) == 0) {
                        writableDatabase.insert("books", null, contentValues);
                        this.f1531a = true;
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("writeCachedInfo", String.format("Failed to update cache with: %s, %s", c0505b.f1655v, c0505b.f1570b));
            }
        }
    }

    /* renamed from: b */
    public final void m1107b(String str) {
        synchronized (this.f1534d) {
            this.f1533c.getWritableDatabase().delete("books", "Source=?", new String[]{str});
        }
    }

    /* renamed from: c */
    private void m1098c(String str) {
        synchronized (this.f1534d) {
            this.f1533c.getWritableDatabase().delete("books", "Id=?", new String[]{str});
        }
    }

    /* renamed from: a */
    public final Cursor m1100a(String[] strArr) {
        MatrixCursor matrixCursor;
        synchronized (this.f1534d) {
            SQLiteDatabase readableDatabase = this.f1533c.getReadableDatabase();
            matrixCursor = new MatrixCursor(new String[]{"_ID", "suggest_text_1", "suggest_text_2", "suggest_intent_data", "suggest_intent_query", "suggest_icon_1"});
            m1095a(matrixCursor, readableDatabase, strArr, new C0626d[]{new C0626d(this, "Caption", "FullSeries", C0806fv.show_series, C0802fr.icon_page_series, false), new C0626d(this, "AlternateSeries", null, C0806fv.show_storyline, C0802fr.icon_page_series, true), new C0626d(this, "Writer", null, C0806fv.show_ecomics_of_writer, C0802fr.icon_page_writer, true), new C0626d(this, "Artists", null, C0806fv.show_ecomics_of_artist, C0802fr.icon_page_human, true), new C0626d(this, "Genre", null, C0806fv.show_ecomics_with_this_genre, C0802fr.icon_page_genre, false)});
        }
        return matrixCursor;
    }

    /* renamed from: a */
    private static void m1095a(MatrixCursor matrixCursor, SQLiteDatabase sQLiteDatabase, String[] strArr, C0626d[] c0626dArr) {
        List list;
        Locale locale = Locale.getDefault();
        HashMap map = new HashMap();
        String str = strArr[0];
        String lowerCase = str.toLowerCase(locale);
        String str2 = " like '%" + str + "%'";
        int i = 0;
        int length = c0626dArr.length;
        int i2 = 0;
        while (i2 < length) {
            C0626d c0626d = c0626dArr[i2];
            Cursor cursorQuery = sQLiteDatabase.query("books", new String[]{"Id", c0626d.f1873a, c0626d.f1874b, "Caption", "FullSeries", "PageCount", "LastPageRead", "Number", "Count", "Month", "Year"}, String.valueOf(c0626d.f1873a) + " " + str2, null, null, null, "Caption ASC");
            int i3 = i;
            while (cursorQuery.moveToNext()) {
                String strM1094a = m1094a(cursorQuery, "Id");
                String str3 = C0505b.m1112a(m1097b(cursorQuery, "PageCount"), m1097b(cursorQuery, "LastPageRead")) >= 95 ? "_read" : "_unread";
                String strM1094a2 = m1094a(cursorQuery, c0626d.f1874b);
                Object[] objArr = new Object[6];
                int i4 = i3 + 1;
                objArr[0] = Integer.valueOf(i3);
                objArr[1] = m1094a(cursorQuery, "FullSeries");
                objArr[2] = C0535cc.m1160a(null, null, m1094a(cursorQuery, "Number"), m1097b(cursorQuery, "Count"), m1097b(cursorQuery, "Month"), m1097b(cursorQuery, "Year"));
                objArr[3] = "Book=" + Uri.encode(strM1094a);
                objArr[5] = Integer.valueOf(C0802fr.icon_page_empty);
                m1096a(map, str3, objArr);
                if (!c0626d.f1877e) {
                    String str4 = c0626d.f1873a;
                    Object[] objArr2 = new Object[6];
                    i3 = i4 + 1;
                    objArr2[0] = Integer.valueOf(i4);
                    objArr2[1] = strM1094a2;
                    objArr2[2] = c0626d.f1875c;
                    objArr2[3] = String.valueOf(c0626d.f1873a) + "=" + Uri.encode(strM1094a2);
                    objArr2[5] = Integer.valueOf(c0626d.f1876d);
                    m1096a(map, str4, objArr2);
                } else {
                    i3 = i4;
                    for (String str5 : strM1094a2.split(", ")) {
                        if (str5.toLowerCase(locale).contains(lowerCase)) {
                            String str6 = c0626d.f1873a;
                            Object[] objArr3 = new Object[6];
                            objArr3[0] = Integer.valueOf(i3);
                            objArr3[1] = str5;
                            objArr3[2] = c0626d.f1875c;
                            objArr3[3] = String.valueOf(c0626d.f1873a) + "=" + Uri.encode(str5);
                            objArr3[5] = Integer.valueOf(c0626d.f1876d);
                            m1096a(map, str6, objArr3);
                            i3++;
                        }
                    }
                }
            }
            cursorQuery.close();
            i2++;
            i = i3;
        }
        int i5 = 0;
        List list2 = (List) map.get("_unread");
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                matrixCursor.addRow((Object[]) it.next());
                int i6 = i5 + 1;
                if (i6 >= 5) {
                    i5 = i6;
                    break;
                }
                i5 = i6;
            }
        }
        if (i5 < 5 && (list = (List) map.get("_read")) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                matrixCursor.addRow((Object[]) it2.next());
                int i7 = i5 + 1;
                if (i7 >= 5) {
                    break;
                } else {
                    i5 = i7;
                }
            }
        }
        for (C0626d c0626d2 : c0626dArr) {
            List list3 = (List) map.get(c0626d2.f1873a);
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    matrixCursor.addRow((Object[]) it3.next());
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1096a(Map map, String str, Object[] objArr) {
        List list;
        List list2 = (List) map.get(str);
        if (list2 == null) {
            ArrayList arrayList = new ArrayList();
            map.put(str, arrayList);
            list = arrayList;
        } else {
            list = list2;
        }
        if (list.size() >= 5) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Object[]) it.next())[1].equals(objArr[1])) {
                return false;
            }
        }
        list.add(objArr);
        return true;
    }

    /* renamed from: a */
    private static String m1094a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndex(str));
    }

    /* renamed from: b */
    private static int m1097b(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }
}
