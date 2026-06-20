package com.tsf.extend.theme;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeService extends Service {
    private A a;
    private SharedPreferences b;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new A();
            this.b = getSharedPreferences("theme", 0);
        }
        return this.a;
    }

    private class A extends com.tsf.extend.base.c.ServiceBinderB {
        private A() {
        }

        @Override // com.tsf.extend.base.c.ServiceBinderB
        public String a() {
            return ah.a().b();
        }

        @Override // com.tsf.extend.base.c.ServiceBinderB
        public boolean b() {
            return false;
        }

        @Override // com.tsf.extend.base.c.ServiceBinderB
        public boolean c() {
            return false;
        }

        @Override // com.tsf.extend.base.c.ServiceBinderB
        public void d() {
        }

        @Override // com.tsf.extend.base.c.ServiceBinderB
        public void e() {
        }

        @Override // com.tsf.extend.base.c.ServiceBinderB
        public void a(int i) {
            com.tsf.extend.wallpaper.ab.a(i);
        }
    }
}
