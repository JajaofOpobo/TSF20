package com.tsf.shell.manager.r.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.shell.f.e.g.a.a;
import com.tsf.shell.utils.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c<E> extends com.tsf.shell.f.e.g.a.b {
    public com.tsf.shell.manager.r.b.a a;
    private h b;
    private j c;
    private a<E> d;

    public static abstract class a<E> {
        public abstract ArrayList<E> a();
    }

    public void a() {
        this.b.d();
    }

    public c(String str) {
        super(str);
    }

    public void a(MotionEvent motionEvent, E e, i iVar) {
    }

    public boolean b(MotionEvent motionEvent, E e, i iVar) {
        return true;
    }

    public i a(E e) {
        return null;
    }

    public void b(E e) {
    }

    public void c(E e) {
    }

    public boolean a(a<E> aVar) {
        return this.d == aVar;
    }

    public void b(a<E> aVar) {
        final boolean z;
        if (this.d == null) {
            this.d = aVar;
            this.b.d();
            this.b.e();
            return;
        }
        if (this.d != aVar) {
            this.d = aVar;
            z = true;
        } else {
            z = false;
        }
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.r.b.c.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (z) {
                    c.this.b.d();
                    c.this.b.e();
                }
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.a(255);
                dVar2.h(0.0f);
                dVar2.a(com.censivn.C3DEngine.b.g.a.a);
                com.censivn.C3DEngine.b.g.c.a(c.this.b);
                com.censivn.C3DEngine.b.g.c.a(c.this.b, 500, dVar2);
            }
        };
        dVar.a(0);
        dVar.h((-this.a.getHeight()) * 0.8f);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, VEasing.Back.easeIn, dVar);
    }

    public i a(E e, int i, i iVar) {
        return iVar;
    }

    public void a(final com.tsf.shell.manager.r.b.a aVar, ArrayList<a.C0095a> arrayList, float f, float f2, float f3, float f4) {
        this.a = aVar;
        setFunctions(arrayList);
        this.c = new j();
        this.b = new h(com.censivn.C3DEngine.b.b.a.D, aVar.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.b.a.c * 20.0f, f3, f4);
        this.c.addChild(this.b);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return c.this.d.a().size();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                return c.this.a(c.this.d.a().get(i), i, iVar);
            }
        });
        this.b.b(0.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f);
        this.b.a(new f() { // from class: com.tsf.shell.manager.r.b.c.3
            private i c;
            private float d;
            private float e;

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                E e = c.this.d.a().get(i);
                if (aVar.a()) {
                    c.this.b(e);
                } else {
                    c.this.c(e);
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void b(i iVar, int i, MotionEvent motionEvent) {
                if (!aVar.a()) {
                    w.a();
                    this.c = c.this.a(c.this.d.a().get(i));
                    Number3d.TEMPNUMBER3D.reset();
                    Number3d number3dLocalToGlobal = iVar.localToGlobal(Number3d.TEMPNUMBER3D);
                    this.c.position().setAllFrom(number3dLocalToGlobal);
                    this.d = number3dLocalToGlobal.x;
                    this.e = number3dLocalToGlobal.y;
                    com.tsf.shell.manager.a.j.a(this.c);
                    c.this.a(motionEvent, c.this.d.a().get(i), this.c);
                    this.c.alpha(255.0f);
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.l(1.2f);
                    dVar.m(1.2f);
                    dVar.n(1.2f);
                    com.censivn.C3DEngine.b.g.c.a(this.c);
                    com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
                    aVar.templeteHide();
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void c(i iVar, int i, MotionEvent motionEvent) {
                if (!aVar.a()) {
                    if (c.this.b(motionEvent, c.this.d.a().get(i), this.c)) {
                        aVar.templeteShow();
                    }
                    this.c = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.c != null) {
                    this.c.position().x = this.d + (motionEvent2.getX() - motionEvent.getX());
                    this.c.position().y = this.e - (motionEvent2.getY() - motionEvent.getY());
                }
            }
        });
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.c;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }
}
