package com.tsf.shell.p096f.p118e.p127g;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.g.b */
/* loaded from: classes.dex */
public class C2588b extends C0980j {

    /* renamed from: c */
    private float f8538c = 26.0f * C0892a.f2567c;

    /* renamed from: a */
    private ArrayList<C2589a> f8536a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<C2589a> f8537b = new ArrayList<>();

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void measure() {
        m5224a();
        m5222b();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        boolean z;
        int numChildren = numChildren();
        if (getAnimationObjectState()) {
            boolean z2 = true;
            int i = 0;
            while (i < numChildren) {
                C2589a c2589a = this.f8536a.get(i);
                if (c2589a.f8541c) {
                    C2574a.C2575a c2575a = (C2574a.C2575a) getChildAt(i);
                    c2575a.position().f2526x += (c2589a.f8539a - c2575a.position().f2526x) * 0.15f;
                    c2575a.position().f2527y += (c2589a.f8540b - c2575a.position().f2527y) * 0.15f;
                    if (Math.abs(c2575a.position().f2526x - c2589a.f8539a) >= 0.2f || Math.abs(c2575a.position().f2527y - c2589a.f8540b) >= 0.2f) {
                        z = false;
                    } else {
                        c2575a.position().f2526x = c2589a.f8539a;
                        c2575a.position().f2527y = c2589a.f8540b;
                        c2589a.f8541c = false;
                        if (!c2575a.m5240f()) {
                            c2575a.visible(false);
                            z = z2;
                        }
                    }
                    i++;
                    z2 = z;
                }
                z = z2;
                i++;
                z2 = z;
            }
            if (z2) {
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        super.addChild(c0975i);
        this.f8536a.add(m5221c());
        m5224a();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        m5223a(this.f8536a.remove(0));
        m5224a();
        return removeChild;
    }

    /* renamed from: a */
    public void m5224a() {
        float f;
        int numChildren = numChildren();
        int i = 0;
        float f2 = 0.0f;
        while (i < numChildren) {
            C2574a.C2575a c2575a = (C2574a.C2575a) getChildAt(i);
            i++;
            f2 = c2575a.m5240f() ? (c2575a.maxX() - c2575a.minX()) + this.f8538c + f2 : f2;
        }
        int i2 = 0;
        float f3 = (-(f2 - this.f8538c)) / 2.0f;
        while (i2 < numChildren) {
            C2574a.C2575a c2575a2 = (C2574a.C2575a) getChildAt(i2);
            C2589a c2589a = this.f8536a.get(i2);
            c2575a2.visible(true);
            if (c2575a2.m5240f()) {
                c2589a.f8539a = f3 - c2575a2.minX();
                c2589a.f8540b = 0.0f;
                f = c2575a2.maxX() + c2589a.f8539a + this.f8538c;
                c2589a.f8541c = true;
            } else {
                c2589a.f8540b = -AbstractC2593d.MENU_HEIGHT;
                c2589a.f8541c = true;
                f = f3;
            }
            i2++;
            f3 = f;
        }
        setAnimationObjectState(true);
    }

    /* renamed from: b */
    public void m5222b() {
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            C2574a.C2575a c2575a = (C2574a.C2575a) getChildAt(i);
            C2589a c2589a = this.f8536a.get(i);
            c2589a.f8541c = false;
            c2575a.position().f2526x = c2589a.f8539a;
            c2575a.position().f2527y = c2589a.f8540b;
            if (!c2575a.m5240f()) {
                c2575a.visible(false);
            } else {
                c2575a.visible(true);
            }
        }
        setAnimationObjectState(false);
    }

    /* renamed from: c */
    private C2589a m5221c() {
        return this.f8537b.isEmpty() ? new C2589a() : this.f8537b.remove(0);
    }

    /* renamed from: a */
    private void m5223a(C2589a c2589a) {
        this.f8537b.add(c2589a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.g.b$a */
    /* loaded from: classes.dex */
    public class C2589a {

        /* renamed from: a */
        public float f8539a;

        /* renamed from: b */
        public float f8540b;

        /* renamed from: c */
        public boolean f8541c = false;

        C2589a() {
        }
    }
}
