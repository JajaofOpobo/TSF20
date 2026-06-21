package com.tsf.shell.widget.a.a;

import android.content.Context;
import com.censivn.C3DEngine.b.e.m;
import com.tsf.shell.widget.a.j;

/* loaded from: classes.dex */
public class b extends m {
    private c a;
    private com.censivn.C3DEngine.b.e.a b;
    private com.tsf.shell.widget.a.a c;

    public void a(c cVar) {
        this.a = cVar;
    }

    public b(Context context, com.tsf.shell.widget.a.a aVar) {
        this.c = aVar;
        a(context.getString(j.widget_dots_clock_setting));
        b(new a(context, aVar));
        this.b = new com.censivn.C3DEngine.b.e.a();
        this.b.a(context.getString(j.widget_dots_clock_shownumber));
        this.b.c(this.c.c.a);
        this.b.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.widget.a.a.b.1
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                b.this.c.c.a = z;
                b.this.c.a(z);
                return true;
            }
        });
        b(this.b);
        d dVar = new d(context);
        dVar.l();
        dVar.a(context.getString(j.widget_dots_clock_color));
        dVar.a(new h() { // from class: com.tsf.shell.widget.a.a.b.2
            @Override // com.tsf.shell.widget.a.a.h
            public boolean a(int i) {
                b.this.c.c.b = i;
                b.this.c.a(i);
                return false;
            }
        });
        b(dVar);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        if (this.a != null) {
            this.a.b();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.a != null) {
            this.a.a();
        }
    }
}
