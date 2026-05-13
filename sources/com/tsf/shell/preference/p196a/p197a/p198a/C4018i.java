package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p033b.C0908c;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.preference.a.a.a.i */
/* loaded from: classes.dex */
public class C4018i extends C4017h {

    /* renamed from: a */
    private ArrayList<C0984m> f13170a;

    /* renamed from: b */
    private C0908c f13171b;

    public C4018i(String str, float f) {
        super(str, f);
        this.f13170a = new ArrayList<>();
        m890e().removeFromParent();
        this.f13171b = new C0908c();
        this.f13171b.setLayoutParams(new C0907b());
        this.f13171b.mouseEnabled(false);
        addChild(this.f13171b);
    }

    /* renamed from: a */
    public void m888a(String str) {
        C0984m c0984m = new C0984m();
        c0984m.m10355a(str);
        c0984m.m10352b(1);
        c0984m.m10347d(38);
        c0984m.m10354a(true);
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(0.0f);
        c0907b.f2656b = C0892a.m10742a(15.0f);
        c0984m.setLayoutParams(c0907b);
        c0984m.m10347d(38);
        c0984m.position().f2526x = (-m10629a()) / 2.0f;
        this.f13171b.addChild(c0984m);
        this.f13170a.add(c0984m);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        Iterator<C0984m> it = this.f13170a.iterator();
        while (it.hasNext()) {
            C0984m next = it.next();
            next.position().f2526x = (-i) / 2.0f;
            next.m10344f(i);
            m889a(next);
        }
        this.f13171b.mo4847d();
        C0907b layoutParams = this.f13171b.getLayoutParams();
        layoutParams.f2662h = this.f13171b.minX();
        layoutParams.f2664j = this.f13171b.maxX();
        layoutParams.f2663i = this.f13171b.minY();
        layoutParams.f2665k = this.f13171b.maxY();
        super.mo544c(i);
    }

    /* renamed from: a */
    private void m889a(C0984m c0984m) {
        c0984m.m10353b();
        C0907b layoutParams = c0984m.getLayoutParams();
        layoutParams.f2662h = c0984m.minX();
        layoutParams.f2664j = c0984m.maxX();
        layoutParams.f2663i = c0984m.minY();
        layoutParams.f2665k = c0984m.maxY();
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        Iterator<C0984m> it = this.f13170a.iterator();
        while (it.hasNext()) {
            it.next().m10358a();
        }
    }
}
