package com.tsf.shell.widget.alarm.p204c;

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
import com.tsf.shell.p086a.p087a.C2205e;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.C4324p;
/* renamed from: com.tsf.shell.widget.alarm.c.c */
/* loaded from: classes.dex */
public class C4271c extends VRectangle {

    /* renamed from: a */
    private VObjectManager f13854a;

    /* renamed from: b */
    private boolean f13855b;

    /* renamed from: c */
    private InterfaceC4275b f13856c;

    /* renamed from: d */
    private TextureElement f13857d;

    /* renamed from: e */
    private TextureElement f13858e;

    /* renamed from: com.tsf.shell.widget.alarm.c.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC4275b {
        /* renamed from: a */
        void mo332a(boolean z);
    }

    public C4271c() {
        super(129.16666f, 129.16666f, 1, 1);
        this.f13854a = AlarmWidget.f13710d;
        this.f13855b = false;
        m338b();
        m336c();
    }

    /* renamed from: b */
    private void m338b() {
        Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "alarm_toggle_on");
        this.f13857d = AlarmWidget.f13709c.createTexture(m230a, true);
        m230a.recycle();
        Bitmap m230a2 = C4324p.m230a(AlarmWidget.f13714h, "alarm_toggle_off");
        this.f13858e = AlarmWidget.f13709c.createTexture(m230a2, true);
        m230a2.recycle();
    }

    /* renamed from: a */
    public void m342a() {
        AlarmWidget.f13711e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (C4271c.this.f13857d != null) {
                    Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "alarm_toggle_on");
                    C4324p.m232a(C4271c.this.f13857d.f2529id, m230a, 0, 0);
                    m230a.recycle();
                }
                if (C4271c.this.f13858e != null) {
                    Bitmap m230a2 = C4324p.m230a(AlarmWidget.f13714h, "alarm_toggle_off");
                    C4324p.m232a(C4271c.this.f13858e.f2529id, m230a2, 0, 0);
                    m230a2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    /* renamed from: c */
    private void m336c() {
        position().spZ(80.0f);
        this.f13854a.addObject(this);
        m333e();
        setMouseEventListener(new C4273a(this));
        calAABB();
    }

    /* renamed from: a */
    public void m341a(InterfaceC4275b interfaceC4275b) {
        this.f13856c = interfaceC4275b;
    }

    /* renamed from: a */
    public void m339a(boolean z) {
        this.f13855b = z;
        m333e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m334d() {
        this.f13855b = !this.f13855b;
        m333e();
        if (this.f13856c != null) {
            this.f13856c.mo332a(this.f13855b);
        }
    }

    /* renamed from: e */
    private void m333e() {
        if (this.f13855b) {
            textures().removeAll();
            textures().addElement(this.f13857d);
        } else {
            textures().removeAll();
            textures().addElement(this.f13858e);
        }
        updateUvsVBO();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.c.c$a */
    /* loaded from: classes.dex */
    public class C4273a extends VMouseEventListener {
        public C4273a(VObject3d vObject3d) {
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
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C2205e.m6087a(AlarmWidget.f13714h)) {
                        C4271c.this.m334d();
                    }
                }
            });
        }
    }
}
