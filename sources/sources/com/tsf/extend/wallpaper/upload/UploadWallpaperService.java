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
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    public enum c {
        idle,
        uploading
    }

    public native String requestKey();

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
        } else {
            b("GDPR已经开启： UploadWallpaperService onCreate 可以启动");
            c();
        }
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
    public int onStartCommand(Intent intent, int i, int i2) throws UnsupportedEncodingException {
        if (!d()) {
            b("GDPR没有开启： UploadWallpaperService onStartCommand 不能处理命令");
            return 1;
        }
        b("GDPR已经开启： UploadWallpaperService onStartCommand 可以处理命令");
        c();
        if (this.i != c.idle) {
            return 1;
        }
        if (intent == null) {
            return 2;
        }
        if ((intent.getAction() != null && intent.getAction().equals("cml.intent.action.BOUND")) || intent.getData() == null) {
            return 1;
        }
        this.b = intent.getData();
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        a(intent);
        return 1;
    }

    public void a(Intent intent) throws UnsupportedEncodingException {
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("bitmap");
        b(intent);
        this.j.a(bitmap);
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

    private void b(Intent intent) throws UnsupportedEncodingException {
        final String strB;
        final boolean booleanExtra = intent.getBooleanExtra("upload_wallpaper", false);
        final a aVar = a.values()[intent.getIntExtra("upload_act", 0)];
        final String stringExtra = intent.getStringExtra("upload_wallpaper_PARAM");
        if (booleanExtra) {
            this.j = new com.tsf.extend.wallpaper.upload.a(this, 10001);
            strB = a(this, aVar, stringExtra);
        } else {
            this.j = new com.tsf.extend.wallpaper.upload.a(this);
            strB = b();
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
            public void run() throws Throwable {
                boolean zA;
                UploadWallpaperService.this.i = c.uploading;
                if (booleanExtra) {
                    try {
                        String str = (TextUtils.isEmpty(new JSONObject(stringExtra).optString("wallpaper_id")) && aVar.a(a.APPLY)) ? "upload_wallpaper.png" : null;
                        zA = e.a(UploadWallpaperService.this.getBaseContext(), strB, str != null ? UploadWallpaperService.a((Context) UploadWallpaperService.this, UploadWallpaperService.this.b) : null, str, new e.d() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperService.1.1
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
                            public void a(boolean z, String str2) {
                                if (z && UploadWallpaperService.this.h != null && UploadWallpaperService.this.h.b() != null) {
                                    try {
                                        UploadWallpaperService.this.h.b().a(str2);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                } else if (!z) {
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
                        zA = false;
                    }
                } else {
                    zA = UploadWallpaperService.this.a(strB);
                }
                UploadWallpaperService.this.i = c.idle;
                if (UploadWallpaperService.this.f) {
                    UploadWallpaperService.this.j.a(a.EnumC0071a.cancel, 0);
                    UploadWallpaperService.this.stopSelf();
                } else if (!zA) {
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
        String str2 = null;
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
                String strOptString = jSONObject.optString("wallpaper_id");
                sb.append(String.format("icon_group_id=%s&", string2));
                if (!TextUtils.isEmpty(strOptString)) {
                    sb.append(String.format("wallpaper_id=%s&", strOptString));
                } else {
                    sb.append(String.format("wallpaper_id=%s&", ""));
                }
            }
            if (aVar.a(a.SUBMIT)) {
                String string3 = jSONObject.getString("diy_id");
                String string4 = jSONObject.getString("author_name");
                String string5 = jSONObject.getString("theme_name");
                String strOptString2 = jSONObject.optString("email");
                sb.append(String.format("diyid=%s&", string3));
                sb.append(String.format("theme_name=%s&", string5));
                sb.append(String.format("email=%s&", strOptString2));
                sb.append(String.format("author_name=%s&", string4));
            }
            if ((!aVar.a(a.APPLY) || !aVar.a(a.SUBMIT)) && aVar.a(a.APPLY)) {
                sb.append(String.format("act=%s", a.APPLY.toString()));
            } else {
                sb.append(String.format("act=%s", a.SUBMIT.toString()));
            }
            String string6 = sb.toString();
            Log.i("", "postFile generateUrl:" + string6);
            try {
                str2 = "http://cml.ksmobile.com/diy/apply_submit?key=" + Base64.encodeToString(e.a(string6.getBytes("utf-8")), 0);
                return str2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return str2;
        }
    }

    public String b() throws UnsupportedEncodingException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = com.tsf.extend.base.j.d.c();
        String strB = com.tsf.extend.base.j.d.b(this) == null ? "" : com.tsf.extend.base.j.d.b(this);
        String strA = r.a(com.tsf.extend.base.j.d.b());
        String strF = f();
        String strEncode = "";
        String strEncode2 = "";
        try {
            strEncode = URLEncoder.encode(Build.BRAND, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            strEncode2 = URLEncoder.encode(Build.MODEL, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return "http://dapi.cml.ksmobile.com/wp/upload?" + String.format("mcc=%s&aid=%s&gaid=%s&brand=%s&model=%s&ts=%s&v=%s&pv=%s&cv=%s&sign=%s", strB, strA, strF, strEncode, strEncode2, Long.valueOf(jCurrentTimeMillis), "1", "1", strC, r.a(String.format("aid=%s&gaid=%s&ts=%s&mcc=%s&pv=%s&pk=%s", strA, strF, Long.valueOf(jCurrentTimeMillis), strB, "1", requestKey())));
    }

    private String f() {
        try {
            String strA = com.tsf.extend.base.a.a(this).a();
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            return strA;
        } catch (Exception e) {
            return "";
        }
    }

    public boolean a(String str) throws Throwable {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        int iAvailable;
        byte[] bArr;
        HttpURLConnection httpURLConnection;
        String strB;
        String strA;
        if (TextUtils.isEmpty(str) || this.f) {
            return false;
        }
        System.currentTimeMillis();
        this.n.a();
        this.n.a(100, 0);
        this.m.post(this.n);
        String string = UUID.randomUUID().toString();
        byte[] bytes = ("--" + string + "--\r\n").getBytes();
        InputStream inputStreamG = g();
        if (inputStreamG == null) {
            return false;
        }
        try {
            iAvailable = inputStreamG.available();
            bArr = new byte[4096];
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            a(httpURLConnection, string);
            strB = b("--", string, "\r\n", "utf-8");
            strA = a("--", string, "\r\n", "utf-8");
            httpURLConnection.setFixedLengthStreamingMode(strB.getBytes().length + strA.getBytes().length + iAvailable + bytes.length + "\r\n".getBytes().length);
            httpURLConnection.connect();
            dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        } catch (Exception e) {
            dataOutputStream2 = null;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.write(strB.getBytes());
            dataOutputStream.write(strA.getBytes());
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = inputStreamG.read(bArr, 0, 4096);
                if (i3 < 0 || this.f) {
                    break;
                }
                i2 += i3;
                dataOutputStream.write(bArr, 0, i3);
                i += i3;
                if (i >= 12288) {
                    a(iAvailable, i2);
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
            if (inputStreamG != null) {
                try {
                    inputStreamG.close();
                } catch (IOException e4) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e5) {
                }
            }
            if (inputStreamG == null) {
                throw th;
            }
            try {
                inputStreamG.close();
                throw th;
            } catch (IOException e6) {
                throw th;
            }
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
            if (inputStreamG != null) {
                try {
                    inputStreamG.close();
                } catch (IOException e8) {
                }
            }
            return false;
        }
        a(iAvailable, iAvailable);
        dataOutputStream.flush();
        dataOutputStream.write("\r\n".getBytes());
        dataOutputStream.write(bytes);
        dataOutputStream.flush();
        if (httpURLConnection.getResponseCode() == 200) {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            String string2 = sb.toString();
            if (!TextUtils.isEmpty(string2) && new JSONObject(string2).optInt("res") == 0) {
                if (this.f) {
                    this.j.a();
                    stopSelf();
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e9) {
                        }
                    }
                    if (inputStreamG != null) {
                        try {
                            inputStreamG.close();
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
                if (inputStreamG == null) {
                    return true;
                }
                try {
                    inputStreamG.close();
                    return true;
                } catch (IOException e12) {
                    return true;
                }
            }
        }
        if (dataOutputStream != null) {
            try {
                dataOutputStream.close();
            } catch (IOException e13) {
            }
        }
        if (inputStreamG != null) {
            try {
                inputStreamG.close();
            } catch (IOException e14) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream g() {
        InputStream inputStreamOpenInputStream;
        if (this.b == null) {
            return null;
        }
        try {
            if (this.b.getScheme().contains("file")) {
                inputStreamOpenInputStream = new FileInputStream(new File(this.b.getPath()));
            } else {
                inputStreamOpenInputStream = this.b.getScheme().contains("content") ? getContentResolver().openInputStream(this.b) : null;
            }
        } catch (FileNotFoundException e) {
            inputStreamOpenInputStream = null;
        }
        return inputStreamOpenInputStream;
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
            String str6 = this.l.get(str5);
            sb.append("Content-Disposition: form-data; name=\"" + str5 + "\";" + str3);
            sb.append("Content-Type: text/plain;charset=" + str4 + str3);
            sb.append(str3);
            sb.append(str6);
            sb.append(str3);
        }
        return sb.toString();
    }

    private void a(HttpURLConnection httpURLConnection, String str) throws ProtocolException {
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + str);
    }

    private class b implements Runnable {
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
            int iRound = Math.round(((this.c * 1.0f) / this.d) * 100.0f);
            if (iRound > this.b) {
                UploadWallpaperService.this.b(iRound);
                this.b = iRound;
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
                    return;
                }
                if (action.equals("com.ksmobile.launcher.uwpp.action_retry")) {
                    int iA = o.a(context);
                    if (iA != 2 && iA != 0) {
                        InputStream inputStreamG = null;
                        try {
                            try {
                                inputStreamG = UploadWallpaperService.this.g();
                                long jAvailable = inputStreamG.available();
                                if (inputStreamG != null) {
                                    try {
                                        inputStreamG.close();
                                        j = jAvailable;
                                    } catch (IOException e) {
                                        j = jAvailable;
                                    }
                                } else {
                                    j = jAvailable;
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                if (inputStreamG == null) {
                                    j = 0;
                                } else {
                                    try {
                                        inputStreamG.close();
                                        j = 0;
                                    } catch (IOException e3) {
                                        j = 0;
                                    }
                                }
                            }
                            if (j > 1048576) {
                                Toast.makeText(context, String.format(UploadWallpaperService.this.getString(f.g.uplaod_wallpaper_dialog_mobile_network), com.tsf.extend.wallpaper.upload.d.a(j)), 1).show();
                            }
                            UploadWallpaperService.this.a();
                            return;
                        } catch (Throwable th) {
                            if (inputStreamG != null) {
                                try {
                                    inputStreamG.close();
                                } catch (IOException e4) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (iA == 0) {
                        Toast.makeText(context, f.g.uplaod_wallpaper_dialog_no_network, 1).show();
                    } else {
                        UploadWallpaperService.this.a();
                    }
                }
            }
        }
    }

    private class d extends com.tsf.extend.base.c.e {
        com.tsf.extend.base.c.d a;

        private d() {
        }

        @Override // com.tsf.extend.base.c.e
        public void a(Intent intent, com.tsf.extend.base.c.d dVar) throws UnsupportedEncodingException {
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
        InputStream inputStreamB = b(context, uri);
        if (inputStreamB != null) {
            try {
                if (inputStreamB.available() > 1048576) {
                    try {
                        int iA = a(inputStreamB);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = iA;
                        inputStreamB = b(context, uri);
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamB, null, options);
                        if (bitmapDecodeStream != null) {
                            return a(bitmapDecodeStream);
                        }
                        return null;
                    } catch (OutOfMemoryError e) {
                        return null;
                    }
                }
            } catch (IOException e2) {
                InputStream inputStream = inputStreamB;
                e2.printStackTrace();
                return inputStream;
            }
        }
        return inputStreamB;
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

    private static int a(InputStream inputStream) throws IOException {
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
