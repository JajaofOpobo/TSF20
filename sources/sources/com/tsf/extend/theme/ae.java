package com.tsf.extend.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ae {
    public static int a(Resources resources, String str, String str2) {
        return resources.getIdentifier(str2, "xml", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return xmlPullParser.getName();
    }

    public static String a(String str) {
        if ("themeInfo".equals(str)) {
            return "ThemeInfo";
        }
        return null;
    }

    public static abstract class a<R> {
        public R c;

        public abstract void a(TypedArray typedArray, String str);

        public abstract boolean a(String str);

        public R a(Context context, String str, String str2, HashMap<String, Object> map) {
            try {
                Resources resources = context.getResources();
                XmlResourceParser xml = resources.getXml(ae.a(resources, str, str2));
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                String strB = ae.b(xml);
                int depth = xml.getDepth();
                String strA = ae.a(strB);
                if (!a(strB) || strA == null) {
                    return null;
                }
                int[] iArrA = ae.a(map, strA);
                if (iArrA != null) {
                    while (true) {
                        int next = xml.next();
                        if ((next == 3 && xml.getDepth() <= depth) || next == 1) {
                            break;
                        }
                        if (next == 2) {
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, iArrA);
                            a(typedArrayObtainStyledAttributes, xml.getName());
                            typedArrayObtainStyledAttributes.recycle();
                        }
                    }
                }
            } catch (Exception e) {
            }
            return this.c;
        }
    }

    public static int[] a(HashMap<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return null;
    }

    public static f a(Context context, final HashMap<String, Object> map) {
        if (context == null) {
            return null;
        }
        final String packageName = context.getPackageName();
        return new a<f>() { // from class: com.tsf.extend.theme.ae.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [R, com.tsf.extend.theme.f] */
            @Override // com.tsf.extend.theme.ae.a
            public boolean a(String str) {
                if (!"themeInfo".equals(str)) {
                    return false;
                }
                this.c = new f();
                ((f) this.c).c(packageName);
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tsf.extend.theme.ae.a
            public void a(TypedArray typedArray, String str) {
                if ("info".equals(str)) {
                    ae.c(map, typedArray, (f) this.c);
                } else if ("pic".equals(str)) {
                    ae.d(map, typedArray, (f) this.c);
                }
            }
        }.a(context, packageName, "theme_info", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HashMap<String, Object> map, TypedArray typedArray, f fVar) {
        int iB = b(map, "ThemeInfo_author");
        int iB2 = b(map, "ThemeInfo_name");
        int iB3 = b(map, "ThemeInfo_versionName");
        String string = typedArray.getString(iB2);
        if (!TextUtils.isEmpty(string)) {
            String string2 = typedArray.getString(iB);
            String string3 = typedArray.getString(iB3);
            fVar.i(string2);
            fVar.d(string);
            fVar.j(string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(HashMap<String, Object> map, TypedArray typedArray, f fVar) {
        fVar.b().add(Integer.valueOf(typedArray.getResourceId(b(map, "ThemeInfo_src"), 0)));
    }

    public static int b(HashMap<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return -1;
    }
}
