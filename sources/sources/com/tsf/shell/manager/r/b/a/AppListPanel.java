package com.tsf.shell.manager.r.b.a;


import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.k;
import com.tsf.shell.f.i.a.d;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.manager.app.ObserverManager;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppListPanel extends com.tsf.shell.f.e._g.a.b implements ObserverManager.a {
    public com.tsf.shell.manager.r.b.WidgetMenuPanel a;
    private com.tsf.shell.manager.app.AppListModel b;
    private h c;
    private float d;
    private ArrayList<g> e;
    private com.censivn.C3DEngine.b.h.b.c.a f;
    private ObserverManager.a g;
    private AppSelectionIndicatorBar h;
    private boolean i;
    private k j;

    public AppListPanel(final com.tsf.shell.manager.r.b.WidgetMenuPanel aVar, String str) {
        super(str);
        this.i = false;
        this.h = new B() { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.1
            @Override // com.tsf.shell.manager.r.b.a.b
            public void a() {
                AppListPanel.this.b();
            }

            @Override // com.tsf.shell.manager.r.b.a.b
            public void b() {
                AppListPanel.this.f();
            }

            @Override // com.tsf.shell.manager.r.b.a.b
            public void c() {
                AppListPanel.this.a();
            }
        };
        this.g = new b.a() { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.2
            @Override // com.tsf.shell.manager.app.ObserverManager.a
            public void a() {
                if (AppListPanel.this.isShowing()) {
                    AppListPanel.this.c.d();
                }
            }
        };
        this.e = new ArrayList<>();
        this.a = aVar;
        ArrayList<com.tsf.shell.f.e._g.a.a.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new com.tsf.shell.f.e._g.a.a.C0095a(com.tsf.b.d.widget_menu_setting, x.c(com.tsf.b.i.menu_manage_apps), new com.tsf.shell.f.e._g.a.a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.3
            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public boolean a() {
                return false;
            }

            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void b() {
                Home.b().m();
            }

            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void c() {
            }
        }));
        setFunctions(arrayList);
        this.c = new h(com.censivn.C3DEngine.b.b.A.D, aVar.getHeight(), 20.0f * com.censivn.C3DEngine.b.b.A.c, 20.0f * com.censivn.C3DEngine.b.b.A.c, (com.censivn.C3DEngine.b.b.A.c * 20.0f) + com.tsf.shell.manager.o.ButtonPresetManager.a.T, (com.censivn.C3DEngine.b.b.A.c * 20.0f) + com.tsf.shell.manager.o.ButtonPresetManager.a.U) { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.4
            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
            }
        };
        this.c.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.5
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                if (AppListPanel.this.b == null) {
                    return 0;
                }
                return AppListPanel.this.b.a.c();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i iVar2;
                if (iVar == null) {
                    c cVar = new AppListItemCell();
                    cVar.k.visible(true);
                    cVar.position().y = AppListPanel.this.d;
                    cVar.aO();
                    cVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(cVar));
                    iVar2 = cVar;
                } else {
                    iVar2 = iVar;
                }
                g gVarA = AppListPanel.this.b.a.a(i);
                c cVar2 = (c) iVar2;
                cVar2.a(gVarA.bi());
                cVar2.k.textures().clear();
                cVar2.k.textures().addElement(gVarA.aZ());
                return iVar2;
            }
        });
        this.c.a(new f() { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.6
            private g c;
            private d d;
            private boolean e;

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                c cVar = (c) iVar;
                g gVarA = AppListPanel.this.b.a.a(i);
                if (aVar.a()) {
                    aVar.b().a(com.tsf.shell.manager.l.ShortcutManager.a((ItemInfo) gVarA.bc(), com.tsf.shell.manager.o.ButtonPresetManager.b, false));
                    return;
                }
                if (gVarA.bi()) {
                    gVarA.a(false);
                    cVar.a(false);
                    AppListPanel.this.e.remove(gVarA);
                } else {
                    gVarA.a(true);
                    cVar.a(true);
                    AppListPanel.this.e.add(gVarA);
                }
                AppListPanel.this.c();
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void b(i iVar, int i, MotionEvent motionEvent) {
                if (!aVar.a()) {
                    w.a();
                    aVar.templeteHide();
                    g gVarA = AppListPanel.this.b.a.a(i);
                    this.c = gVarA.ba();
                    this.d = (d) this.c.getMouseEventListener();
                    Number3d.TEMPNUMBER3D.reset();
                    this.c.position().setAllFrom(iVar.localToGlobal(Number3d.TEMPNUMBER3D));
                    if (!AppListPanel.this.e.isEmpty()) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= AppListPanel.this.e.size()) {
                                break;
                            }
                            g gVar = (g) AppListPanel.this.e.get(i3);
                            if (gVar != gVarA) {
                                g gVarBa = gVar.ba();
                                Number3d.TEMPNUMBER3D.reset();
                                gVarBa.position().setAllFrom(iVar.localToGlobal(Number3d.TEMPNUMBER3D));
                                gVarBa.rotation().setAll(0.0f, 0.0f, 0.0f);
                                this.c.a((com.tsf.shell.f.i.ShortcutItem) gVarBa);
                            }
                            i2 = i3 + 1;
                        }
                        AppListPanel.this.b();
                        AppListPanel.this.c.d();
                    }
                    this.d.c(motionEvent);
                    this.e = true;
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void c(i iVar, int i, MotionEvent motionEvent) {
                boolean z;
                if (!aVar.a()) {
                    if (this.d != null) {
                        g gVar = (g) this.d.c;
                        gVar.h(true);
                        z = !gVar.as();
                        this.d.d(motionEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        aVar.templeteShow();
                    } else {
                        aVar.templeteHide();
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!aVar.a() && this.e && this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }
        });
        this.f = new c.a() { // from class: com.tsf.shell.manager.r.b.a.AppListPanel.7
            @Override // com.censivn.C3DEngine.b.h.b.c.a
            public void a() {
                aVar.templeteShow();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.b != null) {
            int iC = this.b.a.c();
            for (int i = 0; i < iC; i++) {
                this.b.a.a(i).a(false);
            }
            this.e.clear();
            this.c.d();
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int size = this.e.size();
        if (size > 0) {
            d();
            this.h.a(size);
        } else {
            e();
        }
    }

    private void d() {
        if (!this.i) {
            this.i = true;
            com.censivn.C3DEngine.b.c.b.a(this);
            this.h.f();
            this.a.showOption(this.h);
        }
    }

    private void e() {
        if (this.i) {
            this.i = false;
            com.censivn.C3DEngine.b.c.b.b(this);
            this.a.showOption(getMenuContainer());
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            b();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!this.e.isEmpty()) {
            ArrayList<com.tsf.shell.f.i.b.e.b> arrayList = new ArrayList<>();
            for (int i = 0; i < this.e.size(); i++) {
                arrayList.add(this.e.get(i).ba());
            }
            b();
            this.c.d();
            if (arrayList.size() > 0) {
                float f = arrayList.get(0).position().x;
                float f2 = arrayList.get(0).position().y;
                Iterator<com.tsf.shell.f.i.b.e.b> it = arrayList.iterator();
                float f3 = f;
                while (true) {
                    float f4 = f2;
                    if (it.hasNext()) {
                        com.tsf.shell.f.i.b.e.b next = it.next();
                        f3 = (f3 + next.position().x) / 2.0f;
                        f2 = (next.position().y + f4) / 2.0f;
                    } else {
                        com.tsf.shell.f.i.b.d.b.a(com.tsf.shell.manager.app.StateHub.F(), 0, (int) this.a.getScreenFreeSpaceCenter()).c(arrayList);
                        return;
                    }
                }
            }
        }
    }

    public void a() {
        this.a.templeteHide();
        com.tsf.shell.f.f.WorkspacePage gVarN = com.tsf.shell.manager.app.StateHub.n();
        if (gVarN.t() != -1) {
            this.j = (k) gVarN;
            this.j.a(this.f);
            this.c.setFocus();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.e.size()) {
                    g gVar = this.e.get(i2);
                    this.j.a(gVar, gVar);
                    i = i2 + 1;
                } else {
                    b();
                    this.c.d();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public j getContentContainer() {
        return this.c;
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.c.a(f, f2, f3, f4);
        this.h.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onShow() {
        if (this.b == null) {
            this.b = com.tsf.shell.manager.app.ServiceProvider.a();
            this.b.a.a(this.g);
            this.b.a.b();
        }
        com.tsf.shell.f.i.c.aj();
        this.c.d();
        super.onShow();
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onHide() {
        b();
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onRecycle() {
        if (this.b != null) {
            b();
            this.h.g();
            this.b.a.b(this.g);
            this.b = null;
        }
    }
}
