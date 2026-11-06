package com.cyo.comicrack.viewer;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.WindowCompat;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.google.android.material.R.attr;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;

final class LibraryInterface {
    private static final String CLASSIC_LIBRARY = "classic_library_interface";

    private LibraryInterface() {}

    static boolean isMaterial(Context context) {
        return !PreferenceManager.getDefaultSharedPreferences(context).getBoolean(CLASSIC_LIBRARY, false);
    }

    static void setMaterial(Context context, boolean material) {
        PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putBoolean(CLASSIC_LIBRARY, !material).apply();
    }

    static Context theme(Context context) {
        return DynamicColors.wrapContextIfAvailable(
                new ContextThemeWrapper(context, R.style.Theme_ComicRack_Settings));
    }

    static int dp(Context context, int value) {
        return Math.round(value * context.getResources().getDisplayMetrics().density);
    }

    static void installHeader(AbstractActivityC0773ep activity, int containerId) {
        Context theme = theme(activity);
        LinearLayout library = activity.findViewById(containerId);
        View header = LayoutInflater.from(theme).inflate(R.layout.material_library_header, library, false);
        MaterialToolbar toolbar = header.findViewById(R.id.materialLibraryToolbar);
        int iconColor = MaterialColors.getColor(theme, attr.colorOnSurface, 0);
        boolean mainLibrary = activity instanceof LibraryActivity;
        if (!mainLibrary || activity.findViewById(C0803fs.libraryListFragmentContainer) != null) {
            toolbar.setNavigationIcon(tintedIcon(theme, mainLibrary ? R.drawable.ic_library_menu
                    : R.drawable.ic_settings_arrow_back, iconColor));
            toolbar.setNavigationContentDescription(mainLibrary ? R.string.library_navigation
                    : R.string.settings_back);
            toolbar.setNavigationOnClickListener(view -> {
                if (activity instanceof LibraryActivity) {
                    ((LibraryActivity) activity).toggleLibrarySidebar();
                } else {
                    activity.onBackPressed();
                }
            });
        }
        toolbar.setOverflowIcon(tintedIcon(theme, R.drawable.ic_library_more_vert, iconColor));
        Menu menu = toolbar.getMenu();
        if (activity instanceof LibraryActivity) {
            ((LibraryActivity) activity).addMaterialLibraryMenu(menu);
        }
        menu.add(0, 6, 0, R.string.settings_title);
        menu.add(0, 12, 0, R.string.about);
        toolbar.setOnMenuItemClickListener(activity::onOptionsItemSelected);

        EditText search = header.findViewById(R.id.materialLibrarySearch);
        TextInputLayout searchBox = header.findViewById(R.id.materialLibrarySearchBox);
        toolbar.removeView(searchBox);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(iconColor);
        toolbar.setCollapseIcon(tintedIcon(theme, R.drawable.ic_settings_arrow_back, iconColor));
        toolbar.setCollapseContentDescription(R.string.library_close_search);

        InputMethodManager keyboard = activity.getSystemService(InputMethodManager.class);
        MenuItem searchAction = menu.add(0, R.id.materialLibrarySearchAction, 0, R.string.search);
        searchAction.setIcon(tintedIcon(theme, R.drawable.ic_library_search, iconColor));
        searchAction.setActionView(searchBox);
        searchAction.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
        searchAction.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                search.post(() -> {
                    if (item.isActionViewExpanded() && search.requestFocus()) {
                        keyboard.showSoftInput(search, InputMethodManager.SHOW_IMPLICIT);
                    }
                });
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                keyboard.hideSoftInputFromWindow(search.getWindowToken(), 0);
                search.clearFocus();
                return true;
            }
        });
        searchBox.setEndIconVisible(false);
        searchBox.setEndIconOnClickListener(view -> {
            search.getText().clear();
            activity.clearMaterialSearch();
        });
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                searchBox.setEndIconVisible(text.length() > 0);
            }

            @Override
            public void afterTextChanged(Editable text) {}
        });
        search.setOnEditorActionListener((field, actionId, event) -> {
            boolean enter = event != null && event.getKeyCode() == KeyEvent.KEYCODE_ENTER
                    && event.getAction() == KeyEvent.ACTION_UP;
            if (actionId != EditorInfo.IME_ACTION_SEARCH && !enter) {
                return false;
            }
            String query = search.getText().toString().trim();
            if (!query.isEmpty()) {
                keyboard.hideSoftInputFromWindow(search.getWindowToken(), 0);
                search.clearFocus();
                activity.m1821a(new Intent(Intent.ACTION_SEARCH).putExtra(SearchManager.QUERY, query));
            }
            return true;
        });

        if (mainLibrary) {
            LinearLayout resumeContainer = header.findViewById(R.id.materialLibraryResumeContainer);
            View resume = LayoutInflater.from(theme)
                    .inflate(R.layout.material_library_resume, resumeContainer, false);
            roundCover(resume.findViewById(R.id.libraryResumeCover), dp(theme, 6));
            resumeContainer.addView(resume);
            resumeContainer.setVisibility(View.GONE);
        }
        library.addView(header, 0);
        header.requestFocus();
        if (activity.getActionBar() != null) {
            activity.getActionBar().hide();
        }
        int surface = MaterialColors.getColor(theme, attr.colorSurface, 0);
        activity.getWindow().setStatusBarColor(surface);
        activity.getWindow().setNavigationBarColor(surface);
        boolean light = (theme.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK)
                != Configuration.UI_MODE_NIGHT_YES;
        androidx.core.view.WindowInsetsControllerCompat bars = WindowCompat.getInsetsController(
                activity.getWindow(), activity.getWindow().getDecorView());
        bars.setAppearanceLightStatusBars(light);
        bars.setAppearanceLightNavigationBars(light);
        stylePagerTabs(activity.findViewById(C0803fs.comicListPagerTitle), theme);
        stylePagerTabs(activity.findViewById(C0803fs.libraryListPagerTitle), theme);
        View sidebarShadow = activity.findViewById(C0803fs.libraryListShadow);
        if (sidebarShadow != null) {
            sidebarShadow.setBackground(null);
        }
    }

    static boolean closeToolbarSearch(AbstractActivityC0773ep activity) {
        MaterialToolbar toolbar = activity.findViewById(R.id.materialLibraryToolbar);
        if (toolbar == null || !toolbar.hasExpandedActionView()) {
            return false;
        }
        toolbar.collapseActionView();
        return true;
    }

    static EditText getToolbarSearch(AbstractActivityC0773ep activity) {
        MaterialToolbar toolbar = activity.findViewById(R.id.materialLibraryToolbar);
        if (toolbar == null) {
            return null;
        }
        MenuItem searchAction = toolbar.getMenu().findItem(R.id.materialLibrarySearchAction);
        return searchAction == null ? null : searchAction.getActionView().findViewById(R.id.materialLibrarySearch);
    }

    static void updateResumeCard(LibraryActivity activity) {
        View resume = activity.findViewById(R.id.materialLibraryResumeContainer);
        if (resume == null) {
            return;
        }
        ComicRackApplication application = ComicRackApplication.f1954i;
        C0635m library = application.m1438c();
        C0575ak recent = library == null ? null : library.getRecentlyOpenedComics();
        if (recent == null || recent.m1987y() == 0) {
            resume.setVisibility(View.GONE);
            return;
        }
        C0572ah entry = (C0572ah) recent.m1983d(recent.m1987y() - 1);
        C0505b comic = entry.m1221j();
        View cover = resume.findViewById(R.id.libraryResumeCover);
        entry.mo1219a(cover, 0, C0628f.m1366c().m1914a(C0802fr.page_thumbnail_image_file_error));
        TextView summary = resume.findViewById(R.id.libraryResumeSummary);
        int pageCount = comic.m1139e();
        summary.setText(pageCount > 0
                ? activity.getString(R.string.library_resume_progress, entry.mo1211f(),
                        Math.min(comic.m1140f() + 1, pageCount), pageCount)
                : entry.mo1211f());
        ((LinearLayout) resume).getChildAt(0).setOnClickListener(view -> activity.startActivity(
                C0635m.m1380a(activity.getApplicationContext(), ReaderActivity.class, comic, recent, true)));
        resume.setVisibility(View.VISIBLE);
    }

    private static Drawable tintedIcon(Context theme, int resourceId, int color) {
        Drawable icon = theme.getDrawable(resourceId).mutate();
        icon.setTint(color);
        return icon;
    }

    private static void stylePagerTabs(View view, Context theme) {
        if (view instanceof android.support.v4.view.PagerTabStrip) {
            android.support.v4.view.PagerTabStrip tabs = (android.support.v4.view.PagerTabStrip) view;
            tabs.setBackgroundColor(MaterialColors.getColor(theme, attr.colorSurfaceContainer, 0));
            tabs.setTextColor(MaterialColors.getColor(theme, attr.colorOnSurface, 0));
            tabs.setTabIndicatorColor(MaterialColors.getColor(theme, androidx.appcompat.R.attr.colorPrimary, 0));
            tabs.setDrawFullUnderline(false);
        }
    }

    static void styleComicList(View root) {
        Context theme = theme(root.getContext());
        root.setBackgroundColor(MaterialColors.getColor(theme, attr.colorSurface, 0));
        root.findViewById(C0803fs.comicListCaption)
                .setBackgroundColor(MaterialColors.getColor(theme, attr.colorSurfaceContainer, 0));
        int textColor = MaterialColors.getColor(theme, attr.colorOnSurface, 0);
        applyExpandIcon(root, C0803fs.comicListCaptionImage, theme, textColor);
        for (int id : new int[] {C0803fs.comicListCaptionText, C0803fs.comicListCaptionTextSmall,
                C0803fs.comicListCaptionDescription}) {
            ((TextView) root.findViewById(id)).setTextColor(textColor);
        }
        int buttonColor = MaterialColors.getColor(theme, attr.colorSecondaryContainer, 0);
        int buttonTextColor = MaterialColors.getColor(theme, attr.colorOnSecondaryContainer, 0);
        ColorStateList ripple = ColorStateList.valueOf((buttonTextColor & 0x00ffffff) | 0x26000000);
        for (int id : new int[] {C0803fs.closeButton, C0803fs.filterButton}) {
            TextView button = root.findViewById(id);
            button.setBackground(new RippleDrawable(ripple, roundedSurface(buttonColor, dp(theme, 20)), null));
            button.setTextColor(buttonTextColor);
        }
    }

    static void styleSidebar(View root) {
        Context theme = theme(root.getContext());
        int surface = MaterialColors.getColor(theme, attr.colorSurfaceContainer, 0);
        int textColor = MaterialColors.getColor(theme, attr.colorOnSurface, 0);
        root.setBackgroundColor(surface);
        root.findViewById(C0803fs.libraryListCaption).setBackgroundColor(surface);
        ((TextView) root.findViewById(C0803fs.libraryListCaptionText)).setTextColor(textColor);
        applyExpandIcon(root, C0803fs.libraryListCaptionImage, theme, textColor);
        ListView list = root.findViewById(C0803fs.libraryListGrid);
        list.setBackgroundColor(surface);
        list.setDivider(null);
        for (int id : new int[] {C0803fs.refreshButton, C0803fs.pinButton, C0803fs.wifiButton}) {
            ImageView button = root.findViewById(id);
            button.setBackgroundResource(android.R.color.transparent);
            button.setImageTintList(ColorStateList.valueOf(textColor));
        }
        ImageView refresh = root.findViewById(C0803fs.refreshButton);
        refresh.setImageResource(R.drawable.ic_library_refresh);
        refresh.setContentDescription(root.getResources().getText(R.string.refresh_comics_library));
        ImageView pin = root.findViewById(C0803fs.pinButton);
        pin.setImageResource(R.drawable.ic_library_push_pin);
        pin.setContentDescription(root.getResources().getText(R.string.library_pin_lists));
    }

    private static void applyExpandIcon(View root, int viewId, Context theme, int color) {
        ImageView icon = root.findViewById(viewId);
        icon.setImageDrawable(tintedIcon(theme, R.drawable.ic_library_expand_more, color));
        icon.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    static void styleComicTile(View tile, Context theme) {
        styleTile(tile, theme, C0803fs.comicListThumbnailCaption, C0803fs.comicListThumbnailDescription);
        roundCover(tile.findViewById(C0803fs.comicListThumbnailImage), dp(theme, 8));
        TextView summary = tile.findViewById(C0803fs.comicListThumbnailSummary);
        if (summary != null) {
            summary.setTextColor(MaterialColors.getColor(theme, attr.colorOnSurfaceVariant, 0));
        }
    }

    private static void roundCover(View cover, int radius) {
        cover.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), radius);
            }
        });
        cover.setClipToOutline(true);
    }

    static void styleTile(View tile, Context theme, int captionId, int descriptionId) {
        int surface = MaterialColors.getColor(theme, attr.colorSurfaceContainerLow, 0);
        int selected = MaterialColors.getColor(theme, attr.colorSecondaryContainer, 0);
        int radius = dp(theme, 12);
        StateListDrawable background = new StateListDrawable();
        for (int state : new int[] {android.R.attr.state_selected, android.R.attr.state_pressed,
                android.R.attr.state_focused, android.R.attr.state_checked}) {
            background.addState(new int[] {state}, roundedSurface(selected, radius));
        }
        background.addState(new int[0], roundedSurface(surface, radius));
        tile.setBackground(background);

        int titleColor = MaterialColors.getColor(theme, attr.colorOnSurface, 0);
        int supportingColor = MaterialColors.getColor(theme, attr.colorOnSurfaceVariant, 0);
        ((TextView) tile.findViewById(captionId)).setTextColor(titleColor);
        ((TextView) tile.findViewById(descriptionId)).setTextColor(supportingColor);
    }

    private static GradientDrawable roundedSurface(int color, int radius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(radius);
        return drawable;
    }
}
