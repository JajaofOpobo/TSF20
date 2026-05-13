package com.tsf.extend.base.actstru.model;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public class h {
    private String a;
    private volatile boolean b = false;
    private ConcurrentLinkedQueue<e> c = new ConcurrentLinkedQueue<>();

    public h(String str) {
        this.a = "";
        this.a = str;
    }

    public void a(d dVar) {
        if (!a() && !this.c.isEmpty()) {
            Iterator<e> it = this.c.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(dVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean a() {
        return this.b;
    }

    public void a(e eVar) {
        if (!this.c.contains(eVar)) {
            this.c.add(eVar);
        }
    }

    public void b(e eVar) {
        if (this.c.remove(eVar)) {
        }
    }
}
