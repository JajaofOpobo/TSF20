package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.widget.alarm.b.e;
import com.tsf.shell.widget.alarm.i;
import java.text.DateFormatSymbols;
/* loaded from: classes.dex */
public class d extends e {
    public e.a[] a;
    public e.a[] b;
    public e.a[] c;
    private final int d;

    public d(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.d = 35;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void h_() {
        this.a = new e.a[7];
        this.b = new e.a[2];
        this.c = new e.a[2];
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void a() {
        Bitmap e = e();
        this.k = this.j.createTexture(e, true);
        e.recycle();
    }

    public Bitmap e() {
        int ceil;
        Paint paint = new Paint();
        paint.setTextSize(20.0f);
        paint.setColor(com.tsf.shell.widget.alarm.d.a.f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        i.a("top = " + fontMetrics.top);
        i.a("ascent = " + fontMetrics.ascent);
        i.a("descent = " + fontMetrics.descent);
        i.a("bottom = " + fontMetrics.bottom);
        i.a("leading = " + fontMetrics.leading);
        i.a("textHeight = " + ((int) (Math.ceil(fontMetrics.descent - fontMetrics.ascent) + 2.0d)));
        Bitmap createBitmap = Bitmap.createBitmap(770, 30, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        int i = 0;
        float f = 0.0f;
        while (i < 7) {
            float f2 = 0.0f + f + 35.0f;
            float f3 = (((30 - ceil) / 2.0f) + 0.0f) - fontMetrics.top;
            float f4 = f + 70.0f;
            String str = "";
            switch (i) {
                case 0:
                    str = shortWeekdays[2];
                    break;
                case 1:
                    str = shortWeekdays[3];
                    break;
                case 2:
                    str = shortWeekdays[4];
                    break;
                case 3:
                    str = shortWeekdays[5];
                    break;
                case 4:
                    str = shortWeekdays[6];
                    break;
                case 5:
                    str = shortWeekdays[7];
                    break;
                case 6:
                    str = shortWeekdays[1];
                    break;
            }
            paint.setColor(com.tsf.shell.widget.alarm.d.a.d);
            canvas.drawText(str, f2, f3, paint);
            this.a[i] = new e.a((int) (f2 - 35.0f), (int) 0.0f, 70, 30);
            i++;
            f = f4;
        }
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int i2 = 0;
        float f5 = 0.0f;
        while (i2 < 2) {
            float f6 = 490.0f + f5 + 35.0f;
            paint.setColor(com.tsf.shell.widget.alarm.d.a.e);
            canvas.drawText(amPmStrings[i2], f6, (((30 - ceil) / 2.0f) + 0.0f) - fontMetrics.top, paint);
            this.b[i2] = new e.a((int) (f6 - 35.0f), (int) 0.0f, 70, 30);
            i2++;
            f5 += 70.0f;
        }
        int i3 = 0;
        float f7 = 0.0f;
        while (i3 < 2) {
            float f8 = 630.0f + f7 + 35.0f;
            paint.setColor(com.tsf.shell.widget.alarm.d.a.e);
            canvas.drawText(amPmStrings[i3], f8, (((30 - ceil) / 2.0f) + 0.0f) - fontMetrics.top, paint);
            this.c[i3] = new e.a((int) (f8 - 35.0f), (int) 0.0f, 70, 30);
            i3++;
            f7 += 70.0f;
        }
        return createBitmap;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float c() {
        return 770.0f;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float d() {
        return 30.0f;
    }
}
