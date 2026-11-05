package com.cyo.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class EllipsizingTextView extends TextView {

    /* renamed from: a */
    private final List f3495a;

    /* renamed from: b */
    private boolean f3496b;

    /* renamed from: c */
    private boolean f3497c;

    /* renamed from: d */
    private boolean f3498d;

    /* renamed from: e */
    private String f3499e;

    /* renamed from: f */
    private int f3500f;

    /* renamed from: g */
    private float f3501g;

    /* renamed from: h */
    private float f3502h;

    public EllipsizingTextView(Context context) {
        super(context);
        this.f3495a = new ArrayList();
        this.f3500f = -1;
        this.f3501g = 1.0f;
        this.f3502h = 0.0f;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3495a = new ArrayList();
        this.f3500f = -1;
        this.f3501g = 1.0f;
        this.f3502h = 0.0f;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3495a = new ArrayList();
        this.f3500f = -1;
        this.f3501g = 1.0f;
        this.f3502h = 0.0f;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f3500f = i;
        this.f3497c = true;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.f3500f;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        this.f3502h = f;
        this.f3501g = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f3498d) {
            this.f3499e = charSequence.toString();
            this.f3497c = true;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3497c = true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z;
        String str;
        int iLastIndexOf;
        if (this.f3497c) {
            super.setEllipsize(null);
            int height = getHeight();
            String str2 = this.f3499e;
            Layout layoutM2373a = m2373a(str2);
            int lineCount = layoutM2373a.getLineCount();
            int iMin = getMaxLines() <= 0 ? lineCount : Math.min(getMaxLines(), lineCount);
            while (iMin > 0 && layoutM2373a.getLineBottom(iMin - 1) > height) {
                iMin--;
            }
            if (iMin <= 0 || lineCount <= iMin) {
                z = false;
                str = str2;
            } else {
                String strTrim = this.f3499e.substring(0, layoutM2373a.getLineEnd(iMin - 1)).trim();
                while (m2373a(String.valueOf(strTrim) + "...").getLineCount() > iMin && (iLastIndexOf = strTrim.lastIndexOf(32)) != -1) {
                    strTrim = strTrim.substring(0, iLastIndexOf);
                }
                str = String.valueOf(strTrim) + "...";
                z = true;
            }
            if (!str.equals(getText())) {
                this.f3498d = true;
                try {
                    setText(str);
                } finally {
                    this.f3498d = false;
                }
            }
            this.f3497c = false;
            if (z != this.f3496b) {
                this.f3496b = z;
                Iterator it = this.f3495a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Layout m2373a(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f3501g, this.f3502h, false);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }
}
