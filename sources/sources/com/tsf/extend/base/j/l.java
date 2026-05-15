package com.tsf.extend.base.j;

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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r3, java.lang.String r4, boolean r5) throws java.lang.Throwable {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.j.l.a(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.io.File r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.j.l.a(java.io.File):java.lang.Object");
    }

    public static boolean a(Serializable serializable, File file) throws Throwable {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;
        boolean z = false;
        FileLock fileLockLock = null;
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
                    fileLockLock = fileOutputStream.getChannel().lock();
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
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
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
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
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
                } catch (OutOfMemoryError e13) {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.reset();
                        } catch (IOException e14) {
                        }
                    }
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
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
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.reset();
                        } catch (IOException e18) {
                        }
                    }
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e19) {
                        }
                    }
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e20) {
                        }
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException e21) {
                        throw th;
                    }
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

    /* JADX WARN: Can't wrap try/catch for region: R(7:5|(6:80|6|(1:8)(1:22)|9|10|(2:84|11))|(5:12|(1:86)(2:33|34)|(2:68|27)|(2:74|29)|21)|14|78|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        if (r3 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r1 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0082, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0083, code lost:
    
        r3 = null;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008a, code lost:
    
        r2 = null;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L86
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L86
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L86
            if (r3 == 0) goto L8e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L86
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L86
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            r4.<init>(r9)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            boolean r2 = r4.exists()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            if (r2 != 0) goto L47
            r4.createNewFile()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
        L20:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            r2.<init>(r4)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7f
        L29:
            int r5 = r3.read(r4)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7f
            r6 = -1
            if (r5 != r6) goto L5d
            r3.close()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7f
            r2.flush()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L89
            r2.close()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L89
            r0 = 1
            r2 = r1
            r3 = r1
        L3c:
            if (r1 == 0) goto L41
            r3.close()     // Catch: java.io.IOException -> L73
        L41:
            if (r1 == 0) goto L46
            r2.close()     // Catch: java.io.IOException -> L75
        L46:
            return r0
        L47:
            r4.delete()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            r4.createNewFile()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L7d
            goto L20
        L4e:
            r2 = move-exception
            r2 = r3
        L50:
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L77
        L55:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L46
        L5b:
            r1 = move-exception
            goto L46
        L5d:
            r6 = 0
            r2.write(r4, r6, r5)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7f
            goto L29
        L62:
            r1 = move-exception
            r1 = r2
            r2 = r3
            goto L50
        L66:
            r0 = move-exception
            r3 = r1
        L68:
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.io.IOException -> L79
        L6d:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.io.IOException -> L7b
        L72:
            throw r0
        L73:
            r3 = move-exception
            goto L41
        L75:
            r1 = move-exception
            goto L46
        L77:
            r2 = move-exception
            goto L55
        L79:
            r2 = move-exception
            goto L6d
        L7b:
            r1 = move-exception
            goto L72
        L7d:
            r0 = move-exception
            goto L68
        L7f:
            r0 = move-exception
            r1 = r2
            goto L68
        L82:
            r0 = move-exception
            r3 = r1
            r1 = r2
            goto L68
        L86:
            r2 = move-exception
            r2 = r1
            goto L50
        L89:
            r3 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L50
        L8e:
            r2 = r1
            r3 = r1
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.j.l.a(java.lang.String, java.lang.String):boolean");
    }

    public static String b(File file) throws Throwable {
        FileInputStream fileInputStream;
        String string = null;
        if (file != null && file.exists()) {
            try {
                if (file.isFile()) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            int iAvailable = fileInputStream.available();
                            if (iAvailable > 0) {
                                byte[] bArr = new byte[iAvailable];
                                fileInputStream.read(bArr);
                                string = EncodingUtils.getString(bArr, "utf-8");
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
        return string;
    }

    public static JSONObject a(Context context, String str) throws Throwable {
        String strA = a(context, "raw", str);
        if (strA == null) {
            return null;
        }
        try {
            return new JSONObject(strA);
        } catch (Exception e) {
            return null;
        }
    }

    public static String a(Context context, String str, String str2) throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        String string = null;
        try {
            inputStreamOpen = context.getAssets().open(str + "/" + str2);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                byteArrayOutputStream = null;
                th = th2;
            }
            try {
                bArr = new byte[2048];
            } catch (Exception e2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e4) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e5) {
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Exception e6) {
                    throw th;
                }
            }
        } catch (Exception e7) {
            byteArrayOutputStream = null;
            inputStreamOpen = null;
        } catch (Throwable th4) {
            inputStreamOpen = null;
            th = th4;
            byteArrayOutputStream = null;
        }
        while (true) {
            int i = inputStreamOpen.read(bArr, 0, bArr.length);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            return string;
        }
        string = byteArrayOutputStream.toString("utf-8");
        if (inputStreamOpen != null) {
            try {
                inputStreamOpen.close();
            } catch (Exception e8) {
            }
        }
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (Exception e9) {
            }
        }
        return string;
    }
}
