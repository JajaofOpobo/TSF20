package com.tsf.shell.manager.r.c;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;

import com.tsf.shell.f.e.LassoSelectionHandler;
import com.tsf.shell.f.e.ILassoSelectable;
import com.tsf.shell.f.e.LassoContextMenu;
import com.tsf.shell.manager.n.ToastOverlayController;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MultiSelectLinePicker implements WidgetFeatureConfig.a, WidgetRegistryManager.a, KeyEventListener.a, ToastOverlayController.a {
    private static A e;
    private j a;
    private h b;
    private String c;
    private String d;
    private boolean f;
    private C0133a g;
    private ArrayList<com.tsf.shell.f.i.PageItem> h;
    private boolean i = false;
    private boolean j = false;

    public class A implements Comparator<i> {
        public A() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            float f = (com.censivn.C3DEngine.b.b.A.I - (iVar.position().y * com.censivn.C3DEngine.b.b.A.F)) + iVar.position().x + com.censivn.C3DEngine.b.b.A.H;
            float f2 = (com.censivn.C3DEngine.b.b.A.I - (iVar2.position().y * com.censivn.C3DEngine.b.b.A.F)) + iVar2.position().x + com.censivn.C3DEngine.b.b.A.H;
            if (f > f2) {
                return 1;
            }
            if (f < f2) {
                return -1;
            }
            return 0;
        }
    }

    public MultiSelectLinePicker() {
        if (e == null) {
            e = new A();
        }
        this.d = com.censivn.C3DEngine.A.d().getString(b.i.line_picker_back_to_select);
        this.c = com.censivn.C3DEngine.A.d().getString(b.i.notic_function_unavailable);
        this.a = new j() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                MultiSelectLinePicker.this.c();
            }
        };
        this.b = new h();
        this.b.a(this.a);
        this.b.a(this);
        this.b.a(true);
        this.a.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.a) { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.2
            boolean a = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                com.tsf.shell.manager.action.GestureHandler.a();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!MultiSelectLinePicker.this.b.a()) {
                    MultiSelectLinePicker.this.b.a(motionEvent, motionEvent2);
                    return;
                }
                if (!this.a) {
                    final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    final MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent2);
                    final float[] fArrA = x.a(motionEvent);
                    this.a = true;
                    com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.f.f.WorkspacePage gVarN = com.tsf.shell.manager.app.StateHub.n();
                            MultiSelectLinePicker.this.a.removeFromParent();
                            gVarN.a(MultiSelectLinePicker.this.a);
                            MultiSelectLinePicker.this.a.position().x = fArrA[0];
                            MultiSelectLinePicker.this.a.position().y = fArrA[1];
                            MultiSelectLinePicker.this.b.a(motionEventObtain, motionEventObtain2);
                        }
                    });
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                MultiSelectLinePicker.this.b.a(motionEvent);
                MultiSelectLinePicker.this.c();
                this.a = false;
            }
        });
    }

    public boolean a() {
        return this.f;
    }

    public void b() {
        if (!this.f) {
            this.g = com.tsf.shell.manager.app.Notifier.a(this.g, x.c(b.i.notic_line_picker_notic));
            this.f = true;
            this.a.position().x = 0.0f;
            this.a.position().y = 0.0f;
            this.a.removeFromParent();
            com.censivn.C3DEngine.b.c.b.a(this);
            com.tsf.shell.manager.app.TaskScheduler.a(this.a);
            this.a.setFocus();
            this.a.setAABBPX(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.C, 0.0f, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.B, 0.0f);
            com.tsf.shell.manager.app.ObserverManager.a(this);
            e();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            c();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void c() {
        if (this.f) {
            com.tsf.shell.manager.app.Notifier.b(this.g);
            this.f = false;
            com.censivn.C3DEngine.b.c.b.b(this);
            this.a.removeFromParent();
            com.tsf.shell.manager.app.ObserverManager.b(this);
            d();
        }
    }

    public void d() {
    }

    public void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public void a(m mVar) {
        if (this.h == null) {
            this.h = new ArrayList<>();
        }
        if (mVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) mVar;
            if (bVar.ao()) {
                bVar.ar();
            }
            com.tsf.shell.f.i.PageItem bVar2 = (com.tsf.shell.f.i.PageItem) mVar;
            this.i = true;
            bVar2.setDefaultColor(h.a);
            this.h.add(bVar2);
            return;
        }
        if (mVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            com.tsf.shell.f.i.PageItem bVar3 = (com.tsf.shell.f.i.PageItem) mVar;
            this.i = true;
            bVar3.setDefaultColor(h.a);
            this.h.add(bVar3);
        }
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public void f() {
        Iterator<com.tsf.shell.f.i.PageItem> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        this.h.clear();
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public n l_() {
        return new n(this.a, this);
    }

    @Override // com.tsf.shell.f.e.LassoContextMenu.a
    public void a(int i) {
        int i2 = 1;
        ArrayList<com.tsf.shell.f.i.PageItem> arrayList = new ArrayList<>();
        for (com.tsf.shell.f.i.PageItem bVar : this.h) {
            if (!bVar.hasDestroyed()) {
                arrayList.add(bVar);
            }
        }
        this.h.clear();
        Iterator<com.tsf.shell.f.i.PageItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        switch (i) {
            case 0:
                if (arrayList.size() > 1 && arrayList.get(0).z() != null) {
                    com.censivn.C3DEngine.b.h.b.c cVar = new com.censivn.C3DEngine.b.h.b.c(arrayList.get(0).z(), true);
                    Collections.sort(arrayList, e);
                    cVar.c();
                    cVar.a(arrayList);
                } else {
                    com.tsf.shell.e.a(b.i.notic_arrangement_error);
                }
                break;
            case 1:
                com.tsf.shell.e.a(this.c);
                break;
            case 2:
                final ArrayList arrayList2 = (ArrayList) arrayList.clone();
                com.tsf.shell.e.a(b.i.pop_menu_delete_notic, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    g.a((com.tsf.shell.f.i.PageItem) it2.next(), (Runnable) null);
                                }
                            }
                        });
                    }
                }, (Runnable) null);
                break;
            case 3:
                final ArrayList arrayList3 = new ArrayList();
                for (com.tsf.shell.f.i.PageItem bVar2 : arrayList) {
                    if (bVar2 instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
                        arrayList3.add((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar2);
                    }
                }
                if (arrayList3.size() > 0) {
                    float f = ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) arrayList3.get(0)).position().x;
                    float f2 = ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) arrayList3.get(0)).position().y;
                    Iterator it2 = arrayList3.iterator();
                    float f3 = f;
                    while (true) {
                        float f4 = f2;
                        if (it2.hasNext()) {
                            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar3 = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) it2.next();
                            f3 = (f3 + bVar3.position().x) / 2.0f;
                            f2 = (bVar3.position().y + f4) / 2.0f;
                        } else {
                            final com.tsf.shell.f.i.b.d.FolderShortcutItem bVarA = com.tsf.shell.f.i.b.d.FolderShortcutItem.a(com.tsf.shell.manager.app.StateHub.F(), (int) f3, (int) f4);
                            RenderRunnable renderRunnable = new RenderRunnable(2, i2) { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.4
                                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                                public void run() {
                                    bVarA.c(arrayList3);
                                }
                            };
                            renderRunnable.autoInvalidate = true;
                            com.censivn.C3DEngine.A.a().a(renderRunnable);
                        }
                    }
                }
                break;
            case 4:
                for (com.tsf.shell.f.i.PageItem bVar4 : arrayList) {
                    if (bVar4 instanceof com.tsf.shell.f.i.ShortcutItem) {
                        ((com.tsf.shell.f.i.ShortcutItem) bVar4).ap();
                    }
                }
                break;
        }
        arrayList.clear();
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        this.a.setAABBPX(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.C, 0.0f, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.B, 0.0f);
    }
}
