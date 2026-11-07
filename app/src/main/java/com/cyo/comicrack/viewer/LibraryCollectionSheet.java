package com.cyo.comicrack.viewer;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.cyo.common.view.FastThumbView;
import com.cyo.comicrack.p019a.C0572ah;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C1097n;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import android.widget.TextView;
import com.cyo.comicrack.p019a.C0575ak;
import com.cyo.comicrack.p019a.C0635m;
import com.cyo.comicrack.p019a.InterfaceC0584at;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.tabs.TabLayout;

final class LibraryCollectionSheet {
    private final AbstractActivityC0773ep activity;
    private BottomSheetDialog dialog;
    private EditText search;
    private RecyclerView entries;
    private final List<CollectionRow> rows = new ArrayList<>();
    private final CollectionAdapter adapter = new CollectionAdapter();
    private TabLayout tabs;
    private MaterialButton back;
    private TextView title;
    private C0575ak category;
    private int selectedTab;

    LibraryCollectionSheet(AbstractActivityC0773ep activity) {
        this.activity = activity;
    }

    boolean isShowing() {
        return dialog != null && dialog.isShowing();
    }

    void show() {
        if (isShowing()) {
            return;
        }
        Context theme = LibraryInterface.theme(activity);
        dialog = new BottomSheetDialog(theme);
        dialog.setTitle(R.string.library_browse);
        LinearLayout sheet = new LinearLayout(theme);
        sheet.setOrientation(LinearLayout.VERTICAL);
        sheet.setFocusableInTouchMode(true);
        sheet.addView(new BottomSheetDragHandleView(theme));
        LinearLayout heading = new LinearLayout(theme);
        heading.setGravity(android.view.Gravity.CENTER_VERTICAL);
        heading.setPadding(LibraryInterface.dp(theme, 16), 0, LibraryInterface.dp(theme, 8), 0);
        back = iconButton(theme, R.drawable.ic_settings_arrow_back, R.string.settings_back);
        back.setOnClickListener(view -> {
            category = null;
            render();
        });
        heading.addView(back);
        title = new TextView(theme);
        title.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_TitleLarge);
        heading.addView(title, new LinearLayout.LayoutParams(0, -2, 1));
        MaterialButton refresh = iconButton(theme, R.drawable.ic_library_refresh, R.string.refresh_comics_library);
        refresh.setOnClickListener(view -> {
            dismiss();
            ComicRackApplication.f1954i.m1429a(activity);
        });
        heading.addView(refresh);
        sheet.addView(heading, new LinearLayout.LayoutParams(-1, -2));

        View searchView = LayoutInflater.from(theme).inflate(R.layout.material_library_search, sheet, false);
        search = searchView.findViewById(R.id.materialLibrarySearch);
        C0575ak current = activity.getDisplayedLibraryCollection();
        if (C0635m.isSearchResult(current)) {
            search.setText(current.mo1211f());
        }
        search.setOnEditorActionListener((field, action, event) -> {
            boolean enter = event != null && event.getKeyCode() == KeyEvent.KEYCODE_ENTER
                    && event.getAction() == KeyEvent.ACTION_UP;
            if (action == EditorInfo.IME_ACTION_SEARCH || enter) {
                submit(search.getText().toString());
                return true;
            }
            return false;
        });
        sheet.addView(searchView);
        tabs = new TabLayout(theme);
        tabs.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        for (int label : new int[] {R.string.library_browse_tab, R.string.library_collections_tab,
                R.string.library_past_searches_tab}) {
            tabs.addTab(tabs.newTab().setText(label), false);
        }
        sheet.addView(tabs, new LinearLayout.LayoutParams(-1, -2));
        entries = new RecyclerView(theme);
        entries.setLayoutManager(new LinearLayoutManager(theme));
        entries.setAdapter(adapter);
        entries.setClipToPadding(false);
        int padding = LibraryInterface.dp(theme, 12);
        entries.setPadding(padding, padding, padding, padding);
        sheet.addView(entries, new LinearLayout.LayoutParams(-1, 0, 1));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                selectedTab = tab.getPosition();
                category = null;
                render();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        tabs.selectTab(tabs.getTabAt(selectedTab));
        render();
        sheet.requestFocus();
        dialog.setContentView(sheet);
        dialog.getBehavior().setMaxWidth(LibraryInterface.dp(theme, 640));
        dialog.setOnShowListener(ignored -> {
            View parent = (View) sheet.getParent();
            int availableHeight = ((View) parent.getParent()).getHeight();
            android.graphics.Rect windowBounds = new android.graphics.Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(windowBounds);
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
        dialog.setOnDismissListener(ignored -> hideKeyboard());
        dialog.show();
    }

    void dismiss() {
        if (dialog != null) {
            hideKeyboard();
            dialog.dismiss();
        }
    }

    private void hideKeyboard() {
        if (search != null) {
            activity.getSystemService(InputMethodManager.class)
                    .hideSoftInputFromWindow(search.getWindowToken(), 0);
            search.clearFocus();
        }
    }

    private void submit(String query) {
        query = query.trim();
        if (query.isEmpty()) {
            return;
        }
        activity.submitLibrarySearch(query);
        dismiss();
    }

    private void render() {
        rows.clear();
        back.setVisibility(category == null ? View.GONE : View.VISIBLE);
        tabs.setVisibility(category == null ? View.VISIBLE : View.GONE);
        title.setText(category == null ? activity.getText(R.string.library) : category.mo1211f());
        C0635m library = ComicRackApplication.f1954i.m1438c();
        if (library == null) {
            return;
        }
        if (selectedTab == 2) {
            java.util.List history = library.m1394a();
            if (history.isEmpty()) {
                addRow(activity.getText(R.string.library_no_searches), "", false, null, () -> {});
            }
            for (Object value : history) {
                String query = (String) value;
                addRow(query, "", false, null, () -> {
                    search.setText(query);
                    submit(query);
                });
            }
            updateRows();
            return;
        }
        C0575ak parent = category;
        if (parent == null) {
            parent = selectedTab == 1 && library.m1987y() > 0
                    ? (C0575ak) library.m1983d(0) : library;
        }
        for (Object value : parent.m1986x()) {
            if (!(value instanceof C0575ak)) {
                continue;
            }
            C0575ak entry = (C0575ak) value;
            if (selectedTab == 0 && category == null && (entry == library.m1983d(0) || entry.f1751q)) {
                continue;
            }
            if (entry instanceof InterfaceC0584at) {
                ((InterfaceC0584at) entry).mo1252j();
            }
            C0575ak current = activity.getDisplayedLibraryCollection();
            boolean selected = current != null && entry.f1750p.equals(current.f1750p);
            CharSequence description = selectedTab == 0 && category == null
                    ? entry.mo1212g() : C0635m.m1387b(entry.m1987y());
            addRow(entry.mo1211f(), description, selected,
                    selectedTab == 0 && category == null ? null : entry,
                    browseCategoryIcon(entry.f1750p), () -> {
                if (selectedTab == 0 && category == null) {
                    category = entry;
                    render();
                } else {
                    search.getText().clear();
                    activity.selectLibraryCollection(entry);
                    dismiss();
                }
            });
        }
        updateRows();
    }

    private void updateRows() {
        adapter.notifyDataSetChanged();
        entries.scrollToPosition(0);
    }

    private void addRow(CharSequence name, CharSequence description, boolean selected,
            C0575ak collection, Runnable action) {
        addRow(name, description, selected, collection,
                selectedTab == 2 ? R.drawable.ic_library_search : R.drawable.ic_library_books, action);
    }

    private void addRow(CharSequence name, CharSequence description, boolean selected,
            C0575ak collection, int iconResource, Runnable action) {
        rows.add(new CollectionRow(name, description, selected, collection, iconResource, action));
    }

    static int browseCategoryIcon(String categoryId) {
        switch (categoryId) {
            case "3D8E0FCA-079F-4E69-B2C5-56BE06153769": return R.drawable.ic_library_books;
            case "3D8E0FCA-079F-4E69-B2C6-56BE06153769": return R.drawable.ic_library_auto_stories;
            case "3D8E0FCA-079F-4E69-B2CB-56BE06153769": return R.drawable.ic_settings_folder_open;
            case "3D8E0FCA-079F-4E69-B2CC-56BE06153769": return R.drawable.ic_library_business;
            case "3D8E0FCA-079F-4E69-B2C7-56BE06153769": return R.drawable.ic_library_calendar_month;
            case "3D8E0FCA-079F-4E69-B2C8-56BE06153769": return R.drawable.ic_library_edit;
            case "3D8E0FCA-079F-4E69-B2C9-56BE06153769": return R.drawable.ic_library_palette;
            case "3D8E0FCA-079F-4E69-B2CA-56BE06153769": return R.drawable.ic_library_category;
            default: return R.drawable.ic_library_books;
        }
    }

    private static final class CollectionRow {
        final CharSequence name;
        final CharSequence description;
        final boolean selected;
        final C0575ak collection;
        final int iconResource;
        final Runnable action;

        CollectionRow(CharSequence name, CharSequence description, boolean selected,
                C0575ak collection, int iconResource, Runnable action) {
            this.name = name;
            this.description = description;
            this.selected = selected;
            this.collection = collection;
            this.iconResource = iconResource;
            this.action = action;
        }
    }

    private final class CollectionAdapter extends RecyclerView.Adapter<CollectionHolder> {
        @Override
        public CollectionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new CollectionHolder(parent.getContext());
        }

        @Override
        public int getItemCount() {
            return rows.size();
        }

        @Override
        public void onBindViewHolder(CollectionHolder holder, int position) {
            CollectionRow row = rows.get(position);
            holder.clearCovers();
            Context theme = holder.itemView.getContext();
            boolean preview = row.collection != null;
            holder.content.setMinimumHeight(LibraryInterface.dp(theme, preview ? 112 : 64));
            holder.preview.setVisibility(preview ? View.VISIBLE : View.GONE);
            holder.icon.setVisibility(preview ? View.GONE : View.VISIBLE);
            holder.icon.setImageResource(row.iconResource);
            holder.name.setText(row.name);
            holder.summary.setText(row.description);
            holder.summary.setVisibility(row.description == null || row.description.length() == 0
                    ? View.GONE : View.VISIBLE);
            holder.card.setCardBackgroundColor(MaterialColors.getColor(theme, row.selected
                    ? com.google.android.material.R.attr.colorSecondaryContainer
                    : com.google.android.material.R.attr.colorSurfaceContainerLow, 0));
            holder.card.setContentDescription(row.selected
                    ? row.name + ", " + activity.getString(R.string.library_selected) : null);
            holder.card.setOnClickListener(view -> row.action.run());
            if (preview) {
                int count = Math.min(3, row.collection.m1987y());
                List covers = C1097n.m2372a(row.collection.m1986x(), count, new Random(count));
                for (int index = 0; index < count; index++) {
                    FastThumbView cover = holder.covers[index];
                    cover.setVisibility(View.VISIBLE);
                    Object comic = covers.get(index);
                    if (comic instanceof C0572ah) {
                        ((C0572ah) comic).mo1219a(cover, 128, C0628f.m1366c()
                                .m1914a(C0802fr.page_thumbnail_image_file_error));
                    }
                }
                if (count == 0) {
                    holder.covers[0].setVisibility(View.VISIBLE);
                }
            }
        }

        @Override
        public void onViewRecycled(CollectionHolder holder) {
            holder.clearCovers();
            holder.card.setOnClickListener(null);
        }
    }

    private static final class CollectionHolder extends RecyclerView.ViewHolder {
        final MaterialCardView card;
        final LinearLayout content;
        final FrameLayout preview;
        final FastThumbView[] covers = new FastThumbView[3];
        final android.widget.ImageView icon;
        final TextView name;
        final TextView summary;

        CollectionHolder(Context theme) {
            super(new MaterialCardView(theme));
            card = (MaterialCardView) itemView;
            RecyclerView.LayoutParams rowLayout = new RecyclerView.LayoutParams(-1, -2);
            rowLayout.bottomMargin = LibraryInterface.dp(theme, 8);
            card.setLayoutParams(rowLayout);
            card.setCardElevation(0);
            content = new LinearLayout(theme);
            content.setGravity(android.view.Gravity.CENTER_VERTICAL);
            int padding = LibraryInterface.dp(theme, 8);
            content.setPadding(padding, padding, padding * 2, padding);
            card.addView(content, new ViewGroup.LayoutParams(-1, -2));
            preview = new FrameLayout(theme);
            preview.setImportantForAccessibility(View.IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS);
            content.addView(preview, new LinearLayout.LayoutParams(
                    LibraryInterface.dp(theme, 80), LibraryInterface.dp(theme, 96)));
            for (int index = 0; index < covers.length; index++) {
                FastThumbView cover = new FastThumbView(theme);
                cover.setShade(true);
                cover.setBackgroundResource(R.drawable.library_list_empty_cover);
                FrameLayout.LayoutParams coverLayout = new FrameLayout.LayoutParams(
                        LibraryInterface.dp(theme, 56), LibraryInterface.dp(theme, 80));
                coverLayout.leftMargin = LibraryInterface.dp(theme, index * 8);
                coverLayout.topMargin = LibraryInterface.dp(theme, index * 8);
                preview.addView(cover, coverLayout);
                covers[index] = cover;
            }
            icon = new android.widget.ImageView(theme);
            icon.setImageTintList(android.content.res.ColorStateList.valueOf(MaterialColors.getColor(
                    theme, com.google.android.material.R.attr.colorOnSurfaceVariant, 0)));
            content.addView(icon, new LinearLayout.LayoutParams(
                    LibraryInterface.dp(theme, 32), LibraryInterface.dp(theme, 32)));
            LinearLayout text = new LinearLayout(theme);
            text.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams textLayout = new LinearLayout.LayoutParams(0, -2, 1);
            textLayout.leftMargin = LibraryInterface.dp(theme, 16);
            content.addView(text, textLayout);
            name = new TextView(theme);
            name.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_TitleMedium);
            summary = new TextView(theme);
            summary.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_BodyMedium);
            text.addView(name);
            text.addView(summary);
        }

        void clearCovers() {
            for (FastThumbView cover : covers) {
                cover.setTag(null);
                cover.setImageDrawable(null);
                cover.m2377a(null, false);
                cover.setVisibility(View.GONE);
            }
        }
    }

    private MaterialButton iconButton(Context theme, int icon, int label) {
        MaterialButton button = new MaterialButton(theme, null,
                com.google.android.material.R.attr.materialIconButtonStyle);
        button.setIconResource(icon);
        button.setContentDescription(activity.getText(label));
        button.setLayoutParams(new LinearLayout.LayoutParams(
                LibraryInterface.dp(theme, 48), LibraryInterface.dp(theme, 48)));
        return button;
    }
}
