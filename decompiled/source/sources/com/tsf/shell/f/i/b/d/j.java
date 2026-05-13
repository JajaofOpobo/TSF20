package com.tsf.shell.f.i.b.d;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.n;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.mix.ThemeFolderManager;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class j implements e.a {
    public static i N;
    public static i O;
    public static float P;
    public static float Q;
    public static float R;
    public static float S;
    private static com.censivn.C3DEngine.b.f.a.a Z;
    public com.censivn.C3DEngine.b.f.j E;
    public com.censivn.C3DEngine.b.f.j F;
    public com.censivn.C3DEngine.b.f.j G;
    public com.censivn.C3DEngine.b.f.k H;
    public h I;
    public n J;
    public int K;
    public ArrayList<ThemeFolderDescription.SystemFolderChild> L;
    public com.censivn.C3DEngine.b.d.a M;
    private com.censivn.C3DEngine.b.g.d T;
    private com.censivn.C3DEngine.b.g.d U;
    private f W;
    private com.tsf.shell.preference.a.a.f X;
    public int a;
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
    public TextureElement y = new TextureElement(0, false);
    public TextureElement z = null;
    public TextureElement A = null;
    public TextureElement B = null;
    public TextureElement C = null;
    public TextureElement D = null;
    private boolean V = false;
    private ThemeFolderManager Y = ThemeManager.mix.folder;

    public j() {
        com.tsf.shell.manager.a.b.a(this);
        this.X = new com.tsf.shell.preference.a.a.f() { // from class: com.tsf.shell.f.i.b.d.j.1
            @Override // com.censivn.C3DEngine.b.e.c
            public void g() {
                super.g();
                j.this.b();
            }
        };
        j();
        k();
        n();
        o();
        p();
        q();
        m();
    }

    public void a() {
        this.W.c();
        this.X.d();
        this.F.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(com.censivn.C3DEngine.b.b.a.D);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        dVar.a(50);
        com.censivn.C3DEngine.b.g.c.a(this.F);
        com.censivn.C3DEngine.b.g.c.a(this.F, 500, dVar);
    }

    public void b() {
        this.W.b();
        this.F.mouseEnabled(true);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(0.0f);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.F);
        com.censivn.C3DEngine.b.g.c.a(this.F, 500, dVar);
    }

    public ThemeDescription c() {
        return this.Y.getTheme();
    }

    public boolean d() {
        if (!e().a()) {
            return this.X.a();
        }
        e().e();
        return true;
    }

    public f e() {
        return this.W;
    }

    public void f() {
        j();
        k();
        o();
    }

    private void m() {
        this.T = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.j.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                j.this.I.visible(false);
            }
        };
        this.T.a(0);
        this.U = new com.censivn.C3DEngine.b.g.d();
        this.U.a(210);
    }

    public void a(int i) {
        float f = (this.c / i) * (this.r - this.s);
        if (f > this.q) {
            f = this.q;
        }
        this.n = (int) f;
        this.o = this.n / 2;
        this.I.c(this.o);
        this.I.d(this.o);
        this.t = (this.r - this.s) - this.n;
    }

    public void g() {
        this.I.position().y = this.s;
        this.I.visible(false);
    }

    public void h() {
        if (!this.V) {
            this.V = true;
            com.censivn.C3DEngine.b.g.c.a(this.I);
            com.censivn.C3DEngine.b.g.c.a(this.I, VEasing.Linear.easeNone, this.U);
            this.I.visible(true);
        }
    }

    public void i() {
        if (this.V) {
            this.V = false;
            com.censivn.C3DEngine.b.g.c.a(this.I);
            com.censivn.C3DEngine.b.g.c.a(this.I, VEasing.Linear.easeNone, this.T);
        }
    }

    private void n() {
        N = new i(1.0f, com.censivn.C3DEngine.b.b.a.b * 11.0f, true, c());
        N.visible(false);
        N.alpha(0.0f);
        O = new i(1.0f, com.censivn.C3DEngine.b.b.a.b * 11.0f, false, c());
        O.visible(false);
        O.alpha(0.0f);
    }

    public void j() {
        this.K = c().folder.sampleCount;
        this.L = c().folder.sampleList;
    }

    public void k() {
        this.B = x.b(b.d.widget_folder_add_button, com.tsf.shell.manager.g.a.i, com.tsf.shell.manager.g.a.i);
        this.C = x.b(b.d.widget_folder_multi_choice, com.tsf.shell.manager.g.a.i, com.tsf.shell.manager.g.a.i);
        this.D = x.b(b.d.widget_folder_rename, com.tsf.shell.manager.g.a.i, com.tsf.shell.manager.g.a.i);
        if (c().folder.backPlaneEnable) {
            Bitmap bitmapFromCache = c().getBitmapFromCache(ThemeFolderDescription.BACK_PLANE, c().folder.backPlaneWidth, c().folder.backPlaneHeight);
            if (bitmapFromCache == null) {
                bitmapFromCache = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            this.z = com.censivn.C3DEngine.a.g().a(this.z, bitmapFromCache, true);
            bitmapFromCache.recycle();
        } else if (this.z != null) {
            com.censivn.C3DEngine.a.g().a(this.z);
            this.z = null;
        }
        if (c().folder.frontPlaneEnable) {
            Bitmap bitmapFromCache2 = c().getBitmapFromCache(ThemeFolderDescription.FRONT_PLANE, c().folder.frontPlaneWidth, c().folder.frontPlaneHeight);
            if (bitmapFromCache2 == null) {
                bitmapFromCache2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            this.A = com.censivn.C3DEngine.a.g().a(this.A, bitmapFromCache2, true);
            bitmapFromCache2.recycle();
        } else if (this.A != null) {
            com.censivn.C3DEngine.a.g().a(this.A);
            this.A = null;
        }
        if (this.E == null) {
            this.F = new com.censivn.C3DEngine.b.f.j();
            this.W = new f();
            this.W.a(this.F);
            this.E = new com.censivn.C3DEngine.b.f.j();
            this.E.scale().x = 0.0f;
            this.E.scale().y = 0.0f;
            this.E.alpha(0.0f);
            this.n = (int) (80.0f * com.censivn.C3DEngine.b.b.a.b);
            this.o = this.n / 2;
            this.p = (int) (com.censivn.C3DEngine.b.b.a.b * 12.0f);
            this.I = new h(com.censivn.C3DEngine.b.b.a.b * 12.0f, this.n);
            this.I.setDefaultColor(new Color4(255, 255, 255, 100));
            this.I.alpha(0.0f);
            this.I.visible(false);
            this.G = new com.censivn.C3DEngine.b.f.j();
            this.H = new com.censivn.C3DEngine.b.f.k(500.0f * com.censivn.C3DEngine.b.b.a.c, 64.0f * com.censivn.C3DEngine.b.b.a.c, 1, 1);
            this.H.calAABB();
            this.H.textures().addElement(this.y);
            this.G.addChild(this.H);
            this.E.addChild(this.G);
            this.E.addChild(this.I);
            this.F.addChild(this.E);
            this.J = new n();
            this.J.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.J) { // from class: com.tsf.shell.f.i.b.d.j.3
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (b.k != null) {
                        b.k.aF().a(motionEvent, motionEvent2, f, f2);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (b.k != null) {
                        b.k.aF().a(f2);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void g(MotionEvent motionEvent) {
                    if (b.k != null) {
                        b.k.aF().a(0.0f);
                    }
                }
            });
            this.G.addChildAt(this.J, 0);
        }
        b(true);
    }

    private void b(boolean z) {
        int i = 1;
        if (Z != null) {
            Z.destroy();
        }
        int i2 = c().folder.backPlaneEnable ? 2 : 1;
        if (c().folder.frontPlaneEnable) {
            i2++;
        }
        if (c().folder.sizePlaneEnable) {
            i2++;
        }
        Z = new com.censivn.C3DEngine.b.f.a.a(i2 + c().folder.sampleCount, 0, 0);
        Z.useVBO(false);
        if (c().folder.backPlaneEnable) {
            com.censivn.C3DEngine.b.f.a.b a = Z.a(0);
            a.b(c().folder.backPlaneWidth);
            a.d(c().folder.backPlaneHeight);
            a.m.x = c().folder.backPlaneX;
            a.m.y = c().folder.backPlaneY;
            a.h();
        } else {
            i = 0;
        }
        if (c().folder.frontPlaneEnable) {
            com.censivn.C3DEngine.b.f.a.b a2 = Z.a(i);
            a2.b(c().folder.frontPlaneWidth);
            a2.d(c().folder.frontPlaneHeight);
            a2.m.x = c().folder.frontPlaneX;
            a2.m.y = c().folder.frontPlaneY;
            a2.h();
            i++;
        }
        if (c().folder.sizePlaneEnable) {
            com.censivn.C3DEngine.b.f.a.b a3 = Z.a(i);
            a3.b(c().folder.sizePlaneWidth);
            a3.d(c().folder.sizePlaneHeight);
            a3.m.x = c().folder.sizePlaneX;
            a3.m.y = c().folder.sizePlaneY;
            a3.h();
            i++;
        }
        float f = com.tsf.shell.manager.o.b.a.H;
        float f2 = com.tsf.shell.manager.o.b.a.I;
        for (int i3 = 0; i3 < c().folder.sampleCount; i3++) {
            ThemeFolderDescription.SystemFolderChild systemFolderChild = c().folder.getSampleInformaiton().get(i3);
            com.censivn.C3DEngine.b.f.a.b a4 = Z.a(i);
            a4.b(f);
            a4.d(f2);
            a4.m.x = systemFolderChild.position.x + c().folder.childContainerX;
            a4.m.y = systemFolderChild.position.y + c().folder.childContainerY;
            a4.o.x = systemFolderChild.scale.x;
            a4.o.y = systemFolderChild.scale.y;
            a4.n.z = systemFolderChild.rotation.z;
            a4.c(com.tsf.shell.manager.o.b.a.Y);
            a4.h();
            i++;
        }
        Z.calAABB();
        Z.minX();
        Z.minY();
        Z.maxX();
        Z.maxY();
        com.censivn.C3DEngine.b.f.a.b a5 = Z.a(i);
        a5.b(c().folder.textPlaneWidth);
        a5.d(c().folder.textPlaneHeight);
        a5.m.x = c().folder.textPlaneX;
        a5.m.y = c().folder.textPlaneY;
        a5.h();
        int i4 = i + 1;
        Z.calAABB();
        P = Z.minX();
        R = Z.minY();
        Q = Z.maxX();
        S = Z.maxY();
    }

    private void o() {
        int i = (int) (com.tsf.shell.manager.o.b.a.T - (com.censivn.C3DEngine.b.b.a.c * 30.0f));
        int i2 = (int) (com.tsf.shell.manager.o.b.a.U + (10.0f * com.censivn.C3DEngine.b.b.a.c));
        int i3 = com.censivn.C3DEngine.b.b.a.D - ((int) ((70.0f * com.censivn.C3DEngine.b.b.a.b) * 2.0f));
        int i4 = i3 > i * 10 ? i * 10 : i3;
        float a = com.censivn.C3DEngine.b.b.a.O ? 0.0f : com.censivn.C3DEngine.b.b.a.a(80.0f);
        int i5 = com.censivn.C3DEngine.b.b.a.E - ((int) (((230.0f - a) * com.censivn.C3DEngine.b.b.a.b) * 2.0f));
        int i6 = i5 > i2 * 7 ? i2 * 7 : i5;
        int[] a2 = x.a(i4 - ((int) (80.0f * com.censivn.C3DEngine.b.b.a.b)), i6 - ((int) (a + (180.0f * com.censivn.C3DEngine.b.b.a.b))), i, i2, 0, 0);
        this.a = a2[0];
        this.b = a2[1];
        this.c = this.a * this.b;
        this.i = a2[2];
        this.j = a2[3];
        if (this.j < i2) {
            this.j = i2;
            this.b = 1;
            this.c = this.a * this.b;
        }
        this.e = i4;
        this.d = i6;
        this.f = (this.e / 2) + 30;
        this.g = (this.d / 2) + 30;
        int i7 = com.censivn.C3DEngine.b.b.a.J;
        this.m = (com.censivn.C3DEngine.b.b.a.I - ((int) (128.0f * com.censivn.C3DEngine.b.b.a.b))) - com.censivn.C3DEngine.b.b.a.K;
        this.h = ((int) ((57.6f * com.censivn.C3DEngine.b.b.a.b) - (i7 / 2))) + (com.censivn.C3DEngine.b.b.a.K / 2);
        this.l = ((com.censivn.C3DEngine.b.b.a.D - ((this.a - 1) * this.i)) / 2) - (com.censivn.C3DEngine.b.b.a.D / 2);
        this.k = (((((this.d / 2) + this.m) - this.h) - c().folder.childContainerY) - i7) + com.censivn.C3DEngine.b.b.a.K;
        int i8 = (int) (this.e + (140.0f * com.censivn.C3DEngine.b.b.a.b));
        int i9 = (int) (this.d + (140.0f * com.censivn.C3DEngine.b.b.a.b));
        this.E.position().y = this.h;
        this.H.position().x = 0.0f;
        this.H.position().y = (i9 / 2) - (com.censivn.C3DEngine.b.b.a.b * 30.0f);
        this.G.setAABBPX((-i8) / 2.0f, (-i9) / 2, 0.0f, i8 / 2.0f, i9 / 2, 0.0f);
        this.J.setAABBPX(((-i8) / 2) + (50.0f * com.censivn.C3DEngine.b.b.a.c), (-i9) / 2, 0.0f, (i8 / 2) - (50.0f * com.censivn.C3DEngine.b.b.a.c), i9 / 2, 0.0f);
        this.H.maxX(i8 / 2);
        this.w = this.k - (this.j * (this.b - 1));
        this.u = this.k + com.tsf.shell.manager.o.b.a.O + (23.0f * com.censivn.C3DEngine.b.b.a.c);
        this.v = this.k - ((this.b - 1) * this.j);
        this.x = c().folder.childContainerY;
        N.position().y = (this.u - (5.0f * com.censivn.C3DEngine.b.b.a.b)) + c().folder.childContainerY;
        N.a(this.e);
        N.b(com.censivn.C3DEngine.b.b.a.b * 13.0f);
        N.a();
        O.position().y = (this.v - (86.0f * com.censivn.C3DEngine.b.b.a.b)) + c().folder.childContainerY;
        O.a(this.e);
        O.b(com.censivn.C3DEngine.b.b.a.b * 13.0f);
        O.a();
        this.r = (int) ((this.d / 2) - (35.0f * com.censivn.C3DEngine.b.b.a.b));
        this.s = (int) (((-this.d) / 2) - (com.censivn.C3DEngine.b.b.a.b * 30.0f));
        this.q = this.r - this.s;
        this.I.position().x = (this.e / 2) + (68.0f * com.censivn.C3DEngine.b.b.a.b);
        this.W.k();
    }

    private void p() {
        this.M = new com.censivn.C3DEngine.b.d.a(this.H) { // from class: com.tsf.shell.f.i.b.d.j.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                w.b();
                if (b.k != null) {
                    j.this.a(b.k);
                }
            }
        };
        this.H.setMouseEventListener(this.M);
    }

    public void a(final b bVar) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.j.5
            @Override // java.lang.Runnable
            public void run() {
                Context d = com.censivn.C3DEngine.a.d();
                View inflate = LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(b.g.dialog_rename, (ViewGroup) null);
                final EditText editText = (EditText) inflate.findViewById(b.e.username_edit);
                editText.setText(bVar.aN());
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
                builder.setTitle(d.getString(b.i.rename_folder_title));
                builder.setView(inflate);
                builder.setPositiveButton(d.getString(b.i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.i.b.d.j.5.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        bVar.a(editText.getText().toString());
                    }
                });
                builder.setNegativeButton(d.getString(b.i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.i.b.d.j.5.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
    }

    public void a(int i, b bVar) {
        this.E.visible(true);
        this.W.b();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.c.a(this.E);
        com.censivn.C3DEngine.b.g.c.a(this.E, i, dVar);
    }

    public void a(boolean z) {
        this.W.c();
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.j.6
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    j.this.E.visible(false);
                }
            };
            dVar.a(0);
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.E);
            com.censivn.C3DEngine.b.g.c.a(this.E, 350, dVar);
            return;
        }
        this.E.scale().x = 0.0f;
        this.E.scale().y = 0.0f;
        this.E.visible(false);
    }

    private void q() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(CharSequence charSequence) {
        l();
        com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
        aVar.h(60);
        aVar.i(-1);
        Bitmap b = aVar.b((String) charSequence);
        com.censivn.C3DEngine.a.g().a(this.y, b);
        b.recycle();
        this.H.a(this.y.width);
        this.H.b(this.y.height);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(b bVar, CharSequence charSequence) {
        String num;
        if (bVar.v != null) {
            bVar.r.textures().removeAll();
            com.censivn.C3DEngine.a.g().a(bVar.v);
            bVar.v = null;
        }
        if (bVar.w != null) {
            bVar.s.textures().removeAll();
            com.censivn.C3DEngine.a.g().a(bVar.w);
            bVar.w = null;
        }
        if (c().folder.sizePlaneEnable) {
            Bitmap bitmapFromCache = c().getBitmapFromCache(ThemeFolderDescription.SIZE_PLANE, c().folder.sizeTextWidth, c().folder.sizeTextHeight);
            if (bitmapFromCache == null) {
                bitmapFromCache = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            Bitmap createBitmap = Bitmap.createBitmap(c().folder.sizeTextWidth, c().folder.sizeTextHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            if (bitmapFromCache != null) {
                canvas.drawBitmap(bitmapFromCache, 0.0f, 0.0f, (Paint) null);
                bitmapFromCache.recycle();
            }
            int aW = bVar.aW();
            if (aW > 99) {
                num = "+";
            } else {
                num = Integer.toString(aW);
            }
            com.tsf.shell.manager.o.a.a aVar = new com.tsf.shell.manager.o.a.a();
            aVar.i(c().folder.sizeTextFormat.color);
            aVar.a(c().folder.sizeTextFormat.width);
            aVar.b(c().folder.sizePlaneHeight);
            aVar.a(true);
            aVar.b(false);
            aVar.a(c().folder.sizeTextFormat.size);
            Bitmap b = aVar.b(num);
            canvas.drawBitmap(b, c().folder.sizeTextFormat.x, c().folder.sizeTextFormat.y - 10, (Paint) null);
            b.recycle();
            bVar.w = com.censivn.C3DEngine.a.g().a(createBitmap, true);
            createBitmap.recycle();
            bVar.s.textures().addElement(bVar.w);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(c().folder.textWidth, c().folder.textHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        if (!c().folder.nameTextFormat.auto) {
            com.tsf.shell.manager.o.a.a aVar2 = new com.tsf.shell.manager.o.a.a();
            aVar2.i(c().folder.nameTextFormat.color);
            aVar2.a(c().folder.nameTextFormat.width);
            aVar2.b(c().folder.textHeight);
            aVar2.a(true);
            aVar2.b(false);
            aVar2.a(c().folder.nameTextFormat.size);
            Bitmap b2 = aVar2.b((String) charSequence);
            canvas2.drawBitmap(b2, c().folder.nameTextFormat.x, c().folder.nameTextFormat.y - 10, (Paint) null);
            b2.recycle();
        } else {
            Bitmap a = com.tsf.shell.manager.o.b.a.a((String) charSequence);
            if (a != null) {
                canvas2.drawBitmap(a, 1.0f, 1.0f, (Paint) null);
                a.recycle();
            }
        }
        bVar.v = com.censivn.C3DEngine.a.g().a(createBitmap2, true);
        createBitmap2.recycle();
        bVar.r.textures().addElement(bVar.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
        if (this.y.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.y);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        o();
        b.a(i, i2, i3, i4);
    }
}
