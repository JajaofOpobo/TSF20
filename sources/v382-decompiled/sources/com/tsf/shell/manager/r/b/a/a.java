package com.tsf.shell.manager.r.b.a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.h.b.g;
import com.censivn.C3DEngine.b.h.b.i;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.e.e.g.a.d;
import com.tsf.shell.e.f.o;
import com.tsf.shell.e.i.e;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends d implements com.censivn.C3DEngine.b.c.d {
    public com.tsf.shell.manager.r.b.a a;
    private com.tsf.shell.manager.a.d b;
    private i c;
    private float d;
    private ArrayList e;
    private com.censivn.C3DEngine.b.h.b.d f;
    private com.tsf.shell.manager.a.c g;
    private b h;
    private boolean i;
    private o j;

    public a(final com.tsf.shell.manager.r.b.a aVar, String str) {
        super(str);
        this.i = false;
        this.h = new b() { // from class: com.tsf.shell.manager.r.b.a.a.1
            @Override // com.tsf.shell.manager.r.b.a.b
            public void a() {
                a.this.b();
            }

            @Override // com.tsf.shell.manager.r.b.a.b
            public void b() {
                a.this.f();
            }

            @Override // com.tsf.shell.manager.r.b.a.b
            public void c() {
                a.this.a();
            }
        };
        this.g = new com.tsf.shell.manager.a.c() { // from class: com.tsf.shell.manager.r.b.a.a.2
            @Override // com.tsf.shell.manager.a.c
            public void a() {
                if (a.this.isShowing()) {
                    a.this.c.d();
                }
            }
        };
        this.e = new ArrayList();
        this.a = aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_setting, x.c(R.string.menu_manage_apps), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.a.a.3
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return false;
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                Home.b().m();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
            }
        }));
        setFunctions(arrayList);
        this.c = new i(com.censivn.C3DEngine.b.b.a.D, aVar.getHeight(), 20.0f * com.censivn.C3DEngine.b.b.a.c, 20.0f * com.censivn.C3DEngine.b.b.a.c, (com.censivn.C3DEngine.b.b.a.c * 20.0f) + com.tsf.shell.manager.o.b.a.T, (com.censivn.C3DEngine.b.b.a.c * 20.0f) + com.tsf.shell.manager.o.b.a.U) { // from class: com.tsf.shell.manager.r.b.a.a.4
            @Override // com.censivn.C3DEngine.b.f.j
            public void onKillFocus() {
            }
        };
        this.c.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.a.a.5
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                if (a.this.b == null) {
                    return 0;
                }
                return a.this.b.a.c();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                j jVar2;
                if (jVar == null) {
                    c cVar = new c();
                    cVar.k.visible(true);
                    cVar.position().y = a.this.d;
                    cVar.aO();
                    cVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(cVar));
                    jVar2 = cVar;
                } else {
                    jVar2 = jVar;
                }
                com.tsf.shell.e.i.b.e.i a = a.this.b.a.a(i);
                c cVar2 = (c) jVar2;
                cVar2.a(a.bi());
                cVar2.k.textures().clear();
                cVar2.k.textures().addElement(a.aZ());
                return jVar2;
            }
        });
        this.c.a(new g() { // from class: com.tsf.shell.manager.r.b.a.a.6
            private com.tsf.shell.e.i.b.e.i b;
            private com.tsf.shell.e.i.a.d c;
            private boolean d;

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                w.b();
                c cVar = (c) jVar;
                com.tsf.shell.e.i.b.e.i a = a.this.b.a.a(i);
                if (aVar.a()) {
                    aVar.b().a(com.tsf.shell.manager.l.a.a((ItemInfo) a.bc(), com.tsf.shell.manager.o.b.b, false));
                    return;
                }
                if (a.bi()) {
                    a.a(false);
                    cVar.a(false);
                    a.this.e.remove(a);
                } else {
                    a.a(true);
                    cVar.a(true);
                    a.this.e.add(a);
                }
                a.this.c();
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void b(j jVar, int i, MotionEvent motionEvent) {
                if (!aVar.a()) {
                    w.a();
                    aVar.templeteHide();
                    com.tsf.shell.e.i.b.e.i a = a.this.b.a.a(i);
                    this.b = a.ba();
                    this.c = (com.tsf.shell.e.i.a.d) this.b.getMouseEventListener();
                    Number3d.TEMPNUMBER3D.reset();
                    this.b.position().setAllFrom(jVar.localToGlobal(Number3d.TEMPNUMBER3D));
                    if (!a.this.e.isEmpty()) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= a.this.e.size()) {
                                break;
                            }
                            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) a.this.e.get(i3);
                            if (iVar != a) {
                                com.tsf.shell.e.i.b.e.i ba = iVar.ba();
                                Number3d.TEMPNUMBER3D.reset();
                                ba.position().setAllFrom(jVar.localToGlobal(Number3d.TEMPNUMBER3D));
                                ba.rotation().setAll(0.0f, 0.0f, 0.0f);
                                this.b.a((e) ba);
                            }
                            i2 = i3 + 1;
                        }
                        a.this.b();
                        a.this.c.d();
                    }
                    this.c.c(motionEvent);
                    this.d = true;
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void c(j jVar, int i, MotionEvent motionEvent) {
                boolean z;
                if (!aVar.a()) {
                    if (this.c != null) {
                        com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) this.c.c;
                        iVar.h(true);
                        z = !iVar.as();
                        this.c.d(motionEvent);
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

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!aVar.a() && this.d && this.c != null) {
                    this.c.a(motionEvent, motionEvent2);
                }
            }
        });
        this.f = new com.censivn.C3DEngine.b.h.b.d() { // from class: com.tsf.shell.manager.r.b.a.a.7
            @Override // com.censivn.C3DEngine.b.h.b.d
            public void a() {
                aVar.templeteShow();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.b != null) {
            int c = this.b.a.c();
            for (int i = 0; i < c; i++) {
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
            com.censivn.C3DEngine.b.c.c.a(this);
            this.h.f();
            this.a.showOption(this.h);
        }
    }

    private void e() {
        if (this.i) {
            this.i = false;
            com.censivn.C3DEngine.b.c.c.b(this);
            this.a.showOption(getMenuContainer());
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            b();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!this.e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.e.size(); i++) {
                arrayList.add(((com.tsf.shell.e.i.b.e.i) this.e.get(i)).ba());
            }
            b();
            this.c.d();
            if (arrayList.size() > 0) {
                float f = ((com.tsf.shell.e.i.b.e.b) arrayList.get(0)).position().x;
                float f2 = ((com.tsf.shell.e.i.b.e.b) arrayList.get(0)).position().y;
                Iterator it = arrayList.iterator();
                float f3 = f;
                while (true) {
                    float f4 = f2;
                    if (it.hasNext()) {
                        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) it.next();
                        f3 = (f3 + bVar.position().x) / 2.0f;
                        f2 = (bVar.position().y + f4) / 2.0f;
                    } else {
                        com.tsf.shell.e.i.b.d.b.a(com.tsf.shell.manager.a.h.F(), 0, (int) this.a.getScreenFreeSpaceCenter()).c(arrayList);
                        return;
                    }
                }
            }
        }
    }

    public void a() {
        this.a.templeteHide();
        com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
        if (n.t() != -1) {
            this.j = (o) n;
            this.j.a(this.f);
            this.c.setFocus();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.e.size()) {
                    com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) this.e.get(i2);
                    this.j.a(iVar, iVar);
                    i = i2 + 1;
                } else {
                    b();
                    this.c.d();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.c;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.c.a(f, f2, f3, f4);
        this.h.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        if (this.b == null) {
            this.b = com.tsf.shell.manager.a.w.a();
            this.b.a.a(this.g);
            this.b.a.b();
        }
        e.aj();
        this.c.d();
        super.onShow();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
        b();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        if (this.b != null) {
            b();
            this.h.g();
            this.b.a.b(this.g);
            this.b = null;
        }
    }
}
