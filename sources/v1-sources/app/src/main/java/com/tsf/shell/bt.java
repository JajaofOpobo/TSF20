package com.tsf.shell;

import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bt implements Runnable {
    int a;
    String[] b;
    final /* synthetic */ ShellModel c;

    public bt(ShellModel shellModel, int i, String[] strArr) {
        this.c = shellModel;
        this.a = i;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ShellApplication shellApplication;
        bl blVar;
        com.tsf.shell.h.a aVar;
        com.tsf.shell.h.a aVar2;
        com.tsf.shell.h.a aVar3;
        com.tsf.shell.h.a aVar4;
        ArrayList arrayList;
        com.tsf.shell.h.a aVar5;
        ArrayList arrayList2;
        com.tsf.shell.h.a aVar6;
        ArrayList arrayList3;
        com.tsf.shell.h.a aVar7;
        ArrayList arrayList4;
        com.tsf.shell.h.a aVar8;
        ArrayList arrayList5;
        com.tsf.shell.h.a aVar9;
        ArrayList arrayList6;
        com.tsf.shell.h.a aVar10;
        ArrayList arrayList7;
        com.tsf.shell.h.a aVar11;
        ArrayList arrayList8;
        com.tsf.shell.h.a aVar12;
        ArrayList arrayList9;
        bl blVar2;
        bl blVar3;
        bl blVar4;
        com.tsf.shell.h.a aVar13;
        com.tsf.shell.h.a aVar14;
        com.tsf.shell.h.a aVar15;
        com.tsf.shell.h.a aVar16;
        com.tsf.shell.h.a aVar17;
        com.tsf.shell.h.a aVar18;
        com.tsf.shell.h.a aVar19;
        com.tsf.shell.h.a aVar20;
        com.tsf.shell.h.a aVar21;
        com.tsf.shell.h.a aVar22;
        com.tsf.shell.h.a aVar23;
        com.tsf.shell.h.a aVar24;
        com.tsf.shell.h.a aVar25;
        com.tsf.shell.h.a aVar26;
        com.tsf.shell.h.a aVar27;
        com.tsf.shell.h.a aVar28;
        com.tsf.shell.h.a aVar29;
        com.tsf.shell.h.a aVar30;
        shellApplication = this.c.e;
        String[] strArr = this.b;
        blVar = this.c.h;
        blVar.a(strArr, this.a);
        switch (this.a) {
            case 1:
            case 5:
                for (String str : strArr) {
                    aVar3 = this.c.i;
                    aVar3.a(shellApplication, str);
                }
                break;
            case 2:
                for (String str2 : strArr) {
                    aVar2 = this.c.i;
                    aVar2.b(shellApplication, str2);
                }
                break;
            case 3:
            case 4:
                for (String str3 : strArr) {
                    aVar = this.c.i;
                    ArrayList arrayList10 = aVar.a;
                    for (int size = arrayList10.size() - 1; size >= 0; size--) {
                        com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) arrayList10.get(size);
                        if (str3.equals(bVar.b.getComponent().getPackageName())) {
                            aVar.c.add(bVar);
                            arrayList10.remove(size);
                        }
                    }
                    ArrayList arrayList11 = aVar.e;
                    for (int size2 = arrayList11.size() - 1; size2 >= 0; size2--) {
                        com.tsf.shell.h.b bVar2 = (com.tsf.shell.h.b) arrayList11.get(size2);
                        if (str3.equals(bVar2.b.getComponent().getPackageName())) {
                            aVar.g.add(bVar2);
                            arrayList11.remove(size2);
                        }
                    }
                    ArrayList arrayList12 = aVar.i;
                    for (int size3 = arrayList12.size() - 1; size3 >= 0; size3--) {
                        com.tsf.shell.h.b bVar3 = (com.tsf.shell.h.b) arrayList12.get(size3);
                        if (str3.equals(bVar3.b.getComponent().getPackageName())) {
                            aVar.k.add(bVar3);
                            arrayList12.remove(size3);
                        }
                    }
                }
                break;
        }
        aVar4 = this.c.i;
        if (aVar4.b.size() > 0) {
            aVar29 = this.c.i;
            arrayList = aVar29.b;
            aVar30 = this.c.i;
            aVar30.b = new ArrayList();
        } else {
            arrayList = null;
        }
        aVar5 = this.c.i;
        if (aVar5.c.size() > 0) {
            aVar27 = this.c.i;
            arrayList2 = aVar27.c;
            aVar28 = this.c.i;
            aVar28.c = new ArrayList();
        } else {
            arrayList2 = null;
        }
        aVar6 = this.c.i;
        if (aVar6.d.size() > 0) {
            aVar25 = this.c.i;
            arrayList3 = aVar25.d;
            aVar26 = this.c.i;
            aVar26.d = new ArrayList();
        } else {
            arrayList3 = null;
        }
        aVar7 = this.c.i;
        if (aVar7.f.size() > 0) {
            aVar23 = this.c.i;
            arrayList4 = aVar23.f;
            aVar24 = this.c.i;
            aVar24.f = new ArrayList();
        } else {
            arrayList4 = null;
        }
        aVar8 = this.c.i;
        if (aVar8.g.size() > 0) {
            aVar21 = this.c.i;
            arrayList5 = aVar21.g;
            aVar22 = this.c.i;
            aVar22.g = new ArrayList();
        } else {
            arrayList5 = null;
        }
        aVar9 = this.c.i;
        if (aVar9.h.size() > 0) {
            aVar19 = this.c.i;
            arrayList6 = aVar19.h;
            aVar20 = this.c.i;
            aVar20.h = new ArrayList();
        } else {
            arrayList6 = null;
        }
        aVar10 = this.c.i;
        if (aVar10.j.size() > 0) {
            aVar17 = this.c.i;
            arrayList7 = aVar17.j;
            aVar18 = this.c.i;
            aVar18.j = new ArrayList();
        } else {
            arrayList7 = null;
        }
        aVar11 = this.c.i;
        if (aVar11.k.size() > 0) {
            aVar15 = this.c.i;
            arrayList8 = aVar15.k;
            aVar16 = this.c.i;
            aVar16.k = new ArrayList();
        } else {
            arrayList8 = null;
        }
        aVar12 = this.c.i;
        if (aVar12.l.size() > 0) {
            aVar13 = this.c.i;
            ArrayList arrayList13 = aVar13.l;
            aVar14 = this.c.i;
            aVar14.l = new ArrayList();
            arrayList9 = arrayList13;
        } else {
            arrayList9 = null;
        }
        if (arrayList != null) {
            boolean z = this.a != 5;
            blVar4 = this.c.h;
            blVar4.a(arrayList, z);
        }
        if (arrayList3 != null) {
            blVar3 = this.c.h;
            blVar3.b(arrayList3);
        }
        if (arrayList2 != null) {
            boolean z2 = this.a != 4;
            blVar2 = this.c.h;
            blVar2.b(arrayList2, z2);
        }
        if (arrayList4 != null) {
            com.tsf.shell.workspace3D.bf.l().a(arrayList4, this.a != 5);
        }
        if (arrayList6 != null) {
            com.tsf.shell.workspace3D.bf.l().b(arrayList6);
        }
        if (arrayList5 != null) {
            int i = this.a;
            com.tsf.shell.workspace3D.bf.l().c(arrayList5);
        }
        if (arrayList7 != null) {
            ThemeManager.getInstance().addTheme(arrayList7, this.a != 5);
        }
        if (arrayList9 != null) {
            ThemeManager.getInstance().updateTheme(arrayList9);
        }
        if (arrayList8 != null) {
            ThemeManager.getInstance().removeTheme(arrayList8, this.a != 4);
        }
    }
}
