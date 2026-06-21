package com.tsf.shell.widget.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.b.f.j;

/* loaded from: classes.dex */
class g extends com.censivn.C3DEngine.b.d.a {
    final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, j jVar) {
        super(jVar);
        this.a = dVar;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(final MotionEvent motionEvent) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.widget.a.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                e eVar;
                Number3d l = g.this.l(motionEvent);
                eVar = g.this.a.b;
                eVar.a(l.x, l.y);
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.widget.a.a.g.2
            @Override // java.lang.Runnable
            public void run() {
                e eVar;
                Number3d l = g.this.l(motionEvent2);
                eVar = g.this.a.b;
                eVar.a(l.x, l.y);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Number3d l(MotionEvent motionEvent) {
        Number3d number3d = new Number3d(0.0f, 0.0f, 0.0f);
        float screenHeight = VInformation.getScreenHeight();
        number3d.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
        number3d.y = 0.0f - (motionEvent.getY() - (screenHeight / 2.0f));
        number3d.z = 0.0f;
        return this.c.globalToLocal(number3d);
    }
}
