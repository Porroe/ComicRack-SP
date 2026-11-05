package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.f */
/* loaded from: classes.dex */
public final class C0223f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f605a;

    /* renamed from: b */
    float f606b;

    /* renamed from: c */
    boolean f607c;

    /* renamed from: d */
    boolean f608d;

    public C0223f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f605a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.m501a());
        this.f605a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0223f() {
        super(-1, -1);
        this.f605a = 0;
    }

    public C0223f(C0223f c0223f) {
        super((ViewGroup.MarginLayoutParams) c0223f);
        this.f605a = 0;
        this.f605a = c0223f.f605a;
    }

    public C0223f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f605a = 0;
    }

    public C0223f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f605a = 0;
    }
}
