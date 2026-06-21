package com.censivn.C3DEngine.b.e;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class n extends j {
    private o a;

    public n() {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.e.n.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (n.this.a != null) {
                    n.this.a.a();
                }
            }
        });
    }

    public void a(o oVar) {
        this.a = oVar;
    }
}
