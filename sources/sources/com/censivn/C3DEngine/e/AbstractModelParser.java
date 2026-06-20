package com.censivn.C3DEngine.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class AbstractModelParser implements IModelParser {
    protected Resources a;
    protected String b;
    protected String c;
    protected String d;
    protected ArrayList<MeshData> e;
    protected MeshData f;
    protected boolean g;
    protected TextureManager h;
    protected ArrayList<Number3d> i;
    protected ArrayList<Uv> j;
    protected ArrayList<Number3d> k;
    protected boolean l;
    protected HashMap<String, MaterialEntry> m;

    public AbstractModelParser() {
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.e = new ArrayList<>();
        this.h = new TextureManager();
        this.g = true;
        this.m = new HashMap<>();
    }

    public AbstractModelParser(Resources resources, String str, Boolean bool) {
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

    @Override // com.censivn.C3DEngine.e.IModelParser
    public BaseRenderable b() {
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

    @Override // com.censivn.C3DEngine.e.IModelParser
    public void c() {
    }

    protected class TextureEntry {
        public Bitmap a;
        public String b;
        public String c;
        public float d;
        public float e;
        public float f;
        public float g;
        public boolean h = false;

        public TextureEntry(String str, String str2) {
            this.b = str;
            this.c = str2;
        }
    }

    protected class TextureManager {
        private ArrayList<TextureEntry> b = new ArrayList<>();
        private Bitmap c;
        private TextureElement d;

        public TextureManager() {
        }

        public void a(TextureEntry textureEntry) {
            TextureEntry textureEntryA = a(textureEntry.c);
            if (textureEntryA == null) {
                int identifier = AbstractModelParser.this.a.getIdentifier(textureEntry.c, null, null);
                if (identifier == 0) {
                    Log.d("Censivn3D", "Texture not found: " + textureEntry.c);
                    return;
                }
                Log.d("Censivn3D", "Adding texture " + textureEntry.c);
                Bitmap bitmapA = x.a(identifier);
                textureEntry.h = true;
                textureEntry.a = bitmapA;
            } else {
                textureEntry.a = textureEntryA.a;
            }
            this.b.add(textureEntry);
        }

        public TextureEntry a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).c.equals(str)) {
                    return this.b.get(i);
                }
            }
            return null;
        }

        public void a() {
            Collections.sort(this.b, new TextureHeightComparator());
            if (this.b.size() != 0) {
                TextureEntry textureEntry = this.b.get(0);
                int i = 0;
                int size = this.b.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    int width = this.b.get(i3).h ? this.b.get(i3).a.getWidth() + i : i;
                    i3++;
                    i = width;
                }
                this.c = Bitmap.createBitmap(i, textureEntry.a.getHeight(), Bitmap.Config.ARGB_8888);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 < size) {
                        TextureEntry textureEntry2 = this.b.get(i5);
                        TextureEntry textureEntryA = a(textureEntry2.c);
                        if (textureEntry2.h) {
                            Bitmap bitmap = textureEntry2.a;
                            int width2 = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int[] iArr = new int[width2 * height];
                            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
                            this.c.setPixels(iArr, 0, width2, i2, 0, width2, height);
                            textureEntry2.d = i2 / i;
                            textureEntry2.e = 0.0f;
                            textureEntry2.f = width2 / i;
                            textureEntry2.g = height / textureEntry.a.getHeight();
                            i2 += width2;
                            bitmap.recycle();
                        } else {
                            textureEntry2.d = textureEntryA.d;
                            textureEntry2.e = textureEntryA.e;
                            textureEntry2.f = textureEntryA.f;
                            textureEntry2.g = textureEntryA.g;
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

        private class TextureHeightComparator implements Comparator<TextureEntry> {
            private TextureHeightComparator() {
            }

            @Override // java.util.Comparator
            public int compare(TextureEntry textureEntry, TextureEntry textureEntry2) {
                int height = textureEntry.a.getHeight();
                int height2 = textureEntry2.a.getHeight();
                if (height < height2) {
                    return 1;
                }
                if (height == height2) {
                    return 0;
                }
                return -1;
            }
        }

        public TextureEntry b(String str) {
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
            AbstractModelParser.this.i.clear();
            AbstractModelParser.this.j.clear();
            AbstractModelParser.this.k.clear();
        }

        public void a(TextureElement textureElement) {
            this.d = textureElement;
        }

        public TextureElement e() {
            return this.d;
        }
    }

    protected class MaterialEntry {
        public String a;
        public String b;
        public Color4 c;

        public MaterialEntry(String str) {
            this.a = str;
        }
    }
}
