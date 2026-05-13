package com.tsf.extend.wallpaper;

import com.tsf.extend.base.p071b.C1368a;
import java.util.concurrent.TimeUnit;
/* renamed from: com.tsf.extend.wallpaper.u */
/* loaded from: classes.dex */
public class C2113u extends C1368a<C2094m> {

    /* renamed from: a */
    private static final long f6915a = TimeUnit.HOURS.toMillis(4);

    /* renamed from: d */
    private transient int f6918d;

    /* renamed from: b */
    private long f6916b = -1;

    /* renamed from: c */
    private long f6917c = -1;

    /* renamed from: e */
    private boolean f6919e = false;

    @Override // com.tsf.extend.base.p071b.C1368a
    /* renamed from: i */
    public int mo6374i() {
        return this.f6918d;
    }

    @Override // com.tsf.extend.base.p071b.C1368a
    /* renamed from: c */
    public void mo6378c(int i) {
        this.f6918d = i;
    }

    /* renamed from: b */
    public void m6379b(long j) {
        this.f6916b = j;
    }

    /* renamed from: c */
    public void m6377c(long j) {
        this.f6919e = true;
        this.f6917c = j;
    }

    @Override // com.tsf.extend.base.p071b.C1368a
    /* renamed from: d */
    public boolean mo6376d() {
        return System.currentTimeMillis() - m8865c() > f6915a;
    }

    @Override // com.tsf.extend.base.p071b.C1368a
    /* renamed from: h */
    public boolean mo6375h() {
        return m8875a() != null && m8875a().size() < mo6374i();
    }
}
