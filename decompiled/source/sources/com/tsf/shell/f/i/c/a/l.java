package com.tsf.shell.f.i.c.a;

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
/* loaded from: classes.dex */
public class l {
    public static Bitmap a(Context context, int i) {
        return a(b(context, i));
    }

    public static Bitmap b(Context context, int i) {
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

    public static Bitmap a(Bitmap bitmap) {
        float a = a();
        if (a == 1.0f) {
            e.a("Mipmap return source");
            return bitmap;
        }
        e.a("targetScale:" + a);
        Bitmap createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * a), (int) (bitmap.getHeight() * a), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setScale(a, a);
        canvas.drawBitmap(bitmap, matrix, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 2, bitmap.getHeight() + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, 1.0f, 1.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public static float a() {
        float Scale = VInformation.Scale();
        e.a("VInformation.Scale():" + Scale);
        if (Scale >= 1.5f) {
            return 1.0f;
        }
        return Scale / 1.5f;
    }
}
