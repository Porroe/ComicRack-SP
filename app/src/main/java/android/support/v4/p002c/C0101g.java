package android.support.v4.p002c;

import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.g */
/* loaded from: classes.dex */
final class C0101g implements Iterator {

    /* renamed from: a */
    final int f346a;

    /* renamed from: b */
    int f347b;

    /* renamed from: c */
    int f348c;

    /* renamed from: d */
    boolean f349d = false;

    /* renamed from: e */
    final /* synthetic */ AbstractC0100f f350e;

    C0101g(AbstractC0100f abstractC0100f, int i) {
        this.f350e = abstractC0100f;
        this.f346a = i;
        this.f347b = abstractC0100f.mo260a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f348c < this.f347b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objMo262a = this.f350e.mo262a(this.f348c, this.f346a);
        this.f348c++;
        this.f349d = true;
        return objMo262a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f349d) {
            throw new IllegalStateException();
        }
        this.f348c--;
        this.f347b--;
        this.f349d = false;
        this.f350e.mo264a(this.f348c);
    }
}
