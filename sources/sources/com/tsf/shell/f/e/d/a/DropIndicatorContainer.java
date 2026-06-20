package com.tsf.shell.f.e.d.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.BaseRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DropIndicatorContainer extends BaseRenderable {
    private DropIndicatorRenderer a = new DropIndicatorRenderer();

    public DropIndicatorContainer() {
        addChild(this.a);
        final com.tsf.shell.f.e.d.a.DropIndicatorContainer self = this;
        setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.tsf.shell.f.e.d.a.DropIndicatorContainer.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                self.a();
            }
        });
        setAABBPX(-com.censivn.C3DEngine.b.b.ScreenConstants.a(150.0f), -com.censivn.C3DEngine.b.b.ScreenConstants.a(150.0f), 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.a(150.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(150.0f), 0.0f);
    }

    public void a() {
    }

    public void b() {
        if (parent() == null) {
            com.tsf.shell.manager.app.TaskScheduler.a(this);
            position().x = com.censivn.C3DEngine.b.b.ScreenConstants.z - com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f);
            position().y = com.censivn.C3DEngine.b.b.ScreenConstants.B - com.censivn.C3DEngine.b.b.ScreenConstants.a(84.0f);
            this.a.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.a(45.0f);
        }
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(com.censivn.C3DEngine.b.b.ScreenConstants.z);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, 500, dVar);
    }

    public void c() {
        position().x = com.censivn.C3DEngine.b.b.ScreenConstants.z;
        position().y = com.censivn.C3DEngine.b.b.ScreenConstants.B - com.censivn.C3DEngine.b.b.ScreenConstants.a(84.0f);
    }

    public void d() {
        final com.tsf.shell.f.e.d.a.DropIndicatorContainer self = this;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.d.a.DropIndicatorContainer.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                self.removeFromParent();
            }
        };
        dVar.f(com.censivn.C3DEngine.b.b.ScreenConstants.z - com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f));
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, 500, dVar);
    }

    public void a(float f) {
        this.a.a();
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 500, dVar);
    }

    public void e() {
        this.a.b();
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(com.censivn.C3DEngine.b.b.ScreenConstants.a(45.0f));
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 500, dVar);
    }
}
