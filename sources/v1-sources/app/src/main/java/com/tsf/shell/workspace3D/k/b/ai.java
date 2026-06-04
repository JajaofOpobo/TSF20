package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherWidget3DInfo;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ai extends com.tsf.shell.workspace3D.j {
    private com.tsf.shell.workspace3D.g.b.l h;
    private k i;
    private ab j;
    private com.tsf.shell.workspace3D.k.y k;

    public ai(com.censivn.C3DEngine.b.v vVar, com.censivn.C3DEngine.b.v vVar2, int i) {
        super(vVar, vVar2, i);
        this.j = new ab(this);
        this.i = bf.l();
        aj ajVar = new aj(this);
        this.h = new com.tsf.shell.workspace3D.g.b.l(ajVar);
        this.h.a((int) (168.0f * com.censivn.C3DEngine.a.b), (int) (d * com.censivn.C3DEngine.a.b), (int) (d * com.censivn.C3DEngine.a.b));
        ajVar.a(c, com.censivn.C3DEngine.a.m);
        a(this.h);
        this.k = new al(this);
    }

    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
        this.h.a(jVar, false);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(ArrayList arrayList) {
        this.h.a(arrayList, false);
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar, int i) {
        this.h.a(jVar, i);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(ArrayList arrayList, int i) {
        this.h.a(arrayList, i, false);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a() {
        super.a();
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void b() {
        super.b();
    }

    public final LauncherItem3DInfo a(com.tsf.shell.workspace3D.k.al alVar, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        LauncherItem3DInfo launcherItem3DInfo = null;
        com.tsf.shell.workspace3D.k.s bv = alVar.bv();
        if (b.a(bv, true) || bv.k != null) {
            int t = this.i.t();
            switch (bv.f) {
                case 1:
                    launcherItem3DInfo = new LauncherFolder3DInfo(t);
                    break;
                case 5:
                    launcherItem3DInfo = new LauncherWidget3DInfo(t);
                    break;
                case 6:
                    launcherItem3DInfo = new LauncherShortcut3DInfo(t);
                    break;
            }
            launcherItem3DInfo.internal = bv.g;
            launcherItem3DInfo.screen = i;
            launcherItem3DInfo.cellX = (int) f;
            launcherItem3DInfo.cellY = (int) f2;
            launcherItem3DInfo.cellXH = (int) f3;
            launcherItem3DInfo.cellYH = (int) f4;
            launcherItem3DInfo.scale = f5;
            launcherItem3DInfo.scaleH = f6;
            launcherItem3DInfo.rotation = 0;
            launcherItem3DInfo.classname = bv.b;
            launcherItem3DInfo.packagename = bv.c == null ? bv.a : bv.c;
            launcherItem3DInfo.isRecreate = false;
        }
        return launcherItem3DInfo;
    }

    public final void b(com.tsf.shell.workspace3D.k.al alVar, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        LauncherItem3DInfo a = a(alVar, i, f, f2, f3, f4, f5, f6);
        if (a != null) {
            a(alVar, a);
        }
    }

    public final void a(com.tsf.shell.workspace3D.k.al alVar, LauncherItem3DInfo launcherItem3DInfo) {
        this.i.a(alVar.bv(), launcherItem3DInfo, false, this.k);
    }
}
