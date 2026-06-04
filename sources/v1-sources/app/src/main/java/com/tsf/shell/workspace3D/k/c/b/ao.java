package com.tsf.shell.workspace3D.k.c.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ao implements bj {
    public static an W;
    public static an X;
    public com.censivn.C3DEngine.b.v K;
    public com.censivn.C3DEngine.e.b.a L;
    public com.censivn.C3DEngine.e.b M;
    public com.censivn.C3DEngine.e.b N;
    public com.censivn.C3DEngine.e.b O;
    public am P;
    public com.censivn.C3DEngine.e.c Q;
    public int R;
    public ArrayList S;
    public com.censivn.C3DEngine.b.l T;
    public com.censivn.C3DEngine.b.l U;
    public com.censivn.C3DEngine.b.l V;
    private com.censivn.C3DEngine.g.u Y;
    private com.censivn.C3DEngine.g.u Z;
    public int a;
    private Paint ab;
    private Paint ac;
    private Paint ad;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y = 0.0f;
    public float z = 0.0f;
    public float A = 0.0f;
    public float B = 0.0f;
    public boolean C = false;
    public TextureElement E = null;
    public TextureElement F = null;
    public TextureElement G = null;
    public TextureElement H = null;
    public TextureElement I = null;
    public TextureElement J = null;
    private boolean aa = false;
    public SystemFolderTheme D = ThemeManager.mix.folder.getTheme();

    public ao() {
        bd.a(this);
        f();
        h();
        g();
        float f = com.censivn.C3DEngine.a.b;
        an anVar = new an(true, this.D);
        W = anVar;
        anVar.a((Boolean) false);
        W.b(0.0f);
        float f2 = com.censivn.C3DEngine.a.b;
        an anVar2 = new an(false, this.D);
        X = anVar2;
        anVar2.a((Boolean) false);
        X.b(0.0f);
        i();
        this.V = new ar(this, this.O);
        this.T = new as(this, this.M);
        this.U = new at(this, this.N);
        this.N.a(this.U);
        this.M.a(this.T);
        this.O.a(this.V);
        this.ab = new Paint();
        this.ab.setColor(-13421773);
        this.ab.setStrokeWidth(0.5f);
        this.ab.setStrokeCap(Paint.Cap.ROUND);
        this.ab.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ab.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        this.ab.setAntiAlias(true);
        this.ab.setTextAlign(Paint.Align.LEFT);
        this.ac = new Paint();
        this.ac.setColor(-13421773);
        this.ac.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        this.ac.setAntiAlias(true);
        this.ac.setTextAlign(Paint.Align.LEFT);
        this.ad = new Paint();
        this.ad.setColor(-13421773);
        this.ad.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        this.ad.setAntiAlias(true);
        this.ad.setTextAlign(Paint.Align.LEFT);
        this.Y = new ap(this);
        this.Y.a(0);
        this.Z = new com.censivn.C3DEngine.g.u();
        this.Z.a(210);
    }

    public final void a() {
        this.D = ThemeManager.mix.folder.getTheme();
        f();
        h();
        g();
        i();
    }

    public final void a(int i) {
        float f = (this.c / i) * (this.r - this.s);
        if (f > this.q) {
            f = this.q;
        }
        this.n = (int) f;
        this.o = this.n / 2;
        this.P.i(this.o);
        this.P.j(this.o);
        this.t = (this.r - this.s) - this.n;
    }

    public final void c() {
        if (!this.aa) {
            this.aa = true;
            com.censivn.C3DEngine.g.s.a(this.P);
            com.censivn.C3DEngine.g.s.a(this.P, 400, this.Z);
            this.P.a((Boolean) true);
        }
    }

    public final void d() {
        if (this.aa) {
            this.aa = false;
            com.censivn.C3DEngine.g.s.a(this.P);
            com.censivn.C3DEngine.g.s.a(this.P, 400, this.Y);
        }
    }

    private void f() {
        this.R = this.D.sampleCount;
        this.S = this.D.sampleList;
    }

    private void g() {
        Bitmap addButtonBitmap = this.D.getAddButtonBitmap();
        this.J = com.censivn.C3DEngine.a.f().a(this.J, addButtonBitmap);
        addButtonBitmap.recycle();
        if (this.D.backPlaneEnable) {
            Bitmap backPlaneBitmap = this.D.getBackPlaneBitmap();
            this.H = com.censivn.C3DEngine.a.f().a(this.H, backPlaneBitmap);
            backPlaneBitmap.recycle();
        } else if (this.H != null) {
            com.censivn.C3DEngine.a.f().a(this.H);
            this.H = null;
        }
        if (this.D.frontPlaneEnable) {
            Bitmap frontPlaneBitmap = this.D.getFrontPlaneBitmap();
            this.I = com.censivn.C3DEngine.a.f().a(this.I, frontPlaneBitmap);
            frontPlaneBitmap.recycle();
        } else if (this.I != null) {
            com.censivn.C3DEngine.a.f().a(this.I);
            this.I = null;
        }
        Bitmap frameBitmap = this.D.getFrameBitmap();
        this.E = com.censivn.C3DEngine.a.f().a(this.E, frameBitmap);
        frameBitmap.recycle();
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_RETURN);
        this.F = com.censivn.C3DEngine.a.f().a(this.F, bitmap);
        bitmap.recycle();
        if (this.K == null) {
            this.K = new com.censivn.C3DEngine.b.v();
            this.n = (int) (80.0f * com.censivn.C3DEngine.a.b);
            this.o = this.n / 2;
            this.p = (int) (12.0f * com.censivn.C3DEngine.a.b);
            this.P = new am(12.0f * com.censivn.C3DEngine.a.b, this.n);
            this.P.a(255, 20, 20, 20);
            this.P.b(0.0f);
            this.P.a((Boolean) false);
            this.O = new com.censivn.C3DEngine.e.b(128.0f, 64.0f);
            this.O.z().c(this.J);
            this.O.ar();
            this.L = new com.censivn.C3DEngine.e.b.a(10.0f, 10.0f, com.censivn.C3DEngine.a.a, new com.censivn.C3DEngine.e.b.b(42.0f, 86.0f, 80.0f, 96.0f, 128.0f, 128.0f));
            this.L.z().c(this.E);
            this.N = new com.censivn.C3DEngine.e.b(256.0f, 64.0f, 1, 1);
            this.N.ar();
            this.L.d(this.N);
            this.K.d(this.O);
            this.K.d(this.L);
            this.K.d(this.P);
            this.M = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 1, 1);
            this.M.z().c(this.F);
            this.M.a(-50.0f, -50.0f, 0.0f, 50.0f, 50.0f);
            this.L.d(this.M);
            this.Q = new com.censivn.C3DEngine.e.c();
            this.Q.a((com.censivn.C3DEngine.b.l) new aq(this, this.Q));
            this.L.a(this.Q, 0);
        }
    }

    private void h() {
        this.C = this.D.followRotation;
        this.y = this.D.dockBottomOffset;
        this.z = this.D.dockTopOffset;
        this.A = this.D.dockLefOffset;
        this.B = this.D.dockRightOffset;
    }

    private void i() {
        int i = (int) (120.0f * com.censivn.C3DEngine.a.b);
        int i2 = (int) (136.0f * com.censivn.C3DEngine.a.b);
        int i3 = com.censivn.C3DEngine.a.j - ((int) ((96.0f * com.censivn.C3DEngine.a.b) * 2.0f));
        if (i3 > i * 10) {
            i3 = i * 10;
        }
        int i4 = com.censivn.C3DEngine.a.k - ((int) ((153.6f * com.censivn.C3DEngine.a.b) * 2.0f));
        if (i4 > i2 * 7) {
            i4 = i2 * 7;
        }
        int i5 = i3 - ((int) (42.0f * com.censivn.C3DEngine.a.b));
        int i6 = i4 - ((int) (153.6d * com.censivn.C3DEngine.a.b));
        int[] iArr = new int[4];
        int i7 = 2;
        while ((i5 + 0) / (i7 - 1) > i) {
            i7++;
        }
        int i8 = i7 - 1;
        if (i8 < 2) {
            i8 = 2;
        }
        int i9 = i6 + 0;
        int i10 = 2;
        while (i9 / (i10 - 1) > i2) {
            i10++;
        }
        int i11 = i10 - 1;
        if (i11 < 2) {
            i11 = 2;
        }
        iArr[0] = i8;
        iArr[1] = i11;
        iArr[2] = (i5 + 0) / (i8 - 1);
        iArr[3] = i9 / (i11 - 1);
        this.a = iArr[0];
        this.b = iArr[1];
        this.c = this.a * this.b;
        this.i = iArr[2];
        this.j = iArr[3];
        this.e = i3;
        this.d = i4;
        this.f = (this.e / 2) + 30;
        this.g = (this.d / 2) + 30;
        int i12 = bd.a() ? com.censivn.C3DEngine.a.p : 0;
        this.m = com.censivn.C3DEngine.a.o - ((int) (78.0f * com.censivn.C3DEngine.a.b));
        this.h = (int) ((57.6f * com.censivn.C3DEngine.a.b) - (i12 / 2));
        this.l = ((com.censivn.C3DEngine.a.j - ((this.a - 1) * this.i)) / 2) - (com.censivn.C3DEngine.a.j / 2);
        this.k = ((((this.d / 2) + this.m) - this.h) - this.D.childContainerY) - i12;
        int i13 = (int) (this.e + (140.0f * com.censivn.C3DEngine.a.b));
        int i14 = (int) (this.d + (140.0f * com.censivn.C3DEngine.a.b));
        this.O.L().x = ((-this.e) / 2) + (40.0f * com.censivn.C3DEngine.a.b);
        this.O.L().y = ((((-i14) / 2) + (3.0f * com.censivn.C3DEngine.a.b)) - (this.O.o_() / 2.0f)) + this.D.addButtonOffsetY;
        this.N.L().x = (((-this.e) / 2) + (this.N.n_() / 2.0f)) - (30.0f * com.censivn.C3DEngine.a.b);
        this.N.L().y = (i14 / 2) - (54.0f * com.censivn.C3DEngine.a.b);
        this.M.L().x = (this.e / 2) + (45.6f * com.censivn.C3DEngine.a.b);
        this.M.L().y = (i14 / 2) - (com.censivn.C3DEngine.a.b * 23.0f);
        this.L.a_(i13);
        this.L.h(i14);
        this.L.ar();
        this.Q.b((-i13) / 2, (-i14) / 2, 0.0f, i13 / 2, i14 / 2);
        this.N.e(i13 / 2);
        this.w = this.k - (this.j * (this.b - 1));
        this.u = this.k + com.tsf.shell.workspace3D.k.b.ap.Q + (com.censivn.C3DEngine.a.b * 23.0f);
        this.v = this.k - ((this.b - 1) * this.j);
        this.x = this.D.childContainerY;
        W.L().y = (this.u - (5.0f * com.censivn.C3DEngine.a.b)) + this.D.childContainerY;
        W.a_(this.e);
        W.h(com.censivn.C3DEngine.a.b * 13.0f);
        X.L().y = (this.v - (86.0f * com.censivn.C3DEngine.a.b)) + this.D.childContainerY;
        X.a_(this.e);
        X.h(com.censivn.C3DEngine.a.b * 13.0f);
        this.r = (int) ((this.d / 2) - (35.0f * com.censivn.C3DEngine.a.b));
        this.s = (int) (((-this.d) / 2) - (30.0f * com.censivn.C3DEngine.a.b));
        this.q = this.r - this.s;
        this.P.L().x = (this.e / 2) + (68.0f * com.censivn.C3DEngine.a.b);
    }

    protected final void a(String str) {
        e();
        this.ab.setTextSize(26.0f);
        Bitmap a = com.tsf.shell.setting.a.v.a(str, 256, 64, this.ab, false, true, 0);
        this.G = com.censivn.C3DEngine.a.f().a(a, true);
        a.recycle();
        this.N.z().c(this.G);
    }

    protected final void a(c cVar, String str) {
        String num;
        if (cVar.o != null) {
            cVar.k.z().b();
            com.censivn.C3DEngine.a.f().a(cVar.o);
            cVar.o = null;
        }
        if (cVar.p != null) {
            cVar.l.z().b();
            com.censivn.C3DEngine.a.f().a(cVar.p);
            cVar.p = null;
        }
        if (this.D.sizePlaneEnable) {
            this.ad.setTextSize(this.D.sizeTextFormat.size);
            Paint paint = this.ad;
            paint.setColor(this.D.sizeTextFormat.color);
            Bitmap sizePlaneBitmap = this.D.getSizePlaneBitmap();
            Bitmap createBitmap = Bitmap.createBitmap(this.D.sizeTextWidth, this.D.sizeTextHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            if (sizePlaneBitmap != null) {
                canvas.drawBitmap(sizePlaneBitmap, 0.0f, 0.0f, (Paint) null);
                sizePlaneBitmap.recycle();
            }
            int s = cVar.s();
            if (s > 99) {
                num = "+";
            } else {
                num = Integer.toString(s);
            }
            Bitmap a = com.tsf.shell.setting.a.v.a(num, this.D.sizeTextFormat.width, this.D.sizePlaneHeight, paint, true, false, 0);
            canvas.drawBitmap(a, this.D.sizeTextFormat.x, this.D.sizeTextFormat.y - 10, (Paint) null);
            a.recycle();
            cVar.p = com.censivn.C3DEngine.a.f().a(createBitmap, true);
            createBitmap.recycle();
            cVar.l.z().c(cVar.p);
        }
        Bitmap textPlaneBitmap = this.D.getTextPlaneBitmap();
        Bitmap createBitmap2 = Bitmap.createBitmap(this.D.textWidth, this.D.textHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        if (textPlaneBitmap != null) {
            canvas2.drawBitmap(textPlaneBitmap, 0.0f, 0.0f, (Paint) null);
            textPlaneBitmap.recycle();
        }
        if (!this.D.nameTextFormat.auto) {
            this.ac.setTextSize(this.D.nameTextFormat.size);
            Paint paint2 = this.ac;
            paint2.setColor(this.D.nameTextFormat.color);
            Bitmap a2 = com.tsf.shell.setting.a.v.a(str, this.D.nameTextFormat.width, this.D.textHeight, paint2, true, false, 0);
            canvas2.drawBitmap(a2, this.D.nameTextFormat.x, this.D.nameTextFormat.y - 10, (Paint) null);
            a2.recycle();
        } else {
            Bitmap a3 = com.tsf.shell.setting.a.v.a(str);
            canvas2.drawBitmap(a3, 1.0f, 1.0f, (Paint) null);
            a3.recycle();
        }
        cVar.o = com.censivn.C3DEngine.a.f().a(createBitmap2, true);
        createBitmap2.recycle();
        cVar.k.z().c(cVar.o);
    }

    protected final void e() {
        if (this.G != null) {
            this.N.z().d();
            com.censivn.C3DEngine.a.f().a(this.G);
            this.G = null;
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        i();
        c.h();
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
