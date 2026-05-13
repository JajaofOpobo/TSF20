package com.tsf.shell.manager.p179k;

import android.graphics.Typeface;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.utils.C4179o;
import java.io.File;
/* renamed from: com.tsf.shell.manager.k.a */
/* loaded from: classes.dex */
public class C3518a {

    /* renamed from: a */
    private static Typeface f11619a = null;

    /* renamed from: a */
    public static void m2156a() {
        File m662a = C4179o.m662a(C0853a.m10856d().getCacheDir(), "/fonts/select.ttf");
        if (m662a.exists()) {
            f11619a = Typeface.createFromFile(m662a);
        }
    }

    /* renamed from: b */
    public static Typeface m2155b() {
        return f11619a;
    }
}
