package com.cyo.comicrack.viewer;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.cyo.common.C0951ag;
import com.cyo.common.view.C1137bd;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.ci */
/* loaded from: classes.dex */
final class AsyncTaskC0712ci extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2238a;

    /* renamed from: b */
    private ProgressDialog f2239b;

    /* renamed from: c */
    private C1137bd f2240c = new C1137bd(new int[]{75, 25});

    /* renamed from: d */
    private final /* synthetic */ ActivityC0881ip f2241d;

    AsyncTaskC0712ci(ComicRackApplication comicRackApplication, ActivityC0881ip activityC0881ip) {
        this.f2238a = comicRackApplication;
        this.f2241d = activityC0881ip;
    }

    /* renamed from: a */
    static /* synthetic */ void m1742a(AsyncTaskC0712ci asyncTaskC0712ci, Object[] objArr) {
        asyncTaskC0712ci.publishProgress(objArr);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        this.f2238a.m1427a(new C0713cj(this));
        return true;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f2239b.dismiss();
        if (this.f2241d.m1881u()) {
            this.f2241d.m1880t();
        }
        super.onPostExecute(bool);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(Object... objArr) {
        Integer[] numArr = (Integer[]) objArr;
        C1137bd c1137bd = this.f2240c;
        ProgressDialog progressDialog = this.f2239b;
        c1137bd.m2412a(numArr[0].intValue(), numArr[1].intValue());
        if (progressDialog != null) {
            if (progressDialog.getMax() != c1137bd.f3608a) {
                progressDialog.setMax(c1137bd.f3608a);
            }
            progressDialog.setProgress(c1137bd.f3609b);
            progressDialog.setSecondaryProgress(c1137bd.f3610c);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        super.onPreExecute();
        this.f2239b = new ProgressDialog(this.f2241d);
        C0951ag.m1995a().mo2021a(this.f2239b);
        this.f2239b.setProgressStyle(1);
        this.f2239b.setMessage(this.f2241d.getString(C0806fv.refreshing_dialog));
        this.f2239b.setMax(100);
        this.f2239b.setCancelable(false);
        this.f2239b.show();
    }
}
