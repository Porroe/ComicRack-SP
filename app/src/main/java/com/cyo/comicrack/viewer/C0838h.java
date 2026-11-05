package com.cyo.comicrack.viewer;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.widget.TextView;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.h */
/* loaded from: classes.dex */
final class C0838h implements Html.ImageGetter {

    /* renamed from: a */
    private final /* synthetic */ TextView f2544a;

    C0838h(TextView textView) {
        this.f2544a = textView;
    }

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) throws Resources.NotFoundException {
        Drawable drawable = null;
        if (str.equals("comicrack_logo")) {
            drawable = this.f2544a.getContext().getResources().getDrawable(C0802fr.comicrack_logo);
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return drawable;
    }
}
