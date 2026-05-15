package com.tsf.shell.widget.cubeclock;

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
public class r {
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
            j.a("Mipmap return source");
            return bitmap;
        }
        j.a("targetScale:" + fA);
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

    public static float a() {
        float fScale = VInformation.Scale();
        if (fScale >= 1.3333334f) {
            return 1.0f;
        }
        return fScale / 1.3333334f;
    }
}
