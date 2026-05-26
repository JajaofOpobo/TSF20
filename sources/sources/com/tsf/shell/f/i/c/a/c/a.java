package com.tsf.shell.f.i.c.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    private static a w;
    int a;
    private long d;
    private int e;
    private int f;
    private com.censivn.C3DEngine.b.f.a.a g;
    private d h;
    private d i;
    private int p;
    private com.censivn.C3DEngine.b.f.a.a v;
    private final int c = 30;
    public boolean b = false;
    private long j = 0;
    private long k = 0;
    private long l = 0;
    private ArrayList<e> m = new ArrayList<>();
    private b[] n = new b[30];
    private int o = -1;
    private TextureElement q = new TextureElement(0, false);
    private TextureElement r = new TextureElement(0, false);
    private TextureElement s = new TextureElement(0, false);
    private TextureElement t = new TextureElement(0, false);
    private Object u = new Object();

    public a() {
        a();
    }

    public void a() {
        float fXHDScale = VInformation.XHDScale();
        this.g = new com.censivn.C3DEngine.b.f.a.a(30, 40, 40, 40, null, false);
        this.g.textures().addElement(this.t);
        for (int i = 0; i < 30; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = this.g.a(i);
            this.n[i] = new b(bVarA, 250.0f, ((-12.0f) * i) + 90.0f);
            bVarA.b(0, 0, 1, 1);
            bVarA.h();
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 30) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b bVarA2 = this.g.a(i3);
            int i4 = i3 + 3;
            if (i4 >= 30) {
                i4 %= 30;
            }
            this.m.add(new e(bVarA2, this.g.a(i4)));
            i2 = i3 + 2;
        }
        this.g.calAABB();
        this.p = (int) a(this.g.a(0), this.g.a(3));
        int size = this.m.size();
        this.v = new com.censivn.C3DEngine.b.f.a.a(size, 1, this.p, 4, null, true);
        this.v.textures().addElement(this.q);
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.m.get(i5);
            com.censivn.C3DEngine.b.f.a.b bVarA3 = this.v.a(i5);
            bVarA3.a(0.0f);
            bVarA3.b(0, 0, this.p, 4);
            eVar.a(bVarA3);
        }
        this.h = new d(20.0f, 230.0f);
        this.h.textures().addElement(this.r);
        this.h.moveAllPointsPX(0.0f, 95.0f, 0.0f);
        this.i = new d(24.0f, 170.0f);
        this.i.textures().addElement(this.s);
        this.i.moveAllPointsPX(0.0f, 65.0f, 0.0f);
        this.i.rotation().z = 30.0f;
        scale().x = fXHDScale;
        scale().y = fXHDScale;
        scale().z = fXHDScale;
        addChild(this.v);
        addChild(this.g);
        addChild(this.h);
        addChild(this.i);
        calAABB();
        setAABBPX((-300.0f) * fXHDScale, (-300.0f) * fXHDScale, 0.0f, 300.0f * fXHDScale, 300.0f * fXHDScale, 0.0f);
    }

    public void b() {
        float fXHDScale = VInformation.XHDScale() * 0.45f;
        Bitmap bitmapA = a(this.o, (int) (40.0f * fXHDScale));
        com.censivn.C3DEngine.a.g().a(this.t, bitmapA);
        bitmapA.recycle();
        Bitmap bitmapA2 = a(this.o, this.p, 4);
        com.censivn.C3DEngine.a.g().a(this.q, bitmapA2);
        bitmapA2.recycle();
        Bitmap bitmapB = b(this.o, (int) (20.0f * fXHDScale), (int) (230.0f * fXHDScale));
        com.censivn.C3DEngine.a.g().a(this.r, bitmapB);
        bitmapB.recycle();
        Bitmap bitmapB2 = b(this.o, (int) (24.0f * fXHDScale), (int) (fXHDScale * 170.0f));
        com.censivn.C3DEngine.a.g().a(this.s, bitmapB2);
        bitmapB2.recycle();
    }

    public void c() {
        com.censivn.C3DEngine.a.g().a(this.q);
        com.censivn.C3DEngine.a.g().a(this.r);
        com.censivn.C3DEngine.a.g().a(this.s);
        com.censivn.C3DEngine.a.g().a(this.t);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        this.j++;
        Iterator<e> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().a(this.j);
        }
        if (!this.b) {
            this.d = System.currentTimeMillis();
            int i = (int) ((this.d / 1000) % 60);
            if (i != this.a) {
                this.a = i;
                g();
            }
            int i2 = (int) ((this.d / 1000) / 60);
            if (i2 != this.e) {
                this.e = i2;
                f();
                int i3 = i2 / 60;
                if (i3 != this.f) {
                    this.f = i3;
                }
            }
        }
    }

    private Bitmap a(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, (i2 / 2.0f) - 2.0f, paint);
        return bitmapCreateBitmap;
    }

    private Bitmap a(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, i2 - 1, i3 - 1, paint);
        return bitmapCreateBitmap;
    }

    private Bitmap b(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        int i4 = i2 - 2;
        canvas.drawRect(1.0f, i4 / 2, i2 - 1, (i3 - 1) - (i4 / 2), paint);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, i4 / 2.0f, paint);
        canvas.drawCircle(i2 / 2.0f, i3 - (i4 / 2), i4 / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    private float a(com.censivn.C3DEngine.b.f.a.b bVar, com.censivn.C3DEngine.b.f.a.b bVar2) {
        float f = bVar2.i().x - bVar.i().x;
        float f2 = bVar2.i().y - bVar.i().y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    private void f() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = Integer.parseInt(DateFormat.format("h", calendar).toString());
        int i2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
        float f = ((i / 12.0f) * 360.0f) + (((i2 / 60.0f) * 360.0f) / 12.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.c.a.c.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
            }
        };
        dVar.e(-f);
        dVar.a(com.censivn.C3DEngine.b.g.a.g);
        com.censivn.C3DEngine.b.g.c.a(this.i);
        com.censivn.C3DEngine.b.g.c.a(this.i, 1500, dVar);
        float f2 = (i2 / 60.0f) * 360.0f;
        if (Math.abs(f - f2) < 6.0f) {
        }
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.c.a.c.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f3) {
            }
        };
        dVar2.e(-f2);
        dVar2.a(com.censivn.C3DEngine.b.g.a.g);
        com.censivn.C3DEngine.b.g.c.a(this.h);
        com.censivn.C3DEngine.b.g.c.a(this.h, 1500, dVar2);
        d();
    }

    public void d() {
        if (this.j >= this.l) {
            this.k = this.j;
            this.l = this.k + 360;
            int size = this.m.size();
            for (int i = 0; i < size; i++) {
                this.m.get(i).a(i * 100, this.j);
            }
        }
    }

    private void g() {
        this.n[(int) ((this.a / 60.0f) * this.n.length)].a();
        invalidate();
    }

    public static a e() {
        if (w == null) {
            w = new a();
        }
        return w;
    }
}
