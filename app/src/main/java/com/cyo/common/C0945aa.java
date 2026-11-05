package com.cyo.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.aa */
/* loaded from: classes.dex */
public class C0945aa {

    /* renamed from: r */
    public List f2834r;

    protected void finalize() throws Throwable {
        m1988z();
        super.finalize();
    }

    /* renamed from: x */
    public final List m1986x() {
        if (this.f2834r == null) {
            this.f2834r = new ArrayList();
        }
        return this.f2834r;
    }

    /* renamed from: y */
    public final int m1987y() {
        if (this.f2834r == null) {
            return 0;
        }
        return this.f2834r.size();
    }

    /* renamed from: d */
    public final Object m1983d(int i) {
        if (this.f2834r == null) {
            return null;
        }
        return this.f2834r.get(i);
    }

    /* renamed from: b */
    public Object mo1243b(Object obj) {
        if (!m1986x().add(obj)) {
            obj = null;
        }
        if (obj != null) {
            mo1240a(obj);
        }
        return obj;
    }

    /* renamed from: a */
    public void mo1239a(int i, Object obj) {
        m1986x().add(i, obj);
        mo1240a(obj);
    }

    /* renamed from: e */
    public final void m1985e(int i) {
        if (this.f2834r == null) {
            throw new IndexOutOfBoundsException();
        }
        this.f2834r.get(i);
        this.f2834r.remove(i);
    }

    /* renamed from: c */
    public final void m1982c(Object obj) {
        if (this.f2834r != null) {
            this.f2834r.remove(obj);
        }
    }

    /* renamed from: a */
    public final Object m1980a(InterfaceC0948ad interfaceC0948ad, boolean z) {
        Object objM1980a;
        if (m1987y() == 0) {
            return null;
        }
        for (Object obj : m1986x()) {
            if (!interfaceC0948ad.mo1248a(obj)) {
                if (z && (obj instanceof C0945aa) && (objM1980a = ((C0945aa) obj).m1980a(interfaceC0948ad, z)) != null) {
                    return objM1980a;
                }
            } else {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final Object m1984d(Object obj) {
        return m1980a((InterfaceC0948ad) new C0947ac(this, obj), true);
    }

    /* renamed from: a */
    public final boolean m1981a(Class cls) {
        return m1987y() != 0 && cls.isInstance(m1983d(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(toString()).append(",[");
        int i = 0;
        Iterator it = m1986x().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                Object next = it.next();
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(next.toString());
                i = i2 + 1;
            } else {
                sb.append("]}");
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public void mo1240a(Object obj) {
    }

    /* renamed from: z */
    public final void m1988z() {
        if (this.f2834r != null) {
            Iterator it = this.f2834r.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.f2834r = null;
    }
}
