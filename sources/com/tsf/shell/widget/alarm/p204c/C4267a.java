package com.tsf.shell.widget.alarm.p204c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4306j;
/* renamed from: com.tsf.shell.widget.alarm.c.a */
/* loaded from: classes.dex */
public class C4267a extends VRectangle implements C4306j.InterfaceC4308a {

    /* renamed from: a */
    public boolean f13846a;

    public C4267a() {
        super(56.0f, 24.0f);
        this.f13846a = true;
        setMouseEventListener(new C4268a(this));
        position().spZ(80.0f);
        position().spX(217.0f);
        textures().addElement(AlarmWidget.f13707a.m365g());
        setAABBSP(-250.0f, -30.0f, 0.0f, 250.0f, 30.0f, 0.0f);
        m352d();
    }

    /* renamed from: d */
    private void m352d() {
        if (this.f13846a) {
            AlarmWidget.f13707a.f13821c[0].m361a(this);
        } else {
            AlarmWidget.f13707a.f13821c[1].m361a(this);
        }
        updateUvsVBO();
    }

    /* renamed from: a */
    public void m355a(boolean z) {
        this.f13846a = z;
        m352d();
    }

    /* renamed from: b */
    public boolean m354b() {
        return this.f13846a;
    }

    /* renamed from: c */
    public void m353c() {
        this.f13846a = !this.f13846a;
        m352d();
    }

    /* renamed from: com.tsf.shell.widget.alarm.c.a$a */
    /* loaded from: classes.dex */
    class C4268a extends VMouseEventListener {
        public C4268a(VObject3d vObject3d) {
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
            C4305i.m259c("APMToggle  onSingleTapUp");
            C4267a.this.m353c();
        }
    }

    @Override // com.tsf.shell.widget.alarm.C4306j.InterfaceC4308a
    /* renamed from: a */
    public void mo252a() {
        m353c();
    }
}
