package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.plugin.themepicker.ac;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.SAXParserFactory;

/* loaded from: classes.dex */
public class e {
    private Map a = new HashMap();

    private ArrayList a(Context context, String str) {
        ArrayList arrayList = (ArrayList) this.a.get(str);
        if (arrayList == null) {
            arrayList = a(ac.a(context, str), 16);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            this.a.put(str, arrayList);
        }
        return arrayList;
    }

    public Bitmap a(Context context, String str, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList a = a(context, str);
        com.tsf.shell.plugin.themepicker.g.b("parse cost :" + (System.currentTimeMillis() - currentTimeMillis) + "   size:" + a.size());
        Context a2 = ac.a(context, str);
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
            Bitmap a3 = a(a2.getResources(), ((Integer) a.get(i3)).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap a(Resources resources, int i) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            try {
                inputStream = resources.openRawResource(i);
                try {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return bitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
            if (inputStream != null) {
            }
            throw th;
        }
        return bitmap;
    }

    public static ArrayList a(Context context, int i) {
        ArrayList c = c(context, i);
        if (c != null) {
            com.tsf.shell.plugin.themepicker.g.b("getThemeIconFromAsset:" + c.size());
            return c;
        }
        ArrayList b = b(context, i);
        if (b != null) {
            com.tsf.shell.plugin.themepicker.g.b("getThemeIconFromXML:" + b.size());
            return b;
        }
        return null;
    }

    private static ArrayList b(Context context, int i) {
        int i2 = 0;
        com.tsf.shell.plugin.themepicker.g.c("", "getThemeXMLContent use XML folder");
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
                } else if (xml.getEventType() != 3) {
                    xml.getEventType();
                }
                xml.next();
            }
            return a(context, arrayList);
        } catch (Exception e) {
            com.tsf.shell.plugin.themepicker.g.a(e.getMessage());
            return null;
        }
    }

    private static ArrayList c(Context context, int i) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            com.tsf.shell.plugin.themepicker.g.a(e.getMessage());
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
            com.tsf.shell.plugin.themepicker.g.a(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            com.tsf.shell.plugin.themepicker.g.a(e3.getMessage());
        }
        return a(context, aVar.a);
    }

    private static ArrayList a(Context context, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        for (int i = 0; i < size; i++) {
            try {
                int identifier = resources.getIdentifier(String.valueOf(packageName) + ":drawable/" + ((String) list.get(i)), null, null);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            } catch (Exception e) {
                com.tsf.shell.plugin.themepicker.g.a(e.getMessage());
            }
        }
        return arrayList;
    }
}
