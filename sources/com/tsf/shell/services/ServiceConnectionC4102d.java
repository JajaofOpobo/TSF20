package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.censivn.C3DEngine.C0853a;
import com.p026c.p027a.p028a.p029a.InterfaceC0850a;
import com.tsf.shell.component.C2233a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.utils.C4164a;
import com.tsf.shell.utils.C4172i;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.shell.services.d */
/* loaded from: classes.dex */
public class ServiceConnectionC4102d implements ServiceConnection {

    /* renamed from: a */
    public static String f13365a = "com.seal.plugin.services.toggle";

    /* renamed from: b */
    public static String f13366b = "com.seal.plugin.services.toggle.ToggleService";

    /* renamed from: c */
    public static String f13367c = "com.seal.plugin.services.toggle.PermissionToggleService";

    /* renamed from: d */
    public static final String f13368d = f13365a + ".ON_SYNC_CHANGED";

    /* renamed from: e */
    public static final String f13369e = f13365a + ".ON_GPS_CHANGED";

    /* renamed from: f */
    public static final String f13370f = f13365a + ".ON_SCREENROTATION_CHANGED";

    /* renamed from: g */
    public static final String f13371g = f13365a + ".ON_NFC_CHANGED";

    /* renamed from: h */
    public static final String f13372h = f13365a + ".ON_AIRPLANE_CHANGED";

    /* renamed from: i */
    public static final String f13373i = f13365a + ".ON_FLASHLIGHT_CHANGED";

    /* renamed from: j */
    public static final String f13374j = f13365a + ".ON_MOBILEDATA_CHANGED";

    /* renamed from: k */
    private Context f13375k;

    /* renamed from: m */
    private InterfaceC0850a f13377m;

    /* renamed from: l */
    private List<InterfaceC4103a> f13376l = new ArrayList();

    /* renamed from: n */
    private C4104b f13378n = new C4104b();

    /* renamed from: com.tsf.shell.services.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4103a {
        /* renamed from: a */
        void mo739a(InterfaceC0850a interfaceC0850a);
    }

    public ServiceConnectionC4102d(Context context) {
        this.f13375k = context;
    }

    /* renamed from: a */
    public void m744a(InterfaceC4103a interfaceC4103a) {
        if (m745a(this.f13375k, 2)) {
            synchronized (this) {
                if (this.f13377m != null) {
                    try {
                        interfaceC4103a.mo739a(this.f13377m);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f13376l.add(interfaceC4103a);
                    m743b();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m746a() {
        return C4164a.m708a(f13365a, 2);
    }

    /* renamed from: b */
    public void m743b() {
        if (m745a(this.f13375k, 2)) {
            Intent m677a = C4172i.m677a(C0853a.m10856d(), new Intent(m740e()));
            if (m677a != null) {
                C2233a.m6034a(this.f13375k, m677a);
                this.f13375k.bindService(m677a, this, 1);
            }
        }
    }

    /* renamed from: e */
    private String m740e() {
        return m745a(this.f13375k, 6) ? f13367c : f13366b;
    }

    /* renamed from: a */
    public static boolean m745a(Context context, int i) {
        try {
            return context.createPackageContext(f13365a, 2).getPackageManager().getPackageInfo(f13365a, 0).versionCode >= i;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: com.tsf.shell.services.d$b */
    /* loaded from: classes.dex */
    class C4104b extends BroadcastReceiver {
        C4104b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C3359a.f11090d.f11189c.m2630a(intent.getAction(), intent.getExtras().getInt("status"));
        }
    }

    /* renamed from: c */
    public void m742c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f13368d);
        intentFilter.addAction(f13369e);
        intentFilter.addAction(f13370f);
        intentFilter.addAction(f13372h);
        intentFilter.addAction(f13371g);
        intentFilter.addAction(f13373i);
        intentFilter.addAction(f13374j);
        this.f13375k.registerReceiver(this.f13378n, intentFilter);
    }

    /* renamed from: d */
    public void m741d() {
        synchronized (this) {
            if (this.f13377m != null) {
                try {
                    this.f13375k.unbindService(this);
                    this.f13377m = null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f13375k.stopService(new Intent(f13366b));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f13377m = InterfaceC0850a.AbstractBinderC0851a.m10897a(iBinder);
            while (!this.f13376l.isEmpty()) {
                try {
                    this.f13376l.remove(0).mo739a(this.f13377m);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f13377m = null;
            this.f13376l.clear();
        }
    }
}
