package com.tsf.shell.widget.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
/* loaded from: classes.dex */
public class g {
    public TextureElement a;
    private int c;
    private VTextureManager e;
    private int b = -1;
    private String d = "";

    public g(VTextureManager vTextureManager, int i, String str) {
        this.c = 0;
        this.c = i;
        this.e = vTextureManager;
        a(str);
    }

    public void a(String str) {
        if (!str.equals(this.d)) {
            Bitmap a = a(this.b, this.c, str);
            if (this.a == null) {
                this.a = this.e.createTexture(a, true);
            } else {
                a(this.a, a, 0, 0);
            }
            a.recycle();
            this.d = str;
        }
    }

    public void a() {
        this.e.deleteTexture(this.a);
    }

    private void a(TextureElement textureElement, Bitmap bitmap, int i, int i2) {
        GLES20.glBindTexture(3553, textureElement.id);
        GLUtils.texSubImage2D(3553, 0, i, i2, bitmap);
    }

    private Bitmap a(int i, int i2, String str) {
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
