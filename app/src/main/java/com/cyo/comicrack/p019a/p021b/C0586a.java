package com.cyo.comicrack.p019a.p021b;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C0951ag;
import com.cyo.common.C1013bx;
import com.cyo.common.C1015bz;
import com.cyo.common.view.FastThumbView;
import java.io.IOException;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.a */
/* loaded from: classes.dex */
public final class C0586a {

    /* renamed from: a */
    private static C1013bx f1769a = new C1013bx("Thumbnail Setter", 2, 1);

    /* renamed from: a */
    private static void m1266a(C0601c c0601c) {
        if (c0601c != null && c0601c.f1796a != null && !c0601c.m1287a()) {
            c0601c.f1796a.setTag(c0601c);
            if (!C0951ag.m2004d()) {
                if (!c0601c.m1289b()) {
                    c0601c.m1290c();
                    return;
                } else if (c0601c.m1288a(EnumC0590ad.Memory)) {
                    c0601c.f1803h = true;
                    return;
                }
            }
            if (c0601c.f1796a.getVisibility() == 0) {
                m1261a(c0601c.f1796a, (Bitmap) null, 0, false);
            }
            RunnableC0600b runnableC0600b = new RunnableC0600b(c0601c);
            if (c0601c.f1804i) {
                C1013bx c1013bx = f1769a;
                synchronized (c1013bx.f2978a) {
                    c1013bx.m2108a((Object) null);
                    c1013bx.f2978a.addFirst(new C1015bz(null, runnableC0600b));
                    c1013bx.f2978a.notify();
                }
                return;
            }
            runnableC0600b.run();
        }
    }

    /* renamed from: a */
    public static void m1263a(View view, C0505b c0505b, int i, int i2, Drawable drawable, boolean z) {
        m1266a(new C0601c(view, null, c0505b, i, 0, i2, drawable, z));
    }

    /* renamed from: a */
    public static void m1264a(View view, C0505b c0505b, boolean z) {
        m1263a(view, c0505b, -1, 0, null, z);
    }

    /* renamed from: a */
    public static void m1265a(View view, InterfaceC0606h interfaceC0606h, int i, int i2, Drawable drawable) {
        m1266a(new C0601c(view, interfaceC0606h, null, i, i2, 0, drawable, true));
    }

    /* renamed from: a */
    public static Bitmap m1260a(C0505b c0505b, int i, int i2, EnumC0590ad enumC0590ad) {
        if (c0505b == null) {
            return null;
        }
        InterfaceC0606h interfaceC0606hM1354a = C0628f.m1354a(c0505b, false);
        int iY = c0505b.m1180y();
        if (interfaceC0606hM1354a == null || iY < 0) {
            return null;
        }
        Bitmap bitmapM1283a = C0628f.m1362b().m1283a(interfaceC0606hM1354a, iY, enumC0590ad);
        if (bitmapM1283a == null || bitmapM1283a.getWidth() == 0 || bitmapM1283a.getHeight() == 0) {
            return null;
        }
        if (i > 0 && i2 != 0) {
            float height = i / bitmapM1283a.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate(i2);
            matrix.postScale(height, height);
            return Bitmap.createBitmap(bitmapM1283a, 0, 0, bitmapM1283a.getWidth(), bitmapM1283a.getHeight(), matrix, true);
        }
        return bitmapM1283a;
    }

    /* renamed from: a */
    public static boolean m1267a(View view, int i, int i2, int i3) {
        float f = (i == 0 || i2 == 0) ? 0.6666667f : i / i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i4 = ((int) (f * i3)) + 8;
        int i5 = i3 + 8;
        if (i4 == layoutParams.width && i5 == layoutParams.height) {
            return false;
        }
        layoutParams.width = i4;
        layoutParams.height = i5;
        view.requestLayout();
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m1261a(View view, Bitmap bitmap, int i, boolean z) {
        if (i != 0) {
            m1267a(view, bitmap.getWidth(), bitmap.getHeight(), i);
        }
        if (view instanceof FastThumbView) {
            ((FastThumbView) view).m2377a(bitmap, z);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageBitmap(bitmap);
        } else {
            view.setBackgroundDrawable(new BitmapDrawable(bitmap));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1262a(View view, Drawable drawable) {
        if (view instanceof FastThumbView) {
            ((FastThumbView) view).setImageDrawable$4eb43225(drawable);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
