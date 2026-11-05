package android.support.v4.app;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    // The APK has no constructor for this class.
    private FragmentTabHost(android.content.Context context) {
        super(context);
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    private final ArrayList f86a;

    /* renamed from: b */
    private Context f87b;

    /* renamed from: c */
    private AbstractC0081q f88c;

    /* renamed from: d */
    private int f89d;

    /* renamed from: e */
    private TabHost.OnTabChangeListener f90e;

    /* renamed from: f */
    private C0003aa f91f;

    /* renamed from: g */
    private boolean f92g;

    /* compiled from: DontLook */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0090z();

        /* renamed from: a */
        String f93a;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f93a = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f93a);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f93a + "}";
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    public final void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f90e = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        AbstractC0004ab abstractC0004abMo191a = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f86a.size()) {
                break;
            }
            C0003aa c0003aa = (C0003aa) this.f86a.get(i2);
            c0003aa.f118d = this.f88c.mo190a(c0003aa.f115a);
            if (c0003aa.f118d != null && !c0003aa.f118d.m58l()) {
                if (c0003aa.f115a.equals(currentTabTag)) {
                    this.f91f = c0003aa;
                } else {
                    if (abstractC0004abMo191a == null) {
                        abstractC0004abMo191a = this.f88c.mo191a();
                    }
                    abstractC0004abMo191a.mo102b(c0003aa.f118d);
                }
            }
            i = i2 + 1;
        }
        this.f92g = true;
        AbstractC0004ab abstractC0004abM69a = m69a(currentTabTag, abstractC0004abMo191a);
        if (abstractC0004abM69a != null) {
            abstractC0004abM69a.mo89a();
            this.f88c.mo194b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f92g = false;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f93a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f93a);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        AbstractC0004ab abstractC0004abM69a;
        if (this.f92g && (abstractC0004abM69a = m69a(str, null)) != null) {
            abstractC0004abM69a.mo89a();
        }
        if (this.f90e != null) {
            this.f90e.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private AbstractC0004ab m69a(String str, AbstractC0004ab abstractC0004ab) {
        C0003aa c0003aa = null;
        int i = 0;
        while (i < this.f86a.size()) {
            C0003aa c0003aa2 = (C0003aa) this.f86a.get(i);
            if (!c0003aa2.f115a.equals(str)) {
                c0003aa2 = c0003aa;
            }
            i++;
            c0003aa = c0003aa2;
        }
        if (c0003aa == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f91f != c0003aa) {
            if (abstractC0004ab == null) {
                abstractC0004ab = this.f88c.mo191a();
            }
            if (this.f91f != null && this.f91f.f118d != null) {
                abstractC0004ab.mo102b(this.f91f.f118d);
            }
            if (c0003aa != null) {
                if (c0003aa.f118d == null) {
                    c0003aa.f118d = Fragment.m3a(this.f87b, c0003aa.f116b.getName(), c0003aa.f117c);
                    abstractC0004ab.mo91a(this.f89d, c0003aa.f118d, c0003aa.f115a);
                } else {
                    abstractC0004ab.mo103c(c0003aa.f118d);
                }
            }
            this.f91f = c0003aa;
        }
        return abstractC0004ab;
    }
}
