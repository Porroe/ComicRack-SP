package android.support.v4.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.h */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0072h extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    int f263a = 0;

    /* renamed from: b */
    int f264b = 0;

    /* renamed from: c */
    boolean f265c = true;

    /* renamed from: d */
    boolean f266d = true;

    /* renamed from: e */
    int f267e = -1;

    /* renamed from: f */
    Dialog f268f;

    /* renamed from: g */
    boolean f269g;

    /* renamed from: h */
    boolean f270h;

    /* renamed from: i */
    boolean f271i;

    /* renamed from: a */
    public final void m174a(int i) {
        this.f263a = 1;
        if (this.f263a == 2 || this.f263a == 3) {
            this.f264b = R.style.Theme_Panel;
        }
        if (i != 0) {
            this.f264b = i;
        }
    }

    /* renamed from: a */
    public final int m172a(AbstractC0004ab abstractC0004ab, String str) {
        this.f270h = false;
        this.f271i = true;
        abstractC0004ab.mo93a(this, str);
        this.f269g = false;
        this.f267e = abstractC0004ab.mo89a();
        return this.f267e;
    }

    /* renamed from: a */
    public final void m173a() {
        m171c(false);
    }

    /* renamed from: c */
    private void m171c(boolean z) {
        if (!this.f270h) {
            this.f270h = true;
            this.f271i = false;
            if (this.f268f != null) {
                this.f268f.dismiss();
                this.f268f = null;
            }
            this.f269g = true;
            if (this.f267e >= 0) {
                this.f22C.mo192a(this.f267e);
                this.f267e = -1;
                return;
            }
            AbstractC0004ab abstractC0004abMo191a = this.f22C.mo191a();
            abstractC0004abMo191a.mo92a(this);
            if (z) {
                abstractC0004abMo191a.mo100b();
            } else {
                abstractC0004abMo191a.mo89a();
            }
        }
    }

    /* renamed from: b */
    public final Dialog m175b() {
        return this.f268f;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public final void mo28a(Activity activity) {
        super.mo28a(activity);
        if (!this.f271i) {
            this.f270h = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: c */
    public final void mo42c() {
        super.mo42c();
        if (!this.f271i && !this.f270h) {
            this.f270h = true;
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public void mo30a(Bundle bundle) {
        super.mo30a(bundle);
        this.f266d = this.f27H == 0;
        if (bundle != null) {
            this.f263a = bundle.getInt("android:style", 0);
            this.f264b = bundle.getInt("android:theme", 0);
            this.f265c = bundle.getBoolean("android:cancelable", true);
            this.f266d = bundle.getBoolean("android:showsDialog", this.f266d);
            this.f267e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: b */
    public final LayoutInflater mo37b(Bundle bundle) {
        if (!this.f266d) {
            return super.mo37b(bundle);
        }
        this.f268f = mo176c(bundle);
        switch (this.f263a) {
            case 3:
                this.f268f.getWindow().addFlags(24);
            case 1:
            case 2:
                this.f268f.requestWindowFeature(1);
                break;
        }
        if (this.f268f != null) {
            return (LayoutInflater) this.f268f.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.f23D.getSystemService("layout_inflater");
    }

    /* renamed from: c */
    public Dialog mo176c(Bundle bundle) {
        return new Dialog(this.f23D, this.f264b);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f269g) {
            m171c(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: d */
    public final void mo45d(Bundle bundle) {
        Bundle bundle2;
        super.mo45d(bundle);
        if (this.f266d) {
            View view = this.f38S;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f268f.setContentView(view);
            }
            this.f268f.setOwnerActivity(this.f23D);
            this.f268f.setCancelable(this.f265c);
            this.f268f.setOnCancelListener(this);
            this.f268f.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f268f.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: d */
    public void mo44d() {
        super.mo44d();
        if (this.f268f != null) {
            this.f269g = false;
            this.f268f.show();
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: e */
    public final void mo48e(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.mo48e(bundle);
        if (this.f268f != null && (bundleOnSaveInstanceState = this.f268f.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        if (this.f263a != 0) {
            bundle.putInt("android:style", this.f263a);
        }
        if (this.f264b != 0) {
            bundle.putInt("android:theme", this.f264b);
        }
        if (!this.f265c) {
            bundle.putBoolean("android:cancelable", this.f265c);
        }
        if (!this.f266d) {
            bundle.putBoolean("android:showsDialog", this.f266d);
        }
        if (this.f267e != -1) {
            bundle.putInt("android:backStackId", this.f267e);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: e */
    public final void mo47e() {
        super.mo47e();
        if (this.f268f != null) {
            this.f268f.hide();
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: f */
    public final void mo49f() {
        super.mo49f();
        if (this.f268f != null) {
            this.f269g = true;
            this.f268f.dismiss();
            this.f268f = null;
        }
    }
}
