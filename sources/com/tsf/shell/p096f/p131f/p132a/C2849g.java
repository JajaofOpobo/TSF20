package com.tsf.shell.p096f.p131f.p132a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.C2636k;
/* renamed from: com.tsf.shell.f.f.a.g */
/* loaded from: classes.dex */
public class C2849g extends C0980j {

    /* renamed from: b */
    private C2862h f9263b;

    /* renamed from: d */
    private C0980j f9265d;

    /* renamed from: e */
    private C0984m f9266e;

    /* renamed from: f */
    private C2859a f9267f;

    /* renamed from: g */
    private C2859a f9268g;

    /* renamed from: a */
    private C0980j f9262a = new C0980j();

    /* renamed from: c */
    private C0981k f9264c = new C0981k(C0892a.f2553D, 120.0f * C0892a.f2567c, false);

    public C2849g(C2862h c2862h) {
        this.f9263b = c2862h;
        this.f9264c.setDefaultColor(new Color4(0, 0, 0, 50));
        this.f9264c.calAABB();
        this.f9262a.addChild(this.f9264c);
        this.f9265d = new C0980j();
        this.f9262a.addChild(this.f9265d);
        this.f9267f = new C2859a(C3489a.f11523j, C1306b.C1310d.drawer_search_button) { // from class: com.tsf.shell.f.f.a.g.1
            @Override // com.tsf.shell.p096f.p131f.p132a.C2849g.C2859a
            /* renamed from: a */
            public void mo4507a() {
                C3359a.f11090d.m2670a(500);
            }
        };
        this.f9267f.m4506a(C3595e.f11929n);
        this.f9265d.addChild(this.f9267f);
        this.f9268g = new C2859a(C3489a.f11523j, C1306b.C1310d.drawer_more_button) { // from class: com.tsf.shell.f.f.a.g.2
            @Override // com.tsf.shell.p096f.p131f.p132a.C2849g.C2859a
            /* renamed from: a */
            public void mo4507a() {
                C2849g.this.f9263b.m4457aj();
            }
        };
        this.f9265d.addChild(this.f9268g);
        this.f9266e = new C0984m();
        this.f9266e.m10347d(44);
        this.f9266e.m10355a(C3430e.m2509ap());
        this.f9266e.m10352b(1);
        this.f9264c.setMouseEventListener(new C0937a(this.f9264c) { // from class: com.tsf.shell.f.f.a.g.3
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2849g.this.m4517a(C2849g.this.f9266e.m10350c());
            }
        });
        C3567c.m1967a(this.f9268g, C3567c.f11849h);
        C3567c.m1967a(this.f9267f, C3567c.f11849h);
        C3567c.m1967a(this.f9266e, C3567c.f11849h);
        this.f9265d.addChild(this.f9266e);
        addChild(this.f9262a);
        m4516a(false);
    }

    /* renamed from: a */
    public void m4516a(boolean z) {
        if (!C3430e.m2554R()) {
            this.f9267f.visible(true);
            this.f9268g.visible(true);
            if (z) {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.g.4
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f) {
                        C2849g.this.f9268g.alpha(C2849g.this.f9267f.alpha());
                    }
                };
                c1017d.m10314a(255);
                C1014c.m10326a(this.f9267f);
                C1014c.m10325a(this.f9267f, 250, c1017d);
                return;
            }
            this.f9267f.alpha(255.0f);
            this.f9268g.alpha(255.0f);
        } else if (z) {
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.a.g.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C2849g.this.f9268g.alpha(C2849g.this.f9267f.alpha());
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2849g.this.f9267f.visible(false);
                    C2849g.this.f9268g.visible(false);
                    C2849g.this.m4521a();
                }
            };
            c1017d2.m10314a(0);
            C1014c.m10326a(this.f9267f);
            C1014c.m10325a(this.f9267f, 250, c1017d2);
        } else {
            this.f9267f.alpha(0.0f);
            this.f9267f.visible(false);
            this.f9268g.alpha(0.0f);
            this.f9268g.visible(false);
            m4521a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4521a() {
        this.f9268g.m4504d();
        this.f9268g.m4504d();
    }

    /* renamed from: b */
    private void m4515b() {
        this.f9267f.position().f2526x = ((C0892a.f2550A - C0892a.m10742a(50.0f)) - (C3489a.f11523j / 2.0f)) - C3489a.f11523j;
        this.f9268g.position().f2526x = (C0892a.f2550A - C0892a.m10742a(25.0f)) - (C3489a.f11523j / 2.0f);
        this.f9266e.position().f2526x = C0892a.f2590z + C0892a.m10742a(25.0f);
        this.f9266e.m10344f((int) (C0892a.f2553D - C0892a.m10742a(400.0f)));
        this.f9264c.mo10368a(C0892a.f2553D);
        this.f9264c.calAABB();
    }

    /* renamed from: a */
    public void m4520a(int i, int i2, int i3, int i4) {
        m4515b();
        position().f2527y = C0892a.f2551B - (this.f9264c.mo10365c() / 2.0f);
    }

    /* renamed from: b */
    public void m4513b(boolean z) {
        C1014c.m10326a(this.f9262a);
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.g.6
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2849g.this.f9262a.visible(false);
                }
            };
            c1017d.m10314a(0);
            c1017d.mo10298h(C0892a.m10742a(200.0f));
            C1014c.m10325a(this.f9262a, 350, c1017d);
            return;
        }
        this.f9262a.position().f2527y = C0892a.m10742a(200.0f);
        this.f9262a.alpha(0.0f);
    }

    /* renamed from: c */
    public void m4511c(boolean z) {
        C1014c.m10326a(this.f9262a);
        this.f9262a.visible(true);
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            c1017d.mo10298h(0.0f);
            c1017d.m10313a(C0986a.f2959n);
            C1014c.m10325a(this.f9262a, 600, c1017d);
            return;
        }
        this.f9262a.position().f2527y = 0.0f;
        this.f9262a.alpha(255.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4517a(final String str) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.a.g.7
            @Override // java.lang.Runnable
            public void run() {
                Context m10856d = C0853a.m10856d();
                View inflate = LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.dialog_rename, (ViewGroup) null);
                final EditText editText = (EditText) inflate.findViewById(C1306b.C1311e.username_edit);
                editText.setText(str);
                AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
                builder.setTitle(m10856d.getString(C1306b.C1315i.text_rename));
                builder.setView(inflate);
                builder.setPositiveButton(m10856d.getString(C1306b.C1315i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.f.a.g.7.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String obj = editText.getText().toString();
                        C2849g.this.f9266e.m10355a(obj);
                        C3430e.m2448k(obj);
                    }
                });
                builder.setNegativeButton(m10856d.getString(C1306b.C1315i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.f.a.g.7.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.g$a */
    /* loaded from: classes.dex */
    public static class C2859a extends C0981k {

        /* renamed from: a */
        private TextureElement f9280a;

        /* renamed from: d */
        private int f9281d;

        /* renamed from: e */
        private C2636k f9282e;

        /* renamed from: f */
        private boolean f9283f;

        /* renamed from: g */
        private C3595e.C3597a f9284g;

        /* renamed from: h */
        private int f9285h;

        public C2859a(int i, int i2) {
            super(i, i, false);
            this.f9280a = new TextureElement(0, false);
            this.f9281d = 0;
            this.f9283f = false;
            this.f9285h = i;
            textures().addElement(this.f9280a);
            calAABB(1.5f, 1.5f, 1.0f);
            this.f9281d = i2;
            setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.f.a.g.a.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C2859a.this.f9284g != null) {
                        C2859a.this.f9284g.m1916b();
                    }
                    C2859a.this.mo4507a();
                }
            });
        }

        /* renamed from: a */
        public void m4506a(int i) {
            this.f9284g = C3359a.f11087a.m1929a(i);
            if (this.f9284g.m1919a()) {
                m4503e();
                this.f9284g.m1918a(new C3595e.C3597a.C3598a() { // from class: com.tsf.shell.f.f.a.g.a.2
                    @Override // com.tsf.shell.manager.p185p.C3595e.C3597a.C3598a
                    /* renamed from: a */
                    public void mo720a() {
                        C2859a.this.m4502f();
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo4507a() {
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f9280a.f2529id == 0) {
                C0853a.m10853g().m10541a(this.f9280a, this.f9281d, this.f9285h, this.f9285h);
            }
        }

        /* renamed from: d */
        public void m4504d() {
            if (this.f9282e != null) {
                this.f9282e.m5101a();
            }
            if (this.f9280a.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f9280a);
            }
        }

        /* renamed from: e */
        public void m4503e() {
            if (this.f9282e == null) {
                this.f9282e = new C2636k();
                this.f9282e.position().f2526x = C0892a.m10742a(36.0f);
                this.f9282e.position().f2527y = C0892a.m10742a(36.0f);
            }
            this.f9283f = true;
        }

        /* renamed from: f */
        public void m4502f() {
            this.f9283f = false;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
        public void onDrawChildEnd() {
            if (this.f9283f) {
                this.f9282e.dispatchDraw();
            }
        }
    }
}
