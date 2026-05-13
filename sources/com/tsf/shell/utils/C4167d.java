package com.tsf.shell.utils;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
/* renamed from: com.tsf.shell.utils.d */
/* loaded from: classes.dex */
public class C4167d {

    /* renamed from: a */
    private SoftReference<Bitmap> f13481a;

    /* renamed from: b */
    private int f13482b;

    /* renamed from: c */
    private int f13483c;

    public C4167d(int i, int i2) {
        this.f13482b = i;
        this.f13483c = i2;
    }

    /* renamed from: a */
    public Bitmap m694a() {
        if (this.f13481a == null || this.f13481a.get() == null || this.f13481a.get().isRecycled()) {
            this.f13481a = new SoftReference<>(m693b());
        }
        return this.f13481a.get();
    }

    /* renamed from: b */
    public Bitmap m693b() {
        return Bitmap.createBitmap(this.f13482b, this.f13483c, Bitmap.Config.ARGB_8888);
    }
}
