package com.censivn.C3DEngine.api.core;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VTextureManager {
    private int appWidgetId;
    private ArrayList<TextureElement> mTextureList = new ArrayList<>();

    public VTextureManager() {
    }

    public VTextureManager(int i) {
        this.appWidgetId = i;
    }

    public TextureElement createTexture(Bitmap bitmap, boolean z) {
        TextureElement textureElementA = a.g().a(bitmap, z);
        this.mTextureList.add(textureElementA);
        onTextureChanged();
        return textureElementA;
    }

    public void deleteTexture(TextureElement textureElement) {
        this.mTextureList.remove(textureElement);
        a.g().a(textureElement);
        onTextureChanged();
    }

    public void onTextureChanged() {
    }

    public void replaceTexture(TextureElement textureElement, Bitmap bitmap) {
        a.g().a(textureElement, bitmap);
        onTextureChanged();
    }

    public void replaceTexture(TextureElement textureElement, Bitmap bitmap, boolean z) {
        a.g().a(textureElement, bitmap);
        onTextureChanged();
    }

    public void replaceTexture(VObject3d vObject3d, TextureElement textureElement, TextureElement textureElement2, boolean z) {
        vObject3d.textures().removeElement(textureElement);
        vObject3d.textures().addElement(textureElement2);
        if (z) {
            deleteTexture(textureElement);
        }
        onTextureChanged();
    }

    public void replaceTextureByTween(final VObject3d vObject3d, final TextureElement textureElement, final TextureElement textureElement2, int i, final boolean z) {
        final int i2 = i / 2;
        d dVar = new d() { // from class: com.censivn.C3DEngine.api.core.VTextureManager.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                VTextureManager.this.replaceTexture(vObject3d, textureElement, textureElement2, z);
                d dVar2 = new d();
                dVar2.a(255);
                c.a(vObject3d.vTarget, i2, dVar2);
            }
        };
        dVar.a(0);
        c.a(vObject3d.vTarget, i2, dVar);
    }

    public boolean contains(TextureElement textureElement) {
        return this.mTextureList.contains(textureElement);
    }

    public void destroy() {
        com.tsf.shell.b.a.a("VTextureManager", "widget:" + this.appWidgetId + " destroy ");
        a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.api.core.VTextureManager.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = VTextureManager.this.mTextureList.iterator();
                while (it.hasNext()) {
                    a.g().a((TextureElement) it.next());
                }
                VTextureManager.this.mTextureList.clear();
            }
        });
    }
}
