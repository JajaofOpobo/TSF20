package com.censivn.C3DEngine.p057e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.utils.C4189x;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
/* renamed from: com.censivn.C3DEngine.e.a */
/* loaded from: classes.dex */
public abstract class AbstractC1084a implements InterfaceC1090b {

    /* renamed from: a */
    protected Resources f3428a;

    /* renamed from: b */
    protected String f3429b;

    /* renamed from: c */
    protected String f3430c;

    /* renamed from: d */
    protected String f3431d;

    /* renamed from: e */
    protected ArrayList<C1098g> f3432e;

    /* renamed from: f */
    protected C1098g f3433f;

    /* renamed from: g */
    protected boolean f3434g;

    /* renamed from: h */
    protected C1088c f3435h;

    /* renamed from: i */
    protected ArrayList<Number3d> f3436i;

    /* renamed from: j */
    protected ArrayList<C0879Uv> f3437j;

    /* renamed from: k */
    protected ArrayList<Number3d> f3438k;

    /* renamed from: l */
    protected boolean f3439l;

    /* renamed from: m */
    protected HashMap<String, C1087b> f3440m;

    public AbstractC1084a() {
        this.f3436i = new ArrayList<>();
        this.f3437j = new ArrayList<>();
        this.f3438k = new ArrayList<>();
        this.f3432e = new ArrayList<>();
        this.f3435h = new C1088c();
        this.f3434g = true;
        this.f3440m = new HashMap<>();
    }

    public AbstractC1084a(Resources resources, String str, Boolean bool) {
        this();
        this.f3428a = resources;
        this.f3429b = str;
        if (str.indexOf(":") > -1) {
            this.f3430c = str.split(":")[0];
        }
        this.f3439l = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9872a() {
        this.f3432e.clear();
        this.f3435h.m9887d();
        this.f3436i.clear();
        this.f3437j.clear();
        this.f3438k.clear();
    }

    @Override // com.censivn.C3DEngine.p057e.InterfaceC1090b
    /* renamed from: b */
    public C0980j mo9870b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m9898a(InputStream inputStream) {
        byte read;
        String str = new String();
        while (true) {
            if (((byte) inputStream.read()) != 0) {
                str = str + ((char) read);
            } else {
                return str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m9897b(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m9896c(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public float m9895d(InputStream inputStream) {
        return Float.intBitsToFloat(m9897b(inputStream));
    }

    @Override // com.censivn.C3DEngine.p057e.InterfaceC1090b
    /* renamed from: c */
    public void mo9869c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.censivn.C3DEngine.e.a$a */
    /* loaded from: classes.dex */
    public class C1086a {

        /* renamed from: a */
        public Bitmap f3441a;

        /* renamed from: b */
        public String f3442b;

        /* renamed from: c */
        public String f3443c;

        /* renamed from: d */
        public float f3444d;

        /* renamed from: e */
        public float f3445e;

        /* renamed from: f */
        public float f3446f;

        /* renamed from: g */
        public float f3447g;

        /* renamed from: h */
        public boolean f3448h = false;

        public C1086a(String str, String str2) {
            this.f3442b = str;
            this.f3443c = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.censivn.C3DEngine.e.a$c */
    /* loaded from: classes.dex */
    public class C1088c {

        /* renamed from: b */
        private ArrayList<C1086a> f3455b = new ArrayList<>();

        /* renamed from: c */
        private Bitmap f3456c;

        /* renamed from: d */
        private TextureElement f3457d;

        public C1088c() {
        }

        /* renamed from: a */
        public void m9892a(C1086a c1086a) {
            C1086a m9891a = m9891a(c1086a.f3443c);
            if (m9891a == null) {
                int identifier = AbstractC1084a.this.f3428a.getIdentifier(c1086a.f3443c, null, null);
                if (identifier == 0) {
                    Log.d("Censivn3D", "Texture not found: " + c1086a.f3443c);
                    return;
                }
                Log.d("Censivn3D", "Adding texture " + c1086a.f3443c);
                Bitmap m609a = C4189x.m609a(identifier);
                c1086a.f3448h = true;
                c1086a.f3441a = m609a;
            } else {
                c1086a.f3441a = m9891a.f3441a;
            }
            this.f3455b.add(c1086a);
        }

        /* renamed from: a */
        public C1086a m9891a(String str) {
            int size = this.f3455b.size();
            for (int i = 0; i < size; i++) {
                if (this.f3455b.get(i).f3443c.equals(str)) {
                    return this.f3455b.get(i);
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m9894a() {
            Collections.sort(this.f3455b, new C1089a());
            if (this.f3455b.size() != 0) {
                C1086a c1086a = this.f3455b.get(0);
                int i = 0;
                int size = this.f3455b.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    int width = this.f3455b.get(i3).f3448h ? this.f3455b.get(i3).f3441a.getWidth() + i : i;
                    i3++;
                    i = width;
                }
                this.f3456c = Bitmap.createBitmap(i, c1086a.f3441a.getHeight(), Bitmap.Config.ARGB_8888);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 < size) {
                        C1086a c1086a2 = this.f3455b.get(i5);
                        C1086a m9891a = m9891a(c1086a2.f3443c);
                        if (c1086a2.f3448h) {
                            Bitmap bitmap = c1086a2.f3441a;
                            int width2 = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int[] iArr = new int[width2 * height];
                            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
                            this.f3456c.setPixels(iArr, 0, width2, i2, 0, width2, height);
                            c1086a2.f3444d = i2 / i;
                            c1086a2.f3445e = 0.0f;
                            c1086a2.f3446f = width2 / i;
                            c1086a2.f3447g = height / c1086a.f3441a.getHeight();
                            i2 += width2;
                            bitmap.recycle();
                        } else {
                            c1086a2.f3444d = m9891a.f3444d;
                            c1086a2.f3445e = m9891a.f3445e;
                            c1086a2.f3446f = m9891a.f3446f;
                            c1086a2.f3447g = m9891a.f3447g;
                        }
                        i4 = i5 + 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public Bitmap m9890b() {
            return this.f3456c;
        }

        /* renamed from: c */
        public boolean m9888c() {
            return this.f3455b.size() > 0;
        }

        /* renamed from: com.censivn.C3DEngine.e.a$c$a */
        /* loaded from: classes.dex */
        private class C1089a implements Comparator<C1086a> {
            private C1089a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C1086a c1086a, C1086a c1086a2) {
                int height = c1086a.f3441a.getHeight();
                int height2 = c1086a2.f3441a.getHeight();
                if (height < height2) {
                    return 1;
                }
                if (height == height2) {
                    return 0;
                }
                return -1;
            }
        }

        /* renamed from: b */
        public C1086a m9889b(String str) {
            int size = this.f3455b.size();
            for (int i = 0; i < size; i++) {
                if (this.f3455b.get(i).f3442b.equals(str)) {
                    return this.f3455b.get(i);
                }
            }
            return null;
        }

        /* renamed from: d */
        public void m9887d() {
            int size = this.f3455b.size();
            for (int i = 0; i < size; i++) {
                this.f3455b.get(i).f3441a.recycle();
            }
            if (this.f3456c != null) {
                this.f3456c.recycle();
            }
            this.f3455b.clear();
            AbstractC1084a.this.f3436i.clear();
            AbstractC1084a.this.f3437j.clear();
            AbstractC1084a.this.f3438k.clear();
        }

        /* renamed from: a */
        public void m9893a(TextureElement textureElement) {
            this.f3457d = textureElement;
        }

        /* renamed from: e */
        public TextureElement m9886e() {
            return this.f3457d;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.censivn.C3DEngine.e.a$b */
    /* loaded from: classes.dex */
    public class C1087b {

        /* renamed from: a */
        public String f3450a;

        /* renamed from: b */
        public String f3451b;

        /* renamed from: c */
        public Color4 f3452c;

        public C1087b(String str) {
            this.f3450a = str;
        }
    }
}
