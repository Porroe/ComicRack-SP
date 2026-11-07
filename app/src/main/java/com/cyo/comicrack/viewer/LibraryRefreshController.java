package com.cyo.comicrack.viewer;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.lang.ref.WeakReference;

final class LibraryRefreshController {
    private final ComicRackApplication application;
    private WeakReference<ActivityC0881ip> host = new WeakReference<>(null);
    private boolean running;
    private boolean manual;
    private boolean failure;
    private boolean libraryChanged;
    private int progress = -1;
    private AlertDialog dialog;
    private LinearProgressIndicator indicator;
    private TextView percentage;

    LibraryRefreshController(ComicRackApplication application) {
        this.application = application;
    }

    void attach(ActivityC0881ip activity) {
        if (host.get() != activity) {
            dismissDialog();
            host = new WeakReference<>(activity);
        }
        render();
    }

    void detach(ActivityC0881ip activity) {
        if (host.get() == activity) {
            dismissDialog();
            host.clear();
        }
    }

    void begin(boolean showProgress) {
        running = true;
        manual = showProgress;
        failure = false;
        progress = -1;
        render();
    }

    void update(int value) {
        progress = Math.max(0, Math.min(100, value));
        render();
    }

    void finish(boolean success) {
        running = false;
        libraryChanged = success;
        failure = manual && !success;
        dismissDialog();
        render();
    }

    private void render() {
        ActivityC0881ip activity = host.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (libraryChanged && activity.m1881u()) {
            libraryChanged = false;
            activity.m1880t();
        }
        if (running && manual) {
            if (dialog == null) {
                Context theme = LibraryInterface.theme(activity);
                LinearLayout content = new LinearLayout(theme);
                content.setOrientation(LinearLayout.VERTICAL);
                int padding = LibraryInterface.dp(theme, 24);
                content.setPadding(padding, padding, padding, padding);
                indicator = new LinearProgressIndicator(theme);
                indicator.setIndeterminate(true);
                content.addView(indicator, new LinearLayout.LayoutParams(-1, -2));
                percentage = new TextView(theme);
                percentage.setGravity(android.view.Gravity.END);
                percentage.setPadding(0, LibraryInterface.dp(theme, 12), 0, 0);
                content.addView(percentage);
                dialog = new MaterialAlertDialogBuilder(theme)
                        .setTitle(R.string.library_refresh_title).setView(content)
                        .setCancelable(false).create();
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
            }
            if (progress >= 0) {
                indicator.setProgressCompat(progress, true);
                percentage.setText(java.text.NumberFormat.getPercentInstance()
                        .format(progress / 100.0));
            }
        } else if (failure && dialog == null) {
            dialog = new MaterialAlertDialogBuilder(LibraryInterface.theme(activity))
                    .setTitle(R.string.library_refresh_title)
                    .setMessage(R.string.library_refresh_failed)
                    .setPositiveButton(R.string.library_retry, (ignored, button) -> {
                        failure = false;
                        dismissDialog();
                        application.m1429a(activity);
                    })
                    .setNegativeButton(R.string.close, (ignored, button) -> {
                        failure = false;
                        dialog = null;
                    }).create();
            dialog.setOnCancelListener(ignored -> {
                failure = false;
                dialog = null;
            });
            dialog.show();
        }
    }

    private void dismissDialog() {
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }
        indicator = null;
        percentage = null;
    }
}
