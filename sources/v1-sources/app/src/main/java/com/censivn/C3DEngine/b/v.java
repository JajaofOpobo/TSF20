package com.censivn.C3DEngine.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class v extends r implements com.censivn.C3DEngine.d.b {
    private static Number3d A = new Number3d();
    private boolean a;
    protected ArrayList z;

    public /* synthetic */ Object clone() {
        v vVar = new v(this.t.clone(), this.v.clone(), this.u);
        vVar.L().x = L().x;
        vVar.L().y = L().y;
        vVar.L().z = L().z;
        vVar.M().x = M().x;
        vVar.M().y = M().y;
        vVar.M().z = M().z;
        vVar.N().x = N().x;
        vVar.N().y = N().y;
        vVar.N().z = N().z;
        for (int i = 0; i < this.z.size(); i++) {
            vVar.d(d(i));
        }
        return vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v() {
        super(0, 0, false, false);
        Boolean.valueOf(false);
        this.z = new ArrayList();
        this.a = true;
        c((Boolean) false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i, int i2) {
        super(i, i2, true, true);
        Boolean.valueOf(true);
        this.z = new ArrayList();
        this.a = true;
    }

    public v(Boolean bool, Boolean bool2) {
        super(24, 12, bool, bool2);
        this.z = new ArrayList();
        this.a = true;
    }

    private v(af afVar, a aVar, ac acVar) {
        super(afVar, aVar, acVar);
        this.z = new ArrayList();
        this.a = true;
    }

    @Override // com.censivn.C3DEngine.d.b
    public void d(r rVar) {
        this.z.add(rVar);
        rVar.a((com.censivn.C3DEngine.d.b) this);
        rVar.a(R());
        com.censivn.C3DEngine.a.d().g();
    }

    public void a(r rVar, int i) {
        this.z.add(i, rVar);
        rVar.a((com.censivn.C3DEngine.d.b) this);
        rVar.a(R());
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.d.b
    public boolean e(r rVar) {
        boolean remove = this.z.remove(rVar);
        if (remove) {
            rVar.a((com.censivn.C3DEngine.d.b) null);
            rVar.a((ab) null);
        }
        com.censivn.C3DEngine.a.d().g();
        return remove;
    }

    public r c(int i) {
        r rVar = (r) this.z.remove(i);
        if (rVar != null) {
            rVar.a((com.censivn.C3DEngine.d.b) null);
            rVar.a((ab) null);
        }
        com.censivn.C3DEngine.a.d().g();
        return rVar;
    }

    @Override // com.censivn.C3DEngine.d.b
    public final r d(int i) {
        return (r) this.z.get(i);
    }

    public final r b(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.z.size()) {
                if (!((r) this.z.get(i2)).O().equals(str)) {
                    i = i2 + 1;
                } else {
                    return (r) this.z.get(i2);
                }
            } else {
                return null;
            }
        }
    }

    public final int f(r rVar) {
        return this.z.indexOf(rVar);
    }

    @Override // com.censivn.C3DEngine.d.b
    public final int aB() {
        return this.z.size();
    }

    public final void g(boolean z) {
        this.a = z;
    }

    public final boolean aC() {
        return this.a;
    }

    public final ArrayList aD() {
        return this.z;
    }

    @Override // com.censivn.C3DEngine.b.r
    public void H() {
        for (int i = 0; i < this.z.size(); i++) {
            d(i).H();
        }
        super.H();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void T() {
        if (A()) {
            MatrixStack.glPushMatrix();
            e();
            if (this.a) {
                int size = this.z.size();
                for (int i = 0; i < size; i++) {
                    ((r) this.z.get(i)).f();
                }
            }
            MatrixStack.glPopMatrix();
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void S() {
        if (A()) {
            c();
            MatrixStack.glPushMatrix();
            e();
            aE();
            if (this.a) {
                int size = this.z.size();
                for (int i = 0; i < size; i++) {
                    r rVar = (r) this.z.get(i);
                    a(rVar);
                    rVar.f();
                    b(rVar);
                }
            }
            MatrixStack.glPopMatrix();
            m_();
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public void f() {
        if (A()) {
            c();
            MatrixStack.glPushMatrix();
            e();
            aE();
            if (this.a) {
                int size = this.z.size();
                for (int i = 0; i < size; i++) {
                    r rVar = (r) this.z.get(i);
                    a(rVar);
                    rVar.f();
                    b(rVar);
                }
            }
            aF();
            MatrixStack.glPopMatrix();
            m_();
        }
    }

    public void aE() {
    }

    public void aF() {
    }

    public void a(r rVar) {
    }

    public void b(r rVar) {
    }
}
