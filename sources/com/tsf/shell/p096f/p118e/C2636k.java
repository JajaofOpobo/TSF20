package com.tsf.shell.p096f.p118e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.utils.C4181q;
/* renamed from: com.tsf.shell.f.e.k */
/* loaded from: classes.dex */
public class C2636k extends C0981k {

    /* renamed from: a */
    private int f8680a;

    /* renamed from: d */
    private TextureElement f8681d;

    public C2636k() {
        super(1.0f, 1.0f);
        this.f8681d = new TextureElement(0, false);
        this.f8680a = (int) C0892a.m10742a(22.0f);
        mo10368a(this.f8680a);
        mo5215b(this.f8680a);
        textures().addElement(this.f8681d);
        useVBO(false);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        m5100d();
    }

    /* renamed from: d */
    private void m5100d() {
        if (this.f8681d.f2529id == 0) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f8680a, this.f8680a, Bitmap.Config.ARGB_8888);
            C4181q.m642a(new Canvas(createBitmap), 10.0f, 1.0f, 1.0f, -49152);
            C0853a.m10853g().m10540a(this.f8681d, createBitmap);
            createBitmap.recycle();
        }
    }

    /* renamed from: a */
    public void m5101a() {
        if (this.f8681d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f8681d);
        }
    }
}
