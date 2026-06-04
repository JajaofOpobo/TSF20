package com.tsf.shell.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public CharSequence f;
    public String g;
    private Context k;
    private SoftReference m;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    private ArrayList l = new ArrayList();

    public n(Context context) {
        this.k = context;
    }

    public final void a(String str) {
        this.l.add(str);
    }

    public final Bitmap a() {
        if (this.m != null && this.m.get() != null) {
            return (Bitmap) this.m.get();
        }
        Bitmap b = b(this.c);
        if (this.m != null) {
            this.m.clear();
        }
        this.m = new SoftReference(b);
        return b;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Bitmap a = a();
        if (a != null) {
            arrayList.add(a);
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            Bitmap b = b((String) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    private Bitmap b(String str) {
        InputStream openRawResource;
        Bitmap bitmap = null;
        if (str == null) {
            return null;
        }
        try {
            if (!this.j) {
                openRawResource = this.k.getAssets().open("theme/preview/" + str);
            } else {
                openRawResource = this.k.getResources().openRawResource(this.k.getResources().getIdentifier(str, "drawable", this.k.getPackageName()));
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openRawResource, null, options);
            options.inSampleSize = a(options);
            options.inJustDecodeBounds = false;
            Bitmap decodeStream = BitmapFactory.decodeStream(openRawResource, null, options);
            openRawResource.close();
            bitmap = decodeStream;
            return bitmap;
        } catch (Exception e) {
            return bitmap;
        }
    }

    private static int a(BitmapFactory.Options options) {
        int ceil = (int) Math.ceil(Math.sqrt((options.outWidth * options.outHeight) / 518400.0d));
        if (ceil <= 8) {
            int i = 1;
            while (i < ceil) {
                i <<= 1;
            }
            return i;
        }
        return ((ceil + 7) / 8) * 8;
    }
}
