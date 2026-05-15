package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class o {
    private static int a = 150;

    public static void a(VObject3d[] vObject3dArr, int i, Bitmap bitmap, int i2, int i3, int i4) {
        int length = vObject3dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            new a(vObject3dArr[i5], i5, length, bitmap, i, i2, i3, i4);
        }
    }

    static class a extends VTweenParam {
        float a;
        float b;
        float c;
        int d;
        int e;
        int f;
        int g;
        Bitmap h;
        VObject3d i;
        int j;

        public a(VObject3d vObject3d, int i, int i2, Bitmap bitmap, int i3, int i4, int i5, int i6) {
            this.i = vObject3d;
            this.j = i3;
            this.d = i;
            this.e = i2;
            this.f = i6;
            this.h = bitmap;
            this.g = i5;
            this.a = vObject3d.scale().x;
            this.b = vObject3d.scale().y;
            this.c = vObject3d.scale().z;
            setScaleX(0.0f);
            setScaleY(0.0f);
            setScaleZ(0.0f);
            setTimeout(i4);
            VTween.killTween(vObject3d);
            VTween.to(vObject3d, i5, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            i.c("onComplete id : " + this.d + "   max:" + this.e);
            if (this.d == this.e - 1 && this.h != null) {
                p.a(this.j, this.h, 0, 0);
                this.h.recycle();
            }
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setEase(VEasing.Back.easeOut);
            vTweenParam.setScaleX(1.0f);
            vTweenParam.setScaleY(1.0f);
            vTweenParam.setScaleZ(1.0f);
            vTweenParam.setTimeout((this.d * o.a) + this.f);
            VTween.to(this.i, 500, vTweenParam);
        }
    }
}
