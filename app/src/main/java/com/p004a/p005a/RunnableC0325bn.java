package com.p004a.p005a;

import android.app.Activity;
import com.p004a.p005a.p008c.AbstractC0344e;
import com.p004a.p005a.p008c.C0339a;
import com.p004a.p005a.p008c.InterfaceC0341b;
import com.p004a.p005a.p008c.InterfaceC0342c;
import com.p004a.p005a.p008c.InterfaceC0343d;
import com.p004a.p005a.p011e.C0372i;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.a.a.bn */
/* loaded from: classes.dex */
final class RunnableC0325bn implements Runnable {

    /* renamed from: a */
    private final C0322bk f932a;

    /* renamed from: b */
    private final String f933b;

    /* renamed from: c */
    private final C0357e f934c;

    /* renamed from: d */
    private final HashMap f935d;

    /* renamed from: e */
    private final boolean f936e;

    /* renamed from: f */
    private final WeakReference f937f;

    public RunnableC0325bn(C0322bk c0322bk, Activity activity, String str, C0357e c0357e, HashMap map) {
        boolean z;
        this.f932a = c0322bk;
        this.f933b = str;
        this.f937f = new WeakReference(activity);
        this.f934c = c0357e;
        this.f935d = new HashMap(map);
        String str2 = (String) this.f935d.remove("gwhirl_share_location");
        if ("1".equals(str2)) {
            z = true;
        } else {
            if (str2 != null && !"0".equals(str2)) {
                C0372i.m914b("Received an illegal value, '" + str2 + "', for the special share location parameter from mediation server (expected '0' or '1'). Will not share the location.");
            }
            z = false;
        }
        this.f936e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0372i.m911a("Trying to instantiate: " + this.f933b);
            InterfaceC0341b interfaceC0341b = (InterfaceC0341b) InterfaceC0341b.class.cast(Class.forName(this.f933b).newInstance());
            Activity activity = (Activity) this.f937f.get();
            if (activity == null) {
                throw new C0326bo("Activity became null while trying to instantiate adapter.");
            }
            this.f932a.m827a(interfaceC0341b);
            Class clsM847c = interfaceC0341b.m847c();
            if (clsM847c != null) {
                ((AbstractC0344e) clsM847c.newInstance()).m851a(this.f935d);
            }
            Class clsM846b = interfaceC0341b.m846b();
            if (clsM846b != null) {
                this.f934c.m862a(clsM846b);
            }
            new C0339a(this.f934c, activity, this.f936e);
            if (this.f932a.f916a.m687a()) {
                if (!(interfaceC0341b instanceof InterfaceC0343d)) {
                    throw new C0326bo("Adapter " + this.f933b + " doesn't support the MediationInterstitialAdapter interface.");
                }
                new C0328bq(this.f932a);
                ((InterfaceC0343d) interfaceC0341b).m849d();
            } else {
                if (!(interfaceC0341b instanceof InterfaceC0342c)) {
                    throw new C0326bo("Adapter " + this.f933b + " doesn't support the MediationBannerAdapter interface");
                }
                new C0327bp(this.f932a);
                this.f932a.f916a.m690c();
                ((InterfaceC0342c) interfaceC0341b).m848d();
            }
            this.f932a.m834h();
        } catch (ClassNotFoundException e) {
            m836a("Cannot find adapter class '" + this.f933b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", e, EnumC0321bj.NOT_FOUND);
        } catch (Throwable th) {
            m836a("Error while creating adapter and loading ad from ad network. Skipping ad network.", th, EnumC0321bj.EXCEPTION);
        }
    }

    /* renamed from: a */
    private void m836a(String str, Throwable th, EnumC0321bj enumC0321bj) {
        C0372i.m915b(str, th);
        this.f932a.m826a(enumC0321bj);
    }
}
