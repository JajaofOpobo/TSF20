package com.tsf.shell.e.a.b;

import android.opengl.GLES20;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    private ArrayList a = new ArrayList();
    private ArrayList b = new ArrayList();

    public b a(c cVar) {
        b b = b(cVar);
        this.a.add(b);
        int size = this.a.size();
        if (size > 1) {
            GLES20.glStencilFunc(514, size - 1, -1);
            GLES20.glStencilOp(7682, 7682, 7682);
            cVar.dispatchDraw();
            GLES20.glStencilFunc(514, size, -1);
            GLES20.glStencilOp(7680, 7680, 7680);
        } else {
            GLES20.glClear(1024);
            GLES20.glEnable(2960);
            GLES20.glStencilFunc(519, 0, -1);
            GLES20.glStencilOp(7682, 7682, 7682);
            cVar.dispatchDraw();
            GLES20.glStencilFunc(514, size, -1);
            GLES20.glStencilOp(7680, 7680, 7680);
        }
        return b;
    }

    public void a() {
        b bVar = (b) this.a.remove(this.a.size() - 1);
        int size = this.a.size();
        if (this.a.size() > 0) {
            GLES20.glStencilFunc(514, size, -1);
        } else {
            GLES20.glDisable(2960);
        }
        a(bVar);
    }

    private b b(c cVar) {
        b bVar;
        if (this.b.isEmpty()) {
            bVar = new b();
        } else {
            bVar = (b) this.b.remove(0);
        }
        bVar.a = cVar;
        cVar.a = bVar;
        return bVar;
    }

    private void a(b bVar) {
        bVar.a.a = null;
        bVar.a = null;
        this.b.add(bVar);
    }
}
