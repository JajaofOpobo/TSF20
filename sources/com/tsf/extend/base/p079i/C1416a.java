package com.tsf.extend.base.p079i;

import android.content.Context;
/* renamed from: com.tsf.extend.base.i.a */
/* loaded from: classes.dex */
public class C1416a {

    /* renamed from: a */
    private static volatile C1416a f4395a;

    /* renamed from: b */
    private Context f4396b;

    /* renamed from: c */
    private String f4397c = "";

    /* renamed from: d */
    private String f4398d = "";

    /* renamed from: e */
    private String f4399e = "";

    /* renamed from: f */
    private InterfaceC1417a f4400f;

    /* renamed from: com.tsf.extend.base.i.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1417a {
    }

    /* renamed from: a */
    public static C1416a m8719a() {
        if (f4395a == null) {
            synchronized (C1416a.class) {
                if (f4395a == null) {
                    f4395a = new C1416a();
                }
            }
        }
        return f4395a;
    }

    /* renamed from: a */
    public void m8718a(Context context) {
        this.f4396b = context;
    }

    /* renamed from: a */
    public void m8716a(String str) {
        if (this.f4397c != null) {
            this.f4397c = str;
        }
    }

    /* renamed from: b */
    public String m8715b() {
        return this.f4397c;
    }

    /* renamed from: c */
    public String m8714c() {
        return this.f4398d;
    }

    /* renamed from: d */
    public String m8713d() {
        return this.f4399e;
    }

    /* renamed from: a */
    public void m8717a(InterfaceC1417a interfaceC1417a) {
        this.f4400f = interfaceC1417a;
    }

    private C1416a() {
    }
}
