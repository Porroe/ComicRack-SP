package com.p004a.p005a.p007b;

import android.os.SystemClock;
import com.p004a.p005a.EnumC0321bj;
import com.p004a.p005a.p011e.C0372i;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.ab */
/* loaded from: classes.dex */
public final class C0277ab {

    /* renamed from: f */
    private static long f724f = 0;

    /* renamed from: g */
    private static long f725g = 0;

    /* renamed from: h */
    private static long f726h = 0;

    /* renamed from: i */
    private static long f727i = 0;

    /* renamed from: j */
    private static long f728j = -1;

    /* renamed from: b */
    private long f730b;

    /* renamed from: c */
    private long f731c;

    /* renamed from: d */
    private long f732d;

    /* renamed from: m */
    private String f736m;

    /* renamed from: n */
    private long f737n;

    /* renamed from: k */
    private boolean f734k = false;

    /* renamed from: l */
    private boolean f735l = false;

    /* renamed from: a */
    private final LinkedList f729a = new LinkedList();

    /* renamed from: e */
    private final LinkedList f733e = new LinkedList();

    /* renamed from: o */
    private final LinkedList f738o = new LinkedList();

    /* renamed from: p */
    private final LinkedList f739p = new LinkedList();

    public C0277ab() {
        m658a();
    }

    /* renamed from: a */
    protected final synchronized void m658a() {
        this.f729a.clear();
        this.f730b = 0L;
        this.f731c = 0L;
        this.f732d = 0L;
        this.f733e.clear();
        this.f737n = -1L;
        this.f738o.clear();
        this.f739p.clear();
        this.f734k = false;
        this.f735l = false;
    }

    /* renamed from: b */
    public final synchronized void m661b() {
        this.f738o.clear();
        this.f739p.clear();
    }

    /* renamed from: c */
    public final synchronized void m662c() {
        this.f737n = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final synchronized void m659a(EnumC0321bj enumC0321bj) {
        this.f738o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.f737n));
        this.f739p.add(enumC0321bj);
    }

    /* renamed from: d */
    public final synchronized String m663d() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator it = this.f738o.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(jLongValue);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public final synchronized String m664e() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator it = this.f739p.iterator();
        while (it.hasNext()) {
            EnumC0321bj enumC0321bj = (EnumC0321bj) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(enumC0321bj.ordinal());
        }
        return sb.toString();
    }

    /* renamed from: f */
    protected final void m665f() {
        C0372i.m918d("Ad clicked.");
        this.f729a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: g */
    protected final void m666g() {
        C0372i.m918d("Ad request loaded.");
        this.f730b = SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    protected final synchronized void m667h() {
        C0372i.m918d("Ad request before rendering.");
        this.f731c = SystemClock.elapsedRealtime();
    }

    /* renamed from: i */
    protected final void m668i() {
        C0372i.m918d("Ad request started.");
        this.f732d = SystemClock.elapsedRealtime();
        f724f++;
    }

    /* renamed from: j */
    protected final long m669j() {
        if (this.f729a.size() != this.f733e.size()) {
            return -1L;
        }
        return this.f729a.size();
    }

    /* renamed from: k */
    protected final String m670k() {
        if (this.f729a.isEmpty() || this.f729a.size() != this.f733e.size()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f729a.size()) {
                if (i2 != 0) {
                    sb.append(",");
                }
                sb.append(Long.toString(((Long) this.f733e.get(i2)).longValue() - ((Long) this.f729a.get(i2)).longValue()));
                i = i2 + 1;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: l */
    protected final String m671l() {
        if (this.f729a.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f729a.size()) {
                if (i2 != 0) {
                    sb.append(",");
                }
                sb.append(Long.toString(((Long) this.f729a.get(i2)).longValue() - this.f730b));
                i = i2 + 1;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: m */
    protected final long m672m() {
        return this.f730b - this.f732d;
    }

    /* renamed from: n */
    protected final synchronized long m673n() {
        return this.f731c - this.f732d;
    }

    /* renamed from: o */
    protected static long m653o() {
        return f724f;
    }

    /* renamed from: p */
    protected final synchronized long m674p() {
        return f725g;
    }

    /* renamed from: q */
    protected final synchronized void m675q() {
        C0372i.m918d("Ad request network error");
        f725g++;
    }

    /* renamed from: r */
    protected final synchronized void m676r() {
        f725g = 0L;
    }

    /* renamed from: s */
    protected final synchronized long m677s() {
        return f726h;
    }

    /* renamed from: t */
    protected final synchronized void m678t() {
        f726h++;
    }

    /* renamed from: u */
    protected final synchronized void m679u() {
        f726h = 0L;
    }

    /* renamed from: v */
    protected final synchronized long m680v() {
        return f727i;
    }

    /* renamed from: w */
    protected final synchronized void m681w() {
        f727i++;
    }

    /* renamed from: x */
    protected final synchronized void m682x() {
        f727i = 0L;
    }

    /* renamed from: y */
    protected final boolean m683y() {
        return this.f734k;
    }

    /* renamed from: z */
    protected final void m684z() {
        C0372i.m918d("Interstitial network error.");
        this.f734k = true;
    }

    /* renamed from: A */
    protected final boolean m654A() {
        return this.f735l;
    }

    /* renamed from: B */
    protected final void m655B() {
        C0372i.m918d("Interstitial no fill.");
        this.f735l = true;
    }

    /* renamed from: C */
    public final void m656C() {
        C0372i.m918d("Landing page dismissed.");
        this.f733e.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: D */
    protected final String m657D() {
        return this.f736m;
    }

    /* renamed from: a */
    public final void m660a(String str) {
        C0372i.m918d("Prior impression ticket = " + str);
        this.f736m = str;
    }

    /* renamed from: E */
    public static long m652E() {
        if (f728j != -1) {
            return SystemClock.elapsedRealtime() - f728j;
        }
        f728j = SystemClock.elapsedRealtime();
        return 0L;
    }
}
