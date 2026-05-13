package com.tsf.extend.base.p074d;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p002v4.p009d.C0166f;
import android.util.Pair;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0798m;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0815a;
import com.android.volley.toolbox.C0838j;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.C1374c;
import com.tsf.extend.base.p071b.p072a.C1369a;
import com.tsf.extend.base.p076f.C1401a;
import com.tsf.extend.base.p076f.C1402b;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1455z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.base.d.a */
/* loaded from: classes.dex */
public abstract class AbstractC1386a {

    /* renamed from: b */
    private static C0166f<String, SoftReference<Bitmap>> f4329b = null;

    /* renamed from: a */
    protected HashMap<String, C1368a> f4330a = new HashMap<>();

    /* renamed from: c */
    private C0798m f4331c;

    /* renamed from: com.tsf.extend.base.d.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1396a<T> {
        /* renamed from: a */
        void mo6247a(JSONObject jSONObject, int i, T t);

        /* renamed from: a */
        void mo6245a(JSONObject jSONObject, T t);
    }

    /* renamed from: com.tsf.extend.base.d.a$b */
    /* loaded from: classes.dex */
    public enum EnumC1397b {
        LoadCache,
        Refresh,
        LoadMore
    }

    /* renamed from: a */
    protected abstract C1368a mo6209a(String str, String str2, JSONObject jSONObject);

    /* renamed from: a */
    protected abstract String mo6221a();

    /* renamed from: a */
    protected abstract String mo6210a(String str, EnumC1397b enumC1397b, int i, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo6217a(C0809s c0809s);

    /* renamed from: b */
    public abstract C1368a mo6206b();

    public AbstractC1386a() {
        if (f4329b == null) {
            f4329b = new C0166f<String, SoftReference<Bitmap>>(10) { // from class: com.tsf.extend.base.d.a.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.p002v4.p009d.C0166f
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo1062a(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
                    super.mo1062a(z, (boolean) str, softReference, softReference2);
                    if (z && softReference != null) {
                        softReference.clear();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.p002v4.p009d.C0166f
                /* renamed from: a */
                public int mo1060b(String str, SoftReference<Bitmap> softReference) {
                    return 1;
                }
            };
        }
    }

    /* renamed from: a */
    public void m8809a(Context context) {
        this.f4331c = C1406c.m8766a(context);
    }

    /* renamed from: a */
    public void m8808a(Context context, C0815a c0815a) {
        this.f4331c = C1406c.m8764a(context, null, c0815a, new C1374c(new File(context.getCacheDir(), "volley_wpp")));
    }

    /* renamed from: a */
    public void mo8250a(String str, InterfaceC1396a<C1368a> interfaceC1396a, EnumC1397b enumC1397b, JSONObject jSONObject) {
        m8799a(str, interfaceC1396a, enumC1397b, jSONObject, true);
    }

    /* renamed from: a */
    public void m8799a(String str, InterfaceC1396a<C1368a> interfaceC1396a, EnumC1397b enumC1397b, JSONObject jSONObject, boolean z) {
        switch (enumC1397b) {
            case LoadCache:
                m8793c(str, interfaceC1396a, enumC1397b, jSONObject, z);
                return;
            case Refresh:
                m8795b(str, interfaceC1396a, enumC1397b, jSONObject, z);
                return;
            case LoadMore:
                m8798a(str, interfaceC1396a, jSONObject, z);
                return;
            default:
                throw new IllegalArgumentException("unknown RequestType");
        }
    }

    /* renamed from: b */
    protected void m8795b(String str, InterfaceC1396a<C1368a> interfaceC1396a, EnumC1397b enumC1397b, JSONObject jSONObject, boolean z) {
        m8797a(str, mo6210a(str, enumC1397b, 1, jSONObject), interfaceC1396a, enumC1397b, jSONObject, z);
    }

    /* renamed from: a */
    private void m8798a(String str, InterfaceC1396a<C1368a> interfaceC1396a, JSONObject jSONObject, boolean z) {
        C1368a c1368a = this.f4330a.get(str);
        if (c1368a == null) {
            if (interfaceC1396a != null) {
                interfaceC1396a.mo6247a(jSONObject, 2, null);
                return;
            }
            return;
        }
        m8797a(str, mo6210a(str, EnumC1397b.LoadMore, c1368a.m8859f() + 1, jSONObject), interfaceC1396a, EnumC1397b.LoadMore, jSONObject, z);
    }

    /* renamed from: c */
    protected void m8793c(final String str, final InterfaceC1396a<C1368a> interfaceC1396a, final EnumC1397b enumC1397b, final JSONObject jSONObject, final boolean z) {
        C1368a c1368a = this.f4330a.get(str);
        if (c1368a != null) {
            if (interfaceC1396a != null) {
                interfaceC1396a.mo6245a(jSONObject, c1368a);
            }
            if (c1368a.mo6376d()) {
                m8797a(str, mo6210a(str, EnumC1397b.Refresh, 1, jSONObject), interfaceC1396a, enumC1397b, jSONObject, z);
                return;
            }
            return;
        }
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.base.d.a.2
            @Override // java.lang.Runnable
            public void run() {
                C1368a c1368a2;
                Object m8853a = C1369a.m8855a().m8853a(str);
                if (!(m8853a instanceof C1368a)) {
                    c1368a2 = null;
                } else {
                    c1368a2 = (C1368a) m8853a;
                }
                if (c1368a2 != null) {
                    if (interfaceC1396a != null) {
                        interfaceC1396a.mo6245a(jSONObject, c1368a2);
                    }
                    AbstractC1386a.this.f4330a.put(str, c1368a2);
                }
                if (c1368a2 == null || c1368a2.mo6376d()) {
                    AbstractC1386a.this.m8797a(str, AbstractC1386a.this.mo6210a(str, EnumC1397b.Refresh, 1, jSONObject), interfaceC1396a, enumC1397b, jSONObject, z);
                }
            }
        });
    }

    /* renamed from: a */
    protected void m8797a(final String str, final String str2, InterfaceC1396a<C1368a> interfaceC1396a, final EnumC1397b enumC1397b, final JSONObject jSONObject, final boolean z) {
        if (str2 == null && interfaceC1396a != null) {
            interfaceC1396a.mo6247a(jSONObject, 2, null);
        }
        final WeakReference weakReference = new WeakReference(interfaceC1396a);
        C0838j c0838j = new C0838j(str2, null, new C0802n.InterfaceC0804b<JSONObject>() { // from class: com.tsf.extend.base.d.a.3
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(JSONObject jSONObject2) {
                try {
                    C1368a mo6209a = AbstractC1386a.this.mo6209a(str, str2, jSONObject2);
                    if (mo6209a == null) {
                        InterfaceC1396a interfaceC1396a2 = (InterfaceC1396a) weakReference.get();
                        if (interfaceC1396a2 != null) {
                            interfaceC1396a2.mo6247a(jSONObject, 2, null);
                            return;
                        }
                        return;
                    }
                    if (enumC1397b != EnumC1397b.LoadMore) {
                        AbstractC1386a.this.f4330a.put(str, mo6209a);
                        if (mo6209a.m8865c() != 0) {
                            mo6209a.m8869a(mo6209a.mo6375h());
                        }
                        mo6209a.m8871a(mo6209a.m8861e());
                        if (z) {
                            AbstractC1386a.this.m8802a(str, mo6209a);
                        }
                    } else {
                        C1368a c1368a = AbstractC1386a.this.f4330a.get(str);
                        if (c1368a != null && c1368a.m8875a() != null) {
                            c1368a.m8875a().addAll(mo6209a.m8875a());
                            if (c1368a.m8858g() != 0) {
                                c1368a.m8869a(mo6209a.mo6375h());
                            }
                            c1368a.m8871a(mo6209a.m8861e());
                            c1368a.m8874a(c1368a.m8859f() + 1);
                            c1368a.m8863d(mo6209a.m8857j());
                            mo6209a.m8874a(c1368a.m8859f());
                            mo6209a.m8869a(mo6209a.mo6375h());
                            if (z) {
                                AbstractC1386a.this.m8802a(str, c1368a);
                            }
                        }
                    }
                    InterfaceC1396a interfaceC1396a3 = (InterfaceC1396a) weakReference.get();
                    if (interfaceC1396a3 != null) {
                        interfaceC1396a3.mo6245a(jSONObject, mo6209a);
                    }
                } catch (JSONException e) {
                    InterfaceC1396a interfaceC1396a4 = (InterfaceC1396a) weakReference.get();
                    if (interfaceC1396a4 != null) {
                        interfaceC1396a4.mo6247a(jSONObject, 2, null);
                    }
                }
            }
        }, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.base.d.a.4
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                C1368a c1368a = AbstractC1386a.this.f4330a.get(str);
                InterfaceC1396a interfaceC1396a2 = (InterfaceC1396a) weakReference.get();
                if (interfaceC1396a2 != null) {
                    interfaceC1396a2.mo6247a(jSONObject, 0, c1368a);
                }
                AbstractC1386a.this.mo6217a(c0809s);
                if (enumC1397b == EnumC1397b.Refresh && c1368a == null && interfaceC1396a2 != null && AbstractC1386a.this.mo6206b() != null) {
                    interfaceC1396a2.mo6245a(jSONObject, AbstractC1386a.this.mo6206b());
                }
            }
        });
        c0838j.m11032a(false);
        c0838j.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
        this.f4331c.m11010a((AbstractC0795l) c0838j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8802a(final String str, final C1368a c1368a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.base.d.a.5
            @Override // java.lang.Runnable
            public void run() {
                C1369a.m8855a().m8852a(str, c1368a);
            }
        });
    }

    /* renamed from: a */
    public void m8801a(String str, InterfaceC1396a<Pair<String, Bitmap>> interfaceC1396a) {
        m8800a(str, interfaceC1396a, AbstractC0795l.EnumC0797a.LOW, 0, 0);
    }

    /* renamed from: a */
    public void m8800a(final String str, InterfaceC1396a<Pair<String, Bitmap>> interfaceC1396a, AbstractC0795l.EnumC0797a enumC0797a, int i, int i2) {
        Bitmap bitmap;
        SoftReference<Bitmap> m13358a = f4329b == null ? null : f4329b.m13358a((C0166f<String, SoftReference<Bitmap>>) str);
        if (m13358a != null && (bitmap = m13358a.get()) != null) {
            if (interfaceC1396a != null) {
                interfaceC1396a.mo6245a(null, Pair.create(str, bitmap));
                return;
            }
            return;
        }
        final WeakReference weakReference = new WeakReference(interfaceC1396a);
        C1401a c1401a = new C1401a(str, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.base.d.a.6
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(Bitmap bitmap2) {
                if (bitmap2 != null) {
                    if (AbstractC1386a.f4329b != null) {
                        AbstractC1386a.f4329b.m13357a(str, new SoftReference(bitmap2));
                    }
                    InterfaceC1396a interfaceC1396a2 = (InterfaceC1396a) weakReference.get();
                    if (interfaceC1396a2 != null) {
                        interfaceC1396a2.mo6245a(null, Pair.create(str, bitmap2));
                    }
                }
            }
        }, i, i2, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.base.d.a.7
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                InterfaceC1396a interfaceC1396a2 = (InterfaceC1396a) weakReference.get();
                if (interfaceC1396a2 != null) {
                    interfaceC1396a2.mo6247a(null, 0, Pair.create(str, null));
                }
            }
        });
        c1401a.m8769a(enumC0797a);
        c1401a.mo6644a(mo6221a());
        this.f4331c.m11010a((AbstractC0795l) c1401a);
    }

    /* renamed from: c */
    public void m8794c() {
        if (this.f4331c != null) {
            this.f4331c.m11008a(mo6221a());
        }
    }

    /* renamed from: a */
    public static boolean m8805a(File file, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        boolean z = false;
        if (bitmap != null && !bitmap.isRecycled() && file != null) {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    z = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (FileNotFoundException e2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    return z;
                } catch (IllegalStateException e4) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                fileOutputStream = null;
            } catch (IllegalStateException e8) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m8803a(String str, Bitmap bitmap) {
        if (bitmap != null && str != null && f4329b != null) {
            f4329b.m13357a(str, new SoftReference<>(bitmap));
        }
    }

    /* renamed from: a */
    public Bitmap m8804a(String str) {
        SoftReference<Bitmap> m13358a = f4329b == null ? null : f4329b.m13358a((C0166f<String, SoftReference<Bitmap>>) str);
        if (m13358a != null) {
            return m13358a.get();
        }
        return null;
    }

    /* renamed from: d */
    public HashMap<String, C1368a> m8792d() {
        return this.f4330a;
    }

    /* renamed from: a */
    public void m8807a(AbstractC0795l abstractC0795l) {
        this.f4331c.m11010a(abstractC0795l);
    }

    /* renamed from: e */
    public C0798m m8791e() {
        return this.f4331c;
    }

    /* renamed from: f */
    public void mo6200f() {
        if (f4329b != null) {
            f4329b.m13360a();
            f4329b = null;
        }
        this.f4330a.clear();
        m8794c();
    }

    /* renamed from: b */
    public void m8796b(String str, InterfaceC1396a<JSONObject> interfaceC1396a) {
        C0838j m8768a = C1402b.m8768a(str, null, interfaceC1396a, new C1402b.InterfaceC1405a<JSONObject>() { // from class: com.tsf.extend.base.d.a.8
            @Override // com.tsf.extend.base.p076f.C1402b.InterfaceC1405a
            /* renamed from: a */
            public JSONObject mo7058b(JSONObject jSONObject) {
                return jSONObject;
            }
        });
        m8768a.m11032a(false);
        m8768a.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
        m8807a(m8768a);
    }
}
