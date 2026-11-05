package com.cyo.common;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* compiled from: DontLook */
@TargetApi(16)
/* renamed from: com.cyo.common.aq */
/* loaded from: classes.dex */
class C0961aq extends C0960ap {
    private C0961aq() {
        super((byte) 0);
    }

    /* synthetic */ C0961aq(byte b) {
        this();
    }

    /* synthetic */ C0961aq(char c) {
        this();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final Bundle mo2012a(View view, Bitmap bitmap) {
        if (view == null) {
            return null;
        }
        if (bitmap == null) {
            return ActivityOptions.makeScaleUpAnimation(view, 0, 0, view.getWidth(), view.getHeight()).toBundle();
        }
        return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, 0, 0).toBundle();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2022a(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
