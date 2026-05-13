package com.tsf.extend.wallpaper;

import android.database.Cursor;
import com.google.android.collect.Lists;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.wallpaper.g */
/* loaded from: classes.dex */
public class C2070g extends C2094m implements Comparable<C2070g> {

    /* renamed from: a */
    private String f6759a;

    /* renamed from: b */
    private boolean f6760b;

    /* renamed from: c */
    private boolean f6761c;

    /* renamed from: d */
    private int f6762d;

    /* renamed from: e */
    private long f6763e;

    @Override // com.tsf.extend.wallpaper.C2094m
    /* renamed from: a */
    public long mo6451a() {
        return this.f6763e;
    }

    @Override // com.tsf.extend.wallpaper.C2094m
    /* renamed from: a */
    public void mo6450a(long j) {
        this.f6763e = j;
    }

    public C2070g(boolean z) {
        this.f6760b = false;
        this.f6761c = false;
        this.f6762d = -1;
        this.f6760b = z;
    }

    public C2070g() {
        this.f6760b = false;
        this.f6761c = false;
        this.f6762d = -1;
    }

    /* renamed from: b */
    public String m6522b() {
        return this.f6759a;
    }

    /* renamed from: a */
    public void m6524a(String str) {
        this.f6759a = str;
    }

    /* renamed from: c */
    public boolean m6521c() {
        return this.f6761c;
    }

    /* renamed from: a */
    public void m6523a(boolean z) {
        this.f6761c = z;
    }

    /* renamed from: d */
    public boolean m6520d() {
        return this.f6762d != -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C2070g c2070g) {
        if (c2070g == null) {
            return 0;
        }
        return this.f6763e > c2070g.f6763e ? -1 : 1;
    }

    /* renamed from: a */
    public static List<C2070g> m6526a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList newArrayList = Lists.newArrayList();
        while (cursor.moveToNext()) {
            C2070g c2070g = new C2070g();
            m6449a(cursor, c2070g);
            c2070g.mo6450a(cursor.getLong(cursor.getColumnIndex("local_time")));
            c2070g.m6524a(cursor.getString(cursor.getColumnIndex("local_filename")));
            newArrayList.add(c2070g);
        }
        return newArrayList;
    }

    /* renamed from: e */
    public int m6519e() {
        return this.f6762d;
    }

    /* renamed from: a */
    public void m6527a(int i) {
        this.f6762d = i;
    }
}
