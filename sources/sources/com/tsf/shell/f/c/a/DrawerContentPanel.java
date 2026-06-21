package com.tsf.shell.f.c.a;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.f.c.a.a.DrawerAnimConfig;
import com.tsf.shell.f.f.PageEventDispatcher;
import com.tsf.shell.ShellGraphicsContext;
import com.tsf.shell.utils.BitmapTransformationHelper;
import com.tsf.shell.utils.HapticFeedbackManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerContentPanel implements DrawerEditPanel.a {
    public static int a;
    public static int b;
    public static float c;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static com.tsf.shell.f.c.a.a.DrawerAnimConfig h;
    public static com.tsf.shell.f.c.a.a.DrawerAnimConfig i;
    public static com.tsf.shell.f.c.a.a.DrawerAnimConfig j;
    public static com.tsf.shell.f.c.a.a.DrawerAnimConfig k;
    public static com.tsf.shell.f.c.a.a.DrawerAnimConfig l;
    public static com.tsf.shell.f.c.a.a.DrawerAnimConfig m;
    public static float o = 0.0f;
    public static float p = 0.0f;
    public static float q = 0.0f;
    private BaseRenderable C;
    private BaseRenderable D;
    private BaseRenderable E;
    private com.tsf.shell.f.h.DockOperationBorder F;
    private com.tsf.shell.f.h.DockOperationBorder G;
    private com.censivn.C3DEngine.b.g.TweenParams K;
    private com.censivn.C3DEngine.b.g.TweenParams L;
    private GridRenderable M;
    private g N;
    private float O;
    private GridRenderable P;
    private GridRenderable Q;
    private com.tsf.shell.f.c.a.DrawerTouchHandler R;
    private B S;
    private float T;
    private float U;
    private float V;
    private float W;
    private boolean Y;
    private boolean Z;
    private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper ae;
    private boolean af;
    private com.censivn.C3DEngine.b.g.TweenParams ag;
    private com.censivn.C3DEngine.b.g.TweenParams ah;
    private com.censivn.C3DEngine.b.g.TweenParams am;
    private com.censivn.C3DEngine.b.g.TweenParams an;
    public com.tsf.shell.f.c.a.a.DrawerAnimConfig n;
    /* JADX WARN: decompile error - Runnable type artifact */
    private Runnable mRefreshRunnable;
    private BaseRenderable s;
    private BaseRenderable t;
    private float w;
    private float u = 0.0f;
    private float v = 0.0f;
    private float x = 0.4f;
    private boolean y = true;
    private boolean z = true;
    private boolean A = false;
    private TextureElement H = new TextureElement(0, false);
    private TextureElement I = new TextureElement(0, false);
    private TextureElement J = new TextureElement(0, false);
    private boolean X = false;
    private int aa = 255;
    private boolean ab = false;
    private float ac = 0.0f;
    private boolean ad = false;
    private boolean ai = false;
    private float aj = 0.0f;
    private float ak = 0.0f;
    private boolean al = false;
    private e B = new DrawerEditPanel(this);

    public static class a {
        public float a;
        public float b;
        public float c;
    }

    public boolean a() {
        return this.Y;
    }

    public static String b() {
        Cursor cursorQuery = com.censivn.C3DEngine.C3DEngine.d().getContentResolver().query(DrawerSettingsItem.h.a, null, null, null, null);
        String string = "";
        while (cursorQuery.moveToNext()) {
            string = cursorQuery.getString(cursorQuery.getColumnIndex("child"));
        }
        if (string == null) {
            string = "";
        }
        cursorQuery.close();
        return string;
    }

    public DrawerContentPanel(boolean z) {
        boolean z2 = true;
        this.Y = false;
        this.Z = false;
        this.af = false;
        this.Y = z;
        if (!z && com.tsf.shell.manager.app.WidgetPanelController.c() != 1) {
            z2 = false;
        }
        this.Z = z2;
        if (!z) {
            com.tsf.shell.manager.app.ObserverManager.a(this);
        }
        if (z) {
            this.af = false;
        } else {
            this.af = com.tsf.shell.manager.b.ConfigManager.e();
        }
        h = new com.tsf.shell.f.c.a.a.DrawerAnimParamRight();
        i = new com.tsf.shell.f.c.a.a.DrawerAnimParamCorner();
        j = new com.tsf.shell.f.c.a.a.DrawerAnimParamCenter();
        k = new com.tsf.shell.f.c.a.a.DrawerAnimParamEdge();
        l = new com.tsf.shell.f.c.a.a.DrawerAnimParamBottom();
        m = new com.tsf.shell.f.c.a.a.DrawerAnimParamTop();
        e = 200.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b;
        f = 360.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b;
        g = 150.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b;
        c = 138.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b;
        A();
    }

    public void c() {
        if (this.Z) {
            a(true);
        } else {
            a();
        }
    }

    public void d() {
        this.Z = true;
        a();
    }

    public void a(boolean z) {
        this.Z = false;
        b(z);
    }

    public boolean e() {
        return this.Z;
    }

    public e f() {
        return this.B;
    }

    private void A() {
        this.T = com.censivn.C3DEngine.b.b.ScreenConstants.a(54.0f);
        this.U = com.censivn.C3DEngine.b.b.ScreenConstants.a(54.0f);
        this.V = com.censivn.C3DEngine.b.b.ScreenConstants.a(80.0f);
        this.W = com.censivn.C3DEngine.b.b.ScreenConstants.a(80.0f);
        o = com.censivn.C3DEngine.b.b.ScreenConstants.a(60.0f);
        p = com.censivn.C3DEngine.b.b.ScreenConstants.a(60.0f);
        q = com.censivn.C3DEngine.b.b.ScreenConstants.a(60.0f);
    }

    private void B() {
        Bitmap bitmapB = q.b(18.0f, -1);
        com.censivn.C3DEngine.C3DEngine.g().a(this.I, bitmapB);
        bitmapB.recycle();
    }

    public B g() {
        return this.S;
    }

    public BaseRenderable h() {
        return this.t;
    }

    public void a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = com.tsf.shell.utils.ItemInfoListSorter.a(arrayList, str, ",", false).iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        float fA = this.n.a(this.u, this.v);
        if (this.O > fA) {
            this.S.b(fA);
        } else {
            this.S.b(this.O);
        }
        if (this.af) {
            this.S.j();
            this.S.h();
        } else {
            a((Runnable) null, false);
        }
    }

    private void a(ItemInfo itemInfo) {
        com.tsf.shell.f.i.PageItem bVarA;
        if (itemInfo.itemType == 1) {
            bVarA = com.tsf.shell.f.i.b.d.FolderShortcutItem.a((LauncherFolder3DInfo) itemInfo);
        } else {
            bVarA = com.tsf.shell.manager.l.ShortcutManager.a(itemInfo, true);
        }
        this.S.a(bVarA, false);
        this.S.addChild(bVarA);
    }

    public void a(int i2, boolean z) {
        if (this.aa != i2) {
            this.aa = i2;
            int iA = com.tsf.shell.utils.PercentToAlphaConverter.a(i2);
            this.C.alpha(iA);
            this.P.alpha(iA);
            if (z) {
                com.tsf.shell.manager.b.ConfigManager.a(i2);
            }
        }
    }

    public int i() {
        return this.aa;
    }

    public void a(j jVar, A aVar) {
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        float f6;
        float f7;
        this.ag = new com.censivn.C3DEngine.b.g.TweenParams();
        this.ag.l(1.0f);
        this.ag.m(1.0f);
        this.ah = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                DrawerContentPanel.this.P.visible(false);
            }
        };
        this.ah.l(0.0f);
        this.ah.m(0.0f);
        this.s = jVar;
        a = (int) (50.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        b = (int) (100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        this.S = new DrawerMenuPanel(this);
        if (this.Y) {
            this.S.a = 0.1f;
        }
        a(m);
        C();
        this.D = new BaseRenderable();
        this.C = new BaseRenderable();
        this.ae = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
        this.t = new BaseRenderable() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.9
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (!DrawerContentPanel.this.y && !DrawerContentPanel.this.al) {
                    position().x += (DrawerContentPanel.this.u - position().x) * DrawerContentPanel.this.x;
                    position().y += (DrawerContentPanel.this.v - position().y) * DrawerContentPanel.this.x;
                    if (Math.abs(position().x - DrawerContentPanel.this.u) < 0.2f && Math.abs(position().y - DrawerContentPanel.this.v) < 0.2f && !DrawerContentPanel.this.A) {
                        position().x = DrawerContentPanel.this.u;
                        position().y = DrawerContentPanel.this.v;
                        DrawerContentPanel.this.y = true;
                        DrawerContentPanel.this.t.setAnimationObjectState(false);
                    }
                }
                if (!DrawerContentPanel.this.z) {
                    if (DrawerContentPanel.this.S.a(DrawerContentPanel.this.ac) > 0.32f || DrawerContentPanel.this.ac > DrawerContentPanel.this.w) {
                        DrawerContentPanel.this.w = DrawerContentPanel.this.ac;
                    }
                    float fA = DrawerContentPanel.this.N.a();
                    DrawerContentPanel.this.O = fA + ((DrawerContentPanel.this.w - fA) * DrawerContentPanel.this.x);
                    DrawerContentPanel.this.a(DrawerContentPanel.this.O, true);
                    DrawerContentPanel.this.S.c(DrawerContentPanel.this.O);
                    if (Math.abs(DrawerContentPanel.this.O - DrawerContentPanel.this.w) < 0.2f) {
                        DrawerContentPanel.this.O = DrawerContentPanel.this.w;
                        DrawerContentPanel.this.a(DrawerContentPanel.this.O, true);
                        DrawerContentPanel.this.S.c(DrawerContentPanel.this.O);
                        DrawerContentPanel.this.N.setAnimationObjectState(false);
                        DrawerContentPanel.this.z = true;
                        if (!DrawerContentPanel.this.Y) {
                            if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                                com.tsf.shell.manager.b.ConfigManager.a(DrawerContentPanel.this.O);
                            } else {
                                com.tsf.shell.manager.b.ConfigManager.b(DrawerContentPanel.this.O);
                            }
                        }
                    }
                }
            }
        };
        this.s.addChild(this.t);
        PositionNumber3d positionNumber3dPosition = this.t.position();
        float f8 = com.censivn.C3DEngine.b.b.ScreenConstants.z + a;
        this.u = f8;
        positionNumber3dPosition.x = f8;
        PositionNumber3d positionNumber3dPosition2 = this.t.position();
        float f9 = com.censivn.C3DEngine.b.b.ScreenConstants.C + a;
        this.v = f9;
        positionNumber3dPosition2.y = f9;
        B();
        this.E = new BaseRenderable();
        this.F = new com.tsf.shell.f.h.DockOperationBorder();
        this.F.b(0.0f);
        this.E.addChild(this.F);
        this.G = new com.tsf.shell.f.h.DockOperationBorder();
        this.G.b(0.0f);
        this.E.addChild(this.G);
        this.R = new com.tsf.shell.f.c.a.DrawerTouchHandler(this.C, this);
        this.C.setMouseEventListener(this.R);
        this.P = new GridRenderable(this.I.width, this.I.height, false);
        this.P.rotation().z = 90.0f;
        this.P.calAABB(3.0f, 3.0f, 1.0f);
        this.P.scale().setAll(0.0f, 0.0f, 1.0f);
        this.P.visible(false);
        this.P.textures().addElement(this.I);
        this.Q = new GridRenderable(this.I.width, this.I.height, false);
        this.Q.textures().addElement(this.I);
        this.C.addChild(this.Q);
        this.C.calAABB(3.0f, 3.0f, 1.0f);
        this.P.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.P) { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.10
            private float b;
            private boolean d = false;
            private float e;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                w.b();
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                this.d = false;
                this.b = DrawerContentPanel.this.N.a();
                this.e = DrawerContentPanel.this.n.a(DrawerContentPanel.this.u, DrawerContentPanel.this.v);
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!DrawerContentPanel.this.af) {
                    boolean z2 = DrawerContentPanel.this.N.rotation().z % 180.0f == 0.0f;
                    if (this.d) {
                        float fA = DrawerContentPanel.this.n.a(this.b, motionEvent, motionEvent2);
                        if (fA > this.e) {
                            fA = this.e;
                        }
                        if (fA < f.c * com.censivn.C3DEngine.b.b.ScreenConstants.b) {
                            fA = f.c * com.censivn.C3DEngine.b.b.ScreenConstants.b;
                        }
                        DrawerContentPanel.this.ac = fA;
                        DrawerContentPanel.this.z = false;
                        DrawerContentPanel.this.N.setAnimationObjectState(true);
                        DrawerContentPanel.this.N.invalidate();
                        return;
                    }
                    if (z2) {
                        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > 20.0f) {
                            this.d = true;
                        }
                    } else if (Math.abs(motionEvent2.getY() - motionEvent.getY()) > 20.0f) {
                        this.d = true;
                    }
                }
            }
        });
        this.M = new GridRenderable(0.0f, this.J.height * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        this.M.textures().addElement(this.J);
        this.M.alpha(0.0f);
        this.K = new com.censivn.C3DEngine.b.g.TweenParams();
        this.K.a(255);
        this.L = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.11
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                DrawerContentPanel.this.M.removeFromParent();
            }
        };
        this.L.a(0);
        d = com.censivn.C3DEngine.b.b.ScreenConstants.a(130.0f);
        this.N = new DrawerSettingsItem(this.H.width, this.H.height, new DrawerConfig(this.H.width / 2, this.H.height / 2, this.H.height)) { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.12
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public i getHittingTarget(float f10, float f11, boolean z2) {
                if (DrawerContentPanel.this.P.calTouchCollision(f10, f11)) {
                    return DrawerContentPanel.this.P;
                }
                if (!calTouchCollision(f10, f11)) {
                    return null;
                }
                return this;
            }
        };
        this.N.textures().addElement(this.H);
        this.N.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.N) { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.13
            boolean a = true;
            boolean b = true;
            i d;
            com.censivn.C3DEngine.b.d.MouseEventListener e;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                if (this.a) {
                    this.a = false;
                    DrawerContentPanel.this.S.a(motionEvent2.getX(), motionEvent2.getY());
                }
                DrawerContentPanel.this.S.b(motionEvent2.getX(), motionEvent2.getY());
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                this.d = null;
                this.e = null;
                this.d = DrawerContentPanel.this.S.getHittingObjectTarget(motionEvent, true);
                if (this.d != null && this.d.getMouseEventListener() != null) {
                    this.e = this.d.getMouseEventListener();
                    this.e.e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                if (!this.a) {
                    this.a = true;
                    DrawerContentPanel.this.S.c();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                if (this.e != null) {
                    this.e.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.e != null) {
                    this.e.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void c(MotionEvent motionEvent) {
                this.b = false;
                if (this.e != null) {
                    this.e.c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void d(MotionEvent motionEvent) {
                this.b = false;
                if (this.e != null) {
                    this.e.d(motionEvent);
                }
            }
        });
        this.D.addChild(this.P);
        this.N.addChild(this.D);
        this.t.addChild(this.S);
        this.t.addChild(this.N);
        this.t.addChild(this.C);
        a(0.0f, true);
        float fC = com.censivn.C3DEngine.b.b.ScreenConstants.O ? com.tsf.shell.manager.b.ConfigManager.c() : com.tsf.shell.manager.b.ConfigManager.d();
        if (!this.Y) {
            boolean z2 = com.tsf.shell.manager.b.ConfigManager.c() == 0.0f && com.tsf.shell.manager.b.ConfigManager.d() == 0.0f;
            if (fC == 0.0f) {
                f6 = (int) (com.tsf.shell.manager.o.ButtonPresetManager.a.H * 6 * 0.95f);
                f5 = (-f6) / 2.0f;
                f7 = com.censivn.C3DEngine.b.b.ScreenConstants.C;
            } else {
                Number3d number3dF = com.censivn.C3DEngine.b.b.ScreenConstants.O ? com.tsf.shell.manager.b.ConfigManager.f() : com.tsf.shell.manager.b.ConfigManager.g();
                float f10 = number3dF.x;
                float f11 = number3dF.y;
                f5 = f10;
                f6 = fC;
                f7 = f11;
            }
            if (f6 < c) {
                boolean z3 = z2;
                f2 = c;
                f3 = f5;
                f4 = f7;
                z = z3;
            } else {
                boolean z4 = z2;
                f2 = f6;
                f3 = f5;
                f4 = f7;
                z = z4;
            }
        } else {
            f2 = aVar.a;
            f3 = aVar.b;
            f4 = aVar.c;
            z = false;
        }
        this.w = f2;
        this.O = f2;
        a(f3, f4, false);
        if (!this.Y && z) {
            if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                com.tsf.shell.manager.b.ConfigManager.a(this.O);
                com.tsf.shell.manager.b.ConfigManager.a(this.u, this.v);
            } else {
                com.tsf.shell.manager.b.ConfigManager.b(this.O);
                com.tsf.shell.manager.b.ConfigManager.b(this.u, this.v);
            }
        }
        a(com.tsf.shell.manager.b.ConfigManager.b(), false);
        com.tsf.shell.manager.app.StateHub.c().a(new o.a() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.14
            @Override // com.tsf.shell.f.f.PageEventDispatcher.a
            public void a(com.tsf.shell.f.f.WorkspacePage gVar) {
                if (gVar.t() == -1) {
                    if (DrawerContentPanel.this.ad) {
                        DrawerContentPanel.this.v();
                    }
                } else if (!DrawerContentPanel.this.af && !DrawerContentPanel.this.ad) {
                    DrawerContentPanel.this.x();
                }
            }

            @Override // com.tsf.shell.f.f.PageEventDispatcher.a
            public void a() {
                if (DrawerContentPanel.this.ad) {
                    DrawerContentPanel.this.v();
                }
            }

            @Override // com.tsf.shell.f.f.PageEventDispatcher.a
            public void b() {
                if (!DrawerContentPanel.this.af && !DrawerContentPanel.this.ad && com.tsf.shell.manager.app.StateHub.n().t() != -1) {
                    DrawerContentPanel.this.x();
                }
            }
        });
        if (this.Z) {
            a();
        } else {
            a(false);
        }
    }

    public int a(float f2) {
        return this.n.a(f2, this.G.rotation().z, 0.0f);
    }

    public void j() {
        DrawerTouchHandler.C0080a c0080aA = this.n.a(this.t, this.G.a, 8.0f, 4.0f, 24.0f);
        if (c0080aA != null) {
            this.G.visible(Boolean.valueOf(!this.ad));
            this.G.rotation().z = c0080aA.d;
            this.F.rotation().z = c0080aA.e;
            this.G.a(c0080aA.a);
            this.F.a(c0080aA.b);
            this.E.removeFromParent();
            this.E.position().setAllFrom(this.t.position());
            com.tsf.shell.manager.app.TaskScheduler.a(this.E);
        }
    }

    public void k() {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.15
            @Override // java.lang.Runnable
            public void run() {
                DrawerContentPanel.this.l();
            }
        });
    }

    public void l() {
        if (this.r == null) {
            this.r = new Runnable() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.16
                @Override // java.lang.Runnable
                public void run() {
                    DrawerContentPanel.this.G.b(0.0f);
                    DrawerContentPanel.this.F.b(0.0f);
                    DrawerContentPanel.this.E.removeFromParent();
                }
            };
        }
        this.G.a(0.0f, this.r);
        this.F.a(0.0f);
    }

    public void m() {
        if (!this.ab) {
            this.ab = true;
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.2
                @Override // java.lang.Runnable
                public void run() {
                    if (DrawerContentPanel.this.M.parent() == null) {
                        DrawerContentPanel.this.t.addChildAt(DrawerContentPanel.this.M, 0);
                    }
                    if (!DrawerContentPanel.this.X) {
                        DrawerContentPanel.this.M.rotation().z = 90.0f;
                        DrawerContentPanel.this.M.a(com.censivn.C3DEngine.b.b.ScreenConstants.G * 2);
                    } else {
                        DrawerContentPanel.this.M.rotation().z = 0.0f;
                        DrawerContentPanel.this.M.a(com.censivn.C3DEngine.b.b.ScreenConstants.F * 2);
                    }
                    com.censivn.C3DEngine.b.g.TweenUtils.a(DrawerContentPanel.this.M);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(DrawerContentPanel.this.M, VEasing.Linear.easeNone, DrawerContentPanel.this.K);
                }
            });
        }
    }

    public void n() {
        if (this.ab) {
            this.ab = false;
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.3
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.g.TweenUtils.a(DrawerContentPanel.this.M);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(DrawerContentPanel.this.M, VEasing.Linear.easeNone, DrawerContentPanel.this.L);
                }
            });
        }
    }

    public void a(float f2, boolean z) {
        this.N.setAABBPX(0.0f, (-d) / 2.0f, 0.0f, f2, d / 2.0f, 0.0f);
        this.N.c(f2);
        if (z) {
            this.D.position().x = f2;
        }
    }

    private void a(com.tsf.shell.f.c.a.a.DrawerAnimConfig aVar) {
        this.n = aVar;
        this.S.e();
    }

    private void b(com.tsf.shell.f.c.a.a.DrawerAnimConfig aVar) {
        if (aVar != this.n) {
            this.n = aVar;
            this.S.e();
        }
    }

    private void C() {
        this.S.c(this.T, this.U);
    }

    public void o() {
        w.a();
        this.A = true;
        this.y = false;
        this.t.setAnimationObjectState(true);
        this.t.invalidate();
        this.u = this.t.position().x;
        this.v = this.t.position().y;
        a();
    }

    public void a(float f2, float f3) {
        this.u = f2;
        this.v = f3;
    }

    public void a(float f2, float f3, float f4) {
        this.u = f3;
        this.v = f4;
        this.t.position().setAll(this.u, this.v, 0.0f);
        this.O = f2;
        if (this.ad) {
            this.S.c(f2);
            a(f2, true);
        }
    }

    public float p() {
        return this.O;
    }

    public void q() {
        this.A = false;
        c(false);
        if (!this.Y) {
            if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                com.tsf.shell.manager.b.ConfigManager.a(this.u, this.v);
            } else {
                com.tsf.shell.manager.b.ConfigManager.b(this.u, this.v);
            }
        }
        if (!this.af) {
            a();
            return;
        }
        float f2 = this.O;
        float fA = this.n.a(this.u, this.v);
        if (f2 <= fA) {
            fA = f2;
        }
        this.S.e(fA);
    }

    private void a(float f2, float f3, boolean z) {
        this.u = f2;
        this.v = f3;
        c(z);
        this.t.position().setAll(this.u, this.v, 0.0f);
    }

    private void c(boolean z) {
        float fAbs = Math.abs(this.u - com.censivn.C3DEngine.b.b.ScreenConstants.z);
        float fAbs2 = Math.abs(com.censivn.C3DEngine.b.b.ScreenConstants.A - this.u);
        float fAbs3 = Math.abs(this.v - com.censivn.C3DEngine.b.b.ScreenConstants.C);
        if (!z || this.n == null) {
            if (fAbs < fAbs2 && fAbs < fAbs3) {
                this.u = com.censivn.C3DEngine.b.b.ScreenConstants.z + a;
                E();
            } else if (fAbs2 < fAbs && fAbs2 < fAbs3) {
                this.u = com.censivn.C3DEngine.b.b.ScreenConstants.A - a;
                E();
            } else {
                this.v = com.censivn.C3DEngine.b.b.ScreenConstants.C + a;
                F();
            }
        } else if (this.n instanceof com.tsf.shell.f.c.a.a.DrawerAnimParamLeft) {
            this.v = com.censivn.C3DEngine.b.b.ScreenConstants.C + a;
            F();
        } else {
            if (fAbs > fAbs2) {
                this.u = com.censivn.C3DEngine.b.b.ScreenConstants.A - a;
            } else {
                this.u = com.censivn.C3DEngine.b.b.ScreenConstants.z + a;
            }
            E();
        }
        if (z && !this.Y) {
            if (this.n instanceof com.tsf.shell.f.c.a.a.DrawerAnimParamLeft) {
                com.tsf.shell.manager.b.ConfigManager.a(this.u, this.v);
            } else {
                com.tsf.shell.manager.b.ConfigManager.b(this.u, this.v);
            }
        }
    }

    private void D() {
        if (!this.Y) {
            if (this.n.c == 3) {
                this.v = com.censivn.C3DEngine.b.b.ScreenConstants.C + a;
            } else if (this.n.c == 0) {
                this.u = com.censivn.C3DEngine.b.b.ScreenConstants.z + a;
            } else if (this.n.c == 1) {
                this.v = com.censivn.C3DEngine.b.b.ScreenConstants.A - a;
            }
        }
    }

    private void E() {
        if (!this.Y) {
            if (this.v > com.censivn.C3DEngine.b.b.ScreenConstants.B - a) {
                this.v = com.censivn.C3DEngine.b.b.ScreenConstants.B - a;
            } else if (this.v < com.censivn.C3DEngine.b.b.ScreenConstants.C + a) {
                this.v = com.censivn.C3DEngine.b.b.ScreenConstants.C + a;
            }
            boolean z = this.N.a() != 0.0f;
            if (this.v > 0.0f) {
                if (z) {
                    com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                    dVar.e(-90.0f);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(this.N);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(this.N, 300, dVar);
                } else {
                    this.N.rotation().z = -90.0f;
                }
                this.D.rotation().z = 90.0f;
                if (this.u < 0.0f) {
                    this.X = false;
                    b(j);
                    return;
                } else {
                    this.X = false;
                    b(k);
                    return;
                }
            }
            if (z) {
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar2.e(90.0f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.N);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.N, 300, dVar2);
            } else {
                this.N.rotation().z = 90.0f;
            }
            this.D.rotation().z = -90.0f;
            if (this.u < 0.0f) {
                this.X = false;
                b(DrawerConfig);
            } else {
                this.X = false;
                b(i);
            }
        }
    }

    private void F() {
        if (this.Y) {
            return;
        }
        if (this.u > com.censivn.C3DEngine.b.b.ScreenConstants.A - a) {
            this.u = com.censivn.C3DEngine.b.b.ScreenConstants.A - a;
        } else if (this.u < com.censivn.C3DEngine.b.b.ScreenConstants.z + a) {
            this.u = com.censivn.C3DEngine.b.b.ScreenConstants.z + a;
        }
        boolean z = this.N.a() != 0.0f;
        if (this.u > 0.0f) {
            if (z) {
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.e(180.0f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.N);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.N, 300, dVar);
            } else {
                this.N.rotation().z = 180.0f;
            }
            this.D.rotation().z = -180.0f;
            this.X = true;
            b(l);
            return;
        }
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar2.e(0.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.N);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.N, 300, dVar2);
        } else {
            this.N.rotation().z = 0.0f;
        }
        this.D.rotation().z = 0.0f;
        this.X = true;
        b(m);
    }

    public boolean r() {
        return this.ad;
    }

    public boolean s() {
        return this.af;
    }

    private void G() {
        if (!this.Y) {
            com.censivn.C3DEngine.C3DEngine.a().d(new Runnable() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.b.ConfigManager.a(DrawerContentPanel.this.af);
                }
            });
        }
    }

    public void t() {
        if (this.Z) {
            w.a();
            this.af = false;
            a();
            G();
        }
    }

    public void u() {
        if (this.Z) {
            w.a();
            this.af = true;
            a();
            G();
        }
    }

    public void v() {
        if (this.ad) {
            this.S.f();
            this.ad = false;
            final float fA = this.N.a();
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f2) {
                    DrawerContentPanel.this.a(fA * (1.0f - f2), true);
                }
            };
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.ae);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.ae, 600, dVar);
            H();
        }
    }

    private void d(boolean z) {
        this.P.visible(true);
        if (z) {
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.P);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.P, 600, this.ag);
        } else {
            this.P.scale().setAll(1.0f, 1.0f, 1.0f);
        }
    }

    private void H() {
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.P);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.P, 600, this.ah);
    }

    public float w() {
        return this.v;
    }

    public void x() {
        a((Runnable) null, true);
    }

    public void a(final Runnable runnable, boolean z) {
        if (!this.ad) {
            this.ad = true;
            float f2 = this.O;
            final float fA = this.n.a(this.u, this.v);
            if (f2 <= fA) {
                fA = f2;
            }
            this.S.e(fA);
            this.S.a(z);
            final float fA2 = this.N.a();
            final boolean z2 = this.af ? false : true;
            if (z) {
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.6
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f3) {
                        DrawerContentPanel.this.a(fA2 + ((fA - fA2) * f3), z2);
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.ae);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.ae, 500, dVar);
            } else {
                a(fA, z2);
                if (runnable != null) {
                    runnable.run();
                }
            }
            d(z);
        }
    }

    public void y() {
        b(true);
    }

    public void b(boolean z) {
        if (!this.al) {
            this.al = true;
            this.t.mouseEnabled(false);
            Number3d number3dA = this.n.a(this.t);
            if (z) {
                if (this.an == null) {
                    this.an = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.7
                        @Override // com.censivn.C3DEngine.b.g.TweenParams
                        public void a() {
                            DrawerContentPanel.this.t.visible(false);
                        }
                    };
                }
                this.an.f(number3dA.x);
                this.an.h(number3dA.y);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.t);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.t, 600, this.an);
                return;
            }
            this.t.visible(false);
            this.t.position().x = number3dA.x;
            this.t.position().y = number3dA.y;
        }
    }

    public void z() {
        if (this.al && this.Z) {
            this.al = false;
            this.t.visible(true);
            Number3d number3dB = this.n.b(this.t);
            if (this.am == null) {
                this.am = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.a.DrawerContentPanel.8
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        DrawerContentPanel.this.t.mouseEnabled(true);
                    }
                };
            }
            this.am.f(number3dB.x);
            this.am.h(number3dB.y);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.t);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.t, 600, this.am);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        boolean z = false;
        if (((this.n instanceof com.tsf.shell.f.c.a.a.DrawerAnimParamLeft) && com.censivn.C3DEngine.b.b.ScreenConstants.O) || ((this.n instanceof com.tsf.shell.f.c.a.a.DrawerAnimParamBase) && !com.censivn.C3DEngine.b.b.ScreenConstants.O)) {
            z = true;
        }
        Number3d number3dF = com.censivn.C3DEngine.b.b.ScreenConstants.O ? com.tsf.shell.manager.b.ConfigManager.f() : com.tsf.shell.manager.b.ConfigManager.g();
        if (number3dF.x == 0.0f && number3dF.y == 0.0f) {
            D();
            f2 = this.u;
            f3 = this.v;
        } else {
            f2 = number3dF.x;
            f3 = number3dF.y;
        }
        a(f2, f3, z);
        float fC = com.censivn.C3DEngine.b.b.ScreenConstants.O ? com.tsf.shell.manager.b.ConfigManager.c() : com.tsf.shell.manager.b.ConfigManager.d();
        if (fC == 0.0f) {
            fC = this.O;
        }
        if (fC != 0.0f) {
            if (fC < c * com.censivn.C3DEngine.b.b.ScreenConstants.b) {
                fC = c * com.censivn.C3DEngine.b.b.ScreenConstants.b;
            }
            float fA = this.n.a(this.u, this.v);
            if (fC > fA) {
                fC = fA;
            }
            this.w = fC;
            this.O = fC;
            if (this.ad) {
                a(this.O, true);
                this.S.d(this.O);
                this.S.invalidate();
            }
        }
    }
}
