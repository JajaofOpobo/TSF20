package com.tsf.shell.widget.alarm.p204c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.C4322o;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
import com.tsf.shell.widget.alarm.p203b.C4259a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.widget.alarm.c.b */
/* loaded from: classes.dex */
public class C4269b extends VButton {

    /* renamed from: a */
    public static C4259a f13848a;

    /* renamed from: e */
    private static ArrayList<C4269b> f13849e = new ArrayList<>();

    /* renamed from: b */
    private Runnable f13850b;

    /* renamed from: c */
    private AbstractC4263e.C4264a f13851c;

    /* renamed from: d */
    private AbstractC4263e.C4264a f13852d;

    public C4269b() {
        super(2, 1, C4259a.f13804a, C4259a.f13805b);
        f13849e.add(this);
        m347b();
        textures().addElement(f13848a.m365g());
        getItem(0).setMouseEventListener(new C4270a(this));
        calAABB();
    }

    /* renamed from: a */
    public static void m351a() {
        VObject3d[] vObject3dArr = new VObject3d[f13849e.size()];
        f13849e.toArray(vObject3dArr);
        C4322o.m233a(vObject3dArr, f13848a.m365g().f2529id, f13848a.m373b(), 150, 100, 600);
    }

    /* renamed from: b */
    public void m347b() {
        if (f13848a == null) {
            f13848a = new C4259a(AlarmWidget.f13714h, AlarmWidget.f13709c);
        }
    }

    /* renamed from: a */
    public void m350a(AbstractC4263e.C4264a c4264a, AbstractC4263e.C4264a c4264a2) {
        this.f13851c = c4264a;
        this.f13852d = c4264a2;
        m343d();
    }

    /* renamed from: a */
    public void m348a(Runnable runnable) {
        this.f13850b = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m345c() {
        VButtonItem item = getItem(0);
        item.setTextureAllAndMathSizeSP(f13848a.f13807d.f13829a, f13848a.f13807d.f13830b, f13848a.f13807d.f13831c, f13848a.f13807d.f13832d);
        item.updateAll();
        VButtonItem item2 = getItem(1);
        item2.setTextureAllAndMathSizeSP(this.f13852d.f13829a, this.f13852d.f13830b, this.f13852d.f13831c, this.f13852d.f13832d);
        item2.updateAll();
        updateUvsVBO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m343d() {
        VButtonItem item = getItem(0);
        item.setTextureAllAndMathSizeSP(f13848a.f13806c.f13829a, f13848a.f13806c.f13830b, f13848a.f13806c.f13831c, f13848a.f13806c.f13832d);
        item.updateAll();
        VButtonItem item2 = getItem(1);
        item2.setTextureAllAndMathSizeSP(this.f13851c.f13829a, this.f13851c.f13830b, this.f13851c.f13831c, this.f13851c.f13832d);
        item2.updateAll();
        updateUvsVBO();
    }

    /* renamed from: com.tsf.shell.widget.alarm.c.b$a */
    /* loaded from: classes.dex */
    class C4270a extends VMouseEventListener {
        public C4270a(VObject3d vObject3d) {
            super(vObject3d);
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            C4269b.this.m345c();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            C4269b.this.m343d();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            if (C4269b.this.f13850b != null) {
                C4269b.this.f13850b.run();
            }
        }
    }
}
