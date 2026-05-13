package com.tsf.shell.preference.p196a.p197a.p198a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.p141b.C2878a;
/* renamed from: com.tsf.shell.preference.a.a.a.b */
/* loaded from: classes.dex */
public class C4005b extends C4017h {

    /* renamed from: a */
    private C2878a.C2881a f13125a;

    /* renamed from: b */
    private C0980j f13126b;

    /* renamed from: d */
    private TextureElement f13127d;

    /* renamed from: e */
    private TextureElement f13128e;

    /* renamed from: f */
    private TextureElement f13129f;

    /* renamed from: g */
    private C0981k f13130g;

    public C4005b(String str) {
        super(str, C0892a.m10742a(200.0f));
        this.f13127d = new TextureElement(0, false);
        this.f13128e = new TextureElement(0, false);
        this.f13129f = new TextureElement(0, false);
        this.f13130g = C0892a.m10741a(180.0f, 180.0f);
        this.f13130g.textures().addElement(this.f13129f);
        this.f13126b = new C0980j() { // from class: com.tsf.shell.preference.a.a.a.b.1

            /* renamed from: b */
            private float f13132b = 0.0f;

            /* renamed from: c */
            private boolean f13133c = true;

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart() {
                C4005b.this.f13125a.m4367d(this.f13132b);
                if (this.f13133c) {
                    this.f13132b = (float) (this.f13132b + 0.01d);
                    if (this.f13132b > 1.0f) {
                        this.f13132b = 1.0f;
                        this.f13133c = false;
                    }
                } else {
                    this.f13132b = (float) (this.f13132b - 0.01d);
                    if (this.f13132b < 0.0f) {
                        this.f13132b = 0.0f;
                        this.f13133c = true;
                    }
                }
                C4005b.this.f13125a.m4372a(C4005b.this.f13127d);
                C4005b.this.f13125a.m4373a();
                GLES20.glFrontFace(2305);
                C4005b.this.f13125a.dispatchDraw();
                C4005b.this.f13125a.m4372a(C4005b.this.f13128e);
                C4005b.this.f13125a.m4368d();
                GLES20.glFrontFace(2304);
                C4005b.this.f13125a.dispatchDraw();
                GLES20.glFrontFace(2305);
            }
        };
        this.f13125a = new C2878a.C2881a(C0892a.m10742a(189.0f), C0892a.m10742a(288.0f), 5, 20);
        this.f13125a.position().f2526x = C0892a.m10742a(150.0f);
        this.f13126b.setAnimationObjectState(true);
        this.f13126b.addChild(this.f13130g);
        this.f13130g.position().f2526x = C0892a.m10742a(-150.0f);
        this.f13130g.useVBO(false);
        m890e().addChild(this.f13126b);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        if (this.f13127d.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f13127d, C1306b.C1310d.feature_desktop_effect_screen1);
        }
        if (this.f13128e.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f13128e, C1306b.C1310d.feature_desktop_effect_screen2);
        }
        if (this.f13129f.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f13129f, C1306b.C1310d.desktop_transition_cloth);
        }
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        C0853a.m10853g().m10543a(this.f13127d);
        C0853a.m10853g().m10543a(this.f13128e);
        C0853a.m10853g().m10543a(this.f13129f);
    }
}
