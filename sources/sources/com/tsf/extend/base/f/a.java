package com.tsf.extend.base.f;

import android.graphics.Bitmap;
import com.android.volley.d;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.toolbox.i;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends i {
    private boolean a;
    private l.a b;

    public a(String str, n.b<Bitmap> bVar, int i, int i2, Bitmap.Config config, n.a aVar) {
        super(str, bVar, i, i2, config, aVar);
        this.a = true;
        this.b = l.a.LOW;
        a((p) new d(30000, 2, 2.0f));
    }

    public void a(l.a aVar) {
        this.b = aVar;
    }

    @Override // com.android.volley.toolbox.i, com.android.volley.l
    public l.a s() {
        return this.b;
    }

    @Override // com.android.volley.toolbox.i, com.android.volley.l
    protected n<Bitmap> a(com.android.volley.i iVar) {
        n<Bitmap> nVarA = super.a(iVar);
        if (this.a && nVarA != null && nVarA.b != null) {
            nVarA.b.e = Long.MAX_VALUE;
            nVarA.b.f = Long.MAX_VALUE;
        }
        return nVarA;
    }
}
