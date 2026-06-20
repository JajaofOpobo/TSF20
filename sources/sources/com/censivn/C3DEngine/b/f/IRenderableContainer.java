package com.censivn.C3DEngine.b.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface IRenderableContainer {
    void addChild(IRenderable iVar);

    IRenderable getChildAt(int i);

    int numChildren();

    boolean removeChild(IRenderable iVar);
}
