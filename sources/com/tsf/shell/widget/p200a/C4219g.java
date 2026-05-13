package com.tsf.shell.widget.p200a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
/* renamed from: com.tsf.shell.widget.a.g */
/* loaded from: classes.dex */
public class C4219g {

    /* renamed from: a */
    public TextureElement f13638a;

    /* renamed from: c */
    private int f13640c;

    /* renamed from: e */
    private VTextureManager f13642e;

    /* renamed from: b */
    private int f13639b = -1;

    /* renamed from: d */
    private String f13641d = "";

    public C4219g(VTextureManager vTextureManager, int i, String str) {
        this.f13640c = 0;
        this.f13640c = i;
        this.f13642e = vTextureManager;
        m497a(str);
    }

    /* renamed from: a */
    public void m497a(String str) {
        if (!str.equals(this.f13641d)) {
            Bitmap m499a = m499a(this.f13639b, this.f13640c, str);
            if (this.f13638a == null) {
                this.f13638a = this.f13642e.createTexture(m499a, true);
            } else {
                m498a(this.f13638a, m499a, 0, 0);
            }
            m499a.recycle();
            this.f13641d = str;
        }
    }

    /* renamed from: a */
    public void m500a() {
        this.f13642e.deleteTexture(this.f13638a);
    }

    /* renamed from: a */
    private void m498a(TextureElement textureElement, Bitmap bitmap, int i, int i2) {
        GLES20.glBindTexture(3553, textureElement.f2529id);
        GLUtils.texSubImage2D(3553, 0, i, i2, bitmap);
    }

    /* renamed from: a */
    private Bitmap m499a(int i, int i2, String str) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        new Paint().setAntiAlias(true);
        Paint paint = new Paint();
        paint.setTextSize(i2 - 10);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(-1);
        canvas.drawText(str, i2 / 2.0f, (i2 / 2.0f) + 10.0f, paint);
        return createBitmap;
    }
}
