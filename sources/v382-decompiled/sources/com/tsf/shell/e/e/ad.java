package com.tsf.shell.e.e;

import android.content.ContentValues;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;

/* loaded from: classes.dex */
class ad extends com.censivn.C3DEngine.b.f.b.a {
    public static int a = 120;
    private int d;
    private int e;
    private DynamicTextureElement f;
    private ad g;
    private aa h;
    private com.censivn.C3DEngine.b.f.m i;
    private com.censivn.C3DEngine.b.f.m j;
    private com.censivn.C3DEngine.b.f.m k;
    private com.censivn.C3DEngine.b.f.m l;
    private com.censivn.C3DEngine.b.f.p m;
    private com.censivn.C3DEngine.b.g.b.b n;
    private int o;
    private float p;
    private float q;
    private float r;
    private float s;
    private int[] t;

    public ad(float f, float f2, com.censivn.C3DEngine.b.f.b.b bVar, aa aaVar) {
        super(f, f2, bVar);
        this.o = 3;
        this.t = new int[4];
        this.g = this;
        this.h = aaVar;
        this.n = new com.censivn.C3DEngine.b.g.b.b();
        this.f = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, 64, 64);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.e.ad.1
            @Override // java.lang.Runnable
            public void run() {
                ad.this.d = ad.this.f.id;
            }
        };
        this.f.setReloadThemeRunnable(runnable);
        runnable.run();
        final DynamicTextureElement textureElement = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON, 64, 64);
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.e.e.ad.2
            @Override // java.lang.Runnable
            public void run() {
                ad.this.e = textureElement.id;
            }
        };
        textureElement.setReloadThemeRunnable(runnable2);
        runnable2.run();
        textures().addElement(c.e);
        this.m = new com.censivn.C3DEngine.b.f.p();
        this.m.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.e.ad.3
            private float b;
            private float d;
            private float e;
            private float f;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                boolean z;
                com.tsf.shell.e.i.b.b.a aVar;
                com.tsf.shell.e.i.b.b.a aVar2;
                z = aa.e;
                if (z) {
                    aVar = aa.c;
                    this.b = aVar.position().x;
                    aVar2 = aa.c;
                    this.d = aVar2.position().y;
                    this.e = ad.this.h.position().x;
                    this.f = ad.this.h.position().y;
                    ad.this.h.setAnimationObjectState(true);
                    ad.this.h.invalidate();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
                boolean z;
                com.tsf.shell.e.i.b.b.a aVar;
                com.tsf.shell.e.i.b.b.a aVar2;
                com.tsf.shell.e.i.b.b.a aVar3;
                com.tsf.shell.e.i.b.b.a aVar4;
                com.tsf.shell.e.i.b.b.a aVar5;
                com.tsf.shell.e.i.b.b.a aVar6;
                com.tsf.shell.e.i.b.b.a aVar7;
                com.tsf.shell.e.i.b.b.a aVar8;
                com.tsf.shell.e.i.b.b.a aVar9;
                com.tsf.shell.e.i.b.b.a aVar10;
                z = aa.e;
                if (z) {
                    float x = motionEvent2.getX() - motionEvent.getX();
                    float y = motionEvent2.getY() - motionEvent.getY();
                    float f5 = this.b + x;
                    aVar = aa.c;
                    if (f5 + (aVar.b.b() / 2.0f) > com.censivn.C3DEngine.b.b.a.t) {
                        float f6 = com.censivn.C3DEngine.b.b.a.t;
                        aVar10 = aa.c;
                        x = (f6 - (aVar10.b.b() / 2.0f)) - this.b;
                    } else {
                        float f7 = this.b + x;
                        aVar2 = aa.c;
                        if (f7 - (aVar2.b.b() / 2.0f) < com.censivn.C3DEngine.b.b.a.r) {
                            float f8 = com.censivn.C3DEngine.b.b.a.r;
                            aVar3 = aa.c;
                            x = (f8 + (aVar3.b.b() / 2.0f)) - this.b;
                        }
                    }
                    float f9 = this.d - y;
                    aVar4 = aa.c;
                    if (f9 + (aVar4.b.c() / 2.0f) > com.censivn.C3DEngine.b.b.a.s) {
                        float f10 = -com.censivn.C3DEngine.b.b.a.s;
                        aVar9 = aa.c;
                        y = f10 + (aVar9.b.c() / 2.0f) + this.d;
                    } else {
                        float f11 = this.d - y;
                        aVar5 = aa.c;
                        if (f11 - (aVar5.b.c() / 2.0f) < com.censivn.C3DEngine.b.b.a.u) {
                            float f12 = -com.censivn.C3DEngine.b.b.a.u;
                            aVar6 = aa.c;
                            y = (f12 - (aVar6.b.c() / 2.0f)) + this.d;
                        }
                    }
                    aVar7 = aa.c;
                    aVar7.position().x = this.b + x;
                    ad.this.h.position().x = x + this.e;
                    aVar8 = aa.c;
                    aVar8.position().y = this.d - y;
                    ad.this.h.position().y = this.f - y;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                boolean z;
                com.tsf.shell.e.i.b.b.a aVar;
                com.tsf.shell.e.i.b.b.a aVar2;
                com.tsf.shell.e.i.b.b.a aVar3;
                com.tsf.shell.e.i.b.b.a aVar4;
                com.tsf.shell.e.i.b.b.a aVar5;
                com.tsf.shell.e.i.b.b.a aVar6;
                final com.tsf.shell.e.i.b.b.a aVar7;
                z = aa.e;
                if (z) {
                    ad.this.h.setAnimationObjectState(false);
                    aVar = aa.c;
                    com.tsf.shell.d.g gVar = (com.tsf.shell.d.g) aVar.g.getLayoutParams();
                    aVar2 = aa.c;
                    float f3 = aVar2.position().x;
                    aVar3 = aa.c;
                    int b = (int) ((f3 - (aVar3.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                    aVar4 = aa.c;
                    float f4 = (-aVar4.position().y) + com.censivn.C3DEngine.b.b.a.I;
                    aVar5 = aa.c;
                    int[] iArr = {b, (int) (f4 - (aVar5.b.c() / 2.0f)), gVar.d, gVar.e};
                    aVar6 = aa.c;
                    ItemInfo K = aVar6.K();
                    if (com.censivn.C3DEngine.b.b.a.O) {
                        int i = iArr[0];
                        gVar.a = i;
                        K.cellX = i;
                        int i2 = iArr[1];
                        gVar.b = i2;
                        K.cellY = i2;
                    } else {
                        int i3 = iArr[0];
                        gVar.a = i3;
                        K.cellXH = i3;
                        int i4 = iArr[1];
                        gVar.b = i4;
                        K.cellYH = i4;
                    }
                    aVar7 = aa.c;
                    com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.ad.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (aVar7 != null && aVar7.g != null) {
                                aVar7.g.requestLayout();
                            }
                        }
                    });
                }
            }
        });
        addChild(this.m);
        this.i = c(0);
        this.j = c(1);
        this.k = c(2);
        this.l = c(3);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
        mouseSkip(true);
        b(0);
    }

    public void a(float f, float f2, float f3, float f4) {
        this.m.setAABBPX(f, f2, 1.0f, f3, f4, 1.0f);
    }

    public void g() {
        a(-f(), -d(), e(), a());
    }

    private void b(int i) {
        switch (i) {
            case 0:
                textures().removeAll();
                textures().addElement(c.e);
                this.f.id = this.d;
                break;
            case 1:
                textures().removeAll();
                textures().addElement(c.f);
                this.f.id = this.e;
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onKillFocus() {
        aa.a.h();
    }

    private com.censivn.C3DEngine.b.f.m c(int i) {
        com.censivn.C3DEngine.b.f.m mVar = new com.censivn.C3DEngine.b.f.m(64.0f, 64.0f);
        switch (i) {
            case 0:
                mVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                break;
            case 1:
                mVar.rotation().z = 180.0f;
                mVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                break;
            case 2:
                mVar.rotation().z = 90.0f;
                mVar.moveAllPointsSP(0.0f, -33.0f, 0.0f);
                break;
            case 3:
                mVar.rotation().z = 270.0f;
                mVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                break;
        }
        mVar.calAABB();
        mVar.maxY(mVar.maxY() + (80.0f * com.censivn.C3DEngine.b.b.a.b));
        mVar.minY(mVar.minY() + (com.censivn.C3DEngine.b.b.a.b * 38.0f));
        mVar.minX(mVar.minX() - (com.censivn.C3DEngine.b.b.a.b * 38.0f));
        mVar.maxX(mVar.maxX() + (com.censivn.C3DEngine.b.b.a.b * 38.0f));
        mVar.textures().addElement(this.f);
        mVar.setMouseEventListener(new ab(this.g, this, i));
        addChild(mVar);
        return mVar;
    }

    public void a(final int i, final int i2) {
        final int i3;
        final int i4;
        if (i > i2) {
            i4 = com.censivn.C3DEngine.b.b.a.F;
            i3 = (i4 * i2) / i;
        } else {
            i3 = com.censivn.C3DEngine.b.b.a.G;
            i4 = (i3 * i) / i2;
        }
        this.g.a(i + i4, i2 + i3);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.ad.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                ad.this.g.a(i + (i4 * (1.0f - f)), i2 + (i3 * (1.0f - f)));
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.w.a(this.n);
        com.censivn.C3DEngine.b.g.w.a(this.n, 250, xVar);
        this.p = i / 2;
        this.q = i / 2;
        this.r = i2 / 2;
        this.s = i2 / 2;
    }

    @Override // com.censivn.C3DEngine.b.f.m
    public void a(float f, float f2) {
        super.b(f, f2);
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.i.position().x = 0.0f;
        this.i.position().y = (f4 - this.o) - 1.0f;
        this.j.position().x = 0.0f;
        this.j.position().y = (-f4) + this.o + 1.0f;
        this.k.position().x = (-f3) + this.o;
        this.k.position().y = 0.0f;
        this.l.position().x = (f3 - this.o) - 3.0f;
        this.l.position().y = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void i(float f) {
        super.i(f);
        this.k.position().x = (-f) + this.o;
        float f2 = (-f()) + ((f() + e()) / 2.0f);
        this.i.position().x = f2;
        this.j.position().x = f2;
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void g(float f) {
        super.g(f);
        this.l.position().x = (f - this.o) - 3.0f;
        float f2 = (-f()) + ((f() + e()) / 2.0f);
        this.i.position().x = f2;
        this.j.position().x = f2;
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void c(float f) {
        super.c(f);
        this.i.position().y = (f - this.o) - 1.0f;
        float a2 = a() - ((d() + a()) / 2.0f);
        this.k.position().y = a2;
        this.l.position().y = a2;
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.b.a
    public void e(float f) {
        super.e(f);
        this.j.position().y = (-f) + this.o + 1.0f;
        float a2 = a() - ((d() + a()) / 2.0f);
        this.k.position().y = a2;
        this.l.position().y = a2;
        g();
    }

    public void h() {
    }

    public void i() {
        com.tsf.shell.e.i.b.b.a aVar;
        com.tsf.shell.d.g gVar;
        com.tsf.shell.d.g gVar2;
        com.tsf.shell.d.g gVar3;
        com.tsf.shell.d.g gVar4;
        com.tsf.shell.d.g gVar5;
        com.tsf.shell.d.g gVar6;
        com.tsf.shell.d.g gVar7;
        com.tsf.shell.d.g gVar8;
        aVar = aa.c;
        ItemInfo K = aVar.K();
        if (com.censivn.C3DEngine.b.b.a.O) {
            gVar5 = aa.d;
            K.cellX = gVar5.a;
            gVar6 = aa.d;
            K.cellY = gVar6.b;
            gVar7 = aa.d;
            K.width = gVar7.d;
            gVar8 = aa.d;
            K.height = gVar8.e;
        } else {
            gVar = aa.d;
            K.cellXH = gVar.a;
            gVar2 = aa.d;
            K.cellYH = gVar2.b;
            gVar3 = aa.d;
            K.widthH = gVar3.d;
            gVar4 = aa.d;
            K.heightH = gVar4.e;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("cellX", String.valueOf(K.cellX) + "," + K.cellXH);
        contentValues.put("cellY", String.valueOf(K.cellY) + "," + K.cellYH);
        contentValues.put("spanX", String.valueOf(K.width) + "," + K.widthH);
        contentValues.put("spanY", String.valueOf(K.height) + "," + K.heightH);
        com.tsf.shell.manager.bind.d.a(contentValues, K, (Runnable) null);
    }

    public void j() {
        com.censivn.C3DEngine.b.g.w.a(this.n);
    }

    private int[] a(int i, int i2, int i3, int i4, boolean z) {
        this.t[0] = i;
        this.t[1] = i2;
        this.t[2] = i3;
        this.t[3] = i4;
        if (z) {
            com.tsf.shell.manager.r.a.a(this.t);
        } else {
            com.tsf.shell.manager.r.a.b(this.t);
        }
        b(0);
        return this.t;
    }

    private boolean b(int i, int i2, int i3, int i4, boolean z) {
        boolean b;
        this.t[0] = i;
        this.t[1] = i2;
        this.t[2] = i3;
        this.t[3] = i4;
        if (z) {
            b = com.tsf.shell.manager.r.a.a(this.t);
        } else {
            b = com.tsf.shell.manager.r.a.b(this.t);
        }
        if (b) {
            b(1);
            return false;
        }
        b(0);
        return true;
    }

    public void a(int i) {
        com.tsf.shell.d.g gVar;
        com.tsf.shell.d.g gVar2;
        com.tsf.shell.d.g gVar3;
        com.tsf.shell.d.g gVar4;
        com.tsf.shell.d.g gVar5;
        com.tsf.shell.d.g gVar6;
        com.tsf.shell.d.g gVar7;
        com.tsf.shell.d.g gVar8;
        boolean z = true;
        a(i, true);
        switch (i) {
            case 0:
                gVar4 = aa.d;
                this.r = gVar4.e - this.s;
                break;
            case 1:
                gVar3 = aa.d;
                this.s = gVar3.e - this.r;
                z = false;
                break;
            case 2:
                gVar2 = aa.d;
                this.p = gVar2.d - this.q;
                break;
            case 3:
                gVar = aa.d;
                this.q = gVar.d - this.p;
                z = false;
                break;
        }
        gVar5 = aa.d;
        int i2 = gVar5.a;
        gVar6 = aa.d;
        int i3 = gVar6.b;
        gVar7 = aa.d;
        int i4 = gVar7.d;
        gVar8 = aa.d;
        b(i2, i3, i4, gVar8.e, z);
        final float f = f();
        final float e = e();
        final float a2 = a();
        final float d = d();
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.ad.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                if (f != ad.this.p) {
                    ad.this.g.i(f + ((ad.this.p - f) * f2));
                }
                if (e != ad.this.q) {
                    ad.this.g.g(e + ((ad.this.q - e) * f2));
                }
                if (a2 != ad.this.r) {
                    ad.this.g.c(a2 + ((ad.this.r - a2) * f2));
                }
                if (d != ad.this.s) {
                    ad.this.g.e(d + ((ad.this.s - d) * f2));
                }
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.a((com.censivn.C3DEngine.b.g.v) new com.censivn.C3DEngine.b.g.k());
        com.censivn.C3DEngine.b.g.w.a(this.n);
        com.censivn.C3DEngine.b.g.w.a(this.n, 1000, xVar);
    }

    private void a(int i, boolean z) {
        com.tsf.shell.d.g gVar;
        com.tsf.shell.d.g gVar2;
        com.tsf.shell.d.g gVar3;
        com.tsf.shell.d.g gVar4;
        com.tsf.shell.d.g gVar5;
        com.tsf.shell.d.g gVar6;
        com.tsf.shell.d.g gVar7;
        com.tsf.shell.e.i.b.b.a aVar;
        com.tsf.shell.d.g gVar8;
        com.tsf.shell.d.g gVar9;
        com.tsf.shell.d.g gVar10;
        com.tsf.shell.d.g gVar11;
        com.tsf.shell.d.g gVar12;
        com.tsf.shell.d.g gVar13;
        com.tsf.shell.e.i.b.b.a aVar2;
        com.tsf.shell.d.g gVar14;
        com.tsf.shell.d.g gVar15;
        com.tsf.shell.d.g gVar16;
        com.tsf.shell.d.g gVar17;
        com.tsf.shell.d.g gVar18;
        com.tsf.shell.d.g gVar19;
        com.tsf.shell.d.g gVar20;
        com.tsf.shell.e.i.b.b.a aVar3;
        com.tsf.shell.d.g gVar21;
        com.tsf.shell.d.g gVar22;
        com.tsf.shell.d.g gVar23;
        com.tsf.shell.d.g gVar24;
        com.tsf.shell.d.g gVar25;
        com.tsf.shell.d.g gVar26;
        com.tsf.shell.e.i.b.b.a aVar4;
        switch (i) {
            case 0:
                int a2 = (int) ((com.censivn.C3DEngine.b.b.a.I - aa.a.position().y) - a());
                int d = ((int) ((com.censivn.C3DEngine.b.b.a.I - aa.a.position().y) + d())) - a2;
                if (z) {
                    gVar23 = aa.d;
                    int i2 = gVar23.a;
                    gVar24 = aa.d;
                    int[] a3 = a(i2, a2, gVar24.d, d, true);
                    gVar25 = aa.d;
                    gVar25.b = a3[1];
                    gVar26 = aa.d;
                    gVar26.e = a3[3];
                    aVar4 = aa.c;
                    aVar4.ag();
                    break;
                } else {
                    gVar21 = aa.d;
                    int i3 = gVar21.a;
                    gVar22 = aa.d;
                    b(i3, a2, gVar22.d, d, true);
                    break;
                }
            case 1:
                int a4 = (int) (a() + d());
                if (z) {
                    gVar17 = aa.d;
                    int i4 = gVar17.a;
                    gVar18 = aa.d;
                    int i5 = gVar18.b;
                    gVar19 = aa.d;
                    int[] a5 = a(i4, i5, gVar19.d, a4, false);
                    gVar20 = aa.d;
                    gVar20.e = a5[3];
                    aVar3 = aa.c;
                    aVar3.ag();
                    break;
                } else {
                    gVar14 = aa.d;
                    int i6 = gVar14.a;
                    gVar15 = aa.d;
                    int i7 = gVar15.b;
                    gVar16 = aa.d;
                    b(i6, i7, gVar16.d, a4, false);
                    break;
                }
            case 2:
                int f = (int) ((aa.a.position().x - f()) + com.censivn.C3DEngine.b.b.a.H);
                int e = ((int) ((aa.a.position().x + e()) + com.censivn.C3DEngine.b.b.a.H)) - f;
                if (z) {
                    gVar10 = aa.d;
                    int i8 = gVar10.b;
                    gVar11 = aa.d;
                    int[] a6 = a(f, i8, e, gVar11.e, true);
                    gVar12 = aa.d;
                    gVar12.a = a6[0];
                    gVar13 = aa.d;
                    gVar13.d = a6[2];
                    aVar2 = aa.c;
                    aVar2.ag();
                    break;
                } else {
                    gVar8 = aa.d;
                    int i9 = gVar8.b;
                    gVar9 = aa.d;
                    b(f, i9, e, gVar9.e, true);
                    break;
                }
            case 3:
                int f2 = (int) (f() + e());
                if (z) {
                    gVar4 = aa.d;
                    int i10 = gVar4.a;
                    gVar5 = aa.d;
                    int i11 = gVar5.b;
                    gVar6 = aa.d;
                    int[] a7 = a(i10, i11, f2, gVar6.e, false);
                    gVar7 = aa.d;
                    gVar7.d = a7[2];
                    aVar = aa.c;
                    aVar.ag();
                    break;
                } else {
                    gVar = aa.d;
                    int i12 = gVar.a;
                    gVar2 = aa.d;
                    int i13 = gVar2.b;
                    gVar3 = aa.d;
                    b(i12, i13, f2, gVar3.e, false);
                    break;
                }
        }
    }

    public void a(int i, float f) {
        switch (i) {
            case 0:
                if ((this.r - f) + d() < a) {
                    f = (this.r + d()) - a;
                }
                c(this.r - f);
                a(i, false);
                break;
            case 1:
                if (this.s + f + a() < a) {
                    f = (a - this.s) - a();
                }
                e(this.s + f);
                a(i, false);
                break;
            case 2:
                if ((this.p - f) + e() < a) {
                    f = (this.p + e()) - a;
                }
                i(this.p - f);
                a(i, false);
                break;
            case 3:
                if (this.q + f + f() < a) {
                    f = (a - this.q) - f();
                }
                g(this.q + f);
                a(i, false);
                break;
        }
    }
}
