package com.tsf.shell.f.g.a;

import android.content.ComponentName;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.n;
import com.tsf.shell.ShellActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.tsf.shell.f.e.g.d {
    public c a;
    public e b;
    public d c;
    public g d;
    public f e;
    private n f;
    private boolean g;
    private j h;
    private com.tsf.shell.f.i.b.e.b i;
    private Runnable j;
    private boolean k;

    public b() {
        super(210.0f * com.censivn.C3DEngine.b.b.a.c);
        this.g = true;
        this.k = false;
        ArrayList<com.tsf.shell.f.e.g.a.b> arrayList = new ArrayList<>();
        this.a = new c(this);
        arrayList.add(this.a);
        this.c = new d(this);
        arrayList.add(this.c);
        this.b = new e(this);
        arrayList.add(this.b);
        this.d = new g(this);
        arrayList.add(this.d);
        this.e = new f(this);
        arrayList.add(this.e);
        setMenuItems(arrayList);
        this.f = new n();
        this.f.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.f) { // from class: com.tsf.shell.f.g.a.b.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (b.this.g) {
                    com.tsf.shell.manager.a.h.s().a(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (b.this.g) {
                    com.tsf.shell.manager.a.h.s().d(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (b.this.g) {
                    com.tsf.shell.manager.a.h.s().d(motionEvent);
                    b.this.templeteShow();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (b.this.g) {
                    b.this.templeteHide();
                }
            }
        });
        this.f.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
    }

    private void a(boolean z) {
        this.g = z;
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onMenuChanged(com.tsf.shell.f.e.g.a.c cVar) {
        a(cVar instanceof c);
        if (cVar instanceof a) {
            b();
        } else {
            c();
        }
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onShow() {
        com.tsf.shell.manager.a.c.d();
        com.tsf.shell.manager.action.f.b();
        com.tsf.shell.manager.a.j.b(this.f);
        com.tsf.shell.manager.a.j.a(this.f);
        this.f.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onHide() {
        com.tsf.shell.manager.a.c.e();
        com.tsf.shell.manager.action.f.c();
        c();
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onHideComplete() {
        com.tsf.shell.manager.a.j.b(this.f);
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
        d();
    }

    public com.tsf.shell.f.i.b.e.b a() {
        e();
        return this.i;
    }

    private void d() {
        if (this.h != null) {
            this.h.position().y = com.censivn.C3DEngine.b.b.a.B - ((com.censivn.C3DEngine.b.b.a.E - getHeight()) / 2.0f);
        }
    }

    public void b() {
        if (!this.k) {
            e();
            this.k = true;
            d();
            com.tsf.shell.manager.a.c.a(this.j);
        } else {
            com.tsf.shell.f.e.g.a.c currentMenuItem = getCurrentMenuItem();
            if (currentMenuItem != null && (currentMenuItem instanceof a)) {
                ((a) currentMenuItem).c();
            }
        }
        com.tsf.shell.f.e.g.a.c currentMenuItem2 = getCurrentMenuItem();
        if (currentMenuItem2 != null && (currentMenuItem2 instanceof a)) {
            a aVar = (a) currentMenuItem2;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.f(aVar.a() + 0.0f);
            dVar.h(aVar.b() + 0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.i);
            com.censivn.C3DEngine.b.g.c.a(this.i, 250, dVar);
        }
    }

    private void e() {
        if (this.i == null) {
            com.tsf.shell.manager.a.f fVarB = com.tsf.shell.manager.bind.a.c().b(new ComponentName(com.censivn.C3DEngine.a.d().getPackageName(), ShellActivity.class.getName()));
            TextureElement textureElement = fVarB.d;
            if (textureElement.id == 0) {
                fVarB.f();
            }
            this.i = new com.tsf.shell.f.i.b.e.h() { // from class: com.tsf.shell.f.g.a.b.2
                com.tsf.shell.f.d.b.a.d a;

                @Override // com.censivn.C3DEngine.b.f.j
                public void onDrawChildStart() {
                    super.onDrawChildStart();
                    this.a = null;
                    if (b.this.e == b.this.getCurrentMenuItem()) {
                        this.a = com.tsf.shell.manager.a.v.f.h();
                        this.a.a(this);
                    }
                }

                @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.censivn.C3DEngine.b.f.j
                public void onDrawChildEnd() {
                    super.onDrawChildEnd();
                    if (this.a != null) {
                        this.a.b(this);
                    }
                }
            };
            this.h = new j();
            this.h.addChild(this.i);
            this.i.k.textures().addElement(textureElement);
            this.i.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.i) { // from class: com.tsf.shell.f.g.a.b.3
                @Override // com.censivn.C3DEngine.b.d.a
                public void e(MotionEvent motionEvent) {
                    b.this.i.aQ();
                }
            });
            this.j = new Runnable() { // from class: com.tsf.shell.f.g.a.b.4
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.h.parent() == null) {
                        b.this.i.scale().setAll(0.0f, 0.0f, 1.0f);
                    }
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.g.a.b.4.1
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            com.tsf.shell.f.e.g.a.c currentMenuItem = b.this.getCurrentMenuItem();
                            if (currentMenuItem != null && (currentMenuItem instanceof a)) {
                                ((a) currentMenuItem).c();
                            }
                        }
                    };
                    dVar.l(1.0f);
                    dVar.m(1.0f);
                    dVar.a(com.censivn.C3DEngine.b.g.a.e);
                    com.censivn.C3DEngine.b.g.c.a(b.this.i);
                    com.censivn.C3DEngine.b.g.c.a(b.this.i, 360, dVar);
                    b.this.h.removeFromParent();
                    com.tsf.shell.manager.a.j.a(b.this.h);
                }
            };
        }
    }

    public void c() {
        if (this.h != null && this.k) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.g.a.b.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    com.tsf.shell.manager.a.j.b(b.this.h);
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.i);
            com.censivn.C3DEngine.b.g.c.a(this.i, 250, dVar);
            this.h.removeFromParent();
            com.tsf.shell.manager.a.j.a(this.h);
            com.tsf.shell.manager.a.c.b((Runnable) null, true);
        }
        this.k = false;
    }
}
