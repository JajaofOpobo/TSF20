package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.manager.a.f;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class IconPreviewLoader {
    private Map<String, ArrayList<Integer>> resource = new HashMap();

    public void recycle() {
        this.resource.clear();
    }

    private ArrayList<Integer> getIconPreviewData(Context context, String str) {
        ArrayList<Integer> themeIconDrawable = this.resource.get(str);
        if (themeIconDrawable == null) {
            themeIconDrawable = getThemeIconDrawable(k.a(context, str), 16);
            if (themeIconDrawable == null) {
                themeIconDrawable = new ArrayList<>();
            }
            this.resource.put(str, themeIconDrawable);
        }
        return themeIconDrawable;
    }

    public Bitmap getIconPreviewBitmap(Context context, String str, int i) throws Throwable {
        ArrayList<Integer> iconPreviewData = getIconPreviewData(context, str);
        if (iconPreviewData.size() == 0) {
            return null;
        }
        Context contextA = k.a(context, str);
        int size = iconPreviewData.size();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
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
            Bitmap packageBitmapResource = getPackageBitmapResource(contextA.getResources(), iconPreviewData.get(i3).intValue());
            float fMax = Math.max(f3 / packageBitmapResource.getWidth(), f3 / packageBitmapResource.getHeight());
            canvas.save();
            canvas.scale(fMax, fMax);
            canvas.drawBitmap(packageBitmapResource, (((i3 % 4) * f2) / fMax) + ((f4 / fMax) / 2.0f) + ((f / fMax) / 2.0f), (((i3 / 4) * f2) / fMax) + ((f4 / fMax) / 2.0f) + ((f / fMax) / 2.0f), paint);
            canvas.restore();
            packageBitmapResource.recycle();
            i2 = i3 + 1;
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap getIconPreviewBitmap(ArrayList<g> arrayList, int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
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
            f fVarBd = arrayList.get(i2).bd();
            if (fVarBd != null) {
                Bitmap bitmapG = fVarBd.g();
                float fMax = Math.max(f3 / bitmapG.getWidth(), f3 / bitmapG.getHeight());
                canvas.save();
                canvas.scale(fMax, fMax);
                canvas.drawBitmap(bitmapG, ((i3 * f2) / fMax) + ((f4 / fMax) / 2.0f) + ((f / fMax) / 2.0f), ((i4 * f2) / fMax) + ((f4 / fMax) / 2.0f) + ((f / fMax) / 2.0f), paint);
                canvas.restore();
                bitmapG.recycle();
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap getPackageBitmapResource(android.content.res.Resources r3, int r4) throws java.lang.Throwable {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.theme.inside.parser.IconPreviewLoader.getPackageBitmapResource(android.content.res.Resources, int):android.graphics.Bitmap");
    }

    public static ArrayList<Integer> getThemeIconDrawable(Context context, int i) {
        ArrayList<Integer> themeIconFromAsset = getThemeIconFromAsset(context, i);
        if (themeIconFromAsset != null) {
            e.b("getThemeIconFromAsset:" + themeIconFromAsset.size());
            return themeIconFromAsset;
        }
        ArrayList<Integer> themeIconFromXML = getThemeIconFromXML(context, i);
        if (themeIconFromXML != null) {
            e.b("getThemeIconFromXML:" + themeIconFromXML.size());
            return themeIconFromXML;
        }
        return null;
    }

    private static ArrayList<Integer> getThemeIconFromXML(Context context, int i) {
        e.c("", "getThemeXMLContent use XML folder");
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            XmlResourceParser xml = context.getResources().getXml(context.getResources().getIdentifier("drawable", "xml", context.getPackageName()));
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("item")) {
                        Integer numValueOf = Integer.valueOf(getDrawableResourceId(context, xml.getAttributeValue(0)));
                        if (numValueOf.intValue() != 0) {
                            arrayList.add(numValueOf);
                            if (arrayList.size() >= i) {
                                return arrayList;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else if (xml.getEventType() != 3 && xml.getEventType() == 4) {
                }
                xml.next();
            }
            return arrayList;
        } catch (Exception e) {
            e.a(e.getMessage());
            return null;
        }
    }

    private static ArrayList<Integer> getThemeIconFromAsset(Context context, int i) {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            e.a(e.getMessage());
            inputStreamOpen = null;
        }
        if (inputStreamOpen == null) {
            return null;
        }
        a aVar = new a();
        aVar.a(i);
        aVar.a(context);
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStreamOpen, aVar);
        } catch (Exception e2) {
            e.a(e2.getMessage());
        }
        try {
            inputStreamOpen.close();
        } catch (IOException e3) {
            e.a(e3.getMessage());
        }
        return aVar.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDrawableResourceId(Context context, String str) {
        try {
            return context.getResources().getIdentifier(context.getPackageName() + ":drawable/" + str, null, null);
        } catch (Exception e) {
            e.a(e.getMessage());
            return 0;
        }
    }

    private static class a extends DefaultHandler {
        public ArrayList<Integer> a;
        private StringBuilder b;
        private int c;
        private Context d;

        private a() {
            this.b = new StringBuilder();
            this.a = new ArrayList<>();
            this.c = 0;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.b.setLength(0);
            if (str2.equals("item")) {
                Integer numValueOf = Integer.valueOf(IconPreviewLoader.getDrawableResourceId(this.d, attributes.getValue("drawable")));
                if (numValueOf.intValue() != 0) {
                    this.a.add(numValueOf);
                    if (this.a.size() >= this.c) {
                        throw new SAXException();
                    }
                }
            }
        }

        public void a(int i) {
            this.c = i;
        }

        public void a(Context context) {
            this.d = context;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            super.characters(cArr, i, i2);
            this.b.append(cArr, i, i2);
        }
    }
}
