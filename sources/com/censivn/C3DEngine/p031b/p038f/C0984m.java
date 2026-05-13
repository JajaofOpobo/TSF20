package com.censivn.C3DEngine.p031b.p038f;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.f.m */
/* loaded from: classes.dex */
public class C0984m extends C0980j {

    /* renamed from: d */
    private boolean f2938d = false;

    /* renamed from: e */
    private String f2939e = "";

    /* renamed from: f */
    private int f2940f = 0;

    /* renamed from: g */
    private int f2941g = 0;

    /* renamed from: h */
    private float f2942h = 0.0f;

    /* renamed from: i */
    private float f2943i = 0.0f;

    /* renamed from: j */
    private float f2944j = 0.0f;

    /* renamed from: k */
    private float f2945k = 0.0f;

    /* renamed from: a */
    private C0981k f2935a = new C0981k(0.0f, 0.0f);

    /* renamed from: b */
    private C3561a f2936b = new C3561a();

    /* renamed from: c */
    private TextureElement f2937c = new TextureElement(0, false);

    public C0984m() {
        this.f2935a.textures().addElement(this.f2937c);
        addChild(this.f2935a);
    }

    /* renamed from: d */
    private void m10348d() {
        if (this.f2938d) {
            this.f2938d = false;
            Bitmap m1998b = this.f2936b.m1998b(this.f2939e);
            if (m1998b == null) {
                this.f2935a.visible(false);
                C0853a.m10853g().m10543a(this.f2937c);
            } else {
                C0853a.m10853g().m10540a(this.f2937c, m1998b);
                this.f2935a.mo10368a(this.f2937c.width);
                this.f2935a.mo5215b(this.f2937c.height);
                this.f2935a.visible(true);
            }
            m10346e();
            updatePointsVBO();
            calAABB();
        }
    }

    /* renamed from: a */
    public void m10358a() {
        this.f2938d = true;
        if (this.f2937c.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f2937c);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        m10348d();
    }

    /* renamed from: e */
    private void m10346e() {
        switch (this.f2940f) {
            case 0:
                this.f2935a.position().f2526x = 0.0f;
                break;
            case 1:
                this.f2935a.position().f2526x = (this.f2935a.mo10366b() / 2.0f) + this.f2942h;
                break;
            case 2:
                this.f2935a.position().f2526x = ((-this.f2935a.mo10366b()) / 2.0f) - this.f2943i;
                break;
        }
        switch (this.f2941g) {
            case 0:
                this.f2935a.position().f2527y = 0.0f;
                return;
            case 1:
                this.f2935a.position().f2527y = ((-this.f2935a.mo10365c()) / 2.0f) - this.f2944j;
                return;
            case 2:
                this.f2935a.position().f2526x = (this.f2935a.mo10365c() / 2.0f) + this.f2945k;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m10357a(float f, float f2, float f3, float f4) {
        this.f2942h = f;
        this.f2943i = f3;
        this.f2944j = f4;
        this.f2945k = f2;
        m10353b();
    }

    /* renamed from: a */
    public void m10356a(int i) {
        this.f2941g = i;
        m10346e();
    }

    /* renamed from: b */
    public void m10352b(int i) {
        this.f2940f = i;
        m10346e();
    }

    /* renamed from: c */
    public void m10349c(int i) {
        m10355a(C4189x.m588c(i));
    }

    /* renamed from: a */
    public void m10355a(String str) {
        if (this.f2939e != str) {
            if (str == null) {
                str = "";
            }
            this.f2939e = str;
            this.f2938d = true;
            invalidate();
        }
    }

    /* renamed from: b */
    public void m10353b() {
        this.f2936b.m2002a(this.f2939e);
        switch (this.f2940f) {
            case 0:
                this.f2935a.position().f2526x = 0.0f;
                minX(((-this.f2936b.f11818s) / 2.0f) - this.f2942h);
                maxX((this.f2936b.f11818s / 2.0f) + this.f2943i);
                break;
            case 1:
                this.f2935a.position().f2526x = (this.f2935a.mo10366b() / 2.0f) + this.f2942h;
                minX(0.0f);
                maxX(this.f2936b.f11818s + this.f2942h + this.f2943i);
                break;
            case 2:
                this.f2935a.position().f2526x = ((-this.f2935a.mo10366b()) / 2.0f) - this.f2943i;
                minX(((-this.f2936b.f11818s) - this.f2942h) - this.f2943i);
                maxX(0.0f);
                break;
        }
        switch (this.f2941g) {
            case 0:
                this.f2935a.position().f2527y = 0.0f;
                minY(((-this.f2936b.f11819t) / 2.0f) - this.f2945k);
                maxY((this.f2936b.f11819t / 2.0f) + this.f2944j);
                return;
            case 1:
                this.f2935a.position().f2527y = ((-this.f2935a.mo10365c()) / 2.0f) - this.f2944j;
                minY(((-this.f2936b.f11819t) - this.f2944j) - this.f2945k);
                maxY(0.0f);
                return;
            case 2:
                this.f2935a.position().f2527y = (this.f2935a.mo10365c() / 2.0f) + this.f2945k;
                minY(0.0f);
                maxY(this.f2936b.f11819t + this.f2945k + this.f2944j);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m10354a(boolean z) {
        this.f2936b.m1995c(z);
    }

    /* renamed from: d */
    public void m10347d(int i) {
        this.f2936b.m1989h(i);
        this.f2938d = true;
    }

    /* renamed from: e */
    public void m10345e(int i) {
        this.f2936b.m1988i(i);
        this.f2938d = true;
    }

    /* renamed from: b */
    public void m10351b(boolean z) {
        this.f2936b.m1993d(z);
        this.f2938d = true;
    }

    /* renamed from: f */
    public void m10344f(int i) {
        this.f2936b.m1992e(i);
        this.f2938d = true;
    }

    /* renamed from: g */
    public void m10343g(int i) {
        this.f2936b.m1991f(i);
        this.f2938d = true;
    }

    /* renamed from: c */
    public String m10350c() {
        return this.f2939e;
    }
}
