package com.tsf.shell.widget.cubeclock;

import android.graphics.Bitmap;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.cubeclock.C4395o;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.tsf.shell.widget.cubeclock.k */
/* loaded from: classes.dex */
public class C4391k extends VObject3dContainer {

    /* renamed from: a */
    public int f14243a;

    /* renamed from: b */
    private C4385f f14244b;

    /* renamed from: c */
    private C4385f f14245c;

    /* renamed from: d */
    private C4385f f14246d;

    /* renamed from: e */
    private C4385f f14247e;

    /* renamed from: f */
    private C4392l f14248f;

    /* renamed from: g */
    private C4392l f14249g;

    /* renamed from: h */
    private C4389i f14250h;

    /* renamed from: i */
    private C4388h f14251i;

    /* renamed from: j */
    private C4407u f14252j;

    /* renamed from: k */
    private C4393m f14253k;

    /* renamed from: l */
    private boolean f14254l;

    /* renamed from: m */
    private C4372a f14255m;

    /* renamed from: n */
    private C4382c f14256n;

    /* renamed from: o */
    private int f14257o;

    /* renamed from: p */
    private int f14258p;

    /* renamed from: q */
    private int f14259q;

    /* renamed from: r */
    private int f14260r;

    /* renamed from: s */
    private int f14261s;

    /* renamed from: t */
    private int f14262t;

    /* renamed from: u */
    private int f14263u;

    /* renamed from: v */
    private Date f14264v = new Date();

    public C4391k(C4382c c4382c) {
        this.f14254l = false;
        this.f14256n = c4382c;
        this.f14256n.f14195c.addObject(this);
        scale().f2526x = this.f14256n.f14208p;
        scale().f2527y = this.f14256n.f14208p;
        scale().f2528z = this.f14256n.f14208p;
        this.f14254l = m46d();
        Bitmap m20a = C4404r.m20a(this.f14256n.f14193a, C4395o.C4396a.cube_clock_shadow);
        TextureElement createTexture = this.f14256n.f14194b.createTexture(m20a, true);
        m20a.recycle();
        VRectangle vRectangle = new VRectangle(600.0f / this.f14256n.f14207o, 256.0f / this.f14256n.f14207o);
        vRectangle.position().f2526x = 16.0f;
        vRectangle.position().f2527y = -16.0f;
        vRectangle.alpha(100);
        vRectangle.textures().addElement(createTexture);
        addChild(vRectangle);
        this.f14244b = new C4385f(this.f14256n);
        this.f14244b.position().f2526x = -204.0f;
        this.f14245c = new C4385f(this.f14256n);
        this.f14245c.position().f2526x = -68.0f;
        this.f14246d = new C4385f(this.f14256n);
        this.f14246d.position().f2526x = 68.0f;
        this.f14247e = new C4385f(this.f14256n);
        this.f14247e.position().f2526x = 204.0f;
        addChild(this.f14244b);
        addChild(this.f14247e);
        addChild(this.f14245c);
        addChild(this.f14246d);
        this.f14250h = new C4389i(this.f14256n);
        this.f14248f = new C4392l(this.f14256n);
        this.f14249g = new C4392l(this.f14256n);
        this.f14251i = new C4388h(this.f14256n);
        this.f14252j = new C4407u(this.f14256n);
        this.f14253k = new C4393m(this.f14256n);
        this.f14255m = new C4372a(this.f14256n);
        this.f14247e.m61a(this.f14255m, this.f14256n.f14198f);
        m51a(m52a());
    }

    /* renamed from: a */
    private int m52a() {
        return this.f14256n.f14209q.f14280b;
    }

    /* renamed from: b */
    private void m48b(int i) {
        this.f14256n.f14209q.f14280b = i;
        this.f14256n.f14209q.m36b();
    }

    /* renamed from: a */
    public void m51a(int i) {
        this.f14243a = i;
        switch (this.f14243a) {
            case 0:
                this.f14256n.f14202j.m28c(1000);
                m49b();
                break;
            case 1:
                this.f14256n.f14202j.m28c(60000);
                m47c();
                break;
        }
        m48b(this.f14243a);
        m50a(System.currentTimeMillis(), true);
    }

    /* renamed from: b */
    private void m49b() {
        this.f14244b.m61a(this.f14250h, this.f14256n.f14197e);
        this.f14245c.m61a(this.f14248f, this.f14256n.f14197e);
        this.f14246d.m61a(this.f14249g, this.f14256n.f14197e);
    }

    /* renamed from: c */
    private void m47c() {
        this.f14254l = m46d();
        if (this.f14254l) {
            this.f14244b.m61a(this.f14253k, this.f14256n.f14197e);
            this.f14245c.m61a(this.f14251i, this.f14256n.f14197e);
        } else {
            this.f14245c.m61a(this.f14253k, this.f14256n.f14197e);
            this.f14244b.m61a(this.f14251i, this.f14256n.f14197e);
        }
        this.f14246d.m61a(this.f14252j, this.f14256n.f14203k);
    }

    /* renamed from: d */
    private boolean m46d() {
        String string = Settings.System.getString(this.f14256n.f14193a.getContentResolver(), "date_format");
        if (TextUtils.isEmpty(string)) {
            C4390j.m53a("System format is Empty");
            string = ((SimpleDateFormat) DateFormat.getMediumDateFormat(this.f14256n.f14193a.getApplicationContext())).toLocalizedPattern();
            C4390j.m53a("Pattern String:" + string);
        } else {
            C4390j.m53a("System format not Empty");
        }
        C4390j.m53a("getSystemDateFormatMD :" + string);
        if (string.indexOf("d") < string.indexOf("M")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m50a(long j, boolean z) {
        this.f14264v.setTime(j);
        switch (this.f14243a) {
            case 0:
                int minutes = this.f14264v.getMinutes();
                int hours = this.f14264v.getHours();
                int seconds = this.f14264v.getSeconds();
                if (this.f14258p != minutes || z) {
                    this.f14258p = minutes;
                    this.f14248f.m70a(this.f14258p, 800);
                }
                if (this.f14260r != seconds || z) {
                    this.f14260r = seconds;
                    this.f14249g.m70a(this.f14260r, 500);
                }
                if (this.f14259q != hours || z) {
                    this.f14259q = hours;
                    this.f14250h.m70a(this.f14259q, 1000);
                }
                int i = this.f14259q >= 12 ? 0 : 1;
                C4390j.m53a("==============hou:" + this.f14259q);
                if (this.f14257o != i || z) {
                    this.f14257o = i;
                    this.f14255m.m70a(i, 900);
                    return;
                }
                return;
            case 1:
                int month = this.f14264v.getMonth();
                int date = this.f14264v.getDate();
                int day = this.f14264v.getDay();
                if (this.f14261s != month || z) {
                    this.f14261s = month;
                    this.f14253k.m70a(this.f14261s, 1000);
                }
                if (this.f14262t != date || z) {
                    this.f14262t = date;
                    this.f14251i.m70a(this.f14262t - 1, 800);
                }
                if (this.f14263u != day || z) {
                    this.f14263u = day;
                    this.f14252j.m70a(this.f14263u - 1, 500);
                }
                if (this.f14247e.m65a() != 3 || z) {
                    this.f14255m.m70a(3, 500);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
