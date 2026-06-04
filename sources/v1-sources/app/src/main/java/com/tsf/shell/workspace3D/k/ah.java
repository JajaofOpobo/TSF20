package com.tsf.shell.workspace3D.k;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.au;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ah extends p {
    private static TextureElement K;
    private static TextureElement O;
    private static com.censivn.C3DEngine.e.b P;
    private static com.censivn.C3DEngine.e.b Q;
    private static int[] R = {96, 96};
    private ArrayList H;
    private com.tsf.shell.h.b I;
    private int J = 0;
    private ah a;

    public ah(com.tsf.shell.h.b bVar) {
        c((Boolean) false);
        this.I = bVar;
        bf.r().a(this);
        this.C = ck();
        this.D.z().c(this.C);
        this.D.aj();
        d(this.D);
        this.H = new ArrayList();
        if (K == null) {
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.APP_PAGE_DEL_BUTTON);
            K = com.censivn.C3DEngine.a.f().a(bitmap, true);
            bitmap.recycle();
            com.censivn.C3DEngine.e.b bVar2 = new com.censivn.C3DEngine.e.b(50.0f, 50.0f);
            P = bVar2;
            bVar2.L().x = com.censivn.C3DEngine.a.a * 32.0f;
            P.L().y = com.censivn.C3DEngine.a.a * 49.0f;
            P.z().c(K);
            Bitmap bitmap2 = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.APP_PAGE_HIDE_LOGO);
            O = com.censivn.C3DEngine.a.f().a(bitmap2, true);
            bitmap2.recycle();
            com.censivn.C3DEngine.e.b bVar3 = new com.censivn.C3DEngine.e.b(50.0f, 50.0f);
            Q = bVar3;
            bVar3.L().x = com.censivn.C3DEngine.a.a * 32.0f;
            Q.L().y = com.censivn.C3DEngine.a.a * 49.0f;
            Q.z().c(O);
        }
        bN();
    }

    private ah(ah ahVar, TextureElement textureElement) {
        c((Boolean) false);
        this.a = ahVar;
        this.C = textureElement;
        this.D.z().c(this.C);
        d(this.D);
        bu();
        bN();
    }

    @Override // com.tsf.shell.workspace3D.k.p
    public final int[] aH() {
        R[0] = ap.E;
        R[1] = ap.E;
        return R;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aX() {
        super.aX();
        if (this.a != null && this.a.C != this.C) {
            aJ();
        }
    }

    @Override // com.tsf.shell.workspace3D.k.p
    public final void aJ() {
        if (this.a != null) {
            LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) be();
            if (!(cj() ? true : (launcherShortcut3DInfo == null || launcherShortcut3DInfo.iconType == -1) ? false : true) && this.a.C != this.C) {
                com.censivn.C3DEngine.a.f().a(this.C);
                this.C = this.a.C;
                this.D.z().d();
                this.D.z().c(this.C);
            }
        }
        this.C = ck();
        this.D.z().d();
        this.D.z().c(this.C);
    }

    private boolean cj() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) be();
        if (launcherShortcut3DInfo == null) {
            return false;
        }
        if (this.a == null || !this.a.ch().a.equals(launcherShortcut3DInfo.title)) {
            return launcherShortcut3DInfo.isCustomName;
        }
        return false;
    }

    public final void a(int i) {
        if (i != this.J) {
            this.J = i;
            ce();
        }
    }

    public final int bW() {
        while (this.a != null) {
            this = this.a;
        }
        return this.J;
    }

    public final void bX() {
        if (!ch().f) {
            try {
                Home.d().startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + ch().c.getPackageName())));
                return;
            } catch (Exception e) {
                return;
            }
        }
        au.a(R.string.notic_uninstall_error);
    }

    public final void bY() {
        com.tsf.shell.g.a.a(com.censivn.C3DEngine.a.c(), ch().c.getPackageName());
    }

    public static void bZ() {
        P.N().setAll(0.0f, 0.0f, 1.0f);
        com.censivn.C3DEngine.g.s.a(P);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.e());
        com.censivn.C3DEngine.g.s.a(P, 250, uVar);
    }

    public static void b(Runnable runnable) {
        com.censivn.C3DEngine.g.s.a(P);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(runnable);
        uVar.j(0.0f);
        uVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(P, 180, uVar);
    }

    public final void ca() {
        if (!aD().contains(Q)) {
            d(Q);
        }
    }

    public final void cb() {
        if (aD().contains(Q)) {
            e(Q);
        }
    }

    public final void cc() {
        if (!ch().f && !aD().contains(P)) {
            d(P);
        }
    }

    public final void cd() {
        if (!ch().f) {
            e(P);
        }
    }

    public final void a(com.tsf.shell.h.b bVar) {
        this.I = bVar;
        Bitmap cl = cl();
        com.censivn.C3DEngine.a.f();
        com.censivn.C3DEngine.b.ad.b(this.C, cl);
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((ah) it.next()).aX();
        }
        com.censivn.C3DEngine.a.d().g();
    }

    public final void ce() {
        Bitmap cl = cl();
        com.censivn.C3DEngine.a.f();
        com.censivn.C3DEngine.b.ad.b(this.C, cl);
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                ((ah) it.next()).aX();
            }
        }
    }

    public final ah cf() {
        return this.a;
    }

    private TextureElement ck() {
        return com.censivn.C3DEngine.a.f().a(cl(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap cl() {
        float f;
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        boolean z;
        Bitmap bitmap;
        String str;
        Canvas canvas;
        Bitmap defaultIconUponBitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        boolean z2;
        Bitmap a;
        ThemeDescription currentThemeDescription = ThemeManager.getInstance().getCurrentThemeDescription();
        float f2 = 1.0f;
        if (currentThemeDescription.icon != null) {
            f2 = ThemeManager.mix.icon.getDefaultIconScale();
            if (f2 == 0.0f) {
                f = 1.0f;
                Bitmap a2 = ap.a();
                launcherShortcut3DInfo = (LauncherShortcut3DInfo) be();
                z = false;
                if (launcherShortcut3DInfo == null && launcherShortcut3DInfo.iconType != -1) {
                    bitmap = launcherShortcut3DInfo.getIcon(false);
                    z = true;
                } else if (currentThemeDescription.icon != null) {
                    bitmap = null;
                } else {
                    bitmap = ThemeManager.mix.icon.getIconFilterBitmap("ComponentInfo{" + ch().c.getPackageName() + "/" + ch().c.getClassName() + "}");
                }
                if (cj()) {
                    str = ch().a == null ? "" : ch().a.toString();
                } else {
                    str = be().title;
                }
                canvas = new Canvas(a2);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                Bitmap bitmap5 = null;
                if (bitmap != null) {
                    Bitmap defaultIconBackBitmap = ThemeManager.mix.icon.getDefaultIconBackBitmap();
                    if (defaultIconBackBitmap != null) {
                        canvas.drawBitmap(defaultIconBackBitmap, (ap.A - defaultIconBackBitmap.getWidth()) / 2, 0.0f, (Paint) null);
                        if (!ThemeManager.mix.icon.isDefaultIconBackBitmap(defaultIconBackBitmap)) {
                            defaultIconBackBitmap.recycle();
                        }
                    }
                    if (ch().e != 0) {
                        try {
                            Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), ch().e);
                            if (defaultIconBackBitmap == null) {
                                f = 1.0f;
                            }
                            bitmap3 = Bitmap.createScaledBitmap(a3, (int) (ap.E * f), (int) (ap.E * f), true);
                            if (bitmap3 != a3) {
                                a3.recycle();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            bitmap3 = null;
                        }
                    } else {
                        try {
                            Context createPackageContext = com.censivn.C3DEngine.a.c().createPackageContext(ch().c.getPackageName(), 3);
                            Drawable loadIcon = ch().k.loadIcon(createPackageContext.getPackageManager());
                            if (loadIcon == null) {
                                bitmap3 = null;
                            } else {
                                if (defaultIconBackBitmap == null) {
                                    f = 1.0f;
                                }
                                if (!(loadIcon instanceof BitmapDrawable)) {
                                    bitmap2 = null;
                                    bitmap4 = null;
                                    z2 = true;
                                } else {
                                    bitmap4 = ((BitmapDrawable) loadIcon).getBitmap();
                                    if (bitmap4 == null) {
                                        z2 = true;
                                        bitmap2 = bitmap4;
                                    } else {
                                        z2 = false;
                                        bitmap2 = bitmap4;
                                    }
                                }
                                if (bitmap4 == null) {
                                    try {
                                        a = com.censivn.C3DEngine.h.a.a(createPackageContext, createPackageContext.getApplicationInfo().icon);
                                    } catch (Exception e2) {
                                        Bitmap bitmap6 = bitmap2;
                                        bitmap3 = null;
                                        bitmap5 = bitmap6;
                                        if (bitmap3 == null) {
                                        }
                                        if (!bitmap3.isRecycled()) {
                                        }
                                        if (bitmap5 != bitmap3) {
                                        }
                                        if (!z) {
                                        }
                                        Bitmap a4 = com.tsf.shell.setting.a.v.a(str);
                                        canvas.drawBitmap(a4, (ap.A - a4.getWidth()) / 2, ap.E + 3, (Paint) null);
                                        a4.recycle();
                                        if (bW() != 0) {
                                        }
                                        com.tsf.shell.setting.a.g.d();
                                        return a2;
                                    }
                                } else {
                                    a = bitmap4;
                                }
                                if (a == null) {
                                    bitmap5 = bitmap2;
                                    bitmap3 = null;
                                } else {
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, (int) (ap.E * f), (int) (ap.E * f), true);
                                    if (createScaledBitmap == a || !z2) {
                                        Bitmap bitmap7 = bitmap2;
                                        bitmap3 = createScaledBitmap;
                                        bitmap5 = bitmap7;
                                    } else {
                                        a.recycle();
                                        Bitmap bitmap8 = bitmap2;
                                        bitmap3 = createScaledBitmap;
                                        bitmap5 = bitmap8;
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            bitmap2 = null;
                        }
                    }
                    if (bitmap3 == null) {
                        Bitmap a5 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.dummy_icon);
                        bitmap3 = Bitmap.createScaledBitmap(a5, (int) (ap.E * f), (int) (f * ap.E), true);
                        a5.recycle();
                    }
                    if (!bitmap3.isRecycled()) {
                        canvas.drawBitmap(bitmap3, (ap.A - bitmap3.getWidth()) / 2, (ap.E - bitmap3.getHeight()) / 2, (Paint) null);
                    }
                    if (bitmap5 != bitmap3) {
                        bitmap3.recycle();
                    }
                } else {
                    canvas.drawBitmap(bitmap, (ap.A - bitmap.getWidth()) / 2, 1.0f, (Paint) null);
                    bitmap.recycle();
                }
                if (!z && (defaultIconUponBitmap = ThemeManager.mix.icon.getDefaultIconUponBitmap()) != null) {
                    canvas.drawBitmap(defaultIconUponBitmap, (ap.A - defaultIconUponBitmap.getWidth()) / 2, 1.0f, (Paint) null);
                }
                Bitmap a42 = com.tsf.shell.setting.a.v.a(str);
                canvas.drawBitmap(a42, (ap.A - a42.getWidth()) / 2, ap.E + 3, (Paint) null);
                a42.recycle();
                if (bW() != 0) {
                    Bitmap b = com.tsf.shell.setting.a.v.b(Integer.toString(bW()), (int) (24.0f * com.censivn.C3DEngine.a.b));
                    Bitmap bitmap9 = currentThemeDescription.shell.getBitmap(ThemeShellDescription.UNREAD_COUNT_BG);
                    Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap9, (int) (bitmap9.getWidth() * com.censivn.C3DEngine.a.b), (int) (bitmap9.getHeight() * com.censivn.C3DEngine.a.b), true);
                    if (bitmap9 != createScaledBitmap2) {
                        bitmap9.recycle();
                    }
                    int width = b.getWidth();
                    if (width + (28.0f * com.censivn.C3DEngine.a.b) > createScaledBitmap2.getWidth()) {
                        createScaledBitmap2 = com.tsf.shell.g.i.a(createScaledBitmap2, createScaledBitmap2.getWidth() / 2, width + ((int) (28.0f * com.censivn.C3DEngine.a.b)));
                    }
                    new Canvas(createScaledBitmap2).drawBitmap(b, ((createScaledBitmap2.getWidth() - b.getWidth()) / 2) - 1, ((createScaledBitmap2.getHeight() - b.getHeight()) / 2) - 4, (Paint) null);
                    b.recycle();
                    canvas.drawBitmap(createScaledBitmap2, (ap.A - createScaledBitmap2.getWidth()) - 1, 1.0f, (Paint) null);
                    createScaledBitmap2.recycle();
                }
                com.tsf.shell.setting.a.g.d();
                return a2;
            }
        }
        f = f2;
        Bitmap a22 = ap.a();
        launcherShortcut3DInfo = (LauncherShortcut3DInfo) be();
        z = false;
        if (launcherShortcut3DInfo == null) {
        }
        if (currentThemeDescription.icon != null) {
        }
        if (cj()) {
        }
        canvas = new Canvas(a22);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        Bitmap bitmap52 = null;
        if (bitmap != null) {
        }
        if (!z) {
            canvas.drawBitmap(defaultIconUponBitmap, (ap.A - defaultIconUponBitmap.getWidth()) / 2, 1.0f, (Paint) null);
        }
        Bitmap a422 = com.tsf.shell.setting.a.v.a(str);
        canvas.drawBitmap(a422, (ap.A - a422.getWidth()) / 2, ap.E + 3, (Paint) null);
        a422.recycle();
        if (bW() != 0) {
        }
        com.tsf.shell.setting.a.g.d();
        return a22;
    }

    @Override // com.tsf.shell.workspace3D.k.ab
    public final void bP() {
        super.bP();
        ai aiVar = new ai(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(aiVar);
    }

    public final ah cg() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = new LauncherShortcut3DInfo(bf.l().t());
        launcherShortcut3DInfo.title = (String) ch().a;
        launcherShortcut3DInfo.itemType = 2;
        ah a = a(launcherShortcut3DInfo);
        launcherShortcut3DInfo.packagename = a.ch().c.getPackageName();
        launcherShortcut3DInfo.classname = a.ch().c.getClassName();
        launcherShortcut3DInfo.internal = true;
        return a;
    }

    public final ah a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        ah ahVar = new ah(this, this.C);
        ahVar.a((LauncherItem3DInfo) launcherShortcut3DInfo);
        if (launcherShortcut3DInfo.iconType == 1) {
            ahVar.aJ();
        } else if (ahVar.cj()) {
            ahVar.aJ();
        }
        ahVar.L().x = L().x;
        ahVar.L().y = L().y;
        ahVar.bN();
        ahVar.a((com.censivn.C3DEngine.b.l) new com.tsf.shell.workspace3D.a.g(ahVar));
        launcherShortcut3DInfo.setTarget(ahVar);
        this.H.add(ahVar);
        return ahVar;
    }

    public final com.tsf.shell.h.b ch() {
        while (this.a != null) {
            this = this.a;
        }
        return this.I;
    }

    public final void ci() {
        if (this.H.size() > 0) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                bf.l().a((j) it.next());
            }
        }
        com.censivn.C3DEngine.a.f().a(this.C);
        this.H.clear();
        this.H = null;
        this.I = null;
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void n() {
        if (this.a != null) {
            if (this.a.C != this.C) {
                com.censivn.C3DEngine.a.f().a(this.C);
            }
            this.a.e((com.censivn.C3DEngine.b.r) this);
        }
        super.n();
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void a_() {
        com.tsf.shell.i.a().a("WidgetShortcutApp");
        super.a_();
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void b_() {
        com.tsf.shell.i.a().b("WidgetShortcutApp");
        super.b_();
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
        arrayList.add(4);
        arrayList.add(5);
        return arrayList;
    }
}
