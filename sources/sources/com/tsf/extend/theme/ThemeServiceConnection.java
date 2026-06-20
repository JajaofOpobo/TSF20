package com.tsf.extend.theme;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeServiceConnection {
    private static ThemeServiceConnection a;
    private com.tsf.extend.base.c.ServiceBinderB b;
    private A c;
    private boolean d;
    private ServiceConnection e = new ServiceConnection() { // from class: com.tsf.extend.theme.ThemeServiceConnection.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeServiceConnection.this.b = null;
            ThemeServiceConnection.this.d = false;
            if (ThemeServiceConnection.this.c != null) {
                ThemeServiceConnection.this.c.a();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeServiceConnection.this.d = true;
            ThemeServiceConnection.this.b = (com.tsf.extend.base.c.ServiceBinderB) iBinder;
            if (ThemeServiceConnection.this.c != null) {
                ThemeServiceConnection.this.c.b();
            }
        }
    };

    public interface a {
        void a();

        void b();
    }

    private ThemeServiceConnection() {
    }

    public void a() {
        if (this.b == null) {
            com.tsf.extend.AppContextHolder.b().bindService(new Intent(com.tsf.extend.AppContextHolder.b(), (Class<?>) ThemeService.class), this.e, 1);
        }
    }

    public static ThemeServiceConnection b() {
        if (a == null) {
            synchronized (ThemeServiceConnection.class) {
                if (a == null) {
                    a = new ThemeServiceConnection();
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

    public void a(A aVar) {
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
