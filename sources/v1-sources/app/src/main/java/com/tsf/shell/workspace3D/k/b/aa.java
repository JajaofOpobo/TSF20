package com.tsf.shell.workspace3D.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class aa implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.s d;

    aa(Context context, String str, String str2, com.tsf.shell.workspace3D.k.s sVar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap a;
        int identifier = this.a.getResources().getIdentifier("icon", "string", this.b);
        if (this.b.equals("com.tsf.shell.widget.weather")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_weather);
        } else if (this.b.equals("com.tsf.shell.widget.music")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_music);
        } else if (this.b.equals("com.tsf.shell.widget.gallery")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_gallery);
        } else if (this.b.equals("com.tsf.shell.widget.alarm")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_alarm);
        } else if (this.b.equals("com.tsf.shell.widget.message")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_message);
        } else if (this.b.equals("com.tsf.shell.widget.memo")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_memo);
        } else if (this.b.equals("com.tsf.shell.widget.adornment")) {
            a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.default_icon_adornment);
        } else if (identifier > 0) {
            int identifier2 = this.a.getResources().getIdentifier(this.a.getResources().getString(identifier), "drawable", this.b);
            if (identifier2 > 0) {
                a = com.censivn.C3DEngine.h.a.a(this.a, identifier2);
            } else {
                a = com.censivn.C3DEngine.h.a.a(this.a, this.a.getApplicationInfo().icon);
            }
        } else {
            a = com.censivn.C3DEngine.h.a.a(this.a, this.a.getApplicationInfo().icon);
        }
        Bitmap a2 = ap.a();
        Canvas canvas = new Canvas(a2);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (a != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, ap.E, ap.E, true);
            if (createScaledBitmap != a) {
                a.recycle();
            }
            canvas.drawBitmap(createScaledBitmap, (ap.A - createScaledBitmap.getWidth()) / 2, (ap.E - createScaledBitmap.getHeight()) / 2, (Paint) null);
            createScaledBitmap.recycle();
        }
        Bitmap a3 = com.tsf.shell.setting.a.v.a(this.c, 0);
        canvas.drawBitmap(a3, (ap.A - a3.getWidth()) / 2, ap.E + 3, (Paint) null);
        a3.recycle();
        if (this.d.e == null) {
            TextureElement a4 = com.censivn.C3DEngine.a.f().a(a2, true);
            this.d.d.O.z().c(a4);
            this.d.e = a4;
        } else {
            com.censivn.C3DEngine.a.f();
            com.censivn.C3DEngine.b.ad.c(this.d.e, a2);
        }
    }
}
