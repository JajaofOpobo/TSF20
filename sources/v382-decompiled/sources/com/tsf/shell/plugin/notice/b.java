package com.tsf.shell.plugin.notice;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.app.ag;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class b {
    public static void a(Context context, NodeList nodeList, j jVar, boolean z) {
        NodeList childNodes = nodeList.item(0).getChildNodes();
        int length = childNodes.getLength();
        PackageManager packageManager = context.getPackageManager();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        String packageName = context.getPackageName();
        for (int i = 0; i < length; i++) {
            try {
                Element element = (Element) childNodes.item(i);
                String attribute = element.getAttribute("versionCode");
                int intValue = Integer.valueOf(attribute).intValue();
                e.c("versionCode:" + intValue);
                String attribute2 = element.getAttribute("packageName");
                String attribute3 = element.getAttribute("versionName");
                PackageInfo packageInfo = packageManager.getPackageInfo(attribute2, 0);
                if (packageInfo.versionCode >= intValue) {
                    e.c("break by version code:" + attribute2);
                } else {
                    if (a(context, String.valueOf(attribute2) + attribute, Integer.valueOf(element.getAttribute("max")).intValue())) {
                        if (Boolean.valueOf(element.getAttribute("beta")).booleanValue() && !z) {
                            e.c("break by version beta:" + attribute2);
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(element.getAttribute("intent")));
                            notificationManager.notify(i, new ag(context).a(g.ic_update).a(PendingIntent.getActivity(context, 0, intent, 134217728)).a(((Object) packageInfo.applicationInfo.loadLabel(packageManager)) + " v" + attribute3).a(Bitmap.createScaledBitmap(((BitmapDrawable) packageInfo.applicationInfo.loadIcon(packageManager)).getBitmap(), 96, 96, true)).a(System.currentTimeMillis()).b(context.getString(h.update_notic_update_available)).a(true).a());
                            if (packageName.equals(attribute2) && jVar != null) {
                                jVar.a(intValue);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.c(e.getMessage());
            }
        }
    }

    public static boolean a(Context context, String str, int i) {
        String str2 = "app_update_id_" + str;
        int i2 = context.getSharedPreferences("update_info", 0).getInt(str2, 0);
        if (i2 > i) {
            return false;
        }
        context.getSharedPreferences("update_info", 0).edit().putInt(str2, i2 + 1).commit();
        return true;
    }
}
