package com.tsf.shell.f.d.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class d extends com.tsf.shell.f.f.f {
    public static TextureElement b = new TextureElement(0, false);
    public b a;

    public d(int i, boolean z) {
        super(i, 0, z);
        this.a = new b(o());
    }

    public void a() {
    }

    public void a(com.tsf.shell.f.i.b.e.b bVar) {
    }

    public void b(com.tsf.shell.f.i.b.e.b bVar) {
    }

    public void b() {
    }

    public void c() {
    }

    private h o() {
        h hVar = new h() { // from class: com.tsf.shell.f.d.b.a.d.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (d.b.id == 0) {
                    Bitmap a = com.tsf.shell.manager.o.b.a.a();
                    Canvas canvas = new Canvas(a);
                    canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                    com.tsf.shell.manager.o.b.a.a(canvas, x.a(b.d.effect_icon_standard, com.tsf.shell.manager.o.b.a.H, com.tsf.shell.manager.o.b.a.I), true);
                    com.censivn.C3DEngine.a.g().a(d.b, a);
                }
                d.this.a(this);
            }

            @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.censivn.C3DEngine.b.f.j
            public void onDrawChildEnd() {
                super.onDrawChildEnd();
                d.this.b(this);
                com.tsf.shell.manager.i.a.a(d.this, com.censivn.C3DEngine.b.b.a.a(30.0f));
            }
        };
        hVar.f((float) (Math.random() * 200.0d));
        hVar.k.textures().addElement(b);
        return hVar;
    }

    public void d() {
        if (b.id != 0) {
            com.censivn.C3DEngine.a.g().a(b);
        }
    }

    public b e() {
        return this.a;
    }
}
