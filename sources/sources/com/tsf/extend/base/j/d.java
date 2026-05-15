package com.tsf.extend.base.j;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static SoftReference<BitmapDrawable> b;
    private static String c;
    private static String d;
    private static String e;
    private static Object a = new Object();
    private static int f = 0;

    public static String a() {
        return Locale.getDefault().getLanguage();
    }

    public static String b() {
        if (c != null) {
            return c;
        }
        c = Settings.System.getString(com.tsf.extend.h.b().getApplicationContext().getContentResolver(), "android_id");
        return c;
    }

    public static String c() {
        if (d != null) {
            return d;
        }
        e();
        return d;
    }

    public static String d() {
        if (e != null) {
            return e;
        }
        e();
        return e;
    }

    private static synchronized void e() {
        if (d == null) {
            Context applicationContext = com.tsf.extend.h.b().getApplicationContext();
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                d = Integer.toString(packageInfo.versionCode);
                e = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("AppEnvUtils", "Package is not found: " + applicationContext.getPackageName());
            }
        }
    }

    public static boolean a(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        return i == 3 || i == 4;
    }

    public static String b(Context context) {
        if (context == null) {
            return null;
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public static String c(Context context) {
        return c.a(context);
    }

    public static BitmapDrawable a(final WallpaperManager wallpaperManager) {
        try {
            return (BitmapDrawable) wallpaperManager.getDrawable();
        } catch (Exception e2) {
            return (BitmapDrawable) aa.a(new Callable<BitmapDrawable>() { // from class: com.tsf.extend.base.j.d.1
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public BitmapDrawable call() {
                    try {
                        return (BitmapDrawable) wallpaperManager.getDrawable();
                    } catch (Exception e3) {
                        return null;
                    }
                }
            });
        }
    }

    public static Bitmap b(WallpaperManager wallpaperManager) {
        return a(wallpaperManager, true);
    }

    public static Bitmap a(WallpaperManager wallpaperManager, boolean z) {
        BitmapDrawable bitmapDrawableB = b(wallpaperManager, z);
        if (bitmapDrawableB == null) {
            return null;
        }
        return bitmapDrawableB.getBitmap();
    }

    public static BitmapDrawable b(WallpaperManager wallpaperManager, boolean z) {
        BitmapDrawable bitmapDrawableC;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        synchronized (a) {
            if (b != null && b.get() != null && (bitmap = b.get().getBitmap()) != null && !bitmap.isRecycled()) {
                return b.get();
            }
            if (z) {
                bitmapDrawableC = a(wallpaperManager);
            } else {
                bitmapDrawableC = c(wallpaperManager);
            }
            if (bitmapDrawableC == null) {
                return null;
            }
            wallpaperManager.forgetLoadedWallpaper();
            synchronized (a) {
                b = new SoftReference<>(bitmapDrawableC);
                bitmapDrawable = b.get();
            }
            return bitmapDrawable;
        }
    }

    public static BitmapDrawable c(final WallpaperManager wallpaperManager) {
        try {
            return (BitmapDrawable) wallpaperManager.peekDrawable();
        } catch (Exception e2) {
            return (BitmapDrawable) aa.a(new Callable<BitmapDrawable>() { // from class: com.tsf.extend.base.j.d.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public BitmapDrawable call() {
                    try {
                        return (BitmapDrawable) wallpaperManager.peekDrawable();
                    } catch (Exception e3) {
                        return null;
                    }
                }
            });
        }
    }

    public static HashMap<String, Object> d(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            for (Field field : context.getClassLoader().loadClass("com.ksmobile.launcher.theme.base.R$styleable").getFields()) {
                map.put(field.getName(), field.get(null));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return map;
    }
}
