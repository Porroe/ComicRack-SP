package com.cyo.common.view;

import android.view.View;
import android.widget.PopupMenu;
import com.cyo.comicrack.viewer.C0806fv;
import com.cyo.common.C0951ag;
import com.cyo.common.C0998bi;
import java.io.File;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.aw */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1129aw implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1120an f3595a;

    /* renamed from: b */
    private final /* synthetic */ View f3596b;

    ViewOnClickListenerC1129aw(C1120an c1120an, View view) {
        this.f3595a = c1120an;
        this.f3596b = view;
    }

    /* renamed from: a */
    static /* synthetic */ C1120an m2410a(ViewOnClickListenerC1129aw viewOnClickListenerC1129aw) {
        return viewOnClickListenerC1129aw.f3595a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        File[] fileArrMo2035b = C0951ag.m1995a().mo2035b(this.f3595a.f3572a.getContext());
        PopupMenu popupMenu = new PopupMenu(this.f3595a.f3572a.getContext(), this.f3596b);
        popupMenu.setOnMenuItemClickListener(new C1130ax(this, fileArrMo2035b));
        popupMenu.getMenu().add(0, 0, 0, C0806fv.current_folder);
        if (!C0998bi.m2081a(this.f3595a.f3575d)) {
            popupMenu.getMenu().add(0, 1, 0, C0806fv.default_folder);
        }
        for (int i = 0; i < fileArrMo2035b.length; i++) {
            popupMenu.getMenu().add(0, i + 2, 0, this.f3595a.f3572a.getContext().getString(C0806fv.local_sdcard_folder, Integer.valueOf(i + 1)));
        }
        popupMenu.show();
    }
}
