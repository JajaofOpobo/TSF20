package com.tsf.shell.p096f.p118e.p121c.p122a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
/* renamed from: com.tsf.shell.f.e.c.a.c */
/* loaded from: classes.dex */
public class C2483c extends VObject3dContainer {

    /* renamed from: a */
    private C2481a f8183a;

    /* renamed from: b */
    private C2481a f8184b;

    /* renamed from: c */
    private TextureElement f8185c;

    /* renamed from: d */
    private float f8186d = 0.0f;

    /* renamed from: e */
    private float f8187e = 0.0f;

    /* renamed from: f */
    private float f8188f = 0.0f;

    /* renamed from: g */
    private int f8189g = 0;

    /* renamed from: h */
    private float f8190h = 0.0f;

    /* renamed from: i */
    private float f8191i = 0.0f;

    /* renamed from: j */
    private float f8192j = 0.0f;

    /* renamed from: k */
    private float f8193k = 0.0f;

    /* renamed from: a */
    public C2485e m5442a(float f, float f2, float f3, int i) {
        this.f8186d = f;
        this.f8187e = f2;
        this.f8188f = f3;
        this.f8189g = i;
        C2485e c2485e = new C2485e(f + f2, 0.0f, f2);
        float f4 = ((((-f3) * f3) - (f * f)) - ((2.0f * f) * f2)) / ((f3 - f2) * 2.0f);
        float f5 = f4 + f3;
        C2485e c2485e2 = new C2485e(0.0f, f5, f4);
        float m5427a = c2485e.m5427a(c2485e2) * 2.0f;
        float m5426b = c2485e.m5426b(c2485e2) * 2.0f;
        this.f8183a = new C2481a(m5427a, m5426b);
        this.f8184b = new C2481a(m5427a, m5426b);
        m5443a(f4, f5, m5427a, m5426b);
        return c2485e2;
    }

    /* renamed from: a */
    private void m5443a(float f, float f2, float f3, float f4) {
        this.f8190h = f;
        this.f8191i = f2;
        this.f8192j = f3;
        this.f8193k = f4;
        Bitmap createBitmap = Bitmap.createBitmap((int) f3, (int) f4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawColor(this.f8189g);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        float f5 = (f3 / 2.0f) + 0.0f;
        canvas.drawCircle(f5, (f4 / 2.0f) - f2, f, paint);
        canvas.drawCircle(f5, (f4 / 2.0f) + f2, f, paint);
        if (this.f8185c != null) {
            C0853a.m10853g().m10543a(this.f8185c);
            this.f8183a.textures().removeAll();
        }
        this.f8185c = C0853a.m10853g().m10544a(createBitmap, true);
        this.f8183a.textures().addElement(this.f8185c);
        createBitmap.recycle();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (this.f8185c == null && this.f8186d != 0.0f) {
            m5440b();
        }
    }

    /* renamed from: b */
    private void m5440b() {
        if (this.f8185c == null && this.f8190h != 0.0f) {
            m5443a(this.f8190h, this.f8191i, this.f8192j, this.f8193k);
        }
    }

    /* renamed from: a */
    public void m5444a() {
        if (this.f8185c != null) {
            C0853a.m10853g().m10543a(this.f8185c);
            this.f8183a.textures().removeAll();
            this.f8185c = null;
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        GLES20.glClear(1024);
        GLES20.glEnable(2960);
        GLES20.glStencilFunc(519, 0, -1);
        GLES20.glStencilOp(7682, 7682, 7682);
        this.f8184b.dispatchDraw();
        GLES20.glStencilFunc(514, 1, -1);
        GLES20.glStencilOp(7680, 7680, 7680);
        this.f8183a.dispatchDraw();
        GLES20.glDisable(2960);
    }

    /* renamed from: a */
    public void m5441a(C2482b c2482b, C2482b c2482b2) {
        this.f8184b.m5450b(c2482b.m5449a(), c2482b2.m5449a());
    }
}
