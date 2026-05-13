package com.tsf.extend.theme.core;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.tsf.extend.h;
import com.tsf.extend.theme.ah;
import com.tsf.extend.theme.v;
import java.util.UUID;
/* loaded from: classes.dex */
public class ThemeManagerService extends Service {
    private Context a;
    private com.tsf.extend.base.c.b b = new b();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (a()) {
            a("GDPR已经开启：ThemeManagerService onCreate 可以执行");
            this.a = h.b().getApplicationContext();
            return;
        }
        a("GDPR没有开启：ThemeManagerService onCreate 不能执行");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.tsf.extend.b.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    /* loaded from: classes.dex */
    private class b extends com.tsf.extend.base.c.b {
        private b() {
        }

        @Override // com.tsf.extend.base.c.b
        public void a(String str, final com.tsf.extend.base.c.a aVar) {
            if (!ThemeManagerService.this.a()) {
                ThemeManagerService.this.a("GDPR没有开启： ThemeManagerService不能applyTheme");
                if (aVar != null) {
                    try {
                        aVar.a(1);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (ThemeManagerService.this.a == null) {
                ThemeManagerService.this.a = h.b().getApplicationContext();
            }
            ThemeManagerService.this.a("GDPR已经开启： ThemeManagerService可以applyTheme");
            final int a = ah.a().a(1, str);
            ah.a().a(ThemeManagerService.this, new a() { // from class: com.tsf.extend.theme.core.ThemeManagerService.b.1
                @Override // com.tsf.extend.theme.core.ThemeManagerService.a
                public void a() {
                    if (aVar != null) {
                        try {
                            aVar.a(0);
                            if (a != 3) {
                                ah.a(ThemeManagerService.this.a);
                                String b = ah.a().b();
                                if (!TextUtils.isEmpty(b) && v.e(b) && System.currentTimeMillis() - ah.a().p() > 172800000) {
                                    ah.a().o();
                                    String uuid = UUID.randomUUID().toString();
                                    ah.a().b(uuid);
                                    ah.a().a(uuid, 11);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }

                @Override // com.tsf.extend.theme.core.ThemeManagerService.a
                public void b() {
                    if (aVar != null) {
                        try {
                            aVar.a(1);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }

                @Override // com.tsf.extend.theme.core.ThemeManagerService.a
                public void c() {
                    if (aVar != null) {
                        try {
                            aVar.a(2);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }, a, str);
        }

        @Override // com.tsf.extend.base.c.b
        public void b() {
        }

        @Override // com.tsf.extend.base.c.b
        public boolean c() {
            return false;
        }

        @Override // com.tsf.extend.base.c.b
        public void a(String str) {
            ah.a().a(str);
        }

        @Override // com.tsf.extend.base.c.b
        public String a() {
            return com.tsf.extend.base.h.a.a().e();
        }

        @Override // com.tsf.extend.base.c.b
        public boolean d() {
            return false;
        }
    }
}
