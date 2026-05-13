package com.tsf.shell.manager.c.a.a;

import android.content.ContentUris;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import com.tsf.shell.Home;
import com.tsf.shell.f.h.a.a.a.d;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a {
    public long a;
    public String b;
    public String c;
    public String d;
    public int e;
    public ArrayList<c> f;
    public ArrayList<C0126a> g;
    private b h;
    private b i;
    private String j;
    private String k;
    private boolean l;

    public b a() {
        return this.h;
    }

    public b b() {
        return this.i;
    }

    public boolean c() {
        return com.tsf.shell.manager.c.c.a(this);
    }

    public void d() {
        if (!this.l) {
            this.l = true;
            com.tsf.shell.manager.c.c.a(com.censivn.C3DEngine.a.d(), this);
            com.tsf.shell.manager.c.c.b(com.censivn.C3DEngine.a.d(), this);
            com.tsf.shell.manager.a.z.b().a(this);
        }
    }

    public void a(String str, String str2) {
        this.j = str;
        this.k = str2;
        Iterator<c> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c next = it.next();
            if (next.c.equals(str)) {
                this.h = next;
                break;
            }
        }
        Iterator<C0126a> it2 = this.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0126a next2 = it2.next();
            if (next2.c.equals(str2)) {
                this.i = next2;
                break;
            }
        }
        if (this.h == null && this.f.size() > 0) {
            this.h = this.f.get(0);
        }
        if (this.i == null && this.g.size() > 0) {
            this.i = this.g.get(0);
        }
    }

    public void e() {
        boolean z = false;
        if (this.h != null && this.h.c != this.j) {
            this.j = this.h.c;
            z = true;
        }
        if (this.i != null && this.i.c != this.k) {
            this.k = this.i.c;
            z = true;
        }
        if (z) {
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.c.a.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.l) {
                        com.tsf.shell.manager.a.z.b().b(a.this);
                    }
                }
            });
        }
    }

    public void a(b bVar) {
        bVar.e().e();
        if (bVar instanceof c) {
            if (bVar != this.h) {
                if (this.h != null && this.h.e() != null) {
                    this.h.e().f();
                }
                this.h = bVar;
            }
        } else if ((bVar instanceof C0126a) && bVar != this.i) {
            if (this.i != null && this.i.e() != null) {
                this.i.e().f();
            }
            this.i = bVar;
        }
    }

    public void b(String str, String str2) {
        this.g.add(new C0126a(str, str2, this));
    }

    public void c(String str, String str2) {
        this.f.add(new c(str, str2, this));
    }

    public void f() {
        if (this.h != null) {
            Home.b().a(new Intent("android.intent.action.CALL", Uri.parse("tel:" + this.h.c)), (Object) null);
        }
    }

    public void g() {
        if (this.h != null) {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.h.c));
            intent.putExtra("sms_body", "");
            Home.b().a(intent, (Object) null);
        }
    }

    public void h() {
        if (this.i != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{this.i.c, ""});
            intent.setType("text/plain");
            Home.b().a(intent, (Object) null);
        }
    }

    public Bitmap a(int i, int i2, boolean z) {
        Bitmap a;
        Bitmap a2;
        if (this.d == null || this.d.equals("")) {
            return null;
        }
        if (z) {
            InputStream a3 = a(Long.parseLong(this.b));
            if (a3 != null) {
                a = BitmapFactory.decodeStream(a3);
                try {
                    a3.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                a = null;
            }
            if (a == null) {
                a = q.a(com.tsf.shell.manager.c.c.a(com.censivn.C3DEngine.a.d(), this.d));
            }
        } else {
            a = q.a(com.tsf.shell.manager.c.c.a(com.censivn.C3DEngine.a.d(), this.d));
        }
        if (a == null) {
            return null;
        }
        Bitmap d = q.d(a, i, i2);
        if (z) {
            a2 = a(d);
        } else {
            a2 = a(d);
        }
        return a(a2, z);
    }

    private Bitmap a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    public InputStream a(long j) {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                return com.censivn.C3DEngine.a.d().getContentResolver().openAssetFileDescriptor(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j), "display_photo"), "r").createInputStream();
            } catch (IOException e) {
                return null;
            }
        }
        return null;
    }

    private Bitmap a(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap maskBitmap = ThemeManager.mix.contact.getMaskBitmap(width, height, z);
        if (maskBitmap != null) {
            q.a(new Canvas(bitmap), maskBitmap, 0, 0);
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

    public void i() {
        Iterator<C0126a> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        Iterator<c> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        this.g.clear();
        this.f.clear();
        this.h = null;
        this.i = null;
        this.a = -1L;
        this.l = false;
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(String str, String str2, a aVar) {
            super(str, str2, aVar);
        }
    }

    /* renamed from: com.tsf.shell.manager.c.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0126a extends b {
        public C0126a(String str, String str2, a aVar) {
            super(str, str2, aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public d a;
        public a b;
        public String c;
        public String d;

        public b(String str, String str2, a aVar) {
            this.b = aVar;
            this.c = str;
            this.d = str2;
        }

        public void a(d dVar) {
            this.a = dVar;
        }

        public void a() {
            this.a = null;
        }

        public void b() {
            this.c = null;
            this.d = null;
            this.a = null;
            this.b = null;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.c;
        }

        public d e() {
            return this.a;
        }

        public void f() {
            if (this.b != null) {
                this.b.a(this);
            }
        }
    }
}
