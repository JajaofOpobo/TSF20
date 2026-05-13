package com.censivn.C3DEngine.p031b.p046h.p047a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.Shader;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.h.a.a */
/* loaded from: classes.dex */
public class C1018a extends C0962a {

    /* renamed from: i */
    private static C2273a f3057i;

    /* renamed from: j */
    private static TextureElement f3058j;

    /* renamed from: k */
    private static TextureElement f3059k;

    /* renamed from: p */
    private static C1021b f3062p;

    /* renamed from: g */
    private boolean f3063g;

    /* renamed from: h */
    private ArrayList<C1022b> f3064h;

    /* renamed from: l */
    private InterfaceC1020a f3065l;

    /* renamed from: o */
    private int f3066o;

    /* renamed from: m */
    private static ArrayList<C1018a> f3060m = new ArrayList<>();

    /* renamed from: n */
    private static ArrayList<C1018a> f3061n = new ArrayList<>();

    /* renamed from: a */
    public static float[] f3052a = new float[16];

    /* renamed from: c */
    public static float[] f3053c = new float[16];

    /* renamed from: d */
    public static float[] f3054d = new float[16];

    /* renamed from: e */
    public static float[] f3055e = new float[16];

    /* renamed from: f */
    public static float[] f3056f = new float[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.censivn.C3DEngine.b.h.a.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1020a {
        /* renamed from: a */
        void m10281a();
    }

    /* renamed from: a */
    public static C1018a m10289a(TextureElement textureElement) {
        if (f3061n.isEmpty()) {
            C1018a c1018a = new C1018a();
            c1018a.m10286b(textureElement);
            return c1018a;
        }
        C1018a remove = f3061n.remove(0);
        remove.m10286b(textureElement);
        return remove;
    }

    /* renamed from: c */
    private void m10285c() {
        f3061n.add(this);
    }

    public C1018a() {
        super(16, 32, 32, 32, null, true);
        this.f3063g = false;
        this.f3064h = new ArrayList<>();
        this.f3066o = ItemInfo.APP_INTENT;
        useVBO(false);
    }

    /* renamed from: b */
    public void m10286b(TextureElement textureElement) {
        this.f3063g = false;
        f3060m.add(this);
        if (f3059k == null) {
            f3059k = C0853a.m10853g().m10544a(m10282e(), true);
        }
        if (f3057i == null) {
            f3058j = m10291a(this.f3066o, this.f3066o);
            f3057i = C3359a.f11106t.m5977a(this.f3066o, this.f3066o);
            GLES20.glBindFramebuffer(36160, f3057i.f7428a);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, f3058j.f2529id, 0);
        }
        textures().addElement(f3059k);
        int[] m10284c = m10284c(textureElement);
        if (this.f3064h.size() == 0) {
            for (int i = 0; i < m10284c.length; i++) {
                C1022b c1022b = new C1022b(m10456a(i));
                c1022b.m10273a(m10284c[i]);
                this.f3064h.add(c1022b);
            }
            return;
        }
        int size = this.f3064h.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1022b c1022b2 = this.f3064h.get(i2);
            c1022b2.m10275a();
            c1022b2.m10273a(m10284c[i2]);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        boolean z;
        super.onDrawStart();
        if (!this.f3063g) {
            boolean z2 = false;
            Iterator<C1022b> it = this.f3064h.iterator();
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                z2 = it.next().m10272b() ? true : z;
            }
            if (z) {
                invalidate();
                return;
            }
            this.f3063g = true;
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C1018a.this.m10283d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m10283d() {
        f3060m.remove(this);
        if (f3060m.size() == 0) {
            if (f3057i != null) {
                C3359a.f11106t.m5976a(f3057i);
                f3057i = null;
            }
            if (f3058j != null) {
                C0853a.m10853g().m10543a(f3058j);
                f3058j = null;
            }
            if (f3059k != null) {
                C0853a.m10853g().m10543a(f3059k);
                f3059k = null;
            }
        }
        textures().removeAll();
        if (this.f3065l != null) {
            this.f3065l.m10281a();
        }
        removeFromParent();
        m10285c();
    }

    /* renamed from: a */
    private int[] m10287a(C2273a c2273a) {
        GLES20.glBindFramebuffer(36160, c2273a.f7428a);
        int i = c2273a.f7430c;
        int i2 = c2273a.f7431d;
        int[] iArr = new int[i * i2];
        int i3 = c2273a.f7430c / 6;
        int i4 = c2273a.f7431d / 6;
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, wrap);
        int[] iArr2 = new int[16];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 < 4) {
                for (int i8 = 0; i8 < 4; i8++) {
                    int i9 = iArr[((i7 + 1) * i3 * i) + ((i8 + 1) * i4)];
                    iArr2[i5] = (i9 & (-16711936)) | ((i9 << 16) & 16711680) | ((i9 >> 16) & 255);
                    i5++;
                }
                i6 = i7 + 1;
            } else {
                GLES20.glBindFramebuffer(36160, 0);
                return iArr2;
            }
        }
    }

    /* renamed from: c */
    private int[] m10284c(TextureElement textureElement) {
        GLES20.glBindFramebuffer(36160, f3057i.f7428a);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        m10290a(textureElement.f2529id, f3057i.f7428a, ShaderManager.SHADER_STANDARD, this.f3066o, this.f3066o);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, VInformation.getScreenWidth(), VInformation.getScreenHeight());
        return m10287a(f3057i);
    }

    /* renamed from: a */
    public static TextureElement m10291a(int i, int i2) {
        TextureElement m10545a = C0853a.m10853g().m10545a(i, i2, false);
        m10545a.width = i;
        m10545a.height = i2;
        return m10545a;
    }

    /* renamed from: e */
    private Bitmap m10282e() {
        Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        canvas.drawCircle(16.0f, 16.0f, 15.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static void m10290a(int i, int i2, Shader shader, int i3, int i4) {
        Matrix.setIdentityM(f3056f, 0);
        Matrix.setLookAtM(f3052a, 0, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        GLES20.glViewport(0, 0, i3, i4);
        float f = i3 / i4;
        Matrix.frustumM(f3053c, 0, -f, f, -1.0f, 1.0f, 1.0f, 10.0f);
        Matrix.multiplyMM(f3054d, 0, f3053c, 0, f3052a, 0);
        GLES20.glUseProgram(shader.f3427id);
        if (f3062p == null) {
            f3062p = new C1021b();
        }
        f3062p.m10278a(i);
        f3062p.m10277a(shader);
        f3062p.m10279a(i3, i4);
        f3062p.m10280a();
    }

    /* renamed from: com.censivn.C3DEngine.b.h.a.a$b */
    /* loaded from: classes.dex */
    public static class C1021b {

        /* renamed from: a */
        protected FloatBuffer f3068a;

        /* renamed from: b */
        protected FloatBuffer f3069b;

        /* renamed from: c */
        private int f3070c = 6;

        /* renamed from: d */
        private int f3071d = 6;

        /* renamed from: e */
        private int f3072e = -1;

        /* renamed from: f */
        private Shader f3073f;

        public C1021b() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f3070c * 3 * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f3068a = allocateDirect.asFloatBuffer();
            this.f3068a.position(0);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f3070c * 2 * 4);
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.f3069b = allocateDirect2.asFloatBuffer();
            this.f3069b.position(0);
            m10276b();
        }

        /* renamed from: a */
        public void m10277a(Shader shader) {
            this.f3073f = shader;
        }

        /* renamed from: a */
        public void m10278a(int i) {
            this.f3072e = i;
        }

        /* renamed from: b */
        private void m10276b() {
            this.f3068a.put(new float[]{-this.f3071d, this.f3071d, 0.0f, -this.f3071d, -this.f3071d, 0.0f, this.f3071d, this.f3071d, 0.0f, this.f3071d, this.f3071d, 0.0f, -this.f3071d, -this.f3071d, 0.0f, this.f3071d, -this.f3071d, 0.0f});
            this.f3069b.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            this.f3068a.position(0);
            this.f3069b.position(0);
        }

        /* renamed from: a */
        public void m10279a(float f, float f2) {
            float f3 = (f / f2) * 6.0f;
            this.f3068a.put(new float[]{-f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, 6.0f, 0.0f, f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, -6.0f, 0.0f}).position(0);
        }

        /* renamed from: a */
        public void m10280a() {
            GLES20.glClear(16640);
            Matrix.multiplyMM(C1018a.f3055e, 0, C1018a.f3054d, 0, C1018a.f3056f, 0);
            GLES20.glUniformMatrix4fv(this.f3073f.muMVPMatrixHandle, 1, false, C1018a.f3055e, 0);
            if (this.f3072e != -1) {
                this.f3073f.glVertexPointer(3, 5126, false, 0, this.f3068a);
                this.f3073f.glTexCoordPointer(2, 5126, false, 0, this.f3069b);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f3072e);
                GLES20.glDrawArrays(4, 0, this.f3070c);
                GLES20.glDisableVertexAttribArray(this.f3073f.maPositionHandle);
                GLES20.glDisableVertexAttribArray(this.f3073f.maTextureHandle);
                GLES20.glBindTexture(3553, 0);
            }
        }
    }
}
