package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

final class SystemBarInsets {
    private SystemBarInsets() {}

    static void applyToContent(Activity activity) {
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        View content = activity.findViewById(android.R.id.content);
        int left = content.getPaddingLeft();
        int top = content.getPaddingTop();
        int right = content.getPaddingRight();
        int bottom = content.getPaddingBottom();
        content.setOnApplyWindowInsetsListener((view, windowInsets) -> {
            Insets bars = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            view.setPadding(left + bars.left, top + bars.top, right + bars.right, bottom + bars.bottom);
            return WindowInsets.CONSUMED;
        });
        content.requestApplyInsets();
    }
}
