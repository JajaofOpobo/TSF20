package com.tsf.shell.p096f.p153i.p155b.p158c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.b.c.b */
/* loaded from: classes.dex */
public class C3140b {

    /* renamed from: a */
    private ArrayList<C3141a> f10208a = new ArrayList<>();

    /* renamed from: a */
    public TextureElement m3426a(C3134a c3134a) {
        if (c3134a.f10185b == null) {
            return null;
        }
        String str = c3134a.f10185b.f13023a + ":" + c3134a.f10185b.f13024b;
        Iterator<C3141a> it = this.f10208a.iterator();
        while (it.hasNext()) {
            C3141a next = it.next();
            if (str.equals(next.f10211c)) {
                next.m3419b(c3134a);
                return next.f10209a;
            }
        }
        return m3423c(c3134a);
    }

    /* renamed from: c */
    private TextureElement m3423c(C3134a c3134a) {
        Bitmap m3425a = m3425a(c3134a.f10185b.f13023a, c3134a.f10185b.f13024b);
        if (m3425a == null) {
            return null;
        }
        TextureElement m10544a = C0853a.m10853g().m10544a(m3425a, false);
        m3425a.recycle();
        C3141a c3141a = new C3141a(m10544a, c3134a.f10185b.f13023a + ":" + c3134a.f10185b.f13024b);
        c3141a.m3419b(c3134a);
        this.f10208a.add(c3141a);
        return m10544a;
    }

    /* renamed from: a */
    private Bitmap m3425a(String str, String str2) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Bitmap bitmap = null;
        try {
            Context m10856d = C0853a.m10856d();
            C0853a.m10856d();
            C0853a.m10856d();
            Context createPackageContext = m10856d.createPackageContext(str, 3);
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

    /* renamed from: b */
    public void m3424b(C3134a c3134a) {
        Iterator<C3141a> it = this.f10208a.iterator();
        while (it.hasNext()) {
            C3141a next = it.next();
            if (next.f10209a.f2529id == c3134a.f10184a) {
                next.m3421a(c3134a);
                if (next.m3420b()) {
                    next.m3422a();
                    this.f10208a.remove(next);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.b.c.b$a */
    /* loaded from: classes.dex */
    public class C3141a {

        /* renamed from: a */
        public TextureElement f10209a;

        /* renamed from: b */
        public ArrayList<C3134a> f10210b = new ArrayList<>();

        /* renamed from: c */
        public String f10211c;

        public C3141a(TextureElement textureElement, String str) {
            this.f10209a = textureElement;
            this.f10211c = str;
        }

        /* renamed from: a */
        public void m3422a() {
            C0853a.m10853g().m10543a(this.f10209a);
            this.f10209a = null;
            this.f10210b = null;
        }

        /* renamed from: a */
        public void m3421a(C3134a c3134a) {
            this.f10210b.remove(c3134a);
        }

        /* renamed from: b */
        public void m3419b(C3134a c3134a) {
            this.f10210b.add(c3134a);
        }

        /* renamed from: b */
        public boolean m3420b() {
            return this.f10210b.isEmpty();
        }
    }
}
