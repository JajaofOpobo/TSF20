package com.tsf.extend.theme;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ao {
    private static ao a;
    private com.tsf.extend.base.c.c b;
    private a c;
    private boolean d;
    private ServiceConnection e = new ServiceConnection() { // from class: com.tsf.extend.theme.ao.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ao.this.b = null;
            ao.this.d = false;
            if (ao.this.c != null) {
                ao.this.c.a();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ao.this.d = true;
            ao.this.b = (com.tsf.extend.base.c.c) iBinder;
            if (ao.this.c != null) {
                ao.this.c.b();
            }
        }
    };

    public interface a {
        void a();

        void b();
    }

    private ao() {
    }

    public void a() {
        if (this.b == null) {
            com.tsf.extend.h.b().bindService(new Intent(com.tsf.extend.h.b(), (Class<?>) ThemeService.class), this.e, 1);
        }
    }

    public static ao b() {
        if (a == null) {
            synchronized (ao.class) {
                if (a == null) {
                    a = new ao();
                }
            }
        }
        return a;
    }

    public String c() {
        if (this.b != null) {
            try {
                return this.b.a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        if (this.b != null) {
            try {
                return this.b.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean g() {
        if (this.b != null) {
            try {
                return this.b.c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (j()) {
            return true;
        }
        return false;
    }

    public void h() {
        if (this.b != null) {
            try {
                this.b.d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void i() {
        if (this.b != null) {
            try {
                this.b.e();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean j() {
        return false;
    }

    public void a(int i) {
        if (this.b != null) {
            try {
                this.b.a(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
