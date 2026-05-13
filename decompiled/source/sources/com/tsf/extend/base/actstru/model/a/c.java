package com.tsf.extend.base.actstru.model.a;

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
/* loaded from: classes.dex */
class c implements LayoutInflater.Factory {
    private static final String[] a = {"android.widget.", "android.webkit."};
    private static final Map<Class<? extends TextView>, Integer> b = new HashMap<Class<? extends TextView>, Integer>() { // from class: com.tsf.extend.base.actstru.model.a.c.1
        {
            put(TextView.class, 16842884);
            put(Button.class, 16842824);
            put(EditText.class, 16842862);
            put(AutoCompleteTextView.class, 16842859);
            put(MultiAutoCompleteTextView.class, 16842859);
            put(CheckBox.class, 16842860);
            put(RadioButton.class, 16842878);
            put(ToggleButton.class, 16842827);
        }
    };
    private final LayoutInflater.Factory c;
    private final int d;

    public c(LayoutInflater.Factory factory, int i) {
        this.c = factory;
        this.d = i == 0 ? 16843692 : i;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View view = null;
        if (context instanceof LayoutInflater.Factory) {
            view = ((LayoutInflater.Factory) context).onCreateView(str, context, attributeSet);
        }
        if (this.c != null && view == null) {
            view = this.c.onCreateView(str, context, attributeSet);
        }
        if (view == null) {
            view = a(str, context, attributeSet);
        }
        if (view != null) {
            a(view, str, context, attributeSet);
        }
        return view;
    }

    protected View a(String str, Context context, AttributeSet attributeSet) {
        if (str.contains(".")) {
            return a(str, (String) null, context, attributeSet);
        }
        for (String str2 : a) {
            View a2 = a(str, str2, context, attributeSet);
            if (a2 != null) {
                return a2;
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
            String a2 = e.a(context, attributeSet, this.d);
            if (TextUtils.isEmpty(a2)) {
                a2 = e.b(context, attributeSet, this.d);
            }
            if (TextUtils.isEmpty(a2)) {
                a2 = e.a(context, b.containsKey(view.getClass()) ? b.get(view.getClass()).intValue() : 16842804, this.d);
            }
            e.a(context, (TextView) view, a.a(), a2);
        }
    }
}
