package com.cyo.common;

import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.widget.AbsListView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.an */
/* loaded from: classes.dex */
final class C0958an implements InterfaceC0952ah {

    /* renamed from: a */
    AbsListView f2850a;

    /* renamed from: b */
    ActionMode f2851b;

    public C0958an(InterfaceC0966av interfaceC0966av, InterfaceC0992bc interfaceC0992bc) {
        this.f2850a = interfaceC0966av.mo2044a();
        interfaceC0966av.mo2044a().setChoiceMode(3);
        interfaceC0966av.mo2044a().setMultiChoiceModeListener(new C0959ao(this, interfaceC0992bc));
    }

    /* renamed from: a */
    static /* synthetic */ List m2043a(C0958an c0958an) {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray checkedItemPositions = c0958an.f2850a.getCheckedItemPositions();
        int size = checkedItemPositions.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = checkedItemPositions.keyAt(i);
            if (checkedItemPositions.get(iKeyAt)) {
                arrayList.add(Integer.valueOf(iKeyAt));
            }
        }
        return arrayList;
    }

    @Override // com.cyo.common.InterfaceC0952ah
    /* renamed from: a */
    public final void mo2009a() {
        if (this.f2851b != null) {
            this.f2851b.finish();
        }
    }
}
