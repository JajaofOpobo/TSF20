package com.tsf.extend.base.actstru.model.a;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends ContextWrapper {
    private LayoutInflater a;
    private final int b;

    public b(Context context) {
        super(context);
        this.b = R.attr.fontFamily;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.a == null) {
            this.a = new d(LayoutInflater.from(getBaseContext()), this, this.b);
        }
        return this.a;
    }
}
