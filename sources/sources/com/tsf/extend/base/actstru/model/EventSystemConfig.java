package com.tsf.extend.base.actstru.model;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EventSystemConfig {
    public static boolean a = false;
    public static int b = 1;
    public static int c = 1;
    public static int d = 2;
    public static int e = 4096;
    private static EventSystemConfig g = new EventSystemConfig();
    ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();
    private String h = "0.1";
    private EventDispatcher i = EventDispatcher.a();
    private TaskDispatcher j = TaskDispatcher.a();

    private EventSystemConfig() {
    }

    public static EventSystemConfig a() {
        return g;
    }

    public void a(String str, EventHandler eVar) {
        this.i.a(str, eVar);
    }

    public void b(String str, EventHandler eVar) {
        this.i.b(str, eVar);
    }
}
