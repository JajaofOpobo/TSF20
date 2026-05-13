package com.tsf.shell.widget.cubeclock.a;

import android.graphics.Color;
import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.widget.cubeclock.c;
import com.tsf.shell.widget.cubeclock.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public class b extends VObject3dContainer {
    protected FloatBuffer a;
    protected FloatBuffer b;
    protected FloatBuffer c;
    private c l;
    private int g = 96;
    public int d = 0;
    public int e = 0;
    private ArrayList<a> h = new ArrayList<>();
    private ArrayList<a> i = new ArrayList<>();
    public int[] f = {-8319731, -62196, -1609171, -536534, -13607043, -13667434, -13521439, -5315356, -16306422, -15901936, -15947500, -9712101, -15462385, -14540254, -13421773, -10066330};
    private float j = -5.0f;
    private int k = -13421773;
    private float m = 1.0f;

    public b(c cVar) {
        this.l = cVar;
        this.l.c.addObject(this);
        scale().x = this.l.p;
        scale().y = this.l.p;
        scale().z = this.l.p;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.g * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.b = allocateDirect.asFloatBuffer();
        this.b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.g * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.c = allocateDirect2.asFloatBuffer();
        this.c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.g * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.a = allocateDirect3.asFloatBuffer();
        this.a.position(0);
        b();
        setMouseEventListener(new C0181b(this));
        setAABBSP(((-588.0f) / this.l.n) / 2.0f, ((-144.0f) / this.l.n) / 2.0f, 0.0f, (588.0f / this.l.n) / 2.0f, (144.0f / this.l.n) / 2.0f, 0.0f);
    }

    /* renamed from: com.tsf.shell.widget.cubeclock.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0181b extends VMouseEventListener {
        Number3d a;
        private float c;
        private float d;

        public C0181b(VObject3d vObject3d) {
            super(vObject3d);
            this.a = new Number3d(0.0f, 0.0f, 0.0f);
            this.c = 416.0f * b.this.l.p;
            this.d = this.c / 2.0f;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            j.a("onDown" + motionEvent.getX());
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Number3d a = a(motionEvent2);
            b.this.j = a(a.x);
            b.this.a((int) Math.floor(b.this.j));
            b.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            Number3d a = a(motionEvent);
            b.this.j = a(a.x);
            b.this.a((int) Math.floor(b.this.j));
            b.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            b.this.j = -5.0f;
        }

        private Number3d a(MotionEvent motionEvent) {
            this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.a.y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.a.z = 0.0f;
            return b.this.globalToLocal(this.a);
        }

        private float a(float f) {
            float f2 = ((this.d + f) / this.c) * 16.0f;
            if (f2 < 0.0f) {
                return 0.0f;
            }
            if (f2 > 15.0f) {
                return 15.0f;
            }
            return f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.k = this.f[i];
        this.k = b(this.k);
        this.l.g.a(this.k);
    }

    public int a() {
        return this.k;
    }

    private int b(int i) {
        return Color.argb(255, (int) (Color.red(i) * this.m), (int) (Color.green(i) * this.m), (int) (Color.blue(i) * this.m));
    }

    private void b() {
        float[] fArr = new float[18];
        fArr[0] = (-13.0f) - 195.0f;
        fArr[1] = 26.0f;
        fArr[2] = 0.0f;
        fArr[3] = (-13.0f) - 195.0f;
        fArr[4] = -26.0f;
        fArr[5] = 0.0f;
        fArr[6] = 13.0f - 195.0f;
        fArr[7] = 26.0f;
        fArr[8] = 0.0f;
        fArr[9] = 13.0f - 195.0f;
        fArr[10] = 26.0f;
        fArr[11] = 0.0f;
        fArr[12] = (-13.0f) - 195.0f;
        fArr[13] = -26.0f;
        fArr[14] = 0.0f;
        fArr[15] = 13.0f - 195.0f;
        fArr[16] = -26.0f;
        fArr[17] = 0.0f;
        for (int i = 0; i < 16; i++) {
            a aVar = new a(i);
            this.h.add(aVar);
            this.i.add(aVar);
            this.b.put(fArr);
            for (int i2 = 0; i2 < 6; i2++) {
                int i3 = i2 * 3;
                fArr[i3] = fArr[i3] + 26.0f;
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.c.put(this.l.g.b());
        }
        a(1.0f);
        this.b.position(0);
        this.c.position(0);
    }

    public void a(float f) {
        this.m = f;
        this.a.position(0);
        float[] fArr = new float[this.g * 4];
        for (int i = 0; i < this.g; i++) {
            int i2 = this.f[i / 6];
            fArr[(i * 4) + 0] = (Color.red(i2) * f) / 255.0f;
            fArr[(i * 4) + 1] = (Color.green(i2) * f) / 255.0f;
            fArr[(i * 4) + 2] = (Color.blue(i2) * f) / 255.0f;
            fArr[(i * 4) + 3] = 255.0f;
        }
        this.a.put(fArr);
        this.a.position(0);
        invalidate();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void dispatchDraw() {
        setCustomShader(ShaderManager.SHADER_COLOR_TEXTURE);
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        boolean colorFillEnable = colorFillEnable();
        if (visible()) {
            if (colorFillEnable) {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.l.g.a().id);
            Collections.sort(this.i);
            c();
            for (int i = 0; i < 16; i++) {
                a aVar = this.i.get(i);
                MatrixStack.glPushMatrix();
                MatrixStack.glScalef((aVar.b / 10.0f) + 1.0f, aVar.b, 1.0f);
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                GLES20.glDrawArrays(4, aVar.d * 6, 6);
                MatrixStack.glPopMatrix();
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    private void c() {
        int size = this.h.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            a aVar = this.h.get(i);
            float abs = Math.abs(this.j - aVar.d) / 3.0f;
            if (abs > 1.0f) {
                abs = 1.0f;
            }
            aVar.a = 2.0f - abs;
            aVar.b += (aVar.a - aVar.b) * 0.4f;
            i++;
            z = aVar.b > 1.1f ? true : z;
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparable<a> {
        public float a = 1.0f;
        public float b = 1.0f;
        public int c = -1;
        public int d;

        public a(int i) {
            this.d = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            if (this.b != aVar.b) {
                return aVar.b > this.b ? -1 : 1;
            }
            return 0;
        }
    }
}
