package com.censivn.C3DEngine.p031b.p046h.p050d;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.h.d.c */
/* loaded from: classes.dex */
public class C1057c extends C1051a {

    /* renamed from: a */
    private C0984m f3260a;

    /* renamed from: b */
    private int f3261b;

    /* renamed from: c */
    private float f3262c;

    public C1057c(float f, int i, float f2) {
        super(f, i, f2);
        this.f3261b = 0;
        this.f3260a = new C0984m();
        this.f3260a.m10347d(32);
        this.f3262c = C0892a.m10742a(20.0f);
        addChild(this.f3260a);
    }

    /* renamed from: b */
    public void m10089b(int i) {
        m10090a(C4189x.m588c(i));
    }

    /* renamed from: a */
    public void m10090a(String str) {
        if (str == null || str.length() == 0) {
            this.f3260a.visible(false);
        } else {
            this.f3260a.visible(true);
        }
        this.f3260a.m10355a(str);
        m10088c();
    }

    /* renamed from: c */
    public void m10087c(int i) {
        this.f3261b = i;
        m10088c();
    }

    /* renamed from: c */
    private void m10088c() {
        this.f3260a.m10353b();
        if (this.f3261b == 0) {
            this.f3260a.m10352b(2);
            this.f3260a.position().f2526x = ((-m10113a()) / 2.0f) - this.f3262c;
            return;
        }
        this.f3260a.m10352b(1);
        this.f3260a.position().f2526x = (m10113a() / 2.0f) + this.f3262c;
    }
}
