package com.tsf.shell.p096f.p153i;

import android.view.KeyEvent;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.a */
/* loaded from: classes.dex */
public class C3105a implements C0915b.InterfaceC0918a {

    /* renamed from: a */
    private C3550a.C3558a f10070a;

    /* renamed from: d */
    protected InterfaceC3106a f10073d;

    /* renamed from: e */
    public Object f10074e;

    /* renamed from: c */
    protected boolean f10072c = false;

    /* renamed from: b */
    protected ArrayList<C3231c> f10071b = new ArrayList<>();

    /* renamed from: com.tsf.shell.f.i.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3106a {
        /* renamed from: b */
        ArrayList<C0975i> mo2100b();
    }

    public C3105a(Object obj, InterfaceC3106a interfaceC3106a) {
        this.f10074e = obj;
        this.f10073d = interfaceC3106a;
    }

    /* renamed from: b */
    public Object m3567b() {
        return this.f10074e;
    }

    /* renamed from: c */
    public void m3565c() {
        this.f10071b.clear();
    }

    /* renamed from: a */
    public void m3569a(C0975i c0975i) {
        if (c0975i instanceof C3231c) {
            C3231c c3231c = (C3231c) c0975i;
            if (this.f10072c) {
                c3231c.m3070am();
            }
        }
    }

    /* renamed from: d */
    public boolean m3564d() {
        if (this.f10072c) {
            m3561g();
            return false;
        }
        m3562f();
        return true;
    }

    /* renamed from: e */
    public boolean m3563e() {
        return this.f10072c;
    }

    /* renamed from: f */
    public void m3562f() {
        if (C3359a.f11083A.m2213a() && !this.f10072c) {
            this.f10072c = true;
            C0915b.m10597a(this);
            Iterator<C0975i> it = this.f10073d.mo2100b().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3231c) {
                    ((C3231c) next).m3070am();
                }
            }
            m3559j();
            mo3298h();
        }
    }

    /* renamed from: j */
    private void m3559j() {
        this.f10070a = C3359a.f11103q.m2043a(this.f10070a, String.format(C4189x.m588c(C1306b.C1315i.text_multi_select_title), Integer.valueOf(this.f10071b.size())));
    }

    /* renamed from: k */
    private void m3558k() {
        C3359a.f11103q.m2037b(this.f10070a);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m3561g();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: g */
    public void m3561g() {
        if (this.f10072c) {
            m3558k();
            this.f10072c = false;
            C0915b.m10594b(this);
            Iterator<C0975i> it = this.f10073d.mo2100b().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3231c) {
                    ((C3231c) next).m3069an();
                }
            }
            mo3302a();
            this.f10071b.clear();
        }
    }

    /* renamed from: h */
    public void mo3298h() {
    }

    /* renamed from: a */
    public void mo3302a() {
    }

    /* renamed from: a */
    public void m3568a(C3231c c3231c) {
        this.f10071b.add(c3231c);
        m3559j();
    }

    /* renamed from: b */
    public void m3566b(C3231c c3231c) {
        this.f10071b.remove(c3231c);
        m3559j();
    }

    /* renamed from: i */
    public ArrayList<C3231c> m3560i() {
        return this.f10071b;
    }

    /* renamed from: c */
    public void mo3299c(C3112b c3112b) {
    }

    /* renamed from: b */
    public void mo3300b(C3112b c3112b) {
    }

    /* renamed from: a */
    public void mo2071a(C3112b c3112b) {
    }

    /* renamed from: a */
    public boolean mo3301a(AbstractC3208b abstractC3208b) {
        return true;
    }
}
