package com.cyo.comicrack.viewer;

import android.graphics.Bitmap;
import android.view.View;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dz */
/* loaded from: classes.dex */
public final class C0756dz {

    /* renamed from: a */
    final int f2391a;

    /* renamed from: b */
    final List f2392b;

    /* renamed from: c */
    final C0575ak f2393c;

    /* renamed from: d */
    View f2394d;

    /* renamed from: e */
    Bitmap f2395e;

    private C0756dz(int i, List list, C0575ak c0575ak) {
        this.f2391a = i;
        this.f2392b = list;
        this.f2393c = c0575ak;
    }

    public C0756dz(int i, List list) {
        this(i, list, null);
    }

    public C0756dz(int i, InterfaceC0571ag... interfaceC0571agArr) {
        this(i, Arrays.asList(interfaceC0571agArr));
    }

    public C0756dz(int i) {
        this(i, new ArrayList());
    }

    public C0756dz(C0756dz c0756dz, C0575ak c0575ak) {
        this(c0756dz.f2391a, c0756dz.f2392b, c0575ak);
        this.f2394d = c0756dz.f2394d;
        this.f2395e = c0756dz.f2395e;
    }

    /* renamed from: a */
    public final InterfaceC0571ag m1814a() {
        if (this.f2392b.size() > 0) {
            return (InterfaceC0571ag) this.f2392b.get(0);
        }
        return null;
    }

    /* renamed from: b */
    public final C0572ah m1815b() {
        if (m1814a() instanceof C0572ah) {
            return (C0572ah) m1814a();
        }
        return null;
    }

    /* renamed from: c */
    public final C0505b m1816c() {
        if (m1815b() != null) {
            return m1815b().m1221j();
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m1817d() {
        if (this.f2392b == null) {
            return false;
        }
        Iterator it = this.f2392b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0571ag) it.next()) instanceof C0572ah) {
                return true;
            }
        }
        return false;
    }
}
