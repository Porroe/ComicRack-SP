package com.cyo.common.view;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.widget.ListView;
import com.cyo.comicrack.viewer.C0808fx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ListPreferenceMultiSelect extends ListPreference {

    /* renamed from: a */
    private String f3517a;

    /* renamed from: b */
    private String f3518b;

    /* renamed from: c */
    private boolean[] f3519c;

    /* renamed from: a */
    static /* synthetic */ boolean[] m2383a(ListPreferenceMultiSelect listPreferenceMultiSelect) {
        return listPreferenceMultiSelect.f3519c;
    }

    public ListPreferenceMultiSelect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3518b = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0808fx.ListPreferenceMultiSelect);
        this.f3518b = typedArrayObtainStyledAttributes.getString(C0808fx.ListPreferenceMultiSelect_checkAll);
        String string = typedArrayObtainStyledAttributes.getString(C0808fx.ListPreferenceMultiSelect_separator);
        typedArrayObtainStyledAttributes.recycle();
        this.f3517a = string == null ? "\n" : string;
        this.f3519c = new boolean[getEntries().length];
    }

    @Override // android.preference.ListPreference
    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        this.f3519c = new boolean[charSequenceArr.length];
    }

    public ListPreferenceMultiSelect(Context context) {
        this(context, null);
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        CharSequence[] entries = getEntries();
        CharSequence[] entryValues = getEntryValues();
        if (entries == null || entryValues == null || entries.length != entryValues.length) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array which are both the same length");
        }
        m2380a();
        builder.setMultiChoiceItems(entries, this.f3519c, new DialogInterfaceOnMultiChoiceClickListenerC1134ba(this));
    }

    /* renamed from: a */
    static /* synthetic */ boolean m2382a(ListPreferenceMultiSelect listPreferenceMultiSelect, int i) {
        CharSequence[] entryValues = listPreferenceMultiSelect.getEntryValues();
        if (listPreferenceMultiSelect.f3518b != null) {
            return entryValues[i].equals(listPreferenceMultiSelect.f3518b);
        }
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ void m2381a(ListPreferenceMultiSelect listPreferenceMultiSelect, DialogInterface dialogInterface, boolean z) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        int count = listView.getCount();
        for (int i = 0; i < count; i++) {
            listView.setItemChecked(i, z);
            listPreferenceMultiSelect.f3519c[i] = z;
        }
    }

    /* renamed from: a */
    private void m2380a() {
        CharSequence[] entryValues = getEntryValues();
        String value = getValue();
        String[] strArrSplit = (value == null || "".equals(value)) ? null : value.split(this.f3517a);
        if (strArrSplit != null) {
            List listAsList = Arrays.asList(strArrSplit);
            for (int i = 0; i < entryValues.length; i++) {
                if (listAsList.contains(entryValues[i])) {
                    this.f3519c[i] = true;
                }
            }
        }
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected void onDialogClosed(boolean z) {
        ArrayList arrayList = new ArrayList();
        CharSequence[] entryValues = getEntryValues();
        if (z && entryValues != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= entryValues.length) {
                    break;
                }
                if (this.f3519c[i2]) {
                    String str = (String) entryValues[i2];
                    if (this.f3518b == null || !str.equals(this.f3518b)) {
                        arrayList.add(str);
                    }
                }
                i = i2 + 1;
            }
            if (callChangeListener(arrayList)) {
                setValue(m2379a(arrayList, this.f3517a));
            }
        }
    }

    /* renamed from: a */
    private static String m2379a(Iterable iterable, String str) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                StringBuilder sb = new StringBuilder(String.valueOf(it.next()));
                while (it.hasNext()) {
                    sb.append(str).append(it.next());
                }
                return sb.toString();
            }
        }
        return "";
    }
}
