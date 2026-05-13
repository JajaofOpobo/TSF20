package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.cubeclock.o;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class k extends VObject3dContainer {
    public int a;
    private f b;
    private f c;
    private f d;
    private f e;
    private l f;
    private l g;
    private i h;
    private h i;
    private u j;
    private m k;
    private boolean l;
    private a m;
    private c n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private Date v = new Date();

    public k(c cVar) {
        this.l = false;
        this.n = cVar;
        this.n.c.addObject(this);
        scale().x = this.n.p;
        scale().y = this.n.p;
        scale().z = this.n.p;
        this.l = d();
        Bitmap a = r.a(this.n.a, o.a.cube_clock_shadow);
        TextureElement createTexture = this.n.b.createTexture(a, true);
        a.recycle();
        VRectangle vRectangle = new VRectangle(600.0f / this.n.o, 256.0f / this.n.o);
        vRectangle.position().x = 16.0f;
        vRectangle.position().y = -16.0f;
        vRectangle.alpha(100);
        vRectangle.textures().addElement(createTexture);
        addChild(vRectangle);
        this.b = new f(this.n);
        this.b.position().x = -204.0f;
        this.c = new f(this.n);
        this.c.position().x = -68.0f;
        this.d = new f(this.n);
        this.d.position().x = 68.0f;
        this.e = new f(this.n);
        this.e.position().x = 204.0f;
        addChild(this.b);
        addChild(this.e);
        addChild(this.c);
        addChild(this.d);
        this.h = new i(this.n);
        this.f = new l(this.n);
        this.g = new l(this.n);
        this.i = new h(this.n);
        this.j = new u(this.n);
        this.k = new m(this.n);
        this.m = new a(this.n);
        this.e.a(this.m, this.n.f);
        a(a());
    }

    private int a() {
        return this.n.q.b;
    }

    private void b(int i) {
        this.n.q.b = i;
        this.n.q.b();
    }

    public void a(int i) {
        this.a = i;
        switch (this.a) {
            case 0:
                this.n.j.c(1000);
                b();
                break;
            case 1:
                this.n.j.c(60000);
                c();
                break;
        }
        b(this.a);
        a(System.currentTimeMillis(), true);
    }

    private void b() {
        this.b.a(this.h, this.n.e);
        this.c.a(this.f, this.n.e);
        this.d.a(this.g, this.n.e);
    }

    private void c() {
        this.l = d();
        if (this.l) {
            this.b.a(this.k, this.n.e);
            this.c.a(this.i, this.n.e);
        } else {
            this.c.a(this.k, this.n.e);
            this.b.a(this.i, this.n.e);
        }
        this.d.a(this.j, this.n.k);
    }

    private boolean d() {
        String string = Settings.System.getString(this.n.a.getContentResolver(), "date_format");
        if (TextUtils.isEmpty(string)) {
            j.a("System format is Empty");
            string = ((SimpleDateFormat) DateFormat.getMediumDateFormat(this.n.a.getApplicationContext())).toLocalizedPattern();
            j.a("Pattern String:" + string);
        } else {
            j.a("System format not Empty");
        }
        j.a("getSystemDateFormatMD :" + string);
        if (string.indexOf("d") < string.indexOf("M")) {
            return false;
        }
        return true;
    }

    public void a(long j, boolean z) {
        this.v.setTime(j);
        switch (this.a) {
            case 0:
                int minutes = this.v.getMinutes();
                int hours = this.v.getHours();
                int seconds = this.v.getSeconds();
                if (this.p != minutes || z) {
                    this.p = minutes;
                    this.f.a(this.p, 800);
                }
                if (this.r != seconds || z) {
                    this.r = seconds;
                    this.g.a(this.r, 500);
                }
                if (this.q != hours || z) {
                    this.q = hours;
                    this.h.a(this.q, 1000);
                }
                int i = this.q >= 12 ? 0 : 1;
                j.a("==============hou:" + this.q);
                if (this.o != i || z) {
                    this.o = i;
                    this.m.a(i, 900);
                    return;
                }
                return;
            case 1:
                int month = this.v.getMonth();
                int date = this.v.getDate();
                int day = this.v.getDay();
                if (this.s != month || z) {
                    this.s = month;
                    this.k.a(this.s, 1000);
                }
                if (this.t != date || z) {
                    this.t = date;
                    this.i.a(this.t - 1, 800);
                }
                if (this.u != day || z) {
                    this.u = day;
                    this.j.a(this.u - 1, 500);
                }
                if (this.e.a() != 3 || z) {
                    this.m.a(3, 500);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
