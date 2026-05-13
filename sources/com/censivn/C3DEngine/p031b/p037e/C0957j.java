package com.censivn.C3DEngine.p031b.p037e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
/* renamed from: com.censivn.C3DEngine.b.e.j */
/* loaded from: classes.dex */
public class C0957j extends C0952g {

    /* renamed from: a */
    private C0959a f2805a;

    /* renamed from: com.censivn.C3DEngine.b.e.j$a */
    /* loaded from: classes.dex */
    public static class C0959a {
        /* renamed from: a */
        public void mo842a() {
        }
    }

    public C0957j() {
        setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.e.j.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C0957j.this.f2805a != null) {
                    C0957j.this.f2805a.mo842a();
                }
            }
        });
    }

    /* renamed from: a */
    public void m10462a(C0959a c0959a) {
        this.f2805a = c0959a;
    }
}
