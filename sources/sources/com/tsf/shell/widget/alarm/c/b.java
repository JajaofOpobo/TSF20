package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.b.e;
import com.tsf.shell.widget.alarm.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends VButton {
    public static com.tsf.shell.widget.alarm.b.a a;
    private static ArrayList<b> e = new ArrayList<>();
    private Runnable b;
    private e.a c;
    private e.a d;

    public b() {
        super(2, 1, com.tsf.shell.widget.alarm.b.a.a, com.tsf.shell.widget.alarm.b.a.b);
        e.add(this);
        b();
        textures().addElement(a.g());
        getItem(0).setMouseEventListener(new a(this));
        calAABB();
    }

    public static void a() {
        VObject3d[] vObject3dArr = new VObject3d[e.size()];
        e.toArray(vObject3dArr);
        o.a(vObject3dArr, a.g().id, a.b(), 150, 100, 600);
    }

    public void b() {
        if (a == null) {
            a = new com.tsf.shell.widget.alarm.b.a(AlarmWidget.h, AlarmWidget.c);
        }
    }

    public void a(e.a aVar, e.a aVar2) {
        this.c = aVar;
        this.d = aVar2;
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

    class a extends VMouseEventListener {
        public a(VObject3d vObject3d) {
            super(vObject3d);
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            b.this.c();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            b.this.d();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            if (b.this.b != null) {
                b.this.b.run();
            }
        }
    }
}
