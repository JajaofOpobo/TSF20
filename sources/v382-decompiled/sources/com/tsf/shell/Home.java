package com.tsf.shell;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.flurry.android.FlurryAgent;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public final class Home extends ActivityGroup implements View.OnLongClickListener, a, com.tsf.shell.manager.bind.c {
    public static int a = (int) (((Math.random() * 1000.0d) * 2.0d) + 1000.0d);
    public static String b = "";
    public static Home c;
    private com.tsf.shell.d.h e;
    private com.censivn.C3DEngine.a.a f;
    private com.tsf.shell.d.i g;
    private boolean k;
    private com.tsf.shell.e.e n;
    private g o;
    private Locale p;
    private final BroadcastReceiver d = new j(this, null);
    private final int[] h = new int[2];
    private SpannableStringBuilder i = null;
    private boolean j = true;
    private boolean l = false;
    private boolean m = false;
    private HashMap q = new HashMap();
    private boolean r = false;
    private int s = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;
    private boolean t = false;

    public void a(float f, float f2) {
        this.h[0] = (int) f;
        this.h[1] = (int) f2;
    }

    public static boolean a() {
        return false;
    }

    @Override // android.app.Activity
    public void onStart() {
        boolean z = false;
        super.onStart();
        FlurryAgent.setReportLocation(false);
        FlurryAgent.setCaptureUncaughtExceptions(false);
        switch (z) {
            case false:
            case true:
                FlurryAgent.onStartSession(this, "WT8M1JUAHR5C94MX9R78");
                break;
            case true:
                FlurryAgent.onStartSession(this, "G8CPGSVSNCYXXZ9P4XZX");
                break;
            default:
                FlurryAgent.onStartSession(this, "WT8M1JUAHR5C94MX9R78");
                break;
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onStop() {
        super.onStop();
        FlurryAgent.onEndSession(this);
    }

    public static Home b() {
        return c;
    }

    private void q() {
        if (getPackageName().equals("com.tsf.shell")) {
            b = com.tsf.shell.utils.x.c(R.string.launcher_name_prime);
        } else {
            b = com.tsf.shell.utils.x.c(R.string.launcher_name);
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z = false;
        com.censivn.C3DEngine.a.a(this, "Home");
        if (c == null) {
            c = this;
            q();
            com.tsf.shell.manager.b.g.a();
            com.tsf.shell.manager.b.g.b(com.tsf.shell.manager.b.g.a(this), this);
            com.tsf.shell.utils.g.a();
            new com.censivn.C3DEngine.b.c.j(this);
            if (ShellWallpaperManager.a((Activity) this)) {
                com.tsf.shell.manager.b.g.r(true);
            } else {
                com.tsf.shell.manager.b.g.r(false);
            }
            com.tsf.shell.plugin.notice.i.a(this, new com.tsf.shell.plugin.notice.j() { // from class: com.tsf.shell.Home.1
                @Override // com.tsf.shell.plugin.notice.j
                public void a(int i) {
                    int i2;
                    try {
                        i2 = com.censivn.C3DEngine.a.d().getPackageManager().getPackageInfo(com.censivn.C3DEngine.a.d().getPackageName(), 0).versionCode;
                    } catch (Exception e) {
                        e.printStackTrace();
                        i2 = -1;
                    }
                    if (i2 != -1) {
                    }
                }
            }, false);
        } else {
            z = true;
        }
        super.onCreate(bundle);
        if (z) {
            c();
        }
        b.a();
        this.e = new com.tsf.shell.d.h(this);
        setContentView(this.e);
        if (!com.tsf.shell.manager.b.h.a()) {
            com.tsf.shell.manager.b.h.a(true);
            e();
            return;
        }
        int b2 = com.tsf.shell.manager.b.h.b();
        switch (b2) {
            case 0:
                com.tsf.shell.manager.b.h.a(b2 + 1);
                e();
                break;
            default:
                AnonymousClass9 anonymousClass9 = new AnonymousClass9();
                y.a(R.string.public_title_error, R.string.notic_restore_startup_notic, R.string.notic_unknow_error_summary, anonymousClass9, new Runnable() { // from class: com.tsf.shell.Home.10
                    @Override // java.lang.Runnable
                    public void run() {
                        Home.this.e();
                    }
                }, anonymousClass9);
                break;
        }
    }

    /* renamed from: com.tsf.shell.Home$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {
        AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tsf.shell.manager.b.h.c();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.Home.9.1
                @Override // java.lang.Runnable
                public void run() {
                    Home.this.e.post(new Runnable() { // from class: com.tsf.shell.Home.9.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.manager.b.e.e();
                            Home.this.e();
                        }
                    });
                }
            };
            com.tsf.shell.manager.b.e.a(Home.c, runnable, runnable, true, false, false);
        }
    }

    public void a(String str) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tsf.shell.manager.a.b.a(this, configuration);
        if (this.p != null && !this.p.equals(configuration.locale)) {
            c();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.tsf.shell.manager.a.b.b(z);
    }

    public void c() {
        com.tsf.shell.manager.a.C.b();
        this.r = true;
        com.tsf.shell.manager.b.h.a(false);
        Intent intent = new Intent(this, (Class<?>) RestartActivity.class);
        intent.putExtra("pid", Process.myPid());
        intent.putExtra("restart", true);
        startActivity(intent);
    }

    public void a(int i) {
        this.r = true;
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.Home.11
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
        com.censivn.C3DEngine.b.c.c.c();
        this.p = getResources().getConfiguration().locale;
        this.f = new com.censivn.C3DEngine.a.a(this);
        this.e.addView(this.f);
        this.o = g.a();
        com.tsf.shell.manager.a.w = new com.tsf.shell.manager.a.h();
        a("initialize");
        f();
        g();
        a("initializeWorkspace3D");
        a("initializeWorkspace2D");
        r();
        a("initialzeData");
        this.l = true;
    }

    public void f() {
        this.n = new com.tsf.shell.e.e(this.f) { // from class: com.tsf.shell.Home.12
            @Override // com.tsf.shell.e.e
            public void a() {
                Home.this.h();
            }

            @Override // com.tsf.shell.e.e
            public void b() {
                Home.this.j();
            }
        };
    }

    public void g() {
        if (this.g == null) {
            this.g = new com.tsf.shell.d.i(this);
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

    private void r() {
        ShellProvider.a().d();
        com.tsf.shell.manager.bind.a.b().a();
        com.tsf.shell.manager.bind.a.b().a(this);
    }

    public void i() {
        int i = 1;
        com.censivn.C3DEngine.a.a().a(new RenderRunnable(i, i) { // from class: com.tsf.shell.Home.13
            @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.h.J();
            }
        });
    }

    public void j() {
        com.tsf.shell.manager.b.h.c();
        com.tsf.shell.manager.a.b.c(this);
        com.censivn.C3DEngine.b.c.c.b();
        com.tsf.shell.e.e.d();
        com.censivn.C3DEngine.a.h.d().a();
        n();
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.14
            @Override // java.lang.Runnable
            public void run() {
                Home.this.m = true;
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.Home.14.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.activity.b.a.a();
                        com.tsf.shell.a.a.a();
                    }
                }, 500L);
            }
        });
    }

    public boolean k() {
        return this.k;
    }

    public com.tsf.shell.d.i l() {
        if (this.g == null) {
            this.g = new com.tsf.shell.d.i(this);
        }
        return this.g;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (k() || !com.censivn.C3DEngine.b.c.c.a()) {
            return false;
        }
        super.onCreateOptionsMenu(menu);
        menu.add(0, 3, 0, R.string.text_preferences).setIcon(android.R.drawable.ic_menu_more).setAlphabeticShortcut('N');
        menu.add(0, 1, 0, R.string.menu_manage_apps).setIcon(android.R.drawable.ic_menu_manage).setAlphabeticShortcut('M');
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.setFlags(270532608);
        menu.add(0, 4, 0, R.string.menu_settings).setIcon(android.R.drawable.ic_menu_preferences).setAlphabeticShortcut('P').setIntent(intent);
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
        startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void a(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.app_none, R.anim.app_none);
    }

    @Override // com.tsf.shell.a
    public int a(Intent intent, com.censivn.C3DEngine.b.c.b bVar) {
        int i = this.s;
        this.k = true;
        this.q.put(Integer.valueOf(this.s), bVar);
        a(intent, this.s);
        this.s++;
        return i;
    }

    public int b(Intent intent, com.censivn.C3DEngine.b.c.b bVar) {
        int i = this.s;
        this.k = true;
        this.q.put(Integer.valueOf(this.s), bVar);
        a(intent, this.s);
        this.s++;
        return i;
    }

    public int a(Intent intent, com.censivn.C3DEngine.b.c.b bVar, int i, int i2) {
        int i3 = this.s;
        this.k = true;
        this.q.put(Integer.valueOf(this.s), bVar);
        a(intent, this.s);
        this.s++;
        return i3;
    }

    public void a(Intent intent, Object obj) {
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (Exception e) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.Home.15
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.c, R.string.activity_not_found, 0).show();
                }
            });
            e.printStackTrace();
        }
    }

    public void a(Intent intent, int i) {
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.Home.16
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.c, R.string.activity_not_found, 0).show();
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
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.b.c.c.b(i, keyEvent);
            }
        });
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int i, final KeyEvent keyEvent) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.3
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.b.c.c.a(i, keyEvent);
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
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (!onKeyDown && i != 66) {
            boolean z = false;
            try {
                z = TextKeyListener.getInstance().onKeyDown(this.g, this.i, i, keyEvent);
            } catch (Exception e) {
            }
            if (z && this.i != null && this.i.length() > 0) {
                return onSearchRequested();
            }
            return onKeyDown;
        }
        return onKeyDown;
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
        final com.tsf.shell.d.f fVar = (com.tsf.shell.d.f) (!(view instanceof com.tsf.shell.d.e) ? (View) view.getParent().getParent() : view).getTag();
        if (fVar == null) {
            return true;
        }
        if (this.g.a()) {
            if (fVar.a == null) {
                this.g.setAllowLongPress(false);
            } else {
                if (!com.tsf.shell.manager.a.A.a()) {
                    return true;
                }
                fVar.a.setPressed(false);
                com.tsf.shell.utils.w.a();
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.4
                    @Override // java.lang.Runnable
                    public void run() {
                        Home.this.e.a(fVar);
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

    @Override // com.tsf.shell.manager.bind.c
    public void a(LauncherAppWidgetInfo launcherAppWidgetInfo) {
        com.tsf.shell.manager.a.l.a.a(launcherAppWidgetInfo);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList arrayList, String str) {
        com.tsf.shell.manager.a.o.c().a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void b(ArrayList arrayList, String str) {
        com.tsf.shell.manager.a.n.a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void c(ArrayList arrayList, String str) {
        com.tsf.shell.manager.a.g.b.a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList arrayList, ArrayList arrayList2) {
        com.tsf.shell.manager.a.g.a.a(arrayList, arrayList2);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList arrayList) {
        com.tsf.shell.manager.a.w.a(arrayList);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void a(ArrayList arrayList, boolean z) {
        com.tsf.shell.manager.a.w.a(arrayList, z);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void b(ArrayList arrayList) {
        com.tsf.shell.manager.a.w.b(arrayList);
    }

    @Override // com.tsf.shell.manager.bind.c
    public void b(ArrayList arrayList, boolean z) {
        com.tsf.shell.manager.a.w.b(arrayList, z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.j = false;
        if (this.l) {
            this.n.e();
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.7
                @Override // java.lang.Runnable
                public void run() {
                    Home.this.o.b("Home");
                    com.tsf.shell.manager.a.f.e();
                }
            });
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.j = true;
        if (this.l) {
            this.o.a("Home");
            this.n.f();
        }
        if (com.tsf.shell.manager.a.A != null) {
            com.tsf.shell.manager.a.A.e();
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onDestroy() {
        com.tsf.shell.manager.action.h.b(this);
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
        super.onDestroy();
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

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("action", -1);
            if (intExtra != -1) {
                com.tsf.shell.manager.a.d.a(intExtra);
                return;
            }
            n();
            if ((intent.getFlags() & 4194304) != 4194304) {
                o();
            }
        }
    }

    public void o() {
        if (this.m && com.tsf.shell.manager.a.h != null && !this.t) {
            this.t = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.Home.8
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.c.c.a(3, null);
                    Home.this.t = false;
                }
            });
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.k = false;
        if (this.q.containsKey(Integer.valueOf(i))) {
            ((com.censivn.C3DEngine.b.c.b) this.q.get(Integer.valueOf(i))).onActivityResult(i, i2, intent);
            this.q.remove(Integer.valueOf(i));
        }
    }

    public static void p() {
    }
}
