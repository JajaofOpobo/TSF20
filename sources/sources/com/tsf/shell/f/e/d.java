package com.tsf.shell.f.e;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d<E> {
    private ArrayList<E> a = new ArrayList<>();

    public E c() {
        return this.a.isEmpty() ? b() : this.a.remove(0);
    }

    public void a(E e) {
        if (!this.a.contains(e)) {
            this.a.add(e);
        }
    }

    public E b() {
        return null;
    }
}
