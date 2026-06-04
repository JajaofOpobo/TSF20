package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.g.b.b;
import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
public class VTweenParam {
    private VTweenParam mThis = this;
    public u vTarget = new a(this);

    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void setTarget(Object obj) {
        this.vTarget.a(obj);
    }

    public Object getTarget() {
        Object b = this.vTarget.b();
        if (b instanceof r) {
            return ((r) b).r();
        }
        if (b instanceof b) {
            return ((b) b).a();
        }
        return null;
    }

    public void onComplete() {
    }

    public void onUpdate(float f) {
    }

    public void onProgress(float f) {
    }

    public void setEase(int i) {
        com.censivn.C3DEngine.g.r rVar = null;
        switch (i) {
            case VEasing.Circ.easeIn /* 100 */:
                rVar = com.censivn.C3DEngine.g.a.b;
                break;
            case VEasing.Circ.easeOut /* 101 */:
                rVar = com.censivn.C3DEngine.g.a.a;
                break;
            case VEasing.Circ.easeInOut /* 102 */:
                rVar = com.censivn.C3DEngine.g.a.c;
                break;
            case 200:
                rVar = com.censivn.C3DEngine.g.a.d;
                break;
            case 201:
                rVar = com.censivn.C3DEngine.g.a.e;
                break;
            case 202:
                rVar = com.censivn.C3DEngine.g.a.f;
                break;
            case 300:
                rVar = com.censivn.C3DEngine.g.a.g;
                break;
            case 400:
                rVar = com.censivn.C3DEngine.g.a.k;
                break;
            case 401:
                rVar = com.censivn.C3DEngine.g.a.h;
                break;
            case 402:
                rVar = com.censivn.C3DEngine.g.a.i;
                break;
            case 403:
                rVar = com.censivn.C3DEngine.g.a.j;
                break;
        }
        this.vTarget.a(rVar);
    }

    public void setCompleteRunnable(Runnable runnable) {
        this.vTarget.a(runnable);
    }

    public Runnable getCompleteRunnable() {
        return this.vTarget.d();
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
        u uVar = this.vTarget;
        uVar.c = true;
        uVar.n = com.censivn.C3DEngine.a.a * f;
    }

    public void setSPZ(float f) {
        u uVar = this.vTarget;
        uVar.d = true;
        uVar.o = com.censivn.C3DEngine.a.a * f;
    }

    public void setX(float f) {
        this.vTarget.f(f);
    }

    public void setY(float f) {
        this.vTarget.h(f);
    }

    public void setZ(float f) {
        this.vTarget.i(f);
    }

    public void setScaleX(float f) {
        this.vTarget.j(f);
    }

    public void setScaleY(float f) {
        this.vTarget.k(f);
    }

    public void setScaleZ(float f) {
        this.vTarget.l(f);
    }

    public void setTimeout(int i) {
        this.vTarget.b(i);
    }

    public void setAlpha(int i) {
        this.vTarget.a(i);
    }
}
