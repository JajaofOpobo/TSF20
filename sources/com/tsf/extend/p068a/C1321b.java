package com.tsf.extend.p068a;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
/* renamed from: com.tsf.extend.a.b */
/* loaded from: classes.dex */
public class C1321b {

    /* renamed from: a */
    private Picture f4153a;

    /* renamed from: b */
    private RectF f4154b;

    /* renamed from: c */
    private RectF f4155c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1321b(Picture picture, RectF rectF) {
        this.f4153a = picture;
        this.f4154b = rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9014a(RectF rectF) {
        this.f4155c = rectF;
    }

    /* renamed from: a */
    public PictureDrawable m9015a() {
        return new PictureDrawable(this.f4153a);
    }
}
