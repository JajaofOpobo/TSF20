package com.tsf.shell.widget.a.a;

import android.content.Context;
import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.tsf.shell.widget.a.a.WidgetVisualRenderer;
import com.tsf.shell.widget.a.WidgetResources;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetVisualState extends i {
    private a a;
    private com.censivn.C3DEngine.b.e.a b;
    private com.tsf.shell.widget.a.WidgetPanelBase c;

    public interface a {
        void a();

        void b();
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public b(Context context, com.tsf.shell.widget.a.WidgetPanelBase aVar) {
        this.c = aVar;
        a(context.getString(h.a.widget_dots_clock_setting));
        b(new com.tsf.shell.widget.a.a.WidgetVisualNode(context, aVar));
        this.b = new com.censivn.C3DEngine.b.e.a();
        this.b.a(context.getString(h.a.widget_dots_clock_shownumber));
        this.b.c(this.c.c.a);
        this.b.a(new WidgetVisualNode.C0027a() { // from class: com.tsf.shell.widget.a.a.WidgetVisualState.1
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                b.this.c.c.a = z;
                b.this.c.a(z);
                return true;
            }
        });
        b(this.b);
        c cVar = new WidgetVisualRenderer(context);
        cVar.l();
        cVar.a(context.getString(h.a.widget_dots_clock_color));
        cVar.a(new WidgetVisualRenderer.InterfaceC0171c() { // from class: com.tsf.shell.widget.a.a.WidgetVisualState.2
            @Override // com.tsf.shell.widget.a.a.WidgetVisualRenderer.InterfaceC0171c
            public boolean a(int i) {
                b.this.c.c.b = i;
                b.this.c.a(i);
                return false;
            }
        });
        b(cVar);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        if (this.a != null) {
            this.a.b();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        if (this.a != null) {
            this.a.a();
        }
    }
}
