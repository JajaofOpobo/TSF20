package com.tsf.shell.e.e.b;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class f {
    protected FloatBuffer a;
    protected FloatBuffer b;
    private int c = 6;
    private int d = 6;
    private int e = -1;
    private d f;

    public f() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.c * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.a = allocateDirect.asFloatBuffer();
        this.a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.c * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.b = allocateDirect2.asFloatBuffer();
        this.b.position(0);
        b();
    }

    public void a(d dVar) {
        this.f = dVar;
    }

    public void a(int i) {
        this.e = i;
    }

    private void b() {
        this.a.put(new float[]{-this.d, this.d, 0.0f, -this.d, -this.d, 0.0f, this.d, this.d, 0.0f, this.d, this.d, 0.0f, -this.d, -this.d, 0.0f, this.d, -this.d, 0.0f});
        this.b.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.a.position(0);
        this.b.position(0);
    }

    public void a(float f, float f2) {
        float f3 = (f / f2) * 6.0f;
        this.a.put(new float[]{-f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, 6.0f, 0.0f, f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, -6.0f, 0.0f}).position(0);
    }

    public void a() {
        GLES20.glClear(16640);
        Matrix.multiplyMM(e.f, 0, e.e, 0, e.g, 0);
        GLES20.glUniformMatrix4fv(this.f.b, 1, false, e.f, 0);
        if (this.e != -1) {
            this.f.b(3, 5126, false, 0, this.a);
            this.f.a(2, 5126, false, 0, this.b);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.e);
            GLES20.glDrawArrays(4, 0, this.c);
            this.f.b();
            this.f.a();
            GLES20.glBindTexture(3553, 0);
        }
    }
}
