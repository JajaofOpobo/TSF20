package com.tsf.shell.manager.wallpaper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.themepicker.ac;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ShellWallpaperManager extends BroadcastReceiver {
    private WallpaperManager g;
    private int h;
    private int i;
    private int j;
    private float l;
    private float m;
    private l o;
    private static float d = 0.0f;
    private static int e = 0;
    public static int a = 0;
    public static int b = 1;
    private boolean k = true;
    private Object n = new Object();
    public boolean c = true;
    private ArrayList p = new ArrayList();
    private j f = new j(this);

    @SuppressLint({"ServiceCast"})
    public ShellWallpaperManager(Context context) {
        this.g = (WallpaperManager) context.getSystemService("wallpaper");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.WALLPAPER_CHANGED");
        com.censivn.C3DEngine.a.d().registerReceiver(this, intentFilter);
        b(3);
    }

    public l a() {
        return this.o;
    }

    public void a(i iVar) {
        synchronized (this.n) {
            if (!this.p.contains(iVar)) {
                this.p.add(iVar);
            }
        }
    }

    public void b(i iVar) {
        synchronized (this.n) {
            this.p.remove(iVar);
        }
    }

    public void b() {
        this.o = new l();
        l();
        if (com.tsf.shell.manager.b.g.ag()) {
        }
    }

    public WallpaperManager c() {
        return this.g;
    }

    private static void b(int i) {
        if (i < 2) {
            i = 2;
        } else if (i > 5) {
            i = 5;
        }
        e = i;
        d = 0.05f + ((i / 5.0f) * 0.15f);
    }

    private void l() {
        this.i = com.censivn.C3DEngine.b.b.a.F;
    }

    public void d() {
        a(com.tsf.shell.manager.b.g.X());
    }

    public void a(int i) {
        if (i == a) {
            com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
            if (n != null && n.r() > 0) {
                a(c(n), true);
                return;
            } else {
                a(0.0f, true);
                return;
            }
        }
        a(0.5f, true);
    }

    private float b(com.tsf.shell.e.f.g gVar) {
        return (gVar.r() - 1) / (com.tsf.shell.manager.a.h.l() - 2);
    }

    private float c(com.tsf.shell.e.f.g gVar) {
        return ((gVar.r() - 1) - gVar.g) / (com.tsf.shell.manager.a.h.l() - 2);
    }

    public static void a(String str) {
        Context context = null;
        try {
            context = com.censivn.C3DEngine.a.d().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e2) {
        }
        if (context != null) {
            a(context);
        }
    }

    public static void a(Context context) {
        ArrayList b2 = ac.b(context);
        if (b2 != null && b2.size() > 0 && ((Integer) b2.get(0)).intValue() != 0) {
            try {
                WallpaperManager.getInstance(context).setResource(((Integer) b2.get(0)).intValue());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (com.tsf.shell.manager.a.f != null) {
                com.tsf.shell.manager.a.f.e();
            }
        }
    }

    public void a(com.tsf.shell.e.f.g gVar, boolean z, boolean z2) {
        float l;
        if (gVar.r() > 0) {
            int r = gVar.r() - 1;
            float f = z ? 0.0f : gVar.g;
            if (com.tsf.shell.manager.a.h.l() == 2) {
                l = 0.5f;
            } else {
                l = (r - f) / (com.tsf.shell.manager.a.h.l() - 2);
            }
            if (z2) {
                a(l);
            } else {
                b(l, false);
            }
        }
    }

    public boolean e() {
        if (f() == com.tsf.shell.manager.b.g.ag()) {
            return false;
        }
        Home.b().a(100);
        return true;
    }

    @SuppressLint({"ServiceCast"})
    public static boolean a(Activity activity) {
        return ((WallpaperManager) activity.getSystemService("wallpaper")).getWallpaperInfo() != null;
    }

    public boolean f() {
        return a(this.g);
    }

    @SuppressLint({"ServiceCast"})
    public static boolean a(WallpaperManager wallpaperManager) {
        if (com.censivn.C3DEngine.a.d() == null) {
            return false;
        }
        return (wallpaperManager == null ? (WallpaperManager) com.censivn.C3DEngine.a.d().getSystemService("wallpaper") : wallpaperManager).getWallpaperInfo() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BitmapDrawable c(WallpaperManager wallpaperManager) {
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        if (wallpaperInfo != null) {
            wallpaperInfo.getComponent();
            return null;
        }
        try {
            Drawable drawable = wallpaperManager.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                return (BitmapDrawable) drawable;
            }
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    public com.censivn.C3DEngine.b.f.l g() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f, boolean z) {
        if (com.tsf.shell.manager.b.g.X() == a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.l = f;
            this.m = f;
            if (com.tsf.shell.manager.b.g.ag()) {
                this.g.setWallpaperOffsets(Home.b().l().getWindowToken(), f, 0.5f);
                return;
            }
            if (this.i >= this.h) {
                PositionNumber3d position = this.f.position();
                this.j = 0;
                position.x = 0;
            } else {
                float f2 = (this.h - this.i) / 2.0f;
                PositionNumber3d position2 = this.f.position();
                int i = (int) (f2 - ((f2 * 2.0f) * f));
                this.j = i;
                position2.x = i;
            }
        }
    }

    private float b(float f) {
        if (this.i >= this.h) {
            return 0.0f;
        }
        float f2 = (this.h - this.i) / 2.0f;
        return (int) (f2 - ((f2 * 2.0f) * f));
    }

    public void a(float f) {
        a(f, false);
    }

    public void a(float f, boolean z) {
        if (com.tsf.shell.manager.b.g.X() == a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.l = f;
            if (com.tsf.shell.manager.b.g.ag()) {
                this.f.setAnimationObjectState(true);
                this.k = false;
                this.f.invalidate();
            } else {
                if (this.i >= this.h) {
                    this.f.position().x = 0.0f;
                    this.f.setAnimationObjectState(false);
                    return;
                }
                float f2 = (this.h - this.i) / 2.0f;
                this.k = false;
                this.j = (int) (f2 - ((f2 * 2.0f) * f));
                this.f.setAnimationObjectState(true);
                this.f.invalidate();
            }
        }
    }

    public void h() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.WALLPAPER_CHANGED".equals(intent.getAction())) {
            this.c = true;
        }
    }

    public boolean i() {
        return this.f.a() != null;
    }

    public void a(com.tsf.shell.e.f.g gVar) {
        if (i()) {
            float b2 = gVar.t() == -1 ? 0.0f : b(gVar);
            float f = this.f.position().x;
            boolean visible = this.f.visible();
            this.f.visible(true);
            if (com.tsf.shell.manager.b.g.X() == a) {
                this.f.position().x = gVar.t() == -1 ? this.j : b(b2);
            } else {
                this.f.position().x = 0.0f;
            }
            this.f.drawQuietly();
            this.f.position().x = f;
            this.f.visible(Boolean.valueOf(visible));
        }
    }

    public void j() {
        synchronized (this.n) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((i) it.next()).f();
            }
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        l();
        b(this.l, true);
    }
}
