package com.tsf.shell.p096f.p097a.p099b;

import android.opengl.GLES20;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.a.b.a */
/* loaded from: classes.dex */
public class C2276a {

    /* renamed from: a */
    private ArrayList<C2277a> f7437a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<C2277a> f7438b = new ArrayList<>();

    /* renamed from: com.tsf.shell.f.a.b.a$a */
    /* loaded from: classes.dex */
    public static class C2277a {

        /* renamed from: a */
        C2278b f7439a;
    }

    /* renamed from: a */
    public C2277a m5966a(C2278b c2278b) {
        C2277a m5965b = m5965b(c2278b);
        this.f7437a.add(m5965b);
        int size = this.f7437a.size();
        if (size > 1) {
            GLES20.glStencilFunc(514, size - 1, -1);
            GLES20.glStencilOp(7682, 7682, 7682);
            c2278b.dispatchDraw();
            GLES20.glStencilFunc(514, size, -1);
            GLES20.glStencilOp(7680, 7680, 7680);
        } else {
            GLES20.glClear(1024);
            GLES20.glEnable(2960);
            GLES20.glStencilFunc(519, 0, -1);
            GLES20.glStencilOp(7682, 7682, 7682);
            c2278b.dispatchDraw();
            GLES20.glStencilFunc(514, size, -1);
            GLES20.glStencilOp(7680, 7680, 7680);
        }
        return m5965b;
    }

    /* renamed from: a */
    public void m5968a() {
        C2277a remove = this.f7437a.remove(this.f7437a.size() - 1);
        int size = this.f7437a.size();
        if (this.f7437a.size() > 0) {
            GLES20.glStencilFunc(514, size, -1);
        } else {
            GLES20.glDisable(2960);
        }
        m5967a(remove);
    }

    /* renamed from: b */
    private C2277a m5965b(C2278b c2278b) {
        C2277a remove;
        if (this.f7438b.isEmpty()) {
            remove = new C2277a();
        } else {
            remove = this.f7438b.remove(0);
        }
        remove.f7439a = c2278b;
        c2278b.f7440a = remove;
        return remove;
    }

    /* renamed from: a */
    private void m5967a(C2277a c2277a) {
        c2277a.f7439a.f7440a = null;
        c2277a.f7439a = null;
        this.f7438b.add(c2277a);
    }
}
