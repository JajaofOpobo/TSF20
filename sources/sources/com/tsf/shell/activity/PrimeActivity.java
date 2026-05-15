package com.tsf.shell.activity;

import android.app.Activity;
import android.os.Bundle;
import com.censivn.C3DEngine.a.a;
import com.censivn.C3DEngine.a.f;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.c;
import com.tsf.shell.e.e;
import com.tsf.shell.utils.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PrimeActivity extends Activity {
    private e a;
    private a b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.a = new e(this);
        com.censivn.C3DEngine.a.a(this, "PrimeActivity");
        com.censivn.C3DEngine.a.a(this);
        this.b = new a(this);
        this.a.addView(this.b);
        this.b.setEGLContextClientVersion(2);
        this.b.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
        this.b.getHolder().setFormat(-3);
        this.b.setZOrderOnTop(true);
        com.tsf.shell.manager.b.e.a();
        g.a();
        com.tsf.shell.manager.a.b = new com.censivn.C3DEngine.b.c.e(this);
        new f(this.b, "PrimeRenderer") { // from class: com.tsf.shell.activity.PrimeActivity.1
            @Override // com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.d.b
            public void b() {
                float f = 300.0f;
                j jVar = new j();
                this.a.addChild(jVar);
                k kVar = new k(f, f, false) { // from class: com.tsf.shell.activity.PrimeActivity.1.1
                    @Override // com.censivn.C3DEngine.b.f.i
                    public void onDrawStart() {
                        rotation().z += 2.0f;
                    }
                };
                kVar.setDefaultColor(new Color4(255, 255, 0, 255));
                kVar.setAnimationObjectState(true);
                jVar.addChild(kVar);
            }
        };
        super.onCreate(bundle);
        setContentView(this.a);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.activity.PrimeActivity.2
            @Override // java.lang.Runnable
            public void run() {
                c.c();
                PrimeActivity.this.b.onResume();
            }
        };
        com.censivn.C3DEngine.a.e().j();
        com.censivn.C3DEngine.a.a().c(runnable);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.activity.PrimeActivity.3
            @Override // java.lang.Runnable
            public void run() {
                c.b();
                PrimeActivity.this.b.onPause();
            }
        };
        com.censivn.C3DEngine.a.e().j();
        com.censivn.C3DEngine.a.a().c(runnable);
    }
}
