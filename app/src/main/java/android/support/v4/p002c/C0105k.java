package android.support.v4.p002c;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.k */
/* loaded from: classes.dex */
final class C0105k implements Collection {

    /* renamed from: a */
    final /* synthetic */ AbstractC0100f f357a;

    C0105k(AbstractC0100f abstractC0100f) {
        this.f357a = abstractC0100f;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f357a.mo268c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f357a.mo266b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f357a.mo260a() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0101g(this.f357a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int iMo266b = this.f357a.mo266b(obj);
        if (iMo266b < 0) {
            return false;
        }
        this.f357a.mo264a(iMo266b);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = 0;
        int iMo260a = this.f357a.mo260a();
        boolean z = false;
        while (i < iMo260a) {
            if (collection.contains(this.f357a.mo262a(i, 1))) {
                this.f357a.mo264a(i);
                i--;
                iMo260a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = 0;
        int iMo260a = this.f357a.mo260a();
        boolean z = false;
        while (i < iMo260a) {
            if (!collection.contains(this.f357a.mo262a(i, 1))) {
                this.f357a.mo264a(i);
                i--;
                iMo260a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f357a.mo260a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f357a.m277b(1);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f357a.m276a(objArr, 1);
    }
}
