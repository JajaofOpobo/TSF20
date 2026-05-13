package com.tsf.shell.widget.alarm.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.tsf.shell.widget.alarm.AlarmUtils.C4242c;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.p205d.C4292c;
import com.tsf.shell.widget.alarm.p205d.p206a.C4285a;
import com.tsf.shell.widget.alarm.service.InterfaceC4340b;
import com.tsf.shell.widget.alarm.setting.C4371e;
/* loaded from: classes.dex */
public class AlarmService extends Service {

    /* renamed from: a */
    private RemoteCallbackList<InterfaceC4337a> f14059a = new RemoteCallbackList<>();

    /* renamed from: b */
    private Handler f14060b = new Handler();

    /* renamed from: c */
    private final InterfaceC4340b.AbstractBinderC4341a f14061c = new InterfaceC4340b.AbstractBinderC4341a() { // from class: com.tsf.shell.widget.alarm.service.AlarmService.1
        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
        /* renamed from: a */
        public void mo197a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
            AlarmService.this.m208a(i, z, i2, i3, i4, z2, str, str2);
        }

        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
        /* renamed from: b */
        public void mo194b() {
        }

        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
        /* renamed from: a */
        public void mo196a(InterfaceC4337a interfaceC4337a) {
            if (interfaceC4337a != null) {
                AlarmService.this.f14059a.register(interfaceC4337a);
            }
        }

        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
        /* renamed from: b */
        public void mo193b(InterfaceC4337a interfaceC4337a) {
            if (interfaceC4337a != null) {
                AlarmService.this.f14059a.unregister(interfaceC4337a);
            }
        }

        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
        /* renamed from: a */
        public void mo195a(boolean z) {
            AlarmService.this.m203a(z);
        }

        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
        /* renamed from: a */
        public void mo198a() {
        }
    };

    /* renamed from: d */
    private C4371e f14062d;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m209a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f14059a.kill();
        super.onDestroy();
    }

    /* renamed from: a */
    private void m209a() {
        this.f14062d = new C4371e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.tsf.shell.widget.alarm.service.AlarmService$2] */
    /* renamed from: a */
    public void m203a(final boolean z) {
        new Thread() { // from class: com.tsf.shell.widget.alarm.service.AlarmService.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C4292c m314a;
                byte[] m311b;
                C4305i.m259c("=============START TEST=================");
                AlarmService.this.f14062d.m117b();
                StringBuilder append = new StringBuilder().append("Service AUTOLocation:");
                C4371e unused = AlarmService.this.f14062d;
                StringBuilder append2 = append.append(C4371e.f14137a).append("   LocationName:");
                C4371e unused2 = AlarmService.this.f14062d;
                C4305i.m259c(append2.append(C4371e.f14139c).toString());
                AlarmService.this.f14062d.m115d();
                if (!z && C4371e.m112g() && (m311b = C4285a.m311b(AlarmService.this)) != null) {
                    C4305i.m262a("==Update By Cache==");
                    AlarmService.this.m202a(m311b);
                    return;
                }
                if (C4371e.f14137a) {
                    m314a = C4285a.m315a(AlarmService.this);
                } else {
                    m314a = C4285a.m314a(AlarmService.this, C4371e.f14140d);
                }
                if (m314a != null && !m314a.f13904k) {
                    AlarmService.this.f14062d.m114e();
                    byte[] a = m314a.m307a();
                    C4285a.m313a(AlarmService.this, a);
                    C4305i.m262a("==Update By Network==");
                    AlarmService.this.m202a(a);
                    return;
                }
                byte[] m311b2 = C4285a.m311b(AlarmService.this);
                if (m311b2 != null) {
                    C4305i.m262a("==Update By Cache==");
                    AlarmService.this.m202a(m311b2);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m208a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
        C4242c.m437a(this, i, z, i2, i3, i4, z2, str, str2);
        C4242c.m438a(this, i, z);
        if (z) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f14061c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m202a(final byte[] bArr) {
        this.f14060b.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.service.AlarmService.3
            @Override // java.lang.Runnable
            public void run() {
                int beginBroadcast = AlarmService.this.f14059a.beginBroadcast();
                C4305i.m259c("CallbackCount:" + beginBroadcast);
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        ((InterfaceC4337a) AlarmService.this.f14059a.getBroadcastItem(i)).mo187a(i, bArr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                AlarmService.this.f14059a.finishBroadcast();
            }
        });
    }
}
