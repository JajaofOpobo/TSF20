package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.c.a.a.a.a;
import com.tsf.shell.utils.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements ServiceConnection {
    public static String a = "com.seal.plugin.services.toggle";
    public static String b = "com.seal.plugin.services.toggle.ToggleService";
    public static String c = "com.seal.plugin.services.toggle.PermissionToggleService";
    public static final String d = a + ".ON_SYNC_CHANGED";
    public static final String e = a + ".ON_GPS_CHANGED";
    public static final String f = a + ".ON_SCREENROTATION_CHANGED";
    public static final String g = a + ".ON_NFC_CHANGED";
    public static final String h = a + ".ON_AIRPLANE_CHANGED";
    public static final String i = a + ".ON_FLASHLIGHT_CHANGED";
    public static final String j = a + ".ON_MOBILEDATA_CHANGED";
    private Context k;
    private com.c.a.a.a.a m;
    private List<a> l = new ArrayList();
    private b n = new b();

    public interface a {
        void a(com.c.a.a.a.a aVar);
    }

    public d(Context context) {
        this.k = context;
    }

    public void a(a aVar) {
        if (a(this.k, 2)) {
            synchronized (this) {
                if (this.m != null) {
                    try {
                        aVar.a(this.m);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    this.l.add(aVar);
                    b();
                }
            }
        }
    }

    public boolean a() {
        return com.tsf.shell.utils.a.a(a, 2);
    }

    public void b() {
        if (a(this.k, 2)) {
            Intent intentA = i.a(com.censivn.C3DEngine.a.d(), new Intent(e()));
            if (intentA != null) {
                com.tsf.shell.component.a.a(this.k, intentA);
                this.k.bindService(intentA, this, 1);
            }
        }
    }

    private String e() {
        return a(this.k, 6) ? c : b;
    }

    public static boolean a(Context context, int i2) {
        try {
            return context.createPackageContext(a, 2).getPackageManager().getPackageInfo(a, 0).versionCode >= i2;
        } catch (Exception e2) {
            return false;
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.tsf.shell.manager.a.d.c.a(intent.getAction(), intent.getExtras().getInt("status"));
        }
    }

    public void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(d);
        intentFilter.addAction(e);
        intentFilter.addAction(f);
        intentFilter.addAction(h);
        intentFilter.addAction(g);
        intentFilter.addAction(i);
        intentFilter.addAction(j);
        this.k.registerReceiver(this.n, intentFilter);
    }

    public void d() {
        synchronized (this) {
            if (this.m != null) {
                try {
                    this.k.unbindService(this);
                    this.m = null;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.k.stopService(new Intent(b));
            } else {
                this.k.stopService(new Intent(b));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.m = a.AbstractBinderC0021a.a(iBinder);
            while (!this.l.isEmpty()) {
                try {
                    this.l.remove(0).a(this.m);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.m = null;
            this.l.clear();
        }
    }
}
