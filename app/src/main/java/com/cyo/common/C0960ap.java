package com.cyo.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ShareActionProvider;

/* compiled from: DontLook */
@TargetApi(14)
/* renamed from: com.cyo.common.ap */
/* loaded from: classes.dex */
class C0960ap extends C0956al {
    private C0960ap() {
        super((byte) 0);
    }

    /* synthetic */ C0960ap(byte b) {
        this();
    }

    /* synthetic */ C0960ap(char c) {
        this();
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final void mo2025a(MenuItem menuItem, Context context, Intent intent) {
        ShareActionProvider shareActionProvider;
        super.mo2025a(menuItem, context, intent);
        if (menuItem != null) {
            if (menuItem.getActionProvider() instanceof ShareActionProvider) {
                shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
            } else {
                shareActionProvider = new ShareActionProvider(context);
                menuItem.setActionProvider(shareActionProvider);
                menuItem.setShowAsAction(2);
            }
            if (intent != null) {
                shareActionProvider.setShareIntent(intent);
            }
        }
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public void mo2027a(View view, boolean z) {
        if (view != null) {
            view.setSystemUiVisibility(z ? 1 : 0);
        }
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: d */
    public final boolean mo2037d(Context context) {
        return ViewConfiguration.get(context).hasPermanentMenuKey();
    }
}
