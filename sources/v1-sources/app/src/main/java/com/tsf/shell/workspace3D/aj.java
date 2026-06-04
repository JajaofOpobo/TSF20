package com.tsf.shell.workspace3D;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.Home;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class aj extends com.censivn.C3DEngine.e.b {
    private TextureElement C;
    final /* synthetic */ ShellWallpaperManager a;

    @Override // com.censivn.C3DEngine.b.r
    public final void b(float f) {
        super.b(255.0f - f);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final float I() {
        return 255.0f - super.I();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ShellWallpaperManager shellWallpaperManager) {
        super(0.0f, 0.0f, 1, 1);
        this.a = shellWallpaperManager;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        float f = 1.0f;
        if (this.a.c) {
            this.a.c = false;
            a(0);
        }
        if (!com.tsf.shell.a.t.G()) {
            if (this.a.j < this.a.i && !this.a.l) {
                float f2 = (this.a.k - this.a.f.L().x) * ShellWallpaperManager.d;
                if (Math.abs(f2) >= 1.0f) {
                    f = f2;
                } else if (f2 <= 0.0f) {
                    f = -1.0f;
                }
                PositionNumber3d L = this.a.f.L();
                L.x = ((int) f) + L.x;
                if (Math.abs(this.a.f.L().x - this.a.k) <= 0.05f) {
                    this.a.f.L().x = this.a.k;
                    this.a.l = true;
                    this.a.f.a_(false);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.a.l) {
            this.a.n += (this.a.m - this.a.n) * ShellWallpaperManager.d;
            if (Math.abs(this.a.m - this.a.n) <= 0.002f) {
                this.a.n = this.a.m;
                this.a.l = true;
                this.a.f.a_(false);
            }
            this.a.h.setWallpaperOffsets(Home.d().f().getWindowToken(), this.a.n, 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        ak akVar = new ak(this);
        if (i == 0) {
            com.censivn.C3DEngine.a.a().c(akVar);
        } else {
            com.censivn.C3DEngine.a.a().b(akVar, i);
        }
    }

    static /* synthetic */ void a(aj ajVar) {
        BitmapDrawable b = ShellWallpaperManager.b(ajVar.a.h);
        if (b != null) {
            Bitmap bitmap = b.getBitmap();
            if (bitmap.isRecycled()) {
                return;
            }
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            bitmap.recycle();
            if (copy == null || copy.isRecycled()) {
                ajVar.a(ThemeShellDescription.PICKER_MENU);
                return;
            }
            if (ajVar.C == null) {
                ajVar.C = com.censivn.C3DEngine.a.f().a(copy, false);
            } else {
                com.censivn.C3DEngine.a.f().a(ajVar.C);
                ajVar.C = com.censivn.C3DEngine.a.f().a(copy, false);
            }
            int width = copy.getWidth();
            int height = copy.getHeight();
            ajVar.a_(width);
            ajVar.h(height);
            ajVar.a.i = width;
            copy.recycle();
            ajVar.z().b();
            ajVar.z().c(ajVar.C);
            ajVar.a.a(ajVar.a.m);
        }
    }
}
