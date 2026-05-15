package com.tsf.shell.manager.r.b;

import com.tsf.b;
import com.tsf.shell.manager.r.b.c.g;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.tsf.shell.f.e.g.d {
    public com.tsf.shell.manager.r.b.a.a a;
    public g b;
    public b c;
    public d d;
    public e e;
    public boolean f;
    private C0144a g;

    /* JADX INFO: renamed from: com.tsf.shell.manager.r.b.a$a, reason: collision with other inner class name */
    public static class C0144a {
        public void a() {
        }

        public void a(com.tsf.shell.f.i.b.e.b bVar) {
        }

        public com.tsf.shell.manager.o.a b() {
            return null;
        }
    }

    public a() {
        super(800.0f * com.censivn.C3DEngine.b.b.a.c);
        this.f = false;
        ArrayList<com.tsf.shell.f.e.g.a.b> arrayList = new ArrayList<>();
        this.e = new e(this, x.c(b.i.group_toggle));
        this.a = new com.tsf.shell.manager.r.b.a.a(this, x.c(b.i.group_applications));
        this.b = new g(this, x.c(b.i.group_widgets));
        this.c = new b(this, x.c(b.i.widget_menu_decoration));
        this.d = new d(this, x.c(b.i.group_shortcuts));
        arrayList.add(this.e);
        arrayList.add(this.a);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.f.e.g.d
    public void show(int i) {
        this.f = false;
        this.e.disable();
        this.c.enable();
        this.b.enable();
        super.show(i);
    }

    @Override // com.tsf.shell.f.e.g.d
    public void show() {
        this.f = false;
        this.e.disable();
        this.c.enable();
        this.b.enable();
        super.show();
    }

    public void a(C0144a c0144a) {
        this.g = c0144a;
        this.f = true;
        this.e.enable();
        this.c.disable();
        this.b.disable();
        super.show();
    }

    public boolean a() {
        return this.f;
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onHide() {
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    public C0144a b() {
        return this.g;
    }
}
