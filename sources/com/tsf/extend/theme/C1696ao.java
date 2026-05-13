package com.tsf.extend.theme;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p073c.AbstractBinderC1382c;
/* renamed from: com.tsf.extend.theme.ao */
/* loaded from: classes.dex */
public class C1696ao {

    /* renamed from: a */
    private static C1696ao f5460a;

    /* renamed from: b */
    private AbstractBinderC1382c f5461b;

    /* renamed from: c */
    private InterfaceC1698a f5462c;

    /* renamed from: d */
    private boolean f5463d;

    /* renamed from: e */
    private ServiceConnection f5464e = new ServiceConnection() { // from class: com.tsf.extend.theme.ao.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1696ao.this.f5461b = null;
            C1696ao.this.f5463d = false;
            if (C1696ao.this.f5462c != null) {
                C1696ao.this.f5462c.mo6942a();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1696ao.this.f5463d = true;
            C1696ao.this.f5461b = (AbstractBinderC1382c) iBinder;
            if (C1696ao.this.f5462c != null) {
                C1696ao.this.f5462c.mo6941b();
            }
        }
    };

    /* renamed from: com.tsf.extend.theme.ao$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1698a {
        /* renamed from: a */
        void mo6942a();

        /* renamed from: b */
        void mo6941b();
    }

    private C1696ao() {
    }

    /* renamed from: a */
    public void m7780a() {
        if (this.f5461b == null) {
            C1547h.m8290b().bindService(new Intent(C1547h.m8290b(), ThemeService.class), this.f5464e, 1);
        }
    }

    /* renamed from: b */
    public static C1696ao m7774b() {
        if (f5460a == null) {
            synchronized (C1696ao.class) {
                if (f5460a == null) {
                    f5460a = new C1696ao();
                }
            }
        }
        return f5460a;
    }

    /* renamed from: c */
    public String m7773c() {
        if (this.f5461b != null) {
            try {
                return this.f5461b.mo7967a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m7778a(InterfaceC1698a interfaceC1698a) {
        this.f5462c = interfaceC1698a;
    }

    /* renamed from: d */
    public boolean m7772d() {
        return true;
    }

    /* renamed from: e */
    public boolean m7771e() {
        return this.f5463d;
    }

    /* renamed from: f */
    public boolean m7770f() {
        if (this.f5461b != null) {
            try {
                return this.f5461b.mo7965b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m7769g() {
        if (this.f5461b != null) {
            try {
                return this.f5461b.mo7964c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (m7766j()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m7768h() {
        if (this.f5461b != null) {
            try {
                this.f5461b.mo7963d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    public void m7767i() {
        if (this.f5461b != null) {
            try {
                this.f5461b.mo7962e();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public boolean m7766j() {
        return false;
    }

    /* renamed from: a */
    public void m7779a(int i) {
        if (this.f5461b != null) {
            try {
                this.f5461b.mo7966a(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
