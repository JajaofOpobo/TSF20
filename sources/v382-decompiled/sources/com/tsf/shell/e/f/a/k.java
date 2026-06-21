package com.tsf.shell.e.f.a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class k extends com.censivn.C3DEngine.b.f.l {
    private m b;
    private com.censivn.C3DEngine.b.f.l d;
    private o e;
    private l f;
    private l g;
    private com.censivn.C3DEngine.b.f.l a = new com.censivn.C3DEngine.b.f.l();
    private com.censivn.C3DEngine.b.f.m c = new com.censivn.C3DEngine.b.f.m(com.censivn.C3DEngine.b.b.a.D, 120.0f * com.censivn.C3DEngine.b.b.a.c, false);

    public k(m mVar) {
        this.b = mVar;
        this.c.setDefaultColor(new Color4(0, 0, 0, 50));
        this.c.calAABB();
        this.a.addChild(this.c);
        this.d = new com.censivn.C3DEngine.b.f.l();
        this.a.addChild(this.d);
        this.f = new l(com.tsf.shell.manager.g.a.j, R.drawable.drawer_search_button) { // from class: com.tsf.shell.e.f.a.k.1
            @Override // com.tsf.shell.e.f.a.l
            public void a() {
                com.tsf.shell.manager.a.d.a(500);
            }
        };
        this.f.a(com.tsf.shell.manager.p.f.n);
        this.d.addChild(this.f);
        this.g = new l(com.tsf.shell.manager.g.a.j, R.drawable.drawer_more_button) { // from class: com.tsf.shell.e.f.a.k.2
            @Override // com.tsf.shell.e.f.a.l
            public void a() {
                k.this.b.aj();
            }
        };
        this.d.addChild(this.g);
        this.e = new o();
        this.e.d(44);
        this.e.a(com.tsf.shell.manager.b.g.an());
        this.e.b(1);
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c) { // from class: com.tsf.shell.e.f.a.k.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                k.this.a(k.this.e.c());
            }
        });
        com.tsf.shell.manager.o.c.a(this.g, com.tsf.shell.manager.o.c.h);
        com.tsf.shell.manager.o.c.a(this.f, com.tsf.shell.manager.o.c.h);
        com.tsf.shell.manager.o.c.a(this.e, com.tsf.shell.manager.o.c.h);
        this.d.addChild(this.e);
        addChild(this.a);
        a(false);
    }

    public void a(boolean z) {
        if (!com.tsf.shell.manager.b.g.Q()) {
            this.f.visible(true);
            this.g.visible(true);
            if (z) {
                x xVar = new x() { // from class: com.tsf.shell.e.f.a.k.4
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f) {
                        k.this.g.alpha(k.this.f.alpha());
                    }
                };
                xVar.a(255);
                w.a(this.f);
                w.a(this.f, 250, xVar);
                return;
            }
            this.f.alpha(255.0f);
            this.g.alpha(255.0f);
            return;
        }
        if (z) {
            x xVar2 = new x() { // from class: com.tsf.shell.e.f.a.k.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f) {
                    k.this.g.alpha(k.this.f.alpha());
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    k.this.f.visible(false);
                    k.this.g.visible(false);
                    k.this.a();
                }
            };
            xVar2.a(0);
            w.a(this.f);
            w.a(this.f, 250, xVar2);
            return;
        }
        this.f.alpha(0.0f);
        this.f.visible(false);
        this.g.alpha(0.0f);
        this.g.visible(false);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.g.d();
        this.g.d();
    }

    private void b() {
        this.f.position().x = ((com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(50.0f)) - (com.tsf.shell.manager.g.a.j / 2.0f)) - com.tsf.shell.manager.g.a.j;
        this.g.position().x = (com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(25.0f)) - (com.tsf.shell.manager.g.a.j / 2.0f);
        this.e.position().x = com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(25.0f);
        this.e.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(400.0f)));
        this.c.a(com.censivn.C3DEngine.b.b.a.D);
        this.c.calAABB();
    }

    public void a(int i, int i2, int i3, int i4) {
        b();
        position().y = com.censivn.C3DEngine.b.b.a.B - (this.c.c() / 2.0f);
    }

    public void b(boolean z) {
        w.a(this.a);
        if (z) {
            x xVar = new x() { // from class: com.tsf.shell.e.f.a.k.6
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    k.this.a.visible(false);
                }
            };
            xVar.a(0);
            xVar.h(com.censivn.C3DEngine.b.b.a.a(200.0f));
            w.a(this.a, 350, xVar);
            return;
        }
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(200.0f);
        this.a.alpha(0.0f);
    }

    public void c(boolean z) {
        w.a(this.a);
        this.a.visible(true);
        if (z) {
            x xVar = new x();
            xVar.a(255);
            xVar.h(0.0f);
            xVar.a(com.censivn.C3DEngine.b.g.a.n);
            w.a(this.a, 600, xVar);
            return;
        }
        this.a.position().y = 0.0f;
        this.a.alpha(255.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.a.k.7
            @Override // java.lang.Runnable
            public void run() {
                Context d = com.censivn.C3DEngine.a.d();
                View inflate = LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(R.layout.dialog_rename, (ViewGroup) null);
                final EditText editText = (EditText) inflate.findViewById(R.id.username_edit);
                editText.setText(str);
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
                builder.setTitle(d.getString(R.string.text_rename));
                builder.setView(inflate);
                builder.setPositiveButton(d.getString(R.string.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.f.a.k.7.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String editable = editText.getText().toString();
                        k.this.e.a(editable);
                        com.tsf.shell.manager.b.g.k(editable);
                    }
                });
                builder.setNegativeButton(d.getString(R.string.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.f.a.k.7.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
    }
}
