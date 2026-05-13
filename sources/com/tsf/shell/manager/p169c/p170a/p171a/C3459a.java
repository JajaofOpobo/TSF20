package com.tsf.shell.manager.p169c.p170a.p171a;

import android.content.ContentUris;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p169c.C3465c;
import com.tsf.shell.p096f.p148h.p149a.p150a.p151a.C3052d;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.C4181q;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.c.a.a.a */
/* loaded from: classes.dex */
public class C3459a {

    /* renamed from: a */
    public long f11432a;

    /* renamed from: b */
    public String f11433b;

    /* renamed from: c */
    public String f11434c;

    /* renamed from: d */
    public String f11435d;

    /* renamed from: e */
    public int f11436e;

    /* renamed from: f */
    public ArrayList<C3463c> f11437f;

    /* renamed from: g */
    public ArrayList<C3461a> f11438g;

    /* renamed from: h */
    private C3462b f11439h;

    /* renamed from: i */
    private C3462b f11440i;

    /* renamed from: j */
    private String f11441j;

    /* renamed from: k */
    private String f11442k;

    /* renamed from: l */
    private boolean f11443l;

    /* renamed from: a */
    public C3462b m2328a() {
        return this.f11439h;
    }

    /* renamed from: b */
    public C3462b m2320b() {
        return this.f11440i;
    }

    /* renamed from: c */
    public boolean m2318c() {
        return C3465c.m2299a(this);
    }

    /* renamed from: d */
    public void m2316d() {
        if (!this.f11443l) {
            this.f11443l = true;
            C3465c.m2301a(C0853a.m10856d(), this);
            C3465c.m2298b(C0853a.m10856d(), this);
            C3359a.f11112z.m2302b().m2330a(this);
        }
    }

    /* renamed from: a */
    public void m2321a(String str, String str2) {
        this.f11441j = str;
        this.f11442k = str2;
        Iterator<C3463c> it = this.f11437f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3463c next = it.next();
            if (next.f11447c.equals(str)) {
                this.f11439h = next;
                break;
            }
        }
        Iterator<C3461a> it2 = this.f11438g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C3461a next2 = it2.next();
            if (next2.f11447c.equals(str2)) {
                this.f11440i = next2;
                break;
            }
        }
        if (this.f11439h == null && this.f11437f.size() > 0) {
            this.f11439h = this.f11437f.get(0);
        }
        if (this.f11440i == null && this.f11438g.size() > 0) {
            this.f11440i = this.f11438g.get(0);
        }
    }

    /* renamed from: e */
    public void m2315e() {
        boolean z = false;
        if (this.f11439h != null && this.f11439h.f11447c != this.f11441j) {
            this.f11441j = this.f11439h.f11447c;
            z = true;
        }
        if (this.f11440i != null && this.f11440i.f11447c != this.f11442k) {
            this.f11442k = this.f11440i.f11447c;
            z = true;
        }
        if (z) {
            C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.c.a.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C3459a.this.f11443l) {
                        C3359a.f11112z.m2302b().m2329b(C3459a.this);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m2323a(C3462b c3462b) {
        c3462b.m2305e().m3713e();
        if (c3462b instanceof C3463c) {
            if (c3462b != this.f11439h) {
                if (this.f11439h != null && this.f11439h.m2305e() != null) {
                    this.f11439h.m2305e().m3712f();
                }
                this.f11439h = c3462b;
            }
        } else if ((c3462b instanceof C3461a) && c3462b != this.f11440i) {
            if (this.f11440i != null && this.f11440i.m2305e() != null) {
                this.f11440i.m2305e().m3712f();
            }
            this.f11440i = c3462b;
        }
    }

    /* renamed from: b */
    public void m2319b(String str, String str2) {
        this.f11438g.add(new C3461a(str, str2, this));
    }

    /* renamed from: c */
    public void m2317c(String str, String str2) {
        this.f11437f.add(new C3463c(str, str2, this));
    }

    /* renamed from: f */
    public void m2314f() {
        if (this.f11439h != null) {
            Home.m6177b().m6182a(new Intent("android.intent.action.CALL", Uri.parse("tel:" + this.f11439h.f11447c)), (Object) null);
        }
    }

    /* renamed from: g */
    public void m2313g() {
        if (this.f11439h != null) {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f11439h.f11447c));
            intent.putExtra("sms_body", "");
            Home.m6177b().m6182a(intent, (Object) null);
        }
    }

    /* renamed from: h */
    public void m2312h() {
        if (this.f11440i != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f11440i.f11447c, ""});
            intent.setType("text/plain");
            Home.m6177b().m6182a(intent, (Object) null);
        }
    }

    /* renamed from: a */
    public Bitmap m2327a(int i, int i2, boolean z) {
        Bitmap m639a;
        Bitmap m2325a;
        if (this.f11435d == null || this.f11435d.equals("")) {
            return null;
        }
        if (z) {
            InputStream m2326a = m2326a(Long.parseLong(this.f11433b));
            if (m2326a != null) {
                m639a = BitmapFactory.decodeStream(m2326a);
                try {
                    m2326a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                m639a = null;
            }
            if (m639a == null) {
                m639a = C4181q.m639a(C3465c.m2300a(C0853a.m10856d(), this.f11435d));
            }
        } else {
            m639a = C4181q.m639a(C3465c.m2300a(C0853a.m10856d(), this.f11435d));
        }
        if (m639a == null) {
            return null;
        }
        Bitmap m635d = C4181q.m635d(m639a, i, i2);
        if (z) {
            m2325a = m2325a(m635d);
        } else {
            m2325a = m2325a(m635d);
        }
        return m2324a(m2325a, z);
    }

    /* renamed from: a */
    private Bitmap m2325a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public InputStream m2326a(long j) {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                return C0853a.m10856d().getContentResolver().openAssetFileDescriptor(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j), "display_photo"), "r").createInputStream();
            } catch (IOException e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private Bitmap m2324a(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap maskBitmap = ThemeManager.mix.contact.getMaskBitmap(width, height, z);
        if (maskBitmap != null) {
            C4181q.m641a(new Canvas(bitmap), maskBitmap, 0, 0);
            maskBitmap.recycle();
        }
        Bitmap backBitmap = ThemeManager.mix.contact.getBackBitmap(width, height, z);
        if (backBitmap == null) {
            backBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(backBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        Bitmap uponBitmap = ThemeManager.mix.contact.getUponBitmap(width, height, z);
        if (uponBitmap != null) {
            canvas.drawBitmap(uponBitmap, 0.0f, 0.0f, (Paint) null);
            uponBitmap.recycle();
        }
        return backBitmap;
    }

    /* renamed from: i */
    public void m2311i() {
        Iterator<C3461a> it = this.f11438g.iterator();
        while (it.hasNext()) {
            it.next().m2308b();
        }
        Iterator<C3463c> it2 = this.f11437f.iterator();
        while (it2.hasNext()) {
            it2.next().m2308b();
        }
        this.f11438g.clear();
        this.f11437f.clear();
        this.f11439h = null;
        this.f11440i = null;
        this.f11432a = -1L;
        this.f11443l = false;
    }

    /* renamed from: com.tsf.shell.manager.c.a.a.a$c */
    /* loaded from: classes.dex */
    public static class C3463c extends C3462b {
        public C3463c(String str, String str2, C3459a c3459a) {
            super(str, str2, c3459a);
        }
    }

    /* renamed from: com.tsf.shell.manager.c.a.a.a$a */
    /* loaded from: classes.dex */
    public static class C3461a extends C3462b {
        public C3461a(String str, String str2, C3459a c3459a) {
            super(str, str2, c3459a);
        }
    }

    /* renamed from: com.tsf.shell.manager.c.a.a.a$b */
    /* loaded from: classes.dex */
    public static class C3462b {

        /* renamed from: a */
        public C3052d f11445a;

        /* renamed from: b */
        public C3459a f11446b;

        /* renamed from: c */
        public String f11447c;

        /* renamed from: d */
        public String f11448d;

        public C3462b(String str, String str2, C3459a c3459a) {
            this.f11446b = c3459a;
            this.f11447c = str;
            this.f11448d = str2;
        }

        /* renamed from: a */
        public void m2309a(C3052d c3052d) {
            this.f11445a = c3052d;
        }

        /* renamed from: a */
        public void m2310a() {
            this.f11445a = null;
        }

        /* renamed from: b */
        public void m2308b() {
            this.f11447c = null;
            this.f11448d = null;
            this.f11445a = null;
            this.f11446b = null;
        }

        /* renamed from: c */
        public String m2307c() {
            return this.f11448d;
        }

        /* renamed from: d */
        public String m2306d() {
            return this.f11447c;
        }

        /* renamed from: e */
        public C3052d m2305e() {
            return this.f11445a;
        }

        /* renamed from: f */
        public void m2304f() {
            if (this.f11446b != null) {
                this.f11446b.m2323a(this);
            }
        }
    }
}
