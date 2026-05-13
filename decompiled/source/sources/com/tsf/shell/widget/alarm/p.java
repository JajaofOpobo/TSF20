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
/* loaded from: classes.dex */
public class p {
    public static Bitmap a(Context context, String str) {
        Bitmap a = a(context, str, true);
        if (a == null) {
            return a(context, context.getResources().getIdentifier("clock_theme_" + str, "drawable", context.getPackageName()));
        }
        return a;
    }

    public static Bitmap a(Context context, String str, boolean z) {
        File file = new File(context.getCacheDir().getPath() + "/theme/images/" + ("clock_theme_" + str + ".png"));
        i.c("-------------Loading Theme Resource:" + file.getPath());
        if (file.exists()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath());
            if (z && decodeFile != null) {
                decodeFile = a(decodeFile);
            }
            if (decodeFile != null) {
                Bitmap copy = decodeFile.copy(Bitmap.Config.ARGB_8888, true);
                decodeFile.recycle();
                return copy;
            }
            return null;
        }
        return null;
    }

    public static Bitmap a(Context context, int i) {
        return a(b(context, i));
    }

    public static void a(int i, Bitmap bitmap, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, i2, i3, bitmap);
    }

    public static Bitmap b(Context context, String str) {
        Bitmap a = a(context, str, false);
        if (a == null) {
            return b(context, context.getResources().getIdentifier("clock_theme_" + str, "drawable", context.getPackageName()));
        }
        return a;
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
        float Scale = VInformation.Scale();
        i.c("EngineScale:" + Scale);
        if (Scale < 1.3333334f) {
            float f = Scale / 1.3333334f;
            i.c("targetScale:" + f);
            Bitmap createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            canvas.drawBitmap(bitmap, matrix, paint);
            bitmap.recycle();
            return createBitmap;
        }
        return bitmap;
    }
}
