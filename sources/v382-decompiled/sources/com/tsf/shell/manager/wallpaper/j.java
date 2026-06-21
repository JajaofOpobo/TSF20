package com.tsf.shell.manager.wallpaper;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.IBinder;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.Home;
import com.tsf.shell.utils.r;

/* loaded from: classes.dex */
class j extends m {
    final /* synthetic */ ShellWallpaperManager a;
    private TextureElement d;
    private Bitmap e;
    private float f;
    private Color4 g;

    public TextureElement a() {
        return this.d;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void alpha(float f) {
        this.f = 255.0f - f;
        this.g.set(255, (int) this.f, (int) this.f, (int) this.f);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public float alpha() {
        return 255.0f - this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ShellWallpaperManager shellWallpaperManager) {
        super(0.0f, 0.0f, 1, 1);
        this.a = shellWallpaperManager;
        this.f = 255.0f;
        this.g = new Color4();
        setDefaultColor(this.g);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        int i;
        int i2;
        boolean z;
        j jVar;
        int i3;
        j jVar2;
        float f;
        j jVar3;
        int i4;
        j jVar4;
        int i5;
        j jVar5;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        WallpaperManager wallpaperManager;
        float f8;
        float f9;
        j jVar6;
        if (this.a.c) {
            d();
            this.a.c = false;
        }
        if (this.e != null) {
            e();
        }
        if (!com.tsf.shell.manager.b.g.ag()) {
            i = this.a.i;
            i2 = this.a.h;
            if (i < i2) {
                z = this.a.k;
                if (!z) {
                    jVar = this.a.f;
                    PositionNumber3d position = jVar.position();
                    float f10 = position.x;
                    i3 = this.a.j;
                    jVar2 = this.a.f;
                    float f11 = i3 - jVar2.position().x;
                    f = ShellWallpaperManager.d;
                    position.x = f10 + (f11 * f);
                    jVar3 = this.a.f;
                    float f12 = jVar3.position().x;
                    i4 = this.a.j;
                    if (Math.abs(f12 - i4) <= 0.2f) {
                        jVar4 = this.a.f;
                        PositionNumber3d position2 = jVar4.position();
                        i5 = this.a.j;
                        position2.x = i5;
                        this.a.k = true;
                        jVar5 = this.a.f;
                        jVar5.setAnimationObjectState(false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = this.a.k;
        if (!z2) {
            ShellWallpaperManager shellWallpaperManager = this.a;
            f2 = shellWallpaperManager.m;
            f3 = this.a.l;
            f4 = this.a.m;
            float f13 = f3 - f4;
            f5 = ShellWallpaperManager.d;
            shellWallpaperManager.m = f2 + (f13 * f5);
            f6 = this.a.l;
            f7 = this.a.m;
            if (Math.abs(f6 - f7) <= 0.002f) {
                ShellWallpaperManager shellWallpaperManager2 = this.a;
                f9 = this.a.l;
                shellWallpaperManager2.m = f9;
                this.a.k = true;
                jVar6 = this.a.f;
                jVar6.setAnimationObjectState(false);
            }
            wallpaperManager = this.a.g;
            IBinder windowToken = Home.b().l().getWindowToken();
            f8 = this.a.m;
            wallpaperManager.setWallpaperOffsets(windowToken, f8, 0.5f);
        }
    }

    private void d() {
        Object obj;
        WallpaperManager wallpaperManager;
        BitmapDrawable c;
        obj = this.a.n;
        synchronized (obj) {
            System.currentTimeMillis();
            if (this.e != null) {
                this.e.recycle();
            }
            wallpaperManager = this.a.g;
            c = ShellWallpaperManager.c(wallpaperManager);
            System.currentTimeMillis();
            if (c != null) {
                Bitmap bitmap = c.getBitmap();
                System.currentTimeMillis();
                if (!bitmap.isRecycled()) {
                    this.e = r.b(bitmap, com.censivn.C3DEngine.b.b.a.L, com.censivn.C3DEngine.b.b.a.M);
                    this.e = r.a(this.e);
                    System.currentTimeMillis();
                    if (com.censivn.C3DEngine.a.e() != null) {
                        com.censivn.C3DEngine.a.e().j();
                    }
                }
            }
        }
    }

    private void e() {
        Object obj;
        float f;
        obj = this.a.n;
        synchronized (obj) {
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
                this.a.h = width;
                this.e.recycle();
                textures().removeAll();
                textures().addElement(this.d);
                ShellWallpaperManager shellWallpaperManager = this.a;
                f = this.a.l;
                shellWallpaperManager.b(f, false);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.wallpaper.j.1
                    @Override // java.lang.Runnable
                    public void run() {
                        j.this.a.j();
                    }
                });
            }
            this.e = null;
        }
    }
}
