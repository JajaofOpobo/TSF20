package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private static ArrayList<com.tsf.shell.plugin.themepicker.icondesigner.a> b(Context context, String str) {
        ArrayList<com.tsf.shell.plugin.themepicker.icondesigner.a> arrayList = new ArrayList<>();
        Cursor query = context.getContentResolver().query(g.g, null, g.b + "=?", new String[]{str}, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(g.a);
            int columnIndex2 = query.getColumnIndex(g.d);
            int columnIndex3 = query.getColumnIndex(g.c);
            int columnIndex4 = query.getColumnIndex(g.f);
            int columnIndex5 = query.getColumnIndex(g.e);
            int columnIndex6 = query.getColumnIndex(g.b);
            while (query.moveToNext()) {
                com.tsf.shell.plugin.themepicker.icondesigner.a aVar = new com.tsf.shell.plugin.themepicker.icondesigner.a();
                aVar.a = query.getString(columnIndex);
                aVar.b = query.getInt(columnIndex2);
                aVar.d = query.getFloat(columnIndex3);
                aVar.e = query.getInt(columnIndex4) > 0;
                aVar.f = query.getString(columnIndex5);
                aVar.c = query.getString(columnIndex6);
                arrayList.add(aVar);
            }
            query.close();
        }
        return arrayList;
    }

    public static ArrayList<com.tsf.shell.plugin.themepicker.icondesigner.a> a(Context context) {
        return b(context, "iconback");
    }

    public static void a(final Context context, final a aVar) {
        com.tsf.shell.plugin.themepicker.utils.a.c.execute(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.icondesigner.c.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList<ResolveInfo> b = c.b(context);
                ArrayList e = c.e(context);
                Iterator<ResolveInfo> it = b.iterator();
                while (it.hasNext()) {
                    ResolveInfo next = it.next();
                    if (!c.b(context, next, e)) {
                        Context f = c.f(context, next.activityInfo.packageName);
                        b bVar = null;
                        if (0 == 0) {
                            bVar = c.f(f);
                        }
                        if (bVar != null) {
                            bVar.a(context, f);
                        }
                        c.b(context, f);
                    }
                }
                c.b(context, b, e);
                com.tsf.shell.plugin.themepicker.e.b("updateInstalledThemeInfo Cost:" + (System.currentTimeMillis() - currentTimeMillis));
                aVar.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, ArrayList<ResolveInfo> arrayList, ArrayList<e> arrayList2) {
        boolean z;
        Iterator<e> it = arrayList2.iterator();
        while (it.hasNext()) {
            e next = it.next();
            Iterator<ResolveInfo> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                } else if (next.a.equals(it2.next().activityInfo.packageName)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                d(context, next.a);
                c(context, next.a);
                com.tsf.shell.plugin.themepicker.e.b("delete package data :" + next.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, ResolveInfo resolveInfo, ArrayList<e> arrayList) {
        String str = resolveInfo.activityInfo.packageName;
        int e = e(context, str);
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.a.equals(str)) {
                if (next.b == e) {
                    return true;
                }
                c(context, str);
                return false;
            }
        }
        return false;
    }

    private static void c(Context context, String str) {
        com.tsf.shell.plugin.themepicker.e.b("Success Delete :" + context.getContentResolver().delete(g.g, g.a + "=?", new String[]{str}));
    }

    private static void d(Context context, String str) {
        com.tsf.shell.plugin.themepicker.e.b("Success Delete :" + context.getContentResolver().delete(f.c, f.a + "=?", new String[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<e> e(Context context) {
        ArrayList<e> arrayList = new ArrayList<>();
        Cursor query = context.getContentResolver().query(f.c, null, null, null, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(f.a);
            int columnIndex2 = query.getColumnIndex(f.b);
            while (query.moveToNext()) {
                e eVar = new e();
                eVar.a = query.getString(columnIndex);
                eVar.b = query.getInt(columnIndex2);
                arrayList.add(eVar);
            }
            query.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Context context2) {
        Uri uri = f.c;
        String packageName = context2.getPackageName();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(f.b, Integer.valueOf(e(context, packageName)));
            contentValues.put(f.a, packageName);
            context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.tsf.shell.plugin.themepicker.e.b("insert new package info");
    }

    private static int e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b f(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("appfilter", "xml", context.getPackageName());
            b bVar = new b();
            XmlResourceParser xml = context.getResources().getXml(identifier);
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("iconback")) {
                        int attributeCount = xml.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            bVar.a.add(xml.getAttributeValue(i));
                        }
                    } else if (xml.getName().equals("iconupon")) {
                        int attributeCount2 = xml.getAttributeCount();
                        for (int i2 = 0; i2 < attributeCount2; i2++) {
                            bVar.b.add(xml.getAttributeValue(i2));
                        }
                    } else if (xml.getName().equals("iconupon")) {
                        bVar.c = Float.parseFloat(xml.getAttributeValue(0));
                    }
                } else if (xml.getEventType() != 3 && xml.getEventType() == 4) {
                }
                xml.next();
            }
            return bVar;
        } catch (Exception e) {
            com.tsf.shell.plugin.themepicker.e.a(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context f(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            com.tsf.shell.plugin.themepicker.e.a(e.getMessage());
            return null;
        }
    }

    public static ArrayList<ResolveInfo> b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<ResolveInfo> arrayList = new ArrayList<>();
        a(packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0), arrayList);
        a(packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0), arrayList);
        a(packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), arrayList);
        return arrayList;
    }

    private static void a(List<ResolveInfo> list, ArrayList<ResolveInfo> arrayList) {
        boolean z;
        for (ResolveInfo resolveInfo : list) {
            Iterator<ResolveInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (resolveInfo.activityInfo.packageName.equals(it.next().activityInfo.packageName)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(resolveInfo);
            }
        }
    }
}
