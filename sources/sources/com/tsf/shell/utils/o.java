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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class o {
    public static void a(ArrayList<File> arrayList) {
        try {
            for (File file : arrayList) {
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (Exception e) {
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        a(file2);
                    }
                }
                file.delete();
            }
        }
    }

    public static void b(File file) {
        File[] fileArrListFiles;
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
    }

    public static void a(InputStream inputStream, File file) {
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
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i);
                    }
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

    public static void a(File file, File file2) {
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

    public static void a(Bitmap bitmap, File file) {
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

    public static void b(Bitmap bitmap, File file) {
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

    public static File a(File file, String str) {
        return new File(file.getPath() + "/" + str);
    }

    public static boolean b(File file, String str) {
        return new File(file.getPath() + "/" + str).exists();
    }

    public static File c(File file, String str) {
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
