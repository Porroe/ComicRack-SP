package com.p004a.p005a.p007b;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.p004a.p005a.C0257aj;
import com.p004a.p005a.C0259al;
import com.p004a.p005a.C0273az;
import com.p004a.p005a.C0329br;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.C0357e;
import com.p004a.p005a.C0392h;
import com.p004a.p005a.C0393i;
import com.p004a.p005a.EnumC0390f;
import com.p004a.p005a.p010d.C0355a;
import com.p004a.p005a.p011e.C0358a;
import com.p004a.p005a.p011e.C0372i;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.n */
/* loaded from: classes.dex */
public final class RunnableC0299n implements Runnable {

    /* renamed from: a */
    WebView f788a;

    /* renamed from: b */
    C0329br f789b;

    /* renamed from: c */
    String f790c;

    /* renamed from: d */
    String f791d;

    /* renamed from: e */
    C0392h f792e;

    /* renamed from: f */
    boolean f793f;

    /* renamed from: g */
    boolean f794g;

    /* renamed from: h */
    private String f795h;

    /* renamed from: i */
    private String f796i;

    /* renamed from: j */
    private String f797j;

    /* renamed from: k */
    private String f798k;

    /* renamed from: l */
    private boolean f799l;

    /* renamed from: m */
    private RunnableC0310y f800m;

    /* renamed from: n */
    private C0357e f801n;

    /* renamed from: o */
    private String f802o;

    /* renamed from: p */
    private LinkedList f803p;

    /* renamed from: q */
    private volatile boolean f804q;

    /* renamed from: r */
    private boolean f805r;

    /* renamed from: s */
    private EnumC0390f f806s;

    /* renamed from: t */
    private boolean f807t;

    /* renamed from: u */
    private int f808u;

    /* renamed from: v */
    private Thread f809v;

    /* renamed from: w */
    private boolean f810w;

    /* renamed from: x */
    private EnumC0306u f811x;

    /* renamed from: a */
    public final synchronized void m741a(boolean z) {
        this.f793f = z;
    }

    protected RunnableC0299n() {
        this.f793f = false;
        this.f811x = EnumC0306u.ONLINE_SERVER_REQUEST;
    }

    public RunnableC0299n(C0329br c0329br) {
        this.f793f = false;
        this.f811x = EnumC0306u.ONLINE_SERVER_REQUEST;
        this.f789b = c0329br;
        this.f802o = null;
        this.f795h = null;
        this.f796i = null;
        this.f797j = null;
        this.f803p = new LinkedList();
        this.f806s = null;
        this.f807t = false;
        this.f808u = -1;
        this.f799l = false;
        this.f805r = false;
        this.f791d = null;
        this.f792e = null;
        if (((Activity) ((C0332bu) c0329br.f940a.m898a()).f964c.m901a()) != null) {
            this.f788a = new C0290e((C0332bu) c0329br.f940a.m898a(), null);
            this.f788a.setWebViewClient(C0279ad.m692a((C0308w) ((C0332bu) c0329br.f940a.m898a()).f963b.m898a(), C0293h.f783b, false, false));
            this.f788a.setVisibility(8);
            this.f788a.setWillNotDraw(true);
            this.f800m = new RunnableC0310y(c0329br);
            return;
        }
        this.f788a = null;
        this.f800m = null;
        C0372i.m920e("activity was null while trying to create an AdLoader.");
    }

    /* renamed from: a */
    protected final synchronized void m739a(String str) {
        this.f803p.add(str);
    }

    /* renamed from: a */
    protected final void m733a() {
        C0372i.m911a("AdLoader cancelled.");
        if (this.f788a != null) {
            this.f788a.stopLoading();
            this.f788a.destroy();
        }
        if (this.f809v != null) {
            this.f809v.interrupt();
            this.f809v = null;
        }
        if (this.f800m != null) {
            this.f800m.f870a = true;
        }
        this.f804q = true;
    }

    /* renamed from: a */
    protected final void m736a(C0357e c0357e) {
        this.f801n = c0357e;
        this.f804q = false;
        this.f809v = new Thread(this);
        this.f809v.start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:192:0x0541
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.process(SynchronizedRegionMaker.java:87)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:118)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c3 A[Catch: all -> 0x003a, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:14:0x0038, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:54:0x011e, B:73:0x0172, B:75:0x0176, B:76:0x017c, B:78:0x017f, B:80:0x0183, B:81:0x01a1, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:88:0x01cf, B:70:0x015d, B:71:0x016f, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:120:0x02c3, B:122:0x02c6, B:124:0x02ca, B:125:0x02d0, B:127:0x02d3, B:129:0x02d7, B:130:0x02f5, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:142:0x0342, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:173:0x045b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:180:0x047f, B:182:0x0482, B:184:0x04a0, B:185:0x04ba, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:62:0x0139, B:210:0x05c5, B:204:0x0575, B:205:0x0587, B:109:0x026d, B:110:0x027f, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:116:0x02bc, B:65:0x013d, B:66:0x0155, B:8:0x000c, B:9:0x0017, B:61:0x012e), top: B:225:0x0004, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c6 A[Catch: all -> 0x003a, Throwable -> 0x012d, TRY_ENTER, TryCatch #1 {Throwable -> 0x012d, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:73:0x0172, B:75:0x0176, B:78:0x017f, B:80:0x0183, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:70:0x015d, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:122:0x02c6, B:124:0x02ca, B:127:0x02d3, B:129:0x02d7, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:182:0x0482, B:184:0x04a0, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:210:0x05c5, B:204:0x0575, B:109:0x026d, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:65:0x013d, B:8:0x000c), top: B:216:0x0004, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f8 A[Catch: all -> 0x003a, Throwable -> 0x012d, TRY_ENTER, TryCatch #1 {Throwable -> 0x012d, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:73:0x0172, B:75:0x0176, B:78:0x017f, B:80:0x0183, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:70:0x015d, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:122:0x02c6, B:124:0x02ca, B:127:0x02d3, B:129:0x02d7, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:182:0x0482, B:184:0x04a0, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:210:0x05c5, B:204:0x0575, B:109:0x026d, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:65:0x013d, B:8:0x000c), top: B:216:0x0004, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0315 A[Catch: all -> 0x003a, Throwable -> 0x012d, TryCatch #1 {Throwable -> 0x012d, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:73:0x0172, B:75:0x0176, B:78:0x017f, B:80:0x0183, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:70:0x015d, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:122:0x02c6, B:124:0x02ca, B:127:0x02d3, B:129:0x02d7, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:182:0x0482, B:184:0x04a0, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:210:0x05c5, B:204:0x0575, B:109:0x026d, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:65:0x013d, B:8:0x000c), top: B:216:0x0004, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x058e A[Catch: all -> 0x003a, Throwable -> 0x012d, TryCatch #1 {Throwable -> 0x012d, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:73:0x0172, B:75:0x0176, B:78:0x017f, B:80:0x0183, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:70:0x015d, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:122:0x02c6, B:124:0x02ca, B:127:0x02d3, B:129:0x02d7, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:182:0x0482, B:184:0x04a0, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:210:0x05c5, B:204:0x0575, B:109:0x026d, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:65:0x013d, B:8:0x000c), top: B:216:0x0004, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05c5 A[Catch: all -> 0x003a, Throwable -> 0x012d, TRY_LEAVE, TryCatch #1 {Throwable -> 0x012d, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:73:0x0172, B:75:0x0176, B:78:0x017f, B:80:0x0183, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:70:0x015d, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:122:0x02c6, B:124:0x02ca, B:127:0x02d3, B:129:0x02d7, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:182:0x0482, B:184:0x04a0, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:210:0x05c5, B:204:0x0575, B:109:0x026d, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:65:0x013d, B:8:0x000c), top: B:216:0x0004, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f9 A[Catch: all -> 0x003a, Throwable -> 0x012d, TryCatch #1 {Throwable -> 0x012d, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:56:0x0121, B:58:0x0129, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00f6, B:51:0x0117, B:52:0x011a, B:73:0x0172, B:75:0x0176, B:78:0x017f, B:80:0x0183, B:83:0x01a4, B:85:0x01bc, B:87:0x01c4, B:70:0x015d, B:90:0x01d2, B:91:0x01f2, B:92:0x01f5, B:94:0x01f9, B:96:0x021c, B:97:0x024a, B:98:0x0251, B:100:0x0255, B:102:0x0259, B:104:0x025d, B:106:0x0268, B:118:0x02bf, B:122:0x02c6, B:124:0x02ca, B:127:0x02d3, B:129:0x02d7, B:134:0x0311, B:136:0x0315, B:138:0x0319, B:139:0x032f, B:141:0x0337, B:144:0x0345, B:146:0x034f, B:151:0x037d, B:153:0x039d, B:155:0x03a5, B:157:0x03ad, B:160:0x03be, B:163:0x0404, B:164:0x040a, B:161:0x03ed, B:149:0x0371, B:166:0x0423, B:168:0x0427, B:170:0x0431, B:172:0x043b, B:175:0x045e, B:177:0x0470, B:179:0x0474, B:182:0x0482, B:184:0x04a0, B:187:0x04bd, B:189:0x04c1, B:190:0x04c9, B:191:0x053f, B:193:0x0543, B:195:0x0547, B:197:0x055f, B:199:0x0565, B:201:0x0570, B:207:0x058a, B:209:0x058e, B:210:0x05c5, B:204:0x0575, B:109:0x026d, B:132:0x02f8, B:112:0x0282, B:113:0x0292, B:114:0x029c, B:115:0x02a9, B:65:0x013d, B:8:0x000c), top: B:216:0x0004, outer: #6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004a.p005a.p007b.RunnableC0299n.run():void");
    }

    /* renamed from: a */
    private String m730a(Map map, Activity activity) throws C0304s, java.security.NoSuchAlgorithmException {
        StringBuilder sbAppend;
        String strM732d;
        Context applicationContext = activity.getApplicationContext();
        C0277ab c0277abM788m = ((C0308w) ((C0332bu) this.f789b.f940a.m898a()).f963b.m898a()).m788m();
        long jM672m = c0277abM788m.m672m();
        if (jM672m > 0) {
            map.put("prl", Long.valueOf(jM672m));
        }
        long jM673n = c0277abM788m.m673n();
        if (jM673n > 0) {
            map.put("prnl", Long.valueOf(jM673n));
        }
        String strM671l = c0277abM788m.m671l();
        if (strM671l != null) {
            map.put("ppcl", strM671l);
        }
        String strM670k = c0277abM788m.m670k();
        if (strM670k != null) {
            map.put("pcl", strM670k);
        }
        long jM669j = c0277abM788m.m669j();
        if (jM669j > 0) {
            map.put("pcc", Long.valueOf(jM669j));
        }
        map.put("preqs", Long.valueOf(C0277ab.m653o()));
        map.put("oar", Long.valueOf(c0277abM788m.m674p()));
        map.put("bas_on", Long.valueOf(c0277abM788m.m677s()));
        map.put("bas_off", Long.valueOf(c0277abM788m.m680v()));
        if (c0277abM788m.m683y()) {
            map.put("aoi_timeout", "true");
        }
        if (c0277abM788m.m654A()) {
            map.put("aoi_nofill", "true");
        }
        String strM657D = c0277abM788m.m657D();
        if (strM657D != null) {
            map.put("pit", strM657D);
        }
        map.put("ptime", Long.valueOf(C0277ab.m652E()));
        c0277abM788m.m658a();
        c0277abM788m.m668i();
        if (((C0332bu) this.f789b.f940a.m898a()).m839b()) {
            map.put("format", "interstitial_mb");
        } else {
            C0392h c0392hM690c = ((C0278ac) ((C0332bu) this.f789b.f940a.m898a()).f968g.m898a()).m690c();
            if (c0392hM690c.m931c()) {
                map.put("smart_w", "full");
            }
            if (c0392hM690c.m932d()) {
                map.put("smart_h", "auto");
            }
            if (!c0392hM690c.m933e()) {
                map.put("format", c0392hM690c.toString());
            } else {
                HashMap map2 = new HashMap();
                map2.put("w", Integer.valueOf(c0392hM690c.m929a()));
                map2.put("h", Integer.valueOf(c0392hM690c.m930b()));
                map.put("ad_frame", map2);
            }
        }
        map.put("slotname", ((C0332bu) this.f789b.f940a.m898a()).f969h.m898a());
        map.put("js", "afma-sdk-a-v6.4.1");
        try {
            int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            String strM892f = C0358a.m892f(applicationContext);
            if (!TextUtils.isEmpty(strM892f)) {
                map.put("mv", strM892f);
            }
            String str = (String) C0330bs.m837a().f944a.m899a();
            if (!TextUtils.isEmpty(str)) {
                map.put("imbf", str);
            }
            map.put("msid", applicationContext.getPackageName());
            map.put("app_name", i + ".android." + applicationContext.getPackageName());
            map.put("isu", C0358a.m868a(applicationContext));
            String strM889d = C0358a.m889d(applicationContext);
            if (strM889d == null) {
                strM889d = "null";
            }
            map.put("net", strM889d);
            String strM891e = C0358a.m891e(applicationContext);
            if (strM891e != null && strM891e.length() != 0) {
                map.put("cap", strM891e);
            }
            map.put("u_audio", Integer.valueOf(C0358a.m893g(applicationContext).ordinal()));
            DisplayMetrics displayMetricsM867a = C0358a.m867a(activity);
            map.put("u_sd", Float.valueOf(displayMetricsM867a.density));
            map.put("u_h", Integer.valueOf(C0358a.m866a(applicationContext, displayMetricsM867a)));
            map.put("u_w", Integer.valueOf(C0358a.m882b(applicationContext, displayMetricsM867a)));
            map.put("hl", Locale.getDefault().getLanguage());
            C0332bu c0332bu = (C0332bu) this.f789b.f940a.m898a();
            C0257aj c0257ajM603a = (C0257aj) c0332bu.f979r.m899a();
            if (c0257ajM603a == null) {
                c0257ajM603a = C0257aj.m603a("afma-sdk-a-v6.4.1", activity);
                c0332bu.f979r.m900a(c0257ajM603a);
                c0332bu.f980s.m900a(new C0259al(c0257ajM603a));
            }
            map.put("ms", c0257ajM603a.m596a(applicationContext, (String) null, false));
            if (((C0332bu) this.f789b.f940a.m898a()).f971j != null && ((C0332bu) this.f789b.f940a.m898a()).f971j.m898a() != null) {
                C0393i c0393i = (C0393i) ((C0332bu) this.f789b.f940a.m898a()).f971j.m898a();
                if (c0393i.getParent() != null) {
                    int[] iArr = new int[2];
                    c0393i.getLocationOnScreen(iArr);
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    DisplayMetrics displayMetrics = ((Context) ((C0332bu) this.f789b.f940a.m898a()).f967f.m898a()).getResources().getDisplayMetrics();
                    int i4 = (!c0393i.isShown() || c0393i.getWidth() + i2 <= 0 || c0393i.getHeight() + i3 <= 0 || i2 > displayMetrics.widthPixels || i3 > displayMetrics.heightPixels) ? 0 : 1;
                    HashMap map3 = new HashMap();
                    map3.put("x", Integer.valueOf(i2));
                    map3.put("y", Integer.valueOf(i3));
                    map3.put("width", Integer.valueOf(c0393i.getWidth()));
                    map3.put("height", Integer.valueOf(c0393i.getHeight()));
                    map3.put("visible", Integer.valueOf(i4));
                    map.put("ad_pos", map3);
                }
            }
            StringBuilder sb = new StringBuilder();
            C0392h[] c0392hArr = (C0392h[]) ((C0332bu) this.f789b.f940a.m898a()).f975n.m899a();
            if (c0392hArr != null) {
                for (C0392h c0392h : c0392hArr) {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append(c0392h.m929a() + "x" + c0392h.m930b());
                }
                map.put("sz", sb.toString());
            }
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                map.put("carrier", networkOperator);
            }
            map.put("pt", Integer.valueOf(telephonyManager.getPhoneType()));
            map.put("gnt", Integer.valueOf(telephonyManager.getNetworkType()));
            if (C0358a.m887c()) {
                map.put("simulator", 1);
            }
            map.put("session_id", C0273az.m627a().m629b().toString());
            map.put("seq_num", C0273az.m627a().m630c().toString());
            if (((C0278ac) ((C0332bu) this.f789b.f940a.m898a()).f968g.m898a()).m689b()) {
                map.put("swipeable", 1);
            }
            if (((Boolean) ((C0332bu) this.f789b.f940a.m898a()).f981t.m899a()).booleanValue()) {
                map.put("d_imp_hdr", 1);
            }
            String strM871a = C0358a.m871a(map);
            if (((Boolean) ((C0331bt) ((C0330bs) ((C0332bu) this.f789b.f940a.m898a()).f965d.m898a()).f945b.m898a()).f961o.m899a()).booleanValue()) {
                sbAppend = new StringBuilder();
                strM732d = m732d();
            } else {
                sbAppend = new StringBuilder().append(m732d());
                C0357e c0357e = this.f801n;
                strM732d = "AFMA_getSdkConstants();";
            }
            StringBuilder sbAppend2 = sbAppend.append(strM732d);
            C0357e c0357e2 = this.f801n;
            StringBuilder sbAppend3 = sbAppend2.append("AFMA_buildAdURL(").append(strM871a).append(");");
            C0357e c0357e3 = this.f801n;
            String string = sbAppend3.append("</script></head><body></body></html>").toString();
            C0372i.m916c("adRequestUrlHtml: " + string);
            return string;
        } catch (PackageManager.NameNotFoundException e) {
            throw new C0304s(this, "NameNotFoundException");
        }
    }

    /* renamed from: d */
    private String m732d() {
        return this.f801n instanceof C0355a ? "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>" : "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
    }

    /* renamed from: a */
    private void m731a(EnumC0390f enumC0390f, boolean z) {
        ((Handler) C0330bs.m837a().f946c.m898a()).post(new RunnableC0303r((C0308w) ((C0332bu) this.f789b.f940a.m898a()).f963b.m898a(), this.f788a, this.f800m, enumC0390f, z));
    }

    /* renamed from: b */
    protected final synchronized void m744b(boolean z) {
        this.f799l = z;
    }

    /* renamed from: b */
    protected final synchronized void m743b(String str) {
        this.f798k = str;
    }

    /* renamed from: a */
    protected final synchronized void m740a(String str, String str2) {
        this.f795h = str2;
        this.f796i = str;
        notify();
    }

    /* renamed from: c */
    protected final synchronized void m746c(String str) {
        this.f797j = str;
    }

    /* renamed from: d */
    public final synchronized void m748d(String str) {
        this.f802o = str;
        notify();
    }

    /* renamed from: e */
    public final synchronized void m750e(String str) {
        this.f790c = str;
    }

    /* renamed from: f */
    public final synchronized void m751f(String str) {
        this.f791d = str;
    }

    /* renamed from: a */
    public final synchronized void m738a(C0392h c0392h) {
        this.f792e = c0392h;
    }

    /* renamed from: a */
    public final synchronized void m737a(EnumC0390f enumC0390f) {
        this.f806s = enumC0390f;
        notify();
    }

    /* renamed from: b */
    protected final synchronized void m742b() {
        this.f807t = true;
        notify();
    }

    /* renamed from: c */
    public final synchronized void m745c() {
        this.f805r = true;
    }

    /* renamed from: a */
    public final synchronized void m734a(int i) {
        this.f808u = i;
    }

    /* renamed from: c */
    public final synchronized void m747c(boolean z) {
        this.f810w = z;
    }

    /* renamed from: a */
    public final synchronized void m735a(EnumC0306u enumC0306u) {
        this.f811x = enumC0306u;
    }

    /* renamed from: d */
    public final synchronized void m749d(boolean z) {
        this.f794g = z;
    }
}
