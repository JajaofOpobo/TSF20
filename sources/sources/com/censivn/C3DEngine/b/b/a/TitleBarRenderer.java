package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.LabelRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TitleBarRenderer extends BaseSliderRenderer {
    private LabelRenderable mLabel = new LabelRenderable();

    public a() {
        this.mLabel.b(1);
        this.mLabel.a("Title");
        this.mLabel.a(com.censivn.C3DEngine.b.b.ScreenConstants.a(20.0f), 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.a(10.0f), 0.0f);
    }

    public void setTitlePosition(float f) {
        this.mLabel.position().y = f;
    }

    public void setTitleSize(int i) {
        this.mLabel.d(i);
    }

    public void setTitle(int i) {
        setTitle(x.c(i));
    }

    public void setTitle(String str) {
        this.mLabel.a(str);
        this.mLabel.b();
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        this.mLabel.position().x = this.canvasMinX;
        if (this.canvasMinX + this.mLabel.maxX() > this.canvasMaxX) {
            this.mLabel.position().x = this.canvasMaxX - this.mLabel.maxX();
        }
        this.mLabel.position().x -= position().x;
        if (this.mLabel.position().x < 0.0f) {
            this.mLabel.position().x = 0.0f;
        }
        this.mLabel.dispatchDraw();
    }

    public void recycle() {
        this.mLabel.a();
    }
}
