package com.tsf.shell.workspace3D.g.c;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.b.w;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.R;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.k.ae;
import com.tsf.shell.workspace3D.k.ah;
import com.tsf.shell.workspace3D.k.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements at, p, com.tsf.shell.workspace3D.g.e.c {
    public static float a;
    private static HashMap d;
    private ArrayList g;
    private ArrayList h;
    private v i;
    private r j;
    private float k;
    private float l;
    private z m;
    private o n;
    private int o;
    private com.tsf.shell.workspace3D.k.p r;
    private q s;
    private j t;
    private final int e = 9;
    private final int f = 84;
    private boolean p = false;
    private boolean q = false;
    private boolean u = false;
    boolean b = false;
    private a c = this;

    public final boolean a() {
        return this.p;
    }

    @Override // com.tsf.shell.workspace3D.g.e.c
    public final void a(Bitmap bitmap) {
        if (this.r != null) {
            this.r.a(bitmap);
            this.r = null;
        }
    }

    static /* synthetic */ void a(a aVar, j jVar) {
        if (aVar.t != null) {
            aVar.t.a = false;
        }
        aVar.t = jVar;
        if (aVar.t != null) {
            aVar.t.a = true;
        }
    }

    public a() {
        a = 268.0f * com.censivn.C3DEngine.a.b;
        this.h = new ArrayList();
        this.s = new q();
        this.i = new b(this);
        this.i.a(new com.censivn.C3DEngine.b.l(this.i));
        this.i.f(true);
        this.g = new ArrayList();
        for (int i = 0; i < 9; i++) {
            this.g.add(new j(this));
        }
        if (d == null) {
            d = new HashMap();
            d.put(0, new e(this, ThemeShellDescription.ICON_MENU_DETAIL_ON, ThemeShellDescription.ICON_MENU_DETAIL_OFF, 0));
            d.put(1, new e(this, ThemeShellDescription.ICON_MENU_RENAME_ON, ThemeShellDescription.ICON_MENU_RENAME_OFF, 1));
            d.put(2, new e(this, ThemeShellDescription.ICON_MENU_ICON_ON, ThemeShellDescription.ICON_MENU_ICON_OFF, 2));
            d.put(3, new e(this, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF, 3));
            d.put(4, new e(this, ThemeShellDescription.ICON_MENU_DELETE_ON, ThemeShellDescription.ICON_MENU_DELETE_OFF, 4));
            d.put(5, new e(this, ThemeShellDescription.ICON_MENU_UNINSTALL_ON, ThemeShellDescription.ICON_MENU_UNINSTALL_OFF, 5));
            d.put(6, new e(this, ThemeShellDescription.ICON_MENU_RESET_ON, ThemeShellDescription.ICON_MENU_RESET_OFF, 6));
            d.put(7, new e(this, ThemeShellDescription.ICON_MENU_ALIGN_ON, ThemeShellDescription.ICON_MENU_ALIGN_OFF, 7));
            d.put(-1, new e(this, ThemeShellDescription.ICON_MENU_MORE_ON, ThemeShellDescription.ICON_MENU_MORE_OFF, -1));
        }
        this.j = new r();
        this.i.d(this.j);
        for (int i2 = 0; i2 < 9; i2++) {
            j jVar = (j) this.g.get(i2);
            jVar.F.a((com.censivn.C3DEngine.b.l) new c(this, this.i, jVar));
            jVar.F.ar();
        }
    }

    static /* synthetic */ boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }

    static /* synthetic */ void b(a aVar, j jVar) {
        int i;
        int i2 = 0;
        if (jVar == null || jVar.E == null) {
            return;
        }
        int i3 = jVar.E.c;
        switch (i3) {
            case -1:
                if (!aVar.b) {
                    aVar.b = true;
                    Iterator it = aVar.h.iterator();
                    while (it.hasNext()) {
                        j jVar2 = (j) it.next();
                        jVar2.Q();
                        aVar.i.a(jVar2, 2);
                    }
                    Iterator it2 = aVar.i.aD().iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it2.next();
                        if (rVar instanceof j) {
                            j jVar3 = (j) rVar;
                            if (i2 > 0) {
                                if (jVar3.D) {
                                    jVar3.a(i2, i4 * 120, com.censivn.C3DEngine.g.a.e);
                                    i = i4 + 1;
                                    i2++;
                                    i4 = i;
                                } else {
                                    jVar3.a(i2, com.censivn.C3DEngine.g.a.a);
                                }
                            }
                            i = i4;
                            i2++;
                            i4 = i;
                        }
                    }
                    break;
                } else {
                    aVar.b = false;
                    Iterator it3 = aVar.h.iterator();
                    int i5 = 0;
                    while (it3.hasNext()) {
                        ((j) it3.next()).a(i5);
                        i5++;
                    }
                    Iterator it4 = aVar.i.aD().iterator();
                    while (it4.hasNext()) {
                        com.censivn.C3DEngine.b.r rVar2 = (com.censivn.C3DEngine.b.r) it4.next();
                        if (rVar2 instanceof j) {
                            j jVar4 = (j) rVar2;
                            if (!jVar4.D) {
                                jVar4.a(i2, com.censivn.C3DEngine.g.a.a);
                                i2++;
                            }
                        }
                    }
                    break;
                }
            case 0:
                if (!(aVar.m instanceof ah)) {
                    if (aVar.m instanceof ae) {
                        com.tsf.shell.workspace3D.z.b();
                        ((ae) aVar.m).bW();
                        break;
                    }
                } else {
                    com.tsf.shell.workspace3D.z.b();
                    ((ah) aVar.m).bY();
                    break;
                }
                break;
            case 1:
                com.tsf.shell.workspace3D.z.b();
                g gVar = new g(aVar.m);
                com.censivn.C3DEngine.a.a();
                w.a(gVar);
                break;
            case 2:
                if (aVar.m instanceof com.tsf.shell.workspace3D.k.p) {
                    com.tsf.shell.workspace3D.z.b();
                    com.tsf.shell.workspace3D.k.p pVar = (com.tsf.shell.workspace3D.k.p) aVar.m;
                    aVar.r = pVar;
                    int[] aH = pVar.aH();
                    com.tsf.shell.workspace3D.g.e.a.a(aVar, aH[0], aH[1]);
                    break;
                }
                break;
            case 3:
                aVar.m.bB();
                break;
            case 4:
                aVar.n.a(aVar.m);
                break;
            case 5:
                com.tsf.shell.workspace3D.z.b();
                ((ah) aVar.m).bX();
                break;
            case 6:
                aVar.m.aZ();
                break;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                aVar.m.ba();
                break;
        }
        if (i3 != -1) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.n != null) {
            this.n.b((p) this.c);
            this.n.b(this.s);
            this.n = null;
        }
    }

    private static boolean a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == ((Integer) arrayList.get(i2)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public final void a(z zVar, float f, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4;
        boolean z;
        int i;
        boolean z2;
        int i2;
        if (!this.p) {
            this.h.clear();
            if (arrayList2 != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (!a(num.intValue(), arrayList2)) {
                        arrayList5.add(num);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    if (!arrayList5.contains(num2)) {
                        arrayList5.add(num2);
                    }
                }
                arrayList = arrayList5;
            } else {
                ArrayList arrayList6 = null;
                if (arrayList3 != null) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Integer num3 = (Integer) it3.next();
                        if (!arrayList.contains(num3)) {
                            if (arrayList6 == null) {
                                arrayList6 = (ArrayList) arrayList.clone();
                            }
                            arrayList6.add(num3);
                        }
                    }
                    arrayList4 = arrayList6;
                } else {
                    arrayList4 = null;
                }
                if (arrayList4 != null) {
                    arrayList = arrayList4;
                }
            }
            this.n = zVar.aK();
            if (this.n != null) {
                this.n.a((p) this);
                this.o = arrayList.size();
                aq.a(this);
                this.m = zVar;
                this.p = true;
                this.j.k();
                this.i.L().setAllFrom(this.m.L());
                this.s.b = this.i;
                this.s.a = zVar;
                this.n.a(this.s);
                this.k = 0.0f;
                this.l = f;
                Number3d c = zVar.c(new Number3d());
                float f2 = c.x;
                float aM = this.n.aM() + c.y;
                if (f2 >= 0.0f && aM >= 0.0f) {
                    z = false;
                    i = -268;
                } else if (f2 >= 0.0f && aM <= 0.0f) {
                    z = false;
                    i = 2;
                } else if (f2 <= 0.0f && aM <= 0.0f) {
                    z = true;
                    i = -2;
                } else if (f2 > 0.0f || aM < 0.0f) {
                    z = true;
                    i = 0;
                } else {
                    z = true;
                    i = -92;
                }
                if (this.o > 6) {
                    this.o++;
                    arrayList.add(0, -1);
                }
                for (int i3 = 0; i3 < this.o; i3++) {
                    j jVar = (j) this.g.get(i3);
                    e eVar = (e) d.get(arrayList.get(i3));
                    jVar.E = eVar;
                    jVar.F.z().d();
                    jVar.F.z().c(eVar.a());
                    jVar.h(r0.width * com.censivn.C3DEngine.a.b);
                    jVar.g(r0.height * com.censivn.C3DEngine.a.b);
                    jVar.L().setAll(0.0f, 0.0f, f);
                    if (i3 < 6) {
                        z2 = false;
                        i2 = i3;
                    } else {
                        i2 = (i3 - 6) + 1;
                        z2 = true;
                    }
                    jVar.C = z;
                    jVar.B = i;
                    if (z2) {
                        jVar.D = true;
                        this.h.add(0, jVar);
                    } else {
                        jVar.D = false;
                        jVar.a(i2, i2 * 120, com.censivn.C3DEngine.g.a.e);
                        jVar.Q();
                        this.i.d(jVar);
                    }
                }
                this.i.az();
                this.j.N().setAll(0.0f, 0.0f, 1.0f);
                u uVar = new u();
                uVar.j(1.0f);
                uVar.k(1.0f);
                s.a(this.j);
                s.a(this.j, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
            }
        }
    }

    public final void b() {
        if (this.p && !this.q) {
            this.b = false;
            aq.b(this);
            this.q = true;
            int i = 0;
            for (int i2 = 0; i2 < this.o; i2++) {
                j jVar = (j) this.g.get(i2);
                jVar.G = false;
                if (jVar.P() == null) {
                    jVar.i();
                    jVar.G = true;
                } else if (jVar.E.c == -1) {
                    jVar.a(i, false);
                    jVar.G = true;
                    i++;
                }
            }
            for (int i3 = 0; i3 < this.o; i3++) {
                j jVar2 = (j) this.g.get(i3);
                if (jVar2.D && !jVar2.G) {
                    jVar2.a(i, false);
                    i++;
                }
            }
            j jVar3 = null;
            int i4 = 0;
            while (i4 < this.o) {
                j jVar4 = (j) this.g.get(i4);
                if (jVar4.D || jVar4.G) {
                    jVar4 = jVar3;
                }
                i4++;
                jVar3 = jVar4;
            }
            int i5 = i;
            for (int i6 = 0; i6 < this.o; i6++) {
                j jVar5 = (j) this.g.get(i6);
                if (!jVar5.D && !jVar5.G) {
                    jVar5.a(i5, jVar3 == jVar5);
                    jVar5.G = true;
                    i5++;
                }
            }
            d dVar = new d(this);
            dVar.j(0.0f);
            dVar.k(0.0f);
            s.a(this.j);
            s.a(this.j, ThemeShellDescription.PAGE_PREVIEW_SELECT, dVar);
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            b();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.workspace3D.g.c.p
    public final void c() {
        d();
    }
}
