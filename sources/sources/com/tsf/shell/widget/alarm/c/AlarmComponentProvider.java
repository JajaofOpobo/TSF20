package com.tsf.shell.widget.alarm.c;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.AlarmContainerlarmWidget;
import com.tsf.shell.widget.alarm.AlarmTouchManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmComponentProvider extends VRectangle {
    private VObjectManager a;
    private boolean b;
    private b c;
    private TextureElement d;
    private TextureElement e;

    public interface b {
        void a(boolean z);
    }

    public AlarmComponentProvider() {
        super(129.16666f, 129.16666f, 1, 1);
        this.a = AlarmWidget.d;
        this.b = false;
        b();
        b();
    }

    private void b() {
        Bitmap bitmapA = p.a(AlarmWidget.h, "alarm_toggle_on");
        this.d = AlarmWidget.c.createTexture(bitmapA, true);
        bitmapA.recycle();
        Bitmap bitmapA2 = p.a(AlarmWidget.h, "alarm_toggle_off");
        this.e = AlarmWidget.c.createTexture(bitmapA2, true);
        bitmapA2.recycle();
    }

    public void a() {
        AlarmWidget.e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.AlarmComponentProvider.1
            @Override // java.lang.Runnable
            public void run() {
                if (AlarmComponentProvider.this.d != null) {
                    Bitmap bitmapA = p.a(AlarmWidget.h, "alarm_toggle_on");
                    p.a(AlarmComponentProvider.this.d.id, bitmapA, 0, 0);
                    bitmapA.recycle();
                }
                if (AlarmComponentProvider.this.e != null) {
                    Bitmap bitmapA2 = p.a(AlarmWidget.h, "alarm_toggle_off");
                    p.a(AlarmComponentProvider.this.e.id, bitmapA2, 0, 0);
                    bitmapA2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    private void c() {
        position().spZ(80.0f);
        this.a.addObject(this);
        b();
        setMouseEventListener(new AlarmComponentContainer(this));
        calAABB();
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(boolean z) {
        this.b = z;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.b = !this.b;
        b();
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

    class a extends VMouseEventListener {
        public a(VObject3d vObject3d) {
            super(vObject3d);
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.AlarmComponentProvider.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.tsf.shell.ShellCallbackDispatcher.a.e.a(AlarmWidget.h)) {
                        AlarmComponentProvider.this.d();
                    }
                }
            });
        }
    }
}
