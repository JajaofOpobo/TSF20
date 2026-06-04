package com.tsf.shell.workspace3D.g.d;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r implements Runnable {
    private static Paint l;
    public o a;
    public q b;
    public TextureElement c;
    public TextureElement d;
    public Intent e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;

    public r(int i, Bitmap bitmap) {
        this(i != 0 ? com.censivn.C3DEngine.h.a.c(i) : null, bitmap);
    }

    public r(String str, Bitmap bitmap) {
        this.h = true;
        this.i = false;
        this.k = false;
        this.g = str;
        this.c = com.censivn.C3DEngine.a.f().a(bitmap, false);
        bitmap.recycle();
        this.b = new q();
    }

    public final void a() {
        d();
        if (this.g != null) {
            String str = this.g;
            if (l == null) {
                Paint paint = new Paint();
                l = paint;
                paint.setColor(ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.optionMenuLabelTextColor);
                l.setTextSize(26.0f);
                l.setAntiAlias(true);
                l.setTextAlign(Paint.Align.LEFT);
            }
            Bitmap a = com.tsf.shell.setting.a.v.a(str, (int) l.measureText(str, 0, str.length()), 28, l, true, true, -3);
            this.d = com.censivn.C3DEngine.a.f().a(a, false);
            a.recycle();
        }
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a();
        }
    }

    public final boolean b() {
        return this.c == null;
    }

    public final void c() {
        d();
        if (this.c != null) {
            com.censivn.C3DEngine.a.f().a(this.c);
            this.c = null;
        }
        this.a = null;
        this.b.a.clear();
        this.b = null;
    }

    public final void a(Bitmap bitmap) {
        this.g = null;
        this.c = com.censivn.C3DEngine.a.f().a(bitmap, false);
        bitmap.recycle();
        this.b = new q();
    }

    public final void d() {
        if (this.d != null) {
            com.censivn.C3DEngine.a.f().a(this.d);
            this.d = null;
        }
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            ((r) it.next()).d();
        }
    }

    public final void a(r rVar) {
        this.b.a.add(0, rVar);
    }

    public final void b(r rVar) {
        this.b.a(rVar);
    }

    public final void c(r rVar) {
        this.b.a.remove(rVar);
    }

    public final int e() {
        return this.b.a.size();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f != null && !this.f.equals("")) {
            s sVar = new s(this, this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(sVar);
        }
    }
}
