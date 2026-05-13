package com.tsf.extend.base.actstru.model.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class b extends ContextWrapper {
    private LayoutInflater a;
    private final int b;

    public b(Context context) {
        super(context);
        this.b = 16843692;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.a == null) {
                this.a = new d(LayoutInflater.from(getBaseContext()), this, this.b);
            }
            return this.a;
        }
        return super.getSystemService(str);
    }
}
