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
import com.tsf.extend.f;
import com.tsf.extend.theme.core.ThemeManagerService;
import com.tsf.extend.wallpaper.ab;
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
/* loaded from: classes.dex */
public class ah {
    public static boolean a = false;
    public static String b = "com.theme.test3D";
    private static ah f = new ah();
    private String H;
    private boolean K;
    private Bitmap L;
    private Bitmap M;
    private boolean N;
    private boolean P;
    private Bitmap Q;
    private List<Bitmap> R;
    private boolean S;
    private Bitmap T;
    private Rect U;
    private boolean V;
    private Bitmap W;
    private boolean X;
    private Bitmap[] Y;
    private boolean aa;
    private boolean ab;
    private float[] ac;
    private Bitmap c;
    private l e;
    private Context g;
    private String h;
    private String i;
    private SparseArray<Object> k;
    private String l;
    private String m;
    private boolean o;
    private String z;
    private boolean d = false;
    private Map<String, SparseArray<Object>> j = Collections.synchronizedMap(new LinkedHashMap());
    private boolean n = false;
    private b p = b.Normal;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private long A = 0;
    private Object B = new Object();
    private int C = 0;
    private HashMap<Integer, Boolean> D = null;
    private List<String> E = new ArrayList();
    private List<Integer> F = new ArrayList();
    private int G = -1;
    private boolean I = false;
    private int J = -1;
    private float O = 1.0f;
    private boolean Z = true;
    private HashMap<String, Integer> y = new HashMap<>();

    /* loaded from: classes.dex */
    public enum b {
        Normal,
        IconComb,
        IconCombV2
    }

    /* loaded from: classes.dex */
    public enum a {
        IconComb("2.0"),
        IconCombV2("4.0");
        
        private String c;

        a(String str) {
            this.c = str;
        }

        public String a() {
            return this.c;
        }
    }

    private ah() {
    }

    public static ah a() {
        return f;
    }

    public String b() {
        return this.h;
    }

    public String c() {
        return this.i;
    }

    public SparseArray<Object> d() {
        return this.k;
    }

    public Object a(int i) {
        if (this.k != null) {
            return this.k.get(i);
        }
        return null;
    }

    public SparseArray<HashMap<String, aa>> e() {
        Object a2 = a(1);
        if (a2 instanceof SparseArray) {
            try {
                return (SparseArray) a2;
            } catch (Exception e) {
            }
        }
        return null;
    }

    private void a(String str, SparseArray<Object> sparseArray) {
        if (this.j.containsKey(str)) {
            this.j.remove(str);
        }
        this.j.put(str, sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, boolean z) {
        try {
            Context createPackageContext = com.tsf.extend.h.b().createPackageContext(str, 3);
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
            l lVar = null;
            if (z2) {
                lVar = new l(createPackageContext);
            }
            if (!z3) {
                str3 = str2;
            }
            if (!z3) {
                str4 = null;
            }
            SparseArray<Object> a2 = a(createPackageContext, z3, str3, lVar, str4);
            if (a2 != null && a2.size() > 0) {
                a(str, a2);
                if (!z3) {
                    a((String) a2.get(3, null), str, createPackageContext, a2, z2, str2, z, z, lVar);
                } else if (z) {
                    com.tsf.extend.base.h.a.a().b(str);
                    com.tsf.extend.base.h.a.a().a(str);
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            com.tsf.extend.base.h.a.a().b(str);
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public void a(String str, String str2, Context context, SparseArray<Object> sparseArray, boolean z, String str3, boolean z2, boolean z3, l lVar) {
        String str4 = this.h;
        this.H = str2;
        this.g = context;
        this.h = str2;
        this.i = str;
        this.k = sparseArray;
        this.l = str3;
        this.o = z;
        if (a(a.IconCombV2, this.l)) {
            this.p = b.IconCombV2;
        } else if (a(a.IconComb, this.l)) {
            this.p = b.IconComb;
        } else {
            this.p = b.Normal;
        }
        if (this.e != null) {
            this.e = null;
            com.tsf.extend.base.h.a.a().b(false);
        }
        if (this.o && lVar != null) {
            this.e = lVar;
            this.e.a(sparseArray);
            com.tsf.extend.base.h.a.a().b(true);
            if (!z3 || "cm.technology.next.live.wallpaper".equals(str2)) {
            }
            return;
        }
        com.tsf.extend.base.h.a.a().b(false);
    }

    public boolean f() {
        return ((!n() && this.g == null) || this.h == null || this.k == null) ? false : true;
    }

    public Bitmap a(Object obj) {
        return a(obj, 480);
    }

    public Bitmap a(Object obj, int i) {
        return null;
    }

    private void a(final Context context, final ThemeManagerService.a aVar, final int i, final String str, final String str2, final boolean z, final String str3) {
        this.q = true;
        com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.theme.ah.1
            @Override // java.lang.Runnable
            public void run() {
                boolean b2;
                if (new File(str).getName().startsWith("DIY_")) {
                    b2 = ah.this.a(str2, str, z, true);
                } else {
                    b2 = ah.this.b(str2, str, z, true);
                }
                if (!b2) {
                    ah.this.b(context, aVar, i, str3);
                    return;
                }
                if (aVar != null) {
                    com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.ah.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.b();
                        }
                    });
                }
                ah.this.q = false;
            }
        });
    }

    public boolean a(String str, String str2, boolean z, boolean z2) {
        return true;
    }

    public boolean b(String str, String str2, boolean z, boolean z2) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final android.content.Context r12, final com.tsf.extend.theme.core.ThemeManagerService.a r13, final int r14, final java.lang.String r15) {
        /*
            r11 = this;
            r0 = 1
            r11.q = r0
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
            com.tsf.extend.base.j.z.a(r0, r1)
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
            r0.a(r1, r2, r3, r4, r5, r6, r7)
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
            com.tsf.extend.base.j.z.a(r0, r3)
            goto L37
        L62:
            r3 = move-exception
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.ah.a(android.content.Context, com.tsf.extend.theme.core.ThemeManagerService$a, int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File g(String str) {
        return null;
    }

    public SparseArray<Object> a(Context context, boolean z, String str, l lVar, String str2) {
        return null;
    }

    private InputStream b(Object obj) {
        return null;
    }

    public void a(Context context, boolean z, boolean z2) {
        String b2 = b();
        if (TextUtils.isEmpty(b2) || "SYSTEM".equals(b2)) {
            com.tsf.extend.wallpaper.ab.a((ab.a) null, false, com.tsf.extend.wallpaper.ab.a()).run();
            return;
        }
        StringBuilder sb = new StringBuilder("pkg:");
        sb.append(b2);
        SparseArray<Object> d = d();
        if (d != null && context != null) {
            Object obj = d.get(2);
            if (obj instanceof HashMap) {
                Object obj2 = ((HashMap) obj).get("wallpaper");
                String a2 = new com.tsf.extend.theme.c.h().a(context, b2);
                FileInputStream fileInputStream = null;
                if (a2 != null) {
                    try {
                        fileInputStream = new FileInputStream(a2);
                    } catch (FileNotFoundException e) {
                        fileInputStream = null;
                    }
                }
                FileInputStream b3 = fileInputStream == null ? b(obj2) : fileInputStream;
                if (b3 != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    boolean z3 = false;
                    boolean startsWith = b2.startsWith("DIY://");
                    int i = context.getResources().getDisplayMetrics().widthPixels;
                    boolean g = g();
                    if (Build.VERSION.SDK_INT >= 19 || com.tsf.extend.base.j.v.b() || g) {
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(b3, null, options);
                            if (decodeStream != null) {
                                z3 = com.tsf.extend.wallpaper.aj.b(context, decodeStream, g || (startsWith && decodeStream.getWidth() < i * 2), z2, true);
                            }
                        } catch (OutOfMemoryError e2) {
                        }
                    }
                    if (!z3) {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(b3, null, options);
                        int i2 = options.outWidth;
                        try {
                            b3.close();
                        } catch (IOException e3) {
                        }
                        InputStream b4 = b(obj2);
                        if (b4 != null) {
                            boolean z4 = g || (startsWith && i2 < i * 2);
                            try {
                                sb.append(" screenWidth :").append(i).append(" singleScreen :").append(z4);
                                com.tsf.extend.wallpaper.aj.a(context, z4, b4, i2, options.outHeight, z2, true);
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
    public void b(Context context, final ThemeManagerService.a aVar, int i, String str) {
        JSONException e;
        boolean z;
        JSONObject jSONObject;
        r();
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
                    a(context, false, z);
                }
            } else {
                z = false;
            }
            a(context, false, z);
        } else if (aVar != null) {
            com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.ah.4
                @Override // java.lang.Runnable
                public void run() {
                    aVar.b();
                }
            });
        }
    }

    public void a(String str) {
        this.z = str;
        com.tsf.extend.base.h.a.a().c(str);
    }

    public void b(String str) {
        com.tsf.extend.base.h.a.a().d(str);
    }

    public boolean g() {
        if (a().f()) {
            if (!this.w) {
                this.w = true;
                Object a2 = a().a(2);
                if (a2 instanceof HashMap) {
                    ((HashMap) a2).get("single_wallpaper");
                }
            }
            return this.v;
        }
        return false;
    }

    public Bitmap h() {
        if (a().f()) {
            if (!this.K) {
                this.K = true;
                Object a2 = a(2);
                if (a2 instanceof HashMap) {
                    Bitmap a3 = a().a(((HashMap) a2).get("folder"));
                    if (a3 != null) {
                        this.L = a3;
                    }
                }
            }
            return this.L;
        }
        return null;
    }

    public Bitmap i() {
        if (a().f()) {
            if (!this.P) {
                this.P = true;
                Object a2 = a(2);
                if (a2 instanceof HashMap) {
                    HashMap hashMap = (HashMap) a2;
                    Object obj = hashMap.get("iconbg_list");
                    if (obj instanceof List) {
                        this.R = Lists.newArrayList();
                        for (aa aaVar : (List) obj) {
                            Bitmap a3 = a().a(aaVar);
                            if (a3 != null) {
                                this.R.add(a3);
                            }
                        }
                    } else if (obj == null) {
                        Bitmap a4 = a().a(hashMap.get("iconbg"));
                        if (a4 != null) {
                            this.Q = a4;
                        }
                    }
                }
            }
            if (this.R != null && this.R.size() > 0) {
                return this.R.get(new Random().nextInt(this.R.size()));
            }
            return this.Q;
        }
        return null;
    }

    public Bitmap j() {
        if (a().f()) {
            q();
            return this.T;
        }
        return null;
    }

    private void q() {
        if (!this.S) {
            this.S = true;
            Object a2 = a(2);
            if (a2 instanceof HashMap) {
                Bitmap a3 = a().a(((HashMap) a2).get("iconmask"));
                if (a3 != null) {
                    this.T = a3;
                }
            }
        }
    }

    public Bitmap k() {
        if (a().f()) {
            if (!this.V) {
                this.V = true;
                Object a2 = a(2);
                if (a2 instanceof HashMap) {
                    Bitmap a3 = a().a(((HashMap) a2).get("iconhighlight"));
                    if (a3 != null) {
                        this.W = a3;
                    }
                }
            }
            return this.W;
        }
        return null;
    }

    private void r() {
        this.K = false;
        this.L = null;
        this.P = false;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = null;
        this.U = null;
        this.X = false;
        this.Y = null;
        this.ab = false;
        this.ac = null;
        this.V = false;
        this.W = null;
        this.N = false;
        this.O = 1.0f;
        this.aa = false;
        this.Z = true;
        this.t = false;
        this.s = false;
        this.w = false;
        this.v = false;
        this.M = null;
        this.u = false;
        this.J = -1;
        this.d = false;
        this.c = null;
    }

    public static boolean c(String str) {
        String[] split;
        return !TextUtils.isEmpty(str) && (split = str.split("_")) != null && split.length >= 2 && Integer.valueOf(Integer.parseInt(split[0])).intValue() <= 8;
    }

    public static boolean d(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("_")) == null || split.length < 2) {
            return false;
        }
        return Integer.valueOf(Integer.parseInt(split[0])).intValue() <= 1;
    }

    public static boolean a(a aVar, String str) {
        return a(str, aVar.a());
    }

    public static boolean a(String str, String str2) {
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

    public boolean l() {
        return "SYSTEM".equals(com.tsf.extend.base.h.a.a().e());
    }

    public boolean m() {
        return !TextUtils.isEmpty(com.tsf.extend.base.h.a.a().e());
    }

    public boolean n() {
        return !TextUtils.isEmpty(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        if (file != null && file.exists()) {
            com.tsf.extend.theme.diy.e.a(file);
        }
    }

    public void a(String str, int i, boolean z) {
        int i2;
        Integer remove = this.y.remove(str);
        if (remove != null) {
            int intValue = remove.intValue();
            if (z) {
                i2 = intValue | i;
            } else {
                i2 = intValue & (i ^ (-1));
            }
            this.y.put(str, new Integer(i2));
        }
    }

    public void a(String str, int i) {
        this.y.put(str, new Integer(i));
    }

    public void o() {
        this.y.clear();
    }

    public long p() {
        return this.A > 0 ? this.A : com.tsf.extend.base.h.a.a().g();
    }

    public int a(int i, String str) {
        if (h(str)) {
            return 3;
        }
        if (e(str)) {
            return 4;
        }
        if (f(str)) {
            return 5;
        }
        return i;
    }

    private boolean h(String str) {
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

    public boolean e(String str) {
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

    public boolean f(String str) {
        if (str != null) {
            try {
                String optString = new JSONObject(str).optString("PACKAGE_NAME", null);
                Log.d("test:livewallpaper", "1:" + optString);
                if (optString != null) {
                    return ai.a().b(optString);
                }
                return false;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public static void a(final Context context) {
        com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.ah.5
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(context, f.g.theme_changing_succ, 0).show();
            }
        }, 2000L);
    }
}
