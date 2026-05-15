package com.tsf.extend.base.actstru.model;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static boolean a = false;
    public static int b = 1;
    public static int c = 1;
    public static int d = 2;
    public static int e = 4096;
    private static a g = new a();
    ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();
    private String h = "0.1";
    private f i = f.a();
    private k j = k.a();

    private a() {
    }

    public static a a() {
        return g;
    }

    public void a(String str, e eVar) {
        this.i.a(str, eVar);
    }

    public void b(String str, e eVar) {
        this.i.b(str, eVar);
    }
}
