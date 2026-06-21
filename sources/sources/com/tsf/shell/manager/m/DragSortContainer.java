package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.b.ScreenConstants.e;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.f.e.SelectionFrameLayoutItem;
import com.tsf.shell.f.i.b.e.DrawerItemButton;
import com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil;
import com.tsf.shell.utils.FlurryAnalyticsLogger;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DragSortContainer extends com.censivn.C3DEngine.b.b.ScreenConstants.c {
    public interface InterfaceC0113a {
        java.util.ArrayList<com.censivn.C3DEngine.b.f.IRenderable> b();
    }
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase a;
    private e b;
    private float d;
    private b e;
    private C0131a f;
    private int c = 0;
    private boolean g = true;

    public DragSortContainer(b bVar) {
        this.e = bVar;
        InterfaceC0113a();
    }

    @Override // com.tsf.shell.f.e.f.EditModeNode
    public i d() {
        return this.e.k();
    }

    @Override // com.tsf.shell.f.e.f.EditModeNode
    public void a(final com.tsf.shell.f.i.ShortcutItem cVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.m.DragSortContainer.1
            @Override // java.lang.Runnable
            public void run() {
                DragSortContainer.this.removeChild(cVar);
                DragSortContainer.this.e.o();
            }
        };
        if (cVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            g.a(cVar, null, runnable);
        } else {
            g.a(cVar, runnable);
        }
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        super.onDrawStart();
        if (this.c == 1) {
            this.b.a(this.d);
        } else if (this.c == 2) {
            this.b.b(this.d);
        }
    }

    public int c(float f) {
        float fB = b();
        float fC = c();
        int i = (int) (((f - fB) + (fC / 2.0f)) / (fC + com.tsf.shell.manager.o.ButtonPresetManager.a.U));
        if (i < 0) {
            i = 0;
        }
        return i > numChildren() + (-1) ? numChildren() - 1 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(f fVar) {
        i iVar = (i) fVar;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.l(1.0f);
        dVar.m(1.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 300, dVar);
        this.f.a(iVar);
    }

    public void e() {
        this.d = com.censivn.C3DEngine.b.b.ScreenConstants.a(15.0f);
        this.a = new h();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(6);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        a(arrayList, arrayList2);
        C0131a c0131a = new C0131a(this);
        this.f = c0131a;
        setMouseEventListener(c0131a);
    }

    /* JADX INFO: renamed from: com.tsf.shell.manager.m.DragSortContainer$a, reason: collision with other inner class name */
    class C0131a extends com.censivn.C3DEngine.b.d.MouseEventListener {
        private Number3d b;
        private boolean d;
        private boolean e;
        private com.censivn.C3DEngine.b.d.MouseEventListener f;
        private i g;
        private int h;
        private boolean i;
        private float[] j;
        private Number3d k;
        private boolean l;

        public C0131a(i iVar) {
            super(iVar);
            this.b = new Number3d();
            this.d = false;
            this.e = false;
            this.i = false;
            this.j = new float[]{0.0f, 0.0f};
            this.k = new Number3d();
            this.l = false;
        }

        public void a(i iVar) {
            this.d = false;
            this.l = false;
            this.g = iVar;
            this.e = true;
            com.censivn.C3DEngine.a.d.d().e();
            com.censivn.C3DEngine.a.d.d().a((com.censivn.C3DEngine.b.d.MouseEventListener) this, true);
            this.b.setAllFrom(this.g.position());
            if (this.g != null && this.g.getMouseEventListener() != null) {
                this.f = this.g.getMouseEventListener();
            }
            this.d = true;
            this.h = 0;
            DragSortContainer.this.addChild(DragSortContainer.this.a);
            this.g.setAnimationObjectState(true);
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void e(MotionEvent motionEvent) {
            this.e = false;
            this.d = false;
            this.l = false;
            this.g = DragSortContainer.this.getHittingObjectTarget(motionEvent, true);
            if (this.g != null && this.g.getMouseEventListener() != null) {
                this.f = this.g.getMouseEventListener();
                this.f.e(motionEvent);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void f(MotionEvent motionEvent) {
            DragSortContainer.this.c = 0;
            if (this.f != null) {
                this.f.f(motionEvent);
                this.f = null;
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(MotionEvent motionEvent) {
            if (this.f != null) {
                this.f.a(motionEvent);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void c(MotionEvent motionEvent) {
            if (this.g != null) {
                w.a();
                this.h = DragSortContainer.this.getChildIndexOf(this.g);
                this.b.reset();
                this.b = this.g.localToGlobal(this.b);
                DragSortContainer.this.replaceChild(this.g, DragSortContainer.this.a);
                this.g.position().setAllFrom(this.b);
                this.g.setAnimationObjectState(true);
                com.tsf.shell.manager.app.TaskScheduler.a(this.g);
                this.d = true;
                com.tsf.shell.f.i.ShortcutItem cVar = (com.tsf.shell.f.i.ShortcutItem) this.g;
                if (cVar.A().e()) {
                    ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListI = cVar.A().i();
                    cVar.rotation().z = 0.0f;
                    int size = arrayListI.size();
                    for (int i = 0; i < size; i++) {
                        com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) arrayListI.get(i);
                        if (bVar != cVar) {
                            cVar.a((com.tsf.shell.f.i.ShortcutItem) bVar);
                        }
                    }
                    cVar.A().g();
                }
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void d(MotionEvent motionEvent) {
            if (this.g != null) {
                this.d = false;
                if (!this.l) {
                    this.b.setAllFrom(this.g.position());
                    com.tsf.shell.manager.app.TaskScheduler.b(this.g);
                    DragSortContainer.this.globalToLocal(this.b);
                    DragSortContainer.this.replaceChild(DragSortContainer.this.a, this.g);
                    int childIndexOf = DragSortContainer.this.getChildIndexOf(this.g);
                    this.g.position().setAllFrom(this.b);
                    DragSortContainer.this.b(this.g);
                    com.tsf.shell.f.i.ShortcutItem cVar = (com.tsf.shell.f.i.ShortcutItem) this.g;
                    DragSortContainer.this.e.a((com.tsf.shell.f.i.PageItem) cVar, true);
                    if (cVar.as()) {
                        ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListAw = cVar.aw();
                        int size = arrayListAw == null ? 0 : arrayListAw.size();
                        if (size > 0) {
                            if (childIndexOf != -1) {
                                for (int i = 0; i < size; i++) {
                                    com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) arrayListAw.get(i);
                                    bVar.position().x = cVar.position().x + (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase.j * (i + 1));
                                    bVar.position().y = cVar.position().y + (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase.j * (i + 1));
                                    bVar.removeFromParent();
                                    DragSortContainer.this.addChildAt(bVar, childIndexOf);
                                    DragSortContainer.this.e.a((com.tsf.shell.f.i.PageItem) bVar, true);
                                }
                            } else {
                                HashMap map = new HashMap();
                                map.put("restoreShortcut index error", Integer.toString(childIndexOf));
                                m.a("EVENT_ISSUSE_FOLDER_ITEM_MOUSE_EVENT", map);
                            }
                        }
                    } else if (!this.e) {
                        cVar.ai();
                    }
                    DragSortContainer.this.e.o();
                }
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
            if (this.g != null && this.d && !this.i) {
                this.i = true;
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.m.DragSortContainer.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0131DragSortContainer.this.i = false;
                        if (C0131DragSortContainer.this.d) {
                            if (!C0131DragSortContainer.this.e) {
                                if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                    C0131DragSortContainer.this.e = true;
                                    return;
                                }
                                return;
                            }
                            if (C0131DragSortContainer.this.l) {
                                C0131DragSortContainer.this.g.position().x = (motionEvent2.getX() - motionEvent.getX()) + C0131DragSortContainer.this.b.x;
                                C0131DragSortContainer.this.g.position().y = (motionEvent.getY() - motionEvent2.getY()) + C0131DragSortContainer.this.b.y;
                                return;
                            }
                            float fB = DragSortContainer.this.b();
                            DragSortContainer.this.c();
                            x.a(motionEvent2, C0131DragSortContainer.this.j);
                            C0131DragSortContainer.this.k.x = C0131DragSortContainer.this.j[0];
                            C0131DragSortContainer.this.k.y = C0131DragSortContainer.this.j[1];
                            float f = C0131DragSortContainer.this.k.x;
                            DragSortContainer.this.b.globalToLocal(C0131DragSortContainer.this.k);
                            if (DragSortContainer.this.e.d() == 0 ? f > ((float) com.censivn.C3DEngine.b.b.ScreenConstants.z) + b.a : f < ((float) com.censivn.C3DEngine.b.b.ScreenConstants.A) - b.a) {
                                if (com.tsf.shell.manager.app.StateHub.F() != -1) {
                                    C0131DragSortContainer.this.l = true;
                                    DragSortContainer.this.removeChild(DragSortContainer.this.a);
                                    DragSortContainer.this.e.o();
                                    final com.censivn.C3DEngine.b.d.MouseEventListener aVar = C0131DragSortContainer.this.f;
                                    DragSortContainer.this.e.a(new Runnable() { // from class: com.tsf.shell.manager.m.DragSortContainer.a.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) C0131DragSortContainer.this.g).ah();
                                            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) C0131DragSortContainer.this.g).aO();
                                            if (C0131DragSortContainer.this.d) {
                                                C0131DragSortContainer.this.f.c(null);
                                                com.censivn.C3DEngine.a.d.d().e();
                                                com.censivn.C3DEngine.a.d.d().a(C0131DragSortContainer.this.f, true);
                                                return;
                                            }
                                            aVar.d(com.censivn.C3DEngine.a.d.d().g());
                                        }
                                    });
                                }
                            } else if (C0131DragSortContainer.this.k.y > DragSortContainer.this.b.maxY() - fB) {
                                DragSortContainer.this.c = 1;
                            } else if (C0131DragSortContainer.this.k.y < fB + DragSortContainer.this.b.minY()) {
                                DragSortContainer.this.c = 2;
                            } else {
                                DragSortContainer.this.c = 0;
                                C0131DragSortContainer.this.k.x = C0131DragSortContainer.this.j[0];
                                C0131DragSortContainer.this.k.y = C0131DragSortContainer.this.j[1];
                                DragSortContainer.this.globalToLocal(C0131DragSortContainer.this.k);
                                int iC = DragSortContainer.this.c(-C0131DragSortContainer.this.k.y);
                                if (C0131DragSortContainer.this.h != iC) {
                                    C0131DragSortContainer.this.h = iC;
                                    DragSortContainer.this.a((i) DragSortContainer.this.a);
                                    DragSortContainer.this.addChildAt(DragSortContainer.this.a, C0131DragSortContainer.this.h);
                                }
                            }
                            C0131DragSortContainer.this.g.position().x = (motionEvent2.getX() - motionEvent.getX()) + C0131DragSortContainer.this.b.x;
                            C0131DragSortContainer.this.g.position().y = (motionEvent.getY() - motionEvent2.getY()) + C0131DragSortContainer.this.b.y;
                        }
                    }
                });
            }
        }
    }
}
