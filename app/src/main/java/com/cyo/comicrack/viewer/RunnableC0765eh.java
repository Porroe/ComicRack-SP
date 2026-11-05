package com.cyo.comicrack.viewer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.eh */
/* loaded from: classes.dex */
final class RunnableC0765eh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0764eg f2404a;

    RunnableC0765eh(RunnableC0764eg runnableC0764eg) {
        this.f2404a = runnableC0764eg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LibraryActivity libraryActivity = this.f2404a.f2403a;
        if (LibraryActivity.m1875q().f1931k.size() == 0 && this.f2404a.f2403a.m1878r().getBoolean("show_empty_folder_help", true)) {
            LibraryActivity.m1474d(this.f2404a.f2403a);
        }
    }
}
