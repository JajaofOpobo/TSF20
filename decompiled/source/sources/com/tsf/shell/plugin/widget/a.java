package com.tsf.shell.plugin.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    public Context a;
    public String f;
    public String b = "";
    public String c = "";
    public ArrayList<FloatingItem> d = new ArrayList<>();
    public boolean e = false;
    public Animation g = new Animation();

    public Bitmap a() {
        return a(this.c);
    }

    public static a a(Context context, String str, String str2) {
        a aVar = new a();
        aVar.a = context;
        aVar.b = context.getPackageName();
        aVar.f = str;
        aVar.c = str2;
        aVar.e = true;
        return aVar;
    }

    public Bitmap a(String str) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            inputStream = this.a.getResources().openRawResource(this.a.getResources().getIdentifier(this.b + ":drawable/" + str, null, null));
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

    public Bitmap a(int i) {
        return a(this.d.get(i).b);
    }
}
