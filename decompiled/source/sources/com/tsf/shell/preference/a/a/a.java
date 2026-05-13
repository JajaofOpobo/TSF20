package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.i;
import com.censivn.C3DEngine.b.e.j;
import com.tsf.b;
/* loaded from: classes.dex */
public class a extends i {
    public a() {
        a(b.i.text_preferences);
        j jVar = new j();
        jVar.h(b.i.mn_title_db_export);
        jVar.b("/sdcard/TSFShell_data/");
        jVar.a(new j.a() { // from class: com.tsf.shell.preference.a.a.a.1
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.b.d.b(com.censivn.C3DEngine.a.d());
                    }
                });
            }
        });
        b(jVar);
        j jVar2 = new j();
        jVar2.h(b.i.mn_title_db_import);
        jVar2.b("/sdcard/TSFShell_data/");
        jVar2.a(new j.a() { // from class: com.tsf.shell.preference.a.a.a.2
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.b.d.a(com.censivn.C3DEngine.a.d());
                    }
                });
            }
        });
        b(jVar2);
        j jVar3 = new j();
        jVar3.h(b.i.pref_title_shell_reset);
        jVar3.a(new j.a() { // from class: com.tsf.shell.preference.a.a.a.3
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.b.d.c(com.censivn.C3DEngine.a.d());
                    }
                });
            }
        });
        b(jVar3);
    }
}
