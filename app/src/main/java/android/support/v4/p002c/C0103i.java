package android.support.v4.p002c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.i */
/* loaded from: classes.dex */
final class C0103i implements Set {

    /* renamed from: a */
    final /* synthetic */ AbstractC0100f f352a;

    C0103i(AbstractC0100f abstractC0100f) {
        this.f352a = abstractC0100f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f352a.mo268c();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f352a.mo261a(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Map mapMo267b = this.f352a.mo267b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!mapMo267b.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f352a.mo260a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0101g(this.f352a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int iMo261a = this.f352a.mo261a(obj);
        if (iMo261a < 0) {
            return false;
        }
        this.f352a.mo264a(iMo261a);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Map mapMo267b = this.f352a.mo267b();
        int size = mapMo267b.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mapMo267b.remove(it.next());
        }
        return size != mapMo267b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC0100f.m274a(this.f352a.mo267b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f352a.mo260a();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f352a.m277b(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f352a.m276a(objArr, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC0100f.m275a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iHashCode = 0;
        for (int iMo260a = this.f352a.mo260a() - 1; iMo260a >= 0; iMo260a--) {
            Object objMo262a = this.f352a.mo262a(iMo260a, 0);
            iHashCode += objMo262a == null ? 0 : objMo262a.hashCode();
        }
        return iHashCode;
    }
}
