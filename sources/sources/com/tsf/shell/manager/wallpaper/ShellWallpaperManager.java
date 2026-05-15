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
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.g;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.utils.q;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellWallpaperManager extends BroadcastReceiver {
    private WallpaperManager g;
    private int h;
    private int i;
    private int j;
    private float l;
    private float m;
    private e o;
    private static float d = 0.0f;
    private static int e = 0;
    public static int a = 0;
    public static int b = 1;
    private boolean k = true;
    private Object n = new Object();
    public boolean c = true;
    private ArrayList<a> p = new ArrayList<>();
    private b f = new b();

    public interface a {
        void f();
    }

    @SuppressLint({"ServiceCast"})
    public ShellWallpaperManager(Context context) {
        this.g = (WallpaperManager) context.getSystemService("wallpaper");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.WALLPAPER_CHANGED");
        com.censivn.C3DEngine.a.d().registerReceiver(this, intentFilter);
        d(3);
    }

    public e a() {
        return this.o;
    }

    public void a(a aVar) {
        synchronized (this.n) {
            if (!this.p.contains(aVar)) {
                this.p.add(aVar);
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.n) {
            this.p.remove(aVar);
        }
    }

    public void b() {
        this.o = new e();
        m();
        if (com.tsf.shell.manager.b.e.ai()) {
        }
    }

    public WallpaperManager c() {
        return this.g;
    }

    private static void d(int i) {
        if (i < 2) {
            i = 2;
        } else if (i > 5) {
            i = 5;
        }
        e = i;
        d = 0.05f + ((i / 5.0f) * 0.15f);
    }

    private void m() {
        this.i = com.censivn.C3DEngine.b.b.a.F;
    }

    public void d() {
        a(com.tsf.shell.manager.b.e.Y());
    }

    public void a(int i) {
        if (i == a) {
            g gVarN = com.tsf.shell.manager.a.h.n();
            if (gVarN != null && gVarN.r() > 0) {
                a(c(gVarN), true);
                return;
            } else {
                a(0.0f, true);
                return;
            }
        }
        a(0.5f, true);
    }

    private float b(g gVar) {
        return (gVar.r() - 1) / (com.tsf.shell.manager.a.h.l() - 2);
    }

    private float c(g gVar) {
        return ((gVar.r() - 1) - gVar.g) / (com.tsf.shell.manager.a.h.l() - 2);
    }

    public static void a(String str) {
        Context contextCreatePackageContext = null;
        try {
            contextCreatePackageContext = com.censivn.C3DEngine.a.d().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e2) {
        }
        if (contextCreatePackageContext != null) {
            a(contextCreatePackageContext);
        }
    }

    public static void a(Context context) {
        ArrayList<Integer> arrayListB = k.b(context);
        if (arrayListB != null && arrayListB.size() > 0 && arrayListB.get(0).intValue() != 0) {
            try {
                WallpaperManager.getInstance(context).setResource(arrayListB.get(0).intValue());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (com.tsf.shell.manager.a.f != null) {
                com.tsf.shell.manager.a.f.e();
            }
        }
    }

    public void a(g gVar, boolean z, boolean z2) {
        float fL;
        if (gVar.r() > 0) {
            int iR = gVar.r() - 1;
            float f = z ? 0.0f : gVar.g;
            if (com.tsf.shell.manager.a.h.l() == 2) {
                fL = 0.5f;
            } else {
                fL = (iR - f) / (com.tsf.shell.manager.a.h.l() - 2);
            }
            if (z2) {
                a(fL);
            } else {
                b(fL, false);
            }
        }
    }

    public boolean e() {
        if (f() == com.tsf.shell.manager.b.e.ai()) {
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

    public j g() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f, boolean z) {
        if (com.tsf.shell.manager.b.e.Y() == a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.l = f;
            this.m = f;
            if (com.tsf.shell.manager.b.e.ai()) {
                this.g.setWallpaperOffsets(Home.b().l().getWindowToken(), f, 0.5f);
                return;
            }
            if (this.i >= this.h) {
                PositionNumber3d positionNumber3dPosition = this.f.position();
                this.j = 0;
                positionNumber3dPosition.x = 0;
            } else {
                float f2 = (this.h - this.i) / 2.0f;
                PositionNumber3d positionNumber3dPosition2 = this.f.position();
                int i = (int) (f2 - ((f2 * 2.0f) * f));
                this.j = i;
                positionNumber3dPosition2.x = i;
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
        if (com.tsf.shell.manager.b.e.Y() == a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.l = f;
            if (com.tsf.shell.manager.b.e.ai()) {
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

    public void a(g gVar) {
        if (i()) {
            float fB = gVar.t() == -1 ? 0.0f : b(gVar);
            float f = this.f.position().x;
            boolean zVisible = this.f.visible();
            this.f.visible(true);
            if (com.tsf.shell.manager.b.e.Y() == a) {
                this.f.position().x = gVar.t() == -1 ? this.j : b(fB);
            } else {
                this.f.position().x = 0.0f;
            }
            this.f.drawQuietly();
            this.f.position().x = f;
            this.f.visible(Boolean.valueOf(zVisible));
        }
    }

    public void b(int i) {
        this.f.b(i);
    }

    public int j() {
        return com.tsf.shell.manager.b.e.Z();
    }

    public void c(int i) {
        this.f.c(i);
    }

    public void k() {
        synchronized (this.n) {
            Iterator<a> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        m();
        b(this.l, true);
    }

    class b extends com.censivn.C3DEngine.b.f.k {
        private TextureElement d;
        private Bitmap e;
        private float f;
        private Color4 g;
        private com.tsf.shell.f.e.b.b h;
        private int i;
        private int j;

        public TextureElement a() {
            return this.d;
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void alpha(float f) {
            this.f = 255.0f - f;
            this.g.set(255, (int) this.f, (int) this.f, (int) this.f);
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public float alpha() {
            return 255.0f - this.f;
        }

        public b() {
            super(0.0f, 0.0f, 1, 1);
            this.f = 255.0f;
            this.g = new Color4();
            this.i = 100;
            this.j = 100;
            setDefaultColor(this.g);
            this.h = new com.tsf.shell.f.e.b.b();
            d();
        }

        public int a(int i) {
            return (int) ((i / 2) * com.censivn.C3DEngine.b.b.a.c);
        }

        public void d() {
            int iA = a(com.tsf.shell.manager.b.e.Z());
            this.j = iA;
            this.i = iA;
        }

        public void b(int i) {
            this.j = a(i);
        }

        public void c(int i) {
            this.j = a(i);
            com.tsf.shell.manager.b.e.k(i);
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (ShellWallpaperManager.this.c) {
                e();
                ShellWallpaperManager.this.c = false;
            }
            if (this.e != null) {
                g();
            }
            if (this.j != this.i) {
                this.i = this.j;
                f();
            }
            if (com.tsf.shell.manager.b.e.ai()) {
                if (!ShellWallpaperManager.this.k) {
                    ShellWallpaperManager.this.m += (ShellWallpaperManager.this.l - ShellWallpaperManager.this.m) * ShellWallpaperManager.d;
                    if (Math.abs(ShellWallpaperManager.this.l - ShellWallpaperManager.this.m) <= 0.002f) {
                        ShellWallpaperManager.this.m = ShellWallpaperManager.this.l;
                        ShellWallpaperManager.this.k = true;
                        ShellWallpaperManager.this.f.setAnimationObjectState(false);
                    }
                    ShellWallpaperManager.this.g.setWallpaperOffsets(Home.b().l().getWindowToken(), ShellWallpaperManager.this.m, 0.5f);
                    return;
                }
                return;
            }
            if (ShellWallpaperManager.this.i < ShellWallpaperManager.this.h && !ShellWallpaperManager.this.k) {
                ShellWallpaperManager.this.f.position().x += (ShellWallpaperManager.this.j - ShellWallpaperManager.this.f.position().x) * ShellWallpaperManager.d;
                if (Math.abs(ShellWallpaperManager.this.f.position().x - ShellWallpaperManager.this.j) <= 0.2f) {
                    ShellWallpaperManager.this.f.position().x = ShellWallpaperManager.this.j;
                    ShellWallpaperManager.this.k = true;
                    ShellWallpaperManager.this.f.setAnimationObjectState(false);
                }
            }
        }

        private void e() {
            synchronized (ShellWallpaperManager.this.n) {
                System.currentTimeMillis();
                if (this.e != null) {
                    this.e.recycle();
                }
                BitmapDrawable bitmapDrawableC = ShellWallpaperManager.c(ShellWallpaperManager.this.g);
                System.currentTimeMillis();
                if (bitmapDrawableC != null) {
                    Bitmap bitmap = bitmapDrawableC.getBitmap();
                    System.currentTimeMillis();
                    if (!bitmap.isRecycled()) {
                        this.e = q.b(bitmap, com.censivn.C3DEngine.b.b.a.L, com.censivn.C3DEngine.b.b.a.M);
                        this.e = q.a(this.e);
                        System.currentTimeMillis();
                        if (com.censivn.C3DEngine.a.e() != null) {
                            com.censivn.C3DEngine.a.e().j();
                        }
                    }
                }
            }
        }

        private void f() {
            if (this.d.id != 0) {
                if (this.i == 0) {
                    this.h.a();
                    textures().removeAll();
                    textures().addElement(this.d);
                } else {
                    this.h.a(this.d, this.i);
                    textures().removeAll();
                    textures().addElement(this.h.a);
                }
            }
        }

        private void g() {
            synchronized (ShellWallpaperManager.this.n) {
                System.currentTimeMillis();
                int width = this.e.getWidth();
                int height = this.e.getHeight();
                if (this.e != null && !this.e.isRecycled()) {
                    if (this.d == null) {
                        this.d = com.censivn.C3DEngine.a.g().a(this.e, false);
                    } else {
                        com.censivn.C3DEngine.a.g().a(this.d);
                        this.d = com.censivn.C3DEngine.a.g().a(this.e, false);
                    }
                    System.currentTimeMillis();
                    a(width);
                    b(height);
                    ShellWallpaperManager.this.h = width;
                    this.e.recycle();
                    f();
                    ShellWallpaperManager.this.b(ShellWallpaperManager.this.l, false);
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.wallpaper.ShellWallpaperManager.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ShellWallpaperManager.this.k();
                        }
                    });
                }
                this.e = null;
            }
        }
    }
}
