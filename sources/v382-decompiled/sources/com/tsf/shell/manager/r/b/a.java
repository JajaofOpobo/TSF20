package com.tsf.shell.manager.r.b;

import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends com.tsf.shell.e.e.g.e {
    public com.tsf.shell.manager.r.b.a.a a;
    public com.tsf.shell.manager.r.b.c.i b;
    public c c;
    public f d;
    public j e;
    public boolean f;
    private b g;

    public a() {
        super(800.0f * com.censivn.C3DEngine.b.b.a.c);
        this.f = false;
        ArrayList arrayList = new ArrayList();
        this.e = new j(this, x.c(R.string.group_toggle));
        this.a = new com.tsf.shell.manager.r.b.a.a(this, x.c(R.string.group_applications));
        this.b = new com.tsf.shell.manager.r.b.c.i(this, x.c(R.string.group_widgets));
        this.c = new c(this, x.c(R.string.widget_menu_decoration));
        this.d = new f(this, x.c(R.string.group_shortcuts));
        arrayList.add(this.e);
        arrayList.add(this.a);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.e.e.g.e
    public void show(int i) {
        this.f = false;
        this.e.disable();
        this.c.enable();
        this.b.enable();
        super.show(i);
    }

    @Override // com.tsf.shell.e.e.g.e
    public void show() {
        this.f = false;
        this.e.disable();
        this.c.enable();
        this.b.enable();
        super.show();
    }

    public void a(b bVar) {
        this.g = bVar;
        this.f = true;
        this.e.enable();
        this.c.disable();
        this.b.disable();
        super.show();
    }

    public boolean a() {
        return this.f;
    }

    @Override // com.tsf.shell.e.e.g.e
    public void onHide() {
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    public b b() {
        return this.g;
    }
}
