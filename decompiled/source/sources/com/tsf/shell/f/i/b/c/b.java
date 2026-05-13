package com.tsf.shell.f.i.b.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b {
    private ArrayList<a> a = new ArrayList<>();

    public TextureElement a(com.tsf.shell.f.i.b.c.a aVar) {
        if (aVar.b == null) {
            return null;
        }
        String str = aVar.b.a + ":" + aVar.b.b;
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (str.equals(next.c)) {
                next.b(aVar);
                return next.a;
            }
        }
        return c(aVar);
    }

    private TextureElement c(com.tsf.shell.f.i.b.c.a aVar) {
        Bitmap a2 = a(aVar.b.a, aVar.b.b);
        if (a2 == null) {
            return null;
        }
        TextureElement a3 = com.censivn.C3DEngine.a.g().a(a2, false);
        a2.recycle();
        a aVar2 = new a(a3, aVar.b.a + ":" + aVar.b.b);
        aVar2.b(aVar);
        this.a.add(aVar2);
        return a3;
    }

    private Bitmap a(String str, String str2) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Bitmap bitmap = null;
        try {
            Context d = com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            Context createPackageContext = d.createPackageContext(str, 3);
            inputStream = createPackageContext.getResources().openRawResource(createPackageContext.getResources().getIdentifier(str2, "drawable", createPackageContext.getPackageName()));
            try {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    try {
                        bitmap = decodeStream.copy(Bitmap.Config.ARGB_8888, false);
                        decodeStream.recycle();
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                        }
                    } catch (Exception e2) {
                        bitmap = decodeStream;
                        inputStream2 = inputStream;
                        try {
                            inputStream2.close();
                        } catch (Exception e3) {
                        }
                        return bitmap;
                    }
                } catch (Exception e4) {
                    inputStream2 = inputStream;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    inputStream.close();
                } catch (Exception e5) {
                }
                throw th;
            }
        } catch (Exception e6) {
            inputStream2 = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
        return bitmap;
    }

    public void b(com.tsf.shell.f.i.b.c.a aVar) {
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a.id == aVar.a) {
                next.a(aVar);
                if (next.b()) {
                    next.a();
                    this.a.remove(next);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
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
