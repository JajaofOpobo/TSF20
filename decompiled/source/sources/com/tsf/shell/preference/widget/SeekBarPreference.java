package com.tsf.shell.preference.widget;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tsf.b;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference implements SeekBar.OnSeekBarChangeListener {
    private final String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    private SeekBar h;
    private TextView i;
    private boolean j;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getClass().getName();
        this.b = 100;
        this.c = 0;
        this.d = 1;
        this.f = "";
        this.g = "";
        this.j = false;
        a(context, attributeSet);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getClass().getName();
        this.b = 100;
        this.c = 0;
        this.d = 1;
        this.f = "";
        this.g = "";
        this.j = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a(attributeSet);
        this.h = new SeekBar(context, attributeSet);
        this.h.setMax(this.b - this.c);
        this.h.setOnSeekBarChangeListener(this);
    }

    @Override // android.preference.Preference
    public void onDependencyChanged(Preference preference, boolean z) {
        if (this.j) {
            super.onDependencyChanged(preference, !z);
        } else {
            super.onDependencyChanged(preference, z);
        }
        if (this.h != null) {
            if (this.j) {
                this.h.setEnabled(z);
            } else {
                this.h.setEnabled(z ? false : true);
            }
        }
    }

    private void a(AttributeSet attributeSet) {
        this.b = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "max", 100);
        this.c = attributeSet.getAttributeIntValue("http://tsfui.com", "min", 0);
        this.f = a(attributeSet, "http://tsfui.com", "unitsLeft", "");
        this.g = a(attributeSet, "http://tsfui.com", "unitsRight", a(attributeSet, "http://tsfui.com", "units", ""));
        this.j = a(attributeSet, "http://tsfui.com", "oppositeDependency", false);
        try {
            String attributeValue = attributeSet.getAttributeValue("http://tsfui.com", "interval");
            if (attributeValue != null) {
                this.d = Integer.parseInt(attributeValue);
            }
        } catch (Exception e) {
            Log.e(this.a, "Invalid interval value", e);
        }
    }

    private String a(AttributeSet attributeSet, String str, String str2, String str3) {
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        return attributeValue == null ? str3 : attributeValue;
    }

    private boolean a(AttributeSet attributeSet, String str, String str2, boolean z) {
        return attributeSet.getAttributeBooleanValue(str, str2, z);
    }

    @Override // android.preference.Preference
    protected View onCreateView(ViewGroup viewGroup) {
        try {
            return (RelativeLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(b.g.seek_bar_preference, viewGroup, false);
        } catch (Exception e) {
            Log.e(this.a, "Error creating seek bar preference", e);
            return null;
        }
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        try {
            ViewParent parent = this.h.getParent();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(b.e.seekBarPrefBarContainer);
            if (parent != viewGroup) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.h);
                }
                viewGroup.removeAllViews();
                viewGroup.addView(this.h, -1, -2);
            }
        } catch (Exception e) {
            Log.e(this.a, "Error binding view: " + e.toString());
        }
        a(view);
    }

    protected void a(View view) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.i = (TextView) relativeLayout.findViewById(b.e.seekBarPrefValue);
            this.i.setText(String.valueOf(this.e));
            this.i.setMinimumWidth(30);
            this.h.setProgress(this.e - this.c);
            ((TextView) relativeLayout.findViewById(b.e.seekBarPrefUnitsRight)).setText(this.g);
            ((TextView) relativeLayout.findViewById(b.e.seekBarPrefUnitsLeft)).setText(this.f);
        } catch (Exception e) {
            Log.e(this.a, "Error updating seek bar preference", e);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.c + i;
        if (i2 > this.b) {
            i2 = this.b;
        } else if (i2 < this.c) {
            i2 = this.c;
        } else if (this.d != 1 && i2 % this.d != 0) {
            i2 = Math.round(i2 / this.d) * this.d;
        }
        if (!callChangeListener(Integer.valueOf(i2))) {
            seekBar.setProgress(this.e - this.c);
            return;
        }
        this.e = i2;
        if (this.i != null) {
            this.i.setText(String.valueOf(i2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        notifyChanged();
    }
}
