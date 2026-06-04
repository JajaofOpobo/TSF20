package com.tsf.shell.setting;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ad;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.k.al;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends al {
    private static com.censivn.C3DEngine.e.b R;
    private static TextureElement S;
    public int A;
    public int B;
    public boolean C;
    private int D;
    private TextureElement E;
    private String F;
    private Bitmap G;
    private boolean H;
    private ArrayList I;
    private int J;
    private float K;
    private float P;
    private boolean Q;
    public int a;

    public final void c(float f, float f2) {
        if (R == null) {
            Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.new_mark);
            S = com.censivn.C3DEngine.a.f().a(a, false);
            a.recycle();
            com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(S.width * com.censivn.C3DEngine.a.b, S.height * com.censivn.C3DEngine.a.b, (byte) 0);
            R = bVar;
            bVar.z().c(S);
        }
        this.K = f;
        this.P = f2;
        this.Q = true;
        d(R);
    }

    public final boolean aG() {
        return aD().contains(R);
    }

    public final void aH() {
        this.Q = false;
        e(R);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (this.Q) {
            R.L().x = this.K;
            R.L().y = this.P;
        }
    }

    public e(String str, int i) {
        this.D = 0;
        this.H = false;
        this.a = R.drawable.menu_setting_button_bg_off;
        this.A = R.drawable.menu_setting_button_bg_on;
        this.B = R.drawable.menu_setting_button_bg_wait;
        this.C = true;
        this.Q = false;
        this.F = str;
        this.J = i;
        aK();
    }

    public e(String str, int i, byte b) {
        this.D = 0;
        this.H = false;
        this.a = R.drawable.menu_setting_button_bg_off;
        this.A = R.drawable.menu_setting_button_bg_on;
        this.B = R.drawable.menu_setting_button_bg_wait;
        this.C = true;
        this.Q = false;
        this.F = str;
        this.H = true;
        if (i != 0) {
            this.J = i;
            aK();
        }
    }

    public e(String str, int i, char c) {
        this.D = 0;
        this.H = false;
        this.a = R.drawable.menu_setting_button_bg_off;
        this.A = R.drawable.menu_setting_button_bg_on;
        this.B = R.drawable.menu_setting_button_bg_wait;
        this.C = true;
        this.Q = false;
        this.a = R.drawable.setting_icon_off_bg;
        this.A = R.drawable.setting_icon_on_bg;
        this.F = str;
        this.H = true;
        if (i != 0) {
            this.J = i;
            aK();
        }
    }

    public e(String str, ArrayList arrayList) {
        this.D = 0;
        this.H = false;
        this.a = R.drawable.menu_setting_button_bg_off;
        this.A = R.drawable.menu_setting_button_bg_on;
        this.B = R.drawable.menu_setting_button_bg_wait;
        this.C = true;
        this.Q = false;
        this.F = str;
        this.I = arrayList;
    }

    public final void a(int i) {
        this.J = ((Integer) this.I.get(i)).intValue();
        aK();
    }

    public void g_() {
    }

    public void aJ() {
    }

    public final void aK() {
        this.C = false;
        g_();
        if (this.H) {
            if (this.G != null) {
                this.G.recycle();
            }
            if (this.J != 0) {
                this.G = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), this.J);
                this.G = ap.a(this.G);
            }
            e(this.D);
            return;
        }
        Bitmap bitmap = null;
        if (this.J != 0) {
            bitmap = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), this.J);
        }
        Bitmap a = com.tsf.shell.workspace3D.k.b.z.a(this.F, bitmap);
        if (this.E == null) {
            this.E = com.censivn.C3DEngine.a.f().a(a, true);
            this.O.z().d();
            this.O.z().c(this.E);
        } else {
            com.censivn.C3DEngine.a.f();
            ad.b(this.E, a);
        }
    }

    public final void aL() {
        this.C = true;
        aJ();
        com.censivn.C3DEngine.a.f().a(this.E);
        this.E = null;
        this.O.z().d();
        if (this.G != null) {
            this.G.recycle();
            this.G = null;
        }
    }

    public final void e(int i) {
        Bitmap a;
        if (this.H && !this.C) {
            this.D = i;
            switch (i) {
                case 0:
                    a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), this.a);
                    break;
                case 1:
                    a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), this.A);
                    break;
                case 2:
                    a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), this.B);
                    break;
                default:
                    a = null;
                    break;
            }
            if (a != null) {
                Bitmap a2 = ap.a(a);
                Canvas canvas = new Canvas(a2);
                if (this.G != null) {
                    canvas.drawBitmap(this.G, (a2.getWidth() - this.G.getWidth()) / 2, (a2.getHeight() - this.G.getHeight()) / 2, (Paint) null);
                }
                Bitmap a3 = com.tsf.shell.workspace3D.k.b.z.a(this.F, a2);
                a2.recycle();
                if (this.E == null) {
                    this.E = com.censivn.C3DEngine.a.f().a(a3, true);
                    this.O.z().c(this.E);
                } else {
                    com.censivn.C3DEngine.a.f();
                    ad.b(this.E, a3);
                }
            }
        }
    }
}
