package com.tsf.shell.preference.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.censivn.C3DEngine.b.e.j;
import com.tsf.b;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends i {
    private com.censivn.C3DEngine.b.e.a a;
    private j b;
    private int c;

    public f() {
        a(b.i.text_preferences);
        j jVar = new j();
        this.b = jVar;
        jVar.h(b.i.mn_folder_animation);
        jVar.a(new j.a() { // from class: com.tsf.shell.preference.a.a.f.1
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.f.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.j();
                    }
                });
            }
        });
        b(jVar);
        com.censivn.C3DEngine.b.e.a aVar = new com.censivn.C3DEngine.b.e.a();
        this.a = aVar;
        aVar.h(b.i.mn_folder_auto_close);
        aVar.i(b.i.mn_folder_auto_close_summary);
        aVar.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.f.2
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                com.tsf.shell.manager.b.e.t(z);
                return true;
            }
        });
        b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
        builder.setTitle(b.i.mn_folder_animation);
        final int iAr = com.tsf.shell.manager.b.e.ar();
        builder.setSingleChoiceItems(new String[]{x.c(b.i.mn_folder_animation_quick), x.c(b.i.mn_folder_animation_normal)}, iAr, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.f.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                f.this.c = i;
            }
        });
        builder.setPositiveButton(b.i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.f.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (iAr != f.this.c) {
                    com.tsf.shell.manager.b.e.r(f.this.c);
                    f.this.i();
                }
            }
        });
        builder.setNegativeButton(b.i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.f.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }

    public void i() {
        switch (com.tsf.shell.manager.b.e.ar()) {
            case 0:
                this.b.b(x.c(b.i.mn_folder_animation_quick));
                break;
            case 1:
                this.b.b(x.c(b.i.mn_folder_animation_normal));
                break;
        }
    }

    public static int c(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 1) {
            return 1;
        }
        return i;
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        i();
    }
}
