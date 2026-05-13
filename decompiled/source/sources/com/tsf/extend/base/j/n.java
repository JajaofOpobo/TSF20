package com.tsf.extend.base.j;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.tsf.extend.base.j.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class n {
    private static final HashMap<ComponentName, ArrayList<String>> a = new HashMap<>();
    private static final HashMap<ComponentName, String> b = new HashMap<>();

    public static ComponentName a(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://www.example.com"));
        return a(context.getPackageManager(), intent, y.b(context, "raw", "browser"), true);
    }

    private static ComponentName a(PackageManager packageManager, Intent intent, List<y.a> list, boolean z) {
        ResolveInfo b2 = b(packageManager, intent, list, z);
        if (b2 != null) {
            return new ComponentName(b2.activityInfo.packageName, b2.activityInfo.name);
        }
        return null;
    }

    private static ResolveInfo b(PackageManager packageManager, Intent intent, List<y.a> list, boolean z) {
        return a(packageManager, intent, list, true, z);
    }

    private static ResolveInfo a(PackageManager packageManager, Intent intent) {
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

    private static ResolveInfo a(PackageManager packageManager, Intent intent, List<y.a> list, boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        ResolveInfo a2;
        List<ResolveInfo> list2;
        ResolveInfo a3;
        if (!z2 || (a3 = a(packageManager, intent)) == null) {
            if (list != null) {
                Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
                intent2.addCategory("android.intent.category.LAUNCHER");
                arrayList = new ArrayList();
                for (y.a aVar : list) {
                    if (aVar.b != null) {
                        intent2.setPackage(aVar.b.getPackageName());
                        try {
                            list2 = packageManager.queryIntentActivities(intent2, 0);
                        } catch (Exception e) {
                            list2 = null;
                        }
                        if (list2 != null) {
                            for (ResolveInfo resolveInfo : list2) {
                                if (aVar.b.getClassName().equals(resolveInfo.activityInfo.name)) {
                                    return resolveInfo;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        arrayList.add(aVar.c);
                    }
                }
            } else {
                arrayList = null;
            }
            if (z2 || (a2 = a(packageManager, intent)) == null) {
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
            return a2;
        }
        return a3;
    }

    public static Intent a(Context context, String str) {
        ComponentName a2;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (context != null && (a2 = a(context)) != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                int size = queryIntentActivities.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (!a2.getPackageName().equals(queryIntentActivities.get(size).activityInfo.packageName)) {
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

    public static void a(Activity activity, int i) {
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

    public static void b(Context context) {
        Intent a2;
        try {
            if (context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") != null) {
                if (context.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode >= 3002850) {
                    a2 = new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=http://www.facebook.com/cmlauncher"));
                } else {
                    a2 = new Intent("android.intent.action.VIEW", Uri.parse("fb://profile/1516667955272198"));
                }
            } else {
                a2 = a(context, "http://www.facebook.com/cmlauncher");
            }
            context.startActivity(a2);
        } catch (Exception e) {
        }
    }
}
