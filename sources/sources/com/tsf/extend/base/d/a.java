package com.tsf.extend.base.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.d.f;
import android.util.Pair;
import com.android.volley.d;
import com.android.volley.l;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.s;
import com.android.volley.toolbox.j;
import com.tsf.extend.base.f.b;
import com.tsf.extend.base.f.c;
import com.tsf.extend.base.j.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class a {
    private static f<String, SoftReference<Bitmap>> b = null;
    protected HashMap<String, com.tsf.extend.base.b.a> a = new HashMap<>();
    private m c;

    /* JADX INFO: renamed from: com.tsf.extend.base.d.a$a, reason: collision with other inner class name */
    public interface InterfaceC0048a<T> {
        void a(JSONObject jSONObject, int i, T t);

        void a(JSONObject jSONObject, T t);
    }

    public enum b {
        LoadCache,
        Refresh,
        LoadMore
    }

    protected abstract com.tsf.extend.base.b.a a(String str, String str2, JSONObject jSONObject);

    protected abstract String a();

    protected abstract String a(String str, b bVar, int i, JSONObject jSONObject);

    public abstract void a(s sVar);

    public abstract com.tsf.extend.base.b.a b();

    public a() {
        if (b == null) {
            b = new f<String, SoftReference<Bitmap>>(10) { // from class: com.tsf.extend.base.d.a.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v4.d.f
                public void a(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
                    super.a(z, str, softReference, softReference2);
                    if (z && softReference != null) {
                        softReference.clear();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v4.d.f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int b(String str, SoftReference<Bitmap> softReference) {
                    return 1;
                }
            };
        }
    }

    public void a(Context context) {
        this.c = c.a(context);
    }

    public void a(Context context, com.android.volley.toolbox.a aVar) {
        this.c = c.a(context, null, aVar, new com.tsf.extend.base.b.c(new File(context.getCacheDir(), "volley_wpp")));
    }

    public void a(String str, InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, b bVar, JSONObject jSONObject) {
        a(str, interfaceC0048a, bVar, jSONObject, true);
    }

    public void a(String str, InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, b bVar, JSONObject jSONObject, boolean z) {
        switch (bVar) {
            case LoadCache:
                c(str, interfaceC0048a, bVar, jSONObject, z);
                return;
            case Refresh:
                b(str, interfaceC0048a, bVar, jSONObject, z);
                return;
            case LoadMore:
                a(str, interfaceC0048a, jSONObject, z);
                return;
            default:
                throw new IllegalArgumentException("unknown RequestType");
        }
    }

    protected void b(String str, InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, b bVar, JSONObject jSONObject, boolean z) {
        a(str, a(str, bVar, 1, jSONObject), interfaceC0048a, bVar, jSONObject, z);
    }

    private void a(String str, InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, JSONObject jSONObject, boolean z) {
        com.tsf.extend.base.b.a aVar = this.a.get(str);
        if (aVar == null) {
            if (interfaceC0048a != null) {
                interfaceC0048a.a(jSONObject, 2, null);
                return;
            }
            return;
        }
        a(str, a(str, b.LoadMore, aVar.f() + 1, jSONObject), interfaceC0048a, b.LoadMore, jSONObject, z);
    }

    protected void c(final String str, final InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, final b bVar, final JSONObject jSONObject, final boolean z) {
        com.tsf.extend.base.b.a aVar = this.a.get(str);
        if (aVar != null) {
            if (interfaceC0048a != null) {
                interfaceC0048a.a(jSONObject, aVar);
            }
            if (aVar.d()) {
                a(str, a(str, b.Refresh, 1, jSONObject), interfaceC0048a, bVar, jSONObject, z);
                return;
            }
            return;
        }
        z.a(2, new Runnable() { // from class: com.tsf.extend.base.d.a.2
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.base.b.a aVar2;
                Object objA = com.tsf.extend.base.b.a.a.a().a(str);
                if (!(objA instanceof com.tsf.extend.base.b.a)) {
                    aVar2 = null;
                } else {
                    aVar2 = (com.tsf.extend.base.b.a) objA;
                }
                if (aVar2 != null) {
                    if (interfaceC0048a != null) {
                        interfaceC0048a.a(jSONObject, aVar2);
                    }
                    a.this.a.put(str, aVar2);
                }
                if (aVar2 == null || aVar2.d()) {
                    a.this.a(str, a.this.a(str, b.Refresh, 1, jSONObject), interfaceC0048a, bVar, jSONObject, z);
                }
            }
        });
    }

    protected void a(final String str, final String str2, InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, final b bVar, final JSONObject jSONObject, final boolean z) {
        if (str2 == null && interfaceC0048a != null) {
            interfaceC0048a.a(jSONObject, 2, null);
        }
        final WeakReference weakReference = new WeakReference(interfaceC0048a);
        j jVar = new j(str2, null, new n.b<JSONObject>() { // from class: com.tsf.extend.base.d.a.3
            @Override // com.android.volley.n.b
            public void a(JSONObject jSONObject2) {
                try {
                    com.tsf.extend.base.b.a aVarA = a.this.a(str, str2, jSONObject2);
                    if (aVarA == null) {
                        InterfaceC0048a interfaceC0048a2 = (InterfaceC0048a) weakReference.get();
                        if (interfaceC0048a2 != null) {
                            interfaceC0048a2.a(jSONObject, 2, null);
                            return;
                        }
                        return;
                    }
                    if (bVar != b.LoadMore) {
                        a.this.a.put(str, aVarA);
                        if (aVarA.c() != 0) {
                            aVarA.a(aVarA.h());
                        }
                        aVarA.a(aVarA.e());
                        if (z) {
                            a.this.a(str, aVarA);
                        }
                    } else {
                        com.tsf.extend.base.b.a aVar = a.this.a.get(str);
                        if (aVar != null && aVar.a() != null) {
                            aVar.a().addAll(aVarA.a());
                            if (aVar.g() != 0) {
                                aVar.a(aVarA.h());
                            }
                            aVar.a(aVarA.e());
                            aVar.a(aVar.f() + 1);
                            aVar.d(aVarA.j());
                            aVarA.a(aVar.f());
                            aVarA.a(aVarA.h());
                            if (z) {
                                a.this.a(str, aVar);
                            }
                        }
                    }
                    InterfaceC0048a interfaceC0048a3 = (InterfaceC0048a) weakReference.get();
                    if (interfaceC0048a3 != null) {
                        interfaceC0048a3.a(jSONObject, aVarA);
                    }
                } catch (JSONException e) {
                    InterfaceC0048a interfaceC0048a4 = (InterfaceC0048a) weakReference.get();
                    if (interfaceC0048a4 != null) {
                        interfaceC0048a4.a(jSONObject, 2, null);
                    }
                }
            }
        }, new n.a() { // from class: com.tsf.extend.base.d.a.4
            @Override // com.android.volley.n.a
            public void a(s sVar) {
                com.tsf.extend.base.b.a aVar = a.this.a.get(str);
                InterfaceC0048a interfaceC0048a2 = (InterfaceC0048a) weakReference.get();
                if (interfaceC0048a2 != null) {
                    interfaceC0048a2.a(jSONObject, 0, aVar);
                }
                a.this.a(sVar);
                if (bVar == b.Refresh && aVar == null && interfaceC0048a2 != null && a.this.b() != null) {
                    interfaceC0048a2.a(jSONObject, a.this.b());
                }
            }
        });
        jVar.a(false);
        jVar.a((p) new d(30000, 1, 1.0f));
        this.c.a((l) jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final com.tsf.extend.base.b.a aVar) {
        z.a(2, new Runnable() { // from class: com.tsf.extend.base.d.a.5
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.base.b.a.a.a().a(str, aVar);
            }
        });
    }

    public void a(String str, InterfaceC0048a<Pair<String, Bitmap>> interfaceC0048a) {
        a(str, interfaceC0048a, l.a.LOW, 0, 0);
    }

    public void a(final String str, InterfaceC0048a<Pair<String, Bitmap>> interfaceC0048a, l.a aVar, int i, int i2) {
        Bitmap bitmap;
        SoftReference<Bitmap> softReferenceA = b == null ? null : b.a(str);
        if (softReferenceA != null && (bitmap = softReferenceA.get()) != null) {
            if (interfaceC0048a != null) {
                interfaceC0048a.a(null, Pair.create(str, bitmap));
            }
        } else {
            final WeakReference weakReference = new WeakReference(interfaceC0048a);
            com.tsf.extend.base.f.a aVar2 = new com.tsf.extend.base.f.a(str, new n.b<Bitmap>() { // from class: com.tsf.extend.base.d.a.6
                @Override // com.android.volley.n.b
                public void a(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        if (a.b != null) {
                            a.b.a(str, new SoftReference(bitmap2));
                        }
                        InterfaceC0048a interfaceC0048a2 = (InterfaceC0048a) weakReference.get();
                        if (interfaceC0048a2 != null) {
                            interfaceC0048a2.a(null, Pair.create(str, bitmap2));
                        }
                    }
                }
            }, i, i2, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.base.d.a.7
                @Override // com.android.volley.n.a
                public void a(s sVar) {
                    InterfaceC0048a interfaceC0048a2 = (InterfaceC0048a) weakReference.get();
                    if (interfaceC0048a2 != null) {
                        interfaceC0048a2.a(null, 0, Pair.create(str, null));
                    }
                }
            });
            aVar2.a(aVar);
            aVar2.a(a());
            this.c.a((l) aVar2);
        }
    }

    public void c() {
        if (this.c != null) {
            this.c.a(a());
        }
    }

    public static boolean a(File file, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean zCompress = false;
        if (bitmap != null && !bitmap.isRecycled() && file != null) {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
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
                } catch (IllegalStateException e4) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                        }
                    }
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
        return zCompress;
    }

    public void a(String str, Bitmap bitmap) {
        if (bitmap != null && str != null && b != null) {
            b.a(str, new SoftReference<>(bitmap));
        }
    }

    public Bitmap a(String str) {
        SoftReference<Bitmap> softReferenceA = b == null ? null : b.a(str);
        if (softReferenceA != null) {
            return softReferenceA.get();
        }
        return null;
    }

    public HashMap<String, com.tsf.extend.base.b.a> d() {
        return this.a;
    }

    public void a(l lVar) {
        this.c.a(lVar);
    }

    public m e() {
        return this.c;
    }

    public void f() {
        if (b != null) {
            b.a();
            b = null;
        }
        this.a.clear();
        c();
    }

    public void b(String str, InterfaceC0048a<JSONObject> interfaceC0048a) {
        j jVarA = com.tsf.extend.base.f.b.a(str, null, interfaceC0048a, new b.a<JSONObject>() { // from class: com.tsf.extend.base.d.a.8
            @Override // com.tsf.extend.base.f.b.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public JSONObject b(JSONObject jSONObject) {
                return jSONObject;
            }
        });
        jVarA.a(false);
        jVarA.a((p) new d(30000, 1, 1.0f));
        a(jVarA);
    }
}
