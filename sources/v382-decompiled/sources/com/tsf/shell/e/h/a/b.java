package com.tsf.shell.e.h.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.b.e.n;
import com.censivn.C3DEngine.b.e.o;
import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b extends n {
    private int a;
    private int b;

    public b() {
        h(R.string.text_direction);
        a(new o() { // from class: com.tsf.shell.e.h.a.b.1
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.h.a.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.h();
                    }
                });
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.e.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        this.a = g.az();
        switch (this.a) {
            case 0:
                this.a = 0;
                break;
            case 1:
                this.a = 1;
                break;
            default:
                this.a = 0;
                break;
        }
        m();
    }

    public int e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.a == 0) {
            i(R.string.text_top);
        } else {
            i(R.string.text_bottom);
        }
    }

    public void h() {
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
        builder.setTitle(R.string.text_direction);
        builder.setSingleChoiceItems(new String[]{x.c(R.string.text_top), x.c(R.string.text_bottom)}, this.a, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.h.a.b.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                b.this.b = i;
            }
        });
        builder.setPositiveButton(R.string.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.h.a.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (b.this.a != b.this.b) {
                    b.this.a = b.this.b;
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.h.a.b.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.m();
                        }
                    });
                }
            }
        });
        builder.setNegativeButton(R.string.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.h.a.b.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }
}
