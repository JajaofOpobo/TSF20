package com.tsf.shell.setting.a;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class c extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ b a;
    private float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = bVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        b bVar;
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        bVar = this.a.a;
        com.censivn.C3DEngine.b.r a2 = bVar.a(a[0], a[1], true);
        if (a2 != null) {
            try {
                this.a.a(((Integer) a2.s()).intValue());
            } catch (Exception e) {
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        z = this.a.A;
        if (z) {
            b bVar = this.a;
            f3 = this.a.D;
            bVar.D = (int) (f3 + (f / 10.0f));
            f4 = this.a.D;
            f5 = this.a.E;
            int i = (int) (f4 / f5);
            b bVar2 = this.a;
            f6 = this.a.E;
            bVar2.D = (int) (i * f6);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b unused;
        z = this.a.A;
        if (!z) {
            if (Math.abs(f2) > Math.abs(f)) {
                bVar3 = this.a.a;
                bVar3.e(false);
                bVar4 = this.a.a;
                com.censivn.C3DEngine.b.v vVar = (com.censivn.C3DEngine.b.v) bVar4.P();
                float[] a = com.censivn.C3DEngine.h.a.a(motionEvent2);
                com.censivn.C3DEngine.b.r b = vVar.b(a[0], a[1], true);
                bVar5 = this.a.a;
                bVar5.e(true);
                if (b != null && b.aw() != null) {
                    com.censivn.C3DEngine.b.m.d().a(b.aw(), true);
                    return;
                }
            }
            this.a.A = true;
            b bVar6 = this.a;
            bVar = this.a.a;
            float f3 = bVar.L().x;
            this.c = f3;
            bVar6.D = f3;
            bVar2 = this.a.a;
            bVar2.a_(true);
            unused = this.a.a;
            b.u();
        }
        this.a.D = this.c + (motionEvent2.getX() - motionEvent.getX());
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2;
        float f3;
        z = this.a.A;
        if (z) {
            this.a.A = false;
            f = this.a.D;
            f2 = this.a.E;
            int round = Math.round(f / f2);
            b bVar = this.a;
            f3 = this.a.E;
            bVar.D = round * f3;
        }
    }
}
