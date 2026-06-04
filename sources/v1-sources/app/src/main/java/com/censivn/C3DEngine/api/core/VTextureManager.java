package com.censivn.C3DEngine.api.core;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ad;
import com.censivn.C3DEngine.g.s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class VTextureManager {
    private int appWidgetId;
    private ArrayList mTextureList;

    public VTextureManager() {
    }

    public VTextureManager(int i) {
        this.appWidgetId = i;
        this.mTextureList = new ArrayList();
    }

    public TextureElement createTexture(Bitmap bitmap, boolean z) {
        TextureElement a = com.censivn.C3DEngine.a.f().a(bitmap, z);
        this.mTextureList.add(a);
        return a;
    }

    public void deleteTexture(TextureElement textureElement) {
        this.mTextureList.remove(textureElement);
        com.censivn.C3DEngine.a.f().a(textureElement);
    }

    public void replaceTexture(TextureElement textureElement, Bitmap bitmap) {
        com.censivn.C3DEngine.a.f();
        ad.b(textureElement, bitmap);
    }

    public void replaceTexture(TextureElement textureElement, Bitmap bitmap, boolean z) {
        com.censivn.C3DEngine.a.f();
        ad.c(textureElement, bitmap);
    }

    public void replaceTexture(VObject3d vObject3d, TextureElement textureElement, TextureElement textureElement2, boolean z) {
        vObject3d.textures().removeElement(textureElement);
        vObject3d.textures().addElement(textureElement2);
        if (z) {
            deleteTexture(textureElement);
        }
    }

    public void replaceTextureByTween(VObject3d vObject3d, TextureElement textureElement, TextureElement textureElement2, int i, boolean z) {
        int i2 = i / 2;
        c cVar = new c(this, vObject3d, textureElement, textureElement2, z, i2);
        cVar.a(0);
        s.a(vObject3d.vTarget, i2, cVar);
    }

    public boolean contains(TextureElement textureElement) {
        return this.mTextureList.contains(textureElement);
    }

    public void destroy() {
        String str = "widget:" + this.appWidgetId + " destroy ";
        com.censivn.C3DEngine.a.a().c(new d(this));
    }
}
