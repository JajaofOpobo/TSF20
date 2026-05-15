package com.tsf.shell.f.d.d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.tsf.shell.f.f.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static float a = 30.0f;
    private boolean d = false;
    private Vector2 c = new Vector2(0.0f, 0.0f);
    public World b = new World(this.c, true);

    public boolean a() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void a(g gVar) {
        com.tsf.shell.manager.a.v.c.e().a(gVar);
        boolean zB = b();
        if (zB) {
            this.b.setGravity(new Vector2(0.0f, -100.0f));
            this.b.step(0.025f, 3, 3);
            com.censivn.C3DEngine.a.e().j();
        }
        com.tsf.shell.manager.a.v.c.e().a(zB);
    }

    public boolean b() {
        return com.tsf.shell.manager.a.v.c.e().a();
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        com.tsf.shell.manager.a.v.c.e().a(bVar);
    }
}
