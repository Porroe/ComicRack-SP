package com.cyo.common.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.cyo.common.C0950af;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.t */
/* loaded from: classes.dex */
public final class C1165t {

    /* renamed from: l */
    private static /* synthetic */ int[] f3684l;

    /* renamed from: a */
    public EnumC1164s f3685a;

    /* renamed from: b */
    public int f3686b;

    /* renamed from: c */
    public int f3687c;

    /* renamed from: d */
    public boolean f3688d;

    /* renamed from: e */
    public boolean f3689e;

    /* renamed from: f */
    public float f3690f;

    /* renamed from: g */
    public int f3691g;

    /* renamed from: h */
    public int f3692h;

    /* renamed from: i */
    public float f3693i;

    /* renamed from: j */
    public float f3694j;

    /* renamed from: k */
    public float f3695k;

    public final /* synthetic */ Object clone() {
        return m2482p();
    }

    /* renamed from: s */
    private static /* synthetic */ int[] m2461s() {
        int[] iArr = f3684l;
        if (iArr == null) {
            iArr = new int[EnumC1164s.valuesCustom().length];
            try {
                iArr[EnumC1164s.FitAll.ordinal()] = 7;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1164s.FitBest.ordinal()] = 5;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1164s.FitHeight.ordinal()] = 4;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1164s.FitInside.ordinal()] = 6;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1164s.FitWidth.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1164s.None.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC1164s.Original.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            f3684l = iArr;
        }
        return iArr;
    }

    public C1165t() {
        this.f3685a = EnumC1164s.FitWidth;
        this.f3690f = 1.0f;
        this.f3695k = 0.05f;
    }

    public C1165t(C1165t c1165t) {
        this.f3685a = EnumC1164s.FitWidth;
        this.f3690f = 1.0f;
        this.f3695k = 0.05f;
        this.f3686b = c1165t.f3686b;
        this.f3687c = c1165t.f3687c;
        this.f3692h = c1165t.f3692h;
        this.f3691g = c1165t.f3691g;
        this.f3688d = c1165t.f3688d;
        this.f3689e = c1165t.f3689e;
        this.f3693i = c1165t.f3693i;
        this.f3694j = c1165t.f3694j;
        this.f3685a = c1165t.f3685a;
        this.f3690f = c1165t.f3690f;
        this.f3695k = c1165t.f3695k;
    }

    public C1165t(EnumC1164s enumC1164s) {
        this.f3685a = EnumC1164s.FitWidth;
        this.f3690f = 1.0f;
        this.f3695k = 0.05f;
        this.f3685a = enumC1164s;
    }

    /* renamed from: a */
    public final boolean m2466a() {
        return this.f3687c > 0 && this.f3686b > 0 && this.f3691g > 0 && this.f3692h > 0 && this.f3690f > 0.0f;
    }

    /* renamed from: b */
    public final boolean m2468b() {
        return m2471e() > 1.0f;
    }

    /* renamed from: c */
    public final boolean m2469c() {
        return m2471e() < (((float) this.f3691g) - m2477k()) - 1.0f;
    }

    /* renamed from: q */
    private boolean m2459q() {
        return m2472f() > 1.0f;
    }

    /* renamed from: r */
    private boolean m2460r() {
        return m2472f() < (((float) this.f3692h) - m2478l()) - 1.0f;
    }

    /* renamed from: d */
    public final C1166u m2470d() {
        int pageWidth = this.f3691g;
        int pageHeight = this.f3692h;
        if (this.f3688d && (this.f3689e || pageWidth > pageHeight)) {
            pageWidth /= 2;
        }
        if (pageWidth == 0 || pageHeight == 0 || this.f3686b == 0 || this.f3687c == 0) {
            return new C1166u(this.f3690f, this.f3690f);
        }

        float scaleX = (float) this.f3686b / pageWidth;
        float scaleY = (float) this.f3687c / pageHeight;
        int fitting = m2461s()[this.f3685a.ordinal()];
        switch (fitting) {
            case 2:
                scaleX = 1.0f;
                scaleY = 1.0f;
                break;
            case 3:
                if (!C0950af.m1992b(scaleY, scaleX, scaleX * this.f3695k)) {
                    scaleY = scaleX;
                }
                break;
            case 4:
                if (!C0950af.m1992b(scaleX, scaleY, scaleY * this.f3695k)) {
                    scaleX = scaleY;
                }
                break;
            case 5:
            case 6:
            case 7:
                float target = fitting == 6 ? Math.max(scaleX, scaleY) : Math.min(scaleX, scaleY);
                float tolerance = target * this.f3695k;
                if (!C0950af.m1992b(scaleX, target, tolerance)) {
                    scaleX = target;
                }
                if (!C0950af.m1992b(scaleY, target, tolerance)) {
                    scaleY = target;
                }
                break;
            default:
                break;
        }
        return new C1166u(scaleX * this.f3690f, scaleY * this.f3690f);
    }

    /* renamed from: e */
    public final float m2471e() {
        return m2454a(this.f3693i);
    }

    /* renamed from: f */
    public final float m2472f() {
        return m2457b(this.f3694j);
    }

    /* renamed from: g */
    public final float m2473g() {
        return Math.max(this.f3691g - m2477k(), 0.0f);
    }

    /* renamed from: h */
    public final float m2474h() {
        return Math.max(this.f3692h - m2478l(), 0.0f);
    }

    /* renamed from: i */
    public final int m2475i() {
        return (int) (m2470d().f3696a * this.f3691g);
    }

    /* renamed from: j */
    public final int m2476j() {
        return (int) (m2470d().f3697b * this.f3692h);
    }

    /* renamed from: k */
    public final float m2477k() {
        return this.f3686b / m2470d().f3696a;
    }

    /* renamed from: l */
    public final float m2478l() {
        return this.f3687c / m2470d().f3697b;
    }

    /* renamed from: m */
    public final float m2479m() {
        return m2472f() + m2478l();
    }

    /* renamed from: n */
    public final float m2480n() {
        return m2471e() + m2477k();
    }

    /* renamed from: a */
    public final void m2463a(float f, float f2) {
        this.f3693i = Math.max(Math.min(f, m2473g()), 0.0f);
        this.f3694j = Math.max(Math.min(f2, m2474h()), 0.0f);
    }

    /* renamed from: o */
    public final Matrix m2481o() {
        C1166u c1166uM2470d = m2470d();
        float fM2475i = m2475i();
        float fM2476j = m2476j();
        float fM2471e = fM2475i > ((float) this.f3686b) ? m2471e() * c1166uM2470d.f3696a : (fM2475i - this.f3686b) / 2.0f;
        float fM2472f = fM2476j > ((float) this.f3687c) ? m2472f() * c1166uM2470d.f3697b : (fM2476j - this.f3687c) / 2.0f;
        Matrix matrix = new Matrix();
        matrix.preTranslate(-fM2471e, -fM2472f);
        matrix.preScale(c1166uM2470d.f3696a, c1166uM2470d.f3697b);
        return matrix;
    }

    /* renamed from: a */
    public final void m2464a(float f, float f2, float f3) {
        float fM2477k = m2477k();
        float fM2478l = m2478l();
        float fM2471e = m2471e();
        float fM2472f = m2472f();
        float f4 = this.f3690f / f3;
        float f5 = fM2477k * f4;
        this.f3690f = f3;
        this.f3693i = m2454a((((fM2477k / 2.0f) - (f - fM2471e)) * f4) + (f - (f5 / 2.0f)));
        this.f3694j = m2457b((f2 - ((fM2478l * f4) / 2.0f)) + (((fM2478l / 2.0f) - (f2 - fM2472f)) * f4));
    }

    /* renamed from: b */
    public final PointF m2467b(float f, float f2) {
        float[] fArr = new float[2];
        Matrix matrix = new Matrix();
        m2481o().invert(matrix);
        matrix.mapPoints(fArr, new float[]{f, f2});
        return new PointF(fArr[0], fArr[1]);
    }

    /* renamed from: p */
    public final C1165t m2482p() {
        return new C1165t(this);
    }

    /* renamed from: a */
    public final int m2462a(List<C1165t> positions, float overlap, boolean singlePage, boolean rightToLeft) {
        if (!singlePage) {
            int current = m2462a(positions, overlap, true, false);
            int columns = 0;
            while (columns < positions.size() && (int) positions.get(columns).m2472f() <= 0) {
                columns++;
            }
            if (columns <= 1) {
                return current;
            }

            List<C1165t> split = new ArrayList<>();
            int midpoint = this.f3691g / 2;
            int rows = positions.size() / columns;
            int halfColumns = (columns - 1) / 2 + 1;
            int currentSplit = 0;
            C1165t previous = null;
            for (int half = 0; half < 2; half++) {
                int side = rightToLeft ? 1 - half : half;
                for (int row = 0; row < rows; row++) {
                    for (int column = 0; column < halfColumns; column++) {
                        int offset = rightToLeft ? halfColumns - 1 - column : column;
                        int index = row * columns + side * columns / 2 + offset;
                        C1165t position = positions.get(index).m2482p();
                        position.f3693i = side == 0
                                ? Math.min(position.m2471e(), midpoint - position.m2477k())
                                : Math.max(position.m2471e(), (float) midpoint);
                        if (previous == null || position.m2471e() != previous.m2471e()
                                || position.m2472f() != previous.m2472f()) {
                            split.add(position);
                        }
                        if (current == index) {
                            int center = (int) (position.m2471e() + position.m2477k() / 2.0f);
                            if ((side == 0 && center < midpoint) || (side == 1 && center >= midpoint)) {
                                currentSplit = split.size() - 1;
                            }
                        }
                        previous = position;
                    }
                }
            }
            positions.clear();
            positions.addAll(split);
            return currentSplit;
        }

        C1165t current = m2482p();
        C1165t position = m2482p();
        float widthThreshold = 1.1f * overlap * position.m2477k();
        float heightThreshold = 1.1f * overlap * position.m2478l();
        float widthStep = position.m2477k() * (1.0f - overlap);
        float heightStep = position.m2478l() * (1.0f - overlap);
        positions.clear();
        positions.add(current);

        while (m2456a(position, rightToLeft) || position.m2459q()) {
            if (m2456a(position, rightToLeft)) {
                position.m2463a(m2455a(position, widthStep, widthThreshold, rightToLeft), position.m2472f());
            } else {
                float y = position.m2472f() - heightStep;
                position.m2463a(rightToLeft ? 0 : position.f3691g, y < heightThreshold ? 0 : y);
            }
            positions.add(0, position.m2482p());
        }

        position = m2482p();
        while (m2458b(position, rightToLeft) || position.m2460r()) {
            if (m2458b(position, rightToLeft)) {
                position.m2463a(m2455a(position, widthStep, widthThreshold, !rightToLeft), position.m2472f());
            } else {
                float y = position.m2472f() + heightStep;
                float lastY = position.f3692h - position.m2478l();
                position.m2463a(rightToLeft ? position.f3691g : 0, lastY - y < heightThreshold ? lastY : y);
            }
            positions.add(position.m2482p());
        }
        return positions.indexOf(current);
    }

    /* renamed from: a */
    public final void m2465a(int i, int i2) {
        this.f3691g = i;
        this.f3692h = i2;
    }

    /* renamed from: a */
    private float m2454a(float f) {
        return Math.min(this.f3691g - (this.f3686b / m2470d().f3696a), Math.max(0.0f, f));
    }

    /* renamed from: b */
    private float m2457b(float f) {
        return Math.min(this.f3692h - (this.f3687c / m2470d().f3697b), Math.max(0.0f, f));
    }

    /* renamed from: a */
    private static boolean m2456a(C1165t c1165t, boolean z) {
        return z ? c1165t.m2469c() : c1165t.m2468b();
    }

    /* renamed from: b */
    private static boolean m2458b(C1165t c1165t, boolean z) {
        return m2456a(c1165t, !z);
    }

    /* renamed from: a */
    private static float m2455a(C1165t c1165t, float f, float f2, boolean z) {
        if (z) {
            float fM2471e = c1165t.m2471e() + f;
            if ((c1165t.f3691g - fM2471e) - c1165t.m2477k() < f2) {
                return c1165t.f3691g - c1165t.m2477k();
            }
            return fM2471e;
        }
        float fM2471e2 = c1165t.m2471e() - f;
        if (fM2471e2 < f2) {
            return 0.0f;
        }
        return fM2471e2;
    }
}
