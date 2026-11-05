package com.cyo.common.p022a;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.f */
/* loaded from: classes.dex */
public final class C0935f {

    /* renamed from: d */
    private LinkedList f2815d = new LinkedList();

    /* renamed from: a */
    public int f2812a = 256;

    /* renamed from: b */
    public float f2813b = 0.1f;

    /* renamed from: c */
    public boolean f2814c = false;

    /* renamed from: a */
    public final Bitmap m1966a(String str) {
        Bitmap bitmap;
        synchronized (this.f2815d) {
            C0936g c0936gM1965b = m1965b(str);
            if (c0936gM1965b == null || (bitmap = (Bitmap) c0936gM1965b.f2817b.f2818a) == null) {
                return null;
            }
            m1964a(c0936gM1965b);
            return bitmap;
        }
    }

    /* renamed from: a */
    public final Bitmap m1967a(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        if (this.f2812a != 0 && bitmap != null) {
            synchronized (this.f2815d) {
                C0936g c0936gM1965b = m1965b(str);
                if (c0936gM1965b != null) {
                    m1964a(c0936gM1965b);
                    Bitmap bitmap3 = (Bitmap) c0936gM1965b.f2817b.f2818a;
                    if (bitmap3 == null) {
                        c0936gM1965b.f2817b = new C0937h(bitmap);
                    } else {
                        if (this.f2814c && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        bitmap = bitmap3;
                    }
                } else {
                    C0936g c0936g = new C0936g((byte) 0);
                    c0936g.f2816a = str;
                    c0936g.f2817b = new C0937h(bitmap);
                    this.f2815d.addFirst(c0936g);
                    synchronized (this.f2815d) {
                        if (this.f2815d.size() >= this.f2812a) {
                            ListIterator listIterator = this.f2815d.listIterator();
                            while (listIterator.hasNext()) {
                                Bitmap bitmap4 = (Bitmap) ((C0936g) listIterator.next()).f2817b.f2818a;
                                if (bitmap4 == null || bitmap4.isRecycled()) {
                                    listIterator.remove();
                                }
                            }
                            int i = (int) (this.f2812a * (1.0f - this.f2813b));
                            while (this.f2815d.size() > i) {
                                if (this.f2814c && (bitmap2 = (Bitmap) ((C0936g) this.f2815d.getLast()).f2817b.f2818a) != null) {
                                    bitmap2.recycle();
                                }
                                this.f2815d.removeLast();
                            }
                        }
                    }
                }
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    private C0936g m1965b(String str) {
        Iterator it = this.f2815d.iterator();
        while (it.hasNext()) {
            C0936g c0936g = (C0936g) it.next();
            if (c0936g.f2816a.equals(str)) {
                return c0936g;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m1964a(C0936g c0936g) {
        this.f2815d.remove(c0936g);
        this.f2815d.addFirst(c0936g);
    }
}
