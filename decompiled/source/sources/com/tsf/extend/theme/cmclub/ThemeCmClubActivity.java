package com.tsf.extend.theme.cmclub;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;
import com.tsf.extend.base.j.p;
import com.tsf.extend.base.j.z;
import com.tsf.extend.e;
import com.tsf.extend.f;
import com.tsf.extend.h;
import com.tsf.extend.theme.diy.ThemeDIYActivity;
import com.tsf.extend.theme.diy.e;
import com.tsf.extend.theme.j;
import com.tsf.extend.theme.k;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeCmClubActivity extends CustomActivity {
    static int d = 30000;
    public static final Uri e = Uri.parse("content://com.ksmobile.launcher.ThemeCmClubProvider");
    private static Map<String, Integer> k = new HashMap();
    private static String t;
    private static String u;
    private Timer A;
    private String B;
    private ProgressBar C;
    private String E;
    private ValueCallback<Uri> K;
    private c L;
    private com.tsf.extend.base.c.b O;
    Context f;
    WebView g;
    private String l;
    private String m;
    private String n;
    private String o;
    private boolean p;
    private String q;
    private boolean r;
    private String s;
    private int v;
    private com.tsf.extend.theme.b y;
    private b z;
    private final String i = "ThemeCmClubActivity";
    private boolean j = false;
    private String[] w = {"http://club.cmcm.com/forum.php?mod=forumdisplay&fid=41&mobile=2", "http://theme.cmcm.com/themepost/", "http://api.theme.cmcm.com", "http://theme.cmcm.com/tools/submit.html", "http://www.freetheme.mobi/#list"};
    private int x = -1;
    private boolean D = false;
    private boolean F = false;
    private String G = "";
    private String H = null;
    private Intent I = null;
    private String J = null;
    String h = "";
    private Set<String> M = new HashSet();
    private Handler N = new Handler() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ThemeCmClubActivity.this.b(true);
                    return;
                case 1001:
                    ThemeCmClubActivity.this.C.setVisibility(4);
                    return;
                default:
                    if (ThemeCmClubActivity.this.z != null) {
                        ThemeCmClubActivity.this.z.a();
                    }
                    ThemeCmClubActivity.this.b(false);
                    Toast.makeText(ThemeCmClubActivity.this.f, f.g.theme_changing_fail, 1).show();
                    return;
            }
        }
    };
    private ServiceConnection P = new ServiceConnection() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.6
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeCmClubActivity.this.O = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeCmClubActivity.this.O = (com.tsf.extend.base.c.b) iBinder;
        }
    };
    private Runnable Q = new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.4
        @Override // java.lang.Runnable
        public void run() {
            ThemeCmClubActivity.this.onBackPressed();
        }
    };

    static {
        k.put("app_manager", Integer.valueOf(f.d.icon_app_manager));
        k.put("browser", Integer.valueOf(f.d.browser));
        k.put("calculator", Integer.valueOf(f.d.calculator));
        k.put("calendar", Integer.valueOf(f.d.calendar));
        k.put("camera", Integer.valueOf(f.d.camera));
        k.put("clean_master", Integer.valueOf(f.d.clean_master));
        k.put("clock", Integer.valueOf(f.d.clock));
        k.put("cm_browser", Integer.valueOf(f.d.cm_browser));
        k.put("cm_club", Integer.valueOf(f.d.cm_club));
        k.put("cm_locker", Integer.valueOf(f.d.cm_lock));
        k.put("cm_security", Integer.valueOf(f.d.cm_security));
        k.put("contact", Integer.valueOf(f.d.contact));
        k.put("download", Integer.valueOf(f.d.download));
        k.put("email", Integer.valueOf(f.d.email));
        k.put("filemanager", Integer.valueOf(f.d.filemanager));
        k.put("flashlight", Integer.valueOf(f.d.flashlight));
        k.put("market", Integer.valueOf(f.d.market));
        k.put("message", Integer.valueOf(f.d.message));
        k.put("message_spirit", Integer.valueOf(f.d.message_spirit));
        k.put("music", Integer.valueOf(f.d.music));
        k.put("phone", Integer.valueOf(f.d.phone));
        k.put("record", Integer.valueOf(f.d.record));
        k.put("settings", Integer.valueOf(f.d.settings));
        k.put("sort_apps", Integer.valueOf(f.d.sort_apps));
        k.put("theme", Integer.valueOf(f.d.theme));
        k.put("video", Integer.valueOf(f.d.video));
        k.put("wallpaper", Integer.valueOf(f.d.wallpaper));
        k.put("widget_all_apps", Integer.valueOf(f.d.widget_all_apps));
        k.put("widget_recently", Integer.valueOf(f.d.widget_recently));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        public int a;
        public int b;
        public int c;

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File a(boolean z) {
        File a2 = e.a(this.f, ".image");
        if (a2 == null) {
            return null;
        }
        File file = new File(a2.toString(), "camera_capture.jpg");
        if (z && file.exists()) {
            file.delete();
            return file;
        }
        return file;
    }

    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a((Activity) this);
        setContentView(f.C0052f.theme_cmclub_activity);
        getApplicationContext().bindService(new Intent("android.service.theme.ManagerService"), this.P, 1);
        this.f = this;
        this.r = false;
        this.C = (ProgressBar) findViewById(f.e.progressbar);
        this.g = (WebView) findViewById(f.e.webview);
        this.g.getSettings().setDomStorageEnabled(true);
        this.g.setWebViewClient(new d());
        this.g.setWebChromeClient(new WebChromeClient() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.7
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                if (ThemeCmClubActivity.this.C != null) {
                    if (ThemeCmClubActivity.this.C.getVisibility() != 0) {
                        ThemeCmClubActivity.this.C.setVisibility(0);
                    }
                    ThemeCmClubActivity.this.C.setProgress(i);
                    if (i == 100 && ThemeCmClubActivity.this.N != null && !ThemeCmClubActivity.this.N.hasMessages(1001)) {
                        ThemeCmClubActivity.this.N.sendMessageDelayed(ThemeCmClubActivity.this.N.obtainMessage(1001), 3000L);
                    }
                }
            }
        });
        try {
            this.g.getSettings().setJavaScriptEnabled(true);
        } catch (Exception e2) {
        }
        if (Build.VERSION.SDK_INT >= 19) {
            String c2 = com.tsf.extend.base.j.d.c(this);
            if (!TextUtils.isEmpty(c2) && c2.startsWith("99999999")) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        this.g.addJavascriptInterface(new com.tsf.extend.theme.cmclub.a(this), "Activity");
        this.g.addJavascriptInterface(new com.tsf.extend.theme.cmclub.c(this), "ThemeDetail");
        if (Build.VERSION.SDK_INT >= 16) {
            this.g.addJavascriptInterface(new com.tsf.extend.theme.cmclub.b(this), "DIY");
        }
        this.g.addJavascriptInterface(new com.tsf.extend.theme.cmclub.d(this), "WebView");
        if (Build.VERSION.SDK_INT >= 16) {
            this.g.getSettings().setAllowUniversalAccessFromFileURLs(true);
        }
        this.w[2] = this.w[2] + "/?mcc=" + com.tsf.extend.base.j.d.b(h.b()) + "&ver=" + com.tsf.extend.base.j.d.c();
        h();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h();
    }

    private void h() {
        Intent intent = getIntent();
        if (intent != null) {
            if (e(intent)) {
                this.v = 3;
            } else {
                this.s = a(intent);
                b(intent);
                t = c(intent);
                u = d(intent);
                this.v = f(intent);
            }
        }
        this.g.loadUrl(this.w[this.v]);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.O != null) {
            getApplicationContext().unbindService(this.P);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (this.K != null) {
                Uri data = (intent == null || i2 != -1) ? null : intent.getData();
                if (data != null) {
                    data = com.tsf.extend.base.j.e.c(this, data);
                }
                this.K.onReceiveValue(data);
                this.K = null;
            }
        } else if (i == 2) {
            if (i2 == -1 && this.J != null) {
                l();
            }
        } else if (i == 3 && i2 == -1 && intent != null && this.J != null) {
            g(intent);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.z != null && this.z.b()) {
            j();
        } else if (this.g != null && this.g.canGoBack()) {
            if (this.F) {
                this.g.loadUrl("javascript:clientOnBackPressed()");
            }
            if (!TextUtils.isEmpty(this.H)) {
                this.g.loadUrl("javascript:backByWeb('" + this.H + "')");
            } else {
                this.g.goBack();
            }
        } else if ("launch_from_others".equals(t)) {
            if ("launch_host_theme".equals(u)) {
                Intent intent = new Intent(this, PersonalizationActivity.class);
                intent.putExtra("TARGET_PAGE", 1);
                startActivity(intent);
            } else if ("launch_host_club".equals(u)) {
                ThemeDIYActivity.a(this, "1001", 0);
            }
            finish();
        } else {
            super.onBackPressed();
        }
    }

    public static void a(Context context, String str, String str2, int i) {
        Intent intent = new Intent(context, ThemeCmClubActivity.class);
        intent.putExtra("launch_from", str);
        intent.putExtra("launch_host", str2);
        intent.putExtra("web_url_index", i);
        context.startActivity(intent);
    }

    private String a(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("UPLOAD_RESPONSE")) == null) {
            return "-1";
        }
        try {
            return new JSONObject(stringExtra).getJSONObject("data").getString("diyid");
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "-1";
        }
    }

    private void b(Intent intent) {
        if (intent != null) {
            String stringExtra = getIntent().getStringExtra("upload_wallpaper_data");
            String stringExtra2 = intent.getStringExtra("UPLOAD_RESPONSE");
            if (stringExtra != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    this.l = jSONObject.getString("wallpaper_id");
                    this.m = jSONObject.getString("wallpaper_categoryId");
                    this.n = jSONObject.getString("wallpaper_tag");
                    this.o = jSONObject.getString("wallpaper_name");
                    this.p = jSONObject.getBoolean("wallpaper_online");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (stringExtra2 != null) {
                try {
                    this.q = new JSONObject(stringExtra2).getJSONObject("data").getString("token");
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    private String c(Intent intent) {
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("launch_from");
    }

    private String d(Intent intent) {
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("launch_host");
    }

    private boolean e(Intent intent) {
        return intent.getBooleanExtra("diy_theme_h5_shared", false);
    }

    public String a() {
        return u;
    }

    private int f(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("web_url_index", 0);
            if (intExtra < 0 || intExtra > this.w.length - 1) {
                return 0;
            }
            return intExtra;
        }
        return 0;
    }

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            final k kVar = new k();
            kVar.i(jSONObject2.optString("author_name"));
            kVar.a(jSONObject2.optInt("download_number"));
            kVar.c(jSONObject2.optInt("favorite_count"));
            kVar.a(jSONObject2.optLong("id"));
            kVar.d(jSONObject2.optString("theme_name"));
            kVar.h(jSONObject2.optString("theme_size"));
            kVar.k(jSONObject2.optString("theme_logo"));
            kVar.e(jSONObject2.optString("theme_download_url"));
            this.B = jSONObject2.optString("diyid");
            kVar.c(this.B);
            kVar.j(jSONObject.optString("version"));
            ArrayList newArrayList = Lists.newArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("launcher_preview");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        newArrayList.add(optJSONArray.getString(i));
                    } catch (JSONException e2) {
                    }
                }
            }
            kVar.a(newArrayList);
            new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    ThemeCmClubActivity.this.a(Long.toString(kVar.h()), kVar.k(), kVar.t());
                }
            }.run();
        } catch (Exception e3) {
            Toast.makeText(this.f, f.g.cm_club_download_stopped, 0).show();
        }
    }

    public int b() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tsf.extend.theme.cmclub.ThemeCmClubActivity$10] */
    public void i() {
        final com.tsf.extend.base.c.a aVar = new com.tsf.extend.base.c.a() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.9
            @Override // com.tsf.extend.base.c.a
            public void a(int i) {
                if (ThemeCmClubActivity.this.A != null) {
                    ThemeCmClubActivity.this.A.cancel();
                }
                ThemeCmClubActivity.this.N.sendEmptyMessage(i);
            }
        };
        new AsyncTask<Void, Void, Void>() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                try {
                    if (!(ThemeCmClubActivity.this.y != null ? ThemeCmClubActivity.this.a(ThemeCmClubActivity.this.y.g(), false, aVar) : false)) {
                        ThemeCmClubActivity.this.N.sendEmptyMessage(1);
                        return null;
                    }
                    return null;
                } catch (RemoteException e2) {
                    ThemeCmClubActivity.this.N.sendEmptyMessage(1);
                    return null;
                }
            }
        }.execute(new Void[0]);
        this.A = new Timer();
        this.A.schedule(new TimerTask() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.11
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ThemeCmClubActivity.this.N.sendEmptyMessage(1);
            }
        }, d);
    }

    public boolean a(String str, boolean z, com.tsf.extend.base.c.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PACKAGE_NAME", str);
            if (str.startsWith("DIY://")) {
                Object b2 = e.b(str.substring("DIY://".length()) + File.separator + "diy.config", "isLocalDiy");
                if (b2 instanceof Boolean) {
                    jSONObject.put("NO_ICON_GROUP", b2);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                jSONObject.put("FROM_DIY_THEME", true);
                jSONObject.put("EXIT_AFTER_APPLY_THEME", this.j);
                this.j = false;
            }
        } catch (JSONException e2) {
        }
        String jSONObject2 = jSONObject.toString();
        if (this.O != null) {
            this.O.a(jSONObject2, aVar);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, List<String> list) {
        if (this.z != null) {
            this.z.a();
        }
        this.z = new b(str, str2, list);
        new Thread(this.z).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private boolean b = false;
        private a c;
        private String d;
        private String e;
        private List<String> f;

        b(String str, String str2, List<String> list) {
            this.c = new a();
            this.d = str;
            this.e = str2;
            this.f = list;
        }

        public void a() {
            this.c.a = true;
            this.b = true;
            ThemeCmClubActivity.this.x = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.a(ThemeCmClubActivity.this.f, this.d, this.e, this.f, this.c);
            this.b = true;
        }

        public boolean b() {
            return !this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.a {
        public boolean a = false;

        a() {
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public boolean a() {
            return this.a;
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public void b() {
            ThemeCmClubActivity.this.x = 1;
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public void a(float f) {
            if (f > 0.0f && f < 1.0f) {
                f = 1.0f;
            }
            if (!a()) {
                ThemeCmClubActivity.this.x = (int) f;
            }
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public void a(com.tsf.extend.theme.b bVar) {
            ThemeCmClubActivity.this.x = 100;
            ThemeCmClubActivity.this.y = bVar;
            ThemeCmClubActivity.this.i();
        }
    }

    public void b(String str) {
        new j().a(this.f, 2, "https://cml.ksmobile.com/diy/detail?d=" + str, new com.tsf.extend.theme.b(), new j.a() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.12
            @Override // com.tsf.extend.theme.j.a
            public void a(String str2) {
                if (str2 != null) {
                }
            }

            @Override // com.tsf.extend.theme.j.a
            public void a() {
            }
        });
    }

    public void c() {
        if (!k() && this.g != null && this.g.canGoBack()) {
            this.g.goBack();
        }
    }

    public void d() {
        finish();
    }

    public void e() {
        if (this.g != null) {
            this.g.clearHistory();
        }
    }

    public boolean c(String str) {
        return this.D;
    }

    public void f() {
        this.F = true;
    }

    private void j() {
        new e.a(this.f).a(f.g.cm_club_dialog_stop_downloading).b(f.g.cm_club_dialog_cancel, null).a(f.g.cm_club_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (ThemeCmClubActivity.this.z != null) {
                    ThemeCmClubActivity.this.z.a();
                }
                ThemeCmClubActivity.this.onBackPressed();
            }
        }).a().a(true);
    }

    public static void a(final Context context, final String str) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (context != null) {
                    Toast.makeText(context, str, 0).show();
                }
            }
        });
    }

    private boolean k() {
        if (this.g == null || this.g.getUrl() == null || !this.g.getUrl().contains("http://theme.cmcm.com/themepost/")) {
            return false;
        }
        this.g.loadUrl("http://club.cmcm.com/forum.php?mod=forumdisplay&fid=41&mobile=2");
        this.g.clearHistory();
        return true;
    }

    /* loaded from: classes.dex */
    private class d extends WebViewClient {
        private d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ThemeCmClubActivity.this.H = null;
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            ThemeCmClubActivity.this.H = null;
            if ("cmcm://close".equals(str)) {
                z.a(0, ThemeCmClubActivity.this.Q);
                return true;
            } else if (str.startsWith("mailto:")) {
                ThemeCmClubActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } else {
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }

        private InputStream a(Uri uri, int i, int i2, int i3) {
            Bitmap bitmap;
            try {
                bitmap = ThemeCmClubActivity.a(ThemeCmClubActivity.this.f, uri, i, i2, false, i3);
            } catch (IOException e) {
                e.printStackTrace();
                bitmap = null;
            }
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            File a;
            byte[] blob;
            ByteArrayInputStream byteArrayInputStream;
            if ("".equals(str) || !str.contains("811F6DE1-F0F8-4669-B91C-D0A0237FEFF9")) {
                return null;
            }
            String[] split = str.split("/");
            if (split.length <= 0) {
                return null;
            }
            int length = split.length - 1;
            int length2 = split.length - 2;
            if (length < 0 || length2 < 0) {
                return null;
            }
            String str2 = split[length];
            if ("".equals(str2)) {
                return null;
            }
            String str3 = split[length2];
            if ("wallpaper".equals(str3)) {
                try {
                    return new WebResourceResponse("image/png", "UTF-8", new BufferedInputStream(new FileInputStream(ThemeCmClubActivity.a(ThemeCmClubActivity.this.f))));
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            } else if ("icons".equals(str3)) {
                Cursor query = ThemeCmClubActivity.this.getContentResolver().query(ThemeCmClubActivity.e, null, str2, null, null);
                if (query == null || !query.moveToFirst() || (blob = query.getBlob(query.getColumnIndexOrThrow("bitmap"))) == null || (byteArrayInputStream = new ByteArrayInputStream(blob)) == null) {
                    return null;
                }
                return new WebResourceResponse("image/png", "UTF-8", byteArrayInputStream);
            } else if ("image".equals(str3)) {
                if (ThemeCmClubActivity.this.I == null || ThemeCmClubActivity.this.I.getData() == null || ThemeCmClubActivity.this.L == null) {
                    return null;
                }
                InputStream a2 = a(ThemeCmClubActivity.this.I.getData(), ThemeCmClubActivity.this.L.a, ThemeCmClubActivity.this.L.b, ThemeCmClubActivity.this.L.c);
                ThemeCmClubActivity.this.I = null;
                ThemeCmClubActivity.this.L = null;
                if (a2 != null) {
                    return new WebResourceResponse("image/png", "UTF-8", a2);
                }
                return null;
            } else if (!"camera".equals(str3) || (a = ThemeCmClubActivity.this.a(false)) == null || ThemeCmClubActivity.this.L == null) {
                return null;
            } else {
                InputStream a3 = a(Uri.fromFile(a), ThemeCmClubActivity.this.L.a, ThemeCmClubActivity.this.L.b, ThemeCmClubActivity.this.L.c);
                ThemeCmClubActivity.this.L = null;
                if (a3 != null) {
                    return new WebResourceResponse("image/png", "UTF-8", a3);
                }
                return null;
            }
        }
    }

    public void g() {
        if (this.g != null) {
            this.g.clearCache(true);
        }
    }

    public void d(String str) {
        this.H = str;
    }

    public void e(String str) {
        if (this.g != null) {
            this.g.loadUrl(str);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                if (this.g != null && this.g.getProgress() >= 90 && !this.h.isEmpty()) {
                    e("javascript:" + this.h + "();");
                    return true;
                }
                break;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static String a(Context context) {
        Bitmap bitmap;
        File a2 = com.tsf.extend.theme.diy.e.a(context, ".image");
        if (a2 == null) {
            return null;
        }
        File file = new File(a2.toString(), "the_wallpaper.jpg");
        if (file.exists()) {
            file.delete();
        }
        BitmapDrawable a3 = com.tsf.extend.base.j.d.a(WallpaperManager.getInstance(context));
        if (a3 == null || (bitmap = a3.getBitmap()) == null) {
            return null;
        }
        a(bitmap, file.toString());
        return file.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.graphics.Bitmap r3, java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L68
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L68
            java.lang.String r0 = r0.getName()     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L66
            java.lang.String r2 = ".png"
            boolean r0 = r0.endsWith(r2)     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L66
            if (r0 == 0) goto L21
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L66
            r2 = 100
            r3.compress(r0, r2, r1)     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L66
        L1e:
            if (r1 != 0) goto L3b
        L20:
            return
        L21:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L66
            r2 = 100
            r3.compress(r0, r2, r1)     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L66
            goto L1e
        L29:
            r0 = move-exception
        L2a:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L20
            r1.flush()     // Catch: java.io.IOException -> L4c
        L32:
            r1.close()     // Catch: java.io.IOException -> L36
            goto L20
        L36:
            r0 = move-exception
            r0.printStackTrace()
            goto L20
        L3b:
            r1.flush()     // Catch: java.io.IOException -> L47
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L20
        L42:
            r0 = move-exception
            r0.printStackTrace()
            goto L20
        L47:
            r0 = move-exception
            r0.printStackTrace()
            goto L3e
        L4c:
            r0 = move-exception
            r0.printStackTrace()
            goto L32
        L51:
            r0 = move-exception
            r1 = r2
        L53:
            if (r1 == 0) goto L20
            r1.flush()     // Catch: java.io.IOException -> L5c
        L58:
            r1.close()     // Catch: java.io.IOException -> L61
        L5b:
            throw r0
        L5c:
            r2 = move-exception
            r2.printStackTrace()
            goto L58
        L61:
            r1 = move-exception
            r1.printStackTrace()
            goto L5b
        L66:
            r0 = move-exception
            goto L53
        L68:
            r0 = move-exception
            r1 = r2
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.a(android.graphics.Bitmap, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static android.graphics.Bitmap a(android.content.Context r10, android.net.Uri r11, int r12, int r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.a(android.content.Context, android.net.Uri, int, int, boolean, int):android.graphics.Bitmap");
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        if (i > 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i);
            matrix.reset();
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (OutOfMemoryError e2) {
                return null;
            }
        }
        return bitmap;
    }

    private boolean l() {
        e("javascript:" + this.J + "('http://theme.cmcm.com/811F6DE1-F0F8-4669-B91C-D0A0237FEFF9/camera/camera_name_" + String.valueOf(System.currentTimeMillis()) + "');");
        return true;
    }

    private boolean g(Intent intent) {
        this.I = intent;
        e("javascript:" + this.J + "('http://theme.cmcm.com/811F6DE1-F0F8-4669-B91C-D0A0237FEFF9/image/image_name_" + String.valueOf(System.currentTimeMillis()) + "');");
        return true;
    }

    public void a(String str, int i) {
        this.L = new c();
        this.L.c = i;
        if (i == 1) {
            this.L.a = 1280;
            this.L.b = 1280;
        } else {
            this.L.a = 1440;
            this.L.b = 1280;
        }
        this.I = null;
        this.J = str;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        a(intent, 3);
    }

    public void b(String str, int i) {
        this.L = new c();
        this.L.c = i;
        if (i == 1) {
            this.L.a = 1280;
            this.L.b = 1280;
        } else {
            this.L.a = 1440;
            this.L.b = 1280;
        }
        this.J = str;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", Uri.fromFile(a(true)));
        a(intent, 2);
    }

    private void a(Intent intent, int i) {
        try {
            startActivityForResult(Intent.createChooser(intent, ""), i);
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z) {
        if (this.E != null && !this.E.isEmpty()) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeCmClubActivity.this.g != null) {
                        ThemeCmClubActivity.this.e(String.format("javascript:%s('%b');", ThemeCmClubActivity.this.E, Boolean.valueOf(z)));
                        ThemeCmClubActivity.this.E = null;
                    }
                }
            });
        }
    }
}
