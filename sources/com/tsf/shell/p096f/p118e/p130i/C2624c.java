package com.tsf.shell.p096f.p118e.p130i;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.i.c */
/* loaded from: classes.dex */
public class C2624c extends C0962a {

    /* renamed from: a */
    float f8632a;

    /* renamed from: c */
    private boolean f8633c;

    /* renamed from: d */
    private ArrayList<C2626d> f8634d;

    /* renamed from: e */
    private InterfaceC2625a f8635e;

    /* renamed from: f */
    private int f8636f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.i.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2625a {
        /* renamed from: a */
        void m5128a();
    }

    public C2624c() {
        super(16, 32, 32, 32, null, false);
        this.f8633c = false;
        this.f8634d = new ArrayList<>();
        this.f8632a = 255.0f;
        m5132c();
    }

    /* renamed from: c */
    public void m5132c() {
        for (int i = 0; i < 16; i++) {
            this.f8634d.add(new C2626d(m10456a(i)));
        }
    }

    /* renamed from: d */
    public void m5131d() {
        this.f8633c = true;
        m5130e();
        this.f8632a = 255.0f;
        alpha((int) this.f8632a);
        visible(true);
    }

    /* renamed from: e */
    public void m5130e() {
        this.f8636f = 0;
        alpha(0.0f);
        Iterator<C2626d> it = this.f8634d.iterator();
        while (it.hasNext()) {
            it.next().m5127a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDrawStart() {
        /*
            r4 = this;
            r0 = 1
            r2 = 0
            super.onDrawStart()
            boolean r1 = r4.f8633c
            if (r1 != 0) goto La
        L9:
            return
        La:
            int r1 = r4.f8636f
            int r1 = r1 + 1
            r4.f8636f = r1
            int r1 = r4.f8636f
            r3 = 60
            if (r1 <= r3) goto L5f
            float r1 = r4.f8632a
            r3 = 1064011039(0x3f6b851f, float:0.92)
            float r1 = r1 * r3
            r4.f8632a = r1
            float r1 = r4.f8632a
            int r1 = (int) r1
            float r1 = (float) r1
            r4.alpha(r1)
            float r1 = r4.f8632a
            r3 = 1092616192(0x41200000, float:10.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L51
            r0 = 0
            r4.f8632a = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.visible(r0)
            r1 = r2
        L38:
            java.util.ArrayList<com.tsf.shell.f.e.i.d> r0 = r4.f8634d
            java.util.Iterator r3 = r0.iterator()
        L3e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r3.next()
            com.tsf.shell.f.e.i.d r0 = (com.tsf.shell.p096f.p118e.p130i.C2626d) r0
            boolean r0 = r0.m5125b()
            if (r0 == 0) goto L3e
            goto L3e
        L51:
            r1 = r0
            goto L38
        L53:
            if (r1 == 0) goto L59
            r4.invalidate()
            goto L9
        L59:
            r4.f8633c = r2
            r4.m5129f()
            goto L9
        L5f:
            r1 = r0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p118e.p130i.C2624c.onDrawStart():void");
    }

    /* renamed from: f */
    private void m5129f() {
        if (this.f8635e != null) {
            this.f8635e.m5128a();
        }
    }
}
