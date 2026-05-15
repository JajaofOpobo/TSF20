package com.tsf.shell.f.h.a.a.a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.Home;
import com.tsf.shell.f.e.h.a;
import com.tsf.shell.manager.c.a.a.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends j implements a.InterfaceC0098a {
    private com.tsf.shell.f.h.a.a.d a;
    private j b;
    private float d;
    private com.tsf.shell.f.h.a.a.b f;
    private m g;
    private com.tsf.shell.f.e.d<d> h;
    private a j;
    private e l;
    private TextureElement k = new TextureElement(0, false);
    private com.tsf.shell.utils.c m = new com.tsf.shell.utils.c();
    private ArrayList<d> i = new ArrayList<>();
    private Number3d e = new Number3d();
    private g c = new g(com.tsf.shell.f.h.a.a.d.b, com.tsf.shell.f.h.a.a.d.b);

    public c(com.tsf.shell.f.h.a.a.d dVar, j jVar) {
        this.a = dVar;
        this.b = jVar;
        this.c.calAABB();
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c) { // from class: com.tsf.shell.f.h.a.a.a.c.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
            }
        });
        this.d = com.tsf.shell.f.h.a.a.d.a / com.tsf.shell.f.h.a.a.d.b;
        addChild(this.c);
        this.g = new m();
        this.g.d(55);
        addChild(this.g);
        this.j = new a(this);
        addChild(this.j);
        this.h = new com.tsf.shell.f.e.d<d>() { // from class: com.tsf.shell.f.h.a.a.a.c.2
            @Override // com.tsf.shell.f.e.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d b() {
                return new d();
            }
        };
        this.l = new e(this) { // from class: com.tsf.shell.f.h.a.a.a.c.3
            @Override // com.tsf.shell.f.e.d.a.d
            public void i() {
                if (c.this.f.a().c()) {
                    c.this.f.g();
                    c.this.f.f();
                    c.this.f.e();
                    c.this.b(false);
                    c.this.j();
                    c.this.a(false);
                }
            }
        };
        this.l.a(this);
    }

    public com.tsf.shell.f.h.a.a.b a() {
        return this.f;
    }

    public void b() {
        if (this.f != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.h.a.a.a.c.4
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent("android.intent.action.EDIT");
                    intent.setData(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(c.this.f.a().b)));
                    Home.b().a(intent, (Object) null);
                }
            });
        }
    }

    @Override // com.tsf.shell.f.e.h.a.InterfaceC0098a
    public void a(Bitmap bitmap) {
        if (this.f != null) {
            com.censivn.C3DEngine.a.g().a(this.k, bitmap);
            a(this.k, true);
        }
        bitmap.recycle();
    }

    public void a(TextureElement textureElement, boolean z) {
        this.c.textures().removeAll();
        this.c.textures().addElement(textureElement);
    }

    private float f() {
        return (com.censivn.C3DEngine.b.b.a.B - (this.c.c() / 2.0f)) - com.censivn.C3DEngine.b.b.a.a(80.0f);
    }

    private float g() {
        return (f() - (this.c.c() / 2.0f)) - com.censivn.C3DEngine.b.b.a.a(60.0f);
    }

    private float h() {
        return g() - com.censivn.C3DEngine.b.b.a.a(150.0f);
    }

    private void i() {
        if (this.k.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        i();
        a(this.f.c(), false);
        if (this.f.c().id == this.a.c(false).id) {
            a(this.a.c(true), false);
            return;
        }
        Bitmap bitmapA = this.f.a().a(com.tsf.shell.f.h.a.a.d.c, com.tsf.shell.f.h.a.a.d.c, true);
        if (bitmapA != null) {
            com.censivn.C3DEngine.a.g().a(this.k, bitmapA);
            bitmapA.recycle();
            a(this.k, false);
        }
    }

    public void a(boolean z) {
        this.g.a(this.f.a().c);
        a(this.g, g(), 0, z);
    }

    public void b(boolean z) {
        k();
        System.currentTimeMillis();
        this.f.a().d();
        int size = this.f.a().g.size();
        this.i.clear();
        for (a.c cVar : this.f.a().f) {
            d dVarC = this.h.c();
            dVarC.a(cVar);
            if (cVar == this.f.a().a()) {
                dVarC.e();
            }
            this.i.add(dVarC);
            if ((this.i.size() >= 2 && size > 0) || this.i.size() >= 3) {
                break;
            }
        }
        for (a.C0126a c0126a : this.f.a().g) {
            d dVarC2 = this.h.c();
            dVarC2.a(c0126a);
            if (c0126a == this.f.a().b()) {
                dVarC2.e();
            }
            this.i.add(dVarC2);
            if (this.i.size() >= 3) {
                break;
            }
        }
        float fH = h();
        float fA = com.censivn.C3DEngine.b.b.a.a(160.0f);
        int i = 0;
        float f = fH;
        int i2 = 50;
        while (true) {
            int i3 = i;
            if (i3 < this.i.size()) {
                d dVar = this.i.get(i3);
                a(dVar.c(), dVar.a(), i2, z);
                int i4 = i2 + 30;
                a(dVar.d(), dVar.b(), i4, z);
                i2 = i4 + 30;
                dVar.position().y = f;
                f -= fA;
                addChild(dVar);
                i = i3 + 1;
            } else {
                a(this.j, com.censivn.C3DEngine.b.b.a.C + com.censivn.C3DEngine.b.b.a.a(180.0f), 150, z);
                return;
            }
        }
    }

    public void a(com.tsf.shell.f.h.a.a.b bVar) {
        this.f = bVar;
        bVar.b().alpha(0.0f);
        this.e.reset();
        this.c.mouseEnabled(false);
        bVar.localToGlobal(this.e);
        removeFromParent();
        this.c.position().setAllFrom(this.e);
        this.c.scale().setAll(this.d, this.d, 1.0f);
        this.b.addChild(this);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.a.c.5
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.this.c.mouseEnabled(true);
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.f(0.0f);
        dVar.h(f());
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
        j();
        a(true);
        b(true);
        this.l.b();
        this.j.setZOrderOnTop();
    }

    public boolean c() {
        if (this.l.a()) {
            this.l.e();
            return false;
        }
        a(this.f.c(), false);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.a.c.6
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.this.f.a().e();
                c.this.removeFromParent();
                c.this.c.textures().clear();
                c.this.f.b().alpha(255.0f);
                c.this.l();
            }
        };
        dVar.l(this.d);
        dVar.m(this.d);
        float f = this.e.y;
        this.e.reset();
        this.f.localToGlobal(this.e);
        dVar.f(this.e.x);
        dVar.h(f);
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
        a(this.g, 0);
        for (int i = 0; i < this.i.size(); i++) {
            d dVar2 = this.i.get(i);
            a(dVar2.c(), 0);
            a(dVar2.d(), 0);
        }
        com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
        dVar3.a(0);
        dVar3.h(com.censivn.C3DEngine.b.b.a.C - com.censivn.C3DEngine.b.b.a.a(180.0f));
        com.censivn.C3DEngine.b.g.c.a(this.j);
        com.censivn.C3DEngine.b.g.c.a(this.j, 250, dVar3);
        this.l.c();
        return true;
    }

    private void k() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.i.size()) {
                d dVar = this.i.get(i2);
                dVar.g();
                dVar.removeFromParent();
                this.h.a(dVar);
                i = i2 + 1;
            } else {
                this.i.clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        k();
        i();
        this.f = null;
    }

    public void d() {
        this.j.a();
    }

    private void a(i iVar, float f, int i, boolean z) {
        if (z) {
            iVar.position().y = f - com.censivn.C3DEngine.b.b.a.a(350.0f);
            iVar.alpha(0.0f);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.h(f);
            dVar.a(255);
            dVar.a(com.censivn.C3DEngine.b.g.a.a);
            if (i != 0) {
                dVar.b(i);
            }
            com.censivn.C3DEngine.b.g.c.a(iVar);
            com.censivn.C3DEngine.b.g.c.a(iVar, 350, dVar);
            return;
        }
        iVar.position().y = f;
        iVar.alpha(255.0f);
    }

    private void a(i iVar, int i) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(iVar.position().y + com.censivn.C3DEngine.b.b.a.a(250.0f));
        dVar.a(0);
        if (i != 0) {
            dVar.b(i);
        }
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 230, dVar);
    }

    public void e() {
        this.l.k();
    }
}
