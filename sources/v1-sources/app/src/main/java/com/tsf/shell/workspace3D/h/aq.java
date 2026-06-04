package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class aq extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ ao a;
    private float c;
    private float d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(ao aoVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = aoVar;
        this.e = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        float f;
        float f2;
        float f3;
        float f4;
        this.a.p = this.c + (((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.a.l) * 360.0f * 1.2f);
        float y = ((motionEvent2.getY() - motionEvent.getY()) / com.censivn.C3DEngine.a.m) * 180.0f;
        this.a.q = this.d + y;
        f = this.a.q;
        if (f > 45.0f) {
            this.a.q = 45.0f;
            f4 = this.a.q;
            this.d = f4 - y;
        } else {
            f2 = this.a.q;
            if (f2 < -45.0f) {
                this.a.q = -45.0f;
                f3 = this.a.q;
                this.d = f3 - y;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v vVar3;
        float f;
        float f2;
        this.a.w = 0.03f;
        vVar = this.a.z;
        com.censivn.C3DEngine.g.s.a(vVar);
        this.e = false;
        this.a.x = true;
        this.a.y = false;
        ao aoVar = this.a;
        vVar2 = this.a.z;
        float f3 = vVar2.M().y;
        aoVar.p = f3;
        this.c = f3;
        ao aoVar2 = this.a;
        vVar3 = this.a.z;
        float f4 = vVar3.M().x;
        aoVar2.q = f4;
        this.d = f4;
        ao aoVar3 = this.a;
        f = this.a.n;
        f2 = this.a.o;
        aoVar3.r = (f + f2) / 3.0f;
        this.a.m();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v vVar3;
        float n;
        com.censivn.C3DEngine.b.v vVar4;
        float n2;
        com.censivn.C3DEngine.b.v vVar5;
        float n3;
        com.censivn.C3DEngine.b.v vVar6;
        com.censivn.C3DEngine.b.v vVar7;
        com.censivn.C3DEngine.b.v vVar8;
        com.censivn.C3DEngine.b.v vVar9;
        com.censivn.C3DEngine.b.v vVar10;
        float f;
        com.censivn.C3DEngine.b.v vVar11;
        float f2;
        float f3;
        com.censivn.C3DEngine.b.v vVar12;
        com.censivn.C3DEngine.b.v vVar13;
        this.a.x = false;
        this.a.q = 0.0f;
        if (!this.e) {
            vVar = this.a.z;
            vVar2 = this.a.z;
            this.a.c.a((a) vVar.d(vVar2.aB() - 1), false);
            this.a.c.k.D = 0.0f;
            com.tsf.shell.workspace3D.bf.q().a(this.a.c.k, true);
            vVar3 = this.a.z;
            float f4 = (((int) (vVar3.M().y / 360.0f)) * 360) + 360;
            n = this.a.n();
            float f5 = f4 + n;
            vVar4 = this.a.z;
            float f6 = ((int) (vVar4.M().y / 360.0f)) * 360;
            n2 = this.a.n();
            float f7 = f6 + n2;
            vVar5 = this.a.z;
            n3 = this.a.n();
            float f8 = ((((int) (vVar5.M().y / 360.0f)) * 360) - 360) + n3;
            vVar6 = this.a.z;
            float abs = Math.abs(f5 - vVar6.M().y);
            vVar7 = this.a.z;
            float abs2 = Math.abs(f7 - vVar7.M().y);
            vVar8 = this.a.z;
            float abs3 = Math.abs(f8 - vVar8.M().y);
            if (abs < abs2 && abs < abs3) {
                this.a.p = f5;
            } else if (abs2 >= abs || abs2 >= abs3) {
                this.a.p = f8;
            } else {
                this.a.p = f7;
            }
            ao aoVar = this.a;
            vVar9 = this.a.z;
            aoVar.t = vVar9.M().y;
            ao aoVar2 = this.a;
            vVar10 = this.a.z;
            aoVar2.u = vVar10.L().z;
            ao aoVar3 = this.a;
            f = this.a.p;
            vVar11 = this.a.z;
            aoVar3.s = f - vVar11.M().y;
            this.a.y = true;
            for (int i = 0; i < this.a.c.l; i++) {
                ((a) this.a.c.i.get(i)).aK();
            }
            ar arVar = new ar(this);
            arVar.c(0.0f);
            f2 = this.a.p;
            arVar.d(f2);
            f3 = this.a.n;
            arVar.i(f3);
            vVar12 = this.a.z;
            com.censivn.C3DEngine.g.s.a(vVar12);
            vVar13 = this.a.z;
            com.censivn.C3DEngine.g.s.a(vVar13, ThemeShellDescription.PAGE_PREVIEW_SELECT, arVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.censivn.C3DEngine.b.v vVar;
        float n;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v vVar3;
        float f3;
        com.censivn.C3DEngine.b.v vVar4;
        if (Math.abs(f) > 3000.0f) {
            this.e = true;
            ao aoVar = this.a;
            vVar = this.a.z;
            float f4 = (((int) (vVar.M().y + (f / 3.0f))) / 360) * 360;
            n = this.a.n();
            aoVar.p = f4 + n;
            ao aoVar2 = this.a;
            vVar2 = this.a.z;
            aoVar2.t = vVar2.M().y;
            ao aoVar3 = this.a;
            vVar3 = this.a.z;
            aoVar3.u = vVar3.L().z;
            ao aoVar4 = this.a;
            f3 = this.a.p;
            vVar4 = this.a.z;
            aoVar4.s = f3 - vVar4.M().y;
            this.a.m();
        }
    }
}
