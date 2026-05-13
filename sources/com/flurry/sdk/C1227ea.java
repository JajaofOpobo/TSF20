package com.flurry.sdk;

import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: com.flurry.sdk.ea */
/* loaded from: classes.dex */
public final class C1227ea {

    /* renamed from: a */
    private static final String f3950a = C1227ea.class.getSimpleName();

    /* renamed from: b */
    private static final Set<String> f3951b = m9308i();

    /* renamed from: c */
    private static String f3952c;

    /* renamed from: a */
    public static synchronized String m9323a() {
        String str;
        synchronized (C1227ea.class) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Must be called from a background thread!");
            }
            if (TextUtils.isEmpty(f3952c)) {
                f3952c = m9310g();
            }
            str = f3952c;
        }
        return str;
    }

    /* renamed from: g */
    private static String m9310g() {
        String m9318b = m9318b();
        return !TextUtils.isEmpty(m9318b) ? m9318b : m9315c();
    }

    /* renamed from: b */
    static String m9318b() {
        String string = Settings.Secure.getString(C1211do.m9390a().m9386b().getContentResolver(), "android_id");
        if (m9321a(string)) {
            return "AND" + string;
        }
        return null;
    }

    /* renamed from: c */
    static String m9315c() {
        String m9312e = m9312e();
        if (TextUtils.isEmpty(m9312e)) {
            m9312e = m9311f();
            if (TextUtils.isEmpty(m9312e)) {
                m9312e = m9313d();
            }
            m9316b(m9312e);
        }
        return m9312e;
    }

    /* renamed from: a */
    static boolean m9321a(String str) {
        return (TextUtils.isEmpty(str) || m9314c(str.toLowerCase(Locale.US))) ? false : true;
    }

    /* renamed from: d */
    static String m9313d() {
        return "ID" + Long.toString(Double.doubleToLongBits(Math.random()) + (37 * (System.nanoTime() + (C1223dx.m9347c(C1211do.m9390a().m9386b()).hashCode() * 37))), 16);
    }

    /* renamed from: b */
    static void m9316b(String str) {
        if (!TextUtils.isEmpty(str)) {
            File fileStreamPath = C1211do.m9390a().m9386b().getFileStreamPath(m9309h());
            if (C1276fd.m9160a(fileStreamPath)) {
                m9319a(str, fileStreamPath);
            }
        }
    }

    /* renamed from: a */
    static void m9319a(String str, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            m9320a(str, dataOutputStream);
        } catch (Throwable th2) {
            th = th2;
            try {
                C1258eo.m9233a(6, f3950a, "Error when saving phoneId", th);
            } finally {
                C1277fe.m9152a(dataOutputStream);
            }
        }
    }

    /* renamed from: e */
    static String m9312e() {
        DataInputStream dataInputStream;
        String str = null;
        File fileStreamPath = C1211do.m9390a().m9386b().getFileStreamPath(m9309h());
        if (fileStreamPath != null && fileStreamPath.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                str = m9322a(dataInputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    C1258eo.m9233a(6, f3950a, "Error when loading phoneId", th);
                    return str;
                } finally {
                    C1277fe.m9152a(dataInputStream);
                }
            }
        }
        return str;
    }

    /* renamed from: f */
    static String m9311f() {
        String[] list;
        DataInputStream dataInputStream;
        String str = null;
        File filesDir = C1211do.m9390a().m9386b().getFilesDir();
        if (filesDir != null && (list = filesDir.list(new FilenameFilter() { // from class: com.flurry.sdk.ea.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.startsWith(".flurryagent.");
            }
        })) != null && list.length != 0) {
            File fileStreamPath = C1211do.m9390a().m9386b().getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        str = m9317b(dataInputStream);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C1258eo.m9233a(6, f3950a, "Error when loading phoneId", th);
                            return str;
                        } finally {
                            C1277fe.m9152a(dataInputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    private static void m9320a(String str, DataOutput dataOutput) {
        dataOutput.writeInt(1);
        dataOutput.writeUTF(str);
    }

    /* renamed from: a */
    private static String m9322a(DataInput dataInput) {
        if (1 != dataInput.readInt()) {
            return null;
        }
        return dataInput.readUTF();
    }

    /* renamed from: b */
    private static String m9317b(DataInput dataInput) {
        if (46586 == dataInput.readUnsignedShort() && 2 == dataInput.readUnsignedShort()) {
            dataInput.readUTF();
            return dataInput.readUTF();
        }
        return null;
    }

    /* renamed from: h */
    private static String m9309h() {
        return ".flurryb.";
    }

    /* renamed from: c */
    private static boolean m9314c(String str) {
        return f3951b.contains(str);
    }

    /* renamed from: i */
    private static Set<String> m9308i() {
        HashSet hashSet = new HashSet();
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        return Collections.unmodifiableSet(hashSet);
    }
}
