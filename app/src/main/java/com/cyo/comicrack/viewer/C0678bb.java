package com.cyo.comicrack.viewer;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0582ar;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.common.AbstractC0949ae;
import com.cyo.common.C0950af;
import com.cyo.common.C0998bi;
import com.cyo.common.view.FastThumbView;
import com.cyo.common.view.ProgressView;
import com.cyo.common.view.SimpleRatingBar;
import java.io.File;
import twitter4j.HttpResponseCode;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.bb */
/* loaded from: classes.dex */
public class C0678bb extends AbstractC0949ae {

    /* renamed from: c */
    private int f2184c;

    /* renamed from: d */
    private C0582ar f2185d;

    public C0678bb(Context context, C0575ak c0575ak, int i) {
        super(context, c0575ak);
        this.f2184c = i;
        this.f2185d = new C0582ar(c0575ak.m1247w());
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int iY;
        if (view == null) {
            view = LayoutInflater.from(this.f2839a).inflate(this.f2184c, viewGroup, false);
        }
        FastThumbView fastThumbView = (FastThumbView) view.findViewById(C0803fs.comicListThumbnailImage);
        TextView textView = (TextView) view.findViewById(C0803fs.comicListThumbnailCaption);
        TextView textView2 = (TextView) view.findViewById(C0803fs.comicListThumbnailDescription);
        TextView textView3 = (TextView) view.findViewById(C0803fs.comicListThumbnailSummary);
        ProgressView progressView = (ProgressView) view.findViewById(C0803fs.comicListCurrentProgress);
        SimpleRatingBar simpleRatingBar = (SimpleRatingBar) view.findViewById(C0803fs.comicListRating);
        InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) getItem(i);
        C0572ah c0572ah = null;
        fastThumbView.setShade(true);
        fastThumbView.setStackMarker(0);
        fastThumbView.setSplitDoublePages(true);
        if (interfaceC0571ag instanceof C0572ah) {
            c0572ah = (C0572ah) interfaceC0571ag;
            C0505b c0505bM1221j = c0572ah.m1221j();
            if (textView3 != null) {
                textView.setText(c0505bM1221j.m1168a(false, this.f2185d.m1256a(c0505bM1221j)));
                textView2.setText(String.valueOf(C0998bi.m2081a(c0505bM1221j.f1656w) ? "" : String.valueOf(c0505bM1221j.f1656w) + "\n") + c0505bM1221j.m1177v());
                if (!C0998bi.m2081a(c0505bM1221j.f1622G)) {
                    textView3.setText(C0998bi.m2086c(c0505bM1221j.f1622G));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f2839a.getString(C0806fv.folder)).append(": ").append(c0505bM1221j.m1147m()).append('\n').append('\n');
                    sb.append(this.f2839a.getString(C0806fv.pages)).append(": ").append(this.f2839a.getString(C0806fv.d_pages_d_read, Integer.valueOf(c0505bM1221j.m1139e()), Integer.valueOf(c0505bM1221j.m1142h()))).append('\n');
                    sb.append(this.f2839a.getString(C0806fv.added)).append(": ").append(c0505bM1221j.m1145k().format("%c")).append('\n');
                    File file = new File(c0505bM1221j.f1655v);
                    if (file.exists()) {
                        sb.append('\n').append(this.f2839a.getString(C0806fv.file)).append(":\n").append(String.valueOf(c0505bM1221j.f1655v) + " (" + C0998bi.m2077a(file.length()) + ")");
                    }
                    textView3.setText(sb.toString());
                }
            } else {
                textView.setText(c0572ah.m1216a(this.f2185d.m1256a(c0505bM1221j)));
                textView2.setText(interfaceC0571ag.mo1212g());
                if (c0572ah != null && (iY = c0572ah.m1987y()) > 1) {
                    fastThumbView.setStackMarker(C0950af.m1990a(iY, 0, 4));
                }
            }
        }
        if (progressView != null) {
            Resources resources = view.getResources();
            progressView.setPercent1(0);
            progressView.setPercent2(0);
            progressView.setColor1(resources.getColor(C0800fp.read_current));
            progressView.setColor2(resources.getColor(C0800fp.read_maximum));
            if (c0572ah != null) {
                progressView.setPercent1(c0572ah.m1224m());
                progressView.setPercent2(c0572ah.m1225n());
            }
        }
        if (simpleRatingBar != null) {
            Resources resources2 = view.getResources();
            simpleRatingBar.setFullIndicator(resources2.getDrawable(C0802fr.rating_star_full));
            simpleRatingBar.setFullIndicatorAlpha(HttpResponseCode.OK);
            simpleRatingBar.setEmptyIndicator(resources2.getDrawable(C0802fr.rating_star_empty));
            simpleRatingBar.setEmptyIndicatorAlpha(150);
            simpleRatingBar.setMaxRating(5);
            simpleRatingBar.setRating(0.0f);
            if (c0572ah != null) {
                simpleRatingBar.setRating(c0572ah.m1230s());
            }
        }
        if (fastThumbView != null) {
            interfaceC0571ag.mo1219a(fastThumbView, 0, C0628f.m1366c().m1914a(C0802fr.page_thumbnail_image_file_error));
        }
        return view;
    }
}
