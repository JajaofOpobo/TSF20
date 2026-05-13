package com.tsf.extend.base.actstru.model.p070a;

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
/* renamed from: com.tsf.extend.base.actstru.model.a.c */
/* loaded from: classes.dex */
class LayoutInflater$FactoryC1348c implements LayoutInflater.Factory {

    /* renamed from: a */
    private static final String[] f4251a = {"android.widget.", "android.webkit."};

    /* renamed from: b */
    private static final Map<Class<? extends TextView>, Integer> f4252b = new HashMap<Class<? extends TextView>, Integer>() { // from class: com.tsf.extend.base.actstru.model.a.c.1
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

    /* renamed from: c */
    private final LayoutInflater.Factory f4253c;

    /* renamed from: d */
    private final int f4254d;

    public LayoutInflater$FactoryC1348c(LayoutInflater.Factory factory, int i) {
        this.f4253c = factory;
        this.f4254d = i == 0 ? 16843692 : i;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View view = null;
        if (context instanceof LayoutInflater.Factory) {
            view = ((LayoutInflater.Factory) context).onCreateView(str, context, attributeSet);
        }
        if (this.f4253c != null && view == null) {
            view = this.f4253c.onCreateView(str, context, attributeSet);
        }
        if (view == null) {
            view = m8933a(str, context, attributeSet);
        }
        if (view != null) {
            m8934a(view, str, context, attributeSet);
        }
        return view;
    }

    /* renamed from: a */
    protected View m8933a(String str, Context context, AttributeSet attributeSet) {
        if (str.contains(".")) {
            return m8932a(str, (String) null, context, attributeSet);
        }
        for (String str2 : f4251a) {
            View m8932a = m8932a(str, str2, context, attributeSet);
            if (m8932a != null) {
                return m8932a;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected View m8932a(String str, String str2, Context context, AttributeSet attributeSet) {
        try {
            return LayoutInflater.from(context).createView(str, str2, attributeSet);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    protected void m8934a(View view, String str, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            String m8929a = C1351e.m8929a(context, attributeSet, this.f4254d);
            if (TextUtils.isEmpty(m8929a)) {
                m8929a = C1351e.m8924b(context, attributeSet, this.f4254d);
            }
            if (TextUtils.isEmpty(m8929a)) {
                m8929a = C1351e.m8930a(context, f4252b.containsKey(view.getClass()) ? f4252b.get(view.getClass()).intValue() : 16842804, this.f4254d);
            }
            C1351e.m8927a(context, (TextView) view, C1346a.m8938a(), m8929a);
        }
    }
}
