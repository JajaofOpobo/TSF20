package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.b.a.e;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.e.f;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.manager.r.c.g;
import com.tsf.shell.utils.m;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.b.a.c {
    private com.tsf.shell.f.i.b.e.b a;
    private e b;
    private float d;
    private b e;
    private C0131a f;
    private int c = 0;
    private boolean g = true;

    public a(b bVar) {
        this.e = bVar;
        e();
    }

    @Override // com.tsf.shell.f.e.f.b
    public i d() {
        return this.e.k();
    }

    @Override // com.tsf.shell.f.e.f.b
    public void a(final com.tsf.shell.f.i.c cVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.m.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.removeChild(cVar);
                a.this.e.o();
            }
        };
        if (cVar instanceof com.tsf.shell.f.i.b.d.b) {
            g.a(cVar, null, runnable);
        } else {
            g.a(cVar, runnable);
        }
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        super.onDrawStart();
        if (this.c == 1) {
            this.b.a(this.d);
        } else if (this.c == 2) {
            this.b.b(this.d);
        }
    }

    public int c(float f) {
        float b = b();
        float c = c();
        int i = (int) (((f - b) + (c / 2.0f)) / (c + com.tsf.shell.manager.o.b.a.U));
        if (i < 0) {
            i = 0;
        }
        return i > numChildren() + (-1) ? numChildren() - 1 : i;
    }

    public void a(f fVar) {
        i iVar = (i) fVar;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(1.0f);
        dVar.m(1.0f);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 300, dVar);
        this.f.a(iVar);
    }

    public void e() {
        this.d = com.censivn.C3DEngine.b.b.a.a(15.0f);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0131a extends com.censivn.C3DEngine.b.d.a {
        private Number3d b;
        private boolean d;
        private boolean e;
        private com.censivn.C3DEngine.b.d.a f;
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
            com.censivn.C3DEngine.a.d.d().a((com.censivn.C3DEngine.b.d.a) this, true);
            this.b.setAllFrom(this.g.position());
            if (this.g != null && this.g.getMouseEventListener() != null) {
                this.f = this.g.getMouseEventListener();
            }
            this.d = true;
            this.h = 0;
            a.this.addChild(a.this.a);
            this.g.setAnimationObjectState(true);
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void e(MotionEvent motionEvent) {
            this.e = false;
            this.d = false;
            this.l = false;
            this.g = a.this.getHittingObjectTarget(motionEvent, true);
            if (this.g != null && this.g.getMouseEventListener() != null) {
                this.f = this.g.getMouseEventListener();
                this.f.e(motionEvent);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void f(MotionEvent motionEvent) {
            a.this.c = 0;
            if (this.f != null) {
                this.f.f(motionEvent);
                this.f = null;
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent) {
            if (this.f != null) {
                this.f.a(motionEvent);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void c(MotionEvent motionEvent) {
            if (this.g != null) {
                w.a();
                this.h = a.this.getChildIndexOf(this.g);
                this.b.reset();
                this.b = this.g.localToGlobal(this.b);
                a.this.replaceChild(this.g, a.this.a);
                this.g.position().setAllFrom(this.b);
                this.g.setAnimationObjectState(true);
                com.tsf.shell.manager.a.j.a(this.g);
                this.d = true;
                com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) this.g;
                if (cVar.A().e()) {
                    ArrayList<com.tsf.shell.f.i.c> i = cVar.A().i();
                    cVar.rotation().z = 0.0f;
                    int size = i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) i.get(i2);
                        if (bVar != cVar) {
                            cVar.a((com.tsf.shell.f.i.c) bVar);
                        }
                    }
                    cVar.A().g();
                }
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void d(MotionEvent motionEvent) {
            if (this.g != null) {
                this.d = false;
                if (!this.l) {
                    this.b.setAllFrom(this.g.position());
                    com.tsf.shell.manager.a.j.b(this.g);
                    a.this.globalToLocal(this.b);
                    a.this.replaceChild(a.this.a, this.g);
                    int childIndexOf = a.this.getChildIndexOf(this.g);
                    this.g.position().setAllFrom(this.b);
                    a.this.b(this.g);
                    com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) this.g;
                    a.this.e.a((com.tsf.shell.f.i.b) cVar, true);
                    if (cVar.as()) {
                        ArrayList<com.tsf.shell.f.i.c> aw = cVar.aw();
                        int size = aw == null ? 0 : aw.size();
                        if (size > 0) {
                            if (childIndexOf != -1) {
                                for (int i = 0; i < size; i++) {
                                    com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) aw.get(i);
                                    bVar.position().x = cVar.position().x + (com.tsf.shell.f.i.b.e.b.j * (i + 1));
                                    bVar.position().y = cVar.position().y + (com.tsf.shell.f.i.b.e.b.j * (i + 1));
                                    bVar.removeFromParent();
                                    a.this.addChildAt(bVar, childIndexOf);
                                    a.this.e.a((com.tsf.shell.f.i.b) bVar, true);
                                }
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("restoreShortcut index error", Integer.toString(childIndexOf));
                                m.a("EVENT_ISSUSE_FOLDER_ITEM_MOUSE_EVENT", hashMap);
                            }
                        }
                    } else if (!this.e) {
                        cVar.ai();
                    }
                    a.this.e.o();
                }
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
            if (this.g != null && this.d && !this.i) {
                this.i = true;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.m.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0131a.this.i = false;
                        if (C0131a.this.d) {
                            if (C0131a.this.e) {
                                if (C0131a.this.l) {
                                    C0131a.this.g.position().x = (motionEvent2.getX() - motionEvent.getX()) + C0131a.this.b.x;
                                    C0131a.this.g.position().y = (motionEvent.getY() - motionEvent2.getY()) + C0131a.this.b.y;
                                    return;
                                }
                                float b = a.this.b();
                                a.this.c();
                                x.a(motionEvent2, C0131a.this.j);
                                C0131a.this.k.x = C0131a.this.j[0];
                                C0131a.this.k.y = C0131a.this.j[1];
                                float f = C0131a.this.k.x;
                                a.this.b.globalToLocal(C0131a.this.k);
                                if (!(a.this.e.d() == 0 ? f > ((float) com.censivn.C3DEngine.b.b.a.z) + b.a : f < ((float) com.censivn.C3DEngine.b.b.a.A) - b.a)) {
                                    if (C0131a.this.k.y > a.this.b.maxY() - b) {
                                        a.this.c = 1;
                                    } else if (C0131a.this.k.y < b + a.this.b.minY()) {
                                        a.this.c = 2;
                                    } else {
                                        a.this.c = 0;
                                        C0131a.this.k.x = C0131a.this.j[0];
                                        C0131a.this.k.y = C0131a.this.j[1];
                                        a.this.globalToLocal(C0131a.this.k);
                                        int c = a.this.c(-C0131a.this.k.y);
                                        if (C0131a.this.h != c) {
                                            C0131a.this.h = c;
                                            a.this.a((i) a.this.a);
                                            a.this.addChildAt(a.this.a, C0131a.this.h);
                                        }
                                    }
                                } else if (com.tsf.shell.manager.a.h.F() != -1) {
                                    C0131a.this.l = true;
                                    a.this.removeChild(a.this.a);
                                    a.this.e.o();
                                    final com.censivn.C3DEngine.b.d.a aVar = C0131a.this.f;
                                    a.this.e.a(new Runnable() { // from class: com.tsf.shell.manager.m.a.a.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            ((com.tsf.shell.f.i.b.e.b) C0131a.this.g).ah();
                                            ((com.tsf.shell.f.i.b.e.b) C0131a.this.g).aO();
                                            if (C0131a.this.d) {
                                                C0131a.this.f.c(null);
                                                com.censivn.C3DEngine.a.d.d().e();
                                                com.censivn.C3DEngine.a.d.d().a(C0131a.this.f, true);
                                                return;
                                            }
                                            aVar.d(com.censivn.C3DEngine.a.d.d().g());
                                        }
                                    });
                                }
                                C0131a.this.g.position().x = (motionEvent2.getX() - motionEvent.getX()) + C0131a.this.b.x;
                                C0131a.this.g.position().y = (motionEvent.getY() - motionEvent2.getY()) + C0131a.this.b.y;
                            } else if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                C0131a.this.e = true;
                            }
                        }
                    }
                });
            }
        }
    }
}
