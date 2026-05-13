package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0792i;
import com.android.volley.C0798m;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/* renamed from: com.android.volley.toolbox.h */
/* loaded from: classes.dex */
public class C0828h {

    /* renamed from: a */
    private final C0798m f2369a;

    /* renamed from: b */
    private int f2370b;

    /* renamed from: c */
    private final InterfaceC0833b f2371c;

    /* renamed from: d */
    private final HashMap<String, C0832a> f2372d;

    /* renamed from: e */
    private final HashMap<String, C0832a> f2373e;

    /* renamed from: f */
    private final Handler f2374f;

    /* renamed from: g */
    private Runnable f2375g;

    /* renamed from: com.android.volley.toolbox.h$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0833b {
        /* renamed from: a */
        Bitmap m10917a(String str);

        /* renamed from: a */
        void m10916a(String str, Bitmap bitmap);
    }

    /* renamed from: com.android.volley.toolbox.h$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0835d extends C0802n.InterfaceC0803a {
        /* renamed from: a */
        void mo10910a(C0834c c0834c, boolean z);
    }

    /* renamed from: a */
    public C0834c m10927a(String str, InterfaceC0835d interfaceC0835d, int i, int i2, ImageView.ScaleType scaleType) {
        m10935a();
        String m10932a = m10932a(str, i, i2, scaleType);
        Bitmap m10917a = this.f2371c.m10917a(m10932a);
        if (m10917a != null) {
            C0834c c0834c = new C0834c(m10917a, str, null, null);
            interfaceC0835d.mo10910a(c0834c, true);
            return c0834c;
        }
        C0834c c0834c2 = new C0834c(null, str, m10932a, interfaceC0835d);
        interfaceC0835d.mo10910a(c0834c2, true);
        C0832a c0832a = this.f2372d.get(m10932a);
        if (c0832a != null) {
            c0832a.m10920a(c0834c2);
            return c0834c2;
        }
        AbstractC0795l<Bitmap> m10931a = m10931a(str, i, i2, scaleType, m10932a);
        this.f2369a.m11010a((AbstractC0795l) m10931a);
        this.f2372d.put(m10932a, new C0832a(m10931a, c0834c2));
        return c0834c2;
    }

    /* renamed from: a */
    protected AbstractC0795l<Bitmap> m10931a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new C0836e(str, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.android.volley.toolbox.h.1
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(Bitmap bitmap) {
                C0828h.this.m10930a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new C0802n.InterfaceC0803a() { // from class: com.android.volley.toolbox.h.2
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                C0828h.this.m10929a(str2, c0809s);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.h$e */
    /* loaded from: classes.dex */
    public static class C0836e extends C0837i {
        public C0836e(String str, C0802n.InterfaceC0804b<Bitmap> interfaceC0804b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C0802n.InterfaceC0803a interfaceC0803a) {
            super(str, interfaceC0804b, i, i2, scaleType, config, interfaceC0803a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.volley.toolbox.C0837i, com.android.volley.AbstractC0795l
        /* renamed from: a */
        public C0802n<Bitmap> mo6646a(C0792i c0792i) {
            C0802n<Bitmap> mo6646a = super.mo6646a(c0792i);
            if (mo6646a != null && mo6646a.f2321b != null) {
                mo6646a.f2321b.f2255f = Long.MAX_VALUE;
                mo6646a.f2321b.f2254e = Long.MAX_VALUE;
            }
            return mo6646a;
        }
    }

    /* renamed from: a */
    protected void m10930a(String str, Bitmap bitmap) {
        this.f2371c.m10916a(str, bitmap);
        C0832a remove = this.f2372d.remove(str);
        if (remove == null) {
            return;
        }
        remove.f2382b = bitmap;
        m10928a(str, remove);
    }

    /* renamed from: a */
    protected void m10929a(String str, C0809s c0809s) {
        C0832a remove = this.f2372d.remove(str);
        if (remove != null) {
            remove.m10923a(c0809s);
            m10928a(str, remove);
        }
    }

    /* renamed from: com.android.volley.toolbox.h$c */
    /* loaded from: classes.dex */
    public class C0834c {

        /* renamed from: b */
        private Bitmap f2386b;

        /* renamed from: c */
        private final InterfaceC0835d f2387c;

        /* renamed from: d */
        private final String f2388d;

        /* renamed from: e */
        private final String f2389e;

        public C0834c(Bitmap bitmap, String str, String str2, InterfaceC0835d interfaceC0835d) {
            this.f2386b = bitmap;
            this.f2389e = str;
            this.f2388d = str2;
            this.f2387c = interfaceC0835d;
        }

        /* renamed from: a */
        public void m10915a() {
            if (this.f2387c != null) {
                C0832a c0832a = (C0832a) C0828h.this.f2372d.get(this.f2388d);
                if (c0832a == null) {
                    C0832a c0832a2 = (C0832a) C0828h.this.f2373e.get(this.f2388d);
                    if (c0832a2 != null) {
                        c0832a2.m10918b(this);
                        if (c0832a2.f2384d.size() == 0) {
                            C0828h.this.f2373e.remove(this.f2388d);
                        }
                    }
                } else if (c0832a.m10918b(this)) {
                    C0828h.this.f2372d.remove(this.f2388d);
                }
            }
        }

        /* renamed from: b */
        public Bitmap m10912b() {
            return this.f2386b;
        }

        /* renamed from: c */
        public String m10911c() {
            return this.f2389e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.android.volley.toolbox.h$a */
    /* loaded from: classes.dex */
    public static class C0832a {

        /* renamed from: a */
        private final AbstractC0795l<?> f2381a;

        /* renamed from: b */
        private Bitmap f2382b;

        /* renamed from: c */
        private C0809s f2383c;

        /* renamed from: d */
        private final LinkedList<C0834c> f2384d = new LinkedList<>();

        public C0832a(AbstractC0795l<?> abstractC0795l, C0834c c0834c) {
            this.f2381a = abstractC0795l;
            this.f2384d.add(c0834c);
        }

        /* renamed from: a */
        public void m10923a(C0809s c0809s) {
            this.f2383c = c0809s;
        }

        /* renamed from: a */
        public C0809s m10924a() {
            return this.f2383c;
        }

        /* renamed from: a */
        public void m10920a(C0834c c0834c) {
            this.f2384d.add(c0834c);
        }

        /* renamed from: b */
        public boolean m10918b(C0834c c0834c) {
            this.f2384d.remove(c0834c);
            if (this.f2384d.size() == 0) {
                this.f2381a.m11022g();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private void m10928a(String str, C0832a c0832a) {
        this.f2373e.put(str, c0832a);
        if (this.f2375g == null) {
            this.f2375g = new Runnable() { // from class: com.android.volley.toolbox.h.3
                @Override // java.lang.Runnable
                public void run() {
                    for (C0832a c0832a2 : C0828h.this.f2373e.values()) {
                        Iterator it = c0832a2.f2384d.iterator();
                        while (it.hasNext()) {
                            C0834c c0834c = (C0834c) it.next();
                            if (c0834c.f2387c != null) {
                                if (c0832a2.m10924a() == null) {
                                    c0834c.f2386b = c0832a2.f2382b;
                                    c0834c.f2387c.mo10910a(c0834c, false);
                                } else {
                                    c0834c.f2387c.mo6194a(c0832a2.m10924a());
                                }
                            }
                        }
                    }
                    C0828h.this.f2373e.clear();
                    C0828h.this.f2375g = null;
                }
            };
            this.f2374f.postDelayed(this.f2375g, this.f2370b);
        }
    }

    /* renamed from: a */
    private void m10935a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    /* renamed from: a */
    public static String m10932a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append("#S").append(scaleType.ordinal()).append(str).toString();
    }
}
