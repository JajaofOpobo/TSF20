package com.tsf.shell.f.i.c.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.b;
import com.tsf.shell.f.i.c.a.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.tsf.shell.f.i.c.a.j {
    public static Context c;
    public static VTextureManager d;
    public static m e;
    public static k f;
    public static o g;
    public static l h;
    public final int a;
    public final int b;
    public TextureElement m;
    long n;
    private h o;
    private h p;

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
        f = new k();
        g = new o();
        e = new m();
        h = new l();
        this.p = new h(VInformation.Scale());
        this.p.position().y = 80.0f;
        this.p.scale().setAll(0.8f, 0.8f, 0.8f);
        this.p.a(-13521439);
        addChild(this.p);
        this.o = new h(VInformation.Scale());
        this.o.position().y = -70.0f;
        this.o.b(0);
        this.o.a(-13421773);
        addChild(this.o);
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.n > 1000) {
            this.n = jCurrentTimeMillis;
            this.o.a(jCurrentTimeMillis, true);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_cubeclock_shadow, new VObject3d[0]);
            this.k.add(new a(f));
            this.k.add(new a(g));
            this.k.add(new a(e));
            this.k.add(new a(h));
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_cubeclock_shadow) {
            this.m = textureElement;
        }
    }

    class a extends j.a {
        private e h;

        public a(e eVar) {
            super();
            this.h = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.j.a, com.tsf.shell.f.i.c.a.c
        public Bitmap a(Void... voidArr) {
            return this.h.a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.j.a, com.tsf.shell.f.i.c.a.c
        public void a(Bitmap bitmap) {
            this.h.a(bitmap);
            c.this.a(this);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j
    public void f() {
        com.tsf.shell.f.i.c.a.e.a("-----------onTaskMissionFinish");
        this.o.a(this.m, f, g, e);
        this.p.a(this.m, f, g, e);
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
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
