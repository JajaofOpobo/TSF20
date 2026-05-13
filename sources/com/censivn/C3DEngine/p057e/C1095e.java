package com.censivn.C3DEngine.p057e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p057e.AbstractC1084a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.censivn.C3DEngine.e.e */
/* loaded from: classes.dex */
public class C1095e extends AbstractC1084a implements InterfaceC1090b {

    /* renamed from: A */
    private int f3483A;

    /* renamed from: B */
    private boolean f3484B;

    /* renamed from: C */
    private String f3485C;

    /* renamed from: n */
    private final int f3486n;

    /* renamed from: o */
    private final int f3487o;

    /* renamed from: p */
    private final int f3488p;

    /* renamed from: q */
    private final int f3489q;

    /* renamed from: r */
    private final int f3490r;

    /* renamed from: s */
    private final int f3491s;

    /* renamed from: t */
    private final int f3492t;

    /* renamed from: u */
    private final int f3493u;

    /* renamed from: v */
    private final int f3494v;

    /* renamed from: w */
    private final int f3495w;

    /* renamed from: x */
    private final int f3496x;

    /* renamed from: y */
    private final int f3497y;

    /* renamed from: z */
    private int f3498z;

    public C1095e(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
        this.f3486n = 19789;
        this.f3487o = 15677;
        this.f3488p = 16384;
        this.f3489q = 16640;
        this.f3490r = 16688;
        this.f3491s = 16656;
        this.f3492t = 16672;
        this.f3493u = 16704;
        this.f3494v = 41472;
        this.f3495w = 40960;
        this.f3496x = 41728;
        this.f3497y = 45055;
    }

    @Override // com.censivn.C3DEngine.p057e.AbstractC1084a, com.censivn.C3DEngine.p057e.InterfaceC1090b
    /* renamed from: c */
    public void mo9869c() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f3428a.openRawResource(this.f3428a.getIdentifier(this.f3429b, null, null)));
        Log.d("Censivn3D", "Start parsing object");
        this.f3433f = new C1098g();
        this.f3432e.add(this.f3433f);
        try {
            m9878e(bufferedInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (this.f3498z != 19789) {
            Log.d("Censivn3D", "Not a valid .3DS file!");
            return;
        }
        Log.d("Censivn3D", "Found a valid .3DS file");
        while (!this.f3484B) {
            m9877f(bufferedInputStream);
        }
        Log.d("Censivn3D", "End parsing object");
    }

    /* renamed from: e */
    private void m9878e(InputStream inputStream) {
        this.f3498z = m9896c(inputStream);
        this.f3483A = m9897b(inputStream);
        this.f3484B = this.f3498z < 0;
    }

    /* renamed from: f */
    private void m9877f(InputStream inputStream) {
        m9878e(inputStream);
        switch (this.f3498z) {
            case 15677:
            case 41472:
            case 45055:
                return;
            case 16384:
                this.f3485C = m9898a(inputStream);
                Log.d("Censivn3D", "Parsing object " + this.f3485C);
                return;
            case 16640:
                if (this.f3434g) {
                    this.f3433f.f3515f = this.f3485C;
                    this.f3434g = false;
                    return;
                }
                this.f3433f = new C1098g();
                this.f3433f.f3515f = this.f3485C;
                this.f3432e.add(this.f3433f);
                return;
            case 16656:
                m9875h(inputStream);
                return;
            case 16672:
                m9874i(inputStream);
                return;
            case 16688:
                String a = m9898a(inputStream);
                int c = m9896c(inputStream);
                for (int i = 0; i < c; i++) {
                    this.f3433f.f3510a.get(m9896c(inputStream)).f3522h = a;
                }
                return;
            case 16704:
                m9873j(inputStream);
                return;
            case 40960:
                this.f3431d = m9898a(inputStream);
                return;
            case 41728:
                String a2 = m9898a(inputStream);
                StringBuffer stringBuffer = new StringBuffer(this.f3430c);
                stringBuffer.append(":drawable/");
                StringBuffer stringBuffer2 = new StringBuffer(a2.toLowerCase());
                int lastIndexOf = stringBuffer2.lastIndexOf(".");
                if (lastIndexOf > -1) {
                    stringBuffer.append(stringBuffer2.substring(0, lastIndexOf));
                } else {
                    stringBuffer.append(stringBuffer2);
                }
                this.f3435h.m9892a(new AbstractC1084a.C1086a(this.f3431d, stringBuffer.toString()));
                return;
            default:
                m9876g(inputStream);
                return;
        }
    }

    /* renamed from: g */
    private void m9876g(InputStream inputStream) {
        for (int i = 0; i < this.f3483A - 6 && !this.f3484B; i++) {
            this.f3484B = inputStream.read() < 0;
        }
    }

    /* renamed from: h */
    private void m9875h(InputStream inputStream) {
        int c = m9896c(inputStream);
        for (int i = 0; i < c; i++) {
            this.f3433f.f3512c.add(new Number3d(m9895d(inputStream), m9895d(inputStream), -m9895d(inputStream)));
        }
    }

    /* renamed from: i */
    private void m9874i(InputStream inputStream) {
        int c = m9896c(inputStream);
        for (int i = 0; i < c; i++) {
            int[] iArr = {m9896c(inputStream), m9896c(inputStream), m9896c(inputStream)};
            m9896c(inputStream);
            C1099h c1099h = new C1099h();
            c1099h.f3516b = iArr;
            c1099h.f3517c = iArr;
            c1099h.f3519e = 3;
            c1099h.f3520f = true;
            this.f3433f.f3511b++;
            this.f3433f.f3510a.add(c1099h);
            this.f3433f.m9866a(c1099h);
        }
    }

    /* renamed from: j */
    private void m9873j(InputStream inputStream) {
        int c = m9896c(inputStream);
        for (int i = 0; i < c; i++) {
            C0879Uv c0879Uv = new C0879Uv();
            c0879Uv.f2530u = m9895d(inputStream);
            c0879Uv.f2531v = m9895d(inputStream) * (-1.0f);
            this.f3433f.f3513d.add(c0879Uv);
        }
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
        super.mo9872a();
        return c0980j;
    }
}
