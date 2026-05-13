package com.tsf.shell.p096f.p118e.p127g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.p096f.p118e.C2636k;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.e.g.e */
/* loaded from: classes.dex */
public class C2602e extends C0980j {

    /* renamed from: e */
    private static C3561a f8558e;

    /* renamed from: g */
    private static final float f8559g = 24.0f * C0892a.f2567c;

    /* renamed from: a */
    private C0981k f8560a;

    /* renamed from: b */
    private String f8561b;

    /* renamed from: d */
    private TextureElement f8563d;

    /* renamed from: f */
    private C2636k f8564f;

    /* renamed from: h */
    private int f8565h;

    /* renamed from: c */
    private boolean f8562c = false;

    /* renamed from: i */
    private int f8566i = (int) C0892a.m10742a(30.0f);

    /* renamed from: j */
    private int f8567j = (int) C0892a.m10742a(10.0f);

    public C2602e(int i) {
        this.f8565h = 0;
        this.f8565h = i;
        if (f8558e == null) {
            f8558e = new C3561a();
            f8558e.m1988i(-1);
            f8558e.m1989h(42);
        }
        this.f8563d = new TextureElement(0, false);
        this.f8560a = new C0981k(0.0f, 0.0f, false);
        this.f8560a.textures().addElement(this.f8563d);
        addChild(this.f8560a);
        m5206h();
    }

    /* renamed from: a */
    public void m5214a() {
        if (this.f8564f == null) {
            this.f8564f = new C2636k();
        }
        addChild(this.f8564f);
    }

    /* renamed from: b */
    public void m5212b() {
        this.f8564f.m5101a();
        this.f8564f.removeFromParent();
    }

    /* renamed from: a */
    public void m5213a(String str) {
        this.f8561b = str;
        f8558e.m2002a(str);
        float f = this.f8565h == 0 ? f8558e.f11818s : f8558e.f11818s + this.f8567j + this.f8566i;
        minX(((-f) / 2.0f) - f8559g);
        maxX((f / 2.0f) + f8559g);
        minY((-f8558e.f11819t) / 2.0f);
        maxY(f8558e.f11819t / 2.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void visible(Boolean bool) {
        super.visible(bool);
        notifLayoutRefresh();
    }

    /* renamed from: c */
    public void m5211c() {
        visible(true);
        mouseEnabled(true);
    }

    /* renamed from: d */
    public void m5210d() {
        visible(false);
        mouseEnabled(false);
    }

    /* renamed from: e */
    public boolean m5209e() {
        return visible();
    }

    /* renamed from: f */
    public void m5208f() {
        if (this.f8563d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f8563d);
        }
    }

    /* renamed from: g */
    public void m5207g() {
        this.f8562c = true;
        C3567c.m1967a(this.f8560a, C3567c.f11854m);
    }

    /* renamed from: h */
    public void m5206h() {
        this.f8562c = false;
        C3567c.m1967a(this.f8560a, C3567c.f11855n);
    }

    /* renamed from: i */
    public void m5205i() {
        if (this.f8563d.f2529id == 0) {
            int i = (int) (80.0f * C0892a.f2567c);
            Bitmap m1998b = f8558e.m1998b(this.f8561b);
            Bitmap createBitmap = Bitmap.createBitmap(this.f8565h == 0 ? (int) ((f8559g * 2.0f) + m1998b.getWidth()) : (int) ((f8559g * 2.0f) + this.f8567j + m1998b.getWidth() + this.f8566i), i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i2 = (int) f8559g;
            if (this.f8565h != 0) {
                Bitmap m607a = C4189x.m607a(this.f8565h, this.f8566i, this.f8566i);
                canvas.drawBitmap(m607a, f8559g, (i - m607a.getHeight()) / 2, (Paint) null);
                m607a.recycle();
                i2 += this.f8567j + this.f8566i;
            }
            canvas.drawBitmap(m1998b, i2, (i - m1998b.getHeight()) / 2, (Paint) null);
            m1998b.recycle();
            C0853a.m10853g().m10540a(this.f8563d, createBitmap);
            createBitmap.recycle();
            this.f8560a.mo10368a(this.f8563d.width);
            this.f8560a.mo5215b(this.f8563d.height);
            calAABB(1.0f, 2.0f, 1.0f);
            if (this.f8564f != null) {
                this.f8564f.position().f2527y = C0892a.m10742a(17.0f);
                this.f8564f.position().f2526x = (this.f8563d.width / 2) - C0892a.m10742a(10.0f);
            }
        }
    }
}
