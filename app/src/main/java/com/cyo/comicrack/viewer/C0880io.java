package com.cyo.comicrack.viewer;

import android.os.Parcelable;
import android.support.v4.app.AbstractC0089y;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.cyo.comicrack.p019a.C0575ak;
import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.io */
/* loaded from: classes.dex */
final class C0880io extends AbstractC0089y {

    /* renamed from: a */
    final /* synthetic */ C0874ii f2668a;

    /* renamed from: b */
    private C0575ak f2669b;

    /* renamed from: c */
    private SparseArray f2670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0880io(C0874ii c0874ii, C0575ak c0575ak) {
        super(c0874ii.f2386a.m187d());
        this.f2668a = c0874ii;
        this.f2670c = new SparseArray();
        this.f2669b = c0575ak;
    }

    @Override // android.support.v4.app.AbstractC0089y
    /* renamed from: a */
    public final Fragment mo248a(int i) {
        AbstractC0782ey abstractC0782ey;
        WeakReference weakReference = (WeakReference) this.f2670c.get(i);
        if (weakReference == null || (abstractC0782ey = (AbstractC0782ey) weakReference.get()) == null) {
            this.f2670c.remove(i);
            try {
                AbstractC0782ey abstractC0782ey2 = (AbstractC0782ey) this.f2668a.f2654h.newInstance();
                Log.d("Menu", "Fragment created");
                m1868a(abstractC0782ey2, i);
                return abstractC0782ey2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return abstractC0782ey;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: c */
    public final int mo408c() {
        return this.f2669b.m1987y();
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public final CharSequence mo405b(int i) {
        return ((C0575ak) this.f2669b.m1983d(i)).mo1211f();
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final Object mo403a(View view, int i) {
        AbstractC0782ey abstractC0782ey = (AbstractC0782ey) super.mo403a(view, i);
        m1868a(abstractC0782ey, i);
        return abstractC0782ey;
    }

    @Override // android.support.v4.app.AbstractC0089y, android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public final Parcelable mo254b() {
        return null;
    }

    @Override // android.support.v4.app.AbstractC0089y, android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final void mo251a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // android.support.v4.app.AbstractC0089y, android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final void mo252a(ViewGroup viewGroup, int i, Object obj) {
        super.mo252a(viewGroup, i, obj);
        this.f2670c.remove(i);
    }

    @Override // android.support.v4.app.AbstractC0089y, android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public final void mo255b(ViewGroup viewGroup, int i, Object obj) {
        super.mo255b(viewGroup, i, obj);
        if (obj != null) {
            ((AbstractC0782ey) obj).m1832Y();
        }
    }

    /* renamed from: a */
    private void m1868a(AbstractC0782ey abstractC0782ey, int i) {
        C0575ak c0575ak = i < this.f2669b.m1987y() ? (C0575ak) this.f2669b.m1983d(i) : null;
        if (this.f2668a.f2388c) {
            abstractC0782ey.mo1717T();
        }
        abstractC0782ey.f2450f = this.f2668a.f2389d;
        abstractC0782ey.m1839d(c0575ak);
        this.f2670c.put(i, new WeakReference(abstractC0782ey));
    }
}
