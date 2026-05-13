package com.tsf.shell.f.a.b;

import android.opengl.GLES20;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    private ArrayList<C0079a> a = new ArrayList<>();
    private ArrayList<C0079a> b = new ArrayList<>();

    /* renamed from: com.tsf.shell.f.a.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0079a {
        b a;
    }

    public C0079a a(b bVar) {
        C0079a b = b(bVar);
        this.a.add(b);
        int size = this.a.size();
        if (size > 1) {
            GLES20.glStencilFunc(514, size - 1, -1);
            GLES20.glStencilOp(7682, 7682, 7682);
            bVar.dispatchDraw();
            GLES20.glStencilFunc(514, size, -1);
            GLES20.glStencilOp(7680, 7680, 7680);
        } else {
            GLES20.glClear(1024);
            GLES20.glEnable(2960);
            GLES20.glStencilFunc(519, 0, -1);
            GLES20.glStencilOp(7682, 7682, 7682);
            bVar.dispatchDraw();
            GLES20.glStencilFunc(514, size, -1);
            GLES20.glStencilOp(7680, 7680, 7680);
        }
        return b;
    }

    public void a() {
        C0079a remove = this.a.remove(this.a.size() - 1);
        int size = this.a.size();
        if (this.a.size() > 0) {
            GLES20.glStencilFunc(514, size, -1);
        } else {
            GLES20.glDisable(2960);
        }
        a(remove);
    }

    private C0079a b(b bVar) {
        C0079a remove;
        if (this.b.isEmpty()) {
            remove = new C0079a();
        } else {
            remove = this.b.remove(0);
        }
        remove.a = bVar;
        bVar.a = remove;
        return remove;
    }

    private void a(C0079a c0079a) {
        c0079a.a.a = null;
        c0079a.a = null;
        this.b.add(c0079a);
    }
}
