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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {

    public interface a {
        void a();
    }

    private static ArrayList<com.tsf.shell.plugin.themepicker.icondesigner.a> b(Context context, String str) {
        ArrayList<com.tsf.shell.plugin.themepicker.icondesigner.a> arrayList = new ArrayList<>();
        Cursor cursorQuery = context.getContentResolver().query(g.g, null, g.b + "=?", new String[]{str}, null);
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex(g.a);
            int columnIndex2 = cursorQuery.getColumnIndex(g.d);
            int columnIndex3 = cursorQuery.getColumnIndex(g.c);
            int columnIndex4 = cursorQuery.getColumnIndex(g.f);
            int columnIndex5 = cursorQuery.getColumnIndex(g.e);
            int columnIndex6 = cursorQuery.getColumnIndex(g.b);
            while (cursorQuery.moveToNext()) {
                com.tsf.shell.plugin.themepicker.icondesigner.a aVar = new com.tsf.shell.plugin.themepicker.icondesigner.a();
                aVar.a = cursorQuery.getString(columnIndex);
                aVar.b = cursorQuery.getInt(columnIndex2);
                aVar.d = cursorQuery.getFloat(columnIndex3);
                aVar.e = cursorQuery.getInt(columnIndex4) > 0;
                aVar.f = cursorQuery.getString(columnIndex5);
                aVar.c = cursorQuery.getString(columnIndex6);
                arrayList.add(aVar);
            }
            cursorQuery.close();
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
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<ResolveInfo> arrayListB = c.b(context);
                ArrayList arrayListE = c.e(context);
                for (ResolveInfo resolveInfo : arrayListB) {
                    if (!c.b(context, resolveInfo, (ArrayList<e>) arrayListE)) {
                        Context contextF = c.f(context, resolveInfo.activityInfo.packageName);
                        b bVarF = null;
                        if (0 == 0) {
                            bVarF = c.f(contextF);
                        }
                        if (bVarF != null) {
                            bVarF.a(context, contextF);
                        }
                        c.b(context, contextF);
                    }
                }
                c.b(context, arrayListB, (ArrayList<e>) arrayListE);
                com.tsf.shell.plugin.themepicker.e.b("updateInstalledThemeInfo Cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                aVar.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, ArrayList<ResolveInfo> arrayList, ArrayList<e> arrayList2) {
        boolean z;
        for (e eVar : arrayList2) {
            Iterator<ResolveInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (eVar.a.equals(it.next().activityInfo.packageName)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                d(context, eVar.a);
                c(context, eVar.a);
                com.tsf.shell.plugin.themepicker.e.b("delete package data :" + eVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, ResolveInfo resolveInfo, ArrayList<e> arrayList) {
        String str = resolveInfo.activityInfo.packageName;
        int iE = e(context, str);
        for (e eVar : arrayList) {
            if (eVar.a.equals(str)) {
                if (eVar.b == iE) {
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
        Cursor cursorQuery = context.getContentResolver().query(f.c, null, null, null, null);
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex(f.a);
            int columnIndex2 = cursorQuery.getColumnIndex(f.b);
            while (cursorQuery.moveToNext()) {
                e eVar = new e();
                eVar.a = cursorQuery.getString(columnIndex);
                eVar.b = cursorQuery.getInt(columnIndex2);
                arrayList.add(eVar);
            }
            cursorQuery.close();
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
                } else if (xml.getEventType() == 3 || xml.getEventType() != 4) {
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
                }
                if (resolveInfo.activityInfo.packageName.equals(it.next().activityInfo.packageName)) {
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
