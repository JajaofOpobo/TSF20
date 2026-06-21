package com.tsf.shell.e.e.f;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends l {
    private f a;
    private ArrayList b;
    private ArrayList c;
    private boolean d = false;

    public float q() {
        return 0.0f;
    }

    public void a(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    public ArrayList r() {
        return this.b;
    }

    public ArrayList s() {
        return this.c;
    }

    public void a(f fVar) {
        this.a = fVar;
    }

    public void b(f fVar) {
        if (fVar == this.a) {
            this.a = null;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        super.dispatchDraw();
    }

    public void a(com.tsf.shell.e.i.e eVar) {
    }

    public void t() {
        this.d = true;
    }

    public void u() {
        this.d = false;
    }

    public boolean v() {
        return this.d;
    }

    public j d() {
        return null;
    }
}
