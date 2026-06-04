package com.tsf.shell.setting;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends com.tsf.shell.workspace3D.j {
    private static int h = 0;
    private static int i = 1;
    private static int j = 2;
    private static int k = 3;
    private static int l = 4;
    private com.tsf.shell.workspace3D.g.b.l m;
    private com.tsf.shell.workspace3D.g.b.k n;

    public l(com.censivn.C3DEngine.b.v vVar, com.censivn.C3DEngine.b.v vVar2) {
        super(vVar, vVar2, ThemeShellDescription.MENU_SETTING_BUTTON);
        this.n = new m(this);
        this.m = new com.tsf.shell.workspace3D.g.b.l(this.n);
        this.m.a((int) (140.0f * com.censivn.C3DEngine.a.a), (int) (d * com.censivn.C3DEngine.a.a), (int) (d * com.censivn.C3DEngine.a.a));
        this.n.L().x = (c / 2) - (c - com.tsf.shell.workspace3D.k.b.k.a);
        this.n.a(c, com.censivn.C3DEngine.a.m);
        a(this.m);
        ArrayList arrayList = new ArrayList();
        e eVar = new e(com.censivn.C3DEngine.h.a.c(R.string.group_tsf), R.drawable.menu_setting_setting);
        n nVar = new n(this, eVar);
        eVar.a(Integer.valueOf(h));
        eVar.a((com.censivn.C3DEngine.b.l) nVar);
        arrayList.add(eVar);
        e eVar2 = new e("WIFI", R.drawable.menu_setting_button_wifi, (byte) 0);
        y.a().a(eVar2);
        p pVar = new p(this, eVar2);
        eVar2.a(Integer.valueOf(i));
        eVar2.a((com.censivn.C3DEngine.b.l) pVar);
        y.a().b();
        arrayList.add(eVar2);
        e eVar3 = new e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_bluetooth), R.drawable.menu_setting_button_bluetooth, (byte) 0);
        c.a().a(eVar3);
        o oVar = new o(this, eVar3);
        eVar3.a(Integer.valueOf(j));
        eVar3.a((com.censivn.C3DEngine.b.l) oVar);
        c.a().e();
        arrayList.add(eVar3);
        e eVar4 = new e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_airplane), R.drawable.menu_setting_button_airplane, (byte) 0);
        a.a().a(eVar4);
        q qVar = new q(this, eVar4);
        eVar4.a(Integer.valueOf(k));
        eVar4.a((com.censivn.C3DEngine.b.l) qVar);
        a.a().b();
        arrayList.add(eVar4);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(R.drawable.menu_setting_ringer_mode_normal));
        arrayList2.add(Integer.valueOf(R.drawable.menu_setting_ringer_mode_silent));
        arrayList2.add(Integer.valueOf(R.drawable.menu_setting_ringer_mode_vibrate));
        e eVar5 = new e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_ringer_mode), arrayList2);
        s.a().a(eVar5);
        r rVar = new r(this, eVar5);
        eVar5.a(Integer.valueOf(l));
        eVar5.a((com.censivn.C3DEngine.b.l) rVar);
        arrayList.add(eVar5);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = j().iterator();
        while (it.hasNext()) {
            try {
                Integer valueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it2.next();
                        if (valueOf == ((Integer) jVar.s())) {
                            arrayList.remove(jVar);
                            arrayList3.add(jVar);
                            break;
                        }
                    }
                }
            } catch (NumberFormatException e) {
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add((com.tsf.shell.workspace3D.k.j) it3.next());
        }
        arrayList.clear();
        a(arrayList3);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(ArrayList arrayList) {
        this.m.a(arrayList, true);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a(ArrayList arrayList, int i2) {
        this.m.a(arrayList, i2, true);
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void a() {
        super.a();
    }

    @Override // com.tsf.shell.workspace3D.j
    public final void b() {
        super.b();
    }

    private static ArrayList j() {
        String[] split = com.tsf.shell.a.t.Q().split(",");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(str);
        }
        return arrayList;
    }

    static /* synthetic */ void a(l lVar) {
        String str = "";
        Iterator it = lVar.n.b().aD().iterator();
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                com.tsf.shell.a.t.c(str2.substring(0, str2.length() - 1));
                return;
            } else {
                str = String.valueOf(str2) + ((com.censivn.C3DEngine.b.r) it.next()).s() + ",";
            }
        }
    }
}
