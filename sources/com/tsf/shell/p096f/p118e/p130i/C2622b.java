package com.tsf.shell.p096f.p118e.p130i;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.i.b */
/* loaded from: classes.dex */
public class C2622b extends C0980j {

    /* renamed from: a */
    private static final int f8626a = C0892a.m10735b(120.0f);

    /* renamed from: b */
    private static final int f8627b = C0892a.m10735b(32.0f);

    /* renamed from: c */
    private static final int f8628c = C0892a.m10735b(10.0f);

    /* renamed from: d */
    private static final int f8629d = C0892a.m10735b(15.0f);

    /* renamed from: e */
    private ArrayList<C2618a> f8630e = new ArrayList<>();

    public C2622b() {
        for (int i = 0; i < 5; i++) {
            this.f8630e.add(new C2618a());
        }
        int i2 = 1;
        float f = -f8626a;
        float f2 = -f8628c;
        float f3 = f8629d;
        int i3 = 3;
        float f4 = f8626a;
        float f5 = -f8628c;
        float f6 = -f8629d;
        this.f8630e.get(2).m5146a(0);
        while (i2 > -1) {
            C2618a c2618a = this.f8630e.get(i2);
            c2618a.m5146a(Math.abs(i2 - 2));
            c2618a.position().f2526x = f;
            c2618a.position().f2527y = f2;
            c2618a.m5147a(f3);
            f -= f8626a;
            i2--;
            f2 -= f8627b;
            f3 = f8629d + f3;
        }
        while (i3 < 5) {
            C2618a c2618a2 = this.f8630e.get(i3);
            c2618a2.m5146a(Math.abs(i3 - 2));
            c2618a2.position().f2526x = f4;
            c2618a2.position().f2527y = f5;
            c2618a2.m5147a(f6);
            f4 += f8626a;
            i3++;
            f5 -= f8627b;
            f6 -= f8629d;
        }
        Collections.sort(this.f8630e, new Comparator<C2618a>() { // from class: com.tsf.shell.f.e.i.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C2618a c2618a3, C2618a c2618a4) {
                if (c2618a3.m5148a() > c2618a4.m5148a()) {
                    return -1;
                }
                if (c2618a3.m5148a() < c2618a4.m5148a()) {
                    return 1;
                }
                return 0;
            }
        });
        Iterator<C2618a> it = this.f8630e.iterator();
        while (it.hasNext()) {
            addChild(it.next());
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        Iterator<C0975i> it = children().iterator();
        while (it.hasNext()) {
            C2618a c2618a = (C2618a) it.next();
            c2618a.f8618a.position().setAllFrom(c2618a.position());
            c2618a.f8618a.dispatchDraw();
        }
    }

    /* renamed from: a */
    public void m5136a() {
        C2618a.m5144b();
    }

    /* renamed from: b */
    public void m5135b() {
        Iterator<C2618a> it = this.f8630e.iterator();
        while (it.hasNext()) {
            it.next().m5141c();
        }
    }

    /* renamed from: c */
    public void m5134c() {
        m5135b();
        int i = 0;
        Iterator<C2618a> it = this.f8630e.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                it.next().m5143b(i2);
                i = i2 + 170;
            } else {
                return;
            }
        }
    }
}
