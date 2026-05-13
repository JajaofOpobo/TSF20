package com.tsf.extend.theme.pull;

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
import android.util.Log;
import android.widget.RemoteViews;
import com.android.volley.d;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.s;
import com.android.volley.toolbox.i;
import com.android.volley.toolbox.j;
import com.tsf.extend.base.f.c;
import com.tsf.extend.base.j.f;
import com.tsf.extend.base.j.p;
import com.tsf.extend.f;
import com.tsf.extend.theme.g;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemePullService extends IntentService {
    private static int b = 60000002;
    private static Context c;
    boolean a;
    private b d;

    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    public ThemePullService() {
        super("ThemePullService");
        this.a = false;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        d();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (!c()) {
            c("GDPR没有开启： ThemePullService 不能执行命令");
            return;
        }
        c("GDPR已经开启： ThemePullService 可以执行命令");
        String stringExtra = intent.getStringExtra("currentTheme");
        long longExtra = intent.getLongExtra("firstLauncherTime", 0L);
        boolean booleanExtra = intent.getBooleanExtra("isUpgrade", false);
        this.a = intent.getBooleanExtra("isActivityAlive", false);
        a(stringExtra, longExtra, booleanExtra, this.a);
    }

    private boolean c() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    private void c(String str) {
        if (com.tsf.extend.b.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    private void d() {
        c = getApplicationContext();
    }

    private void a(String str, long j, boolean z, boolean z2) {
        if (p.d(getApplicationContext())) {
            d(new com.tsf.extend.theme.pull.a(str, j, z, z2).d());
        }
    }

    private void d(String str) {
        j jVar = new j(str, null, new n.b<JSONObject>() { // from class: com.tsf.extend.theme.pull.ThemePullService.1
            @Override // com.android.volley.n.b
            public void a(JSONObject jSONObject) {
                ThemePullService.this.a(jSONObject);
            }
        }, new n.a() { // from class: com.tsf.extend.theme.pull.ThemePullService.2
            @Override // com.android.volley.n.a
            public void a(s sVar) {
            }
        });
        jVar.a(false);
        jVar.a((com.android.volley.p) new d(30000, 0, 1.0f));
        c.a(getApplicationContext()).a((l) jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.getInt("resCode") == 0) {
                    b a2 = b.a(jSONObject.getJSONObject("data"));
                    if (a2 != null) {
                        a2.a(jSONObject.getString("upack"));
                        this.d = a2;
                        if (!e(a2.e) && ((g(a2.d) || a(a2.d) || b(a2.d)) && !f(a2.e))) {
                            e();
                        }
                    } else {
                        a("none", "none", false, "2");
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean e(String str) {
        return f.a(getApplicationContext(), str);
    }

    private boolean f(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(com.tsf.extend.theme.pull.b.b(getApplicationContext()));
    }

    private boolean g(String str) {
        if (Integer.valueOf(str).intValue() > Integer.valueOf(com.tsf.extend.theme.pull.b.a(getApplicationContext())).intValue()) {
            return true;
        }
        return false;
    }

    public static boolean a(String str) {
        return "-1".equals(str);
    }

    public static boolean b(String str) {
        return "-2".equals(str);
    }

    private void e() {
        if (this.d != null) {
            a(this.d.i, new a() { // from class: com.tsf.extend.theme.pull.ThemePullService.3
                @Override // com.tsf.extend.theme.pull.ThemePullService.a
                public void a(Bitmap bitmap) {
                    if (bitmap == null) {
                        ThemePullService.this.a(ThemePullService.this.d.d, ThemePullService.this.d.e, false, "1");
                    } else if (com.tsf.extend.theme.pull.b.c()) {
                        ThemePullService.this.a(bitmap);
                    } else {
                        ThemePullService.this.a(bitmap, (Bitmap) null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Bitmap bitmap) {
        if (this.d != null) {
            a(this.d.h, new a() { // from class: com.tsf.extend.theme.pull.ThemePullService.4
                @Override // com.tsf.extend.theme.pull.ThemePullService.a
                public void a(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        ThemePullService.this.a(bitmap, bitmap2);
                    } else {
                        ThemePullService.this.a(ThemePullService.this.d.d, ThemePullService.this.d.e, false, "1");
                    }
                }
            });
        }
    }

    private void a(String str, final a aVar) {
        c.a(getApplicationContext()).a((l) new i(str, new n.b<Bitmap>() { // from class: com.tsf.extend.theme.pull.ThemePullService.5
            @Override // com.android.volley.n.b
            public void a(Bitmap bitmap) {
                if (aVar != null) {
                    aVar.a(bitmap);
                }
            }
        }, 0, 0, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.theme.pull.ThemePullService.6
            @Override // com.android.volley.n.a
            public void a(s sVar) {
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap, Bitmap bitmap2) {
        Notification build;
        if (this.d != null && bitmap != null) {
            Context applicationContext = getApplicationContext();
            g gVar = new g(applicationContext);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(applicationContext.getPackageName());
            int a2 = a();
            intent.setData(Uri.parse("cmlauncher://theme?type=pull_notification&id=" + this.d.c + "&subtitle=" + this.d.g + "&pushid=" + this.d.d + "&pkgname=" + this.d.e + "&title=" + this.d.f));
            intent.putExtra("upack", this.d.j);
            intent.putExtra("theme_entry", "pull");
            intent.putExtra("pushid", this.d.d);
            gVar.setContentIntent(PendingIntent.getActivity(applicationContext, a(), intent, 134217728));
            Intent intent2 = new Intent("com.ksmobile.launcher.theme_pull_notification_remove");
            intent2.putExtra("pushid", this.d.d);
            intent2.putExtra("themepn", this.d.e);
            gVar.setDeleteIntent(PendingIntent.getBroadcast(applicationContext, a(), intent2, 134217728));
            gVar.setAutoCancel(true);
            gVar.setTicker(this.d.f);
            gVar.setSmallIcon(f.d.logo);
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                if (gVar != null) {
                    gVar.setChannelId("1");
                }
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            if (com.tsf.extend.theme.pull.b.c() && bitmap2 != null) {
                gVar.setContentTitle(this.d.f);
                gVar.setContentText(this.d.g);
                Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
                bigPictureStyle.bigPicture(bitmap2);
                bigPictureStyle.bigLargeIcon(bitmap);
                bigPictureStyle.setSummaryText(this.d.g);
                gVar.setStyle(bigPictureStyle);
                gVar.setLargeIcon(bitmap);
                build = gVar.build();
            } else {
                build = gVar.build();
                RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), f.C0052f.theme_notifition_normal);
                remoteViews.setTextViewText(f.e.theme_notify_title, this.d.f);
                remoteViews.setTextViewText(f.e.theme_notify_text, this.d.g);
                remoteViews.setImageViewBitmap(f.e.theme_notify_type_icon, bitmap);
                build.contentView = remoteViews;
            }
            build.defaults |= -1;
            notificationManager.notify(a2, build);
            com.tsf.extend.theme.pull.b.a(getApplicationContext(), System.currentTimeMillis());
            if (!a(this.d.d) && !b(this.d.d)) {
                com.tsf.extend.theme.pull.b.a(getApplicationContext(), this.d.d);
            }
            com.tsf.extend.theme.pull.b.b(getApplicationContext(), this.d.e);
            a(this.d.d, this.d.e, true, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, boolean z, String str3) {
        if (z) {
        }
        if (str3 == null) {
        }
        if (this.a) {
        }
    }

    public static int a() {
        int i = b;
        b = i + 1;
        return i;
    }

    /* loaded from: classes.dex */
    public static class b {
        private static int[] k = {f.g.push_theme_default_title, f.g.push_theme_default_title_1, f.g.push_theme_default_title_2, f.g.push_theme_default_title_3, f.g.push_theme_default_title_4};
        private static int[] l = {f.g.push_theme_default_subtitle, f.g.push_theme_default_subtitle_1, f.g.push_theme_default_subtitle_2, f.g.push_theme_default_subtitle_3, f.g.push_theme_default_subtitle_4};
        public int a;
        public int b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;

        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                this.j = "";
            } else {
                this.j = str;
            }
        }

        public static b a(JSONObject jSONObject) {
            b bVar = new b();
            try {
                bVar.a = jSONObject.getInt("style");
                bVar.b = jSONObject.getInt("type");
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                bVar.c = jSONObject2.getString("id");
                bVar.d = jSONObject2.getString("task_id");
                bVar.e = jSONObject2.getString("packageName");
                bVar.h = jSONObject2.getString("bigIconUrl");
                bVar.i = jSONObject2.getString("smallIconUrl");
                bVar.f = jSONObject2.optString("title");
                bVar.g = jSONObject2.optString("subtitle");
                bVar.a();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (bVar.b()) {
                return bVar;
            }
            return null;
        }

        public void a() {
            if (ThemePullService.c != null) {
                if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
                    int c = com.tsf.extend.theme.pull.b.c(ThemePullService.c);
                    this.f = ThemePullService.c.getResources().getString(k[c % k.length]);
                    this.g = ThemePullService.c.getResources().getString(l[c % l.length]);
                    com.tsf.extend.theme.pull.b.a(ThemePullService.c, (c + 1) % k.length);
                }
            }
        }

        public boolean b() {
            return (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.i)) ? false : true;
        }
    }
}
