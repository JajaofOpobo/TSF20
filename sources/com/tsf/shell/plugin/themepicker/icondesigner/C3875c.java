package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.utils.AbstractC3929a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.icondesigner.c */
/* loaded from: classes.dex */
public class C3875c {

    /* renamed from: com.tsf.shell.plugin.themepicker.icondesigner.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3877a {
        /* renamed from: a */
        void mo1276a();
    }

    /* renamed from: b */
    private static ArrayList<C3873a> m1286b(Context context, String str) {
        ArrayList<C3873a> arrayList = new ArrayList<>();
        Cursor query = context.getContentResolver().query(C3881g.f12715g, null, C3881g.f12710b + "=?", new String[]{str}, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(C3881g.f12709a);
            int columnIndex2 = query.getColumnIndex(C3881g.f12712d);
            int columnIndex3 = query.getColumnIndex(C3881g.f12711c);
            int columnIndex4 = query.getColumnIndex(C3881g.f12714f);
            int columnIndex5 = query.getColumnIndex(C3881g.f12713e);
            int columnIndex6 = query.getColumnIndex(C3881g.f12710b);
            while (query.moveToNext()) {
                C3873a c3873a = new C3873a();
                c3873a.f12688a = query.getString(columnIndex);
                c3873a.f12689b = query.getInt(columnIndex2);
                c3873a.f12691d = query.getFloat(columnIndex3);
                c3873a.f12692e = query.getInt(columnIndex4) > 0;
                c3873a.f12693f = query.getString(columnIndex5);
                c3873a.f12690c = query.getString(columnIndex6);
                arrayList.add(c3873a);
            }
            query.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList<C3873a> m1296a(Context context) {
        return m1286b(context, "iconback");
    }

    /* renamed from: a */
    public static void m1293a(final Context context, final InterfaceC3877a interfaceC3877a) {
        AbstractC3929a.f12874c.execute(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.icondesigner.c.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList<ResolveInfo> m1289b = C3875c.m1289b(context);
                ArrayList m1280e = C3875c.m1280e(context);
                Iterator<ResolveInfo> it = m1289b.iterator();
                while (it.hasNext()) {
                    ResolveInfo next = it.next();
                    if (!C3875c.m1287b(context, next, m1280e)) {
                        Context m1277f = C3875c.m1277f(context, next.activityInfo.packageName);
                        C3874b c3874b = null;
                        if (0 == 0) {
                            c3874b = C3875c.m1278f(m1277f);
                        }
                        if (c3874b != null) {
                            c3874b.m1301a(context, m1277f);
                        }
                        C3875c.m1288b(context, m1277f);
                    }
                }
                C3875c.m1285b(context, m1289b, m1280e);
                C3851e.m1317b("updateInstalledThemeInfo Cost:" + (System.currentTimeMillis() - currentTimeMillis));
                interfaceC3877a.mo1276a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m1285b(Context context, ArrayList<ResolveInfo> arrayList, ArrayList<C3879e> arrayList2) {
        boolean z;
        Iterator<C3879e> it = arrayList2.iterator();
        while (it.hasNext()) {
            C3879e next = it.next();
            Iterator<ResolveInfo> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                } else if (next.f12704a.equals(it2.next().activityInfo.packageName)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                m1281d(context, next.f12704a);
                m1283c(context, next.f12704a);
                C3851e.m1317b("delete package data :" + next.f12704a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m1287b(Context context, ResolveInfo resolveInfo, ArrayList<C3879e> arrayList) {
        String str = resolveInfo.activityInfo.packageName;
        int m1279e = m1279e(context, str);
        Iterator<C3879e> it = arrayList.iterator();
        while (it.hasNext()) {
            C3879e next = it.next();
            if (next.f12704a.equals(str)) {
                if (next.f12705b == m1279e) {
                    return true;
                }
                m1283c(context, str);
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m1283c(Context context, String str) {
        C3851e.m1317b("Success Delete :" + context.getContentResolver().delete(C3881g.f12715g, C3881g.f12709a + "=?", new String[]{str}));
    }

    /* renamed from: d */
    private static void m1281d(Context context, String str) {
        C3851e.m1317b("Success Delete :" + context.getContentResolver().delete(C3880f.f12708c, C3880f.f12706a + "=?", new String[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static ArrayList<C3879e> m1280e(Context context) {
        ArrayList<C3879e> arrayList = new ArrayList<>();
        Cursor query = context.getContentResolver().query(C3880f.f12708c, null, null, null, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(C3880f.f12706a);
            int columnIndex2 = query.getColumnIndex(C3880f.f12707b);
            while (query.moveToNext()) {
                C3879e c3879e = new C3879e();
                c3879e.f12704a = query.getString(columnIndex);
                c3879e.f12705b = query.getInt(columnIndex2);
                arrayList.add(c3879e);
            }
            query.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m1288b(Context context, Context context2) {
        Uri uri = C3880f.f12708c;
        String packageName = context2.getPackageName();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3880f.f12707b, Integer.valueOf(m1279e(context, packageName)));
            contentValues.put(C3880f.f12706a, packageName);
            context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C3851e.m1317b("insert new package info");
    }

    /* renamed from: e */
    private static int m1279e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static C3874b m1278f(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("appfilter", "xml", context.getPackageName());
            C3874b c3874b = new C3874b();
            XmlResourceParser xml = context.getResources().getXml(identifier);
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("iconback")) {
                        int attributeCount = xml.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            c3874b.f12695a.add(xml.getAttributeValue(i));
                        }
                    } else if (xml.getName().equals("iconupon")) {
                        int attributeCount2 = xml.getAttributeCount();
                        for (int i2 = 0; i2 < attributeCount2; i2++) {
                            c3874b.f12696b.add(xml.getAttributeValue(i2));
                        }
                    } else if (xml.getName().equals("iconupon")) {
                        c3874b.f12697c = Float.parseFloat(xml.getAttributeValue(0));
                    }
                } else if (xml.getEventType() != 3 && xml.getEventType() == 4) {
                }
                xml.next();
            }
            return c3874b;
        } catch (Exception e) {
            C3851e.m1319a(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static Context m1277f(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            C3851e.m1319a(e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static ArrayList<ResolveInfo> m1289b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<ResolveInfo> arrayList = new ArrayList<>();
        m1290a(packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0), arrayList);
        m1290a(packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0), arrayList);
        m1290a(packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m1290a(List<ResolveInfo> list, ArrayList<ResolveInfo> arrayList) {
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
