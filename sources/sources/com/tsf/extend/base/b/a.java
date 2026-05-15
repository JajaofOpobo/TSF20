package com.tsf.extend.base.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a<T extends Serializable> implements Serializable {
    private b a;
    private long c;
    private String e;
    private int g;
    private boolean b = false;
    private int d = -1;
    private int f = 1;
    private String h = null;
    private String i = null;
    private String j = null;
    private int k = 0;
    private int l = -1;
    private List<T> m = new ArrayList();

    public List<T> a() {
        return this.m;
    }

    public void a(List<T> list) {
        this.m = list;
    }

    public boolean b() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public long c() {
        return this.c;
    }

    public void a(long j) {
        this.c = j;
    }

    public boolean d() {
        if (this.a != null) {
            return this.a.a(this);
        }
        return System.currentTimeMillis() - this.c > 1800000;
    }

    public String e() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public int f() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public int g() {
        return this.g;
    }

    public void b(int i) {
        this.g = i;
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public boolean h() {
        return a() != null && a().size() < g();
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.i = str;
    }

    public void d(String str) {
        this.j = str;
    }

    public int i() {
        return this.k;
    }

    public void c(int i) {
        this.k = i;
    }

    public int j() {
        return this.l;
    }

    public void d(int i) {
        this.l = i;
    }

    public int k() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }
}
