package com.tsf.shell.manager.action.toggle;

import android.content.Intent;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3225i;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3227j;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.action.toggle.b */
/* loaded from: classes.dex */
public class C3414b {

    /* renamed from: a */
    public int f11287a;

    /* renamed from: d */
    private boolean f11290d = false;

    /* renamed from: c */
    private C3227j f11289c = new C3227j(this);

    /* renamed from: b */
    public ArrayList<C3225i> f11288b = new ArrayList<>();

    public C3414b(int i) {
        this.f11287a = 0;
        this.f11287a = i;
    }

    /* renamed from: a */
    public C3227j m2609a() {
        this.f11290d = true;
        this.f11289c.m3090aW();
        return this.f11289c;
    }

    /* renamed from: b */
    public void m2605b() {
        this.f11290d = false;
        if (this.f11288b.isEmpty()) {
            this.f11289c.m3089aX();
        }
    }

    /* renamed from: c */
    public void mo2602c() {
    }

    /* renamed from: d */
    public void mo2601d() {
    }

    /* renamed from: a */
    public void mo2607a(Intent intent) {
    }

    /* renamed from: a */
    public void m2608a(int i) {
        this.f11289c.m3087b(i);
    }

    /* renamed from: b */
    public void m2604b(int i) {
        this.f11289c.m3085c(i);
    }

    /* renamed from: a */
    public void m2606a(C3225i c3225i) {
        if (!this.f11288b.contains(c3225i)) {
            this.f11288b.add(c3225i);
            if (this.f11288b.size() == 1) {
                m2599f();
            }
            c3225i.m3097a(this.f11289c);
        }
    }

    /* renamed from: b */
    public void m2603b(C3225i c3225i) {
        this.f11288b.remove(c3225i);
        c3225i.m3095aW();
        if (this.f11288b.isEmpty() && !this.f11290d) {
            m2600e();
        }
    }

    /* renamed from: e */
    public void m2600e() {
        this.f11289c.m3089aX();
        m2598g();
    }

    /* renamed from: f */
    public void m2599f() {
        this.f11289c.m3090aW();
    }

    /* renamed from: g */
    public void m2598g() {
    }
}
