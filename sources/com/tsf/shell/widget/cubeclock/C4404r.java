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
/* renamed from: com.tsf.shell.widget.cubeclock.r */
/* loaded from: classes.dex */
public class C4404r {
    /* renamed from: a */
    public static Bitmap m20a(Context context, int i) {
        return m19a(m18b(context, i));
    }

    /* renamed from: b */
    public static Bitmap m18b(Context context, int i) {
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
    public static Bitmap m19a(Bitmap bitmap) {
        float m21a = m21a();
        if (m21a == 1.0f) {
            C4390j.m53a("Mipmap return source");
            return bitmap;
        }
        C4390j.m53a("targetScale:" + m21a);
        Bitmap createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * m21a), (int) (bitmap.getHeight() * m21a), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setScale(m21a, m21a);
        canvas.drawBitmap(bitmap, matrix, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static float m21a() {
        float Scale = VInformation.Scale();
        if (Scale >= 1.3333334f) {
            return 1.0f;
        }
        return Scale / 1.3333334f;
    }
}
