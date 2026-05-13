package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Pair;
import com.tsf.extend.base.p080j.C1437p;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.tsf.extend.wallpaper.i */
/* loaded from: classes.dex */
public class C2077i {

    /* renamed from: a */
    private static C2077i f6800a;

    /* renamed from: b */
    private File f6801b;

    /* renamed from: d */
    private Handler f6803d;

    /* renamed from: e */
    private Context f6804e;

    /* renamed from: c */
    private boolean f6802c = false;

    /* renamed from: f */
    private AtomicBoolean f6805f = new AtomicBoolean(false);

    /* renamed from: com.tsf.extend.wallpaper.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2081a {

        /* renamed from: com.tsf.extend.wallpaper.i$a$a */
        /* loaded from: classes.dex */
        public enum EnumC2082a {
            getList,
            getSmall,
            getBig,
            save,
            delete,
            notify
        }

        /* renamed from: com.tsf.extend.wallpaper.i$a$b */
        /* loaded from: classes.dex */
        public enum EnumC2083b {
            suc,
            fail
        }

        /* renamed from: a */
        void mo6477a(EnumC2082a enumC2082a, Object obj, EnumC2083b enumC2083b);
    }

    private C2077i() {
    }

    /* renamed from: a */
    public static synchronized C2077i m6486a() {
        C2077i c2077i;
        synchronized (C2077i.class) {
            if (f6800a == null) {
                f6800a = new C2077i();
            }
            c2077i = f6800a;
        }
        return c2077i;
    }

    /* renamed from: a */
    public void m6483a(InterfaceC2081a interfaceC2081a) {
        C2026aa.m6695a().m6681b(interfaceC2081a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m6484a(int i, String str, boolean z, C2070g c2070g) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (c2070g.m6521c()) {
            if (c2070g.m6519e() != -1) {
                File file = new File(str);
                if (!file.exists() || !file.isFile()) {
                    C2035ab.m6666a(this.f6804e, c2070g.m6519e());
                }
            }
        } else if (this.f6801b != null) {
            str = this.f6801b.getAbsolutePath() + "/" + str;
        } else {
            throw new NullPointerException("localWallpaperFile is NULL");
        }
        BitmapFactory.decodeFile(str, options);
        if (i <= 0) {
            if (!z) {
                throw new IllegalArgumentException("desired width can't <=0!");
            }
            if (options.outWidth > C1437p.m8619b() * 2) {
                i = C1437p.m8619b() * 2;
            } else {
                i = options.outWidth;
            }
        }
        options.inSampleSize = m6485a(options.outWidth, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    private int m6485a(int i, int i2) {
        float f = 1.0f;
        while (f * 2.0f <= i / i2) {
            f *= 2.0f;
        }
        return (int) f;
    }

    /* renamed from: a */
    public void m6481a(final InterfaceC2081a interfaceC2081a, final C2070g c2070g, final int i, final boolean z) {
        if (interfaceC2081a != null) {
            m6478a(new Runnable() { // from class: com.tsf.extend.wallpaper.i.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        interfaceC2081a.mo6477a(z ? InterfaceC2081a.EnumC2082a.getBig : InterfaceC2081a.EnumC2082a.getSmall, new Pair(c2070g, C2077i.this.m6484a(i, c2070g.m6522b(), z, c2070g)), InterfaceC2081a.EnumC2083b.suc);
                    } catch (Throwable th) {
                        interfaceC2081a.mo6477a(z ? InterfaceC2081a.EnumC2082a.getBig : InterfaceC2081a.EnumC2082a.getSmall, new Pair(c2070g, null), InterfaceC2081a.EnumC2083b.fail);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m6482a(InterfaceC2081a interfaceC2081a, final C2070g c2070g) {
        final WeakReference weakReference = new WeakReference(interfaceC2081a);
        if (c2070g != null) {
            m6478a(new Runnable() { // from class: com.tsf.extend.wallpaper.i.2
                @Override // java.lang.Runnable
                public void run() {
                    C2026aa.m6695a().m6688a(c2070g, new InterfaceC2081a() { // from class: com.tsf.extend.wallpaper.i.2.1
                        @Override // com.tsf.extend.wallpaper.C2077i.InterfaceC2081a
                        /* renamed from: a */
                        public void mo6477a(InterfaceC2081a.EnumC2082a enumC2082a, Object obj, InterfaceC2081a.EnumC2083b enumC2083b) {
                            boolean z = enumC2083b == InterfaceC2081a.EnumC2083b.suc;
                            String m6522b = c2070g.m6522b();
                            if (z && C2077i.this.f6801b != null) {
                                File file = new File(C2077i.this.f6801b, m6522b);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                            InterfaceC2081a interfaceC2081a2 = (InterfaceC2081a) weakReference.get();
                            if (interfaceC2081a2 != null) {
                                interfaceC2081a2.mo6477a(InterfaceC2081a.EnumC2082a.delete, m6522b, z ? InterfaceC2081a.EnumC2083b.suc : InterfaceC2081a.EnumC2083b.fail);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    private void m6478a(Runnable runnable) {
        this.f6803d.post(runnable);
    }
}
