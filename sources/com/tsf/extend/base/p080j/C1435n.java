package com.tsf.extend.base.p080j;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.tsf.extend.base.p080j.C1453y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.extend.base.j.n */
/* loaded from: classes.dex */
public class C1435n {

    /* renamed from: a */
    private static final HashMap<ComponentName, ArrayList<String>> f4429a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<ComponentName, String> f4430b = new HashMap<>();

    /* renamed from: a */
    public static ComponentName m8633a(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://www.example.com"));
        return m8630a(context.getPackageManager(), intent, C1453y.m8569b(context, "raw", "browser"), true);
    }

    /* renamed from: a */
    private static ComponentName m8630a(PackageManager packageManager, Intent intent, List<C1453y.C1454a> list, boolean z) {
        ResolveInfo m8627b = m8627b(packageManager, intent, list, z);
        if (m8627b != null) {
            return new ComponentName(m8627b.activityInfo.packageName, m8627b.activityInfo.name);
        }
        return null;
    }

    /* renamed from: b */
    private static ResolveInfo m8627b(PackageManager packageManager, Intent intent, List<C1453y.C1454a> list, boolean z) {
        return m8629a(packageManager, intent, list, true, z);
    }

    /* renamed from: a */
    private static ResolveInfo m8631a(PackageManager packageManager, Intent intent) {
        ResolveInfo resolveInfo;
        Intent launchIntentForPackage;
        try {
            resolveInfo = packageManager.resolveActivity(intent, 65536);
        } catch (Exception e) {
            e.printStackTrace();
            resolveInfo = null;
        }
        if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName != null && !resolveInfo.activityInfo.packageName.equals("android")) {
            if (intent.getDataString() != null && intent.getDataString().startsWith("http") && (launchIntentForPackage = packageManager.getLaunchIntentForPackage(resolveInfo.activityInfo.packageName)) != null) {
                resolveInfo.activityInfo.packageName = launchIntentForPackage.getComponent().getPackageName();
                resolveInfo.activityInfo.name = launchIntentForPackage.getComponent().getClassName();
                return resolveInfo;
            }
            Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                    if (resolveInfo.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        return resolveInfo2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static ResolveInfo m8629a(PackageManager packageManager, Intent intent, List<C1453y.C1454a> list, boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        ResolveInfo m8631a;
        List<ResolveInfo> list2;
        ResolveInfo m8631a2;
        if (!z2 || (m8631a2 = m8631a(packageManager, intent)) == null) {
            if (list != null) {
                Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
                intent2.addCategory("android.intent.category.LAUNCHER");
                arrayList = new ArrayList();
                for (C1453y.C1454a c1454a : list) {
                    if (c1454a.f4460b != null) {
                        intent2.setPackage(c1454a.f4460b.getPackageName());
                        try {
                            list2 = packageManager.queryIntentActivities(intent2, 0);
                        } catch (Exception e) {
                            list2 = null;
                        }
                        if (list2 != null) {
                            for (ResolveInfo resolveInfo : list2) {
                                if (c1454a.f4460b.getClassName().equals(resolveInfo.activityInfo.name)) {
                                    return resolveInfo;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        arrayList.add(c1454a.f4461c);
                    }
                }
            } else {
                arrayList = null;
            }
            if (z2 || (m8631a = m8631a(packageManager, intent)) == null) {
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                    ArrayList<ResolveInfo> arrayList2 = new ArrayList();
                    Intent intent3 = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent3.addCategory("android.intent.category.LAUNCHER");
                    for (int size = queryIntentActivities.size() - 1; size >= 0; size--) {
                        intent3.setPackage(queryIntentActivities.get(size).activityInfo.packageName);
                        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent3, 0);
                        if (queryIntentActivities2 != null) {
                            String str = queryIntentActivities.get(size).activityInfo.name;
                            Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (str.equals(it.next().activityInfo.name)) {
                                        z3 = true;
                                        break;
                                    }
                                } else {
                                    z3 = false;
                                    break;
                                }
                            }
                            if (z3) {
                                arrayList2.add(queryIntentActivities.get(size));
                            }
                        }
                    }
                    if (arrayList != null) {
                        for (ResolveInfo resolveInfo2 : arrayList2) {
                            if (arrayList.indexOf(resolveInfo2.activityInfo.packageName) >= 0) {
                                return resolveInfo2;
                            }
                        }
                        for (ResolveInfo resolveInfo3 : queryIntentActivities) {
                            if (arrayList.indexOf(resolveInfo3.activityInfo.packageName) >= 0) {
                                return resolveInfo3;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        return (ResolveInfo) arrayList2.get(0);
                    }
                    if (!z) {
                        return queryIntentActivities.get(0);
                    }
                }
                return null;
            }
            return m8631a;
        }
        return m8631a2;
    }

    /* renamed from: a */
    public static Intent m8632a(Context context, String str) {
        ComponentName m8633a;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (context != null && (m8633a = m8633a(context)) != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                int size = queryIntentActivities.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (!m8633a.getPackageName().equals(queryIntentActivities.get(size).activityInfo.packageName)) {
                        size--;
                    } else {
                        intent.setComponent(new ComponentName(queryIntentActivities.get(size).activityInfo.packageName, queryIntentActivities.get(size).activityInfo.name));
                        break;
                    }
                }
            }
            return intent;
        }
        return intent;
    }

    /* renamed from: a */
    public static void m8634a(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            try {
                activity.startActivityForResult(intent, i);
                return;
            } catch (Exception e) {
            }
        }
        Intent intent2 = new Intent("android.intent.action.PICK", (Uri) null);
        intent2.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        try {
            activity.startActivityForResult(intent2, i);
        } catch (Exception e2) {
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT", (Uri) null);
            intent3.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            try {
                activity.startActivityForResult(intent3, i);
            } catch (Exception e3) {
            }
        }
    }

    /* renamed from: b */
    public static void m8628b(Context context) {
        Intent m8632a;
        try {
            if (context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") != null) {
                if (context.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode >= 3002850) {
                    m8632a = new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=http://www.facebook.com/cmlauncher"));
                } else {
                    m8632a = new Intent("android.intent.action.VIEW", Uri.parse("fb://profile/1516667955272198"));
                }
            } else {
                m8632a = m8632a(context, "http://www.facebook.com/cmlauncher");
            }
            context.startActivity(m8632a);
        } catch (Exception e) {
        }
    }
}
