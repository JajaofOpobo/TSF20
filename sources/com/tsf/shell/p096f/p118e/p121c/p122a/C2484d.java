package com.tsf.shell.p096f.p118e.p121c.p122a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
/* renamed from: com.tsf.shell.f.e.c.a.d */
/* loaded from: classes.dex */
public class C2484d extends VObject3dContainer {

    /* renamed from: a */
    private C2482b f8194a;

    /* renamed from: b */
    private C2482b f8195b;

    /* renamed from: c */
    private C2483c f8196c;

    /* renamed from: d */
    private float f8197d = 64.0f;

    /* renamed from: e */
    private float f8198e = 128.0f;

    /* renamed from: f */
    private float f8199f = 15.0f;

    /* renamed from: g */
    private float f8200g = (this.f8197d + this.f8198e) * 2.0f;

    /* renamed from: h */
    private float f8201h = this.f8200g / 2.0f;

    /* renamed from: i */
    private float f8202i = 10.0f;

    /* renamed from: j */
    private float f8203j = this.f8200g + (this.f8202i * 2.0f);

    /* renamed from: k */
    private int f8204k = -13421773;

    /* renamed from: l */
    private float f8205l = 0.0f;

    /* renamed from: m */
    private VObject3dContainer f8206m;

    /* renamed from: n */
    private VObject3dContainer f8207n;

    /* renamed from: o */
    private TextureElement f8208o;

    public C2484d(Context context, float f, float f2, float f3, int i) {
        m5437a(f, f2, f3, i);
        m5432d();
    }

    /* renamed from: a */
    public float m5439a() {
        return this.f8198e;
    }

    /* renamed from: a */
    private void m5437a(float f, float f2, float f3, int i) {
        this.f8203j = f;
        this.f8200g = f - (this.f8202i * 2.0f);
        this.f8201h = this.f8200g / 2.0f;
        this.f8197d = (this.f8200g - (f2 * 2.0f)) / 2.0f;
        this.f8198e = f2;
        this.f8199f = f3;
        this.f8204k = i;
    }

    /* renamed from: a */
    public void m5438a(float f) {
        m5437a(f, this.f8198e, this.f8199f, this.f8204k);
        m5436b();
    }

    /* renamed from: b */
    public void m5436b() {
        C2485e m5442a = this.f8196c.m5442a(this.f8197d, this.f8198e, this.f8199f, this.f8204k);
        this.f8194a.m5446a(m5442a);
        this.f8195b.m5446a(m5442a);
        m5433c(0.0f);
    }

    /* renamed from: d */
    private void m5432d() {
        this.f8207n = new VObject3dContainer();
        addChild(this.f8207n);
        this.f8206m = new VObject3dContainer();
        this.f8207n.addChild(this.f8206m);
        this.f8196c = new C2483c();
        C2485e m5442a = this.f8196c.m5442a(this.f8197d, this.f8198e, this.f8199f, this.f8204k);
        this.f8194a = new C2482b(128.0f, m5442a);
        this.f8206m.addChild(this.f8194a);
        this.f8195b = new C2482b(128.0f, m5442a);
        this.f8206m.addChild(this.f8195b);
        this.f8206m.addChild(this.f8196c);
        m5433c(0.0f);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (this.f8208o == null) {
            m5430e();
        }
    }

    /* renamed from: e */
    private void m5430e() {
        if (this.f8208o == null) {
            this.f8208o = m5428f();
            this.f8194a.textures().addElement(this.f8208o);
            this.f8195b.textures().addElement(this.f8208o);
        }
    }

    /* renamed from: c */
    public void m5434c() {
        if (this.f8208o != null) {
            C0853a.m10853g().m10543a(this.f8208o);
            this.f8208o = null;
            this.f8194a.textures().removeAll();
            this.f8195b.textures().removeAll();
            this.f8196c.m5444a();
        }
    }

    /* renamed from: b */
    public void m5435b(float f) {
        this.f8205l = f;
    }

    /* renamed from: f */
    private TextureElement m5428f() {
        Bitmap createBitmap = Bitmap.createBitmap((int) (this.f8198e * 2.0f), (int) (this.f8198e * 2.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setColor(this.f8204k);
        paint.setAntiAlias(true);
        canvas.drawCircle(this.f8198e, this.f8198e, this.f8198e, paint);
        TextureElement m10544a = C0853a.m10853g().m10544a(createBitmap, true);
        createBitmap.recycle();
        return m10544a;
    }

    /* renamed from: c */
    public void m5433c(float f) {
        if (f < 0.0f) {
            this.f8207n.rotation().f2528z = 180.0f + this.f8205l;
            f *= -1.0f;
        } else {
            this.f8207n.rotation().f2528z = this.f8205l;
        }
        float m5431d = m5431d(f);
        this.f8195b.m5445b((m5431d * this.f8200g) + (-this.f8201h));
        float m5429e = m5429e(f);
        this.f8194a.m5445b((m5429e * this.f8200g) + (-this.f8201h));
        this.f8206m.position().f2526x = ((this.f8203j / 2.0f) - this.f8202i) + (this.f8202i * 2.0f * f);
        this.f8196c.m5441a(this.f8194a, this.f8195b);
    }

    /* renamed from: d */
    private float m5431d(float f) {
        float f2 = (f / 1.0f) - 1.0f;
        return 0.0f + (((f2 * f2 * f2) + 1.0f) * 1.0f);
    }

    /* renamed from: e */
    private float m5429e(float f) {
        float f2 = f / 1.0f;
        return 0.0f + (f2 * 1.0f * f2 * f2);
    }
}
