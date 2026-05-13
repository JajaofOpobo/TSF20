package com.tsf.extend.base.actstru.model.p070a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
/* renamed from: com.tsf.extend.base.actstru.model.a.b */
/* loaded from: classes.dex */
public class C1347b extends ContextWrapper {

    /* renamed from: a */
    private LayoutInflater f4249a;

    /* renamed from: b */
    private final int f4250b;

    public C1347b(Context context) {
        super(context);
        this.f4250b = 16843692;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f4249a == null) {
                this.f4249a = new C1350d(LayoutInflater.from(getBaseContext()), this, this.f4250b);
            }
            return this.f4249a;
        }
        return super.getSystemService(str);
    }
}
