package com.tsf.shell.widget.alarm;

import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;
/* loaded from: classes.dex */
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
        Number3d globalToLocal = AlarmWidget.l.globalToLocal(new Number3d(f2, f3, 0.0f));
        double sqrt = Math.sqrt((globalToLocal.y * globalToLocal.y) + (globalToLocal.x * globalToLocal.x));
        float[] aABBMatrix = getAABBMatrix();
        Matrix.multiplyMV(this.d, 0, aABBMatrix, 0, this.a, 0);
        Matrix.multiplyMV(this.e, 0, aABBMatrix, 0, this.b, 0);
        float screenWidth = VInformation.getScreenWidth() / 2.0f;
        float screenHeight = VInformation.getScreenHeight() / 2.0f;
        float abs = Math.abs(((this.d[0] / this.d[3]) * screenWidth) - (screenWidth * (this.e[0] / this.e[3])));
        float abs2 = Math.abs(((this.d[1] / this.d[3]) * screenHeight) - (screenHeight * (this.e[1] / this.e[3])));
        double sqrt2 = Math.sqrt((abs * abs) + (abs2 * abs2)) / 2.0d;
        if (sqrt > sqrt2) {
            return false;
        }
        if (sqrt < sqrt2 * this.c) {
            f = true;
        } else {
            f = false;
        }
        return true;
    }
}
