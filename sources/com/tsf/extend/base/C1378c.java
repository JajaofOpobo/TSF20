package com.tsf.extend.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* renamed from: com.tsf.extend.base.c */
/* loaded from: classes.dex */
public class C1378c {

    /* renamed from: com.tsf.extend.base.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1379a {
        /* renamed from: a */
        void mo7382a();

        /* renamed from: a */
        void mo7381a(int i, int i2);

        /* renamed from: b */
        boolean mo7380b();
    }

    /* renamed from: a */
    public static int m8817a(String str, String str2, InterfaceC1379a interfaceC1379a) {
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                if (m8818a(str2, inputStream, interfaceC1379a, httpURLConnection.getContentLength()) == null) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return -1;
                }
                if (interfaceC1379a != null) {
                    interfaceC1379a.mo7382a();
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

    /* renamed from: a */
    public static File m8819a(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        return file;
    }

    /* renamed from: a */
    public static File m8818a(String str, InputStream inputStream, InterfaceC1379a interfaceC1379a, int i) {
        FileOutputStream fileOutputStream;
        File file;
        Exception e;
        int i2 = 0;
        OutputStream outputStream = null;
        try {
            try {
                try {
                    file = m8819a(str);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Exception e2) {
                        fileOutputStream = null;
                        e = e2;
                    }
                } catch (Exception e3) {
                    fileOutputStream = null;
                    file = null;
                    e = e3;
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= -1) {
                            fileOutputStream.flush();
                            try {
                                fileOutputStream.close();
                                return file;
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return file;
                            }
                        }
                        fileOutputStream.write(bArr, 0, read);
                        if (interfaceC1379a != null && read > 0) {
                            i2 += read;
                            interfaceC1379a.mo7381a(i2, i);
                        }
                        if (interfaceC1379a != null && interfaceC1379a.mo7380b()) {
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
                        return file;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return file;
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

    /* renamed from: a */
    public static File m8816a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        Exception e;
        File file;
        try {
            try {
                file = m8819a(str);
                try {
                    fileOutputStream = new FileOutputStream(file);
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
                            return file;
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
                file = null;
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            fileOutputStream.close();
            throw th;
        }
    }
}
