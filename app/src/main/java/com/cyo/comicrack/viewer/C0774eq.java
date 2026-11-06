package com.cyo.comicrack.viewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.InterfaceC0571ag;
import com.cyo.comicrack.p019a.InterfaceC0584at;
import com.cyo.common.AbstractC0949ae;
import com.cyo.common.C1097n;
import com.cyo.common.InterfaceC1093j;
import com.cyo.common.view.FastThumbView;
import java.util.List;
import java.util.Random;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.eq */
/* loaded from: classes.dex */
public final class C0774eq extends AbstractC0949ae {

    private final Context materialTheme;

    /* renamed from: c */
    private boolean f2416c;

    public C0774eq(Context context, C0575ak c0575ak) {
        super(context, c0575ak);
        materialTheme = LibraryInterface.isMaterial(context) ? LibraryInterface.theme(context) : null;
        this.f2416c = true;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f2839a).inflate(C0804ft.library_list_thumbnail, (ViewGroup) null);
            if (materialTheme != null) {
                LibraryInterface.styleTile(view, materialTheme, C0803fs.libraryListThumbnailCaption,
                        C0803fs.libraryListThumbnailDescription);
            }
        }
        InterfaceC0571ag interfaceC0571ag = (InterfaceC0571ag) getItem(i);
        C0775er c0775er = (C0775er) view.getTag();
        if (c0775er == null) {
            c0775er = new C0775er(this, (byte) 0);
            view.setTag(c0775er);
            ComicRackApplication.f1954i.m1438c().m1397a((InterfaceC1093j) c0775er);
        }
        c0775er.f2417a = interfaceC0571ag;
        TextView textView = (TextView) view.findViewById(C0803fs.libraryListThumbnailCaption);
        TextView textView2 = (TextView) view.findViewById(C0803fs.libraryListThumbnailDescription);
        if (interfaceC0571ag instanceof InterfaceC0584at) {
            ((InterfaceC0584at) interfaceC0571ag).mo1252j();
        }
        textView.setText(interfaceC0571ag.mo1211f());
        textView2.setText(interfaceC0571ag.mo1212g());
        if (this.f2416c && (interfaceC0571ag instanceof C0575ak)) {
            C0575ak c0575ak = (C0575ak) interfaceC0571ag;
            View[] viewArr = {view.findViewById(C0803fs.libraryListThumb1), view.findViewById(C0803fs.libraryListThumb2), view.findViewById(C0803fs.libraryListThumb3)};
            int iY = c0575ak.m1987y();
            if (iY == 0) {
                for (View view2 : viewArr) {
                    view2.setTag(null);
                    ((FastThumbView) view2).setImageDrawable(null);
                    view2.setVisibility(0);
                }
            } else {
                int iMax = Math.max(viewArr.length - iY, 0);
                int length = viewArr.length - iMax;
                List listM2372a = length > 0 ? C1097n.m2372a(c0575ak.m1986x(), length, new Random(length)) : null;
                for (int i2 = 0; i2 < viewArr.length; i2++) {
                    FastThumbView fastThumbView = (FastThumbView) viewArr[i2];
                    fastThumbView.setShade(true);
                    if (i2 < iMax) {
                        fastThumbView.setVisibility(8);
                    } else {
                        fastThumbView.setVisibility(0);
                        ((C0572ah) listM2372a.get(i2 - iMax)).mo1219a(fastThumbView, 128, C0628f.m1366c().m1914a(C0802fr.page_thumbnail_image_file_error));
                    }
                }
            }
        } else {
            view.findViewById(C0803fs.libraryListThumbs).setVisibility(8);
        }
        return view;
    }
}
