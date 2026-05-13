package com.censivn.C3DEngine.p031b.p035c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
import com.tsf.shell.utils.C4176l;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.c.f */
/* loaded from: classes.dex */
public class C0936f {

    /* renamed from: a */
    public static String f2738a = "30820239308201a2a00302010202044f47a83a300d06092a864886f70d01010505003060310e300c060355040613053130303030310e300c060355040813055453465549310e300c060355040713055453465549310e300c060355040a13055453465549310e300c060355040b13055453465549310e300c0603550403130554534655493020170d3132303232343135303934365a180f32313132303133313135303934365a3060310e300c060355040613053130303030310e300c060355040813055453465549310e300c060355040713055453465549310e300c060355040a13055453465549310e300c060355040b13055453465549310e300c06035504031305545346554930819f300d06092a864886f70d010101050003818d0030818902818100b84a4516c3903fa339c8dd21f21574ba16053eac7cf6307e69294e8f156b4879c8f9198eecf9638c87ef69dec8ca0468c85ffd93a91ed3f204f5e2e84208e7edb7a6397e52edf49eef6b6f18ec3c99b965256b1e560b2386c43022c1a3f41afbe0722acf1df3930c9d596952aa82f961daf87f687956dd7f3c16339d93dd09530203010001300d06092a864886f70d0101050500038181000096f577e237fb38de6d522d75311389d42243e3adffe4aa6188879ea78658f62f97c06ffeeb4f7a9870637c8f5b2175313b257c6f4dfb2276e1b1c8caacca63b6b1a8acf627ac088497b8c51c00879046b2af649d1f6c806ed44ebfb324ea1f6d4b323bdcfeb12a8d18c13e02b26f8b50110ecc416276b52eff102758faa3e9";

    /* renamed from: b */
    private int f2739b = 0;

    /* renamed from: a */
    public TextureElement m10539a(TextureElement textureElement, Bitmap bitmap, boolean z) {
        if (textureElement != null) {
            m10540a(textureElement, bitmap);
            return textureElement;
        }
        return m10544a(bitmap, true);
    }

    /* renamed from: a */
    public TextureElement m10545a(int i, int i2, boolean z) {
        TextureElement textureElement = new TextureElement(C0853a.m10855e().m10778a(i, i2, z), z);
        textureElement.width = i;
        textureElement.height = i2;
        this.f2739b++;
        return textureElement;
    }

    /* renamed from: a */
    public TextureElement m10544a(Bitmap bitmap, boolean z) {
        TextureElement textureElement = new TextureElement(C0853a.m10855e().m10776a(bitmap, z), z);
        textureElement.width = bitmap.getWidth();
        textureElement.height = bitmap.getHeight();
        this.f2739b++;
        return textureElement;
    }

    /* renamed from: a */
    public void m10541a(TextureElement textureElement, int i, int i2, int i3) {
        Bitmap m607a = C4189x.m607a(i, i2, i3);
        m10540a(textureElement, m607a);
        m607a.recycle();
    }

    /* renamed from: a */
    public void m10542a(TextureElement textureElement, int i) {
        Bitmap m609a = C4189x.m609a(i);
        m10540a(textureElement, m609a);
        m609a.recycle();
    }

    /* renamed from: a */
    public void m10540a(TextureElement textureElement, Bitmap bitmap) {
        if (textureElement != null) {
            if (textureElement.f2529id == 0) {
                textureElement.f2529id = C0853a.m10855e().m10776a(bitmap, textureElement.mipMap);
                textureElement.width = bitmap.getWidth();
                textureElement.height = bitmap.getHeight();
                this.f2739b++;
            } else if (textureElement.width != bitmap.getWidth() || textureElement.height != bitmap.getHeight()) {
                if (textureElement.f2529id != 0) {
                    this.f2739b--;
                    C0853a.m10855e().m10780a(textureElement.f2529id);
                }
                textureElement.f2529id = C0853a.m10855e().m10776a(bitmap, textureElement.mipMap);
                textureElement.width = bitmap.getWidth();
                textureElement.height = bitmap.getHeight();
                this.f2739b++;
            } else {
                C0853a.m10855e().m10777a(textureElement.f2529id, bitmap, 0, 0);
            }
            textureElement.width = bitmap.getWidth();
            textureElement.height = bitmap.getHeight();
        }
    }

    /* renamed from: a */
    public void m10543a(TextureElement textureElement) {
        if (textureElement != null) {
            if (Thread.currentThread().getId() != C0869e.f2474f) {
                C4176l.m668a(this, "TextureManager deleteTexture in wrong thread");
            }
            if (textureElement.f2529id != 0) {
                if (textureElement.f2529id != 0) {
                    this.f2739b--;
                    C0853a.m10855e().m10780a(textureElement.f2529id);
                    textureElement.f2529id = 0;
                }
                if (textureElement instanceof DynamicTextureElement) {
                    ((DynamicTextureElement) textureElement).onRecycle();
                }
            }
        }
    }
}
