package com.tsf.shell.plugin.notice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import com.tsf.shell.plugin.notice.C3818f;
import com.tsf.shell.plugin.notice.C3821g;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* renamed from: com.tsf.shell.plugin.notice.b */
/* loaded from: classes.dex */
public class C3814b {
    /* renamed from: a */
    public static void m1375a(Context context, NodeList nodeList, C3821g.InterfaceC3823a interfaceC3823a, boolean z) {
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
                C3817e.m1369c("versionCode:" + intValue);
                String attribute2 = element.getAttribute("packageName");
                String attribute3 = element.getAttribute("versionName");
                PackageInfo packageInfo = packageManager.getPackageInfo(attribute2, 0);
                if (packageInfo.versionCode >= intValue) {
                    C3817e.m1369c("break by version code:" + attribute2);
                } else {
                    if (m1376a(context, attribute2 + attribute, Integer.valueOf(element.getAttribute("max")).intValue())) {
                        if (Boolean.valueOf(element.getAttribute("beta")).booleanValue() && !z) {
                            C3817e.m1369c("break by version beta:" + attribute2);
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(element.getAttribute("intent")));
                            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(((BitmapDrawable) packageInfo.applicationInfo.loadIcon(packageManager)).getBitmap(), 96, 96, true);
                            String str = ((Object) packageInfo.applicationInfo.loadLabel(packageManager)) + " v" + attribute3;
                            Notification.Builder builder = new Notification.Builder(context);
                            builder.setSmallIcon(C3818f.C3819a.ic_update).setContentIntent(activity).setContentTitle(str).setLargeIcon(createScaledBitmap).setWhen(System.currentTimeMillis()).setContentText(context.getString(C3818f.C3820b.update_notic_update_available)).setAutoCancel(true);
                            if (Build.VERSION.SDK_INT >= 26) {
                                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                                if (builder != null) {
                                    builder.setChannelId("1");
                                }
                                if (notificationManager != null) {
                                    notificationManager.createNotificationChannel(notificationChannel);
                                }
                            }
                            notificationManager.notify(i, builder.build());
                            if (packageName.equals(attribute2) && interfaceC3823a != null) {
                                interfaceC3823a.mo1360a(intValue);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C3817e.m1369c(e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static boolean m1376a(Context context, String str, int i) {
        String str2 = "app_update_id_" + str;
        int i2 = context.getSharedPreferences("update_info", 0).getInt(str2, 0);
        if (i2 <= i) {
            context.getSharedPreferences("update_info", 0).edit().putInt(str2, i2 + 1).commit();
            return true;
        }
        return false;
    }
}
