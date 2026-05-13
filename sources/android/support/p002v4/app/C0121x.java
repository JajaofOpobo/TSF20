package android.support.p002v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.p002v4.content.C0150e;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* renamed from: android.support.v4.app.x */
/* loaded from: classes.dex */
public final class C0121x {

    /* renamed from: a */
    private static final InterfaceC0122a f400a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.x$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0122a {
        /* renamed from: a */
        Intent mo13433a(Activity activity);

        /* renamed from: a */
        String mo13431a(Context context, ActivityInfo activityInfo);

        /* renamed from: a */
        boolean mo13432a(Activity activity, Intent intent);

        /* renamed from: b */
        void mo13429b(Activity activity, Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.x$b */
    /* loaded from: classes.dex */
    public static class C0123b implements InterfaceC0122a {
        C0123b() {
        }

        @Override // android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: a */
        public Intent mo13433a(Activity activity) {
            Intent intent = null;
            String m13436b = C0121x.m13436b(activity);
            if (m13436b != null) {
                ComponentName componentName = new ComponentName(activity, m13436b);
                try {
                    intent = C0121x.m13434b(activity, componentName) == null ? C0150e.m13396a(componentName) : new Intent().setComponent(componentName);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m13436b + "' in manifest");
                }
            }
            return intent;
        }

        @Override // android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: a */
        public boolean mo13432a(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }

        @Override // android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: b */
        public void mo13429b(Activity activity, Intent intent) {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }

        @Override // android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: a */
        public String mo13431a(Context context, ActivityInfo activityInfo) {
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

    /* renamed from: android.support.v4.app.x$c */
    /* loaded from: classes.dex */
    static class C0124c extends C0123b {
        C0124c() {
        }

        @Override // android.support.p002v4.app.C0121x.C0123b, android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: a */
        public Intent mo13433a(Activity activity) {
            Intent m13428a = C0125y.m13428a(activity);
            if (m13428a == null) {
                return m13430b(activity);
            }
            return m13428a;
        }

        /* renamed from: b */
        Intent m13430b(Activity activity) {
            return super.mo13433a(activity);
        }

        @Override // android.support.p002v4.app.C0121x.C0123b, android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: a */
        public boolean mo13432a(Activity activity, Intent intent) {
            return C0125y.m13427a(activity, intent);
        }

        @Override // android.support.p002v4.app.C0121x.C0123b, android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: b */
        public void mo13429b(Activity activity, Intent intent) {
            C0125y.m13425b(activity, intent);
        }

        @Override // android.support.p002v4.app.C0121x.C0123b, android.support.p002v4.app.C0121x.InterfaceC0122a
        /* renamed from: a */
        public String mo13431a(Context context, ActivityInfo activityInfo) {
            String m13426a = C0125y.m13426a(activityInfo);
            if (m13426a == null) {
                return super.mo13431a(context, activityInfo);
            }
            return m13426a;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f400a = new C0124c();
        } else {
            f400a = new C0123b();
        }
    }

    /* renamed from: a */
    public static boolean m13438a(Activity activity, Intent intent) {
        return f400a.mo13432a(activity, intent);
    }

    /* renamed from: b */
    public static void m13435b(Activity activity, Intent intent) {
        f400a.mo13429b(activity, intent);
    }

    /* renamed from: a */
    public static Intent m13439a(Activity activity) {
        return f400a.mo13433a(activity);
    }

    /* renamed from: a */
    public static Intent m13437a(Context context, ComponentName componentName) {
        String m13434b = m13434b(context, componentName);
        if (m13434b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m13434b);
        return m13434b(context, componentName2) == null ? C0150e.m13396a(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: b */
    public static String m13436b(Activity activity) {
        try {
            return m13434b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static String m13434b(Context context, ComponentName componentName) {
        return f400a.mo13431a(context, context.getPackageManager().getActivityInfo(componentName, ItemInfo.APP_INTENT));
    }
}
