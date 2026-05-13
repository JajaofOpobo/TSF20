package com.tsf.extend.wallpaper.upload;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.tsf.extend.C1335b;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.C1336a;
import com.tsf.extend.base.p073c.AbstractBinderC1384e;
import com.tsf.extend.base.p073c.InterfaceC1383d;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1429h;
import com.tsf.extend.base.p080j.C1436o;
import com.tsf.extend.base.p080j.C1439r;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.wallpaper.upload.C2125a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class UploadWallpaperService extends Service {

    /* renamed from: b */
    private Uri f6935b;

    /* renamed from: c */
    private Thread f6936c;

    /* renamed from: d */
    private String f6937d;

    /* renamed from: g */
    private Runnable f6940g;

    /* renamed from: j */
    private C2125a f6943j;

    /* renamed from: k */
    private NotifReceiver f6944k;

    /* renamed from: l */
    private HashMap<String, String> f6945l;

    /* renamed from: m */
    private Handler f6946m;

    /* renamed from: n */
    private RunnableC2122b f6947n;

    /* renamed from: a */
    private boolean f6934a = false;

    /* renamed from: e */
    private String f6938e = "";

    /* renamed from: f */
    private boolean f6939f = false;

    /* renamed from: h */
    private BinderC2124d f6941h = new BinderC2124d();

    /* renamed from: i */
    private EnumC2123c f6942i = EnumC2123c.idle;

    /* renamed from: com.tsf.extend.wallpaper.upload.UploadWallpaperService$c */
    /* loaded from: classes.dex */
    public enum EnumC2123c {
        idle,
        uploading
    }

    public native String requestKey();

    /* renamed from: com.tsf.extend.wallpaper.upload.UploadWallpaperService$a */
    /* loaded from: classes.dex */
    public enum EnumC2121a {
        APPLY(1, "apply"),
        SUBMIT(2, "submit"),
        ALL(3, "submit");
        

        /* renamed from: d */
        private final int f6960d;

        /* renamed from: e */
        private final String f6961e;

        EnumC2121a(int i, String str) {
            this.f6960d = i;
            this.f6961e = str;
        }

        /* renamed from: a */
        public boolean m6321a(EnumC2121a enumC2121a) {
            return (this.f6960d & enumC2121a.m6322a()) != 0;
        }

        /* renamed from: a */
        public int m6322a() {
            return this.f6960d;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6961e;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6941h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!m6334d()) {
            m6338b("GDPR没有开启： UploadWallpaperService onCreate 不能启动");
            return;
        }
        m6338b("GDPR已经开启： UploadWallpaperService onCreate 可以启动");
        m6336c();
    }

    /* renamed from: c */
    private void m6336c() {
        if (!this.f6934a) {
            this.f6934a = true;
            this.f6944k = new NotifReceiver();
            IntentFilter intentFilter = new IntentFilter("com.ksmobile.launcher.uwpp.action_cancel");
            intentFilter.addAction("com.ksmobile.launcher.uwpp.action_retry");
            registerReceiver(this.f6944k, intentFilter);
        }
    }

    /* renamed from: d */
    private boolean m6334d() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* renamed from: b */
    private void m6338b(String str) {
        if (C1335b.f4221a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!m6334d()) {
            m6338b("GDPR没有开启： UploadWallpaperService onStartCommand 不能处理命令");
            return 1;
        }
        m6338b("GDPR已经开启： UploadWallpaperService onStartCommand 可以处理命令");
        m6336c();
        if (this.f6942i == EnumC2123c.idle) {
            if (intent == null) {
                return 2;
            }
            if ((intent.getAction() == null || !intent.getAction().equals("cml.intent.action.BOUND")) && intent.getData() != null) {
                this.f6935b = intent.getData();
                if (this.f6935b == null) {
                    stopSelf();
                    return 2;
                }
                m6355a(intent);
                return 1;
            }
            return 1;
        }
        return 1;
    }

    /* renamed from: a */
    public void m6355a(Intent intent) {
        m6341b(intent);
        this.f6943j.m6313a((Bitmap) intent.getParcelableExtra("bitmap"));
        m6332e();
    }

    /* renamed from: a */
    public void m6360a() {
        this.f6939f = false;
        m6332e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6359a(int i) {
        this.f6939f = true;
        if (this.f6936c != null) {
            try {
                this.f6936c.interrupt();
                this.f6936c = null;
            } catch (Exception e) {
            }
        }
        if (this.f6943j != null) {
            this.f6943j.m6311a(C2125a.EnumC2128a.cancel, 0);
        }
        stopSelf();
    }

    /* renamed from: b */
    private void m6341b(Intent intent) {
        final String m6344b;
        final boolean booleanExtra = intent.getBooleanExtra("upload_wallpaper", false);
        final EnumC2121a enumC2121a = EnumC2121a.values()[intent.getIntExtra("upload_act", 0)];
        final String stringExtra = intent.getStringExtra("upload_wallpaper_PARAM");
        if (booleanExtra) {
            this.f6943j = new C2125a(this, 10001);
            m6344b = m6356a(this, enumC2121a, stringExtra);
        } else {
            this.f6943j = new C2125a(this);
            m6344b = m6344b();
            this.f6937d = intent.getStringExtra("cid");
            try {
                this.f6938e = URLEncoder.encode(intent.getStringExtra("name"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            this.f6945l = new HashMap<>();
            this.f6945l.put("name", this.f6938e);
            this.f6945l.put("email", C1429h.m8661a(this));
        }
        this.f6940g = new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperService.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                UploadWallpaperService.this.f6942i = EnumC2123c.uploading;
                if (booleanExtra) {
                    try {
                        String str = (TextUtils.isEmpty(new JSONObject(stringExtra).optString("wallpaper_id")) && enumC2121a.m6321a(EnumC2121a.APPLY)) ? "upload_wallpaper.png" : null;
                        z = C1821e.m7398a(UploadWallpaperService.this.getBaseContext(), m6344b, str != null ? UploadWallpaperService.m6357a((Context) UploadWallpaperService.this, UploadWallpaperService.this.f6935b) : null, str, new C1821e.InterfaceC1831d() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperService.1.1

                            /* renamed from: a */
                            long f6953a = 0;

                            @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1831d
                            /* renamed from: a */
                            public void mo6324a(long j, long j2) {
                                UploadWallpaperService.this.m6358a((int) j, (int) j2);
                            }

                            @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1831d
                            /* renamed from: a */
                            public void mo6325a() {
                                this.f6953a = System.currentTimeMillis();
                                if (UploadWallpaperService.this.f6947n != null) {
                                    UploadWallpaperService.this.f6947n.m6320a();
                                    UploadWallpaperService.this.f6947n.m6319a(100, 0);
                                    if (UploadWallpaperService.this.f6946m != null) {
                                        UploadWallpaperService.this.f6946m.post(UploadWallpaperService.this.f6947n);
                                    }
                                }
                            }

                            @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1831d
                            /* renamed from: a */
                            public void mo6323a(boolean z2, String str2) {
                                if (z2 && UploadWallpaperService.this.f6941h != null && UploadWallpaperService.this.f6941h.m6316b() != null) {
                                    try {
                                        UploadWallpaperService.this.f6941h.m6316b().mo7371a(str2);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                } else if (!z2) {
                                    try {
                                        UploadWallpaperService.this.f6941h.m6316b().mo7370b(str2);
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (!UploadWallpaperService.this.f6939f) {
                                }
                            }
                        }) != null;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        z = false;
                    }
                } else {
                    z = UploadWallpaperService.this.m6347a(m6344b);
                }
                UploadWallpaperService.this.f6942i = EnumC2123c.idle;
                if (UploadWallpaperService.this.f6939f) {
                    UploadWallpaperService.this.f6943j.m6311a(C2125a.EnumC2128a.cancel, 0);
                    UploadWallpaperService.this.stopSelf();
                } else if (!z) {
                    UploadWallpaperService.this.f6943j.m6311a(C2125a.EnumC2128a.failed, 0);
                } else {
                    UploadWallpaperService.this.stopSelf();
                    UploadWallpaperService.this.f6943j.m6311a(C2125a.EnumC2128a.done, 0);
                }
            }
        };
        HandlerThread handlerThread = new HandlerThread("Notify_Thread");
        handlerThread.start();
        this.f6946m = new Handler(handlerThread.getLooper());
        this.f6947n = new RunnableC2122b();
    }

    /* renamed from: e */
    private void m6332e() {
        if (this.f6936c != null) {
            try {
                this.f6936c.interrupt();
                this.f6936c = null;
            } catch (Exception e) {
            }
        }
        this.f6936c = new Thread(this.f6940g, "UWWP");
        this.f6936c.start();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (m6334d() && this.f6934a) {
            m6338b("GDPR已经开启： UploadWallpaperService onDestroy 回收内存");
            this.f6939f = true;
            try {
                if (this.f6936c != null) {
                    this.f6936c.interrupt();
                    this.f6936c = null;
                }
                if (this.f6946m != null) {
                    this.f6946m.removeCallbacks(this.f6947n);
                    this.f6946m.getLooper().quit();
                    this.f6946m = null;
                }
            } catch (Exception e) {
            }
            unregisterReceiver(this.f6944k);
        } else {
            m6338b("GDPR没有开启： UploadWallpaperService onDestroy 不用回收");
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public static String m6356a(Context context, EnumC2121a enumC2121a, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            StringBuilder sb = new StringBuilder();
            if (enumC2121a.m6321a(EnumC2121a.APPLY) || enumC2121a.m6321a(EnumC2121a.SUBMIT)) {
                String string = jSONObject.getString("theme_pkg");
                sb.append(String.format("mcc=%s&", C1423d.m8685b(context)));
                sb.append(String.format("did=%s&", C1423d.m8688b()));
                sb.append(String.format("themepn=%s&", string));
            }
            if (enumC2121a.m6321a(EnumC2121a.APPLY)) {
                String string2 = jSONObject.getString("icon_group_id");
                String optString = jSONObject.optString("wallpaper_id");
                sb.append(String.format("icon_group_id=%s&", string2));
                if (!TextUtils.isEmpty(optString)) {
                    sb.append(String.format("wallpaper_id=%s&", optString));
                } else {
                    sb.append(String.format("wallpaper_id=%s&", ""));
                }
            }
            if (enumC2121a.m6321a(EnumC2121a.SUBMIT)) {
                String string3 = jSONObject.getString("diy_id");
                String string4 = jSONObject.getString("author_name");
                String string5 = jSONObject.getString("theme_name");
                String optString2 = jSONObject.optString("email");
                sb.append(String.format("diyid=%s&", string3));
                sb.append(String.format("theme_name=%s&", string5));
                sb.append(String.format("email=%s&", optString2));
                sb.append(String.format("author_name=%s&", string4));
            }
            if (enumC2121a.m6321a(EnumC2121a.APPLY) && enumC2121a.m6321a(EnumC2121a.SUBMIT)) {
                sb.append(String.format("act=%s", EnumC2121a.SUBMIT.toString()));
            } else if (enumC2121a.m6321a(EnumC2121a.APPLY)) {
                sb.append(String.format("act=%s", EnumC2121a.APPLY.toString()));
            } else {
                sb.append(String.format("act=%s", EnumC2121a.SUBMIT.toString()));
            }
            String sb2 = sb.toString();
            Log.i("", "postFile generateUrl:" + sb2);
            try {
                return "http://cml.ksmobile.com/diy/apply_submit?key=" + Base64.encodeToString(C1821e.m7388a(sb2.getBytes("utf-8")), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public String m6344b() {
        long currentTimeMillis = System.currentTimeMillis();
        String m8684c = C1423d.m8684c();
        String m8685b = C1423d.m8685b(this) == null ? "" : C1423d.m8685b(this);
        String m8606a = C1439r.m8606a(C1423d.m8688b());
        String m6330f = m6330f();
        String str = "";
        String str2 = "";
        try {
            str = URLEncoder.encode(Build.BRAND, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            str2 = URLEncoder.encode(Build.MODEL, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return "http://dapi.cml.ksmobile.com/wp/upload?" + String.format("mcc=%s&aid=%s&gaid=%s&brand=%s&model=%s&ts=%s&v=%s&pv=%s&cv=%s&sign=%s", m8685b, m8606a, m6330f, str, str2, Long.valueOf(currentTimeMillis), "1", "1", m8684c, C1439r.m8606a(String.format("aid=%s&gaid=%s&ts=%s&mcc=%s&pv=%s&pk=%s", m8606a, m6330f, Long.valueOf(currentTimeMillis), m8685b, "1", requestKey())));
    }

    /* renamed from: f */
    private String m6330f() {
        try {
            String m8953a = C1336a.m8954a(this).m8953a();
            if (TextUtils.isEmpty(m8953a)) {
                return "";
            }
            return m8953a;
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: a */
    public boolean m6347a(String str) {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        int available;
        byte[] bArr;
        HttpURLConnection httpURLConnection;
        String m6337b;
        String m6346a;
        if (TextUtils.isEmpty(str) || this.f6939f) {
            return false;
        }
        System.currentTimeMillis();
        this.f6947n.m6320a();
        this.f6947n.m6319a(100, 0);
        this.f6946m.post(this.f6947n);
        String uuid = UUID.randomUUID().toString();
        byte[] bytes = ("--" + uuid + "--\r\n").getBytes();
        InputStream m6328g = m6328g();
        if (m6328g == null) {
            return false;
        }
        try {
            available = m6328g.available();
            bArr = new byte[4096];
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            m6345a(httpURLConnection, uuid);
            m6337b = m6337b("--", uuid, "\r\n", "utf-8");
            m6346a = m6346a("--", uuid, "\r\n", "utf-8");
            httpURLConnection.setFixedLengthStreamingMode(m6337b.getBytes().length + m6346a.getBytes().length + available + bytes.length + "\r\n".getBytes().length);
            httpURLConnection.connect();
            dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        } catch (Exception e) {
            dataOutputStream2 = null;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.write(m6337b.getBytes());
            dataOutputStream.write(m6346a.getBytes());
            int i = 0;
            int i2 = 0;
            while (true) {
                int read = m6328g.read(bArr, 0, 4096);
                if (read < 0 || this.f6939f) {
                    break;
                }
                i2 += read;
                dataOutputStream.write(bArr, 0, read);
                i += read;
                if (i >= 12288) {
                    m6358a(available, i2);
                    i = 0;
                }
            }
        } catch (Exception e2) {
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (IOException e3) {
                }
            }
            if (m6328g != null) {
                try {
                    m6328g.close();
                } catch (IOException e4) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e5) {
                }
            }
            if (m6328g != null) {
                try {
                    m6328g.close();
                } catch (IOException e6) {
                }
            }
            throw th;
        }
        if (this.f6939f) {
            this.f6943j.m6315a();
            stopSelf();
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e7) {
                }
            }
            if (m6328g != null) {
                try {
                    m6328g.close();
                } catch (IOException e8) {
                }
            }
            return false;
        }
        m6358a(available, available);
        dataOutputStream.flush();
        dataOutputStream.write("\r\n".getBytes());
        dataOutputStream.write(bytes);
        dataOutputStream.flush();
        if (httpURLConnection.getResponseCode() == 200) {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2) && new JSONObject(sb2).optInt("res") == 0) {
                if (this.f6939f) {
                    this.f6943j.m6315a();
                    stopSelf();
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e9) {
                        }
                    }
                    if (m6328g != null) {
                        try {
                            m6328g.close();
                        } catch (IOException e10) {
                        }
                    }
                    return false;
                }
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException e11) {
                    }
                }
                if (m6328g != null) {
                    try {
                        m6328g.close();
                        return true;
                    } catch (IOException e12) {
                        return true;
                    }
                }
                return true;
            }
        }
        if (dataOutputStream != null) {
            try {
                dataOutputStream.close();
            } catch (IOException e13) {
            }
        }
        if (m6328g != null) {
            try {
                m6328g.close();
            } catch (IOException e14) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public InputStream m6328g() {
        InputStream inputStream;
        if (this.f6935b == null) {
            return null;
        }
        try {
            if (this.f6935b.getScheme().contains("file")) {
                inputStream = new FileInputStream(new File(this.f6935b.getPath()));
            } else {
                inputStream = this.f6935b.getScheme().contains("content") ? getContentResolver().openInputStream(this.f6935b) : null;
            }
        } catch (FileNotFoundException e) {
            inputStream = null;
        }
        return inputStream;
    }

    /* renamed from: a */
    private String m6346a(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append("Content-Disposition: form-data; name=\"image\"; filename=\"1.png\"; cate_id=\"" + this.f6937d + "\";" + str3);
        sb.append("Content-Type: image/pjpeg,image/png;charset=" + str4 + str3);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: b */
    private String m6337b(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        for (String str5 : this.f6945l.keySet()) {
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            sb.append("Content-Disposition: form-data; name=\"" + str5 + "\";" + str3);
            sb.append("Content-Type: text/plain;charset=" + str4 + str3);
            sb.append(str3);
            sb.append(this.f6945l.get(str5));
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m6345a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.upload.UploadWallpaperService$b */
    /* loaded from: classes.dex */
    public class RunnableC2122b implements Runnable {

        /* renamed from: b */
        private int f6963b;

        /* renamed from: c */
        private int f6964c;

        /* renamed from: d */
        private int f6965d;

        private RunnableC2122b() {
            this.f6963b = 0;
            this.f6964c = 0;
            this.f6965d = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            int round = Math.round(((this.f6964c * 1.0f) / this.f6965d) * 100.0f);
            if (round > this.f6963b) {
                UploadWallpaperService.this.m6343b(round);
                this.f6963b = round;
            }
        }

        /* renamed from: a */
        public void m6319a(int i, int i2) {
            this.f6964c = i2;
            this.f6965d = i;
        }

        /* renamed from: a */
        public void m6320a() {
            this.f6963b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6358a(int i, int i2) {
        this.f6946m.removeCallbacks(this.f6947n);
        this.f6947n.m6319a(i, i2);
        this.f6946m.post(this.f6947n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6343b(int i) {
        if (!this.f6939f) {
            this.f6943j.m6311a(C2125a.EnumC2128a.progress, i);
        }
    }

    /* loaded from: classes.dex */
    public class NotifReceiver extends BroadcastReceiver {
        public NotifReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long j;
            if (intent != null) {
                String action = intent.getAction();
                if (action.equals("com.ksmobile.launcher.uwpp.action_cancel")) {
                    UploadWallpaperService.this.m6359a(intent.getIntExtra("notification_id", 0));
                } else if (action.equals("com.ksmobile.launcher.uwpp.action_retry")) {
                    int m8626a = C1436o.m8626a(context);
                    if (m8626a != 2 && m8626a != 0) {
                        InputStream inputStream = null;
                        try {
                            try {
                                inputStream = UploadWallpaperService.this.m6328g();
                                long available = inputStream.available();
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e) {
                                        j = available;
                                    }
                                }
                                j = available;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e3) {
                                        j = 0;
                                    }
                                }
                                j = 0;
                            }
                            if (j > 1048576) {
                                Toast.makeText(context, String.format(UploadWallpaperService.this.getString(C1536f.C1543g.uplaod_wallpaper_dialog_mobile_network), DialogInterface$OnClickListenerC2135d.m6279a(j)), 1).show();
                            }
                            UploadWallpaperService.this.m6360a();
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e4) {
                                }
                            }
                            throw th;
                        }
                    } else if (m8626a == 0) {
                        Toast.makeText(context, C1536f.C1543g.uplaod_wallpaper_dialog_no_network, 1).show();
                    } else {
                        UploadWallpaperService.this.m6360a();
                    }
                }
            }
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.upload.UploadWallpaperService$d */
    /* loaded from: classes.dex */
    private class BinderC2124d extends AbstractBinderC1384e {

        /* renamed from: a */
        InterfaceC1383d f6969a;

        private BinderC2124d() {
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1384e
        /* renamed from: a */
        public void mo6317a(Intent intent, InterfaceC1383d interfaceC1383d) {
            if (intent != null && intent.getData() != null) {
                this.f6969a = interfaceC1383d;
                UploadWallpaperService.this.f6935b = intent.getData();
                UploadWallpaperService.this.m6355a(intent);
                return;
            }
            UploadWallpaperService.this.stopSelf();
        }

        @Override // com.tsf.extend.base.p073c.AbstractBinderC1384e
        /* renamed from: a */
        public int mo6318a() {
            return UploadWallpaperService.this.f6942i.ordinal();
        }

        /* renamed from: b */
        public InterfaceC1383d m6316b() {
            return this.f6969a;
        }
    }

    static {
        System.loadLibrary("uwpp");
    }

    /* renamed from: a */
    public static InputStream m6357a(Context context, Uri uri) {
        InputStream m6342b = m6342b(context, uri);
        if (m6342b != null) {
            try {
                if (m6342b.available() > 1048576) {
                    try {
                        int m6348a = m6348a(m6342b);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = m6348a;
                        m6342b = m6342b(context, uri);
                        Bitmap decodeStream = BitmapFactory.decodeStream(m6342b, null, options);
                        if (decodeStream != null) {
                            return m6354a(decodeStream);
                        }
                        return null;
                    } catch (OutOfMemoryError e) {
                        return null;
                    }
                }
            } catch (IOException e2) {
                InputStream inputStream = m6342b;
                e2.printStackTrace();
                return inputStream;
            }
        }
        return m6342b;
    }

    /* renamed from: b */
    private static InputStream m6342b(Context context, Uri uri) {
        if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        try {
            return new FileInputStream(new File(uri.toString()));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static int m6348a(InputStream inputStream) {
        double d;
        float f = 1.0f;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPurgeable = true;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i / i2 >= 1.125f) {
                d = i2 / 1280.0f;
            } else {
                d = i / 1440.0f;
            }
            while (f * 2.0f <= d) {
                f *= 2.0f;
            }
            return (int) (f > 2.0f ? f : 2.0f);
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private static InputStream m6354a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }
}
