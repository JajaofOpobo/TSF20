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
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.b.f.EmptyRenderable;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.mix.ThemeFolderManager;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderItemPositioner implements e.a {
    public static FolderItemDotIndicator N;
    public static FolderItemDotIndicator O;
    public static float P;
    public static float Q;
    public static float R;
    public static float S;
    private static com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable Z;
    public com.censivn.C3DEngine.b.f.BaseRenderable E;
    public com.censivn.C3DEngine.b.f.BaseRenderable F;
    public com.censivn.C3DEngine.b.f.BaseRenderable G;
    public com.censivn.C3DEngine.b.f.GridRenderable H;
    public FolderItemIndicator I;
    public n J;
    public int K;
    public ArrayList<ThemeFolderDescription.SystemFolderChild> L;
    public com.censivn.C3DEngine.b.d.MouseEventListener M;
    private com.censivn.C3DEngine.b.g.TweenParams T;
    private com.censivn.C3DEngine.b.g.TweenParams U;
    private FolderItemBackground W;
    private com.tsf.shell.preference.a.a.PreferenceItemF X;
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
    public TextureElement a;
    private boolean V = false;
    private ThemeFolderManager Y = ThemeManager.mix.folder;

    public FolderItemPositioner() {
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.X = new com.tsf.shell.preference.a.a.PreferenceItemF() { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.1
            @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
            public void g() {
                super.g();
                WidgetItemPositioner.this.b();
            }
        };
        FolderItemPositioner();
        FolderItemPositioner();
        FolderItemPositioner();
        FolderItemPositioner();
        FolderItemPositioner();
        FolderItemPositioner();
        FolderItemPositioner();
    }

    public void a() {
        this.W.c();
        this.X.d();
        this.F.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(com.censivn.C3DEngine.b.b.ScreenConstants.D);
        dVar.a(com.censivn.C3DEngine.b.g.EasingFunctions.a);
        dVar.a(50);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.F);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.F, 500, dVar);
    }

    public void b() {
        this.W.b();
        this.F.mouseEnabled(true);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(0.0f);
        dVar.a(com.censivn.C3DEngine.b.g.EasingFunctions.a);
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.F);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.F, 500, dVar);
    }

    public ThemeDescription c() {
        return this.Y.getTheme();
    }

    public boolean d() {
        if (!e().a()) {
            return this.X.a();
        }
        ThemeDescription().e();
        return true;
    }

    public FolderItemBackground e() {
        return this.W;
    }

    public void f() {
        ThemeDescription();
        ThemeDescription();
        ThemeDescription();
    }

    private void m() {
        this.T = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                WidgetItemPositioner.this.I.visible(false);
            }
        };
        this.T.a(0);
        this.U = new com.censivn.C3DEngine.b.g.TweenParams();
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
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.I);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.I, VEasing.Linear.easeNone, this.U);
            this.I.visible(true);
        }
    }

    public void i() {
        if (this.V) {
            this.V = false;
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.I);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.I, VEasing.Linear.easeNone, this.T);
        }
    }

    private void n() {
        N = new FolderItemDotIndicator(1.0f, com.censivn.C3DEngine.b.b.ScreenConstants.b * 11.0f, true, c());
        N.visible(false);
        N.alpha(0.0f);
        O = new FolderItemDotIndicator(1.0f, com.censivn.C3DEngine.b.b.ScreenConstants.b * 11.0f, false, c());
        O.visible(false);
        O.alpha(0.0f);
    }

    public void j() {
        this.K = c().folder.sampleCount;
        this.L = c().folder.sampleList;
    }

    public void k() {
        this.B = com.tsf.shell.utils.GraphicsEngineBridge.b(com.tsf.b.d.widget_folder_add_button, com.tsf.shell.manager.g.LayoutDimensionConstants.i, com.tsf.shell.manager.g.LayoutDimensionConstants.i);
        this.C = com.tsf.shell.utils.GraphicsEngineBridge.b(com.tsf.b.d.widget_folder_multi_choice, com.tsf.shell.manager.g.LayoutDimensionConstants.i, com.tsf.shell.manager.g.LayoutDimensionConstants.i);
        this.D = com.tsf.shell.utils.GraphicsEngineBridge.b(com.tsf.b.d.widget_folder_rename, com.tsf.shell.manager.g.LayoutDimensionConstants.i, com.tsf.shell.manager.g.LayoutDimensionConstants.i);
        if (c().folder.backPlaneEnable) {
            Bitmap bitmapFromCache = c().getBitmapFromCache(ThemeFolderDescription.BACK_PLANE, c().folder.backPlaneWidth, c().folder.backPlaneHeight);
            if (bitmapFromCache == null) {
                bitmapFromCache = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            this.z = com.censivn.C3DEngine.C3DEngine.g().a(this.z, bitmapFromCache, true);
            bitmapFromCache.recycle();
        } else if (this.z != null) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.z);
            this.z = null;
        }
        if (c().folder.frontPlaneEnable) {
            Bitmap bitmapFromCache2 = c().getBitmapFromCache(ThemeFolderDescription.FRONT_PLANE, c().folder.frontPlaneWidth, c().folder.frontPlaneHeight);
            if (bitmapFromCache2 == null) {
                bitmapFromCache2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            this.A = com.censivn.C3DEngine.C3DEngine.g().a(this.A, bitmapFromCache2, true);
            bitmapFromCache2.recycle();
        } else if (this.A != null) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.A);
            this.A = null;
        }
        if (this.E == null) {
            this.F = new com.censivn.C3DEngine.b.f.BaseRenderable();
            this.W = new FolderItemBackground();
            this.W.a(this.F);
            this.E = new com.censivn.C3DEngine.b.f.BaseRenderable();
            this.E.scale().x = 0.0f;
            this.E.scale().y = 0.0f;
            this.E.alpha(0.0f);
            this.n = (int) (80.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
            this.o = this.n / 2;
            this.p = (int) (com.censivn.C3DEngine.b.b.ScreenConstants.b * 12.0f);
            this.I = new FolderItemIndicator(com.censivn.C3DEngine.b.b.ScreenConstants.b * 12.0f, this.n);
            this.I.setDefaultColor(new Color4(255, 255, 255, 100));
            this.I.alpha(0.0f);
            this.I.visible(false);
            this.G = new com.censivn.C3DEngine.b.f.BaseRenderable();
            this.H = new com.censivn.C3DEngine.b.f.GridRenderable(500.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 64.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 1, 1);
            this.H.calAABB();
            this.H.textures().addElement(this.y);
            this.G.addChild(this.H);
            this.E.addChild(this.G);
            this.E.addChild(this.I);
            this.F.addChild(this.E);
            this.J = new EmptyRenderable();
            this.J.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.J) { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.3
                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (com.tsf.shell.f.i.b.d.FolderShortcutItem.k != null) {
                        com.tsf.shell.f.i.b.d.FolderShortcutItem.k.aF().a(motionEvent, motionEvent2, f, f2);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (com.tsf.shell.f.i.b.d.FolderShortcutItem.k != null) {
                        com.tsf.shell.f.i.b.d.FolderShortcutItem.k.aF().a(f2);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void g(MotionEvent motionEvent) {
                    if (com.tsf.shell.f.i.b.d.FolderShortcutItem.k != null) {
                        com.tsf.shell.f.i.b.d.FolderShortcutItem.k.aF().a(0.0f);
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
        Z = new com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable(i2 + c().folder.sampleCount, 0, 0);
        Z.useVBO(false);
        if (c().folder.backPlaneEnable) {
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = Z.a(0);
            bVarA.b(c().folder.backPlaneWidth);
            bVarA.d(c().folder.backPlaneHeight);
            bVarA.m.x = c().folder.backPlaneX;
            bVarA.m.y = c().folder.backPlaneY;
            bVarA.h();
        } else {
            i = 0;
        }
        if (c().folder.frontPlaneEnable) {
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA2 = Z.a(FolderItemDotIndicator);
            bVarA2.b(c().folder.frontPlaneWidth);
            bVarA2.d(c().folder.frontPlaneHeight);
            bVarA2.m.x = c().folder.frontPlaneX;
            bVarA2.m.y = c().folder.frontPlaneY;
            bVarA2.h();
            i++;
        }
        if (c().folder.sizePlaneEnable) {
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA3 = Z.a(FolderItemDotIndicator);
            bVarA3.b(c().folder.sizePlaneWidth);
            bVarA3.d(c().folder.sizePlaneHeight);
            bVarA3.m.x = c().folder.sizePlaneX;
            bVarA3.m.y = c().folder.sizePlaneY;
            bVarA3.h();
            i++;
        }
        float f = com.tsf.shell.manager.o.ButtonPresetManager.a.H;
        float f2 = com.tsf.shell.manager.o.ButtonPresetManager.a.I;
        for (int i3 = 0; i3 < c().folder.sampleCount; i3++) {
            ThemeFolderDescription.SystemFolderChild systemFolderChild = c().folder.getSampleInformaiton().get(i3);
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA4 = Z.a(FolderItemDotIndicator);
            bVarA4.b(FolderItemBackground);
            bVarA4.d(f2);
            bVarA4.m.x = systemFolderChild.position.x + c().folder.childContainerX;
            bVarA4.m.y = systemFolderChild.position.y + c().folder.childContainerY;
            bVarA4.o.x = systemFolderChild.scale.x;
            bVarA4.o.y = systemFolderChild.scale.y;
            bVarA4.n.z = systemFolderChild.rotation.z;
            bVarA4.c(com.tsf.shell.manager.o.ButtonPresetManager.a.Y);
            bVarA4.h();
            i++;
        }
        Z.calAABB();
        Z.minX();
        Z.minY();
        Z.maxX();
        Z.maxY();
        com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA5 = Z.a(FolderItemDotIndicator);
        bVarA5.b(c().folder.textPlaneWidth);
        bVarA5.d(c().folder.textPlaneHeight);
        bVarA5.m.x = c().folder.textPlaneX;
        bVarA5.m.y = c().folder.textPlaneY;
        bVarA5.h();
        int i4 = i + 1;
        Z.calAABB();
        P = Z.minX();
        R = Z.minY();
        Q = Z.maxX();
        S = Z.maxY();
    }

    private void o() {
        int i = (int) (com.tsf.shell.manager.o.ButtonPresetManager.a.T - (com.censivn.C3DEngine.b.b.ScreenConstants.c * 30.0f));
        int i2 = (int) (com.tsf.shell.manager.o.ButtonPresetManager.a.U + (10.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c));
        int i3 = com.censivn.C3DEngine.b.b.ScreenConstants.D - ((int) ((70.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b) * 2.0f));
        int i4 = i3 > i * 10 ? i * 10 : i3;
        float fA = com.censivn.C3DEngine.b.b.ScreenConstants.O ? 0.0f : com.censivn.C3DEngine.b.b.ScreenConstants.a(80.0f);
        int i5 = com.censivn.C3DEngine.b.b.ScreenConstants.E - ((int) (((230.0f - fA) * com.censivn.C3DEngine.b.b.ScreenConstants.b) * 2.0f));
        int i6 = i5 > i2 * 7 ? i2 * 7 : i5;
        int[] iArrA = com.tsf.shell.utils.GraphicsEngineBridge.a(i4 - ((int) (80.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b)), i6 - ((int) (fA + (180.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b))), i, i2, 0, 0);
        this.a = iArrA[0];
        this.b = iArrA[1];
        this.c = this.a * this.b;
        this.i = iArrA[2];
        this.j = iArrA[3];
        if (this.j < i2) {
            this.j = i2;
            this.b = 1;
            this.c = this.a * this.b;
        }
        this.e = i4;
        this.d = i6;
        this.f = (this.e / 2) + 30;
        this.g = (this.d / 2) + 30;
        int i7 = com.censivn.C3DEngine.b.b.ScreenConstants.J;
        this.m = (com.censivn.C3DEngine.b.b.ScreenConstants.I - ((int) (128.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b))) - com.censivn.C3DEngine.b.b.ScreenConstants.K;
        this.h = ((int) ((57.6f * com.censivn.C3DEngine.b.b.ScreenConstants.b) - (i7 / 2))) + (com.censivn.C3DEngine.b.b.ScreenConstants.K / 2);
        this.l = ((com.censivn.C3DEngine.b.b.ScreenConstants.D - ((this.a - 1) * this.i)) / 2) - (com.censivn.C3DEngine.b.b.ScreenConstants.D / 2);
        this.k = (((((this.d / 2) + this.m) - this.h) - c().folder.childContainerY) - i7) + com.censivn.C3DEngine.b.b.ScreenConstants.K;
        int i8 = (int) (this.e + (140.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b));
        int i9 = (int) (this.d + (140.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b));
        this.E.position().y = this.h;
        this.H.position().x = 0.0f;
        this.H.position().y = (i9 / 2) - (com.censivn.C3DEngine.b.b.ScreenConstants.b * 30.0f);
        this.G.setAABBPX((-i8) / 2.0f, (-i9) / 2, 0.0f, i8 / 2.0f, i9 / 2, 0.0f);
        this.J.setAABBPX(((-i8) / 2) + (50.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c), (-i9) / 2, 0.0f, (i8 / 2) - (50.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c), i9 / 2, 0.0f);
        this.H.maxX(i8 / 2);
        this.w = this.k - (this.j * (this.b - 1));
        this.u = this.k + com.tsf.shell.manager.o.ButtonPresetManager.a.O + (23.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
        this.v = this.k - ((this.b - 1) * this.j);
        this.x = c().folder.childContainerY;
        N.position().y = (this.u - (5.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b)) + c().folder.childContainerY;
        N.a(this.e);
        N.b(com.censivn.C3DEngine.b.b.ScreenConstants.b * 13.0f);
        N.a();
        O.position().y = (this.v - (86.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b)) + c().folder.childContainerY;
        O.a(this.e);
        O.b(com.censivn.C3DEngine.b.b.ScreenConstants.b * 13.0f);
        O.a();
        this.r = (int) ((this.d / 2) - (35.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b));
        this.s = (int) (((-this.d) / 2) - (com.censivn.C3DEngine.b.b.ScreenConstants.b * 30.0f));
        this.q = this.r - this.s;
        this.I.position().x = (this.e / 2) + (68.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        this.W.k();
    }

    private void p() {
        this.M = new com.censivn.C3DEngine.b.d.MouseEventListener(this.H) { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.4
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.utils.HapticFeedbackManager.b();
                if (com.tsf.shell.f.i.b.d.FolderShortcutItem.k != null) {
                    WidgetItemPositioner.this.a(com.tsf.shell.f.i.b.d.FolderShortcutItem.k);
                }
            }
        };
        this.H.setMouseEventListener(this.M);
    }

    public void a(final com.tsf.shell.f.i.b.d.FolderShortcutItem bVar) {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.5
            @Override // java.lang.Runnable
            public void run() {
                Context contextD = com.censivn.C3DEngine.C3DEngine.d();
                View viewInflate = LayoutInflater.from(com.censivn.C3DEngine.C3DEngine.d()).inflate(com.tsf.b.g.dialog_rename, (ViewGroup) null);
                final EditText editText = (EditText) viewInflate.findViewById(com.tsf.b.e.username_edit);
                editText.setText(bVar.aN());
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.C3DEngine.d());
                builder.setTitle(contextD.getString(com.tsf.b.i.rename_folder_title));
                builder.setView(viewInflate);
                builder.setPositiveButton(contextD.getString(com.tsf.b.i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.5.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        bVar.a(editText.getText().toString());
                    }
                });
                builder.setNegativeButton(contextD.getString(com.tsf.b.i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.5.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
    }

    public void a(int i, com.tsf.shell.f.i.b.d.FolderShortcutItem bVar) {
        this.E.visible(true);
        this.W.b();
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.EasingFunctions.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.E);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.E, i, dVar);
    }

    public void a(boolean z) {
        this.W.c();
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.i.b.d.FolderItemPositioner.6
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    WidgetItemPositioner.this.E.visible(false);
                }
            };
            dVar.a(0);
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.E);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.E, 350, dVar);
            return;
        }
        this.E.scale().x = 0.0f;
        this.E.scale().y = 0.0f;
        this.E.visible(false);
    }

    private void q() {
    }

    protected void a(CharSequence charSequence) {
        ThemeDescription();
        com.tsf.shell.manager.o.a.TextConfig aVar = new com.tsf.shell.manager.o.a.TextConfig();
        aVar.h(60);
        aVar.i(-1);
        Bitmap bitmapB = aVar.b((String) charSequence);
        com.censivn.C3DEngine.C3DEngine.g().a(this.y, bitmapB);
        bitmapB.recycle();
        this.H.a(this.y.width);
        this.H.b(this.y.height);
    }

    protected void a(com.tsf.shell.f.i.b.d.FolderShortcutItem bVar, CharSequence charSequence) {
        String string;
        if (bVar.v != null) {
            bVar.r.textures().removeAll();
            com.censivn.C3DEngine.C3DEngine.g().a(bVar.v);
            bVar.v = null;
        }
        if (bVar.w != null) {
            bVar.s.textures().removeAll();
            com.censivn.C3DEngine.C3DEngine.g().a(bVar.w);
            bVar.w = null;
        }
        if (c().folder.sizePlaneEnable) {
            Bitmap bitmapFromCache = c().getBitmapFromCache(ThemeFolderDescription.SIZE_PLANE, c().folder.sizeTextWidth, c().folder.sizeTextHeight);
            if (bitmapFromCache == null) {
                bitmapFromCache = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c().folder.sizeTextWidth, c().folder.sizeTextHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (bitmapFromCache != null) {
                canvas.drawBitmap(bitmapFromCache, 0.0f, 0.0f, (Paint) null);
                bitmapFromCache.recycle();
            }
            int iAW = bVar.aW();
            if (iAW > 99) {
                string = "+";
            } else {
                string = Integer.toString(iAW);
            }
            com.tsf.shell.manager.o.a.TextConfig aVar = new com.tsf.shell.manager.o.a.TextConfig();
            aVar.i(c().folder.sizeTextFormat.color);
            aVar.a(c().folder.sizeTextFormat.width);
            aVar.b(c().folder.sizePlaneHeight);
            aVar.a(true);
            aVar.b(false);
            aVar.a(c().folder.sizeTextFormat.size);
            Bitmap bitmapB = aVar.b(string);
            canvas.drawBitmap(bitmapB, c().folder.sizeTextFormat.x, c().folder.sizeTextFormat.y - 10, (Paint) null);
            bitmapB.recycle();
            bVar.w = com.censivn.C3DEngine.C3DEngine.g().a(bitmapCreateBitmap, true);
            bitmapCreateBitmap.recycle();
            bVar.s.textures().addElement(bVar.w);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(c().folder.textWidth, c().folder.textHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        if (!c().folder.nameTextFormat.auto) {
            com.tsf.shell.manager.o.a.TextConfig aVar2 = new com.tsf.shell.manager.o.a.TextConfig();
            aVar2.i(c().folder.nameTextFormat.color);
            aVar2.a(c().folder.nameTextFormat.width);
            aVar2.b(c().folder.textHeight);
            aVar2.a(true);
            aVar2.b(false);
            aVar2.a(c().folder.nameTextFormat.size);
            Bitmap bitmapB2 = aVar2.b((String) charSequence);
            canvas2.drawBitmap(bitmapB2, c().folder.nameTextFormat.x, c().folder.nameTextFormat.y - 10, (Paint) null);
            bitmapB2.recycle();
        } else {
            Bitmap bitmapA = com.tsf.shell.manager.o.ButtonPresetManager.a.a((String) charSequence);
            if (bitmapA != null) {
                canvas2.drawBitmap(bitmapA, 1.0f, 1.0f, (Paint) null);
                bitmapA.recycle();
            }
        }
        bVar.v = com.censivn.C3DEngine.C3DEngine.g().a(bitmapCreateBitmap2, true);
        bitmapCreateBitmap2.recycle();
        bVar.r.textures().addElement(bVar.v);
    }

    protected void l() {
        if (this.y.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.y);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i, int i2, int i3, int i4) {
        ThemeDescription();
        com.tsf.shell.f.i.b.d.FolderShortcutItem.a(i, i2, i3, i4);
    }
}
