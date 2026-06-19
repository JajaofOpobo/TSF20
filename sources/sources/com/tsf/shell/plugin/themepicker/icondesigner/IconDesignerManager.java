package com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner;

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
public class IconDesignerManager {

    public interface a {
        void a();
    }

    private static ArrayList<com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.a> b(Context context, String str) {
        ArrayList<com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.a> arrayList = new ArrayList<>();
        Cursor cursorQuery = context.getContentResolver().query(IconDesignerBaseColumns.g, null, IconDesignerBaseColumns.b + "=?", new String[]{str}, null);
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex(IconDesignerBaseColumns.a);
            int columnIndex2 = cursorQuery.getColumnIndex(IconDesignerBaseColumns.d);
            int columnIndex3 = cursorQuery.getColumnIndex(IconDesignerBaseColumns.c);
            int columnIndex4 = cursorQuery.getColumnIndex(IconDesignerBaseColumns.f);
            int columnIndex5 = cursorQuery.getColumnIndex(IconDesignerBaseColumns.e);
            int columnIndex6 = cursorQuery.getColumnIndex(IconDesignerBaseColumns.b);
            while (cursorQuery.moveToNext()) {
                com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.a aVar = new com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.a();
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

    public static ArrayList<com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.a> a(Context context) {
        return b(context, "iconback");
    }

    public static void a(final Context context, final a aVar) {
        com.tsf.shell.plugin.themepicker.utils.PackageManagerHelper.c.execute(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.c.1
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
                com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("updateInstalledThemeInfo Cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
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
                com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("delete package data :" + eVar.a);
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
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("Success Delete :" + context.getContentResolver().delete(IconDesignerBaseColumns.g, IconDesignerBaseColumns.a + "=?", new String[]{str}));
    }

    private static void d(Context context, String str) {
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("Success Delete :" + context.getContentResolver().delete(IconDesignerColumns.c, IconDesignerColumns.a + "=?", new String[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<e> e(Context context) {
        ArrayList<e> arrayList = new ArrayList<>();
        Cursor cursorQuery = context.getContentResolver().query(IconDesignerColumns.c, null, null, null, null);
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex(IconDesignerColumns.a);
            int columnIndex2 = cursorQuery.getColumnIndex(IconDesignerColumns.b);
            while (cursorQuery.moveToNext()) {
                e eVar = new IconDesignerContract();
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
        Uri uri = IconDesignerColumns.c;
        String packageName = context2.getPackageName();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(IconDesignerColumns.b, Integer.valueOf(e(context, packageName)));
            contentValues.put(IconDesignerColumns.a, packageName);
            context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            IconDesignerContract.printStackTrace();
        }
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("insert new package info");
    }

    private static int e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            IconDesignerContract.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b f(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("appfilter", "xml", context.getPackageName());
            b bVar = new IconDesignerConfig();
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
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.a(IconDesignerContract.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context f(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.a(IconDesignerContract.getMessage());
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
