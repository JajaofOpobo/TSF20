package com.tsf.shell.widget.alarm;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.alarm.setting.SettingActivity;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class q extends VRectangle {
    private TextureElement a;
    private Bitmap b;
    private final float c;
    private final float d;
    private Object e;

    public q() {
        super(240.0f, 200.0f);
        this.c = 175.0f;
        this.d = 80.0f;
        this.e = new Object();
        AlarmWidget.a(this);
        a();
        textures().addElement(this.a);
        position().spY(175.0f);
        position().spZ(80.0f);
        setMouseEventListener(new VMouseEventListener(this) { // from class: com.tsf.shell.widget.alarm.q.1
            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onSingleTapUp(MotionEvent motionEvent) {
                Intent intent = new Intent();
                intent.setClass(AlarmWidget.h, SettingActivity.class);
                intent.setFlags(268435456);
                AlarmWidget.h.startActivity(intent);
            }
        });
        calAABB();
    }

    private void a() {
        byte[] bArrA = com.tsf.shell.widget.alarm.d.d.a(AlarmWidget.h, -1);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrA, 0, bArrA.length);
        this.a = AlarmWidget.c.createTexture(bitmapDecodeByteArray, false);
        bitmapDecodeByteArray.recycle();
    }

    public void a(Bitmap bitmap) {
        synchronized (this.e) {
            if (this.b != null) {
                this.b.recycle();
            }
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            bitmap.recycle();
            this.b = bitmapCopy;
            new b(this);
        }
    }

    class b extends VTweenParam {
        boolean a = false;
        private VObject3d c;

        public b(VObject3d vObject3d) {
            this.c = vObject3d;
            VTween.killTween(q.this);
            VTween.to(q.this, 1000, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            synchronized (q.this.e) {
                if (!q.this.b.isRecycled()) {
                    q.this.textures().removeAll();
                    AlarmWidget.c.deleteTexture(q.this.a);
                    q.this.a = AlarmWidget.c.createTexture(q.this.b, true);
                    q.this.a(q.this.a.width, q.this.a.height);
                    q.this.textures().addElement(q.this.a);
                    q.this.b.recycle();
                } else {
                    i.c("=========ERROR BITMAP IS RECYCLE=====");
                }
                q.this.new a(this.c);
            }
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onUpdate(float f) {
            if (f > 0.5d && !this.a) {
                VObject3dContainer vObject3dContainerParent = this.c.parent();
                if (vObject3dContainerParent != null) {
                    vObject3dContainerParent.removeChild(this.c);
                    vObject3dContainerParent.addChildAt(this.c, 0);
                }
                this.a = true;
            }
            float fSin = (float) Math.sin(((double) f) * 3.141592653589793d * 1.5d);
            q.this.position().spZ(((float) Math.cos(((double) f) * 3.141592653589793d)) * 80.0f);
            q.this.position().spY((fSin * 160.0f) + 175.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2) {
        i.c("width:" + f + "    height:" + f2);
        float f3 = AlarmWidget.g / 1.2f;
        float f4 = (f / 2.0f) * f3;
        float f5 = f3 * (f2 / 2.0f);
        point().setPX(0, f4, -f5, 0.0f);
        point().setPX(1, -f4, -f5, 0.0f);
        point().setPX(2, f4, f5, 0.0f);
        point().setPX(3, -f4, f5, 0.0f);
        updatePointsVBO();
    }

    class a extends VTweenParam {
        boolean a = false;
        private VObject3d c;

        public a(VObject3d vObject3d) {
            this.c = vObject3d;
            setEase(300);
            VTween.killTween(q.this);
            VTween.to(q.this, 2000, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onUpdate(float f) {
            if (f > 0.5d && !this.a) {
                this.c.setZOrderOnTop();
                this.a = true;
            }
            float f2 = 1.0f - f;
            float fSin = (float) Math.sin(((double) f2) * 3.141592653589793d);
            q.this.position().spZ(((float) Math.cos(((double) f2) * 3.141592653589793d)) * 80.0f);
            q.this.position().spY((fSin * 80.0f) + 175.0f);
        }
    }
}
