package com.tsf.shell.widget.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.censivn.C3DEngine.b.f.j {
    private TextureElement A;
    private TextureElement B;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private com.censivn.C3DEngine.b.f.a.a J;
    int a;
    public c c;
    private VTextureManager d;
    private long f;
    private int g;
    private int h;
    private C0169a i;
    private com.censivn.C3DEngine.b.f.a.a j;
    private d k;
    private d l;
    private i m;
    private i n;
    private g o;
    private g p;
    private int x;
    private TextureElement y;
    private TextureElement z;
    private final int e = 60;
    public boolean b = false;
    private long q = 0;
    private long r = 0;
    private long s = 0;
    private ArrayList<j> t = new ArrayList<>();
    private b[] u = new b[60];
    private int v = -1;
    private int w = this.v;
    private Object C = new Object();

    public a(VTextureManager vTextureManager, c cVar) {
        this.d = vTextureManager;
        this.c = cVar;
        a();
    }

    public void a() {
        float fXHDScale = VInformation.XHDScale();
        Bitmap bitmapA = a(this.v, (int) (30.0f * fXHDScale));
        this.B = this.d.createTexture(bitmapA, true);
        bitmapA.recycle();
        this.j = new com.censivn.C3DEngine.b.f.a.a(60, 20, 20, 20, null, true);
        this.j.textures().addElement(this.B);
        for (int i = 0; i < 60; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = this.j.a(i);
            this.u[i] = new b(bVarA, 250.0f, ((-6.0f) * i) + 90.0f);
            bVarA.b(0, 0, 1, 1);
            bVarA.h();
        }
        for (int i2 = 0; i2 < 60; i2 += 2) {
            com.censivn.C3DEngine.b.f.a.b bVarA2 = this.j.a(i2);
            int i3 = i2 + 3;
            if (i3 >= 60) {
                i3 %= 60;
            }
            f.a("index:" + i2 + "  next:" + i3);
            this.t.add(new j(bVarA2, this.j.a(i3)));
        }
        this.j.calAABB();
        this.x = (int) a(this.j.a(0), this.j.a(3));
        Bitmap bitmapA2 = a(this.v, this.x, 4);
        this.y = this.d.createTexture(bitmapA2, true);
        bitmapA2.recycle();
        int size = this.t.size();
        this.J = new com.censivn.C3DEngine.b.f.a.a(size, 1, this.x, 4, null, true);
        this.J.textures().addElement(this.y);
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = this.t.get(i4);
            com.censivn.C3DEngine.b.f.a.b bVarA3 = this.J.a(i4);
            bVarA3.a(0.0f);
            bVarA3.b(0, 0, this.x, 4);
            jVar.a(bVarA3);
        }
        Bitmap bitmapB = b(this.v, (int) (12.0f * fXHDScale), (int) (230.0f * fXHDScale));
        this.z = this.d.createTexture(bitmapB, true);
        bitmapB.recycle();
        this.m = new i(12.0f, 230.0f);
        this.m.textures().addElement(this.z);
        this.m.moveAllPointsPX(0.0f, 95.0f, 0.0f);
        Bitmap bitmapB2 = b(this.v, (int) (16.0f * fXHDScale), (int) (170.0f * fXHDScale));
        this.A = this.d.createTexture(bitmapB2, true);
        bitmapB2.recycle();
        this.n = new i(16.0f, 170.0f);
        this.n.textures().addElement(this.A);
        this.n.moveAllPointsPX(0.0f, 65.0f, 0.0f);
        this.n.rotation().z = 30.0f;
        this.o = new g(this.d, 60, "  ");
        this.k = new d(60.0f, 60.0f);
        this.k.position().y = 300.0f;
        this.k.textures().addElement(this.o.a);
        this.p = new g(this.d, 50, "  ");
        this.l = new d(50.0f, 50.0f);
        this.l.position().y = 300.0f;
        this.l.textures().addElement(this.p.a);
        scale().x = fXHDScale;
        scale().y = fXHDScale;
        scale().z = fXHDScale;
        addChild(this.J);
        addChild(this.j);
        addChild(this.m);
        addChild(this.n);
        addChild(this.k);
        addChild(this.l);
        calAABB();
        setAABBPX((-300.0f) * fXHDScale, (-300.0f) * fXHDScale, 0.0f, 300.0f * fXHDScale, 300.0f * fXHDScale, 0.0f);
        this.i = new C0169a();
        this.i.start();
        b(this.c.b);
        a(this.c.a);
    }

    public void b() {
        this.b = true;
        com.censivn.C3DEngine.b.g.c.b(this.k);
        com.censivn.C3DEngine.b.g.c.b(this.l);
    }

    public void c() {
        this.b = false;
        com.censivn.C3DEngine.b.g.c.c(this.k);
        com.censivn.C3DEngine.b.g.c.c(this.l);
        synchronized (this.C) {
            this.C.notifyAll();
        }
    }

    public void d() {
        if (this.i != null) {
            this.i.a();
        }
        com.censivn.C3DEngine.a.g().a(this.y);
        com.censivn.C3DEngine.a.g().a(this.z);
        com.censivn.C3DEngine.a.g().a(this.A);
        com.censivn.C3DEngine.a.g().a(this.B);
        this.o.a();
        this.p.a();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        this.q++;
        Iterator<j> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().a(this.q);
        }
        if (!this.b) {
            this.f = System.currentTimeMillis();
            int i = (int) ((this.f / 1000) % 60);
            if (i != this.a) {
                this.a = i;
                i();
            }
            int i2 = (int) ((this.f / 1000) / 60);
            if (i2 != this.g) {
                this.g = i2;
                g();
                int i3 = i2 / 60;
                if (i3 != this.h) {
                    this.h = i3;
                }
            }
        }
        f();
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

    public void e() {
    }

    public void a(boolean z) {
        if (z) {
            this.k.visible(true);
            this.l.visible(true);
        } else {
            this.k.visible(false);
            this.l.visible(false);
        }
    }

    private void b(int i) {
        this.w = i;
        this.v = i;
        int iRed = Color.red(this.w);
        this.D = iRed;
        this.G = iRed;
        int iGreen = Color.green(this.w);
        this.E = iGreen;
        this.H = iGreen;
        int iBlue = Color.blue(this.w);
        this.F = iBlue;
        this.I = iBlue;
        c(Color.argb(255, this.G, this.H, this.I));
    }

    public void a(int i) {
        this.w = i;
        this.D = Color.red(this.w);
        this.E = Color.green(this.w);
        this.F = Color.blue(this.w);
    }

    private void f() {
        float fAbs = Math.abs(this.D - this.G);
        float fAbs2 = Math.abs(this.E - this.H);
        float fAbs3 = Math.abs(this.F - this.I);
        if (fAbs > 1.0f || fAbs2 > 1.0f || fAbs3 > 1.0f) {
            invalidate();
            this.G = (int) (((this.D - this.G) * 0.1f) + this.G);
            this.H = (int) (((this.E - this.H) * 0.1f) + this.H);
            this.I = (int) ((0.1f * (this.F - this.I)) + this.I);
            c(Color.argb(255, this.G, this.H, this.I));
            return;
        }
        if (this.v != this.w) {
            this.G = this.D;
            this.H = this.E;
            this.I = this.F;
            this.v = this.w;
            f.a("Widget Cube Slient First");
            c(Color.argb(255, this.G, this.H, this.I));
        }
    }

    private void c(int i) {
        this.v = i;
        for (int i2 = 0; i2 < 60; i2++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = this.j.a(i2);
            bVarA.H.set(this.v);
            bVarA.h();
        }
        int iB = this.J.b();
        for (int i3 = 0; i3 < iB; i3++) {
            com.censivn.C3DEngine.b.f.a.b bVarA2 = this.J.a(i3);
            bVarA2.H.set(this.v);
            bVarA2.h();
        }
        this.n.a(this.v);
        this.m.a(this.v);
        this.k.a(this.v);
        this.l.a(this.v);
    }

    private void g() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        CharSequence charSequence = DateFormat.format("h", calendar);
        int i = Integer.parseInt(charSequence.toString());
        CharSequence charSequence2 = DateFormat.format("mm", calendar);
        int i2 = Integer.parseInt(charSequence2.toString());
        this.o.a(charSequence.toString());
        this.p.a(charSequence2.toString());
        float f = (((i2 / 60.0f) * 360.0f) / 12.0f) + ((i / 12.0f) * 360.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.widget.a.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                a.this.k.c(a.this.n.rotation().z + 90.0f);
            }
        };
        dVar.e(-f);
        dVar.a(com.censivn.C3DEngine.b.g.a.g);
        com.censivn.C3DEngine.b.g.c.a(this.n);
        com.censivn.C3DEngine.b.g.c.a(this.n, 1500, dVar);
        float f2 = (i2 / 60.0f) * 360.0f;
        float f3 = 0.0f;
        if (a(f2, f) < 6.0f) {
            f3 = 50.0f;
        }
        final float fA = this.l.a();
        final float f4 = f3 - fA;
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.widget.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f5) {
                a.this.l.c(a.this.m.rotation().z + 90.0f);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f5) {
                a.this.l.e(fA + (f4 * f5));
            }
        };
        dVar2.e(-f2);
        dVar2.a(com.censivn.C3DEngine.b.g.a.g);
        com.censivn.C3DEngine.b.g.c.a(this.m);
        com.censivn.C3DEngine.b.g.c.a(this.m, 1500, dVar2);
        h();
    }

    private float a(float f, float f2) {
        float fAbs = Math.abs(f2 - f);
        return fAbs > 180.0f ? 360.0f - fAbs : fAbs;
    }

    private void h() {
        if (this.q >= this.s) {
            this.r = this.q;
            this.s = this.r + 360;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i = Integer.parseInt(DateFormat.format("h", calendar).toString());
            int i2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
            int iAbs = ((int) (Math.abs(Math.toDegrees((float) Math.toRadians((((-i) * 30) + 90.0f) - (((i2 / 60.0f) * 360.0f) / 12.0f))) - 90.0d) / ((double) 6.0f))) * 50;
            f.a("delay:" + iAbs);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.widget.a.a.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    a.this.k.d((float) (50.0d * Math.sin(((double) f) * 3.141592653589793d)));
                }
            };
            dVar.b(iAbs);
            com.censivn.C3DEngine.b.g.c.a(this.k);
            com.censivn.C3DEngine.b.g.c.a(this.k, 1000, dVar);
            float radians = (float) Math.toRadians(90.0f - ((i2 / 60.0f) * 360.0f));
            int iAbs2 = ((int) (Math.abs(Math.toDegrees(radians) - 90.0d) / ((double) 6.0f))) * 50;
            f.a("minRadians delay:" + Math.toDegrees(radians));
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.widget.a.a.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    a.this.l.d((float) (50.0d * Math.sin(((double) f) * 3.141592653589793d)));
                }
            };
            dVar2.b(iAbs2);
            com.censivn.C3DEngine.b.g.c.a(this.l);
            com.censivn.C3DEngine.b.g.c.a(this.l, 1000, dVar2);
            int size = this.t.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.t.get(i3).a(i3 * 100, this.q);
            }
        }
    }

    private void i() {
        this.u[this.a].a();
        invalidate();
    }

    /* JADX INFO: renamed from: com.tsf.shell.widget.a.a$a, reason: collision with other inner class name */
    class C0169a extends Thread {
        private boolean b = false;

        C0169a() {
        }

        public void a() {
            this.b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (a.this.C) {
                    a.this.invalidate();
                    f.a("Timer Invalidate:" + a.this.b);
                    if (!this.b) {
                        try {
                            if (a.this.b) {
                                a.this.C.wait();
                            } else {
                                a.this.C.wait(1000L);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
