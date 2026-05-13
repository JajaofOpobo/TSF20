package com.tsf.extend.base.p080j;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.FileLock;
import org.apache.http.util.EncodingUtils;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.base.j.l */
/* loaded from: classes.dex */
public class C1433l {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8641a(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L30
            r1.<init>(r0, r5)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L30
            byte[] r0 = r3.getBytes()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r1.write(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r1.flush()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.io.IOException -> L1b
        L1a:
            return
        L1b:
            r0 = move-exception
            r0.printStackTrace()
            goto L1a
        L20:
            r0 = move-exception
            r1 = r2
        L22:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L1a
        L2b:
            r0 = move-exception
            r0.printStackTrace()
            goto L1a
        L30:
            r0 = move-exception
            r1 = r2
        L32:
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L38
        L37:
            throw r0
        L38:
            r1 = move-exception
            r1.printStackTrace()
            goto L37
        L3d:
            r0 = move-exception
            goto L32
        L3f:
            r0 = move-exception
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.p080j.C1433l.m8641a(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8644a(java.io.File r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.p080j.C1433l.m8644a(java.io.File):java.lang.Object");
    }

    /* renamed from: a */
    public static boolean m8643a(Serializable serializable, File file) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;
        boolean z = false;
        FileLock fileLock = null;
        if (serializable != null && file != null) {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                } catch (Exception e2) {
                    objectOutputStream = null;
                } catch (OutOfMemoryError e3) {
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = null;
                }
                try {
                    fileLock = fileOutputStream.getChannel().lock();
                    objectOutputStream.writeUnshared(serializable);
                    objectOutputStream.flush();
                    fileOutputStream.flush();
                    z = true;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.reset();
                        } catch (IOException e4) {
                        }
                    }
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e5) {
                        }
                    }
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                        }
                    }
                } catch (Exception e8) {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.reset();
                        } catch (IOException e9) {
                        }
                    }
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e10) {
                        }
                    }
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e11) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                        }
                    }
                    return z;
                } catch (OutOfMemoryError e13) {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.reset();
                        } catch (IOException e14) {
                        }
                    }
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e15) {
                        }
                    }
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e16) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e17) {
                        }
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.reset();
                        } catch (IOException e18) {
                        }
                    }
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e19) {
                        }
                    }
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e20) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e21) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e22) {
                objectOutputStream = null;
                fileOutputStream = null;
            } catch (OutOfMemoryError e23) {
                objectOutputStream = null;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
                fileOutputStream = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m8642a(String str, String str2) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream3;
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            File file = new File(str);
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        file2.delete();
                        file2.createNewFile();
                    } else {
                        file2.createNewFile();
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream3.write(bArr, 0, read);
                        }
                        fileInputStream.close();
                        try {
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            z = true;
                            fileOutputStream = null;
                            fileInputStream3 = null;
                        } catch (Exception e) {
                            fileInputStream2 = null;
                            fileOutputStream2 = fileOutputStream3;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e2) {
                                }
                            }
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e3) {
                                }
                            }
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = null;
                            fileOutputStream2 = fileOutputStream3;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e4) {
                                }
                            }
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e5) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        fileOutputStream2 = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                    }
                } catch (Exception e7) {
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                fileOutputStream = null;
                fileInputStream3 = null;
            }
            if (0 != 0) {
                try {
                    fileInputStream3.close();
                } catch (IOException e8) {
                }
            }
            if (0 != 0) {
                try {
                    fileOutputStream.close();
                } catch (IOException e9) {
                }
            }
        } catch (Exception e10) {
            fileInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return z;
    }

    /* renamed from: b */
    public static String m8640b(File file) {
        FileInputStream fileInputStream;
        String str = null;
        if (file != null && file.exists()) {
            try {
                if (file.isFile()) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            int available = fileInputStream.available();
                            if (available > 0) {
                                byte[] bArr = new byte[available];
                                fileInputStream.read(bArr);
                                str = EncodingUtils.getString(bArr, "utf-8");
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } else if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return str;
                        } catch (IOException e5) {
                            e = e5;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                            }
                            return str;
                        }
                    } catch (FileNotFoundException e7) {
                        e = e7;
                        fileInputStream = null;
                    } catch (IOException e8) {
                        e = e8;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        fileInputStream = null;
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static JSONObject m8646a(Context context, String str) {
        String m8645a = m8645a(context, "raw", str);
        if (m8645a != null) {
            try {
                return new JSONObject(m8645a);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m8645a(Context context, String str, String str2) {
        InputStream inputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        String str3 = null;
        try {
            inputStream = context.getAssets().open(str + "/" + str2);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                byteArrayOutputStream = null;
                th = th2;
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str3 = byteArrayOutputStream.toString("utf-8");
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Exception e4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e6) {
                    }
                }
                return str3;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e7) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e8) {
                    }
                }
                throw th;
            }
        } catch (Exception e9) {
            byteArrayOutputStream = null;
            inputStream = null;
        } catch (Throwable th4) {
            inputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
        return str3;
    }
}
