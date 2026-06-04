package com.tsf.shell.workspace3D.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* loaded from: classes.dex */
public final class z {
    public static com.tsf.shell.workspace3D.k.s a(Context context, String str, String str2, String str3) {
        com.tsf.shell.workspace3D.k.s sVar = new com.tsf.shell.workspace3D.k.s();
        b(sVar, context, str, str2, str3);
        return sVar;
    }

    private static void b(com.tsf.shell.workspace3D.k.s sVar, Context context, String str, String str2, String str3) {
        if (sVar.d == null) {
            com.tsf.shell.workspace3D.k.al alVar = new com.tsf.shell.workspace3D.k.al();
            sVar.d = alVar;
            alVar.a(sVar);
        }
        sVar.g = false;
        sVar.b = str3;
        sVar.a = str2;
        sVar.f = 5;
        int identifier = context.getResources().getIdentifier("singleTask", "bool", str2);
        if (identifier > 0) {
            sVar.h = context.getResources().getBoolean(identifier);
        } else {
            sVar.h = false;
        }
        int identifier2 = context.getResources().getIdentifier("minSdkVersion", "integer", str2);
        if (identifier2 > 0) {
            sVar.j = context.getResources().getInteger(identifier2);
        } else {
            sVar.j = 0;
        }
        int identifier3 = context.getResources().getIdentifier("category", "string", str2);
        if (identifier3 > 0 && !context.getResources().getString(identifier3).equals("tool")) {
            sVar.i = 1;
        } else {
            sVar.i = 0;
        }
        com.censivn.C3DEngine.a.a().c(new aa(context, str2, str, sVar));
    }

    public static void a(com.tsf.shell.workspace3D.k.s sVar, Context context, String str, String str2, String str3) {
        b(sVar, context, str, str2, str3);
    }

    public static Bitmap a(String str, Bitmap bitmap) {
        Bitmap a = ap.a();
        Canvas canvas = new Canvas(a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (bitmap != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ap.E, ap.E, true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            canvas.drawBitmap(createScaledBitmap, (ap.A - createScaledBitmap.getWidth()) / 2, (ap.E - createScaledBitmap.getHeight()) / 2, (Paint) null);
            createScaledBitmap.recycle();
        }
        Bitmap a2 = com.tsf.shell.setting.a.v.a(str, 0);
        canvas.drawBitmap(a2, (ap.A - a2.getWidth()) / 2, ap.E + 3, (Paint) null);
        a2.recycle();
        return a;
    }
}
