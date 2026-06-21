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
    private static ArrayList b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(h.g, null, String.valueOf(h.b) + "=?", new String[]{str}, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(h.a);
            int columnIndex2 = query.getColumnIndex(h.d);
            int columnIndex3 = query.getColumnIndex(h.c);
            int columnIndex4 = query.getColumnIndex(h.f);
            int columnIndex5 = query.getColumnIndex(h.e);
            int columnIndex6 = query.getColumnIndex(h.b);
            while (query.moveToNext()) {
                a aVar = new a();
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

    public static ArrayList a(Context context) {
        return b(context, "iconback");
    }

    public static void a(final Context context, final d dVar) {
        com.tsf.shell.plugin.themepicker.utils.a.c.execute(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.icondesigner.c.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList b = c.b(context);
                ArrayList e = c.e(context);
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (!c.b(context, resolveInfo, e)) {
                        Context f = c.f(context, resolveInfo.activityInfo.packageName);
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
                com.tsf.shell.plugin.themepicker.g.b("updateInstalledThemeInfo Cost:" + (System.currentTimeMillis() - currentTimeMillis));
                dVar.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (fVar.a.equals(((ResolveInfo) it2.next()).activityInfo.packageName)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                d(context, fVar.a);
                c(context, fVar.a);
                com.tsf.shell.plugin.themepicker.g.b("delete package data :" + fVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, ResolveInfo resolveInfo, ArrayList arrayList) {
        String str = resolveInfo.activityInfo.packageName;
        int e = e(context, str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.a.equals(str)) {
                if (fVar.b == e) {
                    return true;
                }
                c(context, str);
                return false;
            }
        }
        return false;
    }

    private static void c(Context context, String str) {
        com.tsf.shell.plugin.themepicker.g.b("Success Delete :" + context.getContentResolver().delete(h.g, String.valueOf(h.a) + "=?", new String[]{str}));
    }

    private static void d(Context context, String str) {
        com.tsf.shell.plugin.themepicker.g.b("Success Delete :" + context.getContentResolver().delete(g.c, String.valueOf(g.a) + "=?", new String[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList e(Context context) {
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(g.c, null, null, null, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(g.a);
            int columnIndex2 = query.getColumnIndex(g.b);
            while (query.moveToNext()) {
                f fVar = new f();
                fVar.a = query.getString(columnIndex);
                fVar.b = query.getInt(columnIndex2);
                arrayList.add(fVar);
            }
            query.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Context context2) {
        Uri uri = g.c;
        String packageName = context2.getPackageName();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(g.b, Integer.valueOf(e(context, packageName)));
            contentValues.put(g.a, packageName);
            context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.tsf.shell.plugin.themepicker.g.b("insert new package info");
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
                } else if (xml.getEventType() != 3) {
                    xml.getEventType();
                }
                xml.next();
            }
            return bVar;
        } catch (Exception e) {
            com.tsf.shell.plugin.themepicker.g.a(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context f(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            com.tsf.shell.plugin.themepicker.g.a(e.getMessage());
            return null;
        }
    }

    public static ArrayList b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        a(packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0), arrayList);
        a(packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0), arrayList);
        a(packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), arrayList);
        return arrayList;
    }

    private static void a(List list, ArrayList arrayList) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (resolveInfo.activityInfo.packageName.equals(((ResolveInfo) it2.next()).activityInfo.packageName)) {
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
