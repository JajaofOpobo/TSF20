package com.tsf.shell.manager.r.a;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.tsf.shell.Home;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.d.e;
import com.tsf.shell.d.i;
import com.tsf.shell.e.e.aa;
import com.tsf.shell.e.e.ac;
import com.tsf.shell.e.f.g;
import com.tsf.shell.e.i.c.h;
import com.tsf.shell.manager.bind.d;

/* loaded from: classes.dex */
public class a implements com.censivn.C3DEngine.b.c.b {
    static final Uri a = Uri.parse("content://" + ShellProvider.a + "/appWidgetReset");
    private int b;
    private int c;
    private int d;
    private AppWidgetManager f;
    private final ContentObserver g;
    private int h;
    private int i;
    private com.tsf.shell.d.b j;
    private Context k = com.censivn.C3DEngine.a.d();
    private ac l = new ac() { // from class: com.tsf.shell.manager.r.a.a.1
        @Override // com.tsf.shell.e.e.ac
        public void a() {
            com.tsf.shell.manager.a.i.a.templeteShow();
        }
    };
    private com.tsf.shell.d.a e = new com.tsf.shell.d.a(this.k, 1024);

    public a() {
        try {
            this.f = AppWidgetManager.getInstance(this.k);
            this.e.startListening();
        } catch (Exception e) {
        }
        this.g = new b(this);
        this.k.getContentResolver().registerContentObserver(a, true, this.g);
    }

    public int a() {
        return this.e.allocateAppWidgetId();
    }

    public void a(int i) {
        this.e.deleteAppWidgetId(i);
    }

    @SuppressLint({"NewApi"})
    public void a(com.tsf.shell.d.b bVar) {
        this.j = bVar;
        if (Build.VERSION.SDK_INT >= 16 && bVar != null && bVar.b != null && bVar.b.K() != null) {
            LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) bVar.b.K();
            if (launcherAppWidgetInfo.providerName != null) {
                try {
                    int allocateAppWidgetId = this.e.allocateAppWidgetId();
                    if (!this.f.bindAppWidgetIdIfAllowed(allocateAppWidgetId, launcherAppWidgetInfo.providerName)) {
                        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
                        intent.putExtra("appWidgetId", allocateAppWidgetId);
                        intent.putExtra("appWidgetProvider", launcherAppWidgetInfo.providerName);
                        this.c = Home.b().a(intent, (com.censivn.C3DEngine.b.c.b) this);
                    } else {
                        a(allocateAppWidgetId, 0, 0);
                    }
                    return;
                } catch (Exception e) {
                    b();
                    return;
                }
            }
            b();
            return;
        }
        b();
    }

    @SuppressLint({"NewApi"})
    public void a(final AppWidgetManager appWidgetManager, final h hVar, final int i, final int i2) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.r.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                int a2 = com.tsf.shell.manager.a.l.a.a();
                try {
                    if (!appWidgetManager.bindAppWidgetIdIfAllowed(a2, hVar.c())) {
                        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
                        intent.putExtra("appWidgetId", a2);
                        intent.putExtra("appWidgetProvider", hVar.c());
                        a.this.h = i;
                        a.this.i = i2;
                        a.this.d = Home.b().a(intent, (com.censivn.C3DEngine.b.c.b) a.this);
                        return;
                    }
                } catch (Exception e) {
                }
                a.this.a(a2, i, i2);
            }
        });
    }

    public void b() {
        int allocateAppWidgetId = this.e.allocateAppWidgetId();
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_PICK");
        intent.putExtra("appWidgetId", allocateAppWidgetId);
        this.c = Home.b().a(intent, (com.censivn.C3DEngine.b.c.b) this);
    }

    private void a(Intent intent) {
        a(intent.getIntExtra("appWidgetId", -1), (com.censivn.C3DEngine.b.b.a.v + com.censivn.C3DEngine.b.b.a.x) / 2, com.censivn.C3DEngine.b.b.a.w);
    }

    public void a(int i, int i2, int i3) {
        this.h = i2;
        this.i = i3;
        AppWidgetProviderInfo appWidgetInfo = this.f.getAppWidgetInfo(i);
        if (appWidgetInfo != null && appWidgetInfo.configure != null) {
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE");
            intent.setComponent(appWidgetInfo.configure);
            intent.putExtra("appWidgetId", i);
            this.b = Home.b().a(intent, (com.censivn.C3DEngine.b.c.b) this);
            return;
        }
        b(i, i2, i3);
    }

    @SuppressLint({"NewApi"})
    public void b(int i, int i2, int i3) {
        AppWidgetProviderInfo appWidgetInfo = this.f.getAppWidgetInfo(i);
        if (appWidgetInfo != null) {
            if (this.j != null) {
                ((LauncherAppWidgetInfo) this.j.b.K()).appWidgetId = i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("appWidgetId", Integer.valueOf(i));
                this.j.b.a(contentValues);
                com.tsf.shell.d.c cVar = (com.tsf.shell.d.c) this.e.createView(this.k, i, appWidgetInfo);
                cVar.setAppWidget(i, appWidgetInfo);
                this.j.a(cVar);
                Home.b().l().a(this.j);
                this.j = null;
                return;
            }
            final g n = com.tsf.shell.manager.a.h.n();
            e s = n.s();
            if (s == null) {
                this.e.deleteAppWidgetId(i);
                return;
            }
            int[] a2 = com.tsf.shell.manager.a.h.d.a(appWidgetInfo.minWidth, appWidgetInfo.minHeight);
            LauncherAppWidgetInfo launcherAppWidgetInfo = new LauncherAppWidgetInfo(i, appWidgetInfo.provider);
            launcherAppWidgetInfo.width = a2[0];
            launcherAppWidgetInfo.height = a2[1];
            launcherAppWidgetInfo.screen = n.t();
            launcherAppWidgetInfo.providerName = appWidgetInfo.provider;
            int[] iArr = {i2 - (launcherAppWidgetInfo.width / 2), i3 - (launcherAppWidgetInfo.height / 2), a2[0], a2[1]};
            com.tsf.shell.manager.r.a.c(iArr);
            int i4 = iArr[0];
            launcherAppWidgetInfo.cellXH = i4;
            launcherAppWidgetInfo.cellX = i4;
            int i5 = iArr[1];
            launcherAppWidgetInfo.cellYH = i5;
            launcherAppWidgetInfo.cellY = i5;
            int i6 = iArr[2];
            launcherAppWidgetInfo.widthH = i6;
            launcherAppWidgetInfo.width = i6;
            int i7 = iArr[3];
            launcherAppWidgetInfo.heightH = i7;
            launcherAppWidgetInfo.height = i7;
            launcherAppWidgetInfo.container = -1;
            final com.tsf.shell.e.i.b.b.a aVar = new com.tsf.shell.e.i.b.b.a(launcherAppWidgetInfo, appWidgetInfo.provider.getPackageName());
            aVar.g = new com.tsf.shell.d.b(this.k, (com.tsf.shell.d.c) this.e.createView(this.k, i, appWidgetInfo), aVar);
            aVar.g.a.setAppWidget(i, appWidgetInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                float f = com.censivn.C3DEngine.a.d().getResources().getDisplayMetrics().density;
                int i8 = (int) (launcherAppWidgetInfo.width / f);
                int i9 = (int) (launcherAppWidgetInfo.height / f);
                aVar.g.a.updateAppWidgetSize(null, i8, i9, i8, i9);
            }
            Home.b().l().a(aVar.g, s, launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height, Home.b().k());
            aVar.ad();
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    n.a(aVar);
                    aVar.q();
                    aa.a(aVar, a.this.l);
                }
            });
        }
    }

    public void a(LauncherAppWidgetInfo launcherAppWidgetInfo) {
        final g d = com.tsf.shell.manager.a.h.d(launcherAppWidgetInfo.screen);
        if (d == null || d.s() == null) {
            this.e.deleteAppWidgetId(launcherAppWidgetInfo.appWidgetId);
            d.b(launcherAppWidgetInfo);
            return;
        }
        i l = Home.b().l();
        int i = launcherAppWidgetInfo.appWidgetId;
        AppWidgetProviderInfo appWidgetInfo = this.f.getAppWidgetInfo(i);
        String str = "";
        if (launcherAppWidgetInfo.providerName != null) {
            str = launcherAppWidgetInfo.providerName.getPackageName();
            launcherAppWidgetInfo.packagename = str;
        }
        final com.tsf.shell.e.i.b.b.a aVar = new com.tsf.shell.e.i.b.b.a(launcherAppWidgetInfo, str);
        aVar.g = new com.tsf.shell.d.b(this.k, (com.tsf.shell.d.c) this.e.createView(this.k, i, appWidgetInfo), aVar);
        aVar.g.a.setAppWidget(i, appWidgetInfo);
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                d.a(aVar);
            }
        });
        if (com.censivn.C3DEngine.b.b.a.O) {
            int[] iArr = {launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height};
            if (com.tsf.shell.manager.r.a.c(iArr)) {
                launcherAppWidgetInfo.cellX = iArr[0];
                launcherAppWidgetInfo.cellY = iArr[1];
                launcherAppWidgetInfo.width = iArr[2];
                launcherAppWidgetInfo.height = iArr[3];
                aVar.ad();
            }
            l.a(aVar.g, d.s(), launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height, false);
        } else {
            int[] iArr2 = {launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH, launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH};
            if (com.tsf.shell.manager.r.a.c(iArr2)) {
                launcherAppWidgetInfo.cellXH = iArr2[0];
                launcherAppWidgetInfo.cellYH = iArr2[1];
                launcherAppWidgetInfo.widthH = iArr2[2];
                launcherAppWidgetInfo.heightH = iArr2[3];
                aVar.ad();
            }
            l.a(aVar.g, d.s(), launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH, launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH, false);
        }
        aVar.k();
    }

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        int i3;
        if (intent == null) {
            i2 = 0;
        }
        if (i2 == -1) {
            if (i == this.c) {
                a(intent);
                return;
            }
            if (i == this.b) {
                b(intent.getExtras().getInt("appWidgetId", -1), this.h, this.i);
                return;
            } else {
                if (i == this.d && (i3 = intent.getExtras().getInt("appWidgetId", -1)) != -1) {
                    a(i3, this.h, this.i);
                    return;
                }
                return;
            }
        }
        if (intent != null && (intExtra = intent.getIntExtra("appWidgetId", -1)) != -1) {
            this.e.deleteAppWidgetId(intExtra);
        }
        com.tsf.shell.manager.a.i.a.templeteShow();
    }

    public void c() {
        try {
            this.e.stopListening();
        } catch (Exception e) {
        }
        try {
            this.k.getContentResolver().unregisterContentObserver(this.g);
        } catch (Exception e2) {
        }
    }
}
