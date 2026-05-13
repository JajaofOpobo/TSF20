package com.tsf.shell.f.d.c.a;

import com.tsf.shell.f.e.f.a;
import com.tsf.shell.f.f.f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends f {
    public static final float b = com.censivn.C3DEngine.b.b.a.a(65.0f);
    private c a;

    public d(int i, boolean z) {
        super(i, 0, z);
        this.a = new c(this) { // from class: com.tsf.shell.f.d.c.a.d.1
            @Override // com.tsf.shell.f.g.a.h, com.censivn.C3DEngine.b.f.j
            public void onDrawChildEnd() {
                super.onDrawChildEnd();
                com.tsf.shell.manager.i.a.a(d.this, com.censivn.C3DEngine.b.b.a.a(-38.0f));
            }
        };
    }

    public c b() {
        return this.a;
    }

    public void a(ArrayList<Integer> arrayList, float f, float f2) {
    }

    public void a() {
    }

    public void a(a.c cVar) {
    }

    public void b(a.c cVar) {
    }

    public int a(int i) {
        return 380;
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
    }

    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
    }
}
