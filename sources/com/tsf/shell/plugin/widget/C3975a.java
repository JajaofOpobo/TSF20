package com.tsf.shell.plugin.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.plugin.widget.a */
/* loaded from: classes.dex */
public class C3975a {

    /* renamed from: a */
    public Context f13057a;

    /* renamed from: f */
    public String f13062f;

    /* renamed from: b */
    public String f13058b = "";

    /* renamed from: c */
    public String f13059c = "";

    /* renamed from: d */
    public ArrayList<FloatingItem> f13060d = new ArrayList<>();

    /* renamed from: e */
    public boolean f13061e = false;

    /* renamed from: g */
    public Animation f13063g = new Animation();

    /* renamed from: a */
    public Bitmap m946a() {
        return m943a(this.f13059c);
    }

    /* renamed from: a */
    public static C3975a m944a(Context context, String str, String str2) {
        C3975a c3975a = new C3975a();
        c3975a.f13057a = context;
        c3975a.f13058b = context.getPackageName();
        c3975a.f13062f = str;
        c3975a.f13059c = str2;
        c3975a.f13061e = true;
        return c3975a;
    }

    /* renamed from: a */
    public Bitmap m943a(String str) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            inputStream = this.f13057a.getResources().openRawResource(this.f13057a.getResources().getIdentifier(this.f13058b + ":drawable/" + str, null, null));
        } catch (Exception e) {
            inputStream = null;
        } catch (Throwable th2) {
            inputStream = null;
            th = th2;
        }
        try {
            bitmap = BitmapFactory.decodeStream(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap m945a(int i) {
        return m943a(this.f13060d.get(i).f13024b);
    }
}
