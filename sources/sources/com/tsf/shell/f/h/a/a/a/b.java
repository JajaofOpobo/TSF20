package com.tsf.shell.f.h.a.a.a;

import android.content.Context;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.tsf.shell.f.e.c.a.d {
    private float a;
    private float b;
    private Number3d c;
    private Number3d d;
    private boolean e;

    public b(Context context, float f, float f2, float f3, int i) {
        super(context, f, f2, f3, i);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = new Number3d();
        this.d = new Number3d();
        this.e = false;
    }

    public void a(Number3d number3d) {
        if (this.b == 0.0f) {
            float fA = x.a(position(), number3d);
            if (fA > a() * 2.0f) {
                this.c.setAllFrom(number3d);
                this.d.setAllFrom(number3d);
                a(fA);
                b((float) (x.b(position(), number3d) / 0.017453292519943295d));
                setAnimationObjectState(true);
                this.a = 1.0f;
                return;
            }
            return;
        }
        this.d.setAllFrom(number3d);
    }

    @Override // com.tsf.shell.f.e.c.a.d, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        super.onDrawStart();
        if (getAnimationObjectState()) {
            this.b = ((this.d.compare(this.c) ? 0.15f : 0.6f) * (this.a - this.b)) + this.b;
            if (!this.e && Math.abs(this.a - this.b) < 0.01d) {
                setAnimationObjectState(false);
                if (this.a == 1.0f) {
                    position().setAllFrom(this.c);
                } else {
                    this.c.setAllFrom(position());
                }
                this.a = 0.0f;
                this.b = 0.0f;
                if (!position().compare(this.d)) {
                    a(this.d);
                }
            }
            c(this.b);
        }
    }
}
