package com.censivn.C3DEngine.a;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.os.Build;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes.dex */
public class e implements GLSurfaceView.Renderer {
    public static String a = "D5F237AC11D7ABEB1357C340AC6914E3";
    public static int c = 0;
    public static long f;
    public static boolean g;
    private g j;
    private com.censivn.C3DEngine.b.c.f k;
    private float l;
    private long p;
    private ActivityManager q;
    private ActivityManager.MemoryInfo r;
    private GLSurfaceView s;
    private com.censivn.C3DEngine.d.b t;
    private float[] x;
    public String b = "Renderer";
    private boolean m = false;
    private long n = 0;
    private float o = 0.0f;
    protected boolean d = false;
    protected boolean e = false;
    private int u = 0;
    private boolean v = true;
    boolean h = false;
    boolean i = true;
    private boolean w = false;
    private float[] y = new float[16];

    public e(com.censivn.C3DEngine.d.b bVar, GLSurfaceView gLSurfaceView) {
        this.s = gLSurfaceView;
        g = Build.VERSION.SDK_INT >= 9;
        MatrixStack.init();
        this.t = bVar;
        this.k = new com.censivn.C3DEngine.b.c.f();
        com.censivn.C3DEngine.a.a(this.k);
        com.censivn.C3DEngine.a.a(this);
        this.q = (ActivityManager) com.censivn.C3DEngine.a.d().getSystemService("activity");
        this.r = new ActivityManager.MemoryInfo();
    }

    public void a(String str) {
        this.b = str;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        ShaderManager.init();
        GLES20.glClearDepthf(1.0f);
        GLES20.glDepthFunc(ThemeElementType.TYPE_DESKTOP_EFFECT);
        GLES20.glDepthRangef(0.0f, 1.0f);
        GLES20.glDepthMask(true);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glFrontFace(2305);
        GLES20.glCullFace(1029);
        f = Thread.currentThread().getId();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        f = Thread.currentThread().getId();
        if (com.censivn.C3DEngine.b.b.a.F != i || com.censivn.C3DEngine.b.b.a.G != i2) {
            boolean z = com.censivn.C3DEngine.b.b.a.O;
            com.censivn.C3DEngine.b.b.a.a(i, i2);
            if (this.v) {
                this.j.c();
                a(14000.0f, 1.0f);
                a(true);
                this.j.b().a.z = 1000.0f * com.censivn.C3DEngine.b.b.a.b;
                this.j.b().f = com.censivn.C3DEngine.b.b.a.G / this.j.b().a.z;
                this.t.b();
                this.v = false;
                b(i, i2);
                return;
            }
            b(i, i2);
            com.tsf.shell.manager.a.b.a(com.censivn.C3DEngine.b.b.a.B, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A);
            if (z != com.censivn.C3DEngine.b.b.a.O) {
                com.tsf.shell.manager.p.c.a(13);
            }
        }
    }

    private void b(int i, int i2) {
        this.l = i / i2;
        this.j.b().f = i2 / this.j.b().a.z;
        e();
    }

    public void a(g gVar) {
        this.j = gVar;
    }

    public boolean a() {
        return true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        this.d = false;
        this.e = false;
        com.censivn.C3DEngine.b.g.c.a();
        com.censivn.C3DEngine.a.a().a();
        b();
        if (!this.d || !a()) {
            h();
        }
    }

    public void a(float f2, float f3) {
        this.j.b().d = f2;
        this.j.b().e = f3;
    }

    protected void b() {
        Iterator<i> it = this.j.d().iterator();
        while (it.hasNext()) {
            it.next().dispatchDraw();
        }
    }

    public void a(i iVar) {
        this.d = this.d || iVar.isAnimationObject;
        if (iVar.isAnimationObject && iVar.isHighPriorityAnimationObject) {
            this.e = true;
        }
    }

    public void c() {
        this.w = true;
        GLES20.glClear(ItemInfo.APP_VERSION_CODE);
        GLES20.glEnable(2929);
    }

    public void d() {
        GLES20.glDisable(2929);
        GLES20.glClear(ItemInfo.APP_VERSION_CODE);
    }

    public void a(int i, Bitmap bitmap, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, i2, i3, bitmap);
    }

    public int a(int i, int i2, boolean z) {
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

    public int a(Bitmap bitmap, boolean z) {
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

    public void a(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    public void a(int i, int i2) {
        this.l = i / i2;
        this.j.b().f = i2 / this.j.b().a.z;
        e();
    }

    public void e() {
        float f2 = this.j.b().f / 2.0f;
        float f3 = this.l;
        c.a(MatrixStack.rProjMatrix, 0, f3 * (-f2), f2 * this.l, -f2, f2, this.j.b().e, this.j.b().d);
        c.a(MatrixStack.rVMatrix, 0, this.j.b().a.x, this.j.b().a.y, this.j.b().a.z, this.j.b().b.x, this.j.b().b.y, this.j.b().b.z, this.j.b().c.x, this.j.b().c.y, this.j.b().c.z);
        c.a(MatrixStack.rSceneMatrix, 0, MatrixStack.rProjMatrix, 0, MatrixStack.rVMatrix, 0);
    }

    public void b(float f2, float f3) {
        this.x = MatrixStack.rSceneMatrix;
        MatrixStack.rSceneMatrix = this.y;
        float f4 = this.j.b().f / 2.0f;
        float f5 = (f2 / this.j.b().a.z) / 2.0f;
        float f6 = f3 / this.j.b().a.z;
        c.a(MatrixStack.rProjMatrix, 0, ((-f4) * this.l) - f5, (this.l * f4) - f5, (-f4) - f6, f4 - f6, this.j.b().e, this.j.b().d);
        c.a(MatrixStack.rVMatrix, 0, f2, f3, this.j.b().a.z, f2, f3, this.j.b().b.z, this.j.b().c.x, this.j.b().c.y, this.j.b().c.z);
        c.a(MatrixStack.rSceneMatrix, 0, MatrixStack.rProjMatrix, 0, MatrixStack.rVMatrix, 0);
    }

    public void f() {
        MatrixStack.rSceneMatrix = this.x;
    }

    public void a(boolean z) {
        this.m = z;
        if (this.m) {
            this.p = System.currentTimeMillis();
            this.n = 0L;
        }
    }

    public void g() {
        this.h = true;
    }

    public i c(float f2, float f3) {
        int size = this.j.d().size() - 1;
        while (true) {
            int i = size;
            if (i > -1) {
                i hittingTarget = this.j.d().get(i).getHittingTarget(f2, f3, false);
                if (hittingTarget == null) {
                    size = i - 1;
                } else {
                    return hittingTarget;
                }
            } else {
                return null;
            }
        }
    }

    public void h() {
        this.s.setRenderMode(0);
    }

    public void i() {
        this.s.setRenderMode(1);
    }

    public void j() {
        this.d = true;
        this.u++;
        if (!m()) {
            i();
        }
    }

    public void k() {
        this.d = true;
        this.e = true;
        this.u++;
        if (!m()) {
            i();
        }
    }

    private boolean m() {
        return this.s.getRenderMode() == 1;
    }

    public static boolean l() {
        return Thread.currentThread().getId() == f;
    }
}
