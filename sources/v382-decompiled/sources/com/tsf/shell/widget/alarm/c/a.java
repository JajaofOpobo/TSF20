package com.tsf.shell.widget.alarm.c;

import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.w;

/* loaded from: classes.dex */
public class a extends VRectangle implements w {
    public boolean a;

    public a() {
        super(56.0f, 24.0f);
        this.a = true;
        setMouseEventListener(new b(this, this));
        position().spZ(80.0f);
        position().spX(217.0f);
        textures().addElement(AlarmWidget.a.g());
        setAABBSP(-250.0f, -30.0f, 0.0f, 250.0f, 30.0f, 0.0f);
        d();
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
        d();
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        this.a = !this.a;
        d();
    }

    @Override // com.tsf.shell.widget.alarm.w
    public void a() {
        c();
    }
}
