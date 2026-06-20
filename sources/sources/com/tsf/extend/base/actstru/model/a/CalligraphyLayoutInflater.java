package com.tsf.extend.base.actstru.model.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class d extends LayoutInflater {
    private static final String[] b = {"android.widget.", "android.webkit.", "android.app."};
    private final int a;

    protected d(LayoutInflater layoutInflater, Context context, int i) {
        super(layoutInflater, context);
        this.a = i;
        a();
    }

    private void a() {
        if (!(getFactory() instanceof c)) {
            setFactory(new c(getFactory(), this.a));
        }
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        return new d(this, context, this.a);
    }

    @Override // android.view.LayoutInflater
    protected View onCreateView(String str, AttributeSet attributeSet) {
        View viewCreateView;
        for (String str2 : b) {
            try {
                viewCreateView = createView(str, str2, attributeSet);
            } catch (ClassNotFoundException e) {
            }
            if (viewCreateView != null) {
                return viewCreateView;
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
