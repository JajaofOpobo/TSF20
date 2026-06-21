package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureList;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;

/* loaded from: classes.dex */
class am extends VTweenParam {
    boolean a = false;
    final /* synthetic */ ak b;
    private VObject3d c;

    public am(ak akVar, VObject3d vObject3d) {
        this.b = akVar;
        this.c = vObject3d;
        VTween.killTween(akVar);
        VTween.to(akVar, 1000, this);
    }

    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
    public void onComplete() {
        Object obj;
        Bitmap bitmap;
        TextureElement textureElement;
        Bitmap bitmap2;
        TextureElement textureElement2;
        TextureElement textureElement3;
        TextureElement textureElement4;
        Bitmap bitmap3;
        obj = this.b.e;
        synchronized (obj) {
            bitmap = this.b.b;
            if (!bitmap.isRecycled()) {
                this.b.textures().removeAll();
                VTextureManager vTextureManager = AlarmWidget.c;
                textureElement = this.b.a;
                vTextureManager.deleteTexture(textureElement);
                ak akVar = this.b;
                VTextureManager vTextureManager2 = AlarmWidget.c;
                bitmap2 = this.b.b;
                akVar.a = vTextureManager2.createTexture(bitmap2, true);
                ak akVar2 = this.b;
                textureElement2 = this.b.a;
                float f = textureElement2.width;
                textureElement3 = this.b.a;
                akVar2.a(f, textureElement3.height);
                VTextureList textures = this.b.textures();
                textureElement4 = this.b.a;
                textures.addElement(textureElement4);
                bitmap3 = this.b.b;
                bitmap3.recycle();
            } else {
                u.c("=========ERROR BITMAP IS RECYCLE=====");
            }
            new al(this.b, this.c);
        }
    }

    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
    public void onUpdate(float f) {
        if (f > 0.5d && !this.a) {
            VObject3dContainer parent = this.c.parent();
            if (parent != null) {
                parent.removeChild(this.c);
                parent.addChildAt(this.c, 0);
            }
            this.a = true;
        }
        float sin = (float) Math.sin(f * 3.141592653589793d * 1.5d);
        this.b.position().spZ(((float) Math.cos(f * 3.141592653589793d)) * 80.0f);
        this.b.position().spY((sin * 160.0f) + 175.0f);
    }
}
