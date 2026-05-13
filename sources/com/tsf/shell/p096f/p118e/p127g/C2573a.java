package com.tsf.shell.p096f.p118e.p127g;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0897d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.g.a */
/* loaded from: classes.dex */
public class C2573a extends C0980j {

    /* renamed from: a */
    private AbstractC2593d f8511a;

    /* renamed from: b */
    private C0895b f8512b;

    /* renamed from: c */
    private float f8513c;

    /* renamed from: e */
    private float f8515e;

    /* renamed from: f */
    private C0897d f8516f;

    /* renamed from: d */
    private float f8514d = C0892a.m10742a(20.0f);

    /* renamed from: g */
    private boolean f8517g = false;

    public C2573a(AbstractC2593d abstractC2593d, float f) {
        this.f8511a = abstractC2593d;
        this.f8513c = f;
    }

    /* renamed from: a */
    public void m5247a(ArrayList<C2578b> arrayList) {
        this.f8516f = new C0897d();
        this.f8512b = new C0895b();
        this.f8516f.m10704c(this.f8512b);
        addChild(this.f8516f);
        Iterator<C2578b> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f8512b.addChild(it.next().getTitleIcon());
        }
    }

    /* renamed from: a */
    public void m5250a() {
        this.f8512b.numChildren();
        float maxX = this.f8512b.maxX();
        this.f8515e = maxX;
        if (maxX < C0892a.f2553D) {
        }
    }

    /* renamed from: b */
    public void m5246b() {
        this.f8516f.setAABBPX(0.0f, (-AbstractC2593d.MENU_HEIGHT) / 2.0f, 0.0f, C0892a.f2553D, AbstractC2593d.MENU_HEIGHT / 2.0f, 0.0f);
        this.f8516f.m10687k();
        this.f8516f.position().f2526x = C0892a.f2590z;
        this.f8516f.m10720a(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f8515e < C0892a.f2553D) {
            this.f8517g = false;
            return;
        }
        this.f8517g = true;
        m5248a((C2578b) this.f8511a.getCurrentMenuItem(), false);
    }

    /* renamed from: a */
    public void m5249a(C2578b c2578b) {
        int numChildren = this.f8512b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            if (((C2602e) this.f8512b.getChildAt(i)) == c2578b.getTitleIcon()) {
                m5248a(c2578b, true);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m5248a(C2578b c2578b, boolean z) {
        if (this.f8517g) {
            float f = (-c2578b.getTitleIcon().position().f2526x) + (C0892a.f2553D / 2.0f);
            float f2 = 0.0f;
            float f3 = -(this.f8515e - C0892a.f2553D);
            if (f <= 0.0f) {
                f2 = f < f3 ? f3 : f;
            }
            this.f8516f.m10719a(f2, z);
        }
    }
}
