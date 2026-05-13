package com.tsf.shell.p096f.p118e.p121c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
/* renamed from: com.tsf.shell.f.e.c.a */
/* loaded from: classes.dex */
public class C2478a extends C0980j {

    /* renamed from: a */
    public C0975i f8159a;

    /* renamed from: b */
    public C0975i f8160b;

    /* renamed from: d */
    public float f8162d;

    /* renamed from: e */
    public float f8163e;

    /* renamed from: f */
    public float f8164f;

    /* renamed from: g */
    public int f8165g;

    /* renamed from: h */
    public int f8166h;

    /* renamed from: i */
    private C2486b f8167i;

    /* renamed from: j */
    private TextureElement f8168j = new TextureElement(0, false);

    /* renamed from: k */
    private TextureElement f8169k = new TextureElement(0, false);

    /* renamed from: l */
    private final int f8170l = VEasing.Back.easeIn;

    /* renamed from: c */
    public C2478a f8161c = this;

    public C2478a(float f, int i, int i2, Bitmap bitmap, int i3, float f2) {
        this.f8162d = 1.0f;
        this.f8163e = 100.0f;
        this.f8164f = this.f8163e / 2.0f;
        this.f8165g = 180;
        this.f8166h = 1000;
        this.f8162d = f2;
        this.f8163e = f * f2;
        this.f8164f = this.f8163e / 2.0f;
        this.f8165g = i2;
        this.f8161c.alpha(this.f8165g);
        Bitmap m5461c = m5461c(i);
        C0853a.m10853g().m10540a(this.f8169k, m5461c);
        m5461c.recycle();
        C0853a.m10853g().m10540a(this.f8168j, bitmap);
        bitmap.recycle();
        this.f8166h = i3;
        m5456i();
    }

    /* renamed from: a */
    public TextureElement m5470a() {
        return this.f8169k;
    }

    /* renamed from: b */
    public TextureElement m5464b() {
        return this.f8168j;
    }

    /* renamed from: a */
    public void m5467a(int i) {
        this.f8165g = i;
        C1017d c1017d = new C1017d();
        c1017d.m10314a(this.f8165g);
        C1014c.m10326a(this.f8161c);
        C1014c.m10325a(this.f8161c, VEasing.Back.easeIn, c1017d);
        this.f8167i.alpha(255.0f);
    }

    /* renamed from: b */
    public void m5463b(int i) {
        Bitmap m5461c = m5461c(i);
        C0853a.m10853g().m10540a(this.f8169k, m5461c);
        m5461c.recycle();
    }

    /* renamed from: i */
    private void m5456i() {
        this.f8167i = new C2486b(this) { // from class: com.tsf.shell.f.e.c.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                C2478a.this.onKillFocus();
            }
        };
        this.f8167i.textures().addElement(this.f8169k);
        this.f8167i.setAABBSP(-this.f8164f, -this.f8164f, 0.0f, this.f8164f, this.f8164f, 0.0f);
        addChild(this.f8167i);
        setAABBSP(-this.f8164f, -this.f8164f, 0.0f, this.f8164f, this.f8164f, 0.0f);
        this.f8159a = m5455j();
        addChild(this.f8159a);
    }

    /* renamed from: a */
    public void m5466a(C0980j c0980j) {
        this.f8160b = c0980j;
        this.f8160b.scale().setAll(0.0f, 0.0f, 0.0f);
        this.f8160b.visible(false);
        addChild(this.f8160b);
    }

    /* renamed from: c */
    public C0980j m5462c() {
        return this.f8167i;
    }

    /* renamed from: a */
    public void m5469a(float f, float f2, float f3, float f4, int i, boolean z) {
        C1014c.m10326a(this.f8161c);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f8161c);
        C1014c.m10325a(this.f8161c, 250, c1017d);
        this.f8167i.alpha(i);
        if (z) {
            this.f8167i.m5422a(f, f2, f3, f4);
        } else {
            this.f8167i.m5406b(f, f2, f3, f4);
        }
    }

    /* renamed from: a */
    public void m5468a(float f, float f2, Runnable runnable, boolean z) {
        if (z) {
            this.f8167i.m5419a(f, f2, this.f8164f, runnable);
        } else {
            this.f8167i.m5404b(f, f2, this.f8164f, runnable);
        }
    }

    /* renamed from: d */
    public void mo3599d() {
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onKillFocus() {
    }

    /* renamed from: c */
    public static Bitmap m5461c(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(ItemInfo.APP_VERSION_CODE, ItemInfo.APP_VERSION_CODE, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(128.0f, 128.0f, 125.0f, paint);
        return createBitmap;
    }

    /* renamed from: j */
    private C0975i m5455j() {
        C0981k c0981k = new C0981k(this.f8168j.width * this.f8162d, this.f8168j.height * this.f8162d, false);
        c0981k.textures().addElement(this.f8168j);
        return c0981k;
    }

    /* renamed from: k */
    private void m5454k() {
        this.f8159a.visible(true);
        C1017d c1017d = new C1017d();
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.m10292n(1.0f);
        C1014c.m10326a(this.f8159a);
        C1014c.m10325a(this.f8159a, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: l */
    private void m5453l() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.c.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2478a.this.f8159a.visible(false);
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        c1017d.m10292n(0.0f);
        C1014c.m10326a(this.f8159a);
        C1014c.m10325a(this.f8159a, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: m */
    private void m5452m() {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(this.f8165g);
        c1017d.m10309b(this.f8166h);
        C1014c.m10326a(this.f8161c);
        C1014c.m10325a(this.f8161c, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: a */
    public void m5465a(boolean z) {
        if (z) {
            m5452m();
        } else {
            m5459f();
        }
        m5454k();
    }

    /* renamed from: e */
    public void m5460e() {
        m5459f();
    }

    /* renamed from: f */
    public void m5459f() {
        this.f8161c.alpha(this.f8165g);
    }

    /* renamed from: g */
    public void m5458g() {
        m5453l();
    }

    /* renamed from: h */
    public void m5457h() {
        this.f8159a.visible(false);
    }
}
