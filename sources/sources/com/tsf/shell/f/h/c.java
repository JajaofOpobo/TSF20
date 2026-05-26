package com.tsf.shell.f.h;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.manager.p.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends j {
    private b a;
    private com.censivn.C3DEngine.b.h.e.a f;
    private com.censivn.C3DEngine.b.h.e.a g;
    private f h;
    private com.tsf.shell.f.i.b.e.b j;
    private float d = com.censivn.C3DEngine.b.b.a.c * 0.0f;
    private float e = 5.0f * com.censivn.C3DEngine.b.b.a.c;
    private float b = ((this.d * 3.0f) + (com.tsf.shell.manager.o.b.b.T * 4)) + (90.0f * com.censivn.C3DEngine.b.b.a.c);
    private float c = ((this.e * 2.0f) + (com.tsf.shell.manager.o.b.b.U * 3)) + (50.0f * com.censivn.C3DEngine.b.b.a.c);
    private com.tsf.shell.f.i.b.e.b i = a(12, com.tsf.shell.manager.p.e.l);

    public c(b bVar) {
        this.a = bVar;
        this.f = new com.censivn.C3DEngine.b.h.e.a(this.a.b().c(), this.b - (com.censivn.C3DEngine.b.b.a.c * 10.0f), com.tsf.shell.manager.o.b.b.U, com.tsf.shell.manager.o.b.b.T, com.censivn.C3DEngine.b.b.a.c * 40.0f, com.censivn.C3DEngine.b.b.a.c * 0.0f);
        this.f.addChild(this.i);
        this.f.addChild(a(13));
        this.j = a(11);
        this.f.addChild(this.j);
        this.f.addChild(a(14));
        this.f.position().y = com.tsf.shell.manager.o.b.b.U + this.e;
        this.f.e();
        addChild(this.f);
        this.g = new com.censivn.C3DEngine.b.h.e.a(this.a.b().c(), this.b - (com.censivn.C3DEngine.b.b.a.c * 10.0f), com.tsf.shell.manager.o.b.b.U, com.tsf.shell.manager.o.b.b.T, com.censivn.C3DEngine.b.b.a.c * 40.0f, com.censivn.C3DEngine.b.b.a.c * 0.0f);
        this.g.addChild(a(VEasing.Back.easeIn, com.tsf.shell.manager.p.e.a));
        this.g.addChild(a(300, com.tsf.shell.manager.p.e.e));
        this.g.addChild(a(800));
        this.g.addChild(a(1700, com.tsf.shell.manager.p.e.o));
        this.g.addChild(a(1500, com.tsf.shell.manager.p.e.k));
        this.g.addChild(a(900));
        this.g.addChild(a(VEasing.Linear.easeNone));
        this.g.addChild(a(1400));
        this.g.addChild(a(700));
        this.g.addChild(a(1100));
        this.g.addChild(a(1200));
        this.g.addChild(a(1300));
        this.g.addChild(a(1600));
        this.g.addChild(a(15));
        this.g.e();
        addChild(this.g);
        this.h = new f(this, this.a.b().c(), this.b - (com.censivn.C3DEngine.b.b.a.c * 10.0f), com.tsf.shell.manager.o.b.b.U, com.tsf.shell.manager.o.b.b.T, 40.0f * com.censivn.C3DEngine.b.b.a.c, 0.0f * com.censivn.C3DEngine.b.b.a.c);
        this.h.position().y = (-com.tsf.shell.manager.o.b.b.U) - this.e;
        this.h.d();
        addChild(this.h);
    }

    public com.tsf.shell.f.i.b.e.b a(int i) {
        com.tsf.shell.f.i.b.e.b bVarA = com.tsf.shell.manager.l.a.a(i, com.tsf.shell.manager.o.b.b);
        a(bVarA);
        return bVarA;
    }

    private com.tsf.shell.f.i.b.e.b a(int i, int i2) {
        final com.tsf.shell.f.i.b.e.b bVarA = a(i);
        final LauncherShortcutStandardInfo launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) bVarA.K();
        e.a aVarA = com.tsf.shell.manager.a.a.a(i2);
        if (aVarA.a()) {
            launcherShortcutStandardInfo.enableNotifPoint();
            aVarA.a(new e.a.C0142a() { // from class: com.tsf.shell.f.h.c.1
                @Override // com.tsf.shell.manager.p.e.a.C0142a
                public void a() {
                    launcherShortcutStandardInfo.disableNotifPoint();
                    bVarA.aB();
                }
            });
        }
        return bVarA;
    }

    public float a(float f) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(50);
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, 500, dVar);
        this.f.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(50);
        com.censivn.C3DEngine.b.g.c.a(this.g);
        com.censivn.C3DEngine.b.g.c.a(this.g, 500, dVar2);
        this.g.mouseEnabled(false);
        return (this.c / 2.0f) + f + com.censivn.C3DEngine.b.b.a.a(260.0f);
    }

    public void a() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.f);
        com.censivn.C3DEngine.b.g.c.a(this.f, 500, dVar);
        this.f.mouseEnabled(true);
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.g);
        com.censivn.C3DEngine.b.g.c.a(this.g, 500, dVar2);
        this.g.mouseEnabled(true);
        this.h.p();
    }

    public void b() {
        if (com.tsf.shell.manager.a.h.E()) {
            com.tsf.shell.manager.o.c.a(this.i, com.tsf.shell.manager.o.c.f);
            com.tsf.shell.manager.o.c.a(this.j, com.tsf.shell.manager.o.c.f);
            this.i.mouseEnabled(false);
            this.j.mouseEnabled(false);
        } else {
            com.tsf.shell.manager.o.c.a(this.i, com.tsf.shell.manager.o.c.e);
            com.tsf.shell.manager.o.c.a(this.j, com.tsf.shell.manager.o.c.e);
            this.i.mouseEnabled(true);
            this.j.mouseEnabled(true);
        }
        this.g.a(1, false);
        this.g.a(0, true);
    }

    public static void a(final com.tsf.shell.f.i.b.e.b bVar) {
        bVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(bVar) { // from class: com.tsf.shell.f.h.c.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                bVar.l();
            }
        });
        com.tsf.shell.manager.o.c.a(bVar, com.tsf.shell.manager.o.c.e);
        bVar.aN();
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    public void a(ArrayList<ItemInfo> arrayList, String str) {
        this.h.a(arrayList, str);
    }

    public void e() {
        int iNumChildren = this.f.numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            ((com.tsf.shell.f.i.b.e.b) this.f.getChildAt(i)).aB();
        }
        int iNumChildren2 = this.g.numChildren();
        for (int i2 = 0; i2 < iNumChildren2; i2++) {
            ((com.tsf.shell.f.i.b.e.b) this.g.getChildAt(i2)).aB();
        }
    }
}
