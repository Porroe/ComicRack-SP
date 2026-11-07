package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.AbstractC0145af;
import android.support.v4.view.InterfaceC0189bw;
import android.support.v4.view.ViewPager;
import com.cyo.common.C0951ag;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.tabs.TabLayout;

final class AboutDialog {
    private AboutDialog() {}

    static void show(Activity activity, Runnable onDismiss) {
        Context theme = LibraryInterface.theme(activity);
        LinearLayout content = new LinearLayout(theme);
        content.setOrientation(LinearLayout.VERTICAL);
        int padding = LibraryInterface.dp(theme, 20);
        content.setPadding(padding, padding, padding, 0);
        LinearLayout heading = new LinearLayout(theme);
        heading.setGravity(android.view.Gravity.CENTER_VERTICAL);
        ImageView icon = new ImageView(theme);
        icon.setImageResource(R.drawable.icon);
        icon.setImportantForAccessibility(android.view.View.IMPORTANT_FOR_ACCESSIBILITY_NO);
        heading.addView(icon, new LinearLayout.LayoutParams(
                LibraryInterface.dp(theme, 48), LibraryInterface.dp(theme, 48)));
        LinearLayout identity = new LinearLayout(theme);
        identity.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams identityLayout = new LinearLayout.LayoutParams(0, -2, 1);
        identityLayout.setMarginStart(LibraryInterface.dp(theme, 16));
        heading.addView(identity, identityLayout);
        TextView name = new TextView(theme);
        name.setText(R.string.app_name);
        name.setTextAppearance(com.google.android.material.R.style.TextAppearance_Material3_HeadlineSmall);
        identity.addView(name);
        TextView version = new TextView(theme);
        version.setText(activity.getString(R.string.settings_about_summary, C0951ag.m2003d(activity)));
        identity.addView(version);
        content.addView(heading);
        TextView description = new TextView(theme);
        description.setText(R.string.about_sp_description);
        description.setPadding(0, LibraryInterface.dp(theme, 12), 0, LibraryInterface.dp(theme, 8));
        content.addView(description);

        TabLayout tabs = new TabLayout(theme);
        tabs.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        tabs.addTab(tabs.newTab().setText(R.string.about));
        tabs.addTab(tabs.newTab().setText(R.string.history));
        content.addView(tabs, new LinearLayout.LayoutParams(-1, -2));
        ViewPager pages = new ViewPager(theme);
        int height = Math.min(LibraryInterface.dp(theme, 280),
                Math.round(theme.getResources().getDisplayMetrics().heightPixels * 0.30f));
        content.addView(pages, new LinearLayout.LayoutParams(-1, height));
        pages.setAdapter(new AbstractC0145af() {
            @Override
            public int mo408c() {
                return 2;
            }

            @Override
            public Object mo249a(ViewGroup container, int position) {
                View page = C0649a.createAboutContent(theme,
                        position == 0 ? C0805fu.about : C0805fu.changes);
                container.addView(page);
                return page;
            }

            @Override
            public void mo252a(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }

            @Override
            public boolean mo253a(View view, Object object) {
                return view == object;
            }
        });
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pages.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        pages.setOnPageChangeListener(new InterfaceC0189bw() {
            @Override
            public void mo413a(int position) {
                TabLayout.Tab tab = tabs.getTabAt(position);
                if (tab != null && tabs.getSelectedTabPosition() != position) {
                    tabs.selectTab(tab);
                }
            }

            @Override
            public void mo414a(int position, float offset) {}

            @Override
            public void mo416b(int state) {}
        });
        androidx.appcompat.app.AlertDialog dialog = new MaterialAlertDialogBuilder(theme)
                .setView(content)
                .setPositiveButton(R.string.close, null)
                .setNeutralButton(R.string.help, new DialogInterfaceOnClickListenerC0676b(activity))
                .create();
        android.app.Application.ActivityLifecycleCallbacks lifecycle =
                new android.app.Application.ActivityLifecycleCallbacks() {
                    @Override
                    public void onActivityDestroyed(Activity owner) {
                        if (owner == activity) {
                            dialog.dismiss();
                        }
                    }

                    @Override
                    public void onActivityCreated(Activity owner, android.os.Bundle state) {}

                    @Override
                    public void onActivityStarted(Activity owner) {}

                    @Override
                    public void onActivityResumed(Activity owner) {}

                    @Override
                    public void onActivityPaused(Activity owner) {}

                    @Override
                    public void onActivityStopped(Activity owner) {}

                    @Override
                    public void onActivitySaveInstanceState(Activity owner, android.os.Bundle state) {}
                };
        activity.getApplication().registerActivityLifecycleCallbacks(lifecycle);
        dialog.setOnDismissListener(ignored -> {
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycle);
            if (onDismiss != null && !activity.isDestroyed() && !activity.isFinishing()) {
                onDismiss.run();
            }
        });
        dialog.show();
    }
}
