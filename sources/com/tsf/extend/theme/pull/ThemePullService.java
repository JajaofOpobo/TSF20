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
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0837i;
import com.android.volley.toolbox.C0838j;
import com.tsf.extend.C1335b;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1427f;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.theme.Notification$BuilderC1843g;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemePullService extends IntentService {

    /* renamed from: b */
    private static int f6004b = 60000002;

    /* renamed from: c */
    private static Context f6005c;

    /* renamed from: a */
    boolean f6006a;

    /* renamed from: d */
    private C1871b f6007d;

    /* renamed from: com.tsf.extend.theme.pull.ThemePullService$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1870a {
        /* renamed from: a */
        void mo7183a(Bitmap bitmap);
    }

    public ThemePullService() {
        super("ThemePullService");
        this.f6006a = false;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m7191d();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (!m7193c()) {
            m7192c("GDPR没有开启： ThemePullService 不能执行命令");
            return;
        }
        m7192c("GDPR已经开启： ThemePullService 可以执行命令");
        String stringExtra = intent.getStringExtra("currentTheme");
        long longExtra = intent.getLongExtra("firstLauncherTime", 0L);
        boolean booleanExtra = intent.getBooleanExtra("isUpgrade", false);
        this.f6006a = intent.getBooleanExtra("isActivityAlive", false);
        m7199a(stringExtra, longExtra, booleanExtra, this.f6006a);
    }

    /* renamed from: c */
    private boolean m7193c() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* renamed from: c */
    private void m7192c(String str) {
        if (C1335b.f4221a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    /* renamed from: d */
    private void m7191d() {
        f6005c = getApplicationContext();
    }

    /* renamed from: a */
    private void m7199a(String str, long j, boolean z, boolean z2) {
        if (C1437p.m8613d(getApplicationContext())) {
            m7190d(new C1872a(str, j, z, z2).m8948d());
        }
    }

    /* renamed from: d */
    private void m7190d(String str) {
        C0838j c0838j = new C0838j(str, null, new C0802n.InterfaceC0804b<JSONObject>() { // from class: com.tsf.extend.theme.pull.ThemePullService.1
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(JSONObject jSONObject) {
                ThemePullService.this.m7196a(jSONObject);
            }
        }, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.pull.ThemePullService.2
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
            }
        });
        c0838j.m11032a(false);
        c0838j.m11034a((InterfaceC0806p) new C0785d(30000, 0, 1.0f));
        C1406c.m8766a(getApplicationContext()).m11010a((AbstractC0795l) c0838j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7196a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.getInt("resCode") == 0) {
                    C1871b m7180a = C1871b.m7180a(jSONObject.getJSONObject("data"));
                    if (m7180a != null) {
                        m7180a.m7181a(jSONObject.getString("upack"));
                        this.f6007d = m7180a;
                        if (!m7188e(m7180a.f6022e) && ((m7186g(m7180a.f6021d) || m7200a(m7180a.f6021d) || m7194b(m7180a.f6021d)) && !m7187f(m7180a.f6022e))) {
                            m7189e();
                        }
                    } else {
                        m7197a("none", "none", false, "2");
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private boolean m7188e(String str) {
        return C1427f.m8664a(getApplicationContext(), str);
    }

    /* renamed from: f */
    private boolean m7187f(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(C1873b.m7166b(getApplicationContext()));
    }

    /* renamed from: g */
    private boolean m7186g(String str) {
        if (Integer.valueOf(str).intValue() > Integer.valueOf(C1873b.m7173a(getApplicationContext())).intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7200a(String str) {
        return "-1".equals(str);
    }

    /* renamed from: b */
    public static boolean m7194b(String str) {
        return "-2".equals(str);
    }

    /* renamed from: e */
    private void m7189e() {
        if (this.f6007d != null) {
            m7198a(this.f6007d.f6026i, new InterfaceC1870a() { // from class: com.tsf.extend.theme.pull.ThemePullService.3
                @Override // com.tsf.extend.theme.pull.ThemePullService.InterfaceC1870a
                /* renamed from: a */
                public void mo7183a(Bitmap bitmap) {
                    if (bitmap == null) {
                        ThemePullService.this.m7197a(ThemePullService.this.f6007d.f6021d, ThemePullService.this.f6007d.f6022e, false, "1");
                    } else if (C1873b.m7164c()) {
                        ThemePullService.this.m7207a(bitmap);
                    } else {
                        ThemePullService.this.m7206a(bitmap, (Bitmap) null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7207a(final Bitmap bitmap) {
        if (this.f6007d != null) {
            m7198a(this.f6007d.f6025h, new InterfaceC1870a() { // from class: com.tsf.extend.theme.pull.ThemePullService.4
                @Override // com.tsf.extend.theme.pull.ThemePullService.InterfaceC1870a
                /* renamed from: a */
                public void mo7183a(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        ThemePullService.this.m7206a(bitmap, bitmap2);
                    } else {
                        ThemePullService.this.m7197a(ThemePullService.this.f6007d.f6021d, ThemePullService.this.f6007d.f6022e, false, "1");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m7198a(String str, final InterfaceC1870a interfaceC1870a) {
        C1406c.m8766a(getApplicationContext()).m11010a((AbstractC0795l) new C0837i(str, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.theme.pull.ThemePullService.5
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(Bitmap bitmap) {
                if (interfaceC1870a != null) {
                    interfaceC1870a.mo7183a(bitmap);
                }
            }
        }, 0, 0, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.theme.pull.ThemePullService.6
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7206a(Bitmap bitmap, Bitmap bitmap2) {
        Notification build;
        if (this.f6007d != null && bitmap != null) {
            Context applicationContext = getApplicationContext();
            Notification$BuilderC1843g notification$BuilderC1843g = new Notification$BuilderC1843g(applicationContext);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(applicationContext.getPackageName());
            int m7208a = m7208a();
            intent.setData(Uri.parse("cmlauncher://theme?type=pull_notification&id=" + this.f6007d.f6020c + "&subtitle=" + this.f6007d.f6024g + "&pushid=" + this.f6007d.f6021d + "&pkgname=" + this.f6007d.f6022e + "&title=" + this.f6007d.f6023f));
            intent.putExtra("upack", this.f6007d.f6027j);
            intent.putExtra("theme_entry", "pull");
            intent.putExtra("pushid", this.f6007d.f6021d);
            notification$BuilderC1843g.setContentIntent(PendingIntent.getActivity(applicationContext, m7208a(), intent, 134217728));
            Intent intent2 = new Intent("com.ksmobile.launcher.theme_pull_notification_remove");
            intent2.putExtra("pushid", this.f6007d.f6021d);
            intent2.putExtra("themepn", this.f6007d.f6022e);
            notification$BuilderC1843g.setDeleteIntent(PendingIntent.getBroadcast(applicationContext, m7208a(), intent2, 134217728));
            notification$BuilderC1843g.setAutoCancel(true);
            notification$BuilderC1843g.setTicker(this.f6007d.f6023f);
            notification$BuilderC1843g.setSmallIcon(C1536f.C1540d.logo);
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                if (notification$BuilderC1843g != null) {
                    notification$BuilderC1843g.setChannelId("1");
                }
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            if (C1873b.m7164c() && bitmap2 != null) {
                notification$BuilderC1843g.setContentTitle(this.f6007d.f6023f);
                notification$BuilderC1843g.setContentText(this.f6007d.f6024g);
                Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
                bigPictureStyle.bigPicture(bitmap2);
                bigPictureStyle.bigLargeIcon(bitmap);
                bigPictureStyle.setSummaryText(this.f6007d.f6024g);
                notification$BuilderC1843g.setStyle(bigPictureStyle);
                notification$BuilderC1843g.setLargeIcon(bitmap);
                build = notification$BuilderC1843g.build();
            } else {
                build = notification$BuilderC1843g.build();
                RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), C1536f.C1542f.theme_notifition_normal);
                remoteViews.setTextViewText(C1536f.C1541e.theme_notify_title, this.f6007d.f6023f);
                remoteViews.setTextViewText(C1536f.C1541e.theme_notify_text, this.f6007d.f6024g);
                remoteViews.setImageViewBitmap(C1536f.C1541e.theme_notify_type_icon, bitmap);
                build.contentView = remoteViews;
            }
            build.defaults |= -1;
            notificationManager.notify(m7208a, build);
            C1873b.m7170a(getApplicationContext(), System.currentTimeMillis());
            if (!m7200a(this.f6007d.f6021d) && !m7194b(this.f6007d.f6021d)) {
                C1873b.m7168a(getApplicationContext(), this.f6007d.f6021d);
            }
            C1873b.m7165b(getApplicationContext(), this.f6007d.f6022e);
            m7197a(this.f6007d.f6021d, this.f6007d.f6022e, true, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7197a(String str, String str2, boolean z, String str3) {
        if (z) {
        }
        if (str3 == null) {
        }
        if (this.f6006a) {
        }
    }

    /* renamed from: a */
    public static int m7208a() {
        int i = f6004b;
        f6004b = i + 1;
        return i;
    }

    /* renamed from: com.tsf.extend.theme.pull.ThemePullService$b */
    /* loaded from: classes.dex */
    public static class C1871b {

        /* renamed from: k */
        private static int[] f6016k = {C1536f.C1543g.push_theme_default_title, C1536f.C1543g.push_theme_default_title_1, C1536f.C1543g.push_theme_default_title_2, C1536f.C1543g.push_theme_default_title_3, C1536f.C1543g.push_theme_default_title_4};

        /* renamed from: l */
        private static int[] f6017l = {C1536f.C1543g.push_theme_default_subtitle, C1536f.C1543g.push_theme_default_subtitle_1, C1536f.C1543g.push_theme_default_subtitle_2, C1536f.C1543g.push_theme_default_subtitle_3, C1536f.C1543g.push_theme_default_subtitle_4};

        /* renamed from: a */
        public int f6018a;

        /* renamed from: b */
        public int f6019b;

        /* renamed from: c */
        public String f6020c;

        /* renamed from: d */
        public String f6021d;

        /* renamed from: e */
        public String f6022e;

        /* renamed from: f */
        public String f6023f;

        /* renamed from: g */
        public String f6024g;

        /* renamed from: h */
        public String f6025h;

        /* renamed from: i */
        public String f6026i;

        /* renamed from: j */
        public String f6027j;

        /* renamed from: a */
        public void m7181a(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f6027j = "";
            } else {
                this.f6027j = str;
            }
        }

        /* renamed from: a */
        public static C1871b m7180a(JSONObject jSONObject) {
            C1871b c1871b = new C1871b();
            try {
                c1871b.f6018a = jSONObject.getInt("style");
                c1871b.f6019b = jSONObject.getInt("type");
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                c1871b.f6020c = jSONObject2.getString("id");
                c1871b.f6021d = jSONObject2.getString("task_id");
                c1871b.f6022e = jSONObject2.getString("packageName");
                c1871b.f6025h = jSONObject2.getString("bigIconUrl");
                c1871b.f6026i = jSONObject2.getString("smallIconUrl");
                c1871b.f6023f = jSONObject2.optString("title");
                c1871b.f6024g = jSONObject2.optString("subtitle");
                c1871b.m7182a();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (c1871b.m7179b()) {
                return c1871b;
            }
            return null;
        }

        /* renamed from: a */
        public void m7182a() {
            if (ThemePullService.f6005c != null) {
                if (TextUtils.isEmpty(this.f6023f) || TextUtils.isEmpty(this.f6024g)) {
                    int m7163c = C1873b.m7163c(ThemePullService.f6005c);
                    this.f6023f = ThemePullService.f6005c.getResources().getString(f6016k[m7163c % f6016k.length]);
                    this.f6024g = ThemePullService.f6005c.getResources().getString(f6017l[m7163c % f6017l.length]);
                    C1873b.m7172a(ThemePullService.f6005c, (m7163c + 1) % f6016k.length);
                }
            }
        }

        /* renamed from: b */
        public boolean m7179b() {
            return (TextUtils.isEmpty(this.f6020c) || TextUtils.isEmpty(this.f6021d) || TextUtils.isEmpty(this.f6022e) || TextUtils.isEmpty(this.f6023f) || TextUtils.isEmpty(this.f6024g) || TextUtils.isEmpty(this.f6025h) || TextUtils.isEmpty(this.f6026i)) ? false : true;
        }
    }
}
