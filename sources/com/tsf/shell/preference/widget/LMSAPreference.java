package com.tsf.shell.preference.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class LMSAPreference extends Preference {

    /* renamed from: a */
    private int f13329a;

    public LMSAPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWidgetLayoutResource(C1306b.C1313g.preference_widget_value);
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(C1306b.C1311e.preference_widget_value);
        if (textView != null) {
            textView.setText(String.valueOf(this.f13329a));
        }
    }

    @Override // android.preference.Preference
    protected void onClick() {
        int i = this.f13329a + 1;
        if (callChangeListener(Integer.valueOf(i))) {
            this.f13329a = i;
            persistInt(this.f13329a);
            notifyChanged();
        }
    }

    @Override // android.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, 0));
    }

    @Override // android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        if (z) {
            this.f13329a = getPersistedInt(this.f13329a);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        this.f13329a = intValue;
        persistInt(intValue);
    }
}
