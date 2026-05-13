package com.tsf.shell.p096f.p107d.p110b.p111a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.d.b.a.a */
/* loaded from: classes.dex */
public class C2406a extends C0980j {

    /* renamed from: e */
    private float f7958e;

    /* renamed from: f */
    private float f7959f;

    /* renamed from: g */
    private float f7960g;

    /* renamed from: h */
    private InterfaceC2408a f7961h;

    /* renamed from: i */
    private C0981k f7962i;

    /* renamed from: a */
    private float f7954a = 0.0f;

    /* renamed from: b */
    private TextureElement f7955b = new TextureElement(0, false);

    /* renamed from: c */
    private TextureElement f7956c = new TextureElement(0, false);

    /* renamed from: d */
    private TextureElement f7957d = new TextureElement(0, false);

    /* renamed from: j */
    private int f7963j = 40;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.d.b.a.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2408a {
        /* renamed from: a */
        Bitmap mo5618a();

        /* renamed from: b */
        Bitmap mo5617b();
    }

    public C2406a(final int i, float f, float f2, float f3) {
        final int argb = Color.argb(Color.alpha(i), Color.red(i) / 2, Color.green(i) / 2, Color.blue(i) / 2);
        m5622a(new InterfaceC2408a() { // from class: com.tsf.shell.f.d.b.a.a.1
            @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2406a.InterfaceC2408a
            /* renamed from: a */
            public Bitmap mo5618a() {
                return C2406a.this.m5623a(i);
            }

            @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2406a.InterfaceC2408a
            /* renamed from: b */
            public Bitmap mo5617b() {
                return C2406a.this.m5623a(argb);
            }
        }, f, f2, f3);
    }

    /* renamed from: b */
    private void m5620b() {
        if (this.f7955b.f2529id == 0) {
            Bitmap mo5618a = this.f7961h.mo5618a();
            C0853a.m10853g().m10540a(this.f7955b, mo5618a);
            mo5618a.recycle();
        }
        if (this.f7956c.f2529id == 0) {
            Bitmap mo5617b = this.f7961h.mo5617b();
            C0853a.m10853g().m10540a(this.f7956c, mo5617b);
            mo5617b.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m5623a(int i) {
        int i2 = (int) (((6.283185307179586d * this.f7959f) * this.f7960g) / 360.0d);
        int i3 = (int) this.f7958e;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, i2 - 1, i3 - 1, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public void m5625a() {
        C0853a.m10853g().m10543a(this.f7955b);
        C0853a.m10853g().m10543a(this.f7956c);
        this.f7957d.f2529id = 0;
    }

    /* renamed from: a */
    private void m5622a(InterfaceC2408a interfaceC2408a, float f, float f2, float f3) {
        int i;
        float f4;
        float f5;
        this.f7958e = f;
        this.f7959f = f2;
        this.f7960g = f3;
        this.f7961h = interfaceC2408a;
        float f6 = this.f7958e / 2.0f;
        this.f7962i = new C0981k(0.0f, 0.0f, (this.f7963j / 2) - 1, 1, false);
        this.f7962i.textures().addElement(this.f7957d);
        addChild(this.f7962i);
        int size = this.f7962i.points().size();
        float f7 = 280.0f / ((size / 2.0f) - 1.0f);
        float f8 = size / 2.0f;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = (size - (i2 / 2)) - 1;
            if (i2 % 2 != 0) {
                i3 -= size / 2;
            }
            double radians = Math.toRadians(i * f7);
            float sin = (float) (Math.sin(radians) * this.f7959f);
            float cos = (float) (Math.cos(radians) * this.f7959f);
            float f9 = (i2 / 2) / f8;
            if (i2 % 2 == 0) {
                f5 = 0.0f;
                f4 = f6;
            } else {
                f4 = -f6;
                f5 = 1.0f;
            }
            this.f7962i.points().setPX(i3, cos, f4, sin);
            this.f7962i.uvs().set(i3, f9, f5);
        }
    }

    /* renamed from: a */
    public void m5624a(float f) {
        m5620b();
        this.f7957d.f2529id = this.f7955b.f2529id;
        this.f7962i.rotation().f2527y = f;
        dispatchDraw();
    }

    /* renamed from: b */
    public void m5619b(float f) {
        m5620b();
        this.f7957d.f2529id = this.f7956c.f2529id;
        this.f7962i.rotation().f2527y = f;
        dispatchDraw();
    }
}
