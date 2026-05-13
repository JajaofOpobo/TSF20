package com.censivn.C3DEngine.p057e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p057e.AbstractC1084a;
import com.tsf.shell.utils.C4189x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;
/* renamed from: com.censivn.C3DEngine.e.f */
/* loaded from: classes.dex */
public class C1096f extends AbstractC1084a implements InterfaceC1090b {

    /* renamed from: n */
    private final String f3499n;

    /* renamed from: o */
    private final String f3500o;

    /* renamed from: p */
    private final String f3501p;

    /* renamed from: q */
    private final String f3502q;

    /* renamed from: r */
    private final String f3503r;

    /* renamed from: s */
    private final String f3504s;

    /* renamed from: t */
    private final String f3505t;

    /* renamed from: u */
    private final String f3506u;

    /* renamed from: v */
    private final String f3507v;

    /* renamed from: w */
    private final String f3508w;

    public C1096f(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
        this.f3499n = "v";
        this.f3500o = "f";
        this.f3501p = "vt";
        this.f3502q = "vn";
        this.f3503r = "o";
        this.f3504s = "mtllib";
        this.f3505t = "usemtl";
        this.f3506u = "newmtl";
        this.f3507v = "Kd";
        this.f3508w = "map_Kd";
    }

    @Override // com.censivn.C3DEngine.p057e.AbstractC1084a, com.censivn.C3DEngine.p057e.InterfaceC1090b
    /* renamed from: c */
    public void mo9869c() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f3428a.openRawResource(this.f3428a.getIdentifier(this.f3429b, null, null))));
        this.f3433f = new C1098g(this.f3436i, this.f3437j, this.f3438k);
        this.f3432e.add(this.f3433f);
        Log.d("Censivn3D", "Start parsing object " + this.f3429b);
        Log.d("Censivn3D", "Start time " + timeInMillis);
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                int countTokens = stringTokenizer.countTokens();
                if (countTokens != 0) {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.equals("v")) {
                        Number3d number3d = new Number3d();
                        number3d.f2526x = Float.parseFloat(stringTokenizer.nextToken());
                        number3d.f2527y = Float.parseFloat(stringTokenizer.nextToken());
                        number3d.f2528z = Float.parseFloat(stringTokenizer.nextToken());
                        this.f3436i.add(number3d);
                    } else if (nextToken.equals("f")) {
                        if (countTokens == 4) {
                            this.f3433f.f3511b++;
                            this.f3433f.f3510a.add(new C1097a(this, readLine, this.f3431d, 3));
                        } else if (countTokens == 5) {
                            this.f3433f.f3511b += 2;
                            this.f3433f.f3510a.add(new C1097a(this, readLine, this.f3431d, 4));
                        }
                    } else if (nextToken.equals("vt")) {
                        C0879Uv c0879Uv = new C0879Uv();
                        c0879Uv.f2530u = Float.parseFloat(stringTokenizer.nextToken());
                        c0879Uv.f2531v = Float.parseFloat(stringTokenizer.nextToken()) * (-1.0f);
                        this.f3437j.add(c0879Uv);
                    } else if (nextToken.equals("vn")) {
                        Number3d number3d2 = new Number3d();
                        number3d2.f2526x = Float.parseFloat(stringTokenizer.nextToken());
                        number3d2.f2527y = Float.parseFloat(stringTokenizer.nextToken());
                        number3d2.f2528z = Float.parseFloat(stringTokenizer.nextToken());
                        this.f3438k.add(number3d2);
                    } else if (nextToken.equals("mtllib")) {
                        m9871a(stringTokenizer.nextToken());
                    } else if (nextToken.equals("usemtl")) {
                        this.f3431d = stringTokenizer.nextToken();
                    } else if (nextToken.equals("o")) {
                        String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
                        if (this.f3434g) {
                            Log.d("Censivn3D", "Create object " + nextToken2);
                            this.f3433f.f3515f = nextToken2;
                            this.f3434g = false;
                        } else {
                            Log.d("Censivn3D", "Create object " + nextToken2);
                            this.f3433f = new C1098g(this.f3436i, this.f3437j, this.f3438k);
                            this.f3433f.f3515f = nextToken2;
                            this.f3432e.add(this.f3433f);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Log.d("Censivn3D", "End time " + (Calendar.getInstance().getTimeInMillis() - timeInMillis));
    }

    @Override // com.censivn.C3DEngine.p057e.AbstractC1084a, com.censivn.C3DEngine.p057e.InterfaceC1090b
    /* renamed from: b */
    public C0980j mo9870b() {
        Bitmap bitmap;
        Log.d("Censivn3D", "Start object creation");
        C0980j c0980j = new C0980j(0, 0);
        int size = this.f3432e.size();
        if (!this.f3435h.m9888c()) {
            bitmap = null;
        } else {
            this.f3435h.m9894a();
            this.f3435h.m9890b();
            Bitmap m9890b = this.f3435h.m9890b();
            this.f3435h.m9893a(C0853a.m10853g().m10544a(m9890b, this.f3439l));
            bitmap = m9890b;
        }
        for (int i = 0; i < size; i++) {
            C1098g c1098g = this.f3432e.get(i);
            Log.d("Censivn3D", "Creating object " + c1098g.f3515f);
            c0980j.addChild(c1098g.m9865a(this.f3440m, this.f3435h));
        }
        if (this.f3435h.m9888c() && bitmap != null) {
            bitmap.recycle();
        }
        Log.d("Censivn3D", "Object creation finished");
        mo9872a();
        return c0980j;
    }

    /* renamed from: a */
    private void m9871a(String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer(this.f3430c);
        StringBuffer stringBuffer2 = new StringBuffer(str);
        int lastIndexOf = stringBuffer2.lastIndexOf(".");
        if (lastIndexOf > -1) {
            stringBuffer2 = stringBuffer2.replace(lastIndexOf, lastIndexOf + 1, "_");
        }
        stringBuffer.append(":raw/");
        stringBuffer.append(stringBuffer2.toString());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f3428a.openRawResource(this.f3428a.getIdentifier(stringBuffer.toString(), null, null))));
        String str3 = "";
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ");
                    if (split.length != 0) {
                        String str4 = split[0];
                        if (str4.equals("newmtl")) {
                            if (split.length > 1) {
                                str2 = split[1];
                                this.f3440m.put(str2, new AbstractC1084a.C1087b(str2));
                                str3 = str2;
                            }
                            str2 = str3;
                            str3 = str2;
                        } else if (str4.equals("Kd") && !str4.equals("map_Kd")) {
                            this.f3440m.get(str3).f3452c = new Color4(Float.parseFloat(split[1]) * 255.0f, Float.parseFloat(split[2]) * 255.0f, Float.parseFloat(split[3]) * 255.0f, 255.0f);
                            str2 = str3;
                            str3 = str2;
                        } else {
                            if (str4.equals("map_Kd") && split.length > 1) {
                                this.f3440m.get(str3).f3451b = split[1];
                                StringBuffer stringBuffer3 = new StringBuffer(this.f3430c);
                                stringBuffer3.append(":drawable/");
                                StringBuffer stringBuffer4 = new StringBuffer(split[1]);
                                int lastIndexOf2 = stringBuffer4.lastIndexOf(".");
                                if (lastIndexOf2 > -1) {
                                    stringBuffer3.append(stringBuffer4.substring(0, lastIndexOf2));
                                } else {
                                    stringBuffer3.append(stringBuffer4);
                                }
                                C4189x.m609a(this.f3428a.getIdentifier(stringBuffer3.toString(), null, null));
                                this.f3435h.m9892a(new AbstractC1084a.C1086a(str3, stringBuffer3.toString()));
                            }
                            str2 = str3;
                            str3 = str2;
                        }
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.censivn.C3DEngine.p057e.AbstractC1084a
    /* renamed from: a */
    public void mo9872a() {
        super.mo9872a();
        this.f3440m.clear();
    }

    /* renamed from: com.censivn.C3DEngine.e.f$a */
    /* loaded from: classes.dex */
    private class C1097a extends C1099h {

        /* renamed from: a */
        final /* synthetic */ C1096f f3509a;

        public C1097a(C1096f c1096f, String str, String str2, int i) {
            boolean z = false;
            this.f3509a = c1096f;
            this.f3522h = str2;
            this.f3519e = i;
            boolean z2 = str.indexOf("//") > -1;
            StringTokenizer stringTokenizer = new StringTokenizer(z2 ? str.replace("//", "/") : str);
            stringTokenizer.nextToken();
            StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken(), "/");
            int countTokens = stringTokenizer2.countTokens();
            this.f3520f = countTokens >= 2 && !z2;
            if (countTokens == 3 || (countTokens == 2 && z2)) {
                z = true;
            }
            this.f3521g = z;
            this.f3516b = new int[i];
            if (this.f3520f) {
                this.f3517c = new int[i];
            }
            if (this.f3521g) {
                this.f3518d = new int[i];
            }
            int i2 = 1;
            StringTokenizer stringTokenizer3 = stringTokenizer2;
            while (i2 < i + 1) {
                stringTokenizer3 = i2 > 1 ? new StringTokenizer(stringTokenizer.nextToken(), "/") : stringTokenizer3;
                int i3 = i2 - 1;
                this.f3516b[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
                if (this.f3520f) {
                    this.f3517c[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
                }
                if (this.f3521g) {
                    this.f3518d[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
                }
                i2++;
            }
        }
    }
}
