package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.p */
/* loaded from: classes.dex */
public final class C0233p extends ViewGroup.MarginLayoutParams {

    /* renamed from: e */
    private static final int[] f619e = {R.attr.layout_weight};

    /* renamed from: a */
    public float f620a;

    /* renamed from: b */
    boolean f621b;

    /* renamed from: c */
    boolean f622c;

    /* renamed from: d */
    Paint f623d;

    public C0233p() {
        super(-1, -1);
        this.f620a = 0.0f;
    }

    public C0233p(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f620a = 0.0f;
    }

    public C0233p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f620a = 0.0f;
    }

    public C0233p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f620a = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f619e);
        this.f620a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
