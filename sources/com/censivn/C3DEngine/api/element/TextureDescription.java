package com.censivn.C3DEngine.api.element;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class TextureDescription {
    public float offsetU;
    public float offsetV;
    public boolean repeatU;
    public boolean repeatV;
    public TextureElement textureElement;
    public ArrayList<TextureEnvDescription> textureEnvs;

    public TextureDescription(TextureElement textureElement, ArrayList<TextureEnvDescription> arrayList) {
        this.repeatU = true;
        this.repeatV = true;
        this.offsetU = 0.0f;
        this.offsetV = 0.0f;
        this.textureElement = textureElement;
        this.textureEnvs = arrayList;
    }

    public TextureDescription(TextureElement textureElement) {
        this.repeatU = true;
        this.repeatV = true;
        this.offsetU = 0.0f;
        this.offsetV = 0.0f;
        this.textureElement = textureElement;
        this.textureEnvs = new ArrayList<>();
        this.textureEnvs.add(new TextureEnvDescription());
    }
}
