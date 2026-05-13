package com.tsf.shell.widget.alarm.p203b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.widget.alarm.C4281d;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
import java.text.DateFormatSymbols;
/* renamed from: com.tsf.shell.widget.alarm.b.d */
/* loaded from: classes.dex */
public class C4262d extends AbstractC4263e {

    /* renamed from: a */
    public AbstractC4263e.C4264a[] f13819a;

    /* renamed from: b */
    public AbstractC4263e.C4264a[] f13820b;

    /* renamed from: c */
    public AbstractC4263e.C4264a[] f13821c;

    /* renamed from: d */
    private final int f13822d;

    public C4262d(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.f13822d = 35;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: h_ */
    protected void mo363h_() {
        this.f13819a = new AbstractC4263e.C4264a[7];
        this.f13820b = new AbstractC4263e.C4264a[2];
        this.f13821c = new AbstractC4263e.C4264a[2];
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: a */
    protected void mo360a() {
        Bitmap m367e = m367e();
        this.f13825k = this.f13824j.createTexture(m367e, true);
        m367e.recycle();
    }

    /* renamed from: e */
    public Bitmap m367e() {
        int ceil;
        Paint paint = new Paint();
        paint.setTextSize(20.0f);
        paint.setColor(C4281d.f13873a.f13880f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        C4305i.m262a("top = " + fontMetrics.top);
        C4305i.m262a("ascent = " + fontMetrics.ascent);
        C4305i.m262a("descent = " + fontMetrics.descent);
        C4305i.m262a("bottom = " + fontMetrics.bottom);
        C4305i.m262a("leading = " + fontMetrics.leading);
        C4305i.m262a("textHeight = " + ((int) (Math.ceil(fontMetrics.descent - fontMetrics.ascent) + 2.0d)));
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
            paint.setColor(C4281d.f13873a.f13878d);
            canvas.drawText(str, f2, f3, paint);
            this.f13819a[i] = new AbstractC4263e.C4264a((int) (f2 - 35.0f), (int) 0.0f, 70, 30);
            i++;
            f = f4;
        }
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int i2 = 0;
        float f5 = 0.0f;
        while (i2 < 2) {
            float f6 = 490.0f + f5 + 35.0f;
            paint.setColor(C4281d.f13873a.f13879e);
            canvas.drawText(amPmStrings[i2], f6, (((30 - ceil) / 2.0f) + 0.0f) - fontMetrics.top, paint);
            this.f13820b[i2] = new AbstractC4263e.C4264a((int) (f6 - 35.0f), (int) 0.0f, 70, 30);
            i2++;
            f5 += 70.0f;
        }
        int i3 = 0;
        float f7 = 0.0f;
        while (i3 < 2) {
            float f8 = 630.0f + f7 + 35.0f;
            paint.setColor(C4281d.f13873a.f13879e);
            canvas.drawText(amPmStrings[i3], f8, (((30 - ceil) / 2.0f) + 0.0f) - fontMetrics.top, paint);
            this.f13821c[i3] = new AbstractC4263e.C4264a((int) (f8 - 35.0f), (int) 0.0f, 70, 30);
            i3++;
            f7 += 70.0f;
        }
        return createBitmap;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: c */
    protected float mo358c() {
        return 770.0f;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: d */
    protected float mo357d() {
        return 30.0f;
    }
}
