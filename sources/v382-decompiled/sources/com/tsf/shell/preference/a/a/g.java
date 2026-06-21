package com.tsf.shell.preference.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.b.e.m;
import com.censivn.C3DEngine.b.e.n;
import com.censivn.C3DEngine.b.e.o;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class g extends m {
    private com.censivn.C3DEngine.b.e.a a;
    private n b;
    private int c;

    public g() {
        a(R.string.text_preferences);
        n nVar = new n();
        this.b = nVar;
        nVar.h(R.string.mn_folder_animation);
        nVar.a(new o() { // from class: com.tsf.shell.preference.a.a.g.1
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        g.this.j();
                    }
                });
            }
        });
        b(nVar);
        com.censivn.C3DEngine.b.e.a aVar = new com.censivn.C3DEngine.b.e.a();
        this.a = aVar;
        aVar.h(R.string.mn_folder_auto_close);
        aVar.i(R.string.mn_folder_auto_close_summary);
        aVar.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.g.2
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                com.tsf.shell.manager.b.g.s(z);
                return true;
            }
        });
        b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
        builder.setTitle(R.string.mn_folder_animation);
        final int ap = com.tsf.shell.manager.b.g.ap();
        builder.setSingleChoiceItems(new String[]{x.c(R.string.mn_folder_animation_quick), x.c(R.string.mn_folder_animation_normal)}, ap, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.g.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                g.this.c = i;
            }
        });
        builder.setPositiveButton(R.string.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.g.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (ap != g.this.c) {
                    com.tsf.shell.manager.b.g.q(g.this.c);
                    g.this.i();
                }
            }
        });
        builder.setNegativeButton(R.string.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.g.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }

    public void i() {
        switch (com.tsf.shell.manager.b.g.ap()) {
            case 0:
                this.b.b(x.c(R.string.mn_folder_animation_quick));
                break;
            case 1:
                this.b.b(x.c(R.string.mn_folder_animation_normal));
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

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        i();
    }
}
