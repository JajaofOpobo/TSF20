package com.tsf.extend.wallpaper;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class j extends u {
    private static final long a = TimeUnit.HOURS.toMillis(3);

    @Override // com.tsf.extend.wallpaper.u, com.tsf.extend.base.b.a
    public boolean d() {
        return System.currentTimeMillis() - c() > a;
    }
}
