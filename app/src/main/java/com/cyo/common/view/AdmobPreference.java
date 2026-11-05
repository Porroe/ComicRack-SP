package com.cyo.common.view;

import android.preference.Preference;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class AdmobPreference extends Preference {

    // The APK has no constructor for this class.
    private AdmobPreference(android.content.Context context) {
        super(context);
        throw new AssertionError("No constructor in the original APK");
    }
    @Override // android.preference.Preference
    protected View onCreateView(ViewGroup viewGroup) {
        return new LinearLayout(getContext());
    }
}
