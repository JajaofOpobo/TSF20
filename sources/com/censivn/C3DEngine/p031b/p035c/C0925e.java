package com.censivn.C3DEngine.p031b.p035c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p131f.C2942j;
import com.tsf.shell.services.LauncherAccessibilityService;
import com.tsf.shell.utils.C4170g;
import com.tsf.shell.utils.C4177m;
import com.tsf.shell.utils.C4182r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.c.e */
/* loaded from: classes.dex */
public class C0925e {

    /* renamed from: b */
    private int f2717b;

    /* renamed from: c */
    private int f2718c;

    /* renamed from: g */
    private boolean f2722g;

    /* renamed from: j */
    private boolean f2725j;

    /* renamed from: d */
    private ArrayList<InterfaceC0934a> f2719d = new ArrayList<>();

    /* renamed from: e */
    private boolean f2720e = false;

    /* renamed from: f */
    private boolean f2721f = false;

    /* renamed from: h */
    private boolean f2723h = false;

    /* renamed from: i */
    private ArrayList<Runnable> f2724i = new ArrayList<>();

    /* renamed from: a */
    ArrayList<InterfaceC0934a> f2716a = new ArrayList<>();

    /* renamed from: com.censivn.C3DEngine.b.c.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0934a {
        /* renamed from: a */
        void mo1664a(int i, int i2, int i3, int i4);
    }

    @SuppressLint({"NewApi"})
    public C0925e(Activity activity) {
        C3359a.f11088b = this;
        C0892a.m10734b(activity);
        C0892a.m10740a(m10569a(activity) ? 0 : C4182r.m632a(activity));
        C4170g.m683c();
        if (!C3430e.m2556P()) {
            this.f2722g = true;
            m10566a(activity, true, true, true);
        } else {
            this.f2722g = false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!C3430e.m2557O()) {
                m10558b(activity, false, false);
            }
        } else if (C3430e.m2557O()) {
            m10558b(activity, true, false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!C3430e.m2558N() && m10547e(activity) > 0) {
                m10567a(activity, true, false);
            }
        } else if (C3430e.m2558N() && m10547e(activity) > 0) {
            m10567a(activity, true, false);
        }
        if (C4170g.m684b()) {
            C0892a.m10737a(activity, false);
        }
        if (C4170g.m684b()) {
            this.f2717b = activity.getResources().getConfiguration().screenHeightDp;
            this.f2718c = activity.getResources().getConfiguration().orientation;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            m10549d(activity);
        } else {
            activity.getWindow().addFlags(ItemInfo.APP_VERSION_CODE);
            activity.getWindow().addFlags(ItemInfo.APP_VERSION_NAME);
        }
        m10546f();
        m10559b(activity);
    }

    /* renamed from: f */
    private void m10546f() {
        StackTraceElement[] stackTrace;
        Home m6177b = Home.m6177b();
        int m2505at = C3430e.m2505at();
        if (m2505at == -1) {
            int requestedOrientation = m6177b.getRequestedOrientation();
            try {
                m6177b.setRequestedOrientation(0);
                int orientation = m6177b.getWindowManager().getDefaultDisplay().getOrientation();
                m6177b.setRequestedOrientation(requestedOrientation);
                C0892a.f2563N = (4 - orientation) % 4;
                C3430e.m2424s(C0892a.f2563N);
                return;
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                int length = e.getStackTrace().length;
                String str = "";
                for (int i = 0; i < length; i++) {
                    str = str + stackTrace[i].toString() + "  '\\'";
                }
                hashMap.put("error", str);
                C4177m.m667a("EVENT_ISSUSE_SET_REQUESTED_ORIENTATION", hashMap);
                C0892a.f2563N = 3;
                return;
            }
        }
        C0892a.f2563N = m2505at;
    }

    /* renamed from: a */
    public void m10565a(InterfaceC0934a interfaceC0934a) {
        if (!this.f2719d.contains(interfaceC0934a)) {
            this.f2719d.add(interfaceC0934a);
        }
    }

    /* renamed from: b */
    public void m10557b(InterfaceC0934a interfaceC0934a) {
        if (this.f2719d.contains(interfaceC0934a)) {
            this.f2719d.remove(interfaceC0934a);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public boolean m10569a(Activity activity) {
        return (Build.VERSION.SDK_INT >= 13 ? C4182r.m631a(activity, (float) activity.getResources().getConfiguration().screenHeightDp) : 0) == activity.getWindowManager().getDefaultDisplay().getHeight();
    }

    /* renamed from: a */
    public boolean m10571a() {
        return this.f2720e;
    }

    /* renamed from: b */
    public void m10559b(Activity activity) {
        if (!this.f2720e) {
            this.f2720e = true;
            if (C3430e.m2539a(activity) == -1) {
                switch ((activity.getWindowManager().getDefaultDisplay().getRotation() + C0892a.f2563N) % 4) {
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

    /* renamed from: c */
    public void m10552c(Activity activity) {
        if (this.f2720e) {
            this.f2720e = false;
            C3430e.m2494b(C3430e.m2539a(activity), activity);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m10568a(Activity activity, Configuration configuration) {
        if (C4170g.m684b()) {
            if (this.f2717b != configuration.screenHeightDp) {
                this.f2717b = configuration.screenHeightDp;
                C0892a.m10737a(activity, this.f2718c == configuration.orientation);
            }
            if (this.f2718c != configuration.orientation) {
                this.f2718c = configuration.orientation;
                if (m10560b() && C0892a.f2560K == 0) {
                    m10567a(activity, false, false);
                } else if (m10560b() != C3430e.m2558N()) {
                    m10567a(activity, C3430e.m2558N(), false);
                    C0892a.m10738a(activity);
                }
                m10549d(activity);
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m10549d(Activity activity) {
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

    /* renamed from: b */
    public boolean m10560b() {
        return this.f2721f;
    }

    /* renamed from: a */
    public void m10567a(Activity activity, boolean z, boolean z2) {
        this.f2721f = z;
        if (Build.VERSION.SDK_INT >= 21) {
            if (C4170g.m684b()) {
                Window window = activity.getWindow();
                if (z) {
                    window.clearFlags(134217728);
                } else {
                    window.setFlags(134217728, 134217728);
                }
            }
        } else if (C4170g.m684b()) {
            Window window2 = activity.getWindow();
            if (z) {
                window2.setFlags(134217728, 134217728);
            } else {
                window2.clearFlags(134217728);
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m10558b(Activity activity, boolean z, boolean z2) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT < 21) {
                C4170g.m688a(activity, z);
            }
            if (z2) {
                C3430e.m2486c(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: a */
    public void m10561a(boolean z, boolean z2, boolean z3) {
        m10566a(Home.m6177b(), z, z2, z3);
    }

    /* renamed from: a */
    public void m10566a(final Activity activity, final boolean z, final boolean z2, final boolean z3) {
        if (this.f2723h) {
            this.f2724i.add(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    C0925e.this.m10566a(activity, z, z2, z3);
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
            C0892a.m10733c();
        }
        this.f2723h = true;
        Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C0925e.this.f2723h = false;
                if (!C0925e.this.f2724i.isEmpty()) {
                    ((Runnable) C0925e.this.f2724i.remove(0)).run();
                }
            }
        };
        if (z3) {
            runnable.run();
        } else {
            C0853a.m10865a().m10587a(runnable, 500L);
        }
    }

    /* renamed from: c */
    public boolean m10553c() {
        return this.f2722g;
    }

    /* renamed from: a */
    public void m10562a(boolean z) {
        if (this.f2722g != z) {
            if (z) {
                WindowManager.LayoutParams attributes = Home.m6177b().getWindow().getAttributes();
                attributes.flags |= 1024;
                Home.m6177b().getWindow().setAttributes(attributes);
                this.f2722g = true;
            } else {
                WindowManager.LayoutParams attributes2 = Home.m6177b().getWindow().getAttributes();
                attributes2.flags &= -1025;
                Home.m6177b().getWindow().setAttributes(attributes2);
                this.f2722g = false;
            }
            C3430e.m2479d(Boolean.valueOf(this.f2722g ? false : true));
            C0892a.m10733c();
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.3
                @Override // java.lang.Runnable
                public void run() {
                    C0925e.this.m10570a(C0892a.f2551B, C0892a.f2552C, C0892a.f2590z, C0892a.f2550A);
                }
            });
        }
    }

    /* renamed from: d */
    public void m10550d() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.4
            @Override // java.lang.Runnable
            public void run() {
                C0925e.this.m10562a(!C0925e.this.f2722g);
            }
        });
    }

    /* renamed from: e */
    public void m10548e() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (C0925e.this.m10553c()) {
                    C0925e.this.m10562a(false);
                    C0925e.this.f2725j = true;
                }
                Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.5.1
                    @Override // java.lang.Runnable
                    @SuppressLint({"NewApi"})
                    public void run() {
                        try {
                            Object systemService = Home.m6177b().getSystemService("statusbar");
                            if (systemService != null) {
                                systemService.getClass().getMethod("expand", new Class[0]).invoke(systemService, new Object[0]);
                            }
                        } catch (Exception e) {
                            try {
                                Object systemService2 = Home.m6177b().getSystemService("statusbar");
                                if (systemService2 != null) {
                                    systemService2.getClass().getMethod("expandNotificationsPanel", new Class[0]).invoke(systemService2, new Object[0]);
                                }
                            } catch (Exception e2) {
                                if (Build.VERSION.SDK_INT >= 16) {
                                    LauncherAccessibilityService m777a = LauncherAccessibilityService.m777a();
                                    if (m777a != null) {
                                        m777a.performGlobalAction(4);
                                    } else {
                                        new AlertDialog.Builder(C0853a.m10856d()).setTitle(C1306b.C1315i.accessibility_service_enable).setMessage(C1306b.C1315i.accessibility_service_enable_long).setPositiveButton(C1306b.C1315i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.censivn.C3DEngine.b.c.e.5.1.2
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                Home.m6177b().startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                                            }
                                        }).setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.censivn.C3DEngine.b.c.e.5.1.1
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
                if (C0925e.this.f2725j) {
                    C0853a.m10865a().m10587a(runnable, 300L);
                } else {
                    C0853a.m10865a().m10588a(runnable);
                }
            }
        });
    }

    /* renamed from: b */
    public void m10554b(boolean z) {
        if (this.f2725j && z) {
            m10562a(true);
            this.f2725j = false;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public static int m10547e(Activity activity) {
        int m631a;
        if (C4170g.m684b()) {
            if (activity.getResources().getConfiguration().screenHeightDp < activity.getResources().getConfiguration().screenWidthDp) {
                m631a = (C0892a.f2561L - C0892a.f2559J) - C4182r.m631a(activity, activity.getResources().getConfiguration().screenHeightDp);
            } else {
                m631a = (C0892a.f2562M - C0892a.f2559J) - C4182r.m631a(activity, activity.getResources().getConfiguration().screenHeightDp);
            }
            if (m631a < 5) {
                return 0;
            }
            return m631a;
        }
        return 0;
    }

    /* renamed from: a */
    public void m10570a(int i, int i2, int i3, int i4) {
        C2942j.m4164a(i, i2, i3, i4);
        C3359a.f11092f.m1612a(i, i2, i3, i4);
        Iterator<InterfaceC0934a> it = this.f2719d.iterator();
        while (it.hasNext()) {
            this.f2716a.add(it.next());
        }
        Iterator<InterfaceC0934a> it2 = this.f2716a.iterator();
        while (it2.hasNext()) {
            it2.next().mo1664a(i, i2, i3, i4);
        }
        this.f2716a.clear();
    }

    /* renamed from: com.censivn.C3DEngine.b.c.e$b */
    /* loaded from: classes.dex */
    public static class C0935b implements InterfaceC0934a {
        @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
        /* renamed from: a */
        public void mo1664a(int i, int i2, int i3, int i4) {
        }
    }
}
