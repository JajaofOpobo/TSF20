package com.tsf.shell.widget.alarm.c;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
/* loaded from: classes.dex */
public class e {
    private d[] a = new d[7];
    private VObject3dContainer b;

    public e(VObject3dContainer vObject3dContainer) {
        this.b = vObject3dContainer;
        c();
    }

    public void a(boolean z) {
        for (int i = 0; i < 7; i++) {
            this.a[i].visible(Boolean.valueOf(z));
        }
    }

    private void c() {
        for (int i = 0; i < 7; i++) {
            this.a[i] = new d(i);
            this.b.addChild(this.a[i]);
        }
    }

    public void a() {
        for (int i = 0; i < 7; i++) {
            this.a[i].calAABB();
        }
    }

    public void a(boolean[] zArr) {
        for (int i = 0; i < 7; i++) {
            this.a[i].a(zArr[i]);
        }
    }

    public boolean a(int i) {
        if (i < 0 || i > 6) {
            return false;
        }
        return this.a[i].b();
    }

    public void b() {
        for (int i = 0; i < 7; i++) {
            this.a[i].a(i * 100);
        }
    }
}
