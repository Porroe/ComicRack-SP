package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.p */
/* loaded from: classes.dex */
final class C0207p implements InterfaceC0206o {

    /* renamed from: e */
    private static final int f525e = ViewConfiguration.getLongPressTimeout();

    /* renamed from: f */
    private static final int f526f = ViewConfiguration.getTapTimeout();

    /* renamed from: g */
    private static final int f527g = ViewConfiguration.getDoubleTapTimeout();

    /* renamed from: a */
    private int f528a;

    /* renamed from: b */
    private int f529b;

    /* renamed from: c */
    private int f530c;

    /* renamed from: d */
    private int f531d;

    /* renamed from: h */
    private final Handler f532h = new HandlerC0208q(this);

    /* renamed from: i */
    private final GestureDetector.OnGestureListener f533i;

    /* renamed from: j */
    private GestureDetector.OnDoubleTapListener f534j;

    /* renamed from: k */
    private boolean f535k;

    /* renamed from: l */
    private boolean f536l;

    /* renamed from: m */
    private boolean f537m;

    /* renamed from: n */
    private boolean f538n;

    /* renamed from: o */
    private boolean f539o;

    /* renamed from: p */
    private MotionEvent f540p;

    /* renamed from: q */
    private MotionEvent f541q;

    /* renamed from: r */
    private boolean f542r;

    /* renamed from: s */
    private float f543s;

    /* renamed from: t */
    private float f544t;

    /* renamed from: u */
    private float f545u;

    /* renamed from: v */
    private float f546v;

    /* renamed from: w */
    private boolean f547w;

    /* renamed from: x */
    private VelocityTracker f548x;

    /* renamed from: a */
    static /* synthetic */ MotionEvent m485a(C0207p c0207p) {
        return c0207p.f540p;
    }

    /* renamed from: b */
    static /* synthetic */ GestureDetector.OnGestureListener m486b(C0207p c0207p) {
        return c0207p.f533i;
    }

    /* renamed from: c */
    static /* synthetic */ void m487c(C0207p c0207p) {
        c0207p.f532h.removeMessages(3);
        c0207p.f536l = false;
        c0207p.f537m = true;
        c0207p.f533i.onLongPress(c0207p.f540p);
    }

    /* renamed from: d */
    static /* synthetic */ GestureDetector.OnDoubleTapListener m488d(C0207p c0207p) {
        return c0207p.f534j;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m489e(C0207p c0207p) {
        return c0207p.f535k;
    }

    /* renamed from: f */
    static /* synthetic */ boolean m490f(C0207p c0207p) {
        c0207p.f536l = true;
        return true;
    }

    public C0207p(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f533i = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.f534j = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (this.f533i == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
        this.f547w = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.f530c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f531d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f528a = scaledTouchSlop * scaledTouchSlop;
        this.f529b = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    @Override // android.support.v4.view.InterfaceC0206o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo484a(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.C0207p.mo484a(android.view.MotionEvent):boolean");
    }
}
