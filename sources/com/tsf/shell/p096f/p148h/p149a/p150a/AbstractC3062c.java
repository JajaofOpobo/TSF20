package com.tsf.shell.p096f.p148h.p149a.p150a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0894a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.p096f.p148h.p149a.C3082c;
/* renamed from: com.tsf.shell.f.h.a.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC3062c extends C0894a {

    /* renamed from: a */
    private boolean f9932a = false;

    /* renamed from: b */
    private boolean f9933b = false;

    /* renamed from: c */
    private int f9934c = 10;

    public AbstractC3062c(int i) {
        setTitle(i);
        setTitlePosition(C0892a.m10742a(120.0f));
        setTitleSize(36);
        setMarginDistance(C0892a.m10742a(10.0f));
        minY((-C3082c.f9979a) / 2.0f);
        maxY(C3082c.f9979a / 2.0f);
    }

    /* renamed from: a */
    public void m3693a(int i) {
        this.f9934c = i;
    }

    /* renamed from: a */
    public int m3694a() {
        return this.f9934c;
    }

    /* renamed from: b */
    public void m3692b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < children().size()) {
                C0975i c0975i = children().get(i2);
                if (c0975i instanceof C3058b) {
                    ((C3058b) c0975i).m3697g();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo3683b(int i) {
        if (i == 0) {
            visible(false);
        } else {
            visible(true);
        }
    }
}
