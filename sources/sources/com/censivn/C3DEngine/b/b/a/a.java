package com.censivn.C3DEngine.b.b.a;

import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends b {
    private m mLabel = new m();

    public a() {
        this.mLabel.b(1);
        this.mLabel.a("Title");
        this.mLabel.a(com.censivn.C3DEngine.b.b.a.a(20.0f), 0.0f, com.censivn.C3DEngine.b.b.a.a(10.0f), 0.0f);
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

    @Override // com.censivn.C3DEngine.b.f.j
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
