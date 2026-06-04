package com.tsf.shell.workspace3D.k.c.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {
    private ArrayList a = new ArrayList();

    public final TextureElement a(h hVar) {
        if (hVar.B == null) {
            return null;
        }
        String str = String.valueOf(hVar.B.a) + ":" + hVar.B.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (str.equals(jVar.c)) {
                jVar.a(hVar);
                return jVar.a;
            }
        }
        Bitmap a = a(hVar.B.a, hVar.B.b);
        if (a == null) {
            return null;
        }
        TextureElement a2 = com.censivn.C3DEngine.a.f().a(a, false);
        a.recycle();
        j jVar2 = new j(this, a2, String.valueOf(hVar.B.a) + ":" + hVar.B.b);
        jVar2.a(hVar);
        this.a.add(jVar2);
        return a2;
    }

    private static Bitmap a(String str, String str2) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Bitmap bitmap = null;
        try {
            Context c = com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            Context createPackageContext = c.createPackageContext(str, 3);
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

    public final void b(h hVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.a.id == hVar.A) {
                jVar.b.remove(hVar);
                if (jVar.b.isEmpty()) {
                    com.censivn.C3DEngine.a.f().a(jVar.a);
                    jVar.a = null;
                    jVar.b = null;
                    this.a.remove(jVar);
                    return;
                }
                return;
            }
        }
    }
}
