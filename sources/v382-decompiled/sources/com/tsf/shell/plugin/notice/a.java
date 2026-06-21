package com.tsf.shell.plugin.notice;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.ag;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class a {
    public static void a(Context context, NodeList nodeList) {
        NodeList childNodes = nodeList.item(0).getChildNodes();
        int length = childNodes.getLength();
        PackageManager packageManager = context.getPackageManager();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        for (int i = 0; i < length; i++) {
            try {
                Element element = (Element) childNodes.item(i);
                String attribute = element.getAttribute("id");
                if (!attribute.equals("") && a(context, attribute, Integer.valueOf(element.getAttribute("max")).intValue())) {
                    String attribute2 = element.getAttribute("packageName");
                    if (!i.a(packageManager, attribute2)) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(element.getAttribute("intent")));
                        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
                        byte[] a = d.a(element.getAttribute("iconUrl"));
                        notificationManager.notify(i + 100, new ag(context).a(g.ic_update).a(activity).a(element.getAttribute("title")).a(Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(a, 0, a.length), 96, 96, true)).a(System.currentTimeMillis()).b(element.getAttribute("text")).a(true).a());
                    }
                    e.c("Notify App recommend : " + attribute2);
                }
            } catch (Exception e) {
                e.c(e.getMessage());
            }
        }
    }

    public static boolean a(Context context, String str, int i) {
        String str2 = "app_recommend_id_" + str;
        int i2 = context.getSharedPreferences("update_info", 0).getInt(str2, 0);
        if (i2 > i) {
            return false;
        }
        context.getSharedPreferences("update_info", 0).edit().putInt(str2, i2 + 1).commit();
        return true;
    }
}
