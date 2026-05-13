package com.tsf.extend.theme;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p078h.C1413a;
import com.tsf.extend.base.p080j.C1419aa;
import com.tsf.extend.base.p080j.C1450v;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.core.ThemeManagerService;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.theme.p084c.C1730h;
import com.tsf.extend.wallpaper.C2035ab;
import com.tsf.extend.wallpaper.C2058aj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.ah */
/* loaded from: classes.dex */
public class C1673ah {

    /* renamed from: a */
    public static boolean f5346a = false;

    /* renamed from: b */
    public static String f5347b = "com.theme.test3D";

    /* renamed from: f */
    private static C1673ah f5348f = new C1673ah();

    /* renamed from: H */
    private String f5356H;

    /* renamed from: K */
    private boolean f5359K;

    /* renamed from: L */
    private Bitmap f5360L;

    /* renamed from: M */
    private Bitmap f5361M;

    /* renamed from: N */
    private boolean f5362N;

    /* renamed from: P */
    private boolean f5364P;

    /* renamed from: Q */
    private Bitmap f5365Q;

    /* renamed from: R */
    private List<Bitmap> f5366R;

    /* renamed from: S */
    private boolean f5367S;

    /* renamed from: T */
    private Bitmap f5368T;

    /* renamed from: U */
    private Rect f5369U;

    /* renamed from: V */
    private boolean f5370V;

    /* renamed from: W */
    private Bitmap f5371W;

    /* renamed from: X */
    private boolean f5372X;

    /* renamed from: Y */
    private Bitmap[] f5373Y;

    /* renamed from: aa */
    private boolean f5375aa;

    /* renamed from: ab */
    private boolean f5376ab;

    /* renamed from: ac */
    private float[] f5377ac;

    /* renamed from: c */
    private Bitmap f5378c;

    /* renamed from: e */
    private C1849l f5380e;

    /* renamed from: g */
    private Context f5381g;

    /* renamed from: h */
    private String f5382h;

    /* renamed from: i */
    private String f5383i;

    /* renamed from: k */
    private SparseArray<Object> f5385k;

    /* renamed from: l */
    private String f5386l;

    /* renamed from: m */
    private String f5387m;

    /* renamed from: o */
    private boolean f5389o;

    /* renamed from: z */
    private String f5400z;

    /* renamed from: d */
    private boolean f5379d = false;

    /* renamed from: j */
    private Map<String, SparseArray<Object>> f5384j = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: n */
    private boolean f5388n = false;

    /* renamed from: p */
    private EnumC1684b f5390p = EnumC1684b.Normal;

    /* renamed from: q */
    private boolean f5391q = false;

    /* renamed from: r */
    private boolean f5392r = false;

    /* renamed from: s */
    private boolean f5393s = false;

    /* renamed from: t */
    private boolean f5394t = false;

    /* renamed from: u */
    private boolean f5395u = false;

    /* renamed from: v */
    private boolean f5396v = false;

    /* renamed from: w */
    private boolean f5397w = false;

    /* renamed from: x */
    private boolean f5398x = false;

    /* renamed from: A */
    private long f5349A = 0;

    /* renamed from: B */
    private Object f5350B = new Object();

    /* renamed from: C */
    private int f5351C = 0;

    /* renamed from: D */
    private HashMap<Integer, Boolean> f5352D = null;

    /* renamed from: E */
    private List<String> f5353E = new ArrayList();

    /* renamed from: F */
    private List<Integer> f5354F = new ArrayList();

    /* renamed from: G */
    private int f5355G = -1;

    /* renamed from: I */
    private boolean f5357I = false;

    /* renamed from: J */
    private int f5358J = -1;

    /* renamed from: O */
    private float f5363O = 1.0f;

    /* renamed from: Z */
    private boolean f5374Z = true;

    /* renamed from: y */
    private HashMap<String, Integer> f5399y = new HashMap<>();

    /* renamed from: com.tsf.extend.theme.ah$b */
    /* loaded from: classes.dex */
    public enum EnumC1684b {
        Normal,
        IconComb,
        IconCombV2
    }

    /* renamed from: com.tsf.extend.theme.ah$a */
    /* loaded from: classes.dex */
    public enum EnumC1683a {
        IconComb("2.0"),
        IconCombV2("4.0");
        

        /* renamed from: c */
        private String f5428c;

        EnumC1683a(String str) {
            this.f5428c = str;
        }

        /* renamed from: a */
        public String m7810a() {
            return this.f5428c;
        }
    }

    private C1673ah() {
    }

    /* renamed from: a */
    public static C1673ah m7864a() {
        return f5348f;
    }

    /* renamed from: b */
    public String m7839b() {
        return this.f5382h;
    }

    /* renamed from: c */
    public String m7833c() {
        return this.f5383i;
    }

    /* renamed from: d */
    public SparseArray<Object> m7830d() {
        return this.f5385k;
    }

    /* renamed from: a */
    public Object m7863a(int i) {
        if (this.f5385k != null) {
            return this.f5385k.get(i);
        }
        return null;
    }

    /* renamed from: e */
    public SparseArray<HashMap<String, C1652aa>> m7828e() {
        Object m7863a = m7863a(1);
        if (m7863a instanceof SparseArray) {
            try {
                return (SparseArray) m7863a;
            } catch (Exception e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m7844a(String str, SparseArray<Object> sparseArray) {
        if (this.f5384j.containsKey(str)) {
            this.f5384j.remove(str);
        }
        this.f5384j.put(str, sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7840a(String str, boolean z) {
        try {
            Context createPackageContext = C1547h.m8290b().createPackageContext(str, 3);
            String str2 = null;
            ApplicationInfo applicationInfo = createPackageContext.getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            boolean z2 = false;
            boolean z3 = false;
            String str3 = null;
            String str4 = null;
            if (applicationInfo != null && applicationInfo.metaData != null) {
                z3 = applicationInfo.metaData.getBoolean("CMLAUNCHER_WIDGETSKIN", false);
                if (z3) {
                    str3 = applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_VERSION");
                    str4 = str;
                } else {
                    str2 = applicationInfo.metaData.getString("CMLAUNCHER_THEME_VERSION");
                    z2 = applicationInfo.metaData.getBoolean("CMLAUNCHER_THEME_SUPPORT_3D", false);
                }
            }
            C1849l c1849l = null;
            if (z2) {
                c1849l = new C1849l(createPackageContext);
            }
            if (!z3) {
                str3 = str2;
            }
            if (!z3) {
                str4 = null;
            }
            SparseArray<Object> m7858a = m7858a(createPackageContext, z3, str3, c1849l, str4);
            if (m7858a != null && m7858a.size() > 0) {
                m7844a(str, m7858a);
                if (!z3) {
                    m7842a((String) m7858a.get(3, null), str, createPackageContext, m7858a, z2, str2, z, z, c1849l);
                } else if (z) {
                    C1413a.m8754a().m8748b(str);
                    C1413a.m8754a().m8752a(str);
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            C1413a.m8754a().m8748b(str);
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    public void m7842a(String str, String str2, Context context, SparseArray<Object> sparseArray, boolean z, String str3, boolean z2, boolean z3, C1849l c1849l) {
        String str4 = this.f5382h;
        this.f5356H = str2;
        this.f5381g = context;
        this.f5382h = str2;
        this.f5383i = str;
        this.f5385k = sparseArray;
        this.f5386l = str3;
        this.f5389o = z;
        if (m7856a(EnumC1683a.IconCombV2, this.f5386l)) {
            this.f5390p = EnumC1684b.IconCombV2;
        } else if (m7856a(EnumC1683a.IconComb, this.f5386l)) {
            this.f5390p = EnumC1684b.IconComb;
        } else {
            this.f5390p = EnumC1684b.Normal;
        }
        if (this.f5380e != null) {
            this.f5380e = null;
            C1413a.m8754a().m8747b(false);
        }
        if (this.f5389o && c1849l != null) {
            this.f5380e = c1849l;
            this.f5380e.m7267a(sparseArray);
            C1413a.m8754a().m8747b(true);
            if (!z3 || "cm.technology.next.live.wallpaper".equals(str2)) {
            }
            return;
        }
        C1413a.m8754a().m8747b(false);
    }

    /* renamed from: f */
    public boolean m7826f() {
        return ((!m7815n() && this.f5381g == null) || this.f5382h == null || this.f5385k == null) ? false : true;
    }

    /* renamed from: a */
    public Bitmap m7849a(Object obj) {
        return m7848a(obj, 480);
    }

    /* renamed from: a */
    public Bitmap m7848a(Object obj, int i) {
        return null;
    }

    /* renamed from: a */
    private void m7859a(final Context context, final ThemeManagerService.InterfaceC1760a interfaceC1760a, final int i, final String str, final String str2, final boolean z, final String str3) {
        this.f5391q = true;
        C1455z.m8564a(6, new Runnable() { // from class: com.tsf.extend.theme.ah.1
            @Override // java.lang.Runnable
            public void run() {
                boolean m7834b;
                if (new File(str).getName().startsWith("DIY_")) {
                    m7834b = C1673ah.this.m7841a(str2, str, z, true);
                } else {
                    m7834b = C1673ah.this.m7834b(str2, str, z, true);
                }
                if (!m7834b) {
                    C1673ah.this.m7838b(context, interfaceC1760a, i, str3);
                    return;
                }
                if (interfaceC1760a != null) {
                    C1419aa.m8707a(new Runnable() { // from class: com.tsf.extend.theme.ah.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC1760a.mo7558b();
                        }
                    });
                }
                C1673ah.this.f5391q = false;
            }
        });
    }

    /* renamed from: a */
    public boolean m7841a(String str, String str2, boolean z, boolean z2) {
        return true;
    }

    /* renamed from: b */
    public boolean m7834b(String str, String str2, boolean z, boolean z2) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7860a(final android.content.Context r12, final com.tsf.extend.theme.core.ThemeManagerService.InterfaceC1760a r13, final int r14, final java.lang.String r15) {
        /*
            r11 = this;
            r0 = 1
            r11.f5391q = r0
            r1 = 0
            r10 = 0
            r0 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L38
            r3.<init>(r15)     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = "PACKAGE_NAME"
            r4 = 0
            java.lang.String r2 = r3.optString(r2, r4)     // Catch: java.lang.Exception -> L38
            java.lang.String r4 = "NO_ICON_GROUP"
            r5 = 0
            boolean r1 = r3.optBoolean(r4, r5)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = "IS_3DTHEME"
            r5 = 0
            boolean r0 = r3.optBoolean(r4, r5)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = "SHOW_LOCKER"
            r5 = 0
            boolean r10 = r3.optBoolean(r4, r5)     // Catch: java.lang.Exception -> L62
            r6 = r1
            r5 = r2
        L29:
            r1 = 3
            if (r14 != r1) goto L50
            if (r0 == 0) goto L3d
            r0 = 6
            com.tsf.extend.theme.ah$2 r1 = new com.tsf.extend.theme.ah$2
            r1.<init>()
            com.tsf.extend.base.p080j.C1455z.m8564a(r0, r1)
        L37:
            return
        L38:
            r2 = move-exception
            r2 = r15
        L3a:
            r6 = r1
            r5 = r2
            goto L29
        L3d:
            java.lang.String r0 = "DIY://"
            int r0 = r0.length()
            java.lang.String r4 = r5.substring(r0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r7 = r15
            r0.m7859a(r1, r2, r3, r4, r5, r6, r7)
            goto L37
        L50:
            r0 = 4
            if (r14 == r0) goto L37
            r0 = 6
            com.tsf.extend.theme.ah$3 r3 = new com.tsf.extend.theme.ah$3
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r3.<init>()
            com.tsf.extend.base.p080j.C1455z.m8564a(r0, r3)
            goto L37
        L62:
            r3 = move-exception
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.C1673ah.m7860a(android.content.Context, com.tsf.extend.theme.core.ThemeManagerService$a, int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public File m7823g(String str) {
        return null;
    }

    /* renamed from: a */
    public SparseArray<Object> m7858a(Context context, boolean z, String str, C1849l c1849l, String str2) {
        return null;
    }

    /* renamed from: b */
    private InputStream m7836b(Object obj) {
        return null;
    }

    /* renamed from: a */
    public void m7857a(Context context, boolean z, boolean z2) {
        String m7839b = m7839b();
        if (TextUtils.isEmpty(m7839b) || "SYSTEM".equals(m7839b)) {
            C2035ab.m6660a((C2035ab.InterfaceC2037a) null, false, C2035ab.m6668a()).run();
            return;
        }
        StringBuilder sb = new StringBuilder("pkg:");
        sb.append(m7839b);
        SparseArray<Object> m7830d = m7830d();
        if (m7830d != null && context != null) {
            Object obj = m7830d.get(2);
            if (obj instanceof HashMap) {
                Object obj2 = ((HashMap) obj).get("wallpaper");
                String m7648a = new C1730h().m7648a(context, m7839b);
                FileInputStream fileInputStream = null;
                if (m7648a != null) {
                    try {
                        fileInputStream = new FileInputStream(m7648a);
                    } catch (FileNotFoundException e) {
                        fileInputStream = null;
                    }
                }
                FileInputStream m7836b = fileInputStream == null ? m7836b(obj2) : fileInputStream;
                if (m7836b != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    boolean z3 = false;
                    boolean startsWith = m7839b.startsWith("DIY://");
                    int i = context.getResources().getDisplayMetrics().widthPixels;
                    boolean m7824g = m7824g();
                    if (Build.VERSION.SDK_INT >= 19 || C1450v.m8584b() || m7824g) {
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(m7836b, null, options);
                            if (decodeStream != null) {
                                z3 = C2058aj.m6549b(context, decodeStream, m7824g || (startsWith && decodeStream.getWidth() < i * 2), z2, true);
                            }
                        } catch (OutOfMemoryError e2) {
                        }
                    }
                    if (!z3) {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(m7836b, null, options);
                        int i2 = options.outWidth;
                        try {
                            m7836b.close();
                        } catch (IOException e3) {
                        }
                        InputStream m7836b2 = m7836b(obj2);
                        if (m7836b2 != null) {
                            boolean z4 = m7824g || (startsWith && i2 < i * 2);
                            try {
                                sb.append(" screenWidth :").append(i).append(" singleScreen :").append(z4);
                                C2058aj.m6553a(context, z4, m7836b2, i2, options.outHeight, z2, true);
                                sb.append(" succ w:").append(i2).append(" h:").append(options.outHeight);
                                return;
                            } catch (IOException e4) {
                                sb.append("setWallpaperStreamError:").append(e4.toString());
                                return;
                            }
                        }
                        sb.append("getWallpaperStreamError");
                        return;
                    }
                    return;
                }
                sb.append("getWallpaperStreamOptionError");
                return;
            }
            sb.append("mixConfigsError");
            return;
        }
        sb.append("themeConfigsError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7838b(Context context, final ThemeManagerService.InterfaceC1760a interfaceC1760a, int i, String str) {
        JSONException e;
        boolean z;
        JSONObject jSONObject;
        m7811r();
        if (context != null) {
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                    z = jSONObject.optBoolean("IS_USING_ONLINE_WALLPAPER", false);
                } catch (JSONException e2) {
                    e = e2;
                    z = false;
                }
                try {
                    jSONObject.optBoolean("DONOT_SHOW_LAUNCHER", false);
                    jSONObject.optBoolean("EXIT_AFTER_APPLY_THEME", false);
                    jSONObject.optBoolean("FROM_DIY_THEME", false);
                } catch (JSONException e3) {
                    e = e3;
                    e.printStackTrace();
                    m7857a(context, false, z);
                }
            } else {
                z = false;
            }
            m7857a(context, false, z);
        } else if (interfaceC1760a != null) {
            C1419aa.m8707a(new Runnable() { // from class: com.tsf.extend.theme.ah.4
                @Override // java.lang.Runnable
                public void run() {
                    interfaceC1760a.mo7558b();
                }
            });
        }
    }

    /* renamed from: a */
    public void m7847a(String str) {
        this.f5400z = str;
        C1413a.m8754a().m8744c(str);
    }

    /* renamed from: b */
    public void m7835b(String str) {
        C1413a.m8754a().m8742d(str);
    }

    /* renamed from: g */
    public boolean m7824g() {
        if (m7864a().m7826f()) {
            if (!this.f5397w) {
                this.f5397w = true;
                Object m7863a = m7864a().m7863a(2);
                if (m7863a instanceof HashMap) {
                    ((HashMap) m7863a).get("single_wallpaper");
                }
            }
            return this.f5396v;
        }
        return false;
    }

    /* renamed from: h */
    public Bitmap m7822h() {
        if (m7864a().m7826f()) {
            if (!this.f5359K) {
                this.f5359K = true;
                Object m7863a = m7863a(2);
                if (m7863a instanceof HashMap) {
                    Bitmap m7849a = m7864a().m7849a(((HashMap) m7863a).get("folder"));
                    if (m7849a != null) {
                        this.f5360L = m7849a;
                    }
                }
            }
            return this.f5360L;
        }
        return null;
    }

    /* renamed from: i */
    public Bitmap m7820i() {
        if (m7864a().m7826f()) {
            if (!this.f5364P) {
                this.f5364P = true;
                Object m7863a = m7863a(2);
                if (m7863a instanceof HashMap) {
                    HashMap hashMap = (HashMap) m7863a;
                    Object obj = hashMap.get("iconbg_list");
                    if (obj instanceof List) {
                        this.f5366R = Lists.newArrayList();
                        for (C1652aa c1652aa : (List) obj) {
                            Bitmap m7849a = m7864a().m7849a(c1652aa);
                            if (m7849a != null) {
                                this.f5366R.add(m7849a);
                            }
                        }
                    } else if (obj == null) {
                        Bitmap m7849a2 = m7864a().m7849a(hashMap.get("iconbg"));
                        if (m7849a2 != null) {
                            this.f5365Q = m7849a2;
                        }
                    }
                }
            }
            if (this.f5366R != null && this.f5366R.size() > 0) {
                return this.f5366R.get(new Random().nextInt(this.f5366R.size()));
            }
            return this.f5365Q;
        }
        return null;
    }

    /* renamed from: j */
    public Bitmap m7819j() {
        if (m7864a().m7826f()) {
            m7812q();
            return this.f5368T;
        }
        return null;
    }

    /* renamed from: q */
    private void m7812q() {
        if (!this.f5367S) {
            this.f5367S = true;
            Object m7863a = m7863a(2);
            if (m7863a instanceof HashMap) {
                Bitmap m7849a = m7864a().m7849a(((HashMap) m7863a).get("iconmask"));
                if (m7849a != null) {
                    this.f5368T = m7849a;
                }
            }
        }
    }

    /* renamed from: k */
    public Bitmap m7818k() {
        if (m7864a().m7826f()) {
            if (!this.f5370V) {
                this.f5370V = true;
                Object m7863a = m7863a(2);
                if (m7863a instanceof HashMap) {
                    Bitmap m7849a = m7864a().m7849a(((HashMap) m7863a).get("iconhighlight"));
                    if (m7849a != null) {
                        this.f5371W = m7849a;
                    }
                }
            }
            return this.f5371W;
        }
        return null;
    }

    /* renamed from: r */
    private void m7811r() {
        this.f5359K = false;
        this.f5360L = null;
        this.f5364P = false;
        this.f5365Q = null;
        this.f5366R = null;
        this.f5367S = false;
        this.f5368T = null;
        this.f5369U = null;
        this.f5372X = false;
        this.f5373Y = null;
        this.f5376ab = false;
        this.f5377ac = null;
        this.f5370V = false;
        this.f5371W = null;
        this.f5362N = false;
        this.f5363O = 1.0f;
        this.f5375aa = false;
        this.f5374Z = true;
        this.f5394t = false;
        this.f5393s = false;
        this.f5397w = false;
        this.f5396v = false;
        this.f5361M = null;
        this.f5395u = false;
        this.f5358J = -1;
        this.f5379d = false;
        this.f5378c = null;
    }

    /* renamed from: c */
    public static boolean m7831c(String str) {
        String[] split;
        return !TextUtils.isEmpty(str) && (split = str.split("_")) != null && split.length >= 2 && Integer.valueOf(Integer.parseInt(split[0])).intValue() <= 8;
    }

    /* renamed from: d */
    public static boolean m7829d(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("_")) == null || split.length < 2) {
            return false;
        }
        return Integer.valueOf(Integer.parseInt(split[0])).intValue() <= 1;
    }

    /* renamed from: a */
    public static boolean m7856a(EnumC1683a enumC1683a, String str) {
        return m7843a(str, enumC1683a.m7810a());
    }

    /* renamed from: a */
    public static boolean m7843a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("_");
        String[] split2 = str2.split("\\.");
        if (split == null || split.length < 2 || split2 == null || split2.length < 2) {
            return false;
        }
        try {
            return Integer.valueOf(Integer.parseInt(split[1])).intValue() + (Integer.valueOf(Integer.parseInt(split[0])).intValue() * 100) >= Integer.valueOf(Integer.parseInt(split2[1])).intValue() + (Integer.valueOf(Integer.parseInt(split2[0])).intValue() * 100);
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: l */
    public boolean m7817l() {
        return "SYSTEM".equals(C1413a.m8754a().mo8738e());
    }

    /* renamed from: m */
    public boolean m7816m() {
        return !TextUtils.isEmpty(C1413a.m8754a().mo8738e());
    }

    /* renamed from: n */
    public boolean m7815n() {
        return !TextUtils.isEmpty(this.f5387m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7850a(File file) {
        if (file != null && file.exists()) {
            C1821e.m7396a(file);
        }
    }

    /* renamed from: a */
    public void m7845a(String str, int i, boolean z) {
        int i2;
        Integer remove = this.f5399y.remove(str);
        if (remove != null) {
            int intValue = remove.intValue();
            if (z) {
                i2 = intValue | i;
            } else {
                i2 = intValue & (i ^ (-1));
            }
            this.f5399y.put(str, new Integer(i2));
        }
    }

    /* renamed from: a */
    public void m7846a(String str, int i) {
        this.f5399y.put(str, new Integer(i));
    }

    /* renamed from: o */
    public void m7814o() {
        this.f5399y.clear();
    }

    /* renamed from: p */
    public long m7813p() {
        return this.f5349A > 0 ? this.f5349A : C1413a.m8754a().m8740g();
    }

    /* renamed from: a */
    public int m7862a(int i, String str) {
        if (m7821h(str)) {
            return 3;
        }
        if (m7827e(str)) {
            return 4;
        }
        if (m7825f(str)) {
            return 5;
        }
        return i;
    }

    /* renamed from: h */
    private boolean m7821h(String str) {
        if (str != null) {
            try {
                String optString = new JSONObject(str).optString("PACKAGE_NAME", null);
                if (optString != null) {
                    return optString.startsWith("DIY://");
                }
                return false;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m7827e(String str) {
        if (str != null) {
            try {
                String optString = new JSONObject(str).optString("PACKAGE_NAME", null);
                Log.d("test:livewallpaper", "1:" + optString);
                if (optString != null) {
                    return optString.startsWith("live.wallpaper.");
                }
                return false;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m7825f(String str) {
        if (str != null) {
            try {
                String optString = new JSONObject(str).optString("PACKAGE_NAME", null);
                Log.d("test:livewallpaper", "1:" + optString);
                if (optString != null) {
                    return C1685ai.m7809a().m7804b(optString);
                }
                return false;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m7861a(final Context context) {
        C1419aa.m8706a(new Runnable() { // from class: com.tsf.extend.theme.ah.5
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(context, C1536f.C1543g.theme_changing_succ, 0).show();
            }
        }, 2000L);
    }
}
