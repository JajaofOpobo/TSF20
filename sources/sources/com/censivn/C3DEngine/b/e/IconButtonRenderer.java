package com.censivn.C3DEngine.b.e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class IconButtonRenderer extends IconLabelRenderer {
    private GridRenderable a;
    private TextureElement b;
    private boolean d = false;
    private boolean e = false;
    private C0027a f;

    /* JADX INFO: renamed from: com.censivn.C3DEngine.b.e.IconButtonRenderer$a, reason: collision with other inner class name */
    public static class C0027a {
        public boolean a(boolean z) {
            return true;
        }
    }

    public IconButtonRenderer() {
        m();
    }

    public void a(C0027a c0027a) {
        this.f = c0027a;
    }

    // renamed from e() to avoid override conflict with parent
    public boolean _e() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }

    @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void f() {
        super.f();
        h();
    }

    @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.e.AbstractPanelRenderer
    public void g() {
        super.g();
        if (this.b.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.b);
        }
    }

    public void h() {
        this.e = this.d;
        Bitmap bitmapA = x.a(this.d ? com.tsf.b.d.preference_check_on : com.tsf.b.d.preference_check_off, com.censivn.C3DEngine.b.b.ScreenConstants.a(58.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(58.0f));
        com.censivn.C3DEngine.C3DEngine.g().a(this.b, bitmapA);
        bitmapA.recycle();
    }

    private void m() {
        this.a = com.censivn.C3DEngine.b.b.ScreenConstants.a(58.0f, 58.0f);
        this.b = new TextureElement(0, false);
        this.a.textures().addElement(this.b);
        this.a.position().y = (-b()) / 2.0f;
        addChild(this.a);
        final com.censivn.C3DEngine.b.e.IconButtonRenderer self = this;
        setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.censivn.C3DEngine.b.e.IconButtonRenderer.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                if (self.d) {
                    self.c(false);
                    self.n();
                } else {
                    self.c(true);
                    self.n();
                }
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (this.e != this.d) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f != null) {
            this.f.a(this.d);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.IconLabelRenderer, com.censivn.C3DEngine.b.b.DesktopRenderer
    public void c(int i) {
        super.c(i);
        if (this.a != null) {
            this.a.position().x = (i / 2.0f) - 29.0f;
        }
    }

    @Override // com.censivn.C3DEngine.b.b.DesktopRenderer
    public void e(int i) {
        super.e(i);
        if (this.a != null) {
            this.a.position().y = (-i) / 2.0f;
        }
    }
}
