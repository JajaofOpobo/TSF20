package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import com.android.volley.l;
import com.android.volley.n;
import com.tsf.extend.wallpaper.m;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ac extends com.android.volley.toolbox.i {
    private static final String a = ac.class.getSimpleName();
    private boolean b;
    private boolean c;
    private long d;
    private long e;
    private m.a f;

    public ac(boolean z, m.a aVar, n.b<Bitmap> bVar, int i, int i2, Bitmap.Config config, n.a aVar2, boolean z2) {
        super(aVar.a, bVar, i, i2, config, aVar2);
        a((com.android.volley.p) new com.android.volley.d(30000, 2, 2.0f));
        this.b = z2;
        this.f = aVar;
        this.c = z;
    }

    @Override // com.android.volley.toolbox.i, com.android.volley.l
    protected com.android.volley.n<Bitmap> a(com.android.volley.i iVar) {
        com.android.volley.n<Bitmap> nVarA;
        try {
            if (this.b) {
                nVarA = com.android.volley.n.a(null, com.android.volley.toolbox.e.a(iVar));
            } else {
                nVarA = super.a(iVar);
            }
            if (nVarA != null && nVarA.b != null) {
                nVarA.b.e = Long.MAX_VALUE;
                nVarA.b.f = Long.MAX_VALUE;
                return nVarA;
            }
            return nVarA;
        } catch (Exception e) {
            return com.android.volley.n.a(new com.android.volley.k(iVar));
        }
    }

    @Override // com.android.volley.l
    protected com.android.volley.s a(com.android.volley.s sVar) {
        if (!(sVar instanceof com.android.volley.j) && sVar.a != null) {
            int i = sVar.a.a;
        }
        return super.a(sVar);
    }

    @Override // com.android.volley.l
    public void a(String str) {
        super.a(str);
        if (!"cache-hit-parsed".equals(str)) {
            if ("network-queue-take".equals(str)) {
                this.d = System.currentTimeMillis();
            } else if ("network-parse-complete".equals(str) && this.c) {
                this.d = System.currentTimeMillis() - this.d;
            }
        }
    }

    @Override // com.android.volley.toolbox.i, com.android.volley.l
    public l.a s() {
        return this.c ? l.a.HIGH : super.s();
    }

    public void a(long j) {
        this.e = j;
    }

    public long x() {
        return this.e;
    }
}
