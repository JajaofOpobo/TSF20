package com.tsf.shell.manager.p183o.p184a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.p184a.C3563c;
import com.tsf.shell.utils.C4181q;
/* renamed from: com.tsf.shell.manager.o.a.b */
/* loaded from: classes.dex */
public class C3562b {

    /* renamed from: a */
    public static int f11820a;

    /* renamed from: d */
    public static final int f11821d = (int) C0892a.m10742a(50.0f);

    /* renamed from: b */
    public int f11822b;

    /* renamed from: c */
    public int f11823c;

    /* renamed from: e */
    private C3560a f11824e;

    /* renamed from: f */
    private C0981k f11825f = new C0981k(0.0f, 0.0f, false);

    /* renamed from: g */
    private TextureElement f11826g = new TextureElement(0, false);

    /* renamed from: h */
    private C3563c.C3564a f11827h;

    public C3562b(int i, C3563c.C3564a c3564a) {
        this.f11822b = i;
        this.f11827h = c3564a;
        this.f11825f.textures().addElement(this.f11826g);
    }

    /* renamed from: a */
    public C0981k m1987a() {
        return this.f11825f;
    }

    /* renamed from: b */
    public TextureElement m1985b() {
        return this.f11826g;
    }

    /* renamed from: a */
    public void m1986a(C3560a c3560a) {
        if (this.f11824e != c3560a) {
            this.f11824e = c3560a;
            this.f11825f.mo5013a(c3560a.f11752J, c3560a.f11753K + f11821d);
            Bitmap createBitmap = Bitmap.createBitmap(c3560a.f11752J, c3560a.f11753K + f11821d, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap mo1975a = mo1975a("Launcher", c3560a);
            if (mo1975a != null) {
                canvas.drawBitmap(mo1975a, 0.0f, 0.0f, (Paint) null);
                mo1975a.recycle();
            }
            float f = f11821d / 3.0f;
            Bitmap m646a = C4181q.m646a(f / 2.0f, -1);
            canvas.drawBitmap(m646a, (createBitmap.getWidth() - m646a.getWidth()) / 2, c3560a.f11753K + ((f11821d - f) / 2.0f), (Paint) null);
            m646a.recycle();
            C0853a.m10853g().m10540a(this.f11826g, createBitmap);
            createBitmap.recycle();
            this.f11825f.calAABB(1.2f, 1.0f, 1.0f);
            this.f11825f.notifLayoutRefresh();
        }
    }

    /* renamed from: c */
    public void m1984c() {
        this.f11824e = null;
        if (this.f11826g.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f11826g);
        }
    }

    /* renamed from: a */
    public Bitmap mo1975a(String str, C3560a c3560a) {
        return C3563c.m1979a(str, this.f11827h.f11838g, c3560a, this.f11827h);
    }
}
