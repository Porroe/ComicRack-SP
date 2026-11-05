package android.support.v4.p002c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.h */
/* loaded from: classes.dex */
final class C0102h implements Set {

    /* renamed from: a */
    final /* synthetic */ AbstractC0100f f351a;

    C0102h(AbstractC0100f abstractC0100f) {
        this.f351a = abstractC0100f;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int iMo260a = this.f351a.mo260a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.f351a.mo265a(entry.getKey(), entry.getValue());
        }
        return iMo260a != this.f351a.mo260a();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f351a.mo268c();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iMo261a = this.f351a.mo261a(entry.getKey());
        if (iMo261a >= 0) {
            return C0097c.m271a(this.f351a.mo262a(iMo261a, 1), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f351a.mo260a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0104j(this.f351a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f351a.mo260a();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC0100f.m275a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iMo260a = this.f351a.mo260a() - 1;
        int iHashCode = 0;
        while (iMo260a >= 0) {
            Object objMo262a = this.f351a.mo262a(iMo260a, 0);
            Object objMo262a2 = this.f351a.mo262a(iMo260a, 1);
            iMo260a--;
            iHashCode += (objMo262a2 == null ? 0 : objMo262a2.hashCode()) ^ (objMo262a == null ? 0 : objMo262a.hashCode());
        }
        return iHashCode;
    }
}
