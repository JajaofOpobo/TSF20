package com.censivn.C3DEngine.api.element;

import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.core.VTextureList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TextureList {
    private ArrayList<TextureDescription> mTextureDescriptionList = new ArrayList<>();
    private VTextureList virtualProxy;

    public VTextureList getVirtualProxy() {
        if (this.virtualProxy == null) {
            this.virtualProxy = new VTextureList(this);
        }
        return this.virtualProxy;
    }

    public void add(int i, TextureDescription textureDescription) {
        this.mTextureDescriptionList.add(i, textureDescription);
    }

    public TextureDescription addElementWithoutCheck(TextureElement textureElement) {
        TextureDescription textureDescription = new TextureDescription(textureElement);
        this.mTextureDescriptionList.add(textureDescription);
        return textureDescription;
    }

    public TextureDescription addElementWithoutVerify(TextureElement textureElement) {
        TextureDescription textureDescription = new TextureDescription(textureElement);
        this.mTextureDescriptionList.add(textureDescription);
        a.e().j();
        return textureDescription;
    }

    public TextureDescription addElement(TextureElement textureElement) {
        TextureDescription textureDescription = new TextureDescription(textureElement);
        this.mTextureDescriptionList.add(textureDescription);
        a.e().j();
        return textureDescription;
    }

    public boolean addReplace(TextureDescription textureDescription) {
        this.mTextureDescriptionList.clear();
        return this.mTextureDescriptionList.add(textureDescription);
    }

    public boolean remove(TextureDescription textureDescription) {
        return this.mTextureDescriptionList.remove(textureDescription);
    }

    public boolean removeElement(TextureElement textureElement) {
        TextureDescription byElement = getByElement(textureElement);
        if (byElement == null) {
            throw new Error("No match in TextureList for id \"" + byElement.textureElement.id + "\"");
        }
        a.e().j();
        return this.mTextureDescriptionList.remove(byElement);
    }

    public void removeAll() {
        this.mTextureDescriptionList.clear();
        a.e().j();
    }

    public TextureDescription get(int i) {
        return this.mTextureDescriptionList.get(i);
    }

    public TextureDescription getByElement(TextureElement textureElement) {
        for (TextureDescription textureDescription : this.mTextureDescriptionList) {
            if (textureDescription.textureElement == textureElement) {
                return textureDescription;
            }
        }
        return null;
    }

    public int size() {
        return this.mTextureDescriptionList.size();
    }

    public void clear() {
        this.mTextureDescriptionList.clear();
        a.e().j();
    }

    public void destroyAllTexture() {
        Iterator<TextureDescription> it = this.mTextureDescriptionList.iterator();
        while (it.hasNext()) {
            a.g().a(it.next().textureElement);
        }
        this.mTextureDescriptionList.clear();
        a.e().j();
    }
}
