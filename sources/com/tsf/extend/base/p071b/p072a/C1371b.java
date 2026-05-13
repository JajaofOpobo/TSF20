package com.tsf.extend.base.p071b.p072a;

import android.graphics.Bitmap;
import android.support.p002v4.p009d.C0166f;
import java.io.Serializable;
/* renamed from: com.tsf.extend.base.b.a.b */
/* loaded from: classes.dex */
public class C1371b {

    /* renamed from: a */
    private static C1371b f4312a = null;

    /* renamed from: b */
    private C0166f<String, Object> f4313b;

    /* renamed from: a */
    public static synchronized C1371b m8845a() {
        C1371b c1371b;
        synchronized (C1371b.class) {
            if (f4312a == null) {
                f4312a = new C1371b();
            }
            c1371b = f4312a;
        }
        return c1371b;
    }

    private C1371b() {
        this.f4313b = null;
        this.f4313b = new C0166f<String, Object>(1048576) { // from class: com.tsf.extend.base.b.a.b.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.support.p002v4.p009d.C0166f
            /* renamed from: a */
            public int mo1060b(String str, Object obj) {
                if (obj instanceof Bitmap) {
                    return ((Bitmap) obj).getRowBytes() * ((Bitmap) obj).getHeight();
                }
                if (obj instanceof Serializable) {
                }
                return super.mo1060b(str, obj);
            }
        };
    }

    /* renamed from: b */
    public boolean m8844b() {
        synchronized (this.f4313b) {
            this.f4313b.m13360a();
        }
        return true;
    }
}
