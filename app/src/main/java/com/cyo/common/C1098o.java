package com.cyo.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.o */
/* loaded from: classes.dex */
final class C1098o implements Iterator {
    C1098o() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException("end of iteration");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no previous element");
    }
}
