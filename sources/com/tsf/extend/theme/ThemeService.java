package com.tsf.extend.theme;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.tsf.extend.base.p073c.AbstractBinderC1382c;
import com.tsf.extend.wallpaper.C2035ab;
/* loaded from: classes.dex */
public class ThemeService extends Service {

    /* renamed from: a */
    private BinderC1641a f5272a;

    /* renamed from: b */
    private SharedPreferences f5273b;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f5272a == null) {
            this.f5272a = new BinderC1641a();
            this.f5273b = getSharedPreferences("theme", 0);
        }
        return this.f5272a;
    }

    /* renamed from: com.tsf.extend.theme.ThemeService$a */
    /* loaded from: classes.dex */
    private class BinderC1641a extends AbstractBinderC1382c {
        private BinderC1641a() {
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1382c
        /* renamed from: a */
        public String mo7967a() {
            return C1673ah.m7864a().m7839b();
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1382c
        /* renamed from: b */
        public boolean mo7965b() {
            return false;
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1382c
        /* renamed from: c */
        public boolean mo7964c() {
            return false;
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1382c
        /* renamed from: d */
        public void mo7963d() {
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1382c
        /* renamed from: e */
        public void mo7962e() {
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1382c
        /* renamed from: a */
        public void mo7966a(int i) {
            C2035ab.m6667a(i);
        }
    }
}
