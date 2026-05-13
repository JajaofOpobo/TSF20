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
import com.android.volley.AbstractC0795l;
import com.android.volley.toolbox.C0838j;
import com.google.android.collect.Lists;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p073c.AbstractBinderC1384e;
import com.tsf.extend.base.p073c.InterfaceC1383d;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p076f.C1402b;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1418a;
import com.tsf.extend.base.p080j.C1428g;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1433l;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.AbstractC1700aq;
import com.tsf.extend.theme.C1703b;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
import com.tsf.shell.component.C2233a;
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
/* renamed from: com.tsf.extend.theme.diy.e */
/* loaded from: classes.dex */
public class C1821e {

    /* renamed from: com.tsf.extend.theme.diy.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1828a {
        /* renamed from: a */
        void mo7377a(float f);

        /* renamed from: a */
        void mo7376a(C1703b c1703b);

        /* renamed from: a */
        boolean mo7378a();

        /* renamed from: b */
        void mo7375b();
    }

    /* renamed from: com.tsf.extend.theme.diy.e$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1830c {
        /* renamed from: a */
        void mo6474a(float f);

        /* renamed from: a */
        void mo6473a(C1703b c1703b);

        /* renamed from: a */
        void mo6472a(boolean z);

        /* renamed from: a */
        boolean mo6475a();

        /* renamed from: b */
        void mo6471b();
    }

    /* renamed from: com.tsf.extend.theme.diy.e$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1831d {
        /* renamed from: a */
        void mo6325a();

        /* renamed from: a */
        void mo6324a(long j, long j2);

        /* renamed from: a */
        void mo6323a(boolean z, String str);
    }

    /* renamed from: com.tsf.extend.theme.diy.e$g */
    /* loaded from: classes.dex */
    public interface InterfaceC1836g {
        /* renamed from: a */
        void mo7369a(String str);

        /* renamed from: b */
        void mo7368b(String str);
    }

    /* renamed from: a */
    public static boolean m7391a(String str, String str2) {
        try {
            String str3 = m7386b(str2).getAbsolutePath() + File.separator;
            ZipFile zipFile = new ZipFile(str);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            byte[] bArr = new byte[1024];
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement.isDirectory()) {
                    new File(str3 + nextElement.getName()).mkdirs();
                } else {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m7383c(str3, nextElement.getName())));
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

    /* renamed from: b */
    private static File m7386b(String str) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        } else if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    private static File m7383c(String str, String str2) {
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

    /* renamed from: a */
    public static File m7399a(Context context, String str) {
        if (context == null) {
            return null;
        }
        String m8621a = C1437p.m8621a(context);
        if (TextUtils.isEmpty(m8621a)) {
            m8621a = C1437p.m8617b(context);
        }
        if (TextUtils.isEmpty(m8621a)) {
            m8621a = context.getDir(str, 0).getAbsolutePath();
        }
        if (TextUtils.isEmpty(m8621a)) {
            return null;
        }
        File file = new File(((m8621a + File.separator) + "TsfTheme") + File.separator + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* renamed from: a */
    public static File m7404a(Context context) {
        return m7399a(context, ".THEME");
    }

    /* renamed from: b */
    public static File m7387b(Context context) {
        return m7399a(context, ".DIY");
    }

    /* renamed from: a */
    public static File m7403a(Context context, long j, boolean z) {
        File m7387b = m7387b(context);
        if (m7387b == null) {
            return null;
        }
        return new File(m7387b, j + (z ? ".cmt" : ".amr"));
    }

    /* renamed from: c */
    public static File[] m7384c(Context context) {
        File m7387b = m7387b(context);
        if (m7387b == null || !m7387b.exists()) {
            return null;
        }
        File[] listFiles = m7387b.listFiles(new FilenameFilter() { // from class: com.tsf.extend.theme.diy.e.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("DIY_") || str.startsWith("CMT_");
            }
        });
        if (listFiles != null) {
            Arrays.sort(listFiles, new C1829b());
            return listFiles;
        }
        return listFiles;
    }

    /* renamed from: a */
    public static void m7390a(String str, String str2, Object obj) {
        JSONObject jSONObject;
        String m8640b = C1433l.m8640b(new File(str));
        if (TextUtils.isEmpty(m8640b)) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(m8640b);
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
        C1433l.m8641a(jSONObject.toString(), str, false);
    }

    /* renamed from: b */
    public static Object m7385b(String str, String str2) {
        String m8640b = C1433l.m8640b(new File(str));
        if (!TextUtils.isEmpty(m8640b)) {
            try {
                return new JSONObject(m8640b).opt(str2);
            } catch (JSONException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m7402a(Context context, Bitmap bitmap, Uri uri, JSONObject jSONObject, UploadWallpaperService.EnumC2121a enumC2121a, InterfaceC1836g interfaceC1836g) {
        if (enumC2121a.equals(UploadWallpaperService.EnumC2121a.APPLY)) {
            C1455z.m8564a(2, new RunnableC1832e(context, uri, jSONObject, interfaceC1836g));
            return;
        }
        Intent intent = new Intent(context, UploadWallpaperService.class);
        intent.setAction("cml.intent.action.BOUND");
        intent.putExtra("upload_act", enumC2121a.ordinal());
        intent.putExtra("upload_wallpaper", true);
        intent.setData(uri);
        intent.putExtra("upload_wallpaper_PARAM", jSONObject.toString());
        int m8659a = C1430i.m8659a(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(m8659a, m8659a, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Rect(0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), (bitmap.getHeight() + bitmap.getWidth()) / 2), new Rect(0, 0, m8659a, m8659a), (Paint) null);
        canvas.setBitmap(null);
        intent.putExtra("bitmap", createBitmap);
        ServiceConnectionC1837h serviceConnectionC1837h = new ServiceConnectionC1837h(intent);
        C2233a.m6034a(context, intent);
        context.bindService(intent, serviceConnectionC1837h, 1);
        C1455z.m8564a(2, new RunnableC1834f(serviceConnectionC1837h, intent, interfaceC1836g));
    }

    /* renamed from: com.tsf.extend.theme.diy.e$e */
    /* loaded from: classes.dex */
    private static class RunnableC1832e implements Runnable {

        /* renamed from: a */
        private Context f5878a;

        /* renamed from: b */
        private JSONObject f5879b;

        /* renamed from: c */
        private Uri f5880c;

        /* renamed from: d */
        private InterfaceC1836g f5881d;

        public RunnableC1832e(Context context, Uri uri, JSONObject jSONObject, InterfaceC1836g interfaceC1836g) {
            this.f5878a = context;
            this.f5880c = uri;
            this.f5879b = jSONObject;
            this.f5881d = interfaceC1836g;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m6356a = UploadWallpaperService.m6356a(this.f5878a, UploadWallpaperService.EnumC2121a.APPLY, this.f5879b.toString());
            String str = TextUtils.isEmpty(this.f5879b.optString("wallpaper_id")) ? "upload_wallpaper.png" : null;
            C1821e.m7398a(this.f5878a, m6356a, str != null ? UploadWallpaperService.m6357a(this.f5878a, this.f5880c) : null, str, new InterfaceC1831d() { // from class: com.tsf.extend.theme.diy.e.e.1
                @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1831d
                /* renamed from: a */
                public void mo6324a(long j, long j2) {
                }

                @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1831d
                /* renamed from: a */
                public void mo6325a() {
                }

                @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1831d
                /* renamed from: a */
                public void mo6323a(boolean z, String str2) {
                    if (z) {
                        RunnableC1832e.this.f5881d.mo7369a(str2);
                    } else {
                        RunnableC1832e.this.f5881d.mo7368b(str2);
                    }
                }
            });
        }
    }

    /* renamed from: com.tsf.extend.theme.diy.e$f */
    /* loaded from: classes.dex */
    private static class RunnableC1834f implements Runnable {

        /* renamed from: a */
        private ServiceConnectionC1837h f5883a;

        /* renamed from: b */
        private Intent f5884b;

        /* renamed from: c */
        private InterfaceC1836g f5885c;

        public RunnableC1834f(ServiceConnectionC1837h serviceConnectionC1837h, Intent intent, InterfaceC1836g interfaceC1836g) {
            this.f5883a = serviceConnectionC1837h;
            this.f5884b = intent;
            this.f5885c = interfaceC1836g;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractBinderC1384e m7367a;
            int i = 0;
            while (true) {
                try {
                    m7367a = this.f5883a.m7367a();
                    if (m7367a == null) {
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
            i = m7367a.mo6318a();
            if (UploadWallpaperService.EnumC2123c.values()[i] == UploadWallpaperService.EnumC2123c.idle) {
                m7367a.mo6317a(this.f5884b, new InterfaceC1383d() { // from class: com.tsf.extend.theme.diy.e.f.1
                    @Override // com.tsf.extend.base.p073c.InterfaceC1383d
                    /* renamed from: a */
                    public void mo7371a(String str) {
                        if (RunnableC1834f.this.f5885c != null) {
                            RunnableC1834f.this.f5885c.mo7369a(str);
                        }
                    }

                    @Override // com.tsf.extend.base.p073c.InterfaceC1383d
                    /* renamed from: b */
                    public void mo7370b(String str) {
                        if (RunnableC1834f.this.f5885c != null) {
                            RunnableC1834f.this.f5885c.mo7368b(str);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.tsf.extend.theme.diy.e$h */
    /* loaded from: classes.dex */
    private static class ServiceConnectionC1837h implements ServiceConnection {

        /* renamed from: a */
        AbstractBinderC1384e f5887a;

        /* renamed from: b */
        Intent f5888b;

        public ServiceConnectionC1837h(Intent intent) {
            this.f5888b = null;
            this.f5888b = intent;
        }

        /* renamed from: a */
        public AbstractBinderC1384e m7367a() {
            return this.f5887a;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f5887a = (AbstractBinderC1384e) iBinder;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f5887a = null;
        }
    }

    /* renamed from: a */
    public static String m7398a(Context context, String str, InputStream inputStream, String str2, InterfaceC1831d interfaceC1831d) {
        if (str == null) {
            return null;
        }
        if (interfaceC1831d != null) {
            interfaceC1831d.mo6325a();
        }
        String m8662a = C1428g.m8662a(str);
        String uuid = UUID.randomUUID().toString();
        DataOutputStream dataOutputStream = null;
        try {
            byte[] bArr = new byte[1024];
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m8662a).openConnection();
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
                if (interfaceC1831d != null) {
                    interfaceC1831d.mo6324a(100L, 10L);
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
                        if (interfaceC1831d != null) {
                            interfaceC1831d.mo6324a(available, (int) (i + (available * 0.1d)));
                        }
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    byteArrayOutputStream.close();
                    dataOutputStream2.write(m7388a(byteArray));
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
                        if (interfaceC1831d != null) {
                            interfaceC1831d.mo6324a(100L, 100L);
                            interfaceC1831d.mo6323a(true, sb3);
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
                    } else if (interfaceC1831d != null) {
                        interfaceC1831d.mo6323a(false, sb3);
                    }
                } else if (interfaceC1831d != null) {
                    interfaceC1831d.mo6323a(false, "{\"responseCode\":" + responseCode + "}");
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
                if (interfaceC1831d != null) {
                    try {
                        interfaceC1831d.mo6323a(false, "{\"exception\":" + th.getClass().getSimpleName() + "}");
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

    /* renamed from: a */
    public static byte[] m7388a(byte[] bArr) {
        int length = bArr.length / 2;
        for (int i = 0; i < length; i++) {
            if (i % 2 != 1) {
                byte b = bArr[i];
                bArr[i] = bArr[length + i];
                bArr[length + i] = b;
            }
        }
        return bArr;
    }

    /* renamed from: com.tsf.extend.theme.diy.e$b */
    /* loaded from: classes.dex */
    private static class C1829b implements Comparator<File> {
        private C1829b() {
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

    /* renamed from: a */
    public static void m7396a(File file) {
        m7395a(file, true);
    }

    /* renamed from: a */
    public static void m7395a(File file, boolean z) {
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
                m7396a(file2);
            }
            if (z) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static AbstractC1700aq m7389a(String str, boolean z) {
        AbstractC1700aq c1802a;
        boolean z2;
        boolean z3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (new File(str).getName().startsWith("CMT_")) {
            c1802a = new C1703b();
        } else {
            c1802a = new C1802a();
        }
        File file = new File(str, "theme/onlinetheme/theme");
        C1848k c1848k = (file == null || !file.exists()) ? null : (C1848k) C1433l.m8644a(file);
        if (c1848k != null) {
            c1802a.m7292i(c1848k.m7277q());
            c1802a.m7307d(c1848k.m7294i());
            c1802a.m7293i(c1848k.m7326F());
            c1802a.m7295h(c1848k.m7279p());
            c1802a.m7320a(c1848k.m7297h());
            if (c1802a instanceof C1703b) {
                ((C1703b) c1802a).m7750a(true);
                ((C1703b) c1802a).m7749b(c1848k.m7300g());
            }
        } else {
            c1802a.m7292i("YOU");
            c1802a.m7307d("DIY");
        }
        c1802a.m7752q(str);
        c1802a.m7290j("1.0.0");
        c1802a.m7309c(false);
        c1802a.m7315b(new Date(new File(str).lastModified()).getTime());
        c1802a.m7310c("DIY://" + c1802a.m7764I());
        File[] m7756e = c1802a.m7756e(C1547h.m8290b());
        File[] m7755f = c1802a.m7755f(C1547h.m8290b());
        if (z && ((m7756e == null || m7756e.length == 0) && (m7755f == null || m7755f.length == 0))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (m7756e == null || m7756e.length <= 0) {
            z2 = false;
            z3 = false;
        } else {
            z2 = false;
            z3 = false;
            for (File file2 : m7756e) {
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
            for (File file3 : m7755f) {
                if (!z2) {
                    arrayList.add(0, Uri.fromFile(m7755f[0]).toString());
                    z2 = true;
                } else {
                    arrayList.add(Uri.fromFile(file3).toString());
                }
            }
        }
        c1802a.m7318a(arrayList);
        return c1802a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7397a(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.util.List<java.lang.String> r19, final com.tsf.extend.theme.diy.C1821e.InterfaceC1828a r20) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.C1821e.m7397a(android.content.Context, java.lang.String, java.lang.String, java.util.List, com.tsf.extend.theme.diy.e$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7400a(android.content.Context r16, final com.tsf.extend.theme.C1848k r17, final com.tsf.extend.theme.diy.C1821e.InterfaceC1830c r18) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.C1821e.m7400a(android.content.Context, com.tsf.extend.theme.k, com.tsf.extend.theme.diy.e$c):void");
    }

    /* renamed from: a */
    public static AbstractC1700aq m7401a(Context context, C1848k c1848k) {
        return m7389a(new File(m7387b(context), "CMT_" + c1848k.m7297h() + "_LP" + (c1848k.m7326F() == 3 ? "_3D" : "_2D")).getAbsolutePath(), true);
    }

    /* renamed from: a */
    public static boolean m7394a(InputStream inputStream, String str, String str2) {
        if (C1418a.m8710a(inputStream, str, "202CB962AC59075B964B07152D234B70", "D1D99CA9B7EC0708C83ECCA4B635DBF1")) {
            return m7391a(str, str2);
        }
        return false;
    }

    /* renamed from: a */
    public static String m7393a(String str) {
        try {
            return "https://cml.ksmobile.com/diy/diy_info?key=" + URLEncoder.encode(C1428g.m8662a(Base64.encodeToString(m7388a(String.format("diyid=%s", str).getBytes("utf-8")), 0)), "UTF-8");
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m7392a(String str, AbstractC1386a.InterfaceC1396a<C1848k> interfaceC1396a, Context context) {
        C0838j m8768a = C1402b.m8768a(m7393a(str), null, interfaceC1396a, new C1402b.InterfaceC1405a<C1848k>() { // from class: com.tsf.extend.theme.diy.e.6
            @Override // com.tsf.extend.base.p076f.C1402b.InterfaceC1405a
            /* renamed from: a */
            public C1848k mo7058b(JSONObject jSONObject) {
                JSONObject optJSONObject;
                if (jSONObject != null) {
                    try {
                        if (jSONObject.optInt("resCode", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        C1848k c1848k = new C1848k();
                        c1848k.m7292i(optJSONObject.optString("author_name"));
                        c1848k.m7321a(optJSONObject.optInt("download_number"));
                        c1848k.m7312c(optJSONObject.optInt("favorite_count"));
                        c1848k.m7320a(optJSONObject.optLong("id"));
                        c1848k.m7307d(optJSONObject.optString("theme_name"));
                        c1848k.m7295h(optJSONObject.optString("theme_size"));
                        c1848k.m7288k(optJSONObject.optString("theme_logo"));
                        c1848k.m7304e(optJSONObject.optString("theme_download_url"));
                        c1848k.m7310c(optJSONObject.optString("diyid"));
                        c1848k.m7290j(jSONObject.optString("version"));
                        ArrayList newArrayList = Lists.newArrayList();
                        JSONArray optJSONArray = optJSONObject.optJSONArray("launcher_preview");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                newArrayList.add(optJSONArray.getString(i));
                            }
                        }
                        c1848k.m7318a(newArrayList);
                        return c1848k;
                    } catch (JSONException e) {
                        return null;
                    }
                }
                return null;
            }
        });
        m8768a.m11032a(false);
        C1406c.m8766a(context).m11010a((AbstractC0795l) m8768a);
    }
}
