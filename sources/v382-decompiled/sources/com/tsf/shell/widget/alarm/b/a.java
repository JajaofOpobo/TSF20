package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.widget.alarm.aj;

/* loaded from: classes.dex */
public class a extends e {
    public static int a = 198;
    public static int b = 69;
    public f c;
    public f d;
    public f e;
    public f f;
    public f g;
    public f h;

    public a(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.c = new f(this, 0, 0, 68, 68);
        this.d = new f(this, 68, 0, 68, 68);
        this.e = new f(this, 172, 35, 25, 31);
        this.f = new f(this, 172, 2, 25, 31);
        this.g = new f(this, 137, 35, 33, 31);
        this.h = new f(this, 137, 2, 33, 31);
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void a() {
        Bitmap b2 = b();
        this.k = this.j.createTexture(b2, false);
        b2.recycle();
    }

    public Bitmap b() {
        return aj.a(this.i, "alarm_btn");
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float c() {
        return 198.0f;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float d() {
        return 69.0f;
    }
}
