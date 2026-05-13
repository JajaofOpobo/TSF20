package com.censivn.C3DEngine.b.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.j;
import com.tsf.shell.services.LauncherAccessibilityService;
import com.tsf.shell.utils.g;
import com.tsf.shell.utils.m;
import com.tsf.shell.utils.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {
    private int b;
    private int c;
    private boolean g;
    private boolean j;
    private ArrayList<a> d = new ArrayList<>();
    private boolean e = false;
    private boolean f = false;
    private boolean h = false;
    private ArrayList<Runnable> i = new ArrayList<>();
    ArrayList<a> a = new ArrayList<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    @SuppressLint({"NewApi"})
    public e(Activity activity) {
        com.tsf.shell.manager.a.b = this;
        com.censivn.C3DEngine.b.b.a.b(activity);
        com.censivn.C3DEngine.b.b.a.a(a(activity) ? 0 : r.a(activity));
        g.c();
        if (!com.tsf.shell.manager.b.e.P()) {
            this.g = true;
            a(activity, true, true, true);
        } else {
            this.g = false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!com.tsf.shell.manager.b.e.O()) {
                b(activity, false, false);
            }
        } else if (com.tsf.shell.manager.b.e.O()) {
            b(activity, true, false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!com.tsf.shell.manager.b.e.N() && e(activity) > 0) {
                a(activity, true, false);
            }
        } else if (com.tsf.shell.manager.b.e.N() && e(activity) > 0) {
            a(activity, true, false);
        }
        if (g.b()) {
            com.censivn.C3DEngine.b.b.a.a(activity, false);
        }
        if (g.b()) {
            this.b = activity.getResources().getConfiguration().screenHeightDp;
            this.c = activity.getResources().getConfiguration().orientation;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            d(activity);
        } else {
            activity.getWindow().addFlags(ItemInfo.APP_VERSION_CODE);
            activity.getWindow().addFlags(ItemInfo.APP_VERSION_NAME);
        }
        f();
        b(activity);
    }

    private void f() {
        StackTraceElement[] stackTrace;
        Home b2 = Home.b();
        int at = com.tsf.shell.manager.b.e.at();
        if (at == -1) {
            int requestedOrientation = b2.getRequestedOrientation();
            try {
                b2.setRequestedOrientation(0);
                int orientation = b2.getWindowManager().getDefaultDisplay().getOrientation();
                b2.setRequestedOrientation(requestedOrientation);
                com.censivn.C3DEngine.b.b.a.N = (4 - orientation) % 4;
                com.tsf.shell.manager.b.e.s(com.censivn.C3DEngine.b.b.a.N);
                return;
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                int length = e.getStackTrace().length;
                String str = "";
                for (int i = 0; i < length; i++) {
                    str = str + stackTrace[i].toString() + "  '\\'";
                }
                hashMap.put("error", str);
                m.a("EVENT_ISSUSE_SET_REQUESTED_ORIENTATION", hashMap);
                com.censivn.C3DEngine.b.b.a.N = 3;
                return;
            }
        }
        com.censivn.C3DEngine.b.b.a.N = at;
    }

    public void a(a aVar) {
        if (!this.d.contains(aVar)) {
            this.d.add(aVar);
        }
    }

    public void b(a aVar) {
        if (this.d.contains(aVar)) {
            this.d.remove(aVar);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean a(Activity activity) {
        return (Build.VERSION.SDK_INT >= 13 ? r.a(activity, (float) activity.getResources().getConfiguration().screenHeightDp) : 0) == activity.getWindowManager().getDefaultDisplay().getHeight();
    }

    public boolean a() {
        return this.e;
    }

    public void b(Activity activity) {
        if (!this.e) {
            this.e = true;
            if (com.tsf.shell.manager.b.e.a(activity) == -1) {
                switch ((activity.getWindowManager().getDefaultDisplay().getRotation() + com.censivn.C3DEngine.b.b.a.N) % 4) {
                    case 0:
                        activity.setRequestedOrientation(0);
                        return;
                    case 1:
                        if (Build.VERSION.SDK_INT > 8) {
                            activity.setRequestedOrientation(9);
                            return;
                        } else {
                            activity.setRequestedOrientation(1);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT > 8) {
                            activity.setRequestedOrientation(8);
                            return;
                        } else {
                            activity.setRequestedOrientation(0);
                            return;
                        }
                    case 3:
                        activity.setRequestedOrientation(1);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public void c(Activity activity) {
        if (this.e) {
            this.e = false;
            com.tsf.shell.manager.b.e.b(com.tsf.shell.manager.b.e.a(activity), activity);
        }
    }

    @SuppressLint({"NewApi"})
    public void a(Activity activity, Configuration configuration) {
        if (g.b()) {
            if (this.b != configuration.screenHeightDp) {
                this.b = configuration.screenHeightDp;
                com.censivn.C3DEngine.b.b.a.a(activity, this.c == configuration.orientation);
            }
            if (this.c != configuration.orientation) {
                this.c = configuration.orientation;
                if (b() && com.censivn.C3DEngine.b.b.a.K == 0) {
                    a(activity, false, false);
                } else if (b() != com.tsf.shell.manager.b.e.N()) {
                    a(activity, com.tsf.shell.manager.b.e.N(), false);
                    com.censivn.C3DEngine.b.b.a.a(activity);
                }
                d(activity);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            switch (activity.getResources().getConfiguration().orientation) {
                case 1:
                    activity.getWindow().getDecorView().setSystemUiVisibility(1792);
                    return;
                case 2:
                    activity.getWindow().getDecorView().setSystemUiVisibility(1280);
                    return;
                default:
                    return;
            }
        }
    }

    public boolean b() {
        return this.f;
    }

    public void a(Activity activity, boolean z, boolean z2) {
        this.f = z;
        if (Build.VERSION.SDK_INT >= 21) {
            if (g.b()) {
                Window window = activity.getWindow();
                if (z) {
                    window.clearFlags(134217728);
                } else {
                    window.setFlags(134217728, 134217728);
                }
            }
        } else if (g.b()) {
            Window window2 = activity.getWindow();
            if (z) {
                window2.setFlags(134217728, 134217728);
            } else {
                window2.clearFlags(134217728);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void b(Activity activity, boolean z, boolean z2) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT < 21) {
                g.a(activity, z);
            }
            if (z2) {
                com.tsf.shell.manager.b.e.c(Boolean.valueOf(z));
            }
        }
    }

    public void a(boolean z, boolean z2, boolean z3) {
        a(Home.b(), z, z2, z3);
    }

    public void a(final Activity activity, final boolean z, final boolean z2, final boolean z3) {
        if (this.h) {
            this.i.add(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(activity, z, z2, z3);
                }
            });
            return;
        }
        if (z) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags |= 1024;
            activity.getWindow().setAttributes(attributes);
        } else {
            WindowManager.LayoutParams attributes2 = activity.getWindow().getAttributes();
            attributes2.flags &= -1025;
            activity.getWindow().setAttributes(attributes2);
        }
        if (z2) {
            com.censivn.C3DEngine.b.b.a.c();
        }
        this.h = true;
        Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.h = false;
                if (!e.this.i.isEmpty()) {
                    ((Runnable) e.this.i.remove(0)).run();
                }
            }
        };
        if (z3) {
            runnable.run();
        } else {
            com.censivn.C3DEngine.a.a().a(runnable, 500L);
        }
    }

    public boolean c() {
        return this.g;
    }

    public void a(boolean z) {
        if (this.g != z) {
            if (z) {
                WindowManager.LayoutParams attributes = Home.b().getWindow().getAttributes();
                attributes.flags |= 1024;
                Home.b().getWindow().setAttributes(attributes);
                this.g = true;
            } else {
                WindowManager.LayoutParams attributes2 = Home.b().getWindow().getAttributes();
                attributes2.flags &= -1025;
                Home.b().getWindow().setAttributes(attributes2);
                this.g = false;
            }
            com.tsf.shell.manager.b.e.d(Boolean.valueOf(this.g ? false : true));
            com.censivn.C3DEngine.b.b.a.c();
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(com.censivn.C3DEngine.b.b.a.B, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A);
                }
            });
        }
    }

    public void d() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.4
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(!e.this.g);
            }
        });
    }

    public void e() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.c()) {
                    e.this.a(false);
                    e.this.j = true;
                }
                Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.5.1
                    @Override // java.lang.Runnable
                    @SuppressLint({"NewApi"})
                    public void run() {
                        try {
                            Object systemService = Home.b().getSystemService("statusbar");
                            if (systemService != null) {
                                systemService.getClass().getMethod("expand", new Class[0]).invoke(systemService, new Object[0]);
                            }
                        } catch (Exception e) {
                            try {
                                Object systemService2 = Home.b().getSystemService("statusbar");
                                if (systemService2 != null) {
                                    systemService2.getClass().getMethod("expandNotificationsPanel", new Class[0]).invoke(systemService2, new Object[0]);
                                }
                            } catch (Exception e2) {
                                if (Build.VERSION.SDK_INT >= 16) {
                                    LauncherAccessibilityService a2 = LauncherAccessibilityService.a();
                                    if (a2 != null) {
                                        a2.performGlobalAction(4);
                                    } else {
                                        new AlertDialog.Builder(com.censivn.C3DEngine.a.d()).setTitle(b.i.accessibility_service_enable).setMessage(b.i.accessibility_service_enable_long).setPositiveButton(b.i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.censivn.C3DEngine.b.c.e.5.1.2
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                Home.b().startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                                            }
                                        }).setNegativeButton(b.i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.censivn.C3DEngine.b.c.e.5.1.1
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                            }
                                        }).show();
                                    }
                                }
                            }
                        }
                    }
                };
                if (e.this.j) {
                    com.censivn.C3DEngine.a.a().a(runnable, 300L);
                } else {
                    com.censivn.C3DEngine.a.a().a(runnable);
                }
            }
        });
    }

    public void b(boolean z) {
        if (this.j && z) {
            a(true);
            this.j = false;
        }
    }

    @SuppressLint({"NewApi"})
    public static int e(Activity activity) {
        int a2;
        if (g.b()) {
            if (activity.getResources().getConfiguration().screenHeightDp < activity.getResources().getConfiguration().screenWidthDp) {
                a2 = (com.censivn.C3DEngine.b.b.a.L - com.censivn.C3DEngine.b.b.a.J) - r.a(activity, activity.getResources().getConfiguration().screenHeightDp);
            } else {
                a2 = (com.censivn.C3DEngine.b.b.a.M - com.censivn.C3DEngine.b.b.a.J) - r.a(activity, activity.getResources().getConfiguration().screenHeightDp);
            }
            if (a2 < 5) {
                return 0;
            }
            return a2;
        }
        return 0;
    }

    public void a(int i, int i2, int i3, int i4) {
        j.a(i, i2, i3, i4);
        com.tsf.shell.manager.a.f.a(i, i2, i3, i4);
        Iterator<a> it = this.d.iterator();
        while (it.hasNext()) {
            this.a.add(it.next());
        }
        Iterator<a> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(i, i2, i3, i4);
        }
        this.a.clear();
    }

    /* loaded from: classes.dex */
    public static class b implements a {
        @Override // com.censivn.C3DEngine.b.c.e.a
        public void a(int i, int i2, int i3, int i4) {
        }
    }
}
