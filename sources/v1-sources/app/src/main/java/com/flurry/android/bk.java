package com.flurry.android;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
abstract class bk implements cc, dw {
    private static final String a = bk.class.getSimpleName();

    protected abstract Bundle a(Context context);

    protected abstract az a(Context context, s sVar, dl dlVar, j jVar, Bundle bundle);

    protected abstract bg a();

    protected abstract eb a(Context context, s sVar, dl dlVar, a aVar, Bundle bundle);

    protected abstract bg b();

    bk() {
    }

    @Override // com.flurry.android.cc
    public final az a(Context context, s sVar, dl dlVar, j jVar) {
        bg a2;
        Bundle a3;
        if (context == null || sVar == null || dlVar == null || jVar == null || (a2 = a()) == null || !a(a2) || (a3 = a(context)) == null) {
            return null;
        }
        return a(context, sVar, dlVar, jVar, a3);
    }

    @Override // com.flurry.android.dw
    public final eb b(Context context, s sVar, dl dlVar, j jVar) {
        Bundle a2;
        a aVar;
        if (context == null || sVar == null || dlVar == null || jVar == null) {
            return null;
        }
        bg b = b();
        if (b != null && a(b) && (a2 = a(context)) != null) {
            if (jVar == null) {
                aVar = null;
            } else {
                List d = jVar.d();
                if (d == null || d.isEmpty()) {
                    aVar = null;
                } else {
                    b bVar = (b) d.get(0);
                    if (bVar == null) {
                        aVar = null;
                    } else {
                        i e = bVar.e();
                        aVar = e == null ? null : dj.a(e);
                    }
                }
            }
            if (aVar == null) {
                return null;
            }
            return a(context, sVar, dlVar, aVar, a2);
        }
        return null;
    }

    private static boolean a(bg bgVar) {
        boolean z = false;
        if (bgVar != null) {
            try {
                if (!TextUtils.isEmpty(bgVar.c())) {
                    Class.forName(bgVar.c());
                    z = true;
                }
            } catch (ClassNotFoundException e) {
                String str = a;
                Cdo.a("failed to find third party ad network api with exception: ", e);
            } catch (ExceptionInInitializerError e2) {
                String str2 = a;
                Cdo.a("failed to initialize third party ad network api with exception: ", e2);
            } catch (LinkageError e3) {
                String str3 = a;
                Cdo.a("failed to link third party ad network api with exception: ", e3);
            }
            if (!z) {
                Cdo.b(a, "Please consider to add to the project the library: " + bgVar.a() + " version: " + bgVar.b() + " or higher");
            }
        }
        return z;
    }
}
