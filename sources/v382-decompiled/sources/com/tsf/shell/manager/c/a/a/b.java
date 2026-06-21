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
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b {
    public String b;
    public String c;
    public String d;
    public int e;
    private d h;
    private d i;
    public long a = -1;
    private String j = "";
    private String k = "";
    private boolean l = false;
    public ArrayList g = new ArrayList();
    public ArrayList f = new ArrayList();

    public d a() {
        return this.h;
    }

    public d b() {
        return this.i;
    }

    public boolean c() {
        return com.tsf.shell.manager.c.d.a(this);
    }

    public void d() {
        if (!this.l) {
            this.l = true;
            com.tsf.shell.manager.c.d.a(com.censivn.C3DEngine.a.d(), this);
            com.tsf.shell.manager.c.d.b(com.censivn.C3DEngine.a.d(), this);
            com.tsf.shell.manager.a.z.b().a(this);
        }
    }

    public void a(String str, String str2) {
        this.j = str;
        this.k = str2;
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar.c.equals(str)) {
                this.h = dVar;
                break;
            }
        }
        Iterator it2 = this.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            d dVar2 = (d) it2.next();
            if (dVar2.c.equals(str2)) {
                this.i = dVar2;
                break;
            }
        }
        if (this.h == null && this.f.size() > 0) {
            this.h = (d) this.f.get(0);
        }
        if (this.i == null && this.g.size() > 0) {
            this.i = (d) this.g.get(0);
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
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.c.a.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.l) {
                        com.tsf.shell.manager.a.z.b().b(b.this);
                    }
                }
            });
        }
    }

    public void a(d dVar) {
        dVar.e().e();
        if (dVar instanceof e) {
            if (dVar != this.h) {
                if (this.h != null && this.h.e() != null) {
                    this.h.e().f();
                }
                this.h = dVar;
                return;
            }
            return;
        }
        if ((dVar instanceof c) && dVar != this.i) {
            if (this.i != null && this.i.e() != null) {
                this.i.e().f();
            }
            this.i = dVar;
        }
    }

    public void b(String str, String str2) {
        this.g.add(new c(str, str2, this));
    }

    public void c(String str, String str2) {
        this.f.add(new e(str, str2, this));
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
                a = r.a(com.tsf.shell.manager.c.d.a(com.censivn.C3DEngine.a.d(), this.d));
            }
        } else {
            a = r.a(com.tsf.shell.manager.c.d.a(com.censivn.C3DEngine.a.d(), this.d));
        }
        if (a == null) {
            return null;
        }
        Bitmap d = r.d(a, i, i2);
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
        if (Build.VERSION.SDK_INT < 14) {
            return null;
        }
        try {
            return com.censivn.C3DEngine.a.d().getContentResolver().openAssetFileDescriptor(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j), "display_photo"), "r").createInputStream();
        } catch (IOException e) {
            return null;
        }
    }

    private Bitmap a(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap maskBitmap = ThemeManager.mix.contact.getMaskBitmap(width, height, z);
        if (maskBitmap != null) {
            r.a(new Canvas(bitmap), maskBitmap, 0, 0);
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
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).b();
        }
        this.g.clear();
        this.f.clear();
        this.h = null;
        this.i = null;
        this.a = -1L;
        this.l = false;
    }
}
