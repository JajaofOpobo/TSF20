package com.tsf.shell.p096f.p107d.p114d;

import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p107d.p114d.p115a.C2432b;
import com.tsf.shell.p096f.p107d.p114d.p115a.C2433c;
import com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a;
import com.tsf.shell.p096f.p131f.C2932g;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.d.a */
/* loaded from: classes.dex */
public class C2430a {

    /* renamed from: a */
    public ArrayList<InterfaceC2431a> f8011a;

    /* renamed from: b */
    public C2434b f8012b;

    /* renamed from: c */
    private InterfaceC2431a f8013c;

    /* renamed from: a */
    public void m5578a() {
        int i = 0;
        this.f8012b = new C2434b();
        this.f8011a = new ArrayList<>();
        this.f8011a.add(new C2432b(0));
        this.f8011a.add(new C2433c(1));
        int m2437o = C3430e.m2437o();
        if (m2437o >= 0) {
            i = m2437o > this.f8011a.size() + (-1) ? this.f8011a.size() - 1 : m2437o;
        }
        this.f8013c = this.f8011a.get(i);
    }

    /* renamed from: b */
    public boolean m5576b() {
        return this.f8013c instanceof C2433c;
    }

    /* renamed from: c */
    public void m5575c() {
        m5577a(this.f8011a.get(1));
    }

    /* renamed from: d */
    public void m5574d() {
        m5577a(this.f8011a.get(0));
    }

    /* renamed from: a */
    public boolean m5577a(InterfaceC2431a interfaceC2431a) {
        if (interfaceC2431a != this.f8013c) {
            if (this.f8013c != null) {
                this.f8013c.mo5565b();
            }
            this.f8013c = interfaceC2431a;
            C3430e.m2487c(interfaceC2431a.mo5563d());
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public InterfaceC2431a m5573e() {
        return this.f8013c;
    }

    /* renamed from: f */
    public void m5572f() {
        this.f8013c.mo5564c();
    }

    /* renamed from: g */
    public void m5571g() {
        C2932g m4031n = C3359a.f11094h.m4031n();
        if (m4031n != null) {
            m4031n.m4215ae();
            if (m4031n.m4212ah() != null) {
                m4031n.m4212ah().m4215ae();
            }
            if (m4031n.m4213ag() != null) {
                m4031n.m4213ag().m4215ae();
            }
        }
    }

    /* renamed from: h */
    public void m5570h() {
        if (C3359a.f11108v.f7768a.f9582a.m4343h().mo4143a()) {
            m5572f();
            m5571g();
        }
    }
}
