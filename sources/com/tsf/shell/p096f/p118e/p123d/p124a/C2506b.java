package com.tsf.shell.p096f.p118e.p123d.p124a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
/* renamed from: com.tsf.shell.f.e.d.a.b */
/* loaded from: classes.dex */
public class C2506b extends C0980j {

    /* renamed from: a */
    C2515a f8335a;

    /* renamed from: b */
    C2515a f8336b;

    /* renamed from: c */
    C2515a f8337c;

    /* renamed from: f */
    private C0980j f8340f;

    /* renamed from: e */
    private TextureElement f8339e = new TextureElement(0, false);

    /* renamed from: g */
    private float f8341g = 17.0f;

    /* renamed from: d */
    public boolean f8338d = false;

    public C2506b() {
        float f = C0892a.f2566b;
        scale().setAll(f, f, 1.0f);
        this.f8340f = new C0980j();
        this.f8335a = new C2515a();
        this.f8335a.moveAllPointsPX(-2.3f, 0.0f, 0.0f);
        this.f8335a.position().f2526x = 2.3f;
        this.f8335a.textures().addElement(this.f8339e);
        this.f8340f.addChild(this.f8335a);
        this.f8336b = new C2515a();
        this.f8336b.textures().addElement(this.f8339e);
        this.f8336b.position().f2527y = this.f8341g;
        this.f8340f.addChild(this.f8336b);
        this.f8337c = new C2515a();
        this.f8337c.textures().addElement(this.f8339e);
        this.f8337c.position().f2527y = -this.f8341g;
        this.f8340f.addChild(this.f8337c);
        addChild(this.f8340f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f8339e.f2529id == 0) {
            m5376a(-3355444);
        }
    }

    /* renamed from: a */
    public void m5377a() {
        InterfaceC1011b interfaceC1011b = C0986a.f2948c;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2506b.this.f8338d = true;
            }
        };
        c1017d.m10313a(interfaceC1011b);
        c1017d.m10294l(6.0f);
        c1017d.m10309b(50);
        C1014c.m10326a(this.f8335a);
        C1014c.m10325a(this.f8335a, 900, c1017d);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d2.m10313a(interfaceC1011b);
        c1017d2.mo10301f(10.0f);
        c1017d2.m10303e(-45.0f);
        c1017d2.m10294l(5.0f);
        c1017d2.mo10298h(14.0f);
        C1014c.m10326a(this.f8336b);
        C1014c.m10325a(this.f8336b, 900, c1017d2);
        C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d3.m10313a(interfaceC1011b);
        c1017d3.mo10301f(10.0f);
        c1017d3.m10303e(45.0f);
        c1017d3.m10294l(5.0f);
        c1017d3.mo10298h(-14.0f);
        C1014c.m10326a(this.f8337c);
        C1014c.m10325a(this.f8337c, 900, c1017d3);
        C1017d c1017d4 = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d4.m10313a(interfaceC1011b);
        c1017d4.m10294l(0.8f);
        c1017d4.m10293m(0.8f);
        c1017d4.m10292n(0.8f);
        c1017d4.m10303e(-180.0f);
        C1014c.m10326a(this.f8340f);
        C1014c.m10325a(this.f8340f, 900, c1017d4);
    }

    /* renamed from: b */
    public void m5375b() {
        InterfaceC1011b interfaceC1011b = C0986a.f2948c;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2506b.this.f8338d = false;
            }
        };
        c1017d.m10313a(interfaceC1011b);
        c1017d.m10294l(1.0f);
        c1017d.m10309b(50);
        C1014c.m10326a(this.f8335a);
        C1014c.m10325a(this.f8335a, 900, c1017d);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d2.m10313a(interfaceC1011b);
        c1017d2.mo10301f(0.0f);
        c1017d2.m10303e(0.0f);
        c1017d2.m10294l(1.0f);
        c1017d2.mo10298h(this.f8341g);
        C1014c.m10326a(this.f8336b);
        C1014c.m10325a(this.f8336b, 900, c1017d2);
        C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.7
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d3.m10313a(interfaceC1011b);
        c1017d3.mo10301f(0.0f);
        c1017d3.m10303e(0.0f);
        c1017d3.m10294l(1.0f);
        c1017d3.mo10298h(-this.f8341g);
        C1014c.m10326a(this.f8337c);
        C1014c.m10325a(this.f8337c, 900, c1017d3);
        C1017d c1017d4 = new C1017d() { // from class: com.tsf.shell.f.e.d.a.b.8
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d4.m10313a(interfaceC1011b);
        c1017d4.m10294l(1.0f);
        c1017d4.m10293m(1.0f);
        c1017d4.m10292n(1.0f);
        c1017d4.m10303e(0.0f);
        C1014c.m10326a(this.f8340f);
        C1014c.m10325a(this.f8340f, 900, c1017d4);
    }

    /* renamed from: a */
    private void m5376a(int i) {
        if (this.f8339e.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f8339e);
        }
        Bitmap createBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, 63.0f, 63.0f, paint);
        C0853a.m10853g().m10540a(this.f8339e, createBitmap);
        createBitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.d.a.b$a */
    /* loaded from: classes.dex */
    public class C2515a extends C0981k {
        public C2515a() {
            super(10.0f, 10.0f);
            m5374c(10.0f);
        }

        /* renamed from: c */
        public void m5374c(float f) {
            points().setPX(0, f / 2.0f, (-f) / 2.0f, 0.0f);
            points().setPX(1, (-f) / 2.0f, (-f) / 2.0f, 0.0f);
            points().setPX(2, f / 2.0f, f / 2.0f, 0.0f);
            points().setPX(3, (-f) / 2.0f, f / 2.0f, 0.0f);
        }
    }
}
