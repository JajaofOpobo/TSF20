package com.tsf.shell.p096f.p107d.p112c.p113a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.tsf.shell.manager.p177i.C3498a;
import com.tsf.shell.p096f.p118e.p126f.C2558a;
import com.tsf.shell.p096f.p131f.C2931f;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.c.a.d */
/* loaded from: classes.dex */
public class C2426d extends C2931f {

    /* renamed from: b */
    public static final float f8004b = C0892a.m10742a(65.0f);

    /* renamed from: a */
    private C2421c f8005a;

    public C2426d(int i, boolean z) {
        super(i, 0, z);
        this.f8005a = new C2421c(this) { // from class: com.tsf.shell.f.d.c.a.d.1
            @Override // com.tsf.shell.p096f.p146g.p147a.C3020h, com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildEnd() {
                super.onDrawChildEnd();
                C3498a.m2191a(C2426d.this, C0892a.m10742a(-38.0f));
            }
        };
    }

    /* renamed from: b */
    public C2421c m5589b() {
        return this.f8005a;
    }

    /* renamed from: a */
    public void mo5583a(ArrayList<Integer> arrayList, float f, float f2) {
    }

    /* renamed from: a */
    public void mo5588a() {
    }

    /* renamed from: a */
    public void mo5586a(C2558a.C2569c c2569c) {
    }

    /* renamed from: b */
    public void mo5581b(C2558a.C2569c c2569c) {
    }

    /* renamed from: a */
    public int mo5590a(int i) {
        return 380;
    }

    /* renamed from: a */
    public void mo5587a(C0962a c0962a, Runnable runnable) {
    }

    /* renamed from: b */
    public void mo5582b(C0962a c0962a, Runnable runnable) {
    }
}
