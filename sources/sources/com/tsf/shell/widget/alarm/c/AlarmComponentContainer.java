package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.AlarmContainerlarmWidget;
import com.tsf.shell.widget.alarm.AlarmState;
import com.tsf.shell.widget.alarm.AlarmButton;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmComponentContainer extends VRectangle implements j.a {
    public boolean a;

    public AlarmComponentContainer() {
        super(56.0f, 24.0f);
        this.a = true;
        setMouseEventListener(new C0174a(this));
        position().spZ(80.0f);
        position().spX(217.0f);
        textures().addElement(AlarmWidget.a.g());
        setAABBSP(-250.0f, -30.0f, 0.0f, 250.0f, 30.0f, 0.0f);
        AlarmComponentContainer();
    }

    private void d() {
        if (this.a) {
            AlarmWidget.a.c[0].a(this);
        } else {
            AlarmWidget.a.c[1].a(this);
        }
        updateUvsVBO();
    }

    public void a(boolean z) {
        this.a = z;
        AlarmComponentContainer();
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        this.a = !this.a;
        AlarmComponentContainer();
    }

    /* JADX INFO: renamed from: com.tsf.shell.widget.alarm.c.AlarmComponentContainer$a, reason: collision with other inner class name */
    class C0174a extends VMouseEventListener {
        public AlarmComponentContainer(VObject3d vObject3d) {
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
            i.c("APMToggle  onSingleTapUp");
            a.this.c();
        }
    }

    @Override // com.tsf.shell.widget.alarm.AlarmButton.a
    public void a() {
        C0174a();
    }
}
