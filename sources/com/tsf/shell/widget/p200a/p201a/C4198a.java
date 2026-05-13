package com.tsf.shell.widget.p200a.p201a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
/* renamed from: com.tsf.shell.widget.a.a.a */
/* loaded from: classes.dex */
public class C4198a extends AbstractC0951f {

    /* renamed from: a */
    private C0980j f13551a;

    /* renamed from: b */
    private C0980j f13552b;

    public C4198a(Context context, C0980j c0980j) {
        this.f13552b = c0980j;
        m10615d((int) C0892a.m10742a(300.0f));
        m10628a(0);
        this.f13551a = new C0980j() { // from class: com.tsf.shell.widget.a.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart() {
                C4198a.this.f13552b.dispatchDraw();
            }
        };
        float m10742a = C0892a.m10742a(250.0f);
        this.f13551a.setAABBPX(-m10742a, -m10742a, 0.0f, m10742a, m10742a, 0.0f);
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(120.0f);
        c0907b.f2656b = C0892a.m10742a(120.0f);
        c0907b.f2663i = this.f13551a.minY();
        c0907b.f2665k = this.f13551a.maxY();
        this.f13551a.setLayoutParams(c0907b);
        addChild(this.f13551a);
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    @SuppressLint({"WrongCall"})
    /* renamed from: f */
    public void mo539f() {
    }
}
