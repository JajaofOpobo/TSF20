package com.tsf.shell.f.e;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LassoSelectionHandler {
    private static com.tsf.shell.ShellPreferenceManager d;
    private static com.censivn.C3DEngine.b.f.j e;
    private static com.censivn.C3DEngine.b.f.i f;
    private static com.censivn.C3DEngine.b.f.i g;
    private static com.censivn.C3DEngine.b.f.i h;
    private static String i;
    private static ViewGroup.LayoutParams w;
    private ArrayList<com.censivn.C3DEngine.b.f.i> l;
    private AlignmentOverlay m;
    private com.censivn.C3DEngine.b.f.i n;
    private LassoContextMenu p;
    private float s;
    private float t;
    private com.censivn.C3DEngine.b.f.a.a u;
    private static TextureElement b = null;
    private static TextureElement c = null;
    public static Color4 a = new Color4();
    private boolean j = true;
    private boolean k = false;
    private boolean o = false;
    private boolean r = false;
    private boolean v = true;
    private ArrayList<ILassoSelectable> q = new ArrayList<>();

    public interface a {
        void a(ILassoSelectable mVar);

        void f();

        LassoContextMenu l_();
    }

    static {
        a();
    }

    public void a(AlignmentOverlay aVar) {
        this.m = aVar;
    }

    public void a(a aVar) {
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        this.n = iVar;
    }

    public void a(boolean z) {
        this.r = z;
    }

    public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (!this.k) {
            com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.e.h.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    if (LassoSelectionHandler.d.getPointCount() <= 200) {
                        if (LassoSelectionHandler.this.j) {
                            LassoSelectionHandler.this.s = motionEvent.getX();
                            LassoSelectionHandler.this.t = motionEvent.getY();
                            LassoSelectionHandler.this.l = com.tsf.shell.manager.app.StateHub.G();
                            LassoSelectionHandler.this.j = false;
                            LassoSelectionHandler.this.c(motionEvent);
                            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    LassoSelectionHandler.d.a(motionEvent.getX(), motionEvent.getY() + 38.0f);
                                }
                            });
                        }
                        if (LassoSelectionHandler.this.p != null && LassoSelectionHandler.this.p.b()) {
                            LassoSelectionHandler.this.p.a().a(motionEvent, motionEvent2);
                            return;
                        }
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float x2 = motionEvent2.getX();
                        float y2 = motionEvent2.getY();
                        if (com.tsf.shell.utils.GraphicsEngineBridge.b(LassoSelectionHandler.this.s, LassoSelectionHandler.this.t, x2, y2) > 10.0f) {
                            LassoSelectionHandler.this.s = x2;
                            LassoSelectionHandler.this.t = y2;
                            LassoSelectionHandler.this.a((float) Math.sqrt(Math.pow(motionEvent.getX() - motionEvent2.getX(), 2.0d) + Math.pow(motionEvent.getY() - motionEvent2.getY(), 2.0d)));
                            LassoSelectionHandler.this.b(motionEvent, motionEvent2);
                            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    LassoSelectionHandler.d.b(motionEvent2.getX(), motionEvent2.getY());
                                }
                            });
                            if (!LassoSelectionHandler.this.o || com.tsf.shell.utils.GraphicsEngineBridge.b(x, y, x2, y2) >= 50.0f) {
                                for (com.censivn.C3DEngine.b.f.i iVar : LassoSelectionHandler.this.l) {
                                    if ((iVar instanceof ILassoSelectable) && iVar != LassoSelectionHandler.this.n) {
                                        ILassoSelectable mVar = (ILassoSelectable) iVar;
                                        if (!mVar.e_() && mVar.d() && LassoSelectionHandler.this.a(iVar, x, y, x2, y2)) {
                                            mVar.b(true);
                                            LassoSelectionHandler.this.m.a(mVar);
                                            LassoSelectionHandler.this.o = true;
                                            LassoSelectionHandler.this.q.add(mVar);
                                        }
                                    }
                                }
                                return;
                            }
                            LassoSelectionHandler.this.b((MotionEvent) null);
                            return;
                        }
                        return;
                    }
                    LassoSelectionHandler.this.a((MotionEvent) null);
                    LassoSelectionHandler.this.k = true;
                    com.tsf.shell.ShellThemeProvider.a(LassoSelectionHandler.i);
                }
            });
        }
    }

    public boolean a(com.censivn.C3DEngine.b.f.i iVar, float f2, float f3, float f4, float f5) {
        Number3d number3dClone = iVar.position().m4clone();
        number3dClone.x += com.censivn.C3DEngine.b.b.A.H;
        number3dClone.y = com.censivn.C3DEngine.b.b.A.I - number3dClone.y;
        if (a(f2, f3, f4, f5, iVar.minX() + number3dClone.x, iVar.minY() + number3dClone.y, iVar.maxX() + number3dClone.x, iVar.minY() + number3dClone.y) || a(f2, f3, f4, f5, iVar.maxX() + number3dClone.x, iVar.minY() + number3dClone.y, iVar.maxX() + number3dClone.x, iVar.maxY() + number3dClone.y) || a(f2, f3, f4, f5, iVar.minX() + number3dClone.x, iVar.maxY() + number3dClone.y, iVar.maxX() + number3dClone.x, iVar.maxY() + number3dClone.y)) {
            return true;
        }
        if (a(f2, f3, f4, f5, iVar.minX() + number3dClone.x, iVar.minY() + number3dClone.y, iVar.minX() + number3dClone.x, number3dClone.y + iVar.maxY())) {
            return true;
        }
        return false;
    }

    public boolean a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(MotionEvent motionEvent) {
        this.p = this.m.l_();
        if (this.p != null) {
            this.p.a(this);
            if (motionEvent == null) {
                this.p.c();
            } else {
                float[] fArrA = x.a(motionEvent, new float[2]);
                this.p.a((int) fArrA[0], (int) fArrA[1]);
                this.p.g();
            }
            jadx();
        }
        return this.p == null;
    }

    private void g() {
        jadx();
        Iterator<ILassoSelectable> it = this.q.iterator();
        while (it.hasNext()) {
            it.next().b(false);
        }
        this.q.clear();
    }

    public void a(MotionEvent motionEvent) {
        if (this.k) {
            this.k = false;
            return;
        }
        this.j = true;
        jadx();
        if (this.o) {
            if (this.p == null) {
                if (b(motionEvent)) {
                    this.m.f();
                }
            } else {
                this.p.d();
                if (!this.p.b()) {
                    this.m.f();
                } else {
                    com.censivn.C3DEngine.a.d.d().a(this.p.a(), true);
                    if (this.p != null && this.p.b()) {
                        this.p.a().f(null);
                    }
                }
            }
            this.o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f2) {
        f.position().y = 18.0f + f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MotionEvent motionEvent) {
        float[] fArrB = x.b(motionEvent.getX(), motionEvent.getY());
        e.position().x = fArrB[0];
        e.position().y = fArrB[1];
        com.tsf.shell.manager.app.TaskScheduler.a(e);
        if (this.u != null) {
            e.addChild(this.u);
        }
        if (this.r) {
            com.tsf.shell.manager.app.TaskScheduler.a(AlignmentBackKeyHandler);
            AlignmentBackKeyHandler.position().x = fArrB[0];
            AlignmentBackKeyHandler.position().y = fArrB[1];
        }
        h.position().x = fArrB[0];
        h.position().y = fArrB[1];
        com.tsf.shell.manager.app.TaskScheduler.a(h);
        jadx();
    }

    private void h() {
        if (e.parent() != null) {
            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.2
                @Override // java.lang.Runnable
                public void run() {
                    LassoSelectionHandler.d.a();
                    LassoSelectionHandler.k();
                }
            });
            if (e.parent() != null) {
                com.tsf.shell.manager.app.TaskScheduler.b(e);
            }
            if (AlignmentBackKeyHandler.parent() != null) {
                com.tsf.shell.manager.app.TaskScheduler.b(AlignmentBackKeyHandler);
            }
            if (h.parent() != null) {
                com.tsf.shell.manager.app.TaskScheduler.b(h);
            }
            if (this.u != null) {
                this.u.removeFromParent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2) {
        float fAtan;
        float x = motionEvent2.getX() - motionEvent.getX();
        float r3 = motionEvent2.getY() - motionEvent.getY();
        if (r3 > 0.0f) {
            fAtan = ((float) (Math.atan(x / r3) / 0.017453292519943295d)) + 180.0f;
        } else {
            fAtan = (float) (Math.atan(x / r3) / 0.017453292519943295d);
        }
        e.rotation().z = fAtan;
        if ((fAtan < 181.0f) & (fAtan > -1.0f)) {
            if (this.v) {
                this.v = false;
                if (this.u != null) {
                    com.censivn.C3DEngine.b.f.a.b bVarA = this.u.a(0);
                    bVarA.b(true);
                    bVarA.c(true);
                    bVarA.g();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.v) {
            this.v = true;
            if (this.u != null) {
                com.censivn.C3DEngine.b.f.a.b bVarA2 = this.u.a(0);
                bVarA2.b(false);
                bVarA2.c(false);
                bVarA2.g();
            }
        }
    }

    private static void i() {
        w = new ViewGroup.LayoutParams(-1, -1);
        i = com.censivn.C3DEngine.C3DEngine.d().getString(com.tsf.b.i.notic_line_picker_overflow);
        d = new com.tsf.shell.ShellPreferenceManager(com.censivn.C3DEngine.C3DEngine.d(), ThemeManager.mix.lasso.getTheme().shell.lassoLineColor);
        DynamicThemeRunnable dynamicThemeRunnable = new DynamicThemeRunnable() { // from class: com.tsf.shell.f.e.h.3
            @Override // com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable, com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
            public void onReloadTheme(ThemeDescription themeDescription) {
                LassoSelectionHandler.d.a(themeDescription.shell.lassoLineColor);
                LassoSelectionHandler.a.set(themeDescription.shell.lassoSelectColor);
            }
        };
        a.set(ThemeManager.mix.lasso.getTheme().shell.lassoSelectColor);
        ThemeManager.mix.lasso.addElementListener(dynamicThemeRunnable);
        e = new com.censivn.C3DEngine.b.f.j();
        e.setAnimationObjectState(true);
        c = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_FOCUS, ItemInfo.APP_INTENT, ItemInfo.APP_INTENT);
        b = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_POINT, 32, 32);
        h = new com.censivn.C3DEngine.b.f.k(32.0f, 32.0f, 1, 1, true);
        h.textures().addElement(b);
        f = new com.censivn.C3DEngine.b.f.k(32.0f, 32.0f, 1, 1, true);
        f.textures().addElement(b);
        e.addChild(f);
        g = new com.censivn.C3DEngine.b.f.k(128.0f, 128.0f, 1, 1, true);
        AlignmentBackKeyHandler.textures().addElement(c);
    }

    private static void j() {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.4
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.app.TaskScheduler.a(LassoSelectionHandler.d, LassoSelectionHandler.w);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        com.tsf.shell.manager.app.TaskScheduler.a(d);
    }

    private boolean a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = ((d4 - d2) * (d9 - d7)) - ((d5 - d3) * (d8 - d6));
        if (d10 == 0.0d) {
            return false;
        }
        double d11 = (((d3 - d7) * (d8 - d6)) - ((d2 - d6) * (d9 - d7))) / d10;
        double d12 = (((d3 - d7) * (d4 - d2)) - ((d2 - d6) * (d5 - d3))) / d10;
        if (d11 < 0.0d || d11 > 1.0d || d12 < 0.0d || d12 > 1.0d) {
            return false;
        }
        return true;
    }

    public void b() {
        this.p = null;
    }
}
