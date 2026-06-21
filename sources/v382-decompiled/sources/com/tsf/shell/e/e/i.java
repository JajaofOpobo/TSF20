package com.tsf.shell.e.e;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i {
    private static com.tsf.shell.z d;
    private static com.censivn.C3DEngine.b.f.l e;
    private static com.censivn.C3DEngine.b.f.j f;
    private static com.censivn.C3DEngine.b.f.j g;
    private static com.censivn.C3DEngine.b.f.j h;
    private static String i;
    private static ViewGroup.LayoutParams w;
    private ArrayList l;
    private j m;
    private com.censivn.C3DEngine.b.f.j n;
    private q p;
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
    private ArrayList q = new ArrayList();

    static {
        i();
    }

    public void a(j jVar) {
        this.m = jVar;
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        this.n = jVar;
    }

    public void a(boolean z) {
        this.r = z;
    }

    public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (!this.k) {
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.e.i.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (i.d.getPointCount() <= 200) {
                        if (i.this.j) {
                            i.this.s = motionEvent.getX();
                            i.this.t = motionEvent.getY();
                            i.this.l = com.tsf.shell.manager.a.h.G();
                            i.this.j = false;
                            i.this.c(motionEvent);
                            final MotionEvent motionEvent3 = motionEvent;
                            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.i.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    i.d.a(motionEvent3.getX(), motionEvent3.getY() + 38.0f);
                                }
                            });
                        }
                        if (i.this.p != null && i.this.p.b()) {
                            i.this.p.a().a(motionEvent, motionEvent2);
                            return;
                        }
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float x2 = motionEvent2.getX();
                        float y2 = motionEvent2.getY();
                        if (com.tsf.shell.utils.x.b(i.this.s, i.this.t, x2, y2) > 10.0f) {
                            i.this.s = x2;
                            i.this.t = y2;
                            i.this.a((float) Math.sqrt(Math.pow(motionEvent.getX() - motionEvent2.getX(), 2.0d) + Math.pow(motionEvent.getY() - motionEvent2.getY(), 2.0d)));
                            i.this.b(motionEvent, motionEvent2);
                            final MotionEvent motionEvent4 = motionEvent2;
                            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.i.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    i.d.b(motionEvent4.getX(), motionEvent4.getY());
                                }
                            });
                            if (!i.this.o || com.tsf.shell.utils.x.b(x, y, x2, y2) >= 50.0f) {
                                Iterator it = i.this.l.iterator();
                                while (it.hasNext()) {
                                    com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                                    if ((jVar instanceof p) && jVar != i.this.n) {
                                        p pVar = (p) jVar;
                                        if (!pVar.c_() && pVar.d() && i.this.a(jVar, x, y, x2, y2)) {
                                            pVar.b(true);
                                            i.this.m.a(pVar);
                                            i.this.o = true;
                                            i.this.q.add(pVar);
                                        }
                                    }
                                }
                                return;
                            }
                            i.this.b((MotionEvent) null);
                            return;
                        }
                        return;
                    }
                    i.this.a((MotionEvent) null);
                    i.this.k = true;
                    com.tsf.shell.k.a(i.i);
                }
            });
        }
    }

    public boolean a(com.censivn.C3DEngine.b.f.j jVar, float f2, float f3, float f4, float f5) {
        Number3d clone = jVar.position().m4clone();
        clone.x += com.censivn.C3DEngine.b.b.a.H;
        clone.y = com.censivn.C3DEngine.b.b.a.I - clone.y;
        if (a(f2, f3, f4, f5, jVar.minX() + clone.x, jVar.minY() + clone.y, jVar.maxX() + clone.x, jVar.minY() + clone.y) || a(f2, f3, f4, f5, jVar.maxX() + clone.x, jVar.minY() + clone.y, jVar.maxX() + clone.x, jVar.maxY() + clone.y) || a(f2, f3, f4, f5, jVar.minX() + clone.x, jVar.maxY() + clone.y, jVar.maxX() + clone.x, jVar.maxY() + clone.y)) {
            return true;
        }
        if (a(f2, f3, f4, f5, jVar.minX() + clone.x, jVar.minY() + clone.y, jVar.minX() + clone.x, clone.y + jVar.maxY())) {
            return true;
        }
        return false;
    }

    public boolean a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(MotionEvent motionEvent) {
        this.p = this.m.j_();
        if (this.p != null) {
            this.p.a(this);
            if (motionEvent == null) {
                this.p.c();
            } else {
                float[] a2 = com.tsf.shell.utils.x.a(motionEvent, new float[2]);
                this.p.a((int) a2[0], (int) a2[1]);
                this.p.g();
            }
            g();
        }
        return this.p == null;
    }

    private void g() {
        h();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((p) it.next()).b(false);
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
                    com.censivn.C3DEngine.a.h.d().a(this.p.a(), true);
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
        float[] b2 = com.tsf.shell.utils.x.b(motionEvent.getX(), motionEvent.getY());
        e.position().x = b2[0];
        e.position().y = b2[1];
        com.tsf.shell.manager.a.j.a(e);
        if (this.u != null) {
            e.addChild(this.u);
        }
        if (this.r) {
            com.tsf.shell.manager.a.j.a(g);
            g.position().x = b2[0];
            g.position().y = b2[1];
        }
        h.position().x = b2[0];
        h.position().y = b2[1];
        com.tsf.shell.manager.a.j.a(h);
        j();
    }

    private void h() {
        if (e.parent() != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.i.2
                @Override // java.lang.Runnable
                public void run() {
                    i.d.a();
                    i.k();
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
        float atan;
        float x = motionEvent2.getX() - motionEvent.getX();
        if (motionEvent2.getY() - motionEvent.getY() > 0.0f) {
            atan = ((float) (Math.atan(x / r3) / 0.017453292519943295d)) + 180.0f;
        } else {
            atan = (float) (Math.atan(x / r3) / 0.017453292519943295d);
        }
        e.rotation().z = atan;
        if ((atan < 181.0f) & (atan > -1.0f)) {
            if (this.v) {
                this.v = false;
                if (this.u != null) {
                    com.censivn.C3DEngine.b.f.a.b a2 = this.u.a(0);
                    a2.b(true);
                    a2.c(true);
                    a2.g();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.v) {
            this.v = true;
            if (this.u != null) {
                com.censivn.C3DEngine.b.f.a.b a3 = this.u.a(0);
                a3.b(false);
                a3.c(false);
                a3.g();
            }
        }
    }

    private static void i() {
        w = new ViewGroup.LayoutParams(-1, -1);
        i = com.censivn.C3DEngine.a.d().getString(R.string.notic_line_picker_overflow);
        d = new com.tsf.shell.z(com.censivn.C3DEngine.a.d(), ThemeManager.mix.lasso.getTheme().shell.lassoLineColor);
        DynamicThemeRunnable dynamicThemeRunnable = new DynamicThemeRunnable() { // from class: com.tsf.shell.e.e.i.3
            @Override // com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable, com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
            public void onReloadTheme(ThemeDescription themeDescription) {
                i.d.a(themeDescription.shell.lassoLineColor);
                i.a.set(themeDescription.shell.lassoSelectColor);
            }
        };
        a.set(ThemeManager.mix.lasso.getTheme().shell.lassoSelectColor);
        ThemeManager.mix.lasso.addElementListener(dynamicThemeRunnable);
        e = new com.censivn.C3DEngine.b.f.l();
        e.setAnimationObjectState(true);
        c = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_FOCUS, ItemInfo.APP_INTENT, ItemInfo.APP_INTENT);
        b = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_POINT, 32, 32);
        h = new com.censivn.C3DEngine.b.f.m(32.0f, 32.0f, 1, 1, true);
        h.textures().addElement(b);
        f = new com.censivn.C3DEngine.b.f.m(32.0f, 32.0f, 1, 1, true);
        f.textures().addElement(b);
        e.addChild(f);
        g = new com.censivn.C3DEngine.b.f.m(128.0f, 128.0f, 1, 1, true);
        g.textures().addElement(c);
    }

    private static void j() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.i.4
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.j.a(i.d, i.w);
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
