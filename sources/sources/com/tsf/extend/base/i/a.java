package com.tsf.extend.base.i;

import android.content.Context;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static volatile a a;
    private Context b;
    private String c = "";
    private String d = "";
    private String e = "";
    private InterfaceC0050a f;

    /* JADX INFO: renamed from: com.tsf.extend.base.i.a$a, reason: collision with other inner class name */
    public interface InterfaceC0050a {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public void a(Context context) {
        this.b = context;
    }

    public void a(String str) {
        if (this.c != null) {
            this.c = str;
        }
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public void a(InterfaceC0050a interfaceC0050a) {
        this.f = interfaceC0050a;
    }

    private a() {
    }
}
