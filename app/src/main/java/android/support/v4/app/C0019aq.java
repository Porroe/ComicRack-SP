package android.support.v4.app;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.aq */
/* loaded from: classes.dex */
public final class C0019aq {

    /* renamed from: a */
    private static final InterfaceC0026ax f162a;

    /* renamed from: a */
    static /* synthetic */ InterfaceC0026ax m131a() {
        return f162a;
    }

    /* renamed from: a */
    static /* synthetic */ void m132a(InterfaceC0017ao interfaceC0017ao, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC0017ao.mo129a((C0020ar) it.next());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m133a(InterfaceC0018ap interfaceC0018ap, AbstractC0036bg abstractC0036bg) {
        if (abstractC0036bg != null) {
            if (abstractC0036bg instanceof C0023au) {
                C0023au c0023au = (C0023au) abstractC0036bg;
                C0044bo.m155a(interfaceC0018ap, c0023au.f205d, c0023au.f207f, c0023au.f206e, c0023au.f172a);
            } else if (abstractC0036bg instanceof C0025aw) {
                C0025aw c0025aw = (C0025aw) abstractC0036bg;
                C0044bo.m156a(interfaceC0018ap, c0025aw.f205d, c0025aw.f207f, c0025aw.f206e, c0025aw.f202a);
            } else if (abstractC0036bg instanceof C0022at) {
                C0022at c0022at = (C0022at) abstractC0036bg;
                C0044bo.m154a(interfaceC0018ap, c0022at.f205d, c0022at.f207f, c0022at.f206e, c0022at.f169a, c0022at.f170b, c0022at.f171c);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f162a = new C0028az();
        } else if (Build.VERSION.SDK_INT >= 20) {
            f162a = new C0027ay();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f162a = new C0035bf();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f162a = new C0034be();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f162a = new C0033bd();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f162a = new C0032bc();
        } else if (Build.VERSION.SDK_INT >= 9) {
            f162a = new C0031bb();
        } else {
            f162a = new C0030ba();
        }
    }
}
