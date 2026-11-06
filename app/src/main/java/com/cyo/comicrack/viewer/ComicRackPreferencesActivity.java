package com.cyo.comicrack.viewer;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.storage.ComicDocuments;
import com.cyo.common.C0951ag;
import com.cyo.common.view.C1136bc;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ComicRackPreferencesActivity extends AppCompatActivity {
    private static final String ACTIVE_SECTION = "active_settings_section";
    private MaterialToolbar toolbar;
    private View home;
    private View detail;
    private int activeSectionTitle;

    private static final int CHOOSE_PRIMARY_FOLDER = 1101;
    private static final int CHOOSE_ADDITIONAL_FOLDER = 1102;
    private static final String PRIMARY_FOLDER_KEY = "general_library_path";
    private static final String ADDITIONAL_FOLDER_KEY = "general_library_2nd_path";

    private void bindLibraryFolders(PreferenceGroup preferences) {
        bindLibraryFolder(preferences.findPreference(PRIMARY_FOLDER_KEY), PRIMARY_FOLDER_KEY, CHOOSE_PRIMARY_FOLDER);
        bindLibraryFolder(preferences.findPreference(ADDITIONAL_FOLDER_KEY), ADDITIONAL_FOLDER_KEY, CHOOSE_ADDITIONAL_FOLDER);
    }

    private void bindLibraryFolder(Preference preference, String key, int requestCode) {
        if (preference == null) {
            return;
        }
        String source = ComicRackApplication.f1954i.m1441e().getString(key, "");
        if (ComicDocuments.isDocument(source)) {
            preference.setSummary(ComicDocuments.hasReadGrant(source)
                    ? ComicDocuments.displayName(source) : getString(R.string.folder_access_unavailable));
        }
        preference.setOnPreferenceClickListener(selectedPreference -> {
            startActivityForResult(new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE), requestCode);
            return true;
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent result) {
        super.onActivityResult(requestCode, resultCode, result);
        if (resultCode != RESULT_OK || (requestCode != CHOOSE_PRIMARY_FOLDER && requestCode != CHOOSE_ADDITIONAL_FOLDER)) {
            return;
        }
        Uri folder = ComicDocuments.persistReadGrant(result);
        if (folder == null) {
            Toast.makeText(this, R.string.folder_access_unavailable, Toast.LENGTH_LONG).show();
            return;
        }
        ComicRackApplication.f1954i.setLibraryFolder(
                requestCode == CHOOSE_PRIMARY_FOLDER ? PRIMARY_FOLDER_KEY : ADDITIONAL_FOLDER_KEY, folder);
        recreate();
    }


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DynamicColors.applyToActivityIfAvailable(this);
        f1969a = loadLabels(f1969a, C0798fn.readerAction);
        f1970b = loadLabels(f1970b, C0798fn.readerActionValues);
        f1971c = loadLabels(f1971c, C0798fn.backgroundColorStyles);
        f1972d = loadLabels(f1972d, C0798fn.backgroundColorStylesValues);
        f1975g = loadLabels(f1975g, C0798fn.transitionStyles);
        f1976h = loadLabels(f1976h, C0798fn.transitionStylesValues);
        f1973e = loadLabels(f1973e, C0798fn.autoCropType);
        f1974f = loadLabels(f1974f, C0798fn.autoCropTypeValues);
        f1977i = loadLabels(f1977i, C0798fn.readerRotation);
        f1978j = loadLabels(f1978j, C0798fn.readerRotationValues);
        f1979k = loadLabels(f1979k, C0798fn.autoChange);
        f1980l = loadLabels(f1980l, C0798fn.autoChangeValues);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_settings);
        SystemBarInsets.applyToContent(this);

        toolbar = findViewById(R.id.settingsToolbar);
        home = findViewById(R.id.settingsHome);
        detail = findViewById(R.id.settingsDetail);
        ViewGroup sections = findViewById(R.id.settingsSections);
        addSection(sections, R.drawable.ic_settings_folder_open, R.string.settings_library_title,
                getText(R.string.settings_library_summary), GeneralFragment::new);
        addSection(sections, R.drawable.ic_settings_menu_book, R.string.preferences_header_display_title,
                getText(R.string.preferences_header_display_summary), DisplayFragment::new);
        addSection(sections, R.drawable.ic_settings_tune, R.string.preferences_header_input_title,
                getText(R.string.preferences_header_input_summary), InputFragment::new);
        addSection(sections, R.drawable.ic_settings_wallpaper, R.string.preferences_header_wallpaper_title,
                getText(R.string.preferences_header_wallpaper_summary), WallpaperFragment::new);
        addSection(sections, R.drawable.ic_settings_info, R.string.about,
                getString(R.string.settings_about_summary, C0951ag.m2003d(this)), null);

        View interfaceRow = addSettingsRow(sections, R.drawable.ic_settings_tune,
                R.string.library_interface_title, getText(libraryInterfaceLabel()));
        interfaceRow.setOnClickListener(view -> chooseLibraryInterface(interfaceRow));

        if (savedInstanceState != null) {
            activeSectionTitle = savedInstanceState.getInt(ACTIVE_SECTION);
        }
        updateVisibleSection();
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                closeSection();
            }
        });
        toolbar.setNavigationOnClickListener(view -> closeSection());
    }

    private void addSection(ViewGroup sections, int icon, int title, CharSequence summary,
                            Supplier<PreferenceFragment> fragmentFactory) {
        View row = addSettingsRow(sections, icon, title, summary);
        row.setOnClickListener(view -> {
            if (fragmentFactory == null) {
                C0649a.m1695a(this, null);
                return;
            }
            getFragmentManager().beginTransaction()
                    .replace(R.id.settingsDetail, fragmentFactory.get())
                    .commit();
            activeSectionTitle = title;
            updateVisibleSection();
        });
    }

    private View addSettingsRow(ViewGroup sections, int icon, int title, CharSequence summary) {
        View row = getLayoutInflater().inflate(R.layout.material_settings_section, sections, false);
        ((ImageView) row.findViewById(R.id.settingsSectionIcon)).setImageResource(icon);
        ((TextView) row.findViewById(R.id.settingsSectionTitle)).setText(title);
        ((TextView) row.findViewById(R.id.settingsSectionSummary)).setText(summary);
        sections.addView(row);
        return row;
    }

    private int libraryInterfaceLabel() {
        return LibraryInterface.isMaterial(this) ? R.string.library_interface_material
                : R.string.library_interface_classic;
    }

    private void chooseLibraryInterface(View row) {
        CharSequence[] choices = {getText(R.string.library_interface_material),
                getText(R.string.library_interface_classic)};
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.library_interface_title)
                .setSingleChoiceItems(choices, LibraryInterface.isMaterial(this) ? 0 : 1,
                        (dialog, choice) -> {
                            LibraryInterface.setMaterial(this, choice == 0);
                            ((TextView) row.findViewById(R.id.settingsSectionSummary))
                                    .setText(libraryInterfaceLabel());
                            dialog.dismiss();
                        })
                .setNegativeButton(android.R.string.cancel, null)
                .show();
    }

    private void updateVisibleSection() {
        boolean showingHome = activeSectionTitle == 0;
        home.setVisibility(showingHome ? View.VISIBLE : View.GONE);
        detail.setVisibility(showingHome ? View.GONE : View.VISIBLE);
        toolbar.setTitle(showingHome ? R.string.settings_title : activeSectionTitle);
    }

    private void closeSection() {
        if (activeSectionTitle == 0) {
            finish();
            return;
        }
        Fragment currentSection = getFragmentManager().findFragmentById(R.id.settingsDetail);
        if (currentSection != null) {
            getFragmentManager().beginTransaction().remove(currentSection).commit();
        }
        activeSectionTitle = 0;
        updateVisibleSection();
    }

    @Override
    protected void onSaveInstanceState(Bundle state) {
        super.onSaveInstanceState(state);
        state.putInt(ACTIVE_SECTION, activeSectionTitle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        CoverWallpaperService.m1467a(this, ComicRackApplication.f1954i.m1441e());
    }

    private List loadLabels(List labels, int resourceId) {
        return labels != null ? labels : Arrays.asList(getResources().getStringArray(resourceId));
    }

    /* compiled from: DontLook */
    public static class GeneralFragment extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0809fy.preferences_general);
            ComicRackPreferencesActivity.m1454a(getPreferenceScreen());
            ((ComicRackPreferencesActivity) getActivity()).bindLibraryFolders(getPreferenceScreen());
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

}
