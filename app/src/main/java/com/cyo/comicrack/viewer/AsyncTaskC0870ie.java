package com.cyo.comicrack.viewer;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.view.C1137bd;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ie */
/* loaded from: classes.dex */
final class AsyncTaskC0870ie extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ SplashActivity f2645a;

    /* renamed from: b */
    private C1137bd f2646b = new C1137bd(new int[]{75, 25});

    AsyncTaskC0870ie(SplashActivity splashActivity) {
        this.f2645a = splashActivity;
    }

    /* renamed from: a */
    static /* synthetic */ void m1862a(AsyncTaskC0870ie asyncTaskC0870ie, Object[] objArr) {
        asyncTaskC0870ie.publishProgress(objArr);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        return m1863b();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(Object obj) {
        m1861a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((Boolean) obj);
        m1861a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(Object... objArr) {
        Integer[] numArr = (Integer[]) objArr;
        try {
            C1137bd c1137bd = this.f2646b;
            ProgressBar progressBarM1640b = SplashActivity.m1640b(this.f2645a);
            c1137bd.m2412a(numArr[0].intValue(), numArr[1].intValue());
            if (progressBarM1640b != null) {
                if (progressBarM1640b.getMax() != c1137bd.f3608a) {
                    progressBarM1640b.setMax(c1137bd.f3608a);
                }
                progressBarM1640b.setProgress(c1137bd.f3609b);
                progressBarM1640b.setSecondaryProgress(c1137bd.f3610c);
            }
            if (!C0628f.m1352a().f1531a || SplashActivity.m1644f(this.f2645a).getVisibility() == 0) {
                return;
            }
            SplashActivity.m1637a(this.f2645a, C0806fv.adding_new_books_to_library, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        C0628f.m1352a().f1531a = false;
        SplashActivity.m1640b(this.f2645a).setMax(100);
    }

    /* renamed from: a */
    private void m1861a() {
        SplashActivity.m1641c(this.f2645a);
        SplashActivity.m1642d(this.f2645a);
        C0628f.m1352a().f1531a = false;
        SplashActivity.m1643e(this.f2645a);
    }

    /* renamed from: b */
    private Boolean m1863b() {
        while (!ComicRackApplication.f1954i.m1445i()) {
            try {
                SplashActivity.m1637a(this.f2645a, C0806fv.waiting_for_library_path, true);
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
        }
        SplashActivity.m1637a(this.f2645a, 0, false);
        if (SplashActivity.m1636a(this.f2645a) != null) {
            SplashActivity.m1636a(this.f2645a).dismiss();
        }
        SplashActivity.m1639a(this.f2645a, true);
        try {
            ComicRackApplication.f1954i.m1427a(new C0871if(this));
            SplashActivity.m1639a(this.f2645a, false);
            return true;
        } catch (Throwable th) {
            SplashActivity.m1639a(this.f2645a, false);
            throw th;
        }
    }
}
