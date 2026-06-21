package com.tsf.shell.manager.r.c;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;

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
    private static IconRenderer e;
    private BaseRenderable a;
    private LassoSelectionHandler b;
    private String c;
    private String d;
    private boolean f;
    private C0133a g;
    private ArrayList<com.tsf.shell.f.i.PageItem> h;
    private boolean i = false;
    private boolean j = false;

    public class A implements Comparator<IRenderable> {
        public A() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(IRenderable iVar, i iVar2) {
            float f = (com.censivn.C3DEngine.b.b.ScreenConstants.I - (iVar.position().y * com.censivn.C3DEngine.b.b.ScreenConstants.F)) + iVar.position().x + com.censivn.C3DEngine.b.b.ScreenConstants.H;
            float f2 = (com.censivn.C3DEngine.b.b.ScreenConstants.I - (iVar2.position().y * com.censivn.C3DEngine.b.b.ScreenConstants.F)) + iVar2.position().x + com.censivn.C3DEngine.b.b.ScreenConstants.H;
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
            e = new IconRenderer();
        }
        this.d = com.censivn.C3DEngine.C3DEngine.d().getString(b.i.line_picker_back_to_select);
        this.c = com.censivn.C3DEngine.C3DEngine.d().getString(b.i.notic_function_unavailable);
        this.a = new BaseRenderable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
            }

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onKillFocus() {
                MultiSelectLinePicker.this.c();
            }
        };
        this.b = new KeyEventListener();
        this.WidgetFeatureConfig.a(this.a);
        this.WidgetFeatureConfig.a(this);
        this.WidgetFeatureConfig.a(true);
        this.ToastOverlayController.setMouseEventListener(new com.censivn.C3DEngine.b.MultiSelectLinePicker.MouseEventListener(this.a) { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.2
            boolean a = false;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                com.tsf.shell.manager.action.GestureHandler.a();
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!MultiSelectLinePicker.this.WidgetFeatureConfig.a()) {
                    MultiSelectLinePicker.this.WidgetFeatureConfig.a(motionEvent, motionEvent2);
                    return;
                }
                if (!this.a) {
                    final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    final MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent2);
                    final float[] fArrA = GraphicsEngineBridge.a(motionEvent);
                    this.a = true;
                    com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.f.f.WorkspacePage gVarN = com.tsf.shell.manager.app.StateHub.n();
                            MultiSelectLinePicker.this.ToastOverlayController.removeFromParent();
                            gVarN.a(MultiSelectLinePicker.this.a);
                            MultiSelectLinePicker.this.ToastOverlayController.position().x = fArrA[0];
                            MultiSelectLinePicker.this.ToastOverlayController.position().y = fArrA[1];
                            MultiSelectLinePicker.this.WidgetFeatureConfig.a(motionEventObtain, motionEventObtain2);
                        }
                    });
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                MultiSelectLinePicker.this.WidgetFeatureConfig.a(motionEvent);
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
            this.g = com.tsf.shell.manager.app.Notifier.a(this.g, GraphicsEngineBridge.c(b.i.notic_line_picker_notic));
            this.f = true;
            this.ToastOverlayController.position().x = 0.0f;
            this.ToastOverlayController.position().y = 0.0f;
            this.ToastOverlayController.removeFromParent();
            com.censivn.C3DEngine.b.c.KeyboardHandler.a(this);
            com.tsf.shell.manager.app.TaskScheduler.a(this.a);
            this.ToastOverlayController.setFocus();
            this.ToastOverlayController.setAABBPX(com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.C, 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, com.censivn.C3DEngine.b.b.ScreenConstants.B, 0.0f);
            com.tsf.shell.manager.app.ObserverManager.a(this);
            A();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            A();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void c() {
        if (this.f) {
            com.tsf.shell.manager.app.Notifier.b(this.g);
            this.f = false;
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            this.ToastOverlayController.removeFromParent();
            com.tsf.shell.manager.app.ObserverManager.b(this);
            A();
        }
    }

    public void d() {
    }

    public void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public void a(ILassoSelectable mVar) {
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
            this.LassoSelectionHandler.add(bVar2);
            return;
        }
        if (mVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            com.tsf.shell.f.i.PageItem bVar3 = (com.tsf.shell.f.i.PageItem) mVar;
            this.i = true;
            bVar3.setDefaultColor(h.a);
            this.LassoSelectionHandler.add(bVar3);
        }
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public void f() {
        Iterator<com.tsf.shell.f.i.PageItem> it = this.LassoSelectionHandler.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        this.LassoSelectionHandler.clear();
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public LassoContextMenu l_() {
        return new LassoContextMenu(this.a, this);
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
        this.LassoSelectionHandler.clear();
        Iterator<com.tsf.shell.f.i.PageItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        switch (i) {
            case 0:
                if (arrayList.size() > 1 && arrayList.get(0).z() != null) {
                    com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerC cVar = new com.censivn.C3DEngine.b.h.WidgetFeatureConfig.DesktopTouchHandlerC(arrayList.get(0).z(), true);
                    Collections.sort(arrayList, e);
                    cVar.c();
                    cVar.a(arrayList);
                } else {
                    com.tsf.shell.WidgetRegistryManager.a(b.i.notic_arrangement_error);
                }
                break;
            case 1:
                com.tsf.shell.WidgetRegistryManager.a(this.c);
                break;
            case 2:
                final ArrayList arrayList2 = (ArrayList) arrayList.clone();
                com.tsf.shell.WidgetRegistryManager.a(b.i.pop_menu_delete_notic, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.MultiSelectLinePicker.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    WidgetDeleteAnimationUtil.a((com.tsf.shell.f.i.PageItem) it2.next(), (Runnable) null);
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
                            com.censivn.C3DEngine.C3DEngine.a().a(renderRunnable);
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

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i, int i2, int i3, int i4) {
        this.ToastOverlayController.setAABBPX(com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.C, 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, com.censivn.C3DEngine.b.b.ScreenConstants.B, 0.0f);
    }
}
