package com.cyo.comicrack.p019a.p020a;

import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0633k;
import com.cyo.common.C0995bf;
import com.cyo.common.C0998bi;
import com.cyo.common.C1100q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.cc */
/* loaded from: classes.dex */
public class C0535cc {

    /* renamed from: B */
    public String f1617B;

    /* renamed from: C */
    public String f1618C;

    /* renamed from: D */
    public String f1619D;

    /* renamed from: E */
    public String f1620E;

    /* renamed from: G */
    public String f1622G;

    /* renamed from: H */
    public String f1623H;

    /* renamed from: I */
    public String f1624I;

    /* renamed from: M */
    public String f1628M;

    /* renamed from: N */
    public String f1629N;

    /* renamed from: O */
    public String f1630O;

    /* renamed from: P */
    public String f1631P;

    /* renamed from: Q */
    public String f1632Q;

    /* renamed from: R */
    public String f1633R;

    /* renamed from: S */
    public String f1634S;

    /* renamed from: T */
    public String f1635T;

    /* renamed from: U */
    public String f1636U;

    /* renamed from: V */
    public String f1637V;

    /* renamed from: W */
    public String f1638W;

    /* renamed from: X */
    public int f1639X;

    /* renamed from: Y */
    public String f1640Y;

    /* renamed from: Z */
    public String f1641Z;

    /* renamed from: aa */
    public String f1643aa;

    /* renamed from: ad */
    public int f1646ad;

    /* renamed from: ae */
    public String f1647ae;

    /* renamed from: af */
    public String f1648af;

    /* renamed from: ag */
    public String f1649ag;

    /* renamed from: ah */
    public String f1650ah;

    /* renamed from: aj */
    public String f1652aj;

    /* renamed from: b */
    private byte[] f1654b;

    /* renamed from: v */
    public String f1655v;

    /* renamed from: w */
    public String f1656w;

    /* renamed from: x */
    public String f1657x;

    /* renamed from: y */
    public String f1658y;

    /* renamed from: u */
    public static int f1615u = 32768;

    /* renamed from: c */
    private static Pattern f1614c = Pattern.compile("(.*)\\s+V(\\d+)$");

    /* renamed from: z */
    public int f1659z = -1;

    /* renamed from: A */
    public int f1616A = -1;

    /* renamed from: F */
    public int f1621F = -1;

    /* renamed from: J */
    public int f1625J = -1;

    /* renamed from: K */
    public int f1626K = -1;

    /* renamed from: L */
    public int f1627L = -1;

    /* renamed from: ab */
    public EnumC0541ci f1644ab = EnumC0541ci.Unknown;

    /* renamed from: ac */
    public EnumC0540ch f1645ac = EnumC0540ch.Unknown;

    /* renamed from: ai */
    public float f1651ai = 0.0f;

    /* renamed from: ak */
    protected List f1653ak = new ArrayList();

    /* renamed from: a */
    private int f1642a = -1;

    /* renamed from: a */
    public final String m1168a(boolean z, boolean z2) {
        return m1160a(z2 ? m1178w() : this.f1657x, z ? this.f1656w : null, this.f1658y, this.f1659z, this.f1626K, this.f1625J);
    }

    /* renamed from: c */
    public final String m1171c(boolean z) {
        return m1168a(z, false);
    }

    /* renamed from: t */
    public final String m1175t() {
        return m1160a(this.f1617B, null, this.f1618C, this.f1621F, -1, -1);
    }

    /* renamed from: u */
    public final String m1176u() {
        return m1160a(null, null, this.f1658y, this.f1659z, this.f1626K, this.f1625J);
    }

    /* renamed from: a */
    public final Iterable m1167a(C0995bf c0995bf) {
        if (c0995bf == null) {
            c0995bf = new C0995bf(",");
        }
        String[] strArr = {this.f1628M, this.f1629N, this.f1630O, this.f1631P, this.f1633R, this.f1632Q};
        Iterable[] iterableArr = new Iterable[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iterableArr[i] = c0995bf.m2075a(strArr[i]);
        }
        return new C1100q(iterableArr);
    }

    /* renamed from: v */
    public final String m1177v() {
        Iterable iterableM1167a = m1167a((C0995bf) null);
        if (iterableM1167a == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        HashSet hashSet = new HashSet();
        Iterator it = iterableM1167a.iterator();
        while (it.hasNext()) {
            String strTrim = ((String) it.next()).trim();
            if (!C0998bi.m2081a(strTrim) && !hashSet.contains(strTrim)) {
                hashSet.add(strTrim);
                if (stringBuffer.length() > 0 && !C0998bi.m2081a(", ")) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(strTrim);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: w */
    public final String m1178w() {
        return m1159a(this.f1657x, this.f1616A);
    }

    /* renamed from: x */
    public final String m1179x() {
        if (this.f1616A > 0) {
            return "V" + this.f1616A;
        }
        return null;
    }

    /* renamed from: a */
    public final void m1169a(C0633k c0633k) {
        this.f1657x = c0633k.f1915a;
        this.f1658y = c0633k.f1916b;
        this.f1659z = c0633k.f1918d;
        this.f1625J = c0633k.f1919e;
        this.f1616A = c0633k.f1917c;
    }

    /* renamed from: y */
    public final int m1180y() {
        int i = 0;
        if (this.f1642a == -1) {
            this.f1642a = 0;
            int size = m1165D().size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (m1174e(i).mo1193f() != EnumC0539cg.FrontCover) {
                    i++;
                } else {
                    this.f1642a = i;
                    break;
                }
            }
        }
        return this.f1642a;
    }

    /* renamed from: z */
    public final int m1181z() {
        Iterator it = m1165D().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C0537ce) it.next()).mo1193f() == EnumC0539cg.FrontCover) {
                i++;
            }
        }
        return Math.max(i, 1);
    }

    /* renamed from: d */
    public final int m1172d(int i) {
        int i2;
        int size = m1165D().size();
        int i3 = 0;
        int i4 = i;
        while (i3 < size) {
            if (m1174e(i3).mo1193f() == EnumC0539cg.FrontCover) {
                i2 = i4 - 1;
                if (i4 <= 0) {
                    return i3;
                }
            } else {
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        return 0;
    }

    /* renamed from: A */
    public final void m1162A() {
        this.f1642a = -1;
    }

    /* renamed from: B */
    public final List m1163B() {
        ArrayList arrayList = new ArrayList();
        int size = m1165D().size();
        for (int i = 0; i < size; i++) {
            C0537ce c0537ceM1174e = m1174e(i);
            if (c0537ceM1174e.m1192e()) {
                arrayList.add(new C0478a(i, c0537ceM1174e.f1667e));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m1158a(int i, int i2, int i3) {
        if (i3 <= 0) {
            return null;
        }
        String str = "";
        if (i2 > 0) {
            if (i > 0) {
                str = String.valueOf(String.valueOf("") + i) + "/";
            }
            str = String.valueOf(String.valueOf(str) + i2) + "/";
        }
        return String.valueOf(str) + i3;
    }

    /* renamed from: a */
    public static String m1160a(String str, String str2, String str3, int i, int i2, int i3) {
        String str4 = C0628f.f1896r;
        StringBuffer stringBuffer = new StringBuffer();
        if (!C0998bi.m2081a(str)) {
            stringBuffer.append(str);
        }
        if (!C0998bi.m2081a(str2)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" - ");
            }
            stringBuffer.append(str2);
        }
        if (!C0998bi.m2081a(str3)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" ");
            }
            if (str4 != null) {
                stringBuffer.append(str4);
            }
            stringBuffer.append(str3);
            if (i != -1) {
                stringBuffer.append(String.format(" (%s %d)", C0628f.f1895q, Integer.valueOf(i)));
            }
        }
        if (i2 != -1 || i3 != -1) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append("(");
            if (i2 != -1) {
                stringBuffer.append(String.format("%d", Integer.valueOf(i2)));
            }
            if (i3 != -1) {
                if (i2 != -1) {
                    stringBuffer.append("/");
                }
                stringBuffer.append(String.format("%d", Integer.valueOf(i3)));
            }
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1159a(String str, int i) {
        if (i >= 0) {
            if (C0998bi.m2081a(str)) {
                return "V" + i;
            }
            return String.valueOf(str) + " V" + i;
        }
        return str;
    }

    /* renamed from: a */
    public final void m1170a(byte[] bArr) {
        this.f1653ak = null;
        this.f1654b = bArr;
    }

    /* renamed from: C */
    public final byte[] m1164C() {
        if (this.f1654b != null) {
            return this.f1654b;
        }
        List listM1165D = m1165D();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(listM1165D.size() * 256);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(listM1165D.size());
            Iterator it = listM1165D.iterator();
            while (it.hasNext()) {
                ((C0537ce) it.next()).m1186a(dataOutputStream);
            }
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    /* renamed from: D */
    public final List m1165D() {
        if (this.f1653ak == null) {
            if (this.f1654b != null) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f1654b));
                    int i = dataInputStream.readInt();
                    this.f1653ak = new ArrayList(i);
                    while (true) {
                        int i2 = i - 1;
                        if (i <= 0) {
                            break;
                        }
                        C0537ce c0537ce = new C0537ce();
                        c0537ce.m1185a(dataInputStream);
                        this.f1653ak.add(c0537ce);
                        i = i2;
                    }
                    dataInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f1654b = null;
            }
            if (this.f1653ak == null) {
                this.f1653ak = new ArrayList();
            }
        }
        return this.f1653ak;
    }

    /* renamed from: e */
    public final C0537ce m1174e(int i) {
        return (C0537ce) m1165D().get(i);
    }

    /* renamed from: E */
    public final boolean m1166E() {
        if (this.f1654b != null && this.f1639X != 0) {
            return true;
        }
        if (this.f1639X == 0 || m1165D() == null || m1165D().size() == 0) {
            return false;
        }
        if (this.f1639X != m1165D().size()) {
            return false;
        }
        Iterator it = m1165D().iterator();
        while (it.hasNext()) {
            if (!((C0537ce) it.next()).m1188a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final String m1173d(boolean z) {
        return (!z || this.f1616A < 0) ? this.f1657x : String.valueOf(this.f1657x) + String.format(Locale.US, "/V%06d", Integer.valueOf(this.f1616A));
    }

    /* renamed from: d */
    public static C0535cc m1161d(String str) {
        C0535cc c0535cc = new C0535cc();
        Matcher matcher = f1614c.matcher(str);
        if (matcher.find()) {
            c0535cc.f1657x = matcher.group(1);
            try {
                c0535cc.f1616A = Integer.parseInt(matcher.group(2));
            } catch (Exception e) {
            }
        } else {
            c0535cc.f1657x = str;
        }
        return c0535cc;
    }

    /* renamed from: a */
    public static int m1157a(String str, String str2) {
        if (str != null) {
            str = str.replace("1/2", "0.5");
        }
        if (str2 != null) {
            str2 = str2.replace("1/2", "0.5");
        }
        return C0998bi.m2092g(str, str2);
    }
}
