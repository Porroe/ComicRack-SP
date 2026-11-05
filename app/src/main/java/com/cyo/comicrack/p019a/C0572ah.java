package com.cyo.comicrack.p019a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.format.Time;
import android.view.View;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.C0586a;
import com.cyo.comicrack.p019a.p021b.EnumC0590ad;
import com.cyo.common.C0971b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.ah */
/* loaded from: classes.dex */
public class C0572ah extends C0575ak {

    /* renamed from: a */
    public String f1739a;

    /* renamed from: b */
    private C0505b f1740b;

    /* renamed from: c */
    private int f1741c;

    /* renamed from: d */
    private C0635m f1742d;

    /* renamed from: e */
    private int f1743e;

    public C0572ah(C0505b c0505b, String str) {
        super(c0505b.f1570b);
        this.f1743e = -1;
        this.f1740b = c0505b;
        this.f1739a = str;
    }

    public C0572ah(C0505b c0505b) {
        this(c0505b, null);
    }

    /* renamed from: a */
    public final String m1216a(boolean z) {
        return this.f1739a != null ? this.f1739a : z ? this.f1740b.m1178w() : this.f1740b.f1657x;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: f */
    public final String mo1211f() {
        return m1216a(false);
    }

    /* renamed from: a */
    public final void m1217a() {
        this.f1739a = null;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: d */
    public final String mo1209d() {
        return m1216a(false);
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: g */
    public final String mo1212g() {
        return m1987y() > 0 ? C0635m.m1387b(m1987y()) : this.f1740b.m1176u();
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0583as
    /* renamed from: a */
    public final void mo1219a(View view, int i, Drawable drawable) {
        C0586a.m1263a(view, this.f1740b, this.f1740b.m1180y(), i, drawable, true);
    }

    /* renamed from: b */
    public final Bitmap m1220b() {
        return C0586a.m1260a(this.f1740b, 0, 0, EnumC0590ad.Disk);
    }

    /* renamed from: j */
    public final C0505b m1221j() {
        return this.f1740b;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.common.C0945aa
    public String toString() {
        return m1216a(false);
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: h */
    public final int mo1213h() {
        return 0;
    }

    /* renamed from: a */
    public final void m1218a(int i) {
        this.f1741c = i;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: i */
    public final int mo1214i() {
        return this.f1741c;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: a */
    public final void mo1207a(C0635m c0635m) {
        this.f1742d = c0635m;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak
    /* renamed from: k */
    public final C0635m mo1222k() {
        return this.f1742d;
    }

    @Override // com.cyo.comicrack.p019a.C0575ak, com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: e */
    public final C0575ak mo1210e() {
        if (m1223l() || this.f1742d == null) {
            return null;
        }
        return (C0575ak) this.f1742d.m1984d(this);
    }

    /* renamed from: l */
    public final boolean m1223l() {
        return m1987y() > 0;
    }

    /* renamed from: m */
    public final int m1224m() {
        if (m1223l()) {
            if (this.f1743e == -1) {
                Iterator it = m1986x().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((C0572ah) ((InterfaceC0571ag) it.next())).f1740b.m1143i()) {
                        i++;
                    }
                }
                this.f1743e = (i * 100) / m1987y();
            }
            return this.f1743e;
        }
        return C0505b.m1112a(this.f1740b.m1140f(), this.f1740b.m1139e());
    }

    /* renamed from: n */
    public final int m1225n() {
        return m1223l() ? m1224m() : C0505b.m1112a(this.f1740b.m1141g(), this.f1740b.m1139e());
    }

    /* renamed from: o */
    public final boolean m1226o() {
        return m1225n() < 10;
    }

    /* renamed from: p */
    public final boolean m1227p() {
        return m1225n() > 95;
    }

    /* renamed from: q */
    public final void m1228q() {
        this.f1743e = -1;
    }

    /* renamed from: r */
    public final Time m1229r() {
        if (m1987y() == 0) {
            return this.f1740b.m1146l();
        }
        Time time = C0971b.f2864a;
        Iterator it = m1986x().iterator();
        Time time2 = time;
        while (it.hasNext()) {
            Time timeM1229r = ((C0572ah) ((InterfaceC0571ag) it.next())).m1229r();
            if (Time.compare(time2, timeM1229r) < 0) {
                time2 = timeM1229r;
            }
        }
        return time2;
    }

    /* renamed from: s */
    public final float m1230s() {
        C0573ai c0573ai = new C0573ai(this);
        if (!m1223l()) {
            return c0573ai.mo1233a(this.f1740b);
        }
        Iterator it = m1986x().iterator();
        float f = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            float fMo1233a = c0573ai.mo1233a(((C0572ah) ((InterfaceC0571ag) it.next())).f1740b);
            if (fMo1233a != 0.0f) {
                i++;
                f = fMo1233a + f;
            }
        }
        if (i != 0) {
            return f / i;
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m1215a(C0572ah c0572ah, List list) {
        list.add(c0572ah.f1740b);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < c0572ah.m1987y()) {
                InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) c0572ah.m1983d(i2);
                if (interfaceC0571ag instanceof C0572ah) {
                    m1215a((C0572ah) interfaceC0571ag, list);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public final List m1231t() {
        ArrayList arrayList = new ArrayList();
        m1215a(this, arrayList);
        return arrayList;
    }

    /* renamed from: u */
    public final boolean m1232u() {
        Iterator it = m1231t().iterator();
        while (it.hasNext()) {
            if (!((C0505b) it.next()).m1136c()) {
                return false;
            }
        }
        return true;
    }
}
