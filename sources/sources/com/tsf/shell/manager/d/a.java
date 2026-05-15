package com.tsf.shell.manager.d;

import android.view.MotionEvent;
import com.tsf.shell.f.e.f;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private ArrayList<f> a = new ArrayList<>();

    public void a(f fVar) {
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

    public void b(f fVar) {
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

    public void c(f fVar) {
        if (this.a.contains(fVar)) {
            this.a.remove(fVar);
        } else {
            com.tsf.shell.b.a.a("HitTargetManager", "removeHitTarget error ,target is not exist");
        }
    }

    public ArrayList<f> a() {
        return this.a;
    }

    /* JADX INFO: renamed from: com.tsf.shell.manager.d.a$a, reason: collision with other inner class name */
    public static class C0127a {
        private float[] a = {0.0f, 0.0f};
        private boolean b = false;

        public void a(final f fVar, MotionEvent motionEvent) {
            if (fVar.o()) {
                x.a(motionEvent, this.a);
                if (!this.b) {
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.manager.d.a.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            f fVarA = fVar.a((int) C0127a.this.a[0], (int) C0127a.this.a[1]);
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

        public boolean a(f fVar) {
            return true;
        }
    }
}
