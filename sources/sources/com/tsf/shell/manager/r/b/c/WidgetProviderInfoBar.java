package com.tsf.shell.manager.r.b.c;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.b.f.LabelRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetProviderInfoBar extends BaseRenderable {
    private TextureElement a = new TextureElement(0, false);
    private GridRenderable b;
    private LabelRenderable c;

    public WidgetProviderInfoBar() {
        WidgetProviderInfoBar();
    }

    public void a() {
    }

    public void a(b.a aVar) {
        this.c.a(aVar.a + "  -  " + String.format(x.c(b.i.text_widget_count), Integer.valueOf(aVar.c.size())));
    }

    public void b() {
        this.b = new GridRenderable(com.censivn.C3DEngine.b.b.A.a(24.0f), com.censivn.C3DEngine.b.b.A.a(45.0f), false) { // from class: com.tsf.shell.manager.r.b.c.WidgetProviderInfoBar.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (WidgetProviderInfoBar.this.a.id == 0) {
                    Bitmap bitmapA = x.a(b.d.scrollcontainer_arrow);
                    com.censivn.C3DEngine.C3DEngine.g().a(WidgetProviderInfoBar.this.a, bitmapA);
                    bitmapA.recycle();
                }
            }
        };
        this.b.textures().addElement(this.a);
        a(this.b);
        addChild(this.b);
        this.b.position().x = com.censivn.C3DEngine.b.b.A.a(20.0f) + com.censivn.C3DEngine.b.b.A.a(12.0f);
        this.b.rotation().z = 180.0f;
        this.c = new LabelRenderable();
        this.c.d(42);
        this.c.e(-1);
        this.c.b(1);
        a(this.c);
        this.c.position().x = this.b.position().x + com.censivn.C3DEngine.b.b.A.a(12.0f) + com.censivn.C3DEngine.b.b.A.a(40.0f);
        addChild(this.c);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this, com.tsf.shell.manager.o.ThemeColorConstants.h);
    }

    public void a(float f, float f2, float f3, float f4) {
        position().x = f;
    }

    public void c() {
        this.c.a();
        com.censivn.C3DEngine.C3DEngine.g().a(this.a);
    }

    public void a(i iVar) {
        iVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.tsf.shell.manager.r.b.c.WidgetProviderInfoBar.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                WidgetProviderInfoBar.this.a();
            }
        });
    }
}
