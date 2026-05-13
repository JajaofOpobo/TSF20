package com.tsf.shell.widget.p200a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
/* renamed from: com.tsf.shell.widget.a.a */
/* loaded from: classes.dex */
public class C4192a extends C0980j {

    /* renamed from: A */
    private TextureElement f13507A;

    /* renamed from: B */
    private TextureElement f13508B;

    /* renamed from: D */
    private int f13510D;

    /* renamed from: E */
    private int f13511E;

    /* renamed from: F */
    private int f13512F;

    /* renamed from: G */
    private int f13513G;

    /* renamed from: H */
    private int f13514H;

    /* renamed from: I */
    private int f13515I;

    /* renamed from: J */
    private C0962a f13516J;

    /* renamed from: a */
    int f13517a;

    /* renamed from: c */
    public C4214c f13519c;

    /* renamed from: d */
    private VTextureManager f13520d;

    /* renamed from: f */
    private long f13522f;

    /* renamed from: g */
    private int f13523g;

    /* renamed from: h */
    private int f13524h;

    /* renamed from: i */
    private C4197a f13525i;

    /* renamed from: j */
    private C0962a f13526j;

    /* renamed from: k */
    private C4215d f13527k;

    /* renamed from: l */
    private C4215d f13528l;

    /* renamed from: m */
    private C4222i f13529m;

    /* renamed from: n */
    private C4222i f13530n;

    /* renamed from: o */
    private C4219g f13531o;

    /* renamed from: p */
    private C4219g f13532p;

    /* renamed from: x */
    private int f13540x;

    /* renamed from: y */
    private TextureElement f13541y;

    /* renamed from: z */
    private TextureElement f13542z;

    /* renamed from: e */
    private final int f13521e = 60;

    /* renamed from: b */
    public boolean f13518b = false;

    /* renamed from: q */
    private long f13533q = 0;

    /* renamed from: r */
    private long f13534r = 0;

    /* renamed from: s */
    private long f13535s = 0;

    /* renamed from: t */
    private ArrayList<C4223j> f13536t = new ArrayList<>();

    /* renamed from: u */
    private C4212b[] f13537u = new C4212b[60];

    /* renamed from: v */
    private int f13538v = -1;

    /* renamed from: w */
    private int f13539w = this.f13538v;

    /* renamed from: C */
    private Object f13509C = new Object();

    public C4192a(VTextureManager vTextureManager, C4214c c4214c) {
        this.f13520d = vTextureManager;
        this.f13519c = c4214c;
        m581a();
    }

    /* renamed from: a */
    public void m581a() {
        float XHDScale = VInformation.XHDScale();
        Bitmap m578a = m578a(this.f13538v, (int) (30.0f * XHDScale));
        this.f13508B = this.f13520d.createTexture(m578a, true);
        m578a.recycle();
        this.f13526j = new C0962a(60, 20, 20, 20, null, true);
        this.f13526j.textures().addElement(this.f13508B);
        for (int i = 0; i < 60; i++) {
            C0964b m10456a = this.f13526j.m10456a(i);
            this.f13537u[i] = new C4212b(m10456a, 250.0f, ((-6.0f) * i) + 90.0f);
            m10456a.m10428b(0, 0, 1, 1);
            m10456a.m10408h();
        }
        for (int i2 = 0; i2 < 60; i2 += 2) {
            C0964b m10456a2 = this.f13526j.m10456a(i2);
            int i3 = i2 + 3;
            if (i3 >= 60) {
                i3 %= 60;
            }
            C4218f.m501a("index:" + i2 + "  next:" + i3);
            this.f13536t.add(new C4223j(m10456a2, this.f13526j.m10456a(i3)));
        }
        this.f13526j.calAABB();
        this.f13540x = (int) m576a(this.f13526j.m10456a(0), this.f13526j.m10456a(3));
        Bitmap m577a = m577a(this.f13538v, this.f13540x, 4);
        this.f13541y = this.f13520d.createTexture(m577a, true);
        m577a.recycle();
        int size = this.f13536t.size();
        this.f13516J = new C0962a(size, 1, this.f13540x, 4, null, true);
        this.f13516J.textures().addElement(this.f13541y);
        for (int i4 = 0; i4 < size; i4++) {
            C0964b m10456a3 = this.f13516J.m10456a(i4);
            m10456a3.m10443a(0.0f);
            m10456a3.m10428b(0, 0, this.f13540x, 4);
            this.f13536t.get(i4).m492a(m10456a3);
        }
        Bitmap m571b = m571b(this.f13538v, (int) (12.0f * XHDScale), (int) (230.0f * XHDScale));
        this.f13542z = this.f13520d.createTexture(m571b, true);
        m571b.recycle();
        this.f13529m = new C4222i(12.0f, 230.0f);
        this.f13529m.textures().addElement(this.f13542z);
        this.f13529m.moveAllPointsPX(0.0f, 95.0f, 0.0f);
        Bitmap m571b2 = m571b(this.f13538v, (int) (16.0f * XHDScale), (int) (170.0f * XHDScale));
        this.f13507A = this.f13520d.createTexture(m571b2, true);
        m571b2.recycle();
        this.f13530n = new C4222i(16.0f, 170.0f);
        this.f13530n.textures().addElement(this.f13507A);
        this.f13530n.moveAllPointsPX(0.0f, 65.0f, 0.0f);
        this.f13530n.rotation().f2528z = 30.0f;
        this.f13531o = new C4219g(this.f13520d, 60, "  ");
        this.f13527k = new C4215d(60.0f, 60.0f);
        this.f13527k.position().f2527y = 300.0f;
        this.f13527k.textures().addElement(this.f13531o.f13638a);
        this.f13532p = new C4219g(this.f13520d, 50, "  ");
        this.f13528l = new C4215d(50.0f, 50.0f);
        this.f13528l.position().f2527y = 300.0f;
        this.f13528l.textures().addElement(this.f13532p.f13638a);
        scale().f2526x = XHDScale;
        scale().f2527y = XHDScale;
        scale().f2528z = XHDScale;
        addChild(this.f13516J);
        addChild(this.f13526j);
        addChild(this.f13529m);
        addChild(this.f13530n);
        addChild(this.f13527k);
        addChild(this.f13528l);
        calAABB();
        setAABBPX((-300.0f) * XHDScale, (-300.0f) * XHDScale, 0.0f, 300.0f * XHDScale, 300.0f * XHDScale, 0.0f);
        this.f13525i = new C4197a();
        this.f13525i.start();
        m572b(this.f13519c.f13621b);
        m574a(this.f13519c.f13620a);
    }

    /* renamed from: b */
    public void m573b() {
        this.f13518b = true;
        C1014c.m10322b(this.f13527k);
        C1014c.m10322b(this.f13528l);
    }

    /* renamed from: c */
    public void m569c() {
        this.f13518b = false;
        C1014c.m10319c(this.f13527k);
        C1014c.m10319c(this.f13528l);
        synchronized (this.f13509C) {
            this.f13509C.notifyAll();
        }
    }

    /* renamed from: d */
    public void m566d() {
        if (this.f13525i != null) {
            this.f13525i.m557a();
        }
        C0853a.m10853g().m10543a(this.f13541y);
        C0853a.m10853g().m10543a(this.f13542z);
        C0853a.m10853g().m10543a(this.f13507A);
        C0853a.m10853g().m10543a(this.f13508B);
        this.f13531o.m500a();
        this.f13532p.m500a();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        this.f13533q++;
        Iterator<C4223j> it = this.f13536t.iterator();
        while (it.hasNext()) {
            it.next().m493a(this.f13533q);
        }
        if (!this.f13518b) {
            this.f13522f = System.currentTimeMillis();
            int i = (int) ((this.f13522f / 1000) % 60);
            if (i != this.f13517a) {
                this.f13517a = i;
                m559i();
            }
            int i2 = (int) ((this.f13522f / 1000) / 60);
            if (i2 != this.f13523g) {
                this.f13523g = i2;
                m561g();
                int i3 = i2 / 60;
                if (i3 != this.f13524h) {
                    this.f13524h = i3;
                }
            }
        }
        m562f();
    }

    /* renamed from: a */
    private Bitmap m578a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, (i2 / 2.0f) - 2.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private Bitmap m577a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(1.0f, 1.0f, i2 - 1, i3 - 1, paint);
        return createBitmap;
    }

    /* renamed from: b */
    private Bitmap m571b(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        int i4 = i2 - 2;
        canvas.drawRect(1.0f, i4 / 2, i2 - 1, (i3 - 1) - (i4 / 2), paint);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, i4 / 2.0f, paint);
        canvas.drawCircle(i2 / 2.0f, i3 - (i4 / 2), i4 / 2.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private float m576a(C0964b c0964b, C0964b c0964b2) {
        float f = c0964b2.m10407i().f2526x - c0964b.m10407i().f2526x;
        float f2 = c0964b2.m10407i().f2527y - c0964b.m10407i().f2527y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: e */
    public void m564e() {
    }

    /* renamed from: a */
    public void m574a(boolean z) {
        if (z) {
            this.f13527k.visible(true);
            this.f13528l.visible(true);
            return;
        }
        this.f13527k.visible(false);
        this.f13528l.visible(false);
    }

    /* renamed from: b */
    private void m572b(int i) {
        this.f13539w = i;
        this.f13538v = i;
        int red = Color.red(this.f13539w);
        this.f13510D = red;
        this.f13513G = red;
        int green = Color.green(this.f13539w);
        this.f13511E = green;
        this.f13514H = green;
        int blue = Color.blue(this.f13539w);
        this.f13512F = blue;
        this.f13515I = blue;
        m568c(Color.argb(255, this.f13513G, this.f13514H, this.f13515I));
    }

    /* renamed from: a */
    public void m579a(int i) {
        this.f13539w = i;
        this.f13510D = Color.red(this.f13539w);
        this.f13511E = Color.green(this.f13539w);
        this.f13512F = Color.blue(this.f13539w);
    }

    /* renamed from: f */
    private void m562f() {
        float abs = Math.abs(this.f13511E - this.f13514H);
        float abs2 = Math.abs(this.f13512F - this.f13515I);
        if (Math.abs(this.f13510D - this.f13513G) > 1.0f || abs > 1.0f || abs2 > 1.0f) {
            invalidate();
            this.f13513G = (int) (((this.f13510D - this.f13513G) * 0.1f) + this.f13513G);
            this.f13514H = (int) (((this.f13511E - this.f13514H) * 0.1f) + this.f13514H);
            this.f13515I = (int) ((0.1f * (this.f13512F - this.f13515I)) + this.f13515I);
            m568c(Color.argb(255, this.f13513G, this.f13514H, this.f13515I));
        } else if (this.f13538v != this.f13539w) {
            this.f13513G = this.f13510D;
            this.f13514H = this.f13511E;
            this.f13515I = this.f13512F;
            this.f13538v = this.f13539w;
            C4218f.m501a("Widget Cube Slient First");
            m568c(Color.argb(255, this.f13513G, this.f13514H, this.f13515I));
        }
    }

    /* renamed from: c */
    private void m568c(int i) {
        this.f13538v = i;
        for (int i2 = 0; i2 < 60; i2++) {
            C0964b m10456a = this.f13526j.m10456a(i2);
            m10456a.f2830H.set(this.f13538v);
            m10456a.m10408h();
        }
        int m10447b = this.f13516J.m10447b();
        for (int i3 = 0; i3 < m10447b; i3++) {
            C0964b m10456a2 = this.f13516J.m10456a(i3);
            m10456a2.f2830H.set(this.f13538v);
            m10456a2.m10408h();
        }
        this.f13530n.m496a(this.f13538v);
        this.f13529m.m496a(this.f13538v);
        this.f13527k.m514a(this.f13538v);
        this.f13528l.m514a(this.f13538v);
    }

    /* renamed from: g */
    private void m561g() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        CharSequence format = DateFormat.format("h", calendar);
        int parseInt = Integer.parseInt(format.toString());
        CharSequence format2 = DateFormat.format("mm", calendar);
        int parseInt2 = Integer.parseInt(format2.toString());
        this.f13531o.m497a(format.toString());
        this.f13532p.m497a(format2.toString());
        float f = (((parseInt2 / 60.0f) * 360.0f) / 12.0f) + ((parseInt / 12.0f) * 360.0f);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.widget.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                C4192a.this.f13527k.m512c(C4192a.this.f13530n.rotation().f2528z + 90.0f);
            }
        };
        c1017d.m10303e(-f);
        c1017d.m10313a(C0986a.f2952g);
        C1014c.m10326a(this.f13530n);
        C1014c.m10325a(this.f13530n, 1500, c1017d);
        float f2 = (parseInt2 / 60.0f) * 360.0f;
        float f3 = 0.0f;
        if (m580a(f2, f) < 6.0f) {
            f3 = 50.0f;
        }
        final float m515a = this.f13528l.m515a();
        final float f4 = f3 - m515a;
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.widget.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f5) {
                C4192a.this.f13528l.m512c(C4192a.this.f13529m.rotation().f2528z + 90.0f);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f5) {
                C4192a.this.f13528l.m507e(m515a + (f4 * f5));
            }
        };
        c1017d2.m10303e(-f2);
        c1017d2.m10313a(C0986a.f2952g);
        C1014c.m10326a(this.f13529m);
        C1014c.m10325a(this.f13529m, 1500, c1017d2);
        m560h();
    }

    /* renamed from: a */
    private float m580a(float f, float f2) {
        float abs = Math.abs(f2 - f);
        return abs > 180.0f ? 360.0f - abs : abs;
    }

    /* renamed from: h */
    private void m560h() {
        if (this.f13533q >= this.f13535s) {
            this.f13534r = this.f13533q;
            this.f13535s = this.f13534r + 360;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int parseInt = Integer.parseInt(DateFormat.format("h", calendar).toString());
            int parseInt2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
            int abs = ((int) (Math.abs(Math.toDegrees((float) Math.toRadians((((-parseInt) * 30) + 90.0f) - (((parseInt2 / 60.0f) * 360.0f) / 12.0f))) - 90.0d) / 6.0f)) * 50;
            C4218f.m501a("delay:" + abs);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.widget.a.a.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C4192a.this.f13527k.m509d((float) (50.0d * Math.sin(f * 3.141592653589793d)));
                }
            };
            c1017d.m10309b(abs);
            C1014c.m10326a(this.f13527k);
            C1014c.m10325a(this.f13527k, 1000, c1017d);
            float radians = (float) Math.toRadians(90.0f - ((parseInt2 / 60.0f) * 360.0f));
            C4218f.m501a("minRadians delay:" + Math.toDegrees(radians));
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.widget.a.a.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C4192a.this.f13528l.m509d((float) (50.0d * Math.sin(f * 3.141592653589793d)));
                }
            };
            c1017d2.m10309b(((int) (Math.abs(Math.toDegrees(radians) - 90.0d) / 6.0f)) * 50);
            C1014c.m10326a(this.f13528l);
            C1014c.m10325a(this.f13528l, 1000, c1017d2);
            int size = this.f13536t.size();
            for (int i = 0; i < size; i++) {
                this.f13536t.get(i).m494a(i * 100, this.f13533q);
            }
        }
    }

    /* renamed from: i */
    private void m559i() {
        this.f13537u[this.f13517a].m522a();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.a.a$a */
    /* loaded from: classes.dex */
    public class C4197a extends Thread {

        /* renamed from: b */
        private boolean f13550b = false;

        C4197a() {
        }

        /* renamed from: a */
        public void m557a() {
            this.f13550b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (C4192a.this.f13509C) {
                    C4192a.this.invalidate();
                    C4218f.m501a("Timer Invalidate:" + C4192a.this.f13518b);
                    if (!this.f13550b) {
                        try {
                            if (C4192a.this.f13518b) {
                                C4192a.this.f13509C.wait();
                            } else {
                                C4192a.this.f13509C.wait(1000L);
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
