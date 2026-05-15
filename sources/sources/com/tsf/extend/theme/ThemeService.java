package com.tsf.extend.theme;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeService extends Service {
    private a a;
    private SharedPreferences b;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new a();
            this.b = getSharedPreferences("theme", 0);
        }
        return this.a;
    }

    private class a extends com.tsf.extend.base.c.c {
        private a() {
        }

        @Override // com.tsf.extend.base.c.c
        public String a() {
            return ah.a().b();
        }

        @Override // com.tsf.extend.base.c.c
        public boolean b() {
            return false;
        }

        @Override // com.tsf.extend.base.c.c
        public boolean c() {
            return false;
        }

        @Override // com.tsf.extend.base.c.c
        public void d() {
        }

        @Override // com.tsf.extend.base.c.c
        public void e() {
        }

        @Override // com.tsf.extend.base.c.c
        public void a(int i) {
            com.tsf.extend.wallpaper.ab.a(i);
        }
    }
}
