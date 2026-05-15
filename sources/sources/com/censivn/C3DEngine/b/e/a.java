package com.censivn.C3DEngine.b.e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends g {
    private k a;
    private TextureElement b;
    private boolean d = false;
    private boolean e = false;
    private C0027a f;

    /* JADX INFO: renamed from: com.censivn.C3DEngine.b.e.a$a, reason: collision with other inner class name */
    public static class C0027a {
        public boolean a(boolean z) {
            return true;
        }
    }

    public a() {
        m();
    }

    public void a(C0027a c0027a) {
        this.f = c0027a;
    }

    public boolean e() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        h();
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        if (this.b.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.b);
        }
    }

    public void h() {
        this.e = this.d;
        Bitmap bitmapA = x.a(this.d ? b.d.preference_check_on : b.d.preference_check_off, com.censivn.C3DEngine.b.b.a.a(58.0f), com.censivn.C3DEngine.b.b.a.a(58.0f));
        com.censivn.C3DEngine.a.g().a(this.b, bitmapA);
        bitmapA.recycle();
    }

    private void m() {
        this.a = com.censivn.C3DEngine.b.b.a.a(58.0f, 58.0f);
        this.b = new TextureElement(0, false);
        this.a.textures().addElement(this.b);
        this.a.position().y = (-b()) / 2.0f;
        addChild(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.e.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (a.this.d) {
                    a.this.c(false);
                    a.this.n();
                } else {
                    a.this.c(true);
                    a.this.n();
                }
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.e != this.d) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f != null) {
            this.f.a(this.d);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        if (this.a != null) {
            this.a.position().x = (i / 2.0f) - 29.0f;
        }
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void e(int i) {
        super.e(i);
        if (this.a != null) {
            this.a.position().y = (-i) / 2.0f;
        }
    }
}
