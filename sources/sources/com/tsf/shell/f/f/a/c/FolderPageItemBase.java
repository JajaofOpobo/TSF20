package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.manager.n.ToastOverlayController;
import com.tsf.shell.f.f.a.PageContainerView0133a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderPageItemBase extends com.censivn.C3DEngine.b.f.BaseRenderable {
    protected com.tsf.shell.f.f.a.FolderPage a;
    protected com.tsf.shell.f.f.a.PageGridRenderer b;
    protected int c;
    protected String d;
    protected com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable e;
    protected C0133a f;
    private TextureElement g = new TextureElement(0, false);
    private boolean h = false;
    private boolean i = false;
    private Runnable j;

    public FolderPageItemBase(com.tsf.shell.f.f.a.FolderPage hVar, com.tsf.shell.f.f.a.PageGridRenderer fVar, int i, String str) {
        this.c = 0;
        this.b = fVar;
        this.a = hVar;
        this.c = i;
        this.d = str;
        position().y = (-com.tsf.shell.f.f.a.PageGridRenderer.a) / 2.0f;
        alpha(0.0f);
        e();
    }

    public com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable e() {
        if (this.e == null) {
            this.e = FolderLabelConfig.a();
            this.FolderLabelElement.textures().addElement(this.g);
            com.censivn.C3DEngine.b.d.MouseEventListener aVar = new com.censivn.C3DEngine.b.FolderAppMenu.MouseEventListener(this.e) { // from class: com.tsf.shell.f.f.a.c.FolderPageItemBase.1
                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent) {
                    if (FolderPageItemBase.this.h) {
                        if (FolderPageItemBase.this.j != null) {
                            FolderPageItemBase.this.DrawerLabelConfig.run();
                        }
                    } else if (!FolderPageItemBase.this.FolderWidgetTouchHandler.a(FolderPageItemBase.this)) {
                        FolderPageItemBase.this.FolderWidgetTouchHandler.m();
                    }
                }
            };
            this.FolderLabelElement.calAABB();
            this.FolderLabelElement.a(true);
            this.FolderLabelElement.setMouseEventListener(aVar);
        }
        return this.e;
    }

    public void f() {
        this.FolderLabelElement.a(1).a((Boolean) true);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderCountdownBadge.TweenParams() { // from class: com.tsf.shell.f.f.a.c.FolderPageItemBase.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.FolderLabelElement.a(1));
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.FolderLabelElement.a(1), 500, dVar);
    }

    public void g() {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderCountdownBadge.TweenParams() { // from class: com.tsf.shell.f.f.a.c.FolderPageItemBase.3
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                FolderPageItemBase.this.FolderLabelElement.a(1).a((Boolean) false);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.FolderLabelElement.a(1));
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.FolderLabelElement.a(1), 500, dVar);
    }

    public void c(boolean z) {
        this.i = false;
        if (a(z)) {
            this.f = com.tsf.shell.manager.app.Notifier.a(this.f, this.d);
        }
        b(z);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderCountdownBadge.TweenParams() { // from class: com.tsf.shell.f.f.a.c.FolderPageItemBase.4
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                FolderPageItemBase.this.i = true;
                FolderPageItemBase.this.m();
            }
        };
        dVar.h(com.tsf.shell.f.f.a.PageGridRenderer.a / 2.0f);
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, 500, dVar);
        removeFromParent();
        this.FolderWidgetTouchHandler.h().addChild(this);
    }

    private void c() {
        if (this.g.id == 0) {
            FolderLabelConfig.a(this.g, this.c, this.d);
        }
    }

    public boolean a(boolean z) {
        return true;
    }

    public void h() {
    }

    public void i() {
        this.i = false;
        com.tsf.shell.manager.app.Notifier.b(this.f);
        a();
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderCountdownBadge.TweenParams() { // from class: com.tsf.shell.f.f.a.c.FolderPageItemBase.5
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                FolderPageItemBase.this.removeFromParent();
                FolderPageItemBase.this.b();
            }
        };
        dVar.a(0);
        dVar.h((-com.tsf.shell.f.f.a.PageGridRenderer.a) / 2.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, 500, dVar);
    }

    public void j() {
        if (this.e != null) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderCountdownBadge.TweenParams();
            dVar.a(VEasing.Back.easeIn);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 150, dVar);
        }
    }

    public void k() {
        if (this.e != null) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderCountdownBadge.TweenParams();
            dVar.a(50);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 150, dVar);
        }
    }

    public boolean l() {
        return true;
    }

    public void a(int i, int i2, int i3, int i4) {
    }

    public void b(boolean z) {
    }

    public void a() {
    }

    public void m() {
    }

    public void b() {
    }

    public void n() {
        c();
    }

    public void o() {
    }

    public void p() {
    }

    public void a(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
    }

    public void b(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
    }

    public void c(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
    }

    public void d(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
    }

    public void a(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    public void a(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void b(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void e(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
    }
}
