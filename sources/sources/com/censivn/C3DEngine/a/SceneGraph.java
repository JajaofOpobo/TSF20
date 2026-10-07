package com.censivn.C3DEngine.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.utils.ErrorThrower;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneGraph implements com.censivn.C3DEngine.b.f.IRenderableContainer, com.censivn.C3DEngine.d.AnimationCallback {
    private com.censivn.C3DEngine.f.Normal3f b;
    private com.censivn.C3DEngine.f.ColorRGBA c;
    private boolean d;
    private ArrayList<IRenderable> a = new ArrayList<>();
    private Color4 e = new Color4(255, 255, 255, 255);
    private float g = 0.0f;
    private float f = 10.0f;
    private boolean h = false;

    public void a() {
        a(this);
        this.a = new ArrayList<>();
        this.b = new com.censivn.C3DEngine.f.Normal3f();
        this.c = new com.censivn.C3DEngine.f.ColorRGBA(0, 0, 0, 255, this);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderableContainer
    public void addChild(IRenderable iVar) {
        if (!RendererImpl.l()) {
            ErrorThrower.a(this, "scene addChild is worng thread:" + iVar);
        }
        if (!this.a.contains(iVar)) {
            this.a.add(iVar);
            iVar.parent(this);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderableContainer
    public boolean removeChild(IRenderable iVar) {
        if (!RendererImpl.l()) {
            ErrorThrower.a(this, "scene removeChild is worng thread:" + iVar);
        }
        boolean zRemove = this.a.remove(iVar);
        if (zRemove) {
            iVar.parent(null);
        }
        return zRemove;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderableContainer
    public IRenderable getChildAt(int i) {
        return this.a.get(i);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderableContainer
    public int numChildren() {
        return this.a.size();
    }

    public com.censivn.C3DEngine.f.Normal3f b() {
        return this.b;
    }

    public void a(boolean z) {
        this.d = z;
    }

    void c() {
        a();
    }

    ArrayList<IRenderable> d() {
        return this.a;
    }

    private void a(com.censivn.C3DEngine.b.f.IRenderableContainer containerVar) {
        for (int iNumChildren = containerVar.numChildren() - 1; iNumChildren >= 0; iNumChildren--) {
            IRenderable childAt = containerVar.getChildAt(iNumChildren);
            childAt.destroy();
            if (childAt instanceof j) {
                a((j) childAt);
            }
        }
    }

    @Override // com.censivn.C3DEngine.d.AnimationCallback
    public void e() {
    }
}
