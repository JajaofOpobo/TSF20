package com.tsf.extend.base.actstru.model.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
class d extends LayoutInflater {
    private static final String[] b = {"android.widget.", "android.webkit.", "android.app."};
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(LayoutInflater layoutInflater, Context context, int i) {
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
        View createView;
        for (String str2 : b) {
            try {
                createView = createView(str, str2, attributeSet);
            } catch (ClassNotFoundException e) {
            }
            if (createView != null) {
                return createView;
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
