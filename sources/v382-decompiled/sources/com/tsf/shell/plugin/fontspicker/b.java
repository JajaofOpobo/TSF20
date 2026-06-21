package com.tsf.shell.plugin.fontspicker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class b {
    public String a;
    public String b;
    public String c;

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public Typeface a(Context context) {
        if (this.b.equals("package")) {
            Context d = d(context);
            if (d == null) {
                return null;
            }
            try {
                return Typeface.createFromAsset(d.getAssets(), this.c);
            } catch (Exception e) {
                com.tsf.shell.plugin.themepicker.g.c("", e.getMessage());
                return null;
            }
        }
        if (this.b.equals("default")) {
            return null;
        }
        try {
            return Typeface.createFromFile(this.c);
        } catch (Exception e2) {
            return null;
        }
    }

    public String b(Context context) {
        String str;
        String substring = this.c.substring(this.c.lastIndexOf("/") + 1, this.c.lastIndexOf("."));
        if (this.b.equals("package")) {
            Context d = d(context);
            if (d != null) {
                str = " [" + d.getApplicationInfo().loadLabel(context.getPackageManager()).toString() + "]";
            } else {
                str = " []";
            }
        } else {
            str = " [" + this.b + "]";
        }
        return String.valueOf(substring) + str;
    }

    private Context d(Context context) {
        try {
            return context.createPackageContext(this.a, 2);
        } catch (PackageManager.NameNotFoundException e) {
            com.tsf.shell.plugin.themepicker.g.c("", e.getMessage());
            return null;
        }
    }

    public void c(Context context) {
        File file = new File(String.valueOf(context.getCacheDir().getPath()) + "/fonts");
        if (!file.exists()) {
            file.mkdir();
        }
        String str = String.valueOf(file.getPath()) + "/select.ttf";
        if (this.b.equals("package")) {
            Context d = d(context);
            if (d != null) {
                try {
                    a(d.getAssets().open(this.c), str);
                    return;
                } catch (Exception e) {
                    com.tsf.shell.plugin.themepicker.g.c("", e.getMessage());
                    return;
                }
            }
            return;
        }
        if (this.b.equals("default")) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
                return;
            }
            return;
        }
        try {
            a(a(this.c), str);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public static InputStream a(String str) {
        return new BufferedInputStream(new FileInputStream(new File(str)));
    }

    public static void a(InputStream inputStream, String str) {
        byte[] bArr = new byte[1024];
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str, false);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                inputStream.close();
                                return;
                            } catch (IOException e) {
                                throw e;
                            }
                        }
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    outputStream.flush();
                    outputStream.close();
                    inputStream.close();
                    throw th;
                } catch (IOException e3) {
                    throw e3;
                }
            }
        } catch (IOException e4) {
        } catch (Throwable th2) {
            th = th2;
            outputStream.flush();
            outputStream.close();
            inputStream.close();
            throw th;
        }
    }
}
