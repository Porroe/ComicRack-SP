package android.support.v4.widget;

import android.support.v4.view.C0141ab;
import android.support.v4.view.C0159at;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.w */
/* loaded from: classes.dex */
public final class C0240w {

    // The APK has no constructor for this class.
    private C0240w() {
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: v */
    private static final Interpolator f626v = new InterpolatorC0241x();

    /* renamed from: a */
    private int f627a;

    /* renamed from: b */
    private int f628b;

    /* renamed from: c */
    private int f629c;

    /* renamed from: d */
    private float[] f630d;

    /* renamed from: e */
    private float[] f631e;

    /* renamed from: f */
    private float[] f632f;

    /* renamed from: g */
    private float[] f633g;

    /* renamed from: h */
    private int[] f634h;

    /* renamed from: i */
    private int[] f635i;

    /* renamed from: j */
    private int[] f636j;

    /* renamed from: k */
    private int f637k;

    /* renamed from: l */
    private VelocityTracker f638l;

    /* renamed from: m */
    private float f639m;

    /* renamed from: n */
    private float f640n;

    /* renamed from: o */
    private int f641o;

    /* renamed from: p */
    private int f642p;

    /* renamed from: q */
    private C0230m f643q;

    /* renamed from: r */
    private final AbstractC0242y f644r;

    /* renamed from: s */
    private View f645s;

    /* renamed from: t */
    private boolean f646t;

    /* renamed from: u */
    private final ViewGroup f647u;

    /* renamed from: w */
    private final Runnable f648w;

    /* renamed from: a */
    public final int m575a() {
        return this.f627a;
    }

    /* renamed from: a */
    public final void m576a(int i) {
        this.f642p = i;
    }

    /* renamed from: b */
    public final int m581b() {
        return this.f641o;
    }

    /* renamed from: a */
    public final void m577a(View view, int i) {
        if (view.getParent() != this.f647u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f647u + ")");
        }
        this.f645s = view;
        this.f629c = i;
        this.f644r.mo535b(view);
        m572c(1);
    }

    /* renamed from: c */
    public final View m584c() {
        return this.f645s;
    }

    /* renamed from: d */
    public final int m585d() {
        return this.f628b;
    }

    /* renamed from: e */
    public final void m586e() {
        this.f629c = -1;
        if (this.f630d != null) {
            Arrays.fill(this.f630d, 0.0f);
            Arrays.fill(this.f631e, 0.0f);
            Arrays.fill(this.f632f, 0.0f);
            Arrays.fill(this.f633g, 0.0f);
            Arrays.fill(this.f634h, 0);
            Arrays.fill(this.f635i, 0);
            Arrays.fill(this.f636j, 0);
            this.f637k = 0;
        }
        if (this.f638l != null) {
            this.f638l.recycle();
            this.f638l = null;
        }
    }

    /* renamed from: f */
    public final void m587f() {
        m586e();
        if (this.f627a == 2) {
            this.f643q.m551a();
            this.f643q.m552b();
            this.f643q.m553c();
            int iM551a = this.f643q.m551a();
            this.f643q.m552b();
            this.f644r.mo531a(this.f645s, iM551a);
        }
        m572c(0);
    }

    /* renamed from: a */
    public final boolean m580a(View view, int i, int i2) {
        this.f645s = view;
        this.f629c = -1;
        boolean zM565a = m565a(i, i2, 0, 0);
        if (!zM565a && this.f627a == 0 && this.f645s != null) {
            this.f645s = null;
        }
        return zM565a;
    }

    /* renamed from: a */
    public final boolean m578a(int i, int i2) {
        if (!this.f646t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m565a(i, i2, (int) C0159at.m420a(this.f638l, this.f629c), (int) C0159at.m421b(this.f638l, this.f629c));
    }

    /* renamed from: a */
    private boolean m565a(int i, int i2, int i3, int i4) {
        int left = i - this.f645s.getLeft();
        int top = i2 - this.f645s.getTop();
        if (left == 0 && top == 0) {
            this.f643q.m553c();
            m572c(0);
            return false;
        }
        View view = this.f645s;
        int iM567b = m567b(i3, (int) this.f640n, (int) this.f639m);
        int iM567b2 = m567b(i4, (int) this.f640n, (int) this.f639m);
        Math.abs(left);
        Math.abs(top);
        Math.abs(iM567b);
        Math.abs(iM567b2);
        m561a(left, iM567b, this.f644r.mo536c(view));
        AbstractC0242y abstractC0242y = this.f644r;
        m561a(top, iM567b2, 0);
        C0230m c0230m = this.f643q;
        InterfaceC0231n interfaceC0231n = c0230m.f616b;
        Object obj = c0230m.f615a;
        m572c(2);
        return true;
    }

    /* renamed from: a */
    private int m561a(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.f647u.getWidth() / 2;
        float fSin = (((float) Math.sin((float) ((Math.min(1.0f, (float) Math.abs(i) / this.f647u.getWidth()) - 0.5f) * 0.4712389167638204d))) * width) + width;
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    /* renamed from: b */
    private static int m567b(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    /* renamed from: a */
    private static float m560a(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    /* renamed from: g */
    public final boolean m588g() {
        if (this.f627a == 2) {
            C0230m c0230m = this.f643q;
            InterfaceC0231n interfaceC0231n = c0230m.f616b;
            Object obj = c0230m.f615a;
            boolean zM556c = interfaceC0231n.m556c();
            int iM551a = this.f643q.m551a();
            int iM552b = this.f643q.m552b();
            int left = iM551a - this.f645s.getLeft();
            int top = iM552b - this.f645s.getTop();
            if (left != 0) {
                this.f645s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f645s.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f644r.mo531a(this.f645s, iM551a);
            }
            if (zM556c) {
                C0230m c0230m2 = this.f643q;
                InterfaceC0231n interfaceC0231n2 = c0230m2.f616b;
                Object obj2 = c0230m2.f615a;
                if (iM551a == interfaceC0231n2.m557d()) {
                    C0230m c0230m3 = this.f643q;
                    InterfaceC0231n interfaceC0231n3 = c0230m3.f616b;
                    Object obj3 = c0230m3.f615a;
                    if (iM552b == interfaceC0231n3.m558e()) {
                        this.f643q.m553c();
                        zM556c = false;
                    }
                }
            }
            if (!zM556c) {
                this.f647u.post(this.f648w);
            }
        }
        return this.f627a == 2;
    }

    /* renamed from: a */
    private void m562a(float f) {
        this.f646t = true;
        this.f644r.mo530a(this.f645s, f);
        this.f646t = false;
        if (this.f627a == 1) {
            m572c(0);
        }
    }

    /* renamed from: b */
    private void m569b(int i) {
        if (this.f630d != null) {
            this.f630d[i] = 0.0f;
            this.f631e[i] = 0.0f;
            this.f632f[i] = 0.0f;
            this.f633g[i] = 0.0f;
            this.f634h[i] = 0;
            this.f635i[i] = 0;
            this.f636j[i] = 0;
            this.f637k &= (1 << i) ^ (-1);
        }
    }

    /* renamed from: a */
    private void m563a(float f, float f2, int i) {
        if (this.f630d == null || this.f630d.length <= i) {
            float[] fArr = new float[i + 1];
            float[] fArr2 = new float[i + 1];
            float[] fArr3 = new float[i + 1];
            float[] fArr4 = new float[i + 1];
            int[] iArr = new int[i + 1];
            int[] iArr2 = new int[i + 1];
            int[] iArr3 = new int[i + 1];
            if (this.f630d != null) {
                System.arraycopy(this.f630d, 0, fArr, 0, this.f630d.length);
                System.arraycopy(this.f631e, 0, fArr2, 0, this.f631e.length);
                System.arraycopy(this.f632f, 0, fArr3, 0, this.f632f.length);
                System.arraycopy(this.f633g, 0, fArr4, 0, this.f633g.length);
                System.arraycopy(this.f634h, 0, iArr, 0, this.f634h.length);
                System.arraycopy(this.f635i, 0, iArr2, 0, this.f635i.length);
                System.arraycopy(this.f636j, 0, iArr3, 0, this.f636j.length);
            }
            this.f630d = fArr;
            this.f631e = fArr2;
            this.f632f = fArr3;
            this.f633g = fArr4;
            this.f634h = iArr;
            this.f635i = iArr2;
            this.f636j = iArr3;
        }
        float[] fArr5 = this.f630d;
        this.f632f[i] = f;
        fArr5[i] = f;
        float[] fArr6 = this.f631e;
        this.f633g[i] = f2;
        fArr6[i] = f2;
        int[] iArr4 = this.f634h;
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = i2 < this.f647u.getLeft() + this.f641o ? 1 : 0;
        if (i3 < this.f647u.getTop() + this.f641o) {
            i4 |= 4;
        }
        if (i2 > this.f647u.getRight() - this.f641o) {
            i4 |= 2;
        }
        if (i3 > this.f647u.getBottom() - this.f641o) {
            i4 |= 8;
        }
        iArr4[i] = i4;
        this.f637k |= 1 << i;
    }

    /* renamed from: c */
    private void m573c(MotionEvent motionEvent) {
        int iM396c = C0141ab.m396c(motionEvent);
        for (int i = 0; i < iM396c; i++) {
            int iM394b = C0141ab.m394b(motionEvent, i);
            float fM395c = C0141ab.m395c(motionEvent, i);
            float fM397d = C0141ab.m397d(motionEvent, i);
            this.f632f[iM394b] = fM395c;
            this.f633g[iM394b] = fM397d;
        }
    }

    /* renamed from: c */
    private void m572c(int i) {
        if (this.f627a != i) {
            this.f627a = i;
            this.f644r.mo528a(i);
            if (this.f627a == 0) {
                this.f645s = null;
            }
        }
    }

    /* renamed from: b */
    private boolean m570b(View view, int i) {
        if (view == this.f645s && this.f629c == i) {
            return true;
        }
        if (view != null && this.f644r.mo532a(view)) {
            this.f629c = i;
            m577a(view, i);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m579a(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.C0240w.m579a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void m583b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int iM391a = C0141ab.m391a(motionEvent);
        int iM393b = C0141ab.m393b(motionEvent);
        if (iM391a == 0) {
            m586e();
        }
        if (this.f638l == null) {
            this.f638l = VelocityTracker.obtain();
        }
        this.f638l.addMovement(motionEvent);
        switch (iM391a) {
            case TwitterResponse.NONE /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int iM394b = C0141ab.m394b(motionEvent, 0);
                View viewM582b = m582b((int) x, (int) y);
                m563a(x, y, iM394b);
                m570b(viewM582b, iM394b);
                if ((this.f634h[iM394b] & this.f642p) != 0) {
                    AbstractC0242y abstractC0242y = this.f644r;
                    int i3 = this.f642p;
                    abstractC0242y.mo534b();
                    break;
                }
                break;
            case TwitterResponse.READ /* 1 */:
                if (this.f627a == 1) {
                    m574i();
                }
                m586e();
                break;
            case TwitterResponse.READ_WRITE /* 2 */:
                if (this.f627a == 1) {
                    int iM392a = C0141ab.m392a(motionEvent, this.f629c);
                    float fM395c = C0141ab.m395c(motionEvent, iM392a);
                    float fM397d = C0141ab.m397d(motionEvent, iM392a);
                    int i4 = (int) (fM395c - this.f632f[this.f629c]);
                    int i5 = (int) (fM397d - this.f633g[this.f629c]);
                    int left = this.f645s.getLeft() + i4;
                    this.f645s.getTop();
                    int left2 = this.f645s.getLeft();
                    int top = this.f645s.getTop();
                    if (i4 != 0) {
                        left = this.f644r.mo533b(this.f645s, left);
                        this.f645s.offsetLeftAndRight(left - left2);
                    }
                    if (i5 != 0) {
                        this.f645s.offsetTopAndBottom(this.f644r.mo537d(this.f645s) - top);
                    }
                    if (i4 != 0 || i5 != 0) {
                        this.f644r.mo531a(this.f645s, left);
                    }
                    m573c(motionEvent);
                    break;
                } else {
                    int iM396c = C0141ab.m396c(motionEvent);
                    while (i2 < iM396c) {
                        int iM394b2 = C0141ab.m394b(motionEvent, i2);
                        float fM395c2 = C0141ab.m395c(motionEvent, i2);
                        float fM397d2 = C0141ab.m397d(motionEvent, i2);
                        float f = fM395c2 - this.f630d[iM394b2];
                        m568b(f, fM397d2 - this.f631e[iM394b2], iM394b2);
                        if (this.f627a != 1) {
                            View viewM582b2 = m582b((int) fM395c2, (int) fM397d2);
                            if (!m566a(viewM582b2, f) || !m570b(viewM582b2, iM394b2)) {
                                i2++;
                            }
                        }
                        m573c(motionEvent);
                        break;
                    }
                    m573c(motionEvent);
                }
                break;
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                if (this.f627a == 1) {
                    m562a(0.0f);
                }
                m586e();
                break;
            case 5:
                int iM394b3 = C0141ab.m394b(motionEvent, iM393b);
                float fM395c3 = C0141ab.m395c(motionEvent, iM393b);
                float fM397d3 = C0141ab.m397d(motionEvent, iM393b);
                m563a(fM395c3, fM397d3, iM394b3);
                if (this.f627a == 0) {
                    m570b(m582b((int) fM395c3, (int) fM397d3), iM394b3);
                    if ((this.f634h[iM394b3] & this.f642p) != 0) {
                        AbstractC0242y abstractC0242y2 = this.f644r;
                        int i6 = this.f642p;
                        abstractC0242y2.mo534b();
                        break;
                    }
                } else {
                    if (m571b(this.f645s, (int) fM395c3, (int) fM397d3)) {
                        m570b(this.f645s, iM394b3);
                        break;
                    }
                }
                break;
            case 6:
                int iM394b4 = C0141ab.m394b(motionEvent, iM393b);
                if (this.f627a == 1 && iM394b4 == this.f629c) {
                    int iM396c2 = C0141ab.m396c(motionEvent);
                    while (true) {
                        if (i2 >= iM396c2) {
                            i = -1;
                            break;
                        } else {
                            int iM394b5 = C0141ab.m394b(motionEvent, i2);
                            if (iM394b5 != this.f629c) {
                                if (m582b((int) C0141ab.m395c(motionEvent, i2), (int) C0141ab.m397d(motionEvent, i2)) == this.f645s && m570b(this.f645s, iM394b5)) {
                                    i = this.f629c;
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        m574i();
                    }
                }
                m569b(iM394b4);
                break;
        }
    }

    /* renamed from: b */
    private void m568b(float f, float f2, int i) {
        int i2 = m564a(f, f2, i, 1) ? 1 : 0;
        if (m564a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m564a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m564a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f635i;
            iArr[i] = iArr[i] | i2;
            this.f644r.mo529a(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m564a(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f634h[i] & i2) != i2 || (this.f642p & i2) == 0 || (this.f636j[i] & i2) == i2 || (this.f635i[i] & i2) == i2) {
            return false;
        }
        if (fAbs <= this.f628b && fAbs2 <= this.f628b) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            AbstractC0242y abstractC0242y = this.f644r;
        }
        return (this.f635i[i] & i2) == 0 && fAbs > ((float) this.f628b);
    }

    /* renamed from: a */
    private boolean m566a(View view, float f) {
        if (view == null) {
            return false;
        }
        boolean z = this.f644r.mo536c(view) > 0;
        AbstractC0242y abstractC0242y = this.f644r;
        return z && Math.abs(f) > ((float) this.f628b);
    }

    /* renamed from: h */
    public final boolean m589h() {
        boolean z;
        int length = this.f630d.length;
        for (int i = 0; i < length; i++) {
            if ((this.f637k & (1 << i)) != 0) {
                float f = this.f632f[i] - this.f630d[i];
                float f2 = this.f633g[i] - this.f631e[i];
                z = (f * f) + (f2 * f2) > ((float) (this.f628b * this.f628b));
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m574i() {
        this.f638l.computeCurrentVelocity(1000, this.f639m);
        float fM560a = m560a(C0159at.m420a(this.f638l, this.f629c), this.f640n, this.f639m);
        m560a(C0159at.m421b(this.f638l, this.f629c), this.f640n, this.f639m);
        m562a(fM560a);
    }

    /* renamed from: b */
    public static boolean m571b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: b */
    public final View m582b(int i, int i2) {
        for (int childCount = this.f647u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f647u;
            AbstractC0242y abstractC0242y = this.f644r;
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}
