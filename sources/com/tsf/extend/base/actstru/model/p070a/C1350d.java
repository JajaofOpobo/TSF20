package com.tsf.extend.base.actstru.model.p070a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
/* renamed from: com.tsf.extend.base.actstru.model.a.d */
/* loaded from: classes.dex */
class C1350d extends LayoutInflater {

    /* renamed from: b */
    private static final String[] f4255b = {"android.widget.", "android.webkit.", "android.app."};

    /* renamed from: a */
    private final int f4256a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1350d(LayoutInflater layoutInflater, Context context, int i) {
        super(layoutInflater, context);
        this.f4256a = i;
        m8931a();
    }

    /* renamed from: a */
    private void m8931a() {
        if (!(getFactory() instanceof LayoutInflater$FactoryC1348c)) {
            setFactory(new LayoutInflater$FactoryC1348c(getFactory(), this.f4256a));
        }
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        return new C1350d(this, context, this.f4256a);
    }

    @Override // android.view.LayoutInflater
    protected View onCreateView(String str, AttributeSet attributeSet) {
        View createView;
        for (String str2 : f4255b) {
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
