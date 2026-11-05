package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.af */
/* loaded from: classes.dex */
public abstract class AbstractC0145af {

    /* renamed from: a */
    private DataSetObservable f475a = new DataSetObservable();

    /* renamed from: a */
    public abstract boolean mo253a(View view, Object obj);

    /* renamed from: c */
    public abstract int mo408c();

    /* renamed from: a */
    public Object mo249a(ViewGroup viewGroup, int i) {
        return mo403a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo252a(ViewGroup viewGroup, int i, Object obj) {
        mo407b(viewGroup, obj);
    }

    /* renamed from: b */
    public void mo255b(ViewGroup viewGroup, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo250a() {
    }

    /* renamed from: a */
    public Object mo403a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: b */
    public void mo407b(View view, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public Parcelable mo254b() {
        return null;
    }

    /* renamed from: a */
    public void mo251a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: d */
    public final void m409d() {
        this.f475a.notifyChanged();
    }

    /* renamed from: a */
    public final void m404a(DataSetObserver dataSetObserver) {
        this.f475a.registerObserver(dataSetObserver);
    }

    /* renamed from: b */
    public final void m406b(DataSetObserver dataSetObserver) {
        this.f475a.unregisterObserver(dataSetObserver);
    }

    /* renamed from: b */
    public CharSequence mo405b(int i) {
        return null;
    }
}
