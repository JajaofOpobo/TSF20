package com.cm.a;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.tsf.shell.ShellApplication;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    private static boolean a = false;
    private static String b = "lib/armeabi/";
    private String h;
    private String i;
    private String c = null;
    private String[] f = {"libkcmutil.so"};
    private ZipFile j = null;
    private Application g = (Application) ShellApplication.a();
    private String e = this.g.getPackageResourcePath();
    private String d = f.a(this.g.getApplicationInfo().dataDir) + "files/lib/";

    public h(String str) {
        this.i = System.mapLibraryName(str);
        this.h = f.a(this.g.getApplicationInfo().dataDir) + "lib/" + this.i;
        new File(this.d).mkdirs();
    }

    public String a() {
        return a(this.i);
    }

    public String b() {
        return this.h;
    }

    public boolean c() {
        try {
            switch (f()) {
                case 1:
                    return h();
                case 2:
                    File file = new File(a(this.i));
                    if (!file.exists()) {
                        return false;
                    }
                    System.load(a(this.i));
                    this.c = file.getPath();
                    if (a) {
                        Log.e("", "load sucess" + this.d + this.i);
                    }
                    return true;
                default:
                    return false;
            }
        } catch (ZipException e) {
            return false;
        } catch (IOException e2) {
            return false;
        }
    }

    public boolean d() {
        return !TextUtils.isEmpty(this.c) && new File(this.c).exists();
    }

    private boolean h() {
        try {
            System.load(this.h);
        } catch (Exception e) {
            Log.d("", "", e);
        }
        this.c = this.h;
        return true;
    }

    private String a(String str) {
        return this.d + str;
    }

    public void e() {
        if (this.j != null) {
            try {
                this.j.close();
                this.j = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int f() {
        if (!i()) {
            j();
        }
        if (!g()) {
            return 1;
        }
        new File(a(this.i));
        return 2;
    }

    private boolean i() {
        return false;
    }

    private void j() {
    }

    public boolean g() {
        return false;
    }
}
