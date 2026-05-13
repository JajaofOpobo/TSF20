package com.tsf.shell.manager.p187r.p188a;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.shell.Home;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p187r.C3613a;
import com.tsf.shell.p095e.C2254a;
import com.tsf.shell.p095e.C2255b;
import com.tsf.shell.p095e.C2259c;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p095e.C2269f;
import com.tsf.shell.p096f.p118e.C2663t;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import com.tsf.shell.p096f.p153i.p161c.C3342f;
/* renamed from: com.tsf.shell.manager.r.a.a */
/* loaded from: classes.dex */
public class C3614a implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    static final Uri f11971a = Uri.parse("content://" + ShellProvider.f7174a + "/appWidgetReset");

    /* renamed from: b */
    private int f11972b;

    /* renamed from: c */
    private int f11973c;

    /* renamed from: d */
    private int f11974d;

    /* renamed from: f */
    private AppWidgetManager f11976f;

    /* renamed from: g */
    private final ContentObserver f11977g;

    /* renamed from: h */
    private int f11978h;

    /* renamed from: i */
    private int f11979i;

    /* renamed from: j */
    private C2255b f11980j;

    /* renamed from: k */
    private Context f11981k = C0853a.m10856d();

    /* renamed from: l */
    private C2663t.C2667b f11982l = new C2663t.C2667b() { // from class: com.tsf.shell.manager.r.a.a.1
        @Override // com.tsf.shell.p096f.p118e.C2663t.C2667b
        /* renamed from: a */
        public void mo1870a() {
            C3359a.f11095i.f12255a.templeteShow();
        }
    };

    /* renamed from: e */
    private C2254a f11975e = new C2254a(this.f11981k, 1024);

    /* renamed from: com.tsf.shell.manager.r.a.a$a */
    /* loaded from: classes.dex */
    private class C3619a extends ContentObserver {
        public C3619a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            try {
                C3614a.this.f11975e.startListening();
            } catch (Exception e) {
            }
        }
    }

    public C3614a() {
        try {
            this.f11976f = AppWidgetManager.getInstance(this.f11981k);
            this.f11975e.startListening();
        } catch (Exception e) {
        }
        this.f11977g = new C3619a();
        this.f11981k.getContentResolver().registerContentObserver(f11971a, true, this.f11977g);
    }

    /* renamed from: a */
    public int m1885a() {
        return this.f11975e.allocateAppWidgetId();
    }

    /* renamed from: a */
    public void m1884a(int i) {
        this.f11975e.deleteAppWidgetId(i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m1879a(C2255b c2255b) {
        this.f11980j = c2255b;
        if (Build.VERSION.SDK_INT >= 16 && c2255b != null && c2255b.f7361b != null && c2255b.f7361b.m3534K() != null) {
            LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) c2255b.f7361b.m3534K();
            if (launcherAppWidgetInfo.providerName != null) {
                try {
                    int allocateAppWidgetId = this.f11975e.allocateAppWidgetId();
                    if (!this.f11976f.bindAppWidgetIdIfAllowed(allocateAppWidgetId, launcherAppWidgetInfo.providerName)) {
                        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
                        intent.putExtra("appWidgetId", allocateAppWidgetId);
                        intent.putExtra("appWidgetProvider", launcherAppWidgetInfo.providerName);
                        this.f11973c = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
                    } else {
                        m1883a(allocateAppWidgetId, 0, 0);
                    }
                    return;
                } catch (Exception e) {
                    m1876b();
                    return;
                }
            }
            m1876b();
            return;
        }
        m1876b();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m1882a(final AppWidgetManager appWidgetManager, final C3342f c3342f, final int i, final int i2) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.r.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                int m1885a = C3359a.f11098l.f11996a.m1885a();
                try {
                    if (!appWidgetManager.bindAppWidgetIdIfAllowed(m1885a, c3342f.m2802c())) {
                        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
                        intent.putExtra("appWidgetId", m1885a);
                        intent.putExtra("appWidgetProvider", c3342f.m2802c());
                        C3614a.this.f11978h = i;
                        C3614a.this.f11979i = i2;
                        C3614a.this.f11974d = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) C3614a.this);
                        return;
                    }
                } catch (Exception e) {
                }
                C3614a.this.m1883a(m1885a, i, i2);
            }
        });
    }

    /* renamed from: b */
    public void m1876b() {
        int allocateAppWidgetId = this.f11975e.allocateAppWidgetId();
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_PICK");
        intent.putExtra("appWidgetId", allocateAppWidgetId);
        this.f11973c = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
    }

    /* renamed from: a */
    private void m1881a(Intent intent) {
        m1883a(intent.getIntExtra("appWidgetId", -1), (C0892a.f2586v + C0892a.f2588x) / 2, C0892a.f2587w);
    }

    /* renamed from: a */
    public void m1883a(int i, int i2, int i3) {
        this.f11978h = i2;
        this.f11979i = i3;
        AppWidgetProviderInfo appWidgetInfo = this.f11976f.getAppWidgetInfo(i);
        if (appWidgetInfo != null && appWidgetInfo.configure != null) {
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE");
            intent.setComponent(appWidgetInfo.configure);
            intent.putExtra("appWidgetId", i);
            this.f11972b = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
            return;
        }
        m1875b(i, i2, i3);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void m1875b(int i, int i2, int i3) {
        AppWidgetProviderInfo appWidgetInfo = this.f11976f.getAppWidgetInfo(i);
        if (appWidgetInfo != null) {
            if (this.f11980j != null) {
                ((LauncherAppWidgetInfo) this.f11980j.f7361b.m3534K()).appWidgetId = i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("appWidgetId", Integer.valueOf(i));
                this.f11980j.f7361b.m3515a(contentValues);
                C2259c c2259c = (C2259c) this.f11975e.createView(this.f11981k, i, appWidgetInfo);
                c2259c.setAppWidget(i, appWidgetInfo);
                this.f11980j.m6007a(c2259c);
                Home.m6177b().m6164l().m5981a(this.f11980j);
                this.f11980j = null;
                return;
            }
            final C2932g m4031n = C3359a.f11094h.m4031n();
            C2262d m4182s = m4031n.m4182s();
            if (m4182s == null) {
                this.f11975e.deleteAppWidgetId(i);
                return;
            }
            int[] m4339a = C3359a.f11094h.f9606d.m4339a(appWidgetInfo.minWidth, appWidgetInfo.minHeight);
            LauncherAppWidgetInfo launcherAppWidgetInfo = new LauncherAppWidgetInfo(i, appWidgetInfo.provider);
            launcherAppWidgetInfo.width = m4339a[0];
            launcherAppWidgetInfo.height = m4339a[1];
            launcherAppWidgetInfo.screen = m4031n.m4181t();
            launcherAppWidgetInfo.providerName = appWidgetInfo.provider;
            int[] iArr = {i2 - (launcherAppWidgetInfo.width / 2), i3 - (launcherAppWidgetInfo.height / 2), m4339a[0], m4339a[1]};
            C3613a.m1886c(iArr);
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
            final C3124a c3124a = new C3124a(launcherAppWidgetInfo, appWidgetInfo.provider.getPackageName());
            c3124a.f10163g = new C2255b(this.f11981k, (C2259c) this.f11975e.createView(this.f11981k, i, appWidgetInfo), c3124a);
            c3124a.f10163g.f7360a.setAppWidget(i, appWidgetInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                float f = C0853a.m10856d().getResources().getDisplayMetrics().density;
                int i8 = (int) (launcherAppWidgetInfo.width / f);
                int i9 = (int) (launcherAppWidgetInfo.height / f);
                c3124a.f10163g.f7360a.updateAppWidgetSize(null, i8, i9, i8, i9);
            }
            Home.m6177b().m6164l().m5982a(c3124a.f10163g, m4182s, launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height, Home.m6177b().m6165k());
            c3124a.m3514ad();
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    m4031n.m4229a(c3124a);
                    c3124a.m3441q();
                    C2663t.m5023a(c3124a, C3614a.this.f11982l);
                }
            });
        }
    }

    /* renamed from: a */
    public void m1880a(LauncherAppWidgetInfo launcherAppWidgetInfo) {
        final C2932g m4054d = C3359a.f11094h.m4054d(launcherAppWidgetInfo.screen);
        if (m4054d == null || m4054d.m4182s() == null) {
            this.f11975e.deleteAppWidgetId(launcherAppWidgetInfo.appWidgetId);
            ShellModel.C3435a.m2367b(launcherAppWidgetInfo);
            return;
        }
        C2269f m6164l = Home.m6177b().m6164l();
        int i = launcherAppWidgetInfo.appWidgetId;
        AppWidgetProviderInfo appWidgetInfo = this.f11976f.getAppWidgetInfo(i);
        String str = "";
        if (launcherAppWidgetInfo.providerName != null) {
            str = launcherAppWidgetInfo.providerName.getPackageName();
            launcherAppWidgetInfo.packagename = str;
        }
        final C3124a c3124a = new C3124a(launcherAppWidgetInfo, str);
        c3124a.f10163g = new C2255b(this.f11981k, (C2259c) this.f11975e.createView(this.f11981k, i, appWidgetInfo), c3124a);
        c3124a.f10163g.f7360a.setAppWidget(i, appWidgetInfo);
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                m4054d.m4229a(c3124a);
            }
        });
        if (C0892a.f2564O) {
            int[] iArr = {launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height};
            if (C3613a.m1886c(iArr)) {
                launcherAppWidgetInfo.cellX = iArr[0];
                launcherAppWidgetInfo.cellY = iArr[1];
                launcherAppWidgetInfo.width = iArr[2];
                launcherAppWidgetInfo.height = iArr[3];
                c3124a.m3514ad();
            }
            m6164l.m5982a(c3124a.f10163g, m4054d.m4182s(), launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY, launcherAppWidgetInfo.width, launcherAppWidgetInfo.height, false);
        } else {
            int[] iArr2 = {launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH, launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH};
            if (C3613a.m1886c(iArr2)) {
                launcherAppWidgetInfo.cellXH = iArr2[0];
                launcherAppWidgetInfo.cellYH = iArr2[1];
                launcherAppWidgetInfo.widthH = iArr2[2];
                launcherAppWidgetInfo.heightH = iArr2[3];
                c3124a.m3514ad();
            }
            m6164l.m5982a(c3124a.f10163g, m4054d.m4182s(), launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH, launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH, false);
        }
        c3124a.m3443k();
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        int i3;
        if (intent == null) {
            i2 = 0;
        }
        if (i2 == -1) {
            if (i == this.f11973c) {
                m1881a(intent);
                return;
            } else if (i == this.f11972b) {
                m1875b(intent.getExtras().getInt("appWidgetId", -1), this.f11978h, this.f11979i);
                return;
            } else if (i == this.f11974d && (i3 = intent.getExtras().getInt("appWidgetId", -1)) != -1) {
                m1883a(i3, this.f11978h, this.f11979i);
                return;
            } else {
                return;
            }
        }
        if (intent != null && (intExtra = intent.getIntExtra("appWidgetId", -1)) != -1) {
            this.f11975e.deleteAppWidgetId(intExtra);
        }
        C3359a.f11095i.f12255a.templeteShow();
    }

    /* renamed from: c */
    public void m1872c() {
        try {
            this.f11975e.stopListening();
        } catch (Exception e) {
        }
        try {
            this.f11981k.getContentResolver().unregisterContentObserver(this.f11977g);
        } catch (Exception e2) {
        }
    }
}
