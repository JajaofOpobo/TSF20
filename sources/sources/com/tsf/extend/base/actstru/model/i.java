package com.tsf.extend.base.actstru.model;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i {
    private ArrayList<String> a;

    public i() {
        this("lg://default");
    }

    public i(String str) {
        this.a = new ArrayList<>();
        this.a.add(str);
    }

    public synchronized boolean a() {
        return this.a.contains("lg://*");
    }

    public ArrayList<String> b() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = b().iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(" ");
        }
        return String.format("(:to %s)", sb.toString());
    }
}
