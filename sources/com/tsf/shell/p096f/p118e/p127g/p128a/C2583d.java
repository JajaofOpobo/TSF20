package com.tsf.shell.p096f.p118e.p127g.p128a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.e.g.a.d */
/* loaded from: classes.dex */
public class C2583d extends AbstractC2580c {
    private C2585a mTitleContainer = new C2585a() { // from class: com.tsf.shell.f.e.g.a.d.1
        @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d.C2585a
        /* renamed from: a */
        public void mo5234a() {
            C2583d.this.onRequestExit();
        }
    };

    public void onRequestExit() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void recycle() {
        this.mTitleContainer.m5226d();
        super.recycle();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.mTitleContainer.position().f2526x = C0892a.f2590z;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mTitleContainer.position().f2526x = C0892a.f2590z;
    }

    public void setTitle(int i) {
        this.mTitleContainer.m5233a(i);
    }

    public void setTitle(String str) {
        this.mTitleContainer.m5230a(str);
    }

    public void addIcon(C0975i c0975i) {
        this.mTitleContainer.m5232a(c0975i);
    }

    public void removeIcon() {
        this.mTitleContainer.m5229b();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getMenuContainer() {
        return this.mTitleContainer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.g.a.d$a */
    /* loaded from: classes.dex */
    public class C2585a extends C0980j {

        /* renamed from: a */
        private TextureElement f8529a = new TextureElement(0, false);

        /* renamed from: c */
        private C0981k f8531c;

        /* renamed from: d */
        private C0975i f8532d;

        /* renamed from: e */
        private C0984m f8533e;

        public C2585a() {
            m5227c();
        }

        /* renamed from: a */
        public void mo5234a() {
        }

        /* renamed from: a */
        public void m5233a(int i) {
            m5230a(C4189x.m588c(i));
        }

        /* renamed from: a */
        public void m5230a(String str) {
            this.f8533e.m10355a(str);
            this.f8533e.m10353b();
            m5225e();
        }

        /* renamed from: a */
        public void m5232a(C0975i c0975i) {
            m5229b();
            this.f8532d = c0975i;
            this.f8532d.position().f2526x = this.f8531c.position().f2526x + C0892a.m10742a(12.0f) + C0892a.m10742a(90.0f);
            this.f8532d.removeFromParent();
            addChild(this.f8532d);
            m5225e();
        }

        /* renamed from: b */
        public void m5229b() {
            if (this.f8532d != null) {
                this.f8532d.removeFromParent();
                this.f8532d = null;
            }
        }

        /* renamed from: e */
        private void m5225e() {
            if (this.f8532d != null && this.f8532d.parent() == this) {
                this.f8533e.position().f2526x = this.f8531c.position().f2526x + C0892a.m10742a(12.0f) + C0892a.m10742a(40.0f) + C0892a.m10742a(110.0f);
            } else {
                this.f8533e.position().f2526x = this.f8531c.position().f2526x + C0892a.m10742a(12.0f) + C0892a.m10742a(40.0f);
            }
            float m10742a = C0892a.m10742a(160.0f);
            setAABBPX(0.0f, (-m10742a) / 2.0f, 0.0f, this.f8533e.maxX() + this.f8533e.position().f2526x, m10742a / 2.0f, 0.0f);
        }

        /* renamed from: c */
        public void m5227c() {
            this.f8531c = new C0981k(C0892a.m10742a(24.0f), C0892a.m10742a(45.0f), false) { // from class: com.tsf.shell.f.e.g.a.d.a.1
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawStart() {
                    if (C2585a.this.f8529a.f2529id == 0) {
                        Bitmap m609a = C4189x.m609a(C1306b.C1310d.scrollcontainer_arrow);
                        C0853a.m10853g().m10540a(C2585a.this.f8529a, m609a);
                        m609a.recycle();
                    }
                }
            };
            this.f8531c.textures().addElement(this.f8529a);
            addChild(this.f8531c);
            this.f8531c.position().f2526x = C0892a.m10742a(20.0f) + C0892a.m10742a(12.0f);
            this.f8531c.rotation().f2528z = 180.0f;
            this.f8533e = new C0984m();
            this.f8533e.m10347d(42);
            this.f8533e.m10345e(-1);
            this.f8533e.m10352b(1);
            addChild(this.f8533e);
            C3567c.m1967a(this, C3567c.f11849h);
            m5228b(this);
        }

        /* renamed from: d */
        public void m5226d() {
            this.f8533e.m10358a();
            C0853a.m10853g().m10543a(this.f8529a);
        }

        /* renamed from: b */
        public void m5228b(C0975i c0975i) {
            c0975i.setMouseEventListener(new C0937a(c0975i) { // from class: com.tsf.shell.f.e.g.a.d.a.2
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    C2585a.this.mo5234a();
                }
            });
        }
    }
}
