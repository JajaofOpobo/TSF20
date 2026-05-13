package com.censivn.C3DEngine.p057e;

import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p057e.AbstractC1084a;
import com.censivn.C3DEngine.p058f.C1106d;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.censivn.C3DEngine.e.g */
/* loaded from: classes.dex */
public class C1098g {

    /* renamed from: a */
    protected ArrayList<C1099h> f3510a;

    /* renamed from: b */
    protected int f3511b;

    /* renamed from: c */
    protected ArrayList<Number3d> f3512c;

    /* renamed from: d */
    protected ArrayList<C0879Uv> f3513d;

    /* renamed from: e */
    protected ArrayList<Number3d> f3514e;

    /* renamed from: f */
    public String f3515f;

    public C1098g() {
        this.f3511b = 0;
        this.f3512c = new ArrayList<>();
        this.f3513d = new ArrayList<>();
        this.f3514e = new ArrayList<>();
        this.f3515f = "";
        this.f3510a = new ArrayList<>();
    }

    public C1098g(ArrayList<Number3d> arrayList, ArrayList<C0879Uv> arrayList2, ArrayList<Number3d> arrayList3) {
        this.f3511b = 0;
        this.f3512c = arrayList;
        this.f3513d = arrayList2;
        this.f3514e = arrayList3;
        this.f3515f = "";
        this.f3510a = new ArrayList<>();
    }

    /* renamed from: a */
    public C0975i m9865a(HashMap<String, AbstractC1084a.C1087b> hashMap, AbstractC1084a.C1088c c1088c) {
        C0980j c0980j = new C0980j(this.f3511b * 3, this.f3511b);
        c0980j.name(this.f3515f);
        m9867a(c0980j, hashMap, c1088c);
        return c0980j;
    }

    /* renamed from: a */
    private void m9867a(C0975i c0975i, HashMap<String, AbstractC1084a.C1087b> hashMap, AbstractC1084a.C1088c c1088c) {
        int size = this.f3510a.size();
        boolean m9888c = c1088c.m9888c();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C1099h c1099h = this.f3510a.get(i);
            AbstractC1084a.C1086a m9889b = c1088c.m9889b(c1099h.f3522h);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= c1099h.f3519e) {
                    break;
                }
                Number3d number3d = this.f3512c.get(c1099h.f3516b[i4]);
                C0879Uv m13948clone = c1099h.f3520f ? this.f3513d.get(c1099h.f3517c[i4]).m13948clone() : new C0879Uv();
                Number3d number3d2 = c1099h.f3521g ? this.f3514e.get(c1099h.f3518d[i4]) : new Number3d();
                AbstractC1084a.C1087b c1087b = hashMap.get(c1099h.f3522h);
                Color4 color4 = new Color4(255, 255, 0, 255);
                if (c1087b != null && c1087b.f3452c != null) {
                    color4.f2525r = c1087b.f3452c.f2525r;
                    color4.f2524g = c1087b.f3452c.f2524g;
                    color4.f2523b = c1087b.f3452c.f2523b;
                    color4.f2522a = c1087b.f3452c.f2522a;
                }
                if (m9888c && m9889b != null) {
                    m13948clone.f2530u = m9889b.f3444d + (m13948clone.f2530u * m9889b.f3446f);
                    m13948clone.f2531v = (m9889b.f3445e + ((m13948clone.f2531v + 1.0f) * m9889b.f3447g)) - 1.0f;
                }
                m13948clone.f2531v = 1.0f + m13948clone.f2531v;
                c0975i.vertices().addVertex(number3d, m13948clone, number3d2, color4);
                i3 = i4 + 1;
            }
            if (c1099h.f3519e == 3) {
                c0975i.faces().add(new C1106d(i2, i2 + 1, i2 + 2));
            } else if (c1099h.f3519e == 4) {
                c0975i.faces().add(new C1106d(i2, i2 + 1, i2 + 3));
                c0975i.faces().add(new C1106d(i2 + 1, i2 + 2, i2 + 3));
            }
            i++;
            i2 += c1099h.f3519e;
        }
        if (m9888c) {
            c0975i.textures().addElement(c1088c.m9886e());
        }
        m9868a();
    }

    /* renamed from: a */
    public void m9866a(C1099h c1099h) {
        Number3d number3d = this.f3512c.get(c1099h.f3516b[0]);
        Number3d subtract = Number3d.subtract(this.f3512c.get(c1099h.f3516b[1]), number3d);
        Number3d subtract2 = Number3d.subtract(this.f3512c.get(c1099h.f3516b[2]), number3d);
        Number3d number3d2 = new Number3d();
        number3d2.f2526x = (subtract.f2527y * subtract2.f2528z) - (subtract.f2528z * subtract2.f2527y);
        number3d2.f2527y = -((subtract2.f2528z * subtract.f2526x) - (subtract2.f2526x * subtract.f2528z));
        number3d2.f2528z = (subtract.f2526x * subtract2.f2527y) - (subtract2.f2526x * subtract.f2527y);
        double sqrt = Math.sqrt((number3d2.f2526x * number3d2.f2526x) + (number3d2.f2527y * number3d2.f2527y) + (number3d2.f2528z * number3d2.f2528z));
        number3d2.f2526x = (float) (number3d2.f2526x / sqrt);
        number3d2.f2527y = (float) (number3d2.f2527y / sqrt);
        number3d2.f2528z = (float) (number3d2.f2528z / sqrt);
        this.f3514e.add(number3d2);
        int size = this.f3514e.size() - 1;
        c1099h.f3518d = new int[3];
        c1099h.f3518d[0] = size;
        c1099h.f3518d[1] = size;
        c1099h.f3518d[2] = size;
        c1099h.f3521g = true;
    }

    /* renamed from: a */
    protected void m9868a() {
        this.f3510a.clear();
    }
}
