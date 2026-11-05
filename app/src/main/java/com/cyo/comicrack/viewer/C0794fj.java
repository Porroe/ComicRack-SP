package com.cyo.comicrack.viewer;

import com.cyo.common.view.C1165t;
import twitter4j.HttpResponseCode;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.fj */
/* loaded from: classes.dex */
public final class C0794fj {

    /* renamed from: a */
    public EnumC0796fl f2470a;

    /* renamed from: b */
    public EnumC0793fi f2471b;

    /* renamed from: c */
    public boolean f2472c;

    /* renamed from: d */
    public boolean f2473d;

    /* renamed from: e */
    public boolean f2474e;

    /* renamed from: f */
    public int f2475f;

    /* renamed from: g */
    public int f2476g;

    /* renamed from: h */
    public C1165t f2477h;

    /* renamed from: i */
    public int f2478i;

    /* renamed from: j */
    public boolean f2479j;

    public C0794fj() {
        this.f2478i = HttpResponseCode.MULTIPLE_CHOICES;
    }

    public C0794fj(EnumC0793fi enumC0793fi, EnumC0796fl enumC0796fl) {
        this(enumC0793fi, enumC0796fl, false, false);
    }

    public C0794fj(EnumC0793fi enumC0793fi, EnumC0796fl enumC0796fl, boolean z, boolean z2) {
        this.f2478i = HttpResponseCode.MULTIPLE_CHOICES;
        this.f2471b = enumC0793fi;
        this.f2470a = enumC0796fl;
        this.f2472c = z;
        this.f2473d = z2;
    }
}
