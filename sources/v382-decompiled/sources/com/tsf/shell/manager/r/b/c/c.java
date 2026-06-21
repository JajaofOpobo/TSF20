package com.tsf.shell.manager.r.b.c;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c {
    public String a;
    public String b;
    public ApplicationInfo e;
    final /* synthetic */ b f;
    public TextureElement d = new TextureElement(0, false);
    public ArrayList c = new ArrayList();

    public c(b bVar, String str) {
        this.f = bVar;
        this.b = str;
    }

    public TextureElement a() {
        Resources resources;
        int i;
        Bitmap bitmap = null;
        if (this.d.id == 0) {
            try {
                resources = this.f.e.getResourcesForApplication(this.e);
            } catch (PackageManager.NameNotFoundException e) {
                resources = null;
            }
            if (resources != null && (i = this.e.icon) != 0) {
                bitmap = com.tsf.shell.manager.r.c.a.a(resources, i);
            }
            if (bitmap == null) {
                bitmap = x.a(R.drawable.sym_def_app_icon);
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I, true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            Bitmap a = com.tsf.shell.manager.o.b.c.a(this.a);
            Bitmap a2 = com.tsf.shell.manager.o.b.c.a();
            Canvas canvas = new Canvas(a2);
            canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
            com.tsf.shell.manager.o.b.c.a(canvas, createScaledBitmap);
            if (a != null) {
                com.tsf.shell.manager.o.b.c.b(canvas, a, true);
            }
            com.censivn.C3DEngine.a.g().a(this.d, a2);
        }
        return this.d;
    }

    public void a(d dVar) {
        this.c.add(dVar);
    }

    public void b() {
        com.censivn.C3DEngine.a.g().a(this.d);
    }
}
