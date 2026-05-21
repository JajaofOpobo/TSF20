package com.tsf.extend.theme.diy;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.l;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.s;
import com.android.volley.toolbox.j;
import com.google.android.collect.Lists;
import com.google.android.collect.Maps;
import com.tsf.extend.base.j.k;
import com.tsf.extend.base.j.z;
import com.tsf.extend.h;
import com.tsf.extend.theme.aq;
import com.tsf.extend.theme.diy.b;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c implements b<com.tsf.extend.base.b.a> {
    private static c a = new c();
    private String c;
    private String d;
    private com.tsf.extend.base.b.a e;
    private Map<com.tsf.extend.theme.b.a, b.a<aq>> f;
    private android.support.v4.d.f<String, SoftReference<Bitmap>> g = new android.support.v4.d.f<String, SoftReference<Bitmap>>(10) { // from class: com.tsf.extend.theme.diy.c.1
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
    private m b = com.tsf.extend.base.f.c.a(h.b());

    private c() {
        this.c = com.tsf.extend.base.j.d.b(h.b());
        this.c = this.c == null ? "null" : this.c;
        this.d = com.tsf.extend.base.j.d.b();
        this.d = TextUtils.isEmpty(this.d) ? "null" : this.d;
    }

    public static c a() {
        return a;
    }

    public void a(b.a<com.tsf.extend.base.b.a> aVar, b.EnumC0061b enumC0061b) {
        switch (enumC0061b) {
            case LoadCache:
                b(aVar, enumC0061b);
                break;
            case Refresh:
                Object[] objArr = new Object[4];
                objArr[0] = "4.0";
                objArr[1] = this.c;
                objArr[2] = this.d;
                objArr[3] = Integer.valueOf(PersonalizationActivity.e ? 2 : 1);
                a(String.format("https://cml.ksmobile.com/diy/index?version=%s&mcc=%s?aid=%s&icon=%s", objArr), aVar, enumC0061b);
                break;
        }
    }

    public void b(final b.a<com.tsf.extend.base.b.a> aVar, final b.EnumC0061b enumC0061b) {
        if (this.e != null) {
            if (aVar != null) {
                aVar.a(this.e);
            }
            if (this.e.d()) {
                Object[] objArr = new Object[4];
                objArr[0] = "4.0";
                objArr[1] = this.c;
                objArr[2] = this.d;
                objArr[3] = Integer.valueOf(PersonalizationActivity.e ? 2 : 1);
                a(String.format("https://cml.ksmobile.com/diy/index?version=%s&mcc=%s?aid=%s&icon=%s", objArr), aVar, enumC0061b);
                return;
            }
            return;
        }
        z.a(2, new Runnable() { // from class: com.tsf.extend.theme.diy.c.4
            @Override // java.lang.Runnable
            public void run() {
                Object objA = com.tsf.extend.base.b.a.a.a().a("theme_diy");
                if (objA instanceof com.tsf.extend.base.b.a) {
                    c.this.e = (com.tsf.extend.base.b.a) objA;
                }
                if (c.this.e != null && aVar != null) {
                    aVar.a(c.this.e);
                }
                if (c.this.e == null || c.this.e.d()) {
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = "4.0";
                    objArr2[1] = c.this.c;
                    objArr2[2] = c.this.d;
                    objArr2[3] = Integer.valueOf(PersonalizationActivity.e ? 2 : 1);
                    c.this.a(String.format("https://cml.ksmobile.com/diy/index?version=%s&mcc=%s?aid=%s&icon=%s", objArr2), aVar, enumC0061b);
                }
            }
        });
    }

    public void a(String str, b.a<com.tsf.extend.base.b.a> aVar, final b.EnumC0061b enumC0061b) {
        final WeakReference weakReference = new WeakReference(aVar);
        j jVar = new j(str, null, new n.b<JSONObject>() { // from class: com.tsf.extend.theme.diy.c.5
            @Override // com.android.volley.n.b
            public void a(JSONObject jSONObject) {
                try {
                    com.tsf.extend.base.b.a aVarA = c.this.a(jSONObject);
                    if (aVarA == null || aVarA.a().size() == 0) {
                        b.a aVar2 = (b.a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.a(2, null);
                            return;
                        }
                        return;
                    }
                    if (enumC0061b != b.EnumC0061b.LoadMore) {
                        c.this.e = aVarA;
                        c.this.a(aVarA);
                    } else if (c.this.e != null && c.this.e.a() != null) {
                        c.this.e.a().addAll(aVarA.a());
                        c.this.e.a(aVarA.b());
                        c.this.e.a(aVarA.e());
                        c.this.a(c.this.e);
                    }
                    b.a aVar3 = (b.a) weakReference.get();
                    if (aVar3 != null) {
                        aVar3.a(aVarA);
                    }
                } catch (JSONException e) {
                    b.a aVar4 = (b.a) weakReference.get();
                    if (aVar4 != null) {
                        aVar4.a(2, null);
                    }
                }
            }
        }, new n.a() { // from class: com.tsf.extend.theme.diy.c.6
            @Override // com.android.volley.n.a
            public void a(s sVar) {
                b.a aVar2 = (b.a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.a(0, c.this.e);
                }
            }
        });
        jVar.a(false);
        jVar.a((p) new com.android.volley.d(30000, 1, 1.0f));
        this.b.a((l) jVar);
    }

    protected void a(final com.tsf.extend.base.b.a aVar) {
        z.a(2, new Runnable() { // from class: com.tsf.extend.theme.diy.c.7
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.base.b.a.a.a().a("theme_diy", aVar);
            }
        });
    }

    public com.tsf.extend.base.b.a a(JSONObject jSONObject) throws JSONException {
        com.tsf.extend.base.b.a aVar = new com.tsf.extend.base.b.a();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        String string = jSONObject.getString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        aVar.a(string);
        aVar.a(System.currentTimeMillis());
        aVar.a(z);
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                com.tsf.extend.theme.b.a aVarB = b(jSONArray.getJSONObject(i));
                if (aVarB != null) {
                    arrayListNewArrayList.add(aVarB);
                }
            } catch (JSONException e) {
            }
        }
        aVar.a(arrayListNewArrayList);
        aVar.a(new a());
        return aVar;
    }

    private com.tsf.extend.theme.b.a b(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("preview");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        com.tsf.extend.theme.b.a aVar = new com.tsf.extend.theme.b.a();
        aVar.a(jSONObject.getLong("id"));
        aVar.a(jSONObject.getString("thumbnail"));
        if (jSONObject.optInt("version_flag", -1) >= 4) {
            aVar.a(true);
        }
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayListNewArrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        aVar.a(arrayListNewArrayList);
        ArrayList arrayListNewArrayList2 = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("HDpreview");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayListNewArrayList2.add(jSONArrayOptJSONArray2.getString(i2));
            }
            aVar.b(arrayListNewArrayList2);
        }
        aVar.b(jSONObject.getString("downloadurl"));
        return aVar;
    }

    public boolean a(final com.tsf.extend.theme.b.a aVar, final b.a<aq> aVar2) {
        boolean zA;
        if (this.f == null) {
            this.f = Maps.newHashMap();
        }
        if (this.f.size() > 0) {
            return false;
        }
        this.f.put(aVar, aVar2);
        Context contextB = h.b();
        File fileA = e.a(contextB, aVar.a(), aVar.f());
        if (fileA != null && fileA.exists()) {
            aq bVar = aVar.f() ? new com.tsf.extend.theme.b() : new com.tsf.extend.theme.diy.a();
            File fileG = bVar.g(contextB);
            if (fileG != null) {
                bVar.a(aVar.a());
                if (aVar.f()) {
                    String str = fileG.getAbsolutePath() + ".zip";
                    try {
                        zA = e.a(new FileInputStream(fileA), str, fileG.getAbsolutePath());
                        if (zA) {
                            try {
                                fileA.delete();
                            } catch (FileNotFoundException e) {
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        zA = false;
                    }
                    new File(str).delete();
                } else {
                    zA = e.a(fileA.getAbsolutePath(), fileG.getAbsolutePath());
                }
            } else {
                zA = false;
            }
            if (zA) {
                aVar2.a(bVar);
            } else {
                aVar2.a(0, null);
            }
            this.f.remove(aVar);
        } else {
            f fVar = new f(aVar.f(), aVar.d(), aVar.a(), new n.b<aq>() { // from class: com.tsf.extend.theme.diy.c.8
                @Override // com.android.volley.n.b
                public void a(aq aqVar) {
                    if (aqVar == null) {
                        aVar2.a(0, null);
                    } else {
                        aqVar.a(aVar.a());
                        aVar2.a(aqVar);
                    }
                    c.this.f.remove(aVar);
                }
            }, new n.a() { // from class: com.tsf.extend.theme.diy.c.9
                @Override // com.android.volley.n.a
                public void a(s sVar) {
                    aVar2.a(0, null);
                    c.this.f.remove(aVar);
                }
            });
            fVar.a("download_diy");
            this.b.a((l) fVar);
        }
        return true;
    }

    public void b() {
        if (this.f != null) {
            this.f.clear();
        }
        this.g.a();
        this.b.a("download_diy");
        this.e = null;
    }

    public void a(final String str, b.a<Pair<String, Bitmap>> aVar) {
        Bitmap bitmap;
        SoftReference<Bitmap> softReferenceA = this.g.a(str);
        if (softReferenceA != null && (bitmap = softReferenceA.get()) != null) {
            if (aVar != null) {
                aVar.a(Pair.create(str, bitmap));
            }
        } else {
            final WeakReference weakReference = new WeakReference(aVar);
            this.b.a((l) new com.tsf.extend.base.f.a(str, new n.b<Bitmap>() { // from class: com.tsf.extend.theme.diy.c.10
                @Override // com.android.volley.n.b
                public void a(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        c.this.g.a(str, new SoftReference(bitmap2));
                        b.a aVar2 = (b.a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.a(Pair.create(str, bitmap2));
                        }
                    }
                }
            }, 0, 0, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.theme.diy.c.11
                @Override // com.android.volley.n.a
                public void a(s sVar) {
                    b.a aVar2 = (b.a) weakReference.get();
                    if (aVar2 != null) {
                        aVar2.a(0, Pair.create(str, null));
                    }
                }
            }));
        }
    }

    public boolean a(final Context context, final aq aqVar) {
        if (aqVar == null || aqVar.I() == null) {
            return false;
        }
        z.a(1, new Runnable() { // from class: com.tsf.extend.theme.diy.c.2
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.theme.e.a().b(context, aqVar);
            }
        });
        File file = new File(aqVar.I());
        if (file.exists() && file.isDirectory()) {
            return k.a(file) && file.delete();
        }
        return false;
    }

    public static boolean a(String str) {
        return "theme_diy".equals(str);
    }

    private static class a implements com.tsf.extend.base.b.b {
        private a() {
        }

        @Override // com.tsf.extend.base.b.b
        public boolean a(com.tsf.extend.base.b.a aVar) {
            return System.currentTimeMillis() - aVar.c() > TimeUnit.HOURS.toMillis(4L);
        }
    }
}
