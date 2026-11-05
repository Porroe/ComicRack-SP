package com.cyo.comicrack.viewer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.gn */
/* loaded from: classes.dex */
final class AsyncTaskC0825gn extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ReaderActivity f2521a;

    /* renamed from: b */
    private final /* synthetic */ int f2522b = -1;

    /* renamed from: c */
    private final /* synthetic */ EnumC0793fi f2523c;

    /* renamed from: d */
    private final /* synthetic */ C0505b f2524d;

    AsyncTaskC0825gn(ReaderActivity readerActivity, EnumC0793fi enumC0793fi, C0505b c0505b) {
        this.f2521a = readerActivity;
        this.f2523c = enumC0793fi;
        this.f2524d = c0505b;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        if (this.f2524d == null) {
            return null;
        }
        if (this.f2524d.f1584p || this.f2524d.m1139e() == 0) {
            return C0628f.m1355a(this.f2524d.f1655v, this.f2524d.f1584p);
        }
        InterfaceC0606h interfaceC0606hM1354a = C0628f.m1354a(this.f2524d, true);
        if (interfaceC0606hM1354a != null) {
            return interfaceC0606hM1354a;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        InterfaceC0606h interfaceC0606h = (InterfaceC0606h) obj;
        if (interfaceC0606h == null || !interfaceC0606h.mo1310e()) {
            new AlertDialog.Builder(this.f2521a).setMessage(interfaceC0606h == null ? C0806fv.failed_to_open_ecomic : C0806fv.solid_cbr_ecomics_error).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show().setOnDismissListener(new DialogInterfaceOnDismissListenerC0826go(this));
        } else {
            ReaderActivity.m1557a(this.f2521a, interfaceC0606h, this.f2522b, new C0794fj(this.f2523c, ReaderActivity.m1585c(this.f2521a)));
        }
        super.onPostExecute(interfaceC0606h);
    }

    /* renamed from: a */
    static /* synthetic */ ReaderActivity m1848a(AsyncTaskC0825gn asyncTaskC0825gn) {
        return asyncTaskC0825gn.f2521a;
    }
}
