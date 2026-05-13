package com.tsf.shell.manager.p181m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0902e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0973g;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4165b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.m.c */
/* loaded from: classes.dex */
public class C3541c extends C0902e {

    /* renamed from: d */
    private C3524a f11685d;

    /* renamed from: e */
    private C3529b f11686e;

    /* renamed from: f */
    private boolean f11687f = false;

    /* renamed from: c */
    private C0973g f11684c = new C0973g();

    public C3541c(C3529b c3529b, C3524a c3524a) {
        this.f11685d = c3524a;
        this.f11686e = c3529b;
        this.f11684c.mo5013a(C0892a.m10742a(123.0f), C0892a.m10742a(123.0f));
        this.f11684c.m10375a(C1306b.C1310d.side_menu_add_button);
        this.f11684c.position().f2527y = -C0892a.m10742a(100.0f);
        this.f11684c.calAABB(1.2f, 1.2f, 1.0f);
        this.f11684c.setMouseEventListener(new C0937a(this.f11684c) { // from class: com.tsf.shell.manager.m.c.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3541c.this.m2068i();
            }
        });
        this.f11684c.visible(false);
        addChild(this.f11684c);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean calTouchCollision(float f, float f2) {
        if (m10672a() == null || m10672a().numChildren() != 0) {
            return super.calTouchCollision(f, f2);
        }
        return false;
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0902e, com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        super.onDrawChildStart();
        if (m10672a() != null && m10672a().numChildren() == 0) {
            if (!this.f11686e.m2080m()) {
                m2064m();
            }
            mouseSkip(true);
            return;
        }
        m2065l();
        mouseSkip(false);
    }

    /* renamed from: l */
    private void m2065l() {
        if (this.f11687f) {
            this.f11687f = false;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.c.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3541c.this.f11684c.visible(false);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f11684c);
            C1014c.m10325a(this.f11684c, 250, c1017d);
        }
    }

    /* renamed from: m */
    private void m2064m() {
        if (!this.f11687f) {
            this.f11687f = true;
            this.f11684c.visible(true);
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(this.f11684c);
            C1014c.m10325a(this.f11684c, 250, c1017d);
        }
    }

    /* renamed from: i */
    public void m2068i() {
        ArrayList<C3222g> m706a;
        int size;
        if (C3359a.f11109w.m2716a().m2740b() && (size = (m706a = C4165b.m706a(6)).size()) > 0) {
            for (int i = 0; i < size; i++) {
                C3222g c3222g = m706a.get(i);
                c3222g.scale().setAll(0.0f, 0.0f, 1.0f);
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                c1017d.m10309b(i * 100);
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10325a(c3222g, 500, c1017d);
                this.f11686e.m2107a((C3112b) c3222g, true);
                this.f11685d.addChild(c3222g);
            }
            this.f11686e.m2078o();
        }
    }

    /* renamed from: j */
    public void m2067j() {
        this.f11687f = false;
        this.f11684c.visible(false);
        this.f11684c.alpha(0.0f);
    }

    /* renamed from: k */
    public void m2066k() {
        this.f11684c.m10376a();
    }
}
