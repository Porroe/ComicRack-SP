package com.cyo.comicrack.viewer;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v4.view.AbstractC0145af;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;

/** Material collection labels for the recovered support-library pager. */
final class MaterialCollectionTabs {
    private static final long HIDE_DELAY_MS = 3000;
    private final ViewPager pager;
    private final TabLayout tabs;
    private AbstractC0145af adapter;
    private boolean synchronizing;
    private boolean dragging;
    private final Runnable hideTabs;
    private final DataSetObserver dataObserver = new DataSetObserver() {
        @Override public void onChanged() { rebuildTabs(); }
        @Override public void onInvalidated() { rebuildTabs(); }
    };

    MaterialCollectionTabs(ViewPager pager) {
        this.pager = pager;
        Context theme = LibraryInterface.theme(pager.getContext());
        ViewGroup parent = (ViewGroup) pager.getParent();
        tabs = (TabLayout) LayoutInflater.from(theme)
                .inflate(R.layout.material_library_tabs, parent, false);
        tabs.setId(View.generateViewId());
        hideTabs = () -> tabs.setVisibility(View.GONE);
        if (parent instanceof RelativeLayout) {
            RelativeLayout.LayoutParams tabLayout = new RelativeLayout.LayoutParams(-1,
                    LibraryInterface.dp(theme, 48));
            tabLayout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            parent.addView(tabs, tabLayout);
            RelativeLayout.LayoutParams pagerLayout = (RelativeLayout.LayoutParams) pager.getLayoutParams();
            pagerLayout.addRule(RelativeLayout.ABOVE, tabs.getId());
            pager.setLayoutParams(pagerLayout);
        } else if (parent instanceof LinearLayout) {
            parent.addView(tabs, new LinearLayout.LayoutParams(-1, LibraryInterface.dp(theme, 48)));
        } else {
            throw new IllegalStateException("Collection tabs require a library pager container");
        }
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override public void onTabSelected(TabLayout.Tab tab) {
                if (!synchronizing) {
                    pager.m325a(tab.getPosition(), true);
                    showTemporarily();
                }
            }
            @Override public void onTabUnselected(TabLayout.Tab tab) {}
            @Override public void onTabReselected(TabLayout.Tab tab) {
                if (!synchronizing) { showTemporarily(); }
            }
        });
        pager.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override public void onViewAttachedToWindow(View view) {
                if (adapter != null) { adapter.m404a(dataObserver); }
                rebuildTabs();
            }
            @Override public void onViewDetachedFromWindow(View view) {
                tabs.removeCallbacks(hideTabs);
                tabs.setVisibility(View.GONE);
                if (adapter != null) { adapter.m406b(dataObserver); }
            }
        });
    }

    void setAdapter(AbstractC0145af newAdapter) {
        if (adapter != null && pager.isAttachedToWindow()) { adapter.m406b(dataObserver); }
        adapter = newAdapter;
        if (adapter != null && pager.isAttachedToWindow()) { adapter.m404a(dataObserver); }
        rebuildTabs();
    }

    private void rebuildTabs() {
        synchronizing = true;
        try {
            tabs.removeAllTabs();
            if (adapter != null) {
                for (int position = 0; position < adapter.mo408c(); position++) {
                    tabs.addTab(tabs.newTab().setText(adapter.mo405b(position)), false);
                }
                selectCurrentPage(pager.getCurrentItem());
            }
        } finally {
            synchronizing = false;
        }
        if (tabs.getTabCount() <= 1) {
            tabs.removeCallbacks(hideTabs);
            tabs.setVisibility(View.GONE);
        }
    }

    void onPageSelected(int position) {
        selectCurrentPage(position);
    }

    private void selectCurrentPage(int position) {
        if (position < 0 || position >= tabs.getTabCount()) { return; }
        boolean wasSynchronizing = synchronizing;
        synchronizing = true;
        try {
            tabs.selectTab(tabs.getTabAt(position));
        } finally {
            synchronizing = wasSynchronizing;
        }
    }

    void onPageScrolled(int position, float offset) {
        if (tabs.getTabCount() > 1) {
            tabs.setScrollPosition(position, offset, dragging);
        }
    }

    void onScrollStateChanged(int state) {
        dragging = state == 1;
        if (dragging) {
            showTemporarily();
            tabs.removeCallbacks(hideTabs);
        } else if (state == 0 && tabs.getVisibility() == View.VISIBLE) {
            scheduleHide();
        }
    }

    private void showTemporarily() {
        if (tabs.getTabCount() > 1) {
            tabs.setVisibility(View.VISIBLE);
            scheduleHide();
        }
    }

    private void scheduleHide() {
        tabs.removeCallbacks(hideTabs);
        tabs.postDelayed(hideTabs, HIDE_DELAY_MS);
    }
}
