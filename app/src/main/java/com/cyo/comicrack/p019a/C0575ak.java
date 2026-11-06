package com.cyo.comicrack.p019a;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.cyo.comicrack.p019a.p020a.C0526bu;
import com.cyo.comicrack.p019a.p020a.C0527bv;
import com.cyo.comicrack.p019a.p020a.C0528bw;
import com.cyo.comicrack.p019a.p020a.C0529bx;
import com.cyo.comicrack.p019a.p020a.C0530by;
import com.cyo.comicrack.p019a.p020a.C0531bz;
import com.cyo.comicrack.p019a.p020a.C0533ca;
import com.cyo.common.C0945aa;
import com.cyo.common.InterfaceC0948ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.ak */
/* loaded from: classes.dex */
public class C0575ak extends C0945aa implements InterfaceC0571ag {

    /* renamed from: a */
    private String f1745a;

    /* renamed from: b */
    private String f1746b;

    /* renamed from: c */
    private int f1747c;

    /* renamed from: d */
    private String f1748d;

    /* renamed from: e */
    private C0635m f1749e;

    /* renamed from: p */
    public String f1750p;

    /* renamed from: q */
    public boolean f1751q;

    @Override // com.cyo.common.C0945aa
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1239a(int i, Object obj) {
        super.mo1239a(i, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cyo.common.C0945aa
    /* renamed from: a */
    public final /* synthetic */ void mo1240a(Object obj) {
        InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) obj;
        super.mo1240a((Object) interfaceC0571ag);
        interfaceC0571ag.mo1207a(mo1222k());
    }

    @Override // com.cyo.common.C0945aa
    /* renamed from: b */
    public final /* synthetic */ Object mo1243b(Object obj) {
        return m1237a((InterfaceC0571ag) obj);
    }

    public C0575ak(String str, String str2, String str3, int i, String str4) {
        this.f1748d = str;
        this.f1745a = str2;
        this.f1746b = str3;
        this.f1747c = i;
        this.f1750p = str4;
    }

    public C0575ak(String str, String str2, int i, String str3) {
        this(str, str, str2, i, str3);
    }

    public C0575ak(String str) {
        this(null, null, 0, str);
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0571ag
    /* renamed from: c */
    public final String mo1208c() {
        return this.f1750p;
    }

    /* renamed from: f */
    public String mo1211f() {
        return m1234a(this.f1745a);
    }

    /* renamed from: d */
    public String mo1209d() {
        return this.f1748d;
    }

    /* renamed from: g */
    public String mo1212g() {
        return m1234a(this.f1746b);
    }

    /* renamed from: a */
    public void mo1219a(View view, int i, Drawable drawable) {
    }

    @Override // com.cyo.common.C0945aa
    public String toString() {
        return mo1211f();
    }

    /* renamed from: h */
    public int mo1213h() {
        return this.f1747c;
    }

    /* renamed from: i */
    public int mo1214i() {
        return 0;
    }

    /* renamed from: a */
    public final InterfaceC0571ag m1237a(InterfaceC0571ag interfaceC0571ag) {
        return (InterfaceC0571ag) super.mo1243b(interfaceC0571ag);
    }

    /* renamed from: a */
    public final void m1238a(int i, InterfaceC0571ag interfaceC0571ag) {
        super.mo1239a(i, (Object) interfaceC0571ag);
    }

    /* renamed from: b */
    public final int m1241b(String str) {
        int iY = m1987y();
        for (int i = 0; i < iY; i++) {
            if (((InterfaceC0571ag) m1983d(i)).mo1208c().equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo1207a(C0635m c0635m) {
        this.f1749e = c0635m;
    }

    /* renamed from: k */
    public C0635m mo1222k() {
        return this.f1749e;
    }

    /* renamed from: e */
    public C0575ak mo1210e() {
        if (mo1222k() == null) {
            return null;
        }
        return (C0575ak) mo1222k().m1984d(this);
    }

    /* renamed from: b */
    public final InterfaceC0571ag m1242b(String str, boolean z) {
        return (z && this.f1750p.equals(str)) ? this : (InterfaceC0571ag) m1980a((InterfaceC0948ad) new C0576al(this, str), true);
    }

    /* renamed from: c */
    public final InterfaceC0571ag m1244c(String str) {
        return m1242b(str, false);
    }

    /* renamed from: c */
    public final InterfaceC0571ag m1245c(String str, boolean z) {
        return (InterfaceC0571ag) m1980a((InterfaceC0948ad) new C0577am(this, z, str), false);
    }

    /* renamed from: v */
    public final String[] m1246v() {
        int iY = m1987y();
        String[] strArr = new String[iY];
        for (int i = 0; i < iY; i++) {
            strArr[i] = ((InterfaceC0571ag) m1983d(i)).mo1208c();
        }
        return strArr;
    }

    /* renamed from: w */
    public final List m1247w() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < m1987y()) {
                InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) m1983d(i2);
                if (interfaceC0571ag instanceof C0572ah) {
                    arrayList.add(((C0572ah) interfaceC0571ag).m1221j());
                }
                i = i2 + 1;
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: a */
    private String m1234a(String str) {
        String strM1387b = C0635m.m1387b(m1987y());
        return str == null ? strM1387b : str.replace(":comics:", strM1387b);
    }

    /* renamed from: c */
    public static Comparator m1236c(int i) {
        switch (i) {
            case 2:
                return new C0533ca();
            case 3:
                return new C0528bw();
            case 4:
                return new C0531bz();
            case 5:
                return new C0526bu();
            case 6:
                return new C0529bx();
            case 7:
                return new C0527bv();
            default:
                return new C0530by();
        }
    }

    /* renamed from: a */
    public static void m1235a(C0575ak c0575ak, int i, boolean z) {
        Comparator c0579ao;
        List listX = c0575ak.m1986x();
        switch (i) {
            case 0:
                c0579ao = new C0579ao();
                break;
            default:
                c0579ao = new C0578an(m1236c(i));
                break;
        }
        Collections.sort(listX, c0579ao);
        if (z) {
            Collections.reverse(c0575ak.m1986x());
        }
    }
}
