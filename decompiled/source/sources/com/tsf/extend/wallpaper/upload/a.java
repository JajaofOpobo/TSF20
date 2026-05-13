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
import com.tsf.extend.base.j.z;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class a {
    public Context a;
    private int b;
    private RemoteViews c;
    private Bitmap d;
    private NotificationManager e;
    private Notification f;

    /* renamed from: com.tsf.extend.wallpaper.upload.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
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
                if (this.f.contentView == null || this.f.contentView != this.c) {
                    this.c = new RemoteViews(this.a.getPackageName(), f.C0052f.service_notify_upload);
                    a(this.c, enumC0071a);
                    this.f.contentView = this.c;
                    this.c.setOnClickPendingIntent(f.e.image_right, a(this.a, "com.ksmobile.launcher.uwpp.action_cancel"));
                }
                this.f.contentView.setProgressBar(f.e.progress, 100, i, false);
                this.e.notify(this.b, this.f);
                return;
            case done:
                RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), f.C0052f.service_notify_upload);
                a(remoteViews, enumC0071a);
                this.f.contentView = remoteViews;
                this.e.notify(this.b, this.f);
                z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a();
                    }
                }, 2000L);
                return;
            case failed:
                RemoteViews remoteViews2 = new RemoteViews(this.a.getPackageName(), f.C0052f.service_notify_upload);
                a(remoteViews2, enumC0071a);
                this.f.contentView = remoteViews2;
                remoteViews2.setOnClickPendingIntent(f.e.image_right, a(this.a, "com.ksmobile.launcher.uwpp.action_retry"));
                this.e.notify(this.b, this.f);
                return;
            case cancel:
                a();
                return;
            default:
                return;
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
                remoteViews.setTextViewText(f.e.title, this.a.getResources().getString(f.g.upload_wallpaper_submitting));
                remoteViews.setViewVisibility(f.e.image_right, 0);
                remoteViews.setImageViewResource(f.e.image_right, f.d.tip_close);
                remoteViews.setViewVisibility(f.e.progress, 0);
                this.f.icon = f.d.icon_upload_wallpaper;
                this.f.tickerText = this.a.getResources().getString(f.g.upload_wallpaper_submitting);
                this.f.flags = 2;
                break;
            case done:
                remoteViews.setTextViewText(f.e.title, this.a.getResources().getString(f.g.upload_wallpaper_submit_success));
                remoteViews.setViewVisibility(f.e.image_right, 8);
                remoteViews.setViewVisibility(f.e.progress, 8);
                this.f.icon = f.d.icon_confirm;
                this.f.tickerText = this.a.getResources().getString(f.g.upload_wallpaper_submit_success);
                this.f.flags = 16;
                break;
            case failed:
                remoteViews.setTextViewText(f.e.title, this.a.getResources().getString(f.g.upload_wallpaper_submit_failed));
                remoteViews.setViewVisibility(f.e.image_right, 0);
                remoteViews.setImageViewResource(f.e.image_right, f.d.icon_btn_refresh);
                remoteViews.setViewVisibility(f.e.progress, 8);
                this.f.icon = f.d.icon_btn_refresh;
                this.f.tickerText = this.a.getResources().getString(f.g.upload_wallpaper_submit_failed);
                this.f.flags = 16;
                break;
        }
        if (this.d == null) {
            remoteViews.setImageViewResource(f.e.image_icon, f.d.ic_launcher);
        } else {
            remoteViews.setImageViewBitmap(f.e.image_icon, this.d);
        }
    }

    protected PendingIntent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("notification_id", this.b);
        return PendingIntent.getBroadcast(context, this.b + 1, intent, 134217728);
    }
}
