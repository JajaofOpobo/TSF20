package com.tsf.shell.e.e.f;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.c.k;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.R;
import com.tsf.shell.e.f.m;
import com.tsf.shell.e.i.b.e.h;
import com.tsf.shell.e.i.b.e.i;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements com.censivn.C3DEngine.b.c.d, k, f, com.tsf.shell.e.e.h.d {
    private static HashMap a;
    private static ArrayList p = new ArrayList();
    private ArrayList b;
    private com.tsf.shell.e.i.e f;
    private e g;
    private com.tsf.shell.e.i.b.e.a j;
    private d m;
    private boolean n;
    private j o;
    private com.tsf.shell.e.d.c.a.d q;
    private boolean h = false;
    private boolean i = false;
    private float[] l = new float[2];
    private boolean r = false;
    private com.tsf.shell.manager.f.c k = new com.tsf.shell.manager.f.c();
    private ArrayList c = new ArrayList();
    private l e = new l();
    private l d = new l() { // from class: com.tsf.shell.e.e.f.a.1
        Number3d a = new Number3d();

        @Override // com.censivn.C3DEngine.b.f.j
        public void onKillFocus() {
            a.this.a(true);
        }

        @Override // com.censivn.C3DEngine.b.f.l
        public void onDrawChildEnd() {
            if (a.this.f != null) {
                this.a.setAllFrom(a.this.f.position());
                PositionNumber3d position = a.this.f.position();
                a.this.f.position().y = 0.0f;
                position.x = 0.0f;
                a.this.f.dispatchDraw();
                a.this.f.position().setAllFrom(this.a);
                float f = a.this.f.scale().x;
                float f2 = f + ((1.0f - f) * 0.15f);
                a.this.f.scale().setAll(f2, f2, 1.0f);
            }
        }
    };

    public a() {
        int i = 0;
        this.d.addChild(this.e);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d));
        this.d.mouseSkip(true);
        this.b = new ArrayList();
        for (int i2 = 0; i2 < 9; i2++) {
            this.b.add(new d(this, i2));
        }
        if (a == null) {
            a = new HashMap();
            a.put(0, new b(ThemeShellDescription.ICON_MENU_DETAIL_ON, ThemeShellDescription.ICON_MENU_DETAIL_OFF, 0, x.c(R.string.text_detail)));
            a.put(1, new b(ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF, 1, x.c(R.string.text_edit)));
            a.put(2, new b(ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF, 2, x.c(R.string.text_rename)));
            a.put(4, new b(ThemeShellDescription.ICON_MENU_DELETE_ON, ThemeShellDescription.ICON_MENU_DELETE_OFF, 4, x.c(R.string.text_delete)));
            a.put(3, new b(ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF, 3, x.c(R.string.text_multi_choice)));
            a.put(5, new b(ThemeShellDescription.ICON_MENU_UNINSTALL_ON, ThemeShellDescription.ICON_MENU_UNINSTALL_OFF, 5, x.c(R.string.text_uninstall)));
            a.put(6, new b(ThemeShellDescription.ICON_MENU_RESET_ON, ThemeShellDescription.ICON_MENU_RESET_OFF, 6, x.c(R.string.text_rotate)));
            a.put(7, new b(ThemeShellDescription.ICON_MENU_ALIGN_ON, ThemeShellDescription.ICON_MENU_ALIGN_OFF, 7, x.c(R.string.text_snaplines)));
        }
        while (true) {
            int i3 = i;
            if (i3 < 9) {
                d dVar = (d) this.b.get(i3);
                dVar.setMouseEventListener(new AnonymousClass2(this.d));
                dVar.calAABB();
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: com.tsf.shell.e.e.f.a$2, reason: invalid class name */
    class AnonymousClass2 extends com.censivn.C3DEngine.b.d.a {
        boolean a;

        AnonymousClass2(j jVar) {
            super(jVar);
            this.a = false;
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void e(MotionEvent motionEvent) {
            float[] a = x.a(motionEvent, a.this.l);
            j hittingTarget = a.this.d.getHittingTarget(a[0], a[1], true);
            if (hittingTarget != null && (hittingTarget instanceof d)) {
                a.this.a((d) hittingTarget);
            } else {
                a.this.a((d) null);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void f(MotionEvent motionEvent) {
            if (a.this.m != null) {
                a.this.a(a.this.m.b.c, true);
            }
            a.this.m = null;
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (!this.a) {
                final float[] a = x.a(motionEvent2, a.this.l);
                this.a = true;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.f.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        j hittingTarget = a.this.d.getHittingTarget(a[0], a[1], true);
                        if (hittingTarget != null && (hittingTarget instanceof d)) {
                            a.this.a((d) hittingTarget);
                        } else {
                            a.this.a((d) null);
                        }
                        AnonymousClass2.this.a = false;
                    }
                });
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent) {
            w.b();
        }
    }

    public boolean a() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        if (dVar != this.m) {
            if (this.m != null) {
                this.m.a(true);
            }
            this.m = dVar;
            if (dVar != null) {
                this.m.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        switch (i) {
            case 0:
                if (this.f instanceof i) {
                    com.tsf.shell.manager.a.A.c();
                    ((i) this.f).bh();
                    break;
                } else if (this.f instanceof h) {
                    com.tsf.shell.manager.a.A.c();
                    ((h) this.f).aV();
                    break;
                }
                break;
            case 1:
                if (this.f instanceof com.tsf.shell.e.i.b.e.a) {
                    com.tsf.shell.manager.a.A.c();
                    a((com.tsf.shell.e.i.b.e.a) this.f);
                    break;
                }
                break;
            case 2:
                com.tsf.shell.manager.a.A.c();
                c.a(this.f);
                break;
            case 3:
                this.f.aq();
                break;
            case 4:
                this.g.a(this.f);
                break;
            case 5:
                com.tsf.shell.manager.a.A.c();
                ((i) this.f).bg();
                break;
            case 6:
                this.f.G();
                break;
            case 7:
                this.f.H();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.g != null) {
            this.g.b(this);
            this.g.u();
            this.g = null;
        }
        com.tsf.shell.manager.a.j.b(this.d);
    }

    private ArrayList a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4;
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
            return arrayList5;
        }
        ArrayList arrayList6 = null;
        if (arrayList3 == null) {
            arrayList4 = null;
        } else {
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
        }
        return arrayList4 != null ? arrayList4 : arrayList;
    }

    private boolean a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == ((Integer) arrayList.get(i2)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public void a(com.tsf.shell.e.i.e eVar, j jVar, ArrayList arrayList, ArrayList arrayList2) {
        if (!this.h) {
            this.e.position().reset();
            p.clear();
            eVar.a(p);
            this.o = jVar;
            this.c.clear();
            p = a(p, arrayList, arrayList2);
            this.g = eVar.ag();
            if (this.g != null) {
                this.g.a(this);
                this.g.t();
                com.censivn.C3DEngine.b.c.c.a(this);
                com.tsf.shell.manager.a.b.a(this);
                this.f = eVar;
                this.h = true;
                com.tsf.shell.manager.a.j.a(this.d, 0);
                Number3d localToGlobal = eVar.localToGlobal(new Number3d());
                float f = localToGlobal.x;
                float q = localToGlobal.y + this.g.q();
                this.d.position().x = f;
                this.d.position().y = q;
                eVar.alpha(0.0f);
                g();
                if (!this.n) {
                    com.tsf.shell.manager.a.c.c(this);
                }
                eVar.alpha(255.0f);
                int size = p.size();
                for (int i = 0; i < size; i++) {
                    d dVar = (d) this.b.get(i);
                    dVar.a((b) a.get(p.get(i)));
                    dVar.removeFromParent();
                    this.e.addChild(dVar);
                }
                ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).a(p, f, q);
                this.d.setFocus();
            }
        }
    }

    private void g() {
        if (this.o != null) {
            this.n = true;
            com.tsf.shell.manager.a.e.a(i().b, (Runnable) null);
            this.o.visible(false);
            this.o.mouseEnabled(false);
            return;
        }
        this.n = false;
        com.tsf.shell.manager.a.e.a(this.k);
    }

    public void a(final com.tsf.shell.e.i.e eVar) {
        if (!this.r && this.q != null) {
            this.r = true;
            this.q.a();
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.e.f.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.r = false;
                    a.this.d.removeFromParent();
                    int size = a.p.size();
                    for (int i = 0; i < size; i++) {
                        ((d) a.this.b.get(i)).b();
                    }
                    a.this.q = null;
                    if (eVar != null && a.this.q != com.tsf.shell.manager.a.v.e.h()) {
                        a.this.b(eVar);
                    }
                }
            }, this.q.a(p.size()));
        }
    }

    public void b(com.tsf.shell.e.i.e eVar) {
        if (this.q != null) {
            a(eVar);
            return;
        }
        this.e.position().reset();
        p.clear();
        p.add(0);
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(7);
        this.d.removeFromParent();
        com.tsf.shell.manager.a.j.a(this.d, 0);
        float f = com.censivn.C3DEngine.b.b.a.z / 2.0f;
        float a2 = com.censivn.C3DEngine.b.b.a.a(250.0f);
        this.d.position().x = f;
        this.d.position().y = a2;
        int size = p.size();
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.b.get(i);
            dVar.a((b) a.get(p.get(i)));
            dVar.removeFromParent();
            this.e.addChild(dVar);
        }
        this.q = (com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h();
        this.q.a(p, f, a2);
    }

    private void a(int i, Runnable runnable, boolean z) {
        if (this.n) {
            com.tsf.shell.manager.a.e.a(i, runnable, z);
        } else {
            com.tsf.shell.manager.a.e.b(i, runnable, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.n) {
            this.o.visible(true);
            this.o.mouseEnabled(true);
            com.tsf.shell.manager.a.e.b();
        }
    }

    private m i() {
        m c = com.tsf.shell.e.f.l.c(this);
        c.a = this;
        com.tsf.shell.manager.a.t.b(com.tsf.shell.e.f.l.c(), c.b);
        com.tsf.shell.manager.a.e.dispatchDraw();
        this.o.dispatchDraw();
        com.tsf.shell.manager.a.t.b();
        return c;
    }

    public void a(boolean z) {
        a(-1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, boolean z) {
        if (this.h && !this.i) {
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.e.f.a.4
                @Override // java.lang.Runnable
                public void run() {
                    int size = a.p.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((d) a.this.b.get(i2)).b();
                    }
                    if (!a.this.n) {
                        com.tsf.shell.manager.a.c.b(a.this);
                    }
                    a.this.h();
                    a.this.a(i);
                    a.this.h = false;
                    a.this.i = false;
                    a.this.f.mouseSkip(false);
                    a.this.f();
                    com.censivn.C3DEngine.b.c.c.b(a.this);
                    com.tsf.shell.manager.a.b.b(a.this);
                    com.tsf.shell.manager.a.v.e.f();
                    a.this.f = null;
                }
            };
            this.i = true;
            if (z) {
                float alpha = this.f.alpha();
                this.f.visible(false);
                this.f.alpha(0.0f);
                a(((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).a(p.size()), runnable, z);
                this.f.alpha(alpha);
                this.f.visible(true);
                ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).a();
                return;
            }
            a(((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).a(p.size()), runnable, z);
            ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.h()).a();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            a(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.e.e.h.d
    public void a(Bitmap bitmap, String str) {
        if (this.j != null) {
            this.j.a(bitmap, str);
            this.j = null;
        }
    }

    @Override // com.tsf.shell.e.e.h.d
    public void b() {
        if (this.j != null) {
            this.j.q();
            this.j = null;
        }
    }

    public void a(com.tsf.shell.e.i.b.e.a aVar) {
        this.j = aVar;
        int[] aG = aVar.aG();
        com.tsf.shell.e.e.h.c.a(this, aVar, aG[0], aG[1]);
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        a(false);
    }

    public ArrayList c() {
        return this.b;
    }

    public l d() {
        return this.e;
    }
}
