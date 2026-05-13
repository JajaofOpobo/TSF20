package com.tsf.extend.wallpaper;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class u extends com.tsf.extend.base.b.a<m> {
    private static final long a = TimeUnit.HOURS.toMillis(4);
    private transient int d;
    private long b = -1;
    private long c = -1;
    private boolean e = false;

    @Override // com.tsf.extend.base.b.a
    public int i() {
        return this.d;
    }

    @Override // com.tsf.extend.base.b.a
    public void c(int i) {
        this.d = i;
    }

    public void b(long j) {
        this.b = j;
    }

    public void c(long j) {
        this.e = true;
        this.c = j;
    }

    @Override // com.tsf.extend.base.b.a
    public boolean d() {
        return System.currentTimeMillis() - c() > a;
    }

    @Override // com.tsf.extend.base.b.a
    public boolean h() {
        return a() != null && a().size() < i();
    }
}
