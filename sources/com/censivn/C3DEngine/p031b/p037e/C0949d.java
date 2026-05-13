package com.censivn.C3DEngine.p031b.p037e;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0908c;
import com.censivn.C3DEngine.p031b.p033b.C0911d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
/* renamed from: com.censivn.C3DEngine.b.e.d */
/* loaded from: classes.dex */
public class C0949d extends C0980j {

    /* renamed from: a */
    private C0911d f2773a;

    /* renamed from: c */
    private int f2775c = 0;

    /* renamed from: b */
    private C0908c f2774b = new C0908c();

    public C0949d() {
        this.f2774b.m10617b(true);
        this.f2774b.m10627a((int) (C0892a.f2553D - C0892a.m10742a(70.0f)), 0);
        this.f2774b.m10628a(1);
        this.f2773a = new C0911d(this.f2774b);
        this.f2773a.m10611a(C0892a.f2553D, C0892a.f2554E - (C0892a.f2551B - this.f2773a.position().f2527y));
        addChild(this.f2773a);
    }

    /* renamed from: a */
    public void m10499a(int i) {
        this.f2775c = i;
    }

    /* renamed from: a */
    public void m10500a(float f) {
        this.f2774b.m10627a((int) (C0892a.f2553D - C0892a.m10742a(70.0f)), 0);
        this.f2773a.m10611a(C0892a.f2553D, f);
    }

    /* renamed from: a */
    public void m10498a(AbstractC0951f abstractC0951f) {
        this.f2774b.addChild(abstractC0951f);
        abstractC0951f.getLayoutParams().f2657c = C0892a.m10742a(30.0f);
        abstractC0951f.getLayoutParams().f2658d = C0892a.m10742a(30.0f);
        abstractC0951f.m10494a(this);
    }

    /* renamed from: a */
    public void m10497a(AbstractC0951f abstractC0951f, float f) {
        this.f2774b.addChild(abstractC0951f);
        abstractC0951f.getLayoutParams().f2657c = f;
        abstractC0951f.getLayoutParams().f2658d = f;
    }

    /* renamed from: a */
    public void m10496a(boolean z) {
        this.f2773a.m10603c();
        if (z) {
            this.f2774b.m10616c();
        }
        int numChildren = this.f2774b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = this.f2774b.getChildAt(i);
            if (childAt instanceof AbstractC0951f) {
                AbstractC0951f abstractC0951f = (AbstractC0951f) childAt;
                float alpha = abstractC0951f.alpha();
                abstractC0951f.alpha(0.0f);
                abstractC0951f.dispatchDraw();
                abstractC0951f.alpha(alpha);
                abstractC0951f.mo539f();
            }
        }
    }

    /* renamed from: a */
    public void m10501a() {
        int numChildren = this.f2774b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = this.f2774b.getChildAt(i);
            if (childAt instanceof AbstractC0951f) {
                ((AbstractC0951f) childAt).mo538g();
            }
        }
    }
}
