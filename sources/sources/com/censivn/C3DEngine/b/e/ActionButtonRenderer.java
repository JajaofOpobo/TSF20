package com.censivn.C3DEngine.b.e;

import android.view.MotionEvent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ActionButtonRenderer extends IconLabelRenderer {
    private a a;

    public static class a {
        public void a() {
        }
    }

    public ActionButtonRenderer() {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.censivn.C3DEngine.b.e.ActionButtonRenderer.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                if (j.this.a != null) {
                    j.this.a.a();
                }
            }
        });
    }

    public void a(a aVar) {
        this.a = aVar;
    }
}
