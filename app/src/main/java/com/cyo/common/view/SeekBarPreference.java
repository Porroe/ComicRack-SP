package com.cyo.common.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private final String f3525a;

    /* renamed from: b */
    private int f3526b;

    /* renamed from: c */
    private int f3527c;

    /* renamed from: d */
    private int f3528d;

    /* renamed from: e */
    private int f3529e;

    /* renamed from: f */
    private String f3530f;

    /* renamed from: g */
    private SeekBar f3531g;

    /* renamed from: h */
    private TextView f3532h;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3525a = getClass().getName();
        this.f3526b = 100;
        this.f3527c = 0;
        this.f3528d = 1;
        m2385a(attributeSet);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3525a = getClass().getName();
        this.f3526b = 100;
        this.f3527c = 0;
        this.f3528d = 1;
        m2385a(attributeSet);
    }

    /* renamed from: a */
    private void m2385a(AttributeSet attributeSet) {
        this.f3526b = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "max", 100);
        this.f3527c = attributeSet.getAttributeIntValue("http://schemas.cyolito.com/android", "min", 0);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.cyolito.com/android", "unit");
        this.f3530f = attributeValue != null ? attributeValue : "";
        try {
            String attributeValue2 = attributeSet.getAttributeValue("http://schemas.cyolito.com/android", "interval");
            if (attributeValue2 != null) {
                this.f3528d = Integer.parseInt(attributeValue2);
            }
        } catch (Exception e) {
            Log.e(this.f3525a, "Invalid interval value", e);
        }
    }

    @Override // android.preference.Preference
    @SuppressLint({"InlinedApi"})
    protected View onCreateView(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(super.onCreateView(viewGroup));
        try {
            this.f3531g = new SeekBar(getContext());
            if (this.f3531g.getPaddingLeft() == 0) {
                this.f3531g.setPadding(8, 0, 8, 0);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int iM2418a = C1146bm.m2418a(getContext(), 8);
            int iM2418a2 = C1146bm.m2418a(getContext(), 64);
            layoutParams.setMargins(iM2418a2, iM2418a / 2, iM2418a2, iM2418a);
            linearLayout.addView(this.f3531g, layoutParams);
            ViewGroup viewGroup2 = (ViewGroup) linearLayout.findViewById(R.id.widget_frame);
            if (viewGroup2 != null) {
                this.f3532h = new TextView(getContext());
                viewGroup2.addView(this.f3532h);
                viewGroup2.setVisibility(0);
            }
            this.f3531g.setMax(this.f3526b - this.f3527c);
            this.f3531g.setOnSeekBarChangeListener(this);
        } catch (Exception e) {
            Log.e(this.f3525a, "Error binding view: " + e.toString());
        }
        return linearLayout;
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        m2384a();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int iRound = this.f3527c + i;
        if (iRound > this.f3526b) {
            iRound = this.f3526b;
        } else if (iRound < this.f3527c) {
            iRound = this.f3527c;
        } else if (this.f3528d != 1 && iRound % this.f3528d != 0) {
            iRound = Math.round(iRound / this.f3528d) * this.f3528d;
        }
        if (!callChangeListener(Integer.valueOf(iRound))) {
            seekBar.setProgress(this.f3529e - this.f3527c);
            return;
        }
        this.f3529e = iRound;
        persistInt(iRound);
        m2384a();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        notifyChanged();
    }

    @Override // android.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 50));
    }

    @Override // android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        int iIntValue;
        if (z) {
            this.f3529e = getPersistedInt(this.f3529e);
            return;
        }
        try {
            iIntValue = ((Integer) obj).intValue();
        } catch (Exception e) {
            Log.e(this.f3525a, "Invalid default value: " + obj.toString());
            iIntValue = 0;
        }
        persistInt(iIntValue);
        this.f3529e = iIntValue;
    }

    /* renamed from: a */
    private void m2384a() {
        if (this.f3531g != null) {
            this.f3531g.setProgress(this.f3529e - this.f3527c);
        }
        if (this.f3532h != null) {
            this.f3532h.setText(String.format("%d %s", Integer.valueOf(this.f3529e), this.f3530f));
        }
    }
}
