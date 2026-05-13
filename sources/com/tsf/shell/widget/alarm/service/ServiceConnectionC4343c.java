package com.tsf.shell.widget.alarm.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tsf.shell.widget.alarm.service.InterfaceC4337a;
import com.tsf.shell.widget.alarm.service.InterfaceC4340b;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.shell.widget.alarm.service.c */
/* loaded from: classes.dex */
public class ServiceConnectionC4343c implements ServiceConnection {

    /* renamed from: a */
    public static String f14070a = "com.tsf.shell.widget.alarm.inshell.service";

    /* renamed from: b */
    public static ServiceConnectionC4343c f14071b;

    /* renamed from: c */
    private List<InterfaceC4344a> f14072c = new ArrayList();

    /* renamed from: d */
    private InterfaceC4340b f14073d;

    /* renamed from: e */
    private Context f14074e;

    /* renamed from: f */
    private InterfaceC4346c f14075f;

    /* renamed from: g */
    private BinderC4345b f14076g;

    /* renamed from: com.tsf.shell.widget.alarm.service.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4344a {
        /* renamed from: a */
        void mo153a(InterfaceC4340b interfaceC4340b);
    }

    /* renamed from: com.tsf.shell.widget.alarm.service.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC4346c {
        /* renamed from: a */
        void mo171a(int i, byte[] bArr);
    }

    /* renamed from: com.tsf.shell.widget.alarm.service.c$b */
    /* loaded from: classes.dex */
    class BinderC4345b extends InterfaceC4337a.AbstractBinderC4338a {
        BinderC4345b() {
        }

        @Override // com.tsf.shell.widget.alarm.service.InterfaceC4337a
        /* renamed from: a */
        public void mo187a(int i, byte[] bArr) {
            if (ServiceConnectionC4343c.this.f14075f != null) {
                ServiceConnectionC4343c.this.f14075f.mo171a(i, bArr);
            }
        }
    }

    /* renamed from: a */
    public void m190a(InterfaceC4346c interfaceC4346c) {
        this.f14075f = interfaceC4346c;
    }

    public ServiceConnectionC4343c(Context context) {
        this.f14074e = context;
        f14071b = this;
        this.f14076g = new BinderC4345b();
    }

    /* renamed from: a */
    public void m192a() {
        Intent intent = new Intent(f14070a);
        intent.setPackage(this.f14074e.getPackageName());
        this.f14074e.bindService(intent, this, 1);
    }

    /* renamed from: b */
    public void m188b() {
        if (this.f14073d != null) {
            try {
                this.f14073d.mo193b(this.f14076g);
                this.f14074e.unbindService(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m191a(InterfaceC4344a interfaceC4344a) {
        synchronized (this) {
            if (this.f14073d != null) {
                try {
                    interfaceC4344a.mo153a(this.f14073d);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                this.f14072c.add(interfaceC4344a);
                m192a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f14073d = InterfaceC4340b.AbstractBinderC4341a.m199a(iBinder);
            try {
                this.f14073d.mo196a(this.f14076g);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            while (!this.f14072c.isEmpty()) {
                try {
                    this.f14072c.remove(0).mo153a(this.f14073d);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f14073d = null;
            this.f14072c.clear();
        }
    }
}
