package com.tsf.shell.workspace3D;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.Display;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.Home;
import com.tsf.shell.bj;

/* loaded from: classes.dex */
public class ShellWallpaperManager extends BroadcastReceiver implements bj {
    private static ShellWallpaperManager g;
    private aj f;
    private WallpaperManager h;
    private int i;
    private int j;
    private int k;
    private float m;
    private float n;
    private static float d = 0.0f;
    private static int e = 0;
    public static int a = 0;
    public static int b = 1;
    private boolean l = true;
    boolean c = false;

    public static ShellWallpaperManager a() {
        if (g == null) {
            g = new ShellWallpaperManager();
        }
        return g;
    }

    public static int c() {
        return e;
    }

    public final WallpaperManager d() {
        return this.h;
    }

    public static void a(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 5) {
            i = 5;
        }
        e = i;
        d = 0.05f + ((i / 5.0f) * 0.25f);
    }

    public final void e() {
        this.h = (WallpaperManager) Home.d().getSystemService("wallpaper");
        this.j = com.censivn.C3DEngine.a.l;
        this.f = new aj(this);
        com.tsf.shell.bd.a(this);
    }

    public final void f() {
        c(com.tsf.shell.a.t.C());
    }

    public final void c(int i) {
        if (i == a) {
            com.tsf.shell.workspace3D.h.a k = bf.j().k();
            if (k != null && k.p() > 0) {
                a(((k.p() - 1) - k.D) / (bf.j().i() - 2), true);
                return;
            } else {
                a(0.0f, true);
                return;
            }
        }
        a(0.5f, true);
    }

    public final void a(com.tsf.shell.workspace3D.h.a aVar, boolean z) {
        if (aVar.p() > 0) {
            float p = ((aVar.p() - 1) - aVar.D) / (bf.j().i() - 2);
            if (z) {
                b(p);
                return;
            } else {
                a(p, false);
                return;
            }
        }
        if (z) {
            b(0.0f);
        } else {
            a(0.0f, false);
        }
    }

    public final void g() {
        Display defaultDisplay = Home.d().getWindowManager().getDefaultDisplay();
        boolean z = defaultDisplay.getWidth() < defaultDisplay.getHeight();
        int width = z ? defaultDisplay.getWidth() : defaultDisplay.getHeight();
        int height = z ? defaultDisplay.getHeight() : defaultDisplay.getWidth();
        if (this.h == null) {
            this.h = (WallpaperManager) Home.d().getSystemService("wallpaper");
        }
        new ai(this, "setWallpaperDimension", width, height).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z;
        WallpaperManager wallpaperManager = this.h;
        if (com.censivn.C3DEngine.a.c() != null) {
            if (wallpaperManager == null) {
                wallpaperManager = (WallpaperManager) com.censivn.C3DEngine.a.c().getSystemService("wallpaper");
            }
            if (wallpaperManager.getWallpaperInfo() != null) {
                z = true;
                if (z != com.tsf.shell.a.t.G()) {
                    return false;
                }
                Home.d().c();
                return true;
            }
        }
        z = false;
        if (z != com.tsf.shell.a.t.G()) {
        }
    }

    public final void i() {
        if (com.tsf.shell.a.t.G()) {
            return;
        }
        try {
            this.f.a(0);
            this.f.a((Boolean) true);
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f.a((Boolean) false);
        }
    }

    public static boolean a(Activity activity) {
        return ((WallpaperManager) activity.getSystemService("wallpaper")).getWallpaperInfo() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BitmapDrawable b(WallpaperManager wallpaperManager) {
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

    public final com.censivn.C3DEngine.b.v j() {
        return this.f;
    }

    public final void a(float f) {
        a(f, false);
    }

    private void a(float f, boolean z) {
        if (com.tsf.shell.a.t.C() == a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.m = f;
            this.n = f;
            if (com.tsf.shell.a.t.G()) {
                this.h.setWallpaperOffsets(Home.d().f().getWindowToken(), f, 0.5f);
                return;
            }
            if (this.j >= this.i) {
                PositionNumber3d L = this.f.L();
                this.k = 0;
                L.x = 0.0f;
            } else {
                float f2 = (this.i - this.j) / 2.0f;
                PositionNumber3d L2 = this.f.L();
                int i = (int) (f2 - ((f2 * 2.0f) * f));
                this.k = i;
                L2.x = i;
            }
        }
    }

    public final void b(float f) {
        if (com.tsf.shell.a.t.C() == a) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.m = f;
            if (com.tsf.shell.a.t.G()) {
                this.f.a_(true);
                this.l = false;
                aj ajVar = this.f;
                aj.u();
                return;
            }
            if (this.j >= this.i) {
                this.f.L().x = 0.0f;
                this.f.a_(false);
                return;
            }
            float f2 = (this.i - this.j) / 2.0f;
            this.l = false;
            this.k = (int) (f2 - ((f2 * 2.0f) * f));
            this.f.a_(true);
            aj ajVar2 = this.f;
            aj.u();
        }
    }

    public static void k() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.WALLPAPER_CHANGED".equals(intent.getAction())) {
            this.c = true;
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        this.j = com.censivn.C3DEngine.a.l;
        a(this.m, true);
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }
}
