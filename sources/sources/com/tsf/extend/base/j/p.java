package com.tsf.extend.base.j;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.os.SystemProperties;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class p {
    private static int a = 480;
    private static int b = 800;
    private static String c = "";
    private static float d = 1.0f;
    private static int e = Integer.MIN_VALUE;

    public static void a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (activity.getResources().getConfiguration().orientation == 2) {
            a = displayMetrics.heightPixels;
            b = displayMetrics.widthPixels;
        } else {
            a = displayMetrics.widthPixels;
            b = displayMetrics.heightPixels;
        }
        d = displayMetrics.density;
    }

    public static float a() {
        return d;
    }

    public static int b() {
        return a;
    }

    public static int c() {
        return b;
    }

    public static int d() {
        return Build.VERSION.SDK_INT;
    }

    public static String e() {
        if (TextUtils.isEmpty(c)) {
            c = String.valueOf(b()) + "x" + String.valueOf(c());
        }
        return c;
    }

    public static String a(Context context) {
        if (d() >= 14) {
            String[] strArr = (String[]) w.a("getVolumePaths", (StorageManager) context.getSystemService("storage"), String[].class, null, null);
            if (strArr == null || strArr.length < 1 || !a(context, strArr[0])) {
                return null;
            }
            return strArr[0];
        }
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String b(Context context) {
        if (d() >= 14) {
            String[] strArr = (String[]) w.a("getVolumePaths", (StorageManager) context.getSystemService("storage"), String[].class, null, null);
            if (strArr == null || strArr.length < 2 || !a(context, strArr[1])) {
                return null;
            }
            return strArr[1];
        }
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (d() >= 14) {
            try {
                return "mounted".equals((String) w.a("getVolumeState", (StorageManager) context.getSystemService("storage"), String.class, new Class[]{String.class}, new Object[]{str}));
            } catch (IllegalArgumentException e2) {
                return false;
            }
        }
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static int b(Activity activity) {
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null) {
            return 0;
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static int c(Context context) {
        if (e != Integer.MIN_VALUE) {
            return e;
        }
        synchronized (p.class) {
            if (e == Integer.MIN_VALUE) {
                e = e(context);
            }
        }
        return e;
    }

    private static int e(Context context) {
        if (f()) {
            return 0;
        }
        return f(context);
    }

    private static int f(Context context) {
        int iIntValue;
        int identifier;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Resources resources = context.getResources();
        int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        int dimensionPixelSize = (identifier2 <= 0 || !resources.getBoolean(identifier2) || (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) ? 0 : resources.getDimensionPixelSize(identifier);
        if (dimensionPixelSize <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int iMax = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            try {
                Method method = defaultDisplay.getClass().getMethod("getRealSize", Point.class);
                Point point = new Point();
                method.invoke(defaultDisplay, point);
                iIntValue = Math.max(point.x, point.y);
            } catch (NoSuchMethodException e2) {
                Method method2 = null;
                try {
                    method2 = defaultDisplay.getClass().getMethod("getRawHeight", new Class[0]);
                } catch (NoSuchMethodException e3) {
                    try {
                        method2 = defaultDisplay.getClass().getMethod("getRealHeight", new Class[0]);
                    } catch (NoSuchMethodException e4) {
                    }
                }
                if (method2 != null) {
                    try {
                        iIntValue = ((Integer) method2.invoke(defaultDisplay, new Object[0])).intValue();
                    } catch (Exception e5) {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
            } catch (Exception e6) {
                iIntValue = 0;
            }
            return iIntValue - iMax;
        }
        return dimensionPixelSize;
    }

    private static boolean f() {
        String str = SystemProperties.get("ro.product.model", "unknown");
        return str.equals("ZTE U950") || str.equals("ZTE U817") || str.equals("ZTE V955") || str.equals("GT-S5301L") || str.equals("LG-E425f") || str.equals("GT-S5303B") || str.equals("I-STYLE2.1") || str.equals("SCH-S738C") || str.equals("S120 LOIN") || str.equals("START 765") || str.equals("LG-E425j") || str.equals("Archos 50 Titanium") || str.equals("ZTE N880G") || str.equals("O+ 8.91") || str.equals("ZP330") || str.equals("Wise+") || str.equals("HUAWEI Y511-U30") || str.equals("Che1-L04") || str.equals("ASUS_T00I") || str.equals("Lenovo A319") || str.equals("Bird 72_wet_a_jb3") || str.equals("Sendtel Wise") || str.equals("cross92_3923") || str.equals("HTC X920e") || str.equals("ONE TOUCH 4033X") || str.equals("GSmart Roma") || str.equals("A74B") || str.equals("Doogee Y100 Pro") || str.equals("M4 SS1050") || str.equals("Ibiza_F2") || str.equals("Lenovo P70-A") || str.equals("Y635-L21") || str.equals("hi6210sft") || str.equals("TurboX6Z") || str.equals("ONE TOUCH 4015A") || str.equals("LENNY2") || str.equals("A66A*") || str.equals("ONE TOUCH 4033X") || str.equals("LENNY2") || str.equals("PGN606") || str.equals("MEU AN400") || str.equals("ONE TOUCH 4015X") || str.equals("4013M") || str.equals("n625ab") || str.equals("Redmi Note 4") || "OPPO".equals(Build.MANUFACTURER) || "Meizu".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r2) {
        /*
            r1 = 0
            if (r2 != 0) goto L4
        L3:
            return r1
        L4:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L1b
            if (r0 == 0) goto L1e
            boolean r0 = r0.isConnected()     // Catch: java.lang.SecurityException -> L1b
            if (r0 == 0) goto L1e
            r0 = 1
        L19:
            r1 = r0
            goto L3
        L1b:
            r0 = move-exception
            r0 = r1
            goto L19
        L1e:
            r0 = r1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.j.p.d(android.content.Context):boolean");
    }
}
