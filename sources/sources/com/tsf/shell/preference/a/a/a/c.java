package com.tsf.shell.preference.a.a.a;

import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.Home;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends h {
    private ArrayList<a> a;

    class a {
        public int a;
        public String b;
        public TextureElement c = new TextureElement(0, false);
        public com.censivn.C3DEngine.b.f.k d;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public void a() {
            if (this.c.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.c, this.a);
            }
        }

        public void b() {
            if (this.c.id != 0) {
                com.censivn.C3DEngine.a.g().a(this.c);
            }
        }
    }

    public c(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(150.0f), 0.0f, com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.a = new ArrayList<>();
        this.a.add(new a(b.d.preference_about_facebook, "http://www.facebook.com/tsfapp"));
        this.a.add(new a(b.d.preference_about_google_plus, "http://gplus.to/tsf"));
        this.a.add(new a(b.d.preference_about_tsf, "http://www.tsfui.com/"));
        float fA = com.censivn.C3DEngine.b.b.a.a(118.0f);
        for (final a aVar : this.a) {
            com.censivn.C3DEngine.b.f.k kVar = new com.censivn.C3DEngine.b.f.k(fA, fA, false);
            kVar.setDefaultColor(new Color4(-5592406));
            aVar.d = kVar;
            kVar.textures().addElement(aVar.c);
            kVar.calAABB(1.2f, 1.2f, 1.0f);
            kVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(kVar) { // from class: com.tsf.shell.preference.a.a.a.c.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    c.this.a(aVar.b);
                }
            });
            e().addChild(kVar);
        }
        e().mouseEnabled(true);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        float fA = com.censivn.C3DEngine.b.b.a.a(118.0f);
        float fA2 = com.censivn.C3DEngine.b.b.a.a(80.0f);
        float fA3 = ((-com.censivn.C3DEngine.b.b.a.F) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(120.0f) + (fA / 2.0f);
        Iterator<a> it = this.a.iterator();
        while (true) {
            float f = fA3;
            if (it.hasNext()) {
                it.next().d.position().x = f;
                fA3 = fA + fA2 + f;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        Home.b().startActivity(intent);
    }
}
