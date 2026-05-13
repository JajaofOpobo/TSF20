package com.censivn.C3DEngine.api.core;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p091b.C2224a;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class VTextureManager {
    private int appWidgetId;
    private ArrayList<TextureElement> mTextureList = new ArrayList<>();

    public VTextureManager() {
    }

    public VTextureManager(int i) {
        this.appWidgetId = i;
    }

    public TextureElement createTexture(Bitmap bitmap, boolean z) {
        TextureElement m10544a = C0853a.m10853g().m10544a(bitmap, z);
        this.mTextureList.add(m10544a);
        onTextureChanged();
        return m10544a;
    }

    public void deleteTexture(TextureElement textureElement) {
        this.mTextureList.remove(textureElement);
        C0853a.m10853g().m10543a(textureElement);
        onTextureChanged();
    }

    public void onTextureChanged() {
    }

    public void replaceTexture(TextureElement textureElement, Bitmap bitmap) {
        C0853a.m10853g().m10540a(textureElement, bitmap);
        onTextureChanged();
    }

    public void replaceTexture(TextureElement textureElement, Bitmap bitmap, boolean z) {
        C0853a.m10853g().m10540a(textureElement, bitmap);
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
        C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.api.core.VTextureManager.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                VTextureManager.this.replaceTexture(vObject3d, textureElement, textureElement2, z);
                C1017d c1017d2 = new C1017d();
                c1017d2.m10314a(255);
                C1014c.m10325a(vObject3d.vTarget, i2, c1017d2);
            }
        };
        c1017d.m10314a(0);
        C1014c.m10325a(vObject3d.vTarget, i2, c1017d);
    }

    public boolean contains(TextureElement textureElement) {
        return this.mTextureList.contains(textureElement);
    }

    public void destroy() {
        C2224a.m6053a("VTextureManager", "widget:" + this.appWidgetId + " destroy ");
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.api.core.VTextureManager.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = VTextureManager.this.mTextureList.iterator();
                while (it.hasNext()) {
                    C0853a.m10853g().m10543a((TextureElement) it.next());
                }
                VTextureManager.this.mTextureList.clear();
            }
        });
    }
}
