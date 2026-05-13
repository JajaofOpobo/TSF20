package com.tsf.shell.p086a.p088b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.tsf.shell.a.b.a */
/* loaded from: classes.dex */
public class C2209a {

    /* renamed from: a */
    private static final HashMap<ComponentName, ArrayList<String>> f7251a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<ComponentName, String> f7252b = new HashMap<>();

    /* renamed from: a */
    public static void m6084a(Context context, int i) {
        Intent m6085a = m6085a(context);
        if (m6085a != null) {
            if (-1000 != i && (context instanceof Activity)) {
                m6082a(context, m6085a, i);
            } else {
                m6083a(context, m6085a);
            }
        }
    }

    /* renamed from: a */
    public static Intent m6085a(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        if (m6081b(context, intent)) {
            return intent;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m6083a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m6082a(Context context, Intent intent, int i) {
        try {
            if (!(context instanceof Activity)) {
                return true;
            }
            ((Activity) context).startActivityForResult(intent, i);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m6081b(Context context, Intent intent) {
        return (intent == null || context.getPackageManager().resolveActivity(intent, 0) == null) ? false : true;
    }
}
