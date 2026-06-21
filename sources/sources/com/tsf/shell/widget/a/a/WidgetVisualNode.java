package com.tsf.shell.widget.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.censivn.C3DEngine.b.e.AbstractPanelRenderer;
import com.censivn.C3DEngine.b.f.BaseRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetVisualNode extends f {
    private BaseRenderable a;
    private BaseRenderable b;

    public WidgetVisualNode(Context context, j jVar) {
        this.b = jVar;
        d((int) com.censivn.C3DEngine.b.b.ScreenConstants.a(300.0f));
        a(0);
        this.a = new BaseRenderable() { // from class: com.tsf.shell.widget.a.a.WidgetVisualNode.1
            @Override // com.censivn.C3DEngine.b.f.BaseRenderable
            public void onDrawChildStart() {
                WidgetVisualNode.this.b.dispatchDraw();
            }
        };
        float fA = com.censivn.C3DEngine.b.b.ScreenConstants.a(250.0f);
        this.a.setAABBPX(-fA, -fA, 0.0f, fA, fA, 0.0f);
        com.censivn.C3DEngine.b.b.TouchState bVar = new com.censivn.C3DEngine.b.b.TouchState();
        bVar.a = com.censivn.C3DEngine.b.b.ScreenConstants.a(120.0f);
        bVar.b = com.censivn.C3DEngine.b.b.ScreenConstants.a(120.0f);
        bVar.i = this.a.minY();
        bVar.k = this.a.maxY();
        this.a.setLayoutParams(bVar);
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.b.DesktopRenderer
    public void c(int i) {
    }

    @Override // com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void g() {
    }

    @Override // com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    @SuppressLint({"WrongCall"})
    public void f() {
    }
}
