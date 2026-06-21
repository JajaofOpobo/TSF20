package com.tsf.shell.manager.o.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.Home;
import com.tsf.shell.manager.b.ConfigManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LabelManager {
    public static b a;
    public static int b = 0;
    private static ArrayList<b> c;
    private static TextPaint d;

    public static class a {
        public boolean a = false;
        public int b = -1475276527;
        public boolean c = false;
        public boolean d = false;
        public float e = 0.0f;
        public float f = 0.0f;
        public int g = 30;
    }

    public static void a() {
        com.tsf.shell.manager.o.a.TextLabelElement.a = com.censivn.C3DEngine.C3DEngine.d().getResources().getDimensionPixelSize(com.tsf.b.c.shortcut_text_size);
        c = new ArrayList<>();
        LabelManagerV2.add(new EmptyLabelElement(-1, new TextConfigV2()));
        a aVar = new TextConfigV2();
        b bVar = new TextLabelElementV2(0, aVar);
        aVar.g = com.tsf.shell.manager.o.a.TextLabelElement.a;
        aVar.c = true;
        aVar.d = false;
        LabelManagerV2.add(bVar);
        a aVar2 = new TextConfigV2();
        b bVar2 = new TextLabelElementV2(1, aVar2);
        aVar2.g = com.tsf.shell.manager.o.a.TextLabelElement.a;
        aVar2.c = true;
        aVar2.d = true;
        LabelManagerV2.add(bVar2);
        a aVar3 = new TextConfigV2();
        b bVar3 = new TextLabelElementV2(2, aVar3);
        aVar3.g = com.tsf.shell.manager.o.a.TextLabelElement.a;
        aVar3.a = true;
        LabelManagerV2.add(bVar3);
        a aVar4 = new TextConfigV2();
        b bVar4 = new TextLabelElementV2(3, aVar4);
        aVar4.g = com.tsf.shell.manager.o.a.TextLabelElement.a;
        aVar4.a = true;
        aVar4.d = true;
        LabelManagerV2.add(bVar4);
        LabelManagerV2.add(a(-5293790, false));
        LabelManagerV2.add(a(-1616875, false));
        LabelManagerV2.add(a(-1209320, false));
        LabelManagerV2.add(a(-16749648, false));
        LabelManagerV2.add(a(-5544624, false));
        LabelManagerV2.add(a(-10586556, false));
        LabelManagerV2.add(a(-12361639, false));
        LabelManagerV2.add(a(-15300748, false));
        LabelManagerV2.add(a(-11830901, false));
        LabelManagerV2.add(a(-9271680, false));
        LabelManagerV2.add(a(-8213196, false));
        LabelManagerV2.add(a(-11055295, false));
        LabelManagerV2.add(a(-2210181, false));
        LabelManagerV2.add(a(-10403741, false));
        LabelManagerV2.add(a(-2201238, false));
        Iterator<b> it = LabelManagerV2.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().c = i;
            i++;
        }
        a = b(e.h(0));
        com.tsf.shell.manager.o.ButtonPresetManager.a.ab = a;
        com.tsf.shell.manager.o.ButtonPresetManager.c.ab = LabelManagerV2.get(1);
    }

    private static b a(int i, boolean z) {
        a aVar = new TextConfigV2();
        b bVar = new TextLabelElementV2(LabelManagerV2.size(), aVar);
        aVar.g = com.tsf.shell.manager.o.a.TextLabelElement.a;
        aVar.a = true;
        aVar.b = i;
        aVar.d = z;
        return bVar;
    }

    public static void a(int i) {
        b bVarB = b(i);
        if (bVarB != a) {
            a = bVarB;
            com.tsf.shell.manager.o.ButtonPresetManager.a.ab = a;
            e.g(i);
            Home.b().a(VEasing.Back.easeIn);
        }
    }

    public static b b(int i) {
        for (b bVar : c) {
            if (bVar.b == i) {
                return bVar;
            }
        }
        return LabelManagerV2.get(1);
    }

    public static int b() {
        return LabelManagerV2.size();
    }

    public static b c(int i) {
        return LabelManagerV2.get(i);
    }

    public static Bitmap a(String str, int i, com.tsf.shell.manager.o.ButtonMetrics aVar, a aVar2) {
        if (d == null) {
            d = new TextPaint();
            EmptyLabelElement.setColor(-1118482);
            EmptyLabelElement.setAntiAlias(true);
            EmptyLabelElement.setTextAlign(Paint.Align.LEFT);
            if (com.tsf.shell.manager.k.TypefaceCache.b() != null) {
                EmptyLabelElement.setTypeface(com.tsf.shell.manager.k.TypefaceCache.b());
            }
        }
        EmptyLabelElement.setFakeBoldText(aVar2.d);
        if (aVar2.c) {
            EmptyLabelElement.setShadowLayer(3.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 2.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 2.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, -587202560);
        } else {
            EmptyLabelElement.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
        }
        EmptyLabelElement.setTextSize(aVar.a(i));
        return a(str, aVar.J, aVar.K, 0, 0, d, true, true, 0, 0, aVar2.a, aVar2.b, aVar.C);
    }

    public static Bitmap a(String str, int i, int i2, int i3, int i4, TextPaint textPaint, boolean z, boolean z2, int i5, int i6, boolean z3, int i7, float f) {
        int i8;
        float height;
        String str2 = str == null ? " " : str;
        StaticLayout staticLayout = null;
        boolean z4 = false;
        if (i2 == 0) {
            StaticLayout staticLayout2 = new StaticLayout(str2, textPaint, i + i3, z ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i2 = staticLayout2.getHeight();
            staticLayout = staticLayout2;
            z4 = true;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i + i3, i2 + i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z3) {
            RectF rectF = new RectF(new Rect(0, 0, i, i2));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(i7);
            canvas.drawRoundRect(rectF, f, f, paint);
            i8 = (int) (i - (2.0f * f));
        } else {
            i8 = i;
        }
        float fMeasureText = textPaint.measureText(str2, 0, str2.length());
        if (!z4 && fMeasureText > i8) {
            int length = str2.length();
            String str3 = "";
            int i9 = 0;
            while (i9 < length) {
                String str4 = str2.substring(0, i9 + 1) + "...";
                if (textPaint.measureText(str4, 0, str4.length()) > i8) {
                    break;
                }
                i9++;
                str3 = str4;
            }
            str2 = str3;
        }
        if (z4) {
            if (z2) {
                height = ((i2 - staticLayout.getHeight()) / 2.0f) + i6;
            } else {
                height = i6;
            }
            canvas.translate(0.0f, height);
            staticLayout.draw(canvas);
        } else {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f2 = fontMetrics.bottom - fontMetrics.top;
            if (z2) {
                f2 = ((i2 - ((i2 - f2) / 2.0f)) - fontMetrics.bottom) - 1.0f;
            }
            if (z) {
                textPaint.setTextAlign(Paint.Align.CENTER);
                canvas.drawText(str2, (i / 2) + i5, f2 + i6, textPaint);
            } else {
                canvas.drawText(str2, i5, f2 + i6, textPaint);
            }
        }
        return bitmapCreateBitmap;
    }
}
