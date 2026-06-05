package com.tsf.extend.base.b.a;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.io.Serializable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private static b a = null;
    private LruCache<String, Object> b;

    public static synchronized b a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    private b() {
        this.b = null;
        this.b = new LruCache<String, Object>(1048576) { // from class: com.tsf.extend.base.b.a.b.1
            @Override // android.util.LruCache
            protected int sizeOf(String str, Object obj) {
                if (obj instanceof Bitmap) {
                    return ((Bitmap) obj).getRowBytes() * ((Bitmap) obj).getHeight();
                }
                if (obj instanceof Serializable) {
                }
                return super.sizeOf(str, obj);
            }
        };
    }

    public boolean b() {
        synchronized (this.b) {
            this.b.evictAll();
        }
        return true;
    }
}
