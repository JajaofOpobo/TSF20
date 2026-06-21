package com.tsf.shell.e.h.a.a.a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends l implements com.tsf.shell.e.e.h.b {
    private com.tsf.shell.e.h.a.a.d a;
    private l b;
    private float d;
    private com.tsf.shell.e.h.a.a.b f;
    private o g;
    private com.tsf.shell.e.e.e h;
    private a j;
    private e l;
    private TextureElement k = new TextureElement(0, false);
    private com.tsf.shell.utils.c m = new com.tsf.shell.utils.c();
    private ArrayList i = new ArrayList();
    private Number3d e = new Number3d();
    private g c = new g(com.tsf.shell.e.h.a.a.d.b, com.tsf.shell.e.h.a.a.d.b);

    public c(com.tsf.shell.e.h.a.a.d dVar, l lVar) {
        this.a = dVar;
        this.b = lVar;
        this.c.calAABB();
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c) { // from class: com.tsf.shell.e.h.a.a.a.c.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
            }
        });
        this.d = com.tsf.shell.e.h.a.a.d.a / com.tsf.shell.e.h.a.a.d.b;
        addChild(this.c);
        this.g = new o();
        this.g.d(55);
        addChild(this.g);
        this.j = new a(this);
        addChild(this.j);
        this.h = new com.tsf.shell.e.e.e() { // from class: com.tsf.shell.e.h.a.a.a.c.2
            @Override // com.tsf.shell.e.e.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d b() {
                return new d();
            }
        };
        this.l = new e(this) { // from class: com.tsf.shell.e.h.a.a.a.c.3
            @Override // com.tsf.shell.e.e.d.a.h
            public void i() {
                if (c.this.f.a().c()) {
                    c.this.f.h();
                    c.this.f.g();
                    c.this.f.f();
                    c.this.b(false);
                    c.this.j();
                    c.this.a(false);
                }
            }
        };
        this.l.a(this);
    }

    public com.tsf.shell.e.h.a.a.b a() {
        return this.f;
    }

    public void b() {
        if (this.f != null) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.h.a.a.a.c.4
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent("android.intent.action.EDIT");
                    intent.setData(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(c.this.f.a().b)));
                    Home.b().a(intent, (Object) null);
                }
            });
        }
    }

    @Override // com.tsf.shell.e.e.h.b
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
        Bitmap a = this.f.a().a(com.tsf.shell.e.h.a.a.d.c, com.tsf.shell.e.h.a.a.d.c, true);
        if (a != null) {
            com.censivn.C3DEngine.a.g().a(this.k, a);
            a.recycle();
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
        Iterator it = this.f.a().f.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.c.a.a.e eVar = (com.tsf.shell.manager.c.a.a.e) it.next();
            d dVar = (d) this.h.c();
            dVar.a(eVar);
            if (eVar == this.f.a().a()) {
                dVar.e();
            }
            this.i.add(dVar);
            if ((this.i.size() >= 2 && size > 0) || this.i.size() >= 3) {
                break;
            }
        }
        Iterator it2 = this.f.a().g.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.manager.c.a.a.c cVar = (com.tsf.shell.manager.c.a.a.c) it2.next();
            d dVar2 = (d) this.h.c();
            dVar2.a(cVar);
            if (cVar == this.f.a().b()) {
                dVar2.e();
            }
            this.i.add(dVar2);
            if (this.i.size() >= 3) {
                break;
            }
        }
        float h = h();
        float a = com.censivn.C3DEngine.b.b.a.a(160.0f);
        int i = 0;
        float f = h;
        int i2 = 50;
        while (true) {
            int i3 = i;
            if (i3 < this.i.size()) {
                d dVar3 = (d) this.i.get(i3);
                a(dVar3.c(), dVar3.a(), i2, z);
                int i4 = i2 + 30;
                a(dVar3.d(), dVar3.b(), i4, z);
                i2 = i4 + 30;
                dVar3.position().y = f;
                f -= a;
                addChild(dVar3);
                i = i3 + 1;
            } else {
                a(this.j, com.censivn.C3DEngine.b.b.a.C + com.censivn.C3DEngine.b.b.a.a(180.0f), 150, z);
                return;
            }
        }
    }

    public void a(com.tsf.shell.e.h.a.a.b bVar) {
        this.f = bVar;
        bVar.b().alpha(0.0f);
        this.e.reset();
        this.c.mouseEnabled(false);
        bVar.localToGlobal(this.e);
        removeFromParent();
        this.c.position().setAllFrom(this.e);
        this.c.scale().setAll(this.d, this.d, 1.0f);
        this.b.addChild(this);
        x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.a.c.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                c.this.c.mouseEnabled(true);
            }
        };
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.f(0.0f);
        xVar.h(f());
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        w.a(this.c);
        w.a(this.c, 500, xVar);
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
        x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.a.c.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                c.this.f.a().e();
                c.this.removeFromParent();
                c.this.c.textures().clear();
                c.this.f.b().alpha(255.0f);
                c.this.l();
            }
        };
        xVar.l(this.d);
        xVar.m(this.d);
        float f = this.e.y;
        this.e.reset();
        this.f.localToGlobal(this.e);
        xVar.f(this.e.x);
        xVar.h(f);
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        w.a(this.c);
        w.a(this.c, 500, xVar);
        a(this.g, 0);
        for (int i = 0; i < this.i.size(); i++) {
            d dVar = (d) this.i.get(i);
            a(dVar.c(), 0);
            a(dVar.d(), 0);
        }
        x xVar2 = new x();
        xVar2.a(0);
        xVar2.h(com.censivn.C3DEngine.b.b.a.C - com.censivn.C3DEngine.b.b.a.a(180.0f));
        w.a(this.j);
        w.a(this.j, 250, xVar2);
        this.l.c();
        return true;
    }

    private void k() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.i.size()) {
                d dVar = (d) this.i.get(i2);
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

    private void a(j jVar, float f, int i, boolean z) {
        if (z) {
            jVar.position().y = f - com.censivn.C3DEngine.b.b.a.a(350.0f);
            jVar.alpha(0.0f);
            x xVar = new x();
            xVar.h(f);
            xVar.a(255);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            if (i != 0) {
                xVar.b(i);
            }
            w.a(jVar);
            w.a(jVar, 350, xVar);
            return;
        }
        jVar.position().y = f;
        jVar.alpha(255.0f);
    }

    private void a(j jVar, int i) {
        x xVar = new x();
        xVar.h(jVar.position().y + com.censivn.C3DEngine.b.b.a.a(250.0f));
        xVar.a(0);
        if (i != 0) {
            xVar.b(i);
        }
        w.a(jVar);
        w.a(jVar, 230, xVar);
    }

    public void e() {
        this.l.k();
    }
}
