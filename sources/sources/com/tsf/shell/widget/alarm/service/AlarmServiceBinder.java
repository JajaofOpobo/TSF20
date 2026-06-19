package com.tsf.shell.widget.alarm.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tsf.shell.widget.alarm.service.IAlarmService;
import com.tsf.shell.widget.alarm.service.IAlarmCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmServiceBinder implements ServiceConnection {
    public static String a = "com.tsf.shell.widget.alarm.AlarmStatenshell.service";
    public static c b;
    private List<a> c = new ArrayList();
    private com.tsf.shell.widget.alarm.service.IAlarmCallback d;
    private Context e;
    private InterfaceC0180c f;
    private b g;

    public interface a {
        void a(com.tsf.shell.widget.alarm.service.IAlarmCallback bVar);
    }

    /* JADX INFO: renamed from: com.tsf.shell.widget.alarm.service.AlarmServiceBinder$c, reason: collision with other inner class name */
    public interface InterfaceC0180c {
        void a(int i, byte[] bArr);
    }

    class b extends com.tsf.shell.widget.alarm.service.IAlarmService.AbstractBinderC0177a {
        b() {
        }

        @Override // com.tsf.shell.widget.alarm.service.IAlarmService
        public void a(int i, byte[] bArr) {
            if (c.this.f != null) {
                c.this.f.a(i, bArr);
            }
        }
    }

    public void a(InterfaceC0180c interfaceC0180c) {
        this.f = interfaceC0180c;
    }

    public c(Context context) {
        this.e = context;
        b = this;
        this.g = new IAlarmCallback();
    }

    public void a() {
        Intent intent = new Intent(a);
        intent.setPackage(this.e.getPackageName());
        this.e.bindService(intent, this, 1);
    }

    public void b() {
        if (this.d != null) {
            try {
                this.d.b(this.g);
                this.e.unbindService(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            if (this.d != null) {
                try {
                    aVar.a(this.d);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                this.c.add(aVar);
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.d = IAlarmCallback.a.a(iBinder);
            try {
                this.d.a(this.g);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            while (!this.c.isEmpty()) {
                try {
                    this.c.remove(0).a(this.d);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.d = null;
            this.c.clear();
        }
    }
}
