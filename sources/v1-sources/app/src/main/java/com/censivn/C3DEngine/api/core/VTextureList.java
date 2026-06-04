package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ac;

/* loaded from: classes.dex */
public class VTextureList {
    private ac vTarget;

    public VTextureList() {
    }

    public VTextureList(ac acVar) {
        this.vTarget = acVar;
    }

    public TextureDescription addElement(TextureElement textureElement) {
        return this.vTarget.c(textureElement);
    }

    public boolean removeElement(TextureElement textureElement) {
        return this.vTarget.d(textureElement);
    }

    public void removeAll() {
        this.vTarget.b();
    }

    public int size() {
        return this.vTarget.c();
    }

    public void clear() {
        this.vTarget.d();
    }

    public void add(int i, TextureDescription textureDescription) {
        this.vTarget.a(i, textureDescription);
    }

    public boolean remove(TextureDescription textureDescription) {
        return this.vTarget.a(textureDescription);
    }

    public TextureDescription get(int i) {
        return this.vTarget.a(i);
    }

    public TextureDescription getByElement(TextureElement textureElement) {
        return this.vTarget.e(textureElement);
    }
}
