package com.tsf.shell.f.f.a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.manager.p.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends j {
    private h b;
    private j d;
    private m e;
    private a f;
    private a g;
    private j a = new j();
    private k c = new k(com.censivn.C3DEngine.b.b.a.D, 120.0f * com.censivn.C3DEngine.b.b.a.c, false);

    public g(h hVar) {
        this.b = hVar;
        this.c.setDefaultColor(new Color4(0, 0, 0, 50));
        this.c.calAABB();
        this.a.addChild(this.c);
        this.d = new j();
        this.a.addChild(this.d);
        this.f = new a(com.tsf.shell.manager.g.a.j, b.d.drawer_search_button) { // from class: com.tsf.shell.f.f.a.g.1
            @Override // com.tsf.shell.f.f.a.g.a
            public void a() {
                com.tsf.shell.manager.a.d.a(500);
            }
        };
        this.f.a(com.tsf.shell.manager.p.e.n);
        this.d.addChild(this.f);
        this.g = new a(com.tsf.shell.manager.g.a.j, b.d.drawer_more_button) { // from class: com.tsf.shell.f.f.a.g.2
            @Override // com.tsf.shell.f.f.a.g.a
            public void a() {
                g.this.b.aj();
            }
        };
        this.d.addChild(this.g);
        this.e = new m();
        this.e.d(44);
        this.e.a(com.tsf.shell.manager.b.e.ap());
        this.e.b(1);
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c) { // from class: com.tsf.shell.f.f.a.g.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                g.this.a(g.this.e.c());
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
        if (!com.tsf.shell.manager.b.e.R()) {
            this.f.visible(true);
            this.g.visible(true);
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.g.4
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f) {
                        g.this.g.alpha(g.this.f.alpha());
                    }
                };
                dVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(this.f);
                com.censivn.C3DEngine.b.g.c.a(this.f, 250, dVar);
                return;
            }
            this.f.alpha(255.0f);
            this.g.alpha(255.0f);
            return;
        }
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.g.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    g.this.g.alpha(g.this.f.alpha());
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    g.this.f.visible(false);
                    g.this.g.visible(false);
                    g.this.a();
                }
            };
            dVar2.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, 250, dVar2);
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
        com.censivn.C3DEngine.b.g.c.a(this.a);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.g.6
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    g.this.a.visible(false);
                }
            };
            dVar.a(0);
            dVar.h(com.censivn.C3DEngine.b.b.a.a(200.0f));
            com.censivn.C3DEngine.b.g.c.a(this.a, 350, dVar);
            return;
        }
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(200.0f);
        this.a.alpha(0.0f);
    }

    public void c(boolean z) {
        com.censivn.C3DEngine.b.g.c.a(this.a);
        this.a.visible(true);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            dVar.h(0.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.n);
            com.censivn.C3DEngine.b.g.c.a(this.a, 600, dVar);
            return;
        }
        this.a.position().y = 0.0f;
        this.a.alpha(255.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.a.g.7
            @Override // java.lang.Runnable
            public void run() {
                Context contextD = com.censivn.C3DEngine.a.d();
                View viewInflate = LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(b.g.dialog_rename, (ViewGroup) null);
                final EditText editText = (EditText) viewInflate.findViewById(b.e.username_edit);
                editText.setText(str);
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
                builder.setTitle(contextD.getString(b.i.text_rename));
                builder.setView(viewInflate);
                builder.setPositiveButton(contextD.getString(b.i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.f.a.g.7.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String string = editText.getText().toString();
                        g.this.e.a(string);
                        com.tsf.shell.manager.b.e.k(string);
                    }
                });
                builder.setNegativeButton(contextD.getString(b.i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.f.a.g.7.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
    }

    static class a extends k {
        private TextureElement a;
        private int d;
        private com.tsf.shell.f.e.k e;
        private boolean f;
        private e.a g;
        private int h;

        public a(int i, int i2) {
            super(i, i, false);
            this.a = new TextureElement(0, false);
            this.d = 0;
            this.f = false;
            this.h = i;
            textures().addElement(this.a);
            calAABB(1.5f, 1.5f, 1.0f);
            this.d = i2;
            setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.f.a.g.a.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (a.this.g != null) {
                        a.this.g.b();
                    }
                    a.this.a();
                }
            });
        }

        public void a(int i) {
            this.g = com.tsf.shell.manager.a.a.a(i);
            if (this.g.a()) {
                e();
                this.g.a(new e.a.C0142a() { // from class: com.tsf.shell.f.f.a.g.a.2
                    @Override // com.tsf.shell.manager.p.e.a.C0142a
                    public void a() {
                        a.this.f();
                    }
                });
            }
        }

        public void a() {
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (this.a.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.a, this.d, this.h, this.h);
            }
        }

        public void d() {
            if (this.e != null) {
                this.e.a();
            }
            if (this.a.id != 0) {
                com.censivn.C3DEngine.a.g().a(this.a);
            }
        }

        public void e() {
            if (this.e == null) {
                this.e = new com.tsf.shell.f.e.k();
                this.e.position().x = com.censivn.C3DEngine.b.b.a.a(36.0f);
                this.e.position().y = com.censivn.C3DEngine.b.b.a.a(36.0f);
            }
            this.f = true;
        }

        public void f() {
            this.f = false;
        }

        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawChildEnd() {
            if (this.f) {
                this.e.dispatchDraw();
            }
        }
    }
}
