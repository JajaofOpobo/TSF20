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
import com.android.volley.AbstractC0795l;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.toolbox.C0837i;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1455z;
/* loaded from: classes.dex */
public class ThemePushService extends IntentService {

    /* renamed from: a */
    private static int f5246a = 50000002;

    public ThemePushService() {
        super("ThemePush");
    }

    @Override // android.app.IntentService
    public void onHandleIntent(final Intent intent) {
        String stringExtra = intent.getStringExtra("icon_url");
        if (TextUtils.isEmpty(stringExtra)) {
            m7975a((Bitmap) null, intent);
            return;
        }
        C1406c.m8766a(getApplicationContext()).m11010a((AbstractC0795l) new C0837i(stringExtra, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.theme.ThemePushService.1
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(Bitmap bitmap) {
                ThemePushService.this.m7975a(bitmap, intent);
            }
        }, 0, 0, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.ThemePushService.2
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                ThemePushService.this.m7975a((Bitmap) null, intent);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7975a(final Bitmap bitmap, final Intent intent) {
        final int i;
        try {
            i = Integer.valueOf(intent.getStringExtra("notification_style")).intValue();
        } catch (Exception e) {
            i = 0;
        }
        if (i == 1) {
            String stringExtra = intent.getStringExtra("expand_noti_bg_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                C1406c.m8766a(getApplicationContext()).m11010a((AbstractC0795l) new C0837i(stringExtra, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.theme.ThemePushService.3
                    @Override // com.android.volley.C0802n.InterfaceC0804b
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6192a(Bitmap bitmap2) {
                        ThemePushService.this.m7976a(intent, bitmap, bitmap2, null, i);
                    }
                }, 0, 0, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.ThemePushService.4
                    @Override // com.android.volley.C0802n.InterfaceC0803a
                    /* renamed from: a */
                    public void mo6194a(C0809s c0809s) {
                        ThemePushService.this.m7974a(bitmap, intent, i);
                    }
                }));
                return;
            }
            m7974a(bitmap, intent, i);
            return;
        }
        m7974a(bitmap, intent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7974a(final Bitmap bitmap, final Intent intent, final int i) {
        String stringExtra = intent.getStringExtra("icon_big_url");
        if (i == 5 && !TextUtils.isEmpty(stringExtra)) {
            C1406c.m8766a(getApplicationContext()).m11010a((AbstractC0795l) new C0837i(stringExtra, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.theme.ThemePushService.5
                @Override // com.android.volley.C0802n.InterfaceC0804b
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6192a(Bitmap bitmap2) {
                    ThemePushService.this.m7976a(intent, bitmap, null, bitmap2, i);
                }
            }, 0, 0, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.ThemePushService.6
                @Override // com.android.volley.C0802n.InterfaceC0803a
                /* renamed from: a */
                public void mo6194a(C0809s c0809s) {
                    ThemePushService.this.m7976a(intent, bitmap, null, null, i);
                }
            }));
            return;
        }
        m7976a(intent, bitmap, null, null, i);
    }

    @TargetApi(16)
    /* renamed from: a */
    void m7976a(final Intent intent, Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final int i) {
        String str;
        RemoteViews m7979a;
        Notification notification;
        int intExtra = intent.getIntExtra("action", -1);
        if (intExtra != -1) {
            if (bitmap == null) {
                C1455z.m8564a(6, new Runnable() { // from class: com.tsf.extend.theme.ThemePushService.7
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap m7978a = ThemePushService.this.m7978a(intent);
                        if (m7978a != null) {
                            ThemePushService.this.m7976a(intent, m7978a, bitmap2, bitmap3, i);
                        }
                    }
                });
                return;
            }
            Context applicationContext = getApplicationContext();
            String stringExtra = intent.getStringExtra("title");
            String stringExtra2 = intent.getStringExtra("subtitle");
            String stringExtra3 = intent.getStringExtra("pushid");
            Notification$BuilderC1843g notification$BuilderC1843g = new Notification$BuilderC1843g(applicationContext);
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(applicationContext.getPackageName());
            int m7977a = m7977a(intent, intExtra);
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
            notification$BuilderC1843g.setContentIntent(PendingIntent.getActivity(applicationContext, m7980a(), intent2, 134217728));
            Intent intent3 = new Intent("com.ksmobile.launcher.theme_push_notification_remove");
            intent3.putExtra("pushid", stringExtra3);
            intent3.putExtra("action", intExtra);
            if (intExtra == 1) {
                notification$BuilderC1843g.setDeleteIntent(PendingIntent.getBroadcast(applicationContext, m7980a(), intent3, 134217728));
            }
            notification$BuilderC1843g.setAutoCancel(true);
            notification$BuilderC1843g.setTicker(stringExtra);
            notification$BuilderC1843g.setSmallIcon(C1536f.C1540d.logo);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                if (notification$BuilderC1843g != null) {
                    notification$BuilderC1843g.setChannelId("1");
                }
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            if (Build.VERSION.SDK_INT >= 16 && bitmap2 != null) {
                notification$BuilderC1843g.setContentTitle(stringExtra);
                notification$BuilderC1843g.setContentText(stringExtra2);
                Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
                bigPictureStyle.bigPicture(bitmap2);
                bigPictureStyle.bigLargeIcon(bitmap);
                bigPictureStyle.setSummaryText(stringExtra2);
                notification$BuilderC1843g.setStyle(bigPictureStyle);
                notification$BuilderC1843g.setLargeIcon(bitmap);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel2 = new NotificationChannel("1", "notification", 2);
                    if (notification$BuilderC1843g != null) {
                        notification$BuilderC1843g.setChannelId("1");
                    }
                    if (notificationManager != null) {
                        notificationManager.createNotificationChannel(notificationChannel2);
                    }
                }
                if (intExtra == 1 && !TextUtils.isEmpty(intent.getStringExtra("goto_gp_url"))) {
                    int m7980a = m7980a();
                    sb.append("&notification_id=" + m7977a);
                    sb.append("&goto_gp_url=" + intent.getStringExtra("goto_gp_url"));
                    Uri parse = Uri.parse(sb.toString());
                    Intent intent4 = new Intent("android.intent.action.VIEW");
                    intent4.setPackage(applicationContext.getPackageName());
                    intent4.setData(parse);
                    notification$BuilderC1843g.addAction(0, applicationContext.getResources().getString(C1536f.C1543g.push_theme_install), PendingIntent.getActivity(applicationContext, m7980a, intent4, 134217728));
                }
                notification = notification$BuilderC1843g.build();
            } else {
                Notification build = notification$BuilderC1843g.build();
                if (i == 5 && bitmap3 != null) {
                    m7979a = new RemoteViews(applicationContext.getPackageName(), C1536f.C1542f.theme_notifition_image);
                } else {
                    m7979a = m7979a(applicationContext, i);
                }
                m7979a.setTextViewText(C1536f.C1541e.theme_notify_title, stringExtra);
                if (m7979a.getLayoutId() == C1536f.C1542f.theme_notifition) {
                    m7979a.setTextViewText(C1536f.C1541e.theme_notify_text, stringExtra2);
                }
                if (i == 5 && bitmap3 != null) {
                    m7979a.setImageViewBitmap(C1536f.C1541e.theme_notify_type_icon, bitmap3);
                } else {
                    m7979a.setImageViewBitmap(C1536f.C1541e.theme_notify_type_icon, bitmap);
                }
                build.contentView = m7979a;
                notification = build;
            }
            notification.defaults |= -1;
            notificationManager.notify(m7977a, notification);
        }
    }

    /* renamed from: a */
    private RemoteViews m7979a(Context context, int i) {
        RemoteViews remoteViews = null;
        if (i == 0) {
            remoteViews = new RemoteViews(context.getPackageName(), C1536f.C1542f.theme_notifition);
        } else if (i == 2) {
            remoteViews = new RemoteViews(context.getPackageName(), C1536f.C1542f.theme_notifition_normal);
        } else if (i == 3) {
            remoteViews = new RemoteViews(context.getPackageName(), C1536f.C1542f.theme_notifition_big_icon);
        } else if (i == 4) {
            remoteViews = new RemoteViews(context.getPackageName(), C1536f.C1542f.theme_notifition_bg);
        }
        if (remoteViews == null) {
            return new RemoteViews(context.getPackageName(), C1536f.C1542f.theme_notifition);
        }
        return remoteViews;
    }

    /* renamed from: a */
    private int m7977a(Intent intent, int i) {
        return m7980a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m7978a(Intent intent) {
        return null;
    }

    /* renamed from: a */
    public static int m7980a() {
        int i = f5246a;
        f5246a = i + 1;
        return i;
    }
}
