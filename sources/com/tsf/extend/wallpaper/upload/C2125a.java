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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1455z;
/* renamed from: com.tsf.extend.wallpaper.upload.a */
/* loaded from: classes.dex */
public class C2125a {

    /* renamed from: a */
    public Context f6971a;

    /* renamed from: b */
    private int f6972b;

    /* renamed from: c */
    private RemoteViews f6973c;

    /* renamed from: d */
    private Bitmap f6974d;

    /* renamed from: e */
    private NotificationManager f6975e;

    /* renamed from: f */
    private Notification f6976f;

    /* renamed from: com.tsf.extend.wallpaper.upload.a$a */
    /* loaded from: classes.dex */
    public enum EnumC2128a {
        progress,
        done,
        failed,
        cancel
    }

    public C2125a(Context context, int i) {
        this(context);
        this.f6972b = i;
    }

    public C2125a(Context context) {
        this.f6972b = 10000;
        this.f6976f = null;
        this.f6971a = context;
        this.f6975e = (NotificationManager) this.f6971a.getSystemService("notification");
        Notification.Builder builder = new Notification.Builder(context);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (this.f6975e != null) {
                this.f6975e.createNotificationChannel(notificationChannel);
            }
        }
        this.f6976f = builder.build();
    }

    /* renamed from: a */
    public void m6311a(EnumC2128a enumC2128a, int i) {
        switch (enumC2128a) {
            case progress:
                if (this.f6976f.contentView == null || this.f6976f.contentView != this.f6973c) {
                    this.f6973c = new RemoteViews(this.f6971a.getPackageName(), C1536f.C1542f.service_notify_upload);
                    m6312a(this.f6973c, enumC2128a);
                    this.f6976f.contentView = this.f6973c;
                    this.f6973c.setOnClickPendingIntent(C1536f.C1541e.image_right, m6314a(this.f6971a, "com.ksmobile.launcher.uwpp.action_cancel"));
                }
                this.f6976f.contentView.setProgressBar(C1536f.C1541e.progress, 100, i, false);
                this.f6975e.notify(this.f6972b, this.f6976f);
                return;
            case done:
                RemoteViews remoteViews = new RemoteViews(this.f6971a.getPackageName(), C1536f.C1542f.service_notify_upload);
                m6312a(remoteViews, enumC2128a);
                this.f6976f.contentView = remoteViews;
                this.f6975e.notify(this.f6972b, this.f6976f);
                C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2125a.this.m6315a();
                    }
                }, 2000L);
                return;
            case failed:
                RemoteViews remoteViews2 = new RemoteViews(this.f6971a.getPackageName(), C1536f.C1542f.service_notify_upload);
                m6312a(remoteViews2, enumC2128a);
                this.f6976f.contentView = remoteViews2;
                remoteViews2.setOnClickPendingIntent(C1536f.C1541e.image_right, m6314a(this.f6971a, "com.ksmobile.launcher.uwpp.action_retry"));
                this.f6975e.notify(this.f6972b, this.f6976f);
                return;
            case cancel:
                m6315a();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m6315a() {
        this.f6975e.cancel(this.f6972b);
    }

    /* renamed from: a */
    public void m6313a(Bitmap bitmap) {
        this.f6974d = bitmap;
    }

    /* renamed from: a */
    public void m6312a(RemoteViews remoteViews, EnumC2128a enumC2128a) {
        switch (enumC2128a) {
            case progress:
                remoteViews.setTextViewText(C1536f.C1541e.title, this.f6971a.getResources().getString(C1536f.C1543g.upload_wallpaper_submitting));
                remoteViews.setViewVisibility(C1536f.C1541e.image_right, 0);
                remoteViews.setImageViewResource(C1536f.C1541e.image_right, C1536f.C1540d.tip_close);
                remoteViews.setViewVisibility(C1536f.C1541e.progress, 0);
                this.f6976f.icon = C1536f.C1540d.icon_upload_wallpaper;
                this.f6976f.tickerText = this.f6971a.getResources().getString(C1536f.C1543g.upload_wallpaper_submitting);
                this.f6976f.flags = 2;
                break;
            case done:
                remoteViews.setTextViewText(C1536f.C1541e.title, this.f6971a.getResources().getString(C1536f.C1543g.upload_wallpaper_submit_success));
                remoteViews.setViewVisibility(C1536f.C1541e.image_right, 8);
                remoteViews.setViewVisibility(C1536f.C1541e.progress, 8);
                this.f6976f.icon = C1536f.C1540d.icon_confirm;
                this.f6976f.tickerText = this.f6971a.getResources().getString(C1536f.C1543g.upload_wallpaper_submit_success);
                this.f6976f.flags = 16;
                break;
            case failed:
                remoteViews.setTextViewText(C1536f.C1541e.title, this.f6971a.getResources().getString(C1536f.C1543g.upload_wallpaper_submit_failed));
                remoteViews.setViewVisibility(C1536f.C1541e.image_right, 0);
                remoteViews.setImageViewResource(C1536f.C1541e.image_right, C1536f.C1540d.icon_btn_refresh);
                remoteViews.setViewVisibility(C1536f.C1541e.progress, 8);
                this.f6976f.icon = C1536f.C1540d.icon_btn_refresh;
                this.f6976f.tickerText = this.f6971a.getResources().getString(C1536f.C1543g.upload_wallpaper_submit_failed);
                this.f6976f.flags = 16;
                break;
        }
        if (this.f6974d == null) {
            remoteViews.setImageViewResource(C1536f.C1541e.image_icon, C1536f.C1540d.ic_launcher);
        } else {
            remoteViews.setImageViewBitmap(C1536f.C1541e.image_icon, this.f6974d);
        }
    }

    /* renamed from: a */
    protected PendingIntent m6314a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("notification_id", this.f6972b);
        return PendingIntent.getBroadcast(context, this.f6972b + 1, intent, 134217728);
    }
}
