package com.tsf.shell.f.e.g.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a extends c {
    private static com.tsf.shell.manager.o.a.a textCreater;
    private ArrayList<C0095a> functions;
    private j functionsContainer;
    private boolean initExtraItem = false;

    public boolean hasFunctions() {
        if (this.functions == null || this.functions.isEmpty()) {
            return false;
        }
        Iterator<C0095a> it = this.functions.iterator();
        while (it.hasNext()) {
            if (it.next().f()) {
                return true;
            }
        }
        return false;
    }

    public void setFunctions(ArrayList<C0095a> arrayList) {
        this.functions = arrayList;
        if (arrayList != null) {
            this.functionsContainer = new com.tsf.shell.f.e.g.b();
            Iterator<C0095a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.functionsContainer.addChild(it.next());
            }
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getMenuContainer() {
        return this.functionsContainer;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onThemeChanged() {
        super.onThemeChanged();
        int size = this.functions == null ? 0 : this.functions.size();
        for (int i = 0; i < size; i++) {
            this.functions.get(i).g();
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void show(boolean z) {
        super.show(z);
        int size = this.functions == null ? 0 : this.functions.size();
        if (!this.initExtraItem && size > 0) {
            this.initExtraItem = true;
            for (int i = 0; i < size; i++) {
                this.functions.get(i).d();
            }
            this.functionsContainer.measure();
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void recycle() {
        int size = this.functions == null ? 0 : this.functions.size();
        for (int i = 0; i < size; i++) {
            this.functions.get(i).e();
        }
        this.initExtraItem = false;
        super.recycle();
    }

    /* renamed from: com.tsf.shell.f.e.g.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0095a extends k {
        private TextureElement a;
        private boolean d;
        private int e;
        private String f;
        private C0096a g;
        private boolean h;

        /* renamed from: com.tsf.shell.f.e.g.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0096a {
            public boolean a() {
                return false;
            }

            public void b() {
            }

            public void c() {
            }
        }

        public C0095a(int i, String str, C0096a c0096a) {
            super(0.0f, 0.0f, false);
            this.d = false;
            this.h = true;
            this.f = str;
            this.e = i;
            this.g = c0096a;
            this.a = new TextureElement(0, false);
            textures().addElement(this.a);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.e.g.a.a.a.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (C0095a.this.d) {
                        C0095a.this.g.c();
                    } else {
                        C0095a.this.g.b();
                    }
                    C0095a.this.a();
                    w.b();
                }
            });
        }

        public void a() {
            this.d = this.g.a();
            k();
            if (this.d) {
                h();
            } else {
                i();
            }
        }

        public void d() {
            a();
        }

        public void e() {
            j();
        }

        public boolean f() {
            return this.h;
        }

        public void g() {
            if (this.a.id != 0) {
                j();
                k();
                if (this.d) {
                    h();
                } else {
                    i();
                }
            }
        }

        public void h() {
            this.d = true;
            com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.m);
        }

        public void i() {
            this.d = false;
            com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.n);
        }

        private void k() {
            if (this.a.id == 0) {
                Bitmap createCustomIco = a.createCustomIco(this.f, x.a(this.e, com.censivn.C3DEngine.b.b.a.c * 60.0f, com.censivn.C3DEngine.b.b.a.c * 60.0f));
                com.censivn.C3DEngine.a.g().a(this.a, createCustomIco);
                createCustomIco.recycle();
                if (b() != this.a.width) {
                    a(this.a.width);
                    b(this.a.height);
                    calAABB(1.0f, 0.7f, 1.0f);
                }
            }
        }

        public void j() {
            if (this.a.id != 0) {
                com.censivn.C3DEngine.a.g().a(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap createCustomIco(String str, Bitmap bitmap) {
        if (textCreater == null) {
            textCreater = new com.tsf.shell.manager.o.a.a();
        }
        textCreater.d(false);
        textCreater.h(40);
        textCreater.i(-1);
        Bitmap b = textCreater.b(str);
        int i = (int) (92.0f * com.censivn.C3DEngine.b.b.a.c);
        int i2 = (int) (0.0f * com.censivn.C3DEngine.b.b.a.c);
        Bitmap createBitmap = Bitmap.createBitmap(b.getWidth() + i + i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, (i - bitmap.getWidth()) / 2.0f, (i - bitmap.getHeight()) / 2.0f, paint);
        bitmap.recycle();
        canvas.drawBitmap(b, i2 + i, (i - b.getHeight()) / 2.0f, paint);
        b.recycle();
        return createBitmap;
    }
}
