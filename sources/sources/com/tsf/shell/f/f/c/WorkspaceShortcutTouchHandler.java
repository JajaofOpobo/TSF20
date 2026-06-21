package com.tsf.shell.f.f.c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.g.TweenManager;
import com.censivn.C3DEngine.b.g.TweenParams;

import com.tsf.shell.f.f.WorkspacePage;
import com.tsf.shell.f.f.a.PageContainerView0133a;

import com.tsf.shell.utils.DimensionHelper;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WorkspaceShortcutTouchHandler implements KeyboardHandler.a, WindowManager.a {
    private TextureElement b;
    private BaseRenderable c;
    private com.tsf.shell.f.i.PageItem d;
    private float g;
    private float h;
    private int i;
    private int j;
    private WorkspacePage l;
    private C0133a m;
    private boolean e = false;
    private boolean f = false;
    private float[] k = {0.0f, 0.0f};
    public C0109a a;

    public static class b {
        public int a = 0;
        public int b = 0;
        public float c = 0.0f;
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.f.c.WorkspaceShortcutTouchHandler$a, reason: collision with other inner class name */
    public class C0109a {
        public com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable a;
        public float b;
        public float c;
        public float d;
        private float f;
        private float g;
        private int h;
        private int i;
        private int j;
        private int k;

        public C0109a() {
        }

        public void a(float f, float f2, float f3, float f4) {
            this.d = com.censivn.C3DEngine.b.b.ScreenConstants.a(160.0f);
            this.j = (int) (f / f3);
            this.k = (int) (f2 / f4);
            this.h = this.j * 2;
            this.i = this.k * 2;
            this.b = f / this.j;
            this.c = f2 / this.k;
            this.f = f / this.h;
            this.g = f2 / this.i;
            int i = (this.h + 1) * (this.i + 1);
            this.a = new com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable(i, 26, 26, true);
            for (int i2 = 0; i2 < i; i2++) {
                this.WorkspaceShortcutTouchHandler.a(i2).a(0, 0, 1, 1, 26.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 26.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
            }
            float f5 = ((-f) / 2.0f) + com.censivn.C3DEngine.b.b.ScreenConstants.k;
            float f6 = (f2 / 2.0f) - com.censivn.C3DEngine.b.b.ScreenConstants.m;
            for (int i3 = 0; i3 < this.i + 1; i3++) {
                for (int i4 = 0; i4 < this.h + 1; i4++) {
                    float f7 = com.censivn.C3DEngine.b.b.ScreenConstants.r + (this.f * i4);
                    float f8 = com.censivn.C3DEngine.b.b.ScreenConstants.s - (this.g * i3);
                    com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = this.WorkspaceShortcutTouchHandler.a(((this.h + 1) * i3) + i4);
                    b bVar = new KeyboardHandler();
                    bVar.a = i4;
                    bVar.b = i3;
                    bVarA.a(bVar);
                    bVarA.i().x = f7;
                    bVarA.i().y = f8;
                    bVarA.I = 0.0f;
                    bVarA.h();
                }
            }
            this.WorkspaceShortcutTouchHandler.textures().addElement(WorkspaceShortcutTouchHandler.this.b);
        }
    }

    public WorkspaceShortcutTouchHandler() {
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.c = new BaseRenderable() { // from class: com.tsf.shell.f.f.c.WorkspaceShortcutTouchHandler.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (WorkspaceShortcutTouchHandler.this.e && !WorkspaceShortcutTouchHandler.this.f) {
                    int iB = WorkspaceShortcutTouchHandler.this.a.WorkspaceShortcutTouchHandler.b();
                    for (int i = 0; i < iB; i++) {
                        ((KeyboardHandler) WorkspaceShortcutTouchHandler.this.a.WorkspaceShortcutTouchHandler.a(i).a()).c = 23.0f;
                    }
                    if (WorkspaceShortcutTouchHandler.this.d != null) {
                        float f = (WorkspaceShortcutTouchHandler.this.d.position().x + (WorkspaceShortcutTouchHandler.this.a.f / 2.0f)) - ((WorkspaceShortcutTouchHandler.this.i * WorkspaceShortcutTouchHandler.this.a.f) / 2.0f);
                        float f2 = WorkspaceShortcutTouchHandler.this.d.position().y + (WorkspaceShortcutTouchHandler.this.a.g / 2.0f) + ((WorkspaceShortcutTouchHandler.this.j * WorkspaceShortcutTouchHandler.this.a.g) / 2.0f);
                        if (f < com.censivn.C3DEngine.b.b.ScreenConstants.r) {
                            f = com.censivn.C3DEngine.b.b.ScreenConstants.r;
                        }
                        if (f2 > com.censivn.C3DEngine.b.b.ScreenConstants.s) {
                            f2 = com.censivn.C3DEngine.b.b.ScreenConstants.s;
                        }
                        int i2 = (int) ((f - com.censivn.C3DEngine.b.b.ScreenConstants.r) / WorkspaceShortcutTouchHandler.this.a.f);
                        int i3 = WorkspaceShortcutTouchHandler.this.a.i - ((int) ((f2 - com.censivn.C3DEngine.b.b.ScreenConstants.u) / WorkspaceShortcutTouchHandler.this.a.g));
                        int i4 = i2 + WorkspaceShortcutTouchHandler.this.i;
                        int i5 = i4 > WorkspaceShortcutTouchHandler.this.a.h ? WorkspaceShortcutTouchHandler.this.a.h : i4;
                        int i6 = i5 - WorkspaceShortcutTouchHandler.this.i;
                        int i7 = i6 < 0 ? 0 : i6;
                        int i8 = WorkspaceShortcutTouchHandler.this.j + i3;
                        int i9 = i8 > WorkspaceShortcutTouchHandler.this.a.i ? WorkspaceShortcutTouchHandler.this.a.i : i8;
                        int i10 = i9 - WorkspaceShortcutTouchHandler.this.j;
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        float f3 = (((i5 - i7) * WorkspaceShortcutTouchHandler.this.a.f) / 2.0f) + com.censivn.C3DEngine.b.b.ScreenConstants.r + (i7 * WorkspaceShortcutTouchHandler.this.a.f);
                        float f4 = (com.censivn.C3DEngine.b.b.ScreenConstants.s - (i10 * WorkspaceShortcutTouchHandler.this.a.g)) - (((i9 - i10) * WorkspaceShortcutTouchHandler.this.a.g) / 2.0f);
                        WorkspaceShortcutTouchHandler.this.k[0] = f3;
                        WorkspaceShortcutTouchHandler.this.k[1] = f4;
                        while (true) {
                            int i11 = i10;
                            if (i11 >= i9 + 1) {
                                break;
                            }
                            for (int i12 = i7; i12 < i5 + 1; i12++) {
                                ((KeyboardHandler) WorkspaceShortcutTouchHandler.this.a.WorkspaceShortcutTouchHandler.a(((WorkspaceShortcutTouchHandler.this.a.h + 1) * i11) + i12).a()).c = 230.0f;
                            }
                            i10 = i11 + 1;
                        }
                    }
                    for (int i13 = 0; i13 < iB; i13++) {
                        com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = WorkspaceShortcutTouchHandler.this.a.WorkspaceShortcutTouchHandler.a(i13);
                        b bVar = (KeyboardHandler) bVarA.a();
                        float fC = bVarA.c();
                        bVarA.a(((bVar.c - fC) * 0.2f) + fC);
                    }
                }
            }
        };
        C0109a();
    }

    public float[] a() {
        return this.k;
    }

    public boolean b() {
        return this.e;
    }

    public void c() {
        this.b = GraphicsEngineBridge.b(b.d.grid_point);
        this.WorkspaceShortcutTouchHandler.a(com.censivn.C3DEngine.b.b.ScreenConstants.p, com.censivn.C3DEngine.b.b.ScreenConstants.q, DimensionHelper.a(com.censivn.C3DEngine.C3DEngine.d(), com.censivn.C3DEngine.b.b.ScreenConstants.i), DimensionHelper.a(com.censivn.C3DEngine.C3DEngine.d(), com.censivn.C3DEngine.b.b.ScreenConstants.j));
    }

    public boolean a(WorkspacePage gVar) {
        if (this.e) {
            return false;
        }
        this.l = gVar;
        this.l.f();
        com.censivn.C3DEngine.b.c.KeyboardHandler.a(this);
        this.e = true;
        gVar.addChildAt(this.c, 0);
        this.m = com.tsf.shell.manager.app.Notifier.a(this.m, "Desktop reference grid");
        this.c.children().clear();
        this.a.WorkspaceShortcutTouchHandler.removeFromParent();
        this.c.addChild(this.a.a);
        c.a(this.c);
        return true;
    }

    public void a(com.tsf.shell.f.i.PageItem bVar) {
        this.d = bVar;
        float fU = this.d.u();
        this.g = (this.d.maxX() - this.d.minX()) * fU;
        this.h = fU * (this.d.maxY() - this.d.minY());
        this.i = (int) (this.g / this.a.f);
        this.i = this.g % this.a.f != 0.0f ? this.i + 1 : this.i;
        this.i = this.i < 1 ? 1 : this.i;
        this.j = (int) (this.h / this.a.g);
        this.j = this.h % this.a.g != 0.0f ? this.j + 1 : this.j;
        this.j = this.j >= 1 ? this.j : 1;
    }

    public void b(com.tsf.shell.f.i.PageItem bVar) {
        this.d = null;
    }

    public int[] a(int i, int i2) {
        int i3 = (int) (i / this.a.b);
        if (i % this.a.b != 0.0f) {
            i3++;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = (int) (i2 / this.a.c);
        if (i2 % this.a.c != 0.0f) {
            i4++;
        }
        if (i4 < 1) {
            i4 = 1;
        }
        return new int[]{(int) (i3 * this.a.b), (int) (i4 * this.a.c)};
    }

    public void d() {
        if (this.e) {
            this.e = false;
            this.l.g();
            this.l = null;
            final int iB = this.a.WorkspaceShortcutTouchHandler.b();
            for (int i = 0; i < iB; i++) {
                com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = this.a.WorkspaceShortcutTouchHandler.a(i);
                ((KeyboardHandler) bVarA.a()).c = bVarA.c();
            }
            final C0109a c0109a = this.a;
            d dVar = new d() { // from class: com.tsf.shell.f.f.c.WorkspaceShortcutTouchHandler.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < iB) {
                            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA2 = c0109a.WorkspaceShortcutTouchHandler.a(i3);
                            bVarA2.a(((KeyboardHandler) bVarA2.a()).c * (1.0f - f));
                            i2 = i3 + 1;
                        } else {
                            return;
                        }
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    for (int i2 = 0; i2 < iB; i2++) {
                        com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA2 = c0109a.WorkspaceShortcutTouchHandler.a(i2);
                        ((KeyboardHandler) bVarA2.a()).c = 0.0f;
                        bVarA2.a(0.0f);
                    }
                    WorkspaceShortcutTouchHandler.this.d = null;
                    WorkspaceShortcutTouchHandler.this.c.removeFromParent();
                    WorkspaceShortcutTouchHandler.this.f = false;
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void c() {
                    WorkspaceShortcutTouchHandler.this.f = false;
                }
            };
            c.a(this.c);
            c.a(this.c, 300, dVar);
            this.f = true;
            com.tsf.shell.manager.app.Notifier.b(this.m);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            C0109a();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i, int i2, int i3, int i4) {
        this.WorkspaceShortcutTouchHandler.a(com.censivn.C3DEngine.b.b.ScreenConstants.p, com.censivn.C3DEngine.b.b.ScreenConstants.q, DimensionHelper.a(com.censivn.C3DEngine.C3DEngine.d(), com.censivn.C3DEngine.b.b.ScreenConstants.i), DimensionHelper.a(com.censivn.C3DEngine.C3DEngine.d(), com.censivn.C3DEngine.b.b.ScreenConstants.j));
    }
}
