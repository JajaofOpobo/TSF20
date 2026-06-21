package com.tsf.shell.widget.a.a;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
class i extends m {
    final /* synthetic */ d a;
    private float d;
    private float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, float f, float f2) {
        super(f, f2);
        this.a = dVar;
        this.d = 0.1f;
        this.e = 0.0f;
    }

    public void c(float f) {
        this.e = f;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        float f = this.e - position().x;
        if (Math.abs(f) < 0.1f) {
            position().x = this.e;
        } else {
            PositionNumber3d position = position();
            position.x = (f * this.d) + position.x;
            invalidate();
        }
    }
}
