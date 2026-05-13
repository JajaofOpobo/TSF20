package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.List;
/* loaded from: classes.dex */
public class ev extends BroadcastReceiver {
    private static ev e;
    boolean a;
    Boolean b;
    private boolean d = false;
    private final dt<eu> c = new dt<>();

    /* loaded from: classes.dex */
    public enum a {
        NONE_OR_UNKNOWN(0),
        WIFI(1),
        CELL(2);
        
        private int d;

        a(int i) {
            this.d = i;
        }

        public int a() {
            return this.d;
        }
    }

    public static synchronized ev a() {
        ev evVar;
        synchronized (ev.class) {
            if (e == null) {
                e = new ev();
            }
            evVar = e;
        }
        return evVar;
    }

    public synchronized void b() {
        Context b = Cdo.a().b();
        this.d = b.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        this.a = a(b);
        if (this.d) {
            d();
        }
    }

    public synchronized void a(eu euVar) {
        this.c.a(euVar);
    }

    private synchronized List<eu> f() {
        return this.c.a();
    }

    public boolean c() {
        return this.b != null ? this.b.booleanValue() : this.a;
    }

    void d() {
        Context b = Cdo.a().b();
        this.a = a(b);
        b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean a2 = a(context);
        if (this.a != a2) {
            this.a = a2;
            for (eu euVar : f()) {
                euVar.a(this.a);
            }
        }
    }

    private boolean a(Context context) {
        if (!this.d || context == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public a e() {
        if (!this.d) {
            return a.NONE_OR_UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) Cdo.a().b().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return a.NONE_OR_UNKNOWN;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return a.CELL;
            case 1:
            case 9:
                return a.WIFI;
            case 8:
                return a.NONE_OR_UNKNOWN;
            default:
                return a.CELL;
        }
    }
}
