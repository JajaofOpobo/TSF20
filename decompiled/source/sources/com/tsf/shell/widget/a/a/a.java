package com.tsf.shell.widget.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.censivn.C3DEngine.b.e.f;
import com.censivn.C3DEngine.b.f.j;
/* loaded from: classes.dex */
public class a extends f {
    private j a;
    private j b;

    public a(Context context, j jVar) {
        this.b = jVar;
        d((int) com.censivn.C3DEngine.b.b.a.a(300.0f));
        a(0);
        this.a = new j() { // from class: com.tsf.shell.widget.a.a.a.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart() {
                a.this.b.dispatchDraw();
            }
        };
        float a = com.censivn.C3DEngine.b.b.a.a(250.0f);
        this.a.setAABBPX(-a, -a, 0.0f, a, a, 0.0f);
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(120.0f);
        bVar.b = com.censivn.C3DEngine.b.b.a.a(120.0f);
        bVar.i = this.a.minY();
        bVar.k = this.a.maxY();
        this.a.setLayoutParams(bVar);
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
    }

    @Override // com.censivn.C3DEngine.b.e.f
    @SuppressLint({"WrongCall"})
    public void f() {
    }
}
