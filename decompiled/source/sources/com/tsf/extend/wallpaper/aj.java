package com.tsf.extend.wallpaper;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class aj {
    private static int a = 1;
    private static int b = 2;
    private static int c = 3;

    public static void a(Context context, Bitmap bitmap, boolean z, boolean z2, boolean z3) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        boolean z4 = true;
        boolean z5 = false;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        boolean a2 = com.tsf.extend.base.j.v.a();
        if (a2) {
            a(context, wallpaperManager, bitmap.getWidth(), bitmap.getHeight(), z, true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            try {
                ParcelFileDescriptor a3 = a(context, z, z2, z3);
                if (a3 == null) {
                    z4 = false;
                } else {
                    try {
                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(a3);
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
        if (!a2) {
            wallpaperManager.suggestDesiredDimensions(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean b(android.content.Context r10, android.graphics.Bitmap r11, boolean r12, boolean r13, boolean r14) {
        /*
            r7 = 1
            r8 = 0
            r1 = 0
            int r2 = com.tsf.extend.base.j.j.a(r10)
            int r3 = com.tsf.extend.base.j.j.b(r10)
            int r4 = r11.getWidth()
            int r5 = r11.getHeight()
            if (r12 == 0) goto L55
            r0 = r7
        L16:
            int r0 = r0 * r2
            if (r4 != r0) goto L1b
            if (r5 == r3) goto L92
        L1b:
            android.graphics.Bitmap r0 = com.tsf.extend.base.j.e.a(r11, r0, r3)     // Catch: java.lang.Throwable -> L57
        L1f:
            if (r0 != 0) goto L90
        L21:
            com.tsf.extend.wallpaper.b r9 = new com.tsf.extend.wallpaper.b     // Catch: java.lang.Throwable -> L5a
            r9.<init>()     // Catch: java.lang.Throwable -> L5a
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L87
            r2 = 100
            r11.compress(r0, r2, r9)     // Catch: java.lang.Throwable -> L87
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L87
            byte[] r0 = r9.a()     // Catch: java.lang.Throwable -> L87
            r3 = 0
            int r4 = r9.size()     // Catch: java.lang.Throwable -> L87
            r2.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L87
            int r3 = r11.getWidth()     // Catch: java.lang.Throwable -> L8a
            int r4 = r11.getHeight()     // Catch: java.lang.Throwable -> L8a
            r0 = r10
            r1 = r12
            r5 = r13
            r6 = r14
            a(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L4f
            r2.close()     // Catch: java.lang.Exception -> L78
        L4f:
            if (r9 == 0) goto L54
            r9.close()     // Catch: java.lang.Exception -> L7a
        L54:
            return r7
        L55:
            r0 = 2
            goto L16
        L57:
            r0 = move-exception
            r0 = r1
            goto L1f
        L5a:
            r0 = move-exception
            r0 = r1
        L5c:
            if (r1 == 0) goto L61
            r1.close()     // Catch: java.lang.Exception -> L7c
        L61:
            if (r0 == 0) goto L8e
            r0.close()     // Catch: java.lang.Exception -> L68
            r7 = r8
            goto L54
        L68:
            r0 = move-exception
            r7 = r8
            goto L54
        L6b:
            r0 = move-exception
            r9 = r1
        L6d:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.lang.Exception -> L7e
        L72:
            if (r9 == 0) goto L77
            r9.close()     // Catch: java.lang.Exception -> L80
        L77:
            throw r0
        L78:
            r0 = move-exception
            goto L4f
        L7a:
            r0 = move-exception
            goto L54
        L7c:
            r1 = move-exception
            goto L61
        L7e:
            r1 = move-exception
            goto L72
        L80:
            r1 = move-exception
            goto L77
        L82:
            r0 = move-exception
            goto L6d
        L84:
            r0 = move-exception
            r1 = r2
            goto L6d
        L87:
            r0 = move-exception
            r0 = r9
            goto L5c
        L8a:
            r0 = move-exception
            r1 = r2
            r0 = r9
            goto L5c
        L8e:
            r7 = r8
            goto L54
        L90:
            r11 = r0
            goto L21
        L92:
            r0 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.aj.b(android.content.Context, android.graphics.Bitmap, boolean, boolean, boolean):boolean");
    }

    public static void a(Context context, boolean z, InputStream inputStream, int i, int i2, boolean z2, boolean z3) {
        boolean z4;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        boolean z5 = false;
        int a2 = com.tsf.extend.base.j.j.a(context);
        int b2 = com.tsf.extend.base.j.j.b(context);
        int i3 = z ? a2 : a2 * 2;
        boolean a3 = com.tsf.extend.base.j.v.a();
        if (a3) {
            if (i != -1 && i2 != -1) {
                a(context, wallpaperManager, i, i2, z, true);
            } else {
                a(wallpaperManager, i3, b2, true);
            }
        }
        if (Build.VERSION.SDK_INT > 16) {
            try {
                ParcelFileDescriptor a4 = a(context, z, z2, z3);
                if (a4 == null) {
                    z4 = false;
                } else {
                    try {
                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(a4);
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
        if (!a3) {
            wallpaperManager.suggestDesiredDimensions((z ? 1 : 2) * a2, b2);
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
        int a2 = com.tsf.extend.base.j.j.a(context);
        if (!z) {
            a2 *= 2;
        }
        int b2 = com.tsf.extend.base.j.j.b(context);
        if (Build.VERSION.SDK_INT > 19) {
            a(wallpaperManager, a2, b2, z2);
            return;
        }
        int i5 = b2 - i2;
        if (a2 - i > 0 || i5 > 0) {
            a(wallpaperManager, a2, b2, z2);
            com.tsf.extend.base.h.a.a().a(a2);
            com.tsf.extend.base.h.a.a().b(b2);
            return;
        }
        if (i2 > i) {
            i3 = a2;
            i4 = (a2 * i2) / i;
        } else {
            i3 = (b2 * i) / i2;
            i4 = b2;
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
            return;
        }
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
            String[] split = mVar.m().split("id=");
            if (split.length >= 2) {
                String str2 = split[1];
            }
        }
    }
}
