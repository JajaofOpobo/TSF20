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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l {
    public static Bitmap a(Context context, int i) {
        return a(b(context, i));
    }

    public static Bitmap b(Context context, int i) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource);
            Bitmap bitmapCopy = bitmapDecodeStream.copy(Bitmap.Config.ARGB_8888, true);
            bitmapDecodeStream.recycle();
            return bitmapCopy;
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        float fA = a();
        if (fA == 1.0f) {
            e.a("Mipmap return source");
            return bitmap;
        }
        e.a("targetScale:" + fA);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * fA), (int) (bitmap.getHeight() * fA), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setScale(fA, fA);
        canvas.drawBitmap(bitmap, matrix, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap b(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + 2, bitmap.getHeight() + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, 1.0f, 1.0f, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static float a() {
        float fScale = VInformation.Scale();
        e.a("VInformation.Scale():" + fScale);
        if (fScale >= 1.5f) {
            return 1.0f;
        }
        return fScale / 1.5f;
    }
}
