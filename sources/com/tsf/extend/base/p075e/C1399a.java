package com.tsf.extend.base.p075e;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.base.e.a */
/* loaded from: classes.dex */
public class C1399a {

    /* renamed from: a */
    private static volatile C1399a f4366a = null;

    /* renamed from: b */
    private Typeface f4367b;

    /* renamed from: c */
    private List<WeakReference<InterfaceC1400a>> f4368c = new ArrayList();

    /* renamed from: com.tsf.extend.base.e.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1400a {
    }

    /* renamed from: a */
    public static C1399a m8772a() {
        if (f4366a == null) {
            synchronized (C1399a.class) {
                if (f4366a == null) {
                    f4366a = new C1399a();
                }
            }
        }
        return f4366a;
    }

    private C1399a() {
    }

    /* renamed from: a */
    public boolean m8771a(InterfaceC1400a interfaceC1400a) {
        if (interfaceC1400a == null) {
            return false;
        }
        this.f4368c.add(new WeakReference<>(interfaceC1400a));
        return true;
    }

    /* renamed from: b */
    public Typeface m8770b() {
        return this.f4367b;
    }
}
