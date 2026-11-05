package com.cyo.common;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.z */
/* loaded from: classes.dex */
public final class C1175z implements Comparator {

    /* renamed from: a */
    public List f3729a = new ArrayList();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Iterator it = this.f3729a.iterator();
        while (it.hasNext()) {
            int iCompare = ((Comparator) it.next()).compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }
}
