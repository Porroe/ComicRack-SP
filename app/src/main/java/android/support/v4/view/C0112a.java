package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.p003a.C0113a;
import android.support.v4.view.p003a.C0122i;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a */
/* loaded from: classes.dex */
public class C0112a {

    /* renamed from: b */
    private static final InterfaceC0195d f459b;

    /* renamed from: c */
    private static final Object f460c;

    /* renamed from: a */
    final Object f461a = f459b.mo454a(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f459b = new C0196e();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f459b = new C0166b();
        } else {
            f459b = new C0198g();
        }
        f460c = f459b.mo453a();
    }

    /* renamed from: a */
    final Object m334a() {
        return this.f461a;
    }

    /* renamed from: a */
    public static void m329a(View view, int i) {
        f459b.mo455a(f460c, view, i);
    }

    /* renamed from: a */
    public static void m330a(View view, AccessibilityEvent accessibilityEvent) {
        f459b.mo461d(f460c, view, accessibilityEvent);
    }

    /* renamed from: b */
    public static boolean m332b(View view, AccessibilityEvent accessibilityEvent) {
        return f459b.mo457a(f460c, view, accessibilityEvent);
    }

    /* renamed from: c */
    public static void m333c(View view, AccessibilityEvent accessibilityEvent) {
        f459b.mo460c(f460c, view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo337d(View view, AccessibilityEvent accessibilityEvent) {
        f459b.mo459b(f460c, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo335a(View view, C0113a c0113a) {
        f459b.mo456a(f460c, view, c0113a);
    }

    /* renamed from: a */
    public static boolean m331a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f459b.mo458a(f460c, viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public static C0122i m328a(View view) {
        return f459b.mo472a(f460c, view);
    }

    /* renamed from: a */
    public boolean mo336a(View view, int i, Bundle bundle) {
        return f459b.mo473a(f460c, view, i, bundle);
    }
}
