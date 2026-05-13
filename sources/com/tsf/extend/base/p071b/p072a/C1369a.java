package com.tsf.extend.base.p071b.p072a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p080j.C1433l;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1439r;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.keyboard.C1558a;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.diy.C1806c;
import com.tsf.extend.wallpaper.C2148z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
/* renamed from: com.tsf.extend.base.b.a.a */
/* loaded from: classes.dex */
public class C1369a {

    /* renamed from: d */
    private static C1369a f4307d = null;

    /* renamed from: a */
    private long f4308a = 604800000;

    /* renamed from: b */
    private File f4309b;

    /* renamed from: c */
    private File f4310c;

    /* renamed from: a */
    public static synchronized C1369a m8855a() {
        C1369a c1369a;
        synchronized (C1369a.class) {
            if (f4307d == null) {
                f4307d = new C1369a();
                f4307d.m8850b();
            }
            c1369a = f4307d;
        }
        return c1369a;
    }

    private C1369a() {
        this.f4309b = null;
        this.f4310c = null;
        Context m8290b = C1547h.m8290b();
        String m8621a = C1437p.m8621a(m8290b);
        if (!TextUtils.isEmpty(TextUtils.isEmpty(m8621a) ? C1437p.m8617b(m8290b) : m8621a)) {
            String str = (m8621a + File.separator) + "TsfTheme";
            this.f4309b = new File(str + "/.data");
            this.f4310c = new File(str + "/.image");
        }
        if (m8847c()) {
            if (!this.f4309b.exists()) {
                this.f4309b.mkdirs();
            }
            if (!this.f4310c.exists()) {
                this.f4310c.mkdirs();
            }
        }
    }

    /* renamed from: b */
    public void m8850b() {
        C1455z.m8564a(8, new Runnable() { // from class: com.tsf.extend.base.b.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                if (C1369a.this.f4310c != null && C1369a.this.f4310c.exists() && (listFiles = C1369a.this.f4310c.listFiles()) != null) {
                    for (File file : listFiles) {
                        if (System.currentTimeMillis() - file.lastModified() > C1369a.this.f4308a) {
                            file.delete();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public Object m8853a(String str) {
        if (TextUtils.isEmpty(str) || !m8847c()) {
            return null;
        }
        try {
            String m8605a = C1439r.m8605a(str.getBytes("utf-8"));
            if (m8846c(str)) {
                return C1433l.m8644a(new File(this.f4309b, m8605a));
            }
            try {
                File file = new File(this.f4310c, m8605a);
                if (file.exists()) {
                    return BitmapFactory.decodeFile(file.getAbsolutePath());
                }
                return null;
            } catch (OutOfMemoryError e) {
                C1371b.m8845a().m8844b();
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean m8852a(String str, Object obj) {
        return m8851a(str, obj, -1L);
    }

    /* renamed from: a */
    public boolean m8851a(String str, Object obj, long j) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3 = null;
        if (TextUtils.isEmpty(str) || obj == null || !m8847c()) {
            return false;
        }
        try {
            String m8605a = C1439r.m8605a(str.getBytes("utf-8"));
            if (obj instanceof byte[]) {
                try {
                    fileOutputStream2 = new FileOutputStream(new File(this.f4309b, m8605a));
                } catch (FileNotFoundException e) {
                    fileOutputStream = null;
                } catch (IOException e2) {
                } catch (IllegalStateException e3) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream2.write((byte[]) obj);
                    fileOutputStream2.close();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            return true;
                        } catch (IOException e4) {
                            return true;
                        }
                    }
                    return true;
                } catch (FileNotFoundException e5) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    return false;
                } catch (IOException e7) {
                    fileOutputStream3 = fileOutputStream2;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException e8) {
                        }
                    }
                    return false;
                } catch (IllegalStateException e9) {
                    fileOutputStream3 = fileOutputStream2;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException e10) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream2;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException e11) {
                        }
                    }
                    throw th;
                }
            } else if (obj instanceof Serializable) {
                return C1433l.m8643a((Serializable) obj, new File(this.f4309b, m8605a));
            } else {
                if (!(obj instanceof Bitmap) || ((Bitmap) obj).isRecycled()) {
                    return false;
                }
                try {
                    FileOutputStream fileOutputStream4 = new FileOutputStream(new File(this.f4310c, m8605a));
                    try {
                        boolean compress = ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream4);
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                                return compress;
                            } catch (IOException e12) {
                                return compress;
                            }
                        }
                        return compress;
                    } catch (FileNotFoundException e13) {
                        fileOutputStream3 = fileOutputStream4;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e14) {
                            }
                        }
                        return false;
                    } catch (IllegalStateException e15) {
                        fileOutputStream3 = fileOutputStream4;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e16) {
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream3 = fileOutputStream4;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e17) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e18) {
                } catch (IllegalStateException e19) {
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (UnsupportedEncodingException e20) {
            e20.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public boolean m8848b(String str) {
        if (TextUtils.isEmpty(str) || !m8847c()) {
            return false;
        }
        try {
            String m8605a = C1439r.m8605a(str.getBytes("utf-8"));
            if (m8846c(str)) {
                return new File(this.f4309b, m8605a).delete();
            }
            return new File(this.f4310c, m8605a).delete();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private boolean m8846c(String str) {
        return C2148z.m6205b(str) || C1806c.m7422a(str) || C1894v.m7063j(str) || C1558a.m8245b(str);
    }

    /* renamed from: c */
    private boolean m8847c() {
        return (this.f4309b != null && ((this.f4309b.exists() || this.f4309b.mkdirs()) && this.f4309b.isDirectory())) && this.f4310c != null && (this.f4310c.exists() || this.f4310c.mkdirs()) && this.f4310c.isDirectory();
    }
}
