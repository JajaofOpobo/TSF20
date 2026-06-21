package com.tsf.shell.widget.alarm.c;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.ah;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends VButton {
    public static com.tsf.shell.widget.alarm.b.a a;
    private static ArrayList e = new ArrayList();
    private Runnable b;
    private com.tsf.shell.widget.alarm.b.f c;
    private com.tsf.shell.widget.alarm.b.f d;

    public c() {
        super(2, 1, com.tsf.shell.widget.alarm.b.a.a, com.tsf.shell.widget.alarm.b.a.b);
        e.add(this);
        b();
        textures().addElement(a.g());
        getItem(0).setMouseEventListener(new d(this, this));
        calAABB();
    }

    public static void a() {
        VObject3d[] vObject3dArr = new VObject3d[e.size()];
        e.toArray(vObject3dArr);
        ah.a(vObject3dArr, a.g().id, a.b(), 150, 100, 600);
    }

    public void b() {
        if (a == null) {
            a = new com.tsf.shell.widget.alarm.b.a(AlarmWidget.h, AlarmWidget.c);
        }
    }

    public void a(com.tsf.shell.widget.alarm.b.f fVar, com.tsf.shell.widget.alarm.b.f fVar2) {
        this.c = fVar;
        this.d = fVar2;
        d();
    }

    public void a(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        VButtonItem item = getItem(0);
        item.setTextureAllAndMathSizeSP(a.d.a, a.d.b, a.d.c, a.d.d);
        item.updateAll();
        VButtonItem item2 = getItem(1);
        item2.setTextureAllAndMathSizeSP(this.d.a, this.d.b, this.d.c, this.d.d);
        item2.updateAll();
        updateUvsVBO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        VButtonItem item = getItem(0);
        item.setTextureAllAndMathSizeSP(a.c.a, a.c.b, a.c.c, a.c.d);
        item.updateAll();
        VButtonItem item2 = getItem(1);
        item2.setTextureAllAndMathSizeSP(this.c.a, this.c.b, this.c.c, this.c.d);
        item2.updateAll();
        updateUvsVBO();
    }
}
