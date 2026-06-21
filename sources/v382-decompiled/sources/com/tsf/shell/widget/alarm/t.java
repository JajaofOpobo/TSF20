package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;

/* loaded from: classes.dex */
public class t extends VRectangle {
    float[] a;
    float[] b;
    float[] c;
    float[] d;
    private float e;
    private TextureElement f;

    public t() {
        super(416.0f, 416.0f);
        this.e = VInformation.Scale();
        this.a = new float[]{(-208.0f) * this.e, 0.0f, 0.0f, 1.0f};
        this.b = new float[]{208.0f * this.e, 0.0f, 0.0f, 1.0f};
        this.c = new float[4];
        this.d = new float[4];
        Bitmap a = aj.a(AlarmWidget.h, "front_circle_bg");
        this.f = AlarmWidget.c.createTexture(a, true);
        a.recycle();
        AlarmWidget.d.addObject(this);
        textures().addElement(this.f);
        doubleSidedEnabled(j.a.a);
        calAABB();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public boolean calTouchCollision(float f, float f2) {
        Number3d globalToLocal = AlarmWidget.l.globalToLocal(new Number3d(f, f2, 0.0f));
        double sqrt = Math.sqrt((globalToLocal.y * globalToLocal.y) + (globalToLocal.x * globalToLocal.x));
        float[] aABBMatrix = getAABBMatrix();
        Matrix.multiplyMV(this.c, 0, aABBMatrix, 0, this.a, 0);
        Matrix.multiplyMV(this.d, 0, aABBMatrix, 0, this.b, 0);
        float screenWidth = VInformation.getScreenWidth() / 2.0f;
        float screenHeight = VInformation.getScreenHeight() / 2.0f;
        float f3 = (this.c[0] / this.c[3]) * screenWidth;
        float f4 = screenWidth * (this.d[0] / this.d[3]);
        float f5 = (this.c[1] / this.c[3]) * screenHeight;
        float f6 = screenHeight * (this.d[1] / this.d[3]);
        float abs = Math.abs(f3 - f4);
        float abs2 = Math.abs(f5 - f6);
        return sqrt <= Math.sqrt((double) ((abs * abs) + (abs2 * abs2))) / 2.0d;
    }

    public void a() {
        ah.a(new VObject3d[]{this}, this.f.id, aj.a(AlarmWidget.h, "front_circle_bg"), 300, 250, 0);
        doubleSidedEnabled(j.a.a);
    }
}
