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
import com.tsf.extend.base.j.h;
import com.tsf.extend.base.j.o;
import com.tsf.extend.base.j.r;
import com.tsf.extend.f;
import com.tsf.extend.theme.diy.e;
import com.tsf.extend.wallpaper.upload.a;
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
    private Uri b;
    private Thread c;
    private String d;
    private Runnable g;
    private com.tsf.extend.wallpaper.upload.a j;
    private NotifReceiver k;
    private HashMap<String, String> l;
    private Handler m;
    private b n;
    private boolean a = false;
    private String e = "";
    private boolean f = false;
    private d h = new d();
    private c i = c.idle;

    /* loaded from: classes.dex */
    public enum c {
        idle,
        uploading
    }

    public native String requestKey();

    /* loaded from: classes.dex */
    public enum a {
        APPLY(1, "apply"),
        SUBMIT(2, "submit"),
        ALL(3, "submit");
        
        private final int d;
        private final String e;

        a(int i, String str) {
            this.d = i;
            this.e = str;
        }

        public boolean a(a aVar) {
            return (this.d & aVar.a()) != 0;
        }

        public int a() {
            return this.d;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.e;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!d()) {
            b("GDPR没有开启： UploadWallpaperService onCreate 不能启动");
            return;
        }
        b("GDPR已经开启： UploadWallpaperService onCreate 可以启动");
        c();
    }

    private void c() {
        if (!this.a) {
            this.a = true;
            this.k = new NotifReceiver();
            IntentFilter intentFilter = new IntentFilter("com.ksmobile.launcher.uwpp.action_cancel");
            intentFilter.addAction("com.ksmobile.launcher.uwpp.action_retry");
            registerReceiver(this.k, intentFilter);
        }
    }

    private boolean d() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    private void b(String str) {
        if (com.tsf.extend.b.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!d()) {
            b("GDPR没有开启： UploadWallpaperService onStartCommand 不能处理命令");
            return 1;
        }
        b("GDPR已经开启： UploadWallpaperService onStartCommand 可以处理命令");
        c();
        if (this.i == c.idle) {
            if (intent == null) {
                return 2;
            }
            if ((intent.getAction() == null || !intent.getAction().equals("cml.intent.action.BOUND")) && intent.getData() != null) {
                this.b = intent.getData();
                if (this.b == null) {
                    stopSelf();
                    return 2;
                }
                a(intent);
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public void a(Intent intent) {
        b(intent);
        this.j.a((Bitmap) intent.getParcelableExtra("bitmap"));
        e();
    }

    public void a() {
        this.f = false;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.f = true;
        if (this.c != null) {
            try {
                this.c.interrupt();
                this.c = null;
            } catch (Exception e) {
            }
        }
        if (this.j != null) {
            this.j.a(a.EnumC0071a.cancel, 0);
        }
        stopSelf();
    }

    private void b(Intent intent) {
        final String b2;
        final boolean booleanExtra = intent.getBooleanExtra("upload_wallpaper", false);
        final a aVar = a.values()[intent.getIntExtra("upload_act", 0)];
        final String stringExtra = intent.getStringExtra("upload_wallpaper_PARAM");
        if (booleanExtra) {
            this.j = new com.tsf.extend.wallpaper.upload.a(this, 10001);
            b2 = a(this, aVar, stringExtra);
        } else {
            this.j = new com.tsf.extend.wallpaper.upload.a(this);
            b2 = b();
            this.d = intent.getStringExtra("cid");
            try {
                this.e = URLEncoder.encode(intent.getStringExtra("name"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            this.l = new HashMap<>();
            this.l.put("name", this.e);
            this.l.put("email", h.a(this));
        }
        this.g = new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperService.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                UploadWallpaperService.this.i = c.uploading;
                if (booleanExtra) {
                    try {
                        String str = (TextUtils.isEmpty(new JSONObject(stringExtra).optString("wallpaper_id")) && aVar.a(a.APPLY)) ? "upload_wallpaper.png" : null;
                        z = e.a(UploadWallpaperService.this.getBaseContext(), b2, str != null ? UploadWallpaperService.a((Context) UploadWallpaperService.this, UploadWallpaperService.this.b) : null, str, new e.d() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperService.1.1
                            long a = 0;

                            @Override // com.tsf.extend.theme.diy.e.d
                            public void a(long j, long j2) {
                                UploadWallpaperService.this.a((int) j, (int) j2);
                            }

                            @Override // com.tsf.extend.theme.diy.e.d
                            public void a() {
                                this.a = System.currentTimeMillis();
                                if (UploadWallpaperService.this.n != null) {
                                    UploadWallpaperService.this.n.a();
                                    UploadWallpaperService.this.n.a(100, 0);
                                    if (UploadWallpaperService.this.m != null) {
                                        UploadWallpaperService.this.m.post(UploadWallpaperService.this.n);
                                    }
                                }
                            }

                            @Override // com.tsf.extend.theme.diy.e.d
                            public void a(boolean z2, String str2) {
                                if (z2 && UploadWallpaperService.this.h != null && UploadWallpaperService.this.h.b() != null) {
                                    try {
                                        UploadWallpaperService.this.h.b().a(str2);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                } else if (!z2) {
                                    try {
                                        UploadWallpaperService.this.h.b().b(str2);
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (!UploadWallpaperService.this.f) {
                                }
                            }
                        }) != null;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        z = false;
                    }
                } else {
                    z = UploadWallpaperService.this.a(b2);
                }
                UploadWallpaperService.this.i = c.idle;
                if (UploadWallpaperService.this.f) {
                    UploadWallpaperService.this.j.a(a.EnumC0071a.cancel, 0);
                    UploadWallpaperService.this.stopSelf();
                } else if (!z) {
                    UploadWallpaperService.this.j.a(a.EnumC0071a.failed, 0);
                } else {
                    UploadWallpaperService.this.stopSelf();
                    UploadWallpaperService.this.j.a(a.EnumC0071a.done, 0);
                }
            }
        };
        HandlerThread handlerThread = new HandlerThread("Notify_Thread");
        handlerThread.start();
        this.m = new Handler(handlerThread.getLooper());
        this.n = new b();
    }

    private void e() {
        if (this.c != null) {
            try {
                this.c.interrupt();
                this.c = null;
            } catch (Exception e) {
            }
        }
        this.c = new Thread(this.g, "UWWP");
        this.c.start();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (d() && this.a) {
            b("GDPR已经开启： UploadWallpaperService onDestroy 回收内存");
            this.f = true;
            try {
                if (this.c != null) {
                    this.c.interrupt();
                    this.c = null;
                }
                if (this.m != null) {
                    this.m.removeCallbacks(this.n);
                    this.m.getLooper().quit();
                    this.m = null;
                }
            } catch (Exception e) {
            }
            unregisterReceiver(this.k);
        } else {
            b("GDPR没有开启： UploadWallpaperService onDestroy 不用回收");
        }
        super.onDestroy();
    }

    public static String a(Context context, a aVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            StringBuilder sb = new StringBuilder();
            if (aVar.a(a.APPLY) || aVar.a(a.SUBMIT)) {
                String string = jSONObject.getString("theme_pkg");
                sb.append(String.format("mcc=%s&", com.tsf.extend.base.j.d.b(context)));
                sb.append(String.format("did=%s&", com.tsf.extend.base.j.d.b()));
                sb.append(String.format("themepn=%s&", string));
            }
            if (aVar.a(a.APPLY)) {
                String string2 = jSONObject.getString("icon_group_id");
                String optString = jSONObject.optString("wallpaper_id");
                sb.append(String.format("icon_group_id=%s&", string2));
                if (!TextUtils.isEmpty(optString)) {
                    sb.append(String.format("wallpaper_id=%s&", optString));
                } else {
                    sb.append(String.format("wallpaper_id=%s&", ""));
                }
            }
            if (aVar.a(a.SUBMIT)) {
                String string3 = jSONObject.getString("diy_id");
                String string4 = jSONObject.getString("author_name");
                String string5 = jSONObject.getString("theme_name");
                String optString2 = jSONObject.optString("email");
                sb.append(String.format("diyid=%s&", string3));
                sb.append(String.format("theme_name=%s&", string5));
                sb.append(String.format("email=%s&", optString2));
                sb.append(String.format("author_name=%s&", string4));
            }
            if (aVar.a(a.APPLY) && aVar.a(a.SUBMIT)) {
                sb.append(String.format("act=%s", a.SUBMIT.toString()));
            } else if (aVar.a(a.APPLY)) {
                sb.append(String.format("act=%s", a.APPLY.toString()));
            } else {
                sb.append(String.format("act=%s", a.SUBMIT.toString()));
            }
            String sb2 = sb.toString();
            Log.i("", "postFile generateUrl:" + sb2);
            try {
                return "http://cml.ksmobile.com/diy/apply_submit?key=" + Base64.encodeToString(e.a(sb2.getBytes("utf-8")), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String b() {
        long currentTimeMillis = System.currentTimeMillis();
        String c2 = com.tsf.extend.base.j.d.c();
        String b2 = com.tsf.extend.base.j.d.b(this) == null ? "" : com.tsf.extend.base.j.d.b(this);
        String a2 = r.a(com.tsf.extend.base.j.d.b());
        String f = f();
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
        return "http://dapi.cml.ksmobile.com/wp/upload?" + String.format("mcc=%s&aid=%s&gaid=%s&brand=%s&model=%s&ts=%s&v=%s&pv=%s&cv=%s&sign=%s", b2, a2, f, str, str2, Long.valueOf(currentTimeMillis), "1", "1", c2, r.a(String.format("aid=%s&gaid=%s&ts=%s&mcc=%s&pv=%s&pk=%s", a2, f, Long.valueOf(currentTimeMillis), b2, "1", requestKey())));
    }

    private String f() {
        try {
            String a2 = com.tsf.extend.base.a.a(this).a();
            if (TextUtils.isEmpty(a2)) {
                return "";
            }
            return a2;
        } catch (Exception e) {
            return "";
        }
    }

    public boolean a(String str) {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        int available;
        byte[] bArr;
        HttpURLConnection httpURLConnection;
        String b2;
        String a2;
        if (TextUtils.isEmpty(str) || this.f) {
            return false;
        }
        System.currentTimeMillis();
        this.n.a();
        this.n.a(100, 0);
        this.m.post(this.n);
        String uuid = UUID.randomUUID().toString();
        byte[] bytes = ("--" + uuid + "--\r\n").getBytes();
        InputStream g = g();
        if (g == null) {
            return false;
        }
        try {
            available = g.available();
            bArr = new byte[4096];
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            a(httpURLConnection, uuid);
            b2 = b("--", uuid, "\r\n", "utf-8");
            a2 = a("--", uuid, "\r\n", "utf-8");
            httpURLConnection.setFixedLengthStreamingMode(b2.getBytes().length + a2.getBytes().length + available + bytes.length + "\r\n".getBytes().length);
            httpURLConnection.connect();
            dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        } catch (Exception e) {
            dataOutputStream2 = null;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.write(b2.getBytes());
            dataOutputStream.write(a2.getBytes());
            int i = 0;
            int i2 = 0;
            while (true) {
                int read = g.read(bArr, 0, 4096);
                if (read < 0 || this.f) {
                    break;
                }
                i2 += read;
                dataOutputStream.write(bArr, 0, read);
                i += read;
                if (i >= 12288) {
                    a(available, i2);
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
            if (g != null) {
                try {
                    g.close();
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
            if (g != null) {
                try {
                    g.close();
                } catch (IOException e6) {
                }
            }
            throw th;
        }
        if (this.f) {
            this.j.a();
            stopSelf();
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e7) {
                }
            }
            if (g != null) {
                try {
                    g.close();
                } catch (IOException e8) {
                }
            }
            return false;
        }
        a(available, available);
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
                if (this.f) {
                    this.j.a();
                    stopSelf();
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e9) {
                        }
                    }
                    if (g != null) {
                        try {
                            g.close();
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
                if (g != null) {
                    try {
                        g.close();
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
        if (g != null) {
            try {
                g.close();
            } catch (IOException e14) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream g() {
        InputStream inputStream;
        if (this.b == null) {
            return null;
        }
        try {
            if (this.b.getScheme().contains("file")) {
                inputStream = new FileInputStream(new File(this.b.getPath()));
            } else {
                inputStream = this.b.getScheme().contains("content") ? getContentResolver().openInputStream(this.b) : null;
            }
        } catch (FileNotFoundException e) {
            inputStream = null;
        }
        return inputStream;
    }

    private String a(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append("Content-Disposition: form-data; name=\"image\"; filename=\"1.png\"; cate_id=\"" + this.d + "\";" + str3);
        sb.append("Content-Type: image/pjpeg,image/png;charset=" + str4 + str3);
        sb.append(str3);
        return sb.toString();
    }

    private String b(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        for (String str5 : this.l.keySet()) {
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            sb.append("Content-Disposition: form-data; name=\"" + str5 + "\";" + str3);
            sb.append("Content-Type: text/plain;charset=" + str4 + str3);
            sb.append(str3);
            sb.append(this.l.get(str5));
            sb.append(str3);
        }
        return sb.toString();
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private int b;
        private int c;
        private int d;

        private b() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            int round = Math.round(((this.c * 1.0f) / this.d) * 100.0f);
            if (round > this.b) {
                UploadWallpaperService.this.b(round);
                this.b = round;
            }
        }

        public void a(int i, int i2) {
            this.c = i2;
            this.d = i;
        }

        public void a() {
            this.b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        this.m.removeCallbacks(this.n);
        this.n.a(i, i2);
        this.m.post(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (!this.f) {
            this.j.a(a.EnumC0071a.progress, i);
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
                    UploadWallpaperService.this.a(intent.getIntExtra("notification_id", 0));
                } else if (action.equals("com.ksmobile.launcher.uwpp.action_retry")) {
                    int a = o.a(context);
                    if (a != 2 && a != 0) {
                        InputStream inputStream = null;
                        try {
                            try {
                                inputStream = UploadWallpaperService.this.g();
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
                                Toast.makeText(context, String.format(UploadWallpaperService.this.getString(f.g.uplaod_wallpaper_dialog_mobile_network), com.tsf.extend.wallpaper.upload.d.a(j)), 1).show();
                            }
                            UploadWallpaperService.this.a();
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e4) {
                                }
                            }
                            throw th;
                        }
                    } else if (a == 0) {
                        Toast.makeText(context, f.g.uplaod_wallpaper_dialog_no_network, 1).show();
                    } else {
                        UploadWallpaperService.this.a();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private class d extends com.tsf.extend.base.c.e {
        com.tsf.extend.base.c.d a;

        private d() {
        }

        @Override // com.tsf.extend.base.c.e
        public void a(Intent intent, com.tsf.extend.base.c.d dVar) {
            if (intent != null && intent.getData() != null) {
                this.a = dVar;
                UploadWallpaperService.this.b = intent.getData();
                UploadWallpaperService.this.a(intent);
                return;
            }
            UploadWallpaperService.this.stopSelf();
        }

        @Override // com.tsf.extend.base.c.e
        public int a() {
            return UploadWallpaperService.this.i.ordinal();
        }

        public com.tsf.extend.base.c.d b() {
            return this.a;
        }
    }

    static {
        System.loadLibrary("uwpp");
    }

    public static InputStream a(Context context, Uri uri) {
        InputStream b2 = b(context, uri);
        if (b2 != null) {
            try {
                if (b2.available() > 1048576) {
                    try {
                        int a2 = a(b2);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = a2;
                        b2 = b(context, uri);
                        Bitmap decodeStream = BitmapFactory.decodeStream(b2, null, options);
                        if (decodeStream != null) {
                            return a(decodeStream);
                        }
                        return null;
                    } catch (OutOfMemoryError e) {
                        return null;
                    }
                }
            } catch (IOException e2) {
                InputStream inputStream = b2;
                e2.printStackTrace();
                return inputStream;
            }
        }
        return b2;
    }

    private static InputStream b(Context context, Uri uri) {
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

    private static int a(InputStream inputStream) {
        double d2;
        float f = 1.0f;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPurgeable = true;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i / i2 >= 1.125f) {
                d2 = i2 / 1280.0f;
            } else {
                d2 = i / 1440.0f;
            }
            while (f * 2.0f <= d2) {
                f *= 2.0f;
            }
            return (int) (f > 2.0f ? f : 2.0f);
        } finally {
            inputStream.close();
        }
    }

    private static InputStream a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }
}
