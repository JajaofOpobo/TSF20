package com.tsf.shell.p096f.p153i.p155b.p156a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p052c.C1070a;
import com.censivn.C3DEngine.p052c.p053a.p054a.C1073b;
import com.censivn.C3DEngine.p052c.p055b.C1080b;
import com.censivn.C3DEngine.p057e.C1100i;
import com.censivn.C3DEngine.p057e.InterfaceC1090b;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.a.a */
/* loaded from: classes.dex */
public class C3117a extends C0980j {

    /* renamed from: d */
    private C0975i f10138d;

    /* renamed from: e */
    private C0980j f10139e;

    /* renamed from: f */
    private C0980j f10140f;

    /* renamed from: h */
    private boolean f10142h;

    /* renamed from: i */
    private C0981k f10143i;

    /* renamed from: j */
    private C1070a f10144j;

    /* renamed from: k */
    private C1080b f10145k;

    /* renamed from: l */
    private TextureElement f10146l;

    /* renamed from: m */
    private int f10147m;

    /* renamed from: n */
    private int f10148n;

    /* renamed from: a */
    private boolean f10135a = false;

    /* renamed from: b */
    private TextureElement f10136b = new TextureElement(0, false);

    /* renamed from: c */
    private TextureElement f10137c = new TextureElement(0, false);

    /* renamed from: g */
    private int f10141g = 0;

    /* renamed from: o */
    private int f10149o = 6;

    /* renamed from: c */
    static /* synthetic */ int m3479c(C3117a c3117a) {
        int i = c3117a.f10141g;
        c3117a.f10141g = i + 1;
        return i;
    }

    public C3117a(boolean z) {
        this.f10142h = false;
        this.f10142h = z;
        m3474h();
        m3473i();
    }

    /* renamed from: a */
    public void m3485a() {
        this.f10135a = true;
    }

    /* renamed from: b */
    public void m3482b() {
        this.f10135a = false;
    }

    /* renamed from: c */
    public void m3480c() {
        this.f10141g = 0;
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(0.0f);
        C1014c.m10326a(this.f10140f);
        C1014c.m10325a(this.f10140f, 250, c1017d);
    }

    /* renamed from: h */
    private void m3474h() {
        System.currentTimeMillis();
        InterfaceC1090b m9864a = C1100i.m9864a(C1100i.EnumC1102a.MAX_3DS, C0853a.m10856d().getResources(), C0853a.m10858b() + ":raw/widget_airship", true);
        m9864a.mo9869c();
        this.f10138d = m9864a.mo9870b().getChildAt(0);
        this.f10138d.removeFromParent();
    }

    /* renamed from: i */
    private void m3473i() {
        this.f10140f = new C0980j() { // from class: com.tsf.shell.f.i.b.a.a.1

            /* renamed from: b */
            private double f10151b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (!C3117a.this.f10135a) {
                    position().f2527y = ((float) Math.sin(this.f10151b * C3117a.this.f10141g)) * 50.0f * C0892a.f2566b;
                    C3117a.m3479c(C3117a.this);
                }
            }
        };
        this.f10139e = new C0980j() { // from class: com.tsf.shell.f.i.b.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                C0853a.m10855e().m10768c();
                if (!C3117a.this.f10135a && C3117a.this.f10145k != null) {
                    C3117a.this.f10145k.m9902d((float) ((Math.cos(1.0d) * 2.0d) - (Math.random() * 2.0d)));
                    C3117a.this.f10144j.m9976a();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                C0853a.m10855e().m10766d();
            }
        };
        this.f10138d.textures().addElement(this.f10136b);
        this.f10138d.scale().setAll(7.0f, 7.0f, 7.0f);
        this.f10138d.rotation().f2528z = 28.0f;
        C0981k c0981k = new C0981k(150.0f, 150.0f) { // from class: com.tsf.shell.f.i.b.a.a.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (!C3117a.this.f10135a) {
                    rotation().f2528z += 25.0f;
                }
            }
        };
        c0981k.position().f2528z = -210.0f;
        c0981k.textures().addElement(this.f10137c);
        c0981k.doubleSidedEnabled(true);
        this.f10139e.addChild(this.f10138d);
        this.f10140f.addChild(c0981k);
        this.f10140f.addChild(this.f10139e);
        this.f10140f.rotation().f2527y = 75.0f;
        this.f10140f.scale().setAll(C0892a.f2566b * 1.1f, C0892a.f2566b * 1.1f, C0892a.f2566b * 1.1f);
        addChild(this.f10140f);
        this.f10140f.setMouseEventListener(new C0937a(this.f10140f) { // from class: com.tsf.shell.f.i.b.a.a.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3117a.this.mo3466e();
            }
        });
        this.f10140f.setAABBPX((-180.0f) * C0892a.f2566b, (-300.0f) * C0892a.f2566b, 0.0f, 180.0f * C0892a.f2566b, 100.0f * C0892a.f2566b, 0.0f);
        if (this.f10142h) {
            m3472j();
        }
        m3476f();
    }

    /* renamed from: j */
    private void m3472j() {
        this.f10147m = this.f10149o * (this.f10149o + 1);
        this.f10148n = this.f10147m + this.f10149o;
        this.f10143i = new C0981k(250.0f, 150.0f, this.f10149o, this.f10149o, false);
        this.f10143i.position().f2527y = -150.0f;
        this.f10143i.position().f2526x = 30.0f;
        this.f10143i.position().f2528z = -10.0f;
        this.f10143i.rotation().f2527y = -90.0f;
        this.f10143i.rotation().f2528z = -2.5f;
        this.f10143i.useVBO(false);
        this.f10144j = new C1070a(this.f10143i);
        this.f10145k = new C1080b(0.7f, 2.0f);
        this.f10144j.m9974a(this.f10145k);
        this.f10145k.m9904c(-0.3f);
        this.f10139e.addChild(this.f10143i);
        this.f10139e.setAnimationObjectState(true);
        this.f10139e.setHighPriorityAnimationObjectState(false);
        ArrayList<C1073b> m9907b = this.f10145k.m9907b();
        C1073b c1073b = m9907b.get(this.f10147m);
        c1073b.f3358d = false;
        c1073b.f3360f = false;
        c1073b.f3359e = false;
        C1073b c1073b2 = m9907b.get(this.f10148n);
        c1073b2.f3358d = false;
        c1073b2.f3360f = false;
        c1073b2.f3359e = false;
        m3484a(mo3467d());
    }

    /* renamed from: d */
    public Bitmap mo3467d() {
        return null;
    }

    /* renamed from: e */
    public void mo3466e() {
    }

    /* renamed from: a */
    public void m3484a(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = C4189x.m609a(C1306b.C1310d.widget_airship_flag);
        }
        if (this.f10146l == null) {
            this.f10146l = C0853a.m10853g().m10544a(bitmap, false);
            this.f10143i.textures().addElement(this.f10146l);
        } else {
            C0853a.m10853g().m10540a(this.f10146l, bitmap);
        }
        bitmap.recycle();
    }

    /* renamed from: f */
    public void m3476f() {
        if (this.f10136b.f2529id == 0) {
            Bitmap m609a = C4189x.m609a(C1306b.C1310d.widget_airship_body);
            C0853a.m10853g().m10540a(this.f10136b, m609a);
            m609a.recycle();
        }
        if (this.f10137c.f2529id == 0) {
            Bitmap m609a2 = C4189x.m609a(C1306b.C1310d.widget_airship_propeller);
            C0853a.m10853g().m10540a(this.f10137c, m609a2);
            m609a2.recycle();
        }
    }

    /* renamed from: g */
    public void m3475g() {
        C0853a.m10853g().m10543a(this.f10136b);
        C0853a.m10853g().m10543a(this.f10137c);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        super.destroy();
        C0853a.m10853g().m10543a(this.f10136b);
        C0853a.m10853g().m10543a(this.f10137c);
        C0853a.m10853g().m10543a(this.f10146l);
    }
}
