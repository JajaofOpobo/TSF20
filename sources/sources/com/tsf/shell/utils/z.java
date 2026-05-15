package com.tsf.shell.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class z {
    public static void a(Collection<File> collection, File file) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1048576));
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    public static void a(File file, String str) throws IOException {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
            File file3 = new File(new String((str + File.separator + zipEntryNextElement.getName()).getBytes("8859_1"), "GB2312"));
            if (!file3.exists()) {
                File parentFile = file3.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file3.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1048576];
            while (true) {
                int i = inputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream.write(bArr, 0, i);
                }
            }
            inputStream.close();
            fileOutputStream.close();
        }
    }

    private static void a(File file, ZipOutputStream zipOutputStream, String str) throws IOException {
        String str2 = new String((str + (str.trim().length() == 0 ? "" : File.separator) + file.getName()).getBytes("8859_1"), "GB2312");
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2, zipOutputStream, str2);
            }
            return;
        }
        byte[] bArr = new byte[1048576];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1048576);
        zipOutputStream.putNextEntry(new ZipEntry(str2));
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i != -1) {
                zipOutputStream.write(bArr, 0, i);
            } else {
                bufferedInputStream.close();
                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                return;
            }
        }
    }
}
