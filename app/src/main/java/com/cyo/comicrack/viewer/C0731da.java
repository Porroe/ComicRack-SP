package com.cyo.comicrack.viewer;

import android.preference.Preference;
import com.p004a.p012b.p013a.p014a.p015a.C0413b;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.da */
/* loaded from: classes.dex */
final class C0731da implements Preference.OnPreferenceChangeListener {
    C0731da() {
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (obj != null) {
            C0413b.m944a().m949a("Preference Change", preference.getKey(), obj.toString(), 0);
        }
        return ComicRackPreferencesActivity.m1455a(preference, obj);
    }
}
