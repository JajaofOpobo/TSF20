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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    static float a = 72.0f;

    public static com.tsf.extend.a.b a(InputStream inputStream) {
        return a(inputStream, 0, 0, false, false, a);
    }

    public static com.tsf.extend.a.b a(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        com.tsf.extend.a.b bVarA = a(inputStreamOpen);
        inputStreamOpen.close();
        return bVarA;
    }

    private static com.tsf.extend.a.b a(InputStream inputStream, Integer num, Integer num2, boolean z, boolean z2, float f2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
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
            Log.i("SVG", "Parsing complete in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " millis.");
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
        int length2 = 0;
        for (int i = 1; i < length; i++) {
            if (z) {
                z = false;
            } else {
                char cCharAt = str.charAt(i);
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        String strSubstring = str.substring(length2, i);
                        if (strSubstring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(strSubstring)));
                            if (cCharAt == '-') {
                                length2 = i;
                            } else {
                                length2 = i + 1;
                                z = true;
                            }
                        } else {
                            length2++;
                        }
                        break;
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
                        String strSubstring2 = str.substring(length2, i);
                        if (strSubstring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(strSubstring2)));
                        }
                        return new d(arrayList, i);
                }
            }
        }
        String strSubstring3 = str.substring(length2);
        if (strSubstring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(strSubstring3)));
            } catch (NumberFormatException e) {
            }
            length2 = str.length();
        }
        return new d(arrayList, length2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Matrix f(String str) {
        Matrix matrix = new Matrix();
        while (true) {
            a(str, matrix);
            int iIndexOf = str.indexOf(")");
            if (iIndexOf <= 0 || str.length() <= iIndexOf + 1) {
                break;
            }
            str = str.substring(iIndexOf + 1).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    private static Matrix a(String str, Matrix matrix) {
        float f2;
        float fFloatValue = 0.0f;
        if (str.startsWith("matrix(")) {
            d dVarE = e(str.substring("matrix(".length()));
            if (dVarE.a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) dVarE.a.get(0)).floatValue(), ((Float) dVarE.a.get(2)).floatValue(), ((Float) dVarE.a.get(4)).floatValue(), ((Float) dVarE.a.get(1)).floatValue(), ((Float) dVarE.a.get(3)).floatValue(), ((Float) dVarE.a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            d dVarE2 = e(str.substring("translate(".length()));
            if (dVarE2.a.size() > 0) {
                matrix.preTranslate(((Float) dVarE2.a.get(0)).floatValue(), dVarE2.a.size() > 1 ? ((Float) dVarE2.a.get(1)).floatValue() : 0.0f);
            }
        } else if (str.startsWith("scale(")) {
            d dVarE3 = e(str.substring("scale(".length()));
            if (dVarE3.a.size() > 0) {
                float fFloatValue2 = ((Float) dVarE3.a.get(0)).floatValue();
                matrix.preScale(fFloatValue2, dVarE3.a.size() > 1 ? ((Float) dVarE3.a.get(1)).floatValue() : fFloatValue2);
            }
        } else if (str.startsWith("skewX(")) {
            if (e(str.substring("skewX(".length())).a.size() > 0) {
                matrix.preSkew((float) Math.tan(((Float) r0.a.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            if (e(str.substring("skewY(".length())).a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(((Float) r0.a.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            d dVarE4 = e(str.substring("rotate(".length()));
            if (dVarE4.a.size() > 0) {
                float fFloatValue3 = ((Float) dVarE4.a.get(0)).floatValue();
                if (dVarE4.a.size() > 2) {
                    float fFloatValue4 = ((Float) dVarE4.a.get(1)).floatValue();
                    fFloatValue = ((Float) dVarE4.a.get(2)).floatValue();
                    f2 = fFloatValue4;
                } else {
                    f2 = 0.0f;
                }
                matrix.preTranslate(f2, fFloatValue);
                matrix.preRotate(fFloatValue3);
                matrix.preTranslate(-f2, -fFloatValue);
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
            char cCharAt = str.charAt(aVar.a);
            if (!Character.isDigit(cCharAt) && cCharAt != '.' && cCharAt != '-') {
                aVar.c();
            } else if (c2 == 'M') {
                cCharAt = 'L';
            } else {
                cCharAt = c2 == 'm' ? 'l' : c2;
            }
            path.computeBounds(rectF, true);
            switch (cCharAt) {
                case 'A':
                case 'a':
                    float fE = aVar.e();
                    float fE2 = aVar.e();
                    float fE3 = aVar.e();
                    int iE = (int) aVar.e();
                    int iE2 = (int) aVar.e();
                    float fE4 = aVar.e();
                    float fE5 = aVar.e();
                    if (cCharAt == 'a') {
                        fE4 += f13;
                        fE5 += f14;
                    }
                    a(path, f13, f14, fE4, fE5, fE, fE2, fE3, iE == 1, iE2 == 1);
                    z = false;
                    f2 = f9;
                    f3 = f10;
                    f5 = f11;
                    f4 = f12;
                    f7 = fE5;
                    f6 = fE4;
                    break;
                case 'C':
                case 'c':
                    float fE6 = aVar.e();
                    float fE7 = aVar.e();
                    float fE8 = aVar.e();
                    float fE9 = aVar.e();
                    float fE10 = aVar.e();
                    float fE11 = aVar.e();
                    if (cCharAt == 'c') {
                        fE8 += f13;
                        fE10 += f13;
                        fE7 += f14;
                        fE9 += f14;
                        fE11 += f14;
                        f8 = fE6 + f13;
                    } else {
                        f8 = fE6;
                    }
                    path.cubicTo(f8, fE7, fE8, fE9, fE10, fE11);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    float f15 = fE9;
                    f4 = fE8;
                    f5 = f15;
                    float f16 = fE11;
                    f6 = fE10;
                    f7 = f16;
                    break;
                case 'H':
                case 'h':
                    float fE12 = aVar.e();
                    if (cCharAt == 'h') {
                        path.rLineTo(fE12, 0.0f);
                        float f17 = fE12 + f13;
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = f17;
                        f7 = f14;
                        z = false;
                    } else {
                        path.lineTo(fE12, f14);
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = fE12;
                        f7 = f14;
                        z = false;
                    }
                    break;
                case 'L':
                case 'l':
                    float fE13 = aVar.e();
                    float fE14 = aVar.e();
                    if (cCharAt == 'l') {
                        path.rLineTo(fE13, fE14);
                        float f18 = fE13 + f13;
                        float f19 = fE14 + f14;
                        z = false;
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = f18;
                        f7 = f19;
                    } else {
                        path.lineTo(fE13, fE14);
                        z = false;
                        f2 = f9;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f6 = fE13;
                        f7 = fE14;
                    }
                    break;
                case 'M':
                case 'm':
                    float fE15 = aVar.e();
                    float fE16 = aVar.e();
                    if (cCharAt == 'm') {
                        path.rMoveTo(fE15, fE16);
                        float f20 = fE15 + f13;
                        f2 = f14 + fE16;
                        f3 = f20;
                    } else {
                        path.moveTo(fE15, fE16);
                        f2 = fE16;
                        f3 = fE15;
                    }
                    z = false;
                    f5 = f11;
                    f4 = f12;
                    f7 = f2;
                    f6 = f3;
                    break;
                case 'Q':
                case 'q':
                    float fE17 = aVar.e();
                    float fE18 = aVar.e();
                    float fE19 = aVar.e();
                    float fE20 = aVar.e();
                    if (cCharAt == 'q') {
                        fE19 += f13;
                        fE20 += f14;
                        fE17 += f13;
                        fE18 += f14;
                    }
                    path.cubicTo(f13, f14, fE17, fE18, fE19, fE20);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    float f21 = fE18;
                    f4 = fE17;
                    f5 = f21;
                    float f22 = fE20;
                    f6 = fE19;
                    f7 = f22;
                    break;
                case 'S':
                case 's':
                    float fE21 = aVar.e();
                    float fE22 = aVar.e();
                    float fE23 = aVar.e();
                    float fE24 = aVar.e();
                    if (cCharAt == 's') {
                        fE21 += f13;
                        fE23 += f13;
                        fE22 += f14;
                        fE24 += f14;
                    }
                    path.cubicTo((f13 * 2.0f) - f12, (2.0f * f14) - f11, fE21, fE22, fE23, fE24);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    float f23 = fE22;
                    f4 = fE21;
                    f5 = f23;
                    float f24 = fE24;
                    f6 = fE23;
                    f7 = f24;
                    break;
                case 'T':
                case 't':
                    float fE25 = aVar.e();
                    float fE26 = aVar.e();
                    if (cCharAt == 't') {
                        fE25 += f13;
                        fE26 += f14;
                    }
                    float f25 = (2.0f * f13) - f12;
                    float f26 = (2.0f * f14) - f11;
                    path.cubicTo(f13, f14, f25, f26, fE25, fE26);
                    z = true;
                    f2 = f9;
                    f3 = f10;
                    f4 = f25;
                    f5 = f26;
                    float f27 = fE26;
                    f6 = fE25;
                    f7 = f27;
                    break;
                case 'V':
                case 'v':
                    float fE27 = aVar.e();
                    if (cCharAt == 'v') {
                        path.rLineTo(0.0f, fE27);
                        float f28 = fE27 + f14;
                        z = false;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f7 = f28;
                        f6 = f13;
                        f2 = f9;
                    } else {
                        path.lineTo(f13, fE27);
                        z = false;
                        f3 = f10;
                        f5 = f11;
                        f4 = f12;
                        f7 = fE27;
                        f6 = f13;
                        f2 = f9;
                    }
                    break;
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
                    Log.w("SVG", "Invalid path command: " + cCharAt);
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
            c2 = cCharAt;
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
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d15 = (dCos * d13) + (dSin * d14);
        double d16 = (d13 * (-dSin)) + (d14 * dCos);
        double dAbs = Math.abs(d6);
        double dAbs2 = Math.abs(d7);
        double d17 = dAbs * dAbs;
        double d18 = dAbs2 * dAbs2;
        double d19 = d15 * d15;
        double d20 = d16 * d16;
        double d21 = (d19 / d17) + (d20 / d18);
        if (d21 > 1.0d) {
            double dSqrt = dAbs * Math.sqrt(d21);
            double dSqrt2 = dAbs2 * Math.sqrt(d21);
            d9 = dSqrt2;
            d10 = dSqrt;
            d11 = dSqrt2 * dSqrt2;
            d12 = dSqrt * dSqrt;
        } else {
            d9 = dAbs2;
            d10 = dAbs;
            d11 = d18;
            d12 = d17;
        }
        double d22 = z == z2 ? -1.0d : 1.0d;
        double d23 = (((d12 * d11) - (d12 * d20)) - (d11 * d19)) / ((d11 * d19) + (d12 * d20));
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt3 = Math.sqrt(d23) * d22;
        double d24 = ((d10 * d16) / d9) * dSqrt3;
        double d25 = dSqrt3 * (-((d9 * d15) / d10));
        double d26 = ((d2 + d4) / 2.0d) + ((dCos * d24) - (dSin * d25));
        double d27 = ((d3 + d5) / 2.0d) + (dCos * d25) + (dSin * d24);
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

        private int b() throws IOException {
            this.b = new ByteArrayOutputStream();
            byte[] bArr = new byte[ItemInfo.APP_VERSION_CODE];
            int length = 0;
            while (true) {
                int i = this.a.read(bArr);
                if (-1 != i) {
                    length += bArr.length;
                    this.b.write(bArr, 0, i);
                } else {
                    this.b.flush();
                    return length;
                }
            }
        }

        public ByteArrayInputStream a() {
            return new ByteArrayInputStream(this.b.toByteArray());
        }
    }

    private static class d {
        private ArrayList<Float> a;
        private int b;

        public d(ArrayList<Float> arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }

    private static class b {
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

    private static class g {
        HashMap<String, String> a;

        private g(String str) {
            this.a = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length == 2) {
                    this.a.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }

        public String a(String str) {
            return this.a.get(str);
        }
    }

    /* JADX INFO: renamed from: com.tsf.extend.a.e$e, reason: collision with other inner class name */
    private static class C0046e {
        g a;
        Attributes b;

        private C0046e(Attributes attributes) {
            this.a = null;
            this.b = attributes;
            String strD = e.d("style", attributes);
            if (strD != null) {
                this.a = new g(strD);
            }
        }

        public String a(String str) {
            String strA = null;
            if (this.a != null) {
                strA = this.a.a(str);
            }
            if (strA == null) {
                return e.d(str, this.b);
            }
            return strA;
        }

        public String b(String str) {
            return a(str);
        }

        public Integer c(String str) {
            String strA = a(str);
            if (strA == null) {
                return null;
            }
            if (strA.startsWith("#") && (strA.length() == 4 || strA.length() == 7)) {
                try {
                    int iA = Integer.parseInt(strA.substring(1), 16);
                    if (strA.length() == 4) {
                        iA = a(iA);
                    }
                    return Integer.valueOf(iA);
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            return com.tsf.extend.a.c.a(strA);
        }

        private int a(int i) {
            return ((i & 3840) << 8) | ((i & 3840) << 12) | ((i & 240) << 4) | ((i & 240) << 8) | ((i & 15) << 4) | (i & 15);
        }

        public Float d(String str) {
            String strA = a(str);
            if (strA == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(strA));
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    private static class c extends DefaultHandler {
        HashMap<String, String> a;
        Stack<a> b;

        private c() {
            this.a = new HashMap<>();
            this.b = new Stack<>();
        }

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
                a aVarLastElement = this.b.lastElement();
                aVarLastElement.b++;
                a(aVarLastElement.c, str, str2, str3, attributes);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            if (this.b.size() > 0) {
                a aVarLastElement = this.b.lastElement();
                aVarLastElement.c.append("</");
                aVarLastElement.c.append(str2);
                aVarLastElement.c.append(">");
                aVarLastElement.b--;
                if (aVarLastElement.b == 0) {
                    String string = aVarLastElement.c.toString();
                    this.a.put(aVarLastElement.a, string);
                    this.b.pop();
                    if (this.b.size() > 0) {
                        this.b.lastElement().c.append(string);
                    }
                }
            }
        }
    }

    private static class f extends DefaultHandler {
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
        public boolean a(C0046e c0046e, HashMap<String, Shader> map) {
            if ("none".equals(c0046e.b("display"))) {
                return false;
            }
            if (this.s) {
                this.h.setShader(null);
                this.h.setColor(-1);
                return true;
            }
            String strB = c0046e.b("fill");
            if (strB != null) {
                if (strB.startsWith("url(#")) {
                    String strSubstring = strB.substring("url(#".length(), strB.length() - 1);
                    Shader shader = map.get(strSubstring);
                    if (shader != null) {
                        this.h.setShader(shader);
                        Float fD = c0046e.d("opacity");
                        if (fD == null) {
                            this.h.setAlpha(255);
                            return true;
                        }
                        this.h.setAlpha((int) (fD.floatValue() * 255.0f));
                        return true;
                    }
                    Log.w("SVG", "Didn't find shader, using black: " + strSubstring);
                    this.h.setShader(null);
                    a(c0046e, (Integer) (-16777216), true, this.h);
                    return true;
                }
                if (strB.equalsIgnoreCase("none")) {
                    this.h.setShader(null);
                    this.h.setColor(0);
                    return true;
                }
                this.h.setShader(null);
                Integer numC = c0046e.c("fill");
                if (numC != null) {
                    a(c0046e, numC, true, this.h);
                    return true;
                }
                Log.w("SVG", "Unrecognized fill color, using black: " + strB);
                a(c0046e, (Integer) (-16777216), true, this.h);
                return true;
            }
            if (this.i) {
                return this.h.getColor() != 0;
            }
            this.h.setShader(null);
            this.h.setColor(-16777216);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(Attributes attributes, Paint paint) {
            if ("none".equals(attributes.getValue("display"))) {
                return false;
            }
            if (attributes.getValue("font-size") != null) {
                paint.setTextSize(a("font-size", attributes, Float.valueOf(10.0f)).floatValue());
            }
            Typeface typefaceD = d(attributes);
            if (typefaceD != null) {
                paint.setTypeface(typefaceD);
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
            Float fD = c0046e.d("stroke-width");
            if (fD != null) {
                this.d.setStrokeWidth(fD.floatValue());
            }
            if (this.d.getStrokeWidth() <= 0.0f) {
                return false;
            }
            String strB = c0046e.b("stroke-linecap");
            if ("round".equals(strB)) {
                this.d.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(strB)) {
                this.d.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(strB)) {
                this.d.setStrokeCap(Paint.Cap.BUTT);
            }
            String strB2 = c0046e.b("stroke-linejoin");
            if ("miter".equals(strB2)) {
                this.d.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(strB2)) {
                this.d.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(strB2)) {
                this.d.setStrokeJoin(Paint.Join.BEVEL);
            }
            a(c0046e.b("stroke-dasharray"), c0046e.b("stroke-dashoffset"));
            String strA = c0046e.a("stroke");
            if (strA != null) {
                if (strA.equalsIgnoreCase("none")) {
                    this.d.setColor(0);
                    return false;
                }
                Integer numC = c0046e.c("stroke");
                if (numC != null) {
                    a(c0046e, numC, false, this.d);
                    return true;
                }
                Log.d("SVG", "Unrecognized stroke color, using none: " + strA);
                this.d.setColor(0);
                return false;
            }
            if (this.e) {
                return this.d.getColor() != 0;
            }
            this.d.setColor(0);
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
            String strD = e.d("gradientTransform", attributes);
            if (strD != null) {
                bVar.m = e.f(strD);
            }
            String strD2 = e.d("href", attributes);
            if (strD2 != null) {
                if (strD2.startsWith("#")) {
                    strD2 = strD2.substring(1);
                }
                bVar.b = strD2;
            }
            return bVar;
        }

        private void a(C0046e c0046e, Integer num, boolean z, Paint paint) {
            paint.setColor(a(num.intValue()) | (-16777216));
            Float fD = c0046e.d("opacity");
            if (fD == null) {
                fD = c0046e.d(z ? "fill-opacity" : "stroke-opacity");
            }
            if (fD == null) {
                fD = Float.valueOf(1.0f);
            }
            paint.setAlpha((int) (fD.floatValue() * 255.0f * this.l));
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
                int iCountTokens = stringTokenizer.countTokens();
                if ((iCountTokens & 1) == 1) {
                    iCountTokens *= 2;
                }
                float[] fArr = new float[iCountTokens];
                float fA = 1.0f;
                float f2 = 0.0f;
                int i2 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    fA = a(stringTokenizer.nextToken(), fA);
                    fArr[i2] = fA;
                    f2 += fA;
                    i2++;
                }
                while (i2 < fArr.length) {
                    float f3 = fArr[i];
                    fArr[i2] = f3;
                    f2 += f3;
                    i2++;
                    i++;
                }
                if (str2 != null) {
                    try {
                        f = Float.parseFloat(str2) % f2;
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
            String strD = e.d("transform", attributes);
            Matrix matrixF = strD == null ? C : e.f(strD);
            this.c.save();
            this.c.concat(matrixF);
        }

        private void a() {
            this.c.restore();
        }

        private void a(Canvas canvas, float f, float f2, float f3, float f4, byte[] bArr) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray != null) {
                bitmapDecodeByteArray.prepareToDraw();
                Paint paint = new Paint(3);
                RectF rectF = new RectF(f, f2, f + f3, f2 + f4);
                canvas.clipRect(rectF, Region.Op.REPLACE);
                canvas.drawBitmap(bitmapDecodeByteArray, (Rect) null, rectF, paint);
                bitmapDecodeByteArray.recycle();
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String strD;
            String strD2;
            int iRound;
            if (!this.e) {
                this.d.setAlpha(255);
            }
            if (!this.i) {
                this.h.setAlpha(255);
            }
            if (this.A) {
                if (str2.equals("rect")) {
                    Float fA = a("x", attributes);
                    if (fA == null) {
                        fA = Float.valueOf(0.0f);
                    }
                    Float fA2 = a("y", attributes);
                    if (fA2 == null) {
                        fA2 = Float.valueOf(0.0f);
                    }
                    this.o = new RectF(fA.floatValue(), fA2.floatValue(), fA.floatValue() + a("width", attributes).floatValue(), fA2.floatValue() + a("height", attributes).floatValue());
                    return;
                }
                return;
            }
            if (!this.B) {
                if (str2.equals("svg")) {
                    this.c = this.b.beginRecording((int) Math.ceil(a("width", attributes).floatValue()), (int) Math.ceil(a("height", attributes).floatValue()));
                    return;
                }
                if (str2.equals("defs")) {
                    this.B = true;
                    return;
                }
                if (str2.equals("linearGradient")) {
                    this.w = a(true, attributes);
                    return;
                }
                if (str2.equals("radialGradient")) {
                    this.w = a(false, attributes);
                    return;
                }
                if (str2.equals("stop")) {
                    if (this.w != null) {
                        float fFloatValue = a("offset", attributes).floatValue();
                        g gVar = new g(e.d("style", attributes));
                        String strA = gVar.a("stop-color");
                        int i = -16777216;
                        if (strA != null) {
                            if (strA.startsWith("#")) {
                                i = Integer.parseInt(strA.substring(1), 16);
                            } else {
                                i = Integer.parseInt(strA, 16);
                            }
                        }
                        int iA = a(i);
                        String strA2 = gVar.a("stop-opacity");
                        if (strA2 != null) {
                            iRound = iA | (Math.round(Float.parseFloat(strA2) * 255.0f) << 24);
                        } else {
                            iRound = iA | (-16777216);
                        }
                        this.w.k.add(Float.valueOf(fFloatValue));
                        this.w.l.add(Integer.valueOf(iRound));
                        return;
                    }
                    return;
                }
                if (str2.equals("use")) {
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
                                strD = e.d(value3);
                            } else {
                                strD = "0";
                            }
                            sb.append(strD);
                            sb.append(",");
                            if (value4 != null) {
                                strD2 = e.d(value4);
                            } else {
                                strD2 = "0";
                            }
                            sb.append(strD2);
                            sb.append(")");
                        }
                        sb.append("'");
                    }
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        String qName = attributes.getQName(i2);
                        if (!"x".equals(qName) && !"y".equals(qName) && !"width".equals(qName) && !"height".equals(qName) && !"xlink:href".equals(qName) && !"transform".equals(qName)) {
                            sb.append(" ");
                            sb.append(qName);
                            sb.append("='");
                            sb.append(e.d(attributes.getValue(i2)));
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
                        return;
                    } catch (Exception e) {
                        Log.d("SVG", sb.toString());
                        e.printStackTrace();
                        return;
                    }
                }
                if (str2.equals("g")) {
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
                    Float fA3 = a("opacity", attributes);
                    if (fA3 != null) {
                        this.l = fA3.floatValue() * this.l;
                    }
                    a(attributes, this.h);
                    a(attributes, this.d);
                    a(c0046e, this.u);
                    a(c0046e);
                    this.i = (c0046e.b("fill") != null) | this.i;
                    this.e = (c0046e.b("stroke") != null) | this.e;
                    return;
                }
                if (!this.y && str2.equals("rect")) {
                    Float fA4 = a("x", attributes, Float.valueOf(0.0f));
                    Float fA5 = a("y", attributes, Float.valueOf(0.0f));
                    Float fA6 = a("width", attributes);
                    Float fA7 = a("height", attributes);
                    Float fA8 = a("rx", attributes, Float.valueOf(0.0f));
                    Float fA9 = a("ry", attributes, Float.valueOf(0.0f));
                    a(attributes);
                    C0046e c0046e2 = new C0046e(attributes);
                    if (a(c0046e2, this.u)) {
                        a(fA4.floatValue(), fA5.floatValue(), fA6.floatValue(), fA7.floatValue());
                        if (fA8.floatValue() <= 0.0f && fA9.floatValue() <= 0.0f) {
                            this.c.drawRect(fA4.floatValue(), fA5.floatValue(), fA4.floatValue() + fA6.floatValue(), fA5.floatValue() + fA7.floatValue(), this.h);
                        } else {
                            this.n.set(fA4.floatValue(), fA5.floatValue(), fA4.floatValue() + fA6.floatValue(), fA5.floatValue() + fA7.floatValue());
                            this.c.drawRoundRect(this.n, fA8.floatValue(), fA9.floatValue(), this.h);
                        }
                    }
                    if (a(c0046e2)) {
                        if (fA8.floatValue() <= 0.0f && fA9.floatValue() <= 0.0f) {
                            this.c.drawRect(fA4.floatValue(), fA5.floatValue(), fA4.floatValue() + fA6.floatValue(), fA5.floatValue() + fA7.floatValue(), this.d);
                        } else {
                            this.n.set(fA4.floatValue(), fA5.floatValue(), fA4.floatValue() + fA6.floatValue(), fA5.floatValue() + fA7.floatValue());
                            this.c.drawRoundRect(this.n, fA8.floatValue(), fA9.floatValue(), this.d);
                        }
                    }
                    a();
                    return;
                }
                if (!this.y && str2.equals("image")) {
                    String strD3 = e.d("href", attributes);
                    if (strD3.startsWith("data") && strD3.indexOf("base64") > 0) {
                        String strSubstring = strD3.substring(strD3.indexOf(",") + 1);
                        Float fA10 = a("x", attributes, Float.valueOf(0.0f));
                        Float fA11 = a("y", attributes, Float.valueOf(0.0f));
                        Float fA12 = a("width", attributes, Float.valueOf(0.0f));
                        Float fA13 = a("height", attributes, Float.valueOf(0.0f));
                        a(attributes);
                        a(fA10.floatValue(), fA11.floatValue(), fA12.floatValue(), fA13.floatValue());
                        a(this.c, fA10.floatValue(), fA11.floatValue(), fA12.floatValue(), fA13.floatValue(), Base64.decode(strSubstring, 0));
                        a();
                        return;
                    }
                    return;
                }
                if (!this.y && str2.equals("line")) {
                    Float fA14 = a("x1", attributes);
                    Float fA15 = a("x2", attributes);
                    Float fA16 = a("y1", attributes);
                    Float fA17 = a("y2", attributes);
                    if (a(new C0046e(attributes))) {
                        a(attributes);
                        a(fA14.floatValue(), fA16.floatValue());
                        a(fA15.floatValue(), fA17.floatValue());
                        this.c.drawLine(fA14.floatValue(), fA16.floatValue(), fA15.floatValue(), fA17.floatValue(), this.d);
                        a();
                        return;
                    }
                    return;
                }
                if (!this.y && str2.equals("circle")) {
                    Float fA18 = a("cx", attributes);
                    Float fA19 = a("cy", attributes);
                    Float fA20 = a("r", attributes);
                    if (fA18 != null && fA19 != null && fA20 != null) {
                        a(attributes);
                        C0046e c0046e3 = new C0046e(attributes);
                        if (a(c0046e3, this.u)) {
                            a(fA18.floatValue() - fA20.floatValue(), fA19.floatValue() - fA20.floatValue());
                            a(fA18.floatValue() + fA20.floatValue(), fA19.floatValue() + fA20.floatValue());
                            this.c.drawCircle(fA18.floatValue(), fA19.floatValue(), fA20.floatValue(), this.h);
                        }
                        if (a(c0046e3)) {
                            this.c.drawCircle(fA18.floatValue(), fA19.floatValue(), fA20.floatValue(), this.d);
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (!this.y && str2.equals("ellipse")) {
                    Float fA21 = a("cx", attributes);
                    Float fA22 = a("cy", attributes);
                    Float fA23 = a("rx", attributes);
                    Float fA24 = a("ry", attributes);
                    if (fA21 != null && fA22 != null && fA23 != null && fA24 != null) {
                        a(attributes);
                        C0046e c0046e4 = new C0046e(attributes);
                        this.n.set(fA21.floatValue() - fA23.floatValue(), fA22.floatValue() - fA24.floatValue(), fA21.floatValue() + fA23.floatValue(), fA22.floatValue() + fA24.floatValue());
                        if (a(c0046e4, this.u)) {
                            a(fA21.floatValue() - fA23.floatValue(), fA22.floatValue() - fA24.floatValue());
                            a(fA21.floatValue() + fA23.floatValue(), fA22.floatValue() + fA24.floatValue());
                            this.c.drawOval(this.n, this.h);
                        }
                        if (a(c0046e4)) {
                            this.c.drawOval(this.n, this.d);
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (!this.y && (str2.equals("polygon") || str2.equals("polyline"))) {
                    d dVarC = e.c("points", attributes);
                    if (dVarC != null) {
                        Path path = new Path();
                        ArrayList arrayList = dVarC.a;
                        if (arrayList.size() > 1) {
                            a(attributes);
                            C0046e c0046e5 = new C0046e(attributes);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            int i3 = 2;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= arrayList.size()) {
                                    break;
                                }
                                path.lineTo(((Float) arrayList.get(i4)).floatValue(), ((Float) arrayList.get(i4 + 1)).floatValue());
                                i3 = i4 + 2;
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
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!this.y && str2.equals("path")) {
                    Path pathG = e.g(e.d("d", attributes));
                    a(attributes);
                    C0046e c0046e6 = new C0046e(attributes);
                    if (a(c0046e6, this.u)) {
                        a(pathG);
                        this.c.drawPath(pathG, this.h);
                    }
                    if (a(c0046e6)) {
                        this.c.drawPath(pathG, this.d);
                    }
                    a();
                    return;
                }
                if (!this.y && str2.equals("text")) {
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
                    return;
                }
                return;
            }
            if (str2.equals("svg")) {
                this.b.endRecording();
                return;
            }
            if (!this.y && str2.equals("text")) {
                if (this.x != null) {
                    this.x.a(this.c);
                    this.x.b();
                }
                a();
                return;
            }
            if (str2.equals("linearGradient")) {
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
                    return;
                }
                return;
            }
            if (str2.equals("radialGradient")) {
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
                    return;
                }
                return;
            }
            if (str2.equals("g")) {
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
                String strD = e.d("alignment-baseline", attributes);
                if ("middle".equals(strD)) {
                    this.h = 1;
                } else if ("top".equals(strD)) {
                    this.h = 2;
                }
            }

            public void a(char[] cArr, int i, int i2) {
                if (a()) {
                    if (this.f == null) {
                        this.f = new String(cArr, i, i2);
                    } else {
                        this.f += new String(cArr, i, i2);
                    }
                    if (this.h > 0) {
                        Paint paint = this.b == null ? this.c : this.b;
                        paint.getTextBounds(this.f, 0, this.f.length(), new Rect());
                        this.e = (this.h == 1 ? -r1.centerY() : r1.height()) + this.e;
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
            String strD = e.d("text-anchor", attributes);
            if (strD == null) {
                return null;
            }
            if ("middle".equals(strD)) {
                return Paint.Align.CENTER;
            }
            if ("end".equals(strD)) {
                return Paint.Align.RIGHT;
            }
            return Paint.Align.LEFT;
        }

        private Typeface d(Attributes attributes) {
            String strD = e.d("font-family", attributes);
            String strD2 = e.d("font-style", attributes);
            String strD3 = e.d("font-weight", attributes);
            if (strD == null && strD2 == null && strD3 == null) {
                return null;
            }
            int i = 0;
            if ("italic".equals(strD2)) {
                i = 2;
            }
            if ("bold".equals(strD3)) {
                i |= 1;
            }
            return Typeface.create(strD, i);
        }

        private Float a(String str, Attributes attributes) {
            return a(str, attributes, (Float) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Float a(String str, Attributes attributes, Float f) {
            Float fA = a(str, attributes, this.t);
            return fA == null ? f : fA;
        }

        private Float a(String str, Attributes attributes, float f) {
            float width;
            String strD = e.d(str, attributes);
            if (strD == null) {
                return null;
            }
            if (strD.endsWith("px")) {
                return Float.valueOf(Float.parseFloat(strD.substring(0, strD.length() - 2)));
            }
            if (strD.endsWith("pt")) {
                return Float.valueOf((Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * f) / 72.0f);
            }
            if (strD.endsWith("pc")) {
                return Float.valueOf((Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * f) / 6.0f);
            }
            if (strD.endsWith("cm")) {
                return Float.valueOf((Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * f) / 2.54f);
            }
            if (strD.endsWith("mm")) {
                return Float.valueOf((Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * f) / 254.0f);
            }
            if (strD.endsWith("in")) {
                return Float.valueOf(Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * f);
            }
            if (strD.endsWith("em")) {
                return Float.valueOf(Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * this.h.getTextSize());
            }
            if (strD.endsWith("ex")) {
                return Float.valueOf((Float.valueOf(strD.substring(0, strD.length() - 2)).floatValue() * this.h.getTextSize()) / 2.0f);
            }
            if (strD.endsWith("%")) {
                Float fValueOf = Float.valueOf(strD.substring(0, strD.length() - 1));
                if (str.indexOf("x") >= 0 || str.equals("width")) {
                    width = this.c.getWidth() / 100.0f;
                } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                    width = this.c.getHeight() / 100.0f;
                } else {
                    width = (this.c.getHeight() + this.c.getWidth()) / 2.0f;
                }
                return Float.valueOf(width * fValueOf.floatValue());
            }
            return Float.valueOf(strD);
        }
    }
}
