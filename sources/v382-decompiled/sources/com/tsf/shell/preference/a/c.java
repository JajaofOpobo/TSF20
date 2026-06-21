package com.tsf.shell.preference.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {
    private ArrayList a = new ArrayList();
    private d b;

    public c() {
        this.a.add(new e(this, R.drawable.demo_icon_1));
        this.a.add(new e(this, R.drawable.demo_icon_2));
        this.a.add(new e(this, R.drawable.demo_icon_3));
        this.a.add(new e(this, R.drawable.demo_icon_4));
        this.a.add(new e(this, R.drawable.demo_icon_5));
        this.a.add(new e(this, R.drawable.demo_icon_6));
        this.a.add(new e(this, R.drawable.demo_icon_7));
        this.a.add(new e(this, R.drawable.demo_icon_8));
        this.a.add(new e(this, R.drawable.action_app_drawer_icon));
    }

    public d a() {
        if (this.b == null) {
            this.b = new d();
        }
        return this.b;
    }

    public TextureElement a(int i) {
        e eVar = (e) this.a.get(i);
        eVar.a();
        return eVar;
    }

    public void b(int i) {
        ((e) this.a.get(i)).b();
    }
}
