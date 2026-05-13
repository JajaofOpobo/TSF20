package com.tsf.shell.a.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a {
    private static final HashMap<ComponentName, ArrayList<String>> a = new HashMap<>();
    private static final HashMap<ComponentName, String> b = new HashMap<>();

    public static void a(Context context, int i) {
        Intent a2 = a(context);
        if (a2 != null) {
            if (-1000 != i && (context instanceof Activity)) {
                a(context, a2, i);
            } else {
                a(context, a2);
            }
        }
    }

    public static Intent a(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        if (b(context, intent)) {
            return intent;
        }
        return null;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean a(Context context, Intent intent, int i) {
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

    public static boolean b(Context context, Intent intent) {
        return (intent == null || context.getPackageManager().resolveActivity(intent, 0) == null) ? false : true;
    }
}
