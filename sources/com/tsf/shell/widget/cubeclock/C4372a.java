package com.tsf.shell.widget.cubeclock;

import com.censivn.C3DEngine.api.message.VMessageQueueManager;
/* renamed from: com.tsf.shell.widget.cubeclock.a */
/* loaded from: classes.dex */
public class C4372a extends AbstractC4384e {
    public C4372a(C4382c c4382c) {
        super(c4382c);
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: a */
    public int mo14a() {
        return 5;
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: a */
    public float[] mo13a(int i) {
        return this.f14229c.f14198f.m83a(i);
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: b */
    public void mo68b(int i) {
        switch (i) {
            case 2:
                this.f14229c.f14204l.m103b();
                this.f14229c.f14205m.setZOrderOnTop();
                return;
            case 3:
            default:
                return;
        }
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: c */
    public void mo67c(int i) {
        switch (i) {
            case 2:
                this.f14229c.f14204l.m99d();
                return;
            default:
                return;
        }
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: d */
    public void mo66d(int i) {
        C4390j.m53a("onItemSelect:" + i);
        switch (i) {
            case 2:
                this.f14229c.f14204l.m110a();
                this.f14229c.f14196d.post(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C4372a.this.f14229c.f14205m.setZOrderOnTop();
                    }
                }, VMessageQueueManager.TYPE_GL_THREAD);
                return;
            case 3:
                this.f14229c.f14200h.m51a(1);
                return;
            case 4:
                this.f14229c.f14200h.m51a(0);
                return;
            default:
                return;
        }
    }
}
