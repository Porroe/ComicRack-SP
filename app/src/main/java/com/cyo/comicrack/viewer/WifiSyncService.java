package com.cyo.comicrack.viewer;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.IBinder;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.support.v4.app.C0024av;
import android.util.Log;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0951ag;
import com.cyo.common.C0998bi;
import com.cyo.common.C1095l;
import com.cyo.common.C1173x;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Timer;
import twitter4j.HttpResponseCode;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class WifiSyncService extends Service {

    /* renamed from: A */
    private String f2108A;

    /* renamed from: B */
    private boolean f2109B;

    /* renamed from: D */
    private NotificationManager f2111D;

    /* renamed from: E */
    private C0024av f2112E;

    /* renamed from: F */
    private boolean f2113F;

    /* renamed from: G */
    private Timer f2114G;

    /* renamed from: H */
    private int f2115H;

    /* renamed from: I */
    private PowerManager.WakeLock f2116I;

    /* renamed from: o */
    private ServerSocket f2131o;

    /* renamed from: p */
    private Thread f2132p;

    /* renamed from: q */
    private Timer f2133q;

    /* renamed from: r */
    private BroadcastReceiver f2134r;

    /* renamed from: s */
    private BroadcastReceiver f2135s;

    /* renamed from: t */
    private BroadcastReceiver f2136t;

    /* renamed from: u */
    private long f2137u;

    /* renamed from: v */
    private long f2138v;

    /* renamed from: w */
    private boolean f2139w;

    /* renamed from: x */
    private int f2140x;

    /* renamed from: y */
    private String f2141y;

    /* renamed from: z */
    private boolean f2142z;

    /* renamed from: a */
    private static final int LIST_FILES = 0;

    /* renamed from: b */
    private static final int SEND_FILE = 1;

    /* renamed from: c */
    private static final int GET_FREE_SPACE = 2;

    /* renamed from: d */
    private static final int FILE_EXISTS = 3;

    /* renamed from: e */
    private static final int DELETE_FILE = 4;

    /* renamed from: f */
    private static final int RECEIVE_FILE = 5;

    /* renamed from: g */
    private static final int START_SYNC = 6;

    /* renamed from: h */
    private static final int FINISH_SYNC = 7;

    /* renamed from: i */
    private static final int UPDATE_SYNC_PHASE = 8;

    /* renamed from: j */
    private static final int GET_DEVICE_INFO = 9;

    /* renamed from: k */
    private static final int SEND_FILES = 10;

    /* renamed from: l */
    private static final int IS_SYNC_CANCELLED = 11;

    /* renamed from: m */
    private static final int HEARTBEAT = 12;

    /* renamed from: n */
    private static final int REGISTER_CLIENT = 13;

    /* renamed from: C */
    private HashSet<C0895jc> f2110C = new HashSet<>();

    /* renamed from: e */
    static /* synthetic */ ServerSocket m1679e(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2131o;
    }

    /* renamed from: a */
    static /* synthetic */ long m1649a(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2137u;
    }

    /* renamed from: a */
    static /* synthetic */ void m1658a(WifiSyncService wifiSyncService, long j) {
        wifiSyncService.f2137u = j;
    }

    /* renamed from: b */
    static /* synthetic */ long m1670b(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2138v;
    }

    /* renamed from: b */
    static /* synthetic */ void m1673b(WifiSyncService wifiSyncService, long j) {
        wifiSyncService.f2138v = j;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m1684g(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2139w;
    }

    /* renamed from: a */
    static /* synthetic */ void m1657a(WifiSyncService wifiSyncService, int i) {
        wifiSyncService.f2140x = i;
    }

    /* renamed from: p */
    static /* synthetic */ int m1693p(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2140x;
    }

    /* renamed from: j */
    static /* synthetic */ String m1687j(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2141y;
    }

    /* renamed from: f */
    static /* synthetic */ void m1682f(WifiSyncService wifiSyncService) {
        wifiSyncService.f2142z = true;
    }

    /* renamed from: i */
    static /* synthetic */ boolean m1686i(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2142z;
    }

    /* compiled from: DontLook */
    public class BootCompletedReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WifiSyncService.m1653a(context);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences != null) {
            this.f2109B = defaultSharedPreferences.getBoolean("general_enable_wireless", true);
        }
        if (intent != null) {
            this.f2109B = intent.getBooleanExtra("WifiEnabled", this.f2109B);
            this.f2108A = intent.getStringExtra("CurrentLibraryPath");
        }
        if (defaultSharedPreferences != null && C0998bi.m2081a(this.f2108A)) {
            this.f2108A = defaultSharedPreferences.getString("current_library_path", null);
        }
        if (C0628f.f1889k || !this.f2109B || C0998bi.m2081a(this.f2108A)) {
            stopSelf();
            return 2;
        }
        if (this.f2134r == null) {
            this.f2134r = new C0884is(this);
            registerReceiver(this.f2134r, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        }
        if (this.f2136t == null) {
            this.f2136t = new C0885it(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_BACKGROUND");
            intentFilter.addAction("android.intent.action.USER_FOREGROUND");
            registerReceiver(this.f2136t, intentFilter);
        }
        m1651a();
        return 1;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        m1675c();
        if (this.f2134r != null) {
            unregisterReceiver(this.f2134r);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    static /* synthetic */ void m1662a(WifiSyncService wifiSyncService, NetworkInfo.State state) {
        wifiSyncService.m1656a(state);
    }

    /* renamed from: a */
    private void m1656a(NetworkInfo.State state) {
        if (!C0628f.f1889k) {
            if (this.f2109B && state == NetworkInfo.State.CONNECTED) {
                m1674b();
            } else {
                m1675c();
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m1678d(WifiSyncService wifiSyncService) {
        wifiSyncService.m1651a();
    }

    /* renamed from: a */
    private void m1651a() {
        m1656a(((ConnectivityManager) getSystemService("connectivity")).getNetworkInfo(1).getState());
    }

    /* renamed from: b */
    private boolean m1674b() {
        if (this.f2132p != null) {
            return true;
        }
        Log.d("WifiSyncService", "Started");
        try {
            this.f2131o = new ServerSocket(7614);
            this.f2132p = new Thread(new RunnableC0886iu(this));
            this.f2132p.start();
            this.f2135s = new C0887iv(this);
            registerReceiver(this.f2135s, new IntentFilter("com.cyo.comicracksp.WIFI_ABORT_SYNC"));
            registerReceiver(this.f2135s, new IntentFilter("com.cyo.comicracksp.WIFI_REQUEST_SYNC"));
            m1654a((Context) this, 7615);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            this.f2131o = null;
            this.f2132p = null;
            return false;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m1676c(WifiSyncService wifiSyncService) {
        wifiSyncService.m1675c();
    }

    /* renamed from: c */
    private void m1675c() {
        if (this.f2132p != null) {
            if (this.f2135s != null) {
                unregisterReceiver(this.f2135s);
            }
            Log.d("WifiSyncService", "Stopped");
            this.f2140x = 0;
            m1677d();
            m1654a((Context) this, -1);
            if (this.f2131o != null) {
                try {
                    this.f2131o.close();
                    this.f2132p.join();
                    this.f2131o = null;
                    this.f2132p = null;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: o */
    static /* synthetic */ void m1692o(WifiSyncService wifiSyncService) {
        wifiSyncService.m1677d();
    }

    /* renamed from: d */
    private void m1677d() {
        Intent intent = new Intent("com.cyo.comicracksp.WIFI_HEARTBEAT");
        intent.putExtra("Available", this.f2140x > 0);
        sendBroadcast(intent);
    }

    /* renamed from: a */
    static /* synthetic */ void m1659a(WifiSyncService wifiSyncService, Context context) {
        if (wifiSyncService.f2132p != null) {
            new Thread(new RunnableC0888iw(wifiSyncService, context)).start();
        }
    }

    /* renamed from: a */
    public static void m1653a(Context context) {
        if (!C0628f.f1889k) {
            context.startService(new Intent(context, (Class<?>) WifiSyncService.class));
        }
    }

    /* renamed from: a */
    static void m1663a(WifiSyncService service, Socket socket) {
        InputStream input = null;
        DataOutputStream output = null;
        service.f2139w = true;
        service.f2141y = null;
        try {
            input = new C0893ja(service, socket.getInputStream());
            int command = (byte) input.read();
            switch (command) {
                case START_SYNC:
                    service.f2113F = false;
                    service.f2142z = false;
                    service.f2115H = -1;
                    service.f2137u = 0;
                    service.f2138v = 0;
                    service.m1652a(0);
                    return;
                case FINISH_SYNC:
                    service.m1681f();
                    return;
                case UPDATE_SYNC_PHASE:
                    if (!service.f2113F) {
                        service.f2115H = -1;
                    }
                    service.f2113F = true;
                    service.m1652a(input.read());
                    return;
                case HEARTBEAT:
                    service.f2140x = 2;
                    service.m1677d();
                    return;
                case REGISTER_CLIENT:
                    int port = m1648a(input);
                    synchronized (service.f2110C) {
                        service.f2110C.add(new C0895jc(socket.getInetAddress(), port));
                    }
                    return;
            }

            output = new DataOutputStream(new C0894jb(service,
                    new BufferedOutputStream(socket.getOutputStream(), 65536)));
            switch (command) {
                case LIST_FILES:
                    m1664a(output, service.m1683g());
                    break;
                case SEND_FILE:
                    service.m1666a(m1671b(input), output);
                    break;
                case GET_FREE_SPACE:
                    output.writeLong(C0951ag.m1994a(service.f2108A));
                    break;
                case FILE_EXISTS:
                    output.writeBoolean(service.m1650a(m1671b(input)).exists());
                    break;
                case DELETE_FILE:
                    output.writeBoolean(service.m1650a(m1671b(input)).delete());
                    service.m1680e();
                    break;
                case RECEIVE_FILE:
                    service.f2141y = m1671b(input);
                    output.writeBoolean(service.m1668a(service.f2141y, input));
                    service.m1680e();
                    break;
                case GET_DEVICE_INFO:
                    m1648a(input);
                    output.writeBoolean(C0628f.f1890l);
                    output.writeInt(C0951ag.m2005e(service));
                    m1664a(output, C0951ag.m2007f(service));
                    output.writeBoolean(true);
                    break;
                case SEND_FILES:
                    String[] files = new String[m1648a(input)];
                    for (int i = 0; i < files.length; i++) {
                        files[i] = m1671b(input);
                    }
                    for (String file : files) {
                        try {
                            service.m1666a(file, output);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case IS_SYNC_CANCELLED:
                    output.writeBoolean(service.f2142z);
                    break;
                default:
                    output.writeBoolean(false);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.f2139w = false;
            try {
                if (output != null) {
                    output.flush();
                    output.close();
                }
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m1680e() {
        if ("mounted".equals(Environment.getExternalStorageState()) && !new File(String.valueOf(this.f2108A) + "/.nomediascan").exists()) {
            C1173x.m2506a(this, this.f2108A);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m1685h(WifiSyncService wifiSyncService) {
        wifiSyncService.m1681f();
    }

    /* renamed from: f */
    private void m1681f() {
        if (this.f2112E != null) {
            this.f2112E = null;
            this.f2114G.cancel();
            this.f2114G = null;
            if (this.f2116I != null) {
                this.f2116I.release();
                this.f2116I = null;
            }
            this.f2111D.cancel(1);
            this.f2111D = null;
            stopForeground(true);
        }
    }

    /* renamed from: n */
    static /* synthetic */ NotificationManager m1691n(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2111D;
    }

    /* renamed from: l */
    static /* synthetic */ C0024av m1689l(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2112E;
    }

    /* renamed from: m */
    static /* synthetic */ boolean m1690m(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2113F;
    }

    /* renamed from: k */
    static /* synthetic */ int m1688k(WifiSyncService wifiSyncService) {
        return wifiSyncService.f2115H;
    }

    /* renamed from: a */
    private void m1652a(int i) {
        this.f2115H = i;
        if (this.f2112E == null) {
            this.f2111D = (NotificationManager) getSystemService("notification");
            this.f2116I = ((PowerManager) getSystemService("power")).newWakeLock(6, "ComicRackWifi");
            if (!this.f2116I.isHeld()) {
                this.f2116I.acquire();
            }
            Intent intent = new Intent(this, (Class<?>) LibraryActivity.class);
            intent.setFlags(603979776);
            this.f2112E = new C0024av(this).m140a().m141a(C0802fr.icon_wifi).m143a(0, !this.f2113F).m144a(PendingIntent.getActivity(this, 0, intent, 0)).m145a(getString(C0806fv.comicrack_synchronization)).m142a(C0802fr.btn_cancel, getString(C0806fv.abort_sync), PendingIntent.getBroadcast(this, 0, new Intent("com.cyo.comicracksp.WIFI_ABORT_SYNC"), 134217728));
            this.f2114G = new Timer("Notification Update Timer", false);
            C0889ix c0889ix = new C0889ix(this);
            c0889ix.run();
            this.f2114G.schedule(c0889ix, 0L, 1000L);
        }
    }

    /* renamed from: a */
    private static void m1664a(DataOutputStream dataOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes();
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    /* renamed from: a */
    private static int m1648a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        m1665a(inputStream, bArr);
        return ByteBuffer.wrap(bArr).getInt();
    }

    /* renamed from: b */
    private static String m1671b(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[m1648a(inputStream)];
        m1665a(inputStream, bArr);
        return new String(bArr);
    }

    /* renamed from: g */
    private String m1683g() {
        File[] fileArrListFiles;
        String str = this.f2108A;
        if (str == null || (fileArrListFiles = new File(str).listFiles(new C0890iy(this))) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (File file : fileArrListFiles) {
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(file.getName());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private File m1650a(String str) {
        return new File(String.valueOf(this.f2108A) + "/" + new File(str).getName());
    }

    /* renamed from: a */
    private void m1666a(String name, DataOutputStream output) throws IOException {
        File file = m1650a(name);
        FileInputStream input = null;
        try {
            input = new FileInputStream(file);
            output.writeLong(file.length());
            C1095l.m2365a(input, output);
        } catch (FileNotFoundException e) {
            output.writeLong(0);
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    /* renamed from: a */
    private boolean m1668a(String name, InputStream input) throws IOException {
        File destination = m1650a(name);
        File temporaryFile = File.createTempFile("sync", "", new File(this.f2108A));
        try {
            byte[] length = new byte[8];
            m1665a(input, length);
            long remaining = ByteBuffer.wrap(length).getLong();
            FileOutputStream output = new FileOutputStream(temporaryFile);
            try {
                byte[] buffer = new byte[65536];
                while (remaining > 0) {
                    int read = input.read(buffer, 0, (int) Math.min(remaining, buffer.length));
                    if (read == -1) {
                        break;
                    }
                    output.write(buffer, 0, read);
                    remaining -= read;
                }
                destination.delete();
                temporaryFile.renameTo(destination);
                return remaining == 0;
            } finally {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (temporaryFile.exists()) {
                temporaryFile.delete();
            }
            return false;
        }
    }

    /* renamed from: a */
    private static void m1665a(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = inputStream.read(bArr, i + 0, length);
            if (i2 != -1) {
                i += i2;
                length -= i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m1669a(Context context, boolean z) {
        String str = "ComicRackAndroid:" + C0628f.m1363b(context).getProperty("ID");
        if (z) {
            str = String.valueOf(str) + ":Sync";
        }
        return str.getBytes();
    }

    /* renamed from: a */
    static /* synthetic */ void m1660a(WifiSyncService wifiSyncService, Context context, int i, boolean z) {
        wifiSyncService.m1655a(context, i, z);
    }

    /* renamed from: a */
    private synchronized void m1655a(Context context, int port, boolean syncing) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(4445);
            InetAddress address = InetAddress.getByName("224.34.123.90");
            byte[] message = m1669a(context, syncing);
            socket.send(new DatagramPacket(message, message.length, address, port));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

    /* renamed from: a */
    private synchronized boolean m1667a(Context context, InetAddress address, int port, boolean syncing) {
        Socket socket = null;
        try {
            socket = new Socket();
            socket.setSoTimeout(HttpResponseCode.INTERNAL_SERVER_ERROR);
            socket.connect(new InetSocketAddress(address, port), HttpResponseCode.INTERNAL_SERVER_ERROR);
            socket.getOutputStream().write(m1669a(context, syncing));
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1661a(WifiSyncService wifiSyncService, Context context, boolean z) {
        wifiSyncService.m1672b(context, z);
    }

    /* renamed from: b */
    private synchronized void m1672b(Context context, boolean z) {
        synchronized (this.f2110C) {
            if (this.f2110C.size() != 0) {
                for (C0895jc c0895jc : new ArrayList<>(this.f2110C)) {
                    if (!m1667a(context, c0895jc.f2701a, c0895jc.f2702b, z)) {
                        synchronized (this.f2110C) {
                            this.f2110C.remove(c0895jc);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1654a(Context context, int i) {
        if (this.f2133q != null) {
            this.f2133q.cancel();
            this.f2133q = null;
        }
        m1677d();
        if (i > 0) {
            this.f2133q = new Timer("Wireless Sync Broadcast", true);
            this.f2133q.schedule(new C0891iz(this, context, i), 0L, 10000L);
        }
    }
}
