package android.support.v4.view.p003a;

import android.graphics.Rect;
import android.os.Build;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.a.a */
/* loaded from: classes.dex */
public final class C0113a {

    /* renamed from: a */
    private static final InterfaceC0117d f462a;

    /* renamed from: b */
    private final Object f463b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f462a = new C0115b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f462a = new C0120g();
        } else if (Build.VERSION.SDK_INT >= 18) {
            f462a = new C0119f();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f462a = new C0118e();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f462a = new C0116c();
        } else {
            f462a = new C0121h();
        }
    }

    public C0113a(Object obj) {
        this.f463b = obj;
    }

    /* renamed from: a */
    public final Object m338a() {
        return this.f463b;
    }

    /* renamed from: a */
    public final void m339a(int i) {
        f462a.mo349a(this.f463b, i);
    }

    /* renamed from: b */
    public final void m342b() {
        f462a.mo368p(this.f463b);
    }

    /* renamed from: a */
    public final void m341a(boolean z) {
        f462a.mo352a(this.f463b, z);
    }

    /* renamed from: a */
    public final void m340a(CharSequence charSequence) {
        f462a.mo351a(this.f463b, charSequence);
    }

    public final int hashCode() {
        if (this.f463b == null) {
            return 0;
        }
        return this.f463b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0113a c0113a = (C0113a) obj;
            return this.f463b == null ? c0113a.f463b == null : this.f463b.equals(c0113a.f463b);
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        f462a.mo350a(this.f463b, rect);
        sb.append("; boundsInParent: " + rect);
        f462a.mo354b(this.f463b, rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(f462a.mo356d(this.f463b));
        sb.append("; className: ").append(f462a.mo353b(this.f463b));
        sb.append("; text: ").append(f462a.mo357e(this.f463b));
        sb.append("; contentDescription: ").append(f462a.mo355c(this.f463b));
        sb.append("; viewId: ").append(f462a.mo369q(this.f463b));
        sb.append("; checkable: ").append(f462a.mo358f(this.f463b));
        sb.append("; checked: ").append(f462a.mo359g(this.f463b));
        sb.append("; focusable: ").append(f462a.mo362j(this.f463b));
        sb.append("; focused: ").append(f462a.mo363k(this.f463b));
        sb.append("; selected: ").append(f462a.mo367o(this.f463b));
        sb.append("; clickable: ").append(f462a.mo360h(this.f463b));
        sb.append("; longClickable: ").append(f462a.mo364l(this.f463b));
        sb.append("; enabled: ").append(f462a.mo361i(this.f463b));
        sb.append("; password: ").append(f462a.mo365m(this.f463b));
        sb.append("; scrollable: " + f462a.mo366n(this.f463b));
        sb.append("; [");
        int iMo348a = f462a.mo348a(this.f463b);
        while (iMo348a != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iMo348a);
            int i = (iNumberOfTrailingZeros ^ (-1)) & iMo348a;
            switch (iNumberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str);
            if (i != 0) {
                sb.append(", ");
            }
            iMo348a = i;
        }
        sb.append("]");
        return sb.toString();
    }
}
