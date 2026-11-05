package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ce */
/* loaded from: classes.dex */
public final class C0061ce {

    /* renamed from: a */
    private Activity f237a;

    /* renamed from: b */
    private Intent f238b = new Intent().setAction("android.intent.action.SEND");

    /* renamed from: c */
    private CharSequence f239c;

    /* renamed from: d */
    private ArrayList f240d;

    /* renamed from: e */
    private ArrayList f241e;

    /* renamed from: f */
    private ArrayList f242f;

    /* renamed from: g */
    private ArrayList f243g;

    /* renamed from: a */
    public static C0061ce m164a(Activity activity) {
        return new C0061ce(activity);
    }

    private C0061ce(Activity activity) {
        this.f237a = activity;
        this.f238b.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        this.f238b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
        this.f238b.addFlags(524288);
    }

    /* renamed from: a */
    private void m165a(String str, ArrayList arrayList) {
        String[] stringArrayExtra = this.f238b.getStringArrayExtra(str);
        int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
        String[] strArr = new String[arrayList.size() + length];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
        }
        this.f238b.putExtra(str, strArr);
    }

    /* renamed from: a */
    public final void m169a() {
        Activity activity = this.f237a;
        if (this.f240d != null) {
            m165a("android.intent.extra.EMAIL", this.f240d);
            this.f240d = null;
        }
        if (this.f241e != null) {
            m165a("android.intent.extra.CC", this.f241e);
            this.f241e = null;
        }
        if (this.f242f != null) {
            m165a("android.intent.extra.BCC", this.f242f);
            this.f242f = null;
        }
        boolean z = this.f243g != null && this.f243g.size() > 1;
        boolean zEquals = this.f238b.getAction().equals("android.intent.action.SEND_MULTIPLE");
        if (!z && zEquals) {
            this.f238b.setAction("android.intent.action.SEND");
            if (this.f243g == null || this.f243g.isEmpty()) {
                this.f238b.removeExtra("android.intent.extra.STREAM");
            } else {
                this.f238b.putExtra("android.intent.extra.STREAM", (Parcelable) this.f243g.get(0));
            }
            this.f243g = null;
        }
        if (z && !zEquals) {
            this.f238b.setAction("android.intent.action.SEND_MULTIPLE");
            if (this.f243g == null || this.f243g.isEmpty()) {
                this.f238b.removeExtra("android.intent.extra.STREAM");
            } else {
                this.f238b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f243g);
            }
        }
        activity.startActivity(Intent.createChooser(this.f238b, this.f239c));
    }

    /* renamed from: a */
    public final C0061ce m168a(String str) {
        this.f238b.setType(str);
        return this;
    }

    /* renamed from: a */
    public final C0061ce m167a(CharSequence charSequence) {
        this.f238b.putExtra("android.intent.extra.TEXT", charSequence);
        return this;
    }

    /* renamed from: a */
    public final C0061ce m166a(Uri uri) {
        if (!this.f238b.getAction().equals("android.intent.action.SEND")) {
            this.f238b.setAction("android.intent.action.SEND");
        }
        this.f243g = null;
        this.f238b.putExtra("android.intent.extra.STREAM", uri);
        return this;
    }

    /* renamed from: b */
    public final C0061ce m170b(String str) {
        this.f238b.putExtra("android.intent.extra.SUBJECT", str);
        return this;
    }
}
