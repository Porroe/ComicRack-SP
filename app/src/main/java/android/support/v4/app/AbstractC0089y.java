package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.view.AbstractC0145af;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.y */
/* loaded from: classes.dex */
public abstract class AbstractC0089y extends AbstractC0145af {

    /* renamed from: a */
    private final AbstractC0081q f329a;

    /* renamed from: b */
    private AbstractC0004ab f330b = null;

    /* renamed from: c */
    private ArrayList f331c = new ArrayList();

    /* renamed from: d */
    private ArrayList f332d = new ArrayList();

    /* renamed from: e */
    private Fragment f333e = null;

    /* renamed from: a */
    public abstract Fragment mo248a(int i);

    public AbstractC0089y(AbstractC0081q abstractC0081q) {
        this.f329a = abstractC0081q;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final Object mo249a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f332d.size() <= i || (fragment = (Fragment) this.f332d.get(i)) == null) {
            if (this.f330b == null) {
                this.f330b = this.f329a.mo191a();
            }
            Fragment fragmentMo248a = mo248a(i);
            if (this.f331c.size() > i && (savedState = (Fragment.SavedState) this.f331c.get(i)) != null) {
                fragmentMo248a.m31a(savedState);
            }
            while (this.f332d.size() <= i) {
                this.f332d.add(null);
            }
            fragmentMo248a.m33a(false);
            fragmentMo248a.m40b(false);
            this.f332d.set(i, fragmentMo248a);
            this.f330b.mo90a(viewGroup.getId(), fragmentMo248a);
            return fragmentMo248a;
        }
        return fragment;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public void mo252a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f330b == null) {
            this.f330b = this.f329a.mo191a();
        }
        while (this.f331c.size() <= i) {
            this.f331c.add(null);
        }
        this.f331c.set(i, this.f329a.mo188a(fragment));
        this.f332d.set(i, null);
        this.f330b.mo92a(fragment);
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public void mo255b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f333e) {
            if (this.f333e != null) {
                this.f333e.m33a(false);
                this.f333e.m40b(false);
            }
            if (fragment != null) {
                fragment.m33a(true);
                fragment.m40b(true);
            }
            this.f333e = fragment;
        }
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final void mo250a() {
        if (this.f330b != null) {
            this.f330b.mo100b();
            this.f330b = null;
            this.f329a.mo194b();
        }
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public final boolean mo253a(View view, Object obj) {
        return ((Fragment) obj).m62t() == view;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: b */
    public Parcelable mo254b() {
        Bundle bundle = null;
        if (this.f331c.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f331c.size()];
            this.f331c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        }
        Bundle bundle2 = bundle;
        for (int i = 0; i < this.f332d.size(); i++) {
            Fragment fragment = (Fragment) this.f332d.get(i);
            if (fragment != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                this.f329a.mo193a(bundle2, "f" + i, fragment);
            }
        }
        return bundle2;
    }

    @Override // android.support.v4.view.AbstractC0145af
    /* renamed from: a */
    public void mo251a(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f331c.clear();
            this.f332d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f331c.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentMo189a = this.f329a.mo189a(bundle, str);
                    if (fragmentMo189a != null) {
                        while (this.f332d.size() <= i) {
                            this.f332d.add(null);
                        }
                        fragmentMo189a.m33a(false);
                        this.f332d.set(i, fragmentMo189a);
                    } else {
                        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
