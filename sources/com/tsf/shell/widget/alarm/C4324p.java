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
/* renamed from: com.tsf.shell.widget.alarm.p */
/* loaded from: classes.dex */
public class C4324p {
    /* renamed from: a */
    public static Bitmap m230a(Context context, String str) {
        Bitmap m229a = m229a(context, str, true);
        if (m229a == null) {
            return m231a(context, context.getResources().getIdentifier("clock_theme_" + str, "drawable", context.getPackageName()));
        }
        return m229a;
    }

    /* renamed from: a */
    public static Bitmap m229a(Context context, String str, boolean z) {
        File file = new File(context.getCacheDir().getPath() + "/theme/images/" + ("clock_theme_" + str + ".png"));
        C4305i.m259c("-------------Loading Theme Resource:" + file.getPath());
        if (file.exists()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath());
            if (z && decodeFile != null) {
                decodeFile = m228a(decodeFile);
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

    /* renamed from: a */
    public static Bitmap m231a(Context context, int i) {
        return m228a(m227b(context, i));
    }

    /* renamed from: a */
    public static void m232a(int i, Bitmap bitmap, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, i2, i3, bitmap);
    }

    /* renamed from: b */
    public static Bitmap m226b(Context context, String str) {
        Bitmap m229a = m229a(context, str, false);
        if (m229a == null) {
            return m227b(context, context.getResources().getIdentifier("clock_theme_" + str, "drawable", context.getPackageName()));
        }
        return m229a;
    }

    /* renamed from: b */
    public static Bitmap m227b(Context context, int i) {
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
    public static Bitmap m228a(Bitmap bitmap) {
        float Scale = VInformation.Scale();
        C4305i.m259c("EngineScale:" + Scale);
        if (Scale < 1.3333334f) {
            float f = Scale / 1.3333334f;
            C4305i.m259c("targetScale:" + f);
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
