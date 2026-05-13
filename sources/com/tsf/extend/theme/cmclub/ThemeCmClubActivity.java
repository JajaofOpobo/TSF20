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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.DialogInterfaceC1526e;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p073c.InterfaceC1380a;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1703b;
import com.tsf.extend.theme.C1846j;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.theme.diy.ThemeDIYActivity;
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

    /* renamed from: d */
    static int f5572d = 30000;

    /* renamed from: e */
    public static final Uri f5573e = Uri.parse("content://com.ksmobile.launcher.ThemeCmClubProvider");

    /* renamed from: k */
    private static Map<String, Integer> f5574k = new HashMap();

    /* renamed from: t */
    private static String f5575t;

    /* renamed from: u */
    private static String f5576u;

    /* renamed from: A */
    private Timer f5577A;

    /* renamed from: B */
    private String f5578B;

    /* renamed from: C */
    private ProgressBar f5579C;

    /* renamed from: E */
    private String f5581E;

    /* renamed from: K */
    private ValueCallback<Uri> f5587K;

    /* renamed from: L */
    private C1748c f5588L;

    /* renamed from: O */
    private AbstractBinderC1381b f5591O;

    /* renamed from: f */
    Context f5594f;

    /* renamed from: g */
    WebView f5595g;

    /* renamed from: l */
    private String f5599l;

    /* renamed from: m */
    private String f5600m;

    /* renamed from: n */
    private String f5601n;

    /* renamed from: o */
    private String f5602o;

    /* renamed from: p */
    private boolean f5603p;

    /* renamed from: q */
    private String f5604q;

    /* renamed from: r */
    private boolean f5605r;

    /* renamed from: s */
    private String f5606s;

    /* renamed from: v */
    private int f5607v;

    /* renamed from: y */
    private C1703b f5610y;

    /* renamed from: z */
    private RunnableC1747b f5611z;

    /* renamed from: i */
    private final String f5597i = "ThemeCmClubActivity";

    /* renamed from: j */
    private boolean f5598j = false;

    /* renamed from: w */
    private String[] f5608w = {"http://club.cmcm.com/forum.php?mod=forumdisplay&fid=41&mobile=2", "http://theme.cmcm.com/themepost/", "http://api.theme.cmcm.com", "http://theme.cmcm.com/tools/submit.html", "http://www.freetheme.mobi/#list"};

    /* renamed from: x */
    private int f5609x = -1;

    /* renamed from: D */
    private boolean f5580D = false;

    /* renamed from: F */
    private boolean f5582F = false;

    /* renamed from: G */
    private String f5583G = "";

    /* renamed from: H */
    private String f5584H = null;

    /* renamed from: I */
    private Intent f5585I = null;

    /* renamed from: J */
    private String f5586J = null;

    /* renamed from: h */
    String f5596h = "";

    /* renamed from: M */
    private Set<String> f5589M = new HashSet();

    /* renamed from: N */
    private Handler f5590N = new Handler() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ThemeCmClubActivity.this.m7603b(true);
                    return;
                case 1001:
                    ThemeCmClubActivity.this.f5579C.setVisibility(4);
                    return;
                default:
                    if (ThemeCmClubActivity.this.f5611z != null) {
                        ThemeCmClubActivity.this.f5611z.m7575a();
                    }
                    ThemeCmClubActivity.this.m7603b(false);
                    Toast.makeText(ThemeCmClubActivity.this.f5594f, C1536f.C1543g.theme_changing_fail, 1).show();
                    return;
            }
        }
    };

    /* renamed from: P */
    private ServiceConnection f5592P = new ServiceConnection() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.6
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeCmClubActivity.this.f5591O = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeCmClubActivity.this.f5591O = (AbstractBinderC1381b) iBinder;
        }
    };

    /* renamed from: Q */
    private Runnable f5593Q = new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.4
        @Override // java.lang.Runnable
        public void run() {
            ThemeCmClubActivity.this.onBackPressed();
        }
    };

    static {
        f5574k.put("app_manager", Integer.valueOf(C1536f.C1540d.icon_app_manager));
        f5574k.put("browser", Integer.valueOf(C1536f.C1540d.browser));
        f5574k.put("calculator", Integer.valueOf(C1536f.C1540d.calculator));
        f5574k.put("calendar", Integer.valueOf(C1536f.C1540d.calendar));
        f5574k.put("camera", Integer.valueOf(C1536f.C1540d.camera));
        f5574k.put("clean_master", Integer.valueOf(C1536f.C1540d.clean_master));
        f5574k.put("clock", Integer.valueOf(C1536f.C1540d.clock));
        f5574k.put("cm_browser", Integer.valueOf(C1536f.C1540d.cm_browser));
        f5574k.put("cm_club", Integer.valueOf(C1536f.C1540d.cm_club));
        f5574k.put("cm_locker", Integer.valueOf(C1536f.C1540d.cm_lock));
        f5574k.put("cm_security", Integer.valueOf(C1536f.C1540d.cm_security));
        f5574k.put("contact", Integer.valueOf(C1536f.C1540d.contact));
        f5574k.put("download", Integer.valueOf(C1536f.C1540d.download));
        f5574k.put("email", Integer.valueOf(C1536f.C1540d.email));
        f5574k.put("filemanager", Integer.valueOf(C1536f.C1540d.filemanager));
        f5574k.put("flashlight", Integer.valueOf(C1536f.C1540d.flashlight));
        f5574k.put("market", Integer.valueOf(C1536f.C1540d.market));
        f5574k.put("message", Integer.valueOf(C1536f.C1540d.message));
        f5574k.put("message_spirit", Integer.valueOf(C1536f.C1540d.message_spirit));
        f5574k.put("music", Integer.valueOf(C1536f.C1540d.music));
        f5574k.put("phone", Integer.valueOf(C1536f.C1540d.phone));
        f5574k.put("record", Integer.valueOf(C1536f.C1540d.record));
        f5574k.put("settings", Integer.valueOf(C1536f.C1540d.settings));
        f5574k.put("sort_apps", Integer.valueOf(C1536f.C1540d.sort_apps));
        f5574k.put("theme", Integer.valueOf(C1536f.C1540d.theme));
        f5574k.put("video", Integer.valueOf(C1536f.C1540d.video));
        f5574k.put("wallpaper", Integer.valueOf(C1536f.C1540d.wallpaper));
        f5574k.put("widget_all_apps", Integer.valueOf(C1536f.C1540d.widget_all_apps));
        f5574k.put("widget_recently", Integer.valueOf(C1536f.C1540d.widget_recently));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.cmclub.ThemeCmClubActivity$c */
    /* loaded from: classes.dex */
    public static class C1748c {

        /* renamed from: a */
        public int f5636a;

        /* renamed from: b */
        public int f5637b;

        /* renamed from: c */
        public int f5638c;

        C1748c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public File m7611a(boolean z) {
        File m7399a = C1821e.m7399a(this.f5594f, ".image");
        if (m7399a == null) {
            return null;
        }
        File file = new File(m7399a.toString(), "camera_capture.jpg");
        if (z && file.exists()) {
            file.delete();
            return file;
        }
        return file;
    }

    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1437p.m8622a((Activity) this);
        setContentView(C1536f.C1542f.theme_cmclub_activity);
        getApplicationContext().bindService(new Intent("android.service.theme.ManagerService"), this.f5592P, 1);
        this.f5594f = this;
        this.f5605r = false;
        this.f5579C = (ProgressBar) findViewById(C1536f.C1541e.progressbar);
        this.f5595g = (WebView) findViewById(C1536f.C1541e.webview);
        this.f5595g.getSettings().setDomStorageEnabled(true);
        this.f5595g.setWebViewClient(new C1749d());
        this.f5595g.setWebChromeClient(new WebChromeClient() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.7
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                if (ThemeCmClubActivity.this.f5579C != null) {
                    if (ThemeCmClubActivity.this.f5579C.getVisibility() != 0) {
                        ThemeCmClubActivity.this.f5579C.setVisibility(0);
                    }
                    ThemeCmClubActivity.this.f5579C.setProgress(i);
                    if (i == 100 && ThemeCmClubActivity.this.f5590N != null && !ThemeCmClubActivity.this.f5590N.hasMessages(1001)) {
                        ThemeCmClubActivity.this.f5590N.sendMessageDelayed(ThemeCmClubActivity.this.f5590N.obtainMessage(1001), 3000L);
                    }
                }
            }
        });
        try {
            this.f5595g.getSettings().setJavaScriptEnabled(true);
        } catch (Exception e) {
        }
        if (Build.VERSION.SDK_INT >= 19) {
            String m8682c = C1423d.m8682c(this);
            if (!TextUtils.isEmpty(m8682c) && m8682c.startsWith("99999999")) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        this.f5595g.addJavascriptInterface(new C1750a(this), "Activity");
        this.f5595g.addJavascriptInterface(new C1756c(this), "ThemeDetail");
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5595g.addJavascriptInterface(new C1755b(this), "DIY");
        }
        this.f5595g.addJavascriptInterface(new C1758d(this), "WebView");
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5595g.getSettings().setAllowUniversalAccessFromFileURLs(true);
        }
        this.f5608w[2] = this.f5608w[2] + "/?mcc=" + C1423d.m8685b(C1547h.m8290b()) + "&ver=" + C1423d.m8684c();
        m7584h();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m7584h();
    }

    /* renamed from: h */
    private void m7584h() {
        Intent intent = getIntent();
        if (intent != null) {
            if (m7593e(intent)) {
                this.f5607v = 3;
            } else {
                this.f5606s = m7628a(intent);
                m7609b(intent);
                f5575t = m7601c(intent);
                f5576u = m7597d(intent);
                this.f5607v = m7589f(intent);
            }
        }
        this.f5595g.loadUrl(this.f5608w[this.f5607v]);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f5591O != null) {
            getApplicationContext().unbindService(this.f5592P);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (this.f5587K != null) {
                Uri data = (intent == null || i2 != -1) ? null : intent.getData();
                if (data != null) {
                    data = C1426e.m8665c(this, data);
                }
                this.f5587K.onReceiveValue(data);
                this.f5587K = null;
            }
        } else if (i == 2) {
            if (i2 == -1 && this.f5586J != null) {
                m7577l();
            }
        } else if (i == 3 && i2 == -1 && intent != null && this.f5586J != null) {
            m7586g(intent);
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
        if (this.f5611z != null && this.f5611z.m7574b()) {
            m7580j();
        } else if (this.f5595g != null && this.f5595g.canGoBack()) {
            if (this.f5582F) {
                this.f5595g.loadUrl("javascript:clientOnBackPressed()");
            }
            if (!TextUtils.isEmpty(this.f5584H)) {
                this.f5595g.loadUrl("javascript:backByWeb('" + this.f5584H + "')");
            } else {
                this.f5595g.goBack();
            }
        } else if ("launch_from_others".equals(f5575t)) {
            if ("launch_host_theme".equals(f5576u)) {
                Intent intent = new Intent(this, PersonalizationActivity.class);
                intent.putExtra("TARGET_PAGE", 1);
                startActivity(intent);
            } else if ("launch_host_club".equals(f5576u)) {
                ThemeDIYActivity.m7549a(this, "1001", 0);
            }
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public static void m7629a(Context context, String str, String str2, int i) {
        Intent intent = new Intent(context, ThemeCmClubActivity.class);
        intent.putExtra("launch_from", str);
        intent.putExtra("launch_host", str2);
        intent.putExtra("web_url_index", i);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private String m7628a(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("UPLOAD_RESPONSE")) == null) {
            return "-1";
        }
        try {
            return new JSONObject(stringExtra).getJSONObject("data").getString("diyid");
        } catch (JSONException e) {
            e.printStackTrace();
            return "-1";
        }
    }

    /* renamed from: b */
    private void m7609b(Intent intent) {
        if (intent != null) {
            String stringExtra = getIntent().getStringExtra("upload_wallpaper_data");
            String stringExtra2 = intent.getStringExtra("UPLOAD_RESPONSE");
            if (stringExtra != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    this.f5599l = jSONObject.getString("wallpaper_id");
                    this.f5600m = jSONObject.getString("wallpaper_categoryId");
                    this.f5601n = jSONObject.getString("wallpaper_tag");
                    this.f5602o = jSONObject.getString("wallpaper_name");
                    this.f5603p = jSONObject.getBoolean("wallpaper_online");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (stringExtra2 != null) {
                try {
                    this.f5604q = new JSONObject(stringExtra2).getJSONObject("data").getString("token");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    private String m7601c(Intent intent) {
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("launch_from");
    }

    /* renamed from: d */
    private String m7597d(Intent intent) {
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("launch_host");
    }

    /* renamed from: e */
    private boolean m7593e(Intent intent) {
        return intent.getBooleanExtra("diy_theme_h5_shared", false);
    }

    /* renamed from: a */
    public String m7633a() {
        return f5576u;
    }

    /* renamed from: f */
    private int m7589f(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("web_url_index", 0);
            if (intExtra < 0 || intExtra > this.f5608w.length - 1) {
                return 0;
            }
            return intExtra;
        }
        return 0;
    }

    /* renamed from: a */
    public void m7615a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            final C1848k c1848k = new C1848k();
            c1848k.m7292i(jSONObject2.optString("author_name"));
            c1848k.m7321a(jSONObject2.optInt("download_number"));
            c1848k.m7312c(jSONObject2.optInt("favorite_count"));
            c1848k.m7320a(jSONObject2.optLong("id"));
            c1848k.m7307d(jSONObject2.optString("theme_name"));
            c1848k.m7295h(jSONObject2.optString("theme_size"));
            c1848k.m7288k(jSONObject2.optString("theme_logo"));
            c1848k.m7304e(jSONObject2.optString("theme_download_url"));
            this.f5578B = jSONObject2.optString("diyid");
            c1848k.m7310c(this.f5578B);
            c1848k.m7290j(jSONObject.optString("version"));
            ArrayList newArrayList = Lists.newArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("launcher_preview");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        newArrayList.add(optJSONArray.getString(i));
                    } catch (JSONException e) {
                    }
                }
            }
            c1848k.m7318a(newArrayList);
            new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    ThemeCmClubActivity.this.m7613a(Long.toString(c1848k.m7297h()), c1848k.m7289k(), c1848k.m7274t());
                }
            }.run();
        } catch (Exception e2) {
            Toast.makeText(this.f5594f, C1536f.C1543g.cm_club_download_stopped, 0).show();
        }
    }

    /* renamed from: b */
    public int m7610b() {
        return this.f5609x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tsf.extend.theme.cmclub.ThemeCmClubActivity$10] */
    /* renamed from: i */
    public void m7582i() {
        final InterfaceC1380a interfaceC1380a = new InterfaceC1380a() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.9
            @Override // com.tsf.extend.base.p073c.InterfaceC1380a
            /* renamed from: a */
            public void mo7464a(int i) {
                if (ThemeCmClubActivity.this.f5577A != null) {
                    ThemeCmClubActivity.this.f5577A.cancel();
                }
                ThemeCmClubActivity.this.f5590N.sendEmptyMessage(i);
            }
        };
        new AsyncTask<Void, Void, Void>() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                try {
                    if (!(ThemeCmClubActivity.this.f5610y != null ? ThemeCmClubActivity.this.m7612a(ThemeCmClubActivity.this.f5610y.m7300g(), false, interfaceC1380a) : false)) {
                        ThemeCmClubActivity.this.f5590N.sendEmptyMessage(1);
                        return null;
                    }
                    return null;
                } catch (RemoteException e) {
                    ThemeCmClubActivity.this.f5590N.sendEmptyMessage(1);
                    return null;
                }
            }
        }.execute(new Void[0]);
        this.f5577A = new Timer();
        this.f5577A.schedule(new TimerTask() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.11
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ThemeCmClubActivity.this.f5590N.sendEmptyMessage(1);
            }
        }, f5572d);
    }

    /* renamed from: a */
    public boolean m7612a(String str, boolean z, InterfaceC1380a interfaceC1380a) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PACKAGE_NAME", str);
            if (str.startsWith("DIY://")) {
                Object m7385b = C1821e.m7385b(str.substring("DIY://".length()) + File.separator + "diy.config", "isLocalDiy");
                if (m7385b instanceof Boolean) {
                    jSONObject.put("NO_ICON_GROUP", m7385b);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                jSONObject.put("FROM_DIY_THEME", true);
                jSONObject.put("EXIT_AFTER_APPLY_THEME", this.f5598j);
                this.f5598j = false;
            }
        } catch (JSONException e) {
        }
        String jSONObject2 = jSONObject.toString();
        if (this.f5591O != null) {
            this.f5591O.mo7563a(jSONObject2, interfaceC1380a);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7613a(String str, String str2, List<String> list) {
        if (this.f5611z != null) {
            this.f5611z.m7575a();
        }
        this.f5611z = new RunnableC1747b(str, str2, list);
        new Thread(this.f5611z).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.cmclub.ThemeCmClubActivity$b */
    /* loaded from: classes.dex */
    public class RunnableC1747b implements Runnable {

        /* renamed from: b */
        private boolean f5631b = false;

        /* renamed from: c */
        private C1746a f5632c;

        /* renamed from: d */
        private String f5633d;

        /* renamed from: e */
        private String f5634e;

        /* renamed from: f */
        private List<String> f5635f;

        RunnableC1747b(String str, String str2, List<String> list) {
            this.f5632c = new C1746a();
            this.f5633d = str;
            this.f5634e = str2;
            this.f5635f = list;
        }

        /* renamed from: a */
        public void m7575a() {
            this.f5632c.f5628a = true;
            this.f5631b = true;
            ThemeCmClubActivity.this.f5609x = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1821e.m7397a(ThemeCmClubActivity.this.f5594f, this.f5633d, this.f5634e, this.f5635f, this.f5632c);
            this.f5631b = true;
        }

        /* renamed from: b */
        public boolean m7574b() {
            return !this.f5631b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.cmclub.ThemeCmClubActivity$a */
    /* loaded from: classes.dex */
    public class C1746a implements C1821e.InterfaceC1828a {

        /* renamed from: a */
        public boolean f5628a = false;

        C1746a() {
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: a */
        public boolean mo7378a() {
            return this.f5628a;
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: b */
        public void mo7375b() {
            ThemeCmClubActivity.this.f5609x = 1;
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: a */
        public void mo7377a(float f) {
            if (f > 0.0f && f < 1.0f) {
                f = 1.0f;
            }
            if (!mo7378a()) {
                ThemeCmClubActivity.this.f5609x = (int) f;
            }
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: a */
        public void mo7376a(C1703b c1703b) {
            ThemeCmClubActivity.this.f5609x = 100;
            ThemeCmClubActivity.this.f5610y = c1703b;
            ThemeCmClubActivity.this.m7582i();
        }
    }

    /* renamed from: b */
    public void m7605b(String str) {
        new C1846j().m7337a(this.f5594f, 2, "https://cml.ksmobile.com/diy/detail?d=" + str, new C1703b(), new C1846j.InterfaceC1847a() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.12
            @Override // com.tsf.extend.theme.C1846j.InterfaceC1847a
            /* renamed from: a */
            public void mo7332a(String str2) {
                if (str2 != null) {
                }
            }

            @Override // com.tsf.extend.theme.C1846j.InterfaceC1847a
            /* renamed from: a */
            public void mo7333a() {
            }
        });
    }

    /* renamed from: c */
    public void m7602c() {
        if (!m7578k() && this.f5595g != null && this.f5595g.canGoBack()) {
            this.f5595g.goBack();
        }
    }

    /* renamed from: d */
    public void m7598d() {
        finish();
    }

    /* renamed from: e */
    public void m7594e() {
        if (this.f5595g != null) {
            this.f5595g.clearHistory();
        }
    }

    /* renamed from: c */
    public boolean m7599c(String str) {
        return this.f5580D;
    }

    /* renamed from: f */
    public void m7590f() {
        this.f5582F = true;
    }

    /* renamed from: j */
    private void m7580j() {
        new DialogInterfaceC1526e.C1532a(this.f5594f).m8301a(C1536f.C1543g.cm_club_dialog_stop_downloading).m8298b(C1536f.C1543g.cm_club_dialog_cancel, null).m8300a(C1536f.C1543g.cm_club_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (ThemeCmClubActivity.this.f5611z != null) {
                    ThemeCmClubActivity.this.f5611z.m7575a();
                }
                ThemeCmClubActivity.this.onBackPressed();
            }
        }).m8302a().m8314a(true);
    }

    /* renamed from: a */
    public static void m7630a(final Context context, final String str) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (context != null) {
                    Toast.makeText(context, str, 0).show();
                }
            }
        });
    }

    /* renamed from: k */
    private boolean m7578k() {
        if (this.f5595g == null || this.f5595g.getUrl() == null || !this.f5595g.getUrl().contains("http://theme.cmcm.com/themepost/")) {
            return false;
        }
        this.f5595g.loadUrl("http://club.cmcm.com/forum.php?mod=forumdisplay&fid=41&mobile=2");
        this.f5595g.clearHistory();
        return true;
    }

    /* renamed from: com.tsf.extend.theme.cmclub.ThemeCmClubActivity$d */
    /* loaded from: classes.dex */
    private class C1749d extends WebViewClient {
        private C1749d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ThemeCmClubActivity.this.f5584H = null;
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            ThemeCmClubActivity.this.f5584H = null;
            if ("cmcm://close".equals(str)) {
                C1455z.m8564a(0, ThemeCmClubActivity.this.f5593Q);
                return true;
            } else if (str.startsWith("mailto:")) {
                ThemeCmClubActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } else {
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }

        /* renamed from: a */
        private InputStream m7573a(Uri uri, int i, int i2, int i3) {
            Bitmap bitmap;
            try {
                bitmap = ThemeCmClubActivity.m7631a(ThemeCmClubActivity.this.f5594f, uri, i, i2, false, i3);
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
            File m7611a;
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
                    return new WebResourceResponse("image/png", "UTF-8", new BufferedInputStream(new FileInputStream(ThemeCmClubActivity.m7632a(ThemeCmClubActivity.this.f5594f))));
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            } else if ("icons".equals(str3)) {
                Cursor query = ThemeCmClubActivity.this.getContentResolver().query(ThemeCmClubActivity.f5573e, null, str2, null, null);
                if (query == null || !query.moveToFirst() || (blob = query.getBlob(query.getColumnIndexOrThrow("bitmap"))) == null || (byteArrayInputStream = new ByteArrayInputStream(blob)) == null) {
                    return null;
                }
                return new WebResourceResponse("image/png", "UTF-8", byteArrayInputStream);
            } else if ("image".equals(str3)) {
                if (ThemeCmClubActivity.this.f5585I == null || ThemeCmClubActivity.this.f5585I.getData() == null || ThemeCmClubActivity.this.f5588L == null) {
                    return null;
                }
                InputStream m7573a = m7573a(ThemeCmClubActivity.this.f5585I.getData(), ThemeCmClubActivity.this.f5588L.f5636a, ThemeCmClubActivity.this.f5588L.f5637b, ThemeCmClubActivity.this.f5588L.f5638c);
                ThemeCmClubActivity.this.f5585I = null;
                ThemeCmClubActivity.this.f5588L = null;
                if (m7573a != null) {
                    return new WebResourceResponse("image/png", "UTF-8", m7573a);
                }
                return null;
            } else if (!"camera".equals(str3) || (m7611a = ThemeCmClubActivity.this.m7611a(false)) == null || ThemeCmClubActivity.this.f5588L == null) {
                return null;
            } else {
                InputStream m7573a2 = m7573a(Uri.fromFile(m7611a), ThemeCmClubActivity.this.f5588L.f5636a, ThemeCmClubActivity.this.f5588L.f5637b, ThemeCmClubActivity.this.f5588L.f5638c);
                ThemeCmClubActivity.this.f5588L = null;
                if (m7573a2 != null) {
                    return new WebResourceResponse("image/png", "UTF-8", m7573a2);
                }
                return null;
            }
        }
    }

    /* renamed from: g */
    public void m7587g() {
        if (this.f5595g != null) {
            this.f5595g.clearCache(true);
        }
    }

    /* renamed from: d */
    public void m7595d(String str) {
        this.f5584H = str;
    }

    /* renamed from: e */
    public void m7591e(String str) {
        if (this.f5595g != null) {
            this.f5595g.loadUrl(str);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                if (this.f5595g != null && this.f5595g.getProgress() >= 90 && !this.f5596h.isEmpty()) {
                    m7591e("javascript:" + this.f5596h + "();");
                    return true;
                }
                break;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static String m7632a(Context context) {
        Bitmap bitmap;
        File m7399a = C1821e.m7399a(context, ".image");
        if (m7399a == null) {
            return null;
        }
        File file = new File(m7399a.toString(), "the_wallpaper.jpg");
        if (file.exists()) {
            file.delete();
        }
        BitmapDrawable m8691a = C1423d.m8691a(WallpaperManager.getInstance(context));
        if (m8691a == null || (bitmap = m8691a.getBitmap()) == null) {
            return null;
        }
        m7625a(bitmap, file.toString());
        return file.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7625a(android.graphics.Bitmap r3, java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.m7625a(android.graphics.Bitmap, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: a */
    public static android.graphics.Bitmap m7631a(android.content.Context r10, android.net.Uri r11, int r12, int r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.m7631a(android.content.Context, android.net.Uri, int, int, boolean, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m7626a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        if (i > 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i);
            matrix.reset();
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (OutOfMemoryError e) {
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: l */
    private boolean m7577l() {
        m7591e("javascript:" + this.f5586J + "('http://theme.cmcm.com/811F6DE1-F0F8-4669-B91C-D0A0237FEFF9/camera/camera_name_" + String.valueOf(System.currentTimeMillis()) + "');");
        return true;
    }

    /* renamed from: g */
    private boolean m7586g(Intent intent) {
        this.f5585I = intent;
        m7591e("javascript:" + this.f5586J + "('http://theme.cmcm.com/811F6DE1-F0F8-4669-B91C-D0A0237FEFF9/image/image_name_" + String.valueOf(System.currentTimeMillis()) + "');");
        return true;
    }

    /* renamed from: a */
    public void m7614a(String str, int i) {
        this.f5588L = new C1748c();
        this.f5588L.f5638c = i;
        if (i == 1) {
            this.f5588L.f5636a = 1280;
            this.f5588L.f5637b = 1280;
        } else {
            this.f5588L.f5636a = 1440;
            this.f5588L.f5637b = 1280;
        }
        this.f5585I = null;
        this.f5586J = str;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        m7627a(intent, 3);
    }

    /* renamed from: b */
    public void m7604b(String str, int i) {
        this.f5588L = new C1748c();
        this.f5588L.f5638c = i;
        if (i == 1) {
            this.f5588L.f5636a = 1280;
            this.f5588L.f5637b = 1280;
        } else {
            this.f5588L.f5636a = 1440;
            this.f5588L.f5637b = 1280;
        }
        this.f5586J = str;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", Uri.fromFile(m7611a(true)));
        m7627a(intent, 2);
    }

    /* renamed from: a */
    private void m7627a(Intent intent, int i) {
        try {
            startActivityForResult(Intent.createChooser(intent, ""), i);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7603b(final boolean z) {
        if (this.f5581E != null && !this.f5581E.isEmpty()) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.ThemeCmClubActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeCmClubActivity.this.f5595g != null) {
                        ThemeCmClubActivity.this.m7591e(String.format("javascript:%s('%b');", ThemeCmClubActivity.this.f5581E, Boolean.valueOf(z)));
                        ThemeCmClubActivity.this.f5581E = null;
                    }
                }
            });
        }
    }
}
