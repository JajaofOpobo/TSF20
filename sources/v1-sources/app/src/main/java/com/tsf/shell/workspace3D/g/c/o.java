package com.tsf.shell.workspace3D.g.c;

import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.workspace3D.k.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o extends v {
    private ArrayList A;
    private ArrayList B;
    protected ArrayList F = new ArrayList();
    private p a;

    public float aM() {
        return 0.0f;
    }

    public final boolean aN() {
        return !this.F.isEmpty();
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        this.A = arrayList;
        this.B = arrayList2;
    }

    public final ArrayList aO() {
        return this.A;
    }

    public final ArrayList aP() {
        return this.B;
    }

    public final ArrayList aQ() {
        return this.F;
    }

    public final void a(p pVar) {
        this.a = pVar;
    }

    public final void b(p pVar) {
        if (pVar == this.a) {
            this.a = null;
        }
    }

    public final void aR() {
        if (this.a != null) {
            this.a.c();
        }
    }

    public final void a(q qVar) {
        qVar.b.a((com.censivn.C3DEngine.d.b) this);
        this.F.add(qVar);
    }

    public final void b(q qVar) {
        if (this.F.contains(qVar)) {
            this.F.remove(qVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public void f() {
        if (this.F.isEmpty()) {
            super.f();
            return;
        }
        if (A()) {
            c();
            MatrixStack.glPushMatrix();
            e();
            aE();
            if (aC()) {
                int size = this.z.size();
                for (int i = 0; i < size; i++) {
                    com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) this.z.get(i);
                    if (!i(rVar)) {
                        a(rVar);
                        rVar.f();
                        b(rVar);
                    }
                }
                int size2 = this.F.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    q qVar = (q) this.F.get(i2);
                    a((com.censivn.C3DEngine.b.r) qVar.b);
                    qVar.b.f();
                    b((com.censivn.C3DEngine.b.r) qVar.b);
                    if (this.z.contains(qVar.a)) {
                        a((com.censivn.C3DEngine.b.r) qVar.a);
                        qVar.a.f();
                        b((com.censivn.C3DEngine.b.r) qVar.a);
                    }
                }
            }
            MatrixStack.glPopMatrix();
            m_();
        }
    }

    protected final boolean i(com.censivn.C3DEngine.b.r rVar) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            if (((q) this.F.get(i)).a == rVar) {
                return true;
            }
        }
        return false;
    }

    public void a(z zVar) {
    }
}
