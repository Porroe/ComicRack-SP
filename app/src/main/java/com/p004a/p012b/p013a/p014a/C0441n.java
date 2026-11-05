package com.p004a.p012b.p013a.p014a;

/* renamed from: com.a.b.a.a.n */
/* loaded from: classes.dex */
final class C0441n {
    /* renamed from: a */
    public static String m992a(C0435h c0435h) {
        StringBuilder sb = new StringBuilder();
        C0432e c0432e = c0435h.f1389r;
        if (c0432e == null || !c0432e.m970b()) {
            return "";
        }
        C0431d[] c0431dArrM969a = c0432e.m969a();
        m997a(c0431dArrM969a, sb, 8);
        m997a(c0431dArrM969a, sb, 9);
        m997a(c0431dArrM969a, sb, 11);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m993a(C0435h c0435h, C0453z c0453z) {
        StringBuilder sb = new StringBuilder();
        sb.append("__utma=");
        sb.append("1.");
        sb.append(c0435h.f1380i).append(".");
        sb.append(c0435h.f1376e).append(".");
        sb.append(c0435h.f1377f).append(".");
        sb.append(c0435h.f1378g).append(".");
        sb.append(c0435h.f1379h).append(";");
        if (c0453z != null) {
            sb.append("+__utmz=");
            sb.append("1.");
            sb.append(c0453z.f1477b).append(".");
            sb.append(Integer.valueOf(c0453z.f1478c).toString()).append(".");
            sb.append(Integer.valueOf(c0453z.f1479d).toString()).append(".");
            sb.append(c0453z.f1476a).append(";");
        }
        return C0430c.m965a(sb.toString(), "UTF-8");
    }

    /* renamed from: a */
    private static String m994a(String str) {
        return str.replace("'", "'0").replace(")", "'1").replace("*", "'2").replace("!", "'3");
    }

    /* renamed from: a */
    static void m995a(StringBuilder sb, String str, double d) {
        sb.append(str).append("=");
        double dFloor = Math.floor((d * 1000000.0d) + 0.5d) / 1000000.0d;
        if (dFloor != 0.0d) {
            sb.append(Double.toString(dFloor));
        }
    }

    /* renamed from: a */
    static void m996a(StringBuilder sb, String str, String str2) {
        sb.append(str).append("=");
        if (str2 == null || str2.trim().length() <= 0) {
            return;
        }
        sb.append(C0430c.m965a(str2, "UTF-8"));
    }

    /* renamed from: a */
    private static void m997a(C0431d[] c0431dArr, StringBuilder sb, int i) {
        sb.append(i).append("(");
        boolean z = true;
        for (int i2 = 0; i2 < c0431dArr.length; i2++) {
            if (c0431dArr[i2] != null) {
                C0431d c0431d = c0431dArr[i2];
                if (z) {
                    z = false;
                } else {
                    sb.append("*");
                }
                sb.append(c0431d.f1370d).append("!");
                switch (i) {
                    case 8:
                        sb.append(m994a(C0430c.m965a(c0431d.f1368b, "UTF-8")));
                        break;
                    case 9:
                        sb.append(m994a(C0430c.m965a(c0431d.f1369c, "UTF-8")));
                        break;
                    case 11:
                        sb.append(c0431d.f1367a);
                        break;
                }
            }
        }
        sb.append(")");
    }
}
