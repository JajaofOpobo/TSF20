package com.tsf.shell.e.e;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class e {
    private ArrayList a = new ArrayList();

    public Object c() {
        return this.a.isEmpty() ? b() : this.a.remove(0);
    }

    public void a(Object obj) {
        if (!this.a.contains(obj)) {
            this.a.add(obj);
        }
    }

    public Object b() {
        return null;
    }
}
