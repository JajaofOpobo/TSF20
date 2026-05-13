package com.tsf.extend.p068a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.extend.a.e */
/* loaded from: classes.dex */
public class C1324e {

    /* renamed from: a */
    static float f4157a = 72.0f;

    /* renamed from: a */
    public static C1321b m9010a(InputStream inputStream) {
        return m9009a(inputStream, 0, 0, false, false, f4157a);
    }

    /* renamed from: a */
    public static C1321b m9012a(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        C1321b m9010a = m9010a(open);
        open.close();
        return m9010a;
    }

    /* renamed from: a */
    private static C1321b m9009a(InputStream inputStream, Integer num, Integer num2, boolean z, boolean z2, float f) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            C1332f c1332f = new C1332f(picture);
            c1332f.m8972a(num, num2);
            c1332f.m8964a(z);
            c1332f.m8985a(f);
            if (z2) {
                xMLReader.setContentHandler(c1332f);
                xMLReader.parse(new InputSource(inputStream));
            } else {
                C1326a c1326a = new C1326a(inputStream);
                C1328c c1328c = new C1328c();
                xMLReader.setContentHandler(c1328c);
                xMLReader.parse(new InputSource(c1326a.m8996a()));
                c1332f.f4186a = c1328c.f4173a;
                xMLReader.setContentHandler(c1332f);
                xMLReader.parse(new InputSource(c1326a.m8996a()));
            }
            Log.i("SVG", "Parsing complete in " + (System.currentTimeMillis() - currentTimeMillis) + " millis.");
            C1321b c1321b = new C1321b(picture, c1332f.f4200o);
            if (!Float.isInfinite(c1332f.f4201p.top)) {
                c1321b.m9014a(c1332f.f4201p);
            }
            return c1321b;
        } catch (Exception e) {
            Log.w("SVG", "Parse error: " + e);
            throw new C1323d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m9001d(String str) {
        return str;
    }

    /* renamed from: e */
    private static C1330d m8999e(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            if (z) {
                z = false;
            } else {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        String substring = str.substring(i, i2);
                        if (substring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                            if (charAt != '-') {
                                i = i2 + 1;
                                z = true;
                                break;
                            } else {
                                i = i2;
                                continue;
                            }
                        } else {
                            i++;
                            break;
                        }
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new C1330d(arrayList, i2);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException e) {
            }
            i = str.length();
        }
        return new C1330d(arrayList, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static Matrix m8998f(String str) {
        Matrix matrix = new Matrix();
        while (true) {
            m9007a(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= indexOf + 1) {
                break;
            }
            str = str.substring(indexOf + 1).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    /* renamed from: a */
    private static Matrix m9007a(String str, Matrix matrix) {
        float f;
        C1330d m8999e;
        C1330d m8999e2;
        float f2 = 0.0f;
        if (str.startsWith("matrix(")) {
            C1330d m8999e3 = m8999e(str.substring("matrix(".length()));
            if (m8999e3.f4179a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) m8999e3.f4179a.get(0)).floatValue(), ((Float) m8999e3.f4179a.get(2)).floatValue(), ((Float) m8999e3.f4179a.get(4)).floatValue(), ((Float) m8999e3.f4179a.get(1)).floatValue(), ((Float) m8999e3.f4179a.get(3)).floatValue(), ((Float) m8999e3.f4179a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            C1330d m8999e4 = m8999e(str.substring("translate(".length()));
            if (m8999e4.f4179a.size() > 0) {
                matrix.preTranslate(((Float) m8999e4.f4179a.get(0)).floatValue(), m8999e4.f4179a.size() > 1 ? ((Float) m8999e4.f4179a.get(1)).floatValue() : 0.0f);
            }
        } else if (str.startsWith("scale(")) {
            C1330d m8999e5 = m8999e(str.substring("scale(".length()));
            if (m8999e5.f4179a.size() > 0) {
                float floatValue = ((Float) m8999e5.f4179a.get(0)).floatValue();
                matrix.preScale(floatValue, m8999e5.f4179a.size() > 1 ? ((Float) m8999e5.f4179a.get(1)).floatValue() : floatValue);
            }
        } else if (str.startsWith("skewX(")) {
            if (m8999e(str.substring("skewX(".length())).f4179a.size() > 0) {
                matrix.preSkew((float) Math.tan(((Float) m8999e2.f4179a.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            if (m8999e(str.substring("skewY(".length())).f4179a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(((Float) m8999e.f4179a.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            C1330d m8999e6 = m8999e(str.substring("rotate(".length()));
            if (m8999e6.f4179a.size() > 0) {
                float floatValue2 = ((Float) m8999e6.f4179a.get(0)).floatValue();
                if (m8999e6.f4179a.size() > 2) {
                    float floatValue3 = ((Float) m8999e6.f4179a.get(1)).floatValue();
                    f2 = ((Float) m8999e6.f4179a.get(2)).floatValue();
                    f = floatValue3;
                } else {
                    f = 0.0f;
                }
                matrix.preTranslate(f, f2);
                matrix.preRotate(floatValue2);
                matrix.preTranslate(-f, -f2);
            }
        } else {
            Log.w("SVG", "Invalid transform (" + str + ")");
        }
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static Path m8997g(String str) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int length = str.length();
        C1320a c1320a = new C1320a(str, 0);
        c1320a.m9024a();
        Path path = new Path();
        RectF rectF = new RectF();
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        char c = 'x';
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (c1320a.f4149a < length) {
            char charAt = str.charAt(c1320a.f4149a);
            if (!Character.isDigit(charAt) && charAt != '.' && charAt != '-') {
                c1320a.m9019c();
            } else if (c == 'M') {
                charAt = 'L';
            } else {
                charAt = c == 'm' ? 'l' : c;
            }
            path.computeBounds(rectF, true);
            switch (charAt) {
                case 'A':
                case 'a':
                    float m9017e = c1320a.m9017e();
                    float m9017e2 = c1320a.m9017e();
                    float m9017e3 = c1320a.m9017e();
                    int m9017e4 = (int) c1320a.m9017e();
                    int m9017e5 = (int) c1320a.m9017e();
                    float m9017e6 = c1320a.m9017e();
                    float m9017e7 = c1320a.m9017e();
                    if (charAt == 'a') {
                        m9017e6 += f12;
                        m9017e7 += f13;
                    }
                    m9011a(path, f12, f13, m9017e6, m9017e7, m9017e, m9017e2, m9017e3, m9017e4 == 1, m9017e5 == 1);
                    z = false;
                    f = f8;
                    f2 = f9;
                    f4 = f10;
                    f3 = f11;
                    f6 = m9017e7;
                    f5 = m9017e6;
                    break;
                case 'C':
                case 'c':
                    float m9017e8 = c1320a.m9017e();
                    float m9017e9 = c1320a.m9017e();
                    float m9017e10 = c1320a.m9017e();
                    float m9017e11 = c1320a.m9017e();
                    float m9017e12 = c1320a.m9017e();
                    float m9017e13 = c1320a.m9017e();
                    if (charAt == 'c') {
                        m9017e10 += f12;
                        m9017e12 += f12;
                        m9017e9 += f13;
                        m9017e11 += f13;
                        m9017e13 += f13;
                        f7 = m9017e8 + f12;
                    } else {
                        f7 = m9017e8;
                    }
                    path.cubicTo(f7, m9017e9, m9017e10, m9017e11, m9017e12, m9017e13);
                    z = true;
                    f = f8;
                    f2 = f9;
                    float f14 = m9017e11;
                    f3 = m9017e10;
                    f4 = f14;
                    float f15 = m9017e13;
                    f5 = m9017e12;
                    f6 = f15;
                    break;
                case 'H':
                case 'h':
                    float m9017e14 = c1320a.m9017e();
                    if (charAt == 'h') {
                        path.rLineTo(m9017e14, 0.0f);
                        float f16 = m9017e14 + f12;
                        f = f8;
                        f2 = f9;
                        f4 = f10;
                        f3 = f11;
                        f5 = f16;
                        f6 = f13;
                        z = false;
                        break;
                    } else {
                        path.lineTo(m9017e14, f13);
                        f = f8;
                        f2 = f9;
                        f4 = f10;
                        f3 = f11;
                        f5 = m9017e14;
                        f6 = f13;
                        z = false;
                        break;
                    }
                case 'L':
                case 'l':
                    float m9017e15 = c1320a.m9017e();
                    float m9017e16 = c1320a.m9017e();
                    if (charAt == 'l') {
                        path.rLineTo(m9017e15, m9017e16);
                        float f17 = m9017e15 + f12;
                        float f18 = m9017e16 + f13;
                        z = false;
                        f = f8;
                        f2 = f9;
                        f4 = f10;
                        f3 = f11;
                        f5 = f17;
                        f6 = f18;
                        break;
                    } else {
                        path.lineTo(m9017e15, m9017e16);
                        z = false;
                        f = f8;
                        f2 = f9;
                        f4 = f10;
                        f3 = f11;
                        f5 = m9017e15;
                        f6 = m9017e16;
                        break;
                    }
                case 'M':
                case 'm':
                    float m9017e17 = c1320a.m9017e();
                    float m9017e18 = c1320a.m9017e();
                    if (charAt == 'm') {
                        path.rMoveTo(m9017e17, m9017e18);
                        float f19 = m9017e17 + f12;
                        f = f13 + m9017e18;
                        f2 = f19;
                    } else {
                        path.moveTo(m9017e17, m9017e18);
                        f = m9017e18;
                        f2 = m9017e17;
                    }
                    z = false;
                    f4 = f10;
                    f3 = f11;
                    f6 = f;
                    f5 = f2;
                    break;
                case 'Q':
                case 'q':
                    float m9017e19 = c1320a.m9017e();
                    float m9017e20 = c1320a.m9017e();
                    float m9017e21 = c1320a.m9017e();
                    float m9017e22 = c1320a.m9017e();
                    if (charAt == 'q') {
                        m9017e21 += f12;
                        m9017e22 += f13;
                        m9017e19 += f12;
                        m9017e20 += f13;
                    }
                    path.cubicTo(f12, f13, m9017e19, m9017e20, m9017e21, m9017e22);
                    z = true;
                    f = f8;
                    f2 = f9;
                    float f20 = m9017e20;
                    f3 = m9017e19;
                    f4 = f20;
                    float f21 = m9017e22;
                    f5 = m9017e21;
                    f6 = f21;
                    break;
                case 'S':
                case 's':
                    float m9017e23 = c1320a.m9017e();
                    float m9017e24 = c1320a.m9017e();
                    float m9017e25 = c1320a.m9017e();
                    float m9017e26 = c1320a.m9017e();
                    if (charAt == 's') {
                        m9017e23 += f12;
                        m9017e25 += f12;
                        m9017e24 += f13;
                        m9017e26 += f13;
                    }
                    path.cubicTo((f12 * 2.0f) - f11, (2.0f * f13) - f10, m9017e23, m9017e24, m9017e25, m9017e26);
                    z = true;
                    f = f8;
                    f2 = f9;
                    float f22 = m9017e24;
                    f3 = m9017e23;
                    f4 = f22;
                    float f23 = m9017e26;
                    f5 = m9017e25;
                    f6 = f23;
                    break;
                case 'T':
                case 't':
                    float m9017e27 = c1320a.m9017e();
                    float m9017e28 = c1320a.m9017e();
                    if (charAt == 't') {
                        m9017e27 += f12;
                        m9017e28 += f13;
                    }
                    float f24 = (2.0f * f12) - f11;
                    float f25 = (2.0f * f13) - f10;
                    path.cubicTo(f12, f13, f24, f25, m9017e27, m9017e28);
                    z = true;
                    f = f8;
                    f2 = f9;
                    f3 = f24;
                    f4 = f25;
                    float f26 = m9017e28;
                    f5 = m9017e27;
                    f6 = f26;
                    break;
                case 'V':
                case 'v':
                    float m9017e29 = c1320a.m9017e();
                    if (charAt == 'v') {
                        path.rLineTo(0.0f, m9017e29);
                        float f27 = m9017e29 + f13;
                        z = false;
                        f2 = f9;
                        f4 = f10;
                        f3 = f11;
                        f6 = f27;
                        f5 = f12;
                        f = f8;
                        break;
                    } else {
                        path.lineTo(f12, m9017e29);
                        z = false;
                        f2 = f9;
                        f4 = f10;
                        f3 = f11;
                        f6 = m9017e29;
                        f5 = f12;
                        f = f8;
                        break;
                    }
                case 'Z':
                case 'z':
                    path.close();
                    z = false;
                    f = f8;
                    f2 = f9;
                    f4 = f10;
                    f3 = f11;
                    f6 = f8;
                    f5 = f9;
                    break;
                default:
                    Log.w("SVG", "Invalid path command: " + charAt);
                    c1320a.m9019c();
                    f2 = f9;
                    f4 = f10;
                    f3 = f11;
                    f6 = f13;
                    f5 = f12;
                    f = f8;
                    z = false;
                    break;
            }
            if (!z) {
                f4 = f6;
                f3 = f5;
            }
            c1320a.m9024a();
            f8 = f;
            f9 = f2;
            f10 = f4;
            f11 = f3;
            f13 = f6;
            c = charAt;
            f12 = f5;
        }
        return path;
    }

    /* renamed from: a */
    private static void m9011a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10;
        double d11;
        double d12 = (d - d3) / 2.0d;
        double d13 = (d2 - d4) / 2.0d;
        double radians = Math.toRadians(d7 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d14 = (cos * d12) + (sin * d13);
        double d15 = (d12 * (-sin)) + (d13 * cos);
        double abs = Math.abs(d5);
        double abs2 = Math.abs(d6);
        double d16 = abs * abs;
        double d17 = abs2 * abs2;
        double d18 = d14 * d14;
        double d19 = d15 * d15;
        double d20 = (d18 / d16) + (d19 / d17);
        if (d20 > 1.0d) {
            double sqrt = abs * Math.sqrt(d20);
            double sqrt2 = abs2 * Math.sqrt(d20);
            d8 = sqrt2;
            d9 = sqrt;
            d10 = sqrt2 * sqrt2;
            d11 = sqrt * sqrt;
        } else {
            d8 = abs2;
            d9 = abs;
            d10 = d17;
            d11 = d16;
        }
        double d21 = z == z2 ? -1.0d : 1.0d;
        double d22 = (((d11 * d10) - (d11 * d19)) - (d10 * d18)) / ((d10 * d18) + (d11 * d19));
        if (d22 < 0.0d) {
            d22 = 0.0d;
        }
        double sqrt3 = Math.sqrt(d22) * d21;
        double d23 = ((d9 * d15) / d8) * sqrt3;
        double d24 = sqrt3 * (-((d8 * d14) / d9));
        double d25 = ((d + d3) / 2.0d) + ((cos * d23) - (sin * d24));
        double d26 = ((d2 + d4) / 2.0d) + (cos * d24) + (sin * d23);
        double d27 = (d14 - d23) / d9;
        double d28 = (d15 - d24) / d8;
        double d29 = ((-d14) - d23) / d9;
        double d30 = ((-d15) - d24) / d8;
        double degrees = Math.toDegrees((d28 < 0.0d ? -1.0d : 1.0d) * Math.acos(d27 / Math.sqrt((d27 * d27) + (d28 * d28))));
        double degrees2 = Math.toDegrees(((d27 * d30) - (d29 * d28) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d28 * d30) + (d27 * d29)) / Math.sqrt(((d27 * d27) + (d28 * d28)) * ((d29 * d29) + (d30 * d30)))));
        if (!z2 && degrees2 > 0.0d) {
            degrees2 -= 360.0d;
        } else if (z2 && degrees2 < 0.0d) {
            degrees2 += 360.0d;
        }
        path.addArc(new RectF((float) (d25 - d9), (float) (d26 - d8), (float) (d25 + d9), (float) (d26 + d8)), (float) (degrees % 360.0d), (float) (degrees2 % 360.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static C1330d m9002c(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return m8999e(attributes.getValue(i));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m9000d(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    /* renamed from: com.tsf.extend.a.e$a */
    /* loaded from: classes.dex */
    public static class C1326a {

        /* renamed from: a */
        private InputStream f4158a;

        /* renamed from: b */
        private ByteArrayOutputStream f4159b;

        public C1326a(InputStream inputStream) {
            this.f4158a = inputStream;
            try {
                m8995b();
            } catch (IOException e) {
                System.out.println("IOException in CopyInputStream");
                System.out.println(e.toString());
            }
        }

        /* renamed from: b */
        private int m8995b() {
            this.f4159b = new ByteArrayOutputStream();
            byte[] bArr = new byte[ItemInfo.APP_VERSION_CODE];
            int i = 0;
            while (true) {
                int read = this.f4158a.read(bArr);
                if (-1 != read) {
                    i += bArr.length;
                    this.f4159b.write(bArr, 0, read);
                } else {
                    this.f4159b.flush();
                    return i;
                }
            }
        }

        /* renamed from: a */
        public ByteArrayInputStream m8996a() {
            return new ByteArrayInputStream(this.f4159b.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$d */
    /* loaded from: classes.dex */
    public static class C1330d {

        /* renamed from: a */
        private ArrayList<Float> f4179a;

        /* renamed from: b */
        private int f4180b;

        public C1330d(ArrayList<Float> arrayList, int i) {
            this.f4179a = arrayList;
            this.f4180b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$b */
    /* loaded from: classes.dex */
    public static class C1327b {

        /* renamed from: a */
        String f4160a;

        /* renamed from: b */
        String f4161b;

        /* renamed from: c */
        boolean f4162c;

        /* renamed from: d */
        float f4163d;

        /* renamed from: e */
        float f4164e;

        /* renamed from: f */
        float f4165f;

        /* renamed from: g */
        float f4166g;

        /* renamed from: h */
        float f4167h;

        /* renamed from: i */
        float f4168i;

        /* renamed from: j */
        float f4169j;

        /* renamed from: k */
        ArrayList<Float> f4170k;

        /* renamed from: l */
        ArrayList<Integer> f4171l;

        /* renamed from: m */
        Matrix f4172m;

        private C1327b() {
            this.f4170k = new ArrayList<>();
            this.f4171l = new ArrayList<>();
            this.f4172m = null;
        }

        /* renamed from: a */
        public C1327b m8994a(C1327b c1327b) {
            C1327b c1327b2 = new C1327b();
            c1327b2.f4160a = c1327b.f4160a;
            c1327b2.f4161b = this.f4160a;
            c1327b2.f4162c = c1327b.f4162c;
            c1327b2.f4163d = c1327b.f4163d;
            c1327b2.f4165f = c1327b.f4165f;
            c1327b2.f4164e = c1327b.f4164e;
            c1327b2.f4166g = c1327b.f4166g;
            c1327b2.f4167h = c1327b.f4167h;
            c1327b2.f4168i = c1327b.f4168i;
            c1327b2.f4169j = c1327b.f4169j;
            c1327b2.f4170k = this.f4170k;
            c1327b2.f4171l = this.f4171l;
            c1327b2.f4172m = this.f4172m;
            if (c1327b.f4172m != null) {
                if (this.f4172m == null) {
                    c1327b2.f4172m = c1327b.f4172m;
                } else {
                    Matrix matrix = new Matrix(this.f4172m);
                    matrix.preConcat(c1327b.f4172m);
                    c1327b2.f4172m = matrix;
                }
            }
            return c1327b2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$g */
    /* loaded from: classes.dex */
    public static class C1334g {

        /* renamed from: a */
        HashMap<String, String> f4220a;

        private C1334g(String str) {
            this.f4220a = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    this.f4220a.put(split[0], split[1]);
                }
            }
        }

        /* renamed from: a */
        public String m8955a(String str) {
            return this.f4220a.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$e */
    /* loaded from: classes.dex */
    public static class C1331e {

        /* renamed from: a */
        C1334g f4181a;

        /* renamed from: b */
        Attributes f4182b;

        private C1331e(Attributes attributes) {
            this.f4181a = null;
            this.f4182b = attributes;
            String m9000d = C1324e.m9000d("style", attributes);
            if (m9000d != null) {
                this.f4181a = new C1334g(m9000d);
            }
        }

        /* renamed from: a */
        public String m8990a(String str) {
            String str2 = null;
            if (this.f4181a != null) {
                str2 = this.f4181a.m8955a(str);
            }
            if (str2 == null) {
                return C1324e.m9000d(str, this.f4182b);
            }
            return str2;
        }

        /* renamed from: b */
        public String m8989b(String str) {
            return m8990a(str);
        }

        /* renamed from: c */
        public Integer m8988c(String str) {
            String m8990a = m8990a(str);
            if (m8990a == null) {
                return null;
            }
            if (m8990a.startsWith("#") && (m8990a.length() == 4 || m8990a.length() == 7)) {
                try {
                    int parseInt = Integer.parseInt(m8990a.substring(1), 16);
                    if (m8990a.length() == 4) {
                        parseInt = m8991a(parseInt);
                    }
                    return Integer.valueOf(parseInt);
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            return C1322c.m9013a(m8990a);
        }

        /* renamed from: a */
        private int m8991a(int i) {
            return ((i & 3840) << 8) | ((i & 3840) << 12) | ((i & 240) << 4) | ((i & 240) << 8) | ((i & 15) << 4) | (i & 15);
        }

        /* renamed from: d */
        public Float m8987d(String str) {
            String m8990a = m8990a(str);
            if (m8990a == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(m8990a));
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$c */
    /* loaded from: classes.dex */
    public static class C1328c extends DefaultHandler {

        /* renamed from: a */
        HashMap<String, String> f4173a;

        /* renamed from: b */
        Stack<C1329a> f4174b;

        private C1328c() {
            this.f4173a = new HashMap<>();
            this.f4174b = new Stack<>();
        }

        /* renamed from: com.tsf.extend.a.e$c$a */
        /* loaded from: classes.dex */
        class C1329a {

            /* renamed from: a */
            String f4175a;

            /* renamed from: b */
            int f4176b = 0;

            /* renamed from: c */
            StringBuilder f4177c = new StringBuilder();

            public C1329a(String str) {
                this.f4175a = str;
            }
        }

        /* renamed from: a */
        private void m8993a(StringBuilder sb, String str, String str2, String str3, Attributes attributes) {
            sb.append("<");
            sb.append(str2);
            for (int i = 0; i < attributes.getLength(); i++) {
                sb.append(" ");
                sb.append(attributes.getQName(i));
                sb.append("='");
                sb.append(C1324e.m9001d(attributes.getValue(i)));
                sb.append("'");
            }
            sb.append(">");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String value = attributes.getValue("id");
            if (value != null) {
                this.f4174b.push(new C1329a(value));
            }
            if (this.f4174b.size() > 0) {
                C1329a lastElement = this.f4174b.lastElement();
                lastElement.f4176b++;
                m8993a(lastElement.f4177c, str, str2, str3, attributes);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            if (this.f4174b.size() > 0) {
                C1329a lastElement = this.f4174b.lastElement();
                lastElement.f4177c.append("</");
                lastElement.f4177c.append(str2);
                lastElement.f4177c.append(">");
                lastElement.f4176b--;
                if (lastElement.f4176b == 0) {
                    String sb = lastElement.f4177c.toString();
                    this.f4173a.put(lastElement.f4175a, sb);
                    this.f4174b.pop();
                    if (this.f4174b.size() > 0) {
                        this.f4174b.lastElement().f4177c.append(sb);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$f */
    /* loaded from: classes.dex */
    public static class C1332f extends DefaultHandler {

        /* renamed from: C */
        private static final Matrix f4183C = new Matrix();

        /* renamed from: A */
        private boolean f4184A;

        /* renamed from: B */
        private boolean f4185B;

        /* renamed from: a */
        HashMap<String, String> f4186a;

        /* renamed from: b */
        Picture f4187b;

        /* renamed from: c */
        Canvas f4188c;

        /* renamed from: d */
        Paint f4189d;

        /* renamed from: e */
        boolean f4190e;

        /* renamed from: f */
        Stack<Paint> f4191f;

        /* renamed from: g */
        Stack<Boolean> f4192g;

        /* renamed from: h */
        Paint f4193h;

        /* renamed from: i */
        boolean f4194i;

        /* renamed from: j */
        Stack<Paint> f4195j;

        /* renamed from: k */
        Stack<Boolean> f4196k;

        /* renamed from: l */
        float f4197l;

        /* renamed from: m */
        Stack<Float> f4198m;

        /* renamed from: n */
        RectF f4199n;

        /* renamed from: o */
        RectF f4200o;

        /* renamed from: p */
        RectF f4201p;

        /* renamed from: q */
        Integer f4202q;

        /* renamed from: r */
        Integer f4203r;

        /* renamed from: s */
        boolean f4204s;

        /* renamed from: t */
        float f4205t;

        /* renamed from: u */
        HashMap<String, Shader> f4206u;

        /* renamed from: v */
        HashMap<String, C1327b> f4207v;

        /* renamed from: w */
        C1327b f4208w;

        /* renamed from: x */
        C1333a f4209x;

        /* renamed from: y */
        private boolean f4210y;

        /* renamed from: z */
        private int f4211z;

        private C1332f(Picture picture) {
            this.f4186a = new HashMap<>();
            this.f4190e = false;
            this.f4191f = new Stack<>();
            this.f4192g = new Stack<>();
            this.f4194i = false;
            this.f4195j = new Stack<>();
            this.f4196k = new Stack<>();
            this.f4197l = 1.0f;
            this.f4198m = new Stack<>();
            this.f4199n = new RectF();
            this.f4200o = null;
            this.f4201p = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
            this.f4202q = null;
            this.f4203r = null;
            this.f4204s = false;
            this.f4205t = C1324e.f4157a;
            this.f4210y = false;
            this.f4211z = 0;
            this.f4184A = false;
            this.f4206u = new HashMap<>();
            this.f4207v = new HashMap<>();
            this.f4208w = null;
            this.f4209x = null;
            this.f4185B = false;
            this.f4187b = picture;
            this.f4189d = new Paint();
            this.f4189d.setAntiAlias(true);
            this.f4189d.setStyle(Paint.Style.STROKE);
            this.f4193h = new Paint();
            this.f4193h.setAntiAlias(true);
            this.f4193h.setStyle(Paint.Style.FILL);
        }

        /* renamed from: a */
        public void m8985a(float f) {
            this.f4205t = f;
        }

        /* renamed from: a */
        public void m8972a(Integer num, Integer num2) {
            this.f4202q = num;
            this.f4203r = num2;
        }

        /* renamed from: a */
        public void m8964a(boolean z) {
            this.f4204s = z;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public boolean m8977a(C1331e c1331e, HashMap<String, Shader> hashMap) {
            if ("none".equals(c1331e.m8989b("display"))) {
                return false;
            }
            if (this.f4204s) {
                this.f4193h.setShader(null);
                this.f4193h.setColor(-1);
                return true;
            }
            String m8989b = c1331e.m8989b("fill");
            if (m8989b != null) {
                if (m8989b.startsWith("url(#")) {
                    String substring = m8989b.substring("url(#".length(), m8989b.length() - 1);
                    Shader shader = hashMap.get(substring);
                    if (shader != null) {
                        this.f4193h.setShader(shader);
                        Float m8987d = c1331e.m8987d("opacity");
                        if (m8987d == null) {
                            this.f4193h.setAlpha(255);
                            return true;
                        }
                        this.f4193h.setAlpha((int) (m8987d.floatValue() * 255.0f));
                        return true;
                    }
                    Log.w("SVG", "Didn't find shader, using black: " + substring);
                    this.f4193h.setShader(null);
                    m8978a(c1331e, (Integer) (-16777216), true, this.f4193h);
                    return true;
                } else if (m8989b.equalsIgnoreCase("none")) {
                    this.f4193h.setShader(null);
                    this.f4193h.setColor(0);
                    return true;
                } else {
                    this.f4193h.setShader(null);
                    Integer m8988c = c1331e.m8988c("fill");
                    if (m8988c != null) {
                        m8978a(c1331e, m8988c, true, this.f4193h);
                        return true;
                    }
                    Log.w("SVG", "Unrecognized fill color, using black: " + m8989b);
                    m8978a(c1331e, (Integer) (-16777216), true, this.f4193h);
                    return true;
                }
            } else if (this.f4194i) {
                return this.f4193h.getColor() != 0;
            } else {
                this.f4193h.setShader(null);
                this.f4193h.setColor(-16777216);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public boolean m8965a(Attributes attributes, Paint paint) {
            if ("none".equals(attributes.getValue("display"))) {
                return false;
            }
            if (attributes.getValue("font-size") != null) {
                paint.setTextSize(m8967a("font-size", attributes, Float.valueOf(10.0f)).floatValue());
            }
            Typeface m8960d = m8960d(attributes);
            if (m8960d != null) {
                paint.setTypeface(m8960d);
            }
            if (m8961c(attributes) != null) {
                paint.setTextAlign(m8961c(attributes));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public boolean m8979a(C1331e c1331e) {
            if (this.f4204s || "none".equals(c1331e.m8989b("display"))) {
                return false;
            }
            Float m8987d = c1331e.m8987d("stroke-width");
            if (m8987d != null) {
                this.f4189d.setStrokeWidth(m8987d.floatValue());
            }
            if (this.f4189d.getStrokeWidth() > 0.0f) {
                String m8989b = c1331e.m8989b("stroke-linecap");
                if ("round".equals(m8989b)) {
                    this.f4189d.setStrokeCap(Paint.Cap.ROUND);
                } else if ("square".equals(m8989b)) {
                    this.f4189d.setStrokeCap(Paint.Cap.SQUARE);
                } else if ("butt".equals(m8989b)) {
                    this.f4189d.setStrokeCap(Paint.Cap.BUTT);
                }
                String m8989b2 = c1331e.m8989b("stroke-linejoin");
                if ("miter".equals(m8989b2)) {
                    this.f4189d.setStrokeJoin(Paint.Join.MITER);
                } else if ("round".equals(m8989b2)) {
                    this.f4189d.setStrokeJoin(Paint.Join.ROUND);
                } else if ("bevel".equals(m8989b2)) {
                    this.f4189d.setStrokeJoin(Paint.Join.BEVEL);
                }
                m8970a(c1331e.m8989b("stroke-dasharray"), c1331e.m8989b("stroke-dashoffset"));
                String m8990a = c1331e.m8990a("stroke");
                if (m8990a != null) {
                    if (m8990a.equalsIgnoreCase("none")) {
                        this.f4189d.setColor(0);
                        return false;
                    }
                    Integer m8988c = c1331e.m8988c("stroke");
                    if (m8988c != null) {
                        m8978a(c1331e, m8988c, false, this.f4189d);
                        return true;
                    }
                    Log.d("SVG", "Unrecognized stroke color, using none: " + m8990a);
                    this.f4189d.setColor(0);
                    return false;
                } else if (this.f4190e) {
                    return this.f4189d.getColor() != 0;
                } else {
                    this.f4189d.setColor(0);
                    return false;
                }
            }
            return false;
        }

        /* renamed from: a */
        private C1327b m8963a(boolean z, Attributes attributes) {
            C1327b c1327b = new C1327b();
            c1327b.f4160a = C1324e.m9000d("id", attributes);
            c1327b.f4162c = z;
            if (z) {
                c1327b.f4163d = m8967a("x1", attributes, Float.valueOf(0.0f)).floatValue();
                c1327b.f4165f = m8967a("x2", attributes, Float.valueOf(0.0f)).floatValue();
                c1327b.f4164e = m8967a("y1", attributes, Float.valueOf(0.0f)).floatValue();
                c1327b.f4166g = m8967a("y2", attributes, Float.valueOf(0.0f)).floatValue();
            } else {
                c1327b.f4167h = m8967a("cx", attributes, Float.valueOf(0.0f)).floatValue();
                c1327b.f4168i = m8967a("cy", attributes, Float.valueOf(0.0f)).floatValue();
                c1327b.f4169j = m8967a("r", attributes, Float.valueOf(0.0f)).floatValue();
            }
            String m9000d = C1324e.m9000d("gradientTransform", attributes);
            if (m9000d != null) {
                c1327b.f4172m = C1324e.m8998f(m9000d);
            }
            String m9000d2 = C1324e.m9000d("href", attributes);
            if (m9000d2 != null) {
                if (m9000d2.startsWith("#")) {
                    m9000d2 = m9000d2.substring(1);
                }
                c1327b.f4161b = m9000d2;
            }
            return c1327b;
        }

        /* renamed from: a */
        private void m8978a(C1331e c1331e, Integer num, boolean z, Paint paint) {
            paint.setColor(m8982a(num.intValue()) | (-16777216));
            Float m8987d = c1331e.m8987d("opacity");
            if (m8987d == null) {
                m8987d = c1331e.m8987d(z ? "fill-opacity" : "stroke-opacity");
            }
            if (m8987d == null) {
                m8987d = Float.valueOf(1.0f);
            }
            paint.setAlpha((int) (m8987d.floatValue() * 255.0f * this.f4197l));
        }

        /* renamed from: a */
        private int m8982a(int i) {
            int i2 = 16777215 & i;
            if (this.f4202q != null && this.f4202q.intValue() == i2 && this.f4203r != null) {
                Log.d("SVG", String.format("Replacing color: 0x%x->0x%x", Integer.valueOf(i2), this.f4203r));
                return this.f4203r.intValue();
            }
            return i2;
        }

        /* renamed from: a */
        private void m8970a(String str, String str2) {
            int i = 0;
            float f = 0.0f;
            if (str != null) {
                if (str.equals("none")) {
                    this.f4189d.setPathEffect(null);
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ,");
                int countTokens = stringTokenizer.countTokens();
                if ((countTokens & 1) == 1) {
                    countTokens *= 2;
                }
                float[] fArr = new float[countTokens];
                float f2 = 1.0f;
                float f3 = 0.0f;
                int i2 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    f2 = m8971a(stringTokenizer.nextToken(), f2);
                    fArr[i2] = f2;
                    f3 += f2;
                    i2++;
                }
                while (i2 < fArr.length) {
                    float f4 = fArr[i];
                    fArr[i2] = f4;
                    f3 += f4;
                    i2++;
                    i++;
                }
                if (str2 != null) {
                    try {
                        f = Float.parseFloat(str2) % f3;
                    } catch (NumberFormatException e) {
                    }
                }
                this.f4189d.setPathEffect(new DashPathEffect(fArr, f));
            }
        }

        /* renamed from: a */
        private static float m8971a(String str, float f) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException e) {
                return f;
            }
        }

        /* renamed from: a */
        private void m8984a(float f, float f2) {
            if (f < this.f4201p.left) {
                this.f4201p.left = f;
            }
            if (f > this.f4201p.right) {
                this.f4201p.right = f;
            }
            if (f2 < this.f4201p.top) {
                this.f4201p.top = f2;
            }
            if (f2 > this.f4201p.bottom) {
                this.f4201p.bottom = f2;
            }
        }

        /* renamed from: a */
        private void m8983a(float f, float f2, float f3, float f4) {
            m8984a(f, f2);
            m8984a(f + f3, f2 + f4);
        }

        /* renamed from: a */
        private void m8980a(Path path) {
            path.computeBounds(this.f4199n, false);
            m8984a(this.f4199n.left, this.f4199n.top);
            m8984a(this.f4199n.right, this.f4199n.bottom);
        }

        /* renamed from: a */
        private void m8966a(Attributes attributes) {
            String m9000d = C1324e.m9000d("transform", attributes);
            Matrix m8998f = m9000d == null ? f4183C : C1324e.m8998f(m9000d);
            this.f4188c.save();
            this.f4188c.concat(m8998f);
        }

        /* renamed from: a */
        private void m8986a() {
            this.f4188c.restore();
        }

        /* renamed from: a */
        private void m8981a(Canvas canvas, float f, float f2, float f3, float f4, byte[] bArr) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (decodeByteArray != null) {
                decodeByteArray.prepareToDraw();
                Paint paint = new Paint(3);
                RectF rectF = new RectF(f, f2, f + f3, f2 + f4);
                canvas.clipRect(rectF, Region.Op.REPLACE);
                canvas.drawBitmap(decodeByteArray, (Rect) null, rectF, paint);
                decodeByteArray.recycle();
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String str4;
            String str5;
            int i;
            if (!this.f4190e) {
                this.f4189d.setAlpha(255);
            }
            if (!this.f4194i) {
                this.f4193h.setAlpha(255);
            }
            if (this.f4184A) {
                if (str2.equals("rect")) {
                    Float m8969a = m8969a("x", attributes);
                    if (m8969a == null) {
                        m8969a = Float.valueOf(0.0f);
                    }
                    Float m8969a2 = m8969a("y", attributes);
                    if (m8969a2 == null) {
                        m8969a2 = Float.valueOf(0.0f);
                    }
                    this.f4200o = new RectF(m8969a.floatValue(), m8969a2.floatValue(), m8969a.floatValue() + m8969a("width", attributes).floatValue(), m8969a2.floatValue() + m8969a("height", attributes).floatValue());
                }
            } else if (!this.f4185B) {
                if (str2.equals("svg")) {
                    this.f4188c = this.f4187b.beginRecording((int) Math.ceil(m8969a("width", attributes).floatValue()), (int) Math.ceil(m8969a("height", attributes).floatValue()));
                } else if (str2.equals("defs")) {
                    this.f4185B = true;
                } else if (str2.equals("linearGradient")) {
                    this.f4208w = m8963a(true, attributes);
                } else if (str2.equals("radialGradient")) {
                    this.f4208w = m8963a(false, attributes);
                } else if (str2.equals("stop")) {
                    if (this.f4208w != null) {
                        float floatValue = m8969a("offset", attributes).floatValue();
                        C1334g c1334g = new C1334g(C1324e.m9000d("style", attributes));
                        String m8955a = c1334g.m8955a("stop-color");
                        int i2 = -16777216;
                        if (m8955a != null) {
                            if (m8955a.startsWith("#")) {
                                i2 = Integer.parseInt(m8955a.substring(1), 16);
                            } else {
                                i2 = Integer.parseInt(m8955a, 16);
                            }
                        }
                        int m8982a = m8982a(i2);
                        String m8955a2 = c1334g.m8955a("stop-opacity");
                        if (m8955a2 != null) {
                            i = m8982a | (Math.round(Float.parseFloat(m8955a2) * 255.0f) << 24);
                        } else {
                            i = m8982a | (-16777216);
                        }
                        this.f4208w.f4170k.add(Float.valueOf(floatValue));
                        this.f4208w.f4171l.add(Integer.valueOf(i));
                    }
                } else if (str2.equals("use")) {
                    String value = attributes.getValue("xlink:href");
                    String value2 = attributes.getValue("transform");
                    String value3 = attributes.getValue("x");
                    String value4 = attributes.getValue("y");
                    StringBuilder sb = new StringBuilder();
                    sb.append("<g");
                    sb.append(" xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' version='1.1'");
                    if (value2 != null || value3 != null || value4 != null) {
                        sb.append(" transform='");
                        if (value2 != null) {
                            sb.append(C1324e.m9001d(value2));
                        }
                        if (value3 != null || value4 != null) {
                            sb.append("translate(");
                            if (value3 != null) {
                                str4 = C1324e.m9001d(value3);
                            } else {
                                str4 = "0";
                            }
                            sb.append(str4);
                            sb.append(",");
                            if (value4 != null) {
                                str5 = C1324e.m9001d(value4);
                            } else {
                                str5 = "0";
                            }
                            sb.append(str5);
                            sb.append(")");
                        }
                        sb.append("'");
                    }
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String qName = attributes.getQName(i3);
                        if (!"x".equals(qName) && !"y".equals(qName) && !"width".equals(qName) && !"height".equals(qName) && !"xlink:href".equals(qName) && !"transform".equals(qName)) {
                            sb.append(" ");
                            sb.append(qName);
                            sb.append("='");
                            sb.append(C1324e.m9001d(attributes.getValue(i3)));
                            sb.append("'");
                        }
                    }
                    sb.append(">");
                    sb.append(this.f4186a.get(value.substring(1)));
                    sb.append("</g>");
                    InputSource inputSource = new InputSource(new StringReader(sb.toString()));
                    try {
                        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.parse(inputSource);
                    } catch (Exception e) {
                        Log.d("SVG", sb.toString());
                        e.printStackTrace();
                    }
                } else if (str2.equals("g")) {
                    if ("bounds".equalsIgnoreCase(C1324e.m9000d("id", attributes))) {
                        this.f4184A = true;
                    }
                    if (this.f4210y) {
                        this.f4211z++;
                    }
                    if ("none".equals(C1324e.m9000d("display", attributes)) && !this.f4210y) {
                        this.f4210y = true;
                        this.f4211z = 1;
                    }
                    m8966a(attributes);
                    C1331e c1331e = new C1331e(attributes);
                    this.f4195j.push(new Paint(this.f4193h));
                    this.f4191f.push(new Paint(this.f4189d));
                    this.f4196k.push(Boolean.valueOf(this.f4194i));
                    this.f4192g.push(Boolean.valueOf(this.f4190e));
                    this.f4198m.push(Float.valueOf(this.f4197l));
                    Float m8969a3 = m8969a("opacity", attributes);
                    if (m8969a3 != null) {
                        this.f4197l = m8969a3.floatValue() * this.f4197l;
                    }
                    m8965a(attributes, this.f4193h);
                    m8965a(attributes, this.f4189d);
                    m8977a(c1331e, this.f4206u);
                    m8979a(c1331e);
                    this.f4194i = (c1331e.m8989b("fill") != null) | this.f4194i;
                    this.f4190e = (c1331e.m8989b("stroke") != null) | this.f4190e;
                } else if (!this.f4210y && str2.equals("rect")) {
                    Float m8967a = m8967a("x", attributes, Float.valueOf(0.0f));
                    Float m8967a2 = m8967a("y", attributes, Float.valueOf(0.0f));
                    Float m8969a4 = m8969a("width", attributes);
                    Float m8969a5 = m8969a("height", attributes);
                    Float m8967a3 = m8967a("rx", attributes, Float.valueOf(0.0f));
                    Float m8967a4 = m8967a("ry", attributes, Float.valueOf(0.0f));
                    m8966a(attributes);
                    C1331e c1331e2 = new C1331e(attributes);
                    if (m8977a(c1331e2, this.f4206u)) {
                        m8983a(m8967a.floatValue(), m8967a2.floatValue(), m8969a4.floatValue(), m8969a5.floatValue());
                        if (m8967a3.floatValue() <= 0.0f && m8967a4.floatValue() <= 0.0f) {
                            this.f4188c.drawRect(m8967a.floatValue(), m8967a2.floatValue(), m8967a.floatValue() + m8969a4.floatValue(), m8967a2.floatValue() + m8969a5.floatValue(), this.f4193h);
                        } else {
                            this.f4199n.set(m8967a.floatValue(), m8967a2.floatValue(), m8967a.floatValue() + m8969a4.floatValue(), m8967a2.floatValue() + m8969a5.floatValue());
                            this.f4188c.drawRoundRect(this.f4199n, m8967a3.floatValue(), m8967a4.floatValue(), this.f4193h);
                        }
                    }
                    if (m8979a(c1331e2)) {
                        if (m8967a3.floatValue() <= 0.0f && m8967a4.floatValue() <= 0.0f) {
                            this.f4188c.drawRect(m8967a.floatValue(), m8967a2.floatValue(), m8967a.floatValue() + m8969a4.floatValue(), m8967a2.floatValue() + m8969a5.floatValue(), this.f4189d);
                        } else {
                            this.f4199n.set(m8967a.floatValue(), m8967a2.floatValue(), m8967a.floatValue() + m8969a4.floatValue(), m8967a2.floatValue() + m8969a5.floatValue());
                            this.f4188c.drawRoundRect(this.f4199n, m8967a3.floatValue(), m8967a4.floatValue(), this.f4189d);
                        }
                    }
                    m8986a();
                } else if (!this.f4210y && str2.equals("image")) {
                    String m9000d = C1324e.m9000d("href", attributes);
                    if (m9000d.startsWith("data") && m9000d.indexOf("base64") > 0) {
                        String substring = m9000d.substring(m9000d.indexOf(",") + 1);
                        Float m8967a5 = m8967a("x", attributes, Float.valueOf(0.0f));
                        Float m8967a6 = m8967a("y", attributes, Float.valueOf(0.0f));
                        Float m8967a7 = m8967a("width", attributes, Float.valueOf(0.0f));
                        Float m8967a8 = m8967a("height", attributes, Float.valueOf(0.0f));
                        m8966a(attributes);
                        m8983a(m8967a5.floatValue(), m8967a6.floatValue(), m8967a7.floatValue(), m8967a8.floatValue());
                        m8981a(this.f4188c, m8967a5.floatValue(), m8967a6.floatValue(), m8967a7.floatValue(), m8967a8.floatValue(), Base64.decode(substring, 0));
                        m8986a();
                    }
                } else if (!this.f4210y && str2.equals("line")) {
                    Float m8969a6 = m8969a("x1", attributes);
                    Float m8969a7 = m8969a("x2", attributes);
                    Float m8969a8 = m8969a("y1", attributes);
                    Float m8969a9 = m8969a("y2", attributes);
                    if (m8979a(new C1331e(attributes))) {
                        m8966a(attributes);
                        m8984a(m8969a6.floatValue(), m8969a8.floatValue());
                        m8984a(m8969a7.floatValue(), m8969a9.floatValue());
                        this.f4188c.drawLine(m8969a6.floatValue(), m8969a8.floatValue(), m8969a7.floatValue(), m8969a9.floatValue(), this.f4189d);
                        m8986a();
                    }
                } else if (!this.f4210y && str2.equals("circle")) {
                    Float m8969a10 = m8969a("cx", attributes);
                    Float m8969a11 = m8969a("cy", attributes);
                    Float m8969a12 = m8969a("r", attributes);
                    if (m8969a10 != null && m8969a11 != null && m8969a12 != null) {
                        m8966a(attributes);
                        C1331e c1331e3 = new C1331e(attributes);
                        if (m8977a(c1331e3, this.f4206u)) {
                            m8984a(m8969a10.floatValue() - m8969a12.floatValue(), m8969a11.floatValue() - m8969a12.floatValue());
                            m8984a(m8969a10.floatValue() + m8969a12.floatValue(), m8969a11.floatValue() + m8969a12.floatValue());
                            this.f4188c.drawCircle(m8969a10.floatValue(), m8969a11.floatValue(), m8969a12.floatValue(), this.f4193h);
                        }
                        if (m8979a(c1331e3)) {
                            this.f4188c.drawCircle(m8969a10.floatValue(), m8969a11.floatValue(), m8969a12.floatValue(), this.f4189d);
                        }
                        m8986a();
                    }
                } else if (!this.f4210y && str2.equals("ellipse")) {
                    Float m8969a13 = m8969a("cx", attributes);
                    Float m8969a14 = m8969a("cy", attributes);
                    Float m8969a15 = m8969a("rx", attributes);
                    Float m8969a16 = m8969a("ry", attributes);
                    if (m8969a13 != null && m8969a14 != null && m8969a15 != null && m8969a16 != null) {
                        m8966a(attributes);
                        C1331e c1331e4 = new C1331e(attributes);
                        this.f4199n.set(m8969a13.floatValue() - m8969a15.floatValue(), m8969a14.floatValue() - m8969a16.floatValue(), m8969a13.floatValue() + m8969a15.floatValue(), m8969a14.floatValue() + m8969a16.floatValue());
                        if (m8977a(c1331e4, this.f4206u)) {
                            m8984a(m8969a13.floatValue() - m8969a15.floatValue(), m8969a14.floatValue() - m8969a16.floatValue());
                            m8984a(m8969a13.floatValue() + m8969a15.floatValue(), m8969a14.floatValue() + m8969a16.floatValue());
                            this.f4188c.drawOval(this.f4199n, this.f4193h);
                        }
                        if (m8979a(c1331e4)) {
                            this.f4188c.drawOval(this.f4199n, this.f4189d);
                        }
                        m8986a();
                    }
                } else if (!this.f4210y && (str2.equals("polygon") || str2.equals("polyline"))) {
                    C1330d m9002c = C1324e.m9002c("points", attributes);
                    if (m9002c != null) {
                        Path path = new Path();
                        ArrayList arrayList = m9002c.f4179a;
                        if (arrayList.size() > 1) {
                            m8966a(attributes);
                            C1331e c1331e5 = new C1331e(attributes);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            int i4 = 2;
                            while (true) {
                                int i5 = i4;
                                if (i5 >= arrayList.size()) {
                                    break;
                                }
                                path.lineTo(((Float) arrayList.get(i5)).floatValue(), ((Float) arrayList.get(i5 + 1)).floatValue());
                                i4 = i5 + 2;
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (m8977a(c1331e5, this.f4206u)) {
                                m8980a(path);
                                this.f4188c.drawPath(path, this.f4193h);
                            }
                            if (m8979a(c1331e5)) {
                                this.f4188c.drawPath(path, this.f4189d);
                            }
                            m8986a();
                        }
                    }
                } else if (!this.f4210y && str2.equals("path")) {
                    Path m8997g = C1324e.m8997g(C1324e.m9000d("d", attributes));
                    m8966a(attributes);
                    C1331e c1331e6 = new C1331e(attributes);
                    if (m8977a(c1331e6, this.f4206u)) {
                        m8980a(m8997g);
                        this.f4188c.drawPath(m8997g, this.f4193h);
                    }
                    if (m8979a(c1331e6)) {
                        this.f4188c.drawPath(m8997g, this.f4189d);
                    }
                    m8986a();
                } else if (!this.f4210y && str2.equals("text")) {
                    m8966a(attributes);
                    this.f4209x = new C1333a(attributes);
                } else if (!this.f4210y) {
                    Log.d("SVG", String.format("Unrecognized tag: %s (%s)", str2, m8962b(attributes)));
                }
            }
        }

        /* renamed from: b */
        private String m8962b(Attributes attributes) {
            String str = "";
            for (int i = 0; i < attributes.getLength(); i++) {
                str = str + " " + attributes.getLocalName(i) + "='" + attributes.getValue(i) + "'";
            }
            return str;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            if (this.f4209x != null) {
                this.f4209x.m8957a(cArr, i, i2);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            C1327b c1327b;
            C1327b c1327b2;
            int i = 0;
            if (this.f4185B) {
                if (str2.equals("defs")) {
                    this.f4185B = false;
                }
            } else if (str2.equals("svg")) {
                this.f4187b.endRecording();
            } else if (!this.f4210y && str2.equals("text")) {
                if (this.f4209x != null) {
                    this.f4209x.m8958a(this.f4188c);
                    this.f4209x.m8956b();
                }
                m8986a();
            } else if (str2.equals("linearGradient")) {
                if (this.f4208w.f4160a != null) {
                    if (this.f4208w.f4161b != null && (c1327b2 = this.f4207v.get(this.f4208w.f4161b)) != null) {
                        this.f4208w = c1327b2.m8994a(this.f4208w);
                    }
                    int[] iArr = new int[this.f4208w.f4171l.size()];
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        iArr[i2] = this.f4208w.f4171l.get(i2).intValue();
                    }
                    float[] fArr = new float[this.f4208w.f4170k.size()];
                    while (i < fArr.length) {
                        fArr[i] = this.f4208w.f4170k.get(i).floatValue();
                        i++;
                    }
                    if (iArr.length == 0) {
                        Log.d("SVG", "missing colors in gradient");
                    }
                    LinearGradient linearGradient = new LinearGradient(this.f4208w.f4163d, this.f4208w.f4164e, this.f4208w.f4165f, this.f4208w.f4166g, iArr, fArr, Shader.TileMode.CLAMP);
                    if (this.f4208w.f4172m != null) {
                        linearGradient.setLocalMatrix(this.f4208w.f4172m);
                    }
                    this.f4206u.put(this.f4208w.f4160a, linearGradient);
                    this.f4207v.put(this.f4208w.f4160a, this.f4208w);
                }
            } else if (str2.equals("radialGradient")) {
                if (this.f4208w.f4160a != null) {
                    if (this.f4208w.f4161b != null && (c1327b = this.f4207v.get(this.f4208w.f4161b)) != null) {
                        this.f4208w = c1327b.m8994a(this.f4208w);
                    }
                    int[] iArr2 = new int[this.f4208w.f4171l.size()];
                    for (int i3 = 0; i3 < iArr2.length; i3++) {
                        iArr2[i3] = this.f4208w.f4171l.get(i3).intValue();
                    }
                    float[] fArr2 = new float[this.f4208w.f4170k.size()];
                    while (i < fArr2.length) {
                        fArr2[i] = this.f4208w.f4170k.get(i).floatValue();
                        i++;
                    }
                    RadialGradient radialGradient = new RadialGradient(this.f4208w.f4167h, this.f4208w.f4168i, this.f4208w.f4169j, iArr2, fArr2, Shader.TileMode.CLAMP);
                    if (this.f4208w.f4172m != null) {
                        radialGradient.setLocalMatrix(this.f4208w.f4172m);
                    }
                    this.f4206u.put(this.f4208w.f4160a, radialGradient);
                    this.f4207v.put(this.f4208w.f4160a, this.f4208w);
                }
            } else if (str2.equals("g")) {
                if (this.f4184A) {
                    this.f4184A = false;
                }
                if (this.f4210y) {
                    this.f4211z--;
                    if (this.f4211z == 0) {
                        this.f4210y = false;
                    }
                }
                this.f4206u.clear();
                m8986a();
                this.f4193h = this.f4195j.pop();
                this.f4194i = this.f4196k.pop().booleanValue();
                this.f4189d = this.f4191f.pop();
                this.f4190e = this.f4192g.pop().booleanValue();
                this.f4197l = this.f4198m.pop().floatValue();
            }
        }

        /* renamed from: com.tsf.extend.a.e$f$a */
        /* loaded from: classes.dex */
        private class C1333a {

            /* renamed from: b */
            private Paint f4213b;

            /* renamed from: c */
            private Paint f4214c;

            /* renamed from: d */
            private float f4215d;

            /* renamed from: e */
            private float f4216e;

            /* renamed from: f */
            private String f4217f = null;

            /* renamed from: g */
            private boolean f4218g = true;

            /* renamed from: h */
            private int f4219h;

            public C1333a(Attributes attributes) {
                this.f4213b = null;
                this.f4214c = null;
                this.f4219h = 0;
                this.f4215d = C1332f.this.m8967a("x", attributes, Float.valueOf(0.0f)).floatValue();
                this.f4216e = C1332f.this.m8967a("y", attributes, Float.valueOf(0.0f)).floatValue();
                C1331e c1331e = new C1331e(attributes);
                if (C1332f.this.m8977a(c1331e, C1332f.this.f4206u)) {
                    this.f4214c = new Paint(C1332f.this.f4193h);
                    C1332f.this.m8965a(attributes, this.f4214c);
                }
                if (C1332f.this.m8979a(c1331e)) {
                    this.f4213b = new Paint(C1332f.this.f4189d);
                    C1332f.this.m8965a(attributes, this.f4213b);
                }
                String m9000d = C1324e.m9000d("alignment-baseline", attributes);
                if ("middle".equals(m9000d)) {
                    this.f4219h = 1;
                } else if ("top".equals(m9000d)) {
                    this.f4219h = 2;
                }
            }

            /* renamed from: a */
            public void m8957a(char[] cArr, int i, int i2) {
                Rect rect;
                if (m8959a()) {
                    if (this.f4217f == null) {
                        this.f4217f = new String(cArr, i, i2);
                    } else {
                        this.f4217f += new String(cArr, i, i2);
                    }
                    if (this.f4219h > 0) {
                        Paint paint = this.f4213b == null ? this.f4214c : this.f4213b;
                        paint.getTextBounds(this.f4217f, 0, this.f4217f.length(), new Rect());
                        this.f4216e = (this.f4219h == 1 ? -rect.centerY() : rect.height()) + this.f4216e;
                    }
                }
            }

            /* renamed from: a */
            public boolean m8959a() {
                return this.f4218g;
            }

            /* renamed from: b */
            public void m8956b() {
                this.f4218g = false;
            }

            /* renamed from: a */
            public void m8958a(Canvas canvas) {
                if (this.f4214c != null) {
                    canvas.drawText(this.f4217f, this.f4215d, this.f4216e, this.f4214c);
                }
                if (this.f4213b != null) {
                    canvas.drawText(this.f4217f, this.f4215d, this.f4216e, this.f4213b);
                }
            }
        }

        /* renamed from: c */
        private Paint.Align m8961c(Attributes attributes) {
            String m9000d = C1324e.m9000d("text-anchor", attributes);
            if (m9000d == null) {
                return null;
            }
            if ("middle".equals(m9000d)) {
                return Paint.Align.CENTER;
            }
            if ("end".equals(m9000d)) {
                return Paint.Align.RIGHT;
            }
            return Paint.Align.LEFT;
        }

        /* renamed from: d */
        private Typeface m8960d(Attributes attributes) {
            String m9000d = C1324e.m9000d("font-family", attributes);
            String m9000d2 = C1324e.m9000d("font-style", attributes);
            String m9000d3 = C1324e.m9000d("font-weight", attributes);
            if (m9000d == null && m9000d2 == null && m9000d3 == null) {
                return null;
            }
            int i = 0;
            if ("italic".equals(m9000d2)) {
                i = 2;
            }
            if ("bold".equals(m9000d3)) {
                i |= 1;
            }
            return Typeface.create(m9000d, i);
        }

        /* renamed from: a */
        private Float m8969a(String str, Attributes attributes) {
            return m8967a(str, attributes, (Float) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Float m8967a(String str, Attributes attributes, Float f) {
            Float m8968a = m8968a(str, attributes, this.f4205t);
            return m8968a == null ? f : m8968a;
        }

        /* renamed from: a */
        private Float m8968a(String str, Attributes attributes, float f) {
            float width;
            String m9000d = C1324e.m9000d(str, attributes);
            if (m9000d == null) {
                return null;
            }
            if (m9000d.endsWith("px")) {
                return Float.valueOf(Float.parseFloat(m9000d.substring(0, m9000d.length() - 2)));
            }
            if (m9000d.endsWith("pt")) {
                return Float.valueOf((Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * f) / 72.0f);
            }
            if (m9000d.endsWith("pc")) {
                return Float.valueOf((Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * f) / 6.0f);
            }
            if (m9000d.endsWith("cm")) {
                return Float.valueOf((Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * f) / 2.54f);
            }
            if (m9000d.endsWith("mm")) {
                return Float.valueOf((Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * f) / 254.0f);
            }
            if (m9000d.endsWith("in")) {
                return Float.valueOf(Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * f);
            }
            if (m9000d.endsWith("em")) {
                return Float.valueOf(Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * this.f4193h.getTextSize());
            } else if (m9000d.endsWith("ex")) {
                return Float.valueOf((Float.valueOf(m9000d.substring(0, m9000d.length() - 2)).floatValue() * this.f4193h.getTextSize()) / 2.0f);
            } else if (m9000d.endsWith("%")) {
                Float valueOf = Float.valueOf(m9000d.substring(0, m9000d.length() - 1));
                if (str.indexOf("x") >= 0 || str.equals("width")) {
                    width = this.f4188c.getWidth() / 100.0f;
                } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                    width = this.f4188c.getHeight() / 100.0f;
                } else {
                    width = (this.f4188c.getHeight() + this.f4188c.getWidth()) / 2.0f;
                }
                return Float.valueOf(width * valueOf.floatValue());
            } else {
                return Float.valueOf(m9000d);
            }
        }
    }
}
