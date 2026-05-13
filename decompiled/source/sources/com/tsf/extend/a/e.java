package com.tsf.extend.a;

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
/* loaded from: classes.dex */
public class e {
    static float a = 72.0f;

    public static com.tsf.extend.a.b a(InputStream inputStream) {
        return a(inputStream, 0, 0, false, false, a);
    }

    public static com.tsf.extend.a.b a(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        com.tsf.extend.a.b a2 = a(open);
        open.close();
        return a2;
    }

    private static com.tsf.extend.a.b a(InputStream inputStream, Integer num, Integer num2, boolean z, boolean z2, float f2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            f fVar = new f(picture);
            fVar.a(num, num2);
            fVar.a(z);
            fVar.a(f2);
            if (z2) {
                xMLReader.setContentHandler(fVar);
                xMLReader.parse(new InputSource(inputStream));
            } else {
                a aVar = new a(inputStream);
                c cVar = new c();
                xMLReader.setContentHandler(cVar);
                xMLReader.parse(new InputSource(aVar.a()));
                fVar.a = cVar.a;
                xMLReader.setContentHandler(fVar);
                xMLReader.parse(new InputSource(aVar.a()));
            }
            Log.i("SVG", "Parsing complete in " + (System.currentTimeMillis() - currentTimeMillis) + " millis.");
            com.tsf.extend.a.b bVar = new com.tsf.extend.a.b(picture, fVar.o);
            if (!Float.isInfinite(fVar.p.top)) {
                bVar.a(fVar.p);
            }
            return bVar;
        } catch (Exception e) {
            Log.w("SVG", "Parse error: " + e);
            throw new com.tsf.extend.a.d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        return str;
    }

    private static d e(String str) {
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
                        return new d(arrayList, i2);
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
        return new d(arrayList, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Matrix f(String str) {
        Matrix matrix = new Matrix();
        while (true) {
            a(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= indexOf + 1) {
                break;
            }
            str = str.substring(indexOf + 1).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    private static Matrix a(String str, Matrix matrix) {
        float f2;
        d e;
        d e2;
        float f3 = 0.0f;
        if (str.startsWith("matrix(")) {
            d e3 = e(str.substring("matrix(".length()));
            if (e3.a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) e3.a.get(0)).floatValue(), ((Float) e3.a.get(2)).floatValue(), ((Float) e3.a.get(4)).floatValue(), ((Float) e3.a.get(1)).floatValue(), ((Float) e3.a.get(3)).floatValue(), ((Float) e3.a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            d e4 = e(str.substring("translate(".length()));
            if (e4.a.size() > 0) {
                matrix.preTranslate(((Float) e4.a.get(0)).floatValue(), e4.a.size() > 1 ? ((Float) e4.a.get(1)).floatValue() : 0.0f);
            }
        } else if (str.startsWith("scale(")) {
            d e5 = e(str.substring("scale(".length()));
            if (e5.a.size() > 0) {
                float floatValue = ((Float) e5.a.get(0)).floatValue();
                matrix.preScale(floatValue, e5.a.size() > 1 ? ((Float) e5.a.get(1)).floatValue() : floatValue);
            }
        } else if (str.startsWith("skewX(")) {
            if (e(str.substring("skewX(".length())).a.size() > 0) {
                matrix.preSkew((float) Math.tan(((Float) e2.a.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            if (e(str.substring("skewY(".length())).a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(((Float) e.a.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            d e6 = e(str.substring("rotate(".length()));
            if (e6.a.size() > 0) {
                float floatValue2 = ((Float) e6.a.get(0)).floatValue();
                if (e6.a.size() > 2) {
                    float floatValue3 = ((Float) e6.a.get(1)).floatValue();
                    f3 = ((Float) e6.a.get(2)).floatValue();
                    f2 = floatValue3;
                } else {
                    f2 = 0.0f;
                }
                matrix.preTranslate(f2, f3);
                matrix.preRotate(floatValue2);
                matrix.preTranslate(-f2, -f3);
            }
        } else {
            Log.w("SVG", "Invalid transform (" + str + ")");
        }
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Path g(String str) {
        boolean z;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int length = str.length();
        com.tsf.extend.a.a aVar = new com.tsf.extend.a.a(str, 0);
        aVar.a();
        Path path = new Path();
        RectF rectF = new RectF();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        char c2 = 'x';
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (aVar.a < length) {
            char charAt = str.charAt(aVar.a);
            if (!Character.isDigit(charAt) && charAt != '.' && charAt != '-') {
                aVar.c();
            } else if (c2 == 'M') {
                charAt = 'L';
            } else {
                charAt = c2 == 'm' ? 'l' : c2;
            }
            path.computeBounds(rectF, true);
            switch (charAt) {
                case 'A':
                case 'a':
                    float e = aVar.e();
                    float e2 = aVar.e();
                    float e3 = aVar.e();
                    int e4 = (int) aVar.e();
                    int e5 = (int) aVar.e();
                    float e6 = aVar.e();
                    float e7 = aVar.e();
                    if (charAt == 'a') {
                        e6 += f13;
                        e7 += f14;
                    }
                    a(path, f13, f14, e6, e7, e, e2, e3, e4 == 1, e5 == 1);
                    z = false;
                    f2 = f9;
                    f3 = f10;
                    f5 = f11;
                    f4 = f12;
                    f7 = e7;
                    f6 = e6;
                    break;
                case 'C':
                case 'c':
                    float e8 = aVar.e();
                    float e9 = aVar.e();
                    float e10 = aVar.e();
                    float e11 = aVar.e();
                    float e12 = aVar.e();
                    float e13 = aVar.e();
                    if (charAt == 'c') {
                        e10 += f13;
                        e12 += f13;
                        e9 += f14;
                        e11 += f14;
                        e13 += f14;
                        f8 = e8 + f13;
                    } else {
                        f8 = e8;
                    }
                    path.cubicTo(f8, e9, e10, e11, e12, e13);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    float f15 = e11;
                    f4 = e10;
                    f5 = f15;
                    float f16 = e13;
                    f6 = e12;
                    f7 = f16;
                    break;
                case 'H':
                case 'h':
                    float e14 = aVar.e();
                    if (charAt == 'h') {
                        path.rLineTo(e14, 0.0f);
                        float f17 = e14 + f13;
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = f17;
                        f7 = f14;
                        z = false;
                        break;
                    } else {
                        path.lineTo(e14, f14);
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = e14;
                        f7 = f14;
                        z = false;
                        break;
                    }
                case 'L':
                case 'l':
                    float e15 = aVar.e();
                    float e16 = aVar.e();
                    if (charAt == 'l') {
                        path.rLineTo(e15, e16);
                        float f18 = e15 + f13;
                        float f19 = e16 + f14;
                        z = false;
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = f18;
                        f7 = f19;
                        break;
                    } else {
                        path.lineTo(e15, e16);
                        z = false;
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = e15;
                        f7 = e16;
                        break;
                    }
                case 'M':
                case 'm':
                    float e17 = aVar.e();
                    float e18 = aVar.e();
                    if (charAt == 'm') {
                        path.rMoveTo(e17, e18);
                        float f20 = e17 + f13;
                        f2 = f14 + e18;
                        f3 = f20;
                    } else {
                        path.moveTo(e17, e18);
                        f2 = e18;
                        f3 = e17;
                    }
                    z = false;
                    f5 = f11;
                    f4 = f12;
                    f7 = f2;
                    f6 = f3;
                    break;
                case 'Q':
                case 'q':
                    float e19 = aVar.e();
                    float e20 = aVar.e();
                    float e21 = aVar.e();
                    float e22 = aVar.e();
                    if (charAt == 'q') {
                        e21 += f13;
                        e22 += f14;
                        e19 += f13;
                        e20 += f14;
                    }
                    path.cubicTo(f13, f14, e19, e20, e21, e22);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    float f21 = e20;
                    f4 = e19;
                    f5 = f21;
                    float f22 = e22;
                    f6 = e21;
                    f7 = f22;
                    break;
                case 'S':
                case 's':
                    float e23 = aVar.e();
                    float e24 = aVar.e();
                    float e25 = aVar.e();
                    float e26 = aVar.e();
                    if (charAt == 's') {
                        e23 += f13;
                        e25 += f13;
                        e24 += f14;
                        e26 += f14;
                    }
                    path.cubicTo((f13 * 2.0f) - f12, (2.0f * f14) - f11, e23, e24, e25, e26);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    float f23 = e24;
                    f4 = e23;
                    f5 = f23;
                    float f24 = e26;
                    f6 = e25;
                    f7 = f24;
                    break;
                case 'T':
                case 't':
                    float e27 = aVar.e();
                    float e28 = aVar.e();
                    if (charAt == 't') {
                        e27 += f13;
                        e28 += f14;
                    }
                    float f25 = (2.0f * f13) - f12;
                    float f26 = (2.0f * f14) - f11;
                    path.cubicTo(f13, f14, f25, f26, e27, e28);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    f4 = f25;
                    f5 = f26;
                    float f27 = e28;
                    f6 = e27;
                    f7 = f27;
                    break;
                case 'V':
                case 'v':
                    float e29 = aVar.e();
                    if (charAt == 'v') {
                        path.rLineTo(0.0f, e29);
                        float f28 = e29 + f14;
                        z = false;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f7 = f28;
                        f6 = f13;
                        f2 = f9;
                        break;
                    } else {
                        path.lineTo(f13, e29);
                        z = false;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f7 = e29;
                        f6 = f13;
                        f2 = f9;
                        break;
                    }
                case 'Z':
                case 'z':
                    path.close();
                    z = false;
                    f2 = f9;
                    f3 = f10;
                    f5 = f11;
                    f4 = f12;
                    f7 = f9;
                    f6 = f10;
                    break;
                default:
                    Log.w("SVG", "Invalid path command: " + charAt);
                    aVar.c();
                    f3 = f10;
                    f5 = f11;
                    f4 = f12;
                    f7 = f14;
                    f6 = f13;
                    f2 = f9;
                    z = false;
                    break;
            }
            if (!z) {
                f5 = f7;
                f4 = f6;
            }
            aVar.a();
            f9 = f2;
            f10 = f3;
            f11 = f5;
            f12 = f4;
            f14 = f7;
            c2 = charAt;
            f13 = f6;
        }
        return path;
    }

    private static void a(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11;
        double d12;
        double d13 = (d2 - d4) / 2.0d;
        double d14 = (d3 - d5) / 2.0d;
        double radians = Math.toRadians(d8 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d15 = (cos * d13) + (sin * d14);
        double d16 = (d13 * (-sin)) + (d14 * cos);
        double abs = Math.abs(d6);
        double abs2 = Math.abs(d7);
        double d17 = abs * abs;
        double d18 = abs2 * abs2;
        double d19 = d15 * d15;
        double d20 = d16 * d16;
        double d21 = (d19 / d17) + (d20 / d18);
        if (d21 > 1.0d) {
            double sqrt = abs * Math.sqrt(d21);
            double sqrt2 = abs2 * Math.sqrt(d21);
            d9 = sqrt2;
            d10 = sqrt;
            d11 = sqrt2 * sqrt2;
            d12 = sqrt * sqrt;
        } else {
            d9 = abs2;
            d10 = abs;
            d11 = d18;
            d12 = d17;
        }
        double d22 = z == z2 ? -1.0d : 1.0d;
        double d23 = (((d12 * d11) - (d12 * d20)) - (d11 * d19)) / ((d11 * d19) + (d12 * d20));
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double sqrt3 = Math.sqrt(d23) * d22;
        double d24 = ((d10 * d16) / d9) * sqrt3;
        double d25 = sqrt3 * (-((d9 * d15) / d10));
        double d26 = ((d2 + d4) / 2.0d) + ((cos * d24) - (sin * d25));
        double d27 = ((d3 + d5) / 2.0d) + (cos * d25) + (sin * d24);
        double d28 = (d15 - d24) / d10;
        double d29 = (d16 - d25) / d9;
        double d30 = ((-d15) - d24) / d10;
        double d31 = ((-d16) - d25) / d9;
        double degrees = Math.toDegrees((d29 < 0.0d ? -1.0d : 1.0d) * Math.acos(d28 / Math.sqrt((d28 * d28) + (d29 * d29))));
        double degrees2 = Math.toDegrees(((d28 * d31) - (d30 * d29) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d29 * d31) + (d28 * d30)) / Math.sqrt(((d28 * d28) + (d29 * d29)) * ((d30 * d30) + (d31 * d31)))));
        if (!z2 && degrees2 > 0.0d) {
            degrees2 -= 360.0d;
        } else if (z2 && degrees2 < 0.0d) {
            degrees2 += 360.0d;
        }
        path.addArc(new RectF((float) (d26 - d10), (float) (d27 - d9), (float) (d26 + d10), (float) (d27 + d9)), (float) (degrees % 360.0d), (float) (degrees2 % 360.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d c(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return e(attributes.getValue(i));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class a {
        private InputStream a;
        private ByteArrayOutputStream b;

        public a(InputStream inputStream) {
            this.a = inputStream;
            try {
                b();
            } catch (IOException e) {
                System.out.println("IOException in CopyInputStream");
                System.out.println(e.toString());
            }
        }

        private int b() {
            this.b = new ByteArrayOutputStream();
            byte[] bArr = new byte[ItemInfo.APP_VERSION_CODE];
            int i = 0;
            while (true) {
                int read = this.a.read(bArr);
                if (-1 != read) {
                    i += bArr.length;
                    this.b.write(bArr, 0, read);
                } else {
                    this.b.flush();
                    return i;
                }
            }
        }

        public ByteArrayInputStream a() {
            return new ByteArrayInputStream(this.b.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        private ArrayList<Float> a;
        private int b;

        public d(ArrayList<Float> arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        String a;
        String b;
        boolean c;
        float d;
        float e;
        float f;
        float g;
        float h;
        float i;
        float j;
        ArrayList<Float> k;
        ArrayList<Integer> l;
        Matrix m;

        private b() {
            this.k = new ArrayList<>();
            this.l = new ArrayList<>();
            this.m = null;
        }

        public b a(b bVar) {
            b bVar2 = new b();
            bVar2.a = bVar.a;
            bVar2.b = this.a;
            bVar2.c = bVar.c;
            bVar2.d = bVar.d;
            bVar2.f = bVar.f;
            bVar2.e = bVar.e;
            bVar2.g = bVar.g;
            bVar2.h = bVar.h;
            bVar2.i = bVar.i;
            bVar2.j = bVar.j;
            bVar2.k = this.k;
            bVar2.l = this.l;
            bVar2.m = this.m;
            if (bVar.m != null) {
                if (this.m == null) {
                    bVar2.m = bVar.m;
                } else {
                    Matrix matrix = new Matrix(this.m);
                    matrix.preConcat(bVar.m);
                    bVar2.m = matrix;
                }
            }
            return bVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {
        HashMap<String, String> a;

        private g(String str) {
            this.a = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    this.a.put(split[0], split[1]);
                }
            }
        }

        public String a(String str) {
            return this.a.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.a.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0046e {
        g a;
        Attributes b;

        private C0046e(Attributes attributes) {
            this.a = null;
            this.b = attributes;
            String d = e.d("style", attributes);
            if (d != null) {
                this.a = new g(d);
            }
        }

        public String a(String str) {
            String str2 = null;
            if (this.a != null) {
                str2 = this.a.a(str);
            }
            if (str2 == null) {
                return e.d(str, this.b);
            }
            return str2;
        }

        public String b(String str) {
            return a(str);
        }

        public Integer c(String str) {
            String a = a(str);
            if (a == null) {
                return null;
            }
            if (a.startsWith("#") && (a.length() == 4 || a.length() == 7)) {
                try {
                    int parseInt = Integer.parseInt(a.substring(1), 16);
                    if (a.length() == 4) {
                        parseInt = a(parseInt);
                    }
                    return Integer.valueOf(parseInt);
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            return com.tsf.extend.a.c.a(a);
        }

        private int a(int i) {
            return ((i & 3840) << 8) | ((i & 3840) << 12) | ((i & 240) << 4) | ((i & 240) << 8) | ((i & 15) << 4) | (i & 15);
        }

        public Float d(String str) {
            String a = a(str);
            if (a == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends DefaultHandler {
        HashMap<String, String> a;
        Stack<a> b;

        private c() {
            this.a = new HashMap<>();
            this.b = new Stack<>();
        }

        /* loaded from: classes.dex */
        class a {
            String a;
            int b = 0;
            StringBuilder c = new StringBuilder();

            public a(String str) {
                this.a = str;
            }
        }

        private void a(StringBuilder sb, String str, String str2, String str3, Attributes attributes) {
            sb.append("<");
            sb.append(str2);
            for (int i = 0; i < attributes.getLength(); i++) {
                sb.append(" ");
                sb.append(attributes.getQName(i));
                sb.append("='");
                sb.append(e.d(attributes.getValue(i)));
                sb.append("'");
            }
            sb.append(">");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String value = attributes.getValue("id");
            if (value != null) {
                this.b.push(new a(value));
            }
            if (this.b.size() > 0) {
                a lastElement = this.b.lastElement();
                lastElement.b++;
                a(lastElement.c, str, str2, str3, attributes);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            if (this.b.size() > 0) {
                a lastElement = this.b.lastElement();
                lastElement.c.append("</");
                lastElement.c.append(str2);
                lastElement.c.append(">");
                lastElement.b--;
                if (lastElement.b == 0) {
                    String sb = lastElement.c.toString();
                    this.a.put(lastElement.a, sb);
                    this.b.pop();
                    if (this.b.size() > 0) {
                        this.b.lastElement().c.append(sb);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends DefaultHandler {
        private static final Matrix C = new Matrix();
        private boolean A;
        private boolean B;
        HashMap<String, String> a;
        Picture b;
        Canvas c;
        Paint d;
        boolean e;
        Stack<Paint> f;
        Stack<Boolean> g;
        Paint h;
        boolean i;
        Stack<Paint> j;
        Stack<Boolean> k;
        float l;
        Stack<Float> m;
        RectF n;
        RectF o;
        RectF p;
        Integer q;
        Integer r;
        boolean s;
        float t;
        HashMap<String, Shader> u;
        HashMap<String, b> v;
        b w;
        a x;
        private boolean y;
        private int z;

        private f(Picture picture) {
            this.a = new HashMap<>();
            this.e = false;
            this.f = new Stack<>();
            this.g = new Stack<>();
            this.i = false;
            this.j = new Stack<>();
            this.k = new Stack<>();
            this.l = 1.0f;
            this.m = new Stack<>();
            this.n = new RectF();
            this.o = null;
            this.p = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
            this.q = null;
            this.r = null;
            this.s = false;
            this.t = e.a;
            this.y = false;
            this.z = 0;
            this.A = false;
            this.u = new HashMap<>();
            this.v = new HashMap<>();
            this.w = null;
            this.x = null;
            this.B = false;
            this.b = picture;
            this.d = new Paint();
            this.d.setAntiAlias(true);
            this.d.setStyle(Paint.Style.STROKE);
            this.h = new Paint();
            this.h.setAntiAlias(true);
            this.h.setStyle(Paint.Style.FILL);
        }

        public void a(float f) {
            this.t = f;
        }

        public void a(Integer num, Integer num2) {
            this.q = num;
            this.r = num2;
        }

        public void a(boolean z) {
            this.s = z;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(C0046e c0046e, HashMap<String, Shader> hashMap) {
            if ("none".equals(c0046e.b("display"))) {
                return false;
            }
            if (this.s) {
                this.h.setShader(null);
                this.h.setColor(-1);
                return true;
            }
            String b = c0046e.b("fill");
            if (b != null) {
                if (b.startsWith("url(#")) {
                    String substring = b.substring("url(#".length(), b.length() - 1);
                    Shader shader = hashMap.get(substring);
                    if (shader != null) {
                        this.h.setShader(shader);
                        Float d = c0046e.d("opacity");
                        if (d == null) {
                            this.h.setAlpha(255);
                            return true;
                        }
                        this.h.setAlpha((int) (d.floatValue() * 255.0f));
                        return true;
                    }
                    Log.w("SVG", "Didn't find shader, using black: " + substring);
                    this.h.setShader(null);
                    a(c0046e, (Integer) (-16777216), true, this.h);
                    return true;
                } else if (b.equalsIgnoreCase("none")) {
                    this.h.setShader(null);
                    this.h.setColor(0);
                    return true;
                } else {
                    this.h.setShader(null);
                    Integer c = c0046e.c("fill");
                    if (c != null) {
                        a(c0046e, c, true, this.h);
                        return true;
                    }
                    Log.w("SVG", "Unrecognized fill color, using black: " + b);
                    a(c0046e, (Integer) (-16777216), true, this.h);
                    return true;
                }
            } else if (this.i) {
                return this.h.getColor() != 0;
            } else {
                this.h.setShader(null);
                this.h.setColor(-16777216);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(Attributes attributes, Paint paint) {
            if ("none".equals(attributes.getValue("display"))) {
                return false;
            }
            if (attributes.getValue("font-size") != null) {
                paint.setTextSize(a("font-size", attributes, Float.valueOf(10.0f)).floatValue());
            }
            Typeface d = d(attributes);
            if (d != null) {
                paint.setTypeface(d);
            }
            if (c(attributes) != null) {
                paint.setTextAlign(c(attributes));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(C0046e c0046e) {
            if (this.s || "none".equals(c0046e.b("display"))) {
                return false;
            }
            Float d = c0046e.d("stroke-width");
            if (d != null) {
                this.d.setStrokeWidth(d.floatValue());
            }
            if (this.d.getStrokeWidth() > 0.0f) {
                String b = c0046e.b("stroke-linecap");
                if ("round".equals(b)) {
                    this.d.setStrokeCap(Paint.Cap.ROUND);
                } else if ("square".equals(b)) {
                    this.d.setStrokeCap(Paint.Cap.SQUARE);
                } else if ("butt".equals(b)) {
                    this.d.setStrokeCap(Paint.Cap.BUTT);
                }
                String b2 = c0046e.b("stroke-linejoin");
                if ("miter".equals(b2)) {
                    this.d.setStrokeJoin(Paint.Join.MITER);
                } else if ("round".equals(b2)) {
                    this.d.setStrokeJoin(Paint.Join.ROUND);
                } else if ("bevel".equals(b2)) {
                    this.d.setStrokeJoin(Paint.Join.BEVEL);
                }
                a(c0046e.b("stroke-dasharray"), c0046e.b("stroke-dashoffset"));
                String a2 = c0046e.a("stroke");
                if (a2 != null) {
                    if (a2.equalsIgnoreCase("none")) {
                        this.d.setColor(0);
                        return false;
                    }
                    Integer c = c0046e.c("stroke");
                    if (c != null) {
                        a(c0046e, c, false, this.d);
                        return true;
                    }
                    Log.d("SVG", "Unrecognized stroke color, using none: " + a2);
                    this.d.setColor(0);
                    return false;
                } else if (this.e) {
                    return this.d.getColor() != 0;
                } else {
                    this.d.setColor(0);
                    return false;
                }
            }
            return false;
        }

        private b a(boolean z, Attributes attributes) {
            b bVar = new b();
            bVar.a = e.d("id", attributes);
            bVar.c = z;
            if (z) {
                bVar.d = a("x1", attributes, Float.valueOf(0.0f)).floatValue();
                bVar.f = a("x2", attributes, Float.valueOf(0.0f)).floatValue();
                bVar.e = a("y1", attributes, Float.valueOf(0.0f)).floatValue();
                bVar.g = a("y2", attributes, Float.valueOf(0.0f)).floatValue();
            } else {
                bVar.h = a("cx", attributes, Float.valueOf(0.0f)).floatValue();
                bVar.i = a("cy", attributes, Float.valueOf(0.0f)).floatValue();
                bVar.j = a("r", attributes, Float.valueOf(0.0f)).floatValue();
            }
            String d = e.d("gradientTransform", attributes);
            if (d != null) {
                bVar.m = e.f(d);
            }
            String d2 = e.d("href", attributes);
            if (d2 != null) {
                if (d2.startsWith("#")) {
                    d2 = d2.substring(1);
                }
                bVar.b = d2;
            }
            return bVar;
        }

        private void a(C0046e c0046e, Integer num, boolean z, Paint paint) {
            paint.setColor(a(num.intValue()) | (-16777216));
            Float d = c0046e.d("opacity");
            if (d == null) {
                d = c0046e.d(z ? "fill-opacity" : "stroke-opacity");
            }
            if (d == null) {
                d = Float.valueOf(1.0f);
            }
            paint.setAlpha((int) (d.floatValue() * 255.0f * this.l));
        }

        private int a(int i) {
            int i2 = 16777215 & i;
            if (this.q != null && this.q.intValue() == i2 && this.r != null) {
                Log.d("SVG", String.format("Replacing color: 0x%x->0x%x", Integer.valueOf(i2), this.r));
                return this.r.intValue();
            }
            return i2;
        }

        private void a(String str, String str2) {
            int i = 0;
            float f = 0.0f;
            if (str != null) {
                if (str.equals("none")) {
                    this.d.setPathEffect(null);
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
                    f2 = a(stringTokenizer.nextToken(), f2);
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
                this.d.setPathEffect(new DashPathEffect(fArr, f));
            }
        }

        private static float a(String str, float f) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException e) {
                return f;
            }
        }

        private void a(float f, float f2) {
            if (f < this.p.left) {
                this.p.left = f;
            }
            if (f > this.p.right) {
                this.p.right = f;
            }
            if (f2 < this.p.top) {
                this.p.top = f2;
            }
            if (f2 > this.p.bottom) {
                this.p.bottom = f2;
            }
        }

        private void a(float f, float f2, float f3, float f4) {
            a(f, f2);
            a(f + f3, f2 + f4);
        }

        private void a(Path path) {
            path.computeBounds(this.n, false);
            a(this.n.left, this.n.top);
            a(this.n.right, this.n.bottom);
        }

        private void a(Attributes attributes) {
            String d = e.d("transform", attributes);
            Matrix f = d == null ? C : e.f(d);
            this.c.save();
            this.c.concat(f);
        }

        private void a() {
            this.c.restore();
        }

        private void a(Canvas canvas, float f, float f2, float f3, float f4, byte[] bArr) {
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
            if (!this.e) {
                this.d.setAlpha(255);
            }
            if (!this.i) {
                this.h.setAlpha(255);
            }
            if (this.A) {
                if (str2.equals("rect")) {
                    Float a2 = a("x", attributes);
                    if (a2 == null) {
                        a2 = Float.valueOf(0.0f);
                    }
                    Float a3 = a("y", attributes);
                    if (a3 == null) {
                        a3 = Float.valueOf(0.0f);
                    }
                    this.o = new RectF(a2.floatValue(), a3.floatValue(), a2.floatValue() + a("width", attributes).floatValue(), a3.floatValue() + a("height", attributes).floatValue());
                }
            } else if (!this.B) {
                if (str2.equals("svg")) {
                    this.c = this.b.beginRecording((int) Math.ceil(a("width", attributes).floatValue()), (int) Math.ceil(a("height", attributes).floatValue()));
                } else if (str2.equals("defs")) {
                    this.B = true;
                } else if (str2.equals("linearGradient")) {
                    this.w = a(true, attributes);
                } else if (str2.equals("radialGradient")) {
                    this.w = a(false, attributes);
                } else if (str2.equals("stop")) {
                    if (this.w != null) {
                        float floatValue = a("offset", attributes).floatValue();
                        g gVar = new g(e.d("style", attributes));
                        String a4 = gVar.a("stop-color");
                        int i2 = -16777216;
                        if (a4 != null) {
                            if (a4.startsWith("#")) {
                                i2 = Integer.parseInt(a4.substring(1), 16);
                            } else {
                                i2 = Integer.parseInt(a4, 16);
                            }
                        }
                        int a5 = a(i2);
                        String a6 = gVar.a("stop-opacity");
                        if (a6 != null) {
                            i = a5 | (Math.round(Float.parseFloat(a6) * 255.0f) << 24);
                        } else {
                            i = a5 | (-16777216);
                        }
                        this.w.k.add(Float.valueOf(floatValue));
                        this.w.l.add(Integer.valueOf(i));
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
                            sb.append(e.d(value2));
                        }
                        if (value3 != null || value4 != null) {
                            sb.append("translate(");
                            if (value3 != null) {
                                str4 = e.d(value3);
                            } else {
                                str4 = "0";
                            }
                            sb.append(str4);
                            sb.append(",");
                            if (value4 != null) {
                                str5 = e.d(value4);
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
                            sb.append(e.d(attributes.getValue(i3)));
                            sb.append("'");
                        }
                    }
                    sb.append(">");
                    sb.append(this.a.get(value.substring(1)));
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
                    if ("bounds".equalsIgnoreCase(e.d("id", attributes))) {
                        this.A = true;
                    }
                    if (this.y) {
                        this.z++;
                    }
                    if ("none".equals(e.d("display", attributes)) && !this.y) {
                        this.y = true;
                        this.z = 1;
                    }
                    a(attributes);
                    C0046e c0046e = new C0046e(attributes);
                    this.j.push(new Paint(this.h));
                    this.f.push(new Paint(this.d));
                    this.k.push(Boolean.valueOf(this.i));
                    this.g.push(Boolean.valueOf(this.e));
                    this.m.push(Float.valueOf(this.l));
                    Float a7 = a("opacity", attributes);
                    if (a7 != null) {
                        this.l = a7.floatValue() * this.l;
                    }
                    a(attributes, this.h);
                    a(attributes, this.d);
                    a(c0046e, this.u);
                    a(c0046e);
                    this.i = (c0046e.b("fill") != null) | this.i;
                    this.e = (c0046e.b("stroke") != null) | this.e;
                } else if (!this.y && str2.equals("rect")) {
                    Float a8 = a("x", attributes, Float.valueOf(0.0f));
                    Float a9 = a("y", attributes, Float.valueOf(0.0f));
                    Float a10 = a("width", attributes);
                    Float a11 = a("height", attributes);
                    Float a12 = a("rx", attributes, Float.valueOf(0.0f));
                    Float a13 = a("ry", attributes, Float.valueOf(0.0f));
                    a(attributes);
                    C0046e c0046e2 = new C0046e(attributes);
                    if (a(c0046e2, this.u)) {
                        a(a8.floatValue(), a9.floatValue(), a10.floatValue(), a11.floatValue());
                        if (a12.floatValue() <= 0.0f && a13.floatValue() <= 0.0f) {
                            this.c.drawRect(a8.floatValue(), a9.floatValue(), a8.floatValue() + a10.floatValue(), a9.floatValue() + a11.floatValue(), this.h);
                        } else {
                            this.n.set(a8.floatValue(), a9.floatValue(), a8.floatValue() + a10.floatValue(), a9.floatValue() + a11.floatValue());
                            this.c.drawRoundRect(this.n, a12.floatValue(), a13.floatValue(), this.h);
                        }
                    }
                    if (a(c0046e2)) {
                        if (a12.floatValue() <= 0.0f && a13.floatValue() <= 0.0f) {
                            this.c.drawRect(a8.floatValue(), a9.floatValue(), a8.floatValue() + a10.floatValue(), a9.floatValue() + a11.floatValue(), this.d);
                        } else {
                            this.n.set(a8.floatValue(), a9.floatValue(), a8.floatValue() + a10.floatValue(), a9.floatValue() + a11.floatValue());
                            this.c.drawRoundRect(this.n, a12.floatValue(), a13.floatValue(), this.d);
                        }
                    }
                    a();
                } else if (!this.y && str2.equals("image")) {
                    String d = e.d("href", attributes);
                    if (d.startsWith("data") && d.indexOf("base64") > 0) {
                        String substring = d.substring(d.indexOf(",") + 1);
                        Float a14 = a("x", attributes, Float.valueOf(0.0f));
                        Float a15 = a("y", attributes, Float.valueOf(0.0f));
                        Float a16 = a("width", attributes, Float.valueOf(0.0f));
                        Float a17 = a("height", attributes, Float.valueOf(0.0f));
                        a(attributes);
                        a(a14.floatValue(), a15.floatValue(), a16.floatValue(), a17.floatValue());
                        a(this.c, a14.floatValue(), a15.floatValue(), a16.floatValue(), a17.floatValue(), Base64.decode(substring, 0));
                        a();
                    }
                } else if (!this.y && str2.equals("line")) {
                    Float a18 = a("x1", attributes);
                    Float a19 = a("x2", attributes);
                    Float a20 = a("y1", attributes);
                    Float a21 = a("y2", attributes);
                    if (a(new C0046e(attributes))) {
                        a(attributes);
                        a(a18.floatValue(), a20.floatValue());
                        a(a19.floatValue(), a21.floatValue());
                        this.c.drawLine(a18.floatValue(), a20.floatValue(), a19.floatValue(), a21.floatValue(), this.d);
                        a();
                    }
                } else if (!this.y && str2.equals("circle")) {
                    Float a22 = a("cx", attributes);
                    Float a23 = a("cy", attributes);
                    Float a24 = a("r", attributes);
                    if (a22 != null && a23 != null && a24 != null) {
                        a(attributes);
                        C0046e c0046e3 = new C0046e(attributes);
                        if (a(c0046e3, this.u)) {
                            a(a22.floatValue() - a24.floatValue(), a23.floatValue() - a24.floatValue());
                            a(a22.floatValue() + a24.floatValue(), a23.floatValue() + a24.floatValue());
                            this.c.drawCircle(a22.floatValue(), a23.floatValue(), a24.floatValue(), this.h);
                        }
                        if (a(c0046e3)) {
                            this.c.drawCircle(a22.floatValue(), a23.floatValue(), a24.floatValue(), this.d);
                        }
                        a();
                    }
                } else if (!this.y && str2.equals("ellipse")) {
                    Float a25 = a("cx", attributes);
                    Float a26 = a("cy", attributes);
                    Float a27 = a("rx", attributes);
                    Float a28 = a("ry", attributes);
                    if (a25 != null && a26 != null && a27 != null && a28 != null) {
                        a(attributes);
                        C0046e c0046e4 = new C0046e(attributes);
                        this.n.set(a25.floatValue() - a27.floatValue(), a26.floatValue() - a28.floatValue(), a25.floatValue() + a27.floatValue(), a26.floatValue() + a28.floatValue());
                        if (a(c0046e4, this.u)) {
                            a(a25.floatValue() - a27.floatValue(), a26.floatValue() - a28.floatValue());
                            a(a25.floatValue() + a27.floatValue(), a26.floatValue() + a28.floatValue());
                            this.c.drawOval(this.n, this.h);
                        }
                        if (a(c0046e4)) {
                            this.c.drawOval(this.n, this.d);
                        }
                        a();
                    }
                } else if (!this.y && (str2.equals("polygon") || str2.equals("polyline"))) {
                    d c = e.c("points", attributes);
                    if (c != null) {
                        Path path = new Path();
                        ArrayList arrayList = c.a;
                        if (arrayList.size() > 1) {
                            a(attributes);
                            C0046e c0046e5 = new C0046e(attributes);
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
                            if (a(c0046e5, this.u)) {
                                a(path);
                                this.c.drawPath(path, this.h);
                            }
                            if (a(c0046e5)) {
                                this.c.drawPath(path, this.d);
                            }
                            a();
                        }
                    }
                } else if (!this.y && str2.equals("path")) {
                    Path g = e.g(e.d("d", attributes));
                    a(attributes);
                    C0046e c0046e6 = new C0046e(attributes);
                    if (a(c0046e6, this.u)) {
                        a(g);
                        this.c.drawPath(g, this.h);
                    }
                    if (a(c0046e6)) {
                        this.c.drawPath(g, this.d);
                    }
                    a();
                } else if (!this.y && str2.equals("text")) {
                    a(attributes);
                    this.x = new a(attributes);
                } else if (!this.y) {
                    Log.d("SVG", String.format("Unrecognized tag: %s (%s)", str2, b(attributes)));
                }
            }
        }

        private String b(Attributes attributes) {
            String str = "";
            for (int i = 0; i < attributes.getLength(); i++) {
                str = str + " " + attributes.getLocalName(i) + "='" + attributes.getValue(i) + "'";
            }
            return str;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            if (this.x != null) {
                this.x.a(cArr, i, i2);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            b bVar;
            b bVar2;
            int i = 0;
            if (this.B) {
                if (str2.equals("defs")) {
                    this.B = false;
                }
            } else if (str2.equals("svg")) {
                this.b.endRecording();
            } else if (!this.y && str2.equals("text")) {
                if (this.x != null) {
                    this.x.a(this.c);
                    this.x.b();
                }
                a();
            } else if (str2.equals("linearGradient")) {
                if (this.w.a != null) {
                    if (this.w.b != null && (bVar2 = this.v.get(this.w.b)) != null) {
                        this.w = bVar2.a(this.w);
                    }
                    int[] iArr = new int[this.w.l.size()];
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        iArr[i2] = this.w.l.get(i2).intValue();
                    }
                    float[] fArr = new float[this.w.k.size()];
                    while (i < fArr.length) {
                        fArr[i] = this.w.k.get(i).floatValue();
                        i++;
                    }
                    if (iArr.length == 0) {
                        Log.d("SVG", "missing colors in gradient");
                    }
                    LinearGradient linearGradient = new LinearGradient(this.w.d, this.w.e, this.w.f, this.w.g, iArr, fArr, Shader.TileMode.CLAMP);
                    if (this.w.m != null) {
                        linearGradient.setLocalMatrix(this.w.m);
                    }
                    this.u.put(this.w.a, linearGradient);
                    this.v.put(this.w.a, this.w);
                }
            } else if (str2.equals("radialGradient")) {
                if (this.w.a != null) {
                    if (this.w.b != null && (bVar = this.v.get(this.w.b)) != null) {
                        this.w = bVar.a(this.w);
                    }
                    int[] iArr2 = new int[this.w.l.size()];
                    for (int i3 = 0; i3 < iArr2.length; i3++) {
                        iArr2[i3] = this.w.l.get(i3).intValue();
                    }
                    float[] fArr2 = new float[this.w.k.size()];
                    while (i < fArr2.length) {
                        fArr2[i] = this.w.k.get(i).floatValue();
                        i++;
                    }
                    RadialGradient radialGradient = new RadialGradient(this.w.h, this.w.i, this.w.j, iArr2, fArr2, Shader.TileMode.CLAMP);
                    if (this.w.m != null) {
                        radialGradient.setLocalMatrix(this.w.m);
                    }
                    this.u.put(this.w.a, radialGradient);
                    this.v.put(this.w.a, this.w);
                }
            } else if (str2.equals("g")) {
                if (this.A) {
                    this.A = false;
                }
                if (this.y) {
                    this.z--;
                    if (this.z == 0) {
                        this.y = false;
                    }
                }
                this.u.clear();
                a();
                this.h = this.j.pop();
                this.i = this.k.pop().booleanValue();
                this.d = this.f.pop();
                this.e = this.g.pop().booleanValue();
                this.l = this.m.pop().floatValue();
            }
        }

        /* loaded from: classes.dex */
        private class a {
            private Paint b;
            private Paint c;
            private float d;
            private float e;
            private String f = null;
            private boolean g = true;
            private int h;

            public a(Attributes attributes) {
                this.b = null;
                this.c = null;
                this.h = 0;
                this.d = f.this.a("x", attributes, Float.valueOf(0.0f)).floatValue();
                this.e = f.this.a("y", attributes, Float.valueOf(0.0f)).floatValue();
                C0046e c0046e = new C0046e(attributes);
                if (f.this.a(c0046e, f.this.u)) {
                    this.c = new Paint(f.this.h);
                    f.this.a(attributes, this.c);
                }
                if (f.this.a(c0046e)) {
                    this.b = new Paint(f.this.d);
                    f.this.a(attributes, this.b);
                }
                String d = e.d("alignment-baseline", attributes);
                if ("middle".equals(d)) {
                    this.h = 1;
                } else if ("top".equals(d)) {
                    this.h = 2;
                }
            }

            public void a(char[] cArr, int i, int i2) {
                Rect rect;
                if (a()) {
                    if (this.f == null) {
                        this.f = new String(cArr, i, i2);
                    } else {
                        this.f += new String(cArr, i, i2);
                    }
                    if (this.h > 0) {
                        Paint paint = this.b == null ? this.c : this.b;
                        paint.getTextBounds(this.f, 0, this.f.length(), new Rect());
                        this.e = (this.h == 1 ? -rect.centerY() : rect.height()) + this.e;
                    }
                }
            }

            public boolean a() {
                return this.g;
            }

            public void b() {
                this.g = false;
            }

            public void a(Canvas canvas) {
                if (this.c != null) {
                    canvas.drawText(this.f, this.d, this.e, this.c);
                }
                if (this.b != null) {
                    canvas.drawText(this.f, this.d, this.e, this.b);
                }
            }
        }

        private Paint.Align c(Attributes attributes) {
            String d = e.d("text-anchor", attributes);
            if (d == null) {
                return null;
            }
            if ("middle".equals(d)) {
                return Paint.Align.CENTER;
            }
            if ("end".equals(d)) {
                return Paint.Align.RIGHT;
            }
            return Paint.Align.LEFT;
        }

        private Typeface d(Attributes attributes) {
            String d = e.d("font-family", attributes);
            String d2 = e.d("font-style", attributes);
            String d3 = e.d("font-weight", attributes);
            if (d == null && d2 == null && d3 == null) {
                return null;
            }
            int i = 0;
            if ("italic".equals(d2)) {
                i = 2;
            }
            if ("bold".equals(d3)) {
                i |= 1;
            }
            return Typeface.create(d, i);
        }

        private Float a(String str, Attributes attributes) {
            return a(str, attributes, (Float) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Float a(String str, Attributes attributes, Float f) {
            Float a2 = a(str, attributes, this.t);
            return a2 == null ? f : a2;
        }

        private Float a(String str, Attributes attributes, float f) {
            float width;
            String d = e.d(str, attributes);
            if (d == null) {
                return null;
            }
            if (d.endsWith("px")) {
                return Float.valueOf(Float.parseFloat(d.substring(0, d.length() - 2)));
            }
            if (d.endsWith("pt")) {
                return Float.valueOf((Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * f) / 72.0f);
            }
            if (d.endsWith("pc")) {
                return Float.valueOf((Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * f) / 6.0f);
            }
            if (d.endsWith("cm")) {
                return Float.valueOf((Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * f) / 2.54f);
            }
            if (d.endsWith("mm")) {
                return Float.valueOf((Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * f) / 254.0f);
            }
            if (d.endsWith("in")) {
                return Float.valueOf(Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * f);
            }
            if (d.endsWith("em")) {
                return Float.valueOf(Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * this.h.getTextSize());
            } else if (d.endsWith("ex")) {
                return Float.valueOf((Float.valueOf(d.substring(0, d.length() - 2)).floatValue() * this.h.getTextSize()) / 2.0f);
            } else if (d.endsWith("%")) {
                Float valueOf = Float.valueOf(d.substring(0, d.length() - 1));
                if (str.indexOf("x") >= 0 || str.equals("width")) {
                    width = this.c.getWidth() / 100.0f;
                } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                    width = this.c.getHeight() / 100.0f;
                } else {
                    width = (this.c.getHeight() + this.c.getWidth()) / 2.0f;
                }
                return Float.valueOf(width * valueOf.floatValue());
            } else {
                return Float.valueOf(d);
            }
        }
    }
}
