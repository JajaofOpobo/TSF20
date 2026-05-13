package com.tsf.shell.widget.cubeclock.p208a;

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
import com.tsf.shell.widget.cubeclock.C4382c;
import com.tsf.shell.widget.cubeclock.C4390j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
/* renamed from: com.tsf.shell.widget.cubeclock.a.b */
/* loaded from: classes.dex */
public class C4378b extends VObject3dContainer {

    /* renamed from: a */
    protected FloatBuffer f14165a;

    /* renamed from: b */
    protected FloatBuffer f14166b;

    /* renamed from: c */
    protected FloatBuffer f14167c;

    /* renamed from: l */
    private C4382c f14176l;

    /* renamed from: g */
    private int f14171g = 96;

    /* renamed from: d */
    public int f14168d = 0;

    /* renamed from: e */
    public int f14169e = 0;

    /* renamed from: h */
    private ArrayList<C4379a> f14172h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C4379a> f14173i = new ArrayList<>();

    /* renamed from: f */
    public int[] f14170f = {-8319731, -62196, -1609171, -536534, -13607043, -13667434, -13521439, -5315356, -16306422, -15901936, -15947500, -9712101, -15462385, -14540254, -13421773, -10066330};

    /* renamed from: j */
    private float f14174j = -5.0f;

    /* renamed from: k */
    private int f14175k = -13421773;

    /* renamed from: m */
    private float f14177m = 1.0f;

    public C4378b(C4382c c4382c) {
        this.f14176l = c4382c;
        this.f14176l.f14195c.addObject(this);
        scale().f2526x = this.f14176l.f14208p;
        scale().f2527y = this.f14176l.f14208p;
        scale().f2528z = this.f14176l.f14208p;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f14171g * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f14166b = allocateDirect.asFloatBuffer();
        this.f14166b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f14171g * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f14167c = allocateDirect2.asFloatBuffer();
        this.f14167c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f14171g * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f14165a = allocateDirect3.asFloatBuffer();
        this.f14165a.position(0);
        m90b();
        setMouseEventListener(new C4380b(this));
        setAABBSP(((-588.0f) / this.f14176l.f14206n) / 2.0f, ((-144.0f) / this.f14176l.f14206n) / 2.0f, 0.0f, (588.0f / this.f14176l.f14206n) / 2.0f, (144.0f / this.f14176l.f14206n) / 2.0f, 0.0f);
    }

    /* renamed from: com.tsf.shell.widget.cubeclock.a.b$b */
    /* loaded from: classes.dex */
    class C4380b extends VMouseEventListener {

        /* renamed from: a */
        Number3d f14183a;

        /* renamed from: c */
        private float f14185c;

        /* renamed from: d */
        private float f14186d;

        public C4380b(VObject3d vObject3d) {
            super(vObject3d);
            this.f14183a = new Number3d(0.0f, 0.0f, 0.0f);
            this.f14185c = 416.0f * C4378b.this.f14176l.f14208p;
            this.f14186d = this.f14185c / 2.0f;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            C4390j.m53a("onDown" + motionEvent.getX());
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Number3d m84a = m84a(motionEvent2);
            C4378b.this.f14174j = m85a(m84a.f2526x);
            C4378b.this.m94a((int) Math.floor(C4378b.this.f14174j));
            C4378b.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            Number3d m84a = m84a(motionEvent);
            C4378b.this.f14174j = m85a(m84a.f2526x);
            C4378b.this.m94a((int) Math.floor(C4378b.this.f14174j));
            C4378b.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            C4378b.this.f14174j = -5.0f;
        }

        /* renamed from: a */
        private Number3d m84a(MotionEvent motionEvent) {
            this.f14183a.f2526x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.f14183a.f2527y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.f14183a.f2528z = 0.0f;
            return C4378b.this.globalToLocal(this.f14183a);
        }

        /* renamed from: a */
        private float m85a(float f) {
            float f2 = ((this.f14186d + f) / this.f14185c) * 16.0f;
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
    /* renamed from: a */
    public void m94a(int i) {
        this.f14175k = this.f14170f[i];
        this.f14175k = m89b(this.f14175k);
        this.f14176l.f14199g.m43a(this.f14175k);
    }

    /* renamed from: a */
    public int m96a() {
        return this.f14175k;
    }

    /* renamed from: b */
    private int m89b(int i) {
        return Color.argb(255, (int) (Color.red(i) * this.f14177m), (int) (Color.green(i) * this.f14177m), (int) (Color.blue(i) * this.f14177m));
    }

    /* renamed from: b */
    private void m90b() {
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
            C4379a c4379a = new C4379a(i);
            this.f14172h.add(c4379a);
            this.f14173i.add(c4379a);
            this.f14166b.put(fArr);
            for (int i2 = 0; i2 < 6; i2++) {
                int i3 = i2 * 3;
                fArr[i3] = fArr[i3] + 26.0f;
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f14167c.put(this.f14176l.f14199g.m41b());
        }
        m95a(1.0f);
        this.f14166b.position(0);
        this.f14167c.position(0);
    }

    /* renamed from: a */
    public void m95a(float f) {
        this.f14177m = f;
        this.f14165a.position(0);
        float[] fArr = new float[this.f14171g * 4];
        for (int i = 0; i < this.f14171g; i++) {
            int i2 = this.f14170f[i / 6];
            fArr[(i * 4) + 0] = (Color.red(i2) * f) / 255.0f;
            fArr[(i * 4) + 1] = (Color.green(i2) * f) / 255.0f;
            fArr[(i * 4) + 2] = (Color.blue(i2) * f) / 255.0f;
            fArr[(i * 4) + 3] = 255.0f;
        }
        this.f14165a.put(fArr);
        this.f14165a.position(0);
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
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f14167c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f14166b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f14167c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f14166b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.f14165a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f14176l.f14199g.mo17a().f2529id);
            Collections.sort(this.f14173i);
            m87c();
            for (int i = 0; i < 16; i++) {
                C4379a c4379a = this.f14173i.get(i);
                MatrixStack.glPushMatrix();
                MatrixStack.glScalef((c4379a.f14179b / 10.0f) + 1.0f, c4379a.f14179b, 1.0f);
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                GLES20.glDrawArrays(4, c4379a.f14181d * 6, 6);
                MatrixStack.glPopMatrix();
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: c */
    private void m87c() {
        int size = this.f14172h.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            C4379a c4379a = this.f14172h.get(i);
            float abs = Math.abs(this.f14174j - c4379a.f14181d) / 3.0f;
            if (abs > 1.0f) {
                abs = 1.0f;
            }
            c4379a.f14178a = 2.0f - abs;
            c4379a.f14179b += (c4379a.f14178a - c4379a.f14179b) * 0.4f;
            i++;
            z = c4379a.f14179b > 1.1f ? true : z;
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.cubeclock.a.b$a */
    /* loaded from: classes.dex */
    public class C4379a implements Comparable<C4379a> {

        /* renamed from: a */
        public float f14178a = 1.0f;

        /* renamed from: b */
        public float f14179b = 1.0f;

        /* renamed from: c */
        public int f14180c = -1;

        /* renamed from: d */
        public int f14181d;

        public C4379a(int i) {
            this.f14181d = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C4379a c4379a) {
            if (this.f14179b != c4379a.f14179b) {
                return c4379a.f14179b > this.f14179b ? -1 : 1;
            }
            return 0;
        }
    }
}
