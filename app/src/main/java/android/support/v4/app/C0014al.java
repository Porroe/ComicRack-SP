package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.p000a.C0000a;
import android.support.v4.p002c.C0098d;
import android.support.v4.p002c.C0107m;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.al */
/* loaded from: classes.dex */
final class C0014al extends AbstractC0012aj {

    // The APK has no constructor for this class.
    private C0014al() {
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    static boolean f140a = false;

    /* renamed from: b */
    final C0107m f141b;

    /* renamed from: c */
    final C0107m f142c;

    /* renamed from: d */
    final String f143d;

    /* renamed from: e */
    ActivityC0076l f144e;

    /* renamed from: f */
    boolean f145f;

    /* renamed from: g */
    boolean f146g;

    /* renamed from: a */
    final void m115a(ActivityC0076l activityC0076l) {
        this.f144e = activityC0076l;
    }

    /* renamed from: b */
    final void m117b() {
        if (f140a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f145f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f145f = true;
        for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
            C0015am c0015am = (C0015am) this.f141b.m292b(iM290a);
            if (c0015am.f155i && c0015am.f156j) {
                c0015am.f154h = true;
            } else if (c0015am.f154h) {
                continue;
            } else {
                c0015am.f154h = true;
                if (f140a) {
                    Log.v("LoaderManager", "  Starting: " + c0015am);
                }
                if (c0015am.f150d == null && c0015am.f149c != null) {
                    InterfaceC0013ak interfaceC0013ak = c0015am.f149c;
                    int i = c0015am.f147a;
                    Bundle bundle = c0015am.f148b;
                    c0015am.f150d = interfaceC0013ak.m114a();
                }
                if (c0015am.f150d == null) {
                    continue;
                } else {
                    if (c0015am.f150d.getClass().isMemberClass() && !Modifier.isStatic(c0015am.f150d.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c0015am.f150d);
                    }
                    if (!c0015am.f159m) {
                        C0000a c0000a = c0015am.f150d;
                        int i2 = c0015am.f147a;
                        if (c0000a.f1b != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c0000a.f1b = c0015am;
                        c0000a.f0a = i2;
                        c0015am.f159m = true;
                    }
                    C0000a c0000a2 = c0015am.f150d;
                    c0000a2.f2c = true;
                    c0000a2.f4e = false;
                    c0000a2.f3d = false;
                }
            }
        }
    }

    /* renamed from: c */
    final void m118c() {
        if (f140a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f145f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
                ((C0015am) this.f141b.m292b(iM290a)).m124a();
            }
            this.f145f = false;
        }
    }

    /* renamed from: d */
    final void m119d() {
        if (f140a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f145f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.f146g = true;
        this.f145f = false;
        for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
            C0015am c0015am = (C0015am) this.f141b.m292b(iM290a);
            if (f140a) {
                Log.v("LoaderManager", "  Retaining: " + c0015am);
            }
            c0015am.f155i = true;
            c0015am.f156j = c0015am.f154h;
            c0015am.f154h = false;
            c0015am.f149c = null;
        }
    }

    /* renamed from: e */
    final void m120e() {
        if (this.f146g) {
            if (f140a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f146g = false;
            for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
                C0015am c0015am = (C0015am) this.f141b.m292b(iM290a);
                if (c0015am.f155i) {
                    if (f140a) {
                        Log.v("LoaderManager", "  Finished Retaining: " + c0015am);
                    }
                    c0015am.f155i = false;
                    if (c0015am.f154h != c0015am.f156j && !c0015am.f154h) {
                        c0015am.m124a();
                    }
                }
                if (c0015am.f154h && c0015am.f151e && !c0015am.f157k) {
                    c0015am.m125a(c0015am.f150d, c0015am.f153g);
                }
            }
        }
    }

    /* renamed from: f */
    final void m121f() {
        for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
            ((C0015am) this.f141b.m292b(iM290a)).f157k = true;
        }
    }

    /* renamed from: g */
    final void m122g() {
        for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
            C0015am c0015am = (C0015am) this.f141b.m292b(iM290a);
            if (c0015am.f154h && c0015am.f157k) {
                c0015am.f157k = false;
                if (c0015am.f151e) {
                    c0015am.m125a(c0015am.f150d, c0015am.f153g);
                }
            }
        }
    }

    /* renamed from: h */
    final void m123h() {
        if (!this.f146g) {
            if (f140a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int iM290a = this.f141b.m290a() - 1; iM290a >= 0; iM290a--) {
                ((C0015am) this.f141b.m292b(iM290a)).m127b();
            }
            this.f141b.m293b();
        }
        if (f140a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int iM290a2 = this.f142c.m290a() - 1; iM290a2 >= 0; iM290a2--) {
            ((C0015am) this.f142c.m292b(iM290a2)).m127b();
        }
        this.f142c.m293b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0098d.m272a(this.f144e, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m116a(String str, PrintWriter printWriter) {
        if (this.f141b.m290a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f141b.m290a(); i++) {
                C0015am c0015am = (C0015am) this.f141b.m292b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f141b.m291a(i));
                printWriter.print(": ");
                printWriter.println(c0015am.toString());
                c0015am.m126a(str2, printWriter);
            }
        }
        if (this.f142c.m290a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f142c.m290a(); i2++) {
                C0015am c0015am2 = (C0015am) this.f142c.m292b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f142c.m291a(i2));
                printWriter.print(": ");
                printWriter.println(c0015am2.toString());
                c0015am2.m126a(str3, printWriter);
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0012aj
    /* renamed from: a */
    public final boolean mo113a() {
        int iM290a = this.f141b.m290a();
        boolean z = false;
        for (int i = 0; i < iM290a; i++) {
            C0015am c0015am = (C0015am) this.f141b.m292b(i);
            z |= c0015am.f154h && !c0015am.f152f;
        }
        return z;
    }
}
