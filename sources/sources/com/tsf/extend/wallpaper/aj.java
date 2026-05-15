package com.tsf.extend.wallpaper;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class aj {
    private static int a = 1;
    private static int b = 2;
    private static int c = 3;

    public static void a(Context context, Bitmap bitmap, boolean z, boolean z2, boolean z3) throws Throwable {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        boolean z4 = true;
        boolean z5 = false;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        boolean zA = com.tsf.extend.base.j.v.a();
        if (zA) {
            a(context, wallpaperManager, bitmap.getWidth(), bitmap.getHeight(), z, true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            try {
                ParcelFileDescriptor parcelFileDescriptorA = a(context, z, z2, z3);
                if (parcelFileDescriptorA == null) {
                    z4 = false;
                } else {
                    try {
                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorA);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, autoCloseOutputStream);
                            if (autoCloseOutputStream != null) {
                                try {
                                    autoCloseOutputStream.close();
                                } catch (Exception e) {
                                    z5 = true;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (autoCloseOutputStream != null) {
                                autoCloseOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseOutputStream = null;
                    }
                }
                z5 = z4;
            } catch (Exception e2) {
            }
        }
        if (!z5) {
            wallpaperManager.setBitmap(bitmap);
        }
        if (!zA) {
            wallpaperManager.suggestDesiredDimensions(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    public static boolean b(Context context, Bitmap bitmap, boolean z, boolean z2, boolean z3) {
        Bitmap bitmapA;
        b bVar;
        b bVar2;
        ByteArrayInputStream byteArrayInputStream = null;
        int iA = com.tsf.extend.base.j.j.a(context);
        int iB = com.tsf.extend.base.j.j.b(context);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (z ? 1 : 2) * iA;
        if (width == i && height == iB) {
            bitmapA = null;
        } else {
            try {
                bitmapA = com.tsf.extend.base.j.e.a(bitmap, i, iB);
            } catch (Throwable th) {
                bitmapA = null;
            }
        }
        if (bitmapA != null) {
            bitmap = bitmapA;
        }
        try {
            bVar = new b();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bVar);
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bVar.a(), 0, bVar.size());
                try {
                    a(context, z, byteArrayInputStream2, bitmap.getWidth(), bitmap.getHeight(), z2, z3);
                    if (byteArrayInputStream2 != null) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (Exception e) {
                        }
                    }
                    if (bVar == null) {
                        return true;
                    }
                    try {
                        bVar.close();
                        return true;
                    } catch (Exception e2) {
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                    if (bVar == null) {
                        throw th;
                    }
                    try {
                        bVar.close();
                        throw th;
                    } catch (Exception e4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                bVar2 = bVar;
            }
        } catch (Throwable th4) {
            th = th4;
            bVar = null;
        }
    }

    public static void a(Context context, boolean z, InputStream inputStream, int i, int i2, boolean z2, boolean z3) {
        boolean z4;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        boolean z5 = false;
        int iA = com.tsf.extend.base.j.j.a(context);
        int iB = com.tsf.extend.base.j.j.b(context);
        int i3 = z ? iA : iA * 2;
        boolean zA = com.tsf.extend.base.j.v.a();
        if (zA) {
            if (i != -1 && i2 != -1) {
                a(context, wallpaperManager, i, i2, z, true);
            } else {
                a(wallpaperManager, i3, iB, true);
            }
        }
        if (Build.VERSION.SDK_INT > 16) {
            try {
                ParcelFileDescriptor parcelFileDescriptorA = a(context, z, z2, z3);
                if (parcelFileDescriptorA == null) {
                    z4 = false;
                } else {
                    try {
                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorA);
                        try {
                            if (!a(wallpaperManager, inputStream, autoCloseOutputStream)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (autoCloseOutputStream != null) {
                                try {
                                    autoCloseOutputStream.close();
                                } catch (Exception e) {
                                    z5 = z4;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (autoCloseOutputStream != null) {
                                autoCloseOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseOutputStream = null;
                    }
                }
                z5 = z4;
            } catch (Exception e2) {
            }
        }
        if (!z5) {
            wallpaperManager.setStream(inputStream);
        }
        if (!zA) {
            wallpaperManager.suggestDesiredDimensions((z ? 1 : 2) * iA, iB);
        }
    }

    private static boolean a(WallpaperManager wallpaperManager, InputStream inputStream, FileOutputStream fileOutputStream) {
        try {
            Method declaredMethod = wallpaperManager.getClass().getDeclaredMethod("setWallpaper", InputStream.class, FileOutputStream.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(wallpaperManager, inputStream, fileOutputStream);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ParcelFileDescriptor a(Context context, boolean z, boolean z2, boolean z3) {
        String str;
        try {
            Field declaredField = WallpaperManager.class.getDeclaredField("sGlobals");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(WallpaperManager.getInstance(context));
            Field declaredField2 = declaredField.getType().getDeclaredField("mService");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (z3) {
                str = (z2 ? "res:cml_ot_" : "res:cml_gt_") + (z ? "s" : "d");
            } else {
                str = (z2 ? "res:cml_o_" : "res:cml_g_") + (z ? "s" : "d");
            }
            return (ParcelFileDescriptor) declaredField2.getType().getDeclaredMethod("setWallpaper", String.class).invoke(obj2, str);
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Context context, WallpaperManager wallpaperManager, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iA = com.tsf.extend.base.j.j.a(context);
        if (!z) {
            iA *= 2;
        }
        int iB = com.tsf.extend.base.j.j.b(context);
        if (Build.VERSION.SDK_INT > 19) {
            a(wallpaperManager, iA, iB, z2);
            return;
        }
        int i5 = iB - i2;
        if (iA - i > 0 || i5 > 0) {
            a(wallpaperManager, iA, iB, z2);
            com.tsf.extend.base.h.a.a().a(iA);
            com.tsf.extend.base.h.a.a().b(iB);
            return;
        }
        if (i2 > i) {
            i3 = iA;
            i4 = (iA * i2) / i;
        } else {
            i3 = (iB * i) / i2;
            i4 = iB;
        }
        a(wallpaperManager, i3, i4, z2);
        com.tsf.extend.base.h.a.a().a(i3);
        com.tsf.extend.base.h.a.a().b(i4);
    }

    private static void a(final WallpaperManager wallpaperManager, final int i, final int i2, boolean z) {
        if (z) {
            com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.wallpaper.aj.1
                @Override // java.lang.Runnable
                public void run() {
                    wallpaperManager.suggestDesiredDimensions(i, i2);
                }
            });
        } else {
            final int i3 = i - 1;
            com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.wallpaper.aj.2
                @Override // java.lang.Runnable
                public void run() {
                    wallpaperManager.suggestDesiredDimensions(i3, i2);
                    com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.wallpaper.aj.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            wallpaperManager.suggestDesiredDimensions(i, i2);
                        }
                    }, 1000L);
                }
            });
        }
    }

    public static void a(List<? extends m> list) {
        Iterator<? extends m> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().n()) {
                it.remove();
            }
        }
    }

    public static boolean a(Context context, String str) {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(str) || !str.startsWith("live.wallpaper") || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null) {
            return false;
        }
        ComponentName component = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(component);
        intent.setFlags(270532608);
        intent.putExtra("from_cml_theme", true);
        intent.putExtra("from_cml", true);
        context.startActivity(intent);
        return true;
    }

    public static void a(List<m> list, m mVar, String str) {
        list.indexOf(mVar);
        if (mVar != null && mVar.n()) {
            String[] strArrSplit = mVar.m().split("id=");
            if (strArrSplit.length >= 2) {
                String str2 = strArrSplit[1];
            }
        }
    }
}
