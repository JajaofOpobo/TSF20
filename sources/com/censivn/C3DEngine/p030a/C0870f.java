package com.censivn.C3DEngine.p030a;

import android.opengl.GLSurfaceView;
import com.censivn.C3DEngine.p056d.InterfaceC1083b;
/* renamed from: com.censivn.C3DEngine.a.f */
/* loaded from: classes.dex */
public class C0870f implements InterfaceC1083b {

    /* renamed from: a */
    public C0872g f2497a = new C0872g();

    /* renamed from: b */
    public C0864d f2498b;

    public C0870f(GLSurfaceView gLSurfaceView, String str) {
        this.f2498b = new C0864d(gLSurfaceView);
        this.f2497a.m10752a(true);
        C0869e c0869e = new C0869e(this, gLSurfaceView) { // from class: com.censivn.C3DEngine.a.f.1
            @Override // com.censivn.C3DEngine.p030a.C0869e
            /* renamed from: a */
            public boolean mo10755a() {
                return C0870f.this.m10756a();
            }
        };
        c0869e.m10773a(str);
        c0869e.m10775a(this.f2497a);
        gLSurfaceView.setRenderer(c0869e);
    }

    /* renamed from: a */
    public boolean m10756a() {
        return true;
    }

    @Override // com.censivn.C3DEngine.p056d.InterfaceC1083b
    /* renamed from: b */
    public void mo2247b() {
    }
}
