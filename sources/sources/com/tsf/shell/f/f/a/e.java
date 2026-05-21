package com.tsf.shell.f.f.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.manager.p.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends j {
    private static final float c = com.censivn.C3DEngine.b.b.a.a(200.0f);
    private static final int d = com.censivn.C3DEngine.b.b.a.b(100.0f);
    private h b;
    private a e;
    private j a = new j();
    private a f = new a(b.d.drawer_more_button) { // from class: com.tsf.shell.f.f.a.e.1
        @Override // com.tsf.shell.f.f.a.e.a
        public void a() {
            e.this.b.aj();
        }
    };
    private a g = new a(b.d.drawer_search_button) { // from class: com.tsf.shell.f.f.a.e.2
        @Override // com.tsf.shell.f.f.a.e.a
        public void a() {
            com.tsf.shell.manager.a.d.a(500);
        }
    };

    static class a extends k {
        private static com.tsf.shell.f.e.k e;
        private TextureElement a;
        private int d;
        private boolean f;
        private e.a g;

        public a(int i) {
            super(e.d, e.d, false);
            this.a = new TextureElement(0, false);
            this.d = 0;
            this.f = false;
            textures().addElement(this.a);
            calAABB(1.2f, 1.2f, 1.0f);
            this.d = i;
            setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.f.a.e.a.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (a.this.g != null) {
                        a.this.g.b();
                    }
                    a.this.a();
                }
            });
        }

        public void a(int i) {
            this.g = com.tsf.shell.manager.a.a.a(i);
            if (this.g.a()) {
                d();
                this.g.a(new e.a.C0142a() { // from class: com.tsf.shell.f.f.a.e.a.2
                    @Override // com.tsf.shell.manager.p.e.a.C0142a
                    public void a() {
                        a.this.e();
                    }
                });
            }
        }

        public void a() {
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (this.a.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.a, this.d, e.d, e.d);
            }
        }

        public void d() {
            if (e == null) {
                e = new com.tsf.shell.f.e.k();
                e.position().x = com.censivn.C3DEngine.b.b.a.a(50.0f);
                e.position().y = com.censivn.C3DEngine.b.b.a.a(50.0f);
            }
            this.f = true;
        }

        public void e() {
            this.f = false;
        }

        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawChildEnd() {
            if (this.f) {
                e.dispatchDraw();
            }
        }
    }

    public e(h hVar) {
        this.b = hVar;
        this.g.a(com.tsf.shell.manager.p.e.n);
        this.e = new a(b.d.drawer_home);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.f.f.a.e.3
            private float b;
            private float d;
            private boolean e = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.d.a(100);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.e = false;
                this.b = motionEvent.getX();
                this.d = motionEvent.getY();
                com.tsf.shell.manager.action.f.a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.e) {
                    com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.b, this.d);
                    return;
                }
                com.tsf.shell.manager.a.h.w();
                com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.b, this.d);
                this.e = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.e) {
                    com.tsf.shell.manager.a.h.x();
                    this.e = false;
                }
            }
        });
        this.a.addChild(this.e);
        this.a.addChild(this.f);
        this.a.addChild(this.g);
        addChild(this.a);
    }

    public void a(boolean z) {
        a(z, null);
    }

    public void a(boolean z, final Runnable runnable) {
        com.censivn.C3DEngine.b.g.c.a(this.a);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.e.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    e.this.a.visible(false);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
            dVar.a(0);
            dVar.h(-com.censivn.C3DEngine.b.b.a.a(200.0f));
            com.censivn.C3DEngine.b.g.c.a(this.a, 350, dVar);
            return;
        }
        this.a.position().y = -com.censivn.C3DEngine.b.b.a.a(200.0f);
        this.a.alpha(0.0f);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b(boolean z) {
        com.censivn.C3DEngine.b.g.c.a(this.a);
        this.a.visible(true);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            dVar.h(0.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.n);
            com.censivn.C3DEngine.b.g.c.a(this.a, 600, dVar);
            return;
        }
        this.a.position().y = 0.0f;
        this.a.alpha(255.0f);
    }

    public void a(int i, int i2, int i3, int i4) {
        position().y = com.censivn.C3DEngine.b.b.a.C + (c / 2.0f);
        this.f.position().x = com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(125.0f);
        this.g.position().x = com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(125.0f);
    }
}
