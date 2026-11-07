package com.cyo.comicrack.viewer;

import com.cyo.comicrack.storage.ComicDocuments;
import android.os.Build;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.p020a.C0478a;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p020a.C0537ce;
import com.cyo.comicrack.p019a.p020a.EnumC0539cg;
import com.cyo.comicrack.p019a.p020a.EnumC0540ch;
import com.cyo.comicrack.p019a.p021b.AbstractC0587aa;
import com.cyo.comicrack.p019a.p021b.C0586a;
import com.cyo.comicrack.p019a.p021b.C0616r;
import com.cyo.comicrack.p019a.p021b.C0620v;
import com.cyo.comicrack.p019a.p021b.C0622x;
import com.cyo.comicrack.p019a.p021b.EnumC0607i;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;
import com.cyo.common.C0912a;
import com.cyo.common.C0950af;
import com.cyo.common.C0951ag;
import com.cyo.common.C0971b;
import com.cyo.common.C0998bi;
import com.cyo.common.C0999bj;
import com.cyo.common.C1006bq;
import com.cyo.common.C1009bt;
import com.cyo.common.EnumC0993bd;
import com.cyo.common.InterfaceC0991bb;
import com.cyo.common.p022a.C0933d;
import com.cyo.common.p022a.C0939j;
import com.cyo.common.view.ContentAnimation;
import com.cyo.common.view.C1106a;
import com.cyo.common.view.C1145bl;
import com.cyo.common.view.C1151f;
import com.cyo.common.view.C1165t;
import com.cyo.common.view.EnumC1164s;
import com.cyo.common.view.FastThumbView;
import com.cyo.common.view.InterfaceC1110ad;
import com.cyo.common.view.InterfaceC1111ae;
import com.cyo.common.view.InterfaceC1163r;
import com.cyo.common.view.ProgressView;
import com.p004a.p005a.C0357e;
import com.p004a.p005a.p006a.C0246c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ReaderActivity extends ActivityC0881ip implements InterfaceC1110ad, InterfaceC1111ae, InterfaceC1163r {

    /* renamed from: aN */
    private static /* synthetic */ int[] f2016aN;

    /* renamed from: aO */
    private static /* synthetic */ int[] f2017aO;

    /* renamed from: aP */
    private static /* synthetic */ int[] f2018aP;

    /* renamed from: aQ */
    private static /* synthetic */ int[] f2019aQ;

    /* renamed from: aR */
    private static /* synthetic */ int[] f2020aR;

    /* renamed from: aS */
    private static /* synthetic */ int[] f2021aS;

    /* renamed from: aT */
    private static /* synthetic */ int[] f2022aT;

    /* renamed from: aU */
    private static /* synthetic */ int[] f2023aU;

    /* renamed from: av */
    private static final HashMap f2024av = new C0810fz();

    /* renamed from: A */
    private View f2025A;

    /* renamed from: B */
    private View f2026B;

    /* renamed from: C */
    private Gallery f2027C;

    /* renamed from: D */
    private View f2028D;

    /* renamed from: E */
    private FastThumbView f2029E;

    /* renamed from: F */
    private ProgressView f2030F;

    /* renamed from: H */
    private ImageButton f2032H;

    /* renamed from: I */
    private ImageButton f2033I;

    /* renamed from: J */
    private ImageButton f2034J;

    /* renamed from: K */
    private ImageButton f2035K;

    /* renamed from: L */
    private ImageButton f2036L;

    /* renamed from: M */
    private ImageButton f2037M;

    /* renamed from: N */
    private TextView f2038N;

    /* renamed from: O */
    private ImageButton f2039O;

    /* renamed from: P */
    private ImageButton f2040P;

    /* renamed from: Q */
    private ViewGroup f2041Q;

    /* renamed from: R */
    private ImageButton f2042R;

    /* renamed from: S */
    private ImageButton f2043S;

    /* renamed from: T */
    private ImageButton f2044T;

    /* renamed from: U */
    private ImageButton f2045U;

    /* renamed from: V */
    private ImageButton f2046V;

    /* renamed from: W */
    private ImageButton f2047W;

    /* renamed from: X */
    private ImageButton f2048X;

    /* renamed from: Y */
    private Button f2049Y;

    /* renamed from: Z */
    private TextView f2050Z;

    /* renamed from: aE */
    private boolean f2055aE;

    /* renamed from: aG */
    private boolean f2057aG;

    /* renamed from: aH */
    private float f2058aH;

    /* renamed from: aI */
    private Timer f2059aI;

    /* renamed from: aJ */
    private int f2060aJ;

    /* renamed from: aK */
    private int f2061aK;

    /* renamed from: aL */
    private boolean f2062aL;

    /* renamed from: aM */
    private int f2063aM;

    /* renamed from: aa */
    private SeekBar f2064aa;

    /* renamed from: ab */
    private SeekBar f2065ab;

    /* renamed from: ac */
    private SeekBar f2066ac;

    /* renamed from: ad */
    private ToggleButton f2067ad;

    /* renamed from: ae */
    private View f2068ae;

    /* renamed from: af */
    private boolean f2069af;

    /* renamed from: ai */
    private EnumC0855hq f2072ai;

    /* renamed from: aj */
    private boolean f2073aj;

    /* renamed from: ak */
    private boolean f2074ak;

    /* renamed from: al */
    private boolean f2075al;

    /* renamed from: am */
    private EnumC0796fl f2076am;

    /* renamed from: an */
    private boolean f2077an;

    /* renamed from: ao */
    private boolean f2078ao;

    /* renamed from: aq */
    private C0575ak f2080aq;

    /* renamed from: ar */
    private C0853ho f2081ar;

    /* renamed from: as */
    private C0853ho f2082as;

    /* renamed from: n */
    C0246c f2089n;

    /* renamed from: o */
    Toast f2090o;

    /* renamed from: p */
    C1009bt f2091p;

    /* renamed from: t */
    private C0864hz f2092t;

    /* renamed from: u */
    private C0620v f2093u;

    /* renamed from: v */
    private RelativeLayout f2094v;

    /* renamed from: w */
    private PageView f2095w;

    /* renamed from: x */
    private TextView f2096x;

    /* renamed from: y */
    private TextView f2097y;

    /* renamed from: z */
    private View f2098z;

    /* renamed from: G */
    private String f2031G = "";

    /* renamed from: ag */
    private boolean f2070ag = true;

    /* renamed from: ah */
    private int f2071ah = -1;

    /* renamed from: ap */
    private EnumC0863hy f2079ap = EnumC0863hy.User;

    /* renamed from: at */
    private EnumC0860hv[] f2083at = {EnumC0860hv.PreviousComic, EnumC0860hv.PreviousPart, EnumC0860hv.NextComic, EnumC0860hv.PreviousPart, EnumC0860hv.Menu, EnumC0860hv.NextPart, EnumC0860hv.PreviousPage, EnumC0860hv.NextPart, EnumC0860hv.NextPage};

    /* renamed from: au */
    private EnumC0860hv[] f2084au = {EnumC0860hv.None, EnumC0860hv.GotoPage, EnumC0860hv.None, EnumC0860hv.PreviousBookmark, EnumC0860hv.ShowZoom, EnumC0860hv.NextBookmark, EnumC0860hv.None, EnumC0860hv.Bookmarks, EnumC0860hv.None};

    /* renamed from: aw */
    private boolean f2085aw = true;

    /* renamed from: ax */
    @SuppressLint({"UseSparseArrays"})
    private Map<Integer, C0858ht> f2086ax = new HashMap<>();

    /* renamed from: ay */
    private EnumC0860hv f2087ay = EnumC0860hv.ChangePageType;

    /* renamed from: az */
    private C0857hs f2088az = new C0857hs(EnumC0860hv.PreviousBookmark, EnumC0860hv.FirstPage);

    /* renamed from: aA */
    private C0857hs f2051aA = new C0857hs(EnumC0860hv.NextBookmark, EnumC0860hv.GotoPage);

    /* renamed from: aB */
    private C0857hs f2052aB = new C0857hs(EnumC0860hv.NextComic, EnumC0860hv.None);

    /* renamed from: aC */
    private C0857hs f2053aC = new C0857hs(EnumC0860hv.PreviousComic, EnumC0860hv.None);

    /* renamed from: aD */
    private List<EnumC0539cg> f2054aD = null;

    /* renamed from: aF */
    private EnumC0862hx f2056aF = EnumC0862hx.System;

    /* renamed from: U */
    private static /* synthetic */ int[] m1535U() {
        int[] iArr = f2016aN;
        if (iArr == null) {
            iArr = new int[EnumC0856hr.valuesCustom().length];
            try {
                iArr[EnumC0856hr.Large.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0856hr.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0856hr.Small.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            f2016aN = iArr;
        }
        return iArr;
    }

    /* renamed from: V */
    private static /* synthetic */ int[] m1536V() {
        int[] iArr = f2017aO;
        if (iArr == null) {
            iArr = new int[EnumC0862hx.valuesCustom().length];
            try {
                iArr[EnumC0862hx.Maximum.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0862hx.Minimum.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0862hx.System.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            f2017aO = iArr;
        }
        return iArr;
    }

    /* renamed from: W */
    private static /* synthetic */ int[] m1537W() {
        int[] iArr = f2018aP;
        if (iArr == null) {
            iArr = new int[EnumC1164s.valuesCustom().length];
            try {
                iArr[EnumC1164s.FitAll.ordinal()] = 7;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1164s.FitBest.ordinal()] = 5;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1164s.FitHeight.ordinal()] = 4;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1164s.FitInside.ordinal()] = 6;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1164s.FitWidth.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1164s.None.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC1164s.Original.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            f2018aP = iArr;
        }
        return iArr;
    }

    /* renamed from: X */
    private static /* synthetic */ int[] m1538X() {
        int[] iArr = f2019aQ;
        if (iArr == null) {
            iArr = new int[EnumC0855hq.valuesCustom().length];
            try {
                iArr[EnumC0855hq.All.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0855hq.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0855hq.None.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            f2019aQ = iArr;
        }
        return iArr;
    }

    /* renamed from: Y */
    private static /* synthetic */ int[] m1539Y() {
        int[] iArr = f2020aR;
        if (iArr == null) {
            iArr = new int[EnumC0540ch.valuesCustom().length];
            try {
                iArr[EnumC0540ch.No.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0540ch.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0540ch.Yes.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0540ch.YesAndRightToLeft.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f2020aR = iArr;
        }
        return iArr;
    }

    /* renamed from: Z */
    private static /* synthetic */ int[] m1540Z() {
        int[] iArr = f2021aS;
        if (iArr == null) {
            iArr = new int[EnumC0860hv.valuesCustom().length];
            try {
                iArr[EnumC0860hv.AdjustColors.ordinal()] = 16;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0860hv.BackToLibrary.ordinal()] = 19;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0860hv.Bookmarks.ordinal()] = 14;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0860hv.ChangePageType.ordinal()] = 27;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC0860hv.FirstPage.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC0860hv.GotoPage.ordinal()] = 24;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC0860hv.LastPage.ordinal()] = 8;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EnumC0860hv.Menu.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[EnumC0860hv.NextBookmark.ordinal()] = 26;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[EnumC0860hv.NextComic.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[EnumC0860hv.NextPage.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[EnumC0860hv.NextPart.ordinal()] = 4;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[EnumC0860hv.None.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[EnumC0860hv.PreviousBookmark.ordinal()] = 25;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[EnumC0860hv.PreviousComic.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[EnumC0860hv.PreviousPage.ordinal()] = 6;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[EnumC0860hv.PreviousPart.ordinal()] = 3;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[EnumC0860hv.RateBook.ordinal()] = 23;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[EnumC0860hv.ShowInfo.ordinal()] = 22;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[EnumC0860hv.ShowZoom.ordinal()] = 13;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[EnumC0860hv.Snapshot.ordinal()] = 20;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[EnumC0860hv.SwitchFittingMode.ordinal()] = 12;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[EnumC0860hv.SwitchRotation.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[EnumC0860hv.ToggleBrightness.ordinal()] = 15;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[EnumC0860hv.ToggleDoublePage.ordinal()] = 11;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[EnumC0860hv.ToggleLandscapePortrait.ordinal()] = 18;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[EnumC0860hv.ToggleManga.ordinal()] = 21;
            } catch (NoSuchFieldError e27) {
            }
            f2021aS = iArr;
        }
        return iArr;
    }

    /* renamed from: aa */
    private static /* synthetic */ int[] m1577aa() {
        int[] iArr = f2022aT;
        if (iArr == null) {
            iArr = new int[EnumC0863hy.valuesCustom().length];
            try {
                iArr[EnumC0863hy.Autorotate.ordinal()] = 4;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0863hy.Landscape.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0863hy.Portrait.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0863hy.User.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            f2022aT = iArr;
        }
        return iArr;
    }

    /* renamed from: ab */
    private static /* synthetic */ int[] m1578ab() {
        int[] iArr = f2023aU;
        if (iArr == null) {
            iArr = new int[EnumC0793fi.valuesCustom().length];
            try {
                iArr[EnumC0793fi.Backward.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0793fi.Forward.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0793fi.None.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            f2023aU = iArr;
        }
        return iArr;
    }

    /* renamed from: A */
    static /* synthetic */ C0864hz m1512A(ReaderActivity readerActivity) {
        return readerActivity.f2092t;
    }

    /* renamed from: f */
    static /* synthetic */ C0620v m1596f(ReaderActivity readerActivity) {
        return readerActivity.f2093u;
    }

    /* renamed from: b */
    static /* synthetic */ PageView m1580b(ReaderActivity readerActivity) {
        return readerActivity.f2095w;
    }

    /* renamed from: B */
    static /* synthetic */ TextView m1514B(ReaderActivity readerActivity) {
        return readerActivity.f2096x;
    }

    /* renamed from: w */
    static /* synthetic */ View m1617w(ReaderActivity readerActivity) {
        return readerActivity.f2098z;
    }

    /* renamed from: x */
    static /* synthetic */ View m1619x(ReaderActivity readerActivity) {
        return readerActivity.f2025A;
    }

    /* renamed from: y */
    static /* synthetic */ View m1621y(ReaderActivity readerActivity) {
        return readerActivity.f2028D;
    }

    /* renamed from: v */
    static /* synthetic */ TextView m1615v(ReaderActivity readerActivity) {
        return readerActivity.f2038N;
    }

    /* renamed from: C */
    static /* synthetic */ TextView m1516C(ReaderActivity readerActivity) {
        return readerActivity.f2050Z;
    }

    /* renamed from: o */
    static /* synthetic */ View m1608o(ReaderActivity readerActivity) {
        return readerActivity.f2068ae;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1571a(ReaderActivity readerActivity) {
        return readerActivity.f2070ag;
    }

    /* renamed from: g */
    static /* synthetic */ int m1599g(ReaderActivity readerActivity) {
        return readerActivity.f2071ah;
    }

    /* renamed from: d */
    static /* synthetic */ EnumC0855hq m1589d(ReaderActivity readerActivity) {
        return readerActivity.f2072ai;
    }

    /* renamed from: c */
    static /* synthetic */ EnumC0796fl m1585c(ReaderActivity readerActivity) {
        return readerActivity.f2076am;
    }

    /* renamed from: a */
    static /* synthetic */ void m1560a(ReaderActivity readerActivity, EnumC0863hy enumC0863hy) {
        readerActivity.f2079ap = enumC0863hy;
    }

    /* renamed from: p */
    static /* synthetic */ EnumC0863hy m1609p(ReaderActivity readerActivity) {
        return readerActivity.f2079ap;
    }

    /* renamed from: i */
    static /* synthetic */ EnumC0860hv m1602i(ReaderActivity readerActivity) {
        return readerActivity.f2087ay;
    }

    /* renamed from: a */
    static /* synthetic */ void m1562a(ReaderActivity readerActivity, boolean z) {
        readerActivity.f2055aE = z;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m1595e(ReaderActivity readerActivity) {
        return readerActivity.f2057aG;
    }

    /* renamed from: a */
    static /* synthetic */ void m1555a(ReaderActivity readerActivity, float f) {
        readerActivity.f2058aH = f;
    }

    /* renamed from: h */
    static /* synthetic */ float m1601h(ReaderActivity readerActivity) {
        return readerActivity.f2058aH;
    }

    public ReaderActivity() {
        this.f2086ax.put(19, new C0858ht("up", EnumC0860hv.PreviousPart));
        this.f2086ax.put(20, new C0858ht("down", EnumC0860hv.NextPart));
        this.f2086ax.put(21, new C0858ht("left", EnumC0860hv.PreviousPage));
        this.f2086ax.put(22, new C0858ht("right", EnumC0860hv.NextPage));
        this.f2086ax.put(24, new C0858ht("volumeup", EnumC0860hv.None));
        this.f2086ax.put(25, new C0858ht("volumedown", EnumC0860hv.None));
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: a */
    public final void mo1399a(Bundle bundle) {
        C0505b c0505bM1422a;
        Uri data;
        super.mo1399a(bundle);
        Intent intent = getIntent();
        setContentView(C0804ft.reader);
        SystemBarInsets.applyToContent(this);
        this.f2676s.m2395a(C0803fs.readerBottomBar_ref, android.R.color.black, 1);
        this.f2061aK = this.f2676s.m2396a(C0803fs.readerContainer, C0802fr.toolbar_background, 1, false, true);
        C1106a c1106a = this.f2676s;
        int i = this.f2061aK;
        int i2 = C0806fv.buy_full;
        ViewOnClickListenerC0822gk viewOnClickListenerC0822gk = new ViewOnClickListenerC0822gk(this);
        String string = c1106a.f3557a.getString(i2);
        C1151f c1151fM2397a = c1106a.m2397a(i);
        if (c1151fM2397a != null) {
            c1151fM2397a.f3649j = string;
            c1151fM2397a.f3650k = viewOnClickListenerC0822gk;
        }
        this.f2092t = (C0864hz) this.f2675r.f2681a;
        if (this.f2092t == null) {
            this.f2092t = new C0864hz();
            m1877a(this.f2092t);
        }
        this.f2094v = (RelativeLayout) findViewById(C0803fs.readerContainer);
        this.f2095w = (PageView) findViewById(C0803fs.readerPageView);
        this.f2068ae = new View(this);
        this.f2068ae.setVisibility(4);
        this.f2068ae.setBackgroundColor(getResources().getColor(C0800fp.reader_hot_overlay_color));
        this.f2094v.addView(this.f2068ae, 1);
        this.f2098z = findViewById(C0803fs.readerTopBar);
        this.f2096x = (TextView) findViewById(C0803fs.readerCaption);
        this.f2097y = (TextView) findViewById(C0803fs.readerSubCaption);
        this.f2025A = findViewById(C0803fs.readerBottomBar_ref);
        this.f2028D = findViewById(C0803fs.readerCoverContainer);
        this.f2029E = (FastThumbView) findViewById(C0803fs.readerCover);
        this.f2050Z = (TextView) findViewById(C0803fs.readerPageNumber);
        this.f2050Z.setVisibility(4);
        this.f2027C = (Gallery) findViewById(C0803fs.readerThumbnails);
        this.f2027C.setHorizontalFadingEdgeEnabled(false);
        this.f2026B = findViewById(C0803fs.readerColorContainer_ref);
        this.f2026B.setVisibility(8);
        this.f2032H = (ImageButton) findViewById(C0803fs.readerClose);
        this.f2033I = (ImageButton) findViewById(C0803fs.readerMenu);
        this.f2034J = (ImageButton) findViewById(C0803fs.readerFit);
        this.f2035K = (ImageButton) findViewById(C0803fs.readerDoublePage);
        this.f2036L = (ImageButton) findViewById(C0803fs.readerColorAdjust);
        this.f2037M = (ImageButton) findViewById(C0803fs.readerManga);
        this.f2049Y = (Button) findViewById(C0803fs.readerColorReset);
        this.f2038N = (TextView) findViewById(C0803fs.readerClock);
        this.f2064aa = (SeekBar) findViewById(C0803fs.readerSeekBarSaturation);
        this.f2065ab = (SeekBar) findViewById(C0803fs.readerSeekBarBrightness);
        this.f2066ac = (SeekBar) findViewById(C0803fs.readerSeekBarContrast);
        this.f2067ad = (ToggleButton) findViewById(C0803fs.readerToggleColors);
        this.f2041Q = (ViewGroup) findViewById(C0803fs.readerButtonsRight);
        this.f2042R = (ImageButton) findViewById(C0803fs.readerFirstPage);
        this.f2043S = (ImageButton) findViewById(C0803fs.readerLastPage);
        this.f2039O = (ImageButton) findViewById(C0803fs.readerNextComic);
        this.f2040P = (ImageButton) findViewById(C0803fs.readerPreviousComic);
        this.f2044T = (ImageButton) findViewById(C0803fs.readerBookmarks);
        this.f2047W = (ImageButton) findViewById(C0803fs.readerInfo);
        this.f2048X = (ImageButton) findViewById(C0803fs.readerRate);
        this.f2045U = (ImageButton) findViewById(C0803fs.readerBrightness);
        this.f2046V = (ImageButton) findViewById(C0803fs.readerRotate);
        this.f2030F = (ProgressView) findViewById(C0803fs.readerCurrentProgress);
        this.f2030F.setColor1(getResources().getColor(C0800fp.read_current));
        this.f2030F.setColor2(getResources().getColor(C0800fp.read_maximum));
        this.f2098z.setVisibility(4);
        this.f2025A.setVisibility(4);
        this.f2028D.setVisibility(4);
        this.f2036L.setVisibility(8);
        if (!C0951ag.m1997a(this, EnumC0993bd.Large)) {
            this.f2037M.setVisibility(8);
            this.f2048X.setVisibility(8);
        }
        this.f2095w.setOnTapListener(this);
        this.f2095w.setOnContentAnimationListener(this);
        this.f2095w.setOnManualScrollListener(new PageDragListener(this, (byte) 0));
        this.f2095w.f3699b = 1.1f;
        if (C0951ag.m2000b()) {
            this.f2095w.setOnGetSizeListener(new C0837gz(this));
        }
        this.f2033I.setOnClickListener(new ViewOnClickListenerC0847hi(this));
        m1549a((View) this.f2032H, EnumC0860hv.BackToLibrary, false);
        m1549a((View) this.f2034J, EnumC0860hv.SwitchFittingMode, false);
        m1549a((View) this.f2035K, EnumC0860hv.ToggleDoublePage, false);
        m1549a((View) this.f2036L, EnumC0860hv.AdjustColors, true);
        m1549a((View) this.f2037M, EnumC0860hv.ToggleManga, false);
        m1549a(this.f2028D, EnumC0860hv.ShowInfo, true);
        m1549a((View) this.f2047W, EnumC0860hv.ShowInfo, true);
        m1549a((View) this.f2048X, EnumC0860hv.RateBook, true);
        m1549a((View) this.f2044T, EnumC0860hv.Bookmarks, true);
        m1549a((View) this.f2045U, EnumC0860hv.ToggleBrightness, false);
        m1549a((View) this.f2046V, EnumC0860hv.SwitchRotation, true);
        this.f2027C.setOnItemClickListener(new C0848hj(this));
        this.f2027C.setOnTouchListener(new ViewOnTouchListenerC0849hk(this));
        this.f2027C.setOnItemLongClickListener(new C0850hl(this));
        this.f2065ab.setOnSeekBarChangeListener(new C0851hm(this));
        this.f2066ac.setOnSeekBarChangeListener(new C0852hn(this));
        this.f2064aa.setOnSeekBarChangeListener(new C0812ga(this));
        this.f2067ad.setOnCheckedChangeListener(new C0813gb(this));
        this.f2049Y.setOnClickListener(new ViewOnClickListenerC0814gc(this));
        SharedPreferences sharedPreferencesR = m1878r();
        this.f2060aJ = sharedPreferencesR.getInt("reader_total_pages_read", 0);
        m1530P();
        m1531Q();
        this.f2095w.setColorBrightness(sharedPreferencesR.getFloat("reader_color_brightness", 0.0f));
        this.f2095w.setColorSaturation(sharedPreferencesR.getFloat("reader_color_saturation", 0.0f));
        this.f2095w.setColorContrast(sharedPreferencesR.getFloat("reader_color_contrast", 0.0f));
        this.f2095w.setColorEnabled(sharedPreferencesR.getBoolean("reader_color_enabled", true));
        m1616v();
        this.f2056aF = EnumC0862hx.valueOf(sharedPreferencesR.getString("reader_screen_brightness", EnumC0862hx.System.toString()));
        m1618w();
        if (ComicRackApplication.f1954i.m1438c() != null) {
            this.f2080aq = ComicRackApplication.f1954i.m1438c().m1392a(intent);
        }
        if (this.f2092t.f2638c != null) {
            m1554a(this.f2092t.f2638c, -1, new C0794fj(EnumC0793fi.None, null), false);
            if (this.f2092t.f2636a) {
                InterfaceC0606h interfaceC0606hM1340j = this.f2093u.m1340j();
                interfaceC0606hM1340j.mo1298a();
                m1553a(interfaceC0606hM1340j);
            }
        } else {
            if (bundle != null) {
                String string2 = bundle.getString("comic_cource");
                c0505bM1422a = string2 != null ? m1588d(string2) : ComicRackApplication.f1954i.m1435b(bundle.getString("comic_id"));
            } else {
                c0505bM1422a = ComicRackApplication.f1954i.m1422a(intent);
                if (c0505bM1422a == null && intent != null && (data = intent.getData()) != null) {
                    if ("content".equals(data.getScheme())) {
                        ComicDocuments.persistReadGrant(intent);
                        c0505bM1422a = m1588d(data.toString());
                    }
                }
            }
            if (c0505bM1422a != null) {
                m1551a(c0505bM1422a, EnumC0793fi.None);
            }
        }
        if (this.f2092t.f2636a) {
            this.f2098z.setVisibility(0);
            this.f2025A.setVisibility(0);
            this.f2028D.setVisibility(0);
        }
        if (this.f2092t.f2637b) {
            this.f2026B.setVisibility(0);
        }
    }

    /* renamed from: d */
    private static C0505b m1588d(String str) {
        if (ComicDocuments.isDocument(str)) {
            C0505b comic = new C0505b();
            comic.f1655v = str;
            return comic;
        }
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        C0505b c0505b = new C0505b();
        c0505b.f1655v = file.getAbsolutePath();
        c0505b.f1584p = true;
        return c0505b;
    }

    /* renamed from: a */
    private void m1549a(View view, EnumC0860hv enumC0860hv, boolean z) {
        if (view != null) {
            view.setOnClickListener(new ViewOnClickListenerC0815gd(this, z, enumC0860hv));
        }
    }

    /* renamed from: a */
    private void m1548a(View view, C0857hs c0857hs) {
        int i = 0;
        m1549a(view, c0857hs.f2582a, false);
        EnumC0860hv enumC0860hv = c0857hs.f2583b;
        if (view != null) {
            view.setOnLongClickListener(new ViewOnLongClickListenerC0816ge(this, enumC0860hv));
        }
        if (c0857hs.f2582a == EnumC0860hv.None && c0857hs.f2583b == EnumC0860hv.None) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: j */
    static /* synthetic */ void m1603j(ReaderActivity readerActivity) {
        readerActivity.m1616v();
    }

    /* renamed from: v */
    private void m1616v() {
        this.f2065ab.setProgress(((int) (this.f2095w.getColorBrightness() * 100.0f)) + 100);
        this.f2066ac.setProgress(((int) (this.f2095w.getColorContrast() * 100.0f)) + 100);
        this.f2064aa.setProgress(((int) (this.f2095w.getColorSaturation() * 100.0f)) + 100);
        this.f2067ad.setChecked(this.f2095w.m1510a());
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: a */
    public final void mo1627a(Configuration configuration) {
        super.mo1627a(configuration);
        m1622y();
        m1618w();
    }

    /* renamed from: w */
    private void m1618w() {
        EnumC1164s enumC1164sValueOf;
        this.f2073aj = C0951ag.m2002c(this);
        this.f2031G = this.f2073aj ? "" : "landscape_";
        this.f2079ap = EnumC0863hy.valueOf(ComicRackApplication.f1954i.m1441e().getString("reader_screen_rotation", EnumC0863hy.User.toString()));
        if (this.f2073aj) {
            enumC1164sValueOf = EnumC1164s.valueOf(m1878r().getString("fitting_mode", EnumC1164s.FitAll.toString()));
            this.f2078ao = m1878r().getBoolean("double_page_mode", false);
        } else {
            enumC1164sValueOf = EnumC1164s.valueOf(m1878r().getString(String.valueOf(this.f2031G) + "fitting_mode", EnumC1164s.FitWidth.toString()));
            this.f2078ao = m1878r().getBoolean(String.valueOf(this.f2031G) + "double_page_mode", C0951ag.m1997a(this, EnumC0993bd.Large));
        }
        m1564a(enumC1164sValueOf, false);
        m1583b(false);
        this.f2095w.m2493a(ComicRackApplication.f1954i.m1441e().getBoolean("reader_always_split_double_pages", false) || C0951ag.m2002c(this));
        m1620x();
    }

    /* renamed from: x */
    private void m1620x() {
        EnumC0856hr layoutSize;
        if (C0951ag.m1997a(this, EnumC0993bd.XLarge)) {
            layoutSize = EnumC0856hr.Large;
        } else if (C0951ag.m1997a(this, EnumC0993bd.Large)) {
            layoutSize = this.f2073aj ? EnumC0856hr.Medium : EnumC0856hr.Large;
        } else {
            layoutSize = this.f2073aj ? EnumC0856hr.Small : EnumC0856hr.Medium;
        }
        int layout = m1535U()[layoutSize.ordinal()];
        int primaryVisibility = layout == 2 || layout == 3 ? View.VISIBLE : View.GONE;
        this.f2035K.setVisibility(primaryVisibility);
        this.f2045U.setVisibility(primaryVisibility);
        this.f2046V.setVisibility(layout == 3 ? View.VISIBLE : View.GONE);
    }

    /* renamed from: b */
    private boolean m1583b(boolean z) {
        boolean z2 = this.f2079ap != EnumC0863hy.Autorotate && this.f2078ao;
        boolean z3 = z && !this.f2073aj;
        this.f2035K.setImageResource(z2 ? C0802fr.btn_double_page : C0802fr.btn_single_page);
        m1620x();
        if (this.f2077an == z2) {
            return false;
        }
        this.f2077an = z2;
        if (this.f2093u == null) {
            return false;
        }
        m1554a(this.f2093u.m1340j(), this.f2093u.mo1298a().m1140f(), new C0794fj(z3 ? EnumC0793fi.Forward : EnumC0793fi.None, EnumC0796fl.Overlap), false);
        return true;
    }

    /* renamed from: y */
    private void m1622y() {
        SharedPreferences.Editor editorEdit = m1878r().edit();
        editorEdit.putString(String.valueOf(this.f2031G) + "fitting_mode", this.f2095w.getFitting().toString());
        editorEdit.putBoolean(String.valueOf(this.f2031G) + "double_page_mode", this.f2078ao);
        editorEdit.commit();
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: h */
    protected final void mo1483h() {
        boolean z;
        super.mo1483h();
        SharedPreferences sharedPreferencesM1441e = ComicRackApplication.f1954i.m1441e();
        this.f2072ai = EnumC0855hq.valueOf(sharedPreferencesM1441e.getString("reader_pageview_autocrop_type", EnumC0796fl.None.toString()));
        this.f2075al = sharedPreferencesM1441e.getBoolean("reader_pageview_pagenumbers", false);
        this.f2076am = EnumC0796fl.valueOf(sharedPreferencesM1441e.getString("reader_animation_page_transition_style", EnumC0796fl.Slide.toString()));
        this.f2069af = sharedPreferencesM1441e.getBoolean("reader_animation_scroll", true);
        this.f2074ak = sharedPreferencesM1441e.getBoolean("reader_tapping_show_area", false);
        this.f2070ag = sharedPreferencesM1441e.getBoolean("reader_horizontal_swipe_enabled", true);
        this.f2085aw = sharedPreferencesM1441e.getBoolean("reader_reverse_touch_commands_enabled", true);
        this.f2095w.m2495b(sharedPreferencesM1441e.getBoolean("reader_animation_zoom", true));
        this.f2095w.m1509a(this.f2076am != EnumC0796fl.None, sharedPreferencesM1441e.getBoolean("reader_animation_page_transition_show_full", false));
        this.f2095w.setBackgroundStyle(sharedPreferencesM1441e.getString("reader_pageview_background_color", PageView.f1997a.toString()));
        this.f2095w.m2498d();
        this.f2095w.setKeepScreenOn(sharedPreferencesM1441e.getBoolean("reader_screen_always_on", false));
        m1517C();
        this.f2057aG = sharedPreferencesM1441e.getBoolean("reader_hide_navigation", true) && !C0951ag.m1995a().mo2037d(this);
        this.f2038N.setVisibility(sharedPreferencesM1441e.getBoolean("reader_show_clock", false) ? 0 : 8);
        m1527M();
        for (int i = 0; i < this.f2083at.length; i++) {
            this.f2083at[i] = EnumC0860hv.valueOf(sharedPreferencesM1441e.getString(String.format("reader_tapping_a%d", Integer.valueOf(i + 1)), this.f2083at[i].toString()));
            this.f2084au[i] = EnumC0860hv.valueOf(sharedPreferencesM1441e.getString(String.format("reader_longtouch_a%d", Integer.valueOf(i + 1)), this.f2084au[i].toString()));
        }
        m1547a(sharedPreferencesM1441e, "back", this.f2088az);
        m1547a(sharedPreferencesM1441e, "forward", this.f2051aA);
        m1547a(sharedPreferencesM1441e, "nextbook", this.f2052aB);
        m1547a(sharedPreferencesM1441e, "prevbook", this.f2053aC);
        m1548a(this.f2042R, this.f2088az);
        m1548a(this.f2043S, this.f2051aA);
        m1548a(this.f2039O, this.f2052aB);
        m1548a(this.f2040P, this.f2053aC);
        ViewGroup viewGroup = this.f2041Q;
        ViewGroup viewGroup2 = this.f2041Q;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup2.getChildCount()) {
                z = false;
                break;
            } else {
                if (viewGroup2.getChildAt(i2).getVisibility() == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        viewGroup.setVisibility(z ? 0 : 8);
        for (C0858ht c0858ht : this.f2086ax.values()) {
            c0858ht.f2585b = EnumC0860hv.valueOf(sharedPreferencesM1441e.getString(String.format("reader_key_%s", c0858ht.f2584a), c0858ht.f2585b.toString()));
        }
        String string = sharedPreferencesM1441e.getString("reader_reading_pagefilter", null);
        if (C0998bi.m2081a(string)) {
            this.f2054aD = null;
            return;
        }
        String[] strArrSplit = string.split("\n");
        this.f2054aD = new ArrayList<>();
        for (String str : strArrSplit) {
            try {
                this.f2054aD.add(EnumC0539cg.valueOf(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: z */
    private boolean m1624z() {
        return (this.f2093u == null || this.f2093u.mo1298a() == null || this.f2093u.mo1298a().f1584p) ? false : true;
    }

    /* renamed from: a */
    private static void m1547a(SharedPreferences sharedPreferences, String str, C0857hs c0857hs) {
        c0857hs.f2582a = EnumC0860hv.valueOf(sharedPreferences.getString(String.format("reader_navpanel_tap_%s", str), c0857hs.f2582a.toString()));
        c0857hs.f2583b = EnumC0860hv.valueOf(sharedPreferences.getString(String.format("reader_navpanel_longtouch_%s", str), c0857hs.f2583b.toString()));
    }

    /* renamed from: b */
    static /* synthetic */ void m1581b(ReaderActivity readerActivity, boolean z) {
        readerActivity.m1586c(z);
    }

    /* renamed from: c */
    private void m1586c(boolean z) {
        C0951ag.m1995a().mo2027a(this.f2094v, z);
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: j */
    protected final void mo1485j() {
        super.mo1485j();
        m1515B();
        m1618w();
        if (this.f2095w.getPageBitmap() == null && this.f2093u != null) {
            AbstractC0587aa abstractC0587aaM1543a = m1543a(m1518D());
            if (this.f2072ai != EnumC0855hq.None && !(abstractC0587aaM1543a instanceof C0616r)) {
                abstractC0587aaM1543a = m1544a(abstractC0587aaM1543a);
            }
            this.f2095w.setPageBitmap(abstractC0587aaM1543a);
            this.f2095w.m2490a(abstractC0587aaM1543a.mo1273b(), abstractC0587aaM1543a.mo1274c());
            m1552a((AbstractC0587aa) null, -1);
        }
        m1586c(this.f2057aG && !this.f2062aL);
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: i */
    protected final void mo1484i() {
        super.mo1484i();
        m1515B();
        m1622y();
        SharedPreferences.Editor editorEdit = m1878r().edit();
        editorEdit.putInt("reader_total_pages_read", this.f2060aJ);
        editorEdit.putString("reader_screen_brightness", this.f2056aF.toString());
        editorEdit.putFloat("reader_color_brightness", this.f2095w.getColorBrightness());
        editorEdit.putFloat("reader_color_saturation", this.f2095w.getColorSaturation());
        editorEdit.putFloat("reader_color_contrast", this.f2095w.getColorContrast());
        editorEdit.putBoolean("reader_color_enabled", this.f2095w.m1510a());
        editorEdit.commit();
        this.f2092t.f2636a = this.f2062aL;
        this.f2092t.f2637b = this.f2026B.getVisibility() == 0;
        this.f2092t.f2638c = this.f2093u == null ? null : this.f2093u.m1340j();
        C0628f.m1364b(this.f2093u);
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: a_ */
    protected final void mo1629a_() {
        super.mo1629a_();
        m1520F();
        m1594e(true);
        m1598f(true);
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: b */
    protected final void mo1630b(Bundle bundle) {
        if (this.f2093u != null && this.f2093u.mo1298a() != null) {
            if (this.f2093u.mo1298a().f1584p) {
                bundle.putString("comic_cource", this.f2093u.mo1307c());
            } else {
                bundle.putString("comic_id", this.f2093u.mo1298a().f1570b);
            }
        }
        super.mo1630b(bundle);
    }

    @Override // com.cyo.common.view.InterfaceC1110ad
    /* renamed from: a */
    public final boolean mo1628a(float f, float f2) {
        Rect rectM1962a;
        int i;
        int i2;
        if (this.f2026B.getVisibility() == 0) {
            m1529O();
            return false;
        }
        if (this.f2062aL) {
            m1528N();
            return false;
        }
        int iM1584c = m1584c(f, f2);
        if (iM1584c == -1) {
            return false;
        }
        if (this.f2074ak) {
            if (iM1584c < 0 || iM1584c >= 10) {
                rectM1962a = null;
            } else {
                int width = this.f2095w.getWidth();
                int height = this.f2095w.getHeight();
                int i3 = (int) (width * 0.2f);
                int i4 = (int) (height * 0.2f);
                switch (iM1584c % 3) {
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        int i5 = width - (i3 * 2);
                        i = i3;
                        i3 = i5;
                        break;
                    case 2:
                        i = width - i3;
                        break;
                    default:
                        i3 = 0;
                        i = 0;
                        break;
                }
                switch (iM1584c / 3) {
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        int i6 = height - (i4 * 2);
                        i2 = i4;
                        i4 = i6;
                        break;
                    case 2:
                        i2 = height - i4;
                        break;
                    default:
                        i4 = 0;
                        i2 = 0;
                        break;
                }
                rectM1962a = C0933d.m1962a(i, i2, i3, i4);
            }
            if (rectM1962a != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(rectM1962a.width(), rectM1962a.height());
                layoutParams.leftMargin = rectM1962a.left;
                layoutParams.topMargin = rectM1962a.top;
                this.f2068ae.setLayoutParams(layoutParams);
                this.f2068ae.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200L);
                alphaAnimation.setRepeatCount(1);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setAnimationListener(new AnimationAnimationListenerC0829gr(this));
                this.f2068ae.startAnimation(alphaAnimation);
            }
        }
        m1563a(this.f2083at[iM1584c], EnumC0861hw.Tap, (Object) null);
        return true;
    }

    @Override // com.cyo.common.view.InterfaceC1110ad
    /* renamed from: l */
    public final boolean mo1632l() {
        m960a("Reader", "DoubleTap", "", 0);
        return false;
    }

    @Override // com.cyo.common.view.InterfaceC1110ad
    /* renamed from: b */
    public final boolean mo1631b(float f, float f2) {
        if (this.f2026B.getVisibility() == 0) {
            m1529O();
            return true;
        }
        int iM1584c = this.f2062aL ? 4 : m1584c(f, f2);
        if (iM1584c == -1) {
            return false;
        }
        m1563a(this.f2084au[iM1584c], EnumC0861hw.LongTouch, (Object) null);
        return true;
    }

    @Override // android.support.v4.app.ActivityC0076l, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            return true;
        }
        C0858ht c0858ht = (C0858ht) this.f2086ax.get(Integer.valueOf(i));
        if (c0858ht == null || c0858ht.f2585b == EnumC0860hv.None) {
            return false;
        }
        m1563a(c0858ht.f2585b, EnumC0861hw.Key, (Object) null);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (m1881u()) {
            if (i == 82) {
                m1528N();
                return true;
            }
            C0858ht c0858ht = (C0858ht) this.f2086ax.get(Integer.valueOf(i));
            if (c0858ht != null && c0858ht.f2585b != EnumC0860hv.None) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.support.v4.app.ActivityC0076l, android.app.Activity
    public void onBackPressed() {
        if (this.f2026B != null && this.f2026B.getVisibility() == 0) {
            m1529O();
        } else if (this.f2062aL) {
            m1528N();
        } else {
            m1513A();
        }
    }

    /* renamed from: A */
    private void m1513A() {
        finishReadingOrShowManualRating(false, (Runnable) new RunnableC0817gf(this));
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip
    /* renamed from: e */
    public final boolean mo1401e() {
        if (this.f2093u != null && this.f2093u.mo1298a() != null && ComicRackApplication.f1954i.m1438c().m1391a(this.f2093u.mo1298a().f1570b) == null) {
            finish();
        }
        return super.mo1401e();
    }

    @Override // com.cyo.comicrack.viewer.ActivityC0881ip, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    /* renamed from: m */
    public final void m1633m() {
        int i;
        ArrayList arrayList = new ArrayList();
        switch (m1536V()[this.f2056aF.ordinal()]) {
            case 1:
                i = C0802fr.btn_bright_system;
                break;
            case 2:
                i = C0802fr.btn_bright_dark;
                break;
            case 3:
                i = C0802fr.btn_bright_white;
                break;
            default:
                i = 0;
                break;
        }
        if (!m1570a((View) this.f2035K)) {
            arrayList.add(new C1006bq(this.f2078ao ? C0802fr.btn_double_page : C0802fr.btn_single_page, getString(C0806fv.reader_action_toggle_double_page), 1004));
        }
        if (!m1570a((View) this.f2037M)) {
            arrayList.add(new C1006bq(m1634n() ? C0802fr.btn_right_left : C0802fr.btn_left_right, getString(C0806fv.toggle_right_left), 1001));
        }
        if (!m1570a((View) this.f2036L)) {
            arrayList.add(new C1006bq(C0802fr.btn_color_adjust2, getString(C0806fv.adjust_colors), 1000));
        }
        if (!m1570a((View) this.f2045U)) {
            arrayList.add(new C1006bq(i, getString(C0806fv.screen_brightness), 1002));
        }
        if (!m1570a((View) this.f2046V)) {
            arrayList.add(new C1006bq(C0802fr.btn_rotate, getString(C0806fv.rotation), 1005));
        }
        if (!m1570a((View) this.f2048X)) {
            arrayList.add(new C1006bq(C0802fr.btn_rate, getString(C0806fv.rate), 1006));
        }
        arrayList.add(new C1006bq(C0802fr.btn_camera, getString(C0806fv.snapshot), 1003));
        arrayList.add(new C1006bq(C0802fr.btn_preferences, getString(C0806fv.preferences), 6));
        arrayList.add(new C1006bq(C0802fr.ic_menu_about, getString(C0806fv.about_comicrack), 12));
        C0999bj c0999bj = new C0999bj((List) arrayList, C0804ft.super_menu_item_singleline, (char) 0);
        c0999bj.f2946d = new C0818gg(this);
        c0999bj.m2097a(this.f2098z, this.f2098z.getHeight(), -220, false);
    }

    /* renamed from: a */
    private static boolean m1570a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    private void m1564a(EnumC1164s enumC1164s, boolean z) {
        switch (m1537W()[enumC1164s.ordinal()]) {
            case 3:
                this.f2034J.setImageResource(C0802fr.btn_fit_width);
                break;
            case 4:
                this.f2034J.setImageResource(C0802fr.btn_fit_height);
                break;
            default:
                this.f2034J.setImageResource(C0802fr.btn_fit_all);
                break;
        }
        this.f2095w.m2491a(enumC1164s, z);
    }

    /* renamed from: n */
    public final boolean m1634n() {
        return this.f2093u != null && this.f2093u.m1341k();
    }

    /* renamed from: B */
    private void m1515B() {
        if (this.f2059aI != null) {
            this.f2059aI.cancel();
        }
        this.f2059aI = new Timer("Clock Timer");
        this.f2059aI.scheduleAtFixedRate(new C0819gh(this), 0L, 60000L);
    }

    /* renamed from: C */
    private void m1517C() {
        SharedPreferences sharedPreferencesM1441e = ComicRackApplication.f1954i.m1441e();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        switch (m1536V()[this.f2056aF.ordinal()]) {
            case 1:
                attributes.screenBrightness = -1.0f;
                this.f2045U.setImageResource(C0802fr.btn_bright_system);
                break;
            case 2:
                this.f2045U.setImageResource(C0802fr.btn_bright_dark);
                attributes.screenBrightness = C0950af.m1989a(sharedPreferencesM1441e.getInt("reader_screen_min_brightness", 20) / 100.0f, 0.01f, 1.0f);
                break;
            case 3:
                this.f2045U.setImageResource(C0802fr.btn_bright_white);
                attributes.screenBrightness = C0950af.m1989a(sharedPreferencesM1441e.getInt("reader_screen_max_brightness", 100) / 100.0f, 0.01f, 1.0f);
                break;
        }
        getWindow().setAttributes(attributes);
    }

    /* renamed from: c */
    private int m1584c(float f, float f2) {
        float width = f / this.f2095w.getWidth();
        float height = f2 / this.f2095w.getHeight();
        return ((height >= 0.2f ? height > 0.8f ? 2 : 1 : 0) * 3) + (width < 0.2f ? 0 : width > 0.8f ? 2 : 1);
    }

    /* renamed from: n */
    static /* synthetic */ int m1607n(ReaderActivity readerActivity) {
        return readerActivity.m1518D();
    }

    /* renamed from: D */
    private int m1518D() {
        if (this.f2071ah == -1) {
            this.f2071ah = this.f2093u != null ? this.f2093u.m1335a(this.f2093u.mo1298a().m1140f(), EnumC0607i.toProvider) : -1;
        }
        return this.f2071ah;
    }

    /* renamed from: E */
    private void m1519E() {
        C0505b c0505bMo1298a = this.f2093u != null ? this.f2093u.mo1298a() : null;
        if (c0505bMo1298a == null) {
            m1565a("No eComic", "");
        } else {
            m1565a(c0505bMo1298a.m1171c(false), c0505bMo1298a.f1656w);
        }
    }

    /* renamed from: a */
    private void m1565a(String str, String str2) {
        this.f2096x.setText(str);
        this.f2097y.setText(str2);
        this.f2097y.setVisibility(C0998bi.m2081a(str2) ? 8 : 0);
    }

    /* renamed from: F */
    private void m1520F() {
        this.f2095w.m2494b();
        this.f2095w.m1507a((AbstractC0587aa) null, new C0794fj(EnumC0793fi.None, null, m1634n(), false), (InterfaceC0792fh) null);
    }

    /* renamed from: G */
    private static boolean m1521G() {
        return C0628f.f1887i != 0;
    }

    /* renamed from: H */
    private static boolean m1522H() {
        return C0628f.f1886h != 0;
    }

    /* renamed from: a */
    static /* synthetic */ C0616r m1545a(ReaderActivity readerActivity, AbstractC0587aa abstractC0587aa) {
        return readerActivity.m1544a(abstractC0587aa);
    }

    /* renamed from: a */
    private C0616r m1544a(AbstractC0587aa abstractC0587aa) {
        float f = 0.0f;
        switch (m1538X()[this.f2072ai.ordinal()]) {
            case 2:
                f = 0.015f;
                break;
        }
        return new C0616r(abstractC0587aa, C0939j.m1973a(abstractC0587aa, f));
    }

    /* renamed from: a */
    private AbstractC0587aa m1543a(int i) {
        return this.f2093u.mo1304b(i);
    }

    /* renamed from: a */
    static /* synthetic */ void m1557a(ReaderActivity readerActivity, InterfaceC0606h interfaceC0606h, int i, C0794fj c0794fj) {
        readerActivity.m1554a(interfaceC0606h, i, c0794fj, true);
    }

    private Runnable archivePin;

    private void releaseArchivePin() {
        if (archivePin != null) {
            archivePin.run();
            archivePin = null;
        }
    }

    @Override
    public void onDestroy() {
        try {
            super.onDestroy();
        } finally {
            releaseArchivePin();
        }
    }

    /* renamed from: a */
    private void m1554a(InterfaceC0606h interfaceC0606h, int i, C0794fj c0794fj, boolean z) {
        if (interfaceC0606h != null) {
            releaseArchivePin();
            archivePin = ComicDocuments.pinArchive(interfaceC0606h.mo1298a().f1655v);
        }
        boolean z2;
        boolean z3 = false;
        C0628f.m1364b(this.f2093u);
        this.f2071ah = -1;
        m1594e(true);
        m1598f(true);
        this.f2029E.setTag(null);
        this.f2027C.setAdapter((SpinnerAdapter) null);
        if (interfaceC0606h == null) {
            m1520F();
        }
        switch (m1539Y()[interfaceC0606h.mo1298a().f1645ac.ordinal()]) {
            case 1:
                z2 = ComicRackApplication.f1954i.m1441e().getBoolean("reader_reading_manga_default", false);
                break;
            case 2:
            default:
                z2 = false;
                break;
            case 3:
            case 4:
                z2 = true;
                break;
        }
        this.f2093u = new C0620v(interfaceC0606h, this.f2077an, z2);
        this.f2037M.setImageResource(this.f2093u.m1341k() ? C0802fr.btn_right_left : C0802fr.btn_left_right);
        this.f2044T.setVisibility(m1624z() ? 0 : 8);
        this.f2048X.setVisibility(m1624z() ? 0 : 8);
        C0505b c0505bMo1298a = this.f2093u.mo1298a();
        c0505bMo1298a.m1130b(C0971b.m2054a());
        c0505bMo1298a.m1123a(c0505bMo1298a.m1138d() + 1);
        if (this.f2028D.getVisibility() == 0) {
            m1553a(this.f2093u.m1340j());
        }
        m1519E();
        if (i >= 0) {
            c0505bMo1298a.m1129b(i);
        }
        int iM1518D = m1518D();
        this.f2027C.setAdapter((SpinnerAdapter) new C0788fd(getApplicationContext(), this.f2093u));
        if (iM1518D >= 0) {
            m1546a(iM1518D, false, false);
        }
        if (iM1518D > 0 && z && ComicRackApplication.f1954i.m1441e().getBoolean("general_reading_show_cover", true)) {
            this.f2095w.postDelayed(new RunnableC0824gm(this, this.f2093u, iM1518D), 1000L);
            iM1518D = 0;
        }
        int iM1335a = this.f2093u.m1335a(iM1518D, EnumC0607i.fromProvider);
        PageView pageView = this.f2095w;
        if (c0794fj.f2470a == EnumC0796fl.Overlap && (iM1335a != i || i == 0)) {
            z3 = true;
        }
        pageView.setOverlapExpandToLeft(z3);
        c0794fj.f2479j = true;
        m1569a(iM1518D, true, c0794fj);
    }

    /* renamed from: a */
    private void m1551a(C0505b c0505b, EnumC0793fi enumC0793fi) {
        AsyncTaskC0825gn asyncTaskC0825gn = new AsyncTaskC0825gn(this, enumC0793fi, c0505b);
        if (this.f2090o != null) {
            this.f2090o.cancel();
            this.f2090o = null;
        }
        finishReadingOrShowManualRating(false, (Runnable) new RunnableC0827gp(this, asyncTaskC0825gn));
    }

    private void finishReadingOrShowManualRating(boolean showManualRating, Runnable onComplete) {
        if (showManualRating && m1624z()) {
            ComicRackApplication.f1954i.showComicRatingDialog(
                    this, this.f2093u.m1340j(), onComplete);
        } else if (onComplete != null) {
            onComplete.run();
        }
    }

    /* renamed from: b */
    private C0505b m1579b(int i) {
        C0505b c0505bMo1298a;
        int iM1377a;
        int i2;
        if (this.f2080aq != null && (c0505bMo1298a = this.f2093u.mo1298a()) != null && this.f2080aq.m1981a(C0572ah.class) && (iM1377a = C0635m.m1377a(this.f2080aq, c0505bMo1298a.f1570b)) != -1 && (i2 = iM1377a + i) >= 0 && i2 < this.f2080aq.m1987y()) {
            return ((C0572ah) this.f2080aq.m1986x().get(i2)).m1221j();
        }
        return null;
    }

    /* renamed from: c */
    private boolean m1587c(int i) {
        C0505b c0505bM1579b = m1579b(i);
        if (c0505bM1579b == null) {
            return false;
        }
        m1551a(c0505bM1579b, i >= 0 ? EnumC0793fi.Forward : EnumC0793fi.Backward);
        return true;
    }

    /* renamed from: r */
    static /* synthetic */ void m1611r(ReaderActivity readerActivity) {
        C0628f.m1364b(readerActivity.f2093u);
    }

    /* renamed from: a */
    static /* synthetic */ void m1559a(ReaderActivity readerActivity, EnumC0860hv enumC0860hv, EnumC0861hw enumC0861hw, Object obj) {
        readerActivity.m1563a(enumC0860hv, enumC0861hw, obj);
    }

    /* renamed from: a */
    private void m1563a(EnumC0860hv enumC0860hv, EnumC0861hw enumC0861hw, Object obj) {
        if (m1634n() && ((this.f2085aw || !EnumC0861hw.m1860a(enumC0861hw)) && f2024av.containsKey(enumC0860hv))) {
            enumC0860hv = (EnumC0860hv) f2024av.get(enumC0860hv);
        }
        switch (m1540Z()[enumC0860hv.ordinal()]) {
            case 2:
                m1528N();
                break;
            case 3:
                if (!m1600g(-1)) {
                    m1532R();
                    break;
                }
                break;
            case 4:
                if (!m1600g(1)) {
                    m1533S();
                    break;
                }
                break;
            case 5:
                m1568a(0, true);
                break;
            case 6:
                m1532R();
                break;
            case 7:
                m1533S();
                break;
            case 8:
                C0505b c0505bMo1298a = this.f2093u.mo1298a();
                int iM1140f = c0505bMo1298a.m1140f();
                int iM1141g = c0505bMo1298a.m1141g();
                if (iM1140f == iM1141g) {
                    m1568a(this.f2093u.m1342l() - 1, true);
                    break;
                } else {
                    m1568a(this.f2093u.m1335a(iM1141g, EnumC0607i.toProvider), true);
                    break;
                }
            case 9:
                if (!m1587c(-1)) {
                    m1582b(C0806fv.reached_start_of_list, -1);
                    break;
                }
                break;
            case 10:
                if (!m1587c(1)) {
                    m1582b(C0806fv.reached_end_of_list, 1);
                    break;
                }
                break;
            case 11:
                this.f2078ao = !this.f2078ao;
                m1583b(true);
                break;
            case 12:
                m1564a(this.f2095w.getFitting().m2453a(), true);
                break;
            case 13:
                this.f2095w.m2499e();
                break;
            case 14:
                if (m1624z()) {
                    new C0896k().m1894a(this, this.f2093u.mo1298a(), new C0820gi(this));
                    break;
                }
                break;
            case 15:
                switch (m1536V()[this.f2056aF.ordinal()]) {
                    case 1:
                        this.f2056aF = EnumC0862hx.Minimum;
                        break;
                    case 2:
                        this.f2056aF = EnumC0862hx.Maximum;
                        break;
                    case 3:
                        this.f2056aF = EnumC0862hx.System;
                        break;
                }
                m1517C();
                break;
            case 16:
                m1529O();
                break;
            case 17:
                List listAsList = Arrays.asList(getResources().getStringArray(C0798fn.readerRotationValues));
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle(C0806fv.reader_screen_rotation_title).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(C0798fn.readerRotation, listAsList.indexOf(this.f2079ap.toString()), new DialogInterfaceOnClickListenerC0830gs(this, listAsList)).create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                alertDialogCreate.show();
                break;
            case 18:
                if (this.f2079ap == EnumC0863hy.Landscape || this.f2079ap == EnumC0863hy.Portrait) {
                    this.f2079ap = this.f2079ap == EnumC0863hy.Landscape ? EnumC0863hy.Portrait : EnumC0863hy.Landscape;
                    m1523I();
                    switch (m1577aa()[this.f2079ap.ordinal()]) {
                        case 1:
                            m1590d(C0806fv.reader_rotation_user);
                            break;
                        case 2:
                            m1590d(C0806fv.reader_rotation_portrait);
                            break;
                        case 3:
                            m1590d(C0806fv.reader_rotation_landscape);
                            break;
                        case 4:
                            m1590d(C0806fv.reader_rotation_autorotate);
                            break;
                    }
                }
                break;
            case 19:
                m1513A();
                break;
            case 20:
                new AlertDialog.Builder(this)
                        .setTitle(C0806fv.snapshot)
                        .setItems(new String[]{getString(C0806fv.save_to_gallery), getString(C0806fv.menu_comiclist_share)},
                                new SnapshotActionListener(this))
                        .show();
                break;
            case 21:
                boolean z = m1634n() ? false : true;
                if (this.f2093u != null && m1634n() != z) {
                    m1590d(m1634n() ? C0806fv.reader_manga_off : C0806fv.reader_manga_on);
                    this.f2093u.mo1298a().m1133b(z);
                    m1554a(this.f2093u.m1340j(), this.f2093u.mo1298a().m1140f(), new C0794fj(this.f2077an ? EnumC0793fi.Forward : EnumC0793fi.None, EnumC0796fl.DoubleOverlap), false);
                    break;
                }
                break;
            case 22:
                if (this.f2093u != null && this.f2093u.mo1298a() != null) {
                    ComicRackApplication.f1954i.m1430a(this, this.f2093u.mo1298a(), (C0575ak) null, C0951ag.m1997a(this, EnumC0993bd.Large) ? false : true);
                    break;
                }
                break;
            case 23:
                finishReadingOrShowManualRating(true, (Runnable) null);
                break;
            case 24:
                if (this.f2093u != null && this.f2093u.mo1298a() != null) {
                    View viewInflate = View.inflate(this, C0804ft.comic_goto_page, null);
                    C0505b c0505bMo1298a2 = this.f2093u.mo1298a();
                    InterfaceC0991bb interfaceC0991bbMo2015a = C0951ag.m1995a().mo2015a(viewInflate.findViewById(C0803fs.comicGotoPageNumber));
                    interfaceC0991bbMo2015a.mo2041b(c0505bMo1298a2.m1139e());
                    interfaceC0991bbMo2015a.mo2040a(m1518D() + 1);
                    new AlertDialog.Builder(this).setTitle(getString(C0806fv.reader_action_goto_page, new Object[]{c0505bMo1298a2.m1149o()})).setView(viewInflate).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0821gj(this, interfaceC0991bbMo2015a)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
                    break;
                }
                break;
            case 25:
                m1597f(-1);
                break;
            case 26:
                m1597f(1);
                break;
            case 27:
                C0537ce c0537ceMo1299a = (C0537ce) obj;
                if (m1624z()) {
                    if (c0537ceMo1299a == null) {
                        c0537ceMo1299a = this.f2093u.mo1299a(m1518D());
                    }
                    List listAsList2 = Arrays.asList(getResources().getStringArray(C0798fn.pageTypeValues));
                    new AlertDialog.Builder(this).setTitle(C0806fv.change_page_type).setSingleChoiceItems(C0798fn.pageType, listAsList2.indexOf(c0537ceMo1299a.mo1193f().toString()), new DialogInterfaceOnClickListenerC0831gt(this, listAsList2, c0537ceMo1299a)).show();
                    break;
                }
                break;
        }
        m960a("Reader", enumC0860hv.toString(), enumC0861hw.toString(), 0);
    }

    /* renamed from: a */
    static /* synthetic */ void m1558a(ReaderActivity readerActivity, EnumC0860hv enumC0860hv, EnumC0861hw enumC0861hw) {
        readerActivity.m1563a(enumC0860hv, enumC0861hw, (Object) null);
    }

    /* renamed from: q */
    static /* synthetic */ void m1610q(ReaderActivity readerActivity) {
        readerActivity.m1523I();
    }

    /* renamed from: I */
    private void m1523I() {
        ComicRackApplication.f1954i.m1441e().edit().putString("reader_screen_rotation", this.f2079ap.toString()).commit();
        m1583b(false);
        m1534T();
    }

    static void saveSnapshot(ReaderActivity reader) {
        if (Build.VERSION.SDK_INT >= 29) {
            reader.saveSnapshotToGallery();
        } else {
            Intent createImage = new Intent(Intent.ACTION_CREATE_DOCUMENT)
                    .addCategory(Intent.CATEGORY_OPENABLE)
                    .setType("image/jpeg")
                    .putExtra(Intent.EXTRA_TITLE, "snapshot-" + System.currentTimeMillis() + ".jpg");
            reader.startActivityForResult(createImage, CREATE_SNAPSHOT_DOCUMENT);
        }
    }

    private static final int CREATE_SNAPSHOT_DOCUMENT = 1103;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent result) {
        super.onActivityResult(requestCode, resultCode, result);
        if (requestCode == CREATE_SNAPSHOT_DOCUMENT && resultCode == RESULT_OK
                && result != null && result.getData() != null && this.f2095w != null) {
            Bitmap snapshot = this.f2095w.m2500f();
            if (snapshot == null) {
                return;
            }
            try (java.io.OutputStream output = getContentResolver().openOutputStream(result.getData())) {
                if (output != null && snapshot.compress(Bitmap.CompressFormat.JPEG, 90, output)) {
                    m1593e(getString(R.string.snapshot_saved));
                }
            } catch (IOException | RuntimeException exception) {
                android.util.Log.w("ComicRack", "Could not export snapshot", exception);
            } finally {
                snapshot.recycle();
            }
        }
    }

    private void saveSnapshotToGallery() {
        Bitmap snapshot = this.f2095w.m2500f();
        if (snapshot == null) {
            return;
        }
        Uri destination = null;
        boolean saved = false;
        try {
            ContentValues values = new ContentValues();
            values.put(MediaStore.Images.Media.DISPLAY_NAME, "snapshot-" + System.currentTimeMillis() + ".jpg");
            values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
            values.put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/ComicRack SP");
            values.put(MediaStore.Images.Media.IS_PENDING, 1);
            destination = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
            if (destination != null) {
                try (java.io.OutputStream output = getContentResolver().openOutputStream(destination)) {
                    saved = output != null && snapshot.compress(Bitmap.CompressFormat.JPEG, 90, output);
                }
                if (saved) {
                    values.clear();
                    values.put(MediaStore.Images.Media.IS_PENDING, 0);
                    getContentResolver().update(destination, values, null, null);
                    m1593e(getString(C0806fv.snapshot_saved_to_gallery));
                }
            }
        } catch (IOException | RuntimeException exception) {
            saved = false;
            android.util.Log.w("ComicRack", "Could not save snapshot", exception);
        } finally {
            snapshot.recycle();
            if (!saved && destination != null) {
                getContentResolver().delete(destination, null, null);
            }
        }
    }

    /* renamed from: u */
    static /* synthetic */ String m1614u(ReaderActivity readerActivity) {
        return readerActivity.m1524J();
    }

    /* renamed from: J */
    private String m1524J() {
        C0505b c0505bMo1298a = this.f2093u.mo1298a();
        return String.valueOf(c0505bMo1298a.m1171c(false)) + " - " + getString(C0806fv.page_d, new Object[]{Integer.valueOf(c0505bMo1298a.f1574f + 1)});
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1575a(ReaderActivity readerActivity, File file) {
        return readerActivity.m1576a(file);
    }

    /* renamed from: a */
    private boolean m1576a(File file) {
        Bitmap bitmap = this.f2095w.m2500f();
        if (bitmap == null) {
            return false;
        }
        BufferedOutputStream output = null;
        try {
            output = new BufferedOutputStream(new FileOutputStream(file), 10000);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, output);
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } finally {
            bitmap.recycle();
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m1606m(ReaderActivity readerActivity) {
        readerActivity.m1527M();
    }

    /* renamed from: M */
    private void m1527M() {
        this.f2038N.post(new RunnableC0835gx(this));
    }

    /* renamed from: k */
    static /* synthetic */ void m1604k(ReaderActivity readerActivity) {
        readerActivity.m1591d(false);
    }

    /* renamed from: d */
    private void m1591d(boolean z) {
        int i = 300;
        if (z != this.f2062aL) {
            if (z) {
                m1586c(false);
                m1546a(m1518D(), false, true);
                m1519E();
                if (this.f2093u != null && this.f2029E.getTag() == null) {
                    InterfaceC0606h interfaceC0606hM1340j = this.f2093u.m1340j();
                    interfaceC0606hM1340j.mo1298a();
                    m1553a(interfaceC0606hM1340j);
                }
                if (!this.f2057aG || !C0951ag.m2000b()) {
                    i = 0;
                }
                this.f2098z.postDelayed(new RunnableC0836gy(this), i);
            } else {
                m1550a(this.f2098z, false, (Runnable) null);
                m1550a(this.f2025A, false, (Runnable) new RunnableC0839ha(this));
                m1550a(this.f2028D, false, (Runnable) null);
                m1566a(true, 300);
            }
            this.f2062aL = z;
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m1605l(ReaderActivity readerActivity) {
        readerActivity.m1528N();
    }

    /* renamed from: N */
    private void m1528N() {
        m1591d(!this.f2062aL);
    }

    /* renamed from: O */
    private void m1529O() {
        if (this.f2026B.getVisibility() != 0) {
            this.f2026B.setVisibility(0);
        } else {
            this.f2026B.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m1553a(InterfaceC0606h interfaceC0606h) {
        C0586a.m1265a(this.f2029E, interfaceC0606h, -1, 0, C0628f.m1366c().m1914a(C0802fr.page_thumbnail_image_page_error));
    }

    /* renamed from: d */
    private void m1590d(int i) {
        m1593e(getString(i));
    }

    /* renamed from: e */
    private void m1593e(String str) {
        new C1145bl(this, str).m2415a().m2414a(0);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1573a(ReaderActivity readerActivity, int i, C0794fj c0794fj) {
        return readerActivity.m1569a(i, false, c0794fj);
    }

    /* renamed from: a */
    private boolean m1569a(int i, boolean z, C0794fj c0794fj) {
        int iNextInt;
        AbstractC0587aa abstractC0587aaM1543a;
        if (this.f2093u == null) {
            return false;
        }
        int iM1342l = this.f2093u.m1342l();
        if (!z) {
            i = m1592e(i);
        }
        int i2 = this.f2063aM + 1;
        this.f2063aM = i2;
        if (i2 < 10) {
            iNextInt = 0;
        } else {
            iNextInt = ((C0912a.m1913a(this, 0) == 48 && C0912a.m1913a(this, 9) == 3) || (C0912a.m1913a(this, 32) == 5 && C0912a.m1913a(this, 96) == 4)) ? 0 : new Random().nextInt(10) - 5;
        }
        int i3 = iNextInt + i;
        if (i3 < 0 || i3 >= iM1342l) {
            return false;
        }
        c0794fj.f2475f = m1518D();
        c0794fj.f2476g = i3;
        this.f2095w.m2494b();
        if (!c0794fj.f2472c && C0950af.m1992b(this.f2095w.getContentLayout().f3690f, 1.0f, 0.01f)) {
            switch (m1578ab()[c0794fj.f2471b.ordinal()]) {
                case 2:
                    ArrayList arrayList = new ArrayList();
                    m1542a(arrayList, this.f2095w.getContentLayout());
                    this.f2095w.m2492a((C1165t) arrayList.get(arrayList.size() - 1), this.f2069af, 0.5f);
                    break;
                case 3:
                    ArrayList arrayList2 = new ArrayList();
                    m1542a(arrayList2, this.f2095w.getContentLayout());
                    this.f2095w.m2492a((C1165t) arrayList2.get(0), this.f2069af, 0.5f);
                    break;
            }
        }
        if (!m1521G() && !m1522H()) {
            m1520F();
        }
        if (this.f2093u != null) {
            if (this.f2081ar == null || c0794fj.f2476g != this.f2081ar.f2569b) {
                abstractC0587aaM1543a = (this.f2082as == null || c0794fj.f2476g != this.f2082as.f2569b) ? m1543a(c0794fj.f2476g) : this.f2082as.m1853a();
            } else {
                abstractC0587aaM1543a = this.f2081ar.m1853a();
            }
            if (this.f2072ai != EnumC0855hq.None && !(abstractC0587aaM1543a instanceof C0616r)) {
                abstractC0587aaM1543a = m1544a(abstractC0587aaM1543a);
            }
            c0794fj.f2474e = m1634n();
            this.f2095w.m1507a(abstractC0587aaM1543a, c0794fj, new C0823gl(this, c0794fj));
        }
        return true;
    }

    /* renamed from: P */
    private void m1530P() {
        if (this.f2060aJ >= 2000) {
            int i = this.f2060aJ < 5000 ? 20 : 10;
            if (this.f2060aJ != this.f2092t.f2639d && this.f2060aJ % i == 0) {
                this.f2092t.f2639d = this.f2060aJ;
                C1151f c1151fM2397a = this.f2676s.m2397a(this.f2061aK);
                if (c1151fM2397a != null) {
                    c1151fM2397a.f3644e = true;
                    if (c1151fM2397a.f3647h != null) {
                        c1151fM2397a.f3647h.setVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    private C0246c m1531Q() {
        C0246c c0246c = this.f2089n;
        if (!C0628f.f1889k) {
            return null;
        }
        if (c0246c != null && !c0246c.f1106a.m792q()) {
            return null;
        }
        C0246c c0246c2 = new C0246c(this, "ca-app-pub-4781274123938257/5497297649");
        c0246c2.m937a(new C0840hb(this));
        c0246c2.f1106a.m766a(new C0357e());
        this.f2089n = c0246c2;
        return c0246c;
    }

    /* renamed from: a */
    static /* synthetic */ void m1561a(ReaderActivity readerActivity, Runnable runnable) {
        int i = readerActivity.f2060aJ / 25;
        int i2 = 1000;
        if (i > 400) {
            i2 = 1;
        } else if (i > 200) {
            i2 = 2;
        } else if (i > 100) {
            i2 = 5;
        } else if (i > 25) {
            i2 = 10;
        }
        if (i == 0 || i == readerActivity.f2092t.f2640e || i % i2 != 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C0246c c0246cM1531Q = readerActivity.m1531Q();
        if (c0246cM1531Q != null) {
            c0246cM1531Q.m937a(new C0841hc(readerActivity, i, runnable));
            c0246cM1531Q.f1106a.m800y();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    private int m1592e(int i) {
        return m1541a(m1518D(), i);
    }

    /* renamed from: a */
    private int m1541a(int currentPage, int offset) {
        if (this.f2093u == null) {
            return 0;
        }
        int pageCount = this.f2093u.m1342l();
        int candidate = currentPage + offset;
        int step = offset < 0 ? -1 : 1;
        findPage:
        for (; candidate >= 0 && candidate < pageCount; candidate += step) {
            C0622x page = this.f2093u.m1339g(candidate);
            if (this.f2054aD != null) {
                for (EnumC0539cg excludedType : this.f2054aD) {
                    if (page.m1345a(excludedType)) {
                        continue findPage;
                    }
                }
            }
            break;
        }
        return candidate;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1574a(ReaderActivity readerActivity, int i, boolean z) {
        return readerActivity.m1568a(i, z);
    }

    /* renamed from: a */
    private boolean m1568a(int i, boolean z) {
        int iM1518D = m1518D();
        int iM1541a = z ? i : m1541a(iM1518D, i);
        if (iM1541a == iM1518D) {
            return false;
        }
        return m1569a(i, z, new C0794fj(iM1541a > iM1518D ? EnumC0793fi.Forward : EnumC0793fi.Backward, this.f2076am));
    }

    /* renamed from: f */
    private void m1597f(int i) {
        if (this.f2093u != null && this.f2093u.mo1298a() != null) {
            C0505b c0505bMo1298a = this.f2093u.mo1298a();
            ArrayList arrayList = new ArrayList();
            if (c0505bMo1298a != null) {
                arrayList.addAll(c0505bMo1298a.m1163B());
                C0478a.m1109a(arrayList, new C0478a(0, getString(C0806fv.first_page)));
                C0478a.m1109a(arrayList, new C0478a(c0505bMo1298a.f1639X - 1, getString(C0806fv.last_page)));
                C0478a.m1109a(arrayList, new C0478a(c0505bMo1298a.f1575g, getString(C0806fv.last_page_read)));
            }
            int iM1140f = c0505bMo1298a.m1140f();
            if (this.f2093u.m1338f(m1518D()) && i >= 0) {
                iM1140f++;
            }
            int iM1108a = (i < 0 ? C0478a.m1108a(arrayList, iM1140f) : C0478a.m1110b(arrayList, iM1140f)) + i;
            if (iM1108a < 0) {
                m1532R();
                return;
            }
            if (iM1108a >= arrayList.size()) {
                m1533S();
                return;
            }
            C0478a c0478a = (C0478a) arrayList.get(iM1108a);
            if (m1568a(this.f2093u.m1335a(c0478a.f1535a, EnumC0607i.toProvider), true)) {
                m1593e(c0478a.f1536b);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1572a(ReaderActivity readerActivity, int i, int i2) {
        return readerActivity.m1582b(i, i2);
    }

    /* renamed from: b */
    private boolean m1582b(int i, int i2) {
        boolean z;
        InterfaceC0606h interfaceC0606hM1354a;
        if (this.f2091p == null) {
            this.f2091p = new C1009bt();
        }
        C0505b c0505bM1579b = m1579b(i2);
        boolean z2 = c0505bM1579b != null;
        C1009bt c1009bt = this.f2091p;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1009bt.f2973a == 0 || c1009bt.f2973a + c1009bt.f2974b <= jCurrentTimeMillis) {
            c1009bt.f2973a = jCurrentTimeMillis;
            z = false;
        } else {
            c1009bt.f2973a = 0L;
            z = true;
        }
        if (z) {
            if (z2) {
                m1587c(i2);
            } else {
                m1513A();
            }
            return true;
        }
        String string = getString(i);
        if (!z2) {
            m1593e(String.valueOf(string) + "\n" + getString(C0806fv.repeat_to_return_library));
        } else {
            C1145bl c1145bl = new C1145bl(this, String.valueOf(string) + "\n" + getString(i2 > 0 ? C0806fv.repeat_open_next_book_in_list : C0806fv.repeat_open_prev_book_in_list));
            if (c1145bl.m2417b() && (interfaceC0606hM1354a = C0628f.m1354a(c0505bM1579b, false)) != null) {
                FastThumbView fastThumbView = new FastThumbView(this);
                fastThumbView.setShade(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(C0801fq.reader_thumbnail_cover_width), getResources().getDimensionPixelSize(C0801fq.reader_thumbnail_cover_height));
                layoutParams.setMargins(8, 8, 8, 8);
                layoutParams.gravity = 1;
                c1145bl.m2416a(fastThumbView, layoutParams);
                C0586a.m1264a(fastThumbView, c0505bM1579b, true);
                C0505b c0505bMo1298a = interfaceC0606hM1354a.mo1298a();
                if (c0505bMo1298a != null) {
                    TextView textView = new TextView(this);
                    textView.setText(c0505bMo1298a.m1171c(false));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMargins(8, 0, 8, 8);
                    layoutParams2.gravity = 1;
                    c1145bl.m2416a(textView, layoutParams2);
                }
            }
            this.f2090o = c1145bl.m2415a().m2414a(1);
        }
        return false;
    }

    /* renamed from: R */
    private void m1532R() {
        if (!m1568a(-1, false)) {
            m1582b(C0806fv.reached_start_of_book, -1);
        }
    }

    /* renamed from: S */
    private void m1533S() {
        if (!m1568a(1, false)) {
            m1582b(C0806fv.reached_end_of_book, 1);
        }
    }

    /* renamed from: g */
    private boolean m1600g(int i) {
        ArrayList arrayList = new ArrayList();
        C1165t c1165tM1625a = m1625a(arrayList, m1542a(arrayList, this.f2095w.getContentLayout()) + i, i >= 0 ? 1 : -1, m1518D());
        if (c1165tM1625a == null) {
            return false;
        }
        this.f2095w.m2492a(c1165tM1625a, this.f2069af, 0.5f);
        return true;
    }

    /* renamed from: a */
    private int m1542a(List list, C1165t c1165t) {
        return c1165t.m2462a(list, 0.25f, this.f2093u != null && this.f2093u.m1337e(m1518D()), m1634n());
    }

    /* renamed from: a */
    public final List m1626a(C1165t c1165t) {
        ArrayList arrayList = new ArrayList();
        m1542a(arrayList, c1165t);
        return arrayList;
    }

    /* renamed from: a */
    public final C1165t m1625a(List list, int i, int i2, int i3) {
        if (i2 != 0) {
            while (i >= 0 && i < list.size()) {
                C0620v c0620v = this.f2093u;
                C1165t c1165t = (C1165t) list.get(i);
                if (c0620v.m1336a(i3, new RectF(c1165t.m2471e(), c1165t.m2472f(), c1165t.m2480n(), c1165t.m2479m()))) {
                    break;
                }
                i += i2 >= 0 ? 1 : -1;
            }
        }
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (C1165t) list.get(i);
    }

    /* renamed from: z */
    static /* synthetic */ void m1623z(ReaderActivity readerActivity) {
        readerActivity.m1566a(false, 0);
    }

    /* renamed from: a */
    private void m1566a(boolean z, int i) {
        C0842hd c0842hd = new C0842hd(this, z ? 128 : 0, z ? 0 : 128);
        c0842hd.setDuration(300L);
        c0842hd.setStartOffset(i);
        this.f2095w.startAnimation(c0842hd);
    }

    /* renamed from: a */
    static /* synthetic */ void m1556a(ReaderActivity readerActivity, View view) {
        readerActivity.m1550a(view, true, (Runnable) null);
    }

    /* renamed from: a */
    private void m1550a(View view, boolean z, Runnable runnable) {
        TranslateAnimation translateAnimation;
        if (view == this.f2098z) {
            if (z) {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, -view.getHeight(), 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -view.getHeight());
                translateAnimation.setStartOffset(300L);
            }
        } else if (view == this.f2025A) {
            if (z) {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getHeight(), 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, view.getHeight());
                translateAnimation.setStartOffset(300L);
            }
        } else if (view == this.f2028D) {
            if (z) {
                translateAnimation = new TranslateAnimation(-view.getWidth(), 0.0f, 0.0f, 0.0f);
                translateAnimation.setStartOffset(300L);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, -view.getWidth(), 0.0f, 0.0f);
            }
        } else {
            return;
        }
        translateAnimation.setDuration(300L);
        if (z) {
            view.setVisibility(0);
            translateAnimation.setAnimationListener(new AnimationAnimationListenerC0843he(this, view, runnable));
        } else {
            translateAnimation.setAnimationListener(new AnimationAnimationListenerC0844hf(this, view, runnable));
        }
        view.startAnimation(translateAnimation);
    }

    /* renamed from: e */
    private void m1594e(boolean z) {
        if (this.f2081ar != null) {
            if (z) {
                this.f2081ar.m1854b();
            }
            this.f2081ar = null;
        }
    }

    /* renamed from: f */
    private void m1598f(boolean z) {
        if (this.f2082as != null) {
            if (z) {
                this.f2082as.m1854b();
            }
            this.f2082as = null;
        }
    }

    @Override // com.cyo.common.view.InterfaceC1163r
    /* renamed from: a */
    public final void mo1508a(ContentAnimation abstractC1159n) {
        if (this.f2093u != null && this.f2093u.m1340j() != null && this.f2095w.getPageBitmap() != null) {
            if (abstractC1159n instanceof PageTransitionAnimation) {
                PageTransitionAnimation c0795fk = (PageTransitionAnimation) abstractC1159n;
                C0794fj c0794fj = c0795fk.f2481a;
                if (!c0795fk.f3664n) {
                    if (c0794fj.f2476g != c0794fj.f2475f) {
                        this.f2060aJ++;
                    }
                    int i = c0794fj.f2476g;
                    this.f2071ah = i;
                    if (this.f2093u != null) {
                        C0505b c0505bMo1298a = this.f2093u.mo1298a();
                        C0622x c0622xM1339g = this.f2093u.m1339g(i);
                        c0505bMo1298a.m1129b(c0622xM1339g.m1346b());
                        if (c0622xM1339g.m1347c() > c0505bMo1298a.m1141g()) {
                            c0505bMo1298a.m1135c(c0622xM1339g.m1347c());
                        }
                    }
                    m961c("Page" + (c0794fj.f2476g + 1));
                    m1546a(c0794fj.f2476g, true, false);
                    C0505b c0505bMo1298a2 = this.f2093u.mo1298a();
                    this.f2030F.setPercent1(C0505b.m1112a(c0505bMo1298a2.m1140f(), c0505bMo1298a2.m1139e()));
                    this.f2030F.setPercent2(C0505b.m1112a(c0505bMo1298a2.m1141g(), c0505bMo1298a2.m1139e()));
                    C0505b c0505bMo1298a3 = this.f2093u.mo1298a();
                    if (this.f2075al) {
                        this.f2050Z.setText(getString(C0806fv.page_d_of_d, new Object[]{Integer.valueOf(c0505bMo1298a3.f1574f + 1), Integer.valueOf(c0505bMo1298a3.m1139e())}));
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setStartOffset(2000L);
                        alphaAnimation.setDuration(250L);
                        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC0845hg(this));
                        if (this.f2050Z.getVisibility() != 0 || this.f2050Z.getTag() == null) {
                            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation2.setDuration(250L);
                            alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC0846hh(this, alphaAnimation));
                            this.f2050Z.startAnimation(alphaAnimation2);
                        } else {
                            this.f2050Z.startAnimation(alphaAnimation);
                        }
                    }
                    m1530P();
                    if (c0795fk.f2481a.f2479j && c0795fk.f2484d != null) {
                        c0795fk.f2484d.m1279h();
                        c0795fk.f2484d = null;
                    }
                    m1552a(c0795fk.f2484d, c0794fj.f2475f);
                }
            }
            if (abstractC1159n == null) {
                m1534T();
            }
        }
    }

    /* renamed from: a */
    private void m1546a(int i, boolean z, boolean z2) {
        if (z2 || (this.f2027C.isShown() && !this.f2055aE)) {
            if (m1634n()) {
                i = (this.f2093u.m1342l() - 1) - i;
            }
            this.f2027C.setSelection(i, z);
        }
    }

    /* renamed from: a */
    private void m1552a(AbstractC0587aa abstractC0587aa, int i) {
        if (m1522H()) {
            int i2 = this.f2081ar == null ? -1 : this.f2081ar.f2569b;
            int iM1592e = m1592e(1);
            if (i2 != iM1592e) {
                m1594e((this.f2081ar == null || this.f2095w.getPageBitmap() == this.f2081ar.m1853a()) ? false : true);
                if (abstractC0587aa != null && i == iM1592e) {
                    this.f2081ar = new C0853ho(this, abstractC0587aa, i);
                    abstractC0587aa = null;
                } else if (iM1592e >= 0 && iM1592e < this.f2093u.m1342l()) {
                    this.f2081ar = new C0853ho(this, this.f2093u, iM1592e);
                }
            }
        }
        if (m1521G()) {
            int i3 = this.f2082as == null ? -1 : this.f2082as.f2569b;
            int iM1592e2 = m1592e(-1);
            if (i3 != iM1592e2) {
                m1598f((this.f2082as == null || this.f2095w.getPageBitmap() == this.f2082as.m1853a()) ? false : true);
                if (abstractC0587aa != null && i == iM1592e2) {
                    this.f2082as = new C0853ho(this, abstractC0587aa, i);
                    abstractC0587aa = null;
                } else if (iM1592e2 >= 0 && iM1592e2 < this.f2093u.m1342l()) {
                    this.f2082as = new C0853ho(this, this.f2093u, iM1592e2);
                }
            }
        }
        if (abstractC0587aa != null) {
            abstractC0587aa.m1279h();
        }
    }

    /* renamed from: T */
    private void m1534T() {
        boolean z = !C0951ag.m2006e();
        int i = z ? 0 : 6;
        int i2 = z ? 1 : 7;
        switch (m1577aa()[this.f2079ap.ordinal()]) {
            case 2:
                setRequestedOrientation(i2);
                break;
            case 3:
                setRequestedOrientation(i);
                break;
            case 4:
                AbstractC0587aa pageBitmap = this.f2095w.getPageBitmap();
                if (pageBitmap != null && pageBitmap.m1278g() && !pageBitmap.mo1276e()) {
                    setRequestedOrientation(i);
                    break;
                } else {
                    setRequestedOrientation(i2);
                    break;
                }
            default:
                setRequestedOrientation(2);
                break;
        }
    }

    @Override // com.cyo.common.view.InterfaceC1111ae
    /* renamed from: o */
    public final void mo1635o() {
        m1586c(this.f2057aG && !this.f2062aL);
    }
}
