package com.tsf.shell.p096f.p153i;

import android.content.ContentValues;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p030a.C0863c;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p187r.C3613a;
import com.tsf.shell.p091b.C2224a;
import com.tsf.shell.p096f.p118e.C2448a;
import com.tsf.shell.p096f.p118e.C2463b;
import com.tsf.shell.p096f.p118e.C2656s;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.b */
/* loaded from: classes.dex */
public class C3112b extends C0980j implements InterfaceC2557f {

    /* renamed from: a */
    private ItemInfo f10104a;

    /* renamed from: e */
    protected C0967a f10108e;

    /* renamed from: j */
    private InterfaceC2557f f10113j;

    /* renamed from: m */
    private int f10116m;

    /* renamed from: q */
    private C3105a f10120q;

    /* renamed from: r */
    private boolean f10121r;

    /* renamed from: b */
    private boolean f10105b = true;

    /* renamed from: f */
    private boolean f10109f = false;

    /* renamed from: g */
    private boolean f10110g = false;

    /* renamed from: h */
    private boolean f10111h = false;

    /* renamed from: i */
    private boolean f10112i = true;

    /* renamed from: k */
    private boolean f10114k = false;

    /* renamed from: c */
    public boolean f10106c = false;

    /* renamed from: d */
    public float f10107d = 1.0f;

    /* renamed from: l */
    private boolean f10115l = false;

    /* renamed from: n */
    private boolean f10117n = false;

    /* renamed from: o */
    private float f10118o = 1.0f;

    /* renamed from: p */
    private float f10119p = 0.0f;

    /* renamed from: s */
    private boolean f10122s = true;

    /* renamed from: t */
    private float f10123t = 0.4f;

    /* renamed from: u */
    private float f10124u = 1.6f;

    /* renamed from: v */
    private boolean f10125v = false;

    /* renamed from: w */
    private boolean f10126w = true;

    /* renamed from: x */
    private boolean f10127x = false;

    /* renamed from: y */
    private boolean f10128y = false;

    /* renamed from: com.tsf.shell.f.i.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3116a {
    }

    public C3112b(ItemInfo itemInfo) {
        this.f10104a = itemInfo;
        if (itemInfo != null) {
            itemInfo.setWidget(this);
        }
    }

    /* renamed from: r */
    public String mo3100r() {
        return "";
    }

    /* renamed from: s */
    public long mo3098s() {
        return 0L;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void parent(InterfaceC0972f interfaceC0972f) {
        super.parent(interfaceC0972f);
        m3512b(0.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        super.destroy();
        this.f10117n = true;
    }

    /* renamed from: t */
    public boolean m3492t() {
        return this.f10117n;
    }

    /* renamed from: a */
    public void m3519a(float f) {
        this.f10118o = f;
    }

    /* renamed from: u */
    public float m3491u() {
        return this.f10118o;
    }

    /* renamed from: v */
    public float m3490v() {
        return maxX() - minX();
    }

    /* renamed from: w */
    public float m3489w() {
        return maxY() - minY();
    }

    /* renamed from: b */
    public void m3512b(float f) {
        this.f10119p = f;
    }

    /* renamed from: x */
    public float m3488x() {
        return this.f10119p;
    }

    /* renamed from: y */
    public void m3487y() {
        this.f10119p = 0.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void superDrawMVPMatrix() {
        MatrixStack.glTranslatef(position().f2526x, position().f2527y, position().f2528z);
        MatrixStack.glRotatef(rotation().f2526x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(rotation().f2527y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(rotation().f2528z + this.f10119p, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(scale().f2526x * this.f10118o, scale().f2527y * this.f10118o, scale().f2527y * this.f10118o);
        C0863c.m10829a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void drawMVPMatrix() {
        MatrixStack.glTranslatef(position().f2526x, position().f2527y, position().f2528z);
        MatrixStack.glRotatef(rotation().f2526x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(rotation().f2527y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(rotation().f2528z + this.f10119p, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(scale().f2526x * this.f10118o, scale().f2527y * this.f10118o, scale().f2527y * this.f10118o);
        C0863c.m10829a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    /* renamed from: z */
    public C2932g m3486z() {
        if (m3541A() != null && (m3541A().m3567b() instanceof C2932g)) {
            return (C2932g) m3541A().m3567b();
        }
        return null;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean calTouchCollision(float f, float f2) {
        if ((this instanceof AbstractC3208b) || !C3359a.f11094h.m4021s().m3938a()) {
            if (m3486z() != null) {
                C2932g m3486z = m3486z();
                if (m3486z == null || Math.abs(m3486z.f9541g) <= 0.03d) {
                    return super.calTouchCollision(f, f2);
                }
                return false;
            }
            return super.calTouchCollision(f, f2);
        }
        return false;
    }

    /* renamed from: a */
    public void mo3439a(float f, float f2) {
    }

    /* renamed from: A */
    public C3105a m3541A() {
        return this.f10120q;
    }

    /* renamed from: a */
    public void mo3462a(C3105a c3105a) {
        this.f10120q = c3105a;
    }

    /* renamed from: B */
    public void m3540B() {
        this.f10120q = null;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onKillFocus() {
        super.onKillFocus();
        if (this.f10121r) {
            C2448a.m5533b();
        }
    }

    /* renamed from: C */
    public void mo3118C() {
        if (this.f10120q != null) {
            this.f10120q.mo3300b(this);
        }
    }

    /* renamed from: c */
    public void m3509c(boolean z) {
        this.f10121r = z;
    }

    /* renamed from: c */
    public void m3510c(float f) {
        this.f10107d = f;
    }

    /* renamed from: D */
    public boolean m3539D() {
        return this.f10121r;
    }

    /* renamed from: E */
    public void mo3465E() {
        C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.i.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3112b.this.f10108e == null) {
                    C3112b.this.f10108e = C2463b.m5512a((int) ((-this.minX()) + this.maxX() + (C0892a.f2566b * 10.0f)), (int) ((-this.minY()) + this.maxY() + (C0892a.f2566b * 10.0f)));
                    C3112b.this.f10108e.useVBO(false);
                    C3112b.this.f10108e.textures().addElement(C2463b.f8098h);
                    C3112b.this.f10108e.position().f2527y = (this.minY() + this.maxY()) / 2.0f;
                    this.addChild(C3112b.this.f10108e);
                }
            }
        });
    }

    /* renamed from: F */
    public void mo3464F() {
        C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.i.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3112b.this.f10108e != null) {
                    C3112b.this.f10108e.textures().removeAll();
                    C3112b.this.f10108e.removeFromParent();
                    C3112b.this.f10108e.destroy();
                    C3112b.this.f10108e = null;
                }
            }
        });
    }

    /* renamed from: G */
    public void m3538G() {
        m3507d(true);
    }

    /* renamed from: d */
    public void m3507d(final boolean z) {
        int i;
        if (rotation().f2528z % 360.0f != 0.0f) {
            int abs = Math.abs(((int) rotation().f2528z) / 360);
            if (rotation().f2528z > 0.0f) {
                int i2 = abs * 360;
                i = (abs + 1) * 360;
                if (rotation().f2528z - i2 <= i - rotation().f2528z) {
                    i = i2;
                }
            } else {
                int i3 = (-abs) * 360;
                i = (-(abs + 1)) * 360;
                if (i3 - rotation().f2528z <= rotation().f2528z - i) {
                    i = i3;
                }
            }
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    this.rotation().f2528z = 0.0f;
                    if (z) {
                        C3112b.this.m3514ad();
                    }
                }
            };
            c1017d.m10303e(i);
            C1014c.m10325a(this, 250, c1017d);
        }
    }

    /* renamed from: H */
    public void m3537H() {
        C2448a.m5535a(this);
    }

    /* renamed from: I */
    public void m3536I() {
        if (this.f10121r) {
            C2448a.m5533b();
        }
    }

    /* renamed from: a */
    public void m3518a(int i) {
        this.f10116m = i;
    }

    /* renamed from: J */
    public int m3535J() {
        return this.f10116m;
    }

    /* renamed from: a */
    public void mo3117a(ItemInfo itemInfo) {
        this.f10104a = itemInfo;
    }

    /* renamed from: K */
    public ItemInfo m3534K() {
        return this.f10104a;
    }

    /* renamed from: L */
    public boolean m3533L() {
        return this.f10114k;
    }

    /* renamed from: e */
    public void m3505e(boolean z) {
        this.f10105b = z;
    }

    /* renamed from: M */
    public boolean m3532M() {
        return this.f10105b;
    }

    /* renamed from: N */
    public void m3531N() {
        this.f10115l = true;
    }

    /* renamed from: O */
    public boolean m3530O() {
        return this.f10115l;
    }

    /* renamed from: P */
    public void m3529P() {
        this.f10115l = false;
    }

    /* renamed from: f */
    public void m3503f(boolean z) {
        this.f10109f = z;
    }

    /* renamed from: Q */
    public boolean m3528Q() {
        return this.f10109f;
    }

    /* renamed from: g */
    public void m3501g(boolean z) {
        this.f10110g = z;
    }

    /* renamed from: R */
    public boolean m3527R() {
        return this.f10110g;
    }

    /* renamed from: h */
    public void m3499h(boolean z) {
        this.f10126w = z;
    }

    /* renamed from: S */
    public boolean m3526S() {
        return this.f10126w;
    }

    /* renamed from: T */
    public boolean m3525T() {
        return this.f10122s;
    }

    /* renamed from: i */
    public void m3498i(boolean z) {
        this.f10122s = z;
    }

    /* renamed from: d */
    public void m3508d(float f) {
        this.f10123t = f;
    }

    /* renamed from: e */
    public void m3506e(float f) {
        this.f10124u = f;
    }

    /* renamed from: U */
    public float m3524U() {
        return this.f10123t;
    }

    /* renamed from: V */
    public float m3523V() {
        return this.f10124u;
    }

    /* renamed from: W */
    public void mo3471W() {
        this.f10125v = true;
    }

    /* renamed from: X */
    public void mo3440X() {
        this.f10125v = false;
        m3514ad();
    }

    /* renamed from: Y */
    public boolean m3522Y() {
        return this.f10125v;
    }

    /* renamed from: Z */
    public void m3521Z() {
        if (m3525T()) {
            C2656s.m5047a(this);
        }
    }

    /* renamed from: aa */
    public void mo3078aa() {
        if (m3525T()) {
            C2656s.m5049a();
        }
        if (this.f10121r) {
            C2448a.m5533b();
        }
    }

    /* renamed from: b_ */
    public void mo3511b_() {
    }

    /* renamed from: n_ */
    public void mo3052n_() {
        this.f10128y = true;
        setAnimationObjectState(true);
        m3521Z();
        C2224a.m6053a("WidgetContainer", "onDragStart");
    }

    /* renamed from: ab */
    public void mo3077ab() {
        if (m3525T()) {
            C2656s.m5049a();
        }
    }

    /* renamed from: m_ */
    public void mo3053m_() {
        this.f10128y = false;
        C2224a.m6053a("WidgetContainer", "onDragRelease");
    }

    /* renamed from: c */
    public void mo3056c() {
        this.f10128y = false;
        setAnimationObjectState(false);
        if (!this.f10127x) {
            m3514ad();
        }
        C2224a.m6053a("WidgetContainer", "onDragEnd");
    }

    /* renamed from: ac */
    public boolean mo3458ac() {
        ItemInfo m3534K = m3534K();
        if (C0892a.f2564O) {
            position().f2526x = m3534K.cellX;
            position().f2527y = m3534K.cellY;
            rotation().f2528z = m3534K.rotation;
            m3519a(m3534K.scale);
        } else {
            position().f2526x = m3534K.cellXH;
            position().f2527y = m3534K.cellYH;
            rotation().f2528z = m3534K.rotationH;
            m3519a(m3534K.scaleH);
        }
        float[] m1891a = C3613a.m1891a(this, position().f2526x, position().f2527y);
        if (m1891a[0] == position().f2526x && m1891a[1] == position().f2527y) {
            return false;
        }
        position().f2526x = m1891a[0];
        position().f2527y = m1891a[1];
        return true;
    }

    /* renamed from: ad */
    public void m3514ad() {
        if (m3534K() != null) {
            ContentValues contentValues = new ContentValues();
            m3534K().onUpdateLayoutInformation(contentValues, this);
            ShellModel.C3435a.m2371a(contentValues, m3534K(), (Runnable) null);
        }
    }

    /* renamed from: a */
    public void m3515a(ContentValues contentValues) {
        if (m3534K() != null) {
            ShellModel.C3435a.m2371a(contentValues, m3534K(), (Runnable) null);
        }
    }

    /* renamed from: f_ */
    public void mo3502f_() {
        this.f10127x = true;
        m3536I();
        C2224a.m6053a("WidgetContainer", "onChoicePageStart");
    }

    /* renamed from: o_ */
    public void mo3051o_() {
        this.f10127x = false;
        if (!this.f10128y) {
            m3514ad();
        }
        C2224a.m6053a("WidgetContainer", "onChoicePageEnd");
    }

    /* renamed from: p_ */
    public void mo3050p_() {
        this.f10114k = true;
        m3536I();
    }

    /* renamed from: g */
    public void mo3055g() {
        if (m3541A() != null) {
            m3541A().mo3299c(this);
        }
        C2224a.m6053a("WidgetContainer", "onDestroy");
    }

    /* renamed from: ae */
    public void mo3356ae() {
    }

    /* renamed from: q_ */
    public void mo3081q_() {
    }

    /* renamed from: j */
    public void mo3083j() {
    }

    /* renamed from: j */
    public void m3497j(boolean z) {
        this.f10111h = z;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo3520a() {
        return this.f10111h;
    }

    /* renamed from: k */
    public void m3496k(boolean z) {
        this.f10112i = z;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: o */
    public boolean mo3494o() {
        return this.f10112i;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: m */
    public int mo3310m() {
        return 0;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: n */
    public InterfaceC2557f mo3495n() {
        return this.f10113j;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
        return false;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: c */
    public void mo3332c(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: e */
    public void mo3139e(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return true;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: d */
    public void mo3140d(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: f */
    public void mo3504f(InterfaceC2557f interfaceC2557f) {
        if (this.f10113j != interfaceC2557f) {
            mo3493p();
            interfaceC2557f.mo2062a(this);
        }
        this.f10113j = interfaceC2557f;
        this.f10113j.mo3332c(this);
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: h */
    public boolean mo3500h(InterfaceC2557f interfaceC2557f) {
        if (interfaceC2557f == null) {
            return false;
        }
        return interfaceC2557f.mo2057b(this);
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: g */
    public void mo3135g(InterfaceC2557f interfaceC2557f) {
        mo3504f(interfaceC2557f);
        interfaceC2557f.mo3139e(this);
        this.f10113j = null;
    }

    /* renamed from: af */
    public void m3513af() {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: p */
    public void mo3493p() {
        if (this.f10113j != null) {
            this.f10113j.mo3140d(this);
            this.f10113j = null;
            m3513af();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public InterfaceC2557f mo3517a(int i, int i2) {
        return m3516a(i, i2, true);
    }

    /* renamed from: a */
    public InterfaceC2557f m3516a(int i, int i2, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        ArrayList<InterfaceC2557f> m2297a = C3359a.f11097k.m2297a();
        int size = m2297a.size() - 1;
        while (true) {
            int i3 = size;
            if (i3 > -1) {
                InterfaceC2557f interfaceC2557f = m2297a.get(i3);
                if (interfaceC2557f.mo3520a()) {
                    if (interfaceC2557f.mo3310m() == 0) {
                        f3 = i;
                        f4 = i2;
                    } else {
                        f3 = position().f2526x;
                        f4 = position().f2527y;
                    }
                    if (((C0975i) interfaceC2557f).calTouchCollision(f3, f4) && !interfaceC2557f.mo2061a(this, f3, f4)) {
                        return interfaceC2557f;
                    }
                }
                size = i3 - 1;
            } else {
                if (z && C3359a.f11094h.m4033m() == 2 && !C3359a.f11094h.m4031n().m4216ad()) {
                    Iterator<C0975i> it = C3359a.f11094h.m4120G().iterator();
                    while (it.hasNext()) {
                        C0975i next = it.next();
                        if ((next instanceof C3112b) && next != this) {
                            C3112b c3112b = (C3112b) next;
                            if (c3112b.mo3520a()) {
                                if (c3112b.mo3310m() == 0) {
                                    f = i;
                                    f2 = i2;
                                } else {
                                    f = position().f2526x;
                                    f2 = position().f2527y;
                                }
                                if (c3112b.calTouchCollision(f, f2) && !c3112b.mo2061a(this, f, f2)) {
                                    return c3112b;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }
}
