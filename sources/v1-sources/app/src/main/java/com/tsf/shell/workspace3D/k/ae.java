package com.tsf.shell.workspace3D.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.bm;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ae extends p {
    private static ArrayList I = new ArrayList();
    private static int[] J = {96, 96};
    private ae H = this;
    private LauncherShortcut3DInfo a;

    public static void a(String[] strArr) {
        com.censivn.C3DEngine.a.a().c(new af(strArr));
    }

    public final void bW() {
        if (this.a.packagename != null) {
            com.tsf.shell.g.a.a(com.censivn.C3DEngine.a.c(), this.a.packagename);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.p
    public final int[] aH() {
        return J;
    }

    public ae(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        launcherShortcut3DInfo.setTarget(this);
        a((LauncherItem3DInfo) launcherShortcut3DInfo);
        d(this.D);
        bN();
        br();
    }

    public final j getWidget(Context context) {
        return this;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void br() {
        this.a = (LauncherShortcut3DInfo) be();
        if (this.a.folderInfo != null) {
            if (this.a.folderInfo.addItemInfo(this.a)) {
                bL();
            } else {
                bm.b(com.censivn.C3DEngine.a.c(), this.a);
            }
        }
        bu();
        I.add(this);
    }

    @Override // com.tsf.shell.workspace3D.k.p
    public final void aJ() {
        if (this.C != null) {
            this.D.z().b();
            com.censivn.C3DEngine.a.f().a(this.C);
        }
        Bitmap a = ap.a();
        Bitmap a2 = com.tsf.shell.setting.a.v.a(this.a.title);
        Canvas canvas = new Canvas(a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        Bitmap icon = this.a.getIcon(false, ap.E, ap.E);
        canvas.drawBitmap(icon, (ap.A - icon.getWidth()) / 2, 1.0f, (Paint) null);
        icon.recycle();
        canvas.drawBitmap(a2, (ap.A - a2.getWidth()) / 2, ap.E + 3, (Paint) null);
        a2.recycle();
        com.tsf.shell.setting.a.g.d();
        this.C = com.censivn.C3DEngine.a.f().a(a, true);
        this.D.z().c(this.C);
    }

    @Override // com.tsf.shell.workspace3D.k.ab
    public final void bP() {
        super.bP();
        ag agVar = new ag(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(agVar);
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void n() {
        if (I.contains(this)) {
            I.remove(this);
        }
        com.censivn.C3DEngine.a.f().a(this.C);
        super.n();
    }

    public static void bX() {
        if (I != null) {
            Iterator it = I.iterator();
            while (it.hasNext()) {
                ae aeVar = (ae) it.next();
                try {
                    aeVar.aJ();
                    aeVar.aX();
                } catch (Exception e) {
                }
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.k.z
    public final ArrayList a(ArrayList arrayList) {
        arrayList.add(0);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        if (M().z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        return arrayList;
    }
}
