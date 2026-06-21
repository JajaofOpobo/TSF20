package com.tsf.shell.f.i._b.d;

import com.tsf.shell.utils.HapticFeedbackManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetItemAnimation {
    private com.censivn.C3DEngine.b.g.TweenParams a;
    private com.censivn.C3DEngine.b.g.TweenParams b;
    private com.censivn.C3DEngine.b.g.TweenParams c;
    private com.censivn.C3DEngine.b.g.TweenParams d;
    private com.censivn.C3DEngine.b.g.TweenParams e;
    private com.censivn.C3DEngine.b.g.TweenParams f;
    private com.censivn.C3DEngine.b.g.TweenParams g;
    private com.censivn.C3DEngine.b.g.TweenParams h;
    private WorkspaceShortcutItem i;

    public WidgetItemAnimation(WorkspaceShortcutItem bVar) {
        this.i = bVar;
        WidgetItemAnimation();
    }

    public void a() {
        WidgetItemAnimation();
    }

    private void c() {
        j jVar = WorkspaceShortcutItem.l;
        this.a = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        this.WidgetTouchHandler.l(1.2f);
        this.WidgetTouchHandler.m(1.2f);
        this.WidgetTouchHandler.f(jVar.c().folder.backPlaneX + ((jVar.c().folder.frontPlaneX - jVar.c().folder.backPlaneX) * 1.2f));
        this.WidgetTouchHandler.h(jVar.c().folder.backPlaneY + ((jVar.c().folder.frontPlaneY - jVar.c().folder.backPlaneY) * 1.2f));
        this.b = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        this.WorkspaceShortcutItem.l(1.2f);
        this.WorkspaceShortcutItem.m(1.2f);
        this.WorkspaceShortcutItem.f(jVar.c().folder.backPlaneX);
        this.WorkspaceShortcutItem.h(jVar.c().folder.backPlaneY);
        this.c = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        this.WidgetItemState.l(1.2f);
        this.WidgetItemState.m(1.2f);
        this.WidgetItemState.f(jVar.c().folder.backPlaneX + ((jVar.c().folder.textPlaneX - jVar.c().folder.backPlaneX) * 1.2f));
        this.WidgetItemState.h(jVar.c().folder.backPlaneY + ((jVar.c().folder.textPlaneY - jVar.c().folder.backPlaneY) * 1.2f));
        if (jVar.c().folder.sizePlaneEnable) {
            this.d = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
            this.WidgetItemLayout.l(1.2f);
            this.WidgetItemLayout.m(1.2f);
            this.WidgetItemLayout.f(jVar.c().folder.backPlaneX + ((jVar.c().folder.sizePlaneX - jVar.c().folder.backPlaneX) * 1.2f));
            this.WidgetItemLayout.h((1.2f * (jVar.c().folder.sizePlaneY - jVar.c().folder.backPlaneY)) + jVar.c().folder.backPlaneY);
        }
        this.e = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        this.WidgetItemAnimation.l(1.0f);
        this.WidgetItemAnimation.m(1.0f);
        this.WidgetItemAnimation.f(jVar.c().folder.frontPlaneX);
        this.WidgetItemAnimation.h(jVar.c().folder.frontPlaneY);
        this.f = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        this.f.l(1.0f);
        this.f.m(1.0f);
        this.f.f(jVar.c().folder.backPlaneX);
        this.f.h(jVar.c().folder.backPlaneY);
        this.g = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams() { // from class: com.tsf.shell.f.i._b.d.WidgetItemAnimation.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                ItemStubHelper.this.ScrollingIndicator.ba();
                if (ItemStubHelper.this.i.x) {
                    WorkspaceShortcutItem.m.e(ItemStubHelper.this.i);
                }
            }
        };
        this.WidgetItemGrid.l(1.0f);
        this.WidgetItemGrid.m(1.0f);
        this.WidgetItemGrid.f(jVar.c().folder.textPlaneX);
        this.WidgetItemGrid.h(jVar.c().folder.textPlaneY);
        if (jVar.c().folder.sizePlaneEnable) {
            this.h = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
            this.WidgetItemIndicator.l(1.0f);
            this.WidgetItemIndicator.m(1.0f);
            this.WidgetItemIndicator.f(jVar.c().folder.sizePlaneX);
            this.WidgetItemIndicator.h(jVar.c().folder.sizePlaneY);
        }
    }

    public void a(float f) {
        j jVar = WorkspaceShortcutItem.l;
        if (jVar.c().folder.frontPlaneEnable) {
            this.i.q.scale().setAll(f, f, 1.0f);
            this.i.q.position().x = jVar.c().folder.backPlaneX;
            this.i.q.position().y = jVar.c().folder.backPlaneY;
        }
        if (jVar.c().folder.backPlaneEnable) {
            this.i.p.scale().setAll(f, f, 1.0f);
            this.i.p.position().x = jVar.c().folder.backPlaneX;
            this.i.p.position().y = jVar.c().folder.backPlaneY;
        }
        this.i.r.scale().setAll(f, f, 1.0f);
        this.i.r.position().x = jVar.c().folder.backPlaneX;
        this.i.r.position().y = jVar.c().folder.backPlaneY;
        if (jVar.c().folder.sizePlaneEnable) {
            this.i.s.scale().setAll(f, f, 1.0f);
            this.i.s.position().x = jVar.c().folder.backPlaneX;
            this.i.s.position().y = jVar.c().folder.backPlaneY;
        }
    }

    public void b() {
        j jVar = WorkspaceShortcutItem.l;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        if (this.i.q != null) {
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.q);
            dVar.l(0.0f);
            dVar.m(0.0f);
            dVar.f(jVar.c().folder.backPlaneX);
            dVar.h(jVar.c().folder.backPlaneY);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.q, 300, dVar);
        }
        if (this.i.p != null) {
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.p);
            dVar2.l(0.0f);
            dVar2.m(0.0f);
            dVar2.f(jVar.c().folder.backPlaneX);
            dVar2.h(jVar.c().folder.backPlaneY);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.p, 300, dVar2);
        }
        com.censivn.C3DEngine.b.g.TweenParams dVar3 = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams() { // from class: com.tsf.shell.f.i._b.d.WidgetItemAnimation.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                ItemStubHelper.this.ScrollingIndicator.ba();
            }
        };
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.r);
        dVar3.l(0.0f);
        dVar3.m(0.0f);
        dVar3.f(jVar.c().folder.backPlaneX);
        dVar3.h(jVar.c().folder.backPlaneY);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.r, 300, dVar3);
        if (this.i.s != null) {
            com.censivn.C3DEngine.b.g.TweenParams dVar4 = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.s);
            dVar4.l(0.0f);
            dVar4.m(0.0f);
            dVar4.f(jVar.c().folder.backPlaneX);
            dVar4.h(jVar.c().folder.backPlaneY);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.s, 300, dVar4);
        }
    }

    public void a(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        HapticFeedbackManager.a(3);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
        dVar.l(0.8f);
        dVar.m(0.8f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 250, dVar);
        this.ScrollingIndicator.aZ();
        WorkspaceShortcutItem.m.d(this.i);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.q);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.q, 300, this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.p);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.p, 300, this.b);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.r);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.r, 300, this.c);
        if (this.i.s != null) {
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.s);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.s, 300, this.d);
        }
    }

    public void b(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        if (iVar != null) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
            com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 250, dVar);
        }
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.q);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.q, 300, this.e);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.p);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.p, 300, this.f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.r);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.r, 300, this.g);
        if (this.i.s != null) {
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.s);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i.s, 300, this.h);
        }
    }
}
