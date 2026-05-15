package com.censivn.C3DEngine.b.e;

import android.view.MotionEvent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends g {
    private a a;

    public static class a {
        public void a() {
        }
    }

    public j() {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.e.j.1
            @Override // com.censivn.C3DEngine.b.d.a
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
