package com.tsf.extend.base.e;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static volatile a a = null;
    private Typeface b;
    private List<WeakReference<InterfaceC0049a>> c = new ArrayList();

    /* JADX INFO: renamed from: com.tsf.extend.base.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC0049a {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    private a() {
    }

    public boolean a(InterfaceC0049a interfaceC0049a) {
        if (interfaceC0049a == null) {
            return false;
        }
        this.c.add(new WeakReference<>(interfaceC0049a));
        return true;
    }

    public Typeface b() {
        return this.b;
    }
}
