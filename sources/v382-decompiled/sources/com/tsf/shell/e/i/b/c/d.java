package com.tsf.shell.e.i.b.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    private ArrayList a = new ArrayList();

    public TextureElement a(a aVar) {
        if (aVar.b == null) {
            return null;
        }
        String str = String.valueOf(aVar.b.a) + ":" + aVar.b.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (str.equals(eVar.c)) {
                eVar.b(aVar);
                return eVar.a;
            }
        }
        return c(aVar);
    }

    private TextureElement c(a aVar) {
        Bitmap a = a(aVar.b.a, aVar.b.b);
        if (a == null) {
            return null;
        }
        TextureElement a2 = com.censivn.C3DEngine.a.g().a(a, false);
        a.recycle();
        e eVar = new e(this, a2, String.valueOf(aVar.b.a) + ":" + aVar.b.b);
        eVar.b(aVar);
        this.a.add(eVar);
        return a2;
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

    public void b(a aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.a.id == aVar.a) {
                eVar.a(aVar);
                if (eVar.b()) {
                    eVar.a();
                    this.a.remove(eVar);
                    return;
                }
                return;
            }
        }
    }
}
