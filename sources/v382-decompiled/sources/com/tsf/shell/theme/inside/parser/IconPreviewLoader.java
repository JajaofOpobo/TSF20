package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.manager.a.i;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.SAXParserFactory;

/* loaded from: classes.dex */
public class IconPreviewLoader {
    private Map resource = new HashMap();

    public void recycle() {
        this.resource.clear();
    }

    private ArrayList getIconPreviewData(Context context, String str) {
        ArrayList arrayList = (ArrayList) this.resource.get(str);
        if (arrayList == null) {
            arrayList = getThemeIconDrawable(ac.a(context, str), 16);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            this.resource.put(str, arrayList);
        }
        return arrayList;
    }

    public Bitmap getIconPreviewBitmap(Context context, String str, int i) {
        ArrayList iconPreviewData = getIconPreviewData(context, str);
        if (iconPreviewData.size() == 0) {
            return null;
        }
        Context a = ac.a(context, str);
        int size = iconPreviewData.size();
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
            Bitmap packageBitmapResource = getPackageBitmapResource(a.getResources(), ((Integer) iconPreviewData.get(i3)).intValue());
            float max = Math.max(f3 / packageBitmapResource.getWidth(), f3 / packageBitmapResource.getHeight());
            canvas.save();
            canvas.scale(max, max);
            canvas.drawBitmap(packageBitmapResource, (((i3 % 4) * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), (((i3 / 4) * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), paint);
            canvas.restore();
            packageBitmapResource.recycle();
            i2 = i3 + 1;
        }
        return createBitmap;
    }

    public static Bitmap getIconPreviewBitmap(ArrayList arrayList, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = i * 0.08f;
        float f2 = ((1.0f - 0.08f) * i) / 4.0f;
        float f3 = f2 * (1.0f - 0.05f);
        float f4 = f2 * 0.05f;
        int size = arrayList.size() >= 16 ? 16 : arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 % 4;
            int i4 = i2 / 4;
            i bd = ((com.tsf.shell.e.i.b.e.i) arrayList.get(i2)).bd();
            if (bd != null) {
                Bitmap g = bd.g();
                float max = Math.max(f3 / g.getWidth(), f3 / g.getHeight());
                canvas.save();
                canvas.scale(max, max);
                canvas.drawBitmap(g, ((i3 * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), ((i4 * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), paint);
                canvas.restore();
                g.recycle();
            }
        }
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap getPackageBitmapResource(Resources resources, int i) {
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

    public static ArrayList getThemeIconDrawable(Context context, int i) {
        ArrayList themeIconFromAsset = getThemeIconFromAsset(context, i);
        if (themeIconFromAsset != null) {
            g.b("getThemeIconFromAsset:" + themeIconFromAsset.size());
            return themeIconFromAsset;
        }
        ArrayList themeIconFromXML = getThemeIconFromXML(context, i);
        if (themeIconFromXML != null) {
            g.b("getThemeIconFromXML:" + themeIconFromXML.size());
            return themeIconFromXML;
        }
        return null;
    }

    private static ArrayList getThemeIconFromXML(Context context, int i) {
        g.c("", "getThemeXMLContent use XML folder");
        ArrayList arrayList = new ArrayList();
        try {
            XmlResourceParser xml = context.getResources().getXml(context.getResources().getIdentifier("drawable", "xml", context.getPackageName()));
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("item")) {
                        Integer valueOf = Integer.valueOf(getDrawableResourceId(context, xml.getAttributeValue(0)));
                        if (valueOf.intValue() != 0) {
                            arrayList.add(valueOf);
                            if (arrayList.size() >= i) {
                                return arrayList;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else if (xml.getEventType() != 3) {
                    xml.getEventType();
                }
                xml.next();
            }
            return arrayList;
        } catch (Exception e) {
            g.a(e.getMessage());
            return null;
        }
    }

    private static ArrayList getThemeIconFromAsset(Context context, int i) {
        InputStream inputStream;
        a aVar = null;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            g.a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        a aVar2 = new a(aVar);
        aVar2.a(i);
        aVar2.a(context);
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, aVar2);
        } catch (Exception e2) {
            g.a(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            g.a(e3.getMessage());
        }
        return aVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDrawableResourceId(Context context, String str) {
        try {
            return context.getResources().getIdentifier(String.valueOf(context.getPackageName()) + ":drawable/" + str, null, null);
        } catch (Exception e) {
            g.a(e.getMessage());
            return 0;
        }
    }
}
