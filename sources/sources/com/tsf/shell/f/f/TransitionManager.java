package com.tsf.shell.f.f;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class TransitionManager<E> {
    private ArrayList<LauncherAppInfo> b;
    private ArrayList<LauncherAppInfo> c;
    private ArrayList<LauncherAppInfo> d;
    private f e;
    private boolean a = false;
    private boolean f = false;

    public abstract void a(E e);

    public abstract void a(boolean z, String str);

    public abstract boolean b();

    public abstract String c();

    public TransitionManager(ArrayList<LauncherAppInfo> arrayList) {
        a(arrayList);
    }

    public TransitionManager() {
    }

    public void a(ArrayList<LauncherAppInfo> arrayList) {
        this.b = arrayList;
        TransitionManager();
    }

    public void f() {
        if (this.f) {
            this.e.b(true);
            TransitionManager();
        }
    }

    private void a() {
        this.f = b();
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        Iterator<Integer> it = com.tsf.shell.utils.ItemInfoListSorter.a(c(), ",", false).iterator();
        while (it.hasNext()) {
            f fVar = (TransitionRenderer) c(it.next().intValue());
            if (fVar != null) {
                fVar.a(true);
                this.c.add(fVar);
            }
        }
        if (this.c.size() == 0) {
            f fVar2 = this.b.get(0);
            fVar2.a(true);
            this.c.add(fVar2);
        }
        this.e = this.c.get(0);
        this.a = true;
    }

    public void a(boolean z) {
        this.f = z;
        if (z) {
            this.c.clear();
            for (f fVar : this.b) {
                fVar.a(true);
                this.c.add(fVar);
            }
            return;
        }
        Iterator<LauncherAppInfo> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(false);
        }
        a(this.b.get(0));
    }

    public boolean g() {
        return this.f;
    }

    public E a(int i) {
        return (E) this.b.get(ItemPageTransition);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [E, com.tsf.shell.f.f.TransitionRenderer] */
    private E c(int i) {
        Iterator<LauncherAppInfo> it = this.b.iterator();
        while (it.hasNext()) {
            E r0 = (E) ((TransitionRenderer) it.next());
            if (r0.k() == i) {
                return r0;
            }
        }
        return null;
    }

    public boolean b(int i) {
        if (i < 0 || i > i() - 1) {
            i = 0;
        }
        return a(this.b.get(ItemPageTransition));
    }

    public boolean a(f fVar) {
        if (!this.f) {
            if (this.e != null) {
                this.e.a(false);
            }
            this.e = fVar;
            this.e.a(true);
            a(this.e);
            return true;
        }
        if (!this.c.contains(fVar)) {
            fVar.a(true);
            this.c.add(fVar);
            this.e = fVar;
            a(this.e);
            return true;
        }
        if (this.c.size() > 1) {
            fVar.a(false);
            this.c.remove(fVar);
            if (this.e == fVar) {
                if (this.c.size() > 0) {
                    this.e = this.c.get(0);
                } else {
                    this.e = this.b.get(0);
                }
                a(this.e);
            }
        }
        return false;
    }

    public E h() {
        return (E) this.e;
    }

    private void d() {
        this.d.clear();
        for (f fVar : this.c) {
            if (!fVar.j()) {
                this.d.add(fVar);
            }
        }
        if (this.d.size() == 0) {
            for (f fVar2 : this.c) {
                fVar2.b(false);
                this.d.add(fVar2);
            }
        }
        int iRandom = (int) (Math.random() * ((double) this.d.size()));
        if (iRandom == this.d.size()) {
            iRandom--;
        }
        this.e = this.d.get(iRandom);
        a(this.e);
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
        if (!this.f) {
            str = "" + this.e.k();
        } else {
            int size = this.c.size();
            int i = 0;
            while (i < size) {
                f fVar = this.c.get(ItemPageTransition);
                if (i == size - 1) {
                    str2 = str3 + fVar.k();
                } else {
                    str2 = str3 + fVar.k() + ",";
                }
                i++;
                str3 = str2;
            }
            str = str3;
        }
        a(this.f, str);
    }
}
