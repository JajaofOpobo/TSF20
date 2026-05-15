package com.tsf.shell.widget.alarm.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.service.b;
import com.tsf.shell.widget.alarm.setting.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmService extends Service {
    private RemoteCallbackList<a> a = new RemoteCallbackList<>();
    private Handler b = new Handler();
    private final b.a c = new b.a() { // from class: com.tsf.shell.widget.alarm.service.AlarmService.1
        @Override // com.tsf.shell.widget.alarm.service.b
        public void a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
            AlarmService.this.a(i, z, i2, i3, i4, z2, str, str2);
        }

        @Override // com.tsf.shell.widget.alarm.service.b
        public void b() {
        }

        @Override // com.tsf.shell.widget.alarm.service.b
        public void a(a aVar) {
            if (aVar != null) {
                AlarmService.this.a.register(aVar);
            }
        }

        @Override // com.tsf.shell.widget.alarm.service.b
        public void b(a aVar) {
            if (aVar != null) {
                AlarmService.this.a.unregister(aVar);
            }
        }

        @Override // com.tsf.shell.widget.alarm.service.b
        public void a(boolean z) {
            AlarmService.this.a(z);
        }

        @Override // com.tsf.shell.widget.alarm.service.b
        public void a() {
        }
    };
    private e d;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.kill();
        super.onDestroy();
    }

    private void a() {
        this.d = new e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.tsf.shell.widget.alarm.service.AlarmService$2] */
    public void a(final boolean z) {
        new Thread() { // from class: com.tsf.shell.widget.alarm.service.AlarmService.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                com.tsf.shell.widget.alarm.d.c cVarA;
                byte[] bArrB;
                i.c("=============START TEST=================");
                AlarmService.this.d.b();
                StringBuilder sbAppend = new StringBuilder().append("Service AUTOLocation:");
                e unused = AlarmService.this.d;
                StringBuilder sbAppend2 = sbAppend.append(e.a).append("   LocationName:");
                e unused2 = AlarmService.this.d;
                i.c(sbAppend2.append(e.c).toString());
                AlarmService.this.d.d();
                if (!z && e.g() && (bArrB = com.tsf.shell.widget.alarm.d.a.a.b(AlarmService.this)) != null) {
                    i.a("==Update By Cache==");
                    AlarmService.this.a(bArrB);
                    return;
                }
                if (e.a) {
                    cVarA = com.tsf.shell.widget.alarm.d.a.a.a(AlarmService.this);
                } else {
                    cVarA = com.tsf.shell.widget.alarm.d.a.a.a(AlarmService.this, e.d);
                }
                if (cVarA != null && !cVarA.k) {
                    AlarmService.this.d.e();
                    byte[] bArrA = cVarA.a();
                    com.tsf.shell.widget.alarm.d.a.a.a(AlarmService.this, bArrA);
                    i.a("==Update By Network==");
                    AlarmService.this.a(bArrA);
                    return;
                }
                byte[] bArrB2 = com.tsf.shell.widget.alarm.d.a.a.b(AlarmService.this);
                if (bArrB2 != null) {
                    i.a("==Update By Cache==");
                    AlarmService.this.a(bArrB2);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
        com.tsf.shell.widget.alarm.AlarmUtils.c.a(this, i, z, i2, i3, i4, z2, str, str2);
        com.tsf.shell.widget.alarm.AlarmUtils.c.a(this, i, z);
        if (z) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final byte[] bArr) {
        this.b.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.service.AlarmService.3
            @Override // java.lang.Runnable
            public void run() {
                int iBeginBroadcast = AlarmService.this.a.beginBroadcast();
                i.c("CallbackCount:" + iBeginBroadcast);
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((a) AlarmService.this.a.getBroadcastItem(i)).a(i, bArr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                AlarmService.this.a.finishBroadcast();
            }
        });
    }
}
