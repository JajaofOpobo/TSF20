package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends VRectangle {
    public static TextureElement a;
    public static TextureElement b;
    public Uv[] c;
    private int d;
    private a e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    public interface a {
        void a();
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public j() {
        super(33.333332f, 34.166664f);
        this.c = new Uv[4];
        this.f = 40.0f;
        this.g = 41.0f;
        this.h = 40.0f;
        this.i = 496.0f;
        if (a == null) {
            Bitmap bitmapA = p.a(AlarmWidget.h, "back_number");
            a = AlarmWidget.c.createTexture(bitmapA, true);
            bitmapA.recycle();
        }
        if (b == null) {
            Bitmap bitmapA2 = p.a(AlarmWidget.h, "back_number_minute");
            b = AlarmWidget.c.createTexture(bitmapA2, true);
            bitmapA2.recycle();
        }
        a(0);
    }

    public static void a() {
        AlarmWidget.e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.j.1
            @Override // java.lang.Runnable
            public void run() {
                if (j.a != null) {
                    Bitmap bitmapA = p.a(AlarmWidget.h, "back_number");
                    p.a(j.a.id, bitmapA, 0, 0);
                    bitmapA.recycle();
                }
                if (j.b != null) {
                    Bitmap bitmapA2 = p.a(AlarmWidget.h, "back_number_minute");
                    p.a(j.b.id, bitmapA2, 0, 0);
                    bitmapA2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    public void a(int i) {
        int i2 = i % 12;
        if (i2 < 0) {
            i2 += 12;
        }
        int i3 = 11 - i2;
        if (this.d != i3) {
            a(0.0f, i3 * 41);
            if (((this.d == 10 && i3 == 11) || (this.d == 11 && i3 == 10)) && this.e != null) {
                this.e.a();
            }
            this.d = i3;
            i.c("SetNumber:" + i3);
        }
    }

    public int b() {
        return this.d;
    }

    public void a(float f, float f2) {
        Uv[] uvArr = this.c;
        Uv uv = new Uv();
        uvArr[0] = uv;
        uv.u = (f + 40.0f) / 40.0f;
        uv.v = (f2 + 41.0f) / 496.0f;
        Uv[] uvArr2 = this.c;
        Uv uv2 = new Uv();
        uvArr2[1] = uv2;
        uv2.u = f / 40.0f;
        uv2.v = (f2 + 41.0f) / 496.0f;
        Uv[] uvArr3 = this.c;
        Uv uv3 = new Uv();
        uvArr3[2] = uv3;
        uv3.u = (f + 40.0f) / 40.0f;
        uv3.v = f2 / 496.0f;
        Uv[] uvArr4 = this.c;
        Uv uv4 = new Uv();
        uvArr4[3] = uv4;
        uv4.u = f / 40.0f;
        uv4.v = f2 / 496.0f;
        for (int i = 0; i < 4; i++) {
            uv().set(i, this.c[i]);
        }
        updateUvsVBO();
    }
}
