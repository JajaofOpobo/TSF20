package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.widget.alarm.b.e;
import com.tsf.shell.widget.alarm.p;
/* loaded from: classes.dex */
public class a extends e {
    public static int a = 198;
    public static int b = 69;
    public e.a c;
    public e.a d;
    public e.a e;
    public e.a f;
    public e.a g;
    public e.a h;

    public a(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.c = new e.a(0, 0, 68, 68);
        this.d = new e.a(68, 0, 68, 68);
        this.e = new e.a(172, 35, 25, 31);
        this.f = new e.a(172, 2, 25, 31);
        this.g = new e.a(137, 35, 33, 31);
        this.h = new e.a(137, 2, 33, 31);
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void a() {
        Bitmap b2 = b();
        this.k = this.j.createTexture(b2, false);
        b2.recycle();
    }

    public Bitmap b() {
        return p.a(this.i, "alarm_btn");
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
