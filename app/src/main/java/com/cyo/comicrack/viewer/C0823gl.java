package com.cyo.comicrack.viewer;

import com.cyo.common.view.C1165t;
import com.cyo.common.view.EnumC1164s;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gl */
/* loaded from: classes.dex */
final class C0823gl implements InterfaceC0792fh {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2516a;

    /* renamed from: b */
    private final /* synthetic */ C0794fj f2517b;

    C0823gl(ReaderActivity readerActivity, C0794fj c0794fj) {
        this.f2516a = readerActivity;
        this.f2517b = c0794fj;
    }

    @Override // com.cyo.comicrack.viewer.InterfaceC0792fh
    /* renamed from: a */
    public final C1165t mo1843a(float f, EnumC1164s enumC1164s, boolean z) {
        int size;
        int i;
        C1165t contentLayout = ReaderActivity.m1580b(this.f2516a).getContentLayout();
        contentLayout.f3690f = f;
        contentLayout.f3685a = enumC1164s;
        contentLayout.f3688d = z;
        List listM1626a = this.f2516a.m1626a(contentLayout);
        if (this.f2517b.f2471b == EnumC0793fi.Forward) {
            size = 0;
            i = 1;
        } else {
            size = listM1626a.size() - 1;
            i = -1;
        }
        C1165t c1165tM1625a = this.f2516a.m1625a(listM1626a, size, i, this.f2517b.f2476g);
        return c1165tM1625a == null ? (C1165t) listM1626a.get(size) : c1165tM1625a;
    }
}
