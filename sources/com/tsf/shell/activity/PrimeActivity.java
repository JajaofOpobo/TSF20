package com.tsf.shell.activity;

import android.app.Activity;
import android.os.Bundle;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p030a.C0854a;
import com.censivn.C3DEngine.p030a.C0870f;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p095e.C2265e;
import com.tsf.shell.utils.C4170g;
/* loaded from: classes.dex */
public class PrimeActivity extends Activity {

    /* renamed from: a */
    private C2265e f7256a;

    /* renamed from: b */
    private C0854a f7257b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f7256a = new C2265e(this);
        C0853a.m10863a(this, "PrimeActivity");
        C0853a.m10864a(this);
        this.f7257b = new C0854a(this);
        this.f7256a.addView(this.f7257b);
        this.f7257b.setEGLContextClientVersion(2);
        this.f7257b.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
        this.f7257b.getHolder().setFormat(-3);
        this.f7257b.setZOrderOnTop(true);
        C3430e.m2545a();
        C4170g.m689a();
        C3359a.f11088b = new C0925e(this);
        new C0870f(this.f7257b, "PrimeRenderer") { // from class: com.tsf.shell.activity.PrimeActivity.1
            @Override // com.censivn.C3DEngine.p030a.C0870f, com.censivn.C3DEngine.p056d.InterfaceC1083b
            /* renamed from: b */
            public void mo2247b() {
                C0980j c0980j = new C0980j();
                this.f2497a.addChild(c0980j);
                C0981k c0981k = new C0981k(300.0f, 300.0f, false) { // from class: com.tsf.shell.activity.PrimeActivity.1.1
                    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                    public void onDrawStart() {
                        rotation().f2528z += 2.0f;
                    }
                };
                c0981k.setDefaultColor(new Color4(255, 255, 0, 255));
                c0981k.setAnimationObjectState(true);
                c0980j.addChild(c0981k);
            }
        };
        super.onCreate(bundle);
        setContentView(this.f7256a);
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
                C1014c.m10321c();
                PrimeActivity.this.f7257b.onResume();
            }
        };
        C0853a.m10855e().m10760j();
        C0853a.m10865a().m10583c(runnable);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.activity.PrimeActivity.3
            @Override // java.lang.Runnable
            public void run() {
                C1014c.m10324b();
                PrimeActivity.this.f7257b.onPause();
            }
        };
        C0853a.m10855e().m10760j();
        C0853a.m10865a().m10583c(runnable);
    }
}
