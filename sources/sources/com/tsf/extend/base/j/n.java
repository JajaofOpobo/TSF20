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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        ResolveInfo resolveInfoB = b(packageManager, intent, list, z);
        if (resolveInfoB != null) {
            return new ComponentName(resolveInfoB.activityInfo.packageName, resolveInfoB.activityInfo.name);
        }
        return null;
    }

    private static ResolveInfo b(PackageManager packageManager, Intent intent, List<y.a> list, boolean z) {
        return a(packageManager, intent, list, true, z);
    }

    private static ResolveInfo a(PackageManager packageManager, Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        Intent launchIntentForPackage;
        try {
            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        } catch (Exception e) {
            e.printStackTrace();
            resolveInfoResolveActivity = null;
        }
        if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null && resolveInfoResolveActivity.activityInfo.packageName != null && !resolveInfoResolveActivity.activityInfo.packageName.equals("android")) {
            if (intent.getDataString() != null && intent.getDataString().startsWith("http") && (launchIntentForPackage = packageManager.getLaunchIntentForPackage(resolveInfoResolveActivity.activityInfo.packageName)) != null) {
                resolveInfoResolveActivity.activityInfo.packageName = launchIntentForPackage.getComponent().getPackageName();
                resolveInfoResolveActivity.activityInfo.name = launchIntentForPackage.getComponent().getClassName();
                return resolveInfoResolveActivity;
            }
            Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setPackage(resolveInfoResolveActivity.activityInfo.packageName);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
            if (listQueryIntentActivities != null) {
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                        return resolveInfo;
                    }
                }
            }
        }
        return null;
    }

    private static ResolveInfo a(PackageManager packageManager, Intent intent, List<y.a> list, boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        ResolveInfo resolveInfoA;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo resolveInfoA2;
        if (!z2 || (resolveInfoA2 = a(packageManager, intent)) == null) {
            if (list != null) {
                Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
                intent2.addCategory("android.intent.category.LAUNCHER");
                arrayList = new ArrayList();
                for (y.a aVar : list) {
                    if (aVar.b != null) {
                        intent2.setPackage(aVar.b.getPackageName());
                        try {
                            listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                        } catch (Exception e) {
                            listQueryIntentActivities = null;
                        }
                        if (listQueryIntentActivities != null) {
                            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                                if (aVar.b.getClassName().equals(resolveInfo.activityInfo.name)) {
                                    return resolveInfo;
                                }
                            }
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
            if (z2 || (resolveInfoA = a(packageManager, intent)) == null) {
                List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
                if (listQueryIntentActivities2 != null && !listQueryIntentActivities2.isEmpty()) {
                    ArrayList<ResolveInfo> arrayList2 = new ArrayList();
                    Intent intent3 = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent3.addCategory("android.intent.category.LAUNCHER");
                    for (int size = listQueryIntentActivities2.size() - 1; size >= 0; size--) {
                        intent3.setPackage(listQueryIntentActivities2.get(size).activityInfo.packageName);
                        List<ResolveInfo> listQueryIntentActivities3 = packageManager.queryIntentActivities(intent3, 0);
                        if (listQueryIntentActivities3 != null) {
                            String str = listQueryIntentActivities2.get(size).activityInfo.name;
                            Iterator<ResolveInfo> it = listQueryIntentActivities3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                if (str.equals(it.next().activityInfo.name)) {
                                    z3 = true;
                                    break;
                                }
                            }
                            if (z3) {
                                arrayList2.add(listQueryIntentActivities2.get(size));
                            }
                        }
                    }
                    if (arrayList != null) {
                        for (ResolveInfo resolveInfo2 : arrayList2) {
                            if (arrayList.indexOf(resolveInfo2.activityInfo.packageName) >= 0) {
                                return resolveInfo2;
                            }
                        }
                        for (ResolveInfo resolveInfo3 : listQueryIntentActivities2) {
                            if (arrayList.indexOf(resolveInfo3.activityInfo.packageName) >= 0) {
                                return resolveInfo3;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        return (ResolveInfo) arrayList2.get(0);
                    }
                    if (!z) {
                        return listQueryIntentActivities2.get(0);
                    }
                }
                return null;
            }
            return resolveInfoA;
        }
        return resolveInfoA2;
    }

    public static Intent a(Context context, String str) {
        ComponentName componentNameA;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (context != null && (componentNameA = a(context)) != null) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                int size = listQueryIntentActivities.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (!componentNameA.getPackageName().equals(listQueryIntentActivities.get(size).activityInfo.packageName)) {
                        size--;
                    } else {
                        intent.setComponent(new ComponentName(listQueryIntentActivities.get(size).activityInfo.packageName, listQueryIntentActivities.get(size).activityInfo.name));
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
        Intent intentA;
        try {
            if (context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") != null) {
                if (context.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode >= 3002850) {
                    intentA = new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=http://www.facebook.com/cmlauncher"));
                } else {
                    intentA = new Intent("android.intent.action.VIEW", Uri.parse("fb://profile/1516667955272198"));
                }
            } else {
                intentA = a(context, "http://www.facebook.com/cmlauncher");
            }
            context.startActivity(intentA);
        } catch (Exception e) {
        }
    }
}
