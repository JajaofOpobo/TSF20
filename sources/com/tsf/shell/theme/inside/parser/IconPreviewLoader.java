package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3897k;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class IconPreviewLoader {
    private Map<String, ArrayList<Integer>> resource = new HashMap();

    public void recycle() {
        this.resource.clear();
    }

    private ArrayList<Integer> getIconPreviewData(Context context, String str) {
        ArrayList<Integer> arrayList = this.resource.get(str);
        if (arrayList == null) {
            arrayList = getThemeIconDrawable(C3897k.m1236a(context, str), 16);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.resource.put(str, arrayList);
        }
        return arrayList;
    }

    public Bitmap getIconPreviewBitmap(Context context, String str, int i) {
        ArrayList<Integer> iconPreviewData = getIconPreviewData(context, str);
        if (iconPreviewData.size() == 0) {
            return null;
        }
        Context m1236a = C3897k.m1236a(context, str);
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
            Bitmap packageBitmapResource = getPackageBitmapResource(m1236a.getResources(), iconPreviewData.get(i3).intValue());
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

    public static Bitmap getIconPreviewBitmap(ArrayList<C3222g> arrayList, int i) {
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
            C3377f m3106bd = arrayList.get(i2).m3106bd();
            if (m3106bd != null) {
                Bitmap m2695g = m3106bd.m2695g();
                float max = Math.max(f3 / m2695g.getWidth(), f3 / m2695g.getHeight());
                canvas.save();
                canvas.scale(max, max);
                canvas.drawBitmap(m2695g, ((i3 * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), ((i4 * f2) / max) + ((f4 / max) / 2.0f) + ((f / max) / 2.0f), paint);
                canvas.restore();
                m2695g.recycle();
            }
        }
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap getPackageBitmapResource(android.content.res.Resources r3, int r4) {
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
            C3851e.m1317b("getThemeIconFromAsset:" + themeIconFromAsset.size());
            return themeIconFromAsset;
        }
        ArrayList<Integer> themeIconFromXML = getThemeIconFromXML(context, i);
        if (themeIconFromXML != null) {
            C3851e.m1317b("getThemeIconFromXML:" + themeIconFromXML.size());
            return themeIconFromXML;
        }
        return null;
    }

    private static ArrayList<Integer> getThemeIconFromXML(Context context, int i) {
        C3851e.m1315c("", "getThemeXMLContent use XML folder");
        ArrayList<Integer> arrayList = new ArrayList<>();
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
                } else if (xml.getEventType() != 3 && xml.getEventType() == 4) {
                }
                xml.next();
            }
            return arrayList;
        } catch (Exception e) {
            C3851e.m1319a(e.getMessage());
            return null;
        }
    }

    private static ArrayList<Integer> getThemeIconFromAsset(Context context, int i) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            C3851e.m1319a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        C4163a c4163a = new C4163a();
        c4163a.m712a(i);
        c4163a.m711a(context);
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, c4163a);
        } catch (Exception e2) {
            C3851e.m1319a(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            C3851e.m1319a(e3.getMessage());
        }
        return c4163a.f13459a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDrawableResourceId(Context context, String str) {
        String packageName = context.getPackageName();
        try {
            return context.getResources().getIdentifier(packageName + ":drawable/" + str, null, null);
        } catch (Exception e) {
            C3851e.m1319a(e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.theme.inside.parser.IconPreviewLoader$a */
    /* loaded from: classes.dex */
    public static class C4163a extends DefaultHandler {

        /* renamed from: a */
        public ArrayList<Integer> f13459a;

        /* renamed from: b */
        private StringBuilder f13460b;

        /* renamed from: c */
        private int f13461c;

        /* renamed from: d */
        private Context f13462d;

        private C4163a() {
            this.f13460b = new StringBuilder();
            this.f13459a = new ArrayList<>();
            this.f13461c = 0;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            this.f13460b.setLength(0);
            if (str2.equals("item")) {
                Integer valueOf = Integer.valueOf(IconPreviewLoader.getDrawableResourceId(this.f13462d, attributes.getValue("drawable")));
                if (valueOf.intValue() != 0) {
                    this.f13459a.add(valueOf);
                    if (this.f13459a.size() >= this.f13461c) {
                        throw new SAXException();
                    }
                }
            }
        }

        /* renamed from: a */
        public void m712a(int i) {
            this.f13461c = i;
        }

        /* renamed from: a */
        public void m711a(Context context) {
            this.f13462d = context;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            super.characters(cArr, i, i2);
            this.f13460b.append(cArr, i, i2);
        }
    }
}
