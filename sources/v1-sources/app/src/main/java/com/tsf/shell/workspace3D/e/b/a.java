package com.tsf.shell.workspace3D.e.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.e.o;
import com.tsf.shell.workspace3D.e.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    public static com.tsf.shell.workspace3D.e.c.a a = new com.tsf.shell.workspace3D.e.c.a();
    public static b b = new b();
    public int c;
    public boolean d;
    public float e = 0.3f;

    public void a(ArrayList arrayList, ArrayList arrayList2, int i, float f, float f2, float f3, float f4) {
    }

    public float a(int i, ArrayList arrayList, float f) {
        return 0.0f;
    }

    public int a(Number3d number3d, ArrayList arrayList, int i) {
        return 0;
    }

    public void a(r rVar, float f, float f2, float f3) {
    }

    public float a(float f, float f2) {
        return 500.0f;
    }

    public void a(o oVar, r rVar, float f, boolean z) {
    }

    public boolean a(Number3d number3d, r rVar, boolean z) {
        return false;
    }

    public boolean a(boolean z) {
        return false;
    }

    public Number3d a(r rVar) {
        return null;
    }

    public Number3d b(r rVar) {
        return null;
    }

    public void a(u uVar, float f) {
    }

    public float a(ArrayList arrayList, int i, float f, float f2, float f3, float f4) {
        return 0.0f;
    }

    public float a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return 0.0f;
    }

    public int a(ArrayList arrayList, ArrayList arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        return -1;
    }

    public int b(float f, float f2) {
        return 0;
    }

    public final void a(float f) {
        this.e = f;
    }

    public static int b(float f) {
        if (f <= p.e) {
            return 0;
        }
        if (f > p.f) {
            return -4;
        }
        return -3;
    }

    public static com.tsf.shell.workspace3D.e.c.a a(float f, float f2, float f3, float f4, int i) {
        if (f < f3) {
            a.a = -1;
            return a;
        }
        if (f > f2 - f4) {
            a.a = i - 1;
            a.b = 0.5f;
            a.d = ((((f2 - f3) - f4) / i) * (a.a + 0.5f)) + f3;
            return a;
        }
        float f5 = ((f2 - f3) - f4) / i;
        int i2 = (int) ((f - f3) / f5);
        if (i2 > i - 1) {
            i2 = i - 1;
        }
        a.a = i2;
        a.b = ((((f - f3) - (i2 * f5)) / f5) - 0.5f) * 2.0f;
        a.c = f5;
        a.d = ((i2 + 0.5f) * f5) + f3;
        return a;
    }

    public void a(v vVar, v vVar2) {
    }

    public b a(r rVar, float f) {
        return null;
    }

    public int c(float f, float f2) {
        return 0;
    }
}
