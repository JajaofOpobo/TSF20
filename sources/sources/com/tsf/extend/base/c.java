package com.tsf.extend.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {

    public interface a {
        void a();

        void a(int i, int i2);

        boolean b();
    }

    public static int a(String str, String str2, a aVar) {
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                if (a(str2, inputStream, aVar, httpURLConnection.getContentLength()) == null) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return -1;
                }
                if (aVar != null) {
                    aVar.a();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return 0;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return -1;
        }
    }

    public static File a(String str) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        return file;
    }

    public static File a(String str, InputStream inputStream, a aVar, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        File fileA;
        Exception e;
        int i2 = 0;
        OutputStream outputStream = null;
        try {
            try {
                try {
                    fileA = a(str);
                    try {
                        fileOutputStream = new FileOutputStream(fileA);
                    } catch (Exception e2) {
                        fileOutputStream = null;
                        e = e2;
                    }
                } catch (Exception e3) {
                    fileOutputStream = null;
                    fileA = null;
                    e = e3;
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i3 = inputStream.read(bArr);
                        if (i3 <= -1) {
                            fileOutputStream.flush();
                            try {
                                fileOutputStream.close();
                                return fileA;
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return fileA;
                            }
                        }
                        fileOutputStream.write(bArr, 0, i3);
                        if (aVar != null && i3 > 0) {
                            i2 += i3;
                            aVar.a(i2, i);
                        }
                        if (aVar != null && aVar.b()) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                            return null;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    e.printStackTrace();
                    try {
                        fileOutputStream.close();
                        return fileA;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return fileA;
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    outputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static File a(String str, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        Exception e;
        File fileA;
        try {
            try {
                fileA = a(str);
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                    try {
                        try {
                            fileOutputStream.write(bArr, 0, bArr.length);
                            fileOutputStream.flush();
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    fileOutputStream = null;
                }
            } catch (Exception e7) {
                e = e7;
                fileOutputStream = null;
                fileA = null;
            }
            return fileA;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            fileOutputStream.close();
            throw th;
        }
    }
}
