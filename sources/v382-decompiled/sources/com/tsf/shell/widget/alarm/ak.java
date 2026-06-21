package com.tsf.shell.widget.alarm;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.setting.SettingActivity;

/* loaded from: classes.dex */
public class ak extends VRectangle {
    private TextureElement a;
    private Bitmap b;
    private final float c;
    private final float d;
    private Object e;

    public ak() {
        super(240.0f, 200.0f);
        this.c = 175.0f;
        this.d = 80.0f;
        this.e = new Object();
        AlarmWidget.a(this);
        a();
        textures().addElement(this.a);
        position().spY(175.0f);
        position().spZ(80.0f);
        setMouseEventListener(new VMouseEventListener(this) { // from class: com.tsf.shell.widget.alarm.ak.1
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
        byte[] a = com.tsf.shell.widget.alarm.d.d.a(AlarmWidget.h, -1);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
        this.a = AlarmWidget.c.createTexture(decodeByteArray, false);
        decodeByteArray.recycle();
    }

    public void a(Bitmap bitmap) {
        synchronized (this.e) {
            if (this.b != null) {
                this.b.recycle();
            }
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            bitmap.recycle();
            this.b = copy;
            new am(this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2) {
        u.c("width:" + f + "    height:" + f2);
        float f3 = AlarmWidget.g / 1.2f;
        float f4 = (f / 2.0f) * f3;
        float f5 = f3 * (f2 / 2.0f);
        point().setPX(0, f4, -f5, 0.0f);
        point().setPX(1, -f4, -f5, 0.0f);
        point().setPX(2, f4, f5, 0.0f);
        point().setPX(3, -f4, f5, 0.0f);
        updatePointsVBO();
    }
}
