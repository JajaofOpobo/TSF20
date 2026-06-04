package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class s {
    public String a;
    public String b;
    public String c;
    public al d;
    public TextureElement e;
    public int f;
    public boolean g;
    public int i;
    public com.tsf.shell.c.a.b k;
    public com.tsf.shell.workspace3D.k.c.c.j l;
    public boolean h = false;
    public int j = 4;
    private ArrayList m = new ArrayList();

    public final void a(j jVar) {
        this.m.add(jVar);
        String str = "add item:" + jVar + "  total:" + this.m.size();
    }

    public final void b(j jVar) {
        this.m.remove(jVar);
        String str = "remove item:" + jVar + "  total:" + this.m.size();
    }

    public final void a() {
        this.m.clear();
    }

    public final boolean b() {
        return this.m.size() <= 0 || !this.h;
    }

    public final ArrayList c() {
        return this.m;
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.m.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bf.l().a((j) it.next());
        }
        this.m.clear();
        arrayList.clear();
        if (this.d != null) {
            this.d.H();
            this.d = null;
        }
        if (this.e != null) {
            com.censivn.C3DEngine.a.f().a(this.e);
            this.e = null;
        }
        if (this.k != null) {
            this.k = null;
        }
        if (this.l != null) {
            bf.l().a(this.l.a);
            this.l = null;
        }
    }
}
