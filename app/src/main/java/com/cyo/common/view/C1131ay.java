package com.cyo.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cyo.comicrack.viewer.C0803fs;
import com.cyo.comicrack.viewer.C0804ft;
import java.io.File;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.ay */
/* loaded from: classes.dex */
final class C1131ay extends C1143bj {

    /* renamed from: a */
    final /* synthetic */ C1120an f3599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1131ay(C1120an c1120an, Context context, int i, List list) {
        super(context, i, list);
        this.f3599a = c1120an;
    }

    @Override // com.cyo.common.view.C1143bj, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f3624b).inflate(C0804ft.folder_browser_entry, (ViewGroup) null);
        }
        ((TextView) view.findViewById(C0803fs.fileText)).setText(((File) getItem(i)).getName());
        return view;
    }
}
