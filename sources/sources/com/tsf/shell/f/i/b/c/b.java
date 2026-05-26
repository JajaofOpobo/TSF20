package com.tsf.shell.f.i.b.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private ArrayList<a> a = new ArrayList<>();

    public TextureElement a(com.tsf.shell.f.i.b.c.a aVar) {
        if (aVar.b == null) {
            return null;
        }
        String str = aVar.b.a + ":" + aVar.b.b;
        for (a aVar2 : this.a) {
            if (str.equals(aVar2.c)) {
                aVar2.b(aVar);
                return aVar2.a;
            }
        }
        return c(aVar);
    }

    private TextureElement c(com.tsf.shell.f.i.b.c.a aVar) throws Throwable {
        Bitmap bitmapA = a(aVar.b.a, aVar.b.b);
        if (bitmapA == null) {
            return null;
        }
        TextureElement textureElementA = com.censivn.C3DEngine.a.g().a(bitmapA, false);
        bitmapA.recycle();
        a aVar2 = new a(textureElementA, aVar.b.a + ":" + aVar.b.b);
        aVar2.b(aVar);
        this.a.add(aVar2);
        return textureElementA;
    }

    private Bitmap a(String str, String str2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Throwable th;
        InputStream inputStream;
        Bitmap bitmapCopy = null;
        try {
            Context contextD = com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            Context contextCreatePackageContext = contextD.createPackageContext(str, 3);
            inputStreamOpenRawResource = contextCreatePackageContext.getResources().openRawResource(contextCreatePackageContext.getResources().getIdentifier(str2, "drawable", contextCreatePackageContext.getPackageName()));
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource);
                    try {
                        bitmapCopy = bitmapDecodeStream.copy(Bitmap.Config.ARGB_8888, false);
                        bitmapDecodeStream.recycle();
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (Exception e) {
                        }
                    } catch (Exception e2) {
                        bitmapCopy = bitmapDecodeStream;
                        inputStream = inputStreamOpenRawResource;
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Exception e4) {
                    inputStream = inputStreamOpenRawResource;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    inputStreamOpenRawResource.close();
                } catch (Exception e5) {
                }
                throw th;
            }
        } catch (Exception e6) {
            inputStream = null;
        } catch (Throwable th3) {
            inputStreamOpenRawResource = null;
            th = th3;
        }
        return bitmapCopy;
    }

    public void b(com.tsf.shell.f.i.b.c.a aVar) {
        for (a aVar2 : this.a) {
            if (aVar2.a.id == aVar.a) {
                aVar2.a(aVar);
                if (aVar2.b()) {
                    aVar2.a();
                    this.a.remove(aVar2);
                    return;
                }
                return;
            }
        }
    }

    class a {
        public TextureElement a;
        public ArrayList<com.tsf.shell.f.i.b.c.a> b = new ArrayList<>();
        public String c;

        public a(TextureElement textureElement, String str) {
            this.a = textureElement;
            this.c = str;
        }

        public void a() {
            com.censivn.C3DEngine.a.g().a(this.a);
            this.a = null;
            this.b = null;
        }

        public void a(com.tsf.shell.f.i.b.c.a aVar) {
            this.b.remove(aVar);
        }

        public void b(com.tsf.shell.f.i.b.c.a aVar) {
            this.b.add(aVar);
        }

        public boolean b() {
            return this.b.isEmpty();
        }
    }
}
