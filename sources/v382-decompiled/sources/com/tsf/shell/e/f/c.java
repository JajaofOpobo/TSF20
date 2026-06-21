package com.tsf.shell.e.f;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {
    private ArrayList b;
    private ArrayList c;
    private ArrayList d;
    private f e;
    private boolean a = false;
    private boolean f = false;

    public abstract void a(Object obj);

    public abstract void a(boolean z, String str);

    public abstract boolean b();

    public abstract String c();

    public c(ArrayList arrayList) {
        a(arrayList);
    }

    public c() {
    }

    public void a(ArrayList arrayList) {
        this.b = arrayList;
        a();
    }

    public void f() {
        if (this.f) {
            this.e.b(true);
            d();
        }
    }

    private void a() {
        this.f = b();
        this.c = new ArrayList();
        this.d = new ArrayList();
        Iterator it = com.tsf.shell.utils.h.a(c(), ",", false).iterator();
        while (it.hasNext()) {
            f fVar = (f) c(((Integer) it.next()).intValue());
            if (fVar != null) {
                fVar.a(true);
                this.c.add(fVar);
            }
        }
        if (this.c.size() == 0) {
            f fVar2 = (f) this.b.get(0);
            fVar2.a(true);
            this.c.add(fVar2);
        }
        this.e = (f) this.c.get(0);
        this.a = true;
    }

    public void a(boolean z) {
        this.f = z;
        if (z) {
            this.c.clear();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                fVar.a(true);
                this.c.add(fVar);
            }
            return;
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).a(false);
        }
        a((f) this.b.get(0));
    }

    public boolean g() {
        return this.f;
    }

    public Object a(int i) {
        return this.b.get(i);
    }

    private Object c(int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.k() == i) {
                return fVar;
            }
        }
        return null;
    }

    public boolean b(int i) {
        if (i < 0 || i > i() - 1) {
            i = 0;
        }
        return a((f) this.b.get(i));
    }

    public boolean a(f fVar) {
        if (!this.f) {
            if (this.e != null) {
                this.e.a(false);
            }
            this.e = fVar;
            this.e.a(true);
            a((Object) this.e);
            return true;
        }
        if (!this.c.contains(fVar)) {
            fVar.a(true);
            this.c.add(fVar);
            this.e = fVar;
            a((Object) this.e);
            return true;
        }
        if (this.c.size() > 1) {
            fVar.a(false);
            this.c.remove(fVar);
            if (this.e == fVar) {
                if (this.c.size() > 0) {
                    this.e = (f) this.c.get(0);
                } else {
                    this.e = (f) this.b.get(0);
                }
                a((Object) this.e);
            }
        }
        return false;
    }

    public Object h() {
        return this.e;
    }

    private void d() {
        this.d.clear();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!fVar.j()) {
                this.d.add(fVar);
            }
        }
        if (this.d.size() == 0) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next();
                fVar2.b(false);
                this.d.add(fVar2);
            }
        }
        int random = (int) (Math.random() * this.d.size());
        if (random == this.d.size()) {
            random--;
        }
        this.e = (f) this.d.get(random);
        a((Object) this.e);
    }

    public int i() {
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    public void j() {
        String str;
        String str2;
        String str3 = "";
        if (this.f) {
            int size = this.c.size();
            int i = 0;
            while (i < size) {
                f fVar = (f) this.c.get(i);
                if (i == size - 1) {
                    str2 = String.valueOf(str3) + fVar.k();
                } else {
                    str2 = String.valueOf(str3) + fVar.k() + ",";
                }
                i++;
                str3 = str2;
            }
            str = str3;
        } else {
            str = String.valueOf("") + this.e.k();
        }
        a(this.f, str);
    }
}
