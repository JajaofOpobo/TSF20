package com.tsf.shell.manager.d;

import android.view.MotionEvent;
import com.tsf.shell.f.e.F;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class HitTargetManager {
    private ArrayList<F> a = new ArrayList<>();

    public void a(F fVar) {
        if (fVar != null) {
            if (this.a.contains(fVar)) {
                com.tsf.shell.b.a.a("HitTargetManager", "addHitTarget error ,target is exist");
                return;
            } else {
                this.a.add(0, fVar);
                return;
            }
        }
        com.tsf.shell.b.a.a("HitTargetManager", "addHitTarget error ,target is null");
    }

    public void b(F fVar) {
        if (fVar != null) {
            if (this.a.contains(fVar)) {
                com.tsf.shell.b.a.a("HitTargetManager", "addHitTarget error ,target is exist");
                return;
            } else {
                this.a.add(fVar);
                return;
            }
        }
        com.tsf.shell.b.a.a("HitTargetManager", "addHitTarget error ,target is null");
    }

    public void c(F fVar) {
        if (this.a.contains(fVar)) {
            this.a.remove(fVar);
        } else {
            com.tsf.shell.b.a.a("HitTargetManager", "removeHitTarget error ,target is not exist");
        }
    }

    public ArrayList<F> a() {
        return this.a;
    }

    /* JADX INFO: renamed from: com.tsf.shell.manager.d.HitTargetManager$a, reason: collision with other inner class name */
    public static class C0127a {
        private float[] a = {0.0f, 0.0f};
        private boolean b = false;

        public void a(final F fVar, MotionEvent motionEvent) {
            if (fVar.o()) {
                x.a(motionEvent, this.a);
                if (!this.b) {
                    com.censivn.C3DEngine.A.a().b(new Runnable() { // from class: com.tsf.shell.manager.d.HitTargetManager.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            F fVarA = fVar.a((int) C0127a.this.a[0], (int) C0127a.this.a[1]);
                            C0127a.this.b = false;
                            if (fVarA != null && C0127a.this.a(fVarA)) {
                                fVar.f(fVarA);
                            } else {
                                fVar.p();
                            }
                        }
                    });
                    this.b = true;
                }
            }
        }

        public boolean a(F fVar) {
            return true;
        }
    }
}
