package com.tsf.shell.f.e.c.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
/* loaded from: classes.dex */
public class c extends VObject3dContainer {
    private a a;
    private a b;
    private TextureElement c;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private int g = 0;
    private float h = 0.0f;
    private float i = 0.0f;
    private float j = 0.0f;
    private float k = 0.0f;

    public e a(float f, float f2, float f3, int i) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = i;
        e eVar = new e(f + f2, 0.0f, f2);
        float f4 = ((((-f3) * f3) - (f * f)) - ((2.0f * f) * f2)) / ((f3 - f2) * 2.0f);
        float f5 = f4 + f3;
        e eVar2 = new e(0.0f, f5, f4);
        float a = eVar.a(eVar2) * 2.0f;
        float b = eVar.b(eVar2) * 2.0f;
        this.a = new a(a, b);
        this.b = new a(a, b);
        a(f4, f5, a, b);
        return eVar2;
    }

    private void a(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        Bitmap createBitmap = Bitmap.createBitmap((int) f3, (int) f4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawColor(this.g);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        float f5 = (f3 / 2.0f) + 0.0f;
        canvas.drawCircle(f5, (f4 / 2.0f) - f2, f, paint);
        canvas.drawCircle(f5, (f4 / 2.0f) + f2, f, paint);
        if (this.c != null) {
            com.censivn.C3DEngine.a.g().a(this.c);
            this.a.textures().removeAll();
        }
        this.c = com.censivn.C3DEngine.a.g().a(createBitmap, true);
        this.a.textures().addElement(this.c);
        createBitmap.recycle();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (this.c == null && this.d != 0.0f) {
            b();
        }
    }

    private void b() {
        if (this.c == null && this.h != 0.0f) {
            a(this.h, this.i, this.j, this.k);
        }
    }

    public void a() {
        if (this.c != null) {
            com.censivn.C3DEngine.a.g().a(this.c);
            this.a.textures().removeAll();
            this.c = null;
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        GLES20.glClear(1024);
        GLES20.glEnable(2960);
        GLES20.glStencilFunc(519, 0, -1);
        GLES20.glStencilOp(7682, 7682, 7682);
        this.b.dispatchDraw();
        GLES20.glStencilFunc(514, 1, -1);
        GLES20.glStencilOp(7680, 7680, 7680);
        this.a.dispatchDraw();
        GLES20.glDisable(2960);
    }

    public void a(b bVar, b bVar2) {
        this.b.b(bVar.a(), bVar2.a());
    }
}
