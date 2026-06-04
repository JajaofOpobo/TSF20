package com.tsf.shell;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.AlertDialog;
import android.app.Dialog;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.h.r;
import com.tsf.shell.plugin.shortcutpicker.ShortcutsPicker;
import com.tsf.shell.plugin.widgetpicker.AppWidgetPicker;
import com.tsf.shell.theme.ThemeManagerActivity;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.workspace3D.ShellWallpaperManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Home extends ActivityGroup implements View.OnLongClickListener, bl, h {
    public static Home b;
    private com.tsf.shell.h.d D;
    private com.tsf.shell.workspace3D.g.d.w E;
    private com.tsf.shell.h.m e;
    private com.tsf.shell.h.q f;
    private r g;
    private AppWidgetManager h;
    private com.tsf.shell.h.k i;
    private com.tsf.shell.h.k j;
    private boolean o;
    private ShellModel r;
    private com.tsf.shell.workspace3D.bf t;
    private b u;
    private i v;
    private com.tsf.shell.h.c w;
    private Locale x;
    private InputMethodManager y;
    private IBinder z;
    public static int a = (int) (((Math.random() * 1000.0d) * 2.0d) + 1000.0d);
    private static ap s = null;
    private final BroadcastReceiver c = new ao(this, (byte) 0);
    private final ContentObserver d = new an(this);
    private final int[] k = new int[2];
    private SpannableStringBuilder l = null;
    private boolean m = true;
    private boolean n = true;
    private boolean p = false;
    private boolean q = false;
    private HashMap A = new HashMap();
    private boolean B = false;
    private int C = 5000;
    private boolean F = false;

    public final void a(float f, float f2) {
        this.k[0] = (int) f;
        this.k[1] = (int) f2;
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        com.flurry.android.t.b();
        com.flurry.android.t.a(this, "WT8M1JUAHR5C94MX9R78");
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.flurry.android.t.a(this);
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        com.censivn.C3DEngine.a.a((Context) this);
        com.censivn.C3DEngine.b.r.e = Build.VERSION.SDK_INT >= 9;
        this.y = (InputMethodManager) getSystemService("input_method");
        com.tsf.shell.a.t.a();
        com.tsf.shell.a.t.b(com.tsf.shell.a.t.a(this), this);
        bd.a(this);
        if (ShellWallpaperManager.a(this)) {
            com.tsf.shell.a.t.g(true);
        } else {
            com.tsf.shell.a.t.g(false);
        }
        super.onCreate(bundle);
        com.censivn.C3DEngine.a.a(com.tsf.shell.g.g.a(this));
        getWindow().addFlags(256);
        getWindow().addFlags(ThemeDockDescription.DOCK_MENU_ADD_BUTTON_OFF);
        this.e = new com.tsf.shell.h.m(this);
        this.z = this.e.getWindowToken();
        if (b != null) {
            setContentView(this.e);
            a();
        }
        b = this;
        setContentView(this.e);
        if (!com.tsf.shell.a.t.aa().getBoolean("startupError", false)) {
            com.tsf.shell.a.q.a(true);
            e();
            return;
        }
        int i = com.tsf.shell.a.t.aa().getInt("startupErrorTimes", 0);
        switch (i) {
            case 0:
                SharedPreferences.Editor Z = com.tsf.shell.a.t.Z();
                Z.putInt("startupErrorTimes", i + 1);
                Z.commit();
                e();
                break;
            default:
                au.a(this, R.string.public_title_error, R.string.notic_restore_startup_notic, new m(this), new ab(this));
                break;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.x != null && !this.x.equals(configuration.locale)) {
            a();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.tsf.shell.action.r.a(z);
    }

    public final void a() {
        this.B = true;
        com.tsf.shell.a.q.a(false);
        Intent intent = new Intent(this, (Class<?>) RestartActivity.class);
        intent.putExtra("pid", Process.myPid());
        startActivity(intent);
        finish();
    }

    public final boolean b() {
        return this.B;
    }

    public final void c() {
        this.B = true;
        af afVar = new af(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(afVar, 100L);
    }

    public static Home d() {
        return b;
    }

    public final void e() {
        if (com.tsf.shell.a.t.a(this) == 0) {
            com.tsf.shell.a.t.U();
        }
        this.p = true;
        this.q = false;
        com.censivn.C3DEngine.a.a((Activity) this);
        aq.b();
        this.x = getResources().getConfiguration().locale;
        this.f = new com.tsf.shell.h.q(this);
        this.e.addView(this.f);
        this.v = i.a();
        this.u = new b();
        this.w = new com.tsf.shell.h.c(this);
        this.t = new com.tsf.shell.workspace3D.bf(this.f);
        this.t.a(com.tsf.shell.workspace3D.bf.a, this, "onWorkspace3dReady", new Object[0]);
        this.t.a(com.tsf.shell.workspace3D.bf.b, this, "onWorkspace3dInitComplete", new Object[0]);
        this.g = new r(this);
        this.g.a(com.tsf.shell.workspace3D.bf.j());
        this.g.setOnLongClickListener(this);
        this.e.a(this.g);
        this.e.addView(this.g, 0);
        getApplication();
        this.r = ShellApplication.a();
        this.r.a((bl) this);
        this.h = AppWidgetManager.getInstance(this);
        this.w.startListening();
        t();
        getContentResolver().registerContentObserver(ShellProvider.a, true, this.d);
        this.l = new SpannableStringBuilder();
        Selection.setSelection(this.l, 0);
        registerReceiver(this.c, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public final void onWorkspace3dReady() {
        ShellModel shellModel = this.r;
        ShellModel.a();
        this.r.b(this);
    }

    public final void onInitialzeDataComplete() {
        com.censivn.C3DEngine.a.a().a((RenderRunnable) new ag(this));
    }

    public final void onWorkspace3dInitComplete() {
        com.tsf.shell.services.f fVar = new com.tsf.shell.services.f(getApplicationContext());
        fVar.b();
        fVar.a();
        com.tsf.shell.a.q.a();
        com.tsf.shell.a.t.V();
        aq.a();
        com.tsf.shell.workspace3D.bf.d();
        ThemeManager.getInstance().onReady();
        com.censivn.C3DEngine.b.m.d().a();
        cj.a();
        com.censivn.C3DEngine.a.a().c(new ah(this));
    }

    public final void a(Intent intent) {
        i.a().b(new ai(this, intent));
    }

    private boolean q() {
        return this.m || this.o;
    }

    public final r f() {
        return this.g;
    }

    public final com.tsf.shell.h.c g() {
        return this.w;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (q()) {
            return false;
        }
        super.onCreateOptionsMenu(menu);
        menu.add(1, 2, 0, R.string.menu_add).setIcon(android.R.drawable.ic_menu_add).setAlphabeticShortcut('A');
        menu.add(0, 3, 0, R.string.menu_manage_apps).setIcon(android.R.drawable.ic_menu_manage).setAlphabeticShortcut('M');
        menu.add(2, 4, 0, R.string.menu_wallpaper).setIcon(android.R.drawable.ic_menu_gallery).setAlphabeticShortcut('W');
        menu.add(0, 5, 0, R.string.menu_theme).setIcon(android.R.drawable.ic_menu_gallery);
        menu.add(0, 6, 0, R.string.group_tsf).setIcon(android.R.drawable.ic_menu_more).setAlphabeticShortcut('N');
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.setFlags(270532608);
        menu.add(0, 7, 0, R.string.menu_settings).setIcon(android.R.drawable.ic_menu_preferences).setAlphabeticShortcut('P').setIntent(intent);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.setGroupVisible(1, true);
        menu.setGroupVisible(2, true);
        r rVar = this.g;
        this.j = r.e();
        menu.setGroupEnabled(1, this.j != null && com.tsf.shell.workspace3D.bf.n().p() && com.tsf.shell.workspace3D.bf.j().j() == 2);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2:
                if (com.tsf.shell.workspace3D.bf.j().z() != -1) {
                    a(this.j);
                    return true;
                }
                au.a(R.string.notic_widget_forbid_add);
                return true;
            case 3:
                startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                return true;
            case 4:
                j();
                return true;
            case 5:
                ThemeManagerActivity.a();
                return true;
            case 6:
                com.tsf.shell.workspace3D.bf.h().a();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.app_enter, R.anim.app_exit);
    }

    @Override // com.tsf.shell.h
    public final int a(Intent intent, a aVar) {
        int i = this.C;
        this.o = true;
        this.A.put(Integer.valueOf(this.C), aVar);
        a(intent, this.C);
        overridePendingTransition(R.anim.app_enter, R.anim.app_exit);
        this.C++;
        return i;
    }

    public final int b(Intent intent, a aVar) {
        int i = this.C;
        this.o = true;
        this.A.put(Integer.valueOf(this.C), aVar);
        a(intent, this.C);
        overridePendingTransition(R.anim.app_alpha_enter, R.anim.app_alpha_exit);
        this.C++;
        return i;
    }

    public final void b(Intent intent) {
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (Exception e) {
            al alVar = new al(this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(alVar);
            e.printStackTrace();
        }
    }

    private void a(Intent intent, int i) {
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            am amVar = new am(this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(amVar);
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        if (i >= 0) {
            this.o = true;
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
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
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        com.censivn.C3DEngine.a.a().c(new p(this, i, keyEvent));
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.censivn.C3DEngine.a.a().c(new q(this, i, keyEvent));
        if (i == 4) {
            return true;
        }
        if (i == 82 && keyEvent.isLongPress()) {
            return true;
        }
        if (i == 24) {
            com.censivn.C3DEngine.a.d().d();
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (!onKeyDown && i != 66 && TextKeyListener.getInstance().onKeyDown(this.g, this.l, i, keyEvent) && this.l != null && this.l.length() > 0) {
            return onSearchRequested();
        }
        return onKeyDown;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        startSearch(null, false, null, true);
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (q() || !this.q) {
            return false;
        }
        com.tsf.shell.h.k kVar = (com.tsf.shell.h.k) (!(view instanceof com.tsf.shell.h.j) ? (View) view.getParent().getParent() : view).getTag();
        if (kVar == null) {
            return true;
        }
        if (this.g.c()) {
            if (kVar.a == null) {
                this.g.d();
                a(kVar);
            } else {
                if (!com.tsf.shell.workspace3D.z.a()) {
                    return true;
                }
                kVar.a.setPressed(false);
                this.y.hideSoftInputFromWindow(this.z, 0);
                com.tsf.shell.g.h.a();
                com.censivn.C3DEngine.a.a().c(new s(this, kVar));
            }
        }
        return true;
    }

    @Override // android.app.Activity
    protected final Dialog onCreateDialog(int i) {
        switch (i) {
            case 10:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setCancelable(false);
                builder.setMessage(R.string.license_fail).setPositiveButton(R.string.license_purchase, new t(this)).setNegativeButton(R.string.license_exit, new u(this));
                return builder.create();
            case 11:
                return new AlertDialog.Builder(this).setMessage(R.string.shell_download_new_version_or_not).setPositiveButton(R.string.public_action_update, new v(this)).setNegativeButton(R.string.public_action_cancel, new w(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    @Override // android.app.Activity
    protected final void onPrepareDialog(int i, Dialog dialog) {
    }

    public final void a(com.tsf.shell.h.d dVar) {
        this.D = dVar;
        h();
    }

    public final void h() {
        Intent intent;
        int allocateAppWidgetId = this.w.allocateAppWidgetId();
        if (Build.VERSION.SDK_INT < 16) {
            intent = new Intent("android.appwidget.action.APPWIDGET_PICK");
        } else {
            intent = new Intent();
            intent.setClass(com.censivn.C3DEngine.a.c(), AppWidgetPicker.class);
        }
        intent.putExtra("appWidgetId", allocateAppWidgetId);
        startActivityForResult(intent, 9);
    }

    public final void i() {
        if (com.tsf.shell.workspace3D.z.a()) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent();
            intent.setClass(com.censivn.C3DEngine.a.c(), ShortcutsPicker.class);
            intent.putExtra("android.intent.extra.INTENT", new Intent("android.intent.action.CREATE_SHORTCUT"));
            intent.putExtra("android.intent.extra.TITLE", getText(R.string.title_select_shortcut));
            intent.putExtras(bundle);
            startActivityForResult(intent, 7);
        }
    }

    public final void j() {
        startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SET_WALLPAPER"), getText(R.string.chooser_wallpaper)), 10);
    }

    public static void k() {
        com.tsf.shell.workspace3D.bf.h().a();
    }

    public final void a(int i, int i2) {
        a(i, i2);
        r rVar = this.g;
        if (r.e() != null) {
            r rVar2 = this.g;
            r.e().b = i;
            r rVar3 = this.g;
            r.e().c = i2;
            r rVar4 = this.g;
            a(r.e());
        }
    }

    private void r() {
        if (this.E != null) {
            this.E.e();
        }
    }

    private void a(com.tsf.shell.h.k kVar) {
        this.i = kVar;
        this.o = true;
        com.censivn.C3DEngine.a.a().c(new x(this, kVar));
    }

    final void l() {
        getWindow().closeAllPanels();
        this.o = false;
    }

    private boolean s() {
        return this.n;
    }

    @Override // com.tsf.shell.bl
    public final void m() {
        r rVar = this.g;
        int childCount = rVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ViewGroup) rVar.getChildAt(i)).removeAllViewsInLayout();
        }
    }

    @Override // com.tsf.shell.bl
    public final void a(LauncherAppWidgetInfo launcherAppWidgetInfo) {
        com.tsf.shell.workspace3D.h.a d = com.tsf.shell.workspace3D.bf.j().d(launcherAppWidgetInfo.screen);
        if (d == null || d.q() == null) {
            this.w.deleteAppWidgetId(launcherAppWidgetInfo.appWidgetId);
            bm.b(this, launcherAppWidgetInfo);
            return;
        }
        r rVar = this.g;
        int i = launcherAppWidgetInfo.appWidgetId;
        AppWidgetProviderInfo appWidgetInfo = this.h.getAppWidgetInfo(i);
        String str = "";
        if (appWidgetInfo != null && appWidgetInfo.provider != null) {
            str = appWidgetInfo.provider.getPackageName();
        }
        com.tsf.shell.workspace3D.k.a aVar = new com.tsf.shell.workspace3D.k.a(launcherAppWidgetInfo, str);
        aVar.C = new com.tsf.shell.h.d(this, (com.tsf.shell.h.g) this.w.createView(this, i, appWidgetInfo), aVar);
        aVar.C.a.setAppWidget(i, appWidgetInfo);
        com.censivn.C3DEngine.a.a().c(new z(this, d, aVar));
        if (com.censivn.C3DEngine.a.q) {
            int[] iArr = {launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height};
            if (com.tsf.shell.workspace3D.be.c(iArr)) {
                launcherAppWidgetInfo.cellX = iArr[0];
                launcherAppWidgetInfo.cellY = iArr[1];
                launcherAppWidgetInfo.width = iArr[2];
                launcherAppWidgetInfo.height = iArr[3];
                aVar.bs();
            }
            rVar.a(aVar.C, d.q(), launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height, false);
            return;
        }
        int[] iArr2 = {launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH, launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH};
        if (com.tsf.shell.workspace3D.be.c(iArr2)) {
            launcherAppWidgetInfo.cellXH = iArr2[0];
            launcherAppWidgetInfo.cellYH = iArr2[1];
            launcherAppWidgetInfo.widthH = iArr2[2];
            launcherAppWidgetInfo.heightH = iArr2[3];
            aVar.bs();
        }
        rVar.a(aVar.C, d.q(), launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH, launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH, false);
    }

    @Override // com.tsf.shell.bl
    public final void a(String str) {
        com.tsf.shell.workspace3D.bf.l().l().a(str);
    }

    @Override // com.tsf.shell.bl
    public final void b(String str) {
        com.tsf.shell.workspace3D.bf.s().a(str);
    }

    @Override // com.tsf.shell.bl
    public final void a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        this.u.a(launcherShortcut3DInfo);
    }

    @Override // com.tsf.shell.bl
    public final void n() {
        s();
        this.m = false;
    }

    @Override // com.tsf.shell.bl
    public final void a(String[] strArr, int i) {
        b bVar = this.u;
        b.a(strArr, i);
    }

    @Override // com.tsf.shell.bl
    public final void a(ArrayList arrayList) {
        this.u.a(arrayList);
    }

    @Override // com.tsf.shell.bl
    public final void a(ArrayList arrayList, boolean z) {
        s();
        r();
        this.u.a(arrayList, z);
    }

    @Override // com.tsf.shell.bl
    public final void b(ArrayList arrayList) {
        s();
        r();
        this.u.b(arrayList);
    }

    @Override // com.tsf.shell.bl
    public final void b(ArrayList arrayList, boolean z) {
        r();
        if (z) {
            com.tsf.shell.workspace3D.bf.p().a(arrayList);
        }
        this.u.b(arrayList, z);
    }

    static /* synthetic */ void a(Context context, ap apVar) {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(context.openFileInput("launcher.preferences"));
            try {
                apVar.a = dataInputStream.readUTF();
                apVar.b = dataInputStream.readInt();
                apVar.c = dataInputStream.readInt();
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                }
            } catch (FileNotFoundException e2) {
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (IOException e4) {
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (Throwable th) {
                dataInputStream2 = dataInputStream;
                th = th;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
            dataInputStream = null;
        } catch (IOException e8) {
            dataInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.IOException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void b(Context context, ap apVar) {
        ?? e;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                e = new DataOutputStream(context.openFileOutput("launcher.preferences", 0));
                try {
                    e.writeUTF(apVar.a);
                    e.writeInt(apVar.b);
                    e.writeInt(apVar.c);
                    e.flush();
                    try {
                        e.close();
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (FileNotFoundException e3) {
                    if (e != 0) {
                        try {
                            e.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (IOException e5) {
                    context.getFileStreamPath("launcher.preferences").delete();
                    if (e != 0) {
                        try {
                            e.close();
                        } catch (IOException e6) {
                            e = e6;
                        }
                    }
                }
            } catch (Throwable th) {
                dataOutputStream = e;
                th = th;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException e7) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e8) {
            e = 0;
        } catch (IOException e9) {
            e = 0;
        } catch (Throwable th2) {
            th = th2;
            if (dataOutputStream != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (s == null) {
            new aa(this).execute(new Void[0]);
            return;
        }
        Configuration configuration = getResources().getConfiguration();
        String str = s.a;
        String locale = configuration.locale.toString();
        int i = s.b;
        int i2 = configuration.mcc;
        int i3 = s.c;
        int i4 = configuration.mnc;
        if ((locale.equals(str) && i2 == i && i4 == i3) ? false : true) {
            s.a = locale;
            s.b = i2;
            s.c = i4;
            new ac(this, "WriteLocaleConfiguration", s).start();
        }
    }

    public final boolean o() {
        return !this.n;
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.n = false;
        if (this.p) {
            this.t.e();
            com.censivn.C3DEngine.a.a().c(new ad(this));
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.n = true;
        if (this.p) {
            this.v.a("Home");
            this.t.f();
        }
        com.tsf.shell.workspace3D.z.c();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            this.w.stopListening();
        } catch (NullPointerException e) {
        }
        try {
            TextKeyListener.getInstance().release();
            getContentResolver().unregisterContentObserver(this.d);
            unregisterReceiver(this.c);
        } catch (Exception e2) {
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            l();
            if ((intent.getFlags() & 4194304) != 4194304) {
                p();
            }
        }
    }

    public final void p() {
        if (this.q && com.tsf.shell.workspace3D.bf.j() != null && !this.F) {
            this.F = true;
            com.censivn.C3DEngine.a.a().c(new ae(this));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.app.Activity
    protected final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.Home.onActivityResult(int, int, android.content.Intent):void");
    }
}
