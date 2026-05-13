package com.p060cm.kinfoc;

import java.util.ArrayList;
/* renamed from: com.cm.kinfoc.g */
/* loaded from: classes.dex */
public class C1144g implements Cloneable {

    /* renamed from: e */
    private long f3617e;

    /* renamed from: g */
    private C1148i f3619g;

    /* renamed from: a */
    private byte[] f3613a = null;

    /* renamed from: b */
    private String f3614b = null;

    /* renamed from: c */
    private String f3615c = null;

    /* renamed from: d */
    private boolean f3616d = false;

    /* renamed from: f */
    private int f3618f = -1;

    /* renamed from: h */
    private ArrayList<String> f3620h = null;

    public Object clone() {
        try {
            return (C1144g) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public byte[] m9733a() {
        return this.f3613a;
    }

    /* renamed from: a */
    public void m9726a(byte[] bArr) {
        this.f3613a = bArr;
    }

    /* renamed from: b */
    public String m9725b() {
        return this.f3615c;
    }

    /* renamed from: a */
    public void m9729a(String str) {
        this.f3615c = str;
    }

    /* renamed from: c */
    public boolean m9724c() {
        return this.f3616d;
    }

    /* renamed from: a */
    public void m9727a(boolean z) {
        this.f3616d = z;
    }

    /* renamed from: d */
    public long m9723d() {
        return this.f3617e;
    }

    /* renamed from: a */
    public void m9731a(long j) {
        this.f3617e = j;
    }

    /* renamed from: e */
    public String m9722e() {
        return this.f3614b;
    }

    /* renamed from: f */
    public int m9721f() {
        return this.f3618f;
    }

    /* renamed from: a */
    public void m9732a(int i) {
        this.f3618f = i;
    }

    /* renamed from: a */
    public void m9730a(C1148i c1148i) {
        this.f3619g = c1148i;
    }

    /* renamed from: g */
    public C1148i m9720g() {
        return this.f3619g;
    }

    /* renamed from: a */
    public void m9728a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.f3620h = new ArrayList<>();
            this.f3620h.addAll(arrayList);
        }
    }

    /* renamed from: h */
    public ArrayList<String> m9719h() {
        return this.f3620h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" KHttpData : ").append("\n");
        sb.append("  * tname  : ").append(m9725b()).append("\n");
        sb.append("  * ctime  : ").append(m9723d()).append("\n");
        sb.append("  * sproi  : ").append(m9721f()).append("\n");
        sb.append("  * force  : ").append(m9724c()).append("\n");
        sb.append("  * dsize  : ").append(m9718i()).append("\n");
        sb.append("  * -----  : ").append(m9722e()).append("\n");
        return super.toString();
    }

    /* renamed from: i */
    private int m9718i() {
        if (this.f3613a == null) {
            return 0;
        }
        return this.f3613a.length;
    }
}
