package com.tsf.shell.widget.alarm.p204c;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
/* renamed from: com.tsf.shell.widget.alarm.c.e */
/* loaded from: classes.dex */
public class C4280e {

    /* renamed from: a */
    private C4276d[] f13871a = new C4276d[7];

    /* renamed from: b */
    private VObject3dContainer f13872b;

    public C4280e(VObject3dContainer vObject3dContainer) {
        this.f13872b = vObject3dContainer;
        m318c();
    }

    /* renamed from: a */
    public void m321a(boolean z) {
        for (int i = 0; i < 7; i++) {
            this.f13871a[i].visible(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    private void m318c() {
        for (int i = 0; i < 7; i++) {
            this.f13871a[i] = new C4276d(i);
            this.f13872b.addChild(this.f13871a[i]);
        }
    }

    /* renamed from: a */
    public void m323a() {
        for (int i = 0; i < 7; i++) {
            this.f13871a[i].calAABB();
        }
    }

    /* renamed from: a */
    public void m320a(boolean[] zArr) {
        for (int i = 0; i < 7; i++) {
            this.f13871a[i].m327a(zArr[i]);
        }
    }

    /* renamed from: a */
    public boolean m322a(int i) {
        if (i < 0 || i > 6) {
            return false;
        }
        return this.f13871a[i].m326b();
    }

    /* renamed from: b */
    public void m319b() {
        for (int i = 0; i < 7; i++) {
            this.f13871a[i].m329a(i * 100);
        }
    }
}
