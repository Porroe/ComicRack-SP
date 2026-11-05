package com.cyo.common.view;

import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.bc */
/* loaded from: classes.dex */
public final class C1136bc {
    /* renamed from: a */
    public static void m2411a(PreferenceGroup preferenceGroup, String str, String str2) {
        try {
            Preference preferenceFindPreference = preferenceGroup.findPreference(str2);
            if (preferenceFindPreference != null) {
                if (str == null) {
                    preferenceFindPreference.setEnabled(false);
                } else {
                    PreferenceCategory preferenceCategory = (PreferenceCategory) preferenceGroup.findPreference(str);
                    if (preferenceCategory != null) {
                        preferenceCategory.removePreference(preferenceFindPreference);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
