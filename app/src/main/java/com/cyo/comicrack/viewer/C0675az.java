package com.cyo.comicrack.viewer;

import android.widget.Filter;
import com.cyo.common.C0998bi;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.az */
/* loaded from: classes.dex */
final class C0675az extends Filter {

    /* renamed from: a */
    final /* synthetic */ C0674ay f2182a;

    C0675az(C0674ay c0674ay) {
        this.f2182a = c0674ay;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C0674ay.m1702a(this.f2182a, (String[]) filterResults.values);
        this.f2182a.m1706a();
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i = 0;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence == null || charSequence.length() == 0) {
            filterResults.values = C0674ay.m1703a(this.f2182a);
            return filterResults;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = charSequence.toString().trim().toLowerCase(Locale.getDefault());
        for (String str : C0674ay.m1703a(this.f2182a)) {
            if (C0998bi.m2090e(str, lowerCase)) {
                arrayList.add(str);
            }
        }
        String[] strArr = new String[arrayList.size()];
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                strArr[i2] = (String) arrayList.get(i2);
                i = i2 + 1;
            } else {
                filterResults.values = strArr;
                return filterResults;
            }
        }
    }
}
