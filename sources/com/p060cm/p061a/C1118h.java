package com.p060cm.p061a;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.tsf.shell.ShellApplication;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
/* renamed from: com.cm.a.h */
/* loaded from: classes.dex */
public class C1118h {

    /* renamed from: a */
    private static boolean f3569a = false;

    /* renamed from: b */
    private static String f3570b = "lib/armeabi/";

    /* renamed from: h */
    private String f3576h;

    /* renamed from: i */
    private String f3577i;

    /* renamed from: c */
    private String f3571c = null;

    /* renamed from: f */
    private String[] f3574f = {"libkcmutil.so"};

    /* renamed from: j */
    private ZipFile f3578j = null;

    /* renamed from: g */
    private Application f3575g = (Application) ShellApplication.m6152a();

    /* renamed from: e */
    private String f3573e = this.f3575g.getPackageResourcePath();

    /* renamed from: d */
    private String f3572d = C1116f.m9840a(this.f3575g.getApplicationInfo().dataDir) + "files/lib/";

    public C1118h(String str) {
        this.f3577i = System.mapLibraryName(str);
        this.f3576h = C1116f.m9840a(this.f3575g.getApplicationInfo().dataDir) + "lib/" + this.f3577i;
        new File(this.f3572d).mkdirs();
    }

    /* renamed from: a */
    public String m9838a() {
        return m9837a(this.f3577i);
    }

    /* renamed from: b */
    public String m9836b() {
        return this.f3576h;
    }

    /* renamed from: c */
    public boolean m9835c() {
        try {
            switch (m9832f()) {
                case 1:
                    return m9830h();
                case 2:
                    File file = new File(m9837a(this.f3577i));
                    if (file.exists()) {
                        System.load(m9837a(this.f3577i));
                        this.f3571c = file.getPath();
                        if (f3569a) {
                            Log.e("", "load sucess" + this.f3572d + this.f3577i);
                        }
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        } catch (ZipException e) {
            return false;
        } catch (IOException e2) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean m9834d() {
        return !TextUtils.isEmpty(this.f3571c) && new File(this.f3571c).exists();
    }

    /* renamed from: h */
    private boolean m9830h() {
        try {
            System.load(this.f3576h);
        } catch (Exception e) {
            Log.d("", "", e);
        }
        this.f3571c = this.f3576h;
        return true;
    }

    /* renamed from: a */
    private String m9837a(String str) {
        return this.f3572d + str;
    }

    /* renamed from: e */
    public void m9833e() {
        if (this.f3578j != null) {
            try {
                this.f3578j.close();
                this.f3578j = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public int m9832f() {
        if (!m9829i()) {
            m9828j();
        }
        if (!m9831g()) {
            return 1;
        }
        new File(m9837a(this.f3577i));
        return 2;
    }

    /* renamed from: i */
    private boolean m9829i() {
        return false;
    }

    /* renamed from: j */
    private void m9828j() {
    }

    /* renamed from: g */
    public boolean m9831g() {
        return false;
    }
}
