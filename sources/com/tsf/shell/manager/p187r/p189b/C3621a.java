package com.tsf.shell.manager.p187r.p189b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p187r.p189b.p190a.C3623a;
import com.tsf.shell.manager.p187r.p189b.p192c.C3673g;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.r.b.a */
/* loaded from: classes.dex */
public class C3621a extends AbstractC2593d {

    /* renamed from: a */
    public C3623a f11999a;

    /* renamed from: b */
    public C3673g f12000b;

    /* renamed from: c */
    public C3637b f12001c;

    /* renamed from: d */
    public C3680d f12002d;

    /* renamed from: e */
    public C3690e f12003e;

    /* renamed from: f */
    public boolean f12004f;

    /* renamed from: g */
    private C3622a f12005g;

    /* renamed from: com.tsf.shell.manager.r.b.a$a */
    /* loaded from: classes.dex */
    public static class C3622a {
        /* renamed from: a */
        public void mo1857a() {
        }

        /* renamed from: a */
        public void mo1856a(AbstractC3208b abstractC3208b) {
        }

        /* renamed from: b */
        public C3560a mo1854b() {
            return null;
        }
    }

    public C3621a() {
        super(800.0f * C0892a.f2567c);
        this.f12004f = false;
        ArrayList<C2578b> arrayList = new ArrayList<>();
        this.f12003e = new C3690e(this, C4189x.m588c(C1306b.C1315i.group_toggle));
        this.f11999a = new C3623a(this, C4189x.m588c(C1306b.C1315i.group_applications));
        this.f12000b = new C3673g(this, C4189x.m588c(C1306b.C1315i.group_widgets));
        this.f12001c = new C3637b(this, C4189x.m588c(C1306b.C1315i.widget_menu_decoration));
        this.f12002d = new C3680d(this, C4189x.m588c(C1306b.C1315i.group_shortcuts));
        arrayList.add(this.f12003e);
        arrayList.add(this.f11999a);
        arrayList.add(this.f12000b);
        arrayList.add(this.f12001c);
        arrayList.add(this.f12002d);
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void show(int i) {
        this.f12004f = false;
        this.f12003e.disable();
        this.f12001c.enable();
        this.f12000b.enable();
        super.show(i);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void show() {
        this.f12004f = false;
        this.f12003e.disable();
        this.f12001c.enable();
        this.f12000b.enable();
        super.show();
    }

    /* renamed from: a */
    public void m1859a(C3622a c3622a) {
        this.f12005g = c3622a;
        this.f12004f = true;
        this.f12003e.enable();
        this.f12001c.disable();
        this.f12000b.disable();
        super.show();
    }

    /* renamed from: a */
    public boolean m1860a() {
        return this.f12004f;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onHide() {
        if (this.f12005g != null) {
            this.f12005g.mo1857a();
            this.f12005g = null;
        }
    }

    /* renamed from: b */
    public C3622a m1858b() {
        return this.f12005g;
    }
}
