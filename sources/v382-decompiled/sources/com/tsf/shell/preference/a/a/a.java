package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.m;
import com.censivn.C3DEngine.b.e.n;
import com.censivn.C3DEngine.b.e.o;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class a extends m {
    public a() {
        a(R.string.text_preferences);
        n nVar = new n();
        nVar.h(R.string.mn_title_db_export);
        nVar.b("/sdcard/TSFShell_data/");
        nVar.a(new o() { // from class: com.tsf.shell.preference.a.a.a.1
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.b.e.b(com.censivn.C3DEngine.a.d());
                    }
                });
            }
        });
        b(nVar);
        n nVar2 = new n();
        nVar2.h(R.string.mn_title_db_import);
        nVar2.b("/sdcard/TSFShell_data/");
        nVar2.a(new o() { // from class: com.tsf.shell.preference.a.a.a.2
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.b.e.a(com.censivn.C3DEngine.a.d());
                    }
                });
            }
        });
        b(nVar2);
        n nVar3 = new n();
        nVar3.h(R.string.pref_title_shell_reset);
        nVar3.a(new o() { // from class: com.tsf.shell.preference.a.a.a.3
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.b.e.c(com.censivn.C3DEngine.a.d());
                    }
                });
            }
        });
        b(nVar3);
    }
}
