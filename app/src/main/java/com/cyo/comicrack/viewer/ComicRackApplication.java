package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.text.format.Time;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.AbstractC0614p;
import com.cyo.comicrack.p019a.p021b.C0603e;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;
import com.cyo.comicrack.p019a.p021b.InterfaceC0615q;
import com.cyo.comicrack.p019a.p021b.InterfaceC0624z;
import com.cyo.common.C0951ag;
import com.cyo.common.C0971b;
import com.cyo.common.C0998bi;
import com.cyo.common.C1095l;
import com.cyo.common.C1172w;
import com.cyo.common.C1173x;
import com.cyo.common.InterfaceC0994be;
import com.cyo.common.p024b.p025a.C0978f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Timer;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ComicRackApplication extends androidx.multidex.MultiDexApplication implements InterfaceC0615q {

    /* renamed from: f */
    public static boolean f1953f;

    /* renamed from: i */
    public static ComicRackApplication f1954i;

    /* renamed from: g */
    public String f1956g;

    /* renamed from: h */
    public String f1957h;

    /* renamed from: k */
    Timer f1958k;

    /* renamed from: l */
    private C0635m f1959l;

    /* renamed from: m */
    private C0724cu f1960m;

    /* renamed from: n */
    private boolean f1961n;

    /* renamed from: o */
    private Handler f1962o = new Handler();

    /* renamed from: p */
    private C0978f f1963p;

    /* renamed from: q */
    private boolean f1964q;

    /* renamed from: r */
    private InterfaceC0723ct f1965r;

    /* renamed from: s */
    private WeakReference f1966s;

    /* renamed from: a */
    public static final byte[] f1948a = {67, 90, -12, -1, 56, 57, -103, -120, -17, 89, 23, -45, 89, 67, 3, -32, -78, 32, 78, 1};

    /* renamed from: b */
    public static final Uri f1949b = Uri.parse("http://comicrack.cyolito.com");

    /* renamed from: c */
    public static final Uri f1950c = Uri.parse("http://comicrack.cyolito.com/documentation/comicrack-for-android");

    /* renamed from: d */
    public static final Uri f1951d = Uri.parse("market://details?id=com.cyo.comicrack.viewer");

    /* renamed from: e */
    public static final Uri f1952e = Uri.parse("https://market.android.com/details?id=com.cyo.comicrack.viewer");

    /* renamed from: j */
    public static long f1955j = new Random().nextLong();

    /* renamed from: a */
    static /* synthetic */ boolean m1409a(ComicRackApplication comicRackApplication) {
        return comicRackApplication.f1961n;
    }

    /* renamed from: b */
    static /* synthetic */ Handler m1410b(ComicRackApplication comicRackApplication) {
        return comicRackApplication.f1962o;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C0628f.m1357a(this);
        f1954i = this;
        this.f1962o = new Handler();
        this.f1956g = PreferenceManager.getDefaultSharedPreferences(this).getString("current_library_path", null);
        this.f1957h = PreferenceManager.getDefaultSharedPreferences(this).getString("current_library_2nd_path", null);
        AbstractC0614p.m1324a(this);
        if (!C0628f.f1889k) {
            registerReceiver(new C0709cf(this), new IntentFilter("com.cyo.comicracksp.WIFI_HEARTBEAT"));
        }
    }

    /* renamed from: a */
    public final void m1432a(Runnable runnable) {
        if (this.f1962o != null) {
            this.f1962o.post(runnable);
        }
    }

    /* renamed from: o */
    private boolean m1418o() {
        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("general_enable_wireless", true);
    }

    /* renamed from: a */
    public final boolean m1433a() {
        if (C0628f.f1889k) {
            return true;
        }
        return this.f1964q && m1418o();
    }

    /* renamed from: a */
    static /* synthetic */ void m1408a(ComicRackApplication comicRackApplication, boolean z) {
        if (comicRackApplication.f1964q != z) {
            comicRackApplication.f1964q = z;
            if (comicRackApplication.f1965r != null) {
                comicRackApplication.f1965r.mo1745a();
            }
            C0628f.m1367c(comicRackApplication);
        }
    }

    /* renamed from: a */
    public final void m1428a(InterfaceC0723ct interfaceC0723ct) {
        this.f1965r = interfaceC0723ct;
    }

    /* renamed from: b */
    public final void m1436b() {
        if (!C0628f.f1889k) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            boolean zM1418o = m1418o();
            String string = defaultSharedPreferences.getString("current_library_path", null);
            Intent intent = new Intent(this, (Class<?>) WifiSyncService.class);
            intent.putExtra("WifiEnabled", zM1418o);
            intent.putExtra("CurrentLibraryPath", string);
            if (zM1418o) {
                startService(intent);
            } else {
                stopService(intent);
            }
        }
    }

    /* renamed from: c */
    public final C0635m m1438c() {
        return this.f1959l;
    }

    /* renamed from: a */
    public final C0575ak m1424a(String str) {
        return (C0575ak) (this.f1959l == null ? null : this.f1959l.m1242b(str, false));
    }

    /* renamed from: b */
    public final C0505b m1435b(String str) {
        return this.f1959l.m1391a(str);
    }

    /* renamed from: a */
    public final C0505b m1422a(Intent intent) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("comic_id");
        if (stringExtra != null) {
            return m1435b(stringExtra);
        }
        return this.f1959l.m1390a(intent.getData());
    }

    /* renamed from: d */
    public final boolean m1440d() {
        return this.f1959l != null;
    }

    /* renamed from: e */
    public final SharedPreferences m1441e() {
        return PreferenceManager.getDefaultSharedPreferences(this);
    }

    /* renamed from: f */
    public final C0724cu m1442f() {
        if (this.f1960m == null) {
            this.f1960m = C0724cu.m1746a(PreferenceManager.getDefaultSharedPreferences(this).getString("config", ""));
        }
        return this.f1960m;
    }

    /* renamed from: g */
    public final void m1443g() {
        if (this.f1960m != null) {
            if (this.f1959l != null) {
                this.f1960m.f2266b = this.f1959l.m1394a();
            }
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            editorEdit.putString("config", this.f1960m.toString());
            editorEdit.commit();
            C0628f.m1362b().m1284a();
        }
    }

    /* renamed from: p */
    private long m1419p() {
        return PreferenceManager.getDefaultSharedPreferences(this).getLong("library_last_update", 0L);
    }

    /* renamed from: h */
    public final boolean m1444h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String string = defaultSharedPreferences.getString("current_library_path", "");
        String string2 = defaultSharedPreferences.getString("general_library_path", "");
        String string3 = defaultSharedPreferences.getString("current_library_2nd_path", "");
        String string4 = defaultSharedPreferences.getString("general_library_2nd_path", "");
        if (m1419p() != 0 && m1445i() && string2.equalsIgnoreCase(string)) {
            if ((m1419p() == m1421r()) && string3.equals(string4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m1445i() {
        return this.f1956g == null || new File(this.f1956g).exists();
    }

    /* renamed from: a */
    public final void m1427a(InterfaceC0624z interfaceC0624z) {
        if (m1445i()) {
            this.f1961n = true;
            f1953f = new File(String.valueOf(this.f1956g) + "/.nomediascan").exists();
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "ComicRackLibraryRefresh");
            wakeLockNewWakeLock.acquire();
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this);
                String string = defaultSharedPreferences2.getString("current_library_path", "");
                String string2 = defaultSharedPreferences2.getString("general_library_path", "");
                if (C0998bi.m2081a(string2)) {
                    string2 = string;
                } else if (!C0998bi.m2081a(string) && !string2.equalsIgnoreCase(string) && new File(String.valueOf(string) + "/comicrack.ini").delete()) {
                    C1173x.m2506a(this, string);
                }
                File file = new File(string2);
                if (!file.exists() || !C1172w.m2504a(file)) {
                    string2 = m1420q();
                }
                if (string2 != null) {
                    m1414c(file);
                    SharedPreferences.Editor editorEdit = defaultSharedPreferences2.edit();
                    editorEdit.putString("current_library_path", string2);
                    editorEdit.putString("general_library_path", string2);
                    editorEdit.commit();
                    f1954i.m1436b();
                }
                this.f1956g = string2;
                this.f1957h = defaultSharedPreferences.getString("general_library_2nd_path", "");
                defaultSharedPreferences.edit().putString("current_library_2nd_path", this.f1957h).commit();
                C0603e c0603e = new C0603e(this.f1956g, this.f1957h);
                this.f1959l = C0635m.m1381a(this, c0603e.mo1292a(interfaceC0624z), c0603e.mo1291a(), m1442f().f2266b, C0628f.f1889k ? 100 : 0, defaultSharedPreferences.getBoolean("general_library_use_volumes", true), interfaceC0624z);
                m1442f().m1747a();
                PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("library_last_update", m1421r()).commit();
                C0628f.m1367c(this);
            } finally {
                this.f1961n = false;
                wakeLockNewWakeLock.release();
            }
        }
    }

    /* renamed from: j */
    public static String m1415j() {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/Comics";
    }

    /* renamed from: q */
    private static String m1420q() {
        String strM2369a = C1095l.m2369a(Environment.getExternalStorageDirectory().getAbsolutePath(), "comicrack.ini", 8, true);
        if (strM2369a == null) {
            try {
                File file = new File(m1415j());
                if (file.exists() || file.mkdir()) {
                    return file.getAbsolutePath();
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return strM2369a;
    }

    /* renamed from: c */
    public final void m1439c(String str) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editorEdit.putString("general_library_path", str);
        editorEdit.commit();
        this.f1956g = str;
    }

    /* renamed from: k */
    public static void m1416k() {
        C0628f.m1352a().m1103a();
        C0628f.m1362b().m1284a();
        System.runFinalizersOnExit(true);
        System.exit(0);
    }

    /* renamed from: a */
    public final void m1429a(ActivityC0881ip activityC0881ip) {
        if (!this.f1961n) {
            if (!m1445i()) {
                activityC0881ip.startActivityForResult(new Intent(activityC0881ip, (Class<?>) SplashActivity.class), 1);
            } else {
                new AsyncTaskC0712ci(this, activityC0881ip).execute(new Integer[0]);
            }
        }
    }

    /* renamed from: a */
    public final boolean m1434a(ActivityC0881ip activityC0881ip, C0756dz c0756dz, boolean z) {
        C0575ak c0575ak = c0756dz.f2393c;
        List listM1382a = C0635m.m1382a((Iterable) c0756dz.f2392b);
        C0505b c0505bM1816c = c0756dz.m1816c();
        C0575ak c0575ak2 = (c0575ak != null || listM1382a.isEmpty()) ? c0575ak : (C0575ak) this.f1959l.m1984d((InterfaceC0571ag) listM1382a.get(0));
        switch (c0756dz.f2391a) {
            case TwitterResponse.NONE /* 0 */:
                InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) listM1382a.get(0);
                if (interfaceC0571ag instanceof C0572ah) {
                    C0572ah c0572ah = (C0572ah) interfaceC0571ag;
                    C0505b c0505bM1221j = c0572ah.m1221j();
                    int iY = c0572ah.m1987y();
                    C0575ak c0575ak3 = c0572ah;
                    if (iY <= 0) {
                        c0575ak3 = c0575ak2;
                    }
                    m1430a(activityC0881ip, c0505bM1221j, c0575ak3, z);
                }
                return true;
            case TwitterResponse.READ /* 1 */:
                ActivityC0881ip.m960a("Application", "Library", "Refresh", 0);
                m1429a(activityC0881ip);
                return true;
            case TwitterResponse.READ_WRITE /* 2 */:
                if (c0505bM1816c != null) {
                    m1406a(activityC0881ip, c0505bM1816c, c0575ak2, C0951ag.m1995a().mo2012a(c0756dz.f2394d, c0756dz.f2395e));
                    return true;
                }
                break;
            case 4:
                ActivityC0881ip.m960a("Application", "Comic", "Mark Read", 0);
                Iterator it = listM1382a.iterator();
                while (it.hasNext()) {
                    m1407a((C0572ah) it.next(), true);
                }
                return true;
            case 5:
                ActivityC0881ip.m960a("Application", "Comic", "Mark Unread", 0);
                Iterator it2 = listM1382a.iterator();
                while (it2.hasNext()) {
                    m1407a((C0572ah) it2.next(), false);
                }
                return true;
            case 6:
                activityC0881ip.startActivity(new Intent(activityC0881ip, (Class<?>) ComicRackPreferencesActivity.class));
                return true;
            case 12:
                ActivityC0881ip.m960a("Application", "About", "", 0);
                C0649a.m1695a(activityC0881ip, (Runnable) null);
                return true;
            case 14:
                ActivityC0881ip.m960a("Application", "Library", "RequestSync", 0);
                if (!C0628f.f1889k) {
                    sendBroadcast(new Intent("com.cyo.comicracksp.WIFI_REQUEST_SYNC"));
                } else {
                    m1405a(activityC0881ip, C0806fv.full_edition_wireless);
                }
                return true;
            case 16:
                ActivityC0881ip.m960a("Application", "Comic", "Share", 0);
                activityC0881ip.startActivity(Intent.createChooser(m1404a(c0505bM1816c), getString(C0806fv.menu_comiclist_share)));
                return true;
            case 19:
                ActivityC0881ip.m960a("Application", "Comic", "Set Checked", 0);
                Iterator it3 = listM1382a.iterator();
                while (it3.hasNext()) {
                    m1413b((C0572ah) it3.next(), true);
                }
                return true;
            case 20:
                ActivityC0881ip.m960a("Application", "Comic", "Set Unchecked", 0);
                Iterator it4 = listM1382a.iterator();
                while (it4.hasNext()) {
                    m1413b((C0572ah) it4.next(), false);
                }
                return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Intent m1404a(C0505b c0505b) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/x-cbr");
        if (c0505b != null) {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(c0505b.f1655v)));
            intent.putExtra("android.intent.extra.SUBJECT", c0505b.m1171c(true));
            intent.addFlags(1);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m1405a(Activity activity, int i) {
        new AlertDialog.Builder(activity).setTitle(C0806fv.only_available_in_full_edition).setIcon(C0802fr.icon).setMessage(i).setPositiveButton(C0806fv.buy_full, new DialogInterfaceOnClickListenerC0714ck(activity)).setNegativeButton(C0806fv.close, new DialogInterfaceOnClickListenerC0715cl()).show();
    }

    /* renamed from: a */
    private static void m1407a(C0572ah c0572ah, boolean z) {
        for (Object entry : c0572ah.m1231t()) {
            C0505b c0505b = (C0505b) entry;
            if (z) {
                c0505b.m1121a();
            } else {
                c0505b.m1128b();
            }
            C0628f.m1368c(c0505b);
        }
        c0572ah.m1228q();
    }

    /* renamed from: b */
    private static void m1413b(C0572ah c0572ah, boolean z) {
        for (Object entry : c0572ah.m1231t()) {
            C0505b c0505b = (C0505b) entry;
            c0505b.m1126a(z);
            C0628f.m1368c(c0505b);
        }
    }

    /* renamed from: a */
    public final void m1431a(ActivityC0881ip activityC0881ip, Runnable runnable) {
        int i = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String string = defaultSharedPreferences.getString("about_version", "");
        String strM2003d = C0951ag.m2003d(this);
        int i2 = defaultSharedPreferences.getInt("about_version_count", 0) + 1;
        if (i2 == 5) {
            try {
                if (C0649a.m1698b() && !C0649a.m1696a()) {
                    runnable = new RunnableC0716cm(this, activityC0881ip, runnable);
                }
            } catch (Throwable th2) {
                i = i2;
                defaultSharedPreferences.edit().putString("about_version", strM2003d).putInt("about_version_count", i).commit();
                throw th2;
            }
        }
        if (string.equals(strM2003d)) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            try {
                C0649a.m1695a(activityC0881ip, runnable);
                i2 = 0;
            } catch (Throwable th3) {
                defaultSharedPreferences.edit().putString("about_version", strM2003d).putInt("about_version_count", i).commit();
                throw th3;
            }
        }
        defaultSharedPreferences.edit().putString("about_version", strM2003d).putInt("about_version_count", i2).commit();
    }

    /* renamed from: a */
    public final void m1425a(Activity activity) {
        this.f1966s = new WeakReference(activity);
    }

    /* renamed from: a */
    private void m1406a(Activity activity, C0505b c0505b, C0575ak c0575ak, Bundle bundle) {
        if (c0505b != null) {
            InterfaceC0994be interfaceC0994beM1995a = C0951ag.m1995a();
            C0635m c0635m = this.f1959l;
            interfaceC0994beM1995a.mo2022a(activity, C0635m.m1380a(activity.getApplicationContext(), ReaderActivity.class, c0505b, c0575ak, true), bundle);
        }
    }

    /* renamed from: a */
    public final C0572ah m1423a(Activity activity, C0575ak c0575ak) {
        while (c0575ak != null) {
            Time time = C0971b.f2864a;
            Iterator it = c0575ak.m1986x().iterator();
            C0572ah c0572ah = null;
            Time time2 = time;
            while (it.hasNext()) {
                C0572ah c0572ah2 = (C0572ah) ((InterfaceC0571ag) it.next());
                Time timeM1229r = c0572ah2.m1229r();
                if (Time.compare(time2, timeM1229r) < 0) {
                    c0572ah = c0572ah2;
                    time2 = timeM1229r;
                }
            }
            if (c0572ah == null) {
                return null;
            }
            if (c0572ah.m1987y() <= 0) {
                m1406a(activity, c0572ah.m1221j(), c0575ak, (Bundle) null);
                return c0572ah;
            }
            c0575ak = c0572ah;
        }
        return null;
    }

    /* renamed from: a */
    public final void m1430a(ActivityC0881ip activityC0881ip, C0505b c0505b, C0575ak c0575ak, boolean z) {
        if (z) {
            C0635m c0635m = this.f1959l;
            activityC0881ip.startActivity(C0635m.m1380a(activityC0881ip.getApplicationContext(), ComicDetailsActivity.class, c0505b, c0575ak, true));
            return;
        }
        C0906u c0906u = new C0906u();
        c0906u.m174a(C0807fw.DefaultDialog);
        c0906u.m1909a(c0505b, c0575ak);
        activityC0881ip.m1876a(c0906u, "detailsDialog");
        c0906u.m1910a(new RunnableC0717cn(this, activityC0881ip));
    }

    /* renamed from: b */
    private static Properties m1411b(File file) {
        FileInputStream fileInputStream;
        File file2 = new File(String.valueOf(file.getPath()) + "/comicrack.ini");
        Properties properties = new Properties();
        if (file2.exists()) {
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    properties.load(fileInputStream);
                } catch (Exception e) {
                    e = e;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    e.printStackTrace();
                    return properties;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                fileInputStream = null;
            }
        }
        return properties;
    }

    /* renamed from: c */
    private void m1414c(File file) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.valueOf(file.getPath()) + "/comicrack.ini");
        Properties propertiesM1411b = m1411b(file);
        Properties propertiesM1363b = C0628f.m1363b(getApplicationContext());
        if (!propertiesM1363b.equals(propertiesM1411b)) {
            try {
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    propertiesM1363b.store(fileOutputStream, "ComicRack Device Information");
                    if (!f1953f) {
                        C1173x.m2505a(this, file2);
                    }
                } catch (IOException e) {
                    e = e;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    e.printStackTrace();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                fileOutputStream = null;
            }
        }
    }

    /* renamed from: r */
    private long m1421r() {
        return new File(String.valueOf(this.f1956g) + "/comicrack.ini").lastModified();
    }

    /* renamed from: l */
    public static boolean m1417l() {
        return C0628f.f1889k;
    }

    /* renamed from: b */
    public final void m1437b(ActivityC0881ip activityC0881ip) {
        if (this.f1958k == null) {
            this.f1958k = new Timer("Background Watchers", true);
            this.f1958k.schedule(new C0718co(this, activityC0881ip), 10000L, 10000L);
            this.f1958k.schedule(new C0720cq(this), 10000L, 10000L);
        }
    }

    /* renamed from: m */
    public final void m1446m() {
        if (this.f1958k != null) {
            this.f1958k.cancel();
            this.f1958k = null;
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0615q
    /* renamed from: a */
    public final void mo1329a(File file) {
        if (!f1953f) {
            C1173x.m2505a(this, file);
        }
    }

    /* renamed from: b */
    public static void m1412b(Activity activity) {
        if (activity != null) {
            try {
                activity.startActivity(new Intent("android.intent.action.VIEW", f1951d));
            } catch (Exception e) {
                activity.startActivity(new Intent("android.intent.action.VIEW", f1952e));
            }
        }
    }

    /* renamed from: n */
    public final C0978f m1447n() {
        if (this.f1963p == null) {
            this.f1963p = new C0978f("lc7K38IqLGD9tlvj9DP42w", "RgiRdp7tjUg1F3120P1N7cWB2AN7tSD3HjjOVuQtaW4", "72f97428c2cd9571cb1d3ed8fcbd8174", PreferenceManager.getDefaultSharedPreferences(this));
        }
        return this.f1963p;
    }

    /* renamed from: a */
    public final void m1426a(Activity activity, InterfaceC0606h interfaceC0606h, boolean z, Runnable runnable) {
        C0505b c0505bMo1298a = interfaceC0606h.mo1298a();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean zM1996a = C0951ag.m1996a(activity);
        View viewInflate = activity.getLayoutInflater().inflate(C0804ft.comic_rating, (ViewGroup) null);
        RatingBar ratingBar = (RatingBar) viewInflate.findViewById(C0803fs.comicRating);
        EditText editText = (EditText) viewInflate.findViewById(C0803fs.comicRatingReview);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(C0803fs.comicRatingTweet);
        ratingBar.setRating(c0505bMo1298a.f1576h);
        editText.setText(c0505bMo1298a.f1624I);
        checkBox.setChecked(defaultSharedPreferences.getBoolean("tweet_rating", false));
        if (!zM1996a) {
            checkBox.setVisibility(8);
        }
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(c0505bMo1298a.m1171c(false)).setView(viewInflate).setPositiveButton(android.R.string.yes, new DialogInterfaceOnClickListenerC0721cr(this, ratingBar, editText, c0505bMo1298a, interfaceC0606h, zM1996a, checkBox, defaultSharedPreferences, activity)).setNegativeButton(android.R.string.no, (DialogInterface.OnClickListener) null);
        if (z) {
            negativeButton.setNeutralButton(C0806fv.do_not_ask_again, new DialogInterfaceOnClickListenerC0710cg(this, defaultSharedPreferences));
        }
        AlertDialog alertDialogCreate = negativeButton.create();
        alertDialogCreate.setCanceledOnTouchOutside(true);
        alertDialogCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC0711ch(this, defaultSharedPreferences, checkBox, activity, runnable));
        alertDialogCreate.show();
    }
}
