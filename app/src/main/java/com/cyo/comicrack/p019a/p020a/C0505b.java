package com.cyo.comicrack.p019a.p020a;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import android.text.format.Time;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0971b;
import com.cyo.common.C0998bi;
import com.cyo.common.C1083ca;
import com.cyo.common.C1086cd;
import com.cyo.common.C1092i;
import com.cyo.common.InterfaceC1093j;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.b */
/* loaded from: classes.dex */
public final class C0505b extends C0535cc {

    /* renamed from: an */
    private static String f1564an;

    /* renamed from: ao */
    private static Pattern f1565ao;

    /* renamed from: a */
    public String f1568a;

    /* renamed from: b */
    public String f1570b;

    /* renamed from: c */
    public String f1571c;

    /* renamed from: d */
    public String f1572d;

    /* renamed from: e */
    public int f1573e;

    /* renamed from: f */
    public int f1574f;

    /* renamed from: g */
    public int f1575g;

    /* renamed from: h */
    public float f1576h;

    /* renamed from: i */
    public boolean f1577i;

    /* renamed from: j */
    public boolean f1578j;

    /* renamed from: k */
    public boolean f1579k;

    /* renamed from: l */
    public boolean f1580l;

    /* renamed from: m */
    public boolean f1581m;

    /* renamed from: n */
    public boolean f1582n;

    /* renamed from: o */
    public boolean f1583o;

    /* renamed from: p */
    public boolean f1584p;

    /* renamed from: q */
    public long f1585q;

    /* renamed from: r */
    public long f1586r;

    /* renamed from: s */
    public int f1587s;

    /* renamed from: al */
    private static C1092i f1563al = new C1092i();

    /* renamed from: ap */
    private static C1083ca f1566ap = new C0532c();

    /* renamed from: aq */
    private static C1083ca f1567aq = new C0514bi();

    /* renamed from: am */
    private boolean f1569am = true;

    /* renamed from: t */
    public boolean f1588t = false;

    /* renamed from: a */
    static /* synthetic */ void m1115a(C0505b c0505b, boolean z) {
        c0505b.f1569am = z;
    }

    /* renamed from: a */
    public final boolean m1127a(String str) {
        return str != null && str.equalsIgnoreCase(this.f1570b);
    }

    /* renamed from: a */
    public final void m1121a() {
        if (this.f1574f != m1139e() - 1 || this.f1573e == 0) {
            m1130b(C0971b.m2054a());
            this.f1573e++;
            int iM1139e = m1139e() - 1;
            this.f1575g = iM1139e;
            this.f1574f = iM1139e;
            this.f1578j = true;
            m1116a(EnumC0534cb.Reading);
        }
    }

    /* renamed from: b */
    public final void m1128b() {
        if (this.f1573e != 0) {
            this.f1573e = 0;
            m1130b((Time) null);
            this.f1575g = 0;
            this.f1574f = 0;
            this.f1578j = true;
            m1116a(EnumC0534cb.Reading);
        }
    }

    /* renamed from: a */
    public final void m1126a(boolean z) {
        if (this.f1569am != z) {
            this.f1588t = true;
            this.f1569am = z;
            this.f1579k = true;
        }
    }

    /* renamed from: c */
    public final boolean m1136c() {
        return this.f1569am;
    }

    /* renamed from: a */
    public final void m1123a(int i) {
        if (this.f1573e != i) {
            this.f1588t = true;
            this.f1578j = true;
            this.f1573e = i;
            m1116a(EnumC0534cb.Reading);
        }
    }

    /* renamed from: d */
    public final int m1138d() {
        return this.f1573e;
    }

    /* renamed from: e */
    public final int m1139e() {
        return Math.max(this.f1639X, m1165D().size());
    }

    /* renamed from: b */
    public final void m1129b(int i) {
        if (this.f1574f != i) {
            this.f1588t = true;
            this.f1578j = true;
            this.f1574f = i;
            if (i > this.f1575g) {
                m1135c(i);
            }
            m1116a(EnumC0534cb.Reading);
        }
    }

    /* renamed from: f */
    public final int m1140f() {
        return this.f1574f;
    }

    /* renamed from: c */
    public final void m1135c(int i) {
        if (this.f1575g != i) {
            this.f1588t = true;
            this.f1578j = true;
            this.f1575g = i;
            m1116a(EnumC0534cb.Reading);
        }
    }

    /* renamed from: b */
    public final void m1133b(boolean z) {
        EnumC0540ch enumC0540ch = z ? EnumC0540ch.Yes : EnumC0540ch.No;
        if (this.f1645ac != enumC0540ch) {
            this.f1588t = true;
            this.f1581m = true;
            this.f1645ac = enumC0540ch;
            m1116a(EnumC0534cb.Data);
        }
    }

    /* renamed from: a */
    public final void m1122a(float f) {
        if (this.f1576h != f) {
            this.f1588t = true;
            this.f1581m = true;
            this.f1576h = f;
            m1116a(EnumC0534cb.Rating);
        }
    }

    /* renamed from: b */
    public final void m1132b(String str) {
        if (!C0998bi.m2082a(this.f1624I, str)) {
            this.f1588t = true;
            this.f1581m = true;
            this.f1624I = str;
            m1116a(EnumC0534cb.Rating);
        }
    }

    /* renamed from: g */
    public final int m1141g() {
        return this.f1575g;
    }

    /* renamed from: h */
    public final int m1142h() {
        return m1112a(this.f1575g, m1139e());
    }

    /* renamed from: a */
    public static int m1112a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return 0;
        }
        return Math.min(((i + 1) * 100) / i2, 100);
    }

    /* renamed from: i */
    public final boolean m1143i() {
        return m1142h() > 95;
    }

    /* renamed from: j */
    public final boolean m1144j() {
        return ((m1142h() < 10) || m1143i()) ? false : true;
    }

    /* renamed from: k */
    public final Time m1145k() {
        return C0971b.m2055a(this.f1571c);
    }

    /* renamed from: a */
    public final void m1124a(Time time) {
        this.f1571c = C0971b.m2056a(time);
        this.f1588t = true;
    }

    /* renamed from: l */
    public final Time m1146l() {
        return C0971b.m2055a(this.f1572d);
    }

    /* renamed from: b */
    public final void m1130b(Time time) {
        this.f1572d = time == null ? null : C0971b.m2056a(time);
        this.f1578j = true;
        this.f1588t = true;
        m1116a(EnumC0534cb.Data);
    }

    /* renamed from: m */
    public final String m1147m() {
        int iLastIndexOf = this.f1655v.lastIndexOf(47);
        return iLastIndexOf == -1 ? "/" : this.f1655v.substring(0, iLastIndexOf + 1);
    }

    /* renamed from: n */
    public final String m1148n() {
        String strM1147m = m1147m();
        int iLastIndexOf = strM1147m.lastIndexOf(47);
        return iLastIndexOf == -1 ? C0628f.f1891m : strM1147m.substring(iLastIndexOf + 1);
    }

    /* renamed from: o */
    public final String m1149o() {
        try {
            return new File(this.f1655v).getName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C0505b m1113a(File file) {
        BufferedInputStream input = null;
        try {
            input = new BufferedInputStream(new FileInputStream(file), f1615u);
            C0505b comic = m1114a(input);
            if (comic != null && C0998bi.m2081a(comic.f1570b)) {
                comic.f1570b = C0628f.m1372e();
            }
            return comic;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m1117a(OutputStream outputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        try {
            XmlSerializer xmlSerializerNewSerializer = C1086cd.m2354a().newSerializer();
            xmlSerializerNewSerializer.setOutput(outputStream, "UTF-8");
            xmlSerializerNewSerializer.startDocument("UTF-8", true);
            xmlSerializerNewSerializer.startTag(null, "ComicBook");
            C1086cd.m2356b(xmlSerializerNewSerializer, "File", this.f1568a, null);
            C1086cd.m2356b(xmlSerializerNewSerializer, "Id", this.f1570b, null);
            C1086cd.m2356b(xmlSerializerNewSerializer, "Checked", Boolean.valueOf(this.f1569am), true);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Series", this.f1657x, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Title", this.f1656w, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Number", this.f1658y, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Count", Integer.valueOf(this.f1659z), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Volume", Integer.valueOf(this.f1616A), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "AlternateSeries", this.f1617B, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "AlternateNumber", this.f1618C, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "AlternateCount", Integer.valueOf(this.f1621F), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Summary", this.f1622G, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "StoryArc", this.f1620E, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "SeriesGroup", this.f1619D, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Notes", this.f1623H, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Review", this.f1624I, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Year", Integer.valueOf(this.f1625J), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Month", Integer.valueOf(this.f1626K), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Day", Integer.valueOf(this.f1627L), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Writer", this.f1628M, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Penciller", this.f1629N, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Inker", this.f1630O, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Colorist", this.f1631P, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Letterer", this.f1632Q, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "CoverArtist", this.f1633R, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Editor", this.f1634S, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Publisher", this.f1635T, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Imprint", this.f1636U, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Genre", this.f1637V, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Web", this.f1638W, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "PageCount", Integer.valueOf(this.f1639X), -1);
            C1086cd.m2355a(xmlSerializerNewSerializer, "LanguageISO", this.f1640Y, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Format", this.f1641Z, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "AgeRating", this.f1643aa, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "BlackAndWhite", this.f1644ab, EnumC0541ci.Unknown);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Manga", this.f1645ac, EnumC0540ch.Unknown);
            C1086cd.m2355a(xmlSerializerNewSerializer, "PreferredFrontCover", Integer.valueOf(this.f1646ad), 0);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Characters", this.f1647ae, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Teams", this.f1648af, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "MainCharacterOrTeam", this.f1649ag, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Locations", this.f1650ah, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "CommunityRating", Float.toString(this.f1651ai), Float.valueOf(0.0f));
            C1086cd.m2355a(xmlSerializerNewSerializer, "ScanInformation", this.f1652aj, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Added", this.f1571c, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Opened", this.f1572d, null);
            C1086cd.m2355a(xmlSerializerNewSerializer, "OpenCount", Integer.valueOf(this.f1573e), 0);
            C1086cd.m2355a(xmlSerializerNewSerializer, "CurrentPage", Integer.valueOf(this.f1574f), 0);
            C1086cd.m2355a(xmlSerializerNewSerializer, "LastPageRead", Integer.valueOf(this.f1575g), 0);
            C1086cd.m2355a(xmlSerializerNewSerializer, "Rating", Float.valueOf(this.f1576h), Float.valueOf(0.0f));
            C1086cd.m2355a(xmlSerializerNewSerializer, "ComicInfoIsDirty", Boolean.valueOf(this.f1577i), false);
            xmlSerializerNewSerializer.startTag(null, "ExtraSyncInformation");
            C1086cd.m2355a(xmlSerializerNewSerializer, "ReadingStateChanged", Boolean.valueOf(this.f1578j), false);
            C1086cd.m2355a(xmlSerializerNewSerializer, "InformationChanged", Boolean.valueOf(this.f1581m), false);
            C1086cd.m2355a(xmlSerializerNewSerializer, "DataChanged", Boolean.valueOf(this.f1582n), false);
            C1086cd.m2355a(xmlSerializerNewSerializer, "CheckChanged", Boolean.valueOf(this.f1579k), false);
            C1086cd.m2355a(xmlSerializerNewSerializer, "BookmarksChanged", Boolean.valueOf(this.f1580l), false);
            C1086cd.m2355a(xmlSerializerNewSerializer, "PageTypesChanged", Boolean.valueOf(this.f1583o), false);
            xmlSerializerNewSerializer.endTag(null, "ExtraSyncInformation");
            xmlSerializerNewSerializer.startTag(null, "Pages");
            Iterator it = m1165D().iterator();
            while (it.hasNext()) {
                ((C0537ce) it.next()).m1187a(xmlSerializerNewSerializer);
            }
            xmlSerializerNewSerializer.endTag(null, "Pages");
            xmlSerializerNewSerializer.endTag(null, "ComicBook");
            xmlSerializerNewSerializer.endDocument();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m1134b(File file) {
        BufferedOutputStream output = null;
        try {
            output = new BufferedOutputStream(new FileOutputStream(file));
            return m1117a(output);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m1137c(String str) {
        if (!str.equals(f1564an)) {
            f1564an = str;
            try {
                f1565ao = Pattern.compile(Pattern.quote(str), 2);
            } catch (PatternSyntaxException e) {
                e.printStackTrace();
            }
        }
        return (this.f1657x == null || f1565ao == null || !f1565ao.matcher(m1150p()).find()) ? false : true;
    }

    /* renamed from: p */
    public final String m1150p() {
        StringBuilder sb = new StringBuilder();
        sb.append(m1168a(true, false)).append('\n').append(m1175t()).append('\n').append(m1177v()).append('\n');
        String str = this.f1628M;
        if (str != null) {
            sb.append(str);
        }
        sb.append('\n');
        return sb.toString();
    }

    /* renamed from: s */
    static /* synthetic */ C1083ca m1119s() {
        return f1567aq;
    }

    /* renamed from: a */
    public static C0505b m1114a(InputStream inputStream) throws org.xmlpull.v1.XmlPullParserException {
        C0505b c0505b = new C0505b();
        if (f1566ap.m2352a(c0505b, inputStream, new C0525bt())) {
            return c0505b;
        }
        return null;
    }

    /* renamed from: a */
    private void m1116a(EnumC0534cb enumC0534cb) {
        f1563al.m2363a(this, enumC0534cb);
    }

    /* renamed from: a */
    public final void m1125a(InterfaceC1093j interfaceC1093j) {
        f1563al.m2362a((Object) this, interfaceC1093j);
    }

    /* renamed from: b */
    public final void m1131b(InterfaceC1093j interfaceC1093j) {
        f1563al.m2364b(this, interfaceC1093j);
    }

    /* renamed from: q */
    public final boolean m1151q() {
        return this.f1625J > 0;
    }

    /* renamed from: a */
    public final String m1120a(String str, float f) {
        String string;
        if (C0998bi.m2081a(this.f1657x)) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder(C0998bi.m2078a(this.f1657x, 25));
            if (sb.length() == 0) {
                string = null;
            } else {
                if (!C0998bi.m2081a(this.f1658y)) {
                    if (Character.isDigit(sb.charAt(sb.length() - 1))) {
                        sb.append("_");
                    }
                    sb.append(C0998bi.m2088d(this.f1658y));
                }
                string = sb.toString();
            }
        }
        if (string == null) {
            return null;
        }
        String str2 = str == null ? this.f1624I : str;
        if (f <= 0.0f) {
            f = this.f1576h;
        }
        StringBuilder sb2 = new StringBuilder();
        if (f > 0.0f) {
            sb2.append(m1118b(f));
            sb2.append(" ");
        }
        sb2.append("#");
        sb2.append(string);
        sb2.append(" ");
        sb2.append("#comicrack");
        sb2.append(" ");
        if (!C0998bi.m2081a(str2)) {
            int length = 143 - sb2.length();
            if (str2.length() > length) {
                str2 = String.valueOf(str2.substring(0, length - 3)) + "...";
            }
            sb2.insert(0, " ");
            sb2.insert(0, str2);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static String m1118b(float f) {
        StringBuilder sb = new StringBuilder();
        int i = (int) f;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("*");
        }
        float f2 = f - i;
        if (f2 >= 0.75f) {
            sb.append("¾");
        } else if (f2 >= 0.5f) {
            sb.append("½");
        } else if (f2 >= 0.25f) {
            sb.append("¼");
        }
        return sb.toString();
    }

    /* renamed from: r */
    public final String m1152r() {
        return m1120a((String) null, -1.0f);
    }
}
