package com.tsf.extend.wallpaper;

import java.util.concurrent.TimeUnit;
/* renamed from: com.tsf.extend.wallpaper.j */
/* loaded from: classes.dex */
public class C2084j extends C2113u {

    /* renamed from: a */
    private static final long f6825a = TimeUnit.HOURS.toMillis(3);

    @Override // com.tsf.extend.wallpaper.C2113u, com.tsf.extend.base.p071b.C1368a
    /* renamed from: d */
    public boolean mo6376d() {
        return System.currentTimeMillis() - m8865c() > f6825a;
    }
}
