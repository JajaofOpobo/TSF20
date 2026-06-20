package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.tsf.shell.f.f.a.c.FolderContentList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderShortcutTouchHandler extends FolderContentList.a {
    private com.tsf.shell.f.f.a.FolderPage a;
    private com.tsf.shell.f.f.a.PageGridRenderer b;
    private c c;
    private g d;
    private com.tsf.shell.f.i.ShortcutItem e;
    private com.tsf.shell.f.i.a.PageItemTouchHandler f;
    private com.censivn.C3DEngine.b.d.MouseEventListener g;

    public FolderShortcutTouchHandler(c cVar, com.tsf.shell.f.f.a.PageGridRenderer fVar, com.tsf.shell.f.f.a.FolderPage hVar) {
        this.c = cVar;
        this.a = hVar;
        this.b = fVar;
        e();
    }

    private void e() {
        this.g = new com.censivn.C3DEngine.b.d.MouseEventListener(null) { // from class: com.tsf.shell.f.f.a.c._a.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                FolderTouchBase.this.f.a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void d(MotionEvent motionEvent) {
                FolderTouchBase.this.f.d(motionEvent);
                FolderTouchBase.this.a.ak();
                FolderTouchBase.this.a.ap().q();
            }
        };
        this.d = new FolderCountdownBadge() { // from class: com.tsf.shell.f.f.a.c._a.2
            @Override // com.tsf.shell.f.f.a.c.FolderCountdownBadge
            public void b() {
                if (FolderTouchBase.this.c.c() != null) {
                    FolderTouchBase.this.a(FolderTouchBase.this.c.c());
                }
            }

            @Override // com.tsf.shell.f.f.a.c.FolderSelectionFrame, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                FolderTouchBase.this.a((com.tsf.shell.f.i.ShortcutItem) fVar);
            }

            @Override // com.tsf.shell.f.f.a.c.FolderSelectionFrame, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.f.a.c.FolderSelectionFrame, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.f.a.c.FolderSelectionFrame, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }
        };
        this.d.position().y = (com.tsf.shell.f.f.a.FolderPage.F - com.tsf.shell.f.f.a.PageGridRenderer.a) / 2.0f;
        addChild(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.i.ShortcutItem cVar) {
        com.tsf.shell.f.i.ShortcutItem cVar2;
        this.d.c();
        if (cVar instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
            cVar2 = (com.tsf.shell.f.i.b.e.DrawerItemVisual) cVar;
            this.e = ((com.tsf.shell.f.i.b.e.DrawerItemVisual) cVar).ba();
        } else if (cVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            cVar2 = (com.tsf.shell.f.i.b.d.FolderShortcutItem) cVar;
            this.e = ((com.tsf.shell.f.i.b.d.FolderShortcutItem) cVar).az();
        } else {
            cVar2 = null;
        }
        this.c.b(cVar2);
        this.f = (com.tsf.shell.f.i.a.PageItemTouchHandler) this.e.getMouseEventListener();
        this.e.ah();
        this.f.c(null);
        this.c.a(this.e);
        com.tsf.shell.manager.app.StateHub.b(this.e);
        this.c.a(this.g);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderContentList.a
    public void a() {
        com.tsf.shell.manager.app.StateManager.b(this.d);
        this.d.d();
    }

    public void b() {
        this.d.e();
    }

    @Override // com.tsf.shell.f.f.a.c.FolderContentList.a
    public void c() {
        com.tsf.shell.manager.app.StateManager.c(this.d);
        this.c.a((com.censivn.C3DEngine.b.d.MouseEventListener) null);
        b();
    }

    @Override // com.tsf.shell.f.f.a.c.FolderContentList.a
    public void d() {
    }
}
