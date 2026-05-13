package com.tsf.shell.p096f.p118e.p127g.p128a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.p096f.p118e.p127g.C2588b;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.g.a.a */
/* loaded from: classes.dex */
public class C2574a extends AbstractC2580c {
    private static C3561a textCreater;
    private ArrayList<C2575a> functions;
    private C0980j functionsContainer;
    private boolean initExtraItem = false;

    public boolean hasFunctions() {
        if (this.functions == null || this.functions.isEmpty()) {
            return false;
        }
        Iterator<C2575a> it = this.functions.iterator();
        while (it.hasNext()) {
            if (it.next().m5240f()) {
                return true;
            }
        }
        return false;
    }

    public void setFunctions(ArrayList<C2575a> arrayList) {
        this.functions = arrayList;
        if (arrayList != null) {
            this.functionsContainer = new C2588b();
            Iterator<C2575a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.functionsContainer.addChild(it.next());
            }
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getMenuContainer() {
        return this.functionsContainer;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onThemeChanged() {
        super.onThemeChanged();
        int size = this.functions == null ? 0 : this.functions.size();
        for (int i = 0; i < size; i++) {
            this.functions.get(i).m5239g();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void show(boolean z) {
        super.show(z);
        int size = this.functions == null ? 0 : this.functions.size();
        if (!this.initExtraItem && size > 0) {
            this.initExtraItem = true;
            for (int i = 0; i < size; i++) {
                this.functions.get(i).m5242d();
            }
            this.functionsContainer.measure();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void recycle() {
        int size = this.functions == null ? 0 : this.functions.size();
        for (int i = 0; i < size; i++) {
            this.functions.get(i).m5241e();
        }
        this.initExtraItem = false;
        super.recycle();
    }

    /* renamed from: com.tsf.shell.f.e.g.a.a$a */
    /* loaded from: classes.dex */
    public static class C2575a extends C0981k {

        /* renamed from: a */
        private TextureElement f8518a;

        /* renamed from: d */
        private boolean f8519d;

        /* renamed from: e */
        private int f8520e;

        /* renamed from: f */
        private String f8521f;

        /* renamed from: g */
        private C2577a f8522g;

        /* renamed from: h */
        private boolean f8523h;

        /* renamed from: com.tsf.shell.f.e.g.a.a$a$a */
        /* loaded from: classes.dex */
        public static class C2577a {
            /* renamed from: a */
            public boolean mo1542a() {
                return false;
            }

            /* renamed from: b */
            public void mo1543b() {
            }

            /* renamed from: c */
            public void mo1541c() {
            }
        }

        public C2575a(int i, String str, C2577a c2577a) {
            super(0.0f, 0.0f, false);
            this.f8519d = false;
            this.f8523h = true;
            this.f8521f = str;
            this.f8520e = i;
            this.f8522g = c2577a;
            this.f8518a = new TextureElement(0, false);
            textures().addElement(this.f8518a);
            setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.e.g.a.a.a.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C2575a.this.f8519d) {
                        C2575a.this.f8522g.mo1541c();
                    } else {
                        C2575a.this.f8522g.mo1543b();
                    }
                    C2575a.this.m5245a();
                    C4187w.m614b();
                }
            });
        }

        /* renamed from: a */
        public void m5245a() {
            this.f8519d = this.f8522g.mo1542a();
            m5235k();
            if (this.f8519d) {
                m5238h();
            } else {
                m5237i();
            }
        }

        /* renamed from: d */
        public void m5242d() {
            m5245a();
        }

        /* renamed from: e */
        public void m5241e() {
            m5236j();
        }

        /* renamed from: f */
        public boolean m5240f() {
            return this.f8523h;
        }

        /* renamed from: g */
        public void m5239g() {
            if (this.f8518a.f2529id != 0) {
                m5236j();
                m5235k();
                if (this.f8519d) {
                    m5238h();
                } else {
                    m5237i();
                }
            }
        }

        /* renamed from: h */
        public void m5238h() {
            this.f8519d = true;
            C3567c.m1967a(this, C3567c.f11854m);
        }

        /* renamed from: i */
        public void m5237i() {
            this.f8519d = false;
            C3567c.m1967a(this, C3567c.f11855n);
        }

        /* renamed from: k */
        private void m5235k() {
            if (this.f8518a.f2529id == 0) {
                Bitmap createCustomIco = C2574a.createCustomIco(this.f8521f, C4189x.m608a(this.f8520e, C0892a.f2567c * 60.0f, C0892a.f2567c * 60.0f));
                C0853a.m10853g().m10540a(this.f8518a, createCustomIco);
                createCustomIco.recycle();
                if (mo10366b() != this.f8518a.width) {
                    mo10368a(this.f8518a.width);
                    mo5215b(this.f8518a.height);
                    calAABB(1.0f, 0.7f, 1.0f);
                }
            }
        }

        /* renamed from: j */
        public void m5236j() {
            if (this.f8518a.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f8518a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap createCustomIco(String str, Bitmap bitmap) {
        if (textCreater == null) {
            textCreater = new C3561a();
        }
        textCreater.m1993d(false);
        textCreater.m1989h(40);
        textCreater.m1988i(-1);
        Bitmap m1998b = textCreater.m1998b(str);
        int i = (int) (92.0f * C0892a.f2567c);
        int i2 = (int) (0.0f * C0892a.f2567c);
        Bitmap createBitmap = Bitmap.createBitmap(m1998b.getWidth() + i + i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, (i - bitmap.getWidth()) / 2.0f, (i - bitmap.getHeight()) / 2.0f, paint);
        bitmap.recycle();
        canvas.drawBitmap(m1998b, i2 + i, (i - m1998b.getHeight()) / 2.0f, paint);
        m1998b.recycle();
        return createBitmap;
    }
}
