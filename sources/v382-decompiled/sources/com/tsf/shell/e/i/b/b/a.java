package com.tsf.shell.e.i.b.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.d.b;
import com.tsf.shell.d.e;
import com.tsf.shell.d.g;
import com.tsf.shell.e.e.aa;
import com.tsf.shell.e.i.c;
import com.tsf.shell.manager.bind.d;

/* loaded from: classes.dex */
public class a extends c {
    public boolean a;
    public m b;
    public String f;
    public b g;
    public TextureElement h;
    public Object i;
    public Runnable j;
    private com.tsf.shell.e.i.a.c k;
    private com.tsf.shell.manager.r.a.c l;
    private Runnable m;
    private boolean n;

    public a(LauncherAppWidgetInfo launcherAppWidgetInfo, String str) {
        super(launcherAppWidgetInfo);
        this.a = false;
        this.n = false;
        this.m = new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.n = true;
                aa.a();
            }
        };
        this.i = new Object();
        i(false);
        this.f = str;
        this.b = new m(0.0f, 0.0f, 1, 1, false);
        addChild(this.b);
        this.b.visible(false);
        this.k = new com.tsf.shell.e.i.a.c(this);
        e(false);
        this.l = com.tsf.shell.manager.a.l;
        this.l.a(this);
    }

    public void k() {
        LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) K();
        if (com.censivn.C3DEngine.b.b.a.O) {
            this.b.a(launcherAppWidgetInfo.width);
            this.b.b(launcherAppWidgetInfo.height);
            c(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY);
        } else {
            this.b.a(launcherAppWidgetInfo.widthH);
            this.b.b(launcherAppWidgetInfo.heightH);
            c(launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public float minX() {
        return (-this.b.b()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public float minY() {
        return (-this.b.c()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public float maxX() {
        return this.b.b() / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public float maxY() {
        return this.b.c() / 2.0f;
    }

    @Override // com.tsf.shell.e.i.c
    public boolean ac() {
        boolean z;
        aa.a();
        ItemInfo K = K();
        g gVar = (g) this.g.getLayoutParams();
        if (com.censivn.C3DEngine.b.b.a.O) {
            gVar.a = K.cellX;
            gVar.b = K.cellY;
            gVar.d = K.width;
            gVar.e = K.height;
            int[] iArr = {gVar.a, gVar.b, gVar.d, gVar.e};
            boolean c = com.tsf.shell.manager.r.a.c(iArr);
            if (c) {
                int i = iArr[0];
                gVar.a = i;
                K.cellX = i;
                int i2 = iArr[1];
                gVar.b = i2;
                K.cellY = i2;
                int i3 = iArr[2];
                gVar.d = i3;
                K.width = i3;
                int i4 = iArr[3];
                gVar.e = i4;
                K.height = i4;
            }
            c(K.cellX, K.cellY);
            z = c;
        } else {
            gVar.a = K.cellXH;
            gVar.b = K.cellYH;
            gVar.d = K.widthH;
            gVar.e = K.heightH;
            int[] iArr2 = {gVar.a, gVar.b, gVar.d, gVar.e};
            boolean c2 = com.tsf.shell.manager.r.a.c(iArr2);
            if (c2) {
                int i5 = iArr2[0];
                gVar.a = i5;
                K.cellXH = i5;
                int i6 = iArr2[1];
                gVar.b = i6;
                K.cellYH = i6;
                int i7 = iArr2[2];
                gVar.d = i7;
                K.widthH = i7;
                int i8 = iArr2[3];
                gVar.e = i8;
                K.heightH = i8;
            }
            c(K.cellXH, K.cellYH);
            z = c2;
        }
        ag();
        rotation().z = K.rotation;
        return z;
    }

    public void a(Bitmap bitmap) {
        if (this.h == null) {
            this.h = com.censivn.C3DEngine.a.g().a(bitmap, false);
            this.b.textures().addElement(this.h);
            this.b.visible(true);
            b(this.h.width, this.h.height);
            g gVar = (g) this.g.getLayoutParams();
            c(gVar.a, gVar.b);
        } else if (bitmap.getWidth() != this.h.width || bitmap.getHeight() != this.h.height) {
            com.censivn.C3DEngine.a.g().a(this.h, bitmap);
            b(this.h.width, this.h.height);
            g gVar2 = (g) this.g.getLayoutParams();
            c(gVar2.a, gVar2.b);
        } else {
            com.censivn.C3DEngine.a.g().a(this.h, bitmap);
        }
        invalidate();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        synchronized (this.i) {
            if (this.j != null) {
                this.j.run();
                this.j = null;
            }
        }
    }

    public void b(int i, int i2) {
        this.b.a(i);
        this.b.b(i2);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.tsf.shell.e.i.a.c getMouseEventListener() {
        return this.k;
    }

    @Override // com.tsf.shell.e.i.c
    public void ab() {
        com.censivn.C3DEngine.a.a().c(this.m);
    }

    public void q() {
        this.b.alpha(0.0f);
        x xVar = new x();
        xVar.a(255);
        w.a(this.b);
        w.a(this.b, 500, xVar);
    }

    public void ag() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.2
            @Override // java.lang.Runnable
            public void run() {
                g gVar = (g) a.this.g.getLayoutParams();
                a.this.g.a(gVar.d, gVar.e);
                a.this.g.requestLayout();
                a.this.g.invalidate();
            }
        });
    }

    @Override // com.tsf.shell.e.i.c
    public void l_() {
        this.n = false;
        w.a(this);
        x xVar = new x();
        xVar.a(180);
        w.a(this.b);
        w.a(this.b, 500, xVar);
        setAnimationObjectState(true);
        aa.a(this);
    }

    @Override // com.tsf.shell.e.i.c
    public void k_() {
        super.k_();
        x xVar = new x();
        xVar.a(255);
        w.a(this.b);
        w.a(this.b, 500, xVar);
        if (!this.a) {
            g gVar = (g) this.g.getLayoutParams();
            int i = gVar.a;
            int i2 = gVar.b;
            float b = (i + (this.b.b() / 2.0f)) - com.censivn.C3DEngine.b.b.a.H;
            float c = com.censivn.C3DEngine.b.b.a.I - (i2 + (this.b.c() / 2.0f));
            x xVar2 = new x() { // from class: com.tsf.shell.e.i.b.b.a.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    a.this.c();
                }
            };
            xVar2.f(b);
            xVar2.h(c);
            w.a(this);
            w.a(this, 250, xVar2);
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void a(com.tsf.shell.e.i.a aVar) {
        super.a(aVar);
        final com.tsf.shell.e.f.g z = z();
        if (z != null && K().screen != z.t()) {
            K().screen = z.t();
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.4
                @Override // java.lang.Runnable
                public void run() {
                    ((e) a.this.g.getParent()).b(a.this.g);
                    z.s().a(a.this.g);
                }
            });
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void n_() {
        super.n_();
        this.a = true;
        this.b.mouseEnabled(false);
    }

    @Override // com.tsf.shell.e.i.c, com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void destroy() {
        this.l.b(this);
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.5
            @Override // java.lang.Runnable
            public void run() {
                ((e) a.this.g.getParent()).b(a.this.g);
            }
        });
        com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.6
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.l.a.a(((LauncherAppWidgetInfo) a.this.K()).appWidgetId);
                d.b(a.this.K());
            }
        });
        if (this.b != null) {
            this.b.destroy();
            this.b = null;
        }
        com.censivn.C3DEngine.a.g().a(this.h);
        this.h = null;
        this.k = null;
        removeFromParent();
    }

    @Override // com.tsf.shell.e.i.c
    public void o_() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.7
            @Override // java.lang.Runnable
            public void run() {
                aa.a();
            }
        });
    }

    @Override // com.tsf.shell.e.i.c
    public void j() {
    }

    public void c(int i, int i2) {
        position().x = b(i);
        position().y = c(i2);
    }

    public float b(int i) {
        return (i + (this.b.b() / 2.0f)) - com.censivn.C3DEngine.b.b.a.H;
    }

    public float c(int i) {
        return com.censivn.C3DEngine.b.b.a.I - (i + (this.b.c() / 2.0f));
    }

    @Override // com.tsf.shell.e.i.c
    public void E() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.e == null) {
                    a.this.e = com.tsf.shell.e.e.c.a((int) (a.this.b.b() + (com.censivn.C3DEngine.b.b.a.b * 10.0f)), (int) (a.this.b.c() + (com.censivn.C3DEngine.b.b.a.b * 10.0f)));
                    a.this.e.useVBO(false);
                    a.this.e.textures().addElement(com.tsf.shell.e.e.c.h);
                    a.this.e.position().y = (this.minY() + this.maxY()) / 2.0f;
                    this.addChild(a.this.e);
                }
            }
        });
    }

    @Override // com.tsf.shell.e.i.c
    public void F() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.i.b.b.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.e != null) {
                    a.this.e.textures().removeAll();
                    a.this.e.removeFromParent();
                    a.this.e.destroy();
                    a.this.e = null;
                }
            }
        });
    }
}
