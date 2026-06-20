package com.tsf.shell.f.e.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.utils.HapticFeedbackManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ItemNode extends BaseRenderable {
    private C0093a b;
    private b c;
    private boolean d = false;
    private C0093a a = new C0093a(com.censivn.C3DEngine.b.b.A.a(20.0f), com.censivn.C3DEngine.b.b.A.E, 0);

    public ItemNode() {
        this.a.setDefaultColor(new Color4(255, 255, 255, 100));
        this.a.alpha(0.0f);
        this.b = new C0093a(com.censivn.C3DEngine.b.b.A.a(20.0f), com.censivn.C3DEngine.b.b.A.E, 1);
        this.b.setDefaultColor(new Color4(255, 255, 255, 100));
        this.b.alpha(0.0f);
        addChild(this.a);
        addChild(this.b);
        this.c = new ItemContainerNode() { // from class: com.tsf.shell.f.e.e.ItemNode.1
            @Override // com.tsf.shell.f.e.e.ItemNode.b, java.lang.Runnable
            public void run() {
                a.this.a(this.c, this.b);
            }
        };
    }

    public void a(int i, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        visible(true);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 250, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 250, dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.e.ItemNode.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.visible(false);
                if (!a.this.d) {
                    com.tsf.shell.manager.app.TaskScheduler.b(a.this);
                }
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 250, dVar);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, 250, dVar2);
    }

    public float a() {
        return 0.0f;
    }

    public void b() {
        if (!this.d) {
            this.d = true;
            removeFromParent();
            float fA = com.censivn.C3DEngine.b.b.A.C + a();
            this.a.points().setYPX(0, fA);
            this.a.points().setYPX(1, fA);
            this.b.points().setYPX(0, fA);
            this.b.points().setYPX(1, fA);
            this.a.points().setYPX(2, com.censivn.C3DEngine.b.b.A.B);
            this.a.points().setYPX(3, com.censivn.C3DEngine.b.b.A.B);
            this.b.points().setYPX(2, com.censivn.C3DEngine.b.b.A.B);
            this.b.points().setYPX(3, com.censivn.C3DEngine.b.b.A.B);
            this.a.updatePointsVBO();
            this.b.updatePointsVBO();
            this.a.calAABB(6.0f, 1.0f, 1.0f);
            this.b.calAABB(6.0f, 1.0f, 1.0f);
            com.tsf.shell.manager.app.TaskScheduler.a(this);
            com.tsf.shell.manager.app.StateManager.b(this.a);
            com.tsf.shell.manager.app.StateManager.b(this.b);
            this.a.position().x = com.censivn.C3DEngine.b.b.A.z;
            this.b.position().x = com.censivn.C3DEngine.b.b.A.A;
        }
    }

    public void a(int i) {
        com.censivn.C3DEngine.C3DEngine.a().b(this.c, i);
    }

    public void c() {
        if (this.d) {
            this.d = false;
            ItemNode();
            com.tsf.shell.manager.app.StateManager.c(this.a);
            com.tsf.shell.manager.app.StateManager.c(this.b);
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.e.e.ItemNode$a, reason: collision with other inner class name */
    class C0093a extends ItemRowItem {
        public int a;

        public C0093a(float f, float f2, int i) {
            super(f, f2, false);
            this.a = i;
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            w.a();
            a.this.c.b = fVar;
            a.this.c.c = this.a;
            com.censivn.C3DEngine.C3DEngine.a().b(a.this.c, 400L);
            a.this.d();
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            return false;
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            com.censivn.C3DEngine.C3DEngine.a().g(a.this.c);
            a.this.c.b = null;
            a.this.e();
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            com.censivn.C3DEngine.C3DEngine.a().g(a.this.c);
            a.this.c.b = null;
            a.this.e();
        }
    }

    class b implements Runnable {
        Object b;
        int c;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
