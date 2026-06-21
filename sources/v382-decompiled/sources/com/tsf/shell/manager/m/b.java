package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.a.h;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.n;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class b extends com.censivn.C3DEngine.b.d.a {
    final /* synthetic */ a a;
    private Number3d b;
    private boolean d;
    private boolean e;
    private com.censivn.C3DEngine.b.d.a f;
    private j g;
    private int h;
    private boolean i;
    private float[] j;
    private Number3d k;
    private boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, j jVar) {
        super(jVar);
        this.a = aVar;
        this.b = new Number3d();
        this.d = false;
        this.e = false;
        this.i = false;
        this.j = new float[]{0.0f, 0.0f};
        this.k = new Number3d();
        this.l = false;
    }

    public void a(j jVar) {
        com.tsf.shell.e.i.b.e.b bVar;
        this.d = false;
        this.l = false;
        this.g = jVar;
        this.e = true;
        h.d().e();
        h.d().a((com.censivn.C3DEngine.b.d.a) this, true);
        this.b.setAllFrom(this.g.position());
        if (this.g != null && this.g.getMouseEventListener() != null) {
            this.f = this.g.getMouseEventListener();
        }
        this.d = true;
        this.h = 0;
        a aVar = this.a;
        bVar = this.a.a;
        aVar.addChild(bVar);
        this.g.setAnimationObjectState(true);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.e = false;
        this.d = false;
        this.l = false;
        this.g = this.a.getHittingObjectTarget(motionEvent, true);
        if (this.g != null && this.g.getMouseEventListener() != null) {
            this.f = this.g.getMouseEventListener();
            this.f.e(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        this.a.c = 0;
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
        com.tsf.shell.e.i.b.e.b bVar;
        if (this.g != null) {
            w.a();
            this.h = this.a.getChildIndexOf(this.g);
            this.b.reset();
            this.b = this.g.localToGlobal(this.b);
            a aVar = this.a;
            j jVar = this.g;
            bVar = this.a.a;
            aVar.replaceChild(jVar, bVar);
            this.g.position().setAllFrom(this.b);
            this.g.setAnimationObjectState(true);
            com.tsf.shell.manager.a.j.a(this.g);
            this.d = true;
            com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) this.g;
            if (eVar.A().e()) {
                ArrayList i = eVar.A().i();
                eVar.rotation().z = 0.0f;
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) i.get(i2);
                    if (bVar2 != eVar) {
                        eVar.a((com.tsf.shell.e.i.e) bVar2);
                    }
                }
                eVar.A().g();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void d(MotionEvent motionEvent) {
        com.tsf.shell.e.i.b.e.b bVar;
        if (this.g != null) {
            this.d = false;
            if (!this.l) {
                this.b.setAllFrom(this.g.position());
                com.tsf.shell.manager.a.j.b(this.g);
                this.a.globalToLocal(this.b);
                a aVar = this.a;
                bVar = this.a.a;
                aVar.replaceChild(bVar, this.g);
                int childIndexOf = this.a.getChildIndexOf(this.g);
                this.g.position().setAllFrom(this.b);
                this.a.b(this.g);
                com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) this.g;
                this.a.e.a((com.tsf.shell.e.i.c) eVar, true);
                if (eVar.as()) {
                    ArrayList aw = eVar.aw();
                    int size = aw == null ? 0 : aw.size();
                    if (size > 0) {
                        if (childIndexOf != -1) {
                            for (int i = 0; i < size; i++) {
                                com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) aw.get(i);
                                bVar2.position().x = eVar.position().x + (com.tsf.shell.e.i.b.e.b.j * (i + 1));
                                bVar2.position().y = eVar.position().y + (com.tsf.shell.e.i.b.e.b.j * (i + 1));
                                bVar2.removeFromParent();
                                this.a.addChildAt(bVar2, childIndexOf);
                                this.a.e.a((com.tsf.shell.e.i.c) bVar2, true);
                            }
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("restoreShortcut index error", Integer.toString(childIndexOf));
                            n.a("EVENT_ISSUSE_FOLDER_ITEM_MOUSE_EVENT", hashMap);
                        }
                    }
                } else if (!this.e) {
                    eVar.ai();
                }
                this.a.e.o();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.g != null && this.d && !this.i) {
            this.i = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.m.b.1
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.b.a.e eVar;
                    com.censivn.C3DEngine.b.b.a.e eVar2;
                    com.censivn.C3DEngine.b.b.a.e eVar3;
                    com.tsf.shell.e.i.b.e.b bVar;
                    com.tsf.shell.e.i.b.e.b bVar2;
                    com.tsf.shell.e.i.b.e.b bVar3;
                    b.this.i = false;
                    if (b.this.d) {
                        if (!b.this.e) {
                            if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                b.this.e = true;
                                return;
                            }
                            return;
                        }
                        if (!b.this.l) {
                            float b = b.this.a.b();
                            b.this.a.c();
                            x.a(motionEvent2, b.this.j);
                            b.this.k.x = b.this.j[0];
                            b.this.k.y = b.this.j[1];
                            float f = b.this.k.x;
                            eVar = b.this.a.b;
                            eVar.globalToLocal(b.this.k);
                            if (!(b.this.a.e.d() == 0 ? f > ((float) com.censivn.C3DEngine.b.b.a.z) + c.a : f < ((float) com.censivn.C3DEngine.b.b.a.A) - c.a)) {
                                float f2 = b.this.k.y;
                                eVar2 = b.this.a.b;
                                if (f2 > eVar2.maxY() - b) {
                                    b.this.a.c = 1;
                                } else {
                                    float f3 = b.this.k.y;
                                    eVar3 = b.this.a.b;
                                    if (f3 < b + eVar3.minY()) {
                                        b.this.a.c = 2;
                                    } else {
                                        b.this.a.c = 0;
                                        b.this.k.x = b.this.j[0];
                                        b.this.k.y = b.this.j[1];
                                        b.this.a.globalToLocal(b.this.k);
                                        int c = b.this.a.c(-b.this.k.y);
                                        if (b.this.h != c) {
                                            b.this.h = c;
                                            a aVar = b.this.a;
                                            bVar = b.this.a.a;
                                            aVar.a((j) bVar);
                                            a aVar2 = b.this.a;
                                            bVar2 = b.this.a.a;
                                            aVar2.addChildAt(bVar2, b.this.h);
                                        }
                                    }
                                }
                            } else if (com.tsf.shell.manager.a.h.F() != -1) {
                                b.this.l = true;
                                a aVar3 = b.this.a;
                                bVar3 = b.this.a.a;
                                aVar3.removeChild(bVar3);
                                b.this.a.e.o();
                                final com.censivn.C3DEngine.b.d.a aVar4 = b.this.f;
                                b.this.a.e.a(new Runnable() { // from class: com.tsf.shell.manager.m.b.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ((com.tsf.shell.e.i.b.e.b) b.this.g).ah();
                                        ((com.tsf.shell.e.i.b.e.b) b.this.g).aO();
                                        if (b.this.d) {
                                            b.this.f.c(null);
                                            h.d().e();
                                            h.d().a(b.this.f, true);
                                            return;
                                        }
                                        aVar4.d(h.d().g());
                                    }
                                });
                            }
                            b.this.g.position().x = (motionEvent2.getX() - motionEvent.getX()) + b.this.b.x;
                            b.this.g.position().y = (motionEvent.getY() - motionEvent2.getY()) + b.this.b.y;
                            return;
                        }
                        b.this.g.position().x = (motionEvent2.getX() - motionEvent.getX()) + b.this.b.x;
                        b.this.g.position().y = (motionEvent.getY() - motionEvent2.getY()) + b.this.b.y;
                    }
                }
            });
        }
    }
}
