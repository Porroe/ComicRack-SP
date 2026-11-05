package com.cyo.common;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import com.cyo.common.p022a.C0944o;

/* compiled from: DontLook */
@TargetApi(17)
/* renamed from: com.cyo.common.ar */
/* loaded from: classes.dex */
class C0962ar extends C0961aq {
    private C0962ar() {
        super((byte) 0);
    }

    /* synthetic */ C0962ar(byte b) {
        this();
    }

    /* synthetic */ C0962ar(char c) {
        this();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final C0944o mo2013a(Context context, int i) {
        Bundle appWidgetOptions = AppWidgetManager.getInstance(context).getAppWidgetOptions(i);
        return new C0944o(appWidgetOptions.getInt("appWidgetMinWidth"), appWidgetOptions.getInt("appWidgetMinHeight"));
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2026a(View view, C0944o c0944o) {
        Point point = new Point();
        view.getDisplay().getRealSize(point);
        c0944o.f2832a = point.x;
        c0944o.f2833b = point.y;
    }
}
