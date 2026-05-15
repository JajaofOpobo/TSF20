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
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    private static com.tsf.shell.i d;
    private static com.censivn.C3DEngine.b.f.j e;
    private static com.censivn.C3DEngine.b.f.i f;
    private static com.censivn.C3DEngine.b.f.i g;
    private static com.censivn.C3DEngine.b.f.i h;
    private static String i;
    private static ViewGroup.LayoutParams w;
    private ArrayList<com.censivn.C3DEngine.b.f.i> l;
    private a m;
    private com.censivn.C3DEngine.b.f.i n;
    private n p;
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
    private ArrayList<m> q = new ArrayList<>();

    public interface a {
        void a(m mVar);

        void f();

        n l_();
    }

    static {
        i();
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        this.n = iVar;
    }

    public void a(boolean z) {
        this.r = z;
    }

    public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (!this.k) {
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.e.h.1
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
                    if (h.d.getPointCount() <= 200) {
                        if (h.this.j) {
                            h.this.s = motionEvent.getX();
                            h.this.t = motionEvent.getY();
                            h.this.l = com.tsf.shell.manager.a.h.G();
                            h.this.j = false;
                            h.this.c(motionEvent);
                            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    h.d.a(motionEvent.getX(), motionEvent.getY() + 38.0f);
                                }
                            });
                        }
                        if (h.this.p != null && h.this.p.b()) {
                            h.this.p.a().a(motionEvent, motionEvent2);
                            return;
                        }
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float x2 = motionEvent2.getX();
                        float y2 = motionEvent2.getY();
                        if (x.b(h.this.s, h.this.t, x2, y2) > 10.0f) {
                            h.this.s = x2;
                            h.this.t = y2;
                            h.this.a((float) Math.sqrt(Math.pow(motionEvent.getX() - motionEvent2.getX(), 2.0d) + Math.pow(motionEvent.getY() - motionEvent2.getY(), 2.0d)));
                            h.this.b(motionEvent, motionEvent2);
                            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    h.d.b(motionEvent2.getX(), motionEvent2.getY());
                                }
                            });
                            if (!h.this.o || x.b(x, y, x2, y2) >= 50.0f) {
                                for (com.censivn.C3DEngine.b.f.i iVar : h.this.l) {
                                    if ((iVar instanceof m) && iVar != h.this.n) {
                                        m mVar = (m) iVar;
                                        if (!mVar.e_() && mVar.d() && h.this.a(iVar, x, y, x2, y2)) {
                                            mVar.b(true);
                                            h.this.m.a(mVar);
                                            h.this.o = true;
                                            h.this.q.add(mVar);
                                        }
                                    }
                                }
                                return;
                            }
                            h.this.b((MotionEvent) null);
                            return;
                        }
                        return;
                    }
                    h.this.a((MotionEvent) null);
                    h.this.k = true;
                    com.tsf.shell.e.a(h.i);
                }
            });
        }
    }

    public boolean a(com.censivn.C3DEngine.b.f.i iVar, float f2, float f3, float f4, float f5) {
        Number3d number3dClone = iVar.position().m4clone();
        number3dClone.x += com.censivn.C3DEngine.b.b.a.H;
        number3dClone.y = com.censivn.C3DEngine.b.b.a.I - number3dClone.y;
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
            g();
        }
        return this.p == null;
    }

    private void g() {
        h();
        Iterator<m> it = this.q.iterator();
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
        g();
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
        com.tsf.shell.manager.a.j.a(e);
        if (this.u != null) {
            e.addChild(this.u);
        }
        if (this.r) {
            com.tsf.shell.manager.a.j.a(g);
            g.position().x = fArrB[0];
            g.position().y = fArrB[1];
        }
        h.position().x = fArrB[0];
        h.position().y = fArrB[1];
        com.tsf.shell.manager.a.j.a(h);
        j();
    }

    private void h() {
        if (e.parent() != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.2
                @Override // java.lang.Runnable
                public void run() {
                    h.d.a();
                    h.k();
                }
            });
            if (e.parent() != null) {
                com.tsf.shell.manager.a.j.b(e);
            }
            if (g.parent() != null) {
                com.tsf.shell.manager.a.j.b(g);
            }
            if (h.parent() != null) {
                com.tsf.shell.manager.a.j.b(h);
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
        if (motionEvent2.getY() - motionEvent.getY() > 0.0f) {
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
        i = com.censivn.C3DEngine.a.d().getString(b.i.notic_line_picker_overflow);
        d = new com.tsf.shell.i(com.censivn.C3DEngine.a.d(), ThemeManager.mix.lasso.getTheme().shell.lassoLineColor);
        DynamicThemeRunnable dynamicThemeRunnable = new DynamicThemeRunnable() { // from class: com.tsf.shell.f.e.h.3
            @Override // com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable, com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
            public void onReloadTheme(ThemeDescription themeDescription) {
                h.d.a(themeDescription.shell.lassoLineColor);
                h.a.set(themeDescription.shell.lassoSelectColor);
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
        g.textures().addElement(c);
    }

    private static void j() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.e.h.4
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.j.a(h.d, h.w);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        com.tsf.shell.manager.a.j.a(d);
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
