package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
/* renamed from: com.tsf.shell.widget.alarm.o */
/* loaded from: classes.dex */
public class C4322o {

    /* renamed from: a */
    private static int f14014a = 150;

    /* renamed from: a */
    public static void m233a(VObject3d[] vObject3dArr, int i, Bitmap bitmap, int i2, int i3, int i4) {
        int length = vObject3dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            new C4323a(vObject3dArr[i5], i5, length, bitmap, i, i2, i3, i4);
        }
    }

    /* renamed from: com.tsf.shell.widget.alarm.o$a */
    /* loaded from: classes.dex */
    static class C4323a extends VTweenParam {

        /* renamed from: a */
        float f14015a;

        /* renamed from: b */
        float f14016b;

        /* renamed from: c */
        float f14017c;

        /* renamed from: d */
        int f14018d;

        /* renamed from: e */
        int f14019e;

        /* renamed from: f */
        int f14020f;

        /* renamed from: g */
        int f14021g;

        /* renamed from: h */
        Bitmap f14022h;

        /* renamed from: i */
        VObject3d f14023i;

        /* renamed from: j */
        int f14024j;

        public C4323a(VObject3d vObject3d, int i, int i2, Bitmap bitmap, int i3, int i4, int i5, int i6) {
            this.f14023i = vObject3d;
            this.f14024j = i3;
            this.f14018d = i;
            this.f14019e = i2;
            this.f14020f = i6;
            this.f14022h = bitmap;
            this.f14021g = i5;
            this.f14015a = vObject3d.scale().f2526x;
            this.f14016b = vObject3d.scale().f2527y;
            this.f14017c = vObject3d.scale().f2528z;
            setScaleX(0.0f);
            setScaleY(0.0f);
            setScaleZ(0.0f);
            setTimeout(i4);
            VTween.killTween(vObject3d);
            VTween.m10747to(vObject3d, i5, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            C4305i.m259c("onComplete id : " + this.f14018d + "   max:" + this.f14019e);
            if (this.f14018d == this.f14019e - 1 && this.f14022h != null) {
                C4324p.m232a(this.f14024j, this.f14022h, 0, 0);
                this.f14022h.recycle();
            }
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setEase(VEasing.Back.easeOut);
            vTweenParam.setScaleX(1.0f);
            vTweenParam.setScaleY(1.0f);
            vTweenParam.setScaleZ(1.0f);
            vTweenParam.setTimeout((this.f14018d * C4322o.f14014a) + this.f14020f);
            VTween.m10747to(this.f14023i, 500, vTweenParam);
        }
    }
}
