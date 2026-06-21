package com.tsf.shell.e.i.c.a.b;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.i.c.a.o {
    public static Context c;
    public static VTextureManager d;
    public static n e;
    public static l f;
    public static p g;
    public static m h;
    public final int a;
    public final int b;
    public TextureElement m;
    long n;
    private i o;
    private i p;

    public c(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.a = -13521439;
        this.b = -13421773;
        this.n = 0L;
        c = context;
        d = vTextureManager;
        e();
    }

    private void e() {
        f = new l();
        g = new p();
        e = new n();
        h = new m();
        this.p = new i(VInformation.Scale());
        this.p.position().y = 80.0f;
        this.p.scale().setAll(0.8f, 0.8f, 0.8f);
        this.p.a(-13521439);
        addChild(this.p);
        this.o = new i(VInformation.Scale());
        this.o.position().y = -70.0f;
        this.o.b(0);
        this.o.a(-13421773);
        addChild(this.o);
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.n > 1000) {
            this.n = currentTimeMillis;
            this.o.a(currentTimeMillis, true);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void b() {
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void c() {
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(R.drawable.widget_preview_cubeclock_shadow, new VObject3d[0]);
            this.k.add(new d(this, f));
            this.k.add(new d(this, g));
            this.k.add(new d(this, e));
            this.k.add(new d(this, h));
            c(z);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.n
    public void a(int i, TextureElement textureElement) {
        if (i == R.drawable.widget_preview_cubeclock_shadow) {
            this.m = textureElement;
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o
    public void f() {
        com.tsf.shell.e.i.c.a.j.a("-----------onTaskMissionFinish");
        this.o.a(this.m, f, g, e);
        this.p.a(this.m, f, g, e);
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
    public void d() {
        if (this.l) {
            this.l = false;
            d.deleteTexture(this.m);
            f.b();
            g.b();
            e.b();
            h.b();
            this.o.a();
            this.p.a();
        }
    }
}
