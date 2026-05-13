package com.tsf.extend.base.p071b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.base.b.a */
/* loaded from: classes.dex */
public class C1368a<T extends Serializable> implements Serializable {

    /* renamed from: a */
    private InterfaceC1373b f4294a;

    /* renamed from: c */
    private long f4296c;

    /* renamed from: e */
    private String f4298e;

    /* renamed from: g */
    private int f4300g;

    /* renamed from: b */
    private boolean f4295b = false;

    /* renamed from: d */
    private int f4297d = -1;

    /* renamed from: f */
    private int f4299f = 1;

    /* renamed from: h */
    private String f4301h = null;

    /* renamed from: i */
    private String f4302i = null;

    /* renamed from: j */
    private String f4303j = null;

    /* renamed from: k */
    private int f4304k = 0;

    /* renamed from: l */
    private int f4305l = -1;

    /* renamed from: m */
    private List<T> f4306m = new ArrayList();

    /* renamed from: a */
    public List<T> m8875a() {
        return this.f4306m;
    }

    /* renamed from: a */
    public void m8870a(List<T> list) {
        this.f4306m = list;
    }

    /* renamed from: b */
    public boolean m8868b() {
        return this.f4295b;
    }

    /* renamed from: a */
    public void m8869a(boolean z) {
        this.f4295b = z;
    }

    /* renamed from: c */
    public long m8865c() {
        return this.f4296c;
    }

    /* renamed from: a */
    public void m8873a(long j) {
        this.f4296c = j;
    }

    /* renamed from: d */
    public boolean mo6376d() {
        if (this.f4294a != null) {
            return this.f4294a.mo6189a(this);
        }
        return System.currentTimeMillis() - this.f4296c > 1800000;
    }

    /* renamed from: e */
    public String m8861e() {
        return this.f4298e;
    }

    /* renamed from: a */
    public void m8871a(String str) {
        this.f4298e = str;
    }

    /* renamed from: f */
    public int m8859f() {
        return this.f4299f;
    }

    /* renamed from: a */
    public void m8874a(int i) {
        this.f4299f = i;
    }

    /* renamed from: g */
    public int m8858g() {
        return this.f4300g;
    }

    /* renamed from: b */
    public void m8867b(int i) {
        this.f4300g = i;
    }

    /* renamed from: a */
    public void m8872a(InterfaceC1373b interfaceC1373b) {
        this.f4294a = interfaceC1373b;
    }

    /* renamed from: h */
    public boolean mo6375h() {
        return m8875a() != null && m8875a().size() < m8858g();
    }

    /* renamed from: b */
    public void m8866b(String str) {
        this.f4301h = str;
    }

    /* renamed from: c */
    public void m8864c(String str) {
        this.f4302i = str;
    }

    /* renamed from: d */
    public void m8862d(String str) {
        this.f4303j = str;
    }

    /* renamed from: i */
    public int mo6374i() {
        return this.f4304k;
    }

    /* renamed from: c */
    public void mo6378c(int i) {
        this.f4304k = i;
    }

    /* renamed from: j */
    public int m8857j() {
        return this.f4305l;
    }

    /* renamed from: d */
    public void m8863d(int i) {
        this.f4305l = i;
    }

    /* renamed from: k */
    public int m8856k() {
        return this.f4297d;
    }

    /* renamed from: e */
    public void m8860e(int i) {
        this.f4297d = i;
    }
}
