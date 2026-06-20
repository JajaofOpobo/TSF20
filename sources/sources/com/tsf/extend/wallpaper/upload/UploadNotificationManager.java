package com.tsf.extend.wallpaper.upload;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import com.tsf.extend.base.j.HandlerUtils;
import com.tsf.extend.ResourceIds;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class UploadNotificationManager {
    public Context a;
    private int b;
    private RemoteViews c;
    private Bitmap d;
    private NotificationManager e;
    private Notification f;

    /* JADX INFO: renamed from: com.tsf.extend.wallpaper.upload.a$a, reason: collision with other inner class name */
    public enum EnumC0071a {
        progress,
        done,
        failed,
        cancel
    }

    public a(Context context, int i) {
        this(context);
        this.b = i;
    }

    public a(Context context) {
        this.b = 10000;
        this.f = null;
        this.a = context;
        this.e = (NotificationManager) this.a.getSystemService("notification");
        Notification.Builder builder = new Notification.Builder(context);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (this.e != null) {
                this.e.createNotificationChannel(notificationChannel);
            }
        }
        this.f = builder.build();
    }

    public void a(EnumC0071a enumC0071a, int i) {
        switch (enumC0071a) {
            case progress:
                if (this.ResourceIds.contentView == null || this.ResourceIds.contentView != this.c) {
                    this.c = new RemoteViews(this.a.getPackageName(), ResourceIds.C0052f.service_notify_upload);
                    a(this.c, enumC0071a);
                    this.ResourceIds.contentView = this.c;
                    this.c.setOnClickPendingIntent(ResourceIds.e.image_right, a(this.a, "com.ksmobile.launcher.uwpp.action_cancel"));
                }
                this.ResourceIds.contentView.setProgressBar(ResourceIds.e.progress, 100, i, false);
                this.e.notify(this.b, this.f);
                break;
            case done:
                RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), ResourceIds.C0052f.service_notify_upload);
                a(remoteViews, enumC0071a);
                this.ResourceIds.contentView = remoteViews;
                this.e.notify(this.b, this.f);
                z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        UploadNotificationManager.this.a();
                    }
                }, 2000L);
                break;
            case failed:
                RemoteViews remoteViews2 = new RemoteViews(this.a.getPackageName(), ResourceIds.C0052f.service_notify_upload);
                a(remoteViews2, enumC0071a);
                this.ResourceIds.contentView = remoteViews2;
                remoteViews2.setOnClickPendingIntent(ResourceIds.e.image_right, a(this.a, "com.ksmobile.launcher.uwpp.action_retry"));
                this.e.notify(this.b, this.f);
                break;
            case cancel:
                a();
                break;
        }
    }

    public void a() {
        this.e.cancel(this.b);
    }

    public void a(Bitmap bitmap) {
        this.d = bitmap;
    }

    public void a(RemoteViews remoteViews, EnumC0071a enumC0071a) {
        switch (enumC0071a) {
            case progress:
                remoteViews.setTextViewText(ResourceIds.e.title, this.a.getResources().getString(ResourceIds.g.upload_wallpaper_submitting));
                remoteViews.setViewVisibility(ResourceIds.e.image_right, 0);
                remoteViews.setImageViewResource(ResourceIds.e.image_right, ResourceIds.d.tip_close);
                remoteViews.setViewVisibility(ResourceIds.e.progress, 0);
                this.ResourceIds.icon = ResourceIds.d.icon_upload_wallpaper;
                this.ResourceIds.tickerText = this.a.getResources().getString(ResourceIds.g.upload_wallpaper_submitting);
                this.ResourceIds.flags = 2;
                break;
            case done:
                remoteViews.setTextViewText(ResourceIds.e.title, this.a.getResources().getString(ResourceIds.g.upload_wallpaper_submit_success));
                remoteViews.setViewVisibility(ResourceIds.e.image_right, 8);
                remoteViews.setViewVisibility(ResourceIds.e.progress, 8);
                this.ResourceIds.icon = ResourceIds.d.icon_confirm;
                this.ResourceIds.tickerText = this.a.getResources().getString(ResourceIds.g.upload_wallpaper_submit_success);
                this.ResourceIds.flags = 16;
                break;
            case failed:
                remoteViews.setTextViewText(ResourceIds.e.title, this.a.getResources().getString(ResourceIds.g.upload_wallpaper_submit_failed));
                remoteViews.setViewVisibility(ResourceIds.e.image_right, 0);
                remoteViews.setImageViewResource(ResourceIds.e.image_right, ResourceIds.d.icon_btn_refresh);
                remoteViews.setViewVisibility(ResourceIds.e.progress, 8);
                this.ResourceIds.icon = ResourceIds.d.icon_btn_refresh;
                this.ResourceIds.tickerText = this.a.getResources().getString(ResourceIds.g.upload_wallpaper_submit_failed);
                this.ResourceIds.flags = 16;
                break;
        }
        if (this.d == null) {
            remoteViews.setImageViewResource(ResourceIds.e.image_icon, ResourceIds.d.ic_launcher);
        } else {
            remoteViews.setImageViewBitmap(ResourceIds.e.image_icon, this.d);
        }
    }

    protected PendingIntent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("notification_id", this.b);
        return PendingIntent.getBroadcast(context, this.b + 1, intent, 134217728);
    }
}
