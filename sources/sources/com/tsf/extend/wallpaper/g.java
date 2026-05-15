package com.tsf.extend.wallpaper;

import android.database.Cursor;
import com.google.android.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends m implements Comparable<g> {
    private String a;
    private boolean b;
    private boolean c;
    private int d;
    private long e;

    @Override // com.tsf.extend.wallpaper.m
    public long a() {
        return this.e;
    }

    @Override // com.tsf.extend.wallpaper.m
    public void a(long j) {
        this.e = j;
    }

    public g(boolean z) {
        this.b = false;
        this.c = false;
        this.d = -1;
        this.b = z;
    }

    public g() {
        this.b = false;
        this.c = false;
        this.d = -1;
    }

    public String b() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean d() {
        return this.d != -1;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        if (gVar == null) {
            return 0;
        }
        return this.e > gVar.e ? -1 : 1;
    }

    public static List<g> a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        while (cursor.moveToNext()) {
            g gVar = new g();
            a(cursor, gVar);
            gVar.a(cursor.getLong(cursor.getColumnIndex("local_time")));
            gVar.a(cursor.getString(cursor.getColumnIndex("local_filename")));
            arrayListNewArrayList.add(gVar);
        }
        return arrayListNewArrayList;
    }

    public int e() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }
}
