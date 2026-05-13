package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.List;
/* renamed from: com.flurry.sdk.ev */
/* loaded from: classes.dex */
public class C1265ev extends BroadcastReceiver {

    /* renamed from: e */
    private static C1265ev f4026e;

    /* renamed from: a */
    boolean f4027a;

    /* renamed from: b */
    Boolean f4028b;

    /* renamed from: d */
    private boolean f4030d = false;

    /* renamed from: c */
    private final C1217dt<InterfaceC1264eu> f4029c = new C1217dt<>();

    /* renamed from: com.flurry.sdk.ev$a */
    /* loaded from: classes.dex */
    public enum EnumC1266a {
        NONE_OR_UNKNOWN(0),
        WIFI(1),
        CELL(2);
        

        /* renamed from: d */
        private int f4035d;

        EnumC1266a(int i) {
            this.f4035d = i;
        }

        /* renamed from: a */
        public int m9199a() {
            return this.f4035d;
        }
    }

    /* renamed from: a */
    public static synchronized C1265ev m9207a() {
        C1265ev c1265ev;
        synchronized (C1265ev.class) {
            if (f4026e == null) {
                f4026e = new C1265ev();
            }
            c1265ev = f4026e;
        }
        return c1265ev;
    }

    /* renamed from: b */
    public synchronized void m9204b() {
        Context m9386b = C1211do.m9390a().m9386b();
        this.f4030d = m9386b.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        this.f4027a = m9206a(m9386b);
        if (this.f4030d) {
            m9202d();
        }
    }

    /* renamed from: a */
    public synchronized void m9205a(InterfaceC1264eu interfaceC1264eu) {
        this.f4029c.m9362a(interfaceC1264eu);
    }

    /* renamed from: f */
    private synchronized List<InterfaceC1264eu> m9200f() {
        return this.f4029c.m9363a();
    }

    /* renamed from: c */
    public boolean m9203c() {
        return this.f4028b != null ? this.f4028b.booleanValue() : this.f4027a;
    }

    /* renamed from: d */
    void m9202d() {
        Context m9386b = C1211do.m9390a().m9386b();
        this.f4027a = m9206a(m9386b);
        m9386b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean m9206a = m9206a(context);
        if (this.f4027a != m9206a) {
            this.f4027a = m9206a;
            for (InterfaceC1264eu interfaceC1264eu : m9200f()) {
                interfaceC1264eu.mo9208a(this.f4027a);
            }
        }
    }

    /* renamed from: a */
    private boolean m9206a(Context context) {
        if (!this.f4030d || context == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    public EnumC1266a m9201e() {
        if (!this.f4030d) {
            return EnumC1266a.NONE_OR_UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C1211do.m9390a().m9386b().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return EnumC1266a.NONE_OR_UNKNOWN;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC1266a.CELL;
            case 1:
            case 9:
                return EnumC1266a.WIFI;
            case 8:
                return EnumC1266a.NONE_OR_UNKNOWN;
            default:
                return EnumC1266a.CELL;
        }
    }
}
