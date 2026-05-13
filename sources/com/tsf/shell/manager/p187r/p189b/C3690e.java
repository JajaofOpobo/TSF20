package com.tsf.shell.manager.p187r.p189b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.toggle.C3403a;
import com.tsf.shell.manager.action.toggle.C3414b;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3227j;
import com.tsf.shell.utils.C4187w;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.r.b.e */
/* loaded from: classes.dex */
public class C3690e extends C2578b {

    /* renamed from: a */
    public C3621a f12179a;

    /* renamed from: b */
    private C1040h f12180b;

    /* renamed from: c */
    private C3403a f12181c;

    public C3690e(final C3621a c3621a, String str) {
        super(str);
        this.f12179a = c3621a;
        this.f12181c = C3359a.f11090d.f11189c;
        this.f12180b = new C1040h(C0892a.f2553D, c3621a.getHeight(), 20.0f * C0892a.f2567c, 20.0f * C0892a.f2567c, (C0892a.f2567c * 20.0f) + C3566b.f11840b.f11762T, (C0892a.f2567c * 20.0f) + C3566b.f11840b.f11763U) { // from class: com.tsf.shell.manager.r.b.e.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
            }
        };
        this.f12180b.m10160a(new C1024b() { // from class: com.tsf.shell.manager.r.b.e.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3359a.f11090d.f11189c.m2633a().size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C3694a c3694a;
                if (c0975i == null) {
                    c3694a = new C3694a();
                } else {
                    c3694a = (C3694a) c0975i;
                }
                c3694a.m1696a(C3690e.this.f12181c.m2633a().get(i).m2609a());
                return c3694a;
            }
        });
        this.f12180b.m10159a(new C1036f() { // from class: com.tsf.shell.manager.r.b.e.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                AbstractC3208b m2151a = C3519a.m2151a(C3690e.this.f12181c.m2633a().get(i).f11287a, C3566b.f11840b);
                m2151a.m3534K().onUpdatePhoto(null, null);
                c3621a.m1858b().mo1856a(m2151a);
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: b */
            public void mo1698b(C0975i c0975i, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: c */
            public void mo1697c(C0975i c0975i, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo1699a(C0975i c0975i, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
            }
        });
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12180b;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f12180b.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f12180b.m10143d();
        super.onShow();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        Iterator<C3414b> it = this.f12181c.m2633a().iterator();
        while (it.hasNext()) {
            it.next().m2605b();
        }
    }

    /* renamed from: com.tsf.shell.manager.r.b.e$a */
    /* loaded from: classes.dex */
    class C3694a extends C0980j {

        /* renamed from: b */
        private C3227j f12187b;

        public C3694a() {
        }

        /* renamed from: a */
        public void m1696a(C3227j c3227j) {
            this.f12187b = c3227j;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
        public void onDrawChildStart() {
            if (this.f12187b != null) {
                this.f12187b.dispatchDraw();
            }
        }
    }
}
