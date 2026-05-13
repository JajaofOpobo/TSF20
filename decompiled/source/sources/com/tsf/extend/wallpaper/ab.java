package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.PictureDrawable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ab {

    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public static class b {
        private static b b = new b();
        WeakHashMap<Integer, com.tsf.extend.a.b> a = new WeakHashMap<>();

        public static b a() {
            return b;
        }

        public void a(int i, com.tsf.extend.a.b bVar) {
            this.a.put(Integer.valueOf(i), bVar);
        }

        public com.tsf.extend.a.b a(int i) {
            return this.a.get(Integer.valueOf(i));
        }
    }

    public static Runnable a(final a aVar, final boolean z, final int i) {
        return new Runnable() { // from class: com.tsf.extend.wallpaper.ab.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r10 = this;
                    r9 = 1
                    r1 = 0
                    android.content.Context r0 = com.tsf.extend.h.b()
                    android.content.Context r0 = r0.getApplicationContext()
                    boolean r2 = r1
                    int r3 = r2
                    android.graphics.Bitmap r8 = com.tsf.extend.wallpaper.ab.a(r0, r1, r2, r9, r3)
                    com.tsf.extend.wallpaper.ab$a r2 = r3
                    if (r2 == 0) goto L1b
                    com.tsf.extend.wallpaper.ab$a r2 = r3
                    r2.a(r8)
                L1b:
                    if (r8 == 0) goto L58
                    com.tsf.extend.wallpaper.b r7 = new com.tsf.extend.wallpaper.b     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L68
                    r7.<init>()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L68
                    android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
                    r3 = 100
                    r8.compress(r2, r3, r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
                    java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
                    byte[] r3 = r7.a()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
                    r4 = 0
                    int r5 = r7.size()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
                    r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L84
                    r1 = 0
                    int r3 = r8.getWidth()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
                    int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
                    r5 = 0
                    r6 = 0
                    com.tsf.extend.wallpaper.aj.a(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
                    if (r7 == 0) goto L4a
                    r7.close()     // Catch: java.io.IOException -> L75
                L4a:
                    if (r2 == 0) goto L4f
                    r2.close()     // Catch: java.io.IOException -> L77
                L4f:
                    boolean r1 = r1
                    if (r1 == 0) goto L58
                    int r1 = r2
                    com.tsf.extend.wallpaper.ab.a(r0, r8, r9, r1)
                L58:
                    return
                L59:
                    r2 = move-exception
                    r2 = r1
                L5b:
                    if (r1 == 0) goto L60
                    r1.close()     // Catch: java.io.IOException -> L79
                L60:
                    if (r2 == 0) goto L4f
                    r2.close()     // Catch: java.io.IOException -> L66
                    goto L4f
                L66:
                    r1 = move-exception
                    goto L4f
                L68:
                    r0 = move-exception
                    r7 = r1
                L6a:
                    if (r7 == 0) goto L6f
                    r7.close()     // Catch: java.io.IOException -> L7b
                L6f:
                    if (r1 == 0) goto L74
                    r1.close()     // Catch: java.io.IOException -> L7d
                L74:
                    throw r0
                L75:
                    r1 = move-exception
                    goto L4a
                L77:
                    r1 = move-exception
                    goto L4f
                L79:
                    r1 = move-exception
                    goto L60
                L7b:
                    r2 = move-exception
                    goto L6f
                L7d:
                    r1 = move-exception
                    goto L74
                L7f:
                    r0 = move-exception
                    goto L6a
                L81:
                    r0 = move-exception
                    r1 = r2
                    goto L6a
                L84:
                    r2 = move-exception
                    r2 = r1
                    r1 = r7
                    goto L5b
                L88:
                    r1 = move-exception
                    r1 = r7
                    goto L5b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.ab.AnonymousClass1.run():void");
            }
        };
    }

    private static com.tsf.extend.a.b b(Context context, int i) {
        com.tsf.extend.a.b a2 = b.a().a(i);
        if (a2 == null) {
            try {
                a2 = com.tsf.extend.a.e.a(context.getAssets(), d(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (a2 != null) {
                b.a().a(i, a2);
            }
        }
        return a2;
    }

    public static Bitmap a(Context context, boolean z, int i) {
        d(i);
        try {
            PictureDrawable a2 = b(context, i).a();
            a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
            int a3 = com.tsf.extend.base.j.j.a(context);
            int b2 = com.tsf.extend.base.j.j.b(context);
            float intrinsicHeight = b2 / a2.getIntrinsicHeight();
            float intrinsicWidth = (a3 * 2.0f) / a2.getIntrinsicWidth();
            Bitmap createBitmap = Bitmap.createBitmap(a3 * 2, b2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(intrinsicWidth, intrinsicHeight);
            a2.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Bitmap a(Context context, int i) {
        return a(context, i, 3.0f);
    }

    private static Bitmap a(Context context, int i, float f) {
        d(i);
        try {
            PictureDrawable a2 = b(context, i).a();
            a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
            int a3 = com.tsf.extend.base.j.j.a(context);
            float b2 = com.tsf.extend.base.j.j.b(context) / f;
            float f2 = a3 / f;
            float intrinsicHeight = b2 / a2.getIntrinsicHeight();
            float intrinsicWidth = (2.0f * f2) / a2.getIntrinsicWidth();
            Bitmap createBitmap = Bitmap.createBitmap(((int) f2) * 2, (int) b2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.scale(intrinsicWidth, intrinsicHeight);
            a2.draw(canvas);
            a(context, createBitmap, i);
            return createBitmap;
        } catch (Throwable th) {
            return null;
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
    private static void a(android.content.Context r6, android.graphics.Bitmap r7, int r8) {
        /*
            r1 = 0
            java.lang.String r2 = b(r8)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L20
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L20
            java.io.File r4 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L20
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L20
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L3a
            r2 = 100
            r7.compress(r1, r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L1f
            r0.close()     // Catch: java.io.IOException -> L31
        L1f:
            return
        L20:
            r0 = move-exception
            r0 = r1
        L22:
            if (r0 == 0) goto L1f
            r0.close()     // Catch: java.io.IOException -> L28
            goto L1f
        L28:
            r0 = move-exception
            goto L1f
        L2a:
            r0 = move-exception
        L2b:
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.io.IOException -> L33
        L30:
            throw r0
        L31:
            r0 = move-exception
            goto L1f
        L33:
            r1 = move-exception
            goto L30
        L35:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L2b
        L3a:
            r1 = move-exception
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.ab.a(android.content.Context, android.graphics.Bitmap, int):void");
    }

    public static Bitmap a(Context context, BitmapFactory.Options options, boolean z, boolean z2, int i) {
        Bitmap bitmap = null;
        String c = c(i);
        if (!z) {
            File file = new File(context.getFilesDir().getAbsolutePath(), c);
            if (file.exists() && file.isFile()) {
                try {
                    bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                } catch (Throwable th) {
                }
            }
        }
        if (bitmap == null) {
            if ("".equals("themeLauncher")) {
                try {
                    bitmap = BitmapFactory.decodeStream(context.getAssets().open("wallpaper_background.png"));
                } catch (Exception e) {
                }
            } else {
                bitmap = a(context, z2, i);
            }
            if (!z && bitmap != null) {
                a(context, bitmap, z2, i);
            }
        }
        return bitmap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void a(android.content.Context r6, android.graphics.Bitmap r7, boolean r8, int r9) {
        /*
            r1 = 0
            java.lang.String r2 = c(r9)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L20
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L20
            java.io.File r4 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L20
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L20
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L3a
            r2 = 100
            r7.compress(r1, r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L1f
            r0.close()     // Catch: java.io.IOException -> L31
        L1f:
            return
        L20:
            r0 = move-exception
            r0 = r1
        L22:
            if (r0 == 0) goto L1f
            r0.close()     // Catch: java.io.IOException -> L28
            goto L1f
        L28:
            r0 = move-exception
            goto L1f
        L2a:
            r0 = move-exception
        L2b:
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.io.IOException -> L33
        L30:
            throw r0
        L31:
            r0 = move-exception
            goto L1f
        L33:
            r1 = move-exception
            goto L30
        L35:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L2b
        L3a:
            r1 = move-exception
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.ab.a(android.content.Context, android.graphics.Bitmap, boolean, int):void");
    }

    public static void a(int i) {
        try {
            com.tsf.extend.base.h.a.a().b().b("key_wallpaper_choose_type", i);
        } catch (Exception e) {
        }
    }

    private static int d() {
        try {
            return com.tsf.extend.base.h.a.a().b().a("key_wallpaper_choose_type", 0);
        } catch (Exception e) {
            return 0;
        }
    }

    private static int e() {
        try {
            return com.tsf.extend.base.h.a.a().b().a("key_wallpaper_choose_ab", 0);
        } catch (Exception e) {
            return 0;
        }
    }

    public static final int a() {
        return d();
    }

    public static final String b() {
        return d(d());
    }

    public static final String b(int i) {
        switch (i) {
            case 0:
                return "wallpaper_with_effect_svg_starrysky_thumbnail.png";
            case 1:
                return "wallpaper_with_effect_svg_color_thumbnail.png";
            case 2:
                return "wallpaper_with_effect_svg_star_thumbnail.png";
            default:
                return "wallpaper_with_effect_svg_starrysky_thumbnail.png";
        }
    }

    public static final String c(int i) {
        switch (i) {
            case 0:
                return "wallpaper_with_effect_svg_starrysky.png";
            case 1:
                return "wallpaper_with_effect_svg_color.png";
            case 2:
                return "wallpaper_with_effect_svg_star.png";
            default:
                return "wallpaper_with_effect_svg_starrysky.png";
        }
    }

    public static final String d(int i) {
        switch (i) {
            case 0:
                return "wallpaper_with_effect_svg_starrysky.svg";
            case 1:
                return "wallpaper_with_effect_svg_color.svg";
            case 2:
                return "wallpaper_with_effect_svg_star.svg";
            default:
                return "wallpaper_with_effect_svg_starrysky.svg";
        }
    }

    public static final List<Integer> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        if (e() == 1) {
            arrayList.add(1);
            arrayList.add(2);
        }
        return arrayList;
    }
}
