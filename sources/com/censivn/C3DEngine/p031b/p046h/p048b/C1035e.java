package com.censivn.C3DEngine.p031b.p046h.p048b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.h.b.e */
/* loaded from: classes.dex */
public class C1035e extends C0980j {

    /* renamed from: a */
    private C0980j f3145a;

    /* renamed from: b */
    private ArrayList<Number3d> f3146b;

    /* renamed from: d */
    private InterfaceC1034d f3148d;

    /* renamed from: c */
    private Number3d f3147c = new Number3d();

    /* renamed from: f */
    private int f3150f = C0892a.f2551B;

    /* renamed from: g */
    private int f3151g = C0892a.f2552C;

    /* renamed from: h */
    private int f3152h = C0892a.f2590z;

    /* renamed from: i */
    private int f3153i = C0892a.f2550A;

    /* renamed from: j */
    private boolean f3154j = false;

    /* renamed from: e */
    private C1023a f3149e = new C1023a(this);

    /* renamed from: a */
    public boolean m10206a(boolean z) {
        return true;
    }

    public C1035e() {
        setMouseEventListener(this.f3149e);
        this.f3145a = new C0980j();
        addChild(this.f3145a);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        this.f3148d.mo10222e();
    }

    /* renamed from: a */
    public void m10213a(InterfaceC1034d interfaceC1034d) {
        this.f3148d = interfaceC1034d;
        this.f3149e.m10268a(this);
    }

    /* renamed from: a */
    public InterfaceC1034d m10218a() {
        return this.f3148d;
    }

    /* renamed from: b */
    public C0980j m10205b() {
        return this.f3145a;
    }

    /* renamed from: a */
    public void m10216a(int i, int i2, int i3, int i4) {
        setAABBPX(i, i2, 0.0f, i3, i4, 0.0f);
    }

    /* renamed from: a */
    public void m10208a(ArrayList<Number3d> arrayList) {
        this.f3146b = arrayList;
    }

    /* renamed from: c */
    public ArrayList<C0975i> m10200c() {
        ArrayList<C0975i> arrayList = new ArrayList<>();
        Iterator<C0975i> it = this.f3145a.children().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        if (this.f3146b != null) {
            this.f3146b.clear();
        }
        this.f3148d = null;
        this.f3147c = null;
        super.destroy();
    }

    /* renamed from: a */
    public void m10207a(ArrayList<C3112b> arrayList, int i) {
        Iterator<C3112b> it = arrayList.iterator();
        int i2 = i;
        while (it.hasNext()) {
            C3112b next = it.next();
            next.mouseEnabled(false);
            next.removeFromParent();
            this.f3145a.addChildAt(next, i2);
            next.m3518a(i2);
            i2++;
            this.f3148d.mo10220e(next);
        }
        m10204b(i);
    }

    /* renamed from: b */
    public void m10201b(ArrayList<C3112b> arrayList) {
        Iterator<C3112b> it = arrayList.iterator();
        while (it.hasNext()) {
            m10212a(it.next());
        }
    }

    /* renamed from: a */
    public void m10212a(C3112b c3112b) {
        c3112b.mouseEnabled(false);
        if (c3112b.parent() != null) {
            this.f3145a.globalToLocal(c3112b.position());
            c3112b.removeFromParent();
        }
        this.f3145a.addChild(c3112b);
        c3112b.m3518a(this.f3145a.numChildren() - 1);
    }

    /* renamed from: b */
    public int m10202b(C3112b c3112b) {
        int m3535J = c3112b.m3535J();
        this.f3145a.removeChild(c3112b);
        m10204b(m3535J);
        return m3535J;
    }

    /* renamed from: a */
    public Number3d m10217a(int i) {
        return this.f3146b.get(i);
    }

    /* renamed from: a */
    public boolean m10211a(C3112b c3112b, float f, float f2) {
        return m10210a(c3112b, f, f2, false, false);
    }

    /* renamed from: a */
    public boolean m10210a(C3112b c3112b, float f, float f2, boolean z, boolean z2) {
        int i = C3566b.f11839a.f11754L;
        int i2 = C3566b.f11839a.f11756N;
        int i3 = C3566b.f11839a.f11755M;
        int i4 = C3566b.f11839a.f11757O;
        int m3535J = c3112b.m3535J();
        float[] m595b = C4189x.m595b(f, f2);
        float f3 = m595b[0];
        float f4 = m595b[1];
        float f5 = f3 - this.f3147c.f2526x;
        float f6 = f4 - this.f3147c.f2527y;
        if (this.f3154j) {
            if (!z) {
                if (f3 > this.f3153i) {
                    return this.f3148d.mo10233a(5);
                }
                if (f3 < this.f3152h) {
                    return this.f3148d.mo10233a(-4);
                }
            }
            if (!z2) {
                if (f4 > this.f3150f) {
                    return this.f3148d.mo10233a(-2);
                }
                if (f4 < this.f3151g) {
                    return this.f3148d.mo10233a(-3);
                }
            }
        }
        int numChildren = this.f3145a.numChildren() + 1;
        for (int i5 = 0; i5 < numChildren; i5++) {
            Number3d number3d = this.f3146b.get(i5);
            if (f5 > i + number3d.f2526x && f5 < i3 + number3d.f2526x && f6 > i2 + number3d.f2527y) {
                if (f6 < number3d.f2527y + i4 && m3535J != i5) {
                    m10209a(c3112b, i5);
                    return false;
                }
            }
        }
        this.f3148d.mo10233a(-1);
        return false;
    }

    /* renamed from: a */
    public void m10209a(C3112b c3112b, int i) {
        int m3535J = c3112b.m3535J();
        int min = Math.min(m3535J, i);
        int abs = Math.abs(m3535J - i);
        c3112b.m3518a(i);
        int i2 = m3535J > i ? 1 : 0;
        for (int i3 = min; i3 < min + abs; i3++) {
            C3112b c3112b2 = (C3112b) this.f3145a.children().get(i3);
            c3112b2.m3518a(i3 + i2);
            m10191f(c3112b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10197d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10215a(int i, C0975i c0975i) {
        int size = this.f3145a.children().size();
        while (i < size) {
            C3112b c3112b = (C3112b) this.f3145a.children().get(i);
            c3112b.m3518a(i);
            if (c0975i != c3112b) {
                m10191f(c3112b);
            }
            i++;
        }
    }

    /* renamed from: b */
    void m10204b(int i) {
        int size = this.f3145a.children().size();
        while (i < size) {
            C3112b c3112b = (C3112b) this.f3145a.children().get(i);
            c3112b.m3518a(i);
            m10191f(c3112b);
            i++;
        }
    }

    /* renamed from: f */
    private void m10191f(C3112b c3112b) {
        Number3d m10217a = m10217a(c3112b.m3535J());
        this.f3148d.mo10229a(c3112b, m10217a);
        if (c3112b.visible()) {
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(m10217a.f2526x);
            c1017d.mo10298h(m10217a.f2527y);
            C1014c.m10326a(c3112b);
            C1014c.m10325a(c3112b, 300, c1017d);
            return;
        }
        c3112b.position().f2526x = m10217a.f2526x;
        c3112b.position().f2527y = m10217a.f2527y;
    }

    /* renamed from: c */
    public void m10198c(C3112b c3112b) {
        m10194e();
        this.f3148d.mo10227b(c3112b);
    }

    /* renamed from: e */
    public void m10194e() {
        this.f3147c.f2526x = 0.0f;
        this.f3147c.f2527y = 0.0f;
        this.f3147c.f2528z = 0.0f;
        this.f3145a.localToGlobal(this.f3147c);
    }

    /* renamed from: c */
    public void m10199c(MotionEvent motionEvent) {
    }

    /* renamed from: b */
    public void mo10203b(MotionEvent motionEvent) {
    }

    /* renamed from: d */
    public void m10196d(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public void mo10214a(MotionEvent motionEvent) {
    }

    /* renamed from: d */
    public void m10195d(C3112b c3112b) {
        this.f3148d.mo10225c(c3112b);
    }

    /* renamed from: e */
    public boolean m10192e(C3112b c3112b) {
        m10202b(c3112b);
        this.f3148d.mo10223d(c3112b);
        return true;
    }

    /* renamed from: e */
    public C3112b m10193e(MotionEvent motionEvent) {
        float[] m601a = C4189x.m601a(motionEvent);
        float f = m601a[0];
        float f2 = m601a[1];
        Iterator<C0975i> it = this.f3145a.children().iterator();
        while (it.hasNext()) {
            C0975i next = it.next();
            if (next.calTouchCollision(f, f2)) {
                return (C3112b) next;
            }
        }
        return null;
    }
}
