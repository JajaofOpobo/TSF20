package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.tsf.shell.widget.alarm.AlarmContainerlarmWidget;
import com.tsf.shell.widget.alarm.b.AlarmDataEntry;
import com.tsf.shell.widget.alarm.AlarmThemeProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmComponentListener extends VButton {
    public static com.tsf.shell.widget.alarm.b.AlarmDataBase a;
    private static ArrayList<b> e = new ArrayList<>();
    private Runnable b;
    private AlarmComponentEvent.a c;
    private AlarmComponentEvent.a d;

    public AlarmComponentListener() {
        super(2, 1, com.tsf.shell.widget.alarm.b.AlarmDataBase.a, com.tsf.shell.widget.alarm.b.AlarmDataBase.b);
        AlarmComponentEvent.add(this);
        AlarmComponentListener();
        textures().addElement(AlarmComponentContainer.g());
        getItem(0).setMouseEventListener(new AlarmComponentContainer(this));
        calAABB();
    }

    public static void a() {
        VObject3d[] vObject3dArr = new VObject3d[AlarmComponentEvent.size()];
        AlarmComponentEvent.toArray(vObject3dArr);
        o.a(vObject3dArr, AlarmComponentContainer.g().id, AlarmComponentContainer.b(), 150, 100, 600);
    }

    public void b() {
        if (a == null) {
            a = new com.tsf.shell.widget.alarm.b.AlarmDataBase(AlarmWidget.h, AlarmWidget.c);
        }
    }

    public void a(AlarmComponentEvent.a aVar, AlarmComponentEvent.a aVar2) {
        this.c = aVar;
        this.d = aVar2;
        AlarmComponentListener();
    }

    public void a(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        VButtonItem item = getItem(0);
        item.setTextureAllAndMathSizeSP(AlarmComponentContainer.d.a, AlarmComponentContainer.d.b, AlarmComponentContainer.d.c, AlarmComponentContainer.d.d);
        item.updateAll();
        VButtonItem item2 = getItem(1);
        item2.setTextureAllAndMathSizeSP(this.d.a, this.d.b, this.d.c, this.d.d);
        item2.updateAll();
        updateUvsVBO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        VButtonItem item = getItem(0);
        item.setTextureAllAndMathSizeSP(AlarmComponentContainer.c.a, AlarmComponentContainer.c.b, AlarmComponentContainer.c.c, AlarmComponentContainer.c.d);
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
