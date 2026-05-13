package com.tsf.extend.base.b.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tsf.extend.base.j.l;
import com.tsf.extend.base.j.p;
import com.tsf.extend.base.j.r;
import com.tsf.extend.base.j.z;
import com.tsf.extend.h;
import com.tsf.extend.theme.diy.c;
import com.tsf.extend.theme.v;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public class a {
    private static a d = null;
    private long a = 604800000;
    private File b;
    private File c;

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (d == null) {
                d = new a();
                d.b();
            }
            aVar = d;
        }
        return aVar;
    }

    private a() {
        this.b = null;
        this.c = null;
        Context b = h.b();
        String a = p.a(b);
        if (!TextUtils.isEmpty(TextUtils.isEmpty(a) ? p.b(b) : a)) {
            String str = (a + File.separator) + "TsfTheme";
            this.b = new File(str + "/.data");
            this.c = new File(str + "/.image");
        }
        if (c()) {
            if (!this.b.exists()) {
                this.b.mkdirs();
            }
            if (!this.c.exists()) {
                this.c.mkdirs();
            }
        }
    }

    public void b() {
        z.a(8, new Runnable() { // from class: com.tsf.extend.base.b.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                if (a.this.c != null && a.this.c.exists() && (listFiles = a.this.c.listFiles()) != null) {
                    for (File file : listFiles) {
                        if (System.currentTimeMillis() - file.lastModified() > a.this.a) {
                            file.delete();
                        }
                    }
                }
            }
        });
    }

    public Object a(String str) {
        if (TextUtils.isEmpty(str) || !c()) {
            return null;
        }
        try {
            String a = r.a(str.getBytes("utf-8"));
            if (c(str)) {
                return l.a(new File(this.b, a));
            }
            try {
                File file = new File(this.c, a);
                if (file.exists()) {
                    return BitmapFactory.decodeFile(file.getAbsolutePath());
                }
                return null;
            } catch (OutOfMemoryError e) {
                b.a().b();
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean a(String str, Object obj) {
        return a(str, obj, -1L);
    }

    public boolean a(String str, Object obj, long j) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3 = null;
        if (TextUtils.isEmpty(str) || obj == null || !c()) {
            return false;
        }
        try {
            String a = r.a(str.getBytes("utf-8"));
            if (obj instanceof byte[]) {
                try {
                    fileOutputStream2 = new FileOutputStream(new File(this.b, a));
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
                return l.a((Serializable) obj, new File(this.b, a));
            } else {
                if (!(obj instanceof Bitmap) || ((Bitmap) obj).isRecycled()) {
                    return false;
                }
                try {
                    FileOutputStream fileOutputStream4 = new FileOutputStream(new File(this.c, a));
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

    public boolean b(String str) {
        if (TextUtils.isEmpty(str) || !c()) {
            return false;
        }
        try {
            String a = r.a(str.getBytes("utf-8"));
            if (c(str)) {
                return new File(this.b, a).delete();
            }
            return new File(this.c, a).delete();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean c(String str) {
        return com.tsf.extend.wallpaper.z.b(str) || c.a(str) || v.j(str) || com.tsf.extend.keyboard.a.b(str);
    }

    private boolean c() {
        return (this.b != null && ((this.b.exists() || this.b.mkdirs()) && this.b.isDirectory())) && this.c != null && (this.c.exists() || this.c.mkdirs()) && this.c.isDirectory();
    }
}
