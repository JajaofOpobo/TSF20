package com.tsf.shell.utils;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.utils.o */
/* loaded from: classes.dex */
public class C4179o {
    /* renamed from: a */
    public static void m660a(ArrayList<File> arrayList) {
        try {
            Iterator<File> it = arrayList.iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.exists()) {
                    next.delete();
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static void m664a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        m664a(file2);
                    }
                }
                file.delete();
            }
        }
    }

    /* renamed from: b */
    public static void m658b(File file) {
        File[] listFiles;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                m664a(file2);
            }
        }
    }

    /* renamed from: a */
    public static void m661a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileOutputStream = null;
        }
        if (fileOutputStream != null) {
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m663a(File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        try {
            channel.transferTo(0L, channel.size(), channel2);
        } finally {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    /* renamed from: a */
    public static void m665a(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileOutputStream = null;
        }
        if (fileOutputStream != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m659b(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileOutputStream = null;
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        try {
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static File m662a(File file, String str) {
        return new File(file.getPath() + "/" + str);
    }

    /* renamed from: b */
    public static boolean m657b(File file, String str) {
        return new File(file.getPath() + "/" + str).exists();
    }

    /* renamed from: c */
    public static File m656c(File file, String str) {
        File file2 = new File(file.getPath() + "/" + str);
        if (!file2.exists()) {
            try {
                file2.mkdirs();
            } catch (Exception e) {
            }
        }
        return file2;
    }
}
