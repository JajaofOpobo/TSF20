package com.tsf.shell.widget.alarm;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.TweenTarget.VValueTweenTarget;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
/* loaded from: classes.dex */
public class k extends VObject3dContainer {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.02f;
    public float g = 0.92f;
    public Number3d h = new Number3d(0.0f, 1.0f, 0.0f);
    public Number3d i = new Number3d(1.0f, 0.0f, 0.0f);
    private double j = 0.0d;
    private double k = 0.0d;

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawMVPMatrix() {
        MatrixStack.glTranslatef(position().x, position().y, position().z);
        MatrixStack.glRotatef(rotation().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(rotation().y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(rotation().z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glRotatef(this.a, this.i.x, this.i.y, this.i.z);
        MatrixStack.glScalef(scale().x, scale().y, scale().y);
        Matrix.multiplyMM(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (!AlarmWidget.o) {
            this.d = ((0.0f - this.a) * this.f) + this.e;
            this.e *= 0.6f;
            this.c += this.d;
            this.a += this.c;
            this.c *= this.g;
            this.k = ((this.j - this.k) * 0.10000000149011612d) + this.k;
            this.i.setAll(1.0f, 0.0f, 0.0f);
            this.i.rotateZ((float) this.k);
            if (Math.abs(this.c) > 1.0E-5f || Math.abs(this.d) > 1.0E-5f) {
                invalidate();
            }
        }
    }

    public void a(float f, float f2) {
        this.e = 5.0f;
        this.h.setAll(f, f2, 0.0f);
        this.h.rotateZ(1.5707964f);
        this.j = Math.atan2(this.h.y, this.h.x);
        if (Math.abs(this.c) >= 1.0E-4f) {
            this.k = (this.k % 6.283185307179586d) - 6.283185307179586d;
            for (int i = 0; i < 3 && Math.abs(this.j - this.k) > 3.141592653589793d; i++) {
                this.k += 6.283185307179586d;
            }
        } else {
            this.k = this.j;
        }
        invalidate();
        i.c("targetRad:" + this.j + "     radian:" + this.k);
    }

    public void a() {
        VTween.to(new VValueTweenTarget(), 500, new VTweenParam() { // from class: com.tsf.shell.widget.alarm.k.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                k.this.b();
            }
        });
    }

    public void b() {
        a(-100.0f, 100.0f);
    }
}
