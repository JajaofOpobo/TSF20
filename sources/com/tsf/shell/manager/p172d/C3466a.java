package com.tsf.shell.manager.p172d;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.p091b.C2224a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.d.a */
/* loaded from: classes.dex */
public class C3466a {

    /* renamed from: a */
    private ArrayList<InterfaceC2557f> f11450a = new ArrayList<>();

    /* renamed from: a */
    public void m2296a(InterfaceC2557f interfaceC2557f) {
        if (interfaceC2557f != null) {
            if (this.f11450a.contains(interfaceC2557f)) {
                C2224a.m6053a("HitTargetManager", "addHitTarget error ,target is exist");
                return;
            } else {
                this.f11450a.add(0, interfaceC2557f);
                return;
            }
        }
        C2224a.m6053a("HitTargetManager", "addHitTarget error ,target is null");
    }

    /* renamed from: b */
    public void m2295b(InterfaceC2557f interfaceC2557f) {
        if (interfaceC2557f != null) {
            if (this.f11450a.contains(interfaceC2557f)) {
                C2224a.m6053a("HitTargetManager", "addHitTarget error ,target is exist");
                return;
            } else {
                this.f11450a.add(interfaceC2557f);
                return;
            }
        }
        C2224a.m6053a("HitTargetManager", "addHitTarget error ,target is null");
    }

    /* renamed from: c */
    public void m2294c(InterfaceC2557f interfaceC2557f) {
        if (this.f11450a.contains(interfaceC2557f)) {
            this.f11450a.remove(interfaceC2557f);
        } else {
            C2224a.m6053a("HitTargetManager", "removeHitTarget error ,target is not exist");
        }
    }

    /* renamed from: a */
    public ArrayList<InterfaceC2557f> m2297a() {
        return this.f11450a;
    }

    /* renamed from: com.tsf.shell.manager.d.a$a */
    /* loaded from: classes.dex */
    public static class C3467a {

        /* renamed from: a */
        private float[] f11451a = {0.0f, 0.0f};

        /* renamed from: b */
        private boolean f11452b = false;

        /* renamed from: a */
        public void m2292a(final InterfaceC2557f interfaceC2557f, MotionEvent motionEvent) {
            if (interfaceC2557f.mo3494o()) {
                C4189x.m600a(motionEvent, this.f11451a);
                if (!this.f11452b) {
                    C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.manager.d.a.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            InterfaceC2557f mo3517a = interfaceC2557f.mo3517a((int) C3467a.this.f11451a[0], (int) C3467a.this.f11451a[1]);
                            C3467a.this.f11452b = false;
                            if (mo3517a != null && C3467a.this.mo2293a(mo3517a)) {
                                interfaceC2557f.mo3504f(mo3517a);
                            } else {
                                interfaceC2557f.mo3493p();
                            }
                        }
                    });
                    this.f11452b = true;
                }
            }
        }

        /* renamed from: a */
        public boolean mo2293a(InterfaceC2557f interfaceC2557f) {
            return true;
        }
    }
}
