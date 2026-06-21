package com.tsf.shell.widget.alarm.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.aj;

/* loaded from: classes.dex */
public class e extends VRectangle {
    private VObjectManager a;
    private boolean b;
    private g c;
    private TextureElement d;
    private TextureElement e;

    public e() {
        super(129.16666f, 129.16666f, 1, 1);
        this.a = AlarmWidget.d;
        this.b = false;
        b();
        c();
    }

    private void b() {
        Bitmap a = aj.a(AlarmWidget.h, "alarm_toggle_on");
        this.d = AlarmWidget.c.createTexture(a, true);
        a.recycle();
        Bitmap a2 = aj.a(AlarmWidget.h, "alarm_toggle_off");
        this.e = AlarmWidget.c.createTexture(a2, true);
        a2.recycle();
    }

    public void a() {
        AlarmWidget.e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.d != null) {
                    Bitmap a = aj.a(AlarmWidget.h, "alarm_toggle_on");
                    aj.a(e.this.d.id, a, 0, 0);
                    a.recycle();
                }
                if (e.this.e != null) {
                    Bitmap a2 = aj.a(AlarmWidget.h, "alarm_toggle_off");
                    aj.a(e.this.e.id, a2, 0, 0);
                    a2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    private void c() {
        position().spZ(80.0f);
        this.a.addObject(this);
        e();
        setMouseEventListener(new f(this, this));
        calAABB();
    }

    public void a(g gVar) {
        this.c = gVar;
    }

    public void a(boolean z) {
        this.b = z;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.b = !this.b;
        e();
        if (this.c != null) {
            this.c.a(this.b);
        }
    }

    private void e() {
        if (this.b) {
            textures().removeAll();
            textures().addElement(this.d);
        } else {
            textures().removeAll();
            textures().addElement(this.e);
        }
        updateUvsVBO();
    }
}
