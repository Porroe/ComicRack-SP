package com.cyo.comicrack.viewer;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cyo.common.C0951ag;
import com.cyo.common.C1095l;
import com.cyo.common.EnumC0993bd;
import com.cyo.common.view.C1112af;
import com.cyo.common.view.C1146bm;
import com.cyo.common.view.DialogInterfaceOnCancelListenerC1115ai;
import com.cyo.common.view.DialogInterfaceOnClickListenerC1113ag;
import com.cyo.common.view.DialogInterfaceOnClickListenerC1114ah;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.id */
/* loaded from: classes.dex */
final class RunnableC0869id implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplashActivity f2644a;

    RunnableC0869id(SplashActivity splashActivity) {
        this.f2644a = splashActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SplashActivity splashActivity = this.f2644a;
        int i = C0805fu.eula;
        int i2 = C0806fv.eula_accept;
        int i3 = C0806fv.eula_decline;
        SharedPreferences sharedPreferences = splashActivity.getSharedPreferences("eula", 0);
        if (!sharedPreferences.getBoolean("eula.accepted", false)) {
            AlertDialog.Builder builderMo2038e = C0951ag.m1995a().mo2038e(splashActivity);
            builderMo2038e.setTitle(String.valueOf(splashActivity.getString(C0806fv.app_name)) + " - " + splashActivity.getString(C0806fv.eula_title));
            builderMo2038e.setCancelable(true);
            builderMo2038e.setPositiveButton(i2, new DialogInterfaceOnClickListenerC1113ag(sharedPreferences, splashActivity));
            builderMo2038e.setNegativeButton(i3, new DialogInterfaceOnClickListenerC1114ah(splashActivity));
            builderMo2038e.setOnCancelListener(new DialogInterfaceOnCancelListenerC1115ai(splashActivity));
            builderMo2038e.setIcon(C0802fr.icon);
            View viewInflate = LayoutInflater.from(splashActivity).inflate(C0804ft.alertdialog_smalltext, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(C0803fs.alertDialogSmallText);
            textView.setText(C1095l.m2366a(splashActivity.getResources(), i).replace("\r\n", "\n"));
            C0951ag.m1995a().mo2032a(textView);
            builderMo2038e.setView(viewInflate);
            AlertDialog alertDialogCreate = builderMo2038e.create();
            alertDialogCreate.show();
            C1146bm.m2420a(alertDialogCreate, 0.8f, EnumC0993bd.XLarge);
            return;
        }
        C1112af.m2403a(splashActivity, true);
    }
}
