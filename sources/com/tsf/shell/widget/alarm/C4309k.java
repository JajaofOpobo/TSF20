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
/* renamed from: com.tsf.shell.widget.alarm.k */
/* loaded from: classes.dex */
public class C4309k extends VObject3dContainer {

    /* renamed from: a */
    public float f13982a = 0.0f;

    /* renamed from: b */
    public float f13983b = 0.0f;

    /* renamed from: c */
    public float f13984c = 0.0f;

    /* renamed from: d */
    public float f13985d = 0.0f;

    /* renamed from: e */
    public float f13986e = 0.0f;

    /* renamed from: f */
    public float f13987f = 0.02f;

    /* renamed from: g */
    public float f13988g = 0.92f;

    /* renamed from: h */
    public Number3d f13989h = new Number3d(0.0f, 1.0f, 0.0f);

    /* renamed from: i */
    public Number3d f13990i = new Number3d(1.0f, 0.0f, 0.0f);

    /* renamed from: j */
    private double f13991j = 0.0d;

    /* renamed from: k */
    private double f13992k = 0.0d;

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawMVPMatrix() {
        MatrixStack.glTranslatef(position().f2526x, position().f2527y, position().f2528z);
        MatrixStack.glRotatef(rotation().f2526x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(rotation().f2527y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(rotation().f2528z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glRotatef(this.f13982a, this.f13990i.f2526x, this.f13990i.f2527y, this.f13990i.f2528z);
        MatrixStack.glScalef(scale().f2526x, scale().f2527y, scale().f2527y);
        Matrix.multiplyMM(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (!AlarmWidget.f13718o) {
            this.f13985d = ((0.0f - this.f13982a) * this.f13987f) + this.f13986e;
            this.f13986e *= 0.6f;
            this.f13984c += this.f13985d;
            this.f13982a += this.f13984c;
            this.f13984c *= this.f13988g;
            this.f13992k = ((this.f13991j - this.f13992k) * 0.10000000149011612d) + this.f13992k;
            this.f13990i.setAll(1.0f, 0.0f, 0.0f);
            this.f13990i.rotateZ((float) this.f13992k);
            if (Math.abs(this.f13984c) > 1.0E-5f || Math.abs(this.f13985d) > 1.0E-5f) {
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public void m250a(float f, float f2) {
        this.f13986e = 5.0f;
        this.f13989h.setAll(f, f2, 0.0f);
        this.f13989h.rotateZ(1.5707964f);
        this.f13991j = Math.atan2(this.f13989h.f2527y, this.f13989h.f2526x);
        if (Math.abs(this.f13984c) >= 1.0E-4f) {
            this.f13992k = (this.f13992k % 6.283185307179586d) - 6.283185307179586d;
            for (int i = 0; i < 3 && Math.abs(this.f13991j - this.f13992k) > 3.141592653589793d; i++) {
                this.f13992k += 6.283185307179586d;
            }
        } else {
            this.f13992k = this.f13991j;
        }
        invalidate();
        C4305i.m259c("targetRad:" + this.f13991j + "     radian:" + this.f13992k);
    }

    /* renamed from: a */
    public void m251a() {
        VTween.m10747to(new VValueTweenTarget(), 500, new VTweenParam() { // from class: com.tsf.shell.widget.alarm.k.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C4309k.this.m249b();
            }
        });
    }

    /* renamed from: b */
    public void m249b() {
        m250a(-100.0f, 100.0f);
    }
}
