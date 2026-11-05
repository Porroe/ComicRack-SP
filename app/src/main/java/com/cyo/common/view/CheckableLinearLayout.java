package com.cyo.common.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    private static final int[] f3484a = {R.attr.state_checked};

    /* renamed from: b */
    private boolean f3485b;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3485b = false;
    }

    public CheckableLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3485b;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f3485b != z) {
            this.f3485b = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f3485b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f3484a);
        }
        return iArrOnCreateDrawableState;
    }
}
