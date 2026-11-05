package com.cyo.common.p026c;

import com.cyo.common.p026c.p028b.C1020a;
import com.cyo.common.p026c.p028b.EnumC1021b;
import com.cyo.common.p026c.p029c.C1025c;
import com.cyo.common.p026c.p029c.InterfaceC1023a;
import com.cyo.common.p026c.p030d.C1027a;
import com.cyo.common.p026c.p030d.C1028b;
import com.cyo.common.p026c.p030d.C1029c;
import com.cyo.common.p026c.p030d.C1030d;
import com.cyo.common.p026c.p030d.C1031e;
import com.cyo.common.p026c.p030d.C1032f;
import com.cyo.common.p026c.p030d.C1033g;
import com.cyo.common.p026c.p030d.C1036j;
import com.cyo.common.p026c.p030d.C1037k;
import com.cyo.common.p026c.p030d.C1038l;
import com.cyo.common.p026c.p030d.C1040n;
import com.cyo.common.p026c.p030d.C1041o;
import com.cyo.common.p026c.p030d.C1042p;
import com.cyo.common.p026c.p030d.C1044r;
import com.cyo.common.p026c.p030d.EnumC1043q;
import com.cyo.common.p026c.p030d.EnumC1045s;
import com.cyo.common.p026c.p031e.C1046a;
import com.cyo.common.p026c.p031e.C1055b;
import java.io.Closeable;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.c.a */
/* loaded from: classes.dex */
public class C1017a implements Closeable {

    /* renamed from: a */
    private static Logger f2990a = Logger.getLogger(C1017a.class.getName());

    /* renamed from: q */
    private static /* synthetic */ int[] f2991q;

    /* renamed from: r */
    private static /* synthetic */ int[] f2992r;

    /* renamed from: b */
    private File f2993b;

    /* renamed from: c */
    private InterfaceC1023a f2994c;

    /* renamed from: d */
    private final InterfaceC1019b f2995d;

    /* renamed from: e */
    private final C1046a f2996e;

    /* renamed from: f */
    private final List f2997f;

    /* renamed from: g */
    private C1038l f2998g;

    /* renamed from: h */
    private C1037k f2999h;

    /* renamed from: i */
    private C1032f f3000i;

    /* renamed from: j */
    private C1055b f3001j;

    /* renamed from: k */
    private long f3002k;

    /* renamed from: l */
    private int f3003l;

    /* renamed from: m */
    private boolean f3004m;

    /* renamed from: n */
    private int f3005n;

    /* renamed from: o */
    private long f3006o;

    /* renamed from: p */
    private long f3007p;

    /* renamed from: h */
    private static /* synthetic */ int[] m2122h() {
        int[] iArr = f2991q;
        if (iArr == null) {
            iArr = new int[EnumC1043q.valuesCustom().length];
            try {
                iArr[EnumC1043q.BEEA_HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1043q.EA_HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1043q.MAC_HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1043q.NTACL_HEAD.ordinal()] = 5;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1043q.STREAM_HEAD.ordinal()] = 6;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1043q.UO_HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            f2991q = iArr;
        }
        return iArr;
    }

    /* renamed from: i */
    private static /* synthetic */ int[] m2123i() {
        int[] iArr = f2992r;
        if (iArr == null) {
            iArr = new int[EnumC1045s.valuesCustom().length];
            try {
                iArr[EnumC1045s.AvHeader.ordinal()] = 5;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1045s.CommHeader.ordinal()] = 4;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1045s.EndArcHeader.ordinal()] = 10;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1045s.FileHeader.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1045s.MainHeader.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1045s.MarkHeader.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC1045s.NewSubHeader.ordinal()] = 9;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EnumC1045s.ProtectHeader.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[EnumC1045s.SignHeader.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[EnumC1045s.SubHeader.ordinal()] = 6;
            } catch (NoSuchFieldError e10) {
            }
            f2992r = iArr;
        }
        return iArr;
    }

    public C1017a(File file) throws C1020a, java.io.IOException {
        this(file, (byte) 0);
    }

    private C1017a(File file, byte b) throws C1020a, java.io.IOException {
        this.f2997f = new ArrayList();
        this.f2998g = null;
        this.f2999h = null;
        this.f3000i = null;
        this.f3002k = -1L;
        this.f3004m = false;
        this.f3005n = 0;
        this.f3006o = 0L;
        this.f3007p = 0L;
        m2127a(file);
        this.f2995d = null;
        this.f2996e = new C1046a(this);
    }

    /* renamed from: a */
    public final File m2124a() {
        return this.f2993b;
    }

    /* renamed from: a */
    final void m2127a(File file) throws C1020a, java.io.IOException {
        C1032f c1032f;
        this.f2993b = file;
        C1025c c1025c = new C1025c(file);
        long length = file.length();
        this.f3006o = 0L;
        this.f3007p = 0L;
        close();
        this.f2994c = c1025c;
        try {
            this.f2998g = null;
            this.f2999h = null;
            this.f3000i = null;
            this.f2997f.clear();
            this.f3003l = 0;
            while (true) {
                byte[] bArr = new byte[7];
                long jMo2140a = this.f2994c.mo2140a();
                if (jMo2140a < length && this.f2994c.mo2139a(bArr, 7) != 0) {
                    C1028b c1028b = new C1028b(bArr);
                    c1028b.m2146a(jMo2140a);
                    switch (m2123i()[c1028b.m2152f().ordinal()]) {
                        case TwitterResponse.READ /* 1 */:
                            int i = c1028b.m2149c() ? 7 : 6;
                            byte[] bArr2 = new byte[i];
                            this.f2994c.mo2139a(bArr2, i);
                            C1037k c1037k = new C1037k(c1028b, bArr2);
                            this.f2997f.add(c1037k);
                            this.f2999h = c1037k;
                            if (this.f2999h.m2161g()) {
                                throw new C1020a(EnumC1021b.rarEncryptedException);
                            }
                            continue;
                        case TwitterResponse.READ_WRITE /* 2 */:
                            this.f2998g = new C1038l(c1028b);
                            if (!this.f2998g.m2164g()) {
                                throw new C1020a(EnumC1021b.badRarArchive);
                            }
                            this.f2997f.add(this.f2998g);
                            continue;
                        case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                        case 6:
                        case 7:
                        case 9:
                        default:
                            byte[] bArr3 = new byte[4];
                            this.f2994c.mo2139a(bArr3, 4);
                            C1029c c1029c = new C1029c(c1028b, bArr3);
                            switch (m2123i()[c1029c.m2152f().ordinal()]) {
                                case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                                case 9:
                                    int iE = (c1029c.m2151e() - 7) - 4;
                                    byte[] bArr4 = new byte[iE];
                                    this.f2994c.mo2139a(bArr4, iE);
                                    C1033g c1033g = new C1033g(c1029c, bArr4);
                                    this.f2997f.add(c1033g);
                                    this.f2994c.mo2141a(c1033g.m2150d() + c1033g.m2151e() + c1033g.f3050l);
                                    break;
                                case 4:
                                case 5:
                                case 8:
                                default:
                                    f2990a.warning("Unknown Header");
                                    throw new C1020a(EnumC1021b.notRarArchive);
                                case 6:
                                    byte[] bArr5 = new byte[3];
                                    this.f2994c.mo2139a(bArr5, 3);
                                    C1042p c1042p = new C1042p(c1029c, bArr5);
                                    switch (m2122h()[EnumC1043q.m2166a(c1042p.f3095h).ordinal()]) {
                                        case TwitterResponse.READ /* 1 */:
                                            byte[] bArr6 = new byte[10];
                                            this.f2994c.mo2139a(bArr6, 10);
                                            this.f2997f.add(new C1031e(c1042p, bArr6));
                                            break;
                                        case TwitterResponse.READ_WRITE /* 2 */:
                                            int iE2 = ((c1042p.m2151e() - 7) - 4) - 3;
                                            byte[] bArr7 = new byte[iE2];
                                            this.f2994c.mo2139a(bArr7, iE2);
                                            this.f2997f.add(new C1044r(c1042p, bArr7));
                                            break;
                                        case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                                            byte[] bArr8 = new byte[8];
                                            this.f2994c.mo2139a(bArr8, 8);
                                            this.f2997f.add(new C1036j(c1042p, bArr8));
                                            break;
                                    }
                                case 7:
                                    int iE3 = (c1029c.m2151e() - 7) - 4;
                                    byte[] bArr9 = new byte[iE3];
                                    this.f2994c.mo2139a(bArr9, iE3);
                                    this.f2994c.mo2141a(new C1040n(c1029c, bArr9).m2150d() + c1029c.m2151e() + c1029c.f3034f);
                                    continue;
                            }
                            break;
                        case 4:
                            byte[] bArr10 = new byte[6];
                            this.f2994c.mo2139a(bArr10, 6);
                            C1030d c1030d = new C1030d(c1028b, bArr10);
                            this.f2997f.add(c1030d);
                            this.f2994c.mo2141a(c1030d.m2151e() + c1030d.m2150d());
                            continue;
                        case 5:
                            byte[] bArr11 = new byte[7];
                            this.f2994c.mo2139a(bArr11, 7);
                            this.f2997f.add(new C1027a(c1028b, bArr11));
                            continue;
                        case 8:
                            byte[] bArr12 = new byte[8];
                            this.f2994c.mo2139a(bArr12, 8);
                            this.f2997f.add(new C1041o(c1028b, bArr12));
                            continue;
                        case 10:
                            int i2 = c1028b.m2147a() ? 4 : 0;
                            if (c1028b.m2148b()) {
                                i2 += 2;
                            }
                            if (i2 > 0) {
                                byte[] bArr13 = new byte[i2];
                                this.f2994c.mo2139a(bArr13, i2);
                                c1032f = new C1032f(c1028b, bArr13);
                            } else {
                                c1032f = new C1032f(c1028b, null);
                            }
                            this.f2997f.add(c1032f);
                            this.f3000i = c1032f;
                            break;
                    }
                }
            }
        } catch (Exception e) {
            f2990a.log(Level.WARNING, "exception in archive constructor maybe file is encrypted or currupt", (Throwable) e);
        }
        for (Object entry : this.f2997f) {
            C1028b c1028b2 = (C1028b) entry;
            if (c1028b2.m2152f() == EnumC1045s.FileHeader) {
                this.f3006o += ((C1033g) c1028b2).f3050l;
            }
        }
        if (this.f2995d != null) {
            InterfaceC1019b interfaceC1019b = this.f2995d;
            long j = this.f3007p;
            long j2 = this.f3006o;
        }
    }

    /* renamed from: a */
    public final void m2125a(int i) {
        if (i > 0) {
            this.f3007p += i;
            if (this.f2995d != null) {
                InterfaceC1019b interfaceC1019b = this.f2995d;
                long j = this.f3007p;
                long j2 = this.f3006o;
            }
        }
    }

    /* renamed from: b */
    public final InterfaceC1023a m2128b() {
        return this.f2994c;
    }

    /* renamed from: c */
    public final List m2129c() {
        ArrayList arrayList = new ArrayList();
        for (Object entry : this.f2997f) {
            C1028b c1028b = (C1028b) entry;
            if (c1028b.m2152f().equals(EnumC1045s.FileHeader)) {
                arrayList.add((C1033g) c1028b);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C1033g m2130d() {
        int size = this.f2997f.size();
        while (this.f3003l < size) {
            List list = this.f2997f;
            int i = this.f3003l;
            this.f3003l = i + 1;
            C1028b c1028b = (C1028b) list.get(i);
            if (c1028b.m2152f() == EnumC1045s.FileHeader) {
                return (C1033g) c1028b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final InterfaceC1019b m2131e() {
        return this.f2995d;
    }

    /* renamed from: a */
    public final void m2126a(C1033g c1033g, OutputStream outputStream) throws C1020a {
        if (!this.f2997f.contains(c1033g)) {
            throw new C1020a(EnumC1021b.headerNotInArchive);
        }
        try {
            C1046a c1046a = this.f2996e;
            c1046a.f3124d = outputStream;
            c1046a.f3121a = 0L;
            c1046a.f3122b = false;
            c1046a.f3123c = false;
            c1046a.f3126f = false;
            c1046a.f3127g = false;
            c1046a.f3128h = false;
            c1046a.f3139s = 0;
            c1046a.f3140t = 0;
            c1046a.f3129i = 0L;
            c1046a.f3133m = 0L;
            c1046a.f3132l = 0L;
            c1046a.f3131k = 0L;
            c1046a.f3130j = 0L;
            c1046a.f3138r = -1L;
            c1046a.f3137q = -1L;
            c1046a.f3136p = -1L;
            c1046a.f3141u = -1;
            c1046a.f3125e = null;
            c1046a.f3142v = (char) 0;
            c1046a.f3135o = 0L;
            c1046a.f3134n = 0L;
            this.f2996e.m2173a(c1033g);
            this.f2996e.f3137q = this.f2998g.f3078f ? 0 : -1;
            if (this.f3001j == null) {
                this.f3001j = new C1055b(this.f2996e);
            }
            if (!c1033g.m2155h()) {
                this.f3001j.m2192a(new byte[Math.min(((int) c1033g.f3051m) + 1024, 4194304)]);
            }
            this.f3001j.m2190a(c1033g.f3051m);
            try {
                try {
                    this.f3001j.m2189a(c1033g.f3047i, c1033g.m2155h());
                    if ((this.f2996e.f3125e.m2154g() ? this.f2996e.f3138r ^ (-1) : this.f2996e.f3137q ^ (-1)) != c1033g.f3046h) {
                        throw new C1020a(EnumC1021b.crcError);
                    }
                } catch (Exception e) {
                    this.f3001j.m2194c();
                    if (!(e instanceof C1020a)) {
                        throw new C1020a(e);
                    }
                    throw ((C1020a) e);
                }
            } finally {
                this.f3001j.m2187a();
            }
        } catch (Exception e2) {
            if (e2 instanceof C1020a) {
                throw ((C1020a) e2);
            }
            throw new C1020a(e2);
        }
    }

    /* renamed from: f */
    public final C1037k m2132f() {
        return this.f2999h;
    }

    /* renamed from: g */
    public final boolean m2133g() {
        return this.f2998g.f3078f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.f2994c != null) {
            this.f2994c.close();
            this.f2994c = null;
        }
        if (this.f3001j != null) {
            this.f3001j.m2194c();
        }
    }
}
