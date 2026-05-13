package com.tsf.shell.p096f.p153i.p161c.p162a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.api.shell.VInformation;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.tsf.shell.f.i.c.a.l */
/* loaded from: classes.dex */
public class C3325l {
    /* renamed from: a */
    public static Bitmap m2840a(Context context, int i) {
        return m2839a(m2838b(context, i));
    }

    /* renamed from: b */
    public static Bitmap m2838b(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openRawResource);
            Bitmap copy = decodeStream.copy(Bitmap.Config.ARGB_8888, true);
            decodeStream.recycle();
            return copy;
        } finally {
            try {
                openRawResource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m2839a(Bitmap bitmap) {
        float m2841a = m2841a();
        if (m2841a == 1.0f) {
            C3296e.m2908a("Mipmap return source");
            return bitmap;
        }
        C3296e.m2908a("targetScale:" + m2841a);
        Bitmap createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * m2841a), (int) (bitmap.getHeight() * m2841a), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setScale(m2841a, m2841a);
        canvas.drawBitmap(bitmap, matrix, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m2837b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 2, bitmap.getHeight() + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, 1.0f, 1.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static float m2841a() {
        float Scale = VInformation.Scale();
        C3296e.m2908a("VInformation.Scale():" + Scale);
        if (Scale >= 1.5f) {
            return 1.0f;
        }
        return Scale / 1.5f;
    }
}
