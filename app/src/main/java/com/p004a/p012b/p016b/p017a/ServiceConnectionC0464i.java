package com.p004a.p012b.p016b.p017a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.p004a.p012b.p016b.p017a.p018a.C0455a;
import com.p004a.p012b.p016b.p017a.p018a.C0456b;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.i */
/* loaded from: classes.dex */
public final class ServiceConnectionC0464i implements ServiceConnection {

    /* renamed from: a */
    private static final SecureRandom f1490a = new SecureRandom();

    /* renamed from: b */
    private InterfaceC0461f f1491b;

    /* renamed from: c */
    private PublicKey f1492c;

    /* renamed from: d */
    private final Context f1493d;

    /* renamed from: e */
    private final InterfaceC0472q f1494e;

    /* renamed from: f */
    private Handler f1495f;

    /* renamed from: g */
    private final String f1496g;

    /* renamed from: h */
    private final String f1497h;

    /* renamed from: i */
    private final Set f1498i = new HashSet();

    /* renamed from: j */
    private final Queue f1499j = new LinkedList();

    /* renamed from: c */
    static /* synthetic */ PublicKey m1071c(ServiceConnectionC0464i serviceConnectionC0464i) {
        return serviceConnectionC0464i.f1492c;
    }

    /* renamed from: a */
    static /* synthetic */ Handler m1062a(ServiceConnectionC0464i serviceConnectionC0464i) {
        return serviceConnectionC0464i.f1495f;
    }

    /* renamed from: b */
    static /* synthetic */ Set m1067b(ServiceConnectionC0464i serviceConnectionC0464i) {
        return serviceConnectionC0464i.f1498i;
    }

    public ServiceConnectionC0464i(Context context, InterfaceC0472q interfaceC0472q, String str) {
        this.f1493d = context;
        this.f1494e = interfaceC0472q;
        this.f1492c = m1064a(str);
        this.f1496g = this.f1493d.getPackageName();
        this.f1497h = m1063a(context, this.f1496g);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f1495f = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    private static PublicKey m1064a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C0455a.m1058a(str)));
        } catch (C0456b e) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: a */
    public final synchronized void m1074a(InterfaceC0468m interfaceC0468m) {
        boolean zMo1085a = this.f1494e.mo1085a();
        if (zMo1085a == zMo1085a) {
            Log.i("LicenseChecker", "Using cached license response");
            interfaceC0468m.mo1078a();
        } else {
            C0469n c0469n = new C0469n(this.f1494e, new C0470o(), interfaceC0468m, f1490a.nextInt(), this.f1496g, this.f1497h);
            if (this.f1491b == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    try {
                        Intent intent = new Intent(new String(C0455a.m1058a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                        intent.setPackage("com.android.vending");
                        if (this.f1493d.bindService(intent, this, 1)) {
                            this.f1499j.offer(c0469n);
                        } else {
                            Log.e("LicenseChecker", "Could not bind to service.");
                            m1070b(c0469n);
                        }
                    } catch (C0456b e) {
                        e.printStackTrace();
                    }
                } catch (SecurityException e2) {
                    interfaceC0468m.mo1080c();
                }
            } else {
                this.f1499j.offer(c0469n);
                m1068b();
            }
        }
    }

    /* renamed from: b */
    private void m1068b() {
        while (true) {
            C0469n c0469n = (C0469n) this.f1499j.poll();
            if (c0469n != null) {
                try {
                    Log.i("LicenseChecker", "Calling checkLicense on service for " + c0469n.f1510c);
                    this.f1491b.mo1060a(c0469n.f1509b, c0469n.f1510c, new BinderC0465j(this, c0469n));
                    this.f1498i.add(c0469n);
                } catch (RemoteException e) {
                    Log.w("LicenseChecker", "RemoteException in checkLicense call.", e);
                    m1070b(c0469n);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m1069b(ServiceConnectionC0464i serviceConnectionC0464i, C0469n c0469n) {
        serviceConnectionC0464i.m1066a(c0469n);
    }

    /* renamed from: a */
    private synchronized void m1066a(C0469n c0469n) {
        this.f1498i.remove(c0469n);
        if (this.f1498i.isEmpty()) {
            m1072c();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1491b = AbstractBinderC0462g.m1061a(iBinder);
        m1068b();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f1491b = null;
    }

    /* renamed from: a */
    static /* synthetic */ void m1065a(ServiceConnectionC0464i serviceConnectionC0464i, C0469n c0469n) {
        serviceConnectionC0464i.m1070b(c0469n);
    }

    /* renamed from: b */
    private synchronized void m1070b(C0469n c0469n) {
        this.f1494e.mo1084a(291, null);
        if (this.f1494e.mo1085a()) {
            c0469n.f1508a.mo1078a();
        } else {
            c0469n.f1508a.mo1079b();
        }
    }

    /* renamed from: c */
    private void m1072c() {
        if (this.f1491b != null) {
            try {
                this.f1493d.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f1491b = null;
        }
    }

    /* renamed from: a */
    public final synchronized void m1073a() {
        m1072c();
        this.f1495f.getLooper().quit();
    }

    /* renamed from: a */
    private static String m1063a(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }
}
