package com.censivn.C3DEngine.p030a;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.os.Build;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0936f;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p056d.InterfaceC1083b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p185p.C3591c;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* renamed from: com.censivn.C3DEngine.a.e */
/* loaded from: classes.dex */
public class C0869e implements GLSurfaceView.Renderer {

    /* renamed from: a */
    public static String f2472a = "D5F237AC11D7ABEB1357C340AC6914E3";

    /* renamed from: c */
    public static int f2473c = 0;

    /* renamed from: f */
    public static long f2474f;

    /* renamed from: g */
    public static boolean f2475g;

    /* renamed from: j */
    private C0872g f2481j;

    /* renamed from: k */
    private C0936f f2482k;

    /* renamed from: l */
    private float f2483l;

    /* renamed from: p */
    private long f2487p;

    /* renamed from: q */
    private ActivityManager f2488q;

    /* renamed from: r */
    private ActivityManager.MemoryInfo f2489r;

    /* renamed from: s */
    private GLSurfaceView f2490s;

    /* renamed from: t */
    private InterfaceC1083b f2491t;

    /* renamed from: x */
    private float[] f2495x;

    /* renamed from: b */
    public String f2476b = "Renderer";

    /* renamed from: m */
    private boolean f2484m = false;

    /* renamed from: n */
    private long f2485n = 0;

    /* renamed from: o */
    private float f2486o = 0.0f;

    /* renamed from: d */
    protected boolean f2477d = false;

    /* renamed from: e */
    protected boolean f2478e = false;

    /* renamed from: u */
    private int f2492u = 0;

    /* renamed from: v */
    private boolean f2493v = true;

    /* renamed from: h */
    boolean f2479h = false;

    /* renamed from: i */
    boolean f2480i = true;

    /* renamed from: w */
    private boolean f2494w = false;

    /* renamed from: y */
    private float[] f2496y = new float[16];

    public C0869e(InterfaceC1083b interfaceC1083b, GLSurfaceView gLSurfaceView) {
        this.f2490s = gLSurfaceView;
        f2475g = Build.VERSION.SDK_INT >= 9;
        MatrixStack.init();
        this.f2491t = interfaceC1083b;
        this.f2482k = new C0936f();
        C0853a.m10859a(this.f2482k);
        C0853a.m10861a(this);
        this.f2488q = (ActivityManager) C0853a.m10856d().getSystemService("activity");
        this.f2489r = new ActivityManager.MemoryInfo();
    }

    /* renamed from: a */
    public void m10773a(String str) {
        this.f2476b = str;
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
        f2474f = Thread.currentThread().getId();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        f2474f = Thread.currentThread().getId();
        if (C0892a.f2555F != i || C0892a.f2556G != i2) {
            boolean z = C0892a.f2564O;
            C0892a.m10739a(i, i2);
            if (this.f2493v) {
                this.f2481j.m10750c();
                m10781a(14000.0f, 1.0f);
                m10772a(true);
                this.f2481j.m10751b().f3530a.f2528z = 1000.0f * C0892a.f2566b;
                this.f2481j.m10751b().f3535f = C0892a.f2556G / this.f2481j.m10751b().f3530a.f2528z;
                this.f2491t.mo2247b();
                this.f2493v = false;
                m10769b(i, i2);
                return;
            }
            m10769b(i, i2);
            C3359a.f11088b.m10570a(C0892a.f2551B, C0892a.f2552C, C0892a.f2590z, C0892a.f2550A);
            if (z != C0892a.f2564O) {
                C3591c.m1944a(13);
            }
        }
    }

    /* renamed from: b */
    private void m10769b(int i, int i2) {
        this.f2483l = i / i2;
        this.f2481j.m10751b().f3535f = i2 / this.f2481j.m10751b().f3530a.f2528z;
        m10765e();
    }

    /* renamed from: a */
    public void m10775a(C0872g c0872g) {
        this.f2481j = c0872g;
    }

    /* renamed from: a */
    public boolean mo10755a() {
        return true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        this.f2477d = false;
        this.f2478e = false;
        C1014c.m10328a();
        C0853a.m10865a().m10591a();
        m10771b();
        if (!this.f2477d || !mo10755a()) {
            m10762h();
        }
    }

    /* renamed from: a */
    public void m10781a(float f, float f2) {
        this.f2481j.m10751b().f3533d = f;
        this.f2481j.m10751b().f3534e = f2;
    }

    /* renamed from: b */
    protected void m10771b() {
        Iterator<C0975i> it = this.f2481j.m10749d().iterator();
        while (it.hasNext()) {
            it.next().dispatchDraw();
        }
    }

    /* renamed from: a */
    public void m10774a(C0975i c0975i) {
        this.f2477d = this.f2477d || c0975i.isAnimationObject;
        if (c0975i.isAnimationObject && c0975i.isHighPriorityAnimationObject) {
            this.f2478e = true;
        }
    }

    /* renamed from: c */
    public void m10768c() {
        this.f2494w = true;
        GLES20.glClear(ItemInfo.APP_VERSION_CODE);
        GLES20.glEnable(2929);
    }

    /* renamed from: d */
    public void m10766d() {
        GLES20.glDisable(2929);
        GLES20.glClear(ItemInfo.APP_VERSION_CODE);
    }

    /* renamed from: a */
    public void m10777a(int i, Bitmap bitmap, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, i2, i3, bitmap);
    }

    /* renamed from: a */
    public int m10778a(int i, int i2, boolean z) {
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

    /* renamed from: a */
    public int m10776a(Bitmap bitmap, boolean z) {
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

    /* renamed from: a */
    public void m10780a(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    /* renamed from: a */
    public void m10779a(int i, int i2) {
        this.f2483l = i / i2;
        this.f2481j.m10751b().f3535f = i2 / this.f2481j.m10751b().f3530a.f2528z;
        m10765e();
    }

    /* renamed from: e */
    public void m10765e() {
        float f = this.f2481j.m10751b().f3535f / 2.0f;
        float f2 = this.f2483l;
        C0863c.m10831a(MatrixStack.rProjMatrix, 0, f2 * (-f), f * this.f2483l, -f, f, this.f2481j.m10751b().f3534e, this.f2481j.m10751b().f3533d);
        C0863c.m10830a(MatrixStack.rVMatrix, 0, this.f2481j.m10751b().f3530a.f2526x, this.f2481j.m10751b().f3530a.f2527y, this.f2481j.m10751b().f3530a.f2528z, this.f2481j.m10751b().f3531b.f2526x, this.f2481j.m10751b().f3531b.f2527y, this.f2481j.m10751b().f3531b.f2528z, this.f2481j.m10751b().f3532c.f2526x, this.f2481j.m10751b().f3532c.f2527y, this.f2481j.m10751b().f3532c.f2528z);
        C0863c.m10829a(MatrixStack.rSceneMatrix, 0, MatrixStack.rProjMatrix, 0, MatrixStack.rVMatrix, 0);
    }

    /* renamed from: b */
    public void m10770b(float f, float f2) {
        this.f2495x = MatrixStack.rSceneMatrix;
        MatrixStack.rSceneMatrix = this.f2496y;
        float f3 = this.f2481j.m10751b().f3535f / 2.0f;
        float f4 = (f / this.f2481j.m10751b().f3530a.f2528z) / 2.0f;
        float f5 = f2 / this.f2481j.m10751b().f3530a.f2528z;
        C0863c.m10831a(MatrixStack.rProjMatrix, 0, ((-f3) * this.f2483l) - f4, (this.f2483l * f3) - f4, (-f3) - f5, f3 - f5, this.f2481j.m10751b().f3534e, this.f2481j.m10751b().f3533d);
        C0863c.m10830a(MatrixStack.rVMatrix, 0, f, f2, this.f2481j.m10751b().f3530a.f2528z, f, f2, this.f2481j.m10751b().f3531b.f2528z, this.f2481j.m10751b().f3532c.f2526x, this.f2481j.m10751b().f3532c.f2527y, this.f2481j.m10751b().f3532c.f2528z);
        C0863c.m10829a(MatrixStack.rSceneMatrix, 0, MatrixStack.rProjMatrix, 0, MatrixStack.rVMatrix, 0);
    }

    /* renamed from: f */
    public void m10764f() {
        MatrixStack.rSceneMatrix = this.f2495x;
    }

    /* renamed from: a */
    public void m10772a(boolean z) {
        this.f2484m = z;
        if (this.f2484m) {
            this.f2487p = System.currentTimeMillis();
            this.f2485n = 0L;
        }
    }

    /* renamed from: g */
    public void m10763g() {
        this.f2479h = true;
    }

    /* renamed from: c */
    public C0975i m10767c(float f, float f2) {
        int size = this.f2481j.m10749d().size() - 1;
        while (true) {
            int i = size;
            if (i > -1) {
                C0975i hittingTarget = this.f2481j.m10749d().get(i).getHittingTarget(f, f2, false);
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

    /* renamed from: h */
    public void m10762h() {
        this.f2490s.setRenderMode(0);
    }

    /* renamed from: i */
    public void m10761i() {
        this.f2490s.setRenderMode(1);
    }

    /* renamed from: j */
    public void m10760j() {
        this.f2477d = true;
        this.f2492u++;
        if (!m10757m()) {
            m10761i();
        }
    }

    /* renamed from: k */
    public void m10759k() {
        this.f2477d = true;
        this.f2478e = true;
        this.f2492u++;
        if (!m10757m()) {
            m10761i();
        }
    }

    /* renamed from: m */
    private boolean m10757m() {
        return this.f2490s.getRenderMode() == 1;
    }

    /* renamed from: l */
    public static boolean m10758l() {
        return Thread.currentThread().getId() == f2474f;
    }
}
