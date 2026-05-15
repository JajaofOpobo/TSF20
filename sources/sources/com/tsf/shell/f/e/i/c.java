package com.tsf.shell.f.e.i;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.censivn.C3DEngine.b.f.a.a {
    float a;
    private boolean c;
    private ArrayList<d> d;
    private a e;
    private int f;

    interface a {
        void a();
    }

    public c() {
        super(16, 32, 32, 32, null, false);
        this.c = false;
        this.d = new ArrayList<>();
        this.a = 255.0f;
        c();
    }

    public void c() {
        for (int i = 0; i < 16; i++) {
            this.d.add(new d(a(i)));
        }
    }

    public void d() {
        this.c = true;
        e();
        this.a = 255.0f;
        alpha((int) this.a);
        visible(true);
    }

    public void e() {
        this.f = 0;
        alpha(0.0f);
        Iterator<d> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.i
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
            boolean r1 = r4.c
            if (r1 != 0) goto La
        L9:
            return
        La:
            int r1 = r4.f
            int r1 = r1 + 1
            r4.f = r1
            int r1 = r4.f
            r3 = 60
            if (r1 <= r3) goto L5f
            float r1 = r4.a
            r3 = 1064011039(0x3f6b851f, float:0.92)
            float r1 = r1 * r3
            r4.a = r1
            float r1 = r4.a
            int r1 = (int) r1
            float r1 = (float) r1
            r4.alpha(r1)
            float r1 = r4.a
            r3 = 1092616192(0x41200000, float:10.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L51
            r0 = 0
            r4.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.visible(r0)
            r1 = r2
        L38:
            java.util.ArrayList<com.tsf.shell.f.e.i.d> r0 = r4.d
            java.util.Iterator r3 = r0.iterator()
        L3e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r3.next()
            com.tsf.shell.f.e.i.d r0 = (com.tsf.shell.f.e.i.d) r0
            boolean r0 = r0.b()
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
            r4.c = r2
            r4.f()
            goto L9
        L5f:
            r1 = r0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.i.c.onDrawStart():void");
    }

    private void f() {
        if (this.e != null) {
            this.e.a();
        }
    }
}
