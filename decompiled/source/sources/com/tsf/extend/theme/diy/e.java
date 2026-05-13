package com.tsf.extend.theme.diy;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.toolbox.j;
import com.google.android.collect.Lists;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.f.b;
import com.tsf.extend.base.j.i;
import com.tsf.extend.base.j.l;
import com.tsf.extend.base.j.p;
import com.tsf.extend.base.j.z;
import com.tsf.extend.theme.aq;
import com.tsf.extend.theme.k;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public interface a {
        void a(float f);

        void a(com.tsf.extend.theme.b bVar);

        boolean a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(float f);

        void a(com.tsf.extend.theme.b bVar);

        void a(boolean z);

        boolean a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(long j, long j2);

        void a(boolean z, String str);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(String str);

        void b(String str);
    }

    public static boolean a(String str, String str2) {
        try {
            String str3 = b(str2).getAbsolutePath() + File.separator;
            ZipFile zipFile = new ZipFile(str);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            byte[] bArr = new byte[1024];
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement.isDirectory()) {
                    new File(str3 + nextElement.getName()).mkdirs();
                } else {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c(str3, nextElement.getName())));
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(nextElement));
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedInputStream.close();
                    bufferedOutputStream.close();
                }
            }
            try {
                zipFile.close();
                return true;
            } catch (Exception e) {
                return true;
            }
        } catch (Exception e2) {
            return false;
        }
    }

    private static File b(String str) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        } else if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File c(String str, String str2) {
        File file;
        String str3;
        String str4;
        String[] split = str2.split("/");
        File file2 = new File(str);
        if (split.length >= 1) {
            int i = 0;
            while (true) {
                int i2 = i;
                file = file2;
                if (i2 >= split.length - 1) {
                    break;
                }
                String str5 = split[i2];
                try {
                    str4 = new String(str5.getBytes("8859_1"), "GB2312");
                } catch (UnsupportedEncodingException e) {
                    str4 = str5;
                }
                file2 = new File(file, str4);
                i = i2 + 1;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            String str6 = split[split.length - 1];
            try {
                str3 = new String(str6.getBytes("8859_1"), "GB2312");
            } catch (UnsupportedEncodingException e2) {
                str3 = str6;
            }
            return new File(file, str3);
        }
        return file2;
    }

    public static File a(Context context, String str) {
        if (context == null) {
            return null;
        }
        String a2 = p.a(context);
        if (TextUtils.isEmpty(a2)) {
            a2 = p.b(context);
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = context.getDir(str, 0).getAbsolutePath();
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        File file = new File(((a2 + File.separator) + "TsfTheme") + File.separator + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public static File a(Context context) {
        return a(context, ".THEME");
    }

    public static File b(Context context) {
        return a(context, ".DIY");
    }

    public static File a(Context context, long j, boolean z) {
        File b2 = b(context);
        if (b2 == null) {
            return null;
        }
        return new File(b2, j + (z ? ".cmt" : ".amr"));
    }

    public static File[] c(Context context) {
        File b2 = b(context);
        if (b2 == null || !b2.exists()) {
            return null;
        }
        File[] listFiles = b2.listFiles(new FilenameFilter() { // from class: com.tsf.extend.theme.diy.e.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("DIY_") || str.startsWith("CMT_");
            }
        });
        if (listFiles != null) {
            Arrays.sort(listFiles, new b());
            return listFiles;
        }
        return listFiles;
    }

    public static void a(String str, String str2, Object obj) {
        JSONObject jSONObject;
        String b2 = l.b(new File(str));
        if (TextUtils.isEmpty(b2)) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(b2);
            } catch (JSONException e) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(str2, obj);
        } catch (JSONException e2) {
        }
        l.a(jSONObject.toString(), str, false);
    }

    public static Object b(String str, String str2) {
        String b2 = l.b(new File(str));
        if (!TextUtils.isEmpty(b2)) {
            try {
                return new JSONObject(b2).opt(str2);
            } catch (JSONException e) {
            }
        }
        return null;
    }

    public static void a(Context context, Bitmap bitmap, Uri uri, JSONObject jSONObject, UploadWallpaperService.a aVar, g gVar) {
        if (aVar.equals(UploadWallpaperService.a.APPLY)) {
            z.a(2, new RunnableC0062e(context, uri, jSONObject, gVar));
            return;
        }
        Intent intent = new Intent(context, UploadWallpaperService.class);
        intent.setAction("cml.intent.action.BOUND");
        intent.putExtra("upload_act", aVar.ordinal());
        intent.putExtra("upload_wallpaper", true);
        intent.setData(uri);
        intent.putExtra("upload_wallpaper_PARAM", jSONObject.toString());
        int a2 = i.a(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(a2, a2, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Rect(0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), (bitmap.getHeight() + bitmap.getWidth()) / 2), new Rect(0, 0, a2, a2), (Paint) null);
        canvas.setBitmap(null);
        intent.putExtra("bitmap", createBitmap);
        h hVar = new h(intent);
        com.tsf.shell.component.a.a(context, intent);
        context.bindService(intent, hVar, 1);
        z.a(2, new f(hVar, intent, gVar));
    }

    /* renamed from: com.tsf.extend.theme.diy.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class RunnableC0062e implements Runnable {
        private Context a;
        private JSONObject b;
        private Uri c;
        private g d;

        public RunnableC0062e(Context context, Uri uri, JSONObject jSONObject, g gVar) {
            this.a = context;
            this.c = uri;
            this.b = jSONObject;
            this.d = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String a = UploadWallpaperService.a(this.a, UploadWallpaperService.a.APPLY, this.b.toString());
            String str = TextUtils.isEmpty(this.b.optString("wallpaper_id")) ? "upload_wallpaper.png" : null;
            e.a(this.a, a, str != null ? UploadWallpaperService.a(this.a, this.c) : null, str, new d() { // from class: com.tsf.extend.theme.diy.e.e.1
                @Override // com.tsf.extend.theme.diy.e.d
                public void a(long j, long j2) {
                }

                @Override // com.tsf.extend.theme.diy.e.d
                public void a() {
                }

                @Override // com.tsf.extend.theme.diy.e.d
                public void a(boolean z, String str2) {
                    if (z) {
                        RunnableC0062e.this.d.a(str2);
                    } else {
                        RunnableC0062e.this.d.b(str2);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    private static class f implements Runnable {
        private h a;
        private Intent b;
        private g c;

        public f(h hVar, Intent intent, g gVar) {
            this.a = hVar;
            this.b = intent;
            this.c = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tsf.extend.base.c.e a;
            int i = 0;
            while (true) {
                try {
                    a = this.a.a();
                    if (a == null) {
                        Thread.sleep(30L, 0);
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            i = a.a();
            if (UploadWallpaperService.c.values()[i] == UploadWallpaperService.c.idle) {
                a.a(this.b, new com.tsf.extend.base.c.d() { // from class: com.tsf.extend.theme.diy.e.f.1
                    @Override // com.tsf.extend.base.c.d
                    public void a(String str) {
                        if (f.this.c != null) {
                            f.this.c.a(str);
                        }
                    }

                    @Override // com.tsf.extend.base.c.d
                    public void b(String str) {
                        if (f.this.c != null) {
                            f.this.c.b(str);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    private static class h implements ServiceConnection {
        com.tsf.extend.base.c.e a;
        Intent b;

        public h(Intent intent) {
            this.b = null;
            this.b = intent;
        }

        public com.tsf.extend.base.c.e a() {
            return this.a;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.a = (com.tsf.extend.base.c.e) iBinder;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.a = null;
        }
    }

    public static String a(Context context, String str, InputStream inputStream, String str2, d dVar) {
        if (str == null) {
            return null;
        }
        if (dVar != null) {
            dVar.a();
        }
        String a2 = com.tsf.extend.base.j.g.a(str);
        String uuid = UUID.randomUUID().toString();
        DataOutputStream dataOutputStream = null;
        try {
            byte[] bArr = new byte[1024];
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(a2).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + uuid);
            httpURLConnection.connect();
            StringBuilder sb = new StringBuilder();
            sb.append("--");
            sb.append(uuid);
            sb.append("\r\n");
            if (str2 != null) {
                sb.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + str2 + "\"\r\n");
            }
            sb.append("Content-Type: text/plain;charset=utf-8\r\n");
            sb.append("\r\n");
            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                dataOutputStream2.write(sb.toString().getBytes());
                if (dVar != null) {
                    dVar.a(100L, 10L);
                }
                if (inputStream != null) {
                    int available = (int) ((inputStream.available() * 1.0f) / 0.8f);
                    int i = 0;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                        i += read;
                        if (dVar != null) {
                            dVar.a(available, (int) (i + (available * 0.1d)));
                        }
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    byteArrayOutputStream.close();
                    dataOutputStream2.write(a(byteArray));
                    dataOutputStream2.flush();
                    dataOutputStream2.write("\r\n".getBytes());
                }
                dataOutputStream2.write(("--" + uuid + "--\r\n").getBytes());
                dataOutputStream2.flush();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    StringBuilder sb2 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    }
                    String sb3 = sb2.toString();
                    if (!TextUtils.isEmpty(sb3) && new JSONObject(sb3).optInt("resCode") == 0) {
                        if (dVar != null) {
                            dVar.a(100L, 100L);
                            dVar.a(true, sb3);
                        }
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (IOException e) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                return sb3;
                            } catch (IOException e2) {
                                return sb3;
                            }
                        }
                        return sb3;
                    } else if (dVar != null) {
                        dVar.a(false, sb3);
                    }
                } else if (dVar != null) {
                    dVar.a(false, "{\"responseCode\":" + responseCode + "}");
                }
                if (dataOutputStream2 != null) {
                    try {
                        dataOutputStream2.close();
                    } catch (IOException e3) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                if (dVar != null) {
                    try {
                        dVar.a(false, "{\"exception\":" + th.getClass().getSimpleName() + "}");
                    } finally {
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return null;
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length / 2;
        for (int i = 0; i < length; i++) {
            if (i % 2 != 1) {
                byte b2 = bArr[i];
                bArr[i] = bArr[length + i];
                bArr[length + i] = b2;
            }
        }
        return bArr;
    }

    /* loaded from: classes.dex */
    private static class b implements Comparator<File> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            if (file.lastModified() == file2.lastModified()) {
                return 0;
            }
            return file.lastModified() > file2.lastModified() ? 1 : -1;
        }
    }

    public static void a(File file) {
        a(file, true);
    }

    public static void a(File file, boolean z) {
        if (file.isFile()) {
            if (z) {
                file.delete();
            }
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                if (z) {
                    file.delete();
                    return;
                }
                return;
            }
            for (File file2 : listFiles) {
                a(file2);
            }
            if (z) {
                file.delete();
            }
        }
    }

    public static aq a(String str, boolean z) {
        aq aVar;
        boolean z2;
        boolean z3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (new File(str).getName().startsWith("CMT_")) {
            aVar = new com.tsf.extend.theme.b();
        } else {
            aVar = new com.tsf.extend.theme.diy.a();
        }
        File file = new File(str, "theme/onlinetheme/theme");
        k kVar = (file == null || !file.exists()) ? null : (k) l.a(file);
        if (kVar != null) {
            aVar.i(kVar.q());
            aVar.d(kVar.i());
            aVar.i(kVar.F());
            aVar.h(kVar.p());
            aVar.a(kVar.h());
            if (aVar instanceof com.tsf.extend.theme.b) {
                ((com.tsf.extend.theme.b) aVar).a(true);
                ((com.tsf.extend.theme.b) aVar).b(kVar.g());
            }
        } else {
            aVar.i("YOU");
            aVar.d("DIY");
        }
        aVar.q(str);
        aVar.j("1.0.0");
        aVar.c(false);
        aVar.b(new Date(new File(str).lastModified()).getTime());
        aVar.c("DIY://" + aVar.I());
        File[] e = aVar.e(com.tsf.extend.h.b());
        File[] f2 = aVar.f(com.tsf.extend.h.b());
        if (z && ((e == null || e.length == 0) && (f2 == null || f2.length == 0))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (e == null || e.length <= 0) {
            z2 = false;
            z3 = false;
        } else {
            z2 = false;
            z3 = false;
            for (File file2 : e) {
                if (file2.getName().equals("launcher_preview0.png")) {
                    arrayList.add(0, Uri.fromFile(file2).toString());
                    z2 = true;
                    z3 = true;
                } else {
                    arrayList.add(Uri.fromFile(file2).toString());
                }
            }
        }
        if (!z3 || arrayList.size() == 0) {
            for (File file3 : f2) {
                if (!z2) {
                    arrayList.add(0, Uri.fromFile(f2[0]).toString());
                    z2 = true;
                } else {
                    arrayList.add(Uri.fromFile(file3).toString());
                }
            }
        }
        aVar.a(arrayList);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.util.List<java.lang.String> r19, final com.tsf.extend.theme.diy.e.a r20) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.e.a(android.content.Context, java.lang.String, java.lang.String, java.util.List, com.tsf.extend.theme.diy.e$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r16, final com.tsf.extend.theme.k r17, final com.tsf.extend.theme.diy.e.c r18) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.e.a(android.content.Context, com.tsf.extend.theme.k, com.tsf.extend.theme.diy.e$c):void");
    }

    public static aq a(Context context, k kVar) {
        return a(new File(b(context), "CMT_" + kVar.h() + "_LP" + (kVar.F() == 3 ? "_3D" : "_2D")).getAbsolutePath(), true);
    }

    public static boolean a(InputStream inputStream, String str, String str2) {
        if (com.tsf.extend.base.j.a.a(inputStream, str, "202CB962AC59075B964B07152D234B70", "D1D99CA9B7EC0708C83ECCA4B635DBF1")) {
            return a(str, str2);
        }
        return false;
    }

    public static String a(String str) {
        try {
            return "https://cml.ksmobile.com/diy/diy_info?key=" + URLEncoder.encode(com.tsf.extend.base.j.g.a(Base64.encodeToString(a(String.format("diyid=%s", str).getBytes("utf-8")), 0)), "UTF-8");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(String str, a.InterfaceC0048a<k> interfaceC0048a, Context context) {
        j a2 = com.tsf.extend.base.f.b.a(a(str), null, interfaceC0048a, new b.a<k>() { // from class: com.tsf.extend.theme.diy.e.6
            @Override // com.tsf.extend.base.f.b.a
            /* renamed from: a */
            public k b(JSONObject jSONObject) {
                JSONObject optJSONObject;
                if (jSONObject != null) {
                    try {
                        if (jSONObject.optInt("resCode", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        k kVar = new k();
                        kVar.i(optJSONObject.optString("author_name"));
                        kVar.a(optJSONObject.optInt("download_number"));
                        kVar.c(optJSONObject.optInt("favorite_count"));
                        kVar.a(optJSONObject.optLong("id"));
                        kVar.d(optJSONObject.optString("theme_name"));
                        kVar.h(optJSONObject.optString("theme_size"));
                        kVar.k(optJSONObject.optString("theme_logo"));
                        kVar.e(optJSONObject.optString("theme_download_url"));
                        kVar.c(optJSONObject.optString("diyid"));
                        kVar.j(jSONObject.optString("version"));
                        ArrayList newArrayList = Lists.newArrayList();
                        JSONArray optJSONArray = optJSONObject.optJSONArray("launcher_preview");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                newArrayList.add(optJSONArray.getString(i));
                            }
                        }
                        kVar.a(newArrayList);
                        return kVar;
                    } catch (JSONException e) {
                        return null;
                    }
                }
                return null;
            }
        });
        a2.a(false);
        com.tsf.extend.base.f.c.a(context).a((com.android.volley.l) a2);
    }
}
