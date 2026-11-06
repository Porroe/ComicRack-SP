package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.p002c.C0098d;
import android.support.v4.p002c.C0099e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.r */
/* loaded from: classes.dex */
final class LayoutInflaterFactoryC0082r extends AbstractC0081q implements LayoutInflater.Factory {

    /* renamed from: A */
    static final Interpolator f293A;

    /* renamed from: B */
    static final Interpolator f294B;

    /* renamed from: C */
    static final Interpolator f295C;

    /* renamed from: a */
    static boolean f296a = false;

    /* renamed from: b */
    static final boolean f297b;

    /* renamed from: z */
    static final Interpolator f298z;

    /* renamed from: c */
    ArrayList f299c;

    /* renamed from: d */
    Runnable[] f300d;

    /* renamed from: e */
    boolean f301e;

    /* renamed from: f */
    ArrayList f302f;

    /* renamed from: g */
    ArrayList f303g;

    /* renamed from: h */
    ArrayList f304h;

    /* renamed from: i */
    ArrayList f305i;

    /* renamed from: j */
    ArrayList f306j;

    /* renamed from: k */
    ArrayList f307k;

    /* renamed from: l */
    ArrayList f308l;

    /* renamed from: m */
    ArrayList f309m;

    /* renamed from: o */
    ActivityC0076l f311o;

    /* renamed from: p */
    InterfaceC0080p f312p;

    /* renamed from: q */
    Fragment f313q;

    /* renamed from: r */
    boolean f314r;

    /* renamed from: s */
    boolean f315s;

    /* renamed from: t */
    boolean f316t;

    /* renamed from: u */
    String f317u;

    /* renamed from: v */
    boolean f318v;

    /* renamed from: n */
    int f310n = 0;

    /* renamed from: w */
    Bundle f319w = null;

    /* renamed from: x */
    SparseArray f320x = null;

    /* renamed from: y */
    Runnable f321y = new RunnableC0083s(this);

    LayoutInflaterFactoryC0082r() {
    }

    static {
        f297b = Build.VERSION.SDK_INT >= 11;
        f298z = new DecelerateInterpolator(2.5f);
        f293A = new DecelerateInterpolator(1.5f);
        f294B = new AccelerateInterpolator(2.5f);
        f295C = new AccelerateInterpolator(1.5f);
    }

    /* renamed from: a */
    private void m199a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0099e("FragmentManager"));
        if (this.f311o != null) {
            try {
                this.f311o.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            m218a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: a */
    public final AbstractC0004ab mo191a() {
        return new RunnableC0002a(this);
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: b */
    public final boolean mo194b() {
        return m232d();
    }

    /* renamed from: c */
    public final boolean m230c() {
        m207t();
        m232d();
        Handler handler = this.f311o.f273a;
        return m219a(-1, 0);
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: a */
    public final void mo192a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m217a((Runnable) new RunnableC0084t(this, i), false);
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: a */
    public final void mo193a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f60p < 0) {
            m199a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f60p);
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: a */
    public final Fragment mo189a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f302f.size()) {
            m199a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.f302f.get(i);
        if (fragment == null) {
            m199a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
            return fragment;
        }
        return fragment;
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: a */
    public final Fragment.SavedState mo188a(Fragment fragment) {
        Bundle bundleM204e;
        if (fragment.f60p < 0) {
            m199a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.f55k <= 0 || (bundleM204e = m204e(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleM204e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f313q != null) {
            C0098d.m272a(this.f313q, sb);
        } else {
            C0098d.m272a(this.f311o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m218a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f302f != null && (size6 = this.f302f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                Fragment fragment = (Fragment) this.f302f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.m32a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.f303g != null && (size5 = this.f303g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = (Fragment) this.f303g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f306j != null && (size4 = this.f306j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = (Fragment) this.f306j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        if (this.f305i != null && (size3 = this.f305i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                RunnableC0002a runnableC0002a = (RunnableC0002a) this.f305i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(runnableC0002a.toString());
                runnableC0002a.m98a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.f307k != null && (size2 = this.f307k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (RunnableC0002a) this.f307k.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.f308l != null && this.f308l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f308l.toArray()));
            }
        }
        if (this.f299c != null && (size = this.f299c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (Runnable) this.f299c.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.f311o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f312p);
        if (this.f313q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f313q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f310n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f315s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f316t);
        if (this.f314r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f314r);
        }
        if (this.f317u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f317u);
        }
        if (this.f304h != null && this.f304h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f304h.toArray()));
        }
    }

    /* renamed from: a */
    private static Animation m196a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f298z);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f293A);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* renamed from: a */
    private static Animation m195a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f293A);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    /* renamed from: a */
    private Animation m197a(Fragment fragment, int i, boolean z, int i2) {
        Animation animationLoadAnimation;
        int i3 = fragment.f36Q;
        Fragment.m8r();
        if (fragment.f36Q == 0 || (animationLoadAnimation = AnimationUtils.loadAnimation(this.f311o, fragment.f36Q)) == null) {
            if (i == 0) {
                return null;
            }
            char c = 65535;
            switch (i) {
                case 4097:
                    if (!z) {
                        c = 2;
                        break;
                    } else {
                        c = 1;
                        break;
                    }
                case 4099:
                    if (!z) {
                        c = 6;
                        break;
                    } else {
                        c = 5;
                        break;
                    }
                case 8194:
                    if (!z) {
                        c = 4;
                        break;
                    } else {
                        c = 3;
                        break;
                    }
            }
            if (c < 0) {
                return null;
            }
            switch (c) {
                case 1:
                    ActivityC0076l activityC0076l = this.f311o;
                    return m196a(1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    ActivityC0076l activityC0076l2 = this.f311o;
                    return m196a(1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    ActivityC0076l activityC0076l3 = this.f311o;
                    return m196a(0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    ActivityC0076l activityC0076l4 = this.f311o;
                    return m196a(1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    ActivityC0076l activityC0076l5 = this.f311o;
                    return m195a(0.0f, 1.0f);
                case 6:
                    ActivityC0076l activityC0076l6 = this.f311o;
                    return m195a(1.0f, 0.0f);
                default:
                    if (i2 == 0 && this.f311o.getWindow() != null) {
                        i2 = this.f311o.getWindow().getAttributes().windowAnimations;
                    }
                    return i2 == 0 ? null : null;
            }
        }
        return animationLoadAnimation;
    }

    /* renamed from: b */
    public final void m224b(Fragment fragment) {
        if (fragment.f40U) {
            if (this.f301e) {
                this.f318v = true;
            } else {
                fragment.f40U = false;
                m214a(fragment, this.f310n, 0, 0, false);
            }
        }
    }

    /* renamed from: a */
    final void m214a(Fragment fragment, int state, int transit, int style, boolean keepActive) {
        if ((!fragment.f66v || fragment.f30K) && state > 1) {
            state = 1;
        }
        if (fragment.f67w && state > fragment.f55k) {
            state = fragment.f55k;
        }
        if (fragment.f40U && fragment.f55k < 4 && state > 3) {
            state = 3;
        }

        if (fragment.f55k < state) {
            if (fragment.f69y && !fragment.f70z) {
                return;
            }
            if (fragment.f56l != null) {
                fragment.f56l = null;
                m214a(fragment, fragment.f57m, 0, 0, true);
            }
            switch (fragment.f55k) {
                case 0:
                    Bundle saved = fragment.f58n;
                    if (saved != null) {
                        saved.setClassLoader(this.f311o.getClassLoader());
                        fragment.f59o = saved.getSparseParcelableArray("android:view_state");
                        fragment.f63s = mo189a(saved, "android:target_state");
                        if (fragment.f63s != null) {
                            fragment.f65u = saved.getInt("android:target_req_state", 0);
                        }
                        fragment.f41V = saved.getBoolean("android:user_visible_hint", true);
                        if (!fragment.f41V) {
                            fragment.f40U = true;
                            state = Math.min(state, 3);
                        }
                    }
                    fragment.f23D = this.f311o;
                    fragment.f25F = this.f313q;
                    fragment.f22C = this.f313q == null ? this.f311o.f274b : this.f313q.f24E;
                    fragment.f35P = false;
                    fragment.mo28a(this.f311o);
                    if (!fragment.f35P) {
                        throw new C0067ck("Fragment " + fragment + " did not call through to super.onAttach()");
                    }
                    if (fragment.f25F == null) {
                        ActivityC0076l.m181c();
                    }
                    if (!fragment.f32M) {
                        fragment.m50f(fragment.f58n);
                    }
                    fragment.f32M = false;
                    if (fragment.f69y) {
                        fragment.f38S = fragment.m38b(fragment.mo37b(fragment.f58n), null, fragment.f58n);
                        fragment.f39T = fragment.f38S;
                        if (fragment.f38S != null) {
                            fragment.f38S = C0016an.m128a(fragment.f38S);
                            if (fragment.f29J) {
                                fragment.f38S.setVisibility(View.GONE);
                            }
                            Fragment.m9s();
                        }
                    }
                    // Fall through to the next requested lifecycle state.
                case 1:
                    if (state > 1) {
                        if (!fragment.f69y) {
                            ViewGroup container = null;
                            if (fragment.f27H != 0) {
                                container = (ViewGroup) this.f312p.mo177a(fragment.f27H);
                                if (container == null && !fragment.f20A) {
                                    m199a(new IllegalArgumentException("No view found for id 0x"
                                            + Integer.toHexString(fragment.f27H) + " ("
                                            + fragment.m56j().getResourceName(fragment.f27H)
                                            + ") for fragment " + fragment));
                                }
                            }
                            fragment.f37R = container;
                            fragment.f38S = fragment.m38b(fragment.mo37b(fragment.f58n), container, fragment.f58n);
                            fragment.f39T = fragment.f38S;
                            if (fragment.f38S != null) {
                                fragment.f38S = C0016an.m128a(fragment.f38S);
                                if (container != null) {
                                    Animation animation = m197a(fragment, transit, true, style);
                                    if (animation != null) {
                                        fragment.f38S.startAnimation(animation);
                                    }
                                    container.addView(fragment.f38S);
                                }
                                if (fragment.f29J) {
                                    fragment.f38S.setVisibility(View.GONE);
                                }
                                Fragment.m9s();
                            }
                        }
                        fragment.m52g(fragment.f58n);
                        if (fragment.f38S != null) {
                            fragment.m51g();
                        }
                        fragment.f58n = null;
                    }
                case 2:
                case 3:
                    if (state > 3) {
                        fragment.m17G();
                    }
                case 4:
                    if (state > 4) {
                        fragment.f68x = true;
                        fragment.m18H();
                        fragment.f58n = null;
                        fragment.f59o = null;
                    }
                    break;
            }
        } else if (fragment.f55k > state) {
            switch (fragment.f55k) {
                case 5:
                    if (state < 5) {
                        fragment.m20J();
                        fragment.f68x = false;
                    }
                case 4:
                    if (state < 4) {
                        fragment.m21K();
                    }
                case 3:
                    if (state < 3) {
                        fragment.m22L();
                    }
                case 2:
                    if (state < 2) {
                        if (fragment.f38S != null && !this.f311o.isFinishing() && fragment.f59o == null) {
                            m203d(fragment);
                        }
                        fragment.m23M();
                        if (fragment.f38S != null && fragment.f37R != null) {
                            Animation animation = this.f310n > 0 && !this.f316t
                                    ? m197a(fragment, transit, false, style) : null;
                            if (animation != null) {
                                fragment.f56l = fragment.f38S;
                                fragment.f57m = state;
                                animation.setAnimationListener(new AnimationAnimationListenerC0085u(this, fragment));
                                fragment.f38S.startAnimation(animation);
                            }
                            fragment.f37R.removeView(fragment.f38S);
                        }
                        fragment.f37R = null;
                        fragment.f38S = null;
                        fragment.f39T = null;
                    }
                case 1:
                    if (state == 0) {
                        if (this.f316t && fragment.f56l != null) {
                            View animating = fragment.f56l;
                            fragment.f56l = null;
                            animating.clearAnimation();
                        }
                        if (fragment.f56l != null) {
                            fragment.f57m = state;
                            state = 1;
                            break;
                        }
                        if (!fragment.f32M) {
                            fragment.m24N();
                        }
                        fragment.f35P = false;
                        fragment.mo42c();
                        if (!fragment.f35P) {
                            throw new C0067ck("Fragment " + fragment + " did not call through to super.onDetach()");
                        }
                        if (!keepActive) {
                            if (fragment.f32M) {
                                fragment.f23D = null;
                                fragment.f25F = null;
                                fragment.f22C = null;
                                fragment.f24E = null;
                            } else if (fragment.f60p >= 0) {
                                this.f302f.set(fragment.f60p, null);
                                if (this.f304h == null) {
                                    this.f304h = new ArrayList();
                                }
                                this.f304h.add(fragment.f60p);
                                this.f311o.m183a(fragment.f61q);
                                fragment.m65w();
                            }
                        }
                    }
                    break;
            }
        }
        fragment.f55k = state;
    }

    /* renamed from: c */
    private void m201c(Fragment fragment) {
        m214a(fragment, this.f310n, 0, 0, false);
    }

    /* renamed from: d */
    private void m202d(int i) {
        m210a(i, 0, 0, false);
    }

    /* renamed from: a */
    final void m210a(int i, int i2, int i3, boolean z) {
        if (this.f311o == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || this.f310n != i) {
            this.f310n = i;
            if (this.f302f != null) {
                int i4 = 0;
                boolean zMo113a = false;
                while (i4 < this.f302f.size()) {
                    Fragment fragment = (Fragment) this.f302f.get(i4);
                    if (fragment != null) {
                        m214a(fragment, i, i2, i3, false);
                        if (fragment.f42W != null) {
                            zMo113a |= fragment.f42W.mo113a();
                        }
                    }
                    i4++;
                    zMo113a = zMo113a;
                }
                if (!zMo113a) {
                    m206s();
                }
                if (this.f314r && this.f311o != null && this.f310n == 5) {
                    this.f311o.m186b();
                    this.f314r = false;
                }
            }
        }
    }

    /* renamed from: s */
    private void m206s() {
        if (this.f302f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f302f.size()) {
                    Fragment fragment = (Fragment) this.f302f.get(i2);
                    if (fragment != null) {
                        m224b(fragment);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m215a(Fragment fragment, boolean z) {
        if (this.f303g == null) {
            this.f303g = new ArrayList();
        }
        if (f296a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        if (fragment.f60p < 0) {
            if (this.f304h == null || this.f304h.size() <= 0) {
                if (this.f302f == null) {
                    this.f302f = new ArrayList();
                }
                fragment.m27a(this.f302f.size(), this.f313q);
                this.f302f.add(fragment);
            } else {
                fragment.m27a(((Integer) this.f304h.remove(this.f304h.size() - 1)).intValue(), this.f313q);
                this.f302f.set(fragment.f60p, fragment);
            }
            if (f296a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
        if (!fragment.f30K) {
            if (this.f303g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.f303g.add(fragment);
            fragment.f66v = true;
            fragment.f67w = false;
            if (fragment.f33N && fragment.f34O) {
                this.f314r = true;
            }
            if (z) {
                m201c(fragment);
            }
        }
    }

    /* renamed from: a */
    public final void m213a(Fragment fragment, int i, int i2) {
        if (f296a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f21B);
        }
        boolean z = !fragment.m54h();
        if (!fragment.f30K || z) {
            if (this.f303g != null) {
                this.f303g.remove(fragment);
            }
            if (fragment.f33N && fragment.f34O) {
                this.f314r = true;
            }
            fragment.f66v = false;
            fragment.f67w = true;
            m214a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    /* renamed from: b */
    public final void m225b(Fragment fragment, int i, int i2) {
        if (f296a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f29J) {
            fragment.f29J = true;
            if (fragment.f38S != null) {
                Animation animationM197a = m197a(fragment, i, false, i2);
                if (animationM197a != null) {
                    fragment.f38S.startAnimation(animationM197a);
                }
                fragment.f38S.setVisibility(8);
            }
            if (fragment.f66v && fragment.f33N && fragment.f34O) {
                this.f314r = true;
            }
            Fragment.m6n();
        }
    }

    /* renamed from: c */
    public final void m229c(Fragment fragment, int i, int i2) {
        if (f296a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f29J) {
            fragment.f29J = false;
            if (fragment.f38S != null) {
                Animation animationM197a = m197a(fragment, i, true, i2);
                if (animationM197a != null) {
                    fragment.f38S.startAnimation(animationM197a);
                }
                fragment.f38S.setVisibility(0);
            }
            if (fragment.f66v && fragment.f33N && fragment.f34O) {
                this.f314r = true;
            }
            Fragment.m6n();
        }
    }

    /* renamed from: d */
    public final void m231d(Fragment fragment, int i, int i2) {
        if (f296a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f30K) {
            fragment.f30K = true;
            if (fragment.f66v) {
                if (this.f303g != null) {
                    if (f296a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.f303g.remove(fragment);
                }
                if (fragment.f33N && fragment.f34O) {
                    this.f314r = true;
                }
                fragment.f66v = false;
                m214a(fragment, 1, i, i2, false);
            }
        }
    }

    /* renamed from: e */
    public final void m234e(Fragment fragment, int i, int i2) {
        if (f296a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f30K) {
            fragment.f30K = false;
            if (!fragment.f66v) {
                if (this.f303g == null) {
                    this.f303g = new ArrayList();
                }
                if (this.f303g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f296a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.f303g.add(fragment);
                fragment.f66v = true;
                if (fragment.f33N && fragment.f34O) {
                    this.f314r = true;
                }
                m214a(fragment, this.f310n, i, i2, false);
            }
        }
    }

    /* renamed from: e */
    private Fragment m205e(int i) {
        if (this.f303g != null) {
            for (int size = this.f303g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f303g.get(size);
                if (fragment != null && fragment.f26G == i) {
                    return fragment;
                }
            }
        }
        if (this.f302f != null) {
            for (int size2 = this.f302f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f302f.get(size2);
                if (fragment2 != null && fragment2.f26G == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.app.AbstractC0081q
    /* renamed from: a */
    public final Fragment mo190a(String str) {
        if (this.f303g != null && str != null) {
            for (int size = this.f303g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f303g.get(size);
                if (fragment != null && str.equals(fragment.f28I)) {
                    return fragment;
                }
            }
        }
        if (this.f302f != null && str != null) {
            for (int size2 = this.f302f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f302f.get(size2);
                if (fragment2 != null && str.equals(fragment2.f28I)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: t */
    private void m207t() {
        if (this.f315s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f317u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f317u);
        }
    }

    /* renamed from: a */
    public final void m217a(Runnable runnable, boolean z) {
        if (!z) {
            m207t();
        }
        synchronized (this) {
            if (this.f316t || this.f311o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f299c == null) {
                this.f299c = new ArrayList();
            }
            this.f299c.add(runnable);
            if (this.f299c.size() == 1) {
                this.f311o.f273a.removeCallbacks(this.f321y);
                this.f311o.f273a.post(this.f321y);
            }
        }
    }

    /* renamed from: a */
    public final int m209a(RunnableC0002a runnableC0002a) {
        int size;
        synchronized (this) {
            if (this.f308l == null || this.f308l.size() <= 0) {
                if (this.f307k == null) {
                    this.f307k = new ArrayList();
                }
                size = this.f307k.size();
                if (f296a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + runnableC0002a);
                }
                this.f307k.add(runnableC0002a);
            } else {
                size = ((Integer) this.f308l.remove(this.f308l.size() - 1)).intValue();
                if (f296a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + runnableC0002a);
                }
                this.f307k.set(size, runnableC0002a);
            }
        }
        return size;
    }

    /* renamed from: a */
    private void m198a(int i, RunnableC0002a runnableC0002a) {
        synchronized (this) {
            if (this.f307k == null) {
                this.f307k = new ArrayList();
            }
            int size = this.f307k.size();
            if (i < size) {
                if (f296a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + runnableC0002a);
                }
                this.f307k.set(i, runnableC0002a);
            } else {
                while (size < i) {
                    this.f307k.add(null);
                    if (this.f308l == null) {
                        this.f308l = new ArrayList();
                    }
                    if (f296a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f308l.add(Integer.valueOf(size));
                    size++;
                }
                if (f296a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + runnableC0002a);
                }
                this.f307k.add(runnableC0002a);
            }
        }
    }

    /* renamed from: b */
    public final void m223b(int i) {
        synchronized (this) {
            this.f307k.set(i, null);
            if (this.f308l == null) {
                this.f308l = new ArrayList();
            }
            if (f296a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f308l.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        r6.f301e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1 >= r3) goto L49;
     */
    /* renamed from: d */
    public final boolean m232d() {
        if (this.f301e) {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (android.os.Looper.myLooper() != this.f311o.f273a.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of process");
        }

        boolean executed = false;
        while (true) {
            int count;
            synchronized (this) {
                if (this.f299c == null || this.f299c.isEmpty()) {
                    break;
                }
                count = this.f299c.size();
                if (this.f300d == null || this.f300d.length < count) {
                    this.f300d = new Runnable[count];
                }
                this.f299c.toArray(this.f300d);
                this.f299c.clear();
                this.f311o.f273a.removeCallbacks(this.f321y);
            }
            this.f301e = true;
            try {
                for (int i = 0; i < count; i++) {
                    this.f300d[i].run();
                }
            } finally {
                java.util.Arrays.fill(this.f300d, 0, count, null);
                this.f301e = false;
            }
            executed = true;
        }

        if (this.f318v) {
            boolean loadersRunning = false;
            for (Object item : this.f302f) {
                Fragment fragment = (Fragment) item;
                if (fragment != null && fragment.f42W != null) {
                    loadersRunning |= fragment.f42W.mo113a();
                }
            }
            if (!loadersRunning) {
                this.f318v = false;
                m206s();
            }
        }
        return executed;
    }

    /* renamed from: u */
    private void m208u() {
        if (this.f309m != null) {
            for (int i = 0; i < this.f309m.size(); i++) {
                this.f309m.get(i);
            }
        }
    }

    /* renamed from: b */
    final void m226b(RunnableC0002a runnableC0002a) {
        if (this.f305i == null) {
            this.f305i = new ArrayList();
        }
        this.f305i.add(runnableC0002a);
        m208u();
    }

    /* renamed from: a */
    final boolean m219a(int i, int i2) {
        if (this.f305i == null) {
            return false;
        }
        if (i < 0 && (i2 & 1) == 0) {
            int size = this.f305i.size() - 1;
            if (size < 0) {
                return false;
            }
            RunnableC0002a runnableC0002a = (RunnableC0002a) this.f305i.remove(size);
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            runnableC0002a.m97a(sparseArray, sparseArray2);
            runnableC0002a.m94a(true, (C0070f) null, sparseArray, sparseArray2);
        } else {
            int i3 = -1;
            if (i >= 0) {
                int size2 = this.f305i.size() - 1;
                while (size2 >= 0) {
                    RunnableC0002a runnableC0002a2 = (RunnableC0002a) this.f305i.get(size2);
                    if (i >= 0 && i == runnableC0002a2.f108o) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        RunnableC0002a runnableC0002a3 = (RunnableC0002a) this.f305i.get(size2);
                        if (i < 0 || i != runnableC0002a3.f108o) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f305i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.f305i.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f305i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            SparseArray sparseArray3 = new SparseArray();
            SparseArray sparseArray4 = new SparseArray();
            for (int i4 = 0; i4 <= size4; i4++) {
                ((RunnableC0002a) arrayList.get(i4)).m97a(sparseArray3, sparseArray4);
            }
            C0070f c0070fM94a = null;
            int i5 = 0;
            while (i5 <= size4) {
                if (f296a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i5));
                }
                i5++;
                c0070fM94a = ((RunnableC0002a) arrayList.get(i5)).m94a(i5 == size4, c0070fM94a, sparseArray3, sparseArray4);
            }
        }
        m208u();
        return true;
    }

    /* renamed from: e */
    final ArrayList m233e() {
        ArrayList arrayList = null;
        if (this.f302f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f302f.size()) {
                    break;
                }
                Fragment fragment = (Fragment) this.f302f.get(i2);
                if (fragment != null && fragment.f31L) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.f32M = true;
                    fragment.f64t = fragment.f63s != null ? fragment.f63s.f60p : -1;
                    if (f296a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m203d(Fragment fragment) {
        if (fragment.f39T != null) {
            if (this.f320x == null) {
                this.f320x = new SparseArray();
            } else {
                this.f320x.clear();
            }
            fragment.f39T.saveHierarchyState(this.f320x);
            if (this.f320x.size() > 0) {
                fragment.f59o = this.f320x;
                this.f320x = null;
            }
        }
    }

    /* renamed from: e */
    private Bundle m204e(Fragment fragment) {
        Bundle bundle;
        if (this.f319w == null) {
            this.f319w = new Bundle();
        }
        fragment.m53h(this.f319w);
        if (this.f319w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f319w;
            this.f319w = null;
        }
        if (fragment.f38S != null) {
            m203d(fragment);
        }
        if (fragment.f59o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f59o);
        }
        if (!fragment.f41V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f41V);
        }
        return bundle;
    }

    /* renamed from: f */
    final Parcelable m235f() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        BackStackState[] backStackStateArr = null;
        m232d();
        if (f297b) {
            this.f315s = true;
        }
        if (this.f302f == null || this.f302f.size() <= 0) {
            return null;
        }
        int size3 = this.f302f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            Fragment fragment = (Fragment) this.f302f.get(i);
            if (fragment != null) {
                if (fragment.f60p < 0) {
                    m199a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.f60p));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.f55k > 0 && fragmentState.f84j == null) {
                    fragmentState.f84j = m204e(fragment);
                    if (fragment.f63s != null) {
                        if (fragment.f63s.f60p < 0) {
                            m199a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f63s));
                        }
                        if (fragmentState.f84j == null) {
                            fragmentState.f84j = new Bundle();
                        }
                        mo193a(fragmentState.f84j, "android:target_state", fragment.f63s);
                        if (fragment.f65u != 0) {
                            fragmentState.f84j.putInt("android:target_req_state", fragment.f65u);
                        }
                    }
                } else {
                    fragmentState.f84j = fragment.f58n;
                }
                if (f296a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.f84j);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            if (!f296a) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        if (this.f303g == null || (size2 = this.f303g.size()) <= 0) {
            iArr = null;
        } else {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.f303g.get(i2)).f60p;
                if (iArr[i2] < 0) {
                    m199a(new IllegalStateException("Failure saving state: active " + this.f303g.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f296a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f303g.get(i2));
                }
            }
        }
        if (this.f305i != null && (size = this.f305i.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState((RunnableC0002a) this.f305i.get(i3));
                if (f296a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f305i.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f72a = fragmentStateArr;
        fragmentManagerState.f73b = iArr;
        fragmentManagerState.f74c = backStackStateArr;
        return fragmentManagerState;
    }

    /* renamed from: a */
    final void m212a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f72a != null) {
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        Fragment fragment = (Fragment) arrayList.get(i);
                        if (f296a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.f72a[fragment.f60p];
                        fragmentState.f85k = fragment;
                        fragment.f59o = null;
                        fragment.f21B = 0;
                        fragment.f70z = false;
                        fragment.f66v = false;
                        fragment.f63s = null;
                        if (fragmentState.f84j != null) {
                            fragmentState.f84j.setClassLoader(this.f311o.getClassLoader());
                            fragment.f59o = fragmentState.f84j.getSparseParcelableArray("android:view_state");
                            fragment.f58n = fragmentState.f84j;
                        }
                    }
                }
                this.f302f = new ArrayList(fragmentManagerState.f72a.length);
                if (this.f304h != null) {
                    this.f304h.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState.f72a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f72a[i2];
                    if (fragmentState2 != null) {
                        Fragment fragmentM68a = fragmentState2.m68a(this.f311o, this.f313q);
                        if (f296a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + fragmentM68a);
                        }
                        this.f302f.add(fragmentM68a);
                        fragmentState2.f85k = null;
                    } else {
                        this.f302f.add(null);
                        if (this.f304h == null) {
                            this.f304h = new ArrayList();
                        }
                        if (f296a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.f304h.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Fragment fragment2 = (Fragment) arrayList.get(i3);
                        if (fragment2.f64t >= 0) {
                            if (fragment2.f64t < this.f302f.size()) {
                                fragment2.f63s = (Fragment) this.f302f.get(fragment2.f64t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.f64t);
                                fragment2.f63s = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f73b != null) {
                    this.f303g = new ArrayList(fragmentManagerState.f73b.length);
                    for (int i4 = 0; i4 < fragmentManagerState.f73b.length; i4++) {
                        Fragment fragment3 = (Fragment) this.f302f.get(fragmentManagerState.f73b[i4]);
                        if (fragment3 == null) {
                            m199a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f73b[i4]));
                        }
                        fragment3.f66v = true;
                        if (f296a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i4 + ": " + fragment3);
                        }
                        if (this.f303g.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f303g.add(fragment3);
                    }
                } else {
                    this.f303g = null;
                }
                if (fragmentManagerState.f74c != null) {
                    this.f305i = new ArrayList(fragmentManagerState.f74c.length);
                    for (int i5 = 0; i5 < fragmentManagerState.f74c.length; i5++) {
                        RunnableC0002a runnableC0002aM1a = fragmentManagerState.f74c[i5].m1a(this);
                        if (f296a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + runnableC0002aM1a.f108o + "): " + runnableC0002aM1a);
                            runnableC0002aM1a.m99a("  ", new PrintWriter(new C0099e("FragmentManager")), false);
                        }
                        this.f305i.add(runnableC0002aM1a);
                        if (runnableC0002aM1a.f108o >= 0) {
                            m198a(runnableC0002aM1a.f108o, runnableC0002aM1a);
                        }
                    }
                    return;
                }
                this.f305i = null;
            }
        }
    }

    /* renamed from: a */
    public final void m216a(ActivityC0076l activityC0076l, InterfaceC0080p interfaceC0080p, Fragment fragment) {
        if (this.f311o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f311o = activityC0076l;
        this.f312p = interfaceC0080p;
        this.f313q = fragment;
    }

    /* renamed from: g */
    public final void m236g() {
        this.f315s = false;
    }

    /* renamed from: h */
    public final void m237h() {
        this.f315s = false;
        m202d(1);
    }

    /* renamed from: i */
    public final void m238i() {
        this.f315s = false;
        m202d(2);
    }

    /* renamed from: j */
    public final void m239j() {
        this.f315s = false;
        m202d(4);
    }

    /* renamed from: k */
    public final void m240k() {
        this.f315s = false;
        m202d(5);
    }

    /* renamed from: l */
    public final void m241l() {
        m202d(4);
    }

    /* renamed from: m */
    public final void m242m() {
        this.f315s = true;
        m202d(3);
    }

    /* renamed from: n */
    public final void m243n() {
        m202d(2);
    }

    /* renamed from: o */
    public final void m244o() {
        m202d(1);
    }

    /* renamed from: p */
    public final void m245p() {
        this.f316t = true;
        m232d();
        m202d(0);
        this.f311o = null;
        this.f312p = null;
        this.f313q = null;
    }

    /* renamed from: a */
    public final void m211a(Configuration configuration) {
        if (this.f303g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f303g.size()) {
                    Fragment fragment = (Fragment) this.f303g.get(i2);
                    if (fragment != null) {
                        fragment.m29a(configuration);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    public final void m246q() {
        if (this.f303g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f303g.size()) {
                    Fragment fragment = (Fragment) this.f303g.get(i2);
                    if (fragment != null) {
                        fragment.m19I();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m221a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        ArrayList arrayList = null;
        if (this.f303g != null) {
            int i = 0;
            z = false;
            while (i < this.f303g.size()) {
                Fragment fragment = (Fragment) this.f303g.get(i);
                if (fragment != null && fragment.m35a(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                }
                i++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f306j != null) {
            for (int i2 = 0; i2 < this.f306j.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f306j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Fragment.m10x();
                }
            }
        }
        this.f306j = arrayList;
        return z;
    }

    /* renamed from: a */
    public final boolean m220a(Menu menu) {
        if (this.f303g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f303g.size(); i++) {
            Fragment fragment = (Fragment) this.f303g.get(i);
            if (fragment != null && fragment.m34a(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean m222a(MenuItem menuItem) {
        if (this.f303g == null) {
            return false;
        }
        for (int i = 0; i < this.f303g.size(); i++) {
            Fragment fragment = (Fragment) this.f303g.get(i);
            if (fragment != null && fragment.m43c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m228b(MenuItem menuItem) {
        if (this.f303g == null) {
            return false;
        }
        for (int i = 0; i < this.f303g.size(); i++) {
            Fragment fragment = (Fragment) this.f303g.get(i);
            if (fragment != null && fragment.m46d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m227b(Menu menu) {
        if (this.f303g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f303g.size()) {
                    Fragment fragment = (Fragment) this.f303g.get(i2);
                    if (fragment != null) {
                        fragment.m39b(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public static int m200c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        Fragment fragmentM2a;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0086v.f328a);
        String string = attributeValue == null ? typedArrayObtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!Fragment.m5b(this.f311o, string)) {
            return null;
        }
        Fragment fragmentM205e = resourceId != -1 ? m205e(resourceId) : null;
        if (fragmentM205e == null && string2 != null) {
            fragmentM205e = mo190a(string2);
        }
        if (fragmentM205e == null) {
            fragmentM205e = m205e(0);
        }
        if (f296a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + fragmentM205e);
        }
        if (fragmentM205e == null) {
            fragmentM2a = Fragment.m2a(context, string);
            fragmentM2a.f69y = true;
            fragmentM2a.f26G = resourceId != 0 ? resourceId : 0;
            fragmentM2a.f27H = 0;
            fragmentM2a.f28I = string2;
            fragmentM2a.f70z = true;
            fragmentM2a.f22C = this;
            ActivityC0076l activityC0076l = this.f311o;
            Bundle bundle = fragmentM2a.f58n;
            fragmentM2a.m61q();
            m215a(fragmentM2a, true);
        } else {
            if (fragmentM205e.f70z) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + string);
            }
            fragmentM205e.f70z = true;
            if (!fragmentM205e.f32M) {
                ActivityC0076l activityC0076l2 = this.f311o;
                Bundle bundle2 = fragmentM205e.f58n;
                fragmentM205e.m61q();
            }
            fragmentM2a = fragmentM205e;
        }
        if (this.f310n <= 0 && fragmentM2a.f69y) {
            m214a(fragmentM2a, 1, 0, 0, false);
        } else {
            m201c(fragmentM2a);
        }
        if (fragmentM2a.f38S == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            fragmentM2a.f38S.setId(resourceId);
        }
        if (fragmentM2a.f38S.getTag() == null) {
            fragmentM2a.f38S.setTag(string2);
        }
        return fragmentM2a.f38S;
    }

    /* renamed from: r */
    final LayoutInflater.Factory m247r() {
        return this;
    }
}
