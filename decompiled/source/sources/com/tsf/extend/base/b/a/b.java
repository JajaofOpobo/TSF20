package com.tsf.extend.base.b.a;

import android.graphics.Bitmap;
import android.support.v4.d.f;
import java.io.Serializable;
/* loaded from: classes.dex */
public class b {
    private static b a = null;
    private f<String, Object> b;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    private b() {
        this.b = null;
        this.b = new f<String, Object>(1048576) { // from class: com.tsf.extend.base.b.a.b.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.support.v4.d.f
            /* renamed from: a */
            public int b(String str, Object obj) {
                if (obj instanceof Bitmap) {
                    return ((Bitmap) obj).getRowBytes() * ((Bitmap) obj).getHeight();
                }
                if (obj instanceof Serializable) {
                }
                return super.b(str, obj);
            }
        };
    }

    public boolean b() {
        synchronized (this.b) {
            this.b.a();
        }
        return true;
    }
}
