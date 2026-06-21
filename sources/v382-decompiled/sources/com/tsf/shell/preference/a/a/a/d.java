package com.tsf.shell.preference.a.a.a;

import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends j {
    private ArrayList a;

    public d(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(150.0f), 0.0f, com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.a = new ArrayList();
        this.a.add(new e(this, R.drawable.preference_about_facebook, "http://www.facebook.com/tsfapp"));
        this.a.add(new e(this, R.drawable.preference_about_google_plus, "http://gplus.to/tsf"));
        this.a.add(new e(this, R.drawable.preference_about_tsf, "http://www.tsfui.com/"));
        float a = com.censivn.C3DEngine.b.b.a.a(118.0f);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final e eVar = (e) it.next();
            com.censivn.C3DEngine.b.f.m mVar = new com.censivn.C3DEngine.b.f.m(a, a, false);
            mVar.setDefaultColor(new Color4(-5592406));
            eVar.d = mVar;
            mVar.textures().addElement(eVar.c);
            mVar.calAABB(1.2f, 1.2f, 1.0f);
            mVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(mVar) { // from class: com.tsf.shell.preference.a.a.a.d.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    d.this.a(eVar.b);
                }
            });
            e().addChild(mVar);
        }
        e().mouseEnabled(true);
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        float a = com.censivn.C3DEngine.b.b.a.a(118.0f);
        float a2 = com.censivn.C3DEngine.b.b.a.a(80.0f);
        float a3 = ((-com.censivn.C3DEngine.b.b.a.F) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(120.0f) + (a / 2.0f);
        Iterator it = this.a.iterator();
        while (true) {
            float f = a3;
            if (it.hasNext()) {
                ((e) it.next()).d.position().x = f;
                a3 = a + a2 + f;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
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
