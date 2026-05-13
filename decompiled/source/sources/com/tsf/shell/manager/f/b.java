package com.tsf.shell.manager.f;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.d;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.f.f.j;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
/* loaded from: classes.dex */
public class b extends j implements e.a, ShellWallpaperManager.a {
    public static int b = 0;
    private j.a f;
    private com.tsf.shell.f.e.b.a g;
    private d.b h;
    private a i;
    private j.a j;
    public Object a = new Object();
    private boolean d = false;
    private boolean e = false;
    private com.tsf.shell.f.e.b.b k = new com.tsf.shell.f.e.b.b();
    private boolean l = false;
    private k c = new k(0.0f, 0.0f);

    public b() {
        this.c.uvs().set(0, 1.0f, 0.0f);
        this.c.uvs().set(1, 0.0f, 0.0f);
        this.c.uvs().set(2, 1.0f, 1.0f);
        this.c.uvs().set(3, 0.0f, 1.0f);
        this.g = new com.tsf.shell.f.e.b.a();
        this.h = new d.b() { // from class: com.tsf.shell.manager.f.b.1
            @Override // com.censivn.C3DEngine.b.c.d.b
            public void a() {
                if (b.this.i != null) {
                    b.this.i.a();
                }
            }
        };
        this.g.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.g) { // from class: com.tsf.shell.manager.f.b.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (b.this.i != null) {
                    b.this.i.a();
                }
            }
        });
        com.tsf.shell.f.f.j.a(this.a, 1);
    }

    /* loaded from: classes.dex */
    public static class a {
        public void a() {
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public i getHittingTarget(float f, float f2, boolean z) {
        if (!this.d) {
            return super.getHittingTarget(f, f2, z);
        }
        return this.g.getHittingTarget(f, f2, false);
    }

    public com.tsf.shell.f.e.b.a a() {
        return this.g;
    }

    public void a(TextureElement textureElement, Runnable runnable) {
        this.g.a(textureElement, 128.0f, runnable);
    }

    public void a(TextureElement textureElement, float f, Runnable runnable) {
        this.g.a(textureElement, f, runnable);
    }

    public void a(int i, Runnable runnable) {
        this.g.a(i, runnable);
    }

    public void a(int i, Runnable runnable, boolean z) {
        if (z) {
            this.g.a(i, runnable);
        } else {
            this.g.a(0, runnable);
        }
    }

    public void a(TextureElement textureElement) {
        this.g.a(textureElement);
    }

    public void b() {
        this.f = g();
        this.g.a(this.f.b);
        this.g.a(1.0f);
    }

    public boolean c() {
        return this.e;
    }

    public void a(a aVar) {
        a(aVar, ItemInfo.APP_INTENT, (Runnable) null);
    }

    public void b(a aVar) {
        this.i = aVar;
    }

    public void a(a aVar, int i, Runnable runnable) {
        if (!this.e) {
            this.e = true;
            this.d = true;
            b(aVar);
            this.f = g();
            a(this.f.b, i, runnable);
            com.tsf.shell.manager.a.s.a(this.h);
            mouseEnabled(false);
            com.censivn.C3DEngine.a.d.d().c().a(false);
            com.tsf.shell.manager.a.h.n().ab();
            com.tsf.shell.manager.a.b.a(this);
            this.g.setAABBPX(-com.censivn.C3DEngine.b.b.a.H, -com.censivn.C3DEngine.b.b.a.I, 0.0f, com.censivn.C3DEngine.b.b.a.H, com.censivn.C3DEngine.b.b.a.I, 0.0f);
        }
    }

    public void d() {
        this.f = g();
        a(this.f.b);
    }

    public void e() {
        a((Runnable) null, true);
    }

    public void b(int i, final Runnable runnable, boolean z) {
        if (this.e) {
            this.e = false;
            this.i = null;
            d();
            a(i, new Runnable() { // from class: com.tsf.shell.manager.f.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.d = false;
                    b.this.f.a = null;
                    b.this.mouseEnabled(true);
                    com.censivn.C3DEngine.a.d.d().c().a(true);
                    com.tsf.shell.manager.a.h.n().ac();
                    com.tsf.shell.manager.a.b.b(b.this);
                    com.tsf.shell.manager.a.s.b(b.this.h);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }, z);
        }
    }

    public void a(Runnable runnable, boolean z) {
        b(380, runnable, z);
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        this.g.setAABBPX(-com.censivn.C3DEngine.b.b.a.H, -com.censivn.C3DEngine.b.b.a.I, 0.0f, com.censivn.C3DEngine.b.b.a.H, com.censivn.C3DEngine.b.b.a.I, 0.0f);
        if (this.d) {
            this.f = g();
            this.g.a(this.f.b);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (b != 0 && this.l) {
            this.j = com.tsf.shell.f.f.j.c(this.a);
            com.tsf.shell.manager.a.t.b(com.tsf.shell.f.f.j.c(), this.j.b);
            if (b == 3) {
                com.tsf.shell.manager.a.f.g().dispatchDraw();
                com.tsf.shell.manager.a.t.b();
            }
        }
        if (this.d) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            this.g.dispatchDraw();
            MatrixStack.glPopMatrix();
        } else {
            super.dispatchDraw();
        }
        if (b != 0) {
            if (this.l) {
                this.k.a(this.j.b, 16);
                if (b != 3) {
                    com.tsf.shell.manager.a.t.b();
                    if (this.j.b.width != this.c.b()) {
                        this.c.a(this.j.b.width);
                    }
                    if (this.j.b.height != this.c.c()) {
                        this.c.b(this.j.b.height);
                    }
                    this.c.textures().clear();
                    this.c.textures().addElement(this.j.b);
                    this.c.dispatchDraw();
                }
            }
            if (b == 1) {
                this.l = true;
            } else {
                this.l = false;
            }
        }
    }

    public TextureElement a(com.tsf.shell.f.e.g.d dVar) {
        b = 3;
        com.tsf.shell.manager.a.f.a(this);
        if (this.g.a()) {
            return this.g.b();
        }
        this.l = true;
        return this.k.a;
    }

    public void b(com.tsf.shell.f.e.g.d dVar) {
        this.l = false;
        b = 0;
        com.tsf.shell.manager.a.f.b(this);
        if (this.j != null) {
        }
    }

    private j.a g() {
        j.a c = com.tsf.shell.f.f.j.c(this.a);
        c.a = this.a;
        com.tsf.shell.manager.a.t.b(com.tsf.shell.f.f.j.c(), c.b);
        super.dispatchDraw();
        com.tsf.shell.manager.a.t.b();
        return c;
    }

    @Override // com.tsf.shell.manager.wallpaper.ShellWallpaperManager.a
    public void f() {
        this.l = true;
    }
}
