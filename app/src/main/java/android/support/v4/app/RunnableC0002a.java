package android.support.v4.app;

import android.os.Build;
import android.support.v4.p002c.C0095a;
import android.support.v4.p002c.C0099e;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
final class RunnableC0002a extends AbstractC0004ab implements Runnable {

    /* renamed from: a */
    final LayoutInflaterFactoryC0082r f94a;

    /* renamed from: b */
    C0069e f95b;

    /* renamed from: c */
    C0069e f96c;

    /* renamed from: d */
    int f97d;

    /* renamed from: e */
    int f98e;

    /* renamed from: f */
    int f99f;

    /* renamed from: g */
    int f100g;

    /* renamed from: h */
    int f101h;

    /* renamed from: i */
    int f102i;

    /* renamed from: j */
    int f103j;

    /* renamed from: k */
    boolean f104k;

    /* renamed from: m */
    String f106m;

    /* renamed from: n */
    boolean f107n;

    /* renamed from: p */
    int f109p;

    /* renamed from: q */
    CharSequence f110q;

    /* renamed from: r */
    int f111r;

    /* renamed from: s */
    CharSequence f112s;

    /* renamed from: t */
    ArrayList f113t;

    /* renamed from: u */
    ArrayList f114u;

    /* renamed from: l */
    boolean f105l = true;

    /* renamed from: o */
    int f108o = -1;

    /* renamed from: a */
    static /* synthetic */ C0095a m72a(RunnableC0002a runnableC0002a, C0070f c0070f, boolean z, Fragment fragment) {
        C0095a c0095a = new C0095a();
        View viewM62t = fragment.m62t();
        if (viewM62t != null && runnableC0002a.f113t != null) {
            C0005ac.m110a((Map) c0095a, viewM62t);
            if (z) {
                c0095a = m74a(runnableC0002a.f113t, runnableC0002a.f114u, c0095a);
            } else {
                c0095a.m259a((Collection) runnableC0002a.f114u);
            }
        }
        if (z) {
            if (fragment.f54ai != null) {
                AbstractC0066cj abstractC0066cj = fragment.f54ai;
                ArrayList arrayList = runnableC0002a.f114u;
            }
            runnableC0002a.m81a(c0070f, c0095a, true);
        } else {
            if (fragment.f53ah != null) {
                AbstractC0066cj abstractC0066cj2 = fragment.f53ah;
                ArrayList arrayList2 = runnableC0002a.f114u;
            }
            m86b(c0070f, c0095a, true);
        }
        return c0095a;
    }

    /* renamed from: a */
    static /* synthetic */ void m77a(Fragment fragment, Fragment fragment2, boolean z, C0095a c0095a) {
        if ((z ? fragment2.f53ah : fragment.f53ah) != null) {
            new ArrayList(c0095a.keySet());
            new ArrayList(c0095a.values());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m78a(RunnableC0002a runnableC0002a, C0070f c0070f, int i, Object obj) {
        runnableC0002a.m80a(c0070f, i, obj);
    }

    /* renamed from: a */
    static /* synthetic */ void m79a(RunnableC0002a runnableC0002a, C0095a c0095a, C0070f c0070f) {
        View view;
        if (runnableC0002a.f114u == null || c0095a.isEmpty() || (view = (View) c0095a.get(runnableC0002a.f114u.get(0))) == null) {
            return;
        }
        c0070f.f260c.f139a = view;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f108o >= 0) {
            sb.append(" #");
            sb.append(this.f108o);
        }
        if (this.f106m != null) {
            sb.append(" ");
            sb.append(this.f106m);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m98a(String str, PrintWriter printWriter) {
        m99a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void m99a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f106m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f108o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f107n);
            if (this.f102i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f102i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f103j));
            }
            if (this.f98e != 0 || this.f99f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f98e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f99f));
            }
            if (this.f100g != 0 || this.f101h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f100g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f101h));
            }
            if (this.f109p != 0 || this.f110q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f109p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f110q);
            }
            if (this.f111r != 0 || this.f112s != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f111r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f112s);
            }
        }
        if (this.f95b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            C0069e c0069e = this.f95b;
            while (c0069e != null) {
                switch (c0069e.f251c) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + c0069e.f251c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0069e.f252d);
                if (z) {
                    if (c0069e.f253e != 0 || c0069e.f254f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0069e.f253e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0069e.f254f));
                    }
                    if (c0069e.f255g != 0 || c0069e.f256h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0069e.f255g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0069e.f256h));
                    }
                }
                if (c0069e.f257i != null && c0069e.f257i.size() > 0) {
                    for (int i2 = 0; i2 < c0069e.f257i.size(); i2++) {
                        printWriter.print(str3);
                        if (c0069e.f257i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0069e.f257i.get(i2));
                    }
                }
                c0069e = c0069e.f249a;
                i++;
            }
        }
    }

    public RunnableC0002a(LayoutInflaterFactoryC0082r layoutInflaterFactoryC0082r) {
        this.f94a = layoutInflaterFactoryC0082r;
    }

    /* renamed from: a */
    final void m96a(C0069e c0069e) {
        if (this.f95b == null) {
            this.f96c = c0069e;
            this.f95b = c0069e;
        } else {
            c0069e.f250b = this.f96c;
            this.f96c.f249a = c0069e;
            this.f96c = c0069e;
        }
        c0069e.f253e = this.f98e;
        c0069e.f254f = this.f99f;
        c0069e.f255g = this.f100g;
        c0069e.f256h = this.f101h;
        this.f97d++;
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: a */
    public final AbstractC0004ab mo93a(Fragment fragment, String str) {
        m76a(0, fragment, str, 1);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: a */
    public final AbstractC0004ab mo90a(int i, Fragment fragment) {
        m76a(i, fragment, (String) null, 1);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: a */
    public final AbstractC0004ab mo91a(int i, Fragment fragment, String str) {
        m76a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m76a(int i, Fragment fragment, String str, int i2) {
        fragment.f22C = this.f94a;
        if (str != null) {
            if (fragment.f28I != null && !str.equals(fragment.f28I)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f28I + " now " + str);
            }
            fragment.f28I = str;
        }
        if (i != 0) {
            if (fragment.f26G != 0 && fragment.f26G != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f26G + " now " + i);
            }
            fragment.f26G = i;
            fragment.f27H = i;
        }
        C0069e c0069e = new C0069e();
        c0069e.f251c = i2;
        c0069e.f252d = fragment;
        m96a(c0069e);
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: b */
    public final AbstractC0004ab mo101b(int i, Fragment fragment) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m76a(i, fragment, (String) null, 2);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: a */
    public final AbstractC0004ab mo92a(Fragment fragment) {
        C0069e c0069e = new C0069e();
        c0069e.f251c = 3;
        c0069e.f252d = fragment;
        m96a(c0069e);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: b */
    public final AbstractC0004ab mo102b(Fragment fragment) {
        C0069e c0069e = new C0069e();
        c0069e.f251c = 6;
        c0069e.f252d = fragment;
        m96a(c0069e);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: c */
    public final AbstractC0004ab mo103c(Fragment fragment) {
        C0069e c0069e = new C0069e();
        c0069e.f251c = 7;
        c0069e.f252d = fragment;
        m96a(c0069e);
        return this;
    }

    /* renamed from: a */
    final void m95a(int i) {
        if (this.f104k) {
            if (LayoutInflaterFactoryC0082r.f296a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0069e c0069e = this.f95b; c0069e != null; c0069e = c0069e.f249a) {
                if (c0069e.f252d != null) {
                    c0069e.f252d.f21B += i;
                    if (LayoutInflaterFactoryC0082r.f296a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0069e.f252d + " to " + c0069e.f252d.f21B);
                    }
                }
                if (c0069e.f257i != null) {
                    for (int size = c0069e.f257i.size() - 1; size >= 0; size--) {
                        Fragment fragment = (Fragment) c0069e.f257i.get(size);
                        fragment.f21B += i;
                        if (LayoutInflaterFactoryC0082r.f296a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.f21B);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: a */
    public final int mo89a() {
        return m70a(false);
    }

    @Override // android.support.v4.app.AbstractC0004ab
    /* renamed from: b */
    public final int mo100b() {
        return m70a(true);
    }

    /* renamed from: a */
    private int m70a(boolean z) {
        if (this.f107n) {
            throw new IllegalStateException("commit already called");
        }
        if (LayoutInflaterFactoryC0082r.f296a) {
            Log.v("FragmentManager", "Commit: " + this);
            m98a("  ", new PrintWriter(new C0099e("FragmentManager")));
        }
        this.f107n = true;
        if (this.f104k) {
            this.f108o = this.f94a.m209a(this);
        } else {
            this.f108o = -1;
        }
        this.f94a.m217a(this, z);
        return this.f108o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0070f c0070fM71a;
        Fragment fragment;
        if (LayoutInflaterFactoryC0082r.f296a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.f104k && this.f108o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        m95a(1);
        if (Build.VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            m88b(sparseArray, sparseArray2);
            c0070fM71a = m71a(sparseArray, sparseArray2, false);
        } else {
            c0070fM71a = null;
        }
        int i = c0070fM71a != null ? 0 : this.f103j;
        int i2 = c0070fM71a != null ? 0 : this.f102i;
        for (C0069e c0069e = this.f95b; c0069e != null; c0069e = c0069e.f249a) {
            int i3 = c0070fM71a != null ? 0 : c0069e.f253e;
            int i4 = c0070fM71a != null ? 0 : c0069e.f254f;
            switch (c0069e.f251c) {
                case 1:
                    Fragment fragment2 = c0069e.f252d;
                    fragment2.f36Q = i3;
                    this.f94a.m215a(fragment2, false);
                    break;
                case 2:
                    Fragment fragment3 = c0069e.f252d;
                    if (this.f94a.f303g != null) {
                        fragment = fragment3;
                        for (int i5 = 0; i5 < this.f94a.f303g.size(); i5++) {
                            Fragment fragment4 = (Fragment) this.f94a.f303g.get(i5);
                            if (LayoutInflaterFactoryC0082r.f296a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                            }
                            if (fragment == null || fragment4.f27H == fragment.f27H) {
                                if (fragment4 == fragment) {
                                    c0069e.f252d = null;
                                    fragment = null;
                                } else {
                                    if (c0069e.f257i == null) {
                                        c0069e.f257i = new ArrayList();
                                    }
                                    c0069e.f257i.add(fragment4);
                                    fragment4.f36Q = i4;
                                    if (this.f104k) {
                                        fragment4.f21B++;
                                        if (LayoutInflaterFactoryC0082r.f296a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.f21B);
                                        }
                                    }
                                    this.f94a.m213a(fragment4, i2, i);
                                }
                            }
                        }
                    } else {
                        fragment = fragment3;
                    }
                    if (fragment != null) {
                        fragment.f36Q = i3;
                        this.f94a.m215a(fragment, false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment5 = c0069e.f252d;
                    fragment5.f36Q = i4;
                    this.f94a.m213a(fragment5, i2, i);
                    break;
                case 4:
                    Fragment fragment6 = c0069e.f252d;
                    fragment6.f36Q = i4;
                    this.f94a.m225b(fragment6, i2, i);
                    break;
                case 5:
                    Fragment fragment7 = c0069e.f252d;
                    fragment7.f36Q = i3;
                    this.f94a.m229c(fragment7, i2, i);
                    break;
                case 6:
                    Fragment fragment8 = c0069e.f252d;
                    fragment8.f36Q = i4;
                    this.f94a.m231d(fragment8, i2, i);
                    break;
                case 7:
                    Fragment fragment9 = c0069e.f252d;
                    fragment9.f36Q = i3;
                    this.f94a.m234e(fragment9, i2, i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0069e.f251c);
            }
        }
        this.f94a.m210a(this.f94a.f310n, i2, i, true);
        if (this.f104k) {
            this.f94a.m226b(this);
        }
    }

    /* renamed from: a */
    private static void m84a(SparseArray sparseArray, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.f27H) != 0 && !fragment.m59m() && fragment.m57k() && fragment.m62t() != null && sparseArray.get(i) == null) {
            sparseArray.put(i, fragment);
        }
    }

    /* renamed from: b */
    private static void m87b(SparseArray sparseArray, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.f27H) != 0) {
            sparseArray.put(i, fragment);
        }
    }

    /* renamed from: b */
    private void m88b(SparseArray sparseArray, SparseArray sparseArray2) {
        Fragment fragment;
        if (this.f94a.f312p.mo178a()) {
            for (C0069e c0069e = this.f95b; c0069e != null; c0069e = c0069e.f249a) {
                switch (c0069e.f251c) {
                    case 1:
                        m87b(sparseArray2, c0069e.f252d);
                        break;
                    case 2:
                        Fragment fragment2 = c0069e.f252d;
                        fragment = fragment2;
                        if (this.f94a.f303g != null) {
                            for (Object added : this.f94a.f303g) {
                                Fragment existing = (Fragment) added;
                                if (fragment == null || existing.f27H == fragment.f27H) {
                                    if (existing == fragment) {
                                        fragment = null;
                                    } else {
                                        m84a(sparseArray, existing);
                                    }
                                }
                            }
                        }
                        m87b(sparseArray2, fragment);
                        break;
                    case 3:
                        m84a(sparseArray, c0069e.f252d);
                        break;
                    case 4:
                        m84a(sparseArray, c0069e.f252d);
                        break;
                    case 5:
                        m87b(sparseArray2, c0069e.f252d);
                        break;
                    case 6:
                        m84a(sparseArray, c0069e.f252d);
                        break;
                    case 7:
                        m87b(sparseArray2, c0069e.f252d);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m97a(SparseArray sparseArray, SparseArray sparseArray2) {
        if (this.f94a.f312p.mo178a()) {
            for (C0069e c0069e = this.f95b; c0069e != null; c0069e = c0069e.f249a) {
                switch (c0069e.f251c) {
                    case 1:
                        m84a(sparseArray, c0069e.f252d);
                        break;
                    case 2:
                        if (c0069e.f257i != null) {
                            for (int size = c0069e.f257i.size() - 1; size >= 0; size--) {
                                m87b(sparseArray2, (Fragment) c0069e.f257i.get(size));
                            }
                        }
                        m84a(sparseArray, c0069e.f252d);
                        break;
                    case 3:
                        m87b(sparseArray2, c0069e.f252d);
                        break;
                    case 4:
                        m87b(sparseArray2, c0069e.f252d);
                        break;
                    case 5:
                        m84a(sparseArray, c0069e.f252d);
                        break;
                    case 6:
                        m87b(sparseArray2, c0069e.f252d);
                        break;
                    case 7:
                        m84a(sparseArray, c0069e.f252d);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public final C0070f m94a(boolean z, C0070f c0070f, SparseArray sparseArray, SparseArray sparseArray2) {
        if (LayoutInflaterFactoryC0082r.f296a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m98a("  ", new PrintWriter(new C0099e("FragmentManager")));
        }
        if (c0070f == null) {
            if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
                c0070f = m71a(sparseArray, sparseArray2, true);
            }
        } else if (!z) {
            m82a(c0070f, this.f114u, this.f113t);
        }
        m95a(-1);
        int i = c0070f != null ? 0 : this.f103j;
        int i2 = c0070f != null ? 0 : this.f102i;
        for (C0069e c0069e = this.f96c; c0069e != null; c0069e = c0069e.f250b) {
            int i3 = c0070f != null ? 0 : c0069e.f255g;
            int i4 = c0070f != null ? 0 : c0069e.f256h;
            switch (c0069e.f251c) {
                case 1:
                    Fragment fragment = c0069e.f252d;
                    fragment.f36Q = i4;
                    this.f94a.m213a(fragment, LayoutInflaterFactoryC0082r.m200c(i2), i);
                    break;
                case 2:
                    Fragment fragment2 = c0069e.f252d;
                    if (fragment2 != null) {
                        fragment2.f36Q = i4;
                        this.f94a.m213a(fragment2, LayoutInflaterFactoryC0082r.m200c(i2), i);
                    }
                    if (c0069e.f257i != null) {
                        for (int i5 = 0; i5 < c0069e.f257i.size(); i5++) {
                            Fragment fragment3 = (Fragment) c0069e.f257i.get(i5);
                            fragment3.f36Q = i3;
                            this.f94a.m215a(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = c0069e.f252d;
                    fragment4.f36Q = i3;
                    this.f94a.m215a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = c0069e.f252d;
                    fragment5.f36Q = i3;
                    this.f94a.m229c(fragment5, LayoutInflaterFactoryC0082r.m200c(i2), i);
                    break;
                case 5:
                    Fragment fragment6 = c0069e.f252d;
                    fragment6.f36Q = i4;
                    this.f94a.m225b(fragment6, LayoutInflaterFactoryC0082r.m200c(i2), i);
                    break;
                case 6:
                    Fragment fragment7 = c0069e.f252d;
                    fragment7.f36Q = i3;
                    this.f94a.m234e(fragment7, LayoutInflaterFactoryC0082r.m200c(i2), i);
                    break;
                case 7:
                    Fragment fragment8 = c0069e.f252d;
                    fragment8.f36Q = i3;
                    this.f94a.m231d(fragment8, LayoutInflaterFactoryC0082r.m200c(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0069e.f251c);
            }
        }
        if (z) {
            this.f94a.m210a(this.f94a.f310n, LayoutInflaterFactoryC0082r.m200c(i2), i, true);
            c0070f = null;
        }
        if (this.f108o >= 0) {
            this.f94a.m223b(this.f108o);
            this.f108o = -1;
        }
        return c0070f;
    }

    /* renamed from: a */
    private C0070f m71a(SparseArray sparseArray, SparseArray sparseArray2, boolean z) {
        C0070f c0070f = new C0070f(this);
        c0070f.f261d = new View(this.f94a.f311o);
        int i = 0;
        boolean z2 = false;
        while (i < sparseArray.size()) {
            boolean z3 = m85a(sparseArray.keyAt(i), c0070f, z, sparseArray, sparseArray2) ? true : z2;
            i++;
            z2 = z3;
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int iKeyAt = sparseArray2.keyAt(i2);
            if (sparseArray.get(iKeyAt) == null && m85a(iKeyAt, c0070f, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return c0070f;
    }

    /* renamed from: a */
    private static Object m75a(Object obj, Fragment fragment, ArrayList arrayList, C0095a c0095a) {
        if (obj != null) {
            View viewM62t = fragment.m62t();
            if (obj == null) {
                return obj;
            }
            C0005ac.m109a(arrayList, viewM62t);
            if (c0095a != null) {
                arrayList.removeAll(c0095a.values());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            C0005ac.m111b((Transition) obj, arrayList);
            return obj;
        }
        return obj;
    }

    /* renamed from: a */
    private C0095a m73a(C0070f c0070f, Fragment fragment, boolean z) {
        C0095a c0095a = new C0095a();
        if (this.f113t != null) {
            C0005ac.m110a((Map) c0095a, fragment.m62t());
            if (z) {
                c0095a.m259a((Collection) this.f114u);
            } else {
                c0095a = m74a(this.f113t, this.f114u, c0095a);
            }
        }
        if (z) {
            if (fragment.f53ah != null) {
                AbstractC0066cj abstractC0066cj = fragment.f53ah;
                ArrayList arrayList = this.f114u;
            }
            m81a(c0070f, c0095a, false);
        } else {
            if (fragment.f54ai != null) {
                AbstractC0066cj abstractC0066cj2 = fragment.f54ai;
                ArrayList arrayList2 = this.f114u;
            }
            m86b(c0070f, c0095a, false);
        }
        return c0095a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v3, types: [android.transition.TransitionSet] */
    /* renamed from: a */
    private boolean m85a(int i, C0070f c0070f, boolean z, SparseArray sparseArray, SparseArray sparseArray2) {
        Object objM105a;
        Object objM105a2;
        Object objM105a3;
        Transition transitionSet;
        View view;
        ViewGroup viewGroup = (ViewGroup) this.f94a.f312p.mo177a(i);
        if (viewGroup == null) {
            return false;
        }
        Fragment fragment = (Fragment) sparseArray2.get(i);
        Fragment fragment2 = (Fragment) sparseArray.get(i);
        if (fragment == null) {
            objM105a = null;
        } else {
            objM105a = C0005ac.m105a(z ? fragment.m12B() : fragment.m66y());
        }
        if (fragment == null || fragment2 == null) {
            objM105a2 = null;
        } else {
            objM105a2 = C0005ac.m105a(z ? fragment2.m14D() : fragment.m13C());
        }
        if (fragment2 == null) {
            objM105a3 = null;
        } else {
            objM105a3 = C0005ac.m105a(z ? fragment2.m67z() : fragment2.m11A());
        }
        if (objM105a == null && objM105a2 == null && objM105a3 == null) {
            return false;
        }
        C0095a c0095aM73a = null;
        ArrayList arrayList = new ArrayList();
        if (objM105a2 != null) {
            c0095aM73a = m73a(c0070f, fragment2, z);
            if (c0095aM73a.isEmpty()) {
                arrayList.add(c0070f.f261d);
            } else {
                arrayList.addAll(c0095aM73a.values());
            }
            if ((z ? fragment2.f53ah : fragment.f53ah) != null) {
                new ArrayList(c0095aM73a.keySet());
                new ArrayList(c0095aM73a.values());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object objM75a = m75a(objM105a3, fragment2, arrayList2, c0095aM73a);
        if (this.f114u != null && c0095aM73a != null && (view = (View) c0095aM73a.get(this.f114u.get(0))) != null) {
            if (objM75a != null) {
                C0005ac.m106a(objM75a, view);
            }
            if (objM105a2 != null) {
                C0005ac.m106a(objM105a2, view);
            }
        }
        C0029b c0029b = new C0029b(this, fragment);
        if (objM105a2 != null) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0056c(this, viewGroup, objM105a2, arrayList, c0070f, z, fragment, fragment2));
        }
        ArrayList arrayList3 = new ArrayList();
        C0095a c0095a = new C0095a();
        boolean zM16F = z ? fragment.m16F() : fragment.m15E();
        Transition ordering = (Transition) objM105a;
        Transition transition = (Transition) objM75a;
        Transition transition2 = (Transition) objM105a2;
        if (ordering == null || transition == null) {
            zM16F = true;
        }
        if (zM16F) {
            transitionSet = new TransitionSet();
            if (ordering != null) {
                ((TransitionSet) transitionSet).addTransition(ordering);
            }
            if (transition != null) {
                ((TransitionSet) transitionSet).addTransition(transition);
            }
            if (transition2 != null) {
                ((TransitionSet) transitionSet).addTransition(transition2);
            }
        } else {
            if (transition != null && ordering != null) {
                ordering = new TransitionSet().addTransition(transition).addTransition(ordering).setOrdering(1);
            } else if (transition != null) {
                ordering = transition;
            } else if (ordering == null) {
                ordering = null;
            }
            if (transition2 != null) {
                transitionSet = new TransitionSet();
                if (ordering != null) {
                    ((TransitionSet) transitionSet).addTransition(ordering);
                }
                ((TransitionSet) transitionSet).addTransition(transition2);
            } else {
                transitionSet = ordering;
            }
        }
        if (transitionSet != null) {
            View view2 = c0070f.f261d;
            C0010ah c0010ah = c0070f.f260c;
            C0095a c0095a2 = c0070f.f258a;
            if (objM105a != null || objM105a2 != null) {
                Transition transition3 = (Transition) objM105a;
                if (transition3 != null) {
                    transition3.addTarget(view2);
                }
                if (objM105a2 != null) {
                    C0005ac.m111b((Transition) objM105a2, arrayList);
                }
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0007ae(viewGroup, c0029b, c0095a2, c0095a, transition3, arrayList3));
                if (transition3 != null) {
                    transition3.setEpicenterCallback(new C0008af(c0010ah));
                }
            }
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0068d(this, viewGroup, c0070f, i, transitionSet));
            C0005ac.m107a(transitionSet, c0070f.f261d, true);
            m80a(c0070f, i, transitionSet);
            TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
            View view3 = c0070f.f261d;
            ArrayList arrayList4 = c0070f.f259b;
            Transition transition4 = (Transition) objM105a;
            Transition transition5 = (Transition) objM75a;
            Transition transition6 = (Transition) objM105a2;
            Transition transition7 = transitionSet;
            if (transition7 != null) {
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0009ag(viewGroup, transition4, view3, arrayList3, transition5, arrayList2, transition6, arrayList, c0095a, arrayList4, transition7));
            }
        }
        return transitionSet != null;
    }

    /* renamed from: a */
    private static C0095a m74a(ArrayList arrayList, ArrayList arrayList2, C0095a c0095a) {
        if (!c0095a.isEmpty()) {
            C0095a c0095a2 = new C0095a();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) c0095a.get(arrayList.get(i));
                if (view != null) {
                    c0095a2.put(arrayList2.get(i), view);
                }
            }
            return c0095a2;
        }
        return c0095a;
    }

    /* renamed from: a */
    private void m80a(C0070f c0070f, int i, Object obj) {
        if (this.f94a.f303g != null) {
            for (int i2 = 0; i2 < this.f94a.f303g.size(); i2++) {
                Fragment fragment = (Fragment) this.f94a.f303g.get(i2);
                if (fragment.f38S != null && fragment.f37R != null && fragment.f27H == i) {
                    if (fragment.f29J) {
                        if (!c0070f.f259b.contains(fragment.f38S)) {
                            C0005ac.m107a(obj, fragment.f38S, true);
                            c0070f.f259b.add(fragment.f38S);
                        }
                    } else {
                        C0005ac.m107a(obj, fragment.f38S, false);
                        c0070f.f259b.remove(fragment.f38S);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m83a(C0095a c0095a, String str, String str2) {
        if (str != null && str2 != null && !str.equals(str2)) {
            for (int i = 0; i < c0095a.size(); i++) {
                if (str.equals(c0095a.m286c(i))) {
                    c0095a.m282a(i, str2);
                    return;
                }
            }
            c0095a.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m82a(C0070f c0070f, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    m83a(c0070f.f258a, (String) arrayList.get(i2), (String) arrayList2.get(i2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m81a(C0070f c0070f, C0095a c0095a, boolean z) {
        int size = this.f114u == null ? 0 : this.f114u.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f113t.get(i);
            View view = (View) c0095a.get((String) this.f114u.get(i));
            if (view != null) {
                String transitionName = view.getTransitionName();
                if (z) {
                    m83a(c0070f.f258a, str, transitionName);
                } else {
                    m83a(c0070f.f258a, transitionName, str);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m86b(C0070f c0070f, C0095a c0095a, boolean z) {
        int size = c0095a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c0095a.m285b(i);
            String transitionName = ((View) c0095a.m286c(i)).getTransitionName();
            if (z) {
                m83a(c0070f.f258a, str, transitionName);
            } else {
                m83a(c0070f.f258a, transitionName, str);
            }
        }
    }
}
