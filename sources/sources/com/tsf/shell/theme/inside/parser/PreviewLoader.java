package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreviewLoader {
    private Context mContext;
    private ArrayList<Integer> mResource = new ArrayList<>();

    public void parser(Context context, String str) {
        this.mContext = k.a(context, str);
        this.mResource = getData(this.mContext);
        if (this.mResource == null) {
            this.mResource = new ArrayList<>();
        }
    }

    public ArrayList<Integer> getData(Context context) {
        return null;
    }

    public int getThemePreviewCount() {
        return this.mResource.size();
    }

    public Bitmap getThemePreviewBitmap(int i, int i2, int i3) {
        ArrayList<Integer> arrayList = this.mResource;
        if (i >= arrayList.size()) {
            return null;
        }
        Bitmap bitmapDecodeSampledBitmapFromResource = decodeSampledBitmapFromResource(this.mContext.getResources(), arrayList.get(i).intValue(), i2, i3);
        if (bitmapDecodeSampledBitmapFromResource == null) {
            return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int width = bitmapDecodeSampledBitmapFromResource.getWidth();
        int height = bitmapDecodeSampledBitmapFromResource.getHeight();
        float fMax = Math.max(i2 / width, i3 / height);
        canvas.scale(fMax, fMax);
        canvas.drawBitmap(bitmapDecodeSampledBitmapFromResource, (i2 - (width * fMax)) / 2.0f, (i3 - (height * fMax)) / 2.0f, paint);
        bitmapDecodeSampledBitmapFromResource.recycle();
        return bitmapCreateBitmap;
    }

    public Bitmap decodeSampledBitmapFromResource(Resources resources, int i, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = calculateInSampleSize(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 || i4 <= i) {
            return 1;
        }
        int i5 = 1;
        while (i3 / i5 >= i2 && i4 / i5 >= i) {
            i5 *= 2;
        }
        if (i5 > 1) {
            i5 /= 2;
        }
        e.b("inSampleSize:" + i5);
        return i5;
    }
}
