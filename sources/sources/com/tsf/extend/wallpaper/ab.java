package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.PictureDrawable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ab {

    public interface a {
        void a(Bitmap bitmap);
    }

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
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.tsf.extend.wallpaper.b bVar;
                ByteArrayInputStream byteArrayInputStream;
                ByteArrayInputStream byteArrayInputStream2 = null;
                byteArrayInputStream2 = null;
                com.tsf.extend.wallpaper.b bVar2 = null;
                Context applicationContext = com.tsf.extend.h.b().getApplicationContext();
                Bitmap bitmapA = ab.a(applicationContext, null, z, true, i);
                if (aVar != null) {
                    aVar.a(bitmapA);
                }
                if (bitmapA != null) {
                    try {
                        bVar = new com.tsf.extend.wallpaper.b();
                        try {
                            bitmapA.compress(Bitmap.CompressFormat.JPEG, 100, bVar);
                            byteArrayInputStream = new ByteArrayInputStream(bVar.a(), 0, bVar.size());
                            try {
                                aj.a(applicationContext, false, byteArrayInputStream, bitmapA.getWidth(), bitmapA.getHeight(), false, false);
                                if (bVar != null) {
                                    try {
                                        bVar.close();
                                    } catch (IOException e) {
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException e2) {
                                    }
                                }
                            } catch (Exception e3) {
                                bVar2 = bVar;
                                if (bVar2 != null) {
                                    try {
                                        bVar2.close();
                                    } catch (IOException e4) {
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException e5) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                byteArrayInputStream2 = byteArrayInputStream;
                                if (bVar != null) {
                                    try {
                                        bVar.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                if (byteArrayInputStream2 == null) {
                                    throw th;
                                }
                                try {
                                    byteArrayInputStream2.close();
                                    throw th;
                                } catch (IOException e7) {
                                    throw th;
                                }
                            }
                        } catch (Exception e8) {
                            byteArrayInputStream = null;
                            bVar2 = bVar;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e9) {
                        byteArrayInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = null;
                    }
                    if (z) {
                        ab.a(applicationContext, bitmapA, true, i);
                    }
                }
            }
        };
    }

    private static com.tsf.extend.a.b b(Context context, int i) {
        com.tsf.extend.a.b bVarA = b.a().a(i);
        if (bVarA == null) {
            try {
                bVarA = com.tsf.extend.a.e.a(context.getAssets(), d(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bVarA != null) {
                b.a().a(i, bVarA);
            }
        }
        return bVarA;
    }

    public static Bitmap a(Context context, boolean z, int i) {
        d(i);
        try {
            PictureDrawable pictureDrawableA = b(context, i).a();
            pictureDrawableA.setBounds(0, 0, pictureDrawableA.getIntrinsicWidth(), pictureDrawableA.getIntrinsicHeight());
            int iA = com.tsf.extend.base.j.j.a(context);
            int iB = com.tsf.extend.base.j.j.b(context);
            float intrinsicHeight = iB / pictureDrawableA.getIntrinsicHeight();
            float intrinsicWidth = (iA * 2.0f) / pictureDrawableA.getIntrinsicWidth();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA * 2, iB, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(intrinsicWidth, intrinsicHeight);
            pictureDrawableA.draw(canvas);
            return bitmapCreateBitmap;
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
            PictureDrawable pictureDrawableA = b(context, i).a();
            pictureDrawableA.setBounds(0, 0, pictureDrawableA.getIntrinsicWidth(), pictureDrawableA.getIntrinsicHeight());
            float fB = com.tsf.extend.base.j.j.b(context) / f;
            float fA = com.tsf.extend.base.j.j.a(context) / f;
            float intrinsicHeight = fB / pictureDrawableA.getIntrinsicHeight();
            float intrinsicWidth = (2.0f * fA) / pictureDrawableA.getIntrinsicWidth();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) fA) * 2, (int) fB, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.scale(intrinsicWidth, intrinsicHeight);
            pictureDrawableA.draw(canvas);
            a(context, bitmapCreateBitmap, i);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            return null;
        }
    }

    private static void a(Context context, Bitmap bitmap, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), b(i)));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Throwable th) {
                fileOutputStream2 = fileOutputStream;
                th = th;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap a(Context context, BitmapFactory.Options options, boolean z, boolean z2, int i) throws Throwable {
        Bitmap bitmapDecodeStream = null;
        String strC = c(i);
        if (!z) {
            File file = new File(context.getFilesDir().getAbsolutePath(), strC);
            if (file.exists() && file.isFile()) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                } catch (Throwable th) {
                }
            }
        }
        if (bitmapDecodeStream == null) {
            if ("".equals("themeLauncher")) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open("wallpaper_background.png"));
                } catch (Exception e) {
                }
            } else {
                bitmapDecodeStream = a(context, z2, i);
            }
            if (!z && bitmapDecodeStream != null) {
                a(context, bitmapDecodeStream, z2, i);
            }
        }
        return bitmapDecodeStream;
    }

    public static void a(Context context, Bitmap bitmap, boolean z, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), c(i)));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Throwable th) {
                fileOutputStream2 = fileOutputStream;
                th = th;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
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
        }
        return "wallpaper_with_effect_svg_starrysky_thumbnail.png";
    }

    public static final String c(int i) {
        switch (i) {
        }
        return "wallpaper_with_effect_svg_starrysky.png";
    }

    public static final String d(int i) {
        switch (i) {
        }
        return "wallpaper_with_effect_svg_starrysky.svg";
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
