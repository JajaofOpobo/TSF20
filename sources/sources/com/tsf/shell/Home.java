package com.tsf.shell;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.c.a;
import com.flurry.android.FlurryAgent;
import com.tsf.b;
import com.tsf.shell.a.a.d;
import com.tsf.shell.e.d;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.plugin.notice.g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import com.tsf.shell.widget.alarm.service.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class Home extends ActivityGroup implements View.OnLongClickListener, com.tsf.shell.a, com.tsf.shell.manager.bind.c {
    public static int a = (int) (((Math.random() * 1000.0d) * 2.0d) + 1000.0d);
    public static String b = "";
    public static Home c;
    private com.tsf.shell.e.e e;
    private com.censivn.C3DEngine.a.a f;
    private com.tsf.shell.e.f g;
    private boolean k;
    private com.tsf.shell.f.d n;
    private d o;
    private Locale p;
    private com.tsf.shell.a.a.a r;
    private final BroadcastReceiver d = new a();
    private final int[] h = new int[2];
    private SpannableStringBuilder i = null;
    private boolean j = true;
    private boolean l = false;
    private boolean m = false;
    private HashMap<Integer, a.InterfaceC0025a> q = new HashMap<>();
    private boolean s = false;
    private boolean t = false;
    private int u = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;
    private boolean v = false;

    public void a(float f, float f2) {
        this.h[0] = (int) f;
        this.h[1] = (int) f2;
    }

    public static boolean a() {
        return false;
    }

    @Override // android.app.Activity
    public void onStart() {
        char c2 = 0;
        super.onStart();
        if (this.s) {
            FlurryAgent.setReportLocation(false);
            FlurryAgent.setCaptureUncaughtExceptions(false);
            switch (c2) {
                case 0:
                case 1:
                    FlurryAgent.onStartSession(this, "WT8M1JUAHR5C94MX9R78");
                    break;
                case '\n':
                    FlurryAgent.onStartSession(this, "G8CPGSVSNCYXXZ9P4XZX");
                    break;
                default:
                    FlurryAgent.onStartSession(this, "WT8M1JUAHR5C94MX9R78");
                    break;
            }
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.s) {
            FlurryAgent.onEndSession(this);
        }
    }

    public static Home b() {
        return c;
    }

    private void r() {
        if (getPackageName().equals("com.tsf.shell")) {
            b = x.c(b.i.launcher_name_prime);
        } else {
            b = x.c(b.i.launcher_name);
        }
    }

    private boolean s() {
        return getSharedPreferences("config", 0).getBoolean("ShellSummaryShowed", false);
    }

    private void t() {
        SharedPreferences.Editor editorEdit = getSharedPreferences("config", 0).edit();
        editorEdit.putBoolean("ShellSummaryShowed", true);
        editorEdit.commit();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z;
        Intent intent = getIntent();
        if (intent != null) {
            this.s = intent.getBooleanExtra("ShellSummaryShowed", false);
        }
        if (!this.s) {
            this.s = s();
        } else {
            t();
        }
        if (this.s) {
            com.censivn.C3DEngine.a.a(this, "Home");
            if (c == null) {
                c = this;
                r();
                com.tsf.shell.manager.b.e.a();
                com.tsf.shell.manager.b.e.b(com.tsf.shell.manager.b.e.a(this), this);
                com.tsf.shell.utils.g.a();
                new com.censivn.C3DEngine.b.c.e(this);
                if (ShellWallpaperManager.a((Activity) this)) {
                    com.tsf.shell.manager.b.e.s(true);
                } else {
                    com.tsf.shell.manager.b.e.s(false);
                }
                com.tsf.shell.plugin.notice.g.a(this, new g.a() { // from class: com.tsf.shell.Home.1
                    @Override // com.tsf.shell.plugin.notice.g.a
                    public void a(int i) {
                        int i2;
                        try {
                            i2 = com.censivn.C3DEngine.a.d().getPackageManager().getPackageInfo(com.censivn.C3DEngine.a.d().getPackageName(), 0).versionCode;
                        } catch (Exception e) {
                            e.printStackTrace();
                            i2 = -1;
                        }
                        if (i2 == -1 || i > i2) {
                        }
                    }
                }, false);
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        super.onCreate(bundle);
        if (this.s) {
            this.r = new com.tsf.shell.a.a.a(this);
            if (z) {
                c();
            } else {
                b.a();
                this.e = new com.tsf.shell.e.e(this);
                setContentView(this.e);
                if (!com.tsf.shell.manager.b.f.a()) {
                    com.tsf.shell.manager.b.f.a(true);
                    e();
                } else {
                    int iB = com.tsf.shell.manager.b.f.b();
                    switch (iB) {
                        case 0:
                            com.tsf.shell.manager.b.f.a(iB + 1);
                            e();
                            break;
                        default:
                            AnonymousClass10 anonymousClass10 = new AnonymousClass10();
                            h.a(b.i.public_title_error, b.i.notic_restore_startup_notic, b.i.notic_unknow_error_summary, anonymousClass10, new Runnable() { // from class: com.tsf.shell.Home.11
                                @Override // java.lang.Runnable
                                public void run() {
                                    Home.this.e();
                                }
                            }, anonymousClass10);
                            break;
                    }
                }
            }
            a(new d.b() { // from class: com.tsf.shell.Home.12
                @Override // com.tsf.shell.a.a.d.b
                public void a(int i, boolean z2, d.a aVar) {
                    if (z2 && com.tsf.shell.widget.alarm.service.c.b != null) {
                        com.tsf.shell.widget.alarm.service.c.b.a(new c.a() { // from class: com.tsf.shell.Home.12.1
                            @Override // com.tsf.shell.widget.alarm.service.c.a
                            public void a(com.tsf.shell.widget.alarm.service.b bVar) {
                                bVar.a(true);
                            }
                        });
                    }
                }
            }, false, 2, com.tsf.shell.a.a.d.e);
        }
        if (!this.s) {
            startActivity(new Intent(this, (Class<?>) ShellActivity.class));
            finish();
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.Home$10, reason: invalid class name */
    class AnonymousClass10 implements Runnable {
        AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tsf.shell.manager.b.f.c();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.Home.10.1
                @Override // java.lang.Runnable
                public void run() {
                    Home.this.e.post(new Runnable() { // from class: com.tsf.shell.Home.10.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.manager.b.d.e();
                            Home.this.e();
                        }
                    });
                }
            };
            com.tsf.shell.manager.b.d.a(Home.c, runnable, runnable, true, false, false);
        }
    }

    public void a(String str) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s) {
            com.tsf.shell.manager.a.b.a(this, configuration);
            if (this.p != null && !this.p.equals(configuration.locale)) {
                c();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.s) {
            com.tsf.shell.manager.a.b.b(z);
        }
    }

    public void c() {
        if (this.s) {
            com.tsf.shell.manager.a.C.b();
            this.t = true;
            com.tsf.shell.manager.b.f.a(false);
            Intent intent = new Intent(this, (Class<?>) RestartActivity.class);
            intent.putExtra("pid", Process.myPid());
            intent.putExtra("restart", true);
            startActivity(intent);
        }
    }

    public void a(int i) {
        this.t = true;
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.Home.13
            @Override // java.lang.Runnable
            public void run() {
                Home.this.c();
            }
        }, i);
    }

    public boolean d() {
        return this.m;
    }

    public void e() {
        this.m = false;
        com.censivn.C3DEngine.a.a(this);
        com.censivn.C3DEngine.b.c.b.c();
        this.p = getResources().getConfiguration().locale;
        this.f = new com.censivn.C3DEngine.a.a(this);
        this.e.addView(this.f);
        this.o = d.a();
        com.tsf.shell.manager.a.w = new com.tsf.shell.manager.a.e();
        a("initialize");
        f();
        g();
        a("initializeWorkspace3D");
        a("initializeWorkspace2D");
        u();
        a("initialzeData");
        this.l = true;
    }

    public void f() {
        this.n = new com.tsf.shell.f.d(this.f) { // from class: com.tsf.shell.Home.14
            @Override // com.tsf.shell.f.d
            public void a() {
                Home.this.h();
            }

            @Override // com.tsf.shell.f.d
            public void b() {
                Home.this.j();
            }
        };
    }

    public void g() {
        if (this.g == null) {
            this.g = new com.tsf.shell.e.f(this);
        }
        this.g.setPageManager(com.tsf.shell.manager.a.h);
        this.g.setOnLongClickListener(this);
        this.e.setWorkspace(this.g);
        this.e.addView(this.g, 0);
        this.i = new SpannableStringBuilder();
        Selection.setSelection(this.i, 0);
        registerReceiver(this.d, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public void h() {
    }

    private void u() {
        ShellProvider.a().d();
        com.tsf.shell.manager.bind.a.b().a();
        com.tsf.shell.manager.bind.a.b().a(this);
    }

    public void i() {
        int i = 1;
        com.censivn.C3DEngine.a.a().a(new RenderRunnable(i, i) { // from class: com.tsf.shell.Home.15
            @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.h.J();
            }
        });
    }

    public void j() {
        com.tsf.shell.manager.b.f.c();
        com.tsf.shell.manager.a.b.c(this);
        com.censivn.C3DEngine.b.c.b.b();
        com.tsf.shell.f.d.d();
        com.censivn.C3DEngine.a.d.d().a();
        n();
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.16
            @Override // java.lang.Runnable
            public void run() {
                Home.this.m = true;
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.Home.16.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.activity.b.a.a();
                        com.tsf.shell.b.a.a();
                    }
                }, 500L);
            }
        });
    }

    public boolean k() {
        return this.k;
    }

    public com.tsf.shell.e.f l() {
        if (this.g == null) {
            this.g = new com.tsf.shell.e.f(this);
        }
        return this.g;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.s && (k() || !com.censivn.C3DEngine.b.c.b.a())) {
            return false;
        }
        super.onCreateOptionsMenu(menu);
        if (this.s) {
            menu.add(0, 3, 0, b.i.text_preferences).setIcon(android.R.drawable.ic_menu_more).setAlphabeticShortcut('N');
            menu.add(0, 1, 0, b.i.menu_manage_apps).setIcon(android.R.drawable.ic_menu_manage).setAlphabeticShortcut('M');
            Intent intent = new Intent("android.settings.SETTINGS");
            intent.setFlags(270532608);
            menu.add(0, 4, 0, b.i.menu_settings).setIcon(android.R.drawable.ic_menu_preferences).setAlphabeticShortcut('P').setIntent(intent);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                m();
                return true;
            case 2:
                com.tsf.shell.manager.a.d.a(1700);
                return true;
            case 3:
                com.tsf.shell.manager.a.d.a(1300);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void m() {
        if (this.s) {
            startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void a(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(b.a.app_none, b.a.app_none);
    }

    @Override // com.tsf.shell.a
    public int a(Intent intent, a.InterfaceC0025a interfaceC0025a) {
        int i = this.u;
        this.k = true;
        this.q.put(Integer.valueOf(this.u), interfaceC0025a);
        a(intent, this.u);
        this.u++;
        return i;
    }

    public int b(Intent intent, a.InterfaceC0025a interfaceC0025a) {
        int i = this.u;
        this.k = true;
        this.q.put(Integer.valueOf(this.u), interfaceC0025a);
        a(intent, this.u);
        this.u++;
        return i;
    }

    public int a(Intent intent, a.InterfaceC0025a interfaceC0025a, int i, int i2) {
        int i3 = this.u;
        this.k = true;
        this.q.put(Integer.valueOf(this.u), interfaceC0025a);
        a(intent, this.u);
        this.u++;
        return i3;
    }

    public void a(Intent intent, Object obj) {
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (Exception e) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.Home.17
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.c, b.i.activity_not_found, 0).show();
                }
            });
            e.printStackTrace();
        }
    }

    public void a(Intent intent, int i) {
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.Home.2
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.c, b.i.activity_not_found, 0).show();
                }
            });
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (i >= 0) {
            this.k = true;
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 3:
                    return true;
            }
        }
        if (keyEvent.getAction() == 1) {
            switch (keyEvent.getKeyCode()) {
                case 3:
                    return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(final int i, final KeyEvent keyEvent) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.3
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.b.c.b.b(i, keyEvent);
            }
        });
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int i, final KeyEvent keyEvent) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.4
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.b.c.b.a(i, keyEvent);
            }
        });
        if (i == 4) {
            return true;
        }
        if (i == 82 && keyEvent.isLongPress()) {
            return true;
        }
        if (i == 24) {
            com.censivn.C3DEngine.a.e().g();
        }
        boolean zOnKeyDown = super.onKeyDown(i, keyEvent);
        if (!zOnKeyDown && i != 66) {
            boolean zOnKeyDown2 = false;
            try {
                zOnKeyDown2 = TextKeyListener.getInstance().onKeyDown(this.g, this.i, i, keyEvent);
            } catch (Exception e) {
            }
            if (zOnKeyDown2 && this.i != null && this.i.length() > 0) {
                return onSearchRequested();
            }
            return zOnKeyDown;
        }
        return zOnKeyDown;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startSearch(null, false, null, true);
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (k() || !this.m) {
            return false;
        }
        final d.a aVar = (d.a) (!(view instanceof com.tsf.shell.e.d) ? (View) view.getParent().getParent() : view).getTag();
        if (aVar == null) {
            return true;
        }
        if (this.g.a()) {
            if (aVar.a == null) {
                this.g.setAllowLongPress(false);
            } else {
                if (!com.tsf.shell.manager.a.A.a()) {
                    return true;
                }
                aVar.a.setPressed(false);
                w.a();
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Home.this.e.a(aVar);
                    }
                });
            }
        }
        return true;
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
        }
        return super.onCreateDialog(i);
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
    }

    void n() {
        getWindow().closeAllPanels();
    }

    public void o() {
    }

    private class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Home.this.n();
        }
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(LauncherAppWidgetInfo launcherAppWidgetInfo) {
        com.tsf.shell.manager.a.l.a.a(launcherAppWidgetInfo);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList<ItemInfo> arrayList, String str) {
        com.tsf.shell.manager.a.o.c().a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void b(ArrayList<ItemInfo> arrayList, String str) {
        com.tsf.shell.manager.a.n.a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void c(ArrayList<ItemInfo> arrayList, String str) {
        com.tsf.shell.manager.a.g.b.a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList<ItemInfo> arrayList, ArrayList<String> arrayList2) {
        com.tsf.shell.manager.a.g.a.a(arrayList, arrayList2);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        com.tsf.shell.manager.a.w.a(arrayList);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList<com.tsf.shell.manager.a.f> arrayList, boolean z) {
        com.tsf.shell.manager.a.w.a(arrayList, z);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void b(ArrayList<com.tsf.shell.manager.a.f> arrayList) {
        com.tsf.shell.manager.a.w.b(arrayList);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void b(ArrayList<com.tsf.shell.manager.a.f> arrayList, boolean z) {
        com.tsf.shell.manager.a.w.b(arrayList, z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.s) {
            this.j = false;
            if (this.l) {
                this.n.e();
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.8
                    @Override // java.lang.Runnable
                    public void run() {
                        Home.this.o.b("Home");
                        com.tsf.shell.manager.a.f.e();
                    }
                });
            }
            Intent intent = getIntent();
            if (intent != null) {
                com.ksmobile.launcher.a.a.a.a(intent.getBooleanExtra("DEFENSE_USER_PRESENT", false));
            } else {
                com.ksmobile.launcher.a.a.a.a(false);
            }
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.s) {
            this.j = true;
            if (this.l) {
                this.o.a("Home");
                this.n.f();
            }
            if (com.tsf.shell.manager.a.A != null) {
                com.tsf.shell.manager.a.A.e();
            }
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onDestroy() {
        if (this.s) {
            com.tsf.shell.manager.action.f.b(this);
            if (ThemeManager.getInstance() != null) {
                ThemeManager.getInstance().destory(this);
            }
            try {
                if (com.tsf.shell.manager.a.r != null) {
                    com.tsf.shell.manager.a.r.a(this);
                }
            } catch (Exception e) {
            }
            com.tsf.shell.manager.a.C.b();
        }
        super.onDestroy();
        if (this.s) {
            com.tsf.shell.manager.a.l.a.c();
            try {
                TextKeyListener.getInstance().release();
                unregisterReceiver(this.d);
            } catch (Exception e2) {
            }
            if (this.g != null) {
                this.g.removeAllViews();
                this.g = null;
            }
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.s && "android.intent.action.MAIN".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("action", -1);
            if (intExtra != -1) {
                com.tsf.shell.manager.a.d.a(intExtra);
                return;
            }
            n();
            if ((intent.getFlags() & 4194304) != 4194304) {
                p();
            }
        }
    }

    public void p() {
        if (this.m && com.tsf.shell.manager.a.h != null && !this.v) {
            this.v = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.9
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.c.b.a(3, null);
                    Home.this.v = false;
                }
            });
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.k = false;
        if (this.q.containsKey(Integer.valueOf(i))) {
            this.q.get(Integer.valueOf(i)).onActivityResult(i, i2, intent);
            this.q.remove(Integer.valueOf(i));
        }
    }

    public static void q() {
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.r != null) {
            this.r.a(65535 & i, strArr, iArr);
            com.tsf.shell.a.a.e.a(this);
        }
    }

    public boolean a(d.b bVar, boolean z, int i, String... strArr) {
        if (this.r != null) {
            return this.r.a(bVar, z, i, strArr);
        }
        return false;
    }
}
