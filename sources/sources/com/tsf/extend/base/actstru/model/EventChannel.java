package com.tsf.extend.base.actstru.model;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EventChannel {
    private String a;
    private volatile boolean b = false;
    private ConcurrentLinkedQueue<EventHandler> c = new ConcurrentLinkedQueue<>();

    public EventChannel(String str) {
        this.a = "";
        this.a = str;
    }

    public void a(EventData dVar) {
        if (!a() && !this.c.isEmpty()) {
            Iterator<EventHandler> it = this.c.iterator();
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

    public void a(EventHandler eVar) {
        if (!this.c.contains(eVar)) {
            this.c.add(eVar);
        }
    }

    public void b(EventHandler eVar) {
        if (this.c.remove(eVar)) {
        }
    }
}
