package com.tsf.shell.manager.p186q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.services.C4090a;
import com.tsf.shell.utils.C4165b;
import com.tsf.shell.utils.C4175k;
/* renamed from: com.tsf.shell.manager.q.a */
/* loaded from: classes.dex */
public class C3600a implements C4090a.InterfaceC4094a {

    /* renamed from: a */
    private int f11944a = 0;

    /* renamed from: b */
    private int f11945b = 0;

    /* renamed from: c */
    private int f11946c = 0;

    /* renamed from: d */
    private int f11947d = 0;

    /* renamed from: e */
    private int f11948e = 0;

    /* renamed from: f */
    private int f11949f = 0;

    /* renamed from: g */
    private boolean f11950g = false;

    /* renamed from: h */
    private C4090a f11951h;

    /* renamed from: i */
    private C3377f f11952i;

    /* renamed from: j */
    private C3377f f11953j;

    /* renamed from: k */
    private C3377f f11954k;

    /* renamed from: l */
    private C3377f f11955l;

    /* renamed from: m */
    private C3377f f11956m;

    public C3600a() {
        m1907b();
    }

    /* renamed from: b */
    private void m1907b() {
        this.f11951h = new C4090a();
        this.f11951h.m774a(C0853a.m10856d(), new Runnable() { // from class: com.tsf.shell.manager.q.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3600a.this.f11944a = C3600a.this.f11951h.f13347a.mo761a();
                    C3600a.this.f11945b = C3600a.this.f11951h.f13347a.mo759b();
                    C3600a.this.f11946c = C3600a.this.f11951h.f13347a.mo757d();
                    C3600a.this.f11948e = C3600a.this.f11951h.f13347a.mo756e();
                    C3600a.this.f11949f = C3600a.this.f11951h.f13347a.mo755f();
                    C3600a.this.mo768a(C3600a.this.f11944a);
                    C3600a.this.mo767b(C3600a.this.f11945b);
                    C3600a.this.mo765d(C3600a.this.f11946c);
                    C3600a.this.mo764e(C3600a.this.f11948e);
                    C3600a.this.mo763f(C3600a.this.f11949f);
                    C3600a.this.f11950g = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.f11951h.m775a(C0853a.m10856d(), this);
    }

    /* renamed from: a */
    public void m1912a(Context context) {
        try {
            this.f11951h.m770c(context);
        } catch (Exception e) {
        }
        try {
            this.f11951h.m772b(context);
        } catch (Exception e2) {
        }
    }

    /* renamed from: a */
    public void m1913a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.tsf.shell.services.notifier", "com.tsf.shell.services.notifier.MainActivity"));
        intent.setAction("android.intent.action.VIEW");
        try {
            Home.m6177b().startActivity(intent);
        } catch (Exception e) {
            C2244e.m6016a(Home.m6177b(), C1306b.C1315i.mn_unread_download_notic, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.q.a.5
                @Override // java.lang.Runnable
                public void run() {
                    C4175k.m671a(Home.m6177b(), "com.tsf.shell.services.notifier");
                }
            }, (Runnable) null);
        }
    }

    /* renamed from: a */
    public void m1911a(C3377f c3377f) {
        if (this.f11952i == null && C4165b.m705a(c3377f.f11169b)) {
            this.f11952i = c3377f;
            if (this.f11950g) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.q.a.6
                    @Override // java.lang.Runnable
                    public void run() {
                        C3600a.this.f11952i.m2705a(C3600a.this.f11945b);
                    }
                });
            }
        } else if (this.f11953j == null && C4165b.m702b(c3377f.f11169b)) {
            this.f11953j = c3377f;
            if (this.f11950g) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.q.a.7
                    @Override // java.lang.Runnable
                    public void run() {
                        C3600a.this.f11953j.m2705a(C3600a.this.f11944a);
                    }
                });
            }
        } else if (this.f11956m == null && C4165b.m699e(c3377f.f11169b)) {
            this.f11956m = c3377f;
            if (this.f11950g) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.q.a.8
                    @Override // java.lang.Runnable
                    public void run() {
                        C3600a.this.f11956m.m2705a(C3600a.this.f11949f);
                    }
                });
            }
        } else if (this.f11955l == null && C4165b.m701c(c3377f.f11169b)) {
            this.f11955l = c3377f;
            if (this.f11950g) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.q.a.9
                    @Override // java.lang.Runnable
                    public void run() {
                        C3600a.this.f11955l.m2705a(C3600a.this.f11948e);
                    }
                });
            }
        } else if (this.f11954k == null && C4165b.m700d(c3377f.f11169b)) {
            this.f11954k = c3377f;
            if (this.f11950g) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.q.a.10
                    @Override // java.lang.Runnable
                    public void run() {
                        C3600a.this.f11954k.m2705a(C3600a.this.f11946c);
                    }
                });
            }
        }
    }

    @Override // com.tsf.shell.services.C4090a.InterfaceC4094a
    /* renamed from: a */
    public void mo768a(int i) {
        this.f11944a = i;
        if (this.f11953j != null && this.f11953j.m2694h() != i) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.11
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (C3600a.this.f11953j != null) {
                        C3600a.this.f11953j.m2705a(C3600a.this.f11944a);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            C0853a.m10865a().m10590a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.C4090a.InterfaceC4094a
    /* renamed from: b */
    public void mo767b(int i) {
        this.f11945b = i;
        if (this.f11952i != null && this.f11952i.m2694h() != this.f11945b) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.12
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (C3600a.this.f11952i != null) {
                        C3600a.this.f11952i.m2705a(C3600a.this.f11945b);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            C0853a.m10865a().m10590a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.C4090a.InterfaceC4094a
    /* renamed from: c */
    public void mo766c(int i) {
        this.f11947d = i;
    }

    @Override // com.tsf.shell.services.C4090a.InterfaceC4094a
    /* renamed from: d */
    public void mo765d(int i) {
        this.f11946c = i;
        if (this.f11954k != null && this.f11954k.m2694h() != this.f11946c) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.2
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (C3600a.this.f11954k != null) {
                        C3600a.this.f11954k.m2705a(C3600a.this.f11946c);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            C0853a.m10865a().m10590a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.C4090a.InterfaceC4094a
    /* renamed from: e */
    public void mo764e(int i) {
        this.f11948e = i;
        if (this.f11955l != null && this.f11955l.m2694h() != this.f11948e) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.3
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (C3600a.this.f11955l != null) {
                        C3600a.this.f11955l.m2705a(C3600a.this.f11948e);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            C0853a.m10865a().m10590a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.C4090a.InterfaceC4094a
    /* renamed from: f */
    public void mo763f(int i) {
        this.f11949f = i;
        if (this.f11956m != null && this.f11956m.m2694h() != this.f11949f) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.4
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (C3600a.this.f11956m != null) {
                        C3600a.this.f11956m.m2705a(C3600a.this.f11949f);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            C0853a.m10865a().m10590a(renderRunnable);
        }
    }
}
