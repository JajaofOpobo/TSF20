package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.TextureList;
/* loaded from: classes.dex */
public class VTextureList {
    private TextureList vTarget;

    public VTextureList() {
    }

    public VTextureList(TextureList textureList) {
        this.vTarget = textureList;
    }

    public TextureDescription addElement(TextureElement textureElement) {
        return this.vTarget.addElement(textureElement);
    }

    public boolean removeElement(TextureElement textureElement) {
        return this.vTarget.removeElement(textureElement);
    }

    public void removeAll() {
        this.vTarget.removeAll();
    }

    public int size() {
        return this.vTarget.size();
    }

    public void clear() {
        this.vTarget.clear();
    }

    public void add(int i, TextureDescription textureDescription) {
        this.vTarget.add(i, textureDescription);
    }

    public boolean remove(TextureDescription textureDescription) {
        return this.vTarget.remove(textureDescription);
    }

    public TextureDescription get(int i) {
        return this.vTarget.get(i);
    }

    public TextureDescription getByElement(TextureElement textureElement) {
        return this.vTarget.getByElement(textureElement);
    }
}
