package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.utils.HapticFeedbackManager;

import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class DesktopTouchHandler extends com.censivn.C3DEngine.b.d.MouseEventListener {
    public boolean a;
    private DesktopTouchHandlerE b;
    private DesktopTouchHandlerD d;
    private com.tsf.shell.f.i.PageItem e;
    private float f;
    private float g;
    private boolean h;

    public DesktopTouchHandler(IRenderable iVar) {
        super(iVar);
        this.h = false;
    }

    public void a(DesktopTouchHandlerE eVar) {
        this.b = eVar;
        this.d = eVar.a();
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void f(MotionEvent motionEvent) {
        this.DesktopTouchHandlerD.c(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void g(MotionEvent motionEvent) {
        this.DesktopTouchHandlerD.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void a(MotionEvent motionEvent) {
        this.DesktopTouchHandlerD.f(motionEvent);
        this.DesktopTouchHandlerB.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void k(MotionEvent motionEvent) {
        this.DesktopTouchHandlerD.e(motionEvent);
        this.DesktopTouchHandlerB.d(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void h(MotionEvent motionEvent) {
        if (this.DesktopTouchHandlerB.a(false)) {
            this.DesktopTouchHandlerD.d(motionEvent);
            this.DesktopTouchHandlerB.a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void c(MotionEvent motionEvent) {
        int iJ;
        super.c(motionEvent);
        if (this.DesktopTouchHandlerB.a(true)) {
            this.h = false;
            com.tsf.shell.f.i.PageItem bVarE = this.DesktopTouchHandlerB.e(motionEvent);
            if (bVarE != null && (bVarE instanceof com.tsf.shell.f.i.ShortcutItem)) {
                com.tsf.shell.f.i.ShortcutItem cVar = (com.tsf.shell.f.i.ShortcutItem) bVarE;
                w.a();
                this.e = cVar;
                this.a = true;
                if (cVar.A().e()) {
                    int i = Integer.MAX_VALUE;
                    ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListI = cVar.A().i();
                    cVar.rotation().z = 0.0f;
                    int size = arrayListI.size();
                    int i2 = 0;
                    while (i2 < size) {
                        com.tsf.shell.f.i.ShortcutItem cVar2 = arrayListI.get(i2);
                        if (cVar2 != cVar) {
                            iJ = cVar2.J();
                            if (iJ >= i) {
                                iJ = i;
                            }
                            this.DesktopTouchHandlerD.d(cVar2);
                            cVar.a(cVar2);
                            this.DesktopTouchHandlerB.d();
                        } else {
                            iJ = i;
                        }
                        i2++;
                        i = iJ;
                    }
                    this.DesktopTouchHandlerB.a(i, cVar);
                    cVar.A().g();
                }
                com.tsf.shell.manager.A.j.a((IRenderable) this.e, true);
                a();
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.DesktopTouchHandlerG.TweenParams();
                dVar.l(1.2f);
                dVar.m(1.2f);
                dVar.n(1.2f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 500, dVar);
                this.DesktopTouchHandlerB.c(this.e);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void e(MotionEvent motionEvent) {
        this.DesktopTouchHandlerD.a(motionEvent);
        this.DesktopTouchHandlerB.c(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void d(MotionEvent motionEvent) {
        super.d(motionEvent);
        if (this.a) {
            this.a = false;
            boolean zA = this.DesktopTouchHandlerB.a(this.e, motionEvent.getX(), motionEvent.getY(), false, true);
            com.tsf.shell.manager.A.j.b(this.e);
            if (zA && this.DesktopTouchHandlerB.e(this.e)) {
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.DesktopTouchHandlerG.TweenParams();
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.n(1.0f);
                dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 500, dVar);
                this.DesktopTouchHandlerB.d(this.e);
                return;
            }
            this.DesktopTouchHandlerB.b().globalToLocal(this.DesktopTouchHandlerE.position());
            this.DesktopTouchHandlerB.b().addChildAt(this.e, this.DesktopTouchHandlerE.J());
            Number3d number3dA = this.DesktopTouchHandlerB.a(this.DesktopTouchHandlerE.J());
            if (this.e instanceof com.tsf.shell.f.i.ShortcutItem) {
                com.tsf.shell.f.i.ShortcutItem cVar = (com.tsf.shell.f.i.ShortcutItem) this.e;
                if (cVar.as()) {
                    ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListAw = cVar.aw();
                    ArrayList<com.tsf.shell.f.i.PageItem> arrayList = new ArrayList<>();
                    int size = arrayListAw == null ? 0 : arrayListAw.size();
                    if (size > 0) {
                        int iJ = cVar.J() + 1;
                        for (int i = 0; i < size; i++) {
                            com.tsf.shell.f.i.ShortcutItem cVar2 = arrayListAw.get(i);
                            arrayList.add(cVar2);
                            cVar2.position().x = cVar.position().x + (com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase.j * (i + 1));
                            cVar2.position().y = cVar.position().y + (com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase.j * (i + 1));
                            cVar2.removeFromParent();
                        }
                        this.DesktopTouchHandlerB.a(arrayList, iJ);
                    }
                }
            }
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.DesktopTouchHandlerG.TweenParams();
            this.DesktopTouchHandlerB.d(this.e);
            dVar2.l(1.0f);
            dVar2.m(1.0f);
            dVar2.n(1.0f);
            dVar2.f(number3dA.x);
            dVar2.h(number3dA.y);
            dVar2.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 500, dVar2);
            if (!this.h && (this.DesktopTouchHandlerB.b() instanceof com.tsf.shell.f.e.f.EditModeNode) && (this.e instanceof com.tsf.shell.f.i.ShortcutItem)) {
                ((com.tsf.shell.f.i.ShortcutItem) this.e).ai();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.a) {
            if (this.h) {
                this.DesktopTouchHandlerE.position().x = (int) (this.f + (motionEvent2.getX() - motionEvent.getX()));
                this.DesktopTouchHandlerE.position().y = (int) (this.g - (motionEvent2.getY() - motionEvent.getY()));
                this.DesktopTouchHandlerB.a(this.e, motionEvent2.getX(), motionEvent2.getY());
                return;
            }
            if (GraphicsEngineBridge.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 60.0f) {
                this.h = true;
                if (this.e instanceof com.tsf.shell.f.i.PageItem) {
                    this.DesktopTouchHandlerE.ab();
                    return;
                }
                return;
            }
            return;
        }
        this.DesktopTouchHandlerD.a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.DesktopTouchHandlerD.a(motionEvent, motionEvent2, DesktopTouchHandlerF, f2);
    }

    public void a() {
        a(this.DesktopTouchHandlerE.position().x, this.DesktopTouchHandlerE.position().y);
    }

    public void a(float f, float f2) {
        this.f = f;
        this.g = f2;
    }
}
