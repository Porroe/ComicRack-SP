package com.cyo.comicrack.viewer;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0072h;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.C0950af;
import com.cyo.common.C0951ag;
import com.cyo.common.C0998bi;
import com.cyo.common.EnumC0993bd;
import com.cyo.common.view.C1154i;
import com.p004a.p012b.p013a.p014a.p015a.C0413b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.u */
/* loaded from: classes.dex */
public final class C0906u extends DialogInterfaceOnCancelListenerC0072h {

    /* renamed from: aj */
    protected static final String f2729aj = null;

    /* renamed from: ak */
    protected static final String f2730ak = null;

    /* renamed from: al */
    private static String f2731al = "Comic Details";

    /* renamed from: am */
    private static String f2732am = "Edit";

    /* renamed from: an */
    private static String f2733an = "Next";

    /* renamed from: ao */
    private static String f2734ao = "Previous";

    /* renamed from: ap */
    private C0505b f2736ap;

    /* renamed from: aq */
    private C0575ak f2737aq;

    /* renamed from: ar */
    private View f2738ar;

    /* renamed from: as */
    private View f2739as;

    /* renamed from: at */
    private View f2740at;

    /* renamed from: au */
    private View f2741au;

    /* renamed from: av */
    private View f2742av;

    /* renamed from: aw */
    private RatingBar f2743aw;

    /* renamed from: ax */
    private boolean f2744ax;

    /* renamed from: ay */
    private Runnable f2745ay;

    /* renamed from: az */
    private List f2746az = new ArrayList();

    /* renamed from: aA */
    private int f2735aA = 0;

    /* renamed from: P */
    static /* synthetic */ String m1896P() {
        return f2732am;
    }

    /* renamed from: R */
    static /* synthetic */ String m1898R() {
        return f2733an;
    }

    /* renamed from: Q */
    static /* synthetic */ String m1897Q() {
        return f2734ao;
    }

    /* renamed from: a */
    static /* synthetic */ C0505b m1900a(C0906u c0906u) {
        return c0906u.f2736ap;
    }

    /* renamed from: a */
    static /* synthetic */ void m1906a(String str) {
        C0413b.m944a().m949a(f2731al, str, null, 0);
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0072h, android.support.v4.app.Fragment
    /* renamed from: a */
    public final void mo30a(Bundle bundle) {
        super.mo30a(bundle);
        m60o();
        if (!ComicRackApplication.f1954i.m1440d()) {
            m173a();
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: a */
    public final View mo25a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C0804ft.comic_details_fragment, viewGroup, false);
        this.f2738ar = viewInflate.findViewById(C0803fs.comicDetailsPreviousComic);
        this.f2739as = viewInflate.findViewById(C0803fs.comicDetailsNextComic);
        this.f2740at = viewInflate.findViewById(C0803fs.comicDetailsEdit);
        this.f2742av = viewInflate.findViewById(C0803fs.comicDetailsEditOk);
        this.f2741au = viewInflate.findViewById(C0803fs.comicDetailsEditCancel);
        this.f2743aw = (RatingBar) viewInflate.findViewById(C0803fs.comicDetailsRating);
        this.f2740at.setOnClickListener(new ViewOnClickListenerC0907v(this));
        this.f2742av.setOnClickListener(new ViewOnClickListenerC0656ag(this));
        this.f2741au.setOnClickListener(new ViewOnClickListenerC0666aq(this));
        this.f2738ar.setOnClickListener(new ViewOnClickListenerC0667ar(this));
        this.f2739as.setOnClickListener(new ViewOnClickListenerC0668as(this));
        this.f2743aw.setOnRatingBarChangeListener(new C0669at(this));
        m1899S();
        if (C0951ag.m1997a(viewInflate.getContext(), EnumC0993bd.Large)) {
            ViewGroup.LayoutParams layoutParams = viewInflate.findViewById(C0803fs.comicDetailsContainer).getLayoutParams();
            EnumC0993bd enumC0993bd = EnumC0993bd.Large;
            Context context = viewInflate.getContext();
            int i = (C0951ag.m1997a(context, enumC0993bd) && C0951ag.m2002c(context)) ? (int) (C0951ag.m1999b(context).heightPixels * 0.6f) : -1;
            if (i > 0) {
                layoutParams.height = Math.min(layoutParams.height, i);
            }
        }
        return viewInflate;
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0072h, android.support.v4.app.Fragment
    /* renamed from: d */
    public final void mo44d() {
        super.mo44d();
        m1909a(this.f2736ap, this.f2737aq);
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0072h
    /* renamed from: c */
    public final Dialog mo176c(Bundle bundle) {
        Dialog dialogMo176c = super.mo176c(bundle);
        dialogMo176c.setCanceledOnTouchOutside(true);
        return dialogMo176c;
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0072h, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m1911a(true, false);
        if (this.f2745ay != null) {
            this.f2745ay.run();
        }
    }

    /* renamed from: O */
    public final void m1908O() {
        this.f2744ax = true;
        m1909a(this.f2736ap, this.f2737aq);
    }

    /* renamed from: a */
    public final void m1911a(boolean z, boolean z2) {
        if (this.f2744ax) {
            if (z) {
                C0505b c0505b = this.f2736ap;
                C0635m c0635mM1438c = ComicRackApplication.f1954i.m1438c();
                if (c0635mM1438c != null && c0505b != null) {
                    for (Object entry : this.f2746az) {
                        C0673ax c0673ax = (C0673ax) entry;
                        int i = c0673ax.f2173b;
                        String strTrim = c0673ax.f2174c.getEditableText().toString().trim();
                        if (!C0998bi.m2082a(c0673ax.f2172a, strTrim)) {
                            c0505b.f1588t = true;
                            if (i == C0803fs.editComicSeries) {
                                c0505b.f1657x = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1921b);
                            } else if (i == C0803fs.editComicTitle) {
                                c0505b.f1656w = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicNumber) {
                                c0505b.f1658y = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicCount) {
                                c0505b.f1659z = Math.max(-1, C0950af.m1991a(strTrim, -1));
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicMonth) {
                                c0505b.f1626K = C0950af.m1990a(C0950af.m1991a(strTrim, -1), -1, 12);
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicDay) {
                                c0505b.f1627L = C0950af.m1990a(C0950af.m1991a(strTrim, -1), -1, 12);
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicYear) {
                                c0505b.f1625J = C0950af.m1990a(C0950af.m1991a(strTrim, -1), -1, 5000);
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicAlternate) {
                                c0505b.f1617B = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1922c);
                            } else if (i == C0806fv.alternate_number) {
                                c0505b.f1618C = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicAlternateCount) {
                                c0505b.f1621F = Math.max(-1, C0950af.m1991a(strTrim, -1));
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicStoryArc) {
                                c0505b.f1620E = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicStoryGroup) {
                                c0505b.f1619D = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicVolume) {
                                c0505b.f1616A = C0950af.m1991a(strTrim, -1);
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1921b);
                            } else if (i == C0803fs.editComicFormat) {
                                c0505b.f1641Z = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicPublisher) {
                                c0505b.f1635T = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1927h);
                            } else if (i == C0803fs.editComicImprint) {
                                c0505b.f1636U = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1927h);
                            } else if (i == C0803fs.editComicAgeRating) {
                                c0505b.f1643aa = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicGenre) {
                                c0505b.f1637V = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1926g);
                            } else if (i == C0803fs.editComicWriter) {
                                c0505b.f1628M = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1924e);
                                c0635mM1438c.m1395a(C0635m.f1925f);
                            } else if (i == C0803fs.editComicPenciller) {
                                c0505b.f1629N = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1925f);
                            } else if (i == C0803fs.editComicInker) {
                                c0505b.f1630O = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1925f);
                            } else if (i == C0803fs.editComicColorist) {
                                c0505b.f1631P = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1925f);
                            } else if (i == C0803fs.editComicLetterer) {
                                c0505b.f1632Q = strTrim;
                                c0505b.f1582n = true;
                                c0635mM1438c.m1395a(C0635m.f1925f);
                            } else if (i == C0803fs.editComicCoverArtist) {
                                c0505b.f1633R = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicEditor) {
                                c0505b.f1634S = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicMainCharacterOrTeam) {
                                c0505b.f1649ag = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicCharacters) {
                                c0505b.f1647ae = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicTeams) {
                                c0505b.f1648af = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicLocations) {
                                c0505b.f1650ah = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicSummary) {
                                c0505b.f1622G = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicNotes) {
                                c0505b.f1623H = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicReview) {
                                c0505b.f1624I = strTrim;
                                c0505b.f1581m = true;
                            } else if (i == C0803fs.editComicScanInformation) {
                                c0505b.f1652aj = strTrim;
                                c0505b.f1582n = true;
                            } else if (i == C0803fs.editComicWeb) {
                                c0505b.f1638W = strTrim;
                                c0505b.f1582n = true;
                            }
                        }
                    }
                    C0628f.m1364b(C0628f.m1354a(this.f2736ap, false));
                }
            }
            this.f2744ax = false;
            if (z2) {
                m1909a(this.f2736ap, this.f2737aq);
            }
        }
    }

    /* renamed from: a */
    public final void m1909a(C0505b c0505b, C0575ak c0575ak) {
        if (c0505b != null) {
            this.f2746az.clear();
            this.f2736ap = c0505b;
            this.f2737aq = c0575ak;
            m1899S();
            if (m62t() != null) {
                View viewT = m62t();
                boolean z = this.f2744ax;
                ImageView imageView = (ImageView) viewT.findViewById(C0803fs.comicDetailsImage);
                TextView textView = (TextView) viewT.findViewById(C0803fs.comicDetailsCaption);
                TextView textView2 = (TextView) viewT.findViewById(C0803fs.comicDetailsTitle);
                RatingBar ratingBar = (RatingBar) viewT.findViewById(C0803fs.comicDetailsRating);
                textView.setText(c0505b.m1171c(false));
                textView2.setText(c0505b.f1656w);
                ratingBar.setRating(c0505b.f1576h);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                viewT.post(new RunnableC0664ao(this, imageView, c0505b));
                LinearLayout linearLayout = (LinearLayout) viewT.findViewById(C0803fs.comicDetailsContainer);
                linearLayout.removeAllViews();
                if (z) {
                    View viewInflate = View.inflate(linearLayout.getContext(), C0804ft.comic_edit_details, linearLayout);
                    m1902a(viewInflate, C0803fs.editComicSeries, c0505b.f1657x, new C0670au(this, c0505b));
                    m1901a(viewInflate, C0803fs.editComicTitle, c0505b.f1656w);
                    m1901a(viewInflate, C0803fs.editComicNumber, c0505b.f1658y);
                    m1901a(viewInflate, C0803fs.editComicCount, m1907c(c0505b.f1659z));
                    m1901a(viewInflate, C0803fs.editComicMonth, m1907c(c0505b.f1626K));
                    m1901a(viewInflate, C0803fs.editComicDay, m1907c(c0505b.f1627L));
                    m1901a(viewInflate, C0803fs.editComicYear, m1907c(c0505b.f1625J));
                    m1902a(viewInflate, C0803fs.editComicAlternate, c0505b.f1617B, new C0671av(this));
                    m1901a(viewInflate, C0803fs.editComicAlternateNumber, c0505b.f1618C);
                    m1901a(viewInflate, C0803fs.editComicAlternateCount, m1907c(c0505b.f1621F));
                    m1902a(viewInflate, C0803fs.editComicStoryArc, c0505b.f1620E, new C0672aw(this));
                    m1902a(viewInflate, C0803fs.editComicStoryGroup, c0505b.f1619D, new C0908w(this));
                    m1901a(viewInflate, C0803fs.editComicVolume, m1907c(c0505b.f1616A));
                    m1902a(viewInflate, C0803fs.editComicFormat, c0505b.f1641Z, new C0909x(this));
                    m1902a(viewInflate, C0803fs.editComicPublisher, c0505b.f1635T, new C0910y(this));
                    m1902a(viewInflate, C0803fs.editComicImprint, c0505b.f1636U, new C0911z(this));
                    m1902a(viewInflate, C0803fs.editComicAgeRating, c0505b.f1643aa, new C0650aa(this));
                    m1902a(viewInflate, C0803fs.editComicGenre, c0505b.f1637V, new C0651ab(this));
                    m1902a(viewInflate, C0803fs.editComicWriter, c0505b.f1628M, new C0652ac(this));
                    m1902a(viewInflate, C0803fs.editComicPenciller, c0505b.f1629N, new C0653ad(this));
                    m1902a(viewInflate, C0803fs.editComicInker, c0505b.f1630O, new C0654ae(this));
                    m1902a(viewInflate, C0803fs.editComicColorist, c0505b.f1631P, new C0655af(this));
                    m1902a(viewInflate, C0803fs.editComicLetterer, c0505b.f1632Q, new C0657ah(this));
                    m1902a(viewInflate, C0803fs.editComicCoverArtist, c0505b.f1633R, new C0658ai(this));
                    m1902a(viewInflate, C0803fs.editComicEditor, c0505b.f1634S, new C0659aj(this));
                    m1902a(viewInflate, C0803fs.editComicMainCharacterOrTeam, c0505b.f1649ag, new C0660ak(this));
                    m1902a(viewInflate, C0803fs.editComicCharacters, c0505b.f1647ae, new C0661al(this));
                    m1902a(viewInflate, C0803fs.editComicTeams, c0505b.f1648af, new C0662am(this));
                    m1902a(viewInflate, C0803fs.editComicLocations, c0505b.f1650ah, new C0663an(this));
                    m1901a(viewInflate, C0803fs.editComicSummary, c0505b.f1622G);
                    m1901a(viewInflate, C0803fs.editComicNotes, c0505b.f1623H);
                    m1901a(viewInflate, C0803fs.editComicReview, c0505b.f1624I);
                    m1901a(viewInflate, C0803fs.editComicScanInformation, c0505b.f1652aj);
                    m1901a(viewInflate, C0803fs.editComicWeb, c0505b.f1638W);
                    return;
                }
                ScrollView scrollView = new ScrollView(linearLayout.getContext());
                linearLayout.addView(scrollView, -1, -2);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2, -1, -2);
                TextView textView3 = new TextView(linearLayout.getContext());
                textView3.setText(c0505b.f1622G);
                C0951ag.m1995a().mo2032a(textView3);
                linearLayout2.addView(textView3);
                TableLayout tableLayout = new TableLayout(linearLayout.getContext());
                linearLayout2.addView(tableLayout);
                this.f2735aA = 10;
                m1905a(tableLayout, m55i().getString(C0806fv.series), c0505b.m1171c(false), "Caption", c0505b.f1657x, c0505b.m1178w());
                m1903a(tableLayout, C0806fv.series_title, c0505b.f1656w);
                m1905a(tableLayout, m55i().getString(C0806fv.alternate), c0505b.m1175t(), "AlternateSeries", c0505b.f1617B, null);
                m1903a(tableLayout, C0806fv.story_arc, c0505b.f1620E);
                m1903a(tableLayout, C0806fv.series_group, c0505b.f1619D);
                this.f2735aA = 10;
                m1903a(tableLayout, C0806fv.volume, c0505b.m1179x());
                m1903a(tableLayout, C0806fv.pages, m26a(C0806fv.d_pages_d_read, Integer.valueOf(c0505b.m1139e()), Integer.valueOf(c0505b.m1142h())));
                m1903a(tableLayout, C0806fv.added, c0505b.m1145k().format("%c"));
                this.f2735aA = 10;
                m1903a(tableLayout, C0806fv.format, c0505b.f1641Z);
                m1904a(tableLayout, C0806fv.publisher, c0505b.f1635T, "Publisher");
                m1903a(tableLayout, C0806fv.imprint, c0505b.f1636U);
                m1903a(tableLayout, C0806fv.age_rating, c0505b.f1643aa);
                m1904a(tableLayout, C0806fv.genre, c0505b.f1637V, "Genre");
                this.f2735aA = 10;
                m1904a(tableLayout, C0806fv.writer, c0505b.f1628M, "Writer");
                m1904a(tableLayout, C0806fv.penciller, c0505b.f1629N, "Artists");
                m1904a(tableLayout, C0806fv.inker, c0505b.f1630O, "Artists");
                m1904a(tableLayout, C0806fv.colorist, c0505b.f1631P, "Artists");
                m1904a(tableLayout, C0806fv.letterer, c0505b.f1632Q, "Artists");
                m1904a(tableLayout, C0806fv.cover_artist, c0505b.f1633R, "Artists");
                m1903a(tableLayout, C0806fv.editor, c0505b.f1634S);
                this.f2735aA = 10;
                m1903a(tableLayout, C0806fv.main_character_or_team, c0505b.f1649ag);
                m1903a(tableLayout, C0806fv.characters, c0505b.f1647ae);
                m1903a(tableLayout, C0806fv.teams, c0505b.f1648af);
                m1903a(tableLayout, C0806fv.locations, c0505b.f1650ah);
                this.f2735aA = 10;
                m1903a(tableLayout, C0806fv.notes, c0505b.f1623H);
                m1903a(tableLayout, C0806fv.review, c0505b.f1624I);
                this.f2735aA = 10;
                m1904a(tableLayout, C0806fv.scan_information, c0505b.f1652aj, "ScanInformation");
                m1903a(tableLayout, C0806fv.web, c0505b.f1638W);
                File file = new File(c0505b.f1655v);
                if (file.exists()) {
                    m1903a(tableLayout, C0806fv.file, String.valueOf(c0505b.f1655v) + " (" + C0998bi.m2077a(file.length()) + ")");
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1912b(int i) {
        int iM1377a;
        int i2;
        if (this.f2736ap != null && this.f2737aq != null && this.f2737aq.m1981a(C0572ah.class) && (iM1377a = C0635m.m1377a(this.f2737aq, this.f2736ap.f1570b)) != -1 && (i2 = iM1377a + i) >= 0 && i2 < this.f2737aq.m1987y()) {
            m1909a(((C0572ah) this.f2737aq.m1986x().get(i2)).m1221j(), this.f2737aq);
        }
    }

    /* renamed from: S */
    private void m1899S() {
        if (this.f2740at != null) {
            int i = (this.f2736ap.f1584p || this.f2744ax) ? 8 : 0;
            int i2 = (this.f2744ax || this.f2737aq == null || this.f2737aq.m1987y() <= 1) ? 8 : 0;
            int i3 = this.f2744ax ? 0 : 8;
            this.f2739as.setVisibility(i2);
            this.f2738ar.setVisibility(i2);
            this.f2740at.setVisibility(i);
            this.f2742av.setVisibility(i3);
            this.f2741au.setVisibility(i3);
        }
    }

    /* renamed from: a */
    private void m1902a(View view, int i, String str, InterfaceC0677ba interfaceC0677ba) {
        EditText editText = (EditText) view.findViewById(i);
        if (editText != null) {
            editText.setText(str);
            C0673ax c0673ax = new C0673ax((byte) 0);
            c0673ax.f2172a = str;
            c0673ax.f2174c = editText;
            c0673ax.f2173b = i;
            this.f2746az.add(c0673ax);
            if (interfaceC0677ba != null && (editText instanceof AutoCompleteTextView)) {
                boolean z = editText instanceof MultiAutoCompleteTextView;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (z) {
                    ((MultiAutoCompleteTextView) editText).setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
                }
                autoCompleteTextView.setAdapter(new C0674ay(editText.getContext(), ComicRackApplication.f1954i.m1438c(), interfaceC0677ba, z));
                autoCompleteTextView.setThreshold(1);
            }
        }
    }

    /* renamed from: a */
    private void m1901a(View view, int i, String str) {
        m1902a(view, i, str, (InterfaceC0677ba) null);
    }

    /* renamed from: a */
    private void m1904a(TableLayout tableLayout, int i, String str, String str2) {
        m1905a(tableLayout, m55i().getString(i), str, str2, null, null);
    }

    /* renamed from: a */
    private void m1903a(TableLayout tableLayout, int i, String str) {
        m1905a(tableLayout, m55i().getString(i), str, null, null, null);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private void m1905a(TableLayout tableLayout, String str, String str2, String str3, String str4, String str5) {
        if (!C0998bi.m2081a(str2)) {
            if (this.f2735aA > 0) {
                int i = this.f2735aA;
                TableRow tableRow = new TableRow(tableLayout.getContext());
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
                layoutParams.height = i;
                tableRow.addView(new View(tableLayout.getContext()), layoutParams);
                tableLayout.addView(tableRow, -1, -2);
                this.f2735aA = 0;
            }
            TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams();
            layoutParams2.rightMargin = 8;
            TableRow tableRow2 = new TableRow(tableLayout.getContext());
            TextView textView = new TextView(tableLayout.getContext());
            textView.setText(String.valueOf(str) + ":");
            textView.setTypeface(Typeface.defaultFromStyle(1));
            tableRow2.addView(textView, layoutParams2);
            TextView textView2 = new TextView(tableLayout.getContext());
            textView2.setText(str2);
            C0951ag.m1995a().mo2032a(textView2);
            if (str3 == null) {
                Linkify.addLinks(textView2, 1);
            } else {
                C1154i.m2422a(textView2, Pattern.compile(str4 == null ? "[^,]*" : Pattern.quote(str4)), new C0665ap(this, str3, str5));
            }
            tableRow2.addView(textView2, 0, -2);
            tableLayout.addView(tableRow2, -1, -2);
            tableLayout.setColumnStretchable(1, true);
        }
    }

    /* renamed from: c */
    private static String m1907c(int i) {
        if (i <= 0) {
            return null;
        }
        try {
            return Integer.valueOf(i).toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public final void m1910a(Runnable runnable) {
        this.f2745ay = runnable;
    }
}
