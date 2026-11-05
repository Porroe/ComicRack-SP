package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p002c.C0098d;
import android.support.v4.p002c.C0106l;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: a */
    private static final C0106l f18a = new C0106l();

    /* renamed from: j */
    static final Object f19j = new Object();

    /* renamed from: A */
    boolean f20A;

    /* renamed from: B */
    int f21B;

    /* renamed from: C */
    LayoutInflaterFactoryC0082r f22C;

    /* renamed from: D */
    ActivityC0076l f23D;

    /* renamed from: E */
    LayoutInflaterFactoryC0082r f24E;

    /* renamed from: F */
    Fragment f25F;

    /* renamed from: G */
    int f26G;

    /* renamed from: H */
    int f27H;

    /* renamed from: I */
    String f28I;

    /* renamed from: J */
    boolean f29J;

    /* renamed from: K */
    boolean f30K;

    /* renamed from: L */
    boolean f31L;

    /* renamed from: M */
    boolean f32M;

    /* renamed from: N */
    boolean f33N;

    /* renamed from: P */
    boolean f35P;

    /* renamed from: Q */
    int f36Q;

    /* renamed from: R */
    ViewGroup f37R;

    /* renamed from: S */
    View f38S;

    /* renamed from: T */
    View f39T;

    /* renamed from: U */
    boolean f40U;

    /* renamed from: W */
    C0014al f42W;

    /* renamed from: X */
    boolean f43X;

    /* renamed from: Y */
    boolean f44Y;

    /* renamed from: af */
    Boolean f51af;

    /* renamed from: ag */
    Boolean f52ag;

    /* renamed from: l */
    View f56l;

    /* renamed from: m */
    int f57m;

    /* renamed from: n */
    Bundle f58n;

    /* renamed from: o */
    SparseArray f59o;

    /* renamed from: q */
    String f61q;

    /* renamed from: r */
    Bundle f62r;

    /* renamed from: s */
    Fragment f63s;

    /* renamed from: u */
    int f65u;

    /* renamed from: v */
    boolean f66v;

    /* renamed from: w */
    boolean f67w;

    /* renamed from: x */
    boolean f68x;

    /* renamed from: y */
    boolean f69y;

    /* renamed from: z */
    boolean f70z;

    /* renamed from: k */
    int f55k = 0;

    /* renamed from: p */
    int f60p = -1;

    /* renamed from: t */
    int f64t = -1;

    /* renamed from: O */
    boolean f34O = true;

    /* renamed from: V */
    boolean f41V = true;

    /* renamed from: Z */
    Object f45Z = null;

    /* renamed from: aa */
    Object f46aa = f19j;

    /* renamed from: ab */
    Object f47ab = null;

    /* renamed from: ac */
    Object f48ac = f19j;

    /* renamed from: ad */
    Object f49ad = null;

    /* renamed from: ae */
    Object f50ae = f19j;

    /* renamed from: ah */
    AbstractC0066cj f53ah = null;

    /* renamed from: ai */
    AbstractC0066cj f54ai = null;

    /* compiled from: DontLook */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0075k();

        /* renamed from: a */
        final Bundle f71a;

        SavedState(Bundle bundle) {
            this.f71a = bundle;
        }

        SavedState(Parcel parcel) {
            this.f71a = parcel.readBundle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f71a);
        }
    }

    /* renamed from: a */
    public static Fragment m2a(Context context, String str) {
        return m3a(context, str, (Bundle) null);
    }

    /* renamed from: a */
    public static Fragment m3a(Context context, String str, Bundle bundle) {
        try {
            Class<?> clsLoadClass = (Class) f18a.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                f18a.put(str, clsLoadClass);
            }
            Fragment fragment = (Fragment) clsLoadClass.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.f62r = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new C0074j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0074j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0074j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    /* renamed from: b */
    static boolean m5b(Context context, String str) {
        try {
            Class<?> clsLoadClass = (Class) f18a.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                f18a.put(str, clsLoadClass);
            }
            return Fragment.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: g */
    final void m51g() {
        if (this.f59o != null) {
            this.f39T.restoreHierarchyState(this.f59o);
            this.f59o = null;
        }
        this.f35P = false;
        this.f35P = true;
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* renamed from: a */
    final void m27a(int i, Fragment fragment) {
        this.f60p = i;
        if (fragment != null) {
            this.f61q = fragment.f61q + ":" + this.f60p;
        } else {
            this.f61q = "android:fragment:" + this.f60p;
        }
    }

    /* renamed from: h */
    final boolean m54h() {
        return this.f21B > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0098d.m272a(this, sb);
        if (this.f60p >= 0) {
            sb.append(" #");
            sb.append(this.f60p);
        }
        if (this.f26G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f26G));
        }
        if (this.f28I != null) {
            sb.append(" ");
            sb.append(this.f28I);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void m31a(SavedState savedState) {
        if (this.f60p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f58n = (savedState == null || savedState.f71a == null) ? null : savedState.f71a;
    }

    /* renamed from: i */
    public final ActivityC0076l m55i() {
        return this.f23D;
    }

    /* renamed from: j */
    public final Resources m56j() {
        if (this.f23D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.f23D.getResources();
    }

    /* renamed from: a */
    public final String m26a(int i, Object... objArr) {
        return m56j().getString(i, objArr);
    }

    /* renamed from: k */
    public final boolean m57k() {
        return this.f23D != null && this.f66v;
    }

    /* renamed from: l */
    public final boolean m58l() {
        return this.f30K;
    }

    /* renamed from: m */
    public final boolean m59m() {
        return this.f29J;
    }

    /* renamed from: n */
    public static void m6n() {
    }

    /* renamed from: o */
    public final void m60o() {
        if (this.f25F != null) {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        }
        this.f31L = true;
    }

    /* renamed from: a */
    public final void m33a(boolean z) {
        if (this.f34O != z) {
            this.f34O = z;
            if (this.f33N && m57k() && !this.f29J) {
                this.f23D.m186b();
            }
        }
    }

    /* renamed from: b */
    public final void m40b(boolean z) {
        if (!this.f41V && z && this.f55k < 4) {
            this.f22C.m224b(this);
        }
        this.f41V = z;
        this.f40U = !z;
    }

    /* renamed from: p */
    public static void m7p() {
    }

    /* renamed from: b */
    public LayoutInflater mo37b(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext = this.f23D.getLayoutInflater().cloneInContext(this.f23D);
        if (this.f24E == null) {
            m4a();
            if (this.f55k >= 5) {
                this.f24E.m240k();
            } else if (this.f55k >= 4) {
                this.f24E.m239j();
            } else if (this.f55k >= 2) {
                this.f24E.m238i();
            } else if (this.f55k > 0) {
                this.f24E.m237h();
            }
        }
        LayoutInflaterFactoryC0082r layoutInflaterFactoryC0082r = this.f24E;
        layoutInflaterCloneInContext.setFactory(this.f24E.m247r());
        return layoutInflaterCloneInContext;
    }

    /* renamed from: q */
    public final void m61q() {
        this.f35P = true;
    }

    /* renamed from: a */
    public void mo28a(Activity activity) {
        this.f35P = true;
    }

    /* renamed from: r */
    public static Animation m8r() {
        return null;
    }

    /* renamed from: a */
    public void mo30a(Bundle bundle) {
        this.f35P = true;
    }

    /* renamed from: a */
    public View mo25a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: s */
    public static void m9s() {
    }

    /* renamed from: t */
    public final View m62t() {
        return this.f38S;
    }

    /* renamed from: d */
    public void mo45d(Bundle bundle) {
        this.f35P = true;
    }

    /* renamed from: d */
    public void mo44d() {
        this.f35P = true;
        if (!this.f43X) {
            this.f43X = true;
            if (!this.f44Y) {
                this.f44Y = true;
                ActivityC0076l activityC0076l = this.f23D;
                String str = this.f61q;
                boolean z = this.f43X;
                this.f42W = activityC0076l.m185b(str);
            }
            if (this.f42W != null) {
                this.f42W.m117b();
            }
        }
    }

    /* renamed from: u */
    public void mo63u() {
        this.f35P = true;
    }

    /* renamed from: e */
    public void mo48e(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f35P = true;
    }

    /* renamed from: v */
    public void mo64v() {
        this.f35P = true;
    }

    /* renamed from: e */
    public void mo47e() {
        this.f35P = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f35P = true;
    }

    /* renamed from: f */
    public void mo49f() {
        this.f35P = true;
    }

    /* renamed from: w */
    final void m65w() {
        this.f60p = -1;
        this.f61q = null;
        this.f66v = false;
        this.f67w = false;
        this.f68x = false;
        this.f69y = false;
        this.f70z = false;
        this.f20A = false;
        this.f21B = 0;
        this.f22C = null;
        this.f24E = null;
        this.f23D = null;
        this.f26G = 0;
        this.f27H = 0;
        this.f28I = null;
        this.f29J = false;
        this.f30K = false;
        this.f32M = false;
        this.f42W = null;
        this.f43X = false;
        this.f44Y = false;
    }

    /* renamed from: c */
    public void mo42c() {
        this.f35P = true;
    }

    /* renamed from: x */
    public static void m10x() {
    }

    /* renamed from: a */
    public boolean mo36a(MenuItem menuItem) {
        return false;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f23D.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* renamed from: b */
    public boolean mo41b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: y */
    public final Object m66y() {
        return this.f45Z;
    }

    /* renamed from: z */
    public final Object m67z() {
        return this.f46aa == f19j ? this.f45Z : this.f46aa;
    }

    /* renamed from: A */
    public final Object m11A() {
        return this.f47ab;
    }

    /* renamed from: B */
    public final Object m12B() {
        return this.f48ac == f19j ? this.f47ab : this.f48ac;
    }

    /* renamed from: C */
    public final Object m13C() {
        return this.f49ad;
    }

    /* renamed from: D */
    public final Object m14D() {
        return this.f50ae == f19j ? this.f49ad : this.f50ae;
    }

    /* renamed from: E */
    public final boolean m15E() {
        if (this.f52ag == null) {
            return true;
        }
        return this.f52ag.booleanValue();
    }

    /* renamed from: F */
    public final boolean m16F() {
        if (this.f51af == null) {
            return true;
        }
        return this.f51af.booleanValue();
    }

    /* renamed from: a */
    public final void m32a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f26G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f27H));
        printWriter.print(" mTag=");
        printWriter.println(this.f28I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f55k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f60p);
        printWriter.print(" mWho=");
        printWriter.print(this.f61q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f21B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f66v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f67w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f68x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f69y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f70z);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f29J);
        printWriter.print(" mDetached=");
        printWriter.print(this.f30K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f34O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f33N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f31L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f32M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f41V);
        if (this.f22C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f22C);
        }
        if (this.f23D != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.f23D);
        }
        if (this.f25F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f25F);
        }
        if (this.f62r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f62r);
        }
        if (this.f58n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f58n);
        }
        if (this.f59o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f59o);
        }
        if (this.f63s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f63s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f65u);
        }
        if (this.f36Q != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f36Q);
        }
        if (this.f37R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f37R);
        }
        if (this.f38S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f38S);
        }
        if (this.f39T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f38S);
        }
        if (this.f56l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f56l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f57m);
        }
        if (this.f42W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f42W.m116a(str + "  ", printWriter);
        }
        if (this.f24E != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f24E + ":");
            this.f24E.m218a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    private void m4a() {
        this.f24E = new LayoutInflaterFactoryC0082r();
        this.f24E.m216a(this.f23D, new C0073i(this), this);
    }

    /* renamed from: f */
    final void m50f(Bundle bundle) {
        Parcelable parcelable;
        if (this.f24E != null) {
            this.f24E.m236g();
        }
        this.f35P = false;
        mo30a(bundle);
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f24E == null) {
                m4a();
            }
            this.f24E.m212a(parcelable, (ArrayList) null);
            this.f24E.m237h();
        }
    }

    /* renamed from: b */
    final View m38b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f24E != null) {
            this.f24E.m236g();
        }
        return mo25a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: g */
    final void m52g(Bundle bundle) {
        if (this.f24E != null) {
            this.f24E.m236g();
        }
        this.f35P = false;
        mo45d(bundle);
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.f24E != null) {
            this.f24E.m238i();
        }
    }

    /* renamed from: G */
    final void m17G() {
        if (this.f24E != null) {
            this.f24E.m236g();
            this.f24E.m232d();
        }
        this.f35P = false;
        mo44d();
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.f24E != null) {
            this.f24E.m239j();
        }
        if (this.f42W != null) {
            this.f42W.m122g();
        }
    }

    /* renamed from: H */
    final void m18H() {
        if (this.f24E != null) {
            this.f24E.m236g();
            this.f24E.m232d();
        }
        this.f35P = false;
        mo63u();
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.f24E != null) {
            this.f24E.m240k();
            this.f24E.m232d();
        }
    }

    /* renamed from: a */
    final void m29a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f24E != null) {
            this.f24E.m211a(configuration);
        }
    }

    /* renamed from: I */
    final void m19I() {
        onLowMemory();
        if (this.f24E != null) {
            this.f24E.m246q();
        }
    }

    /* renamed from: a */
    final boolean m35a(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f29J) {
            return false;
        }
        if (this.f33N && this.f34O) {
            z = true;
        }
        if (this.f24E != null) {
            return z | this.f24E.m221a(menu, menuInflater);
        }
        return z;
    }

    /* renamed from: a */
    final boolean m34a(Menu menu) {
        boolean z = false;
        if (this.f29J) {
            return false;
        }
        if (this.f33N && this.f34O) {
            z = true;
        }
        if (this.f24E != null) {
            return z | this.f24E.m220a(menu);
        }
        return z;
    }

    /* renamed from: c */
    final boolean m43c(MenuItem menuItem) {
        if (!this.f29J) {
            if (this.f33N && this.f34O && mo36a(menuItem)) {
                return true;
            }
            if (this.f24E != null && this.f24E.m222a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    final boolean m46d(MenuItem menuItem) {
        if (!this.f29J) {
            if (mo41b(menuItem)) {
                return true;
            }
            if (this.f24E != null && this.f24E.m228b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    final void m39b(Menu menu) {
        if (!this.f29J) {
            if (this.f33N) {
                boolean z = this.f34O;
            }
            if (this.f24E != null) {
                this.f24E.m227b(menu);
            }
        }
    }

    /* renamed from: h */
    final void m53h(Bundle bundle) {
        Parcelable parcelableM235f;
        mo48e(bundle);
        if (this.f24E != null && (parcelableM235f = this.f24E.m235f()) != null) {
            bundle.putParcelable("android:support:fragments", parcelableM235f);
        }
    }

    /* renamed from: J */
    final void m20J() {
        if (this.f24E != null) {
            this.f24E.m241l();
        }
        this.f35P = false;
        mo64v();
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: K */
    final void m21K() {
        if (this.f24E != null) {
            this.f24E.m242m();
        }
        this.f35P = false;
        mo47e();
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: L */
    final void m22L() {
        if (this.f24E != null) {
            this.f24E.m243n();
        }
        if (this.f43X) {
            this.f43X = false;
            if (!this.f44Y) {
                this.f44Y = true;
                ActivityC0076l activityC0076l = this.f23D;
                String str = this.f61q;
                boolean z = this.f43X;
                this.f42W = activityC0076l.m185b(str);
            }
            if (this.f42W != null) {
                if (!this.f23D.f280h) {
                    this.f42W.m118c();
                } else {
                    this.f42W.m119d();
                }
            }
        }
    }

    /* renamed from: M */
    final void m23M() {
        if (this.f24E != null) {
            this.f24E.m244o();
        }
        this.f35P = false;
        mo49f();
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.f42W != null) {
            this.f42W.m121f();
        }
    }

    /* renamed from: N */
    final void m24N() {
        if (this.f24E != null) {
            this.f24E.m245p();
        }
        this.f35P = false;
        this.f35P = true;
        if (!this.f44Y) {
            this.f44Y = true;
            ActivityC0076l activityC0076l = this.f23D;
            String str = this.f61q;
            boolean z = this.f43X;
            this.f42W = activityC0076l.m185b(str);
        }
        if (this.f42W != null) {
            this.f42W.m123h();
        }
        if (!this.f35P) {
            throw new C0067ck("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
