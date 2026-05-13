package com.cm.kinfoc;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class g implements Cloneable {
    private long e;
    private i g;
    private byte[] a = null;
    private String b = null;
    private String c = null;
    private boolean d = false;
    private int f = -1;
    private ArrayList<String> h = null;

    public Object clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] a() {
        return this.a;
    }

    public void a(byte[] bArr) {
        this.a = bArr;
    }

    public String b() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public boolean c() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public long d() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public String e() {
        return this.b;
    }

    public int f() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(i iVar) {
        this.g = iVar;
    }

    public i g() {
        return this.g;
    }

    public void a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.h = new ArrayList<>();
            this.h.addAll(arrayList);
        }
    }

    public ArrayList<String> h() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" KHttpData : ").append("\n");
        sb.append("  * tname  : ").append(b()).append("\n");
        sb.append("  * ctime  : ").append(d()).append("\n");
        sb.append("  * sproi  : ").append(f()).append("\n");
        sb.append("  * force  : ").append(c()).append("\n");
        sb.append("  * dsize  : ").append(i()).append("\n");
        sb.append("  * -----  : ").append(e()).append("\n");
        return super.toString();
    }

    private int i() {
        if (this.a == null) {
            return 0;
        }
        return this.a.length;
    }
}
