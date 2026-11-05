package com.cyo.comicrack.viewer;

import android.content.DialogInterface;
import android.support.v4.app.C0061ce;
import java.io.File;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gu */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0832gu implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2536a;

    /* renamed from: b */
    private final /* synthetic */ boolean f2537b;

    DialogInterfaceOnClickListenerC0832gu(ReaderActivity readerActivity, boolean z) {
        this.f2536a = readerActivity;
        this.f2537b = z;
    }

    /* renamed from: a */
    static /* synthetic */ ReaderActivity m1849a(DialogInterfaceOnClickListenerC0832gu dialogInterfaceOnClickListenerC0832gu) {
        return dialogInterfaceOnClickListenerC0832gu.f2536a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i > 0 && !this.f2537b) {
            i++;
        }
        switch (i) {
            case TwitterResponse.NONE /* 0 */:
                ReaderActivity.m1612s(this.f2536a);
                break;
            case TwitterResponse.READ /* 1 */:
                new AlertDialogBuilderC0833gv(this, this.f2536a, C0806fv.tweet, C0806fv.tweet_snapshot_caption, this.f2536a.m1878r().getString("tweet_snapshot_text", this.f2536a.getString(C0806fv.tweet_snapshot_text))).m2413a().show();
                break;
            default:
                try {
                    File fileM1448a = ComicRackFilesProvider.m1448a("snapshot", ".jpg");
                    if (!ReaderActivity.m1575a(this.f2536a, fileM1448a)) {
                        fileM1448a.delete();
                    } else {
                        C0061ce.m164a(this.f2536a).m170b(ReaderActivity.m1614u(this.f2536a)).m167a((CharSequence) ReaderActivity.m1614u(this.f2536a)).m166a(ComicRackFilesProvider.m1451b(fileM1448a)).m168a(ComicRackFilesProvider.m1449a(fileM1448a)).m169a();
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
        }
    }
}
