package com.tsf.extend.wallpaper;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends u {
    private static final long a = TimeUnit.HOURS.toMillis(3);

    @Override // com.tsf.extend.wallpaper.u, com.tsf.extend.base.b.a
    public boolean d() {
        return System.currentTimeMillis() - c() > a;
    }
}
