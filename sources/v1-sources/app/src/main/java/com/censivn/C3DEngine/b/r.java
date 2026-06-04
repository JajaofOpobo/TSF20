package com.censivn.C3DEngine.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.Shader;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class r implements com.censivn.C3DEngine.g.b.a {
    protected static ad b;
    protected static z c;
    protected static int d = 0;
    public static boolean e = true;
    private Object A;
    private int B;
    private HashMap C;
    private com.censivn.C3DEngine.i.f D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private PositionNumber3d S;
    private Number3d T;
    private Number3d U;
    private Color4 V;
    private com.censivn.C3DEngine.i.g W;
    private float X;
    private boolean Y;
    private float Z;
    private String a;
    private boolean aa;
    private ab ab;
    private com.censivn.C3DEngine.d.b ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private Shader am;
    private l an;
    private float ao;
    private boolean ap;
    public float[] f;
    public float[] g;
    public float[] h;
    public float[] i;
    public float[] j;
    public float[] k;
    public float[] l;
    public float[] m;
    public float[] n;
    public com.censivn.C3DEngine.b.a.a o;
    public com.censivn.C3DEngine.b.a.a p;
    public com.censivn.C3DEngine.b.a.a q;
    public com.censivn.C3DEngine.b.a.a r;
    public com.censivn.C3DEngine.g.a.c s;
    protected af t;
    protected ac u;
    protected a v;
    protected boolean w;
    protected boolean x;
    boolean y;
    private VObject3d z;

    public r(int i, int i2, Boolean bool, Boolean bool2) {
        this.f = new float[4];
        this.g = new float[4];
        this.h = new float[4];
        this.i = new float[4];
        this.j = new float[16];
        this.k = new float[4];
        this.l = new float[4];
        this.m = new float[4];
        this.n = new float[4];
        this.o = new com.censivn.C3DEngine.b.a.a();
        this.p = new com.censivn.C3DEngine.b.a.a();
        this.q = new com.censivn.C3DEngine.b.a.a();
        this.r = new com.censivn.C3DEngine.b.a.a();
        this.D = com.censivn.C3DEngine.i.f.TRIANGLES;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = true;
        this.I = true;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = false;
        this.O = false;
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = new PositionNumber3d(0.0f, 0.0f, 0.0f);
        this.T = new Number3d(0.0f, 0.0f, 0.0f);
        this.U = new Number3d(1.0f, 1.0f, 1.0f);
        this.V = new Color4();
        this.W = com.censivn.C3DEngine.i.g.SMOOTH;
        this.X = 3.0f;
        this.Y = true;
        this.Z = 1.0f;
        this.aa = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.w = true;
        this.x = false;
        this.al = false;
        this.an = null;
        this.ao = 255.0f;
        this.y = false;
        this.ap = false;
        k();
        this.t = new af(i, bool, bool2);
        this.v = new a(i2);
        this.u = new ac();
    }

    public r(af afVar, a aVar, ac acVar) {
        this.f = new float[4];
        this.g = new float[4];
        this.h = new float[4];
        this.i = new float[4];
        this.j = new float[16];
        this.k = new float[4];
        this.l = new float[4];
        this.m = new float[4];
        this.n = new float[4];
        this.o = new com.censivn.C3DEngine.b.a.a();
        this.p = new com.censivn.C3DEngine.b.a.a();
        this.q = new com.censivn.C3DEngine.b.a.a();
        this.r = new com.censivn.C3DEngine.b.a.a();
        this.D = com.censivn.C3DEngine.i.f.TRIANGLES;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = true;
        this.I = true;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = false;
        this.O = false;
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = new PositionNumber3d(0.0f, 0.0f, 0.0f);
        this.T = new Number3d(0.0f, 0.0f, 0.0f);
        this.U = new Number3d(1.0f, 1.0f, 1.0f);
        this.V = new Color4();
        this.W = com.censivn.C3DEngine.i.g.SMOOTH;
        this.X = 3.0f;
        this.Y = true;
        this.Z = 1.0f;
        this.aa = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.w = true;
        this.x = false;
        this.al = false;
        this.an = null;
        this.ao = 255.0f;
        this.y = false;
        this.ap = false;
        k();
        this.t = afVar;
        this.v = aVar;
        this.u = acVar;
    }

    public final void a(VObject3d vObject3d) {
        this.z = vObject3d;
    }

    public final VObject3d r() {
        return this.z;
    }

    public final void a(Object obj) {
        this.A = obj;
    }

    public final Object s() {
        return this.A;
    }

    public final void b_(int i) {
        this.B = i;
    }

    public final int t() {
        return this.B;
    }

    public final void a(Object obj, Object obj2) {
        if (this.C == null) {
            this.C = new HashMap();
        }
        this.C.put(obj, obj2);
    }

    public final Object b(Object obj) {
        if (this.C == null) {
            return null;
        }
        return this.C.get(obj);
    }

    public static void u() {
        com.censivn.C3DEngine.a.d().g();
    }

    public final void v() {
        this.w = false;
    }

    public final void a_(boolean z) {
        this.x = z;
    }

    public final boolean w() {
        return this.x;
    }

    public final af x() {
        return this.t;
    }

    public final a y() {
        return this.v;
    }

    public final ac z() {
        return this.u;
    }

    public final boolean A() {
        return this.I;
    }

    public final void a(Boolean bool) {
        this.I = bool.booleanValue();
        com.censivn.C3DEngine.a.d().g();
    }

    public final boolean B() {
        return this.K;
    }

    public final void b(boolean z) {
        this.K = z;
        com.censivn.C3DEngine.a.d().g();
    }

    public final boolean C() {
        return this.L;
    }

    public final void b(Boolean bool) {
        this.L = bool.booleanValue();
        com.censivn.C3DEngine.a.d().g();
    }

    public final boolean D() {
        return this.N;
    }

    public final void c(boolean z) {
        this.N = z;
        com.censivn.C3DEngine.a.d().g();
    }

    public final PointBufferManager E() {
        return this.t.c();
    }

    public final UvBufferManager F() {
        return this.t.d();
    }

    public final boolean G() {
        return this.ak;
    }

    public void H() {
        d(true);
    }

    public final void d(boolean z) {
        if (!this.ak) {
            if (this.C != null) {
                this.C.clear();
            }
            this.C = null;
            this.A = null;
            if (this.t.c() != null) {
                this.t.c().clear();
            }
            if (this.t.d() != null) {
                this.t.d().clear();
            }
            if (this.t.e() != null) {
                this.t.e().clear();
            }
            if (this.u != null && z) {
                this.u.d();
            }
            Q();
            ac();
            this.ak = true;
        }
    }

    public final void a(float f) {
        this.ao = f;
    }

    public void b(float f) {
        this.ao = f;
        if (this instanceof v) {
            v vVar = (v) this;
            int size = vVar.aD().size();
            for (int i = 0; i < size; i++) {
                ((r) vVar.aD().get(i)).b(f);
            }
        }
    }

    public float I() {
        return this.ao;
    }

    public final Color4 J() {
        return this.V;
    }

    public final void a(Color4 color4) {
        this.V = color4;
        if (color4.r != 255 || color4.g != 255 || color4.b != 255 || color4.a != 255) {
            this.R = true;
        } else {
            this.R = false;
        }
        if (this instanceof v) {
            v vVar = (v) this;
            int size = vVar.aD().size();
            for (int i = 0; i < size; i++) {
                ((r) vVar.aD().get(i)).a(this.V.a, this.V.r, this.V.g, this.V.b);
            }
        }
        com.censivn.C3DEngine.a.d().g();
    }

    public final void a(int i, int i2, int i3, int i4) {
        a((short) i, (short) i2, (short) i3, (short) i4);
    }

    public void a(short s, short s2, short s3, short s4) {
        if (s2 != 255 || s3 != 255 || s4 != 255 || s != 255) {
            this.R = true;
        } else {
            this.R = false;
        }
        this.V.a = s;
        this.V.r = s2;
        this.V.g = s3;
        this.V.b = s4;
        if (this instanceof v) {
            v vVar = (v) this;
            int size = vVar.aD().size();
            for (int i = 0; i < size; i++) {
                ((r) vVar.aD().get(i)).a(s, s2, s3, s4);
            }
        }
        com.censivn.C3DEngine.a.d().g();
    }

    public final void K() {
        this.V.a = (short) 255;
        this.V.r = (short) 255;
        this.V.g = (short) 255;
        this.V.b = (short) 255;
        this.R = false;
        if (this instanceof v) {
            v vVar = (v) this;
            int size = vVar.aD().size();
            for (int i = 0; i < size; i++) {
                ((r) vVar.aD().get(i)).K();
            }
        }
        com.censivn.C3DEngine.a.d().g();
    }

    public final PositionNumber3d L() {
        return this.S;
    }

    public final Number3d M() {
        return this.T;
    }

    public final Number3d N() {
        return this.U;
    }

    public final String O() {
        return this.a;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final com.censivn.C3DEngine.d.b P() {
        return this.ac;
    }

    public final void Q() {
        if (this.ac != null) {
            this.ac.e(this);
        }
    }

    public final void a(com.censivn.C3DEngine.d.b bVar) {
        this.ac = bVar;
    }

    public final void a(ab abVar) {
        this.ab = abVar;
    }

    public final ab R() {
        return this.ab;
    }

    public void S() {
        if (this.I) {
            c();
            e();
            m_();
        }
    }

    public void f() {
        if (this.I) {
            c();
            e();
            m_();
        }
    }

    public void T() {
        if (this.I) {
            e();
        }
    }

    public final void a(Shader shader) {
        this.al = true;
        this.am = shader;
    }

    public final void U() {
        this.al = false;
        this.am = null;
    }

    public final boolean V() {
        return this.R;
    }

    public final void a(float[] fArr) {
        System.arraycopy(fArr, 0, this.j, 0, 16);
    }

    public final float[] W() {
        return this.j;
    }

    public final void X() {
        this.y = this.u.c() > 0;
    }

    public final void Y() {
        c.a(this);
        X();
        if (this.al) {
            ShaderManager.enableShader(this.am);
        } else if (this.R) {
            ShaderColor shaderColor = this.y ? ShaderManager.SHADER_COLOR_TEXTURE : ShaderManager.SHADER_COLOR;
            ShaderManager.enableShader(shaderColor);
            float f = this.ao / 255.0f;
            GLES20.glVertexAttrib4f(shaderColor.maColor4Handle, (this.V.r / 255.0f) * f, (this.V.g / 255.0f) * f, (this.V.b / 255.0f) * f, f);
        } else if (this.ao != 255.0f) {
            ShaderManager.enableShader(ShaderManager.SHADER_ALPHA);
            GLES20.glVertexAttrib1f(ShaderManager.SHADER_ALPHA.maAlphaHandle, this.ao / 255.0f);
        } else {
            ShaderManager.enableShader(ShaderManager.SHADER_STANDARD);
        }
        if (this.K) {
            GLES20.glDisable(2884);
        } else {
            GLES20.glEnable(2884);
        }
        g();
        h();
    }

    public void e() {
        c.a(this);
        X();
        if (this.al) {
            ShaderManager.enableShader(this.am);
        } else if (this.R) {
            ShaderColor shaderColor = this.y ? ShaderManager.SHADER_COLOR_TEXTURE : ShaderManager.SHADER_COLOR;
            ShaderManager.enableShader(shaderColor);
            float f = this.ao / 255.0f;
            GLES20.glVertexAttrib4f(shaderColor.maColor4Handle, (this.V.r / 255.0f) * f, (this.V.g / 255.0f) * f, (this.V.b / 255.0f) * f, f);
        } else if (this.ao != 255.0f) {
            ShaderManager.enableShader(ShaderManager.SHADER_ALPHA);
            GLES20.glVertexAttrib1f(ShaderManager.SHADER_ALPHA.maAlphaHandle, this.ao / 255.0f);
        } else {
            ShaderManager.enableShader(ShaderManager.SHADER_STANDARD);
        }
        if (this.K) {
            GLES20.glDisable(2884);
        } else {
            GLES20.glEnable(2884);
        }
        g();
        h();
    }

    public void Z() {
        MatrixStack.glTranslatef(this.S.x, this.S.y, this.S.z);
        MatrixStack.glRotatef(this.T.x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(this.T.y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(this.T.z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(this.U.x, this.U.y, this.U.y);
        k.a(MatrixStack.rMVPMatrix, MatrixStack.rSceneMatrix, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.j, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    public void g() {
        MatrixStack.glTranslatef(this.S.x, this.S.y, this.S.z);
        MatrixStack.glRotatef(this.T.x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(this.T.y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(this.T.z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(this.U.x, this.U.y, this.U.y);
        k.a(MatrixStack.rMVPMatrix, MatrixStack.rSceneMatrix, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.j, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    public void h() {
        int c2;
        int i = 0;
        if (ab()) {
            if (this.t.c().size() != 0) {
                if (this.ad == 0) {
                    aj();
                }
                if (this.y) {
                    i();
                }
                GLES20.glBindBuffer(34962, this.ad);
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(34963, this.ae);
                GLES20.glDrawElements(this.D.a(), this.ag, 5123, 0);
                GLES20.glBindBuffer(34963, 0);
            } else {
                return;
            }
        } else if (this.t.c().size() != 0) {
            if (this.y) {
                j();
            }
            this.t.c().buffer().position(0);
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, (Buffer) this.t.c().buffer());
            if (!this.N) {
                if (!this.v.d()) {
                    c2 = this.v.a();
                } else {
                    i = this.v.b() * 3;
                    c2 = this.v.c();
                }
                this.v.e().position(i);
                GLES20.glDrawElements(this.D.a(), c2 * 3, 5123, this.v.e());
            } else {
                GLES20.glDrawArrays(this.D.a(), 0, this.t.a());
            }
        } else {
            return;
        }
        GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
        GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
    }

    public final void aa() {
        int c2;
        int i = 0;
        if (ab()) {
            if (this.t.c().size() != 0) {
                if (this.ad == 0) {
                    aj();
                }
                if (this.y) {
                    i();
                }
                GLES20.glBindBuffer(34962, this.ad);
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(34963, this.ae);
                GLES20.glDrawElements(this.D.a(), this.ag, 5123, 0);
                GLES20.glBindBuffer(34963, 0);
            } else {
                return;
            }
        } else if (this.t.c().size() != 0) {
            if (this.y) {
                j();
            }
            this.t.c().buffer().position(0);
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, (Buffer) this.t.c().buffer());
            if (!this.N) {
                if (!this.v.d()) {
                    c2 = this.v.a();
                } else {
                    i = this.v.b() * 3;
                    c2 = this.v.c();
                }
                this.v.e().position(i);
                GLES20.glDrawElements(this.D.a(), c2 * 3, 5123, this.v.e());
            } else {
                GLES20.glDrawArrays(this.D.a(), 0, this.t.a());
            }
        } else {
            return;
        }
        GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
        GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
    }

    private void i() {
        GLES20.glActiveTexture(33984);
        if (this.t.b() && this.L && this.u.c() > 0) {
            TextureDescription a = this.u.a(0);
            if (a != null) {
                GLES20.glBindTexture(3553, a.textureElement.id);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
            if (this.af != 0) {
                GLES20.glBindBuffer(34962, this.af);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, 0);
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
                return;
            }
            return;
        }
        GLES20.glBindTexture(3553, 0);
    }

    private void j() {
        GLES20.glActiveTexture(33984);
        if (this.t.b() && this.L && this.u.c() > 0) {
            TextureDescription a = this.u.a(0);
            if (a != null) {
                GLES20.glBindTexture(3553, a.textureElement.id);
                if (a.offsetU == 0.0f) {
                    float f = a.offsetV;
                }
            } else {
                GLES20.glBindTexture(3553, 0);
            }
            this.t.d().buffer().position(0);
            GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.t.d().buffer());
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            return;
        }
        GLES20.glBindTexture(3553, 0);
    }

    public final boolean ab() {
        return this.H && e;
    }

    public final void c(Boolean bool) {
        this.H = bool.booleanValue();
    }

    private void k() {
        this.ad = 0;
        this.ae = 0;
        this.af = 0;
    }

    public final void ac() {
        if (this.ad != 0) {
            d--;
            int[] iArr = {this.ad};
            GLES20.glDeleteBuffers(1, iArr, 0);
            iArr[0] = this.ae;
            GLES20.glDeleteBuffers(1, iArr, 0);
            if (this.af != 0) {
                iArr[0] = this.af;
                GLES20.glDeleteBuffers(1, iArr, 0);
            }
            k();
        }
    }

    public final void ad() {
        if (!this.ah) {
            this.ah = true;
            com.censivn.C3DEngine.a.a().c(new s(this));
        }
    }

    public final void ae() {
        if (!this.ai) {
            this.ai = true;
            com.censivn.C3DEngine.a.a().c(new t(this));
        }
    }

    public final void af() {
        if (!this.aj) {
            this.aj = true;
            com.censivn.C3DEngine.a.a().c(new u(this));
        }
    }

    public final void ag() {
        this.t.c().buffer().position(0);
        GLES20.glBindBuffer(34962, this.ad);
        GLES20.glBufferData(34962, this.t.c().buffer().capacity() * 4, this.t.c().buffer(), 35044);
        com.censivn.C3DEngine.a.d().g();
        this.ah = false;
    }

    public final void ah() {
        this.t.d().buffer().position(0);
        GLES20.glBindBuffer(34962, this.af);
        try {
            GLES20.glBufferData(34962, this.t.d().buffer().capacity() * 4, this.t.d().buffer(), 35044);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.censivn.C3DEngine.a.d().g();
        this.ai = false;
    }

    public final void ai() {
        int b2;
        if (!this.v.d()) {
            this.v.a();
            b2 = 0;
        } else {
            b2 = this.v.b() * 3;
            this.v.c();
        }
        this.ag = this.v.e().limit();
        GLES20.glBindBuffer(34963, this.ae);
        this.v.e().position(b2);
        GLES20.glBufferData(34963, this.v.e().capacity() * 2, this.v.e(), 35044);
        com.censivn.C3DEngine.a.d().g();
        this.aj = false;
    }

    public final void aj() {
        if (this.ad == 0) {
            d++;
            int[] iArr = new int[1];
            GLES20.glGenBuffers(1, iArr, 0);
            this.ad = iArr[0];
            ag();
            if (this.t.b() && this.L) {
                GLES20.glGenBuffers(1, iArr, 0);
                this.af = iArr[0];
                ah();
            }
            GLES20.glGenBuffers(1, iArr, 0);
            this.ae = iArr[0];
            ai();
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindBuffer(34963, 0);
        }
    }

    public final Number3d a(Number3d number3d) {
        while (true) {
            Number3d number3d2 = this.T;
            number3d.x += number3d2.x;
            number3d.y += number3d2.y;
            number3d.z = number3d2.z + number3d.z;
            Object obj = this.ac;
            if (obj == null || (obj instanceof ab)) {
                break;
            }
            this = (r) obj;
        }
        return number3d;
    }

    public final Number3d b(Number3d number3d) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(this);
            Object obj = this.ac;
            if (obj == null || (obj instanceof ab)) {
                break;
            }
            this = (r) obj;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Number3d number3d2 = ((r) arrayList.get(size)).T;
            number3d.x -= number3d2.x;
            number3d.y -= number3d2.y;
            number3d.z -= number3d2.z;
        }
        return number3d;
    }

    public final Number3d c(Number3d number3d) {
        while (true) {
            PositionNumber3d positionNumber3d = this.S;
            number3d.rotateAll(this.T);
            number3d.x += positionNumber3d.x;
            number3d.y += positionNumber3d.y;
            number3d.z = positionNumber3d.z + number3d.z;
            Object obj = this.ac;
            if (obj == null || (obj instanceof ab)) {
                break;
            }
            this = (r) obj;
        }
        return number3d;
    }

    public final Number3d d(Number3d number3d) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(this);
            Object obj = this.ac;
            if (obj == null || (obj instanceof ab)) {
                break;
            }
            this = (r) obj;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            PositionNumber3d positionNumber3d = ((r) arrayList.get(size)).S;
            number3d.x -= positionNumber3d.x;
            number3d.y -= positionNumber3d.y;
            number3d.z -= positionNumber3d.z;
            number3d.rotateReverseAll(((r) arrayList.get(size)).T);
        }
        return number3d;
    }

    public final void ak() {
        this.ap = true;
    }

    public boolean b(float f, float f2) {
        if (this.z != null) {
            return this.z.calTouchCollision(f, f2);
        }
        if (this.F) {
            ar();
        }
        k.a(this.f, this.j, this.k);
        k.a(this.g, this.j, this.l);
        k.a(this.h, this.j, this.m);
        k.a(this.i, this.j, this.n);
        float f3 = (this.f[0] / this.f[3]) * com.censivn.C3DEngine.a.n;
        float f4 = (this.f[1] / this.f[3]) * com.censivn.C3DEngine.a.o;
        float f5 = (this.g[0] / this.g[3]) * com.censivn.C3DEngine.a.n;
        float f6 = (this.g[1] / this.g[3]) * com.censivn.C3DEngine.a.o;
        float f7 = (this.h[0] / this.h[3]) * com.censivn.C3DEngine.a.n;
        float f8 = (this.h[1] / this.h[3]) * com.censivn.C3DEngine.a.o;
        float f9 = (this.i[0] / this.i[3]) * com.censivn.C3DEngine.a.n;
        float f10 = (this.i[1] / this.i[3]) * com.censivn.C3DEngine.a.o;
        this.o.a(f - f3, f2 - f4);
        this.p.a(f - f5, f2 - f6);
        this.q.a(f - f7, f2 - f8);
        this.r.a(f - f9, f2 - f10);
        float a = com.censivn.C3DEngine.b.a.a.a(this.o, this.p);
        float a2 = com.censivn.C3DEngine.b.a.a.a(this.p, this.q);
        float a3 = com.censivn.C3DEngine.b.a.a.a(this.q, this.o);
        if (a < 0.0f && a2 < 0.0f && a3 < 0.0f) {
            return true;
        }
        if (this.ap && a > 0.0f && a2 > 0.0f && a3 > 0.0f) {
            return true;
        }
        float a4 = com.censivn.C3DEngine.b.a.a.a(this.p, this.q);
        float a5 = com.censivn.C3DEngine.b.a.a.a(this.q, this.r);
        float a6 = com.censivn.C3DEngine.b.a.a.a(this.r, this.p);
        if (a4 <= 0.0f || a5 <= 0.0f || a6 <= 0.0f) {
            return this.ap && a4 < 0.0f && a5 < 0.0f && a6 < 0.0f;
        }
        return true;
    }

    public final void a(float f, float f2, float f3, float f4, float f5) {
        float f6 = f * com.censivn.C3DEngine.a.a;
        float f7 = f2 * com.censivn.C3DEngine.a.a;
        float f8 = f3 * com.censivn.C3DEngine.a.a;
        float f9 = f4 * com.censivn.C3DEngine.a.a;
        float f10 = f5 * com.censivn.C3DEngine.a.a;
        float f11 = com.censivn.C3DEngine.a.a;
        b(f6, f7, f8, f9, f10);
    }

    public final void b(float f, float f2, float f3, float f4, float f5) {
        this.k[0] = f;
        this.k[1] = f5;
        this.k[2] = f3;
        this.k[3] = 1.0f;
        this.l[0] = f4;
        this.l[1] = f5;
        this.l[2] = f3;
        this.l[3] = 1.0f;
        this.m[0] = f;
        this.m[1] = f2;
        this.m[2] = f3;
        this.m[3] = 1.0f;
        this.n[0] = f4;
        this.n[1] = f2;
        this.n[2] = f3;
        this.n[3] = 1.0f;
    }

    public final void c(r rVar) {
        this.k[0] = rVar.k[0];
        this.k[1] = rVar.k[1];
        this.k[2] = rVar.k[2];
        this.k[3] = rVar.k[3];
        this.l[0] = rVar.l[0];
        this.l[1] = rVar.l[1];
        this.l[2] = rVar.l[2];
        this.l[3] = rVar.l[3];
        this.m[0] = rVar.m[0];
        this.m[1] = rVar.m[1];
        this.m[2] = rVar.m[2];
        this.m[3] = rVar.m[3];
        this.n[0] = rVar.n[0];
        this.n[1] = rVar.n[1];
        this.n[2] = rVar.n[2];
        this.n[3] = rVar.n[3];
    }

    public final float al() {
        return this.k[0];
    }

    public final void c(float f) {
        this.k[0] = f;
        this.m[0] = f;
    }

    public final float am() {
        return this.m[1];
    }

    public final void d(float f) {
        this.m[1] = f;
        this.n[1] = f;
    }

    public final float an() {
        return this.k[2];
    }

    public final float ao() {
        return this.l[0];
    }

    public final void e(float f) {
        this.l[0] = f;
        this.n[0] = f;
    }

    public final float ap() {
        return this.k[1];
    }

    public final void f(float f) {
        this.k[1] = f;
        this.l[1] = f;
    }

    public final float aq() {
        return this.k[2];
    }

    public final void a(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float min;
        float min2;
        float min3;
        float max;
        float max2;
        float max3;
        int i = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        if (this instanceof v) {
            i = ((v) this).aD().size();
        }
        if (i > 0) {
            v vVar = (v) this;
            int size = vVar.aD().size();
            int i2 = 0;
            float f14 = 0.0f;
            while (i2 < size) {
                r rVar = (r) vVar.aD().get(i2);
                rVar.ar();
                float min4 = Math.min(f9, rVar.k[0] + rVar.S.x);
                float min5 = Math.min(f10, rVar.m[1] + rVar.S.y);
                float min6 = Math.min(f11, rVar.k[2] + rVar.S.z);
                float max4 = Math.max(f12, rVar.l[0] + rVar.S.x);
                float max5 = Math.max(f13, rVar.k[1] + rVar.S.y);
                i2++;
                f14 = Math.max(f14, rVar.S.z + rVar.k[2]);
                f13 = max5;
                f12 = max4;
                f11 = min6;
                f10 = min5;
                f9 = min4;
            }
            f4 = f13;
            f5 = f9;
            f8 = f10;
            float f15 = f11;
            f6 = f12;
            f7 = f15;
        } else {
            int size2 = this.t.c().size();
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            f4 = 0.0f;
            float f19 = 0.0f;
            float f20 = 0.0f;
            int i3 = 0;
            while (i3 < size2) {
                Number3d asNumber3dPX = this.t.c().getAsNumber3dPX(i3);
                if (i3 == 0) {
                    max = asNumber3dPX.x;
                    max2 = asNumber3dPX.y;
                    max3 = asNumber3dPX.z;
                    min3 = max3;
                    min2 = max2;
                    min = max;
                } else {
                    min = Math.min(f20, asNumber3dPX.x);
                    min2 = Math.min(f18, asNumber3dPX.y);
                    min3 = Math.min(f19, asNumber3dPX.z);
                    max = Math.max(f17, asNumber3dPX.x);
                    max2 = Math.max(f4, asNumber3dPX.y);
                    max3 = Math.max(f16, asNumber3dPX.z);
                }
                i3++;
                f16 = max3;
                f4 = max2;
                f17 = max;
                f19 = min3;
                f18 = min2;
                f20 = min;
            }
            float f21 = f17;
            f5 = f20;
            f6 = f21;
            float f22 = f18;
            f7 = f19;
            f8 = f22;
        }
        b(f5 * f, f8 * f2, f7 * f3, f6 * f, f4 * f2);
    }

    public void ar() {
        a(1.0f, 1.0f, 1.0f);
    }

    public final void as() {
        this.F = true;
    }

    public final boolean at() {
        return this.F;
    }

    public final void e(boolean z) {
        this.E = z;
    }

    public final boolean au() {
        return this.E;
    }

    public final void f(boolean z) {
        this.G = z;
    }

    public final boolean av() {
        return this.G;
    }

    public final void a(l lVar) {
        this.an = lVar;
    }

    public l aw() {
        return this.an;
    }

    public final r a(float f, float f2, boolean z) {
        if (!this.I) {
            return null;
        }
        if (!z) {
            if (b(f, f2)) {
                return this;
            }
            return null;
        }
        if (!(this instanceof v)) {
            return null;
        }
        v vVar = (v) this;
        for (int size = vVar.aD().size() - 1; size >= 0; size--) {
            r a = ((r) vVar.aD().get(size)).a(f, f2, false);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public r b(float f, float f2, boolean z) {
        if (!this.E || !this.I) {
            return null;
        }
        if ((aw() != null || (this instanceof com.censivn.C3DEngine.e.a.a)) && !this.G && !z) {
            if (b(f, f2)) {
                return this;
            }
            return null;
        }
        if (!(this instanceof v)) {
            return null;
        }
        v vVar = (v) this;
        if (this instanceof com.tsf.shell.workspace3D.g.c.o) {
            com.tsf.shell.workspace3D.g.c.o oVar = (com.tsf.shell.workspace3D.g.c.o) this;
            for (int size = oVar.aQ().size() - 1; size >= 0; size--) {
                r b2 = ((com.tsf.shell.workspace3D.g.c.q) oVar.aQ().get(size)).a.b(f, f2, false);
                if (b2 != null) {
                    return b2;
                }
                r b3 = ((com.tsf.shell.workspace3D.g.c.q) oVar.aQ().get(size)).b.b(f, f2, false);
                if (b3 != null) {
                    return b3;
                }
            }
        }
        for (int size2 = vVar.aD().size() - 1; size2 >= 0; size2--) {
            r b4 = ((r) vVar.aD().get(size2)).b(f, f2, false);
            if (b4 != null) {
                return b4;
            }
        }
        return null;
    }

    public final void ax() {
        if (this.ac != null) {
            com.censivn.C3DEngine.d.b bVar = this.ac;
            bVar.e(this);
            bVar.d(this);
        }
    }

    public final void b(float f, float f2, float f3) {
        c(com.censivn.C3DEngine.a.a * f, com.censivn.C3DEngine.a.a * f2, com.censivn.C3DEngine.a.a * f3);
    }

    public final void c(float f, float f2, float f3) {
        int size = this.t.c().size();
        Number3d number3d = new Number3d(f, f2, f3);
        for (int i = 0; i < size; i++) {
            Number3d asNumber3dPX = this.t.c().getAsNumber3dPX(i);
            asNumber3dPX.add(number3d);
            this.t.c().setPX(i, asNumber3dPX);
        }
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.g.b.a
    public final com.censivn.C3DEngine.g.a.c ay() {
        return this.s;
    }

    @Override // com.censivn.C3DEngine.g.b.a
    public final void a(com.censivn.C3DEngine.g.a.c cVar) {
        this.s = cVar;
    }

    public void az() {
        if (aw() != null) {
            m.d().a(aw());
        }
    }

    public void aA() {
        m.d().a((l) null);
    }

    public void k_() {
    }

    public void l_() {
    }

    protected void c() {
    }

    protected void m_() {
    }
}
