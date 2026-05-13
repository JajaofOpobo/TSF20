package com.tsf.shell.p096f.p148h.p149a.p150a.p151a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.shell.manager.p169c.p170a.p171a.C3459a;
import com.tsf.shell.manager.p183o.p184a.C3561a;
/* renamed from: com.tsf.shell.f.h.a.a.a.d */
/* loaded from: classes.dex */
public class C3052d extends C0980j {

    /* renamed from: b */
    private String f9912b;

    /* renamed from: f */
    private C3459a.C3462b f9916f;

    /* renamed from: a */
    private TextureElement f9911a = new TextureElement(0, false);

    /* renamed from: c */
    private boolean f9913c = false;

    /* renamed from: d */
    private C0962a f9914d = new C0962a(2, 1, 1, true);

    /* renamed from: e */
    private C0984m f9915e = new C0984m();

    public C3052d() {
        this.f9915e.m10347d(54);
        this.f9914d.textures().addElement(this.f9911a);
        addChild(this.f9914d);
        addChild(this.f9915e);
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.h.a.a.a.d.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C3052d.this.f9916f != null) {
                    C3052d.this.f9916f.m2304f();
                }
            }
        });
        m3712f();
    }

    /* renamed from: a */
    public void m3717a(C3459a.C3462b c3462b) {
        c3462b.m2309a(this);
        this.f9916f = c3462b;
        this.f9912b = c3462b.m2307c();
        this.f9915e.m10355a(c3462b.m2306d());
        this.f9915e.m10353b();
        float maxX = this.f9915e.maxX() - this.f9915e.minY();
        float m10742a = C0892a.m10742a(720.0f);
        if (maxX >= m10742a) {
            m10742a = maxX;
        }
        setAABBPX(m10742a, C0892a.m10742a(130.0f));
        this.f9914d.alpha(0.0f);
        this.f9915e.alpha(0.0f);
        m3710h();
        m3709i();
    }

    /* renamed from: h */
    private void m3710h() {
        this.f9914d.position().f2527y = m3719a();
        this.f9915e.position().f2527y = m3716b();
    }

    /* renamed from: a */
    public float m3719a() {
        return C0892a.m10742a(30.0f);
    }

    /* renamed from: b */
    public float m3716b() {
        return C0892a.m10742a(-30.0f);
    }

    /* renamed from: c */
    public C0975i m3715c() {
        return this.f9914d;
    }

    /* renamed from: d */
    public C0975i m3714d() {
        return this.f9915e;
    }

    /* renamed from: e */
    public void m3713e() {
        this.f9913c = true;
        this.f9914d.m10456a(0).f2830H.set(255, 255, 255, 255);
    }

    /* renamed from: f */
    public void m3712f() {
        this.f9913c = false;
        this.f9914d.m10456a(0).f2830H.set(60, 255, 255, 255);
    }

    /* renamed from: i */
    private void m3709i() {
        int m10742a = (int) C0892a.m10742a(50.0f);
        if (this.f9911a.f2529id == 0) {
            C3561a c3561a = new C3561a();
            c3561a.m1989h(36);
            c3561a.m1988i(-1);
            c3561a.m1991f(VEasing.Linear.easeNone);
            c3561a.m1996c(m10742a);
            c3561a.m1994d(m10742a);
            Bitmap m1998b = c3561a.m1998b(this.f9912b);
            Canvas canvas = new Canvas(m1998b);
            float m10742a2 = C0892a.m10742a(25.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-1);
            canvas.drawCircle(m10742a / 2.0f, m1998b.getHeight() / 2.0f, m10742a2 / 2.0f, paint);
            C0853a.m10853g().m10540a(this.f9911a, m1998b);
            m1998b.recycle();
        }
        this.f9914d.m10455a(1, this.f9911a.width, this.f9911a.height);
        C0964b m10456a = this.f9914d.m10456a(0);
        C0964b m10456a2 = this.f9914d.m10456a(1);
        m10456a.m10407i().f2526x = ((-this.f9911a.width) / 2.0f) + (m10742a / 2.0f);
        m10456a.m10428b(0, 0, m10742a, this.f9911a.height);
        m10456a.m10408h();
        m10456a2.m10428b(m10742a, 0, this.f9911a.width - m10742a, this.f9911a.height);
        m10456a2.m10407i().f2526x = (this.f9911a.width / 2.0f) - ((this.f9911a.width - m10742a) / 2.0f);
        m10456a2.m10408h();
        if (this.f9913c) {
            m3713e();
        } else {
            m3712f();
        }
    }

    /* renamed from: g */
    public void m3711g() {
        if (this.f9911a.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f9911a);
        }
        this.f9915e.m10358a();
        this.f9916f.m2310a();
        this.f9916f = null;
        m3712f();
    }
}
