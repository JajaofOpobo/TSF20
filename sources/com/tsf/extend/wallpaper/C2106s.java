package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.lang.ref.SoftReference;
/* renamed from: com.tsf.extend.wallpaper.s */
/* loaded from: classes.dex */
public class C2106s implements Serializable {

    /* renamed from: a */
    private transient SoftReference<Bitmap> f6885a;

    /* renamed from: b */
    private transient SoftReference<Bitmap> f6886b;

    /* renamed from: r */
    public Bitmap m6403r() {
        if (this.f6885a == null) {
            return null;
        }
        return this.f6885a.get();
    }

    /* renamed from: a */
    public void m6405a(Bitmap bitmap) {
        this.f6885a = new SoftReference<>(bitmap);
    }

    /* renamed from: s */
    public Bitmap m6402s() {
        if (this.f6886b == null) {
            return null;
        }
        return this.f6886b.get();
    }

    /* renamed from: b */
    public void m6404b(Bitmap bitmap) {
        this.f6886b = new SoftReference<>(bitmap);
    }
}
