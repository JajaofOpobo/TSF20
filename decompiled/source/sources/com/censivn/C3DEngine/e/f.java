package com.censivn.C3DEngine.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.e.a;
import com.tsf.shell.utils.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;
/* loaded from: classes.dex */
public class f extends com.censivn.C3DEngine.e.a implements b {
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;

    public f(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
        this.n = "v";
        this.o = "f";
        this.p = "vt";
        this.q = "vn";
        this.r = "o";
        this.s = "mtllib";
        this.t = "usemtl";
        this.u = "newmtl";
        this.v = "Kd";
        this.w = "map_Kd";
    }

    @Override // com.censivn.C3DEngine.e.a, com.censivn.C3DEngine.e.b
    public void c() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.openRawResource(this.a.getIdentifier(this.b, null, null))));
        this.f = new g(this.i, this.j, this.k);
        this.e.add(this.f);
        Log.d("Censivn3D", "Start parsing object " + this.b);
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
                        number3d.x = Float.parseFloat(stringTokenizer.nextToken());
                        number3d.y = Float.parseFloat(stringTokenizer.nextToken());
                        number3d.z = Float.parseFloat(stringTokenizer.nextToken());
                        this.i.add(number3d);
                    } else if (nextToken.equals("f")) {
                        if (countTokens == 4) {
                            this.f.b++;
                            this.f.a.add(new a(this, readLine, this.d, 3));
                        } else if (countTokens == 5) {
                            this.f.b += 2;
                            this.f.a.add(new a(this, readLine, this.d, 4));
                        }
                    } else if (nextToken.equals("vt")) {
                        Uv uv = new Uv();
                        uv.u = Float.parseFloat(stringTokenizer.nextToken());
                        uv.v = Float.parseFloat(stringTokenizer.nextToken()) * (-1.0f);
                        this.j.add(uv);
                    } else if (nextToken.equals("vn")) {
                        Number3d number3d2 = new Number3d();
                        number3d2.x = Float.parseFloat(stringTokenizer.nextToken());
                        number3d2.y = Float.parseFloat(stringTokenizer.nextToken());
                        number3d2.z = Float.parseFloat(stringTokenizer.nextToken());
                        this.k.add(number3d2);
                    } else if (nextToken.equals("mtllib")) {
                        a(stringTokenizer.nextToken());
                    } else if (nextToken.equals("usemtl")) {
                        this.d = stringTokenizer.nextToken();
                    } else if (nextToken.equals("o")) {
                        String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
                        if (this.g) {
                            Log.d("Censivn3D", "Create object " + nextToken2);
                            this.f.f = nextToken2;
                            this.g = false;
                        } else {
                            Log.d("Censivn3D", "Create object " + nextToken2);
                            this.f = new g(this.i, this.j, this.k);
                            this.f.f = nextToken2;
                            this.e.add(this.f);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Log.d("Censivn3D", "End time " + (Calendar.getInstance().getTimeInMillis() - timeInMillis));
    }

    @Override // com.censivn.C3DEngine.e.a, com.censivn.C3DEngine.e.b
    public j b() {
        Bitmap bitmap;
        Log.d("Censivn3D", "Start object creation");
        j jVar = new j(0, 0);
        int size = this.e.size();
        if (!this.h.c()) {
            bitmap = null;
        } else {
            this.h.a();
            this.h.b();
            Bitmap b = this.h.b();
            this.h.a(com.censivn.C3DEngine.a.g().a(b, this.l));
            bitmap = b;
        }
        for (int i = 0; i < size; i++) {
            g gVar = this.e.get(i);
            Log.d("Censivn3D", "Creating object " + gVar.f);
            jVar.addChild(gVar.a(this.m, this.h));
        }
        if (this.h.c() && bitmap != null) {
            bitmap.recycle();
        }
        Log.d("Censivn3D", "Object creation finished");
        a();
        return jVar;
    }

    private void a(String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer(this.c);
        StringBuffer stringBuffer2 = new StringBuffer(str);
        int lastIndexOf = stringBuffer2.lastIndexOf(".");
        if (lastIndexOf > -1) {
            stringBuffer2 = stringBuffer2.replace(lastIndexOf, lastIndexOf + 1, "_");
        }
        stringBuffer.append(":raw/");
        stringBuffer.append(stringBuffer2.toString());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.openRawResource(this.a.getIdentifier(stringBuffer.toString(), null, null))));
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
                                this.m.put(str2, new a.b(str2));
                                str3 = str2;
                            }
                            str2 = str3;
                            str3 = str2;
                        } else if (str4.equals("Kd") && !str4.equals("map_Kd")) {
                            this.m.get(str3).c = new Color4(Float.parseFloat(split[1]) * 255.0f, Float.parseFloat(split[2]) * 255.0f, Float.parseFloat(split[3]) * 255.0f, 255.0f);
                            str2 = str3;
                            str3 = str2;
                        } else {
                            if (str4.equals("map_Kd") && split.length > 1) {
                                this.m.get(str3).b = split[1];
                                StringBuffer stringBuffer3 = new StringBuffer(this.c);
                                stringBuffer3.append(":drawable/");
                                StringBuffer stringBuffer4 = new StringBuffer(split[1]);
                                int lastIndexOf2 = stringBuffer4.lastIndexOf(".");
                                if (lastIndexOf2 > -1) {
                                    stringBuffer3.append(stringBuffer4.substring(0, lastIndexOf2));
                                } else {
                                    stringBuffer3.append(stringBuffer4);
                                }
                                x.a(this.a.getIdentifier(stringBuffer3.toString(), null, null));
                                this.h.a(new a.C0039a(str3, stringBuffer3.toString()));
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
    @Override // com.censivn.C3DEngine.e.a
    public void a() {
        super.a();
        this.m.clear();
    }

    /* loaded from: classes.dex */
    private class a extends h {
        final /* synthetic */ f a;

        public a(f fVar, String str, String str2, int i) {
            boolean z = false;
            this.a = fVar;
            this.h = str2;
            this.e = i;
            boolean z2 = str.indexOf("//") > -1;
            StringTokenizer stringTokenizer = new StringTokenizer(z2 ? str.replace("//", "/") : str);
            stringTokenizer.nextToken();
            StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken(), "/");
            int countTokens = stringTokenizer2.countTokens();
            this.f = countTokens >= 2 && !z2;
            if (countTokens == 3 || (countTokens == 2 && z2)) {
                z = true;
            }
            this.g = z;
            this.b = new int[i];
            if (this.f) {
                this.c = new int[i];
            }
            if (this.g) {
                this.d = new int[i];
            }
            int i2 = 1;
            StringTokenizer stringTokenizer3 = stringTokenizer2;
            while (i2 < i + 1) {
                stringTokenizer3 = i2 > 1 ? new StringTokenizer(stringTokenizer.nextToken(), "/") : stringTokenizer3;
                int i3 = i2 - 1;
                this.b[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
                if (this.f) {
                    this.c[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
                }
                if (this.g) {
                    this.d[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
                }
                i2++;
            }
        }
    }
}
