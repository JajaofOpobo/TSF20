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
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private final String f13330a;

    /* renamed from: b */
    private int f13331b;

    /* renamed from: c */
    private int f13332c;

    /* renamed from: d */
    private int f13333d;

    /* renamed from: e */
    private int f13334e;

    /* renamed from: f */
    private String f13335f;

    /* renamed from: g */
    private String f13336g;

    /* renamed from: h */
    private SeekBar f13337h;

    /* renamed from: i */
    private TextView f13338i;

    /* renamed from: j */
    private boolean f13339j;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13330a = getClass().getName();
        this.f13331b = 100;
        this.f13332c = 0;
        this.f13333d = 1;
        this.f13335f = "";
        this.f13336g = "";
        this.f13339j = false;
        m788a(context, attributeSet);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13330a = getClass().getName();
        this.f13331b = 100;
        this.f13332c = 0;
        this.f13333d = 1;
        this.f13335f = "";
        this.f13336g = "";
        this.f13339j = false;
        m788a(context, attributeSet);
    }

    /* renamed from: a */
    private void m788a(Context context, AttributeSet attributeSet) {
        m787a(attributeSet);
        this.f13337h = new SeekBar(context, attributeSet);
        this.f13337h.setMax(this.f13331b - this.f13332c);
        this.f13337h.setOnSeekBarChangeListener(this);
    }

    @Override // android.preference.Preference
    public void onDependencyChanged(Preference preference, boolean z) {
        if (this.f13339j) {
            super.onDependencyChanged(preference, !z);
        } else {
            super.onDependencyChanged(preference, z);
        }
        if (this.f13337h != null) {
            if (this.f13339j) {
                this.f13337h.setEnabled(z);
            } else {
                this.f13337h.setEnabled(z ? false : true);
            }
        }
    }

    /* renamed from: a */
    private void m787a(AttributeSet attributeSet) {
        this.f13331b = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "max", 100);
        this.f13332c = attributeSet.getAttributeIntValue("http://tsfui.com", "min", 0);
        this.f13335f = m786a(attributeSet, "http://tsfui.com", "unitsLeft", "");
        this.f13336g = m786a(attributeSet, "http://tsfui.com", "unitsRight", m786a(attributeSet, "http://tsfui.com", "units", ""));
        this.f13339j = m785a(attributeSet, "http://tsfui.com", "oppositeDependency", false);
        try {
            String attributeValue = attributeSet.getAttributeValue("http://tsfui.com", "interval");
            if (attributeValue != null) {
                this.f13333d = Integer.parseInt(attributeValue);
            }
        } catch (Exception e) {
            Log.e(this.f13330a, "Invalid interval value", e);
        }
    }

    /* renamed from: a */
    private String m786a(AttributeSet attributeSet, String str, String str2, String str3) {
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        return attributeValue == null ? str3 : attributeValue;
    }

    /* renamed from: a */
    private boolean m785a(AttributeSet attributeSet, String str, String str2, boolean z) {
        return attributeSet.getAttributeBooleanValue(str, str2, z);
    }

    @Override // android.preference.Preference
    protected View onCreateView(ViewGroup viewGroup) {
        try {
            return (RelativeLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C1306b.C1313g.seek_bar_preference, viewGroup, false);
        } catch (Exception e) {
            Log.e(this.f13330a, "Error creating seek bar preference", e);
            return null;
        }
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        try {
            ViewParent parent = this.f13337h.getParent();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C1306b.C1311e.seekBarPrefBarContainer);
            if (parent != viewGroup) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f13337h);
                }
                viewGroup.removeAllViews();
                viewGroup.addView(this.f13337h, -1, -2);
            }
        } catch (Exception e) {
            Log.e(this.f13330a, "Error binding view: " + e.toString());
        }
        m784a(view);
    }

    /* renamed from: a */
    protected void m784a(View view) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.f13338i = (TextView) relativeLayout.findViewById(C1306b.C1311e.seekBarPrefValue);
            this.f13338i.setText(String.valueOf(this.f13334e));
            this.f13338i.setMinimumWidth(30);
            this.f13337h.setProgress(this.f13334e - this.f13332c);
            ((TextView) relativeLayout.findViewById(C1306b.C1311e.seekBarPrefUnitsRight)).setText(this.f13336g);
            ((TextView) relativeLayout.findViewById(C1306b.C1311e.seekBarPrefUnitsLeft)).setText(this.f13335f);
        } catch (Exception e) {
            Log.e(this.f13330a, "Error updating seek bar preference", e);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.f13332c + i;
        if (i2 > this.f13331b) {
            i2 = this.f13331b;
        } else if (i2 < this.f13332c) {
            i2 = this.f13332c;
        } else if (this.f13333d != 1 && i2 % this.f13333d != 0) {
            i2 = Math.round(i2 / this.f13333d) * this.f13333d;
        }
        if (!callChangeListener(Integer.valueOf(i2))) {
            seekBar.setProgress(this.f13334e - this.f13332c);
            return;
        }
        this.f13334e = i2;
        if (this.f13338i != null) {
            this.f13338i.setText(String.valueOf(i2));
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
