package com.cyo.comicrack.viewer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0951ag;
import com.cyo.common.C1095l;
import com.cyo.common.EnumC0993bd;
import com.cyo.common.view.C1144bk;
import com.cyo.common.view.C1146bm;
import java.util.regex.Pattern;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.a */
/* loaded from: classes.dex */
public final class C0649a {

    /* renamed from: a */
    private static final Pattern f2143a = Pattern.compile("(V\\d+\\.\\d+)");

    @SuppressLint({"NewApi", "InflateParams"})
    /* renamed from: a */
    public static void m1695a(Activity activity, Runnable runnable) {
        AboutDialog.show(activity, runnable);
    }

    /* renamed from: a */
    static View createAboutContent(Context activity, int i) {
        C0865i c0865i = new C0865i(activity);
        c0865i.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_BodyMedium);
        c0865i.setPadding(0, LibraryInterface.dp(activity, 12), 0, LibraryInterface.dp(activity, 12));
        try {
            Context context = c0865i.getContext();
            String strReplace = C1095l.m2366a(context.getResources(), i).replace("<name>", context.getString(C0806fv.app_name)).replace("<version>", String.valueOf(C0951ag.m2003d(context)) + "." + C0951ag.m2005e(context)).replace("<copyright>", context.getString(C0806fv.copyright)).replace("<freeversion>", C0628f.f1889k ? C1095l.m2366a(context.getResources(), C0805fu.free_version) : "").replace("<freeversionlimits>", C0628f.f1889k ? C1095l.m2366a(context.getResources(), C0805fu.free_version_limits) : "").replace("<paidversion>", !C0628f.f1889k ? C1095l.m2366a(context.getResources(), C0805fu.paid_version) : "").replace("\n", "<br/>");
            Object[] objArr = new Object[1];
            objArr[0] = C0628f.f1889k ? "FULL" : "FREE";
            String strReplaceAll = strReplace.replaceAll(String.format(".*\\(%s\\).*", objArr), "");
            Object[] objArr2 = new Object[1];
            objArr2[0] = C0628f.f1889k ? "FREE" : "FULL";
            c0865i.setText(Html.fromHtml(f2143a.matcher(strReplaceAll.replaceAll(String.format("\\(%s\\)\\s*", objArr2), "")).replaceAll("<b>$1</b>"), new C0838h(c0865i), null));
            c0865i.setMovementMethod(LinkMovementMethod.getInstance());
            C0951ag.m1995a().mo2032a((TextView) c0865i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ScrollView scrollView = new ScrollView(activity);
        scrollView.addView(c0865i);
        return scrollView;
    }
}
