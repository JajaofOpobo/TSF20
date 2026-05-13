package com.tsf.shell.f.h.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.b.e.j;
import com.tsf.b;
import com.tsf.shell.manager.b.e;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class b extends j {
    private int a;
    private int b;

    public b() {
        h(b.i.text_direction);
        a(new j.a() { // from class: com.tsf.shell.f.h.a.b.1
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.h.a.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.h();
                    }
                });
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.e.g, com.censivn.C3DEngine.b.e.f
    public void f() {
        this.a = e.aB();
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
            i(b.i.text_top);
        } else {
            i(b.i.text_bottom);
        }
    }

    public void h() {
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
        builder.setTitle(b.i.text_direction);
        builder.setSingleChoiceItems(new String[]{x.c(b.i.text_top), x.c(b.i.text_bottom)}, this.a, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.h.a.b.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                b.this.b = i;
            }
        });
        builder.setPositiveButton(b.i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.h.a.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (b.this.a != b.this.b) {
                    b.this.a = b.this.b;
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.h.a.b.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.m();
                        }
                    });
                }
            }
        });
        builder.setNegativeButton(b.i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.h.a.b.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }
}
