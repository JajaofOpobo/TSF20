package com.tsf.shell.p096f.p153i.p161c.p162a.p165c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.C0853a;
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
/* renamed from: com.tsf.shell.f.i.c.a.c.a */
/* loaded from: classes.dex */
public class C3285a extends C0980j {

    /* renamed from: w */
    private static C3285a f10831w;

    /* renamed from: a */
    int f10832a;

    /* renamed from: d */
    private long f10835d;

    /* renamed from: e */
    private int f10836e;

    /* renamed from: f */
    private int f10837f;

    /* renamed from: g */
    private C0962a f10838g;

    /* renamed from: h */
    private C3291d f10839h;

    /* renamed from: i */
    private C3291d f10840i;

    /* renamed from: p */
    private int f10847p;

    /* renamed from: v */
    private C0962a f10853v;

    /* renamed from: c */
    private final int f10834c = 30;

    /* renamed from: b */
    public boolean f10833b = false;

    /* renamed from: j */
    private long f10841j = 0;

    /* renamed from: k */
    private long f10842k = 0;

    /* renamed from: l */
    private long f10843l = 0;

    /* renamed from: m */
    private ArrayList<C3292e> f10844m = new ArrayList<>();

    /* renamed from: n */
    private C3288b[] f10845n = new C3288b[30];

    /* renamed from: o */
    private int f10846o = -1;

    /* renamed from: q */
    private TextureElement f10848q = new TextureElement(0, false);

    /* renamed from: r */
    private TextureElement f10849r = new TextureElement(0, false);

    /* renamed from: s */
    private TextureElement f10850s = new TextureElement(0, false);

    /* renamed from: t */
    private TextureElement f10851t = new TextureElement(0, false);

    /* renamed from: u */
    private Object f10852u = new Object();

    public C3285a() {
        a();
    }

    public void a() {
        float XHDScale = VInformation.XHDScale();
        this.f10838g = new C0962a(30, 40, 40, 40, null, false);
        this.f10838g.textures().addElement(this.f10851t);
        for (int i = 0; i < 30; i++) {
            C0964b m10456a = this.f10838g.m10456a(i);
            this.f10845n[i] = new C3288b(m10456a, 250.0f, ((-12.0f) * i) + 90.0f);
            m10456a.m10428b(0, 0, 1, 1);
            m10456a.m10408h();
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 30) {
                break;
            }
            C0964b m10456a2 = this.f10838g.m10456a(i3);
            int i4 = i3 + 3;
            if (i4 >= 30) {
                i4 %= 30;
            }
            this.f10844m.add(new C3292e(m10456a2, this.f10838g.m10456a(i4)));
            i2 = i3 + 2;
        }
        this.f10838g.calAABB();
        this.f10847p = (int) m2929a(this.f10838g.m10456a(0), this.f10838g.m10456a(3));
        int size = this.f10844m.size();
        this.f10853v = new C0962a(size, 1, this.f10847p, 4, null, true);
        this.f10853v.textures().addElement(this.f10848q);
        for (int i5 = 0; i5 < size; i5++) {
            C0964b m10456a3 = this.f10853v.m10456a(i5);
            m10456a3.m10443a(0.0f);
            m10456a3.m10428b(0, 0, this.f10847p, 4);
            this.f10844m.get(i5).m2914a(m10456a3);
        }
        this.f10839h = new C3291d(20.0f, 230.0f);
        this.f10839h.textures().addElement(this.f10849r);
        this.f10839h.moveAllPointsPX(0.0f, 95.0f, 0.0f);
        this.f10840i = new C3291d(24.0f, 170.0f);
        this.f10840i.textures().addElement(this.f10850s);
        this.f10840i.moveAllPointsPX(0.0f, 65.0f, 0.0f);
        this.f10840i.rotation().f2528z = 30.0f;
        scale().f2526x = XHDScale;
        scale().f2527y = XHDScale;
        scale().f2528z = XHDScale;
        addChild(this.f10853v);
        addChild(this.f10838g);
        addChild(this.f10839h);
        addChild(this.f10840i);
        calAABB();
        setAABBPX((-300.0f) * XHDScale, (-300.0f) * XHDScale, 0.0f, 300.0f * XHDScale, 300.0f * XHDScale, 0.0f);
    }

    /* renamed from: b */
    public void m2928b() {
        float XHDScale = VInformation.XHDScale() * 0.45f;
        Bitmap m2931a = m2931a(this.f10846o, (int) (40.0f * XHDScale));
        C0853a.m10853g().m10540a(this.f10851t, m2931a);
        m2931a.recycle();
        Bitmap m2930a = m2930a(this.f10846o, this.f10847p, 4);
        C0853a.m10853g().m10540a(this.f10848q, m2930a);
        m2930a.recycle();
        Bitmap m2927b = m2927b(this.f10846o, (int) (20.0f * XHDScale), (int) (230.0f * XHDScale));
        C0853a.m10853g().m10540a(this.f10849r, m2927b);
        m2927b.recycle();
        Bitmap m2927b2 = m2927b(this.f10846o, (int) (24.0f * XHDScale), (int) (XHDScale * 170.0f));
        C0853a.m10853g().m10540a(this.f10850s, m2927b2);
        m2927b2.recycle();
    }

    /* renamed from: c */
    public void m2926c() {
        C0853a.m10853g().m10543a(this.f10848q);
        C0853a.m10853g().m10543a(this.f10849r);
        C0853a.m10853g().m10543a(this.f10850s);
        C0853a.m10853g().m10543a(this.f10851t);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        this.f10841j++;
        Iterator<C3292e> it = this.f10844m.iterator();
        while (it.hasNext()) {
            it.next().m2915a(this.f10841j);
        }
        if (!this.f10833b) {
            this.f10835d = System.currentTimeMillis();
            int i = (int) ((this.f10835d / 1000) % 60);
            if (i != this.f10832a) {
                this.f10832a = i;
                m2922g();
            }
            int i2 = (int) ((this.f10835d / 1000) / 60);
            if (i2 != this.f10836e) {
                this.f10836e = i2;
                m2923f();
                int i3 = i2 / 60;
                if (i3 != this.f10837f) {
                    this.f10837f = i3;
                }
            }
        }
    }

    /* renamed from: a */
    private Bitmap m2931a(int i, int i2) {
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
    private Bitmap m2930a(int i, int i2, int i3) {
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
    private Bitmap m2927b(int i, int i2, int i3) {
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
    private float m2929a(C0964b c0964b, C0964b c0964b2) {
        float f = c0964b2.m10407i().f2526x - c0964b.m10407i().f2526x;
        float f2 = c0964b2.m10407i().f2527y - c0964b.m10407i().f2527y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: f */
    private void m2923f() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int parseInt = Integer.parseInt(DateFormat.format("h", calendar).toString());
        int parseInt2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
        float f = ((parseInt / 12.0f) * 360.0f) + (((parseInt2 / 60.0f) * 360.0f) / 12.0f);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.c.a.c.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
            }
        };
        c1017d.m10303e(-f);
        c1017d.m10313a(C0986a.f2952g);
        C1014c.m10326a(this.f10840i);
        C1014c.m10325a(this.f10840i, 1500, c1017d);
        float f2 = (parseInt2 / 60.0f) * 360.0f;
        if (Math.abs(f - f2) < 6.0f) {
        }
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.i.c.a.c.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f3) {
            }
        };
        c1017d2.m10303e(-f2);
        c1017d2.m10313a(C0986a.f2952g);
        C1014c.m10326a(this.f10839h);
        C1014c.m10325a(this.f10839h, 1500, c1017d2);
        m2925d();
    }

    /* renamed from: d */
    public void m2925d() {
        if (this.f10841j >= this.f10843l) {
            this.f10842k = this.f10841j;
            this.f10843l = this.f10842k + 360;
            int size = this.f10844m.size();
            for (int i = 0; i < size; i++) {
                this.f10844m.get(i).m2916a(i * 100, this.f10841j);
            }
        }
    }

    /* renamed from: g */
    private void m2922g() {
        this.f10845n[(int) ((this.f10832a / 60.0f) * this.f10845n.length)].m2921a();
        invalidate();
    }

    /* renamed from: e */
    public static C3285a m2924e() {
        if (f10831w == null) {
            f10831w = new C3285a();
        }
        return f10831w;
    }
}
