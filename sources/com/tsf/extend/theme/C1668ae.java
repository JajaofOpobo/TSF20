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
/* renamed from: com.tsf.extend.theme.ae */
/* loaded from: classes.dex */
public class C1668ae {
    /* renamed from: a */
    public static int m7890a(Resources resources, String str, String str2) {
        return resources.getIdentifier(str2, "xml", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m7883b(XmlPullParser xmlPullParser) {
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

    /* renamed from: a */
    public static String m7889a(String str) {
        if ("themeInfo".equals(str)) {
            return "ThemeInfo";
        }
        return null;
    }

    /* renamed from: com.tsf.extend.theme.ae$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1670a<R> {

        /* renamed from: c */
        public R f5343c;

        /* renamed from: a */
        public abstract void mo7879a(TypedArray typedArray, String str);

        /* renamed from: a */
        public abstract boolean mo7878a(String str);

        /* renamed from: a */
        public R m7880a(Context context, String str, String str2, HashMap<String, Object> hashMap) {
            XmlResourceParser xml;
            AttributeSet asAttributeSet;
            String m7883b;
            int depth;
            String m7889a;
            try {
                Resources resources = context.getResources();
                xml = resources.getXml(C1668ae.m7890a(resources, str, str2));
                asAttributeSet = Xml.asAttributeSet(xml);
                m7883b = C1668ae.m7883b(xml);
                depth = xml.getDepth();
                m7889a = C1668ae.m7889a(m7883b);
            } catch (Exception e) {
            }
            if (mo7878a(m7883b) && m7889a != null) {
                int[] m7887a = C1668ae.m7887a(hashMap, m7889a);
                if (m7887a != null) {
                    while (true) {
                        int next = xml.next();
                        if ((next == 3 && xml.getDepth() <= depth) || next == 1) {
                            break;
                        } else if (next == 2) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, m7887a);
                            mo7879a(obtainStyledAttributes, xml.getName());
                            obtainStyledAttributes.recycle();
                        }
                    }
                }
                return this.f5343c;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static int[] m7887a(HashMap<String, Object> hashMap, String str) {
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C1842f m7891a(Context context, final HashMap<String, Object> hashMap) {
        if (context == null) {
            return null;
        }
        final String packageName = context.getPackageName();
        return new AbstractC1670a<C1842f>() { // from class: com.tsf.extend.theme.ae.1
            /* JADX WARN: Type inference failed for: r0v2, types: [R, com.tsf.extend.theme.f] */
            @Override // com.tsf.extend.theme.C1668ae.AbstractC1670a
            /* renamed from: a */
            public boolean mo7878a(String str) {
                if (!"themeInfo".equals(str)) {
                    return false;
                }
                this.f5343c = new C1842f();
                ((C1842f) this.f5343c).m7310c(packageName);
                return true;
            }

            @Override // com.tsf.extend.theme.C1668ae.AbstractC1670a
            /* renamed from: a */
            public void mo7879a(TypedArray typedArray, String str) {
                if ("info".equals(str)) {
                    C1668ae.m7882c(hashMap, typedArray, (C1842f) this.f5343c);
                } else if ("pic".equals(str)) {
                    C1668ae.m7881d(hashMap, typedArray, (C1842f) this.f5343c);
                }
            }
        }.m7880a(context, packageName, "theme_info", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m7882c(HashMap<String, Object> hashMap, TypedArray typedArray, C1842f c1842f) {
        int m7884b = m7884b(hashMap, "ThemeInfo_author");
        int m7884b2 = m7884b(hashMap, "ThemeInfo_name");
        int m7884b3 = m7884b(hashMap, "ThemeInfo_versionName");
        String string = typedArray.getString(m7884b2);
        if (!TextUtils.isEmpty(string)) {
            String string2 = typedArray.getString(m7884b);
            String string3 = typedArray.getString(m7884b3);
            c1842f.m7292i(string2);
            c1842f.m7307d(string);
            c1842f.m7290j(string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m7881d(HashMap<String, Object> hashMap, TypedArray typedArray, C1842f c1842f) {
        c1842f.m7349b().add(Integer.valueOf(typedArray.getResourceId(m7884b(hashMap, "ThemeInfo_src"), 0)));
    }

    /* renamed from: b */
    public static int m7884b(HashMap<String, Object> hashMap, String str) {
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return -1;
    }
}
