package com.tsf.shell;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
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
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.p030a.C0854a;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.flurry.android.FlurryAgent;
import com.ksmobile.launcher.p066a.p067a.C1294a;
import com.tsf.C1306b;
import com.tsf.shell.activity.p090b.C2221a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.bind.InterfaceC3456c;
import com.tsf.shell.manager.p166a.C3372e;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p168b.C3425d;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p168b.C3432f;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.p086a.p087a.C2186a;
import com.tsf.shell.p086a.p087a.C2202d;
import com.tsf.shell.p086a.p087a.C2205e;
import com.tsf.shell.p091b.C2224a;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p095e.C2265e;
import com.tsf.shell.p095e.C2269f;
import com.tsf.shell.p096f.C2370d;
import com.tsf.shell.plugin.notice.C3821g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.C4170g;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import com.tsf.shell.widget.alarm.service.InterfaceC4340b;
import com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public final class Home extends ActivityGroup implements View.OnLongClickListener, InterfaceC2185a, InterfaceC3456c {

    /* renamed from: a */
    public static int f7120a = (int) (((Math.random() * 1000.0d) * 2.0d) + 1000.0d);

    /* renamed from: b */
    public static String f7121b = "";

    /* renamed from: c */
    public static Home f7122c;

    /* renamed from: e */
    private C2265e f7124e;

    /* renamed from: f */
    private C0854a f7125f;

    /* renamed from: g */
    private C2269f f7126g;

    /* renamed from: k */
    private boolean f7130k;

    /* renamed from: n */
    private C2370d f7133n;

    /* renamed from: o */
    private C2234d f7134o;

    /* renamed from: p */
    private Locale f7135p;

    /* renamed from: r */
    private C2186a f7137r;

    /* renamed from: d */
    private final BroadcastReceiver f7123d = new C2178a();

    /* renamed from: h */
    private final int[] f7127h = new int[2];

    /* renamed from: i */
    private SpannableStringBuilder f7128i = null;

    /* renamed from: j */
    private boolean f7129j = true;

    /* renamed from: l */
    private boolean f7131l = false;

    /* renamed from: m */
    private boolean f7132m = false;

    /* renamed from: q */
    private HashMap<Integer, C0913a.InterfaceC0914a> f7136q = new HashMap<>();

    /* renamed from: s */
    private boolean f7138s = false;

    /* renamed from: t */
    private boolean f7139t = false;

    /* renamed from: u */
    private int f7140u = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;

    /* renamed from: v */
    private boolean f7141v = false;

    /* renamed from: a */
    public void m6187a(float f, float f2) {
        this.f7127h[0] = (int) f;
        this.f7127h[1] = (int) f2;
    }

    /* renamed from: a */
    public static boolean m6188a() {
        return false;
    }

    @Override // android.app.Activity
    public void onStart() {
        boolean z = false;
        super.onStart();
        if (this.f7138s) {
            FlurryAgent.setReportLocation(false);
            FlurryAgent.setCaptureUncaughtExceptions(false);
            switch (z) {
                case false:
                case true:
                    FlurryAgent.onStartSession(this, "WT8M1JUAHR5C94MX9R78");
                    return;
                case true:
                    FlurryAgent.onStartSession(this, "G8CPGSVSNCYXXZ9P4XZX");
                    return;
                default:
                    FlurryAgent.onStartSession(this, "WT8M1JUAHR5C94MX9R78");
                    return;
            }
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f7138s) {
            FlurryAgent.onEndSession(this);
        }
    }

    /* renamed from: b */
    public static Home m6177b() {
        return f7122c;
    }

    /* renamed from: r */
    private void m6158r() {
        if (getPackageName().equals("com.tsf.shell")) {
            f7121b = C4189x.m588c(C1306b.C1315i.launcher_name_prime);
        } else {
            f7121b = C4189x.m588c(C1306b.C1315i.launcher_name);
        }
    }

    /* renamed from: s */
    private boolean m6157s() {
        return getSharedPreferences("config", 0).getBoolean("ShellSummaryShowed", false);
    }

    /* renamed from: t */
    private void m6156t() {
        SharedPreferences.Editor edit = getSharedPreferences("config", 0).edit();
        edit.putBoolean("ShellSummaryShowed", true);
        edit.commit();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z;
        Intent intent = getIntent();
        if (intent != null) {
            this.f7138s = intent.getBooleanExtra("ShellSummaryShowed", false);
        }
        if (!this.f7138s) {
            this.f7138s = m6157s();
        } else {
            m6156t();
        }
        if (this.f7138s) {
            C0853a.m10863a(this, "Home");
            if (f7122c == null) {
                f7122c = this;
                m6158r();
                C3430e.m2545a();
                C3430e.m2494b(C3430e.m2539a(this), this);
                C4170g.m689a();
                new C0925e(this);
                if (ShellWallpaperManager.m1611a((Activity) this)) {
                    C3430e.m2423s(true);
                } else {
                    C3430e.m2423s(false);
                }
                C3821g.m1366a(this, new C3821g.InterfaceC3823a() { // from class: com.tsf.shell.Home.1
                    @Override // com.tsf.shell.plugin.notice.C3821g.InterfaceC3823a
                    /* renamed from: a */
                    public void mo1360a(int i) {
                        int i2;
                        try {
                            i2 = C0853a.m10856d().getPackageManager().getPackageInfo(C0853a.m10856d().getPackageName(), 0).versionCode;
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
        if (this.f7138s) {
            this.f7137r = new C2186a(this);
            if (z) {
                m6173c();
            } else {
                C2223b.m6055a();
                this.f7124e = new C2265e(this);
                setContentView(this.f7124e);
                if (!C3432f.m2405a()) {
                    C3432f.m2403a(true);
                    m6171e();
                } else {
                    int m2402b = C3432f.m2402b();
                    switch (m2402b) {
                        case 0:
                            C3432f.m2404a(m2402b + 1);
                            m6171e();
                            break;
                        default:
                            RunnableC215810 runnableC215810 = new RunnableC215810();
                            C3354h.m2780a(C1306b.C1315i.public_title_error, C1306b.C1315i.notic_restore_startup_notic, C1306b.C1315i.notic_unknow_error_summary, runnableC215810, new Runnable() { // from class: com.tsf.shell.Home.11
                                @Override // java.lang.Runnable
                                public void run() {
                                    Home.this.m6171e();
                                }
                            }, runnableC215810);
                            break;
                    }
                }
            }
            m6179a(new C2202d.InterfaceC2204b() { // from class: com.tsf.shell.Home.12
                @Override // com.tsf.shell.p086a.p087a.C2202d.InterfaceC2204b
                /* renamed from: a */
                public void mo152a(int i, boolean z2, C2202d.EnumC2203a enumC2203a) {
                    if (z2 && ServiceConnectionC4343c.f14071b != null) {
                        ServiceConnectionC4343c.f14071b.m191a(new ServiceConnectionC4343c.InterfaceC4344a() { // from class: com.tsf.shell.Home.12.1
                            @Override // com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c.InterfaceC4344a
                            /* renamed from: a */
                            public void mo153a(InterfaceC4340b interfaceC4340b) {
                                interfaceC4340b.mo195a(true);
                            }
                        });
                    }
                }
            }, false, 2, C2202d.f7238e);
        }
        if (!this.f7138s) {
            startActivity(new Intent(this, ShellActivity.class));
            finish();
        }
    }

    /* renamed from: com.tsf.shell.Home$10 */
    /* loaded from: classes.dex */
    class RunnableC215810 implements Runnable {
        RunnableC215810() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3432f.m2400c();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.Home.10.1
                @Override // java.lang.Runnable
                public void run() {
                    Home.this.f7124e.post(new Runnable() { // from class: com.tsf.shell.Home.10.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3425d.m2574e();
                            Home.this.m6171e();
                        }
                    });
                }
            };
            C3425d.m2587a(Home.f7122c, runnable, runnable, true, false, false);
        }
    }

    /* renamed from: a */
    public void m6178a(String str) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f7138s) {
            C3359a.f11088b.m10568a(this, configuration);
            if (this.f7135p != null && !this.f7135p.equals(configuration.locale)) {
                m6173c();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f7138s) {
            C3359a.f11088b.m10554b(z);
        }
    }

    /* renamed from: c */
    public void m6173c() {
        if (this.f7138s) {
            C3359a.f11085C.m749b();
            this.f7139t = true;
            C3432f.m2403a(false);
            Intent intent = new Intent(this, RestartActivity.class);
            intent.putExtra("pid", Process.myPid());
            intent.putExtra("restart", true);
            startActivity(intent);
        }
    }

    /* renamed from: a */
    public void m6186a(int i) {
        this.f7139t = true;
        C0853a.m10865a().m10587a(new Runnable() { // from class: com.tsf.shell.Home.13
            @Override // java.lang.Runnable
            public void run() {
                Home.this.m6173c();
            }
        }, i);
    }

    /* renamed from: d */
    public boolean m6172d() {
        return this.f7132m;
    }

    /* renamed from: e */
    public void m6171e() {
        this.f7132m = false;
        C0853a.m10864a(this);
        C0915b.m10593c();
        this.f7135p = getResources().getConfiguration().locale;
        this.f7125f = new C0854a(this);
        this.f7124e.addView(this.f7125f);
        this.f7134o = C2234d.m6033a();
        C3359a.f11109w = new C3372e();
        m6178a("initialize");
        m6170f();
        m6169g();
        m6178a("initializeWorkspace3D");
        m6178a("initializeWorkspace2D");
        m6155u();
        m6178a("initialzeData");
        this.f7131l = true;
    }

    /* renamed from: f */
    public void m6170f() {
        this.f7133n = new C2370d(this.f7125f) { // from class: com.tsf.shell.Home.14
            @Override // com.tsf.shell.p096f.C2370d
            /* renamed from: a */
            public void mo5693a() {
                Home.this.m6168h();
            }

            @Override // com.tsf.shell.p096f.C2370d
            /* renamed from: b */
            public void mo5691b() {
                Home.this.m6166j();
            }
        };
    }

    /* renamed from: g */
    public void m6169g() {
        if (this.f7126g == null) {
            this.f7126g = new C2269f(this);
        }
        this.f7126g.setPageManager(C3359a.f11094h);
        this.f7126g.setOnLongClickListener(this);
        this.f7124e.setWorkspace(this.f7126g);
        this.f7124e.addView(this.f7126g, 0);
        this.f7128i = new SpannableStringBuilder();
        Selection.setSelection(this.f7128i, 0);
        registerReceiver(this.f7123d, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* renamed from: h */
    public void m6168h() {
    }

    /* renamed from: u */
    private void m6155u() {
        ShellProvider.m6147a().m6143d();
        C3444a.m2357b().m2396a();
        C3444a.m2357b().m2394a(this);
    }

    /* renamed from: i */
    public void m6167i() {
        C0853a.m10865a().m10590a(new RenderRunnable(1, 1) { // from class: com.tsf.shell.Home.15
            @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
            public void run() {
                C3359a.f11094h.m4117J();
            }
        });
    }

    /* renamed from: j */
    public void m6166j() {
        C3432f.m2400c();
        C3359a.f11088b.m10552c(this);
        C0915b.m10596b();
        C2370d.m5689d();
        C0864d.m10805d().m10827a();
        m6162n();
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.Home.16
            @Override // java.lang.Runnable
            public void run() {
                Home.this.f7132m = true;
                C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.Home.16.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2221a.m6059a();
                        C2224a.m6054a();
                    }
                }, 500L);
            }
        });
    }

    /* renamed from: k */
    public boolean m6165k() {
        return this.f7130k;
    }

    /* renamed from: l */
    public C2269f m6164l() {
        if (this.f7126g == null) {
            this.f7126g = new C2269f(this);
        }
        return this.f7126g;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.f7138s || (!m6165k() && C0915b.m10599a())) {
            super.onCreateOptionsMenu(menu);
            if (this.f7138s) {
                menu.add(0, 3, 0, C1306b.C1315i.text_preferences).setIcon(17301573).setAlphabeticShortcut('N');
                menu.add(0, 1, 0, C1306b.C1315i.menu_manage_apps).setIcon(17301570).setAlphabeticShortcut('M');
                Intent intent = new Intent("android.settings.SETTINGS");
                intent.setFlags(270532608);
                menu.add(0, 4, 0, C1306b.C1315i.menu_settings).setIcon(17301577).setAlphabeticShortcut('P').setIntent(intent);
            }
            return true;
        }
        return false;
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
                m6163m();
                return true;
            case 2:
                C3359a.f11090d.m2670a(1700);
                return true;
            case 3:
                C3359a.f11090d.m2670a(1300);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    /* renamed from: m */
    public void m6163m() {
        if (this.f7138s) {
            startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    /* renamed from: a */
    public void m6185a(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(C1306b.C1307a.app_none, C1306b.C1307a.app_none);
    }

    @Override // com.tsf.shell.InterfaceC2185a
    /* renamed from: a */
    public int mo927a(Intent intent, C0913a.InterfaceC0914a interfaceC0914a) {
        int i = this.f7140u;
        this.f7130k = true;
        this.f7136q.put(Integer.valueOf(this.f7140u), interfaceC0914a);
        m6184a(intent, this.f7140u);
        this.f7140u++;
        return i;
    }

    /* renamed from: b */
    public int m6176b(Intent intent, C0913a.InterfaceC0914a interfaceC0914a) {
        int i = this.f7140u;
        this.f7130k = true;
        this.f7136q.put(Integer.valueOf(this.f7140u), interfaceC0914a);
        m6184a(intent, this.f7140u);
        this.f7140u++;
        return i;
    }

    /* renamed from: a */
    public int m6183a(Intent intent, C0913a.InterfaceC0914a interfaceC0914a, int i, int i2) {
        int i3 = this.f7140u;
        this.f7130k = true;
        this.f7136q.put(Integer.valueOf(this.f7140u), interfaceC0914a);
        m6184a(intent, this.f7140u);
        this.f7140u++;
        return i3;
    }

    /* renamed from: a */
    public void m6182a(Intent intent, Object obj) {
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (Exception e) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.Home.17
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.f7122c, C1306b.C1315i.activity_not_found, 0).show();
                }
            });
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m6184a(Intent intent, int i) {
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.Home.2
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.f7122c, C1306b.C1315i.activity_not_found, 0).show();
                }
            });
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (i >= 0) {
            this.f7130k = true;
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
        } else if (keyEvent.getAction() == 1) {
            switch (keyEvent.getKeyCode()) {
                case 3:
                    return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(final int i, final KeyEvent keyEvent) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.Home.3
            @Override // java.lang.Runnable
            public void run() {
                C0915b.m10595b(i, keyEvent);
            }
        });
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int i, final KeyEvent keyEvent) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.Home.4
            @Override // java.lang.Runnable
            public void run() {
                C0915b.m10598a(i, keyEvent);
            }
        });
        if (i == 4) {
            return true;
        }
        if (i == 82 && keyEvent.isLongPress()) {
            return true;
        }
        if (i == 24) {
            C0853a.m10855e().m10763g();
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (!onKeyDown && i != 66) {
            boolean z = false;
            try {
                z = TextKeyListener.getInstance().onKeyDown(this.f7126g, this.f7128i, i, keyEvent);
            } catch (Exception e) {
            }
            if (z && this.f7128i != null && this.f7128i.length() > 0) {
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
        if (m6165k() || !this.f7132m) {
            return false;
        }
        final C2262d.ContextMenu$ContextMenuInfoC2263a contextMenu$ContextMenuInfoC2263a = (C2262d.ContextMenu$ContextMenuInfoC2263a) (!(view instanceof C2262d) ? (View) view.getParent().getParent() : view).getTag();
        if (contextMenu$ContextMenuInfoC2263a == null) {
            return true;
        }
        if (this.f7126g.m5984a()) {
            if (contextMenu$ContextMenuInfoC2263a.f7384a == null) {
                this.f7126g.setAllowLongPress(false);
            } else if (!C3359a.f11083A.m2213a()) {
                return true;
            } else {
                contextMenu$ContextMenuInfoC2263a.f7384a.setPressed(false);
                C4187w.m616a();
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.Home.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Home.this.f7124e.m5986a(contextMenu$ContextMenuInfoC2263a);
                    }
                });
            }
        }
        return true;
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 10:
                return super.onCreateDialog(i);
            case 11:
                return new AlertDialog.Builder(this).setMessage(C1306b.C1315i.shell_download_new_version_or_not).setPositiveButton(C1306b.C1315i.public_action_update, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.Home.7
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        Home.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/details?id=" + Home.this.getPackageName())));
                    }
                }).setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.Home.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                    }
                }).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
    }

    /* renamed from: n */
    void m6162n() {
        getWindow().closeAllPanels();
    }

    /* renamed from: o */
    public void m6161o() {
    }

    /* renamed from: com.tsf.shell.Home$a */
    /* loaded from: classes.dex */
    private class C2178a extends BroadcastReceiver {
        private C2178a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Home.this.m6162n();
        }
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: a */
    public void mo2340a(LauncherAppWidgetInfo launcherAppWidgetInfo) {
        C3359a.f11098l.f11996a.m1880a(launcherAppWidgetInfo);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: a */
    public void mo2338a(ArrayList<ItemInfo> arrayList, String str) {
        C3359a.f11101o.m3623c().m3593a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: b */
    public void mo2334b(ArrayList<ItemInfo> arrayList, String str) {
        C3359a.f11100n.m2102a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: c */
    public void mo2332c(ArrayList<ItemInfo> arrayList, String str) {
        C3359a.f11093g.f7459b.m5843a(arrayList, str);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: a */
    public void mo2337a(ArrayList<ItemInfo> arrayList, ArrayList<String> arrayList2) {
        C3359a.f11093g.f7458a.m5728a(arrayList, arrayList2);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: a */
    public void mo2339a(ArrayList<C3377f> arrayList) {
        C3359a.f11109w.m2714a(arrayList);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: a */
    public void mo2336a(ArrayList<C3377f> arrayList, boolean z) {
        C3359a.f11109w.m2713a(arrayList, z);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: b */
    public void mo2335b(ArrayList<C3377f> arrayList) {
        C3359a.f11109w.m2710b(arrayList);
    }

    @Override // com.tsf.shell.manager.bind.InterfaceC3456c
    /* renamed from: b */
    public void mo2333b(ArrayList<C3377f> arrayList, boolean z) {
        C3359a.f11109w.m2709b(arrayList, z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f7138s) {
            this.f7129j = false;
            if (this.f7131l) {
                this.f7133n.m5688e();
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.Home.8
                    @Override // java.lang.Runnable
                    public void run() {
                        Home.this.f7134o.m6027b("Home");
                        C3359a.f11092f.m1583e();
                    }
                });
            }
            Intent intent = getIntent();
            if (intent != null) {
                C1294a.m9088a(intent.getBooleanExtra("DEFENSE_USER_PRESENT", false));
            } else {
                C1294a.m9088a(false);
            }
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f7138s) {
            this.f7129j = true;
            if (this.f7131l) {
                this.f7134o.m6030a("Home");
                this.f7133n.m5687f();
            }
            if (C3359a.f11083A != null) {
                C3359a.f11083A.m2203e();
            }
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onDestroy() {
        if (this.f7138s) {
            C3398f.m2639b(this);
            if (ThemeManager.getInstance() != null) {
                ThemeManager.getInstance().destory(this);
            }
            try {
                if (C3359a.f11104r != null) {
                    C3359a.f11104r.m1912a(this);
                }
            } catch (Exception e) {
            }
            C3359a.f11085C.m749b();
        }
        super.onDestroy();
        if (this.f7138s) {
            C3359a.f11098l.f11996a.m1872c();
            try {
                TextKeyListener.getInstance().release();
                unregisterReceiver(this.f7123d);
            } catch (Exception e2) {
            }
            if (this.f7126g != null) {
                this.f7126g.removeAllViews();
                this.f7126g = null;
            }
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f7138s && "android.intent.action.MAIN".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("action", -1);
            if (intExtra != -1) {
                C3359a.f11090d.m2670a(intExtra);
                return;
            }
            m6162n();
            if ((intent.getFlags() & 4194304) != 4194304) {
                m6160p();
            }
        }
    }

    /* renamed from: p */
    public void m6160p() {
        if (this.f7132m && C3359a.f11094h != null && !this.f7141v) {
            this.f7141v = true;
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.Home.9
                @Override // java.lang.Runnable
                public void run() {
                    C0915b.m10598a(3, null);
                    Home.this.f7141v = false;
                }
            });
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f7130k = false;
        if (this.f7136q.containsKey(Integer.valueOf(i))) {
            this.f7136q.get(Integer.valueOf(i)).onActivityResult(i, i2, intent);
            this.f7136q.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: q */
    public static void m6159q() {
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f7137r != null) {
            this.f7137r.m6127a(65535 & i, strArr, iArr);
            C2205e.m6087a(this);
        }
    }

    /* renamed from: a */
    public boolean m6179a(C2202d.InterfaceC2204b interfaceC2204b, boolean z, int i, String... strArr) {
        if (this.f7137r != null) {
            return this.f7137r.m6120a(interfaceC2204b, z, i, strArr);
        }
        return false;
    }
}
