package com.cyo.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.bi */
/* loaded from: classes.dex */
public final class C0998bi {

    /* renamed from: a */
    public static final Locale f2929a = new Locale("", "", "");

    /* renamed from: h */
    private static String[] f2936h = {"the ", "der ", "die ", "das "};

    /* renamed from: i */
    private static Pattern f2937i = Pattern.compile("(?<=[^\\d\\.,\\+-])(?=[\\d\\.,\\+-])|(?<=([\\d\\.,\\+-]))(?=[^\\d\\.,\\+-])");

    /* renamed from: b */
    public static int f2930b = 0;

    /* renamed from: c */
    public static int f2931c = 1;

    /* renamed from: d */
    public static int f2932d = 2;

    /* renamed from: e */
    public static int f2933e = 4;

    /* renamed from: f */
    public static int f2934f = 8;

    /* renamed from: g */
    public static int f2935g = ((f2931c | f2932d) | f2933e) | f2934f;

    /* renamed from: j */
    private static final Pattern f2938j = Pattern.compile("(?<!\\A)\\b(for|the|of|to|in|at|by|and|or)\\b", 2);

    /* renamed from: k */
    private static final Pattern f2939k = Pattern.compile("\\b\\w");

    /* renamed from: l */
    private static final Pattern f2940l = Pattern.compile("[^\\s\\w]");

    /* renamed from: m */
    private static final Pattern f2941m = Pattern.compile("\\s");

    /* renamed from: n */
    private static final Pattern f2942n = Pattern.compile("\\s{2,}");

    /* renamed from: a */
    public static boolean m2081a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static boolean m2082a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null) {
            return str2.equals(str);
        }
        return str.equals(str2);
    }

    /* renamed from: b */
    public static int m2083b(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        return str.compareTo(str2);
    }

    /* renamed from: c */
    public static int m2085c(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        return str.compareToIgnoreCase(str2);
    }

    /* renamed from: d */
    public static int m2087d(String str, String str2) {
        return m2085c(m2084b(str), m2084b(str2));
    }

    /* renamed from: b */
    public static String m2084b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f2936h) {
            if (m2090e(str, str2)) {
                return str.substring(str2.length()).trim();
            }
        }
        return str;
    }

    /* renamed from: e */
    public static boolean m2090e(String str, String str2) {
        return str.regionMatches(true, 0, str2, 0, str2.length());
    }

    /* renamed from: f */
    public static boolean m2091f(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(true, str.length() - length, str2, 0, length);
    }

    /* renamed from: j */
    private static int m2095j(String str, String str2) throws NumberFormatException {
        float f;
        float f2 = 0.0f;
        if (str == null) {
            f = 0.0f;
        } else {
            try {
                f = Float.parseFloat(str.replace(',', '.'));
            } catch (NumberFormatException e) {
                return m2083b(str, str2);
            }
        }
        if (str2 != null) {
            try {
                f2 = Float.parseFloat(str2.replace(',', '.'));
            } catch (NumberFormatException e2) {
                return m2083b(str, str2);
            }
        }
        return Float.compare(f, f2);
    }

    /* renamed from: g */
    public static int m2092g(String str, String str2) throws NumberFormatException {
        if (str == null || str2 == null) {
            return m2083b(str, str2);
        }
        String strTrim = str.trim();
        String strTrim2 = str2.trim();
        if (m2089e(strTrim) && m2089e(strTrim2)) {
            return m2095j(strTrim, strTrim2);
        }
        String[] strArrSplit = f2937i.split(strTrim);
        String[] strArrSplit2 = f2937i.split(strTrim2);
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        for (int i = 0; i < Math.min(length, length2); i++) {
            int iM2095j = m2095j(strArrSplit[i], strArrSplit2[i]);
            if (iM2095j != 0) {
                return iM2095j;
            }
        }
        if (length != length2) {
            return length > length2 ? 1 : -1;
        }
        return 0;
    }

    /* renamed from: e */
    private static boolean m2089e(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != '.' && cCharAt != ',' && cCharAt != '+' && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static String m2093h(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(str2);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    /* renamed from: c */
    public static String m2086c(String str) {
        return m2081a(str) ? str : str.replaceAll("\n+", " ");
    }

    /* renamed from: i */
    public static String m2094i(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                stringBuffer.append(Integer.toHexString(b & 255));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static boolean m2080a(char c, char... cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m2079a(String str, char... cArr) {
        if (str != null && str.length() != 0) {
            char[] charArray = str.toCharArray();
            int i = 0;
            int length = charArray.length - 1;
            while (i < charArray.length && m2080a(charArray[i], cArr)) {
                i++;
            }
            while (length >= i && m2080a(charArray[length], cArr)) {
                length--;
            }
            return str.substring(i, length + 1);
        }
        return str;
    }

    /* renamed from: a */
    public static String m2077a(long j) {
        if (j <= 0) {
            return "0";
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        int iLog10 = (int) (Math.log10(j) / Math.log10(1024.0d));
        return String.valueOf(new DecimalFormat("#,##0.#").format(j / Math.pow(1024.0d, iLog10))) + " " + strArr[iLog10];
    }

    /* renamed from: a */
    public static String m2078a(String str, int i) {
        int i2 = f2935g;
        if ((f2934f & i2) != 0) {
            str = f2938j.matcher(str).replaceAll("");
        }
        if ((f2933e & i2) != 0) {
            Matcher matcher = f2939k.matcher(str);
            char[] charArray = str.toCharArray();
            while (matcher.find()) {
                charArray[matcher.start()] = Character.toUpperCase(charArray[matcher.start()]);
            }
            str = new String(charArray);
        }
        if ((f2932d & i2) != 0) {
            str = f2940l.matcher(str).replaceAll("");
        }
        String strTrim = ((i2 & f2931c) != 0 ? f2941m.matcher(str).replaceAll("") : f2942n.matcher(str).replaceAll(" ")).trim();
        return (m2081a(strTrim) || i < 0) ? strTrim : strTrim.substring(0, Math.min(strTrim.length(), i));
    }

    /* renamed from: d */
    public static String m2088d(String str) {
        return m2078a(str, -1);
    }
}
