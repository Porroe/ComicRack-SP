package com.cyo.comicrack.viewer;

import android.support.v4.app.ActivityC0076l;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.InterfaceC0571ag;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dy */
/* loaded from: classes.dex */
public abstract class AbstractC0755dy implements InterfaceC0753dw {

    /* renamed from: a */
    protected final ActivityC0076l f2386a;

    /* renamed from: b */
    boolean f2387b = true;

    /* renamed from: c */
    boolean f2388c;

    /* renamed from: d */
    boolean f2389d;

    /* renamed from: e */
    C0575ak f2390e;

    /* renamed from: a */
    protected abstract void mo1812a(int i, boolean z);

    /* renamed from: i */
    protected abstract void mo1813i();

    public AbstractC0755dy(ActivityC0076l activityC0076l) {
        this.f2386a = activityC0076l;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: b */
    public final void mo1804b(boolean z) {
        this.f2387b = z;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: a */
    public final void mo1802a(boolean z) {
        this.f2389d = z;
        if (mo1803b() != null) {
            mo1803b().f2450f = this.f2389d;
        }
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: h */
    public final void mo1810h() {
        this.f2388c = true;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: f */
    public final String mo1808f() {
        if (mo1807e() == null) {
            return null;
        }
        return mo1807e().f1750p;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: e */
    public final C0575ak mo1807e() {
        if (mo1803b() == null) {
            return null;
        }
        return mo1803b().m1831X();
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: a */
    public final C0575ak mo1798a(int i) {
        return (C0575ak) this.f2390e.m1983d(i);
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: d */
    public final C0575ak mo1806d() {
        return this.f2390e;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: a */
    public final void mo1800a(C0635m c0635m, String str, boolean z) {
        if (str == null && this.f2390e != null) {
            str = this.f2390e.f1750p;
        }
        if (str != null) {
            if (z || this.f2390e == null || !this.f2390e.f1750p.equals(str)) {
                this.f2390e = (C0575ak) c0635m.m1242b(str, true);
                String strMo1808f = mo1808f();
                if (strMo1808f == null && this.f2390e.m1987y() > 0) {
                    strMo1808f = ((InterfaceC0571ag) this.f2390e.m1983d(0)).mo1208c();
                }
                mo1813i();
                mo1801a(strMo1808f, false);
            }
        }
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0753dw
    /* renamed from: a */
    public final void mo1801a(String str, boolean z) {
        int iM1241b;
        if (str != null && this.f2390e != null && (iM1241b = this.f2390e.m1241b(str)) >= 0) {
            mo1812a(iM1241b, z);
        }
    }
}
