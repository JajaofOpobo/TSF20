package com.censivn.C3DEngine.b.h.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.Shader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.f.a.a {
    private static com.tsf.shell.f.a.a.a i;
    private static TextureElement j;
    private static TextureElement k;
    private static b p;
    private boolean g;
    private ArrayList<com.censivn.C3DEngine.b.h.a.b> h;
    private InterfaceC0037a l;
    private int o;
    private static ArrayList<a> m = new ArrayList<>();
    private static ArrayList<a> n = new ArrayList<>();
    public static float[] a = new float[16];
    public static float[] c = new float[16];
    public static float[] d = new float[16];
    public static float[] e = new float[16];
    public static float[] f = new float[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.censivn.C3DEngine.b.h.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037a {
        void a();
    }

    public static a a(TextureElement textureElement) {
        if (n.isEmpty()) {
            a aVar = new a();
            aVar.b(textureElement);
            return aVar;
        }
        a remove = n.remove(0);
        remove.b(textureElement);
        return remove;
    }

    private void c() {
        n.add(this);
    }

    public a() {
        super(16, 32, 32, 32, null, true);
        this.g = false;
        this.h = new ArrayList<>();
        this.o = ItemInfo.APP_INTENT;
        useVBO(false);
    }

    public void b(TextureElement textureElement) {
        this.g = false;
        m.add(this);
        if (k == null) {
            k = com.censivn.C3DEngine.a.g().a(e(), true);
        }
        if (i == null) {
            j = a(this.o, this.o);
            i = com.tsf.shell.manager.a.t.a(this.o, this.o);
            GLES20.glBindFramebuffer(36160, i.a);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j.id, 0);
        }
        textures().addElement(k);
        int[] c2 = c(textureElement);
        if (this.h.size() == 0) {
            for (int i2 = 0; i2 < c2.length; i2++) {
                com.censivn.C3DEngine.b.h.a.b bVar = new com.censivn.C3DEngine.b.h.a.b(a(i2));
                bVar.a(c2[i2]);
                this.h.add(bVar);
            }
            return;
        }
        int size = this.h.size();
        for (int i3 = 0; i3 < size; i3++) {
            com.censivn.C3DEngine.b.h.a.b bVar2 = this.h.get(i3);
            bVar2.a();
            bVar2.a(c2[i3]);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        boolean z;
        super.onDrawStart();
        if (!this.g) {
            boolean z2 = false;
            Iterator<com.censivn.C3DEngine.b.h.a.b> it = this.h.iterator();
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                z2 = it.next().b() ? true : z;
            }
            if (z) {
                invalidate();
                return;
            }
            this.g = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        m.remove(this);
        if (m.size() == 0) {
            if (i != null) {
                com.tsf.shell.manager.a.t.a(i);
                i = null;
            }
            if (j != null) {
                com.censivn.C3DEngine.a.g().a(j);
                j = null;
            }
            if (k != null) {
                com.censivn.C3DEngine.a.g().a(k);
                k = null;
            }
        }
        textures().removeAll();
        if (this.l != null) {
            this.l.a();
        }
        removeFromParent();
        c();
    }

    private int[] a(com.tsf.shell.f.a.a.a aVar) {
        GLES20.glBindFramebuffer(36160, aVar.a);
        int i2 = aVar.c;
        int i3 = aVar.d;
        int[] iArr = new int[i2 * i3];
        int i4 = aVar.c / 6;
        int i5 = aVar.d / 6;
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, wrap);
        int[] iArr2 = new int[16];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 < 4) {
                for (int i9 = 0; i9 < 4; i9++) {
                    int i10 = iArr[((i8 + 1) * i4 * i2) + ((i9 + 1) * i5)];
                    iArr2[i6] = (i10 & (-16711936)) | ((i10 << 16) & 16711680) | ((i10 >> 16) & 255);
                    i6++;
                }
                i7 = i8 + 1;
            } else {
                GLES20.glBindFramebuffer(36160, 0);
                return iArr2;
            }
        }
    }

    private int[] c(TextureElement textureElement) {
        GLES20.glBindFramebuffer(36160, i.a);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        a(textureElement.id, i.a, ShaderManager.SHADER_STANDARD, this.o, this.o);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, VInformation.getScreenWidth(), VInformation.getScreenHeight());
        return a(i);
    }

    public static TextureElement a(int i2, int i3) {
        TextureElement a2 = com.censivn.C3DEngine.a.g().a(i2, i3, false);
        a2.width = i2;
        a2.height = i3;
        return a2;
    }

    private Bitmap e() {
        Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        canvas.drawCircle(16.0f, 16.0f, 15.0f, paint);
        return createBitmap;
    }

    public static void a(int i2, int i3, Shader shader, int i4, int i5) {
        Matrix.setIdentityM(f, 0);
        Matrix.setLookAtM(a, 0, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        GLES20.glViewport(0, 0, i4, i5);
        float f2 = i4 / i5;
        Matrix.frustumM(c, 0, -f2, f2, -1.0f, 1.0f, 1.0f, 10.0f);
        Matrix.multiplyMM(d, 0, c, 0, a, 0);
        GLES20.glUseProgram(shader.id);
        if (p == null) {
            p = new b();
        }
        p.a(i2);
        p.a(shader);
        p.a(i4, i5);
        p.a();
    }

    /* loaded from: classes.dex */
    public static class b {
        protected FloatBuffer a;
        protected FloatBuffer b;
        private int c = 6;
        private int d = 6;
        private int e = -1;
        private Shader f;

        public b() {
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

        public void a(Shader shader) {
            this.f = shader;
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
            Matrix.multiplyMM(a.e, 0, a.d, 0, a.f, 0);
            GLES20.glUniformMatrix4fv(this.f.muMVPMatrixHandle, 1, false, a.e, 0);
            if (this.e != -1) {
                this.f.glVertexPointer(3, 5126, false, 0, this.a);
                this.f.glTexCoordPointer(2, 5126, false, 0, this.b);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.e);
                GLES20.glDrawArrays(4, 0, this.c);
                GLES20.glDisableVertexAttribArray(this.f.maPositionHandle);
                GLES20.glDisableVertexAttribArray(this.f.maTextureHandle);
                GLES20.glBindTexture(3553, 0);
            }
        }
    }
}
