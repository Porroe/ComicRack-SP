package com.p004a.p005a.p010d;

import android.content.Context;
import android.graphics.Color;
import com.p004a.p005a.C0357e;
import com.p004a.p005a.p008c.p009a.C0340a;
import java.util.Locale;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.a.a.d.a */
/* loaded from: classes.dex */
public final class C0355a extends C0357e {

    /* renamed from: c */
    private String f989c;

    /* renamed from: d */
    private int f990d;

    /* renamed from: e */
    private int f991e;

    /* renamed from: f */
    private int f992f;

    /* renamed from: g */
    private int f993g;

    /* renamed from: h */
    private int f994h;

    /* renamed from: i */
    private int f995i;

    /* renamed from: j */
    private String f996j;

    /* renamed from: k */
    private int f997k;

    /* renamed from: l */
    private int f998l;

    /* renamed from: m */
    private EnumC0356b f999m;

    /* renamed from: n */
    private int f1000n;

    /* renamed from: o */
    private String f1001o;

    @Override // com.p004a.p005a.C0357e
    /* renamed from: a */
    public final Map mo861a(Context context) {
        C0340a c0340a = (C0340a) m862a(C0340a.class);
        if (c0340a == null) {
            c0340a = new C0340a();
            this.f1012a.put(c0340a.getClass(), c0340a);
        }
        if (this.f989c != null) {
            c0340a.m844c().put("q", this.f989c);
        }
        if (Color.alpha(this.f990d) != 0) {
            c0340a.m844c().put("bgcolor", m860a(this.f990d));
        }
        if (Color.alpha(this.f991e) == 255 && Color.alpha(this.f992f) == 255) {
            c0340a.m844c().put("gradientfrom", m860a(this.f991e));
            c0340a.m844c().put("gradientto", m860a(this.f992f));
        }
        if (Color.alpha(this.f993g) != 0) {
            c0340a.m844c().put("hcolor", m860a(this.f993g));
        }
        if (Color.alpha(this.f994h) != 0) {
            c0340a.m844c().put("dcolor", m860a(this.f994h));
        }
        if (Color.alpha(this.f995i) != 0) {
            c0340a.m844c().put("acolor", m860a(this.f995i));
        }
        if (this.f996j != null) {
            c0340a.m844c().put("font", this.f996j);
        }
        c0340a.m844c().put("headersize", Integer.toString(this.f997k));
        if (Color.alpha(this.f998l) != 0) {
            c0340a.m844c().put("bcolor", m860a(this.f998l));
        }
        if (this.f999m != null) {
            c0340a.m844c().put("btype", this.f999m.toString());
        }
        c0340a.m844c().put("bthick", Integer.toString(this.f1000n));
        if (this.f1001o != null) {
            c0340a.m844c().put("channel", this.f1001o);
        }
        return super.mo861a(context);
    }

    /* renamed from: a */
    private static String m860a(int i) {
        return String.format(Locale.US, "#%06x", Integer.valueOf(16777215 & i));
    }
}
