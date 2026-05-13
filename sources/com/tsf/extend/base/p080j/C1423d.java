package com.tsf.extend.base.p080j;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.tsf.extend.C1547h;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
/* renamed from: com.tsf.extend.base.j.d */
/* loaded from: classes.dex */
public class C1423d {

    /* renamed from: b */
    private static SoftReference<BitmapDrawable> f4410b;

    /* renamed from: c */
    private static String f4411c;

    /* renamed from: d */
    private static String f4412d;

    /* renamed from: e */
    private static String f4413e;

    /* renamed from: a */
    private static Object f4409a = new Object();

    /* renamed from: f */
    private static int f4414f = 0;

    /* renamed from: a */
    public static String m8692a() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: b */
    public static String m8688b() {
        if (f4411c != null) {
            return f4411c;
        }
        f4411c = Settings.System.getString(C1547h.m8290b().getApplicationContext().getContentResolver(), "android_id");
        return f4411c;
    }

    /* renamed from: c */
    public static String m8684c() {
        if (f4412d != null) {
            return f4412d;
        }
        m8679e();
        return f4412d;
    }

    /* renamed from: d */
    public static String m8681d() {
        if (f4413e != null) {
            return f4413e;
        }
        m8679e();
        return f4413e;
    }

    /* renamed from: e */
    private static synchronized void m8679e() {
        synchronized (C1423d.class) {
            if (f4412d == null) {
                Context applicationContext = C1547h.m8290b().getApplicationContext();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                    f4412d = Integer.toString(packageInfo.versionCode);
                    f4413e = packageInfo.versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("AppEnvUtils", "Package is not found: " + applicationContext.getPackageName());
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m8689a(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        return i == 3 || i == 4;
    }

    /* renamed from: b */
    public static String m8685b(Context context) {
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

    /* renamed from: c */
    public static String m8682c(Context context) {
        return C1422c.m8697a(context);
    }

    /* renamed from: a */
    public static BitmapDrawable m8691a(final WallpaperManager wallpaperManager) {
        try {
            return (BitmapDrawable) wallpaperManager.getDrawable();
        } catch (Exception e) {
            return (BitmapDrawable) C1419aa.m8705a(new Callable<BitmapDrawable>() { // from class: com.tsf.extend.base.j.d.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public BitmapDrawable call() {
                    try {
                        return (BitmapDrawable) wallpaperManager.getDrawable();
                    } catch (Exception e2) {
                        return null;
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static Bitmap m8687b(WallpaperManager wallpaperManager) {
        return m8690a(wallpaperManager, true);
    }

    /* renamed from: a */
    public static Bitmap m8690a(WallpaperManager wallpaperManager, boolean z) {
        BitmapDrawable m8686b = m8686b(wallpaperManager, z);
        if (m8686b == null) {
            return null;
        }
        return m8686b.getBitmap();
    }

    /* renamed from: b */
    public static BitmapDrawable m8686b(WallpaperManager wallpaperManager, boolean z) {
        BitmapDrawable m8683c;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        synchronized (f4409a) {
            if (f4410b != null && f4410b.get() != null && (bitmap = f4410b.get().getBitmap()) != null && !bitmap.isRecycled()) {
                return f4410b.get();
            }
            if (z) {
                m8683c = m8691a(wallpaperManager);
            } else {
                m8683c = m8683c(wallpaperManager);
            }
            if (m8683c == null) {
                return null;
            }
            wallpaperManager.forgetLoadedWallpaper();
            synchronized (f4409a) {
                f4410b = new SoftReference<>(m8683c);
                bitmapDrawable = f4410b.get();
            }
            return bitmapDrawable;
        }
    }

    /* renamed from: c */
    public static BitmapDrawable m8683c(final WallpaperManager wallpaperManager) {
        try {
            return (BitmapDrawable) wallpaperManager.peekDrawable();
        } catch (Exception e) {
            return (BitmapDrawable) C1419aa.m8705a(new Callable<BitmapDrawable>() { // from class: com.tsf.extend.base.j.d.2
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public BitmapDrawable call() {
                    try {
                        return (BitmapDrawable) wallpaperManager.peekDrawable();
                    } catch (Exception e2) {
                        return null;
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public static HashMap<String, Object> m8680d(Context context) {
        Field[] fields;
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            for (Field field : context.getClassLoader().loadClass("com.ksmobile.launcher.theme.base.R$styleable").getFields()) {
                hashMap.put(field.getName(), field.get(null));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
