package com.cyo.comicrack.viewer;

import com.cyo.common.C1006bq;
import com.cyo.common.InterfaceC1008bs;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gg */
/* loaded from: classes.dex */
final class C0818gg implements InterfaceC1008bs {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2510a;

    C0818gg(ReaderActivity readerActivity) {
        this.f2510a = readerActivity;
    }

    @Override // com.cyo.common.InterfaceC1008bs
    /* renamed from: a */
    public final void mo1736a(C1006bq c1006bq) {
        int iIntValue = ((Integer) c1006bq.f2969e).intValue();
        ReaderActivity.m1605l(this.f2510a);
        switch (iIntValue) {
            case 1000:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.AdjustColors, EnumC0861hw.Menu);
                break;
            case 1001:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.ToggleManga, EnumC0861hw.Menu);
                break;
            case 1002:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.ToggleBrightness, EnumC0861hw.Menu);
                break;
            case 1003:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.Snapshot, EnumC0861hw.Menu);
                break;
            case 1004:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.ToggleDoublePage, EnumC0861hw.Menu);
                break;
            case 1005:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.SwitchRotation, EnumC0861hw.Menu);
                break;
            case 1006:
                ReaderActivity.m1558a(this.f2510a, EnumC0860hv.RateBook, EnumC0861hw.Menu);
                break;
            default:
                ReaderActivity readerActivity = this.f2510a;
                ReaderActivity.m1874p().m1434a(this.f2510a, new C0756dz(iIntValue), this.f2510a.f2674q);
                break;
        }
    }
}
