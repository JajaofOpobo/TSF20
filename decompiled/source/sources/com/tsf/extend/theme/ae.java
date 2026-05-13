package com.tsf.extend.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class ae {
    public static int a(Resources resources, String str, String str2) {
        return resources.getIdentifier(str2, "xml", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(XmlPullParser xmlPullParser) {
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

    /* loaded from: classes.dex */
    public static abstract class a<R> {
        public R c;

        public abstract void a(TypedArray typedArray, String str);

        public abstract boolean a(String str);

        public R a(Context context, String str, String str2, HashMap<String, Object> hashMap) {
            XmlResourceParser xml;
            AttributeSet asAttributeSet;
            String b;
            int depth;
            String a;
            try {
                Resources resources = context.getResources();
                xml = resources.getXml(ae.a(resources, str, str2));
                asAttributeSet = Xml.asAttributeSet(xml);
                b = ae.b(xml);
                depth = xml.getDepth();
                a = ae.a(b);
            } catch (Exception e) {
            }
            if (a(b) && a != null) {
                int[] a2 = ae.a(hashMap, a);
                if (a2 != null) {
                    while (true) {
                        int next = xml.next();
                        if ((next == 3 && xml.getDepth() <= depth) || next == 1) {
                            break;
                        } else if (next == 2) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, a2);
                            a(obtainStyledAttributes, xml.getName());
                            obtainStyledAttributes.recycle();
                        }
                    }
                }
                return this.c;
            }
            return null;
        }
    }

    public static int[] a(HashMap<String, Object> hashMap, String str) {
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return null;
    }

    public static f a(Context context, final HashMap<String, Object> hashMap) {
        if (context == null) {
            return null;
        }
        final String packageName = context.getPackageName();
        return new a<f>() { // from class: com.tsf.extend.theme.ae.1
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

            @Override // com.tsf.extend.theme.ae.a
            public void a(TypedArray typedArray, String str) {
                if ("info".equals(str)) {
                    ae.c(hashMap, typedArray, (f) this.c);
                } else if ("pic".equals(str)) {
                    ae.d(hashMap, typedArray, (f) this.c);
                }
            }
        }.a(context, packageName, "theme_info", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HashMap<String, Object> hashMap, TypedArray typedArray, f fVar) {
        int b = b(hashMap, "ThemeInfo_author");
        int b2 = b(hashMap, "ThemeInfo_name");
        int b3 = b(hashMap, "ThemeInfo_versionName");
        String string = typedArray.getString(b2);
        if (!TextUtils.isEmpty(string)) {
            String string2 = typedArray.getString(b);
            String string3 = typedArray.getString(b3);
            fVar.i(string2);
            fVar.d(string);
            fVar.j(string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(HashMap<String, Object> hashMap, TypedArray typedArray, f fVar) {
        fVar.b().add(Integer.valueOf(typedArray.getResourceId(b(hashMap, "ThemeInfo_src"), 0)));
    }

    public static int b(HashMap<String, Object> hashMap, String str) {
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return -1;
    }
}
