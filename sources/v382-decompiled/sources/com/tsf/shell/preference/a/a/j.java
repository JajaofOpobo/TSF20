package com.tsf.shell.preference.a.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
class j extends com.censivn.C3DEngine.b.e.j {
    final /* synthetic */ i a;
    private m b;
    private TextureElement d;
    private int e = 0;

    public j(i iVar) {
        this.a = iVar;
        h();
    }

    public void f(int i) {
        this.e = i;
        m();
    }

    public int e() {
        return this.e;
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void i() {
        super.i();
        this.b.alpha(100.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void j() {
        super.j();
        this.b.alpha(255.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        super.onDrawStart();
        if (this.d.id == 0) {
            Bitmap a = x.a(R.drawable.preference_side_menu_direction_icon, com.censivn.C3DEngine.b.b.a.a(90.0f), com.censivn.C3DEngine.b.b.a.a(120.0f));
            com.censivn.C3DEngine.a.g().a(this.d, a);
            a.recycle();
        }
    }

    private void h() {
        this.b = com.censivn.C3DEngine.b.b.a.a(90.0f, 120.0f);
        this.d = new TextureElement(0, false);
        this.b.textures().addElement(this.d);
        this.b.position().y = (-b()) / 2.0f;
        addChild(this.b);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.preference.a.a.j.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (j.this.e == 0) {
                    j.this.e = 1;
                } else {
                    j.this.e = 0;
                }
                com.tsf.shell.manager.a.n.a(j.this.e, false);
                j.this.m();
                j.this.a.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.e == 0) {
            this.b.rotation().z = 0.0f;
        } else {
            this.b.rotation().z = 180.0f;
        }
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        if (this.b != null) {
            this.b.position().x = (i / 2.0f) - (this.b.b() / 2.0f);
        }
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void e(int i) {
        super.e(i);
        if (this.b != null) {
            this.b.position().y = (-i) / 2.0f;
        }
    }
}
