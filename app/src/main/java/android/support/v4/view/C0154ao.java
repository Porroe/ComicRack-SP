package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.ao */
/* loaded from: classes.dex */
final class C0154ao extends SingleLineTransformationMethod {

    /* renamed from: a */
    private Locale f497a;

    public C0154ao(Context context) {
        this.f497a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f497a);
        }
        return null;
    }
}
