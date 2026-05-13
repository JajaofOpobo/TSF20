package com.tsf.shell.widget.alarm;

import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;
/* renamed from: com.tsf.shell.widget.alarm.b */
/* loaded from: classes.dex */
public class C4258b extends VRectangle {

    /* renamed from: a */
    float[] f13798a;

    /* renamed from: b */
    float[] f13799b;

    /* renamed from: c */
    float f13800c;

    /* renamed from: d */
    float[] f13801d;

    /* renamed from: e */
    float[] f13802e;

    /* renamed from: h */
    private float f13803h;

    /* renamed from: g */
    private static float f13797g = 1.2f;

    /* renamed from: f */
    public static boolean f13796f = false;

    public C4258b() {
        super(512.0f / f13797g, 512.0f / f13797g);
        this.f13803h = VInformation.Scale();
        this.f13798a = new float[]{(-208.0f) * this.f13803h, 0.0f, 0.0f, 1.0f};
        this.f13799b = new float[]{208.0f * this.f13803h, 0.0f, 0.0f, 1.0f};
        this.f13800c = 0.7692308f;
        this.f13801d = new float[4];
        this.f13802e = new float[4];
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public boolean calTouchCollision(float f, float f2) {
        Number3d globalToLocal = AlarmWidget.f13716l.globalToLocal(new Number3d(f, f2, 0.0f));
        double sqrt = Math.sqrt((globalToLocal.f2527y * globalToLocal.f2527y) + (globalToLocal.f2526x * globalToLocal.f2526x));
        float[] aABBMatrix = getAABBMatrix();
        Matrix.multiplyMV(this.f13801d, 0, aABBMatrix, 0, this.f13798a, 0);
        Matrix.multiplyMV(this.f13802e, 0, aABBMatrix, 0, this.f13799b, 0);
        float screenWidth = VInformation.getScreenWidth() / 2.0f;
        float screenHeight = VInformation.getScreenHeight() / 2.0f;
        float abs = Math.abs(((this.f13801d[0] / this.f13801d[3]) * screenWidth) - (screenWidth * (this.f13802e[0] / this.f13802e[3])));
        float abs2 = Math.abs(((this.f13801d[1] / this.f13801d[3]) * screenHeight) - (screenHeight * (this.f13802e[1] / this.f13802e[3])));
        double sqrt2 = Math.sqrt((abs * abs) + (abs2 * abs2)) / 2.0d;
        if (sqrt > sqrt2) {
            return false;
        }
        if (sqrt < sqrt2 * this.f13800c) {
            f13796f = true;
        } else {
            f13796f = false;
        }
        return true;
    }
}
