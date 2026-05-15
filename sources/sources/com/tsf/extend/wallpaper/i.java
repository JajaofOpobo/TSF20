package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Pair;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i {
    private static i a;
    private File b;
    private Handler d;
    private Context e;
    private boolean c = false;
    private AtomicBoolean f = new AtomicBoolean(false);

    public interface a {

        /* JADX INFO: renamed from: com.tsf.extend.wallpaper.i$a$a, reason: collision with other inner class name */
        public enum EnumC0069a {
            getList,
            getSmall,
            getBig,
            save,
            delete,
            notify
        }

        public enum b {
            suc,
            fail
        }

        void a(EnumC0069a enumC0069a, Object obj, b bVar);
    }

    private i() {
    }

    public static synchronized i a() {
        if (a == null) {
            a = new i();
        }
        return a;
    }

    public void a(a aVar) {
        aa.a().b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(int i, String str, boolean z, g gVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (gVar.c()) {
            if (gVar.e() != -1) {
                File file = new File(str);
                if (!file.exists() || !file.isFile()) {
                    ab.a(this.e, gVar.e());
                }
            }
        } else if (this.b != null) {
            str = this.b.getAbsolutePath() + "/" + str;
        } else {
            throw new NullPointerException("localWallpaperFile is NULL");
        }
        BitmapFactory.decodeFile(str, options);
        if (i <= 0) {
            if (!z) {
                throw new IllegalArgumentException("desired width can't <=0!");
            }
            if (options.outWidth > com.tsf.extend.base.j.p.b() * 2) {
                i = com.tsf.extend.base.j.p.b() * 2;
            } else {
                i = options.outWidth;
            }
        }
        options.inSampleSize = a(options.outWidth, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    private int a(int i, int i2) {
        float f = 1.0f;
        while (f * 2.0f <= ((double) i) / ((double) i2)) {
            f *= 2.0f;
        }
        return (int) f;
    }

    public void a(final a aVar, final g gVar, final int i, final boolean z) {
        if (aVar != null) {
            a(new Runnable() { // from class: com.tsf.extend.wallpaper.i.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        aVar.a(z ? a.EnumC0069a.getBig : a.EnumC0069a.getSmall, new Pair(gVar, i.this.a(i, gVar.b(), z, gVar)), a.b.suc);
                    } catch (Throwable th) {
                        aVar.a(z ? a.EnumC0069a.getBig : a.EnumC0069a.getSmall, new Pair(gVar, null), a.b.fail);
                    }
                }
            });
        }
    }

    public void a(a aVar, final g gVar) {
        final WeakReference weakReference = new WeakReference(aVar);
        if (gVar != null) {
            a(new Runnable() { // from class: com.tsf.extend.wallpaper.i.2
                @Override // java.lang.Runnable
                public void run() {
                    aa.a().a(gVar, new a() { // from class: com.tsf.extend.wallpaper.i.2.1
                        @Override // com.tsf.extend.wallpaper.i.a
                        public void a(a.EnumC0069a enumC0069a, Object obj, a.b bVar) {
                            boolean z = bVar == a.b.suc;
                            String strB = gVar.b();
                            if (z && i.this.b != null) {
                                File file = new File(i.this.b, strB);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                            a aVar2 = (a) weakReference.get();
                            if (aVar2 != null) {
                                aVar2.a(a.EnumC0069a.delete, strB, z ? a.b.suc : a.b.fail);
                            }
                        }
                    });
                }
            });
        }
    }

    private void a(Runnable runnable) {
        this.d.post(runnable);
    }
}
