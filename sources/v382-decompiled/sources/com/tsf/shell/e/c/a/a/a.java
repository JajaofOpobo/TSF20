package com.tsf.shell.e.c.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    public static com.tsf.shell.e.c.a.b.a a = new com.tsf.shell.e.c.a.b.a();
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

    public void a(com.censivn.C3DEngine.b.f.j jVar, float f, float f2, float f3) {
    }

    public float a(float f, float f2) {
        return 500.0f;
    }

    public void a(com.tsf.shell.e.c.a.d dVar, com.censivn.C3DEngine.b.f.j jVar, float f, boolean z) {
    }

    public boolean a(Number3d number3d, com.censivn.C3DEngine.b.f.j jVar, boolean z) {
        return false;
    }

    public Number3d a(com.censivn.C3DEngine.b.f.j jVar) {
        return null;
    }

    public Number3d b(com.censivn.C3DEngine.b.f.j jVar) {
        return null;
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

    public void a(float f) {
        this.e = f;
    }

    public int b(float f) {
        if (f <= com.tsf.shell.e.c.a.f.e) {
            return 0;
        }
        if (f > com.tsf.shell.e.c.a.f.f) {
            return -4;
        }
        return -3;
    }

    public com.tsf.shell.e.c.a.b.a a(float f, float f2, float f3, float f4, int i) {
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

    public void a(l lVar, l lVar2) {
    }

    public b a(com.censivn.C3DEngine.b.f.j jVar, float f, float f2, float f3, float f4) {
        return null;
    }

    public int a(float f, float f2, float f3) {
        return 0;
    }
}
