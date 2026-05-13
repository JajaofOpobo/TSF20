package com.tsf.extend.theme.diy;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p002v4.p009d.C0166f;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0798m;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0838j;
import com.google.android.collect.Lists;
import com.google.android.collect.Maps;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.InterfaceC1373b;
import com.tsf.extend.base.p071b.p072a.C1369a;
import com.tsf.extend.base.p076f.C1401a;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1432k;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.AbstractC1700aq;
import com.tsf.extend.theme.C1703b;
import com.tsf.extend.theme.C1840e;
import com.tsf.extend.theme.diy.InterfaceC1803b;
import com.tsf.extend.theme.p083b.C1704a;
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
/* renamed from: com.tsf.extend.theme.diy.c */
/* loaded from: classes.dex */
public class C1806c implements InterfaceC1803b<C1368a> {

    /* renamed from: a */
    private static C1806c f5831a = new C1806c();

    /* renamed from: c */
    private String f5833c;

    /* renamed from: d */
    private String f5834d;

    /* renamed from: e */
    private C1368a f5835e;

    /* renamed from: f */
    private Map<C1704a, InterfaceC1803b.InterfaceC1804a<AbstractC1700aq>> f5836f;

    /* renamed from: g */
    private C0166f<String, SoftReference<Bitmap>> f5837g = new C0166f<String, SoftReference<Bitmap>>(10) { // from class: com.tsf.extend.theme.diy.c.1
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

    /* renamed from: b */
    private C0798m f5832b = C1406c.m8766a(C1547h.m8290b());

    private C1806c() {
        this.f5833c = C1423d.m8685b(C1547h.m8290b());
        this.f5833c = this.f5833c == null ? "null" : this.f5833c;
        this.f5834d = C1423d.m8688b();
        this.f5834d = TextUtils.isEmpty(this.f5834d) ? "null" : this.f5834d;
    }

    /* renamed from: a */
    public static C1806c m7429a() {
        return f5831a;
    }

    /* renamed from: a */
    public void m7425a(InterfaceC1803b.InterfaceC1804a<C1368a> interfaceC1804a, InterfaceC1803b.EnumC1805b enumC1805b) {
        switch (enumC1805b) {
            case LoadCache:
                m7417b(interfaceC1804a, enumC1805b);
                return;
            case Refresh:
                Object[] objArr = new Object[4];
                objArr[0] = "4.0";
                objArr[1] = this.f5833c;
                objArr[2] = this.f5834d;
                objArr[3] = Integer.valueOf(PersonalizationActivity.f6215e ? 2 : 1);
                m7420a(String.format("https://cml.ksmobile.com/diy/index?version=%s&mcc=%s?aid=%s&icon=%s", objArr), interfaceC1804a, enumC1805b);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m7417b(final InterfaceC1803b.InterfaceC1804a<C1368a> interfaceC1804a, final InterfaceC1803b.EnumC1805b enumC1805b) {
        if (this.f5835e != null) {
            if (interfaceC1804a != null) {
                interfaceC1804a.mo7430a(this.f5835e);
            }
            if (this.f5835e.mo6376d()) {
                Object[] objArr = new Object[4];
                objArr[0] = "4.0";
                objArr[1] = this.f5833c;
                objArr[2] = this.f5834d;
                objArr[3] = Integer.valueOf(PersonalizationActivity.f6215e ? 2 : 1);
                m7420a(String.format("https://cml.ksmobile.com/diy/index?version=%s&mcc=%s?aid=%s&icon=%s", objArr), interfaceC1804a, enumC1805b);
                return;
            }
            return;
        }
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.diy.c.4
            @Override // java.lang.Runnable
            public void run() {
                Object m8853a = C1369a.m8855a().m8853a("theme_diy");
                if (m8853a instanceof C1368a) {
                    C1806c.this.f5835e = (C1368a) m8853a;
                }
                if (C1806c.this.f5835e != null && interfaceC1804a != null) {
                    interfaceC1804a.mo7430a(C1806c.this.f5835e);
                }
                if (C1806c.this.f5835e == null || C1806c.this.f5835e.mo6376d()) {
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = "4.0";
                    objArr2[1] = C1806c.this.f5833c;
                    objArr2[2] = C1806c.this.f5834d;
                    objArr2[3] = Integer.valueOf(PersonalizationActivity.f6215e ? 2 : 1);
                    C1806c.this.m7420a(String.format("https://cml.ksmobile.com/diy/index?version=%s&mcc=%s?aid=%s&icon=%s", objArr2), interfaceC1804a, enumC1805b);
                }
            }
        });
    }

    /* renamed from: a */
    public void m7420a(String str, InterfaceC1803b.InterfaceC1804a<C1368a> interfaceC1804a, final InterfaceC1803b.EnumC1805b enumC1805b) {
        final WeakReference weakReference = new WeakReference(interfaceC1804a);
        C0838j c0838j = new C0838j(str, null, new C0802n.InterfaceC0804b<JSONObject>() { // from class: com.tsf.extend.theme.diy.c.5
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(JSONObject jSONObject) {
                try {
                    C1368a m7419a = C1806c.this.m7419a(jSONObject);
                    if (m7419a == null || m7419a.m8875a().size() == 0) {
                        InterfaceC1803b.InterfaceC1804a interfaceC1804a2 = (InterfaceC1803b.InterfaceC1804a) weakReference.get();
                        if (interfaceC1804a2 != null) {
                            interfaceC1804a2.mo7431a(2, null);
                            return;
                        }
                        return;
                    }
                    if (enumC1805b != InterfaceC1803b.EnumC1805b.LoadMore) {
                        C1806c.this.f5835e = m7419a;
                        C1806c.this.m7427a(m7419a);
                    } else if (C1806c.this.f5835e != null && C1806c.this.f5835e.m8875a() != null) {
                        C1806c.this.f5835e.m8875a().addAll(m7419a.m8875a());
                        C1806c.this.f5835e.m8869a(m7419a.m8868b());
                        C1806c.this.f5835e.m8871a(m7419a.m8861e());
                        C1806c.this.m7427a(C1806c.this.f5835e);
                    }
                    InterfaceC1803b.InterfaceC1804a interfaceC1804a3 = (InterfaceC1803b.InterfaceC1804a) weakReference.get();
                    if (interfaceC1804a3 != null) {
                        interfaceC1804a3.mo7430a(m7419a);
                    }
                } catch (JSONException e) {
                    InterfaceC1803b.InterfaceC1804a interfaceC1804a4 = (InterfaceC1803b.InterfaceC1804a) weakReference.get();
                    if (interfaceC1804a4 != null) {
                        interfaceC1804a4.mo7431a(2, null);
                    }
                }
            }
        }, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.diy.c.6
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                InterfaceC1803b.InterfaceC1804a interfaceC1804a2 = (InterfaceC1803b.InterfaceC1804a) weakReference.get();
                if (interfaceC1804a2 != null) {
                    interfaceC1804a2.mo7431a(0, C1806c.this.f5835e);
                }
            }
        });
        c0838j.m11032a(false);
        c0838j.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
        this.f5832b.m11010a((AbstractC0795l) c0838j);
    }

    /* renamed from: a */
    protected void m7427a(final C1368a c1368a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.diy.c.7
            @Override // java.lang.Runnable
            public void run() {
                C1369a.m8855a().m8852a("theme_diy", c1368a);
            }
        });
    }

    /* renamed from: a */
    public C1368a m7419a(JSONObject jSONObject) {
        C1368a c1368a = new C1368a();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        String string = jSONObject.getString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        c1368a.m8871a(string);
        c1368a.m8873a(System.currentTimeMillis());
        c1368a.m8869a(z);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                C1704a m7415b = m7415b(jSONArray.getJSONObject(i));
                if (m7415b != null) {
                    newArrayList.add(m7415b);
                }
            } catch (JSONException e) {
            }
        }
        c1368a.m8870a(newArrayList);
        c1368a.m8872a(new C1818a());
        return c1368a;
    }

    /* renamed from: b */
    private C1704a m7415b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("preview");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        C1704a c1704a = new C1704a();
        c1704a.m7745a(jSONObject.getLong("id"));
        c1704a.m7744a(jSONObject.getString("thumbnail"));
        if (jSONObject.optInt("version_flag", -1) >= 4) {
            c1704a.m7742a(true);
        }
        ArrayList newArrayList = Lists.newArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            newArrayList.add(optJSONArray.getString(i));
        }
        c1704a.m7743a(newArrayList);
        ArrayList newArrayList2 = Lists.newArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("HDpreview");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                newArrayList2.add(optJSONArray2.getString(i2));
            }
            c1704a.m7739b(newArrayList2);
        }
        c1704a.m7740b(jSONObject.getString("downloadurl"));
        return c1704a;
    }

    /* renamed from: a */
    public boolean m7426a(final C1704a c1704a, final InterfaceC1803b.InterfaceC1804a<AbstractC1700aq> interfaceC1804a) {
        boolean z;
        if (this.f5836f == null) {
            this.f5836f = Maps.newHashMap();
        }
        if (this.f5836f.size() > 0) {
            return false;
        }
        this.f5836f.put(c1704a, interfaceC1804a);
        Context m8290b = C1547h.m8290b();
        File m7403a = C1821e.m7403a(m8290b, c1704a.m7746a(), c1704a.m7735f());
        if (m7403a != null && m7403a.exists()) {
            AbstractC1700aq c1703b = c1704a.m7735f() ? new C1703b() : new C1802a();
            File m7753g = c1703b.m7753g(m8290b);
            if (m7753g != null) {
                c1703b.m7320a(c1704a.m7746a());
                if (c1704a.m7735f()) {
                    String str = m7753g.getAbsolutePath() + ".zip";
                    try {
                        z = C1821e.m7394a(new FileInputStream(m7403a), str, m7753g.getAbsolutePath());
                        if (z) {
                            try {
                                m7403a.delete();
                            } catch (FileNotFoundException e) {
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        z = false;
                    }
                    new File(str).delete();
                } else {
                    z = C1821e.m7391a(m7403a.getAbsolutePath(), m7753g.getAbsolutePath());
                }
            } else {
                z = false;
            }
            if (z) {
                interfaceC1804a.mo7430a(c1703b);
            } else {
                interfaceC1804a.mo7431a(0, null);
            }
            this.f5836f.remove(c1704a);
        } else {
            C1838f c1838f = new C1838f(c1704a.m7735f(), c1704a.m7737d(), c1704a.m7746a(), new C0802n.InterfaceC0804b<AbstractC1700aq>() { // from class: com.tsf.extend.theme.diy.c.8
                @Override // com.android.volley.C0802n.InterfaceC0804b
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6192a(AbstractC1700aq abstractC1700aq) {
                    if (abstractC1700aq == null) {
                        interfaceC1804a.mo7431a(0, null);
                    } else {
                        abstractC1700aq.m7320a(c1704a.m7746a());
                        interfaceC1804a.mo7430a(abstractC1700aq);
                    }
                    C1806c.this.f5836f.remove(c1704a);
                }
            }, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.diy.c.9
                @Override // com.android.volley.C0802n.InterfaceC0803a
                /* renamed from: a */
                public void mo6194a(C0809s c0809s) {
                    interfaceC1804a.mo7431a(0, null);
                    C1806c.this.f5836f.remove(c1704a);
                }
            });
            c1838f.mo6644a("download_diy");
            this.f5832b.m11010a((AbstractC0795l) c1838f);
        }
        return true;
    }

    /* renamed from: b */
    public void m7418b() {
        if (this.f5836f != null) {
            this.f5836f.clear();
        }
        this.f5837g.m13360a();
        this.f5832b.m11008a("download_diy");
        this.f5835e = null;
    }

    /* renamed from: a */
    public void m7421a(final String str, InterfaceC1803b.InterfaceC1804a<Pair<String, Bitmap>> interfaceC1804a) {
        Bitmap bitmap;
        SoftReference<Bitmap> m13358a = this.f5837g.m13358a((C0166f<String, SoftReference<Bitmap>>) str);
        if (m13358a != null && (bitmap = m13358a.get()) != null) {
            if (interfaceC1804a != null) {
                interfaceC1804a.mo7430a(Pair.create(str, bitmap));
                return;
            }
            return;
        }
        final WeakReference weakReference = new WeakReference(interfaceC1804a);
        this.f5832b.m11010a((AbstractC0795l) new C1401a(str, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.theme.diy.c.10
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(Bitmap bitmap2) {
                if (bitmap2 != null) {
                    C1806c.this.f5837g.m13357a(str, new SoftReference(bitmap2));
                    InterfaceC1803b.InterfaceC1804a interfaceC1804a2 = (InterfaceC1803b.InterfaceC1804a) weakReference.get();
                    if (interfaceC1804a2 != null) {
                        interfaceC1804a2.mo7430a(Pair.create(str, bitmap2));
                    }
                }
            }
        }, 0, 0, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.diy.c.11
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                InterfaceC1803b.InterfaceC1804a interfaceC1804a2 = (InterfaceC1803b.InterfaceC1804a) weakReference.get();
                if (interfaceC1804a2 != null) {
                    interfaceC1804a2.mo7431a(0, Pair.create(str, null));
                }
            }
        }));
    }

    /* renamed from: a */
    public boolean m7428a(final Context context, final AbstractC1700aq abstractC1700aq) {
        boolean z = true;
        if (abstractC1700aq == null || abstractC1700aq.m7764I() == null) {
            return false;
        }
        C1455z.m8564a(1, new Runnable() { // from class: com.tsf.extend.theme.diy.c.2
            @Override // java.lang.Runnable
            public void run() {
                C1840e.m7360a().m7354b(context, abstractC1700aq);
            }
        });
        File file = new File(abstractC1700aq.m7764I());
        if (file.exists() && file.isDirectory()) {
            if (!C1432k.m8647a(file) || !file.delete()) {
                z = false;
            }
            return z;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7422a(String str) {
        return "theme_diy".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.c$a */
    /* loaded from: classes.dex */
    public static class C1818a implements InterfaceC1373b {
        private C1818a() {
        }

        @Override // com.tsf.extend.base.p071b.InterfaceC1373b
        /* renamed from: a */
        public boolean mo6189a(C1368a c1368a) {
            return System.currentTimeMillis() - c1368a.m8865c() > TimeUnit.HOURS.toMillis(4L);
        }
    }
}
