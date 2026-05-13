package android.support.p000a.p001a;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: android.support.a.a.d */
/* loaded from: classes.dex */
class C0009d {
    /* renamed from: a */
    public static boolean m13920a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static float m13923a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m13920a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static boolean m13921a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m13920a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static int m13922a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m13920a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static int m13919b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m13920a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }
}
