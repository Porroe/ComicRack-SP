package com.cyo.comicrack.p019a.p021b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.cyo.common.C0951ag;
import com.cyo.common.C1013bx;
import com.cyo.common.C1016c;
import com.cyo.common.C1087d;
import com.cyo.common.C1088e;
import com.cyo.common.InterfaceC1091h;
import com.cyo.common.p022a.C0935f;
import java.io.IOException;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.ab */
/* loaded from: classes.dex */
public final class C0588ab {

    /* renamed from: a */
    public C1016c f1773a;

    /* renamed from: b */
    public C1016c f1774b;

    /* renamed from: c */
    private C0935f f1775c = new C0935f();

    /* renamed from: d */
    private C1013bx f1776d = new C1013bx("Delayed Cache Writer", 1, 1);

    public C0588ab(Context context, String str, int i) {
        this.f1775c.f2812a = i;
        try {
            this.f1773a = new C1016c(context.getCacheDir() + "/" + str);
            this.f1773a.f2984b = Math.min(((int) (C0951ag.m1994a(Environment.getDataDirectory().getPath()) / 1048576.0f)) / 4, 64);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final Bitmap m1282a(InterfaceC0606h interfaceC0606h, int i) {
        AbstractC0587aa abstractC0587aaMo1304b;
        String strMo1308d = interfaceC0606h.mo1308d(i);
        Bitmap bitmapMo1275d = null;
        if ((!m1281a(interfaceC0606h) || (bitmapMo1275d = (Bitmap) this.f1774b.m2119a(strMo1308d, new C1087d(InterfaceC0606h.f1816a))) == null) && (abstractC0587aaMo1304b = interfaceC0606h.mo1304b(i)) != null && (abstractC0587aaMo1304b instanceof C0617s)) {
            bitmapMo1275d = abstractC0587aaMo1304b.mo1275d();
            if (m1281a(interfaceC0606h)) {
                m1280a(this.f1774b, strMo1308d, new C1088e(bitmapMo1275d));
            }
        }
        return bitmapMo1275d;
    }

    /* renamed from: a */
    public final Bitmap m1283a(InterfaceC0606h interfaceC0606h, int i, EnumC0590ad enumC0590ad) {
        Bitmap bitmap;
        String strMo1308d = interfaceC0606h.mo1308d(i);
        Bitmap bitmapM1966a = this.f1775c.m1966a(strMo1308d);
        if (bitmapM1966a != null && !bitmapM1966a.isRecycled()) {
            if (this.f1773a != null) {
                this.f1773a.m2121a(strMo1308d, new C1088e(bitmapM1966a));
                return bitmapM1966a;
            }
            return bitmapM1966a;
        }
        if (enumC0590ad == EnumC0590ad.Memory) {
            return null;
        }
        if (this.f1773a != null && (bitmap = (Bitmap) this.f1773a.m2119a(strMo1308d, new C1087d(InterfaceC0606h.f1816a))) != null) {
            return this.f1775c.m1967a(strMo1308d, bitmap);
        }
        if (enumC0590ad == EnumC0590ad.Disk) {
            return null;
        }
        Bitmap bitmapMo1306c = interfaceC0606h.mo1306c(i);
        if (bitmapMo1306c != null) {
            Bitmap bitmapM1967a = this.f1775c.m1967a(strMo1308d, bitmapMo1306c);
            if (this.f1773a != null) {
                m1280a(this.f1773a, strMo1308d, new C1088e(bitmapM1967a));
                return bitmapM1967a;
            }
            return bitmapM1967a;
        }
        return bitmapMo1306c;
    }

    /* renamed from: a */
    private void m1280a(C1016c c1016c, String str, InterfaceC1091h interfaceC1091h) {
        if (c1016c != null) {
            if (this.f1776d == null) {
                c1016c.m2121a(str, interfaceC1091h);
            } else {
                this.f1776d.m2109a(str, new RunnableC0589ac(this, c1016c, str, interfaceC1091h));
            }
        }
    }

    /* renamed from: a */
    private boolean m1281a(InterfaceC0606h interfaceC0606h) {
        return (this.f1774b == null || interfaceC0606h.mo1309d()) ? false : true;
    }

    /* renamed from: a */
    public final void m1284a() {
        if (this.f1773a != null) {
            this.f1773a.m2120a();
        }
        if (this.f1774b != null) {
            this.f1774b.m2120a();
        }
    }
}
