package com.tsf.shell.e.d.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.j;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends com.tsf.shell.e.f.f {
    public static TextureElement b = new TextureElement(0, false);
    public c a;

    public e(int i, boolean z) {
        super(i, 0, z);
        this.a = new c(o());
    }

    public void a() {
    }

    public void a(com.tsf.shell.e.i.b.e.b bVar) {
    }

    public void b(com.tsf.shell.e.i.b.e.b bVar) {
    }

    public void b() {
    }

    public void c() {
    }

    private j o() {
        j jVar = new j() { // from class: com.tsf.shell.e.d.b.a.e.1
            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (e.b.id == 0) {
                    Bitmap a = com.tsf.shell.manager.o.b.a.a();
                    Canvas canvas = new Canvas(a);
                    canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                    com.tsf.shell.manager.o.b.a.a(canvas, x.a(R.drawable.effect_icon_standard, com.tsf.shell.manager.o.b.a.H, com.tsf.shell.manager.o.b.a.I), true);
                    com.censivn.C3DEngine.a.g().a(e.b, a);
                }
                e.this.a(this);
            }

            @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.censivn.C3DEngine.b.f.l
            public void onDrawChildEnd() {
                super.onDrawChildEnd();
                e.this.b(this);
                com.tsf.shell.manager.i.a.a(e.this, com.censivn.C3DEngine.b.b.a.a(30.0f));
            }
        };
        jVar.f((float) (Math.random() * 200.0d));
        jVar.k.textures().addElement(b);
        return jVar;
    }

    public void d() {
        if (b.id != 0) {
            com.censivn.C3DEngine.a.g().a(b);
        }
    }

    public c e() {
        return this.a;
    }
}
