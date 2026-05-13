package com.censivn.C3DEngine.p031b.p038f.p039a;

import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColorTexture;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.utils.C4189x;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.f.a.a */
/* loaded from: classes.dex */
public class C0962a extends C0980j {

    /* renamed from: a */
    private int f2810a;

    /* renamed from: b */
    public int f2811b;

    /* renamed from: c */
    private float f2812c;

    /* renamed from: d */
    private float f2813d;

    /* renamed from: e */
    private C0964b f2814e;

    /* renamed from: f */
    private ArrayList<C0964b> f2815f;

    /* renamed from: g */
    private C0975i f2816g;

    /* renamed from: h */
    private boolean f2817h;

    /* renamed from: i */
    private boolean f2818i;

    /* renamed from: j */
    private C0937a f2819j;

    /* renamed from: k */
    private boolean f2820k;

    /* renamed from: l */
    private boolean f2821l;

    public C0962a(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, i3, null, z);
    }

    public C0962a(int i, int i2, int i3) {
        this(i, i2, i3, i3, null, false);
    }

    public C0962a(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null, false);
    }

    public C0962a(int i, int i2, int i3, int i4, C0975i c0975i, boolean z) {
        super(((i * 2) - 1) * 4 * 1, ((i * 2) - 1) * 2 * 1, true, true, Boolean.valueOf(z));
        this.f2811b = 16;
        this.f2817h = false;
        this.f2818i = false;
        this.f2820k = false;
        this.f2821l = false;
        this.f2820k = z;
        this.f2810a = i;
        this.f2811b = i2;
        this.f2812c = i3;
        this.f2813d = i4;
        this.f2815f = new ArrayList<>();
        this.f2816g = c0975i;
        m10457a(0.0f, 0.0f, (i * 2) - 1, 1, new Color4(255, 50, 0, 100));
    }

    /* renamed from: a */
    public void m10455a(int i, int i2, int i3) {
        this.f2811b = i;
        this.f2812c = i2;
        this.f2813d = i3;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void draw() {
        if (this.f2820k) {
            C0853a.m10855e().m10774a(this);
            updateTextureState();
            ShaderColorTexture shaderColorTexture = ShaderManager.SHADER_COLOR_TEXTURE;
            ShaderManager.enableShader(shaderColorTexture);
            float f = (this.mAlpha / 255.0f) * MatrixStack.glColor().alpha;
            Iterator<C0964b> it = this.f2815f.iterator();
            while (it.hasNext()) {
                m10450a(it.next(), f);
            }
            vertices().colors().buffer().position(0);
            GLES20.glEnableVertexAttribArray(shaderColorTexture.maColor4Handle);
            GLES20.glVertexAttribPointer(shaderColorTexture.maColor4Handle, 4, 5126, false, 0, (Buffer) vertices().colors().buffer());
            if (doubleSidedEnabled()) {
                GLES20.glDisable(2884);
            } else {
                GLES20.glEnable(2884);
            }
            drawMVPMatrix();
            drawElement();
            GLES20.glDisableVertexAttribArray(shaderColorTexture.maColor4Handle);
            return;
        }
        super.draw();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f2817h) {
            updatePointsVBO();
            this.f2817h = false;
        }
        if (this.f2818i) {
            updateUvsVBO();
            this.f2818i = false;
        }
    }

    /* renamed from: a */
    public int m10459a() {
        return this.f2810a;
    }

    /* renamed from: a */
    private void m10457a(float f, float f2, int i, int i2, Color4 color4) {
        float f3 = f / i;
        float f4 = f2 / i2;
        float f5 = f / 2.0f;
        float f6 = f2 / 2.0f;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 > i2) {
                break;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 <= i) {
                    vertices().addVertex(1.0f - ((i6 * f3) - f5), (i4 * f4) - f6, 0.0f, 1.0f - (i6 / i), 1.0f - (i4 / i2), 0.0f, 0.0f, -1.0f, color4.f2525r, color4.f2524g, color4.f2523b, color4.f2522a);
                    i5 = i6 + 1;
                }
            }
            i3 = i4 + 1;
        }
        int i7 = i + 1;
        int i8 = 1;
        while (true) {
            int i9 = i8;
            if (i9 > i2) {
                break;
            }
            for (int i10 = 1; i10 <= i; i10++) {
                if (i10 % 2 != 0) {
                    int i11 = (i9 * i7) + i10;
                    int i12 = i11 - i7;
                    C4189x.m598a(this, i12 - 1, i12, i11, i11 - 1);
                }
            }
            i8 = i9 + 1;
        }
        int i13 = this.f2810a * 2;
        for (int i14 = 0; i14 < this.f2810a; i14++) {
            C0964b c0964b = new C0964b(this);
            c0964b.f2832J = i14;
            c0964b.f2841a = i14 * 2;
            c0964b.f2842b = c0964b.f2841a + 1;
            c0964b.f2843c = c0964b.f2841a + i13;
            c0964b.f2844d = c0964b.f2842b + i13;
            this.f2815f.add(c0964b);
        }
        this.f2819j = new C0937a(this.f2816g == null ? this : this.f2816g) { // from class: com.censivn.C3DEngine.b.f.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                float[] m601a = C4189x.m601a(motionEvent);
                C0962a.this.f2814e = C0962a.this.m10458a(m601a[0], m601a[1]);
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo1654e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo1653f(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo3208g(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo502a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: k */
            public void mo10267k(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo10267k(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3548b(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo3548b(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo2122c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo2119d(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo527a(motionEvent, motionEvent2, f7, f8);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo3209b(motionEvent, motionEvent2, f7, f8);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: h */
            public void mo3555h(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo3555h(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: i */
            public void mo3544i(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo3544i(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: j */
            public void mo3543j(MotionEvent motionEvent) {
                if (C0962a.this.f2814e != null && C0962a.this.f2814e.f2852l != null) {
                    C0962a.this.f2814e.f2852l.mo3543j(motionEvent);
                }
            }
        };
        setMouseEventListener(this.f2819j);
    }

    /* renamed from: a */
    public void m10451a(C0964b c0964b) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i = c0964b.f2845e;
        int i2 = c0964b.f2846f;
        if (c0964b.f2864x) {
            float f12 = c0964b.f2823A / this.f2812c;
            float f13 = c0964b.f2865y / this.f2812c;
            float f14 = c0964b.f2824B / this.f2813d;
            f = c0964b.f2866z / this.f2813d;
            f2 = f13;
            f3 = f12;
            f4 = f13;
            f5 = f12;
            f6 = f14;
            f7 = f14;
            f8 = f;
        } else {
            float f15 = ((i * this.f2811b) + (c0964b.f2847g * this.f2811b)) / this.f2812c;
            float f16 = (c0964b.f2847g * this.f2811b) / this.f2812c;
            float f17 = ((c0964b.f2848h * this.f2811b) + (i2 * this.f2811b)) / this.f2813d;
            f = (c0964b.f2848h * this.f2811b) / this.f2813d;
            f2 = f16;
            f3 = f15;
            f4 = f16;
            f5 = f15;
            f6 = f17;
            f7 = f17;
            f8 = f;
        }
        if (c0964b.f2849i) {
            f9 = f5;
            f10 = f4;
        } else {
            float f18 = f2;
            f9 = f4;
            f4 = f3;
            f10 = f5;
            f5 = f18;
        }
        if (c0964b.f2850j) {
            f6 = f8;
            f11 = f8;
            f8 = f7;
        } else {
            float f19 = f;
            f11 = f7;
            f7 = f19;
        }
        vertices().uvs().set(c0964b.f2841a, f10, f11);
        vertices().uvs().set(c0964b.f2842b, f9, f6);
        vertices().uvs().set(c0964b.f2843c, f4, f8);
        vertices().uvs().set(c0964b.f2844d, f5, f7);
        if (useVBO()) {
            this.f2818i = true;
        } else {
            invalidate();
        }
    }

    /* renamed from: c */
    private void m10445c(C0964b c0964b) {
        float m10403m = c0964b.m10403m() / 2.0f;
        float m10401o = c0964b.m10401o() / 2.0f;
        c0964b.f2856p.f2526x = c0964b.m10399q() + m10403m;
        c0964b.f2856p.f2527y = (-m10401o) + c0964b.m10397s();
        c0964b.f2856p.f2528z = 0.0f;
        c0964b.f2857q.f2526x = (-m10403m) + c0964b.m10399q();
        c0964b.f2857q.f2527y = (-m10401o) + c0964b.m10397s();
        c0964b.f2857q.f2528z = 0.0f;
        c0964b.f2858r.f2526x = c0964b.m10399q() + m10403m;
        c0964b.f2858r.f2527y = c0964b.m10397s() + m10401o;
        c0964b.f2858r.f2528z = 0.0f;
        c0964b.f2859s.f2526x = (-m10403m) + c0964b.m10399q();
        c0964b.f2859s.f2527y = m10401o + c0964b.m10397s();
        c0964b.f2859s.f2528z = 0.0f;
        if (c0964b.m10404l()) {
            c0964b.f2856p.f2526x *= c0964b.f2855o.f2526x;
            c0964b.f2857q.f2526x *= c0964b.f2855o.f2526x;
            c0964b.f2858r.f2526x *= c0964b.f2855o.f2526x;
            c0964b.f2859s.f2526x *= c0964b.f2855o.f2526x;
            c0964b.f2856p.f2527y *= c0964b.f2855o.f2527y;
            c0964b.f2857q.f2527y *= c0964b.f2855o.f2527y;
            c0964b.f2858r.f2527y *= c0964b.f2855o.f2527y;
            c0964b.f2859s.f2527y *= c0964b.f2855o.f2527y;
        } else {
            c0964b.f2856p.f2526x = 0.0f;
            c0964b.f2857q.f2526x = 0.0f;
            c0964b.f2858r.f2526x = 0.0f;
            c0964b.f2859s.f2526x = 0.0f;
            c0964b.f2856p.f2527y = 0.0f;
            c0964b.f2857q.f2527y = 0.0f;
            c0964b.f2858r.f2527y = 0.0f;
            c0964b.f2859s.f2527y = 0.0f;
            c0964b.f2856p.f2528z = 0.0f;
            c0964b.f2857q.f2528z = 0.0f;
            c0964b.f2858r.f2528z = 0.0f;
            c0964b.f2859s.f2528z = 0.0f;
        }
        c0964b.f2860t.setAllFrom(c0964b.f2856p);
        c0964b.f2861u.setAllFrom(c0964b.f2857q);
        c0964b.f2862v.setAllFrom(c0964b.f2858r);
        c0964b.f2863w.setAllFrom(c0964b.f2859s);
        if (c0964b.f2826D != null) {
            c0964b.f2860t.f2526x *= c0964b.f2826D.f2526x;
            c0964b.f2860t.f2527y *= c0964b.f2826D.f2527y;
        } else {
            c0964b.f2860t.f2526x *= c0964b.f2825C.f2526x;
            c0964b.f2860t.f2527y *= c0964b.f2825C.f2527y;
        }
        if (c0964b.f2827E != null) {
            c0964b.f2861u.f2526x *= c0964b.f2827E.f2526x;
            c0964b.f2861u.f2527y *= c0964b.f2827E.f2527y;
        } else {
            c0964b.f2861u.f2526x *= c0964b.f2825C.f2526x;
            c0964b.f2861u.f2527y *= c0964b.f2825C.f2527y;
        }
        if (c0964b.f2828F != null) {
            c0964b.f2862v.f2526x *= c0964b.f2828F.f2526x;
            c0964b.f2862v.f2527y *= c0964b.f2828F.f2527y;
        } else {
            c0964b.f2862v.f2526x *= c0964b.f2825C.f2526x;
            c0964b.f2862v.f2527y *= c0964b.f2825C.f2527y;
        }
        if (c0964b.f2829G != null) {
            c0964b.f2863w.f2526x *= c0964b.f2829G.f2526x;
            c0964b.f2863w.f2527y *= c0964b.f2829G.f2527y;
        } else {
            c0964b.f2863w.f2526x *= c0964b.f2825C.f2526x;
            c0964b.f2863w.f2527y *= c0964b.f2825C.f2527y;
        }
        float f = (float) ((c0964b.f2854n.f2526x * 3.141592653589793d) / 180.0d);
        float f2 = (float) ((c0964b.f2854n.f2527y * 3.141592653589793d) / 180.0d);
        float f3 = (float) ((c0964b.f2854n.f2528z * 3.141592653589793d) / 180.0d);
        c0964b.f2856p.rotateX(f);
        c0964b.f2857q.rotateX(f);
        c0964b.f2858r.rotateX(f);
        c0964b.f2859s.rotateX(f);
        c0964b.f2860t.rotateX(f);
        c0964b.f2861u.rotateX(f);
        c0964b.f2862v.rotateX(f);
        c0964b.f2863w.rotateX(f);
        c0964b.f2856p.rotateY(f2);
        c0964b.f2857q.rotateY(f2);
        c0964b.f2858r.rotateY(f2);
        c0964b.f2859s.rotateY(f2);
        c0964b.f2860t.rotateY(f2);
        c0964b.f2861u.rotateY(f2);
        c0964b.f2862v.rotateY(f2);
        c0964b.f2863w.rotateY(f2);
        c0964b.f2856p.rotateZ(f3);
        c0964b.f2857q.rotateZ(f3);
        c0964b.f2858r.rotateZ(f3);
        c0964b.f2859s.rotateZ(f3);
        c0964b.f2860t.rotateZ(f3);
        c0964b.f2861u.rotateZ(f3);
        c0964b.f2862v.rotateZ(f3);
        c0964b.f2863w.rotateZ(f3);
        c0964b.f2856p.add(c0964b.f2853m);
        c0964b.f2857q.add(c0964b.f2853m);
        c0964b.f2858r.add(c0964b.f2853m);
        c0964b.f2859s.add(c0964b.f2853m);
        c0964b.f2860t.add(c0964b.f2853m);
        c0964b.f2861u.add(c0964b.f2853m);
        c0964b.f2862v.add(c0964b.f2853m);
        c0964b.f2863w.add(c0964b.f2853m);
    }

    /* renamed from: b */
    public void m10446b(C0964b c0964b) {
        m10445c(c0964b);
        points().setPX(c0964b.f2841a, c0964b.f2856p);
        points().setPX(c0964b.f2842b, c0964b.f2857q);
        points().setPX(c0964b.f2843c, c0964b.f2858r);
        points().setPX(c0964b.f2844d, c0964b.f2859s);
        if (useVBO()) {
            this.f2817h = true;
        } else {
            invalidate();
        }
    }

    /* renamed from: a */
    private void m10450a(C0964b c0964b, float f) {
        if (this.f2820k) {
            float f2 = ((c0964b.f2830H.glA * c0964b.f2831I) / 255.0f) * f;
            float f3 = f2 * c0964b.f2830H.glR;
            float f4 = f2 * c0964b.f2830H.glG;
            float f5 = f2 * c0964b.f2830H.glB;
            vertices().colors().set(c0964b.f2841a, f3, f4, f5, f2);
            vertices().colors().set(c0964b.f2842b, f3, f4, f5, f2);
            vertices().colors().set(c0964b.f2843c, f3, f4, f5, f2);
            vertices().colors().set(c0964b.f2844d, f3, f4, f5, f2);
        }
    }

    /* renamed from: a */
    public void m10448a(boolean z) {
        this.f2821l = z;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean calTouchCollision(float f, float f2) {
        if (this.f2821l) {
            return super.calTouchCollision(f, f2);
        }
        if (m10458a(f, f2) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public int m10447b() {
        return this.f2815f.size();
    }

    /* renamed from: a */
    public C0964b m10456a(int i) {
        return this.f2815f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C0964b m10458a(float f, float f2) {
        for (int i = 0; i < this.f2810a; i++) {
            C0964b c0964b = this.f2815f.get(i);
            this.AABB_TL[0] = c0964b.f2860t.f2526x;
            this.AABB_TL[1] = c0964b.f2860t.f2527y;
            this.AABB_TL[2] = c0964b.f2860t.f2528z;
            this.AABB_TL[3] = 1.0f;
            this.AABB_TR[0] = c0964b.f2861u.f2526x;
            this.AABB_TR[1] = c0964b.f2861u.f2527y;
            this.AABB_TR[2] = c0964b.f2861u.f2528z;
            this.AABB_TR[3] = 1.0f;
            this.AABB_BL[0] = c0964b.f2862v.f2526x;
            this.AABB_BL[1] = c0964b.f2862v.f2527y;
            this.AABB_BL[2] = c0964b.f2862v.f2528z;
            this.AABB_BL[3] = 1.0f;
            this.AABB_BR[0] = c0964b.f2863w.f2526x;
            this.AABB_BR[1] = c0964b.f2863w.f2527y;
            this.AABB_BR[2] = c0964b.f2863w.f2528z;
            this.AABB_BR[3] = 1.0f;
            if (super.calTouchCollision(f, f2) && c0964b.f2852l != null) {
                return c0964b;
            }
        }
        return null;
    }
}
