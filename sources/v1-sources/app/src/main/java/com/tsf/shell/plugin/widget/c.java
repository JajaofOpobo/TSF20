package com.tsf.shell.plugin.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {
    public Context a;
    public String f;
    public String b = "";
    public String c = "";
    public ArrayList d = new ArrayList();
    public boolean e = false;
    public Animation g = new Animation();

    public final Bitmap a(String str) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            inputStream = this.a.getResources().openRawResource(this.a.getResources().getIdentifier(String.valueOf(this.b) + ":drawable/" + str, null, null));
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
        return bitmap;
    }
}
