package com.tsf.extend.base.actstru.model;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.extend.base.actstru.model.i */
/* loaded from: classes.dex */
public class C1361i {

    /* renamed from: a */
    private ArrayList<String> f4277a;

    public C1361i() {
        this("lg://default");
    }

    public C1361i(String str) {
        this.f4277a = new ArrayList<>();
        this.f4277a.add(str);
    }

    /* renamed from: a */
    public synchronized boolean m8893a() {
        return this.f4277a.contains("lg://*");
    }

    /* renamed from: b */
    public ArrayList<String> m8892b() {
        return this.f4277a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = m8892b().iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(" ");
        }
        return String.format("(:to %s)", sb.toString());
    }
}
