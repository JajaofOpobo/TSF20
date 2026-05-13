package com.tsf.extend.wallpaper.p085a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.tsf.extend.wallpaper.a.a */
/* loaded from: classes.dex */
public class C2021a {

    /* renamed from: a */
    private static C2025c f6581a = new C2025c();

    /* renamed from: b */
    private static C2023a f6582b;

    /* renamed from: com.tsf.extend.wallpaper.a.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2024b {
        /* renamed from: g */
        void mo6700g();
    }

    private C2021a() {
    }

    /* renamed from: com.tsf.extend.wallpaper.a.a$a */
    /* loaded from: classes.dex */
    private static class C2023a extends BroadcastReceiver {
        private C2023a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C2021a.f6581a != null) {
                C2021a.f6581a.m6697b();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m6705a(Context context) {
        synchronized (C2021a.class) {
            if (context != null) {
                if (f6582b == null) {
                    f6582b = new C2023a();
                    context.getApplicationContext().registerReceiver(f6582b, new IntentFilter("android.intent.action.WALLPAPER_CHANGED"));
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m6702b(Context context) {
        synchronized (C2021a.class) {
            if (context != null) {
                if (f6582b != null) {
                    try {
                        m6706a();
                        context.getApplicationContext().unregisterReceiver(f6582b);
                        f6582b = null;
                    } catch (Exception e) {
                        f6582b = null;
                    } catch (Throwable th) {
                        f6582b = null;
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m6704a(InterfaceC2024b interfaceC2024b) {
        synchronized (C2021a.class) {
            if (f6581a != null && interfaceC2024b != null) {
                f6581a.m6698a(interfaceC2024b);
            }
        }
    }

    /* renamed from: b */
    public static void m6701b(InterfaceC2024b interfaceC2024b) {
        synchronized (C2021a.class) {
            if (f6581a != null && interfaceC2024b != null) {
                f6581a.m6696b(interfaceC2024b);
            }
        }
    }

    /* renamed from: a */
    public static void m6706a() {
        synchronized (C2021a.class) {
            if (f6581a != null) {
                f6581a.m6699a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.a.a$c */
    /* loaded from: classes.dex */
    public static final class C2025c {

        /* renamed from: a */
        private CopyOnWriteArrayList<InterfaceC2024b> f6583a = new CopyOnWriteArrayList<>();

        /* renamed from: a */
        public void m6698a(InterfaceC2024b interfaceC2024b) {
            if (interfaceC2024b != null && !this.f6583a.contains(interfaceC2024b)) {
                this.f6583a.add(interfaceC2024b);
            }
        }

        /* renamed from: b */
        public void m6696b(InterfaceC2024b interfaceC2024b) {
            if (interfaceC2024b != null && this.f6583a.size() > 0) {
                this.f6583a.remove(interfaceC2024b);
            }
        }

        /* renamed from: a */
        public void m6699a() {
            if (this.f6583a.size() > 0) {
                this.f6583a.clear();
            }
        }

        /* renamed from: b */
        public void m6697b() {
            if (this.f6583a.size() > 0) {
                Iterator<InterfaceC2024b> it = this.f6583a.iterator();
                while (it.hasNext()) {
                    InterfaceC2024b next = it.next();
                    if (next != null && this.f6583a.contains(next)) {
                        next.mo6700g();
                    }
                }
            }
        }
    }
}
