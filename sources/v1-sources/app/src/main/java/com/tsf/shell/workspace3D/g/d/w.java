package com.tsf.shell.workspace3D.g.d;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.at;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.cd;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeOptionMenuDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.Iterator;

/* loaded from: classes.dex */
public class w implements at, bj {
    private d e;
    private d f;
    private Runnable h;
    private r k;
    private r l;
    private float o;
    private float p;
    private boolean a = false;
    private boolean b = false;
    private ThemeOptionMenuDescription n = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu;
    private ao m = new ao();
    private t j = new t(this);
    private com.censivn.C3DEngine.b.v i = new com.censivn.C3DEngine.b.v();
    private com.censivn.C3DEngine.e.c c = new x(this);
    private Runnable g = new ag(this);
    private q d = new q();

    public w() {
        r rVar = new r(0, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_ADD));
        rVar.b(new ah(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_ADD_APP)));
        rVar.b(new ai(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_ADD_SHORTCUT)));
        rVar.b(new aj(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_ADD_TSF_WIDGET)));
        rVar.b(new ak(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_ADD_ANDROID_WIDGET)));
        rVar.b(new al(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_ADD_FOLDER)));
        this.d.a(rVar);
        r rVar2 = new r(0, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_TOOL));
        rVar2.b(new am(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_TOOL_LASSO)));
        rVar2.b(new an(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_TOOL_MUTIL_CHOICE)));
        rVar2.b(new y(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_TOOL_DESKTOP_EDITOR)));
        this.d.a(rVar2);
        this.d.a(new z(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_TSF)));
        this.d.a(new aa(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_WALLPAPER)));
        r rVar3 = new r(0, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_FAVORITE));
        this.k = rVar3;
        rVar3.b = new j();
        ab abVar = new ab(this, this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_FAVORITE_ADD));
        this.l = abVar;
        abVar.h = false;
        ao aoVar = this.m;
        Iterator it = ao.a().iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            r rVar4 = new r(pVar.b, pVar.e);
            rVar4.e = pVar.c;
            rVar4.f = pVar.d;
            rVar4.j = (int) pVar.a;
            rVar4.i = true;
            rVar4.k = true;
            rVar3.b(rVar4);
        }
        if (this.k.e() < 6) {
            rVar3.a(this.l);
        }
        this.d.a(rVar3);
        i iVar = new i();
        iVar.a = 623.0f * com.censivn.C3DEngine.a.b;
        iVar.b = 10.0f;
        iVar.c = ThemeOptionMenuDescription.OPTION_MENU_BG;
        iVar.d = ThemeOptionMenuDescription.OPTION_MENU_ITEM_BG;
        iVar.e = com.censivn.C3DEngine.a.b * 80.0f;
        iVar.f = com.censivn.C3DEngine.a.b * 80.0f;
        iVar.g = 24.0f * com.censivn.C3DEngine.a.b;
        iVar.h = this.c;
        iVar.k = this.n.optionMenuButtonStandardColor;
        iVar.j = this.n.optionMenuButtonPressedColor;
        iVar.l = 0.0f;
        iVar.i = 1;
        iVar.m = 0;
        this.e = new ae(this, this, iVar);
        i iVar2 = new i();
        iVar2.a = 720.0f * com.censivn.C3DEngine.a.b;
        iVar2.b = 8.0f;
        iVar2.c = ThemeOptionMenuDescription.OPTION_MENU_SECOND_BG;
        iVar2.d = ThemeOptionMenuDescription.OPTION_MENU_SECOND_ITEM_BG;
        iVar2.e = com.censivn.C3DEngine.a.b * 60.0f;
        iVar2.f = com.censivn.C3DEngine.a.b * 60.0f;
        iVar2.g = 25.0f * com.censivn.C3DEngine.a.b;
        iVar2.k = this.n.optionMenuButtonStandardColor;
        iVar2.j = this.n.optionMenuButtonPressedColor;
        iVar2.h = this.c;
        iVar2.l = 1.9f;
        iVar2.i = 2;
        iVar2.m = 1;
        this.f = new af(this, this, iVar2);
        this.e.a(this.f);
        this.f.b(this.e);
    }

    public void a() {
    }

    static /* synthetic */ void a(w wVar, com.tsf.shell.action.f fVar) {
        byte[] a = com.censivn.C3DEngine.h.a.a(fVar.c);
        String str = fVar.a;
        String str2 = fVar.b;
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("data", a);
        contentValues.put("intent", str2);
        Uri insert = contentResolver.insert(cd.b, contentValues);
        if (insert == null) {
            fVar.c.recycle();
            return;
        }
        int parseInt = Integer.parseInt(insert.getPathSegments().get(1));
        contentValues.clear();
        r rVar = new r(fVar.a, fVar.c);
        rVar.j = parseInt;
        rVar.i = true;
        rVar.f = str2;
        try {
            rVar.e = Intent.parseUri(str2, 0);
        } catch (Exception e) {
        }
        rVar.k = true;
        rVar.a();
        wVar.k.b(rVar);
        if (wVar.k.e() >= 7) {
            wVar.f.b((k) wVar.l.a);
        }
        if (wVar.f.p()) {
            wVar.f.q();
        }
    }

    public final void a(r rVar) {
        boolean z = false;
        if (this.k.e() == 6) {
            if (this.l.b()) {
                this.l.a(this.n.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_FAVORITE_ADD));
                this.k.a(this.l);
            }
            z = true;
        }
        this.k.c(rVar);
        if (rVar != this.l) {
            com.censivn.C3DEngine.a.c().getContentResolver().delete(cd.a(rVar.j), null, null);
        }
        rVar.c();
        if (this.f.p()) {
            if (this.k.e() <= 1) {
                this.f.m();
            }
            this.f.q();
            if (z) {
                this.f.a((k) this.l.a);
            }
        }
    }

    public final Number3d c() {
        return this.e.i().l();
    }

    public final t d() {
        return this.j;
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            e();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public final void a(float f, float f2) {
        if (!this.a && !this.b) {
            float f3 = f2 + (70.0f * com.censivn.C3DEngine.a.b);
            Iterator it = this.d.a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a();
            }
            this.o = f;
            this.p = f3;
            com.tsf.shell.aq.a(this);
            bd.a(this);
            this.e.a(this.d, f, f3);
            this.a = true;
            this.b = false;
            com.censivn.C3DEngine.b.m.d().a(this.e.a, true);
            this.e.n();
            this.f.n();
            bf.m().a(this.i);
        }
    }

    public final void a(com.censivn.C3DEngine.b.v vVar) {
        vVar.Q();
        this.i.a(vVar, 0);
    }

    public final void b(com.censivn.C3DEngine.b.v vVar) {
        this.i.e(vVar);
    }

    static /* synthetic */ void c(w wVar) {
        Iterator it = wVar.d.a.iterator();
        while (it.hasNext()) {
            ((r) it.next()).d();
        }
    }

    public final void e() {
        if (!this.b && this.a) {
            this.b = true;
            bf.a(false);
            this.e.a(this.g, true);
            this.f.a((Runnable) null, true);
            this.j.i();
        }
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        e();
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
