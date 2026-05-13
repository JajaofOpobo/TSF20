package com.censivn.C3DEngine.p031b.p037e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.e.a */
/* loaded from: classes.dex */
public class C0938a extends C0952g {

    /* renamed from: a */
    private C0981k f2741a;

    /* renamed from: b */
    private TextureElement f2742b;

    /* renamed from: d */
    private boolean f2743d = false;

    /* renamed from: e */
    private boolean f2744e = false;

    /* renamed from: f */
    private C0940a f2745f;

    /* renamed from: com.censivn.C3DEngine.b.e.a$a */
    /* loaded from: classes.dex */
    public static class C0940a {
        /* renamed from: a */
        public boolean mo551a(boolean z) {
            return true;
        }
    }

    public C0938a() {
        m10532m();
    }

    /* renamed from: a */
    public void m10538a(C0940a c0940a) {
        this.f2745f = c0940a;
    }

    /* renamed from: e */
    public boolean m10534e() {
        return this.f2743d;
    }

    /* renamed from: c */
    public void m10535c(boolean z) {
        this.f2743d = z;
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        m10533h();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        if (this.f2742b.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f2742b);
        }
    }

    /* renamed from: h */
    public void m10533h() {
        this.f2744e = this.f2743d;
        Bitmap m608a = C4189x.m608a(this.f2743d ? C1306b.C1310d.preference_check_on : C1306b.C1310d.preference_check_off, C0892a.m10742a(58.0f), C0892a.m10742a(58.0f));
        C0853a.m10853g().m10540a(this.f2742b, m608a);
        m608a.recycle();
    }

    /* renamed from: m */
    private void m10532m() {
        this.f2741a = C0892a.m10741a(58.0f, 58.0f);
        this.f2742b = new TextureElement(0, false);
        this.f2741a.textures().addElement(this.f2742b);
        this.f2741a.position().f2527y = (-m10621b()) / 2.0f;
        addChild(this.f2741a);
        setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.e.a.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C0938a.this.f2743d) {
                    C0938a.this.m10535c(false);
                    C0938a.this.m10531n();
                    return;
                }
                C0938a.this.m10535c(true);
                C0938a.this.m10531n();
            }
        });
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f2744e != this.f2743d) {
            m10533h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m10531n() {
        if (this.f2745f != null) {
            this.f2745f.mo551a(this.f2743d);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        if (this.f2741a != null) {
            this.f2741a.position().f2526x = (i / 2.0f) - 29.0f;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: e */
    public void mo824e(int i) {
        super.mo824e(i);
        if (this.f2741a != null) {
            this.f2741a.position().f2527y = (-i) / 2.0f;
        }
    }
}
