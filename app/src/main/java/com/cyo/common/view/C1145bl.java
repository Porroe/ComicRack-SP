package com.cyo.common.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bl */
/* loaded from: classes.dex */
public final class C1145bl {

    /* renamed from: a */
    Context f3628a;

    /* renamed from: b */
    Toast f3629b;

    /* renamed from: c */
    LinearLayout f3630c;

    @SuppressLint({"ShowToast"})
    public C1145bl(Context context, String str) {
        this.f3628a = context;
        this.f3629b = Toast.makeText(context, str, 0);
        View view = this.f3629b.getView();
        if (view instanceof LinearLayout) {
            this.f3630c = (LinearLayout) view;
            if (this.f3630c.getChildCount() > 0 && (this.f3630c.getChildAt(0) instanceof TextView)) {
                ((TextView) this.f3630c.getChildAt(0)).setGravity(1);
            } else {
                this.f3630c = null;
            }
        }
        if (this.f3630c != null && this.f3630c.getOrientation() != 1) {
            this.f3630c = null;
        }
    }

    /* renamed from: a */
    public final C1145bl m2416a(View view, LinearLayout.LayoutParams layoutParams) {
        if (m2417b()) {
            this.f3630c.addView(view, layoutParams);
        }
        return this;
    }

    /* renamed from: a */
    public final C1145bl m2415a() {
        this.f3629b.setGravity(17, this.f3629b.getXOffset() / 2, this.f3629b.getYOffset() / 2);
        return this;
    }

    /* renamed from: a */
    public final Toast m2414a(int i) {
        this.f3629b.setDuration(i);
        this.f3629b.show();
        return this.f3629b;
    }

    /* renamed from: b */
    public final boolean m2417b() {
        return this.f3630c != null;
    }
}
