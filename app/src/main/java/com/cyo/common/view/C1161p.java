package com.cyo.common.view;

import android.graphics.Canvas;
import com.cyo.common.p022a.AbstractC0934e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.p */
/* loaded from: classes.dex */
public final class C1161p implements InterfaceC1160o {

    /* renamed from: b */
    InterfaceC1163r f3666b;

    /* renamed from: f */
    boolean f3670f;

    /* renamed from: a */
    public List<AbstractC1159n> f3665a = new ArrayList<>();

    /* renamed from: c */
    public boolean f3667c = true;

    /* renamed from: d */
    public boolean f3668d = true;

    /* renamed from: e */
    public EnumC1162q f3669e = EnumC1162q.Forward;

    /* renamed from: g */
    float f3671g = 0.0f;

    /* renamed from: a */
    public final synchronized int m2440a(AbstractC1159n item, long duration) {
        if (duration >= 0) {
            item.f3661k = duration;
        }
        item.f3663m = this;
        item.m2425a(this.f3670f);
        synchronized (item) {
            this.f3665a.add(item);
        }
        return m2436h() - 1;
    }

    /* renamed from: a */
    public final AbstractC1159n[] m2444a() {
        synchronized (this.f3665a) {
            return this.f3665a.toArray(new AbstractC1159n[this.f3665a.size()]);
        }
    }

    /* renamed from: b */
    private AbstractC1159n m2435b(int i) {
        AbstractC1159n abstractC1159n;
        synchronized (this.f3665a) {
            abstractC1159n = (AbstractC1159n) this.f3665a.get(i);
        }
        return abstractC1159n;
    }

    /* renamed from: h */
    private int m2436h() {
        int size;
        synchronized (this.f3665a) {
            size = this.f3665a.size();
        }
        return size;
    }

    /* renamed from: a */
    private int m2434a(boolean z) {
        int i;
        synchronized (this.f3665a) {
            i = 0;
            for (AbstractC1159n abstractC1159n : this.f3665a) {
                if (abstractC1159n.m2430e() || (z && abstractC1159n.m2429d())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public final boolean m2446b() {
        return m2434a(false) != 0;
    }

    /* renamed from: i */
    private AbstractC1159n[] m2437i() {
        AbstractC1159n[] abstractC1159nArr;
        synchronized (this.f3665a) {
            abstractC1159nArr = new AbstractC1159n[m2434a(true)];
            int i = 0;
            for (AbstractC1159n abstractC1159n : this.f3665a) {
                if (abstractC1159n.m2430e() || abstractC1159n.m2429d()) {
                    if (i < abstractC1159nArr.length) {
                        int i2 = i + 1;
                        abstractC1159nArr[i] = abstractC1159n;
                        i = i2;
                    }
                }
            }
        }
        return abstractC1159nArr;
    }

    /* renamed from: j */
    private AbstractC1159n[] m2438j() {
        AbstractC1159n[] abstractC1159nArr;
        synchronized (this.f3665a) {
            abstractC1159nArr = (AbstractC1159n[]) this.f3665a.toArray(new AbstractC1159n[this.f3665a.size()]);
        }
        return abstractC1159nArr;
    }

    /* renamed from: k */
    private AbstractC1159n m2439k() {
        synchronized (this.f3665a) {
            for (AbstractC1159n abstractC1159n : this.f3665a) {
                if (!abstractC1159n.m2428c()) {
                    return abstractC1159n;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final AbstractC1159n m2442a(Class cls) {
        synchronized (this.f3665a) {
            for (AbstractC1159n abstractC1159n : this.f3665a) {
                if (abstractC1159n.getClass().equals(cls)) {
                    return abstractC1159n;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public final AbstractC1159n m2447c() {
        AbstractC1159n abstractC1159n;
        synchronized (this.f3665a) {
            int size = this.f3665a.size();
            abstractC1159n = size == 0 ? null : (AbstractC1159n) this.f3665a.get(size - 1);
        }
        return abstractC1159n;
    }

    /* renamed from: d */
    public final AbstractC1159n m2448d() {
        AbstractC1159n abstractC1159n;
        synchronized (this.f3665a) {
            abstractC1159n = this.f3665a.size() == 0 ? null : (AbstractC1159n) this.f3665a.get(0);
        }
        return abstractC1159n;
    }

    /* renamed from: e */
    public final boolean m2449e() {
        AbstractC1159n abstractC1159nM2439k;
        if (this.f3670f || m2446b() || (abstractC1159nM2439k = m2439k()) == null) {
            return false;
        }
        abstractC1159nM2439k.m2431f();
        return true;
    }

    /* renamed from: a */
    public final boolean m2443a(Canvas canvas, AbstractC0934e abstractC0934e) {
        if (!this.f3670f && !m2450f()) {
            return false;
        }
        for (AbstractC1159n abstractC1159n : m2437i()) {
            if (canvas != null) {
                abstractC1159n.mo1846a(canvas);
            }
            if (abstractC0934e != null) {
                abstractC1159n.mo1794a(abstractC0934e);
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m2445b(AbstractC1159n abstractC1159n) {
        synchronized (this.f3665a) {
            for (int iIndexOf = this.f3665a.indexOf(abstractC1159n) - 1; iIndexOf >= 0; iIndexOf--) {
                ((AbstractC1159n) this.f3665a.get(iIndexOf)).f3663m = null;
                this.f3665a.remove(iIndexOf);
            }
        }
    }

    /* renamed from: f */
    public final boolean m2450f() {
        boolean zM2427b = false;
        if (this.f3670f) {
            return true;
        }
        if (this.f3668d) {
            synchronized (this.f3665a) {
                for (int iM2436h = m2436h() - 1; iM2436h >= 0; iM2436h--) {
                    AbstractC1159n abstractC1159n = (AbstractC1159n) this.f3665a.get(iM2436h);
                    if (abstractC1159n != null && abstractC1159n.m2429d()) {
                        abstractC1159n.f3663m = null;
                        this.f3665a.remove(iM2436h);
                    }
                }
            }
        }
        for (AbstractC1159n abstractC1159n2 : m2438j()) {
            zM2427b |= abstractC1159n2.m2427b();
        }
        if (zM2427b || !this.f3667c) {
            return true;
        }
        return m2449e();
    }

    @Override // com.cyo.common.view.InterfaceC1160o
    /* renamed from: a */
    public final void mo2433a(AbstractC1159n abstractC1159n) {
        if (this.f3666b != null) {
            this.f3666b.mo1508a(abstractC1159n);
            if (m2446b() || m2439k() != null) {
                return;
            }
            this.f3666b.mo1508a(null);
        }
    }

    /* renamed from: g */
    public final long m2451g() {
        long duration = 0;
        synchronized (this.f3665a) {
            for (AbstractC1159n item : this.f3665a) {
                duration += item.f3661k;
            }
        }
        return duration;
    }

    /* renamed from: a */
    public final long m2441a(int i) {
        long j = 0;
        synchronized (this.f3665a) {
            for (int i2 = 0; i2 <= i; i2++) {
                j += m2435b(i2).f3661k;
            }
        }
        return j;
    }
}
