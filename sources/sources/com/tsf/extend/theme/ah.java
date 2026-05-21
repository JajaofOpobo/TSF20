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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    public enum b {
        Normal,
        IconComb,
        IconCombV2
    }

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
        Object objA = a(1);
        if (objA instanceof SparseArray) {
            try {
                return (SparseArray) objA;
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
            Context contextCreatePackageContext = com.tsf.extend.h.b().createPackageContext(str, 3);
            String string = null;
            ApplicationInfo applicationInfo = contextCreatePackageContext.getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            boolean z2 = false;
            boolean z3 = false;
            String string2 = null;
            String str2 = null;
            if (applicationInfo != null && applicationInfo.metaData != null) {
                z3 = applicationInfo.metaData.getBoolean("CMLAUNCHER_WIDGETSKIN", false);
                if (z3) {
                    string2 = applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_VERSION");
                    str2 = str;
                } else {
                    string = applicationInfo.metaData.getString("CMLAUNCHER_THEME_VERSION");
                    z2 = applicationInfo.metaData.getBoolean("CMLAUNCHER_THEME_SUPPORT_3D", false);
                }
            }
            l lVar = null;
            if (z2) {
                lVar = new l(contextCreatePackageContext);
            }
            if (!z3) {
                string2 = string;
            }
            if (!z3) {
                str2 = null;
            }
            SparseArray<Object> sparseArrayA = a(contextCreatePackageContext, z3, string2, lVar, str2);
            if (sparseArrayA != null && sparseArrayA.size() > 0) {
                a(str, sparseArrayA);
                if (!z3) {
                    a((String) sparseArrayA.get(3, null), str, contextCreatePackageContext, sparseArrayA, z2, string, z, z, lVar);
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
                boolean zB;
                if (new File(str).getName().startsWith("DIY_")) {
                    zB = ah.this.a(str2, str, z, true);
                } else {
                    zB = ah.this.b(str2, str, z, true);
                }
                if (!zB) {
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

    public void a(final Context context, final ThemeManagerService.a aVar, final int i, final String str) {
        String strOptString;
        boolean z;
        final String str2;
        JSONObject jSONObject;
        this.q = true;
        boolean zOptBoolean = false;
        final boolean zOptBoolean2 = false;
        boolean zOptBoolean3 = false;
        try {
            jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("PACKAGE_NAME", null);
        } catch (Exception e) {
            strOptString = str;
        }
        try {
            zOptBoolean = jSONObject.optBoolean("NO_ICON_GROUP", false);
            zOptBoolean3 = jSONObject.optBoolean("IS_3DTHEME", false);
            zOptBoolean2 = jSONObject.optBoolean("SHOW_LOCKER", false);
            z = zOptBoolean;
            str2 = strOptString;
        } catch (Exception e2) {
            z = zOptBoolean;
            str2 = strOptString;
        }
        if (i == 3) {
            if (zOptBoolean3) {
                com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.theme.ah.2
                    @Override // java.lang.Runnable
                    public void run() {
                        String str3 = str2.substring("DIY://".length()) + File.separator + "theme/3dcmt/theme.cmt";
                    }
                });
                return;
            } else {
                a(context, aVar, i, str2.substring("DIY://".length()), str2, z, str);
                return;
            }
        }
        if (i != 4) {
            com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.theme.ah.3
                @Override // java.lang.Runnable
                public void run() {
                    boolean zE;
                    boolean z2 = false;
                    if (ai.a().b(str2)) {
                        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str2));
                        ah.this.q = false;
                        com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.ah.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aVar.a();
                            }
                        });
                        return;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        ah.this.a(null, null, null, null, false, null, true, true, null);
                        ah.this.b(context, aVar, i, str);
                        ah.this.a(ah.this.g(null));
                        return;
                    }
                    if ("SYSTEM".equals(str2)) {
                        ah.this.a(null, str2, null, null, false, null, true, true, null);
                        ah.this.b(context, aVar, i, str);
                        return;
                    }
                    if (!str2.startsWith("recom_")) {
                        v.h();
                        if (v.g(str2)) {
                            v.h();
                            zE = v.h(str2);
                            if (zE) {
                                z2 = true;
                            }
                        } else {
                            v.h();
                            zE = v.e(str2);
                        }
                        if (zE) {
                            boolean zA = ah.this.a(str2, true);
                            if (zA) {
                                ah.this.I = zOptBoolean2;
                                ah.this.b(context, aVar, i, str);
                                if (z2) {
                                    v.h();
                                    String strF = v.f(str2);
                                    if (!TextUtils.isEmpty(strF) && strF.contains("clock3d")) {
                                        ah.this.x = true;
                                    }
                                }
                            }
                            if (!zA && aVar != null) {
                                com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.ah.3.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        aVar.b();
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (aVar != null) {
                            com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.ah.3.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    aVar.c();
                                }
                            });
                        }
                    }
                }
            });
        }
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
        String strB = b();
        if (TextUtils.isEmpty(strB) || "SYSTEM".equals(strB)) {
            com.tsf.extend.wallpaper.ab.a((ab.a) null, false, com.tsf.extend.wallpaper.ab.a()).run();
            return;
        }
        StringBuilder sb = new StringBuilder("pkg:");
        sb.append(strB);
        SparseArray<Object> sparseArrayD = d();
        if (sparseArrayD != null && context != null) {
            Object obj = sparseArrayD.get(2);
            if (obj instanceof HashMap) {
                Object obj2 = ((HashMap) obj).get("wallpaper");
                String strA = new com.tsf.extend.theme.c.h().a(context, strB);
                FileInputStream fileInputStream = null;
                if (strA != null) {
                    try {
                        fileInputStream = new FileInputStream(strA);
                    } catch (FileNotFoundException e) {
                        fileInputStream = null;
                    }
                }
                InputStream inputStreamB = fileInputStream == null ? b(obj2) : fileInputStream;
                if (inputStreamB != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    boolean zB = false;
                    boolean zStartsWith = strB.startsWith("DIY://");
                    int i = context.getResources().getDisplayMetrics().widthPixels;
                    boolean zG = g();
                    if (Build.VERSION.SDK_INT >= 19 || com.tsf.extend.base.j.v.b() || zG) {
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamB, null, options);
                            if (bitmapDecodeStream != null) {
                                zB = com.tsf.extend.wallpaper.aj.b(context, bitmapDecodeStream, zG || (zStartsWith && bitmapDecodeStream.getWidth() < i * 2), z2, true);
                            }
                        } catch (OutOfMemoryError e2) {
                        }
                    }
                    if (!zB) {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamB, null, options);
                        int i2 = options.outWidth;
                        try {
                            inputStreamB.close();
                        } catch (IOException e3) {
                        }
                        InputStream inputStreamB2 = b(obj2);
                        if (inputStreamB2 != null) {
                            boolean z3 = zG || (zStartsWith && i2 < i * 2);
                            try {
                                sb.append(" screenWidth :").append(i).append(" singleScreen :").append(z3);
                                com.tsf.extend.wallpaper.aj.a(context, z3, inputStreamB2, i2, options.outHeight, z2, true);
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
        boolean zOptBoolean;
        JSONObject jSONObject;
        r();
        if (context != null) {
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                    zOptBoolean = jSONObject.optBoolean("IS_USING_ONLINE_WALLPAPER", false);
                } catch (JSONException e2) {
                    e = e2;
                    zOptBoolean = false;
                }
                try {
                    jSONObject.optBoolean("DONOT_SHOW_LAUNCHER", false);
                    jSONObject.optBoolean("EXIT_AFTER_APPLY_THEME", false);
                    jSONObject.optBoolean("FROM_DIY_THEME", false);
                } catch (JSONException e3) {
                    e = e3;
                    e.printStackTrace();
                }
            } else {
                zOptBoolean = false;
            }
            a(context, false, zOptBoolean);
            return;
        }
        if (aVar != null) {
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
        if (!a().f()) {
            return false;
        }
        if (!this.w) {
            this.w = true;
            Object objA = a().a(2);
            if (objA instanceof HashMap) {
                ((HashMap) objA).get("single_wallpaper");
            }
        }
        return this.v;
    }

    public Bitmap h() {
        if (!a().f()) {
            return null;
        }
        if (!this.K) {
            this.K = true;
            Object objA = a(2);
            if (objA instanceof HashMap) {
                Bitmap bitmapA = a().a(((HashMap) objA).get("folder"));
                if (bitmapA != null) {
                    this.L = bitmapA;
                }
            }
        }
        return this.L;
    }

    public Bitmap i() {
        if (a().f()) {
            if (!this.P) {
                this.P = true;
                Object objA = a(2);
                if (objA instanceof HashMap) {
                    HashMap map = (HashMap) objA;
                    Object obj = map.get("iconbg_list");
                    if (obj instanceof List) {
                        this.R = Lists.newArrayList();
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            Bitmap bitmapA = a().a((aa) it.next());
                            if (bitmapA != null) {
                                this.R.add(bitmapA);
                            }
                        }
                    } else if (obj == null) {
                        Bitmap bitmapA2 = a().a(map.get("iconbg"));
                        if (bitmapA2 != null) {
                            this.Q = bitmapA2;
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
        if (!a().f()) {
            return null;
        }
        q();
        return this.T;
    }

    private void q() {
        if (!this.S) {
            this.S = true;
            Object objA = a(2);
            if (objA instanceof HashMap) {
                Bitmap bitmapA = a().a(((HashMap) objA).get("iconmask"));
                if (bitmapA != null) {
                    this.T = bitmapA;
                }
            }
        }
    }

    public Bitmap k() {
        if (!a().f()) {
            return null;
        }
        if (!this.V) {
            this.V = true;
            Object objA = a(2);
            if (objA instanceof HashMap) {
                Bitmap bitmapA = a().a(((HashMap) objA).get("iconhighlight"));
                if (bitmapA != null) {
                    this.W = bitmapA;
                }
            }
        }
        return this.W;
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
        String[] strArrSplit;
        return !TextUtils.isEmpty(str) && (strArrSplit = str.split("_")) != null && strArrSplit.length >= 2 && Integer.valueOf(Integer.parseInt(strArrSplit[0])).intValue() <= 8;
    }

    public static boolean d(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split("_")) == null || strArrSplit.length < 2) {
            return false;
        }
        return Integer.valueOf(Integer.parseInt(strArrSplit[0])).intValue() <= 1;
    }

    public static boolean a(a aVar, String str) {
        return a(str, aVar.a());
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("_");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit == null || strArrSplit.length < 2 || strArrSplit2 == null || strArrSplit2.length < 2) {
            return false;
        }
        try {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[0]));
            return Integer.valueOf(Integer.parseInt(strArrSplit[1])).intValue() + (numValueOf.intValue() * 100) >= Integer.valueOf(Integer.parseInt(strArrSplit2[1])).intValue() + (Integer.valueOf(Integer.parseInt(strArrSplit2[0])).intValue() * 100);
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
        Integer numRemove = this.y.remove(str);
        if (numRemove != null) {
            int iIntValue = numRemove.intValue();
            if (z) {
                i2 = iIntValue | i;
            } else {
                i2 = iIntValue & (i ^ (-1));
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
        if (str == null) {
            return false;
        }
        try {
            String strOptString = new JSONObject(str).optString("PACKAGE_NAME", null);
            if (strOptString != null) {
                return strOptString.startsWith("DIY://");
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean e(String str) {
        if (str == null) {
            return false;
        }
        try {
            String strOptString = new JSONObject(str).optString("PACKAGE_NAME", null);
            Log.d("test:livewallpaper", "1:" + strOptString);
            if (strOptString != null) {
                return strOptString.startsWith("live.wallpaper.");
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean f(String str) {
        if (str == null) {
            return false;
        }
        try {
            String strOptString = new JSONObject(str).optString("PACKAGE_NAME", null);
            Log.d("test:livewallpaper", "1:" + strOptString);
            if (strOptString != null) {
                return ai.a().b(strOptString);
            }
            return false;
        } catch (Exception e) {
            return false;
        }
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
