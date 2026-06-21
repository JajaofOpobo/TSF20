package com.tsf.shell.widget.alarm.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements ServiceConnection {
    public static String a = "com.tsf.shell.widget.alarm.inshell.service";
    public static g b;
    private List c = new ArrayList();
    private d d;
    private Context e;
    private j f;
    private i g;

    public void a(j jVar) {
        this.f = jVar;
    }

    public g(Context context) {
        this.e = context;
        b = this;
        this.g = new i(this);
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

    public void a(h hVar) {
        synchronized (this) {
            if (this.d != null) {
                try {
                    hVar.a(this.d);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                this.c.add(hVar);
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.d = e.a(iBinder);
            try {
                this.d.a(this.g);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            while (!this.c.isEmpty()) {
                try {
                    ((h) this.c.remove(0)).a(this.d);
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
