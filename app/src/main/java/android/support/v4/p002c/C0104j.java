package android.support.v4.p002c;

import java.util.Iterator;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.j */
/* loaded from: classes.dex */
final class C0104j implements Iterator, Map.Entry {

    /* renamed from: a */
    int f353a;

    /* renamed from: d */
    final /* synthetic */ AbstractC0100f f356d;

    /* renamed from: c */
    boolean f355c = false;

    /* renamed from: b */
    int f354b = -1;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f354b++;
        this.f355c = true;
        return this;
    }

    C0104j(AbstractC0100f abstractC0100f) {
        this.f356d = abstractC0100f;
        this.f353a = abstractC0100f.mo260a() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f354b < this.f353a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f355c) {
            throw new IllegalStateException();
        }
        this.f356d.mo264a(this.f354b);
        this.f354b--;
        this.f353a--;
        this.f355c = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f355c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f356d.mo262a(this.f354b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f355c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f356d.mo262a(this.f354b, 1);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f355c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f356d.mo263a(this.f354b, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f355c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C0097c.m271a(entry.getKey(), this.f356d.mo262a(this.f354b, 0)) && C0097c.m271a(entry.getValue(), this.f356d.mo262a(this.f354b, 1));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f355c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object objMo262a = this.f356d.mo262a(this.f354b, 0);
        Object objMo262a2 = this.f356d.mo262a(this.f354b, 1);
        return (objMo262a2 != null ? objMo262a2.hashCode() : 0) ^ (objMo262a == null ? 0 : objMo262a.hashCode());
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
