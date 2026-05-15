package com.tsf.shell.widget.alarm;

import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends VRectangle {
    float[] a;
    float[] b;
    float c;
    float[] d;
    float[] e;
    private float h;
    private static float g = 1.2f;
    public static boolean f = false;

    public b() {
        super(512.0f / g, 512.0f / g);
        this.h = VInformation.Scale();
        this.a = new float[]{(-208.0f) * this.h, 0.0f, 0.0f, 1.0f};
        this.b = new float[]{208.0f * this.h, 0.0f, 0.0f, 1.0f};
        this.c = 0.7692308f;
        this.d = new float[4];
        this.e = new float[4];
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public boolean calTouchCollision(float f2, float f3) {
        Number3d number3dGlobalToLocal = AlarmWidget.l.globalToLocal(new Number3d(f2, f3, 0.0f));
        double dSqrt = Math.sqrt((number3dGlobalToLocal.y * number3dGlobalToLocal.y) + (number3dGlobalToLocal.x * number3dGlobalToLocal.x));
        float[] aABBMatrix = getAABBMatrix();
        Matrix.multiplyMV(this.d, 0, aABBMatrix, 0, this.a, 0);
        Matrix.multiplyMV(this.e, 0, aABBMatrix, 0, this.b, 0);
        float screenWidth = VInformation.getScreenWidth() / 2.0f;
        float screenHeight = VInformation.getScreenHeight() / 2.0f;
        float f4 = (this.d[0] / this.d[3]) * screenWidth;
        float f5 = screenWidth * (this.e[0] / this.e[3]);
        float f6 = (this.d[1] / this.d[3]) * screenHeight;
        float f7 = screenHeight * (this.e[1] / this.e[3]);
        float fAbs = Math.abs(f4 - f5);
        float fAbs2 = Math.abs(f6 - f7);
        double dSqrt2 = Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2)) / 2.0d;
        if (dSqrt > dSqrt2) {
            return false;
        }
        if (dSqrt < dSqrt2 * ((double) this.c)) {
            f = true;
        } else {
            f = false;
        }
        return true;
    }
}
