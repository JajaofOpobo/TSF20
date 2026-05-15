package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ev extends BroadcastReceiver {
    private static ev e;
    boolean a;
    Boolean b;
    private boolean d = false;
    private final dt<eu> c = new dt<>();

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
        if (e == null) {
            e = new ev();
        }
        return e;
    }

    public synchronized void b() {
        Context contextB = Cdo.a().b();
        this.d = contextB.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        this.a = a(contextB);
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
        Context contextB = Cdo.a().b();
        this.a = a(contextB);
        contextB.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean zA = a(context);
        if (this.a != zA) {
            this.a = zA;
            Iterator<eu> it = f().iterator();
            while (it.hasNext()) {
                it.next().a(this.a);
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
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            switch (activeNetworkInfo.getType()) {
            }
            return a.NONE_OR_UNKNOWN;
        }
        return a.NONE_OR_UNKNOWN;
    }
}
