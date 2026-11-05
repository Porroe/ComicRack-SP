package com.cyo.comicrack.viewer;

import android.support.v4.app.AbstractC0004ab;
import android.support.v4.app.AbstractC0081q;
import android.support.v4.app.ActivityC0076l;
import android.support.v4.view.ViewPager;
import com.cyo.comicrack.p019a.C0575ak;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ia */
/* loaded from: classes.dex */
public final class C0866ia extends AbstractC0755dy {

    /* renamed from: f */
    private AbstractC0782ey f2641f;

    public C0866ia(ActivityC0076l activityC0076l, Class cls, int i) throws ReflectiveOperationException {
        super(activityC0076l);
        AbstractC0081q abstractC0081qM187d = activityC0076l.m187d();
        this.f2641f = (AbstractC0782ey) cls.newInstance();
        AbstractC0004ab abstractC0004abMo191a = abstractC0081qM187d.mo191a();
        abstractC0004abMo191a.mo101b(i, this.f2641f);
        abstractC0004abMo191a.mo89a();
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: a */
    public final void mo1799a() {
        this.f2641f.m1835aa();
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: b */
    public final AbstractC0782ey mo1803b() {
        return this.f2641f;
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0755dy
    /* renamed from: a */
    protected final void mo1812a(int i, boolean z) {
        this.f2641f.m1839d((C0575ak) this.f2390e.m1983d(i));
    }

    @Override // com.cyo.comicrack.viewer.AbstractC0755dy
    /* renamed from: i */
    protected final void mo1813i() {
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: c */
    public final ViewPager mo1805c() {
        return null;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: g */
    public final void mo1809g() {
    }
}
