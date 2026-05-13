package com.tsf.extend.base.actstru.model;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* renamed from: com.tsf.extend.base.actstru.model.h */
/* loaded from: classes.dex */
public class C1360h {

    /* renamed from: a */
    private String f4274a;

    /* renamed from: b */
    private volatile boolean f4275b = false;

    /* renamed from: c */
    private ConcurrentLinkedQueue<InterfaceC1356e> f4276c = new ConcurrentLinkedQueue<>();

    public C1360h(String str) {
        this.f4274a = "";
        this.f4274a = str;
    }

    /* renamed from: a */
    public void m8896a(C1355d c1355d) {
        if (!m8897a() && !this.f4276c.isEmpty()) {
            Iterator<InterfaceC1356e> it = this.f4276c.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo8908a(c1355d);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m8897a() {
        return this.f4275b;
    }

    /* renamed from: a */
    public void m8895a(InterfaceC1356e interfaceC1356e) {
        if (!this.f4276c.contains(interfaceC1356e)) {
            this.f4276c.add(interfaceC1356e);
        }
    }

    /* renamed from: b */
    public void m8894b(InterfaceC1356e interfaceC1356e) {
        if (this.f4276c.remove(interfaceC1356e)) {
        }
    }
}
