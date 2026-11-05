package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.p000a.C0000a;
import android.support.v4.p000a.InterfaceC0001b;
import android.support.v4.p002c.C0098d;
import android.util.Log;
import java.io.PrintWriter;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.am */
/* loaded from: classes.dex */
final class C0015am implements InterfaceC0001b {

    // The APK has no constructor for this class.
    private C0015am() {
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    final int f147a;

    /* renamed from: b */
    final Bundle f148b;

    /* renamed from: c */
    InterfaceC0013ak f149c;

    /* renamed from: d */
    C0000a f150d;

    /* renamed from: e */
    boolean f151e;

    /* renamed from: f */
    boolean f152f;

    /* renamed from: g */
    Object f153g;

    /* renamed from: h */
    boolean f154h;

    /* renamed from: i */
    boolean f155i;

    /* renamed from: j */
    boolean f156j;

    /* renamed from: k */
    boolean f157k;

    /* renamed from: l */
    boolean f158l;

    /* renamed from: m */
    boolean f159m;

    /* renamed from: n */
    C0015am f160n;

    /* renamed from: o */
    final /* synthetic */ C0014al f161o;

    /* renamed from: a */
    final void m124a() {
        if (C0014al.f140a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.f154h = false;
        if (!this.f155i && this.f150d != null && this.f159m) {
            this.f159m = false;
            this.f150d.m0a(this);
            this.f150d.f2c = false;
        }
    }

    /* renamed from: b */
    final void m127b() {
        String str;
        C0015am loader = this;
        while (true) {
            if (C0014al.f140a) {
                Log.v("LoaderManager", "  Destroying: " + loader);
            }
            loader.f158l = true;
            boolean z = loader.f152f;
            loader.f152f = false;
            if (loader.f149c != null && loader.f150d != null && loader.f151e && z) {
                if (C0014al.f140a) {
                    Log.v("LoaderManager", "  Reseting: " + loader);
                }
                if (loader.f161o.f144e != null) {
                    String str2 = loader.f161o.f144e.f274b.f317u;
                    loader.f161o.f144e.f274b.f317u = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    InterfaceC0013ak interfaceC0013ak = loader.f149c;
                    C0000a c0000a = loader.f150d;
                } finally {
                    if (loader.f161o.f144e != null) {
                        loader.f161o.f144e.f274b.f317u = str;
                    }
                }
            }
            loader.f149c = null;
            loader.f153g = null;
            loader.f151e = false;
            if (loader.f150d != null) {
                if (loader.f159m) {
                    loader.f159m = false;
                    loader.f150d.m0a(loader);
                }
                C0000a c0000a2 = loader.f150d;
                c0000a2.f4e = true;
                c0000a2.f2c = false;
                c0000a2.f3d = false;
                c0000a2.f5f = false;
                c0000a2.f6g = false;
            }
            if (loader.f160n != null) {
                loader = loader.f160n;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    final void m125a(C0000a c0000a, Object obj) {
        String str;
        if (this.f149c != null) {
            if (this.f161o.f144e == null) {
                str = null;
            } else {
                String str2 = this.f161o.f144e.f274b.f317u;
                this.f161o.f144e.f274b.f317u = "onLoadFinished";
                str = str2;
            }
            try {
                if (C0014al.f140a) {
                    StringBuilder sbAppend = new StringBuilder("  onLoadFinished in ").append(c0000a).append(": ");
                    StringBuilder sb = new StringBuilder(64);
                    C0098d.m272a(obj, sb);
                    sb.append("}");
                    Log.v("LoaderManager", sbAppend.append(sb.toString()).toString());
                }
                InterfaceC0013ak interfaceC0013ak = this.f149c;
                this.f152f = true;
            } finally {
                if (this.f161o.f144e != null) {
                    this.f161o.f144e.f274b.f317u = str;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f147a);
        sb.append(" : ");
        C0098d.m272a(this.f150d, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m126a(String str, PrintWriter printWriter) {
        C0015am loader = this;
        while (true) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(loader.f147a);
            printWriter.print(" mArgs=");
            printWriter.println(loader.f148b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(loader.f149c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(loader.f150d);
            if (loader.f150d != null) {
                C0000a c0000a = loader.f150d;
                String str2 = str + "  ";
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(c0000a.f0a);
                printWriter.print(" mListener=");
                printWriter.println(c0000a.f1b);
                if (c0000a.f2c || c0000a.f5f || c0000a.f6g) {
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    printWriter.print(c0000a.f2c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(c0000a.f5f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(c0000a.f6g);
                }
                if (c0000a.f3d || c0000a.f4e) {
                    printWriter.print(str2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(c0000a.f3d);
                    printWriter.print(" mReset=");
                    printWriter.println(c0000a.f4e);
                }
            }
            if (loader.f151e || loader.f152f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(loader.f151e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(loader.f152f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(loader.f153g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(loader.f154h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(loader.f157k);
            printWriter.print(" mDestroyed=");
            printWriter.println(loader.f158l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(loader.f155i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(loader.f156j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(loader.f159m);
            if (loader.f160n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(loader.f160n);
                printWriter.println(":");
                loader = loader.f160n;
                str = str + "  ";
            } else {
                return;
            }
        }
    }
}
