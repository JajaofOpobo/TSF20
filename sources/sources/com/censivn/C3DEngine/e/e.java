package com.censivn.C3DEngine.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.e.a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends a implements b {
    private int A;
    private boolean B;
    private String C;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private int z;

    public e(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
        this.n = 19789;
        this.o = 15677;
        this.p = 16384;
        this.q = 16640;
        this.r = 16688;
        this.s = 16656;
        this.t = 16672;
        this.u = 16704;
        this.v = 41472;
        this.w = 40960;
        this.x = 41728;
        this.y = 45055;
    }

    @Override // com.censivn.C3DEngine.e.a, com.censivn.C3DEngine.e.b
    public void c() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.a.openRawResource(this.a.getIdentifier(this.b, null, null)));
        Log.d("Censivn3D", "Start parsing object");
        this.f = new g();
        this.e.add(this.f);
        try {
            e(bufferedInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (this.z != 19789) {
            Log.d("Censivn3D", "Not a valid .3DS file!");
            return;
        }
        Log.d("Censivn3D", "Found a valid .3DS file");
        while (!this.B) {
            f(bufferedInputStream);
        }
        Log.d("Censivn3D", "End parsing object");
    }

    private void e(InputStream inputStream) {
        this.z = c(inputStream);
        this.A = b(inputStream);
        this.B = this.z < 0;
    }

    private void f(InputStream inputStream) {
        e(inputStream);
        switch (this.z) {
            case 15677:
            case 41472:
            case 45055:
                break;
            case 16384:
                this.C = a(inputStream);
                Log.d("Censivn3D", "Parsing object " + this.C);
                break;
            case 16640:
                if (this.g) {
                    this.f.f = this.C;
                    this.g = false;
                } else {
                    this.f = new g();
                    this.f.f = this.C;
                    this.e.add(this.f);
                }
                break;
            case 16656:
                h(inputStream);
                break;
            case 16672:
                i(inputStream);
                break;
            case 16688:
                String strA = a(inputStream);
                int iC = c(inputStream);
                for (int i = 0; i < iC; i++) {
                    this.f.a.get(c(inputStream)).h = strA;
                }
                break;
            case 16704:
                j(inputStream);
                break;
            case 40960:
                this.d = a(inputStream);
                break;
            case 41728:
                String strA2 = a(inputStream);
                StringBuffer stringBuffer = new StringBuffer(this.c);
                stringBuffer.append(":drawable/");
                StringBuffer stringBuffer2 = new StringBuffer(strA2.toLowerCase());
                int iLastIndexOf = stringBuffer2.lastIndexOf(".");
                if (iLastIndexOf > -1) {
                    stringBuffer.append(stringBuffer2.substring(0, iLastIndexOf));
                } else {
                    stringBuffer.append(stringBuffer2);
                }
                this.h.a(new a.C0039a(this.d, stringBuffer.toString()));
                break;
            default:
                g(inputStream);
                break;
        }
    }

    private void g(InputStream inputStream) {
        for (int i = 0; i < this.A - 6 && !this.B; i++) {
            this.B = inputStream.read() < 0;
        }
    }

    private void h(InputStream inputStream) {
        int iC = c(inputStream);
        for (int i = 0; i < iC; i++) {
            this.f.c.add(new Number3d(d(inputStream), d(inputStream), -d(inputStream)));
        }
    }

    private void i(InputStream inputStream) {
        int iC = c(inputStream);
        for (int i = 0; i < iC; i++) {
            int[] iArr = {c(inputStream), c(inputStream), c(inputStream)};
            c(inputStream);
            h hVar = new h();
            hVar.b = iArr;
            hVar.c = iArr;
            hVar.e = 3;
            hVar.f = true;
            this.f.b++;
            this.f.a.add(hVar);
            this.f.a(hVar);
        }
    }

    private void j(InputStream inputStream) {
        int iC = c(inputStream);
        for (int i = 0; i < iC; i++) {
            Uv uv = new Uv();
            uv.u = d(inputStream);
            uv.v = d(inputStream) * (-1.0f);
            this.f.d.add(uv);
        }
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
            Bitmap bitmapB = this.h.b();
            this.h.a(com.censivn.C3DEngine.a.g().a(bitmapB, this.l));
            bitmap = bitmapB;
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
        super.a();
        return jVar;
    }
}
