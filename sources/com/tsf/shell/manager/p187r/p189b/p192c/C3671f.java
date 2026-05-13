package com.tsf.shell.manager.p187r.p189b.p192c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.utils.C4187w;
/* renamed from: com.tsf.shell.manager.r.b.c.f */
/* loaded from: classes.dex */
public class C3671f extends C1036f {

    /* renamed from: a */
    private float f12117a;

    /* renamed from: b */
    private float f12118b;

    /* renamed from: c */
    private C3678h f12119c;

    /* renamed from: d */
    private C0975i f12120d;

    /* renamed from: e */
    private boolean f12121e;

    /* renamed from: f */
    private AbstractC2593d f12122f;

    public C3671f(AbstractC2593d abstractC2593d) {
        this.f12122f = abstractC2593d;
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
    /* renamed from: a */
    public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public AbstractC3341e mo1760a(int i) {
        return null;
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
    /* renamed from: b */
    public void mo1698b(C0975i c0975i, int i, MotionEvent motionEvent) {
        C4187w.m616a();
        this.f12119c = (C3678h) c0975i;
        this.f12120d = this.f12119c.m1741a();
        this.f12121e = this.f12120d.getAnimationObjectState();
        this.f12120d.setAnimationObjectState(true);
        Number3d.TEMPNUMBER3D.reset();
        Number3d localToGlobal = this.f12120d.localToGlobal(Number3d.TEMPNUMBER3D);
        this.f12120d.position().setAllFrom(localToGlobal);
        this.f12117a = localToGlobal.f2526x;
        this.f12118b = localToGlobal.f2527y;
        this.f12120d.removeFromParent();
        mo1760a(i).mo2793e();
        C3359a.f11096j.m2232a(this.f12120d);
        this.f12122f.templeteHide();
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
    /* renamed from: c */
    public void mo1697c(C0975i c0975i, int i, MotionEvent motionEvent) {
        final AbstractC3341e mo1760a = mo1760a(i);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.r.b.c.f.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                mo1760a.mo2792f();
                C3359a.f11096j.m2223b(C3671f.this.f12120d);
                C3671f.this.f12119c.m1739a(C3671f.this.f12120d);
                C3671f.this.f12120d.alpha(255.0f);
                C3671f.this.f12120d.scale().setAll(0.0f, 0.0f, 1.0f);
                C3671f.this.f12120d.position().f2526x = 0.0f;
                C3671f.this.f12120d.position().f2527y = 0.0f;
                C3671f.this.f12120d.setAnimationObjectState(C3671f.this.f12121e);
                C1017d c1017d2 = new C1017d();
                c1017d2.m10294l(1.0f);
                c1017d2.m10293m(1.0f);
                c1017d2.m10313a(C0986a.f2950e);
                C1014c.m10326a(C3671f.this.f12120d);
                C1014c.m10325a(C3671f.this.f12120d, 500, c1017d2);
                C3671f.this.f12120d = null;
            }
        };
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.m10292n(1.0f);
        c1017d.m10314a(0);
        c1017d.m10296j(0.0f);
        C1014c.m10326a(this.f12120d);
        C1014c.m10325a(this.f12120d, 300, c1017d);
        if (mo1759a(mo1760a, this.f12120d.position().f2526x, this.f12120d.position().f2527y)) {
            this.f12122f.templeteShow();
        }
    }

    /* renamed from: a */
    public boolean mo1759a(AbstractC3341e abstractC3341e, float f, float f2) {
        return true;
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
    /* renamed from: a */
    public void mo1699a(C0975i c0975i, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.f12120d != null) {
            this.f12120d.position().f2526x = this.f12117a + (motionEvent2.getX() - motionEvent.getX());
            this.f12120d.position().f2527y = this.f12118b - (motionEvent2.getY() - motionEvent.getY());
        }
    }
}
