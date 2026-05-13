package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.component.C2233a;
import com.tsf.shell.services.p199a.InterfaceC4095a;
import com.tsf.shell.utils.C4172i;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.services.a */
/* loaded from: classes.dex */
public class C4090a {

    /* renamed from: a */
    public InterfaceC4095a f13347a;

    /* renamed from: e */
    private InterfaceC4094a f13351e;

    /* renamed from: d */
    private final int f13350d = 11;

    /* renamed from: b */
    ServiceConnection f13348b = new ServiceConnection() { // from class: com.tsf.shell.services.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4090a.this.f13347a = InterfaceC4095a.AbstractBinderC4096a.m762a(iBinder);
            while (C4090a.this.f13352f.size() > 0) {
                ((Runnable) C4090a.this.f13352f.remove(0)).run();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C4090a.this.f13347a = null;
        }
    };

    /* renamed from: c */
    BroadcastReceiver f13349c = new BroadcastReceiver() { // from class: com.tsf.shell.services.a.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            C4090a.this.m774a(C0853a.m10856d(), new Runnable() { // from class: com.tsf.shell.services.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (action.equals("com.tsf.shell.services.notifier.smsOnChange")) {
                        try {
                            C4090a.this.f13351e.mo768a(C4090a.this.f13347a.mo761a());
                        } catch (Exception e) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.misscallOnChange")) {
                        try {
                            C4090a.this.f13351e.mo767b(C4090a.this.f13347a.mo759b());
                        } catch (Exception e2) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.eventOnchange")) {
                        try {
                            C4090a.this.f13351e.mo766c(C4090a.this.f13347a.mo758c());
                        } catch (Exception e3) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.gmailOnchange")) {
                        try {
                            C4090a.this.f13351e.mo765d(C4090a.this.f13347a.mo757d());
                        } catch (Exception e4) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.whatsappOnchange")) {
                        try {
                            C4090a.this.f13351e.mo764e(C4090a.this.f13347a.mo756e());
                        } catch (Exception e5) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.handoutsOnchange")) {
                        try {
                            C4090a.this.f13351e.mo763f(C4090a.this.f13347a.mo755f());
                        } catch (Exception e6) {
                        }
                    }
                }
            });
        }
    };

    /* renamed from: f */
    private ArrayList<Runnable> f13352f = new ArrayList<>();

    /* renamed from: com.tsf.shell.services.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4094a {
        /* renamed from: a */
        void mo768a(int i);

        /* renamed from: b */
        void mo767b(int i);

        /* renamed from: c */
        void mo766c(int i);

        /* renamed from: d */
        void mo765d(int i);

        /* renamed from: e */
        void mo764e(int i);

        /* renamed from: f */
        void mo763f(int i);
    }

    /* renamed from: a */
    public void m776a(Context context) {
        Intent m677a = C4172i.m677a(C0853a.m10856d(), new Intent(m769d(context)));
        if (m677a != null) {
            C2233a.m6034a(context, m677a);
            context.bindService(m677a, this.f13348b, 1);
        }
    }

    /* renamed from: d */
    private String m769d(Context context) {
        if (context.createPackageContext("com.tsf.shell.services.notifier", 2).getPackageManager().getPackageInfo("com.tsf.shell.services.notifier", 0).versionCode >= 11) {
            return "com.tsf.shell.services.notifier.PermissionCounterService";
        }
        return "com.tsf.shell.services.notifier.CounterService";
    }

    /* renamed from: b */
    public void m772b(Context context) {
        context.unbindService(this.f13348b);
    }

    /* renamed from: a */
    public void m775a(Context context, InterfaceC4094a interfaceC4094a) {
        this.f13351e = interfaceC4094a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.services.notifier.smsOnChange");
        intentFilter.addAction("com.tsf.shell.services.notifier.misscallOnChange");
        intentFilter.addAction("com.tsf.shell.services.notifier.eventOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.gmailOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.whatsappOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.handoutsOnchange");
        context.registerReceiver(this.f13349c, intentFilter);
    }

    /* renamed from: c */
    public void m770c(Context context) {
        try {
            context.unregisterReceiver(this.f13349c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m774a(Context context, Runnable runnable) {
        if (this.f13347a != null) {
            runnable.run();
            return;
        }
        this.f13352f.add(runnable);
        m776a(context);
    }
}
