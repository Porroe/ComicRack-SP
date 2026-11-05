package com.cyo.common.view;

import android.content.Context;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class DialogSeekBarPreference extends DialogPreference implements SeekBar.OnSeekBarChangeListener {

    // The APK has no constructor for this class.
    private DialogSeekBarPreference(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        throw new AssertionError("No constructor in the original APK");
    }

    /* renamed from: a */
    private SeekBar f3486a;

    /* renamed from: b */
    private TextView f3487b;

    /* renamed from: c */
    private TextView f3488c;

    /* renamed from: d */
    private Context f3489d;

    /* renamed from: e */
    private String f3490e;

    /* renamed from: f */
    private String f3491f;

    /* renamed from: g */
    private int f3492g;

    /* renamed from: h */
    private int f3493h;

    /* renamed from: i */
    private int f3494i;

    @Override // android.preference.DialogPreference
    protected View onCreateDialogView() {
        LinearLayout linearLayout = new LinearLayout(this.f3489d);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(16, 16, 16, 16);
        this.f3487b = new TextView(this.f3489d);
        if (this.f3490e != null) {
            this.f3487b.setText(this.f3490e);
        }
        linearLayout.addView(this.f3487b);
        this.f3488c = new TextView(this.f3489d);
        this.f3488c.setGravity(1);
        this.f3488c.setTextSize(22.0f);
        this.f3488c.setPadding(12, 0, 12, 12);
        linearLayout.addView(this.f3488c, new LinearLayout.LayoutParams(-1, -2));
        this.f3486a = new SeekBar(this.f3489d);
        this.f3486a.setOnSeekBarChangeListener(this);
        linearLayout.addView(this.f3486a, new LinearLayout.LayoutParams(-1, -2));
        if (shouldPersist()) {
            this.f3494i = getPersistedInt(this.f3492g);
        }
        this.f3486a.setMax(this.f3493h);
        this.f3486a.setProgress(this.f3494i);
        return linearLayout;
    }

    @Override // android.preference.DialogPreference
    protected void onBindDialogView(View view) {
        super.onBindDialogView(view);
        this.f3486a.setMax(this.f3493h);
        this.f3486a.setProgress(this.f3494i);
    }

    @Override // android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        if (z) {
            this.f3494i = shouldPersist() ? getPersistedInt(this.f3492g) : 0;
        } else {
            this.f3494i = ((Integer) obj).intValue();
        }
    }

    @Override // android.preference.DialogPreference
    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z && shouldPersist()) {
            persistInt(this.f3494i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String strValueOf = String.valueOf(i);
        TextView textView = this.f3488c;
        if (this.f3491f != null) {
            strValueOf = strValueOf.concat(this.f3491f);
        }
        textView.setText(strValueOf);
        callChangeListener(Integer.valueOf(i));
        this.f3494i = i;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
