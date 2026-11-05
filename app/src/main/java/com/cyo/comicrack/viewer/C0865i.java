package com.cyo.comicrack.viewer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.i */
/* loaded from: classes.dex */
public final class C0865i extends TextView {
    public C0865i(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text = getText();
        if (text instanceof Spanned) {
            Spannable spannable = (Spannable) text;
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int totalPaddingLeft = x - getTotalPaddingLeft();
                int totalPaddingTop = y - getTotalPaddingTop();
                int scrollX = totalPaddingLeft + getScrollX();
                int scrollY = totalPaddingTop + getScrollY();
                Layout layout = getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        clickableSpanArr[0].onClick(this);
                    } else if (action == 0) {
                        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                    }
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
