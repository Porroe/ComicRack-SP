package android.support.v4.widget;

import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.h */
/* loaded from: classes.dex */
final class C0225h extends AbstractC0242y {

    // The APK has no constructor for this class.
    private C0225h() {
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f609a;

    /* renamed from: b */
    private final int f610b;

    /* renamed from: c */
    private C0240w f611c;

    /* renamed from: d */
    private final Runnable f612d;

    /* renamed from: a */
    public final void m527a() {
        this.f609a.removeCallbacks(this.f612d);
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: a */
    public final boolean mo532a(View view) {
        DrawerLayout drawerLayout = this.f609a;
        return DrawerLayout.m505c(view) && this.f609a.m514a(view, this.f610b) && this.f609a.m510a(view) == 0;
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: a */
    public final void mo528a(int i) {
        DrawerLayout drawerLayout = this.f609a;
        int i2 = this.f610b;
        drawerLayout.m512a(i, this.f611c.m584c());
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: a */
    public final void mo531a(View view, int i) {
        float width;
        int width2 = view.getWidth();
        if (this.f609a.m514a(view, 3)) {
            width = (width2 + i) / width2;
        } else {
            width = (this.f609a.getWidth() - i) / width2;
        }
        this.f609a.m513a(view, width);
        view.setVisibility(width == 0.0f ? 4 : 0);
        this.f609a.invalidate();
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: b */
    public final void mo535b(View view) {
        ((C0223f) view.getLayoutParams()).f607c = false;
        View viewM511a = this.f609a.m511a(this.f610b == 3 ? 5 : 3);
        if (viewM511a != null) {
            this.f609a.m515d(viewM511a);
        }
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: a */
    public final void mo530a(View view, float f) {
        int width;
        DrawerLayout drawerLayout = this.f609a;
        float fM502b = DrawerLayout.m502b(view);
        int width2 = view.getWidth();
        if (this.f609a.m514a(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && fM502b > 0.5f)) ? 0 : -width2;
        } else {
            width = this.f609a.getWidth();
            if (f < 0.0f || (f == 0.0f && fM502b > 0.5f)) {
                width -= width2;
            }
        }
        this.f611c.m578a(width, view.getTop());
        this.f609a.invalidate();
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: b */
    public final void mo534b() {
        this.f609a.postDelayed(this.f612d, 160L);
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: a */
    public final void mo529a(int i, int i2) {
        View viewM511a;
        if ((i & 1) == 1) {
            viewM511a = this.f609a.m511a(3);
        } else {
            viewM511a = this.f609a.m511a(5);
        }
        if (viewM511a != null && this.f609a.m510a(viewM511a) == 0) {
            this.f611c.m577a(viewM511a, i2);
        }
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: c */
    public final int mo536c(View view) {
        DrawerLayout drawerLayout = this.f609a;
        if (DrawerLayout.m505c(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: b */
    public final int mo533b(View view, int i) {
        if (this.f609a.m514a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f609a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // android.support.v4.widget.AbstractC0242y
    /* renamed from: d */
    public final int mo537d(View view) {
        return view.getTop();
    }
}
