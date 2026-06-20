package com.tsf.shell.f.h.a.a;

import com.censivn.C3DEngine.b.f.IRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class SceneElementBase extends com.censivn.C3DEngine.b.b.A.a {
    private boolean a = false;
    private boolean b = false;
    private int c = 10;

    public SceneElementBase(int i) {
        setTitle(i);
        setTitlePosition(com.censivn.C3DEngine.b.b.A.a(120.0f));
        setTitleSize(36);
        setMarginDistance(com.censivn.C3DEngine.b.b.A.a(10.0f));
        minY((-com.tsf.shell.f.h.a.WorkspacePreviewNode.a) / 2.0f);
        maxY(com.tsf.shell.f.h.a.WorkspacePreviewNode.a / 2.0f);
    }

    public void a(int i) {
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public void b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < children().size()) {
                i iVar = children().get(i2);
                if (iVar instanceof b) {
                    ((SceneNodeAnimator) iVar).g();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void b(int i) {
        if (i == 0) {
            visible(false);
        } else {
            visible(true);
        }
    }
}
