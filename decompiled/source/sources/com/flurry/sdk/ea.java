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
/* loaded from: classes.dex */
public final class ea {
    private static final String a = ea.class.getSimpleName();
    private static final Set<String> b = i();
    private static String c;

    public static synchronized String a() {
        String str;
        synchronized (ea.class) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Must be called from a background thread!");
            }
            if (TextUtils.isEmpty(c)) {
                c = g();
            }
            str = c;
        }
        return str;
    }

    private static String g() {
        String b2 = b();
        return !TextUtils.isEmpty(b2) ? b2 : c();
    }

    static String b() {
        String string = Settings.Secure.getString(Cdo.a().b().getContentResolver(), "android_id");
        if (a(string)) {
            return "AND" + string;
        }
        return null;
    }

    static String c() {
        String e = e();
        if (TextUtils.isEmpty(e)) {
            e = f();
            if (TextUtils.isEmpty(e)) {
                e = d();
            }
            b(e);
        }
        return e;
    }

    static boolean a(String str) {
        return (TextUtils.isEmpty(str) || c(str.toLowerCase(Locale.US))) ? false : true;
    }

    static String d() {
        return "ID" + Long.toString(Double.doubleToLongBits(Math.random()) + (37 * (System.nanoTime() + (dx.c(Cdo.a().b()).hashCode() * 37))), 16);
    }

    static void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            File fileStreamPath = Cdo.a().b().getFileStreamPath(h());
            if (fd.a(fileStreamPath)) {
                a(str, fileStreamPath);
            }
        }
    }

    static void a(String str, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            a(str, dataOutputStream);
        } catch (Throwable th2) {
            th = th2;
            try {
                eo.a(6, a, "Error when saving phoneId", th);
            } finally {
                fe.a(dataOutputStream);
            }
        }
    }

    static String e() {
        DataInputStream dataInputStream;
        String str = null;
        File fileStreamPath = Cdo.a().b().getFileStreamPath(h());
        if (fileStreamPath != null && fileStreamPath.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                str = a(dataInputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    eo.a(6, a, "Error when loading phoneId", th);
                    return str;
                } finally {
                    fe.a(dataInputStream);
                }
            }
        }
        return str;
    }

    static String f() {
        String[] list;
        DataInputStream dataInputStream;
        String str = null;
        File filesDir = Cdo.a().b().getFilesDir();
        if (filesDir != null && (list = filesDir.list(new FilenameFilter() { // from class: com.flurry.sdk.ea.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.startsWith(".flurryagent.");
            }
        })) != null && list.length != 0) {
            File fileStreamPath = Cdo.a().b().getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        str = b(dataInputStream);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            eo.a(6, a, "Error when loading phoneId", th);
                            return str;
                        } finally {
                            fe.a(dataInputStream);
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

    private static void a(String str, DataOutput dataOutput) {
        dataOutput.writeInt(1);
        dataOutput.writeUTF(str);
    }

    private static String a(DataInput dataInput) {
        if (1 != dataInput.readInt()) {
            return null;
        }
        return dataInput.readUTF();
    }

    private static String b(DataInput dataInput) {
        if (46586 == dataInput.readUnsignedShort() && 2 == dataInput.readUnsignedShort()) {
            dataInput.readUTF();
            return dataInput.readUTF();
        }
        return null;
    }

    private static String h() {
        return ".flurryb.";
    }

    private static boolean c(String str) {
        return b.contains(str);
    }

    private static Set<String> i() {
        HashSet hashSet = new HashSet();
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        return Collections.unmodifiableSet(hashSet);
    }
}
