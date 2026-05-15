package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.censivn.C3DEngine.api.shell.VInformation;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class p {
    public static Bitmap a(Context context, String str) {
        Bitmap bitmapA = a(context, str, true);
        if (bitmapA == null) {
            return a(context, context.getResources().getIdentifier("clock_theme_" + str, "drawable", context.getPackageName()));
        }
        return bitmapA;
    }

    public static Bitmap a(Context context, String str, boolean z) {
        File file = new File(context.getCacheDir().getPath() + "/theme/images/" + ("clock_theme_" + str + ".png"));
        i.c("-------------Loading Theme Resource:" + file.getPath());
        if (!file.exists()) {
            return null;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
        if (z && bitmapDecodeFile != null) {
            bitmapDecodeFile = a(bitmapDecodeFile);
        }
        if (bitmapDecodeFile == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmapDecodeFile.copy(Bitmap.Config.ARGB_8888, true);
        bitmapDecodeFile.recycle();
        return bitmapCopy;
    }

    public static Bitmap a(Context context, int i) {
        return a(b(context, i));
    }

    public static void a(int i, Bitmap bitmap, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, i2, i3, bitmap);
    }

    public static Bitmap b(Context context, String str) {
        Bitmap bitmapA = a(context, str, false);
        if (bitmapA == null) {
            return b(context, context.getResources().getIdentifier("clock_theme_" + str, "drawable", context.getPackageName()));
        }
        return bitmapA;
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
        float fScale = VInformation.Scale();
        i.c("EngineScale:" + fScale);
        if (fScale < 1.3333334f) {
            float f = fScale / 1.3333334f;
            i.c("targetScale:" + f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            canvas.drawBitmap(bitmap, matrix, paint);
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        return bitmap;
    }
}
