package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.g.a;
import com.censivn.C3DEngine.b.g.b.b;
import com.censivn.C3DEngine.b.g.d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VTweenParam {
    private VTweenParam mThis = this;
    public d vTarget = new d() { // from class: com.censivn.C3DEngine.api.tween.VTweenParam.1
        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            VTweenParam.this.mThis.onComplete();
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a(float f) {
            VTweenParam.this.mThis.onUpdate(f);
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void b(float f) {
            VTweenParam.this.mThis.onProgress(f);
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void b() {
            VTweenParam.this.mThis.onStart();
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void c() {
            VTweenParam.this.mThis.onKill();
        }
    };

    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void setTarget(Object obj) {
        this.vTarget.a(obj);
    }

    public Object getTarget() {
        Object objD = this.vTarget.d();
        if (objD instanceof i) {
            return ((i) objD).getVirtualObject();
        }
        if (objD instanceof b) {
            return ((b) objD).a();
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
        com.censivn.C3DEngine.b.g.b bVar = null;
        switch (i) {
            case 100:
                bVar = a.b;
                break;
            case 101:
                bVar = a.a;
                break;
            case 102:
                bVar = a.c;
                break;
            case VEasing.Back.easeIn /* 200 */:
                bVar = a.d;
                break;
            case VEasing.Back.easeOut /* 201 */:
                bVar = a.e;
                break;
            case VEasing.Back.easeInOut /* 202 */:
                bVar = a.f;
                break;
            case 300:
                bVar = a.g;
                break;
            case VEasing.Linear.easeNone /* 400 */:
                bVar = a.k;
                break;
            case VEasing.Linear.easeIn /* 401 */:
                bVar = a.h;
                break;
            case VEasing.Linear.easeOut /* 402 */:
                bVar = a.i;
                break;
            case VEasing.Linear.easeInOut /* 403 */:
                bVar = a.j;
                break;
        }
        this.vTarget.a(bVar);
    }

    public void setCompleteRunnable(Runnable runnable) {
        this.vTarget.a(runnable);
    }

    public Runnable getCompleteRunnable() {
        return this.vTarget.g();
    }

    public void setRotationX(float f) {
        this.vTarget.c(f);
    }

    public void setRotationY(float f) {
        this.vTarget.d(f);
    }

    public void setRotationZ(float f) {
        this.vTarget.e(f);
    }

    public void setSPX(float f) {
        this.vTarget.g(f);
    }

    public void setSPY(float f) {
        this.vTarget.i(f);
    }

    public void setSPZ(float f) {
        this.vTarget.k(f);
    }

    public void setX(float f) {
        this.vTarget.f(f);
    }

    public void setY(float f) {
        this.vTarget.h(f);
    }

    public void setZ(float f) {
        this.vTarget.j(f);
    }

    public void setScaleX(float f) {
        this.vTarget.l(f);
    }

    public void setScaleY(float f) {
        this.vTarget.m(f);
    }

    public void setScaleZ(float f) {
        this.vTarget.n(f);
    }

    public void setTimeout(int i) {
        this.vTarget.b(i);
    }

    public void setAlpha(int i) {
        this.vTarget.a(i);
    }
}
