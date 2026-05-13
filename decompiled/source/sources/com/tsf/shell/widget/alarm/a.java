package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.c.c;
import com.tsf.shell.widget.alarm.service.c;
/* loaded from: classes.dex */
public class a extends VObject3dContainer implements c.b {
    public static boolean a;
    private j A;
    private j B;
    private com.tsf.shell.widget.alarm.c.b C;
    private VRectangle D;
    private com.tsf.shell.widget.alarm.b E;
    private Cursor h;
    private int i;
    private int j;
    private String k;
    private Alarm.b l;
    private boolean m;
    private String n;
    private TextureElement o;
    private TextureElement p;
    private TextureElement q;
    private e t;
    private e u;
    private com.tsf.shell.widget.alarm.c.e v;
    private com.tsf.shell.widget.alarm.c.c w;
    private com.tsf.shell.widget.alarm.c.a x;
    private c y;
    private VRectangle z;
    private VWidgetContainer b = AlarmWidget.b;
    private VTextureManager c = AlarmWidget.c;
    private VObjectManager d = AlarmWidget.d;
    private VMessageQueueManager e = AlarmWidget.e;
    private Context f = AlarmWidget.h;
    private com.tsf.shell.widget.alarm.service.c g = AlarmWidget.k;
    private float r = 1.2f;
    private float s = VInformation.Scale();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a(boolean z);
    }

    public a() {
        h();
        i();
        a();
        d();
    }

    public void a(c cVar) {
        this.y = cVar;
        this.y.a(a);
    }

    private void g() {
        i.c("============SetData=================" + this.i + ":" + this.j);
        this.t.a(this.i);
        this.u.a(this.j);
        this.v.a(this.l.b());
        this.w.a(a);
        this.x.a(this.i < 12 && this.i > 0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        this.t.d();
        this.u.d();
    }

    private void h() {
        Bitmap a2 = p.a(this.f, "back_big_circle");
        this.o = this.c.createTexture(a2, false);
        a2.recycle();
        Bitmap a3 = p.a(this.f, "back_small_circle");
        this.p = this.c.createTexture(a3, false);
        a3.recycle();
        Bitmap a4 = p.a(this.f, "back_time_bar_bg");
        this.q = this.c.createTexture(a4, false);
        a4.recycle();
    }

    private void i() {
        this.E = new com.tsf.shell.widget.alarm.b();
        this.d.addObject(this.E);
        this.E.doubleSidedEnabled(d.a.a);
        this.E.textures().addElement(this.o);
        this.E.calAABB();
        this.E.setMouseEventListener(new C0173a(this.E));
        addChild(this.E);
        this.z = new VRectangle(380.0f / this.r, 380.0f / this.r, 1, 1);
        this.z.position().spZ(40.0f);
        this.d.addObject(this.z);
        this.z.textures().addElement(this.p);
        addChild(this.z);
        this.D = new VRectangle(261.0f / this.r, 53.0f / this.r, 1, 1);
        this.d.addObject(this.D);
        this.D.position().spZ(80.0f);
        this.D.position().spX(161.875f / this.r);
        this.D.textures().addElement(this.q);
        addChild(this.D);
        this.B = new j();
        this.B.textures().addElement(j.a);
        this.B.position().spZ(80.0f);
        this.B.position().spX(100.0f);
        this.B.position().spY(-2.0f);
        addChild(this.B);
        this.A = new j();
        this.A.textures().addElement(j.b);
        this.A.position().spZ(80.0f);
        this.A.position().spX(156.0f);
        this.A.position().spY(-2.0f);
        addChild(this.A);
        this.C = new com.tsf.shell.widget.alarm.c.b();
        this.C.position().spX(-180.0f);
        this.C.position().spY(-150.0f);
        this.C.position().spZ(0.0f);
        this.C.a(com.tsf.shell.widget.alarm.c.b.a.f, com.tsf.shell.widget.alarm.c.b.a.e);
        addChild(this.C);
        this.v = new com.tsf.shell.widget.alarm.c.e(this);
        this.t = new e(this.z, this.B, 3, 1, 1);
        this.u = new e(this.E, this.A, -1, 5, 0);
        this.x = new com.tsf.shell.widget.alarm.c.a();
        this.B.a(this.x);
        addChild(this.x);
        this.w = new com.tsf.shell.widget.alarm.c.c();
        this.w.a(this);
        addChild(this.w);
        this.C.a(new Runnable() { // from class: com.tsf.shell.widget.alarm.a.1
            @Override // java.lang.Runnable
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tsf.shell.widget.alarm.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.tsf.shell.a.a.e.a(a.this.f)) {
                            new b().start();
                            AlarmWidget.b();
                        }
                    }
                });
            }
        });
    }

    public void a() {
        this.h = com.tsf.shell.widget.alarm.AlarmUtils.c.b(this.f);
        if (this.h == null) {
            com.tsf.shell.widget.alarm.AlarmUtils.c.a(this.f);
            this.h.close();
            this.h = com.tsf.shell.widget.alarm.AlarmUtils.c.b(this.f);
        }
        i.b("mCursor Count():" + this.h.getCount());
        if (this.h.getCount() > 0) {
            Alarm a2 = com.tsf.shell.widget.alarm.AlarmUtils.c.a(this.f, 1);
            a = a2.b;
            this.k = a2.h;
            this.i = a2.c;
            this.j = a2.d;
            this.l = a2.e;
            this.m = a2.g;
            this.n = a2.i == null ? "silent" : a2.i.toString();
            i.b("Info:" + a + ":" + this.k + ":" + this.i + ":" + this.j);
        }
        this.h.close();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        a = z;
        if (this.y != null) {
            this.y.a(a);
        }
        new b().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a.this.g.a(new c.a() { // from class: com.tsf.shell.widget.alarm.a.b.1
                @Override // com.tsf.shell.widget.alarm.service.c.a
                public void a(com.tsf.shell.widget.alarm.service.b bVar) {
                    int i;
                    int c = a.this.t.c();
                    boolean b = a.this.x.b();
                    if (c == 12) {
                        i = b ? 0 : 12;
                    } else {
                        i = b ? c : c + 12;
                    }
                    int c2 = a.this.u.c();
                    i.c("Compass getCurrent " + i + ":" + c2);
                    for (int i2 = 0; i2 < 7; i2++) {
                        a.this.l.a(i2, a.this.v.a(i2));
                    }
                    bVar.a(1, a.a, i, c2, a.this.l.a(), a.this.m, null, a.this.n);
                }
            });
        }
    }

    @Override // com.tsf.shell.widget.alarm.c.c.b
    public void a(final boolean z) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tsf.shell.widget.alarm.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.a.a.e.a(a.this.f)) {
                    a.this.b(z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0173a extends VMouseEventListener {
        Number3d a;
        e b;
        int c;
        private double e;

        public C0173a(VObject3d vObject3d) {
            super(vObject3d);
            this.a = new Number3d(0.0f, 0.0f, 0.0f);
            this.c = 1;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            if (com.tsf.shell.widget.alarm.b.f) {
                this.b = a.this.t;
            } else {
                this.b = a.this.u;
            }
            this.b.a();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onMove(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (this.b != null) {
                Number3d a = a(motionEvent);
                double atan2 = Math.atan2(a.y, a.x);
                Number3d a2 = a(motionEvent2);
                double atan22 = Math.atan2(a2.y, a2.x);
                this.c = atan22 > this.e ? 1 : -1;
                if (Math.abs(atan22 - this.e) > 3.141592653589793d) {
                    this.c *= -1;
                    i.c("EX DRAG Way");
                }
                this.e = atan22;
                float f = (float) (((atan22 - atan2) * 180.0d) / 3.141592653589793d);
                if (f < 0.0f) {
                    f += 360.0f;
                }
                this.b.a(f);
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            if (this.b != null) {
                this.b.b();
                this.b = null;
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            i.c("BackPage onFling");
            if (this.b != null) {
                this.b.a(this.c, (float) ((Math.sqrt((f * f) + (f2 * f2)) / 10000.0d) * 240.0d));
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            if (this.b != null) {
                Number3d a = a(motionEvent);
                this.b.b((float) ((Math.atan2(a.y, a.x) * 180.0d) / 3.141592653589793d));
            }
        }

        private Number3d a(MotionEvent motionEvent) {
            this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.a.y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.a.z = 0.0f;
            return AlarmWidget.l.globalToLocal(this.a);
        }
    }

    public void b() {
        this.v.a(true);
        this.w.visible(true);
        this.x.visible(true);
        this.z.visible(true);
        this.A.visible(true);
        this.B.visible(true);
        this.C.visible(true);
        this.D.visible(true);
    }

    public void c() {
        this.v.a();
    }

    public void d() {
        this.v.a(false);
        this.w.visible(false);
        this.x.visible(false);
        this.z.visible(false);
        this.A.visible(false);
        this.B.visible(false);
        this.C.visible(false);
        this.D.visible(false);
    }

    public void e() {
        this.v.b();
    }

    public void f() {
        com.tsf.shell.widget.alarm.c.d.a();
        this.w.a();
        j.a();
        o.a(new VObject3d[]{this.E}, this.o.id, p.a(this.f, "back_big_circle"), 250, 250, 50);
        o.a(new VObject3d[]{this.z}, this.p.id, p.a(this.f, "back_small_circle"), 250, 250, 50);
        o.a(new VObject3d[]{this.D}, this.q.id, p.a(this.f, "back_time_bar_bg"), 250, 250, 50);
        this.E.doubleSidedEnabled(d.a.a);
    }
}
