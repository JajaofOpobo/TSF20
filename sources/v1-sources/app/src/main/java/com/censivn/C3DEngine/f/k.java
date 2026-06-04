package com.censivn.C3DEngine.f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public final class k extends a implements f {
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

    public k(Resources resources, String str) {
        super(resources, str, true);
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

    @Override // com.censivn.C3DEngine.f.a, com.censivn.C3DEngine.f.f
    public final void c() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.openRawResource(this.a.getIdentifier(this.b, null, null))));
        this.f = new m(this.i, this.j, this.k);
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
                            this.f.a.add(new l(this, readLine, this.d, 3));
                        } else if (countTokens == 5) {
                            this.f.b += 2;
                            this.f.a.add(new l(this, readLine, this.d, 4));
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
                            this.f = new m(this.i, this.j, this.k);
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

    @Override // com.censivn.C3DEngine.f.a, com.censivn.C3DEngine.f.f
    public final v b() {
        Bitmap bitmap;
        Log.d("Censivn3D", "Start object creation");
        v vVar = new v(0, 0);
        int size = this.e.size();
        if (!this.h.c()) {
            bitmap = null;
        } else {
            this.h.a();
            this.h.b();
            Bitmap b = this.h.b();
            this.h.a(com.censivn.C3DEngine.a.f().a(b, this.l));
            bitmap = b;
        }
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.e.get(i);
            Log.d("Censivn3D", "Creating object " + mVar.f);
            vVar.d(mVar.a(this.m, this.h));
        }
        if (this.h.c() && bitmap != null) {
            bitmap.recycle();
        }
        Log.d("Censivn3D", "Object creation finished");
        a();
        return vVar;
    }

    private void a(String str) {
        StringBuffer stringBuffer = new StringBuffer(this.c);
        StringBuffer stringBuffer2 = new StringBuffer(str);
        int lastIndexOf = stringBuffer2.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            stringBuffer2 = stringBuffer2.replace(lastIndexOf, lastIndexOf + 1, "_");
        }
        stringBuffer.append(":raw/");
        stringBuffer.append(stringBuffer2.toString());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.openRawResource(this.a.getIdentifier(stringBuffer.toString(), null, null))));
        String str2 = "";
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ");
                    if (split.length != 0) {
                        String str3 = split[0];
                        if (str3.equals("newmtl")) {
                            if (split.length > 1) {
                                String str4 = split[1];
                                this.m.put(str4, new c(this, str4));
                                str2 = str4;
                            }
                        } else if (str3.equals("Kd") && !str3.equals("map_Kd")) {
                            ((c) this.m.get(str2)).c = new Color4(Float.parseFloat(split[1]) * 255.0f, Float.parseFloat(split[2]) * 255.0f, Float.parseFloat(split[3]) * 255.0f, 255.0f);
                        } else if (str3.equals("map_Kd") && split.length > 1) {
                            ((c) this.m.get(str2)).b = split[1];
                            StringBuffer stringBuffer3 = new StringBuffer(this.c);
                            stringBuffer3.append(":drawable/");
                            StringBuffer stringBuffer4 = new StringBuffer(split[1]);
                            int lastIndexOf2 = stringBuffer4.lastIndexOf(".");
                            if (lastIndexOf2 >= 0) {
                                stringBuffer3.append(stringBuffer4.substring(0, lastIndexOf2));
                            } else {
                                stringBuffer3.append(stringBuffer4);
                            }
                            com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), this.a.getIdentifier(stringBuffer3.toString(), null, null));
                            this.h.a(new b(this, str2, stringBuffer3.toString()));
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

    @Override // com.censivn.C3DEngine.f.a
    protected final void a() {
        super.a();
        this.m.clear();
    }
}
