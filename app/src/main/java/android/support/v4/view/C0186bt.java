package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.bt */
/* loaded from: classes.dex */
public final class C0186bt extends ViewGroup.LayoutParams {

    /* renamed from: a */
    public boolean f510a;

    /* renamed from: b */
    public int f511b;

    /* renamed from: c */
    float f512c;

    /* renamed from: d */
    boolean f513d;

    /* renamed from: e */
    int f514e;

    /* renamed from: f */
    int f515f;

    public C0186bt() {
        super(-1, -1);
        this.f512c = 0.0f;
    }

    public C0186bt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f512c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.m316d());
        this.f511b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
