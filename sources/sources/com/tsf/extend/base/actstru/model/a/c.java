package com.tsf.extend.base.actstru.model.a;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class c implements LayoutInflater.Factory {
    private static final String[] a = {"android.widget.", "android.webkit."};
    private static final Map<Class<? extends TextView>, Integer> b = new HashMap<Class<? extends TextView>, Integer>() { // from class: com.tsf.extend.base.actstru.model.a.c.1
        {
            put(TextView.class, Integer.valueOf(R.attr.textViewStyle));
            put(Button.class, Integer.valueOf(R.attr.buttonStyle));
            put(EditText.class, Integer.valueOf(R.attr.editTextStyle));
            put(AutoCompleteTextView.class, Integer.valueOf(R.attr.autoCompleteTextViewStyle));
            put(MultiAutoCompleteTextView.class, Integer.valueOf(R.attr.autoCompleteTextViewStyle));
            put(CheckBox.class, Integer.valueOf(R.attr.checkboxStyle));
            put(RadioButton.class, Integer.valueOf(R.attr.radioButtonStyle));
            put(ToggleButton.class, Integer.valueOf(R.attr.buttonStyleToggle));
        }
    };
    private final LayoutInflater.Factory c;
    private final int d;

    public c(LayoutInflater.Factory factory, int i) {
        this.c = factory;
        this.d = i == 0 ? R.attr.fontFamily : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewA = null;
        if (context instanceof LayoutInflater.Factory) {
            viewA = ((LayoutInflater.Factory) context).onCreateView(str, context, attributeSet);
        }
        if (this.c != null && viewA == null) {
            viewA = this.c.onCreateView(str, context, attributeSet);
        }
        if (viewA == null) {
            viewA = a(str, context, attributeSet);
        }
        if (viewA != null) {
            a(viewA, str, context, attributeSet);
        }
        return viewA;
    }

    protected View a(String str, Context context, AttributeSet attributeSet) {
        if (str.contains(".")) {
            return a(str, (String) null, context, attributeSet);
        }
        for (String str2 : a) {
            View viewA = a(str, str2, context, attributeSet);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    protected View a(String str, String str2, Context context, AttributeSet attributeSet) {
        try {
            return LayoutInflater.from(context).createView(str, str2, attributeSet);
        } catch (Exception e) {
            return null;
        }
    }

    protected void a(View view, String str, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            String strA = e.a(context, attributeSet, this.d);
            if (TextUtils.isEmpty(strA)) {
                strA = e.b(context, attributeSet, this.d);
            }
            if (TextUtils.isEmpty(strA)) {
                strA = e.a(context, b.containsKey(view.getClass()) ? b.get(view.getClass()).intValue() : R.attr.textAppearance, this.d);
            }
            e.a(context, (TextView) view, a.a(), strA);
        }
    }
}
