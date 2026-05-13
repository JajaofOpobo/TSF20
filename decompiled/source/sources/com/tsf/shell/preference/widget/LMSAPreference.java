package com.tsf.shell.preference.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tsf.b;
/* loaded from: classes.dex */
public class LMSAPreference extends Preference {
    private int a;

    public LMSAPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWidgetLayoutResource(b.g.preference_widget_value);
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(b.e.preference_widget_value);
        if (textView != null) {
            textView.setText(String.valueOf(this.a));
        }
    }

    @Override // android.preference.Preference
    protected void onClick() {
        int i = this.a + 1;
        if (callChangeListener(Integer.valueOf(i))) {
            this.a = i;
            persistInt(this.a);
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
            this.a = getPersistedInt(this.a);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        this.a = intValue;
        persistInt(intValue);
    }
}
