package com.tsf.shell.f.i.b.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.e.d;
import com.tsf.shell.f.e.t;
import com.tsf.shell.f.f.g;
import com.tsf.shell.f.i.a.c;
import com.tsf.shell.f.i.b;
import com.tsf.shell.manager.bind.ShellModel;
/* loaded from: classes.dex */
public class a extends b {
    public boolean a;
    public k b;
    public String f;
    public com.tsf.shell.e.b g;
    public TextureElement h;
    public Object i;
    public Runnable j;
    private c k;
    private com.tsf.shell.manager.r.a.b l;
    private Runnable m;
    private boolean n;

    public a(LauncherAppWidgetInfo launcherAppWidgetInfo, String str) {
        super(launcherAppWidgetInfo);
        this.a = false;
        this.n = false;
        this.m = new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.n = true;
                t.a();
            }
        };
        this.i = new Object();
        i(false);
        this.f = str;
        this.b = new k(0.0f, 0.0f, 1, 1, false);
        addChild(this.b);
        this.b.visible(false);
        this.k = new c(this);
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
            return;
        }
        this.b.a(launcherAppWidgetInfo.widthH);
        this.b.b(launcherAppWidgetInfo.heightH);
        c(launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float minX() {
        return (-this.b.b()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float minY() {
        return (-this.b.c()) / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float maxX() {
        return this.b.b() / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float maxY() {
        return this.b.c() / 2.0f;
    }

    @Override // com.tsf.shell.f.i.b
    public boolean ac() {
        boolean z;
        t.a();
        ItemInfo K = K();
        d.b bVar = (d.b) this.g.getLayoutParams();
        if (com.censivn.C3DEngine.b.b.a.O) {
            bVar.a = K.cellX;
            bVar.b = K.cellY;
            bVar.d = K.width;
            bVar.e = K.height;
            int[] iArr = {bVar.a, bVar.b, bVar.d, bVar.e};
            boolean c = com.tsf.shell.manager.r.a.c(iArr);
            if (c) {
                int i = iArr[0];
                bVar.a = i;
                K.cellX = i;
                int i2 = iArr[1];
                bVar.b = i2;
                K.cellY = i2;
                int i3 = iArr[2];
                bVar.d = i3;
                K.width = i3;
                int i4 = iArr[3];
                bVar.e = i4;
                K.height = i4;
            }
            c(K.cellX, K.cellY);
            z = c;
        } else {
            bVar.a = K.cellXH;
            bVar.b = K.cellYH;
            bVar.d = K.widthH;
            bVar.e = K.heightH;
            int[] iArr2 = {bVar.a, bVar.b, bVar.d, bVar.e};
            boolean c2 = com.tsf.shell.manager.r.a.c(iArr2);
            if (c2) {
                int i5 = iArr2[0];
                bVar.a = i5;
                K.cellXH = i5;
                int i6 = iArr2[1];
                bVar.b = i6;
                K.cellYH = i6;
                int i7 = iArr2[2];
                bVar.d = i7;
                K.widthH = i7;
                int i8 = iArr2[3];
                bVar.e = i8;
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
            d.b bVar = (d.b) this.g.getLayoutParams();
            c(bVar.a, bVar.b);
        } else if (bitmap.getWidth() != this.h.width || bitmap.getHeight() != this.h.height) {
            com.censivn.C3DEngine.a.g().a(this.h, bitmap);
            b(this.h.width, this.h.height);
            d.b bVar2 = (d.b) this.g.getLayoutParams();
            c(bVar2.a, bVar2.b);
        } else {
            com.censivn.C3DEngine.a.g().a(this.h, bitmap);
        }
        invalidate();
    }

    @Override // com.censivn.C3DEngine.b.f.i
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

    @Override // com.censivn.C3DEngine.b.f.i
    /* renamed from: l */
    public c getMouseEventListener() {
        return this.k;
    }

    @Override // com.tsf.shell.f.i.b
    public void ab() {
        com.censivn.C3DEngine.a.a().c(this.m);
    }

    public void q() {
        this.b.alpha(0.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
    }

    public void ag() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.2
            @Override // java.lang.Runnable
            public void run() {
                d.b bVar = (d.b) a.this.g.getLayoutParams();
                a.this.g.a(bVar.d, bVar.e);
                a.this.g.requestLayout();
                a.this.g.invalidate();
            }
        });
    }

    @Override // com.tsf.shell.f.i.b
    public void n_() {
        this.n = false;
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(180);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
        setAnimationObjectState(true);
        t.a(this);
    }

    @Override // com.tsf.shell.f.i.b
    public void m_() {
        super.m_();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar);
        if (!this.a) {
            d.b bVar = (d.b) this.g.getLayoutParams();
            int i = bVar.a;
            int i2 = bVar.b;
            float b = (i + (this.b.b() / 2.0f)) - com.censivn.C3DEngine.b.b.a.H;
            float c = com.censivn.C3DEngine.b.b.a.I - (i2 + (this.b.c() / 2.0f));
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.b.a.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.c();
                }
            };
            dVar2.f(b);
            dVar2.h(c);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, 250, dVar2);
        }
    }

    @Override // com.tsf.shell.f.i.b
    public void a(com.tsf.shell.f.i.a aVar) {
        super.a(aVar);
        final g z = z();
        if (z != null && K().screen != z.t()) {
            K().screen = z.t();
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.4
                @Override // java.lang.Runnable
                public void run() {
                    ((d) a.this.g.getParent()).b(a.this.g);
                    z.s().a(a.this.g);
                }
            });
        }
    }

    @Override // com.tsf.shell.f.i.b
    public void p_() {
        super.p_();
        this.a = true;
        this.b.mouseEnabled(false);
    }

    @Override // com.tsf.shell.f.i.b, com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void destroy() {
        this.l.b(this);
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.5
            @Override // java.lang.Runnable
            public void run() {
                ((d) a.this.g.getParent()).b(a.this.g);
            }
        });
        com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.6
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.l.a.a(((LauncherAppWidgetInfo) a.this.K()).appWidgetId);
                ShellModel.a.b(a.this.K());
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

    @Override // com.tsf.shell.f.i.b
    public void q_() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.7
            @Override // java.lang.Runnable
            public void run() {
                t.a();
            }
        });
    }

    @Override // com.tsf.shell.f.i.b
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

    @Override // com.tsf.shell.f.i.b
    public void E() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.e == null) {
                    a.this.e = com.tsf.shell.f.e.b.a((int) (a.this.b.b() + (com.censivn.C3DEngine.b.b.a.b * 10.0f)), (int) (a.this.b.c() + (com.censivn.C3DEngine.b.b.a.b * 10.0f)));
                    a.this.e.useVBO(false);
                    a.this.e.textures().addElement(com.tsf.shell.f.e.b.h);
                    a.this.e.position().y = (this.minY() + this.maxY()) / 2.0f;
                    this.addChild(a.this.e);
                }
            }
        });
    }

    @Override // com.tsf.shell.f.i.b
    public void F() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.i.b.b.a.9
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
