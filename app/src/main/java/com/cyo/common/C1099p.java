package com.cyo.common;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.p */
/* loaded from: classes.dex */
final class C1099p implements Iterator {

    /* renamed from: a */
    Iterator f3474a;

    /* renamed from: b */
    Iterator f3475b;

    C1099p(Iterator[] itArr) {
        this.f3474a = Arrays.asList(itArr).iterator();
        this.f3475b = (Iterator) this.f3474a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            if (this.f3475b != null && this.f3475b.hasNext()) {
                return true;
            }
            if (this.f3474a.hasNext()) {
                this.f3475b = (Iterator) this.f3474a.next();
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return this.f3475b.next();
        }
        throw new NoSuchElementException("end of iteration");
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3475b.remove();
    }
}
