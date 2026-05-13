package com.tsf.shell.plugin.notice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import com.tsf.shell.plugin.notice.C3818f;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* renamed from: com.tsf.shell.plugin.notice.a */
/* loaded from: classes.dex */
public class C3813a {
    /* renamed from: a */
    public static void m1377a(Context context, NodeList nodeList) {
        NodeList childNodes = nodeList.item(0).getChildNodes();
        int length = childNodes.getLength();
        PackageManager packageManager = context.getPackageManager();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        for (int i = 0; i < length; i++) {
            try {
                Element element = (Element) childNodes.item(i);
                String attribute = element.getAttribute("id");
                if (!attribute.equals("") && m1378a(context, attribute, Integer.valueOf(element.getAttribute("max")).intValue())) {
                    String attribute2 = element.getAttribute("packageName");
                    if (!C3821g.m1365a(packageManager, attribute2)) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(element.getAttribute("intent")));
                        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
                        byte[] m1373a = C3816d.m1373a(element.getAttribute("iconUrl"));
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(m1373a, 0, m1373a.length), 96, 96, true);
                        String attribute3 = element.getAttribute("title");
                        String attribute4 = element.getAttribute("text");
                        Notification.Builder builder = new Notification.Builder(context);
                        builder.setSmallIcon(C3818f.C3819a.ic_update).setContentIntent(activity).setContentTitle(attribute3).setLargeIcon(createScaledBitmap).setWhen(System.currentTimeMillis()).setContentText(attribute4).setAutoCancel(true);
                        if (Build.VERSION.SDK_INT >= 26) {
                            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                            if (builder != null) {
                                builder.setChannelId("1");
                            }
                            if (notificationManager != null) {
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                        }
                        notificationManager.notify(i + 100, builder.build());
                    }
                    C3817e.m1369c("Notify App recommend : " + attribute2);
                }
            } catch (Exception e) {
                C3817e.m1369c(e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static boolean m1378a(Context context, String str, int i) {
        String str2 = "app_recommend_id_" + str;
        int i2 = context.getSharedPreferences("update_info", 0).getInt(str2, 0);
        if (i2 <= i) {
            context.getSharedPreferences("update_info", 0).edit().putInt(str2, i2 + 1).commit();
            return true;
        }
        return false;
    }
}
