package com.tsf.shell.workspace3D.h.c;

import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.h.c.a.h;
import com.tsf.shell.workspace3D.h.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    private l a;
    private h b;

    public a(l lVar) {
        this.a = lVar;
        com.tsf.shell.workspace3D.h.c.a.a aVar = new com.tsf.shell.workspace3D.h.c.a.a();
        aVar.a(this.a);
        aVar.a(this);
        aVar.a(this.a.q());
        this.b = aVar;
    }

    public final void a(com.tsf.shell.workspace3D.h.a aVar) {
        this.b.a(aVar);
    }

    public final void a(u uVar, com.tsf.shell.workspace3D.h.a aVar) {
        this.b.a(uVar, aVar);
    }

    public final void a(com.tsf.shell.workspace3D.h.a aVar, com.censivn.C3DEngine.g.b.a aVar2) {
        this.b.a(aVar, aVar2);
    }

    public final void b(com.tsf.shell.workspace3D.h.a aVar, com.censivn.C3DEngine.g.b.a aVar2) {
        this.b.b(aVar, aVar2);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public final void a(int i, ArrayList arrayList, com.tsf.shell.workspace3D.h.a aVar, boolean z) {
        a();
        this.b.a(i, arrayList, aVar, z);
    }

    public final void a(ArrayList arrayList, com.tsf.shell.workspace3D.h.a aVar, boolean z) {
        this.b.a(arrayList, aVar, z);
    }

    public final void d() {
        this.b.a();
    }

    public final void e() {
        this.b.b();
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(float f, boolean z) {
        this.b.a(f, z);
    }

    public final int a(int i, float f, boolean z) {
        return this.b.a(i, f, z);
    }
}
