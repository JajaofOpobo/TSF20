package com.tsf.shell.utils;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
/* renamed from: com.tsf.shell.utils.c */
/* loaded from: classes.dex */
public class C4166c {

    /* renamed from: a */
    private SoftReference<Bitmap> f13480a;

    /* renamed from: a */
    public Bitmap m697a() {
        if (this.f13480a == null || this.f13480a.get() == null || this.f13480a.get().isRecycled()) {
            return null;
        }
        return this.f13480a.get();
    }

    /* renamed from: a */
    public void m696a(Bitmap bitmap) {
        m695b();
        this.f13480a = new SoftReference<>(bitmap);
    }

    /* renamed from: b */
    public void m695b() {
        if (this.f13480a != null && this.f13480a.get() != null && !this.f13480a.get().isRecycled()) {
            this.f13480a.get().recycle();
            this.f13480a = null;
        }
    }
}
