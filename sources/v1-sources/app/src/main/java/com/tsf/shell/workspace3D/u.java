package com.tsf.shell.workspace3D;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class u {
    private static TextureElement a;
    private static TextureElement b;
    private static com.censivn.C3DEngine.b.v c;
    private static com.censivn.C3DEngine.e.b d;
    private static com.censivn.C3DEngine.e.b e;
    private static com.censivn.C3DEngine.e.b f;
    private static ProgressDialog g;

    public static void a(com.censivn.C3DEngine.b.ab abVar) {
        c = new com.censivn.C3DEngine.b.v();
        Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tsf_shell_logo);
        a = com.censivn.C3DEngine.a.f().a(a2, false);
        a2.recycle();
        Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tsf_shell_logo_light);
        b = com.censivn.C3DEngine.a.f().a(a3, false);
        a3.recycle();
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(a.width * com.censivn.C3DEngine.a.b, a.height * com.censivn.C3DEngine.a.b, (byte) 0);
        d = bVar;
        bVar.z().c(a);
        d.N().setAll(0.0f, 0.0f, 1.0f);
        d.a_(true);
        v vVar = new v(b.width * com.censivn.C3DEngine.a.b, b.height * com.censivn.C3DEngine.a.b);
        e = vVar;
        vVar.z().c(b);
        com.censivn.C3DEngine.e.b bVar2 = new com.censivn.C3DEngine.e.b(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m, (byte) 0);
        f = bVar2;
        bVar2.a(1.2f, 1.2f, 1.0f);
        f.a(255, 0, 0, 0);
        f.b(0.0f);
        f.a(new com.censivn.C3DEngine.b.l(f));
        c.d(f);
        c.d(d);
        d.d(e);
        abVar.d(c);
        w wVar = new w();
        wVar.a(220);
        com.censivn.C3DEngine.g.s.a(f, 250, wVar);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(com.censivn.C3DEngine.g.a.e);
        uVar.j(0.9f);
        uVar.k(0.9f);
        com.censivn.C3DEngine.g.s.a(d, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public static void a() {
        x xVar = new x();
        xVar.a(0);
        com.censivn.C3DEngine.g.s.a(f, ThemeShellDescription.PAGE_PREVIEW_SELECT, xVar);
        y yVar = new y();
        yVar.a(com.censivn.C3DEngine.g.a.e);
        yVar.j(0.0f);
        yVar.k(0.0f);
        yVar.a(0);
        com.censivn.C3DEngine.g.s.a(d, ThemeShellDescription.PAGE_PREVIEW_SELECT, yVar);
    }

    public static void a(String str) {
        if (g == null) {
            ProgressDialog progressDialog = new ProgressDialog(com.censivn.C3DEngine.a.c());
            g = progressDialog;
            progressDialog.setIndeterminate(true);
            g.setCancelable(false);
        }
        g.setMessage(str);
        g.show();
    }

    public static void b() {
        g.dismiss();
    }
}
