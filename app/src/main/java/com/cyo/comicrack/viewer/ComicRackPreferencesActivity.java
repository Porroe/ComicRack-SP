package com.cyo.comicrack.viewer;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0951ag;
import com.cyo.common.view.C1136bc;
import com.p004a.p012b.p013a.p014a.p015a.C0425n;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: DontLook */
@TargetApi(11)
/* loaded from: classes.dex */
public class ComicRackPreferencesActivity extends C0425n {

    /* renamed from: a */
    private static List f1969a;

    /* renamed from: b */
    private static List f1970b;

    /* renamed from: c */
    private static List f1971c;

    /* renamed from: d */
    private static List f1972d;

    /* renamed from: e */
    private static List f1973e;

    /* renamed from: f */
    private static List f1974f;

    /* renamed from: g */
    private static List f1975g;

    /* renamed from: h */
    private static List f1976h;

    /* renamed from: i */
    private static List f1977i;

    /* renamed from: j */
    private static List f1978j;

    /* renamed from: k */
    private static List f1979k;

    /* renamed from: l */
    private static List f1980l;

    /* renamed from: m */
    private static int f1981m = -1;

    /* renamed from: n */
    private List f1982n;

    @Override // com.p004a.p012b.p013a.p014a.p015a.C0425n, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        f1969a = m1452a(f1969a, C0798fn.readerAction);
        f1970b = m1452a(f1970b, C0798fn.readerActionValues);
        f1971c = m1452a(f1971c, C0798fn.backgroundColorStyles);
        f1972d = m1452a(f1972d, C0798fn.backgroundColorStylesValues);
        f1975g = m1452a(f1975g, C0798fn.transitionStyles);
        f1976h = m1452a(f1976h, C0798fn.transitionStylesValues);
        f1973e = m1452a(f1973e, C0798fn.autoCropType);
        f1974f = m1452a(f1974f, C0798fn.autoCropTypeValues);
        f1977i = m1452a(f1977i, C0798fn.readerRotation);
        f1978j = m1452a(f1978j, C0798fn.readerRotationValues);
        f1979k = m1452a(f1979k, C0798fn.autoChange);
        f1980l = m1452a(f1980l, C0798fn.autoChangeValues);
        super.onCreate(bundle);
        if (!C0951ag.m2004d()) {
            addPreferencesFromResource(C0809fy.preferences_general);
            addPreferencesFromResource(C0809fy.preferences_reader);
            addPreferencesFromResource(C0809fy.preferences_input);
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            m1458c(preferenceScreen);
            PreferenceCategory preferenceCategory = new PreferenceCategory(this);
            preferenceCategory.setTitle(C0806fv.preferences_header_input_title);
            preferenceCategory.setSummary(C0806fv.preferences_header_input_summary);
            preferenceScreen.addPreference(preferenceCategory);
            m1453a(preferenceCategory, "preference_category_tapping");
            m1453a(preferenceCategory, "preference_category_longtap");
            m1453a(preferenceCategory, "preference_category_navpanel");
            m1453a(preferenceCategory, "preference_category_navpanel_long");
            m1453a(preferenceCategory, "preference_category_keyboard");
            m1456b(preferenceScreen);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CoverWallpaperService.m1467a(this, ComicRackApplication.f1954i.m1441e());
    }

    /* renamed from: a */
    private List m1452a(List list, int i) {
        return list != null ? list : Arrays.asList(getResources().getStringArray(i));
    }

    /* renamed from: a */
    private void m1453a(PreferenceCategory preferenceCategory, String str) {
        PreferenceManager preferenceManager = getPreferenceManager();
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) preferenceScreen.findPreference(str);
        PreferenceScreen preferenceScreenCreatePreferenceScreen = preferenceManager.createPreferenceScreen(this);
        preferenceScreenCreatePreferenceScreen.setTitle(preferenceCategory2.getTitle());
        preferenceScreenCreatePreferenceScreen.setSummary(preferenceCategory2.getSummary());
        for (int i = 0; i < preferenceCategory2.getPreferenceCount(); i++) {
            preferenceScreenCreatePreferenceScreen.addPreference(preferenceCategory2.getPreference(i));
        }
        preferenceCategory2.removeAll();
        preferenceScreen.removePreference(preferenceCategory2);
        preferenceCategory.addPreference(preferenceScreenCreatePreferenceScreen);
    }

    @Override // android.preference.PreferenceActivity
    public void onBuildHeaders(List list) {
        loadHeadersFromResource(C0809fy.preferences_headers, list);
        this.f1982n = list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.p004a.p012b.p013a.p014a.p015a.C0425n, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!C0951ag.m2004d() || f1981m == -1 || this.f1982n == null || f1981m >= this.f1982n.size()) {
            return;
        }
        try {
            switchToHeader((PreferenceActivity.Header) this.f1982n.get(f1981m));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.preference.PreferenceActivity
    public void onHeaderClick(PreferenceActivity.Header header, int i) {
        super.onHeaderClick(header, i);
        f1981m = i;
    }

    /* compiled from: DontLook */
    public static class GeneralFragment extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0809fy.preferences_general);
            ComicRackPreferencesActivity.m1454a(getPreferenceScreen());
        }
    }

    /* compiled from: DontLook */
    public static class DisplayFragment extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0809fy.preferences_reader);
            ComicRackPreferencesActivity.m1454a(getPreferenceScreen());
        }
    }

    /* compiled from: DontLook */
    public static class InputFragment extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0809fy.preferences_input);
            ComicRackPreferencesActivity.m1454a(getPreferenceScreen());
        }
    }

    /* compiled from: DontLook */
    public static class WallpaperFragment extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0809fy.preferences_wallpaper);
            ComicRackPreferencesActivity.m1454a(getPreferenceScreen());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m1454a(PreferenceGroup preferenceGroup) {
        m1456b(preferenceGroup);
    }

    /* renamed from: b */
    private static void m1456b(PreferenceGroup preferenceGroup) {
        m1458c(preferenceGroup);
        m1459d(preferenceGroup);
    }

    /* renamed from: c */
    private static void m1458c(PreferenceGroup preferenceGroup) {
        if (C0628f.f1885g == 0) {
            C1136bc.m2411a(preferenceGroup, "preference_category_reader_animation", "reader_animation_page_transition_style");
            C1136bc.m2411a(preferenceGroup, "preference_category_reader_animation", "reader_animation_page_transition_show_full");
        }
        if (preferenceGroup.getContext().getResources().getConfiguration().keyboard == 1) {
            C1136bc.m2411a(preferenceGroup, "preference_category_keyboard", "reader_key_up");
            C1136bc.m2411a(preferenceGroup, "preference_category_keyboard", "reader_key_down");
            C1136bc.m2411a(preferenceGroup, "preference_category_keyboard", "reader_key_left");
            C1136bc.m2411a(preferenceGroup, "preference_category_keyboard", "reader_key_right");
        }
        if (!C0951ag.m2004d()) {
            C1136bc.m2411a(preferenceGroup, "preference_category_reader_screen", "reader_hide_navigation");
        }
        if (C0628f.f1889k) {
            C1136bc.m2411a(preferenceGroup, null, "general_enable_wireless");
            C1136bc.m2411a(preferenceGroup, null, "wallpaper_comic_keywords");
        }
        if (C0951ag.m1995a().mo2037d(preferenceGroup.getContext())) {
            C1136bc.m2411a(preferenceGroup, "preference_category_reader_screen", "reader_hide_navigation");
        }
    }

    /* renamed from: d */
    private static void m1459d(PreferenceGroup preferenceGroup) {
        Map<String, ?> all = preferenceGroup.getPreferenceManager().getSharedPreferences().getAll();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < preferenceGroup.getPreferenceCount()) {
                Preference preference = preferenceGroup.getPreference(i2);
                if (preference instanceof PreferenceGroup) {
                    m1459d((PreferenceGroup) preference);
                } else {
                    preference.setOnPreferenceChangeListener(new C0731da());
                    m1457b(preference, all.get(preference.getKey()));
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m1455a(Preference preference, Object obj) {
        return m1457b(preference, obj);
    }

    /* renamed from: b */
    private static boolean m1457b(Preference preference, Object obj) {
        String key;
        int iIndexOf;
        if (f1969a == null || (key = preference.getKey()) == null) {
            return false;
        }
        if (key.startsWith("reader_tapping_a") || key.startsWith("reader_longtouch_a") || key.startsWith("reader_key") || key.startsWith("reader_navpanel_")) {
            int iIndexOf2 = f1970b.indexOf(obj);
            if (iIndexOf2 != -1) {
                preference.setSummary((CharSequence) f1969a.get(iIndexOf2));
            }
        } else if (key.equals("reader_pageview_background_color")) {
            int iIndexOf3 = f1972d.indexOf(obj);
            if (iIndexOf3 != -1) {
                preference.setSummary((CharSequence) f1971c.get(iIndexOf3));
            }
        } else if (key.equals("reader_screen_rotation")) {
            int iIndexOf4 = f1978j.indexOf(obj);
            if (iIndexOf4 != -1) {
                preference.setSummary((CharSequence) f1977i.get(iIndexOf4));
            }
        } else if (key.equals("reader_animation_page_transition_style")) {
            int iIndexOf5 = f1976h.indexOf(obj);
            if (iIndexOf5 != -1) {
                preference.setSummary((CharSequence) f1975g.get(iIndexOf5));
            }
        } else if (key.equals("wallpaper_auto_change")) {
            int iIndexOf6 = f1980l.indexOf(obj);
            if (iIndexOf6 != -1) {
                preference.setSummary((CharSequence) f1979k.get(iIndexOf6));
            }
        } else if (key.equals("reader_pageview_autocrop_type") && (iIndexOf = f1974f.indexOf(obj)) != -1) {
            preference.setSummary((CharSequence) f1973e.get(iIndexOf));
        }
        return true;
    }

    @Override // android.preference.PreferenceActivity
    protected boolean isValidFragment(String str) {
        return true;
    }
}
