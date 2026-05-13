package com.tsf.extend.theme.core;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.tsf.extend.C1335b;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p073c.InterfaceC1380a;
import com.tsf.extend.base.p078h.C1413a;
import com.tsf.extend.theme.C1673ah;
import com.tsf.extend.theme.C1894v;
import java.util.UUID;
/* loaded from: classes.dex */
public class ThemeManagerService extends Service {

    /* renamed from: a */
    private Context f5657a;

    /* renamed from: b */
    private AbstractBinderC1381b f5658b = new BinderC1761b();

    /* renamed from: com.tsf.extend.theme.core.ThemeManagerService$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1760a {
        /* renamed from: a */
        void mo7559a();

        /* renamed from: b */
        void mo7558b();

        /* renamed from: c */
        void mo7557c();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (m7571a()) {
            m7567a("GDPR已经开启：ThemeManagerService onCreate 可以执行");
            this.f5657a = C1547h.m8290b().getApplicationContext();
            return;
        }
        m7567a("GDPR没有开启：ThemeManagerService onCreate 不能执行");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5658b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7571a() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7567a(String str) {
        if (C1335b.f4221a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    /* renamed from: com.tsf.extend.theme.core.ThemeManagerService$b */
    /* loaded from: classes.dex */
    private class BinderC1761b extends AbstractBinderC1381b {
        private BinderC1761b() {
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1381b
        /* renamed from: a */
        public void mo7563a(String str, final InterfaceC1380a interfaceC1380a) {
            if (!ThemeManagerService.this.m7571a()) {
                ThemeManagerService.this.m7567a("GDPR没有开启： ThemeManagerService不能applyTheme");
                if (interfaceC1380a != null) {
                    try {
                        interfaceC1380a.mo7464a(1);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (ThemeManagerService.this.f5657a == null) {
                ThemeManagerService.this.f5657a = C1547h.m8290b().getApplicationContext();
            }
            ThemeManagerService.this.m7567a("GDPR已经开启： ThemeManagerService可以applyTheme");
            final int m7862a = C1673ah.m7864a().m7862a(1, str);
            C1673ah.m7864a().m7860a(ThemeManagerService.this, new InterfaceC1760a() { // from class: com.tsf.extend.theme.core.ThemeManagerService.b.1
                @Override // com.tsf.extend.theme.core.ThemeManagerService.InterfaceC1760a
                /* renamed from: a */
                public void mo7559a() {
                    if (interfaceC1380a != null) {
                        try {
                            interfaceC1380a.mo7464a(0);
                            if (m7862a != 3) {
                                C1673ah.m7861a(ThemeManagerService.this.f5657a);
                                String m7839b = C1673ah.m7864a().m7839b();
                                if (!TextUtils.isEmpty(m7839b) && C1894v.m7075e(m7839b) && System.currentTimeMillis() - C1673ah.m7864a().m7813p() > 172800000) {
                                    C1673ah.m7864a().m7814o();
                                    String uuid = UUID.randomUUID().toString();
                                    C1673ah.m7864a().m7835b(uuid);
                                    C1673ah.m7864a().m7846a(uuid, 11);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }

                @Override // com.tsf.extend.theme.core.ThemeManagerService.InterfaceC1760a
                /* renamed from: b */
                public void mo7558b() {
                    if (interfaceC1380a != null) {
                        try {
                            interfaceC1380a.mo7464a(1);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }

                @Override // com.tsf.extend.theme.core.ThemeManagerService.InterfaceC1760a
                /* renamed from: c */
                public void mo7557c() {
                    if (interfaceC1380a != null) {
                        try {
                            interfaceC1380a.mo7464a(2);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }, m7862a, str);
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1381b
        /* renamed from: b */
        public void mo7562b() {
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1381b
        /* renamed from: c */
        public boolean mo7561c() {
            return false;
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1381b
        /* renamed from: a */
        public void mo7564a(String str) {
            C1673ah.m7864a().m7847a(str);
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1381b
        /* renamed from: a */
        public String mo7565a() {
            return C1413a.m8754a().mo8738e();
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1381b
        /* renamed from: d */
        public boolean mo7560d() {
            return false;
        }
    }
}
