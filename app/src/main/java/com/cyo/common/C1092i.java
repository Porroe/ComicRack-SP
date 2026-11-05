package com.cyo.common;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.i */
/* loaded from: classes.dex */
public final class C1092i {

    /* renamed from: a */
    private WeakHashMap f3472a = new WeakHashMap();

    /* renamed from: a */
    public final synchronized void m2362a(Object obj, InterfaceC1093j interfaceC1093j) {
        List arrayList = (List) this.f3472a.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f3472a.put(obj, arrayList);
        }
        m2361a(arrayList, interfaceC1093j);
        arrayList.add(new WeakReference(interfaceC1093j));
    }

    /* renamed from: a */
    private static void m2361a(List list, InterfaceC1093j interfaceC1093j) {
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC1093j interfaceC1093j2 = (InterfaceC1093j) ((WeakReference) list.get(size)).get();
            if (interfaceC1093j2 == null || interfaceC1093j2 == interfaceC1093j) {
                list.remove(size);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m2364b(Object obj, InterfaceC1093j interfaceC1093j) {
        List list = (List) this.f3472a.get(obj);
        if (list != null) {
            m2361a(list, interfaceC1093j);
            if (list.size() == 0) {
                this.f3472a.remove(obj);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m2363a(Object obj, Object obj2) {
        int i;
        int i2;
        List list = (List) this.f3472a.get(obj);
        if (list != null) {
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                InterfaceC1093j interfaceC1093j = (InterfaceC1093j) ((WeakReference) list.get(i3)).get();
                if (interfaceC1093j == null) {
                    i = i3 - 1;
                    list.remove(i3);
                    i2 = size - 1;
                } else {
                    interfaceC1093j.mo1250a(obj, obj2);
                    i = i3;
                    i2 = size;
                }
                size = i2;
                i3 = i + 1;
            }
            if (size == 0) {
                this.f3472a.remove(obj);
            }
        }
    }
}
