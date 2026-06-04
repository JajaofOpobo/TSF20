package com.tsf.shell.workspace3D.j.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ac;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
public final class a extends com.censivn.C3DEngine.b.v {
    private static TextureElement F;
    private static Paint a;
    private int A;
    private TextureElement B;
    private boolean E = true;
    private com.censivn.C3DEngine.e.b C = new com.censivn.C3DEngine.e.b(330.0f * com.censivn.C3DEngine.a.b, 90.0f * com.censivn.C3DEngine.a.b, (byte) 0);
    private com.censivn.C3DEngine.e.b D = new com.censivn.C3DEngine.e.b(280.0f * com.censivn.C3DEngine.a.b, 4.0f * com.censivn.C3DEngine.a.b, (byte) 0);

    public a(int i) {
        this.A = i;
        this.D.L().y = (-45.0f) - (16.0f * com.censivn.C3DEngine.a.b);
        d(this.D);
        d(this.C);
        ar();
        ThemeManager.mix.registerSettingButton(this, i);
    }

    public final boolean i() {
        return this.E;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void b(float f) {
        if (A()) {
            super.b(f);
        }
    }

    public final void j() {
        if (this.E) {
            b bVar = new b(this);
            bVar.a(0);
            com.censivn.C3DEngine.g.s.a(this);
            com.censivn.C3DEngine.g.s.a(this, 250, bVar);
            this.E = false;
        }
    }

    public final void a(int i) {
        if (!this.E) {
            c cVar = new c(this);
            cVar.a(255);
            cVar.b(i * 100);
            com.censivn.C3DEngine.g.s.a(this);
            com.censivn.C3DEngine.g.s.a(this, 250, cVar);
            this.E = true;
            a((Boolean) true);
        }
    }

    public final void k() {
        this.D.Q();
        d(this.D);
    }

    public final void l() {
        this.D.Q();
    }

    public final void m() {
        if (this.B == null) {
            ThemeManager.mix.updateSettingButtonInfo(this.A);
        }
    }

    public final void a(Bitmap bitmap, String str, String str2) {
        Bitmap createBitmap;
        if (this.B != null) {
            this.C.z().d();
            com.censivn.C3DEngine.a.f().a(this.B);
            this.B = null;
        }
        if (bitmap == null) {
            createBitmap = null;
        } else if (bitmap.getWidth() / bitmap.getHeight() == 1) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 82, 82, true);
            createBitmap = createScaledBitmap.copy(Bitmap.Config.ARGB_8888, false);
            createScaledBitmap.recycle();
        } else if (bitmap.getWidth() == 82 && bitmap.getHeight() == 82) {
            createBitmap = bitmap;
        } else {
            createBitmap = Bitmap.createBitmap(82, 82, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float min = Math.min(82.0f / width, 82.0f / height);
            canvas.translate((82.0f - (width * min)) / 2.0f, (82.0f - (height * min)) / 2.0f);
            canvas.scale(min, min);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap.recycle();
        }
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(330, 90, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawBitmap(createBitmap, 3.0f, 4.0f, (Paint) null);
        createBitmap.recycle();
        Bitmap a2 = a(str, 42, -6710887);
        canvas2.drawBitmap(a2, 97.0f, 13.0f, (Paint) null);
        a2.recycle();
        Bitmap a3 = a(str2, 22, -11184811);
        canvas2.drawBitmap(a3, 97.0f, 52.0f, (Paint) null);
        a3.recycle();
        this.B = com.censivn.C3DEngine.a.f().a(createBitmap2, false);
        createBitmap2.recycle();
        this.C.z().d();
        this.C.z().c(this.B);
        this.D.z().d();
        ac z = this.D.z();
        if (F == null) {
            F = com.censivn.C3DEngine.h.a.a(R.drawable.themes_mix_item_line);
        }
        z.c(F);
    }

    public final void n() {
        if (this.B != null) {
            this.C.z().d();
            com.censivn.C3DEngine.a.f().a(this.B);
            this.B = null;
        }
        this.D.z().d();
        if (F != null) {
            com.censivn.C3DEngine.a.f().a(F);
            F = null;
        }
    }

    private static Bitmap a(String str, int i, int i2) {
        if (a == null) {
            Paint paint = new Paint();
            a = paint;
            paint.setAntiAlias(true);
            a.setTextAlign(Paint.Align.LEFT);
        }
        a.setTextSize(i);
        a.setColor(i2);
        return com.tsf.shell.setting.a.v.a(str, 238, 40, a, false, true, 0);
    }
}
