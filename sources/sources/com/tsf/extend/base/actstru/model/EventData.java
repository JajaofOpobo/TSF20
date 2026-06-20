package com.tsf.extend.base.actstru.model;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EventData {
    private String a = "";
    private String b = "";
    private EventTarget c = null;

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(EventTarget iVar) {
        this.c = iVar;
    }

    public EventTarget b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        return String.format("(%s :desc '%s' :from '%s' %s)", getClass().getSimpleName() + "@" + hashCode(), a(), c(), b());
    }
}
