package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.n;
import com.android.volley.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.dex */
public class h {
    private final com.android.volley.m a;
    private int b;
    private final b c;
    private final HashMap<String, a> d;
    private final HashMap<String, a> e;
    private final Handler f;
    private Runnable g;

    /* loaded from: classes.dex */
    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public interface d extends n.a {
        void a(c cVar, boolean z);
    }

    public c a(String str, d dVar, int i, int i2, ImageView.ScaleType scaleType) {
        a();
        String a2 = a(str, i, i2, scaleType);
        Bitmap a3 = this.c.a(a2);
        if (a3 != null) {
            c cVar = new c(a3, str, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        c cVar2 = new c(null, str, a2, dVar);
        dVar.a(cVar2, true);
        a aVar = this.d.get(a2);
        if (aVar != null) {
            aVar.a(cVar2);
            return cVar2;
        }
        com.android.volley.l<Bitmap> a4 = a(str, i, i2, scaleType, a2);
        this.a.a((com.android.volley.l) a4);
        this.d.put(a2, new a(a4, cVar2));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends i {
        public e(String str, n.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, n.a aVar) {
            super(str, bVar, i, i2, scaleType, config, aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.volley.toolbox.i, com.android.volley.l
        public com.android.volley.n<Bitmap> a(com.android.volley.i iVar) {
            com.android.volley.n<Bitmap> a = super.a(iVar);
            if (a != null && a.b != null) {
                a.b.f = Long.MAX_VALUE;
                a.b.e = Long.MAX_VALUE;
            }
            return a;
        }
    }

    protected void a(String str, Bitmap bitmap) {
        this.c.a(str, bitmap);
        a remove = this.d.remove(str);
        if (remove == null) {
            return;
        }
        remove.b = bitmap;
        a(str, remove);
    }

    protected void a(String str, s sVar) {
        a remove = this.d.remove(str);
        if (remove != null) {
            remove.a(sVar);
            a(str, remove);
        }
    }

    /* loaded from: classes.dex */
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
                        }
                    }
                } else if (aVar.b(this)) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
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
            if (this.d.size() == 0) {
                this.a.g();
                return true;
            }
            return false;
        }
    }

    private void a(String str, a aVar) {
        this.e.put(str, aVar);
        if (this.g == null) {
            this.g = new Runnable() { // from class: com.android.volley.toolbox.h.3
                @Override // java.lang.Runnable
                public void run() {
                    for (a aVar2 : h.this.e.values()) {
                        Iterator it = aVar2.d.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
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
