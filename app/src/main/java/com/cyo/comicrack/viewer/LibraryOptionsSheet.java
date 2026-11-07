package com.cyo.comicrack.viewer;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.color.MaterialColors;
import android.widget.TextView;
import com.cyo.common.C1006bq;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.tabs.TabLayout;
import java.util.function.IntConsumer;

final class LibraryOptionsSheet {
    private final C0681be collection;
    private BottomSheetDialog dialog;
    private LinearLayout options;

    LibraryOptionsSheet(C0681be collection) {
        this.collection = collection;
    }

    void show() {
        if (dialog != null && dialog.isShowing()) {
            return;
        }
        Context theme = LibraryInterface.theme(collection.m55i());
        dialog = new BottomSheetDialog(theme);
        dialog.setTitle(R.string.library_options);
        LinearLayout sheet = new LinearLayout(theme);
        sheet.setOrientation(LinearLayout.VERTICAL);
        sheet.addView(new BottomSheetDragHandleView(theme));

        TextView title = new TextView(theme);
        title.setText(R.string.library_options);
        title.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_TitleLarge);
        title.setPadding(LibraryInterface.dp(theme, 24), 0,
                LibraryInterface.dp(theme, 24), LibraryInterface.dp(theme, 12));
        sheet.addView(title);
        TabLayout tabs = new TabLayout(theme);
        tabs.setBackgroundColor(Color.TRANSPARENT);
        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        for (int tabLabel : new int[] {R.string.library_filter_tab, R.string.library_sort_tab,
                R.string.library_display_tab}) {
            tabs.addTab(tabs.newTab().setText(tabLabel));
        }
        sheet.addView(tabs, new LinearLayout.LayoutParams(-1, -2));
        NestedScrollView scroll = new NestedScrollView(theme);
        scroll.setFillViewport(true);
        options = new LinearLayout(theme);
        options.setOrientation(LinearLayout.VERTICAL);
        int padding = LibraryInterface.dp(theme, 24);
        options.setPadding(padding, 0, padding, padding);
        scroll.addView(options);
        sheet.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                render(tab.getPosition());
                scroll.scrollTo(0, 0);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        render(0);
        dialog.setContentView(sheet);
        dialog.getBehavior().setMaxWidth(LibraryInterface.dp(theme, 640));
        dialog.setOnShowListener(ignored -> {
            View parent = (View) sheet.getParent();
            int availableHeight = ((View) parent.getParent()).getHeight();
            android.graphics.Rect windowBounds = new android.graphics.Rect();
            collection.m55i().getWindow().getDecorView().getWindowVisibleDisplayFrame(windowBounds);
            int expandedHeight = Math.min(availableHeight, windowBounds.height());
            ViewGroup.LayoutParams layout = parent.getLayoutParams();
            layout.height = expandedHeight;
            parent.setLayoutParams(layout);
            sheet.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            BottomSheetBehavior<?> behavior = dialog.getBehavior();
            behavior.setFitToContents(true);
            behavior.setPeekHeight(Math.round(expandedHeight * 0.6f));
            behavior.setDraggable(true);
            behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        });
        dialog.show();
    }

    void dismiss() {
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }
    }

    private void render(int tab) {
        options.removeAllViews();
        switch (tab) {
            case 0:
                showFilters();
                break;
            case 1:
                showSorting();
                break;
            case 2:
                showDisplay();
                break;
            default:
                throw new IllegalArgumentException("Unknown library options tab");
        }
    }

    private void showFilters() {
        heading(R.string.library_reading_status);
        RadioGroup filters = choices();
        int[] labels = {R.string.all, R.string.unread, R.string.reading, R.string.read};
        for (int status = 0; status < labels.length; status++) {
            addChoice(filters, options.getContext().getText(labels[status]), status,
                    collection.m1712O(), true);
        }
        listen(filters, status -> {
            collection.m1722a(status);
            collection.saveLibraryOptions();
        });
    }

    private void showSorting() {
        boolean stacked = collection.m1713P() == 2;
        heading(R.string.library_sort_direction);
        C0726cw settings = collection.m1716S();
        boolean ordered = stacked || settings.f2272c != 0;
        MaterialButtonToggleGroup direction = segmentedChoices();
        addSegment(direction, R.string.library_ascending, R.drawable.ic_library_arrow_upward,
                0, settings.f2270a ? 1 : 0, ordered, false);
        addSegment(direction, R.string.library_descending, R.drawable.ic_library_arrow_downward,
                1, settings.f2270a ? 1 : 0, ordered, false);
        listenSegments(direction, value -> {
            collection.m1716S().f2270a = value == 1;
            collection.refreshLibraryOptions();
        });
        heading(stacked ? R.string.library_stack_grouping : R.string.library_sort_by);
        showSortChoices(stacked);
    }

    private void showSortChoices(boolean stacked) {
        C0726cw settings = collection.m1716S();
        int selected = stacked ? settings.f2273d + 1000 : settings.f2272c;
        RadioGroup sorting = choices();
        for (C1006bq option : collection.buildViewOptions(options.getContext(), stacked)) {
            addChoice(sorting, option.f2967c, (Integer) option.f2969e, selected, true);
        }
        listen(sorting, value -> {
            // The existing handler also propagates folder grouping to nested stacks.
            new C0694br(collection, collection.m1714Q()).mo1736a(
                    new C1006bq(0, "", value));
            collection.saveLibraryOptions();
            if (!stacked) {
                render(1);
            }
        });
    }

    private void showDisplay() {
        heading(R.string.library_view_style);
        MaterialButtonToggleGroup display = segmentedChoices();
        int[] labels = {R.string.cover, R.string.detail, R.string.stack};
        int[] icons = {R.drawable.ic_library_view_module, R.drawable.ic_library_view_list,
                R.drawable.ic_library_collections_bookmark};
        for (int mode = 0; mode < labels.length; mode++) {
            addSegment(display, labels[mode], icons[mode], mode, collection.m1713P(),
                    mode != 2 || collection.m1715R().f2268b < 7, true);
        }
        listenSegments(display, mode -> {
            collection.m1723a(collection.m1714Q() + mode, true);
            collection.saveLibraryOptions();
            render(2);
        });
        heading(R.string.library_spacing);
        LinearLayout compactContent = cardContent();
        MaterialSwitch compact = new MaterialSwitch(options.getContext());
        compact.setText(R.string.compact_view);
        compact.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_TitleMedium);
        compact.setMinHeight(LibraryInterface.dp(options.getContext(), 56));
        compact.setChecked(collection.m1714Q() == 256);
        compact.setOnCheckedChangeListener((button, checked) -> {
            collection.m1723a(collection.m1713P() + (checked ? 256 : 0), true);
            collection.saveLibraryOptions();
        });
        compactContent.addView(compact, new LinearLayout.LayoutParams(-1, -2));
        if (collection.m1713P() == 2) {
            heading(R.string.library_stack_grouping);
            showSortChoices(true);
        }
    }

    private MaterialButtonToggleGroup segmentedChoices() {
        MaterialButtonToggleGroup group = new MaterialButtonToggleGroup(options.getContext());
        group.setSingleSelection(true);
        group.setSelectionRequired(true);
        options.addView(group, new LinearLayout.LayoutParams(-1, -2));
        return group;
    }

    private void addSegment(MaterialButtonToggleGroup group, int label, int icon,
            int value, int selected, boolean enabled, boolean iconAbove) {
        Context theme = options.getContext();
        MaterialButton button = new MaterialButton(theme, null,
                com.google.android.material.R.attr.materialButtonOutlinedStyle);
        button.setId(View.generateViewId());
        button.setTag(value);
        button.setText(label);
        button.setIconResource(icon);
        button.setIconGravity(iconAbove ? MaterialButton.ICON_GRAVITY_TEXT_TOP
                : MaterialButton.ICON_GRAVITY_TEXT_START);
        button.setIconSize(LibraryInterface.dp(theme, 24));
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        button.setMinHeight(LibraryInterface.dp(theme, iconAbove ? 88 : 56));
        button.setPadding(LibraryInterface.dp(theme, 8), LibraryInterface.dp(theme, 8),
                LibraryInterface.dp(theme, 8), LibraryInterface.dp(theme, 8));
        group.addView(button, new LinearLayout.LayoutParams(0, -2, 1));
        button.setEnabled(enabled);
        if (value == selected) {
            group.check(button.getId());
        }
    }

    private void listenSegments(MaterialButtonToggleGroup group, IntConsumer listener) {
        group.addOnButtonCheckedListener((buttons, checkedId, checked) -> {
            if (checked) {
                listener.accept((Integer) buttons.findViewById(checkedId).getTag());
            }
        });
    }

    private LinearLayout cardContent() {
        Context theme = options.getContext();
        MaterialCardView card = new MaterialCardView(theme);
        card.setRadius(LibraryInterface.dp(theme, 20));
        card.setCardElevation(0);
        card.setStrokeWidth(0);
        card.setCardBackgroundColor(MaterialColors.getColor(theme,
                com.google.android.material.R.attr.colorSurfaceContainerHigh, 0));
        LinearLayout content = new LinearLayout(theme);
        content.setOrientation(LinearLayout.VERTICAL);
        int padding = LibraryInterface.dp(theme, 16);
        content.setPadding(padding, LibraryInterface.dp(theme, 4), padding,
                LibraryInterface.dp(theme, 4));
        card.addView(content, new ViewGroup.LayoutParams(-1, -2));
        options.addView(card, new LinearLayout.LayoutParams(-1, -2));
        return content;
    }

    private RadioGroup choices() {
        RadioGroup group = new RadioGroup(options.getContext());
        group.setOrientation(RadioGroup.VERTICAL);
        cardContent().addView(group, new LinearLayout.LayoutParams(-1, -2));
        return group;
    }

    private void addChoice(RadioGroup group, CharSequence label, int value, int selected,
                           boolean enabled) {
        MaterialRadioButton button = new MaterialRadioButton(options.getContext());
        button.setId(View.generateViewId());
        button.setTag(value);
        button.setText(label);
        button.setEnabled(enabled);
        button.setMinHeight(LibraryInterface.dp(options.getContext(), 56));
        button.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_BodyLarge);
        group.addView(button, new RadioGroup.LayoutParams(-1, -2));
        button.setChecked(value == selected);
    }

    private void listen(RadioGroup group, IntConsumer listener) {
        group.setOnCheckedChangeListener((choices, checkedId) -> {
            View button = choices.findViewById(checkedId);
            if (button != null) {
                listener.accept((Integer) button.getTag());
            }
        });
    }

    private void heading(int title) {
        TextView label = new TextView(options.getContext());
        label.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_TitleSmall);
        label.setText(title);
        label.setPadding(0, LibraryInterface.dp(options.getContext(), 20), 0,
                LibraryInterface.dp(options.getContext(), 12));
        options.addView(label);
    }
}
