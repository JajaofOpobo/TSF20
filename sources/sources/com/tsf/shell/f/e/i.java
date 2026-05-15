package com.tsf.shell.f.e;

import com.censivn.C3DEngine.api.element.Color4;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i extends com.censivn.C3DEngine.b.f.j {
    private int b = 0;
    private int c = 0;
    private com.tsf.shell.f.a.b.b a = new com.tsf.shell.f.a.b.b(0.0f, 0.0f, this);

    public i() {
        this.a.setDefaultColor(new Color4(255, 0, 0, 100));
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        com.tsf.shell.manager.a.u.a(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        com.tsf.shell.manager.a.u.a();
    }

    public void a(float f) {
        this.a.a(f);
        a(this.b);
    }

    public void b(float f) {
        this.a.b(f);
        b(this.c);
    }

    public void a(float f, float f2) {
        a(f);
        b(f2);
    }

    public void a(int i) {
        this.b = i;
        switch (i) {
            case 0:
                this.a.position().x = 0.0f;
                minX((-this.a.b()) / 2.0f);
                maxX(this.a.b() / 2.0f);
                break;
            case 3:
                this.a.position().x = this.a.b() / 2.0f;
                minX(0.0f);
                maxX(this.a.b());
                break;
            case 4:
                this.a.position().x = (-this.a.b()) / 2.0f;
                minX(-this.a.b());
                maxX(0.0f);
                break;
        }
    }

    public void b(int i) {
        this.c = i;
        switch (i) {
            case 0:
                this.a.position().y = 0.0f;
                minY((-this.a.c()) / 2.0f);
                maxY(this.a.c() / 2.0f);
                break;
            case 1:
                this.a.position().y = (-this.a.c()) / 2.0f;
                minY(-this.a.c());
                maxY(0.0f);
                break;
            case 2:
                this.a.position().y = this.a.c() / 2.0f;
                minY(0.0f);
                maxY(this.a.c());
                break;
        }
    }
}
