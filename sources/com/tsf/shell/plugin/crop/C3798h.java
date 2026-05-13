package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* renamed from: com.tsf.shell.plugin.crop.h */
/* loaded from: classes.dex */
public class C3798h extends C3796f {
    public C3798h(Context context) {
        super(context);
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public Bitmap mo1424a() {
        Bitmap createBitmap = Bitmap.createBitmap(ItemInfo.APP_VERSION_CODE, ItemInfo.APP_VERSION_CODE, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint(1);
        paint.setColor(-1442840576);
        canvas.drawRect(0.0f, 0.0f, (float) ItemInfo.APP_VERSION_CODE, (float) ItemInfo.APP_VERSION_CODE, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-16777216);
        canvas.drawCircle(128.0f, 128.0f, 128.0f, paint);
        return createBitmap;
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public void mo1423a(Canvas canvas, float f) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(8.0f);
        canvas.save();
        canvas.scale(f, f);
        canvas.translate(-this.f12482a, -this.f12483b);
        canvas.drawCircle(128.0f, 128.0f, 128.0f, paint);
        canvas.restore();
    }

    @Override // com.tsf.shell.plugin.crop.C3796f
    /* renamed from: a */
    public void mo1422a(Canvas canvas, float f, Paint paint, float f2) {
        canvas.scale(f, f);
        canvas.translate(f2 / f, f2 / f);
        canvas.drawCircle(128.0f, 128.0f, 128.0f, paint);
    }
}
