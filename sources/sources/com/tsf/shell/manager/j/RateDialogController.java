package com.tsf.shell.manager.j;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.f.BaseRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class RateDialogController {
    private RateDialog a;
    private com.tsf.shell.f.b.ShellKeyEventHandler b;

    public void a() {
        if (this.a == null) {
            RateDialogController();
        }
        RateDialogController();
        j jVarA = com.tsf.shell.manager.app.TaskScheduler.a(this.b);
        this.a.removeFromParent();
        this.a.a();
        this.a.alpha(255.0f);
        jVarA.addChild(this.a);
        com.tsf.shell.manager.app.TaskScheduler.a(new Runnable() { // from class: com.tsf.shell.manager.j.RateDialogController.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.a.b();
            }
        });
    }

    public void b() {
        this.a.c();
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(0);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 300, dVar);
        com.tsf.shell.manager.app.TaskScheduler.a(new Runnable() { // from class: com.tsf.shell.manager.j.RateDialogController.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.a.d();
                com.tsf.shell.manager.app.TaskScheduler.b();
                c.this.a.removeFromParent();
            }
        }, true);
    }

    private void d() {
        this.a = new b();
        this.b = new com.tsf.shell.f.b.ShellKeyEventHandler() { // from class: com.tsf.shell.manager.j.RateDialogController.3
            @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.KeyboardHandler.a
            public void a(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    c.this.b();
                }
            }

            @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.KeyboardHandler.a
            public void b(int i, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.f.b.ShellKeyEventHandler
            public void a(int i, int i2, int i3, int i4) {
                c.this.c();
            }
        };
    }

    public void c() {
        this.a.e();
    }
}
