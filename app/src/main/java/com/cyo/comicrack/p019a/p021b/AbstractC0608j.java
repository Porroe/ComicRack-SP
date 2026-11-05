package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0535cc;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.common.C0951ag;
import com.cyo.common.p022a.C0939j;
import com.cyo.common.p022a.EnumC0938i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.j */
/* loaded from: classes.dex */
public abstract class AbstractC0608j implements InterfaceC0606h {

    /* renamed from: d */
    private static List f1820d;

    /* renamed from: b */
    C0505b f1821b;

    /* renamed from: c */
    boolean f1822c;

    /* renamed from: a */
    protected abstract Bitmap mo1317a(C0537ce c0537ce, int i);

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public void mo1300a(C0505b c0505b) {
        this.f1821b = c0505b;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final C0505b mo1298a() {
        return this.f1821b;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final C0537ce mo1299a(int i) {
        return this.f1821b.m1174e(i);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: a */
    public final Bitmap mo1297a(int i, int i2) {
        if (i < 0 || i >= this.f1821b.m1165D().size()) {
            return null;
        }
        C0537ce c0537ceE = this.f1821b.m1174e(i);
        int i3 = c0537ceE.f1669g;
        int i4 = c0537ceE.f1670h;
        Bitmap bitmapMo1317a = mo1317a(c0537ceE, i2);
        EnumC0938i enumC0938i = c0537ceE.f1671i;
        if (enumC0938i != EnumC0938i.None) {
            Matrix matrix = new Matrix();
            int width = bitmapMo1317a.getWidth();
            int height = bitmapMo1317a.getHeight();
            matrix.preTranslate((-width) / 2.0f, (-height) / 2.0f);
            switch (C0939j.m1976a()[enumC0938i.ordinal()]) {
                case TwitterResponse.READ_WRITE /* 2 */:
                    matrix.preRotate(90.0f);
                    break;
                case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                    matrix.preRotate(180.0f);
                    break;
                case 4:
                    matrix.preRotate(270.0f);
                    break;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapMo1317a, 0, 0, width, height, matrix, false);
            bitmapMo1317a.recycle();
            bitmapMo1317a = bitmapCreateBitmap;
        }
        if (i3 != c0537ceE.f1669g || i4 != c0537ceE.f1670h) {
            this.f1821b.f1588t = true;
            return bitmapMo1317a;
        }
        return bitmapMo1317a;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: b */
    public final AbstractC0587aa mo1304b(int i) {
        Bitmap bitmapMo1297a = mo1297a(i, C0628f.f1883e);
        if (bitmapMo1297a == null) {
            return null;
        }
        return new C0617s(bitmapMo1297a);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: c */
    public final Bitmap mo1306c(int i) {
        if (i < 0 || i >= this.f1821b.m1165D().size()) {
            return null;
        }
        return mo1297a(i, C0628f.f1881c);
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: c */
    public final String mo1307c() {
        return this.f1821b.f1655v;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: d */
    public String mo1308d(int i) {
        return String.format(Locale.US, "%s:%d", this.f1821b.f1655v, Integer.valueOf(i));
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: e */
    public boolean mo1310e() {
        return true;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0606h
    /* renamed from: b */
    public final void mo1305b(boolean z) {
        this.f1822c = z;
    }

    /* renamed from: a */
    protected static boolean m1316a(String str) {
        List arrayList;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (f1820d != null) {
                arrayList = f1820d;
            } else {
                arrayList = new ArrayList();
                arrayList.add(".jpg");
                arrayList.add(".jpeg");
                arrayList.add(".png");
                arrayList.add(".gif");
                arrayList.add(".bmp");
                if (C0951ag.m2001c()) {
                    arrayList.add(".webp");
                }
                f1820d = arrayList;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (lowerCase.endsWith((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static C0537ce m1315a(C0535cc c0535cc, int i) {
        for (Object entry : c0535cc.m1165D()) {
            C0537ce c0537ce = (C0537ce) entry;
            if (c0537ce.f1666d == i) {
                return c0537ce;
            }
        }
        return null;
    }
}
