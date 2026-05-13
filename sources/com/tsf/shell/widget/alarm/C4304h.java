package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;
/* renamed from: com.tsf.shell.widget.alarm.h */
/* loaded from: classes.dex */
public class C4304h extends VRectangle {

    /* renamed from: a */
    float[] f13967a;

    /* renamed from: b */
    float[] f13968b;

    /* renamed from: c */
    float[] f13969c;

    /* renamed from: d */
    float[] f13970d;

    /* renamed from: e */
    private float f13971e;

    /* renamed from: f */
    private TextureElement f13972f;

    public C4304h() {
        super(416.0f, 416.0f);
        this.f13971e = VInformation.Scale();
        this.f13967a = new float[]{(-208.0f) * this.f13971e, 0.0f, 0.0f, 1.0f};
        this.f13968b = new float[]{208.0f * this.f13971e, 0.0f, 0.0f, 1.0f};
        this.f13969c = new float[4];
        this.f13970d = new float[4];
        Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "front_circle_bg");
        this.f13972f = AlarmWidget.f13709c.createTexture(m230a, true);
        m230a.recycle();
        AlarmWidget.f13710d.addObject(this);
        textures().addElement(this.f13972f);
        doubleSidedEnabled(C4281d.f13873a.f13875a);
        calAABB();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public boolean calTouchCollision(float f, float f2) {
        Number3d globalToLocal = AlarmWidget.f13716l.globalToLocal(new Number3d(f, f2, 0.0f));
        double sqrt = Math.sqrt((globalToLocal.f2527y * globalToLocal.f2527y) + (globalToLocal.f2526x * globalToLocal.f2526x));
        float[] aABBMatrix = getAABBMatrix();
        Matrix.multiplyMV(this.f13969c, 0, aABBMatrix, 0, this.f13967a, 0);
        Matrix.multiplyMV(this.f13970d, 0, aABBMatrix, 0, this.f13968b, 0);
        float screenWidth = VInformation.getScreenWidth() / 2.0f;
        float screenHeight = VInformation.getScreenHeight() / 2.0f;
        float abs = Math.abs(((this.f13969c[0] / this.f13969c[3]) * screenWidth) - (screenWidth * (this.f13970d[0] / this.f13970d[3])));
        float abs2 = Math.abs(((this.f13969c[1] / this.f13969c[3]) * screenHeight) - (screenHeight * (this.f13970d[1] / this.f13970d[3])));
        return sqrt <= Math.sqrt((double) ((abs * abs) + (abs2 * abs2))) / 2.0d;
    }

    /* renamed from: a */
    public void m263a() {
        C4322o.m233a(new VObject3d[]{this}, this.f13972f.f2529id, C4324p.m230a(AlarmWidget.f13714h, "front_circle_bg"), 300, 250, 0);
        doubleSidedEnabled(C4281d.f13873a.f13875a);
    }
}
