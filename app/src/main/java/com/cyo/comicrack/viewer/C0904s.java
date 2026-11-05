package com.cyo.comicrack.viewer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0478a;
import com.cyo.comicrack.p019a.p021b.C0586a;
import com.cyo.common.view.C1143bj;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.s */
/* loaded from: classes.dex */
final class C0904s extends C1143bj {

    /* renamed from: a */
    final /* synthetic */ C0896k f2728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904s(C0896k c0896k, Context context, int i) {
        super(context, i, C0896k.m1883a(c0896k));
        this.f2728a = c0896k;
    }

    @Override // com.cyo.common.view.C1143bj, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        Context context = view2.getContext();
        C0478a c0478a = (C0478a) getItem(i);
        ((TextView) view2.findViewById(C0803fs.bookmarkCaption)).setText(c0478a.f1536b);
        ((TextView) view2.findViewById(C0803fs.bookmarkPage)).setText(context.getString(C0806fv.page_d, Integer.valueOf(c0478a.f1535a + 1)));
        C0586a.m1263a(view2.findViewById(C0803fs.bookmarkThumb), C0896k.m1886b(this.f2728a), c0478a.f1535a, 0, C0628f.m1366c().m1914a(C0802fr.page_thumbnail_image_page_error), true);
        return view2;
    }
}
