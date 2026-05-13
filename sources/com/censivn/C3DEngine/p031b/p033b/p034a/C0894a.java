package com.censivn.C3DEngine.p031b.p033b.p034a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.b.a.a */
/* loaded from: classes.dex */
public class C0894a extends C0895b {
    private C0984m mLabel = new C0984m();

    public C0894a() {
        this.mLabel.m10352b(1);
        this.mLabel.m10355a("Title");
        this.mLabel.m10357a(C0892a.m10742a(20.0f), 0.0f, C0892a.m10742a(10.0f), 0.0f);
    }

    public void setTitlePosition(float f) {
        this.mLabel.position().f2527y = f;
    }

    public void setTitleSize(int i) {
        this.mLabel.m10347d(i);
    }

    public void setTitle(int i) {
        setTitle(C4189x.m588c(i));
    }

    public void setTitle(String str) {
        this.mLabel.m10355a(str);
        this.mLabel.m10353b();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        this.mLabel.position().f2526x = this.canvasMinX;
        if (this.canvasMinX + this.mLabel.maxX() > this.canvasMaxX) {
            this.mLabel.position().f2526x = this.canvasMaxX - this.mLabel.maxX();
        }
        this.mLabel.position().f2526x -= position().f2526x;
        if (this.mLabel.position().f2526x < 0.0f) {
            this.mLabel.position().f2526x = 0.0f;
        }
        this.mLabel.dispatchDraw();
    }

    public void recycle() {
        this.mLabel.m10358a();
    }
}
