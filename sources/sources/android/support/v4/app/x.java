package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class x {
    private static final a a;

    interface a {
        Intent a(Activity activity);

        String a(Context context, ActivityInfo activityInfo);

        boolean a(Activity activity, Intent intent);

        void b(Activity activity, Intent intent);
    }

    static class b implements a {
        b() {
        }

        @Override // android.support.v4.app.x.a
        public Intent a(Activity activity) {
            Intent intentA = null;
            String strB = x.b(activity);
            if (strB != null) {
                ComponentName componentName = new ComponentName(activity, strB);
                try {
                    intentA = x.b(activity, componentName) == null ? android.support.v4.content.e.a(componentName) : new Intent().setComponent(componentName);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strB + "' in manifest");
                }
            }
            return intentA;
        }

        @Override // android.support.v4.app.x.a
        public boolean a(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }

        @Override // android.support.v4.app.x.a
        public void b(Activity activity, Intent intent) {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }

        @Override // android.support.v4.app.x.a
        public String a(Context context, ActivityInfo activityInfo) {
            String string;
            if (activityInfo.metaData != null && (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) != null) {
                if (string.charAt(0) == '.') {
                    return context.getPackageName() + string;
                }
                return string;
            }
            return null;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // android.support.v4.app.x.b, android.support.v4.app.x.a
        public Intent a(Activity activity) {
            Intent intentA = y.a(activity);
            if (intentA == null) {
                return b(activity);
            }
            return intentA;
        }

        Intent b(Activity activity) {
            return super.a(activity);
        }

        @Override // android.support.v4.app.x.b, android.support.v4.app.x.a
        public boolean a(Activity activity, Intent intent) {
            return y.a(activity, intent);
        }

        @Override // android.support.v4.app.x.b, android.support.v4.app.x.a
        public void b(Activity activity, Intent intent) {
            y.b(activity, intent);
        }

        @Override // android.support.v4.app.x.b, android.support.v4.app.x.a
        public String a(Context context, ActivityInfo activityInfo) {
            String strA = y.a(activityInfo);
            if (strA == null) {
                return super.a(context, activityInfo);
            }
            return strA;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static boolean a(Activity activity, Intent intent) {
        return a.a(activity, intent);
    }

    public static void b(Activity activity, Intent intent) {
        a.b(activity, intent);
    }

    public static Intent a(Activity activity) {
        return a.a(activity);
    }

    public static Intent a(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strB = b(context, componentName);
        if (strB == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strB);
        return b(context, componentName2) == null ? android.support.v4.content.e.a(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String b(Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        return a.a(context, context.getPackageManager().getActivityInfo(componentName, ItemInfo.APP_INTENT));
    }
}
