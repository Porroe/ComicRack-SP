package com.p004a.p005a.p011e;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.ab */
/* loaded from: classes.dex */
public abstract class AbstractC0360ab {

    /* renamed from: a */
    private static final Object f1030a = new Object();

    /* renamed from: b */
    private static int f1031b = 0;

    /* renamed from: c */
    private static HashMap f1032c = new HashMap();

    /* renamed from: d */
    private final ArrayList f1033d = new ArrayList();

    /* renamed from: u */
    public final int f1034u;

    /* renamed from: a */
    static /* synthetic */ void m897a(AbstractC0360ab abstractC0360ab, AbstractC0361ac abstractC0361ac) {
        abstractC0360ab.f1033d.add(abstractC0361ac);
    }

    public AbstractC0360ab() {
        synchronized (f1030a) {
            int i = f1031b;
            f1031b = i + 1;
            this.f1034u = i;
            Integer num = (Integer) f1032c.get(getClass());
            if (num == null) {
                f1032c.put(getClass(), 1);
            } else {
                f1032c.put(getClass(), Integer.valueOf(num.intValue() + 1));
            }
        }
        C0372i.m918d("State created: " + toString());
    }

    protected void finalize() throws Throwable {
        synchronized (f1030a) {
            f1032c.put(getClass(), Integer.valueOf(((Integer) f1032c.get(getClass())).intValue() - 1));
        }
        super.finalize();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f1034u + "]";
    }
}
