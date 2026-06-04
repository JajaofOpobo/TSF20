package com.censivn.C3DEngine.b;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.Home;
import com.tsf.shell.bd;
import com.tsf.shell.theme.inside.ThemeParser;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class z implements GLSurfaceView.Renderer {
    public static byte[] b;
    private ab g;
    private ad h;
    private float i;
    private long m;
    private ActivityManager n;
    private ActivityManager.MemoryInfo o;
    private com.censivn.C3DEngine.d.c p;
    private w q;
    private float[] u;
    public static String a = "D5F237AC11D7ABEB1357C340AC6914E3";
    public static int c = 0;
    private boolean j = false;
    private long k = 0;
    private float l = 0.0f;
    protected boolean d = false;
    protected boolean e = false;
    private boolean r = true;
    private int s = 0;
    private boolean t = true;
    boolean f = false;
    private float[] v = new float[16];

    public z(com.censivn.C3DEngine.d.c cVar) {
        MatrixStack.init();
        this.p = cVar;
        this.h = new ad();
        this.q = new w();
        com.censivn.C3DEngine.a.a(this.h);
        com.censivn.C3DEngine.a.a(this.q);
        r.b = this.h;
        r.c = this;
        this.n = (ActivityManager) com.censivn.C3DEngine.a.c().getSystemService("activity");
        this.o = new ActivityManager.MemoryInfo();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        ShaderManager.init();
        GLES20.glClearDepthf(1.0f);
        GLES20.glDepthFunc(513);
        GLES20.glDepthRangef(0.0f, 1.0f);
        GLES20.glDepthMask(true);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glFrontFace(2305);
        GLES20.glCullFace(1029);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        if (com.censivn.C3DEngine.a.l != i || com.censivn.C3DEngine.a.m != i2) {
            boolean z = com.censivn.C3DEngine.a.q;
            com.censivn.C3DEngine.a.a(i, i2);
            if (this.t) {
                this.g.a();
                this.p.a();
                this.t = false;
            } else {
                bd.a(com.censivn.C3DEngine.a.g, com.censivn.C3DEngine.a.h, com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.f);
                if (z != com.censivn.C3DEngine.a.q) {
                    com.tsf.shell.tips.b.a(13);
                }
            }
            this.i = i / i2;
            this.g.b().f = i2 / this.g.b().a.z;
            i();
        }
    }

    public final void a(ab abVar) {
        this.g = abVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(ThemeParser.TYPE_WALLPAPER);
        this.d = false;
        this.e = false;
        com.censivn.C3DEngine.g.s.a();
        this.q.a();
        Iterator it = this.g.d().iterator();
        while (it.hasNext()) {
            ((r) it.next()).f();
        }
        boolean o = Home.d().o();
        if (!this.d || !o) {
            e();
        }
    }

    public final void a() {
        this.g.b().d = 14000.0f;
        this.g.b().e = 1.0f;
    }

    public final void a(r rVar) {
        this.d = this.d || rVar.x;
        if (rVar.x && rVar.w) {
            this.e = true;
        }
    }

    static void a(int i, Bitmap bitmap) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
    }

    static int a(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return i3;
    }

    static int a(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6408, bitmap.getWidth(), bitmap.getHeight(), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return i;
    }

    static void a(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    public final void b(int i, int i2) {
        this.i = i / i2;
        this.g.b().f = i2 / this.g.b().a.z;
        i();
    }

    private void i() {
        float f = this.g.b().f / 2.0f;
        float f2 = this.i;
        k.a(MatrixStack.rProjMatrix, f2 * (-f), f * this.i, -f, f, this.g.b().e, this.g.b().d);
        k.a(MatrixStack.rVMatrix, this.g.b().a.x, this.g.b().a.y, this.g.b().a.z, this.g.b().b.x, this.g.b().b.y, this.g.b().b.z, this.g.b().c.x, this.g.b().c.y, this.g.b().c.z);
        k.a(MatrixStack.rSceneMatrix, MatrixStack.rProjMatrix, MatrixStack.rVMatrix, 0);
    }

    public final void a(float f, float f2) {
        this.u = MatrixStack.rSceneMatrix;
        MatrixStack.rSceneMatrix = this.v;
        float f3 = this.g.b().f / 2.0f;
        float f4 = (f / this.g.b().a.z) / 2.0f;
        float f5 = f2 / this.g.b().a.z;
        k.a(MatrixStack.rProjMatrix, ((-f3) * this.i) - f4, (this.i * f3) - f4, (-f3) - f5, f3 - f5, this.g.b().e, this.g.b().d);
        k.a(MatrixStack.rVMatrix, f, f2, this.g.b().a.z, f, f2, this.g.b().b.z, this.g.b().c.x, this.g.b().c.y, this.g.b().c.z);
        k.a(MatrixStack.rSceneMatrix, MatrixStack.rProjMatrix, MatrixStack.rVMatrix, 0);
    }

    public final void b() {
        MatrixStack.rSceneMatrix = this.u;
    }

    public final void c() {
        this.j = true;
        if (this.j) {
            this.m = System.currentTimeMillis();
            this.k = 0L;
        }
    }

    public final void d() {
        this.f = true;
    }

    public final r b(float f, float f2) {
        for (int size = this.g.d().size() - 1; size >= 0; size--) {
            r b2 = ((r) this.g.d().get(size)).b(f, f2, false);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public final void e() {
        this.r = false;
        com.censivn.C3DEngine.a.e().setRenderMode(0);
    }

    public final void f() {
        this.r = true;
        com.censivn.C3DEngine.a.e().setRenderMode(1);
    }

    public final void g() {
        this.d = true;
        this.s++;
        if (!this.r) {
            f();
        }
    }

    public final void h() {
        this.d = true;
        this.e = true;
        this.s++;
        if (!this.r) {
            f();
        }
    }
}
