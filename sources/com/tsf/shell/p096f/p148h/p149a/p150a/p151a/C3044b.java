package com.tsf.shell.p096f.p148h.p149a.p150a.p151a;

import android.content.Context;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.p096f.p118e.p121c.p122a.C2484d;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.h.a.a.a.b */
/* loaded from: classes.dex */
public class C3044b extends C2484d {

    /* renamed from: a */
    private float f9887a;

    /* renamed from: b */
    private float f9888b;

    /* renamed from: c */
    private Number3d f9889c;

    /* renamed from: d */
    private Number3d f9890d;

    /* renamed from: e */
    private boolean f9891e;

    public C3044b(Context context, float f, float f2, float f3, int i) {
        super(context, f, f2, f3, i);
        this.f9887a = 0.0f;
        this.f9888b = 0.0f;
        this.f9889c = new Number3d();
        this.f9890d = new Number3d();
        this.f9891e = false;
    }

    /* renamed from: a */
    public void m3744a(Number3d number3d) {
        if (this.f9888b == 0.0f) {
            float m599a = C4189x.m599a(position(), number3d);
            if (m599a > m5439a() * 2.0f) {
                this.f9889c.setAllFrom(number3d);
                this.f9890d.setAllFrom(number3d);
                m5438a(m599a);
                m5435b((float) (C4189x.m590b(position(), number3d) / 0.017453292519943295d));
                setAnimationObjectState(true);
                this.f9887a = 1.0f;
                return;
            }
            return;
        }
        this.f9890d.setAllFrom(number3d);
    }

    @Override // com.tsf.shell.p096f.p118e.p121c.p122a.C2484d, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        super.onDrawStart();
        if (getAnimationObjectState()) {
            this.f9888b = ((this.f9890d.compare(this.f9889c) ? 0.15f : 0.6f) * (this.f9887a - this.f9888b)) + this.f9888b;
            if (!this.f9891e && Math.abs(this.f9887a - this.f9888b) < 0.01d) {
                setAnimationObjectState(false);
                if (this.f9887a == 1.0f) {
                    position().setAllFrom(this.f9889c);
                } else {
                    this.f9889c.setAllFrom(position());
                }
                this.f9887a = 0.0f;
                this.f9888b = 0.0f;
                if (!position().compare(this.f9890d)) {
                    m3744a(this.f9890d);
                }
            }
            m5433c(this.f9888b);
        }
    }
}
