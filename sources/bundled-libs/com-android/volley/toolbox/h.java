package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.n;
import com.android.volley.s;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    private final com.android.volley.m a;
    private int b;
    private final b c;
    private final HashMap<String, a> d;
    private final HashMap<String, a> e;
    private final Handler f;
    private Runnable g;

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public interface d extends n.a {
        void a(c cVar, boolean z);
    }

    public c a(String str, d dVar, int i, int i2, ImageView.ScaleType scaleType) {
        a();
        String strA = a(str, i, i2, scaleType);
        Bitmap bitmapA = this.c.a(strA);
        if (bitmapA != null) {
            c cVar = new c(bitmapA, str, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        c cVar2 = new c(null, str, strA, dVar);
        dVar.a(cVar2, true);
        a aVar = this.d.get(strA);
        if (aVar != null) {
            aVar.a(cVar2);
            return cVar2;
        }
        com.android.volley.l<Bitmap> lVarA = a(str, i, i2, scaleType, strA);
        this.a.a((com.android.volley.l) lVarA);
        this.d.put(strA, new a(lVarA, cVar2));
        return cVar2;
    }

    protected com.android.volley.l<Bitmap> a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new e(str, new n.b<Bitmap>() { // from class: com.android.volley.toolbox.h.1
            @Override // com.android.volley.n.b
            public void a(Bitmap bitmap) {
                h.this.a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new n.a() { // from class: com.android.volley.toolbox.h.2
            @Override // com.android.volley.n.a
            public void a(s sVar) {
                h.this.a(str2, sVar);
            }
        });
    }

    static class e extends i {
        public e(String str, n.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, n.a aVar) {
            super(str, bVar, i, i2, scaleType, config, aVar);
        }

        @Override // com.android.volley.toolbox.i, com.android.volley.l
        protected com.android.volley.n<Bitmap> a(com.android.volley.i iVar) {
            com.android.volley.n<Bitmap> nVarA = super.a(iVar);
            if (nVarA != null && nVarA.b != null) {
                nVarA.b.f = Long.MAX_VALUE;
                nVarA.b.e = Long.MAX_VALUE;
            }
            return nVarA;
        }
    }

    protected void a(String str, Bitmap bitmap) {
        this.c.a(str, bitmap);
        a aVarRemove = this.d.remove(str);
        if (aVarRemove == null) {
            return;
        }
        aVarRemove.b = bitmap;
        a(str, aVarRemove);
    }

    protected void a(String str, s sVar) {
        a aVarRemove = this.d.remove(str);
        if (aVarRemove != null) {
            aVarRemove.a(sVar);
            a(str, aVarRemove);
        }
    }

    public class c {
        private Bitmap b;
        private final d c;
        private final String d;
        private final String e;

        public c(Bitmap bitmap, String str, String str2, d dVar) {
            this.b = bitmap;
            this.e = str;
            this.d = str2;
            this.c = dVar;
        }

        public void a() {
            if (this.c != null) {
                a aVar = (a) h.this.d.get(this.d);
                if (aVar == null) {
                    a aVar2 = (a) h.this.e.get(this.d);
                    if (aVar2 != null) {
                        aVar2.b(this);
                        if (aVar2.d.size() == 0) {
                            h.this.e.remove(this.d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (aVar.b(this)) {
                    h.this.d.remove(this.d);
                }
            }
        }

        public Bitmap b() {
            return this.b;
        }

        public String c() {
            return this.e;
        }
    }

    private static class a {
        private final com.android.volley.l<?> a;
        private Bitmap b;
        private s c;
        private final LinkedList<c> d = new LinkedList<>();

        public a(com.android.volley.l<?> lVar, c cVar) {
            this.a = lVar;
            this.d.add(cVar);
        }

        public void a(s sVar) {
            this.c = sVar;
        }

        public s a() {
            return this.c;
        }

        public void a(c cVar) {
            this.d.add(cVar);
        }

        public boolean b(c cVar) {
            this.d.remove(cVar);
            if (this.d.size() != 0) {
                return false;
            }
            this.a.g();
            return true;
        }
    }

    private void a(String str, a aVar) {
        this.e.put(str, aVar);
        if (this.g == null) {
            this.g = new Runnable() { // from class: com.android.volley.toolbox.h.3
                @Override // java.lang.Runnable
                public void run() {
                    for (a aVar2 : h.this.e.values()) {
                        for (c cVar : aVar2.d) {
                            if (cVar.c != null) {
                                if (aVar2.a() == null) {
                                    cVar.b = aVar2.b;
                                    cVar.c.a(cVar, false);
                                } else {
                                    cVar.c.a(aVar2.a());
                                }
                            }
                        }
                    }
                    h.this.e.clear();
                    h.this.g = null;
                }
            };
            this.f.postDelayed(this.g, this.b);
        }
    }

    private void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    public static String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append("#S").append(scaleType.ordinal()).append(str).toString();
    }
}
