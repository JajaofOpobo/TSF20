package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.f.a.c.e */
/* loaded from: classes.dex */
public class C2784e extends C0981k {

    /* renamed from: a */
    private int f9110a;

    /* renamed from: d */
    private String f9111d;

    /* renamed from: e */
    private TextureElement f9112e;

    /* renamed from: f */
    private int f9113f;

    /* renamed from: g */
    private int f9114g;

    /* renamed from: h */
    private int f9115h;

    public C2784e(int i, int i2, String str) {
        super(0.0f, 0.0f);
        this.f9112e = new TextureElement(0, false);
        this.f9113f = 80;
        this.f9114g = 20;
        this.f9115h = 0;
        this.f9110a = i;
        this.f9111d = str;
        this.f9115h = i2;
        m4670e();
    }

    /* renamed from: e */
    private void m4670e() {
        this.f9113f = (int) (this.f9113f * C0892a.f2567c);
        this.f9114g = (int) (this.f9114g * C0892a.f2567c);
        C3567c.m1967a(this, C3567c.f11849h);
        textures().addElement(this.f9112e);
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.f.a.c.e.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2784e.this.mo4672a();
            }
        });
    }

    /* renamed from: a */
    public void mo4672a() {
    }

    /* renamed from: d */
    public void m4671d() {
        if (this.f9112e.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f9112e);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f9112e.f2529id == 0) {
            C3561a c3561a = new C3561a();
            c3561a.m1989h(36);
            c3561a.m1988i(-1);
            Bitmap m1998b = c3561a.m1998b(this.f9111d);
            Bitmap m609a = this.f9115h == 0 ? C4189x.m609a(this.f9110a) : C4189x.m608a(this.f9110a, C0892a.m10742a(this.f9115h), C0892a.m10742a(this.f9115h));
            Bitmap createBitmap = Bitmap.createBitmap(m1998b.getWidth() + m609a.getWidth() + this.f9114g, this.f9113f, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(m609a, 0.0f, (this.f9113f - m609a.getHeight()) / 2, (Paint) null);
            canvas.drawBitmap(m1998b, m609a.getWidth() + this.f9114g, (this.f9113f - m1998b.getHeight()) / 2, (Paint) null);
            m609a.recycle();
            m1998b.recycle();
            C0853a.m10853g().m10540a(this.f9112e, createBitmap);
            createBitmap.recycle();
            mo10368a(this.f9112e.width);
            mo5215b(this.f9112e.height);
            calAABB(1.2f, 1.2f, 1.0f);
        }
    }
}
