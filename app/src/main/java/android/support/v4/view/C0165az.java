package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.az */
/* loaded from: classes.dex */
class C0165az implements InterfaceC0174bh {

    /* renamed from: a */
    WeakHashMap f501a = null;

    C0165az() {
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public boolean mo445a(View view, int i) {
        return false;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public int mo438a(View view) {
        return 2;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public void mo443a(View view, C0112a c0112a) {
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: b */
    public void mo446b(View view) {
        view.invalidate();
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public void mo440a(View view, int i, int i2, int i3, int i4) {
        view.invalidate(i, i2, i3, i4);
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public void mo444a(View view, Runnable runnable) {
        view.postDelayed(runnable, mo439a());
    }

    /* renamed from: a */
    long mo439a() {
        return 10L;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: c */
    public int mo448c(View view) {
        return 0;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: b */
    public void mo447b(View view, int i) {
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public void mo441a(View view, int i, Paint paint) {
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: d */
    public int mo449d(View view) {
        return 0;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: a */
    public void mo442a(View view, Paint paint) {
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: e */
    public int mo450e(View view) {
        return 0;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: f */
    public boolean mo451f(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    @Override // android.support.v4.view.InterfaceC0174bh
    /* renamed from: g */
    public boolean mo452g(View view) {
        return false;
    }
}
