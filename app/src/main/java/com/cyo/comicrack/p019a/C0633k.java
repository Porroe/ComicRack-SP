package com.cyo.comicrack.p019a;

import com.cyo.common.C0998bi;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.k */
/* loaded from: classes.dex */
public final class C0633k {

    /* renamed from: f */
    private static final Pattern f1908f = Pattern.compile("\\s(\\d+p|ctcp|ctc)\\b", 2);

    /* renamed from: g */
    private static final Pattern f1909g = Pattern.compile("\\(((19|20)\\d{2}).*\\)");

    /* renamed from: h */
    private static final Pattern f1910h = Pattern.compile("\\b(?:V|Vol\\.?|Volume)\\s*(\\d+)", 2);

    /* renamed from: i */
    private static final Pattern f1911i = Pattern.compile("\\b(?:of|von|de)\\s+(\\d+)", 2);

    /* renamed from: j */
    private static final Pattern f1912j = Pattern.compile("\\(.*?\\)");

    /* renamed from: k */
    private static final Pattern f1913k = Pattern.compile("\\s(#|c|ch|chap|chapter|pt|part|issue)?(\\d+(?:[\\.,]\\d+)?)(?!.*\\d+.*)", 2);

    /* renamed from: l */
    private static final Pattern f1914l = Pattern.compile("\\b0+(?!(\\b|\\.|[a-z]))");

    /* renamed from: a */
    public String f1915a;

    /* renamed from: b */
    public String f1916b;

    /* renamed from: c */
    public int f1917c = -1;

    /* renamed from: d */
    public int f1918d = -1;

    /* renamed from: e */
    public int f1919e = -1;

    /* renamed from: a */
    public static C0633k m1375a(String str) {
        File file = new File(str);
        C0633k c0633k = new C0633k();
        String strReplace = C0998bi.m2093h(file.getName(), ".").replace('_', ' ').replace('[', '(').replace(']', ')');
        Matcher matcher = f1908f.matcher(strReplace);
        if (matcher.find()) {
            strReplace = matcher.replaceAll("");
        }
        Matcher matcher2 = f1909g.matcher(strReplace);
        if (matcher2.find()) {
            c0633k.f1919e = Integer.parseInt(matcher2.group(1));
            strReplace = matcher2.replaceAll("");
        }
        Matcher matcher3 = f1910h.matcher(strReplace);
        if (matcher3.find()) {
            c0633k.f1917c = Integer.parseInt(matcher3.group(1));
            strReplace = matcher3.replaceAll("");
        }
        Matcher matcher4 = f1911i.matcher(strReplace);
        if (matcher4.find()) {
            c0633k.f1918d = Integer.parseInt(matcher4.group(1));
            strReplace = matcher4.replaceAll("");
        }
        String strReplaceAll = f1912j.matcher(strReplace).replaceAll("");
        Matcher matcher5 = f1913k.matcher(strReplaceAll);
        if (matcher5.find()) {
            c0633k.f1916b = f1914l.matcher(matcher5.group(2)).replaceAll("");
            strReplaceAll = matcher5.replaceAll("");
        }
        c0633k.f1915a = C0998bi.m2079a(strReplaceAll, ' ', '-');
        if (C0998bi.m2081a(c0633k.f1915a)) {
            c0633k.f1915a = file.getParentFile().getName();
        }
        return c0633k;
    }
}
