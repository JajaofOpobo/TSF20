package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
/* loaded from: classes.dex */
public class VTweenParam {
    private VTweenParam mThis = this;
    public C1017d vTarget = new C1017d() { // from class: com.censivn.C3DEngine.api.tween.VTweenParam.1
        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            VTweenParam.this.mThis.onComplete();
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo518a(float f) {
            VTweenParam.this.mThis.onUpdate(f);
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: b */
        public void mo558b(float f) {
            VTweenParam.this.mThis.onProgress(f);
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: b */
        public void mo10310b() {
            VTweenParam.this.mThis.onStart();
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: c */
        public void mo4322c() {
            VTweenParam.this.mThis.onKill();
        }
    };

    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void setTarget(Object obj) {
        this.vTarget.m10312a(obj);
    }

    public Object getTarget() {
        Object m10306d = this.vTarget.m10306d();
        if (m10306d instanceof C0975i) {
            return ((C0975i) m10306d).getVirtualObject();
        }
        if (m10306d instanceof C1013b) {
            return ((C1013b) m10306d).m10330a();
        }
        return null;
    }

    public void onStart() {
    }

    public void onKill() {
    }

    public void onComplete() {
    }

    public void onUpdate(float f) {
    }

    public void onProgress(float f) {
    }

    public void setEase(int i) {
        InterfaceC1011b interfaceC1011b = null;
        switch (i) {
            case 100:
                interfaceC1011b = C0986a.f2947b;
                break;
            case 101:
                interfaceC1011b = C0986a.f2946a;
                break;
            case 102:
                interfaceC1011b = C0986a.f2948c;
                break;
            case VEasing.Back.easeIn /* 200 */:
                interfaceC1011b = C0986a.f2949d;
                break;
            case VEasing.Back.easeOut /* 201 */:
                interfaceC1011b = C0986a.f2950e;
                break;
            case VEasing.Back.easeInOut /* 202 */:
                interfaceC1011b = C0986a.f2951f;
                break;
            case 300:
                interfaceC1011b = C0986a.f2952g;
                break;
            case VEasing.Linear.easeNone /* 400 */:
                interfaceC1011b = C0986a.f2956k;
                break;
            case VEasing.Linear.easeIn /* 401 */:
                interfaceC1011b = C0986a.f2953h;
                break;
            case VEasing.Linear.easeOut /* 402 */:
                interfaceC1011b = C0986a.f2954i;
                break;
            case VEasing.Linear.easeInOut /* 403 */:
                interfaceC1011b = C0986a.f2955j;
                break;
        }
        this.vTarget.m10313a(interfaceC1011b);
    }

    public void setCompleteRunnable(Runnable runnable) {
        this.vTarget.m10311a(runnable);
    }

    public Runnable getCompleteRunnable() {
        return this.vTarget.m10300g();
    }

    public void setRotationX(float f) {
        this.vTarget.m10307c(f);
    }

    public void setRotationY(float f) {
        this.vTarget.m10305d(f);
    }

    public void setRotationZ(float f) {
        this.vTarget.m10303e(f);
    }

    public void setSPX(float f) {
        this.vTarget.m10299g(f);
    }

    public void setSPY(float f) {
        this.vTarget.m10297i(f);
    }

    public void setSPZ(float f) {
        this.vTarget.m10295k(f);
    }

    public void setX(float f) {
        this.vTarget.mo10301f(f);
    }

    public void setY(float f) {
        this.vTarget.mo10298h(f);
    }

    public void setZ(float f) {
        this.vTarget.m10296j(f);
    }

    public void setScaleX(float f) {
        this.vTarget.m10294l(f);
    }

    public void setScaleY(float f) {
        this.vTarget.m10293m(f);
    }

    public void setScaleZ(float f) {
        this.vTarget.m10292n(f);
    }

    public void setTimeout(int i) {
        this.vTarget.m10309b(i);
    }

    public void setAlpha(int i) {
        this.vTarget.m10314a(i);
    }
}
