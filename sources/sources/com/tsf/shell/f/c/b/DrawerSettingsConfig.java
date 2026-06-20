package com.tsf.shell.f.c.b;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.c.b.a.IDrawerSettingsCallback;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerSettingsConfig extends DrawerSettingsBase {
    private e a;
    private j b;

    public DrawerSettingsConfig(e eVar, j jVar) {
        this.a = eVar;
        this.b = jVar;
    }

    @Override // com.tsf.shell.f.c.b.DrawerSettingsBase
    public j a() {
        return this.b;
    }

    @Override // com.tsf.shell.f.c.b.DrawerSettingsBase
    public void b() {
        a.C0084a c0084aL = this.a.l();
        if (this.a.j()) {
            a(0.0f, c0084aL.h);
            DrawerSettingsConfig().rotation().z = 45.0f;
        } else {
            a(0.0f, c0084aL.l);
            DrawerSettingsConfig().rotation().z = 135.0f;
        }
        com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.c.b.DrawerSettingsConfig.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.m();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        a(false);
        com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.c.b.DrawerSettingsConfig.2
            @Override // java.lang.Runnable
            public void run() {
                f.this.a.k();
                f.this.f();
            }
        }, 500L);
        com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.c.b.DrawerSettingsConfig.3
            @Override // java.lang.Runnable
            public void run() {
                f.this.k();
                f.this.l();
            }
        }, 2500L);
    }
}
