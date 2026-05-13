package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3296e;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3325l;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.GregorianCalendar;
/* renamed from: com.tsf.shell.f.i.c.a.a.g */
/* loaded from: classes.dex */
public class C3251g {
    /* renamed from: a */
    public static Bitmap m3000a(Context context, Date date) {
        Bitmap m2838b = C3325l.m2838b(context, C1306b.C1310d.widget_preview_calendar_content);
        Canvas canvas = new Canvas(m2838b);
        Paint paint = new Paint();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String[] months = dateFormatSymbols.getMonths();
        gregorianCalendar.setTime(date);
        paint.setTextSize(25.0f);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawText(months[gregorianCalendar.get(2)] + "-" + gregorianCalendar.get(1), 270.0f + 2.0f, 44.0f + 2.0f, paint);
        paint.setTextSize(18.0f);
        paint.setColor(-1426063361);
        gregorianCalendar.add(2, -1);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("● " + months[gregorianCalendar.get(2)], 12.0f + 2.0f, 44.0f + 2.0f, paint);
        gregorianCalendar.add(2, 2);
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("● " + months[gregorianCalendar.get(2)], 532.0f + 2.0f, 44.0f + 2.0f, paint);
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        paint.setTextSize(18.0f);
        paint.setColor(-2279409);
        paint.setTextAlign(Paint.Align.CENTER);
        int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
        C3296e.m2908a("mFirstDay:" + firstDayOfWeek);
        if (firstDayOfWeek == 1) {
            canvas.drawText(shortWeekdays[1], 82.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[7], 490.0f + 2.0f, 94.0f + 2.0f, paint);
            paint.setColor(-13421773);
            canvas.drawText(shortWeekdays[2], 150.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[3], 218.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[4], 286.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[5], 354.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[6], 422.0f + 2.0f, 94.0f + 2.0f, paint);
        } else {
            canvas.drawText(shortWeekdays[1], 490.0f + 2.0f, 94.0f, paint);
            canvas.drawText(shortWeekdays[7], 422.0f + 2.0f, 94.0f, paint);
            paint.setColor(-13421773);
            canvas.drawText(shortWeekdays[2], 82.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[3], 150.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[4], 218.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[5], 286.0f + 2.0f, 94.0f + 2.0f, paint);
            canvas.drawText(shortWeekdays[6], 354.0f + 2.0f, 94.0f + 2.0f, paint);
        }
        paint.setColor(-10066330);
        gregorianCalendar.clear();
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(5, 1);
        for (int i = 0; i < 7; i++) {
            canvas.drawText("" + gregorianCalendar.get(3), 24.0f + 2.0f, (i * 38) + 135 + 2.0f, paint);
            gregorianCalendar.add(3, 1);
        }
        paint.setTextSize(22.0f);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        date.setDate(1);
        gregorianCalendar2.setTime(date);
        gregorianCalendar2.set(7, gregorianCalendar2.getFirstDayOfWeek());
        int month = date.getMonth();
        for (int i2 = 0; i2 < 42; i2++) {
            int i3 = ((i2 % 7) * 68) + 82;
            int i4 = ((i2 / 7) * 38) + 135;
            if (gregorianCalendar2.get(2) == month) {
                int i5 = gregorianCalendar2.get(7);
                if (i5 == 1 || i5 == 7) {
                    paint.setColor(-2279409);
                } else {
                    paint.setColor(-9079435);
                }
            } else {
                paint.setColor(-3355444);
            }
            canvas.drawText("" + gregorianCalendar2.get(5), i3 + 2.0f, i4 + 2.0f, paint);
            gregorianCalendar2.add(5, 1);
        }
        return C3325l.m2839a(m2838b);
    }
}
