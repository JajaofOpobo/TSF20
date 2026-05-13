package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.plugin.themepicker.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.SAXParserFactory;
/* loaded from: classes.dex */
public class d {
    private Map<String, ArrayList<Integer>> a = new HashMap();

    private ArrayList<Integer> a(Context context, String str) {
        ArrayList<Integer> arrayList = this.a.get(str);
        if (arrayList == null) {
            arrayList = a(k.a(context, str), 16);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.a.put(str, arrayList);
        }
        return arrayList;
    }

    public Bitmap a(Context context, String str, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Integer> a = a(context, str);
        com.tsf.shell.plugin.themepicker.e.b("parse cost :" + (System.currentTimeMillis() - currentTimeMillis) + "   size:" + a.size());
        Context a2 = k.a(context, str);
        int size = a.size();
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = i * 0.08f;
        float f2 = ((1.0f - 0.08f) * i) / 4.0f;
        float f3 = (1.0f - 0.05f) * f2;
        float f4 = f2 * 0.05f;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 16 || i3 >= size) {
                break;
            }
            Bitmap a3 = a(a2.getResources(), a.get(i3).intValue());
            float max = Math.max(f3 / a3.getWidth(), f3 / a3.getHeight());
            canvas.save();
            canvas.scale(max, max);
            canvas.drawBitmap(a3, (((i3 % 4) * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), (((i3 / 4) * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), paint);
            canvas.restore();
            a3.recycle();
            i2 = i3 + 1;
        }
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap a(android.content.res.Resources r3, int r4) {
        /*
            r0 = 0
            java.io.InputStream r2 = r3.openRawResource(r4)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L24
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r2 == 0) goto Le
            r2.close()     // Catch: java.io.IOException -> Lf
        Le:
            return r0
        Lf:
            r1 = move-exception
            r1.printStackTrace()
            goto Le
        L14:
            r1 = move-exception
            r2 = r0
        L16:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto Le
            r2.close()     // Catch: java.io.IOException -> L1f
            goto Le
        L1f:
            r1 = move-exception
            r1.printStackTrace()
            goto Le
        L24:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L27:
            if (r2 == 0) goto L2c
            r2.close()     // Catch: java.io.IOException -> L2d
        L2c:
            throw r0
        L2d:
            r1 = move-exception
            r1.printStackTrace()
            goto L2c
        L32:
            r0 = move-exception
            goto L27
        L34:
            r1 = move-exception
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.icondesigner.d.a(android.content.res.Resources, int):android.graphics.Bitmap");
    }

    public static ArrayList<Integer> a(Context context, int i) {
        ArrayList<Integer> c = c(context, i);
        if (c != null) {
            com.tsf.shell.plugin.themepicker.e.b("getThemeIconFromAsset:" + c.size());
            return c;
        }
        ArrayList<Integer> b = b(context, i);
        if (b != null) {
            com.tsf.shell.plugin.themepicker.e.b("getThemeIconFromXML:" + b.size());
            return b;
        }
        return null;
    }

    private static ArrayList<Integer> b(Context context, int i) {
        int i2 = 0;
        com.tsf.shell.plugin.themepicker.e.c("", "getThemeXMLContent use XML folder");
        ArrayList arrayList = new ArrayList();
        try {
            XmlResourceParser xml = context.getResources().getXml(context.getResources().getIdentifier("drawable", "xml", context.getPackageName()));
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("item")) {
                        arrayList.add(xml.getAttributeValue(0));
                        i2++;
                        if (i2 > i) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else if (xml.getEventType() != 3 && xml.getEventType() == 4) {
                }
                xml.next();
            }
            return a(context, arrayList);
        } catch (Exception e) {
            com.tsf.shell.plugin.themepicker.e.a(e.getMessage());
            return null;
        }
    }

    private static ArrayList<Integer> c(Context context, int i) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            com.tsf.shell.plugin.themepicker.e.a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        com.tsf.shell.plugin.themepicker.a aVar = new com.tsf.shell.plugin.themepicker.a();
        aVar.a(i);
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, aVar);
        } catch (Exception e2) {
            com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            com.tsf.shell.plugin.themepicker.e.a(e3.getMessage());
        }
        return a(context, aVar.a);
    }

    private static ArrayList<Integer> a(Context context, List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = list.size();
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        for (int i = 0; i < size; i++) {
            try {
                int identifier = resources.getIdentifier(packageName + ":drawable/" + list.get(i), null, null);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            } catch (Exception e) {
                com.tsf.shell.plugin.themepicker.e.a(e.getMessage());
            }
        }
        return arrayList;
    }
}
