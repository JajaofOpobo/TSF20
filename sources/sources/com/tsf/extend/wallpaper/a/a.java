package com.tsf.extend.wallpaper.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static c a = new c();
    private static C0068a b;

    public interface b {
        void g();
    }

    private a() {
    }

    /* JADX INFO: renamed from: com.tsf.extend.wallpaper.a.a$a, reason: collision with other inner class name */
    private static class C0068a extends BroadcastReceiver {
        private C0068a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (a.a != null) {
                a.a.b();
            }
        }
    }

    public static synchronized void a(Context context) {
        if (context != null) {
            if (b == null) {
                b = new C0068a();
                context.getApplicationContext().registerReceiver(b, new IntentFilter("android.intent.action.WALLPAPER_CHANGED"));
            }
        }
    }

    public static synchronized void b(Context context) {
        if (context != null) {
            if (b != null) {
                try {
                    a();
                    context.getApplicationContext().unregisterReceiver(b);
                    b = null;
                } catch (Exception e) {
                    b = null;
                } catch (Throwable th) {
                    b = null;
                    throw th;
                }
            }
        }
    }

    public static void a(b bVar) {
        synchronized (a.class) {
            if (a != null && bVar != null) {
                a.a(bVar);
            }
        }
    }

    public static void b(b bVar) {
        synchronized (a.class) {
            if (a != null && bVar != null) {
                a.b(bVar);
            }
        }
    }

    public static void a() {
        synchronized (a.class) {
            if (a != null) {
                a.a();
            }
        }
    }

    private static final class c {
        private CopyOnWriteArrayList<b> a = new CopyOnWriteArrayList<>();

        public void a(b bVar) {
            if (bVar != null && !this.a.contains(bVar)) {
                this.a.add(bVar);
            }
        }

        public void b(b bVar) {
            if (bVar != null && this.a.size() > 0) {
                this.a.remove(bVar);
            }
        }

        public void a() {
            if (this.a.size() > 0) {
                this.a.clear();
            }
        }

        public void b() {
            if (this.a.size() > 0) {
                for (b bVar : this.a) {
                    if (bVar != null && this.a.contains(bVar)) {
                        bVar.g();
                    }
                }
            }
        }
    }
}
