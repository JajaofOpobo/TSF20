package com.censivn.C3DEngine.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.x;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class a implements com.censivn.C3DEngine.e.b {
    protected Resources a;
    protected String b;
    protected String c;
    protected String d;
    protected ArrayList<g> e;
    protected g f;
    protected boolean g;
    protected c h;
    protected ArrayList<Number3d> i;
    protected ArrayList<Uv> j;
    protected ArrayList<Number3d> k;
    protected boolean l;
    protected HashMap<String, b> m;

    public a() {
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.e = new ArrayList<>();
        this.h = new c();
        this.g = true;
        this.m = new HashMap<>();
    }

    public a(Resources resources, String str, Boolean bool) {
        this();
        this.a = resources;
        this.b = str;
        if (str.indexOf(":") > -1) {
            this.c = str.split(":")[0];
        }
        this.l = bool.booleanValue();
    }

    protected void a() {
        this.e.clear();
        this.h.d();
        this.i.clear();
        this.j.clear();
        this.k.clear();
    }

    @Override // com.censivn.C3DEngine.e.b
    public j b() {
        return null;
    }

    protected String a(InputStream inputStream) {
        String str = new String();
        while (true) {
            byte b2 = (byte) inputStream.read();
            if (b2 != 0) {
                str = str + ((char) b2);
            } else {
                return str;
            }
        }
    }

    protected int b(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
    }

    protected int c(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }

    protected float d(InputStream inputStream) {
        return Float.intBitsToFloat(b(inputStream));
    }

    @Override // com.censivn.C3DEngine.e.b
    public void c() {
    }

    /* JADX INFO: renamed from: com.censivn.C3DEngine.e.a$a, reason: collision with other inner class name */
    protected class C0039a {
        public Bitmap a;
        public String b;
        public String c;
        public float d;
        public float e;
        public float f;
        public float g;
        public boolean h = false;

        public C0039a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }
    }

    protected class c {
        private ArrayList<C0039a> b = new ArrayList<>();
        private Bitmap c;
        private TextureElement d;

        public c() {
        }

        public void a(C0039a c0039a) {
            C0039a c0039aA = a(c0039a.c);
            if (c0039aA == null) {
                int identifier = a.this.a.getIdentifier(c0039a.c, null, null);
                if (identifier == 0) {
                    Log.d("Censivn3D", "Texture not found: " + c0039a.c);
                    return;
                }
                Log.d("Censivn3D", "Adding texture " + c0039a.c);
                Bitmap bitmapA = x.a(identifier);
                c0039a.h = true;
                c0039a.a = bitmapA;
            } else {
                c0039a.a = c0039aA.a;
            }
            this.b.add(c0039a);
        }

        public C0039a a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).c.equals(str)) {
                    return this.b.get(i);
                }
            }
            return null;
        }

        public void a() {
            Collections.sort(this.b, new C0040a());
            if (this.b.size() != 0) {
                C0039a c0039a = this.b.get(0);
                int i = 0;
                int size = this.b.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    int width = this.b.get(i3).h ? this.b.get(i3).a.getWidth() + i : i;
                    i3++;
                    i = width;
                }
                this.c = Bitmap.createBitmap(i, c0039a.a.getHeight(), Bitmap.Config.ARGB_8888);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 < size) {
                        C0039a c0039a2 = this.b.get(i5);
                        C0039a c0039aA = a(c0039a2.c);
                        if (c0039a2.h) {
                            Bitmap bitmap = c0039a2.a;
                            int width2 = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int[] iArr = new int[width2 * height];
                            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
                            this.c.setPixels(iArr, 0, width2, i2, 0, width2, height);
                            c0039a2.d = i2 / i;
                            c0039a2.e = 0.0f;
                            c0039a2.f = width2 / i;
                            c0039a2.g = height / c0039a.a.getHeight();
                            i2 += width2;
                            bitmap.recycle();
                        } else {
                            c0039a2.d = c0039aA.d;
                            c0039a2.e = c0039aA.e;
                            c0039a2.f = c0039aA.f;
                            c0039a2.g = c0039aA.g;
                        }
                        i4 = i5 + 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public Bitmap b() {
            return this.c;
        }

        public boolean c() {
            return this.b.size() > 0;
        }

        /* JADX INFO: renamed from: com.censivn.C3DEngine.e.a$c$a, reason: collision with other inner class name */
        private class C0040a implements Comparator<C0039a> {
            private C0040a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(C0039a c0039a, C0039a c0039a2) {
                int height = c0039a.a.getHeight();
                int height2 = c0039a2.a.getHeight();
                if (height < height2) {
                    return 1;
                }
                if (height == height2) {
                    return 0;
                }
                return -1;
            }
        }

        public C0039a b(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b.equals(str)) {
                    return this.b.get(i);
                }
            }
            return null;
        }

        public void d() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a.recycle();
            }
            if (this.c != null) {
                this.c.recycle();
            }
            this.b.clear();
            a.this.i.clear();
            a.this.j.clear();
            a.this.k.clear();
        }

        public void a(TextureElement textureElement) {
            this.d = textureElement;
        }

        public TextureElement e() {
            return this.d;
        }
    }

    protected class b {
        public String a;
        public String b;
        public Color4 c;

        public b(String str) {
            this.a = str;
        }
    }
}
