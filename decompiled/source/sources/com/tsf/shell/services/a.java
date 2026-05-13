package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tsf.shell.services.a.a;
import com.tsf.shell.utils.i;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    public com.tsf.shell.services.a.a a;
    private InterfaceC0165a e;
    private final int d = 11;
    ServiceConnection b = new ServiceConnection() { // from class: com.tsf.shell.services.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.a = a.AbstractBinderC0166a.a(iBinder);
            while (a.this.f.size() > 0) {
                ((Runnable) a.this.f.remove(0)).run();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.a = null;
        }
    };
    BroadcastReceiver c = new BroadcastReceiver() { // from class: com.tsf.shell.services.a.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();
            a.this.a(com.censivn.C3DEngine.a.d(), new Runnable() { // from class: com.tsf.shell.services.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (action.equals("com.tsf.shell.services.notifier.smsOnChange")) {
                        try {
                            a.this.e.a(a.this.a.a());
                        } catch (Exception e) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.misscallOnChange")) {
                        try {
                            a.this.e.b(a.this.a.b());
                        } catch (Exception e2) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.eventOnchange")) {
                        try {
                            a.this.e.c(a.this.a.c());
                        } catch (Exception e3) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.gmailOnchange")) {
                        try {
                            a.this.e.d(a.this.a.d());
                        } catch (Exception e4) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.whatsappOnchange")) {
                        try {
                            a.this.e.e(a.this.a.e());
                        } catch (Exception e5) {
                        }
                    } else if (action.equals("com.tsf.shell.services.notifier.handoutsOnchange")) {
                        try {
                            a.this.e.f(a.this.a.f());
                        } catch (Exception e6) {
                        }
                    }
                }
            });
        }
    };
    private ArrayList<Runnable> f = new ArrayList<>();

    /* renamed from: com.tsf.shell.services.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0165a {
        void a(int i);

        void b(int i);

        void c(int i);

        void d(int i);

        void e(int i);

        void f(int i);
    }

    public void a(Context context) {
        Intent a = i.a(com.censivn.C3DEngine.a.d(), new Intent(d(context)));
        if (a != null) {
            com.tsf.shell.component.a.a(context, a);
            context.bindService(a, this.b, 1);
        }
    }

    private String d(Context context) {
        if (context.createPackageContext("com.tsf.shell.services.notifier", 2).getPackageManager().getPackageInfo("com.tsf.shell.services.notifier", 0).versionCode >= 11) {
            return "com.tsf.shell.services.notifier.PermissionCounterService";
        }
        return "com.tsf.shell.services.notifier.CounterService";
    }

    public void b(Context context) {
        context.unbindService(this.b);
    }

    public void a(Context context, InterfaceC0165a interfaceC0165a) {
        this.e = interfaceC0165a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.services.notifier.smsOnChange");
        intentFilter.addAction("com.tsf.shell.services.notifier.misscallOnChange");
        intentFilter.addAction("com.tsf.shell.services.notifier.eventOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.gmailOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.whatsappOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.handoutsOnchange");
        context.registerReceiver(this.c, intentFilter);
    }

    public void c(Context context) {
        try {
            context.unregisterReceiver(this.c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Context context, Runnable runnable) {
        if (this.a != null) {
            runnable.run();
            return;
        }
        this.f.add(runnable);
        a(context);
    }
}
