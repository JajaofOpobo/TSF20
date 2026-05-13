package com.tsf.shell.f.e.f;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.i.c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b extends j {
    private a a;
    private ArrayList<Integer> b;
    private ArrayList<Integer> c;
    private boolean d = false;

    /* loaded from: classes.dex */
    public interface a {
    }

    public float q() {
        return 0.0f;
    }

    public void a(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    public ArrayList<Integer> r() {
        return this.b;
    }

    public ArrayList<Integer> s() {
        return this.c;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void b(a aVar) {
        if (aVar == this.a) {
            this.a = null;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        super.dispatchDraw();
    }

    public void a(c cVar) {
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

    public i d() {
        return null;
    }
}
