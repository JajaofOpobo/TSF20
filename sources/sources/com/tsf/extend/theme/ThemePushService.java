package com.tsf.extend.theme;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.volley.n;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePushService extends IntentService {
    private static int a = 50000002;

    public ThemePushService() {
        super("ThemePush");
    }

    @Override // android.app.IntentService
    public void onHandleIntent(final Intent intent) {
        String stringExtra = intent.getStringExtra("icon_url");
        if (TextUtils.isEmpty(stringExtra)) {
            a((Bitmap) null, intent);
        } else {
            com.tsf.extend.base.f.c.a(getApplicationContext()).a((com.android.volley.l) new com.android.volley.toolbox.i(stringExtra, new n.b<Bitmap>() { // from class: com.tsf.extend.theme.ThemePushService.1
                @Override // com.android.volley.n.b
                public void a(Bitmap bitmap) {
                    ThemePushService.this.a(bitmap, intent);
                }
            }, 0, 0, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.theme.ThemePushService.2
                @Override // com.android.volley.n.a
                public void a(com.android.volley.s sVar) {
                    ThemePushService.this.a((Bitmap) null, intent);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Bitmap bitmap, final Intent intent) {
        final int iIntValue;
        try {
            iIntValue = Integer.valueOf(intent.getStringExtra("notification_style")).intValue();
        } catch (Exception e) {
            iIntValue = 0;
        }
        if (iIntValue == 1) {
            String stringExtra = intent.getStringExtra("expand_noti_bg_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                com.tsf.extend.base.f.c.a(getApplicationContext()).a((com.android.volley.l) new com.android.volley.toolbox.i(stringExtra, new n.b<Bitmap>() { // from class: com.tsf.extend.theme.ThemePushService.3
                    @Override // com.android.volley.n.b
                    public void a(Bitmap bitmap2) {
                        ThemePushService.this.a(intent, bitmap, bitmap2, null, iIntValue);
                    }
                }, 0, 0, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.theme.ThemePushService.4
                    @Override // com.android.volley.n.a
                    public void a(com.android.volley.s sVar) {
                        ThemePushService.this.a(bitmap, intent, iIntValue);
                    }
                }));
                return;
            } else {
                a(bitmap, intent, iIntValue);
                return;
            }
        }
        a(bitmap, intent, iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Bitmap bitmap, final Intent intent, final int i) {
        String stringExtra = intent.getStringExtra("icon_big_url");
        if (i == 5 && !TextUtils.isEmpty(stringExtra)) {
            com.tsf.extend.base.f.c.a(getApplicationContext()).a((com.android.volley.l) new com.android.volley.toolbox.i(stringExtra, new n.b<Bitmap>() { // from class: com.tsf.extend.theme.ThemePushService.5
                @Override // com.android.volley.n.b
                public void a(Bitmap bitmap2) {
                    ThemePushService.this.a(intent, bitmap, null, bitmap2, i);
                }
            }, 0, 0, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.theme.ThemePushService.6
                @Override // com.android.volley.n.a
                public void a(com.android.volley.s sVar) {
                    ThemePushService.this.a(intent, bitmap, null, null, i);
                }
            }));
        } else {
            a(intent, bitmap, null, null, i);
        }
    }

    @TargetApi(16)
    void a(final Intent intent, Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final int i) {
        String str;
        RemoteViews remoteViewsA;
        Notification notificationBuild;
        int intExtra = intent.getIntExtra("action", -1);
        if (intExtra != -1) {
            if (bitmap == null) {
                com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.theme.ThemePushService.7
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap bitmapA = ThemePushService.this.a(intent);
                        if (bitmapA != null) {
                            ThemePushService.this.a(intent, bitmapA, bitmap2, bitmap3, i);
                        }
                    }
                });
                return;
            }
            Context applicationContext = getApplicationContext();
            String stringExtra = intent.getStringExtra("title");
            String stringExtra2 = intent.getStringExtra("subtitle");
            String stringExtra3 = intent.getStringExtra("pushid");
            g gVar = new g(applicationContext);
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(applicationContext.getPackageName());
            int iA = a(intent, intExtra);
            StringBuilder sb = new StringBuilder("cmlauncher://");
            if (intExtra == 1) {
                str = "theme";
            } else {
                str = intExtra == 3 ? "theme_album" : "wallpaper";
            }
            sb.append(str);
            sb.append("?type=");
            sb.append("notiftion_call");
            sb.append("&id=");
            sb.append(intent.getStringExtra("id"));
            sb.append("&icon_url=");
            sb.append(intent.getStringExtra("icon_url"));
            sb.append("&channel=");
            sb.append(intent.getStringExtra("channel"));
            sb.append("&subtitle=");
            sb.append(intent.getStringExtra("subtitle"));
            sb.append("&pushid=");
            sb.append(intent.getStringExtra("pushid"));
            sb.append("&action=");
            sb.append(intExtra);
            sb.append("&title=");
            sb.append(intent.getStringExtra("title"));
            intent2.setData(Uri.parse(sb.toString()));
            intent2.putExtra("theme_entry", "push");
            gVar.setContentIntent(PendingIntent.getActivity(applicationContext, a(), intent2, 134217728));
            Intent intent3 = new Intent("com.ksmobile.launcher.theme_push_notification_remove");
            intent3.putExtra("pushid", stringExtra3);
            intent3.putExtra("action", intExtra);
            if (intExtra == 1) {
                gVar.setDeleteIntent(PendingIntent.getBroadcast(applicationContext, a(), intent3, 134217728));
            }
            gVar.setAutoCancel(true);
            gVar.setTicker(stringExtra);
            gVar.setSmallIcon(f.d.logo);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                if (gVar != null) {
                    gVar.setChannelId("1");
                }
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            if (Build.VERSION.SDK_INT >= 16 && bitmap2 != null) {
                gVar.setContentTitle(stringExtra);
                gVar.setContentText(stringExtra2);
                Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
                bigPictureStyle.bigPicture(bitmap2);
                bigPictureStyle.bigLargeIcon(bitmap);
                bigPictureStyle.setSummaryText(stringExtra2);
                gVar.setStyle(bigPictureStyle);
                gVar.setLargeIcon(bitmap);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel2 = new NotificationChannel("1", "notification", 2);
                    if (gVar != null) {
                        gVar.setChannelId("1");
                    }
                    if (notificationManager != null) {
                        notificationManager.createNotificationChannel(notificationChannel2);
                    }
                }
                if (intExtra == 1 && !TextUtils.isEmpty(intent.getStringExtra("goto_gp_url"))) {
                    int iA2 = a();
                    sb.append("&notification_id=" + iA);
                    sb.append("&goto_gp_url=" + intent.getStringExtra("goto_gp_url"));
                    Uri uri = Uri.parse(sb.toString());
                    Intent intent4 = new Intent("android.intent.action.VIEW");
                    intent4.setPackage(applicationContext.getPackageName());
                    intent4.setData(uri);
                    gVar.addAction(0, applicationContext.getResources().getString(f.g.push_theme_install), PendingIntent.getActivity(applicationContext, iA2, intent4, 134217728));
                }
                notificationBuild = gVar.build();
            } else {
                Notification notificationBuild2 = gVar.build();
                if (i == 5 && bitmap3 != null) {
                    remoteViewsA = new RemoteViews(applicationContext.getPackageName(), f.C0052f.theme_notifition_image);
                } else {
                    remoteViewsA = a(applicationContext, i);
                }
                remoteViewsA.setTextViewText(f.e.theme_notify_title, stringExtra);
                if (remoteViewsA.getLayoutId() == f.C0052f.theme_notifition) {
                    remoteViewsA.setTextViewText(f.e.theme_notify_text, stringExtra2);
                }
                if (i == 5 && bitmap3 != null) {
                    remoteViewsA.setImageViewBitmap(f.e.theme_notify_type_icon, bitmap3);
                } else {
                    remoteViewsA.setImageViewBitmap(f.e.theme_notify_type_icon, bitmap);
                }
                notificationBuild2.contentView = remoteViewsA;
                notificationBuild = notificationBuild2;
            }
            notificationBuild.defaults |= -1;
            notificationManager.notify(iA, notificationBuild);
        }
    }

    private RemoteViews a(Context context, int i) {
        RemoteViews remoteViews = null;
        if (i == 0) {
            remoteViews = new RemoteViews(context.getPackageName(), f.C0052f.theme_notifition);
        } else if (i == 2) {
            remoteViews = new RemoteViews(context.getPackageName(), f.C0052f.theme_notifition_normal);
        } else if (i == 3) {
            remoteViews = new RemoteViews(context.getPackageName(), f.C0052f.theme_notifition_big_icon);
        } else if (i == 4) {
            remoteViews = new RemoteViews(context.getPackageName(), f.C0052f.theme_notifition_bg);
        }
        if (remoteViews == null) {
            return new RemoteViews(context.getPackageName(), f.C0052f.theme_notifition);
        }
        return remoteViews;
    }

    private int a(Intent intent, int i) {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Intent intent) {
        return null;
    }

    public static int a() {
        int i = a;
        a = i + 1;
        return i;
    }
}
